package org.telegram.p009ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.C1072R;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.browser.Browser;
import org.telegram.p009ui.ActionBar.BaseFragment;
import org.telegram.p009ui.ActionBar.BottomSheet;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.p009ui.ActionBar.ThemeDescription;
import org.telegram.p009ui.Adapters.FiltersView;
import org.telegram.p009ui.Cells.ChatActionCell;
import org.telegram.p009ui.Cells.ContextLinkCell;
import org.telegram.p009ui.Cells.DialogCell;
import org.telegram.p009ui.Cells.GraySectionCell;
import org.telegram.p009ui.Cells.LoadingCell;
import org.telegram.p009ui.Cells.ProfileSearchCell;
import org.telegram.p009ui.Cells.SharedAudioCell;
import org.telegram.p009ui.Cells.SharedDocumentCell;
import org.telegram.p009ui.Cells.SharedLinkCell;
import org.telegram.p009ui.Cells.SharedMediaSectionCell;
import org.telegram.p009ui.Cells.SharedPhotoVideoCell;
import org.telegram.p009ui.Components.AlertsCreator;
import org.telegram.p009ui.Components.BackupImageView;
import org.telegram.p009ui.Components.BlurredRecyclerView;
import org.telegram.p009ui.Components.ColoredImageSpan;
import org.telegram.p009ui.Components.CubicBezierInterpolator;
import org.telegram.p009ui.Components.EmbedBottomSheet;
import org.telegram.p009ui.Components.FlickerLoadingView;
import org.telegram.p009ui.Components.Forum.ForumUtilities;
import org.telegram.p009ui.Components.LayoutHelper;
import org.telegram.p009ui.Components.RecyclerListView;
import org.telegram.p009ui.Components.SearchViewPager;
import org.telegram.p009ui.Components.StickerEmptyView;
import org.telegram.p009ui.FilteredSearchView;
import org.telegram.p009ui.PhotoViewer;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$FileLocation;
import org.telegram.tgnet.TLRPC$MessageMedia;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_forumTopic;
import org.telegram.tgnet.TLRPC$TL_inputMessagesFilterEmpty;
import org.telegram.tgnet.TLRPC$TL_inputPeerEmpty;
import org.telegram.tgnet.TLRPC$TL_messages_search;
import org.telegram.tgnet.TLRPC$TL_messages_searchGlobal;
import org.telegram.tgnet.TLRPC$TL_webPageEmpty;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.tgnet.TLRPC$WebPage;
import org.telegram.tgnet.TLRPC$messages_Messages;

public class FilteredSearchView extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    private static SpannableStringBuilder arrowSpan;
    RecyclerView.Adapter adapter;
    private int animationIndex;
    private SearchViewPager.ChatPreviewDelegate chatPreviewDelegate;
    Runnable clearCurrentResultsRunnable;
    private int columnsCount;
    private String currentDataQuery;
    boolean currentIncludeFolder;
    long currentSearchDialogId;
    FiltersView.MediaFilterData currentSearchFilter;
    long currentSearchMaxDate;
    long currentSearchMinDate;
    String currentSearchString;
    private Delegate delegate;
    private OnlyUserFiltersAdapter dialogsAdapter;
    StickerEmptyView emptyView;
    private boolean endReached;
    private AnimatorSet floatingDateAnimation;
    private final ChatActionCell floatingDateView;
    private Runnable hideFloatingDateRunnable;
    boolean ignoreRequestLayout;
    private boolean isLoading;
    int lastAccount;
    String lastMessagesSearchString;
    String lastSearchFilterQueryString;
    public final LinearLayoutManager layoutManager;
    private final FlickerLoadingView loadingView;
    boolean localTipArchive;
    ArrayList<Object> localTipChats;
    ArrayList<FiltersView.DateData> localTipDates;
    private final MessageHashId messageHashIdTmp;
    public ArrayList<MessageObject> messages;
    public SparseArray<MessageObject> messagesById;
    private int nextSearchRate;
    Activity parentActivity;
    BaseFragment parentFragment;
    private int photoViewerClassGuid;
    private PhotoViewer.PhotoViewerProvider provider;
    public RecyclerListView recyclerListView;
    private int requestIndex;
    Runnable searchRunnable;
    public HashMap<String, ArrayList<MessageObject>> sectionArrays;
    public ArrayList<String> sections;
    private SharedDocumentsAdapter sharedAudioAdapter;
    private SharedDocumentsAdapter sharedDocumentsAdapter;
    private SharedLinksAdapter sharedLinksAdapter;
    private SharedPhotoVideoAdapter sharedPhotoVideoAdapter;
    private SharedDocumentsAdapter sharedVoiceAdapter;
    private int totalCount;
    private UiCallback uiCallback;
    private boolean useFromUserAsAvatar;

    public interface Delegate {
        void updateFiltersView(boolean z, ArrayList<Object> arrayList, ArrayList<FiltersView.DateData> arrayList2, boolean z2);
    }

    public interface UiCallback {
        boolean actionModeShowing();

        void goToMessage(MessageObject messageObject);

        boolean isSelected(MessageHashId messageHashId);

        void showActionMode();

        void toggleItemSelection(MessageObject messageObject, View view, int i);
    }

    public void lambda$new$0() {
        hideFloatingDateView(true);
    }

    public FilteredSearchView(BaseFragment baseFragment) {
        super(baseFragment.getParentActivity());
        this.messages = new ArrayList<>();
        this.messagesById = new SparseArray<>();
        this.sections = new ArrayList<>();
        this.sectionArrays = new HashMap<>();
        this.columnsCount = 3;
        this.messageHashIdTmp = new MessageHashId(0, 0L);
        this.localTipChats = new ArrayList<>();
        this.localTipDates = new ArrayList<>();
        this.clearCurrentResultsRunnable = new Runnable() {
            @Override
            public void run() {
                if (FilteredSearchView.this.isLoading) {
                    FilteredSearchView.this.messages.clear();
                    FilteredSearchView.this.sections.clear();
                    FilteredSearchView.this.sectionArrays.clear();
                    RecyclerView.Adapter adapter = FilteredSearchView.this.adapter;
                    if (adapter != null) {
                        adapter.notifyDataSetChanged();
                    }
                }
            }
        };
        this.provider = new PhotoViewer.EmptyPhotoViewerProvider() {
            @Override
            public int getTotalImageCount() {
                return FilteredSearchView.this.totalCount;
            }

            @Override
            public boolean loadMore() {
                if (FilteredSearchView.this.endReached) {
                    return true;
                }
                FilteredSearchView filteredSearchView = FilteredSearchView.this;
                filteredSearchView.search(filteredSearchView.currentSearchDialogId, filteredSearchView.currentSearchMinDate, filteredSearchView.currentSearchMaxDate, filteredSearchView.currentSearchFilter, filteredSearchView.currentIncludeFolder, filteredSearchView.lastMessagesSearchString, false);
                return true;
            }

            @Override
            public PhotoViewer.PlaceProviderObject getPlaceForPhoto(MessageObject messageObject, TLRPC$FileLocation tLRPC$FileLocation, int i, boolean z) {
                ImageReceiver photoImage;
                View pinnedHeader;
                MessageObject messageObject2;
                if (messageObject == null) {
                    return null;
                }
                RecyclerListView recyclerListView = FilteredSearchView.this.recyclerListView;
                int childCount = recyclerListView.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = recyclerListView.getChildAt(i2);
                    int[] iArr = new int[2];
                    if (childAt instanceof SharedPhotoVideoCell) {
                        SharedPhotoVideoCell sharedPhotoVideoCell = (SharedPhotoVideoCell) childAt;
                        photoImage = null;
                        for (int i3 = 0; i3 < 6 && (messageObject2 = sharedPhotoVideoCell.getMessageObject(i3)) != null; i3++) {
                            if (messageObject2.getId() == messageObject.getId()) {
                                BackupImageView imageView = sharedPhotoVideoCell.getImageView(i3);
                                ImageReceiver imageReceiver = imageView.getImageReceiver();
                                imageView.getLocationInWindow(iArr);
                                photoImage = imageReceiver;
                            }
                        }
                    } else if (childAt instanceof SharedDocumentCell) {
                        SharedDocumentCell sharedDocumentCell = (SharedDocumentCell) childAt;
                        if (sharedDocumentCell.getMessage().getId() == messageObject.getId()) {
                            BackupImageView imageView2 = sharedDocumentCell.getImageView();
                            ImageReceiver imageReceiver2 = imageView2.getImageReceiver();
                            imageView2.getLocationInWindow(iArr);
                            photoImage = imageReceiver2;
                        }
                        photoImage = null;
                    } else {
                        if (childAt instanceof ContextLinkCell) {
                            ContextLinkCell contextLinkCell = (ContextLinkCell) childAt;
                            MessageObject messageObject3 = (MessageObject) contextLinkCell.getParentObject();
                            if (messageObject3 != null && messageObject3.getId() == messageObject.getId()) {
                                photoImage = contextLinkCell.getPhotoImage();
                                contextLinkCell.getLocationInWindow(iArr);
                            }
                        }
                        photoImage = null;
                    }
                    if (photoImage != null) {
                        PhotoViewer.PlaceProviderObject placeProviderObject = new PhotoViewer.PlaceProviderObject();
                        placeProviderObject.viewX = iArr[0];
                        placeProviderObject.viewY = iArr[1] - (Build.VERSION.SDK_INT >= 21 ? 0 : AndroidUtilities.statusBarHeight);
                        placeProviderObject.parentView = recyclerListView;
                        recyclerListView.getLocationInWindow(iArr);
                        placeProviderObject.animatingImageViewYOffset = -iArr[1];
                        placeProviderObject.imageReceiver = photoImage;
                        placeProviderObject.allowTakeAnimation = false;
                        placeProviderObject.radius = photoImage.getRoundRadius();
                        placeProviderObject.thumb = placeProviderObject.imageReceiver.getBitmapSafe();
                        placeProviderObject.parentView.getLocationInWindow(iArr);
                        placeProviderObject.clipTopAddition = 0;
                        if (PhotoViewer.isShowingImage(messageObject) && (pinnedHeader = recyclerListView.getPinnedHeader()) != null) {
                            int m36dp = (childAt instanceof SharedDocumentCell ? AndroidUtilities.m36dp(8.0f) + 0 : 0) - placeProviderObject.viewY;
                            if (m36dp > childAt.getHeight()) {
                                recyclerListView.scrollBy(0, -(m36dp + pinnedHeader.getHeight()));
                            } else {
                                int height = placeProviderObject.viewY - recyclerListView.getHeight();
                                if (childAt instanceof SharedDocumentCell) {
                                    height -= AndroidUtilities.m36dp(8.0f);
                                }
                                if (height >= 0) {
                                    recyclerListView.scrollBy(0, height + childAt.getHeight());
                                }
                            }
                        }
                        return placeProviderObject;
                    }
                }
                return null;
            }

            @Override
            public CharSequence getTitleFor(int i) {
                return FilteredSearchView.createFromInfoString(FilteredSearchView.this.messages.get(i));
            }

            @Override
            public CharSequence getSubtitleFor(int i) {
                return LocaleController.formatDateAudio(FilteredSearchView.this.messages.get(i).messageOwner.date, false);
            }
        };
        this.animationIndex = -1;
        this.hideFloatingDateRunnable = new Runnable() {
            @Override
            public final void run() {
                FilteredSearchView.this.lambda$new$0();
            }
        };
        this.parentFragment = baseFragment;
        Activity parentActivity = baseFragment.getParentActivity();
        this.parentActivity = parentActivity;
        setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
        BlurredRecyclerView blurredRecyclerView = new BlurredRecyclerView(parentActivity) {
            @Override
            public void dispatchDraw(Canvas canvas) {
                if (getAdapter() == FilteredSearchView.this.sharedPhotoVideoAdapter) {
                    for (int i = 0; i < getChildCount(); i++) {
                        if (getChildViewHolder(getChildAt(i)).getItemViewType() == 1) {
                            canvas.save();
                            canvas.translate(getChildAt(i).getX(), (getChildAt(i).getY() - getChildAt(i).getMeasuredHeight()) + AndroidUtilities.m36dp(2.0f));
                            getChildAt(i).draw(canvas);
                            canvas.restore();
                            invalidate();
                        }
                    }
                }
                super.dispatchDraw(canvas);
            }

            @Override
            public boolean drawChild(Canvas canvas, View view, long j) {
                if (getAdapter() == FilteredSearchView.this.sharedPhotoVideoAdapter && getChildViewHolder(view).getItemViewType() == 1) {
                    return true;
                }
                return super.drawChild(canvas, view, j);
            }
        };
        this.recyclerListView = blurredRecyclerView;
        blurredRecyclerView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view, int i) {
                FilteredSearchView.this.lambda$new$1(view, i);
            }
        });
        this.recyclerListView.setOnItemLongClickListener(new RecyclerListView.OnItemLongClickListenerExtended() {
            @Override
            public boolean onItemClick(View view, int i, float f, float f2) {
                if (view instanceof SharedDocumentCell) {
                    FilteredSearchView.this.onItemLongClick(((SharedDocumentCell) view).getMessage(), view, 0);
                } else if (view instanceof SharedLinkCell) {
                    FilteredSearchView.this.onItemLongClick(((SharedLinkCell) view).getMessage(), view, 0);
                } else if (view instanceof SharedAudioCell) {
                    FilteredSearchView.this.onItemLongClick(((SharedAudioCell) view).getMessage(), view, 0);
                } else if (view instanceof ContextLinkCell) {
                    FilteredSearchView.this.onItemLongClick(((ContextLinkCell) view).getMessageObject(), view, 0);
                } else if (view instanceof DialogCell) {
                    if (!FilteredSearchView.this.uiCallback.actionModeShowing()) {
                        DialogCell dialogCell = (DialogCell) view;
                        if (dialogCell.isPointInsideAvatar(f, f2)) {
                            FilteredSearchView.this.chatPreviewDelegate.startChatPreview(FilteredSearchView.this.recyclerListView, dialogCell);
                            return true;
                        }
                    }
                    FilteredSearchView.this.onItemLongClick(((DialogCell) view).getMessage(), view, 0);
                }
                return true;
            }

            @Override
            public void onMove(float f, float f2) {
                FilteredSearchView.this.chatPreviewDelegate.move(f2);
            }

            @Override
            public void onLongClickRelease() {
                FilteredSearchView.this.chatPreviewDelegate.finish();
            }
        });
        this.recyclerListView.setPadding(0, 0, 0, AndroidUtilities.m36dp(3.0f));
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(parentActivity);
        this.layoutManager = linearLayoutManager;
        this.recyclerListView.setLayoutManager(linearLayoutManager);
        FlickerLoadingView flickerLoadingView = new FlickerLoadingView(parentActivity) {
            @Override
            public int getColumnsCount() {
                return FilteredSearchView.this.columnsCount;
            }
        };
        this.loadingView = flickerLoadingView;
        addView(flickerLoadingView);
        addView(this.recyclerListView);
        this.recyclerListView.setSectionsType(2);
        this.recyclerListView.setOnScrollListener(new C32506());
        ChatActionCell chatActionCell = new ChatActionCell(parentActivity);
        this.floatingDateView = chatActionCell;
        chatActionCell.setCustomDate((int) (System.currentTimeMillis() / 1000), false, false);
        chatActionCell.setAlpha(0.0f);
        chatActionCell.setOverrideColor("chat_mediaTimeBackground", "chat_mediaTimeText");
        chatActionCell.setTranslationY(-AndroidUtilities.m36dp(48.0f));
        addView(chatActionCell, LayoutHelper.createFrame(-2, -2.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        this.dialogsAdapter = new OnlyUserFiltersAdapter();
        this.sharedPhotoVideoAdapter = new SharedPhotoVideoAdapter(getContext());
        this.sharedDocumentsAdapter = new SharedDocumentsAdapter(getContext(), 1);
        this.sharedLinksAdapter = new SharedLinksAdapter(getContext());
        this.sharedAudioAdapter = new SharedDocumentsAdapter(getContext(), 4);
        this.sharedVoiceAdapter = new SharedDocumentsAdapter(getContext(), 2);
        StickerEmptyView stickerEmptyView = new StickerEmptyView(parentActivity, flickerLoadingView, 1);
        this.emptyView = stickerEmptyView;
        addView(stickerEmptyView);
        this.recyclerListView.setEmptyView(this.emptyView);
        this.emptyView.setVisibility(8);
    }

    public void lambda$new$1(View view, int i) {
        if (view instanceof SharedDocumentCell) {
            onItemClick(i, view, ((SharedDocumentCell) view).getMessage(), 0);
        } else if (view instanceof SharedLinkCell) {
            onItemClick(i, view, ((SharedLinkCell) view).getMessage(), 0);
        } else if (view instanceof SharedAudioCell) {
            onItemClick(i, view, ((SharedAudioCell) view).getMessage(), 0);
        } else if (view instanceof ContextLinkCell) {
            onItemClick(i, view, ((ContextLinkCell) view).getMessageObject(), 0);
        } else if (view instanceof DialogCell) {
            onItemClick(i, view, ((DialogCell) view).getMessage(), 0);
        }
    }

    public class C32506 extends RecyclerView.OnScrollListener {
        C32506() {
        }

        @Override
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            if (i == 1) {
                AndroidUtilities.hideKeyboard(FilteredSearchView.this.parentActivity.getCurrentFocus());
            }
        }

        @Override
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            MessageObject messageObject;
            if (recyclerView.getAdapter() != null) {
                FilteredSearchView filteredSearchView = FilteredSearchView.this;
                if (filteredSearchView.adapter == null) {
                    return;
                }
                int findFirstVisibleItemPosition = filteredSearchView.layoutManager.findFirstVisibleItemPosition();
                int findLastVisibleItemPosition = FilteredSearchView.this.layoutManager.findLastVisibleItemPosition();
                int abs = Math.abs(findLastVisibleItemPosition - findFirstVisibleItemPosition) + 1;
                int itemCount = recyclerView.getAdapter().getItemCount();
                if (!FilteredSearchView.this.isLoading && abs > 0 && findLastVisibleItemPosition >= itemCount - 10 && !FilteredSearchView.this.endReached) {
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            FilteredSearchView.C32506.this.lambda$onScrolled$0();
                        }
                    });
                }
                FilteredSearchView filteredSearchView2 = FilteredSearchView.this;
                if (filteredSearchView2.adapter == filteredSearchView2.sharedPhotoVideoAdapter) {
                    if (i2 != 0 && !FilteredSearchView.this.messages.isEmpty() && TextUtils.isEmpty(FilteredSearchView.this.currentDataQuery)) {
                        FilteredSearchView.this.showFloatingDateView();
                    }
                    RecyclerView.ViewHolder findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(findFirstVisibleItemPosition);
                    if (findViewHolderForAdapterPosition == null || findViewHolderForAdapterPosition.getItemViewType() != 0) {
                        return;
                    }
                    View view = findViewHolderForAdapterPosition.itemView;
                    if (!(view instanceof SharedPhotoVideoCell) || (messageObject = ((SharedPhotoVideoCell) view).getMessageObject(0)) == null) {
                        return;
                    }
                    FilteredSearchView.this.floatingDateView.setCustomDate(messageObject.messageOwner.date, false, true);
                }
            }
        }

        public void lambda$onScrolled$0() {
            FilteredSearchView filteredSearchView = FilteredSearchView.this;
            filteredSearchView.search(filteredSearchView.currentSearchDialogId, filteredSearchView.currentSearchMinDate, filteredSearchView.currentSearchMaxDate, filteredSearchView.currentSearchFilter, filteredSearchView.currentIncludeFolder, filteredSearchView.lastMessagesSearchString, false);
        }
    }

    public static CharSequence createFromInfoString(MessageObject messageObject) {
        TLRPC$TL_forumTopic findTopic;
        TLRPC$TL_forumTopic findTopic2;
        if (arrowSpan == null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("-");
            arrowSpan = spannableStringBuilder;
            spannableStringBuilder.setSpan(new ColoredImageSpan(ContextCompat.getDrawable(ApplicationLoader.applicationContext, C1072R.C1073drawable.search_arrow).mutate()), 0, 1, 0);
        }
        ?? r0 = 0;
        TLRPC$User user = messageObject.messageOwner.from_id.user_id != 0 ? MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(messageObject.messageOwner.from_id.user_id)) : null;
        TLRPC$Chat chat = messageObject.messageOwner.from_id.chat_id != 0 ? MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(messageObject.messageOwner.peer_id.chat_id)) : null;
        if (chat == null) {
            chat = messageObject.messageOwner.from_id.channel_id != 0 ? MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(messageObject.messageOwner.peer_id.channel_id)) : null;
        }
        TLRPC$Chat chat2 = messageObject.messageOwner.peer_id.channel_id != 0 ? MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(messageObject.messageOwner.peer_id.channel_id)) : null;
        if (chat2 == null) {
            chat2 = messageObject.messageOwner.peer_id.chat_id != 0 ? MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(messageObject.messageOwner.peer_id.chat_id)) : null;
        }
        if (user != null && chat2 != null) {
            CharSequence charSequence = chat2.title;
            if (ChatObject.isForum(chat2) && (findTopic2 = MessagesController.getInstance(UserConfig.selectedAccount).getTopicsController().findTopic(chat2.f857id, MessageObject.getTopicId(messageObject.messageOwner, true))) != null) {
                charSequence = ForumUtilities.getTopicSpannedName(findTopic2, null);
            }
            CharSequence replaceEmoji = Emoji.replaceEmoji(charSequence, null, AndroidUtilities.m36dp(12.0f), false);
            r0 = new SpannableStringBuilder();
            r0.append(ContactsController.formatName(user.first_name, user.last_name)).append(' ').append((CharSequence) arrowSpan).append(' ').append(replaceEmoji);
        } else if (user != null) {
            r0 = ContactsController.formatName(user.first_name, user.last_name);
        } else if (chat != null) {
            CharSequence charSequence2 = chat.title;
            if (ChatObject.isForum(chat) && (findTopic = MessagesController.getInstance(UserConfig.selectedAccount).getTopicsController().findTopic(chat.f857id, MessageObject.getTopicId(messageObject.messageOwner, true))) != null) {
                charSequence2 = ForumUtilities.getTopicSpannedName(findTopic, null);
            }
            r0 = Emoji.replaceEmoji(charSequence2, null, AndroidUtilities.m36dp(12.0f), false);
        }
        return r0 == 0 ? "" : r0;
    }

    public void search(final long j, final long j2, final long j3, final FiltersView.MediaFilterData mediaFilterData, final boolean z, final String str, boolean z2) {
        Locale locale = Locale.ENGLISH;
        Object[] objArr = new Object[6];
        objArr[0] = Long.valueOf(j);
        objArr[1] = Long.valueOf(j2);
        objArr[2] = Long.valueOf(j3);
        objArr[3] = Integer.valueOf(mediaFilterData == null ? -1 : mediaFilterData.filterType);
        objArr[4] = str;
        objArr[5] = Boolean.valueOf(z);
        final String format = String.format(locale, "%d%d%d%d%s%s", objArr);
        String str2 = this.lastSearchFilterQueryString;
        boolean z3 = str2 != null && str2.equals(format);
        boolean z4 = !z3 && z2;
        this.currentSearchFilter = mediaFilterData;
        this.currentSearchDialogId = j;
        this.currentSearchMinDate = j2;
        this.currentSearchMaxDate = j3;
        this.currentSearchString = str;
        this.currentIncludeFolder = z;
        Runnable runnable = this.searchRunnable;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        AndroidUtilities.cancelRunOnUIThread(this.clearCurrentResultsRunnable);
        if (z3 && z2) {
            return;
        }
        long j4 = 0;
        if (z4 || (mediaFilterData == null && j == 0 && j2 == 0 && j3 == 0)) {
            this.messages.clear();
            this.sections.clear();
            this.sectionArrays.clear();
            this.isLoading = true;
            this.emptyView.setVisibility(0);
            RecyclerView.Adapter adapter = this.adapter;
            if (adapter != null) {
                adapter.notifyDataSetChanged();
            }
            this.requestIndex++;
            if (this.recyclerListView.getPinnedHeader() != null) {
                this.recyclerListView.getPinnedHeader().setAlpha(0.0f);
            }
            this.localTipChats.clear();
            this.localTipDates.clear();
            if (!z4) {
                return;
            }
        } else if (z2 && !this.messages.isEmpty()) {
            return;
        }
        this.isLoading = true;
        RecyclerView.Adapter adapter2 = this.adapter;
        if (adapter2 != null) {
            adapter2.notifyDataSetChanged();
        }
        if (!z3) {
            this.clearCurrentResultsRunnable.run();
            this.emptyView.showProgress(true, !z2);
        }
        if (TextUtils.isEmpty(str)) {
            this.localTipDates.clear();
            this.localTipChats.clear();
            Delegate delegate = this.delegate;
            if (delegate != null) {
                delegate.updateFiltersView(false, null, null, false);
            }
        }
        final int i = this.requestIndex + 1;
        this.requestIndex = i;
        final int i2 = UserConfig.selectedAccount;
        final boolean z5 = z3;
        Runnable runnable2 = new Runnable() {
            @Override
            public final void run() {
                FilteredSearchView.this.lambda$search$4(j, str, mediaFilterData, i2, j2, j3, z5, z, format, i);
            }
        };
        this.searchRunnable = runnable2;
        AndroidUtilities.runOnUIThread(runnable2, (!z3 || this.messages.isEmpty()) ? 350L : 350L);
        if (mediaFilterData == null) {
            this.loadingView.setViewType(1);
            return;
        }
        int i3 = mediaFilterData.filterType;
        if (i3 == 0) {
            if (!TextUtils.isEmpty(this.currentSearchString)) {
                this.loadingView.setViewType(1);
            } else {
                this.loadingView.setViewType(2);
            }
        } else if (i3 == 1) {
            this.loadingView.setViewType(3);
        } else if (i3 == 3 || i3 == 5) {
            this.loadingView.setViewType(4);
        } else if (i3 == 2) {
            this.loadingView.setViewType(5);
        }
    }

    public void lambda$search$4(final long j, final String str, final FiltersView.MediaFilterData mediaFilterData, final int i, final long j2, long j3, final boolean z, boolean z2, String str2, final int i2) {
        ArrayList<MessageObject> arrayList;
        TLRPC$TL_messages_searchGlobal tLRPC$TL_messages_searchGlobal;
        ArrayList<MessageObject> arrayList2;
        ArrayList<Object> arrayList3 = null;
        if (j != 0) {
            TLRPC$TL_messages_search tLRPC$TL_messages_search = new TLRPC$TL_messages_search();
            tLRPC$TL_messages_search.f961q = str;
            tLRPC$TL_messages_search.limit = 20;
            tLRPC$TL_messages_search.filter = mediaFilterData == null ? new TLRPC$TL_inputMessagesFilterEmpty() : mediaFilterData.filter;
            tLRPC$TL_messages_search.peer = AccountInstance.getInstance(i).getMessagesController().getInputPeer(j);
            if (j2 > 0) {
                tLRPC$TL_messages_search.min_date = (int) (j2 / 1000);
            }
            if (j3 > 0) {
                tLRPC$TL_messages_search.max_date = (int) (j3 / 1000);
            }
            if (z && str.equals(this.lastMessagesSearchString) && !this.messages.isEmpty()) {
                tLRPC$TL_messages_search.offset_id = this.messages.get(arrayList2.size() - 1).getId();
                tLRPC$TL_messages_searchGlobal = tLRPC$TL_messages_search;
            } else {
                tLRPC$TL_messages_search.offset_id = 0;
                tLRPC$TL_messages_searchGlobal = tLRPC$TL_messages_search;
            }
        } else {
            if (!TextUtils.isEmpty(str)) {
                ArrayList<Object> arrayList4 = new ArrayList<>();
                MessagesStorage.getInstance(i).localSearch(0, str, arrayList4, new ArrayList<>(), new ArrayList<>(), z2 ? 1 : 0);
                arrayList3 = arrayList4;
            }
            TLRPC$TL_messages_searchGlobal tLRPC$TL_messages_searchGlobal2 = new TLRPC$TL_messages_searchGlobal();
            tLRPC$TL_messages_searchGlobal2.limit = 20;
            tLRPC$TL_messages_searchGlobal2.f962q = str;
            tLRPC$TL_messages_searchGlobal2.filter = mediaFilterData == null ? new TLRPC$TL_inputMessagesFilterEmpty() : mediaFilterData.filter;
            if (j2 > 0) {
                tLRPC$TL_messages_searchGlobal2.min_date = (int) (j2 / 1000);
            }
            if (j3 > 0) {
                tLRPC$TL_messages_searchGlobal2.max_date = (int) (j3 / 1000);
            }
            if (z && str.equals(this.lastMessagesSearchString) && !this.messages.isEmpty()) {
                MessageObject messageObject = this.messages.get(arrayList.size() - 1);
                tLRPC$TL_messages_searchGlobal2.offset_id = messageObject.getId();
                tLRPC$TL_messages_searchGlobal2.offset_rate = this.nextSearchRate;
                tLRPC$TL_messages_searchGlobal2.offset_peer = MessagesController.getInstance(i).getInputPeer(MessageObject.getPeerId(messageObject.messageOwner.peer_id));
            } else {
                tLRPC$TL_messages_searchGlobal2.offset_rate = 0;
                tLRPC$TL_messages_searchGlobal2.offset_id = 0;
                tLRPC$TL_messages_searchGlobal2.offset_peer = new TLRPC$TL_inputPeerEmpty();
            }
            tLRPC$TL_messages_searchGlobal2.flags |= 1;
            tLRPC$TL_messages_searchGlobal2.folder_id = z2 ? 1 : 0;
            tLRPC$TL_messages_searchGlobal = tLRPC$TL_messages_searchGlobal2;
        }
        final ArrayList<Object> arrayList5 = arrayList3;
        TLRPC$TL_messages_searchGlobal tLRPC$TL_messages_searchGlobal3 = tLRPC$TL_messages_searchGlobal;
        this.lastMessagesSearchString = str;
        this.lastSearchFilterQueryString = str2;
        final ArrayList arrayList6 = new ArrayList();
        FiltersView.fillTipDates(this.lastMessagesSearchString, arrayList6);
        ConnectionsManager.getInstance(i).sendRequest(tLRPC$TL_messages_searchGlobal3, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                FilteredSearchView.this.lambda$search$3(i, str, i2, z, mediaFilterData, j, j2, arrayList5, arrayList6, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$search$3(final int i, final String str, final int i2, final boolean z, final FiltersView.MediaFilterData mediaFilterData, final long j, final long j2, final ArrayList arrayList, final ArrayList arrayList2, final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        final ArrayList arrayList3 = new ArrayList();
        if (tLRPC$TL_error == null) {
            TLRPC$messages_Messages tLRPC$messages_Messages = (TLRPC$messages_Messages) tLObject;
            int size = tLRPC$messages_Messages.messages.size();
            for (int i3 = 0; i3 < size; i3++) {
                MessageObject messageObject = new MessageObject(i, tLRPC$messages_Messages.messages.get(i3), false, true);
                messageObject.setQuery(str);
                arrayList3.add(messageObject);
            }
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                FilteredSearchView.this.lambda$search$2(i2, tLRPC$TL_error, tLObject, i, z, str, arrayList3, mediaFilterData, j, j2, arrayList, arrayList2);
            }
        });
    }

    public void lambda$search$2(int i, TLRPC$TL_error tLRPC$TL_error, TLObject tLObject, final int i2, boolean z, String str, ArrayList arrayList, FiltersView.MediaFilterData mediaFilterData, long j, long j2, ArrayList arrayList2, ArrayList arrayList3) {
        boolean z2;
        String string;
        if (i != this.requestIndex) {
            return;
        }
        this.isLoading = false;
        if (tLRPC$TL_error != null) {
            this.emptyView.title.setText(LocaleController.getString("SearchEmptyViewTitle2", C1072R.string.SearchEmptyViewTitle2));
            this.emptyView.subtitle.setVisibility(0);
            this.emptyView.subtitle.setText(LocaleController.getString("SearchEmptyViewFilteredSubtitle2", C1072R.string.SearchEmptyViewFilteredSubtitle2));
            this.emptyView.showProgress(false, true);
            return;
        }
        this.emptyView.showProgress(false);
        TLRPC$messages_Messages tLRPC$messages_Messages = (TLRPC$messages_Messages) tLObject;
        this.nextSearchRate = tLRPC$messages_Messages.next_rate;
        MessagesStorage.getInstance(i2).putUsersAndChats(tLRPC$messages_Messages.users, tLRPC$messages_Messages.chats, true, true);
        MessagesController.getInstance(i2).putUsers(tLRPC$messages_Messages.users, false);
        MessagesController.getInstance(i2).putChats(tLRPC$messages_Messages.chats, false);
        if (!z) {
            this.messages.clear();
            this.messagesById.clear();
            this.sections.clear();
            this.sectionArrays.clear();
        }
        this.totalCount = tLRPC$messages_Messages.count;
        this.currentDataQuery = str;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            MessageObject messageObject = (MessageObject) arrayList.get(i3);
            ArrayList<MessageObject> arrayList4 = this.sectionArrays.get(messageObject.monthKey);
            if (arrayList4 == null) {
                arrayList4 = new ArrayList<>();
                this.sectionArrays.put(messageObject.monthKey, arrayList4);
                this.sections.add(messageObject.monthKey);
            }
            arrayList4.add(messageObject);
            this.messages.add(messageObject);
            this.messagesById.put(messageObject.getId(), messageObject);
            if (PhotoViewer.getInstance().isVisible()) {
                PhotoViewer.getInstance().addPhoto(messageObject, this.photoViewerClassGuid);
            }
        }
        if (this.messages.size() > this.totalCount) {
            this.totalCount = this.messages.size();
        }
        this.endReached = this.messages.size() >= this.totalCount;
        if (this.messages.isEmpty()) {
            if (mediaFilterData != null) {
                if (TextUtils.isEmpty(this.currentDataQuery) && j == 0 && j2 == 0) {
                    this.emptyView.title.setText(LocaleController.getString("SearchEmptyViewTitle", C1072R.string.SearchEmptyViewTitle));
                    int i4 = mediaFilterData.filterType;
                    if (i4 == 1) {
                        string = LocaleController.getString("SearchEmptyViewFilteredSubtitleFiles", C1072R.string.SearchEmptyViewFilteredSubtitleFiles);
                    } else if (i4 == 0) {
                        string = LocaleController.getString("SearchEmptyViewFilteredSubtitleMedia", C1072R.string.SearchEmptyViewFilteredSubtitleMedia);
                    } else if (i4 == 2) {
                        string = LocaleController.getString("SearchEmptyViewFilteredSubtitleLinks", C1072R.string.SearchEmptyViewFilteredSubtitleLinks);
                    } else if (i4 == 3) {
                        string = LocaleController.getString("SearchEmptyViewFilteredSubtitleMusic", C1072R.string.SearchEmptyViewFilteredSubtitleMusic);
                    } else {
                        string = LocaleController.getString("SearchEmptyViewFilteredSubtitleVoice", C1072R.string.SearchEmptyViewFilteredSubtitleVoice);
                    }
                    this.emptyView.subtitle.setVisibility(0);
                    this.emptyView.subtitle.setText(string);
                } else {
                    this.emptyView.title.setText(LocaleController.getString("SearchEmptyViewTitle2", C1072R.string.SearchEmptyViewTitle2));
                    this.emptyView.subtitle.setVisibility(0);
                    this.emptyView.subtitle.setText(LocaleController.getString("SearchEmptyViewFilteredSubtitle2", C1072R.string.SearchEmptyViewFilteredSubtitle2));
                }
            } else {
                this.emptyView.title.setText(LocaleController.getString("SearchEmptyViewTitle2", C1072R.string.SearchEmptyViewTitle2));
                this.emptyView.subtitle.setVisibility(8);
            }
        }
        if (mediaFilterData != null) {
            int i5 = mediaFilterData.filterType;
            if (i5 != 0) {
                if (i5 == 1) {
                    this.adapter = this.sharedDocumentsAdapter;
                } else if (i5 == 2) {
                    this.adapter = this.sharedLinksAdapter;
                } else if (i5 == 3) {
                    this.adapter = this.sharedAudioAdapter;
                } else if (i5 == 5) {
                    this.adapter = this.sharedVoiceAdapter;
                }
            } else if (TextUtils.isEmpty(this.currentDataQuery)) {
                this.adapter = this.sharedPhotoVideoAdapter;
            } else {
                this.adapter = this.dialogsAdapter;
            }
        } else {
            this.adapter = this.dialogsAdapter;
        }
        RecyclerView.Adapter adapter = this.recyclerListView.getAdapter();
        RecyclerView.Adapter adapter2 = this.adapter;
        if (adapter != adapter2) {
            this.recyclerListView.setAdapter(adapter2);
        }
        if (!z) {
            this.localTipChats.clear();
            if (arrayList2 != null) {
                this.localTipChats.addAll(arrayList2);
            }
            if (str != null && str.length() >= 3 && (LocaleController.getString("SavedMessages", C1072R.string.SavedMessages).toLowerCase().startsWith(str) || "saved messages".startsWith(str))) {
                int i6 = 0;
                while (true) {
                    if (i6 >= this.localTipChats.size()) {
                        z2 = false;
                        break;
                    } else if ((this.localTipChats.get(i6) instanceof TLRPC$User) && UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser().f995id == ((TLRPC$User) this.localTipChats.get(i6)).f995id) {
                        z2 = true;
                        break;
                    } else {
                        i6++;
                    }
                }
                if (!z2) {
                    this.localTipChats.add(0, UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser());
                }
            }
            this.localTipDates.clear();
            this.localTipDates.addAll(arrayList3);
            this.localTipArchive = false;
            if (str != null && str.length() >= 3 && (LocaleController.getString("ArchiveSearchFilter", C1072R.string.ArchiveSearchFilter).toLowerCase().startsWith(str) || "archive".startsWith(str))) {
                this.localTipArchive = true;
            }
            Delegate delegate = this.delegate;
            if (delegate != null) {
                delegate.updateFiltersView(TextUtils.isEmpty(this.currentDataQuery), this.localTipChats, this.localTipDates, this.localTipArchive);
            }
        }
        final View view = null;
        final int i7 = -1;
        for (int i8 = 0; i8 < size; i8++) {
            View childAt = this.recyclerListView.getChildAt(i8);
            if (childAt instanceof FlickerLoadingView) {
                i7 = this.recyclerListView.getChildAdapterPosition(childAt);
                view = childAt;
            }
        }
        if (view != null) {
            this.recyclerListView.removeView(view);
        }
        if ((this.loadingView.getVisibility() == 0 && this.recyclerListView.getChildCount() == 0) || (this.recyclerListView.getAdapter() != this.sharedPhotoVideoAdapter && view != null)) {
            getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
                @Override
                public boolean onPreDraw() {
                    FilteredSearchView.this.getViewTreeObserver().removeOnPreDrawListener(this);
                    int childCount = FilteredSearchView.this.recyclerListView.getChildCount();
                    AnimatorSet animatorSet = new AnimatorSet();
                    for (int i9 = 0; i9 < childCount; i9++) {
                        View childAt2 = FilteredSearchView.this.recyclerListView.getChildAt(i9);
                        if (view == null || FilteredSearchView.this.recyclerListView.getChildAdapterPosition(childAt2) >= i7) {
                            childAt2.setAlpha(0.0f);
                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt2, View.ALPHA, 0.0f, 1.0f);
                            ofFloat.setStartDelay((int) ((Math.min(FilteredSearchView.this.recyclerListView.getMeasuredHeight(), Math.max(0, childAt2.getTop())) / FilteredSearchView.this.recyclerListView.getMeasuredHeight()) * 100.0f));
                            ofFloat.setDuration(200L);
                            animatorSet.playTogether(ofFloat);
                        }
                    }
                    animatorSet.addListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationEnd(Animator animator) {
                            NotificationCenter.getInstance(i2).onAnimationFinish(FilteredSearchView.this.animationIndex);
                        }
                    });
                    FilteredSearchView.this.animationIndex = NotificationCenter.getInstance(i2).setAnimationInProgress(FilteredSearchView.this.animationIndex, null);
                    animatorSet.start();
                    View view2 = view;
                    if (view2 != null && view2.getParent() == null) {
                        FilteredSearchView.this.recyclerListView.addView(view);
                        final RecyclerView.LayoutManager layoutManager = FilteredSearchView.this.recyclerListView.getLayoutManager();
                        if (layoutManager != null) {
                            layoutManager.ignoreView(view);
                            View view3 = view;
                            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view3, View.ALPHA, view3.getAlpha(), 0.0f);
                            ofFloat2.addListener(new AnimatorListenerAdapter() {
                                @Override
                                public void onAnimationEnd(Animator animator) {
                                    view.setAlpha(1.0f);
                                    layoutManager.stopIgnoringView(view);
                                    ViewTreeObserver$OnPreDrawListenerC32517 viewTreeObserver$OnPreDrawListenerC32517 = ViewTreeObserver$OnPreDrawListenerC32517.this;
                                    FilteredSearchView.this.recyclerListView.removeView(view);
                                }
                            });
                            ofFloat2.start();
                        }
                    }
                    return true;
                }
            });
        }
        this.adapter.notifyDataSetChanged();
    }

    public void update() {
        RecyclerView.Adapter adapter = this.adapter;
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }

    public void setKeyboardHeight(int i, boolean z) {
        this.emptyView.setKeyboardHeight(i, z);
    }

    public void messagesDeleted(long r10, java.util.ArrayList<java.lang.Integer> r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.FilteredSearchView.messagesDeleted(long, java.util.ArrayList):void");
    }

    public class SharedPhotoVideoAdapter extends RecyclerListView.SelectionAdapter {
        private Context mContext;

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return false;
        }

        public SharedPhotoVideoAdapter(Context context) {
            this.mContext = context;
        }

        @Override
        public int getItemCount() {
            if (FilteredSearchView.this.messages.isEmpty()) {
                return 0;
            }
            return ((int) Math.ceil(FilteredSearchView.this.messages.size() / FilteredSearchView.this.columnsCount)) + (!FilteredSearchView.this.endReached ? 1 : 0);
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            FrameLayout frameLayout;
            if (i == 0) {
                SharedPhotoVideoCell sharedPhotoVideoCell = new SharedPhotoVideoCell(this.mContext, 1);
                sharedPhotoVideoCell.setDelegate(new SharedPhotoVideoCell.SharedPhotoVideoCellDelegate() {
                    @Override
                    public void didClickItem(SharedPhotoVideoCell sharedPhotoVideoCell2, int i2, MessageObject messageObject, int i3) {
                        FilteredSearchView.this.onItemClick(i2, sharedPhotoVideoCell2, messageObject, i3);
                    }

                    @Override
                    public boolean didLongClickItem(SharedPhotoVideoCell sharedPhotoVideoCell2, int i2, MessageObject messageObject, int i3) {
                        if (!FilteredSearchView.this.uiCallback.actionModeShowing()) {
                            return FilteredSearchView.this.onItemLongClick(messageObject, sharedPhotoVideoCell2, i3);
                        }
                        didClickItem(sharedPhotoVideoCell2, i2, messageObject, i3);
                        return true;
                    }
                });
                frameLayout = sharedPhotoVideoCell;
            } else if (i == 2) {
                FrameLayout graySectionCell = new GraySectionCell(this.mContext);
                graySectionCell.setBackgroundColor(Theme.getColor("graySection") & (-218103809));
                frameLayout = graySectionCell;
            } else {
                FlickerLoadingView flickerLoadingView = new FlickerLoadingView(this.mContext) {
                    @Override
                    public int getColumnsCount() {
                        return FilteredSearchView.this.columnsCount;
                    }
                };
                flickerLoadingView.setIsSingleCell(true);
                flickerLoadingView.setViewType(2);
                frameLayout = flickerLoadingView;
            }
            frameLayout.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            return new RecyclerListView.Holder(frameLayout);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            boolean z = true;
            if (viewHolder.getItemViewType() == 0) {
                FilteredSearchView filteredSearchView = FilteredSearchView.this;
                ArrayList<MessageObject> arrayList = filteredSearchView.messages;
                SharedPhotoVideoCell sharedPhotoVideoCell = (SharedPhotoVideoCell) viewHolder.itemView;
                sharedPhotoVideoCell.setItemsCount(filteredSearchView.columnsCount);
                sharedPhotoVideoCell.setIsFirst(i == 0);
                for (int i2 = 0; i2 < FilteredSearchView.this.columnsCount; i2++) {
                    int i3 = (FilteredSearchView.this.columnsCount * i) + i2;
                    if (i3 < arrayList.size()) {
                        MessageObject messageObject = arrayList.get(i3);
                        sharedPhotoVideoCell.setItem(i2, FilteredSearchView.this.messages.indexOf(messageObject), messageObject);
                        if (FilteredSearchView.this.uiCallback.actionModeShowing()) {
                            FilteredSearchView.this.messageHashIdTmp.set(messageObject.getId(), messageObject.getDialogId());
                            sharedPhotoVideoCell.setChecked(i2, FilteredSearchView.this.uiCallback.isSelected(FilteredSearchView.this.messageHashIdTmp), true);
                        } else {
                            sharedPhotoVideoCell.setChecked(i2, false, true);
                        }
                    } else {
                        sharedPhotoVideoCell.setItem(i2, i3, null);
                    }
                }
                sharedPhotoVideoCell.requestLayout();
            } else if (viewHolder.getItemViewType() == 3) {
                DialogCell dialogCell = (DialogCell) viewHolder.itemView;
                dialogCell.useSeparator = i != getItemCount() - 1;
                MessageObject messageObject2 = FilteredSearchView.this.messages.get(i);
                z = (dialogCell.getMessage() == null || dialogCell.getMessage().getId() != messageObject2.getId()) ? false : false;
                dialogCell.useFromUserAsAvatar = FilteredSearchView.this.useFromUserAsAvatar;
                dialogCell.setDialog(messageObject2.getDialogId(), messageObject2, messageObject2.messageOwner.date, false, false);
                if (FilteredSearchView.this.uiCallback.actionModeShowing()) {
                    FilteredSearchView.this.messageHashIdTmp.set(messageObject2.getId(), messageObject2.getDialogId());
                    dialogCell.setChecked(FilteredSearchView.this.uiCallback.isSelected(FilteredSearchView.this.messageHashIdTmp), z);
                    return;
                }
                dialogCell.setChecked(false, z);
            } else if (viewHolder.getItemViewType() == 1) {
                ((FlickerLoadingView) viewHolder.itemView).skipDrawItemsCount(FilteredSearchView.this.columnsCount - ((FilteredSearchView.this.columnsCount * ((int) Math.ceil(FilteredSearchView.this.messages.size() / FilteredSearchView.this.columnsCount))) - FilteredSearchView.this.messages.size()));
            }
        }

        @Override
        public int getItemViewType(int i) {
            return i < ((int) Math.ceil((double) (((float) FilteredSearchView.this.messages.size()) / ((float) FilteredSearchView.this.columnsCount)))) ? 0 : 1;
        }
    }

    public void setUseFromUserAsAvatar(boolean z) {
        this.useFromUserAsAvatar = z;
    }

    public void onItemClick(int i, View view, MessageObject messageObject, int i2) {
        if (messageObject == null) {
            return;
        }
        if (this.uiCallback.actionModeShowing()) {
            this.uiCallback.toggleItemSelection(messageObject, view, i2);
        } else if (view instanceof DialogCell) {
            this.uiCallback.goToMessage(messageObject);
        } else {
            int i3 = this.currentSearchFilter.filterType;
            if (i3 == 0) {
                PhotoViewer.getInstance().setParentActivity(this.parentFragment);
                PhotoViewer.getInstance().openPhoto(this.messages, i, 0L, 0L, 0, this.provider);
                this.photoViewerClassGuid = PhotoViewer.getInstance().getClassGuid();
            } else if (i3 == 3 || i3 == 5) {
                if (view instanceof SharedAudioCell) {
                    ((SharedAudioCell) view).didPressedButton();
                }
            } else if (i3 != 1) {
                if (i3 == 2) {
                    try {
                        TLRPC$MessageMedia tLRPC$MessageMedia = messageObject.messageOwner.media;
                        String str = null;
                        TLRPC$WebPage tLRPC$WebPage = tLRPC$MessageMedia != null ? tLRPC$MessageMedia.webpage : null;
                        if (tLRPC$WebPage != null && !(tLRPC$WebPage instanceof TLRPC$TL_webPageEmpty)) {
                            if (tLRPC$WebPage.cached_page != null) {
                                ArticleViewer.getInstance().setParentActivity(this.parentActivity, this.parentFragment);
                                ArticleViewer.getInstance().open(messageObject);
                                return;
                            }
                            String str2 = tLRPC$WebPage.embed_url;
                            if (str2 != null && str2.length() != 0) {
                                openWebView(tLRPC$WebPage, messageObject);
                                return;
                            }
                            str = tLRPC$WebPage.url;
                        }
                        if (str == null) {
                            str = ((SharedLinkCell) view).getLink(0);
                        }
                        if (str != null) {
                            openUrl(str);
                        }
                    } catch (Exception e) {
                        FileLog.m32e(e);
                    }
                }
            } else if (view instanceof SharedDocumentCell) {
                SharedDocumentCell sharedDocumentCell = (SharedDocumentCell) view;
                TLRPC$Document document = messageObject.getDocument();
                if (sharedDocumentCell.isLoaded()) {
                    if (messageObject.canPreviewDocument()) {
                        PhotoViewer.getInstance().setParentActivity(this.parentFragment);
                        int indexOf = this.messages.indexOf(messageObject);
                        if (indexOf < 0) {
                            ArrayList<MessageObject> arrayList = new ArrayList<>();
                            arrayList.add(messageObject);
                            PhotoViewer.getInstance().setParentActivity(this.parentFragment);
                            PhotoViewer.getInstance().openPhoto(arrayList, 0, 0L, 0L, 0, this.provider);
                            this.photoViewerClassGuid = PhotoViewer.getInstance().getClassGuid();
                            return;
                        }
                        PhotoViewer.getInstance().setParentActivity(this.parentFragment);
                        PhotoViewer.getInstance().openPhoto(this.messages, indexOf, 0L, 0L, 0, this.provider);
                        this.photoViewerClassGuid = PhotoViewer.getInstance().getClassGuid();
                        return;
                    }
                    AndroidUtilities.openDocument(messageObject, this.parentActivity, this.parentFragment);
                } else if (!sharedDocumentCell.isLoading()) {
                    MessageObject message = sharedDocumentCell.getMessage();
                    message.putInDownloadsStore = true;
                    AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().loadFile(document, message, 0, 0);
                    sharedDocumentCell.updateFileExistIcon(true);
                } else {
                    AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().cancelLoadFile(document);
                    sharedDocumentCell.updateFileExistIcon(true);
                }
            }
        }
    }

    public class SharedLinksAdapter extends RecyclerListView.SectionsAdapter {
        private Context mContext;
        private final SharedLinkCell.SharedLinkCellDelegate sharedLinkCellDelegate = new C32611();

        @Override
        public Object getItem(int i, int i2) {
            return null;
        }

        @Override
        public String getLetter(int i) {
            return null;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder, int i, int i2) {
            return true;
        }

        public class C32611 implements SharedLinkCell.SharedLinkCellDelegate {
            C32611() {
            }

            @Override
            public void needOpenWebView(TLRPC$WebPage tLRPC$WebPage, MessageObject messageObject) {
                FilteredSearchView.this.openWebView(tLRPC$WebPage, messageObject);
            }

            @Override
            public boolean canPerformActions() {
                return !FilteredSearchView.this.uiCallback.actionModeShowing();
            }

            @Override
            public void onLinkPress(final String str, boolean z) {
                if (!z) {
                    FilteredSearchView.this.openUrl(str);
                    return;
                }
                BottomSheet.Builder builder = new BottomSheet.Builder(FilteredSearchView.this.parentActivity);
                builder.setTitle(str);
                builder.setItems(new CharSequence[]{LocaleController.getString("Open", C1072R.string.Open), LocaleController.getString("Copy", C1072R.string.Copy)}, new DialogInterface.OnClickListener() {
                    @Override
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        FilteredSearchView.SharedLinksAdapter.C32611.this.lambda$onLinkPress$0(str, dialogInterface, i);
                    }
                });
                FilteredSearchView.this.parentFragment.showDialog(builder.create());
            }

            public void lambda$onLinkPress$0(String str, DialogInterface dialogInterface, int i) {
                if (i == 0) {
                    FilteredSearchView.this.openUrl(str);
                } else if (i == 1) {
                    if (str.startsWith("mailto:")) {
                        str = str.substring(7);
                    } else if (str.startsWith("tel:")) {
                        str = str.substring(4);
                    }
                    AndroidUtilities.addToClipboard(str);
                }
            }
        }

        public SharedLinksAdapter(Context context) {
            this.mContext = context;
        }

        @Override
        public int getSectionCount() {
            int i = 0;
            if (FilteredSearchView.this.messages.isEmpty()) {
                return 0;
            }
            if (FilteredSearchView.this.sections.isEmpty() && FilteredSearchView.this.isLoading) {
                return 0;
            }
            int size = FilteredSearchView.this.sections.size();
            if (!FilteredSearchView.this.sections.isEmpty() && !FilteredSearchView.this.endReached) {
                i = 1;
            }
            return size + i;
        }

        @Override
        public int getCountForSection(int i) {
            if (i < FilteredSearchView.this.sections.size()) {
                FilteredSearchView filteredSearchView = FilteredSearchView.this;
                return filteredSearchView.sectionArrays.get(filteredSearchView.sections.get(i)).size() + (i == 0 ? 0 : 1);
            }
            return 1;
        }

        @Override
        public View getSectionHeaderView(int i, View view) {
            if (view == null) {
                view = new GraySectionCell(this.mContext);
                view.setBackgroundColor(Theme.getColor("graySection") & (-218103809));
            }
            if (i == 0) {
                view.setAlpha(0.0f);
                return view;
            }
            if (i < FilteredSearchView.this.sections.size()) {
                view.setAlpha(1.0f);
                ((GraySectionCell) view).setText(LocaleController.formatSectionDate(FilteredSearchView.this.sectionArrays.get(FilteredSearchView.this.sections.get(i)).get(0).messageOwner.date));
            }
            return view;
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            GraySectionCell graySectionCell;
            if (i == 0) {
                graySectionCell = new GraySectionCell(this.mContext);
            } else if (i == 1) {
                SharedLinkCell sharedLinkCell = new SharedLinkCell(this.mContext, 1);
                sharedLinkCell.setDelegate(this.sharedLinkCellDelegate);
                graySectionCell = sharedLinkCell;
            } else {
                FlickerLoadingView flickerLoadingView = new FlickerLoadingView(this.mContext);
                flickerLoadingView.setViewType(5);
                flickerLoadingView.setIsSingleCell(true);
                graySectionCell = flickerLoadingView;
            }
            graySectionCell.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            return new RecyclerListView.Holder(graySectionCell);
        }

        @Override
        public void onBindViewHolder(int i, int i2, RecyclerView.ViewHolder viewHolder) {
            if (viewHolder.getItemViewType() != 2) {
                ArrayList<MessageObject> arrayList = FilteredSearchView.this.sectionArrays.get(FilteredSearchView.this.sections.get(i));
                int itemViewType = viewHolder.getItemViewType();
                boolean z = false;
                if (itemViewType == 0) {
                    ((GraySectionCell) viewHolder.itemView).setText(LocaleController.formatSectionDate(arrayList.get(0).messageOwner.date));
                } else if (itemViewType != 1) {
                } else {
                    if (i != 0) {
                        i2--;
                    }
                    final SharedLinkCell sharedLinkCell = (SharedLinkCell) viewHolder.itemView;
                    final MessageObject messageObject = arrayList.get(i2);
                    final boolean z2 = sharedLinkCell.getMessage() != null && sharedLinkCell.getMessage().getId() == messageObject.getId();
                    if (i2 != arrayList.size() - 1 || (i == FilteredSearchView.this.sections.size() - 1 && FilteredSearchView.this.isLoading)) {
                        z = true;
                    }
                    sharedLinkCell.setLink(messageObject, z);
                    sharedLinkCell.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
                        @Override
                        public boolean onPreDraw() {
                            sharedLinkCell.getViewTreeObserver().removeOnPreDrawListener(this);
                            if (FilteredSearchView.this.uiCallback.actionModeShowing()) {
                                FilteredSearchView.this.messageHashIdTmp.set(messageObject.getId(), messageObject.getDialogId());
                                sharedLinkCell.setChecked(FilteredSearchView.this.uiCallback.isSelected(FilteredSearchView.this.messageHashIdTmp), z2);
                                return true;
                            }
                            sharedLinkCell.setChecked(false, z2);
                            return true;
                        }
                    });
                }
            }
        }

        @Override
        public int getItemViewType(int i, int i2) {
            if (i < FilteredSearchView.this.sections.size()) {
                return (i == 0 || i2 != 0) ? 1 : 0;
            }
            return 2;
        }

        @Override
        public void getPositionForScrollProgress(RecyclerListView recyclerListView, float f, int[] iArr) {
            iArr[0] = 0;
            iArr[1] = 0;
        }
    }

    public class SharedDocumentsAdapter extends RecyclerListView.SectionsAdapter {
        private int currentType;
        private Context mContext;

        @Override
        public Object getItem(int i, int i2) {
            return null;
        }

        @Override
        public String getLetter(int i) {
            return null;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder, int i, int i2) {
            return i == 0 || i2 != 0;
        }

        public SharedDocumentsAdapter(Context context, int i) {
            this.mContext = context;
            this.currentType = i;
        }

        @Override
        public int getSectionCount() {
            int i = 0;
            if (FilteredSearchView.this.sections.isEmpty()) {
                return 0;
            }
            int size = FilteredSearchView.this.sections.size();
            if (!FilteredSearchView.this.sections.isEmpty() && !FilteredSearchView.this.endReached) {
                i = 1;
            }
            return size + i;
        }

        @Override
        public int getCountForSection(int i) {
            if (i < FilteredSearchView.this.sections.size()) {
                FilteredSearchView filteredSearchView = FilteredSearchView.this;
                return filteredSearchView.sectionArrays.get(filteredSearchView.sections.get(i)).size() + (i == 0 ? 0 : 1);
            }
            return 1;
        }

        @Override
        public View getSectionHeaderView(int i, View view) {
            if (view == null) {
                view = new GraySectionCell(this.mContext);
                view.setBackgroundColor(Theme.getColor("graySection") & (-218103809));
            }
            if (i == 0) {
                view.setAlpha(0.0f);
                return view;
            }
            if (i < FilteredSearchView.this.sections.size()) {
                view.setAlpha(1.0f);
                ((GraySectionCell) view).setText(LocaleController.formatSectionDate(FilteredSearchView.this.sectionArrays.get(FilteredSearchView.this.sections.get(i)).get(0).messageOwner.date));
            }
            return view;
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View graySectionCell;
            SharedDocumentCell sharedDocumentCell;
            if (i != 0) {
                if (i == 1) {
                    sharedDocumentCell = new SharedDocumentCell(this.mContext, 2);
                } else if (i == 2) {
                    FlickerLoadingView flickerLoadingView = new FlickerLoadingView(this.mContext);
                    int i2 = this.currentType;
                    if (i2 == 2 || i2 == 4) {
                        flickerLoadingView.setViewType(4);
                    } else {
                        flickerLoadingView.setViewType(3);
                    }
                    flickerLoadingView.setIsSingleCell(true);
                    sharedDocumentCell = flickerLoadingView;
                } else {
                    graySectionCell = new SharedAudioCell(this.mContext, 1, null) {
                        @Override
                        public boolean needPlayMessage(MessageObject messageObject) {
                            if (messageObject.isVoice() || messageObject.isRoundVideo()) {
                                boolean playMessage = MediaController.getInstance().playMessage(messageObject);
                                MediaController.getInstance().setVoiceMessagesPlaylist(playMessage ? FilteredSearchView.this.messages : null, false);
                                return playMessage;
                            } else if (messageObject.isMusic()) {
                                String str = FilteredSearchView.this.currentDataQuery;
                                FilteredSearchView filteredSearchView = FilteredSearchView.this;
                                long j = filteredSearchView.currentSearchDialogId;
                                long j2 = filteredSearchView.currentSearchMinDate;
                                MediaController.PlaylistGlobalSearchParams playlistGlobalSearchParams = new MediaController.PlaylistGlobalSearchParams(str, j, j2, j2, filteredSearchView.currentSearchFilter);
                                playlistGlobalSearchParams.endReached = FilteredSearchView.this.endReached;
                                playlistGlobalSearchParams.nextSearchRate = FilteredSearchView.this.nextSearchRate;
                                playlistGlobalSearchParams.totalCount = FilteredSearchView.this.totalCount;
                                playlistGlobalSearchParams.folderId = FilteredSearchView.this.currentIncludeFolder ? 1 : 0;
                                return MediaController.getInstance().setPlaylist(FilteredSearchView.this.messages, messageObject, 0L, playlistGlobalSearchParams);
                            } else {
                                return false;
                            }
                        }
                    };
                }
                graySectionCell = sharedDocumentCell;
            } else {
                graySectionCell = new GraySectionCell(this.mContext);
            }
            graySectionCell.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            return new RecyclerListView.Holder(graySectionCell);
        }

        @Override
        public void onBindViewHolder(int i, int i2, RecyclerView.ViewHolder viewHolder) {
            if (viewHolder.getItemViewType() != 2) {
                ArrayList<MessageObject> arrayList = FilteredSearchView.this.sectionArrays.get(FilteredSearchView.this.sections.get(i));
                int itemViewType = viewHolder.getItemViewType();
                boolean z = false;
                if (itemViewType == 0) {
                    ((GraySectionCell) viewHolder.itemView).setText(LocaleController.formatSectionDate(arrayList.get(0).messageOwner.date));
                } else if (itemViewType == 1) {
                    if (i != 0) {
                        i2--;
                    }
                    final SharedDocumentCell sharedDocumentCell = (SharedDocumentCell) viewHolder.itemView;
                    final MessageObject messageObject = arrayList.get(i2);
                    final boolean z2 = sharedDocumentCell.getMessage() != null && sharedDocumentCell.getMessage().getId() == messageObject.getId();
                    if (i2 != arrayList.size() - 1 || (i == FilteredSearchView.this.sections.size() - 1 && FilteredSearchView.this.isLoading)) {
                        z = true;
                    }
                    sharedDocumentCell.setDocument(messageObject, z);
                    sharedDocumentCell.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
                        @Override
                        public boolean onPreDraw() {
                            sharedDocumentCell.getViewTreeObserver().removeOnPreDrawListener(this);
                            if (FilteredSearchView.this.uiCallback.actionModeShowing()) {
                                FilteredSearchView.this.messageHashIdTmp.set(messageObject.getId(), messageObject.getDialogId());
                                sharedDocumentCell.setChecked(FilteredSearchView.this.uiCallback.isSelected(FilteredSearchView.this.messageHashIdTmp), z2);
                                return true;
                            }
                            sharedDocumentCell.setChecked(false, z2);
                            return true;
                        }
                    });
                } else if (itemViewType != 3) {
                } else {
                    if (i != 0) {
                        i2--;
                    }
                    final SharedAudioCell sharedAudioCell = (SharedAudioCell) viewHolder.itemView;
                    final MessageObject messageObject2 = arrayList.get(i2);
                    final boolean z3 = sharedAudioCell.getMessage() != null && sharedAudioCell.getMessage().getId() == messageObject2.getId();
                    if (i2 != arrayList.size() - 1 || (i == FilteredSearchView.this.sections.size() - 1 && FilteredSearchView.this.isLoading)) {
                        z = true;
                    }
                    sharedAudioCell.setMessageObject(messageObject2, z);
                    sharedAudioCell.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
                        @Override
                        public boolean onPreDraw() {
                            sharedAudioCell.getViewTreeObserver().removeOnPreDrawListener(this);
                            if (FilteredSearchView.this.uiCallback.actionModeShowing()) {
                                FilteredSearchView.this.messageHashIdTmp.set(messageObject2.getId(), messageObject2.getDialogId());
                                sharedAudioCell.setChecked(FilteredSearchView.this.uiCallback.isSelected(FilteredSearchView.this.messageHashIdTmp), z3);
                                return true;
                            }
                            sharedAudioCell.setChecked(false, z3);
                            return true;
                        }
                    });
                }
            }
        }

        @Override
        public int getItemViewType(int i, int i2) {
            if (i < FilteredSearchView.this.sections.size()) {
                if (i == 0 || i2 != 0) {
                    int i3 = this.currentType;
                    return (i3 == 2 || i3 == 4) ? 3 : 1;
                }
                return 0;
            }
            return 2;
        }

        @Override
        public void getPositionForScrollProgress(RecyclerListView recyclerListView, float f, int[] iArr) {
            iArr[0] = 0;
            iArr[1] = 0;
        }
    }

    public void openUrl(String str) {
        if (AndroidUtilities.shouldShowUrlInAlert(str)) {
            AlertsCreator.showOpenUrlAlert(this.parentFragment, str, true, true);
        } else {
            Browser.openUrl(this.parentActivity, str);
        }
    }

    public void openWebView(TLRPC$WebPage tLRPC$WebPage, MessageObject messageObject) {
        EmbedBottomSheet.show(this.parentFragment, messageObject, this.provider, tLRPC$WebPage.site_name, tLRPC$WebPage.description, tLRPC$WebPage.url, tLRPC$WebPage.embed_url, tLRPC$WebPage.embed_width, tLRPC$WebPage.embed_height, false);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i = UserConfig.selectedAccount;
        this.lastAccount = i;
        NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.lastAccount).removeObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.emojiLoaded) {
            int childCount = this.recyclerListView.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                if (this.recyclerListView.getChildAt(i3) instanceof DialogCell) {
                    ((DialogCell) this.recyclerListView.getChildAt(i3)).update(0);
                }
                this.recyclerListView.getChildAt(i3).invalidate();
            }
        }
    }

    public boolean onItemLongClick(MessageObject messageObject, View view, int i) {
        if (!this.uiCallback.actionModeShowing()) {
            this.uiCallback.showActionMode();
        }
        if (this.uiCallback.actionModeShowing()) {
            this.uiCallback.toggleItemSelection(messageObject, view, i);
            return true;
        }
        return true;
    }

    public static class MessageHashId {
        public long dialogId;
        public int messageId;

        public MessageHashId(int i, long j) {
            this.dialogId = j;
            this.messageId = i;
        }

        public void set(int i, long j) {
            this.dialogId = j;
            this.messageId = i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || MessageHashId.class != obj.getClass()) {
                return false;
            }
            MessageHashId messageHashId = (MessageHashId) obj;
            return this.dialogId == messageHashId.dialogId && this.messageId == messageHashId.messageId;
        }

        public int hashCode() {
            return this.messageId;
        }
    }

    public class OnlyUserFiltersAdapter extends RecyclerListView.SelectionAdapter {
        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return true;
        }

        OnlyUserFiltersAdapter() {
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            DialogCell dialogCell;
            if (i == 0) {
                dialogCell = new DialogCell(this, null, viewGroup.getContext(), true, true) {
                    @Override
                    public boolean isForumCell() {
                        return false;
                    }
                };
            } else if (i == 3) {
                FlickerLoadingView flickerLoadingView = new FlickerLoadingView(viewGroup.getContext());
                flickerLoadingView.setIsSingleCell(true);
                flickerLoadingView.setViewType(1);
                dialogCell = flickerLoadingView;
            } else {
                GraySectionCell graySectionCell = new GraySectionCell(viewGroup.getContext());
                graySectionCell.setText(LocaleController.getString("SearchMessages", C1072R.string.SearchMessages));
                dialogCell = graySectionCell;
            }
            dialogCell.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            return new RecyclerListView.Holder(dialogCell);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            if (viewHolder.getItemViewType() == 0) {
                final DialogCell dialogCell = (DialogCell) viewHolder.itemView;
                final MessageObject messageObject = FilteredSearchView.this.messages.get(i);
                dialogCell.useFromUserAsAvatar = FilteredSearchView.this.useFromUserAsAvatar;
                dialogCell.setDialog(messageObject.getDialogId(), messageObject, messageObject.messageOwner.date, false, false);
                final boolean z = true;
                dialogCell.useSeparator = i != getItemCount() - 1;
                z = (dialogCell.getMessage() == null || dialogCell.getMessage().getId() != messageObject.getId()) ? false : false;
                dialogCell.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
                    @Override
                    public boolean onPreDraw() {
                        dialogCell.getViewTreeObserver().removeOnPreDrawListener(this);
                        if (FilteredSearchView.this.uiCallback.actionModeShowing()) {
                            FilteredSearchView.this.messageHashIdTmp.set(messageObject.getId(), messageObject.getDialogId());
                            dialogCell.setChecked(FilteredSearchView.this.uiCallback.isSelected(FilteredSearchView.this.messageHashIdTmp), z);
                            return true;
                        }
                        dialogCell.setChecked(false, z);
                        return true;
                    }
                });
            }
        }

        @Override
        public int getItemViewType(int i) {
            return i >= FilteredSearchView.this.messages.size() ? 3 : 0;
        }

        @Override
        public int getItemCount() {
            if (FilteredSearchView.this.messages.isEmpty()) {
                return 0;
            }
            return FilteredSearchView.this.messages.size() + (!FilteredSearchView.this.endReached ? 1 : 0);
        }
    }

    @Override
    protected void onMeasure(int i, int i2) {
        RecyclerView.Adapter adapter;
        int i3 = this.columnsCount;
        if (AndroidUtilities.isTablet()) {
            this.columnsCount = 3;
        } else if (getResources().getConfiguration().orientation == 2) {
            this.columnsCount = 6;
        } else {
            this.columnsCount = 3;
        }
        if (i3 != this.columnsCount && (adapter = this.adapter) == this.sharedPhotoVideoAdapter) {
            this.ignoreRequestLayout = true;
            adapter.notifyDataSetChanged();
            this.ignoreRequestLayout = false;
        }
        super.onMeasure(i, i2);
    }

    @Override
    public void requestLayout() {
        if (this.ignoreRequestLayout) {
            return;
        }
        super.requestLayout();
    }

    public void setDelegate(Delegate delegate, boolean z) {
        this.delegate = delegate;
        if (!z || delegate == null || this.localTipChats.isEmpty()) {
            return;
        }
        delegate.updateFiltersView(false, this.localTipChats, this.localTipDates, this.localTipArchive);
    }

    public void setUiCallback(UiCallback uiCallback) {
        this.uiCallback = uiCallback;
    }

    public void showFloatingDateView() {
        AndroidUtilities.cancelRunOnUIThread(this.hideFloatingDateRunnable);
        AndroidUtilities.runOnUIThread(this.hideFloatingDateRunnable, 650L);
        if (this.floatingDateView.getTag() != null) {
            return;
        }
        AnimatorSet animatorSet = this.floatingDateAnimation;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.floatingDateView.setTag(1);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.floatingDateAnimation = animatorSet2;
        animatorSet2.setDuration(180L);
        this.floatingDateAnimation.playTogether(ObjectAnimator.ofFloat(this.floatingDateView, View.ALPHA, 1.0f), ObjectAnimator.ofFloat(this.floatingDateView, View.TRANSLATION_Y, 0.0f));
        this.floatingDateAnimation.setInterpolator(CubicBezierInterpolator.EASE_OUT);
        this.floatingDateAnimation.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                FilteredSearchView.this.floatingDateAnimation = null;
            }
        });
        this.floatingDateAnimation.start();
    }

    private void hideFloatingDateView(boolean z) {
        AndroidUtilities.cancelRunOnUIThread(this.hideFloatingDateRunnable);
        if (this.floatingDateView.getTag() == null) {
            return;
        }
        this.floatingDateView.setTag(null);
        AnimatorSet animatorSet = this.floatingDateAnimation;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.floatingDateAnimation = null;
        }
        if (z) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.floatingDateAnimation = animatorSet2;
            animatorSet2.setDuration(180L);
            this.floatingDateAnimation.playTogether(ObjectAnimator.ofFloat(this.floatingDateView, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.floatingDateView, View.TRANSLATION_Y, -AndroidUtilities.m36dp(48.0f)));
            this.floatingDateAnimation.setInterpolator(CubicBezierInterpolator.EASE_OUT);
            this.floatingDateAnimation.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    FilteredSearchView.this.floatingDateAnimation = null;
                }
            });
            this.floatingDateAnimation.start();
            return;
        }
        this.floatingDateView.setAlpha(0.0f);
    }

    public void setChatPreviewDelegate(SearchViewPager.ChatPreviewDelegate chatPreviewDelegate) {
        this.chatPreviewDelegate = chatPreviewDelegate;
    }

    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
        arrayList.add(new ThemeDescription(this, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, "windowBackgroundWhite"));
        arrayList.add(new ThemeDescription(this, 0, null, null, null, null, "dialogBackground"));
        arrayList.add(new ThemeDescription(this, 0, null, null, null, null, "windowBackgroundGray"));
        arrayList.add(new ThemeDescription(this.recyclerListView, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{SharedDocumentCell.class}, new String[]{"nameTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteBlackText"));
        arrayList.add(new ThemeDescription(this.recyclerListView, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{SharedDocumentCell.class}, new String[]{"dateTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteGrayText3"));
        arrayList.add(new ThemeDescription(this.recyclerListView, ThemeDescription.FLAG_PROGRESSBAR, new Class[]{SharedDocumentCell.class}, new String[]{"progressView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "sharedMedia_startStopLoadIcon"));
        arrayList.add(new ThemeDescription(this.recyclerListView, ThemeDescription.FLAG_IMAGECOLOR, new Class[]{SharedDocumentCell.class}, new String[]{"statusImageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "sharedMedia_startStopLoadIcon"));
        arrayList.add(new ThemeDescription(this.recyclerListView, ThemeDescription.FLAG_CHECKBOX, new Class[]{SharedDocumentCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "checkbox"));
        arrayList.add(new ThemeDescription(this.recyclerListView, ThemeDescription.FLAG_CHECKBOXCHECK, new Class[]{SharedDocumentCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "checkboxCheck"));
        arrayList.add(new ThemeDescription(this.recyclerListView, ThemeDescription.FLAG_IMAGECOLOR, new Class[]{SharedDocumentCell.class}, new String[]{"thumbImageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "files_folderIcon"));
        arrayList.add(new ThemeDescription(this.recyclerListView, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{SharedDocumentCell.class}, new String[]{"extTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "files_iconText"));
        arrayList.add(new ThemeDescription(this.recyclerListView, 0, new Class[]{LoadingCell.class}, new String[]{"progressBar"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "progressCircle"));
        arrayList.add(new ThemeDescription(this.recyclerListView, ThemeDescription.FLAG_CHECKBOX, new Class[]{SharedAudioCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "checkbox"));
        arrayList.add(new ThemeDescription(this.recyclerListView, ThemeDescription.FLAG_CHECKBOXCHECK, new Class[]{SharedAudioCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "checkboxCheck"));
        arrayList.add(new ThemeDescription(this.recyclerListView, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{SharedAudioCell.class}, Theme.chat_contextResult_titleTextPaint, null, null, "windowBackgroundWhiteBlackText"));
        arrayList.add(new ThemeDescription(this.recyclerListView, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{SharedAudioCell.class}, Theme.chat_contextResult_descriptionTextPaint, null, null, "windowBackgroundWhiteGrayText2"));
        arrayList.add(new ThemeDescription(this.recyclerListView, ThemeDescription.FLAG_CHECKBOX, new Class[]{SharedLinkCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "checkbox"));
        arrayList.add(new ThemeDescription(this.recyclerListView, ThemeDescription.FLAG_CHECKBOXCHECK, new Class[]{SharedLinkCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "checkboxCheck"));
        arrayList.add(new ThemeDescription(this.recyclerListView, 0, new Class[]{SharedLinkCell.class}, new String[]{"titleTextPaint"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteBlackText"));
        arrayList.add(new ThemeDescription(this.recyclerListView, 0, new Class[]{SharedLinkCell.class}, null, null, null, "windowBackgroundWhiteLinkText"));
        arrayList.add(new ThemeDescription(this.recyclerListView, 0, new Class[]{SharedLinkCell.class}, Theme.linkSelectionPaint, null, null, "windowBackgroundWhiteLinkSelection"));
        arrayList.add(new ThemeDescription(this.recyclerListView, 0, new Class[]{SharedLinkCell.class}, new String[]{"letterDrawable"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "sharedMedia_linkPlaceholderText"));
        arrayList.add(new ThemeDescription(this.recyclerListView, ThemeDescription.FLAG_BACKGROUNDFILTER, new Class[]{SharedLinkCell.class}, new String[]{"letterDrawable"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "sharedMedia_linkPlaceholder"));
        arrayList.add(new ThemeDescription(this.recyclerListView, ThemeDescription.FLAG_CELLBACKGROUNDCOLOR | ThemeDescription.FLAG_SECTIONS, new Class[]{SharedMediaSectionCell.class}, null, null, null, "windowBackgroundWhite"));
        arrayList.add(new ThemeDescription(this.recyclerListView, ThemeDescription.FLAG_SECTIONS, new Class[]{SharedMediaSectionCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteBlackText"));
        arrayList.add(new ThemeDescription(this.recyclerListView, 0, new Class[]{SharedMediaSectionCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteBlackText"));
        arrayList.add(new ThemeDescription(this.recyclerListView, 0, new Class[]{DialogCell.class, ProfileSearchCell.class}, null, Theme.avatarDrawables, null, "avatar_text"));
        arrayList.add(new ThemeDescription(this.recyclerListView, 0, new Class[]{DialogCell.class}, Theme.dialogs_countPaint, null, null, "chats_unreadCounter"));
        arrayList.add(new ThemeDescription(this.recyclerListView, 0, new Class[]{DialogCell.class}, Theme.dialogs_countGrayPaint, null, null, "chats_unreadCounterMuted"));
        arrayList.add(new ThemeDescription(this.recyclerListView, 0, new Class[]{DialogCell.class}, Theme.dialogs_countTextPaint, null, null, "chats_unreadCounterText"));
        arrayList.add(new ThemeDescription(this.recyclerListView, 0, new Class[]{DialogCell.class, ProfileSearchCell.class}, null, new Drawable[]{Theme.dialogs_lockDrawable}, null, "chats_secretIcon"));
        arrayList.add(new ThemeDescription(this.recyclerListView, 0, new Class[]{DialogCell.class, ProfileSearchCell.class}, null, new Drawable[]{Theme.dialogs_scamDrawable, Theme.dialogs_fakeDrawable}, null, "chats_draft"));
        arrayList.add(new ThemeDescription(this.recyclerListView, 0, new Class[]{DialogCell.class}, null, new Drawable[]{Theme.dialogs_pinnedDrawable, Theme.dialogs_reorderDrawable}, null, "chats_pinnedIcon"));
        TextPaint[] textPaintArr = Theme.dialogs_namePaint;
        arrayList.add(new ThemeDescription(this.recyclerListView, 0, new Class[]{DialogCell.class, ProfileSearchCell.class}, (String[]) null, new Paint[]{textPaintArr[0], textPaintArr[1], Theme.dialogs_searchNamePaint}, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "chats_name"));
        TextPaint[] textPaintArr2 = Theme.dialogs_nameEncryptedPaint;
        arrayList.add(new ThemeDescription(this.recyclerListView, 0, new Class[]{DialogCell.class, ProfileSearchCell.class}, (String[]) null, new Paint[]{textPaintArr2[0], textPaintArr2[1], Theme.dialogs_searchNameEncryptedPaint}, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "chats_secretName"));
        arrayList.add(new ThemeDescription(this.recyclerListView, 0, new Class[]{DialogCell.class}, Theme.dialogs_messagePaint[1], null, null, "chats_message_threeLines"));
        arrayList.add(new ThemeDescription(this.recyclerListView, 0, new Class[]{DialogCell.class}, Theme.dialogs_messagePaint[0], null, null, "chats_message"));
        arrayList.add(new ThemeDescription(this.recyclerListView, 0, new Class[]{DialogCell.class}, Theme.dialogs_messageNamePaint, null, null, "chats_nameMessage_threeLines"));
        arrayList.add(new ThemeDescription(this.recyclerListView, 0, new Class[]{DialogCell.class}, null, null, null, "chats_draft"));
        arrayList.add(new ThemeDescription(this.recyclerListView, 0, new Class[]{DialogCell.class}, (String[]) null, Theme.dialogs_messagePrintingPaint, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "chats_actionMessage"));
        arrayList.add(new ThemeDescription(this.recyclerListView, 0, new Class[]{DialogCell.class}, Theme.dialogs_timePaint, null, null, "chats_date"));
        arrayList.add(new ThemeDescription(this.recyclerListView, 0, new Class[]{DialogCell.class}, Theme.dialogs_pinnedPaint, null, null, "chats_pinnedOverlay"));
        arrayList.add(new ThemeDescription(this.recyclerListView, 0, new Class[]{DialogCell.class}, Theme.dialogs_tabletSeletedPaint, null, null, "chats_tabletSelectedOverlay"));
        arrayList.add(new ThemeDescription(this.recyclerListView, 0, new Class[]{DialogCell.class}, null, new Drawable[]{Theme.dialogs_checkDrawable}, null, "chats_sentCheck"));
        arrayList.add(new ThemeDescription(this.recyclerListView, 0, new Class[]{DialogCell.class}, null, new Drawable[]{Theme.dialogs_checkReadDrawable, Theme.dialogs_halfCheckDrawable}, null, "chats_sentReadCheck"));
        arrayList.add(new ThemeDescription(this.recyclerListView, 0, new Class[]{DialogCell.class}, null, new Drawable[]{Theme.dialogs_clockDrawable}, null, "chats_sentClock"));
        arrayList.add(new ThemeDescription(this.recyclerListView, 0, new Class[]{DialogCell.class}, Theme.dialogs_errorPaint, null, null, "chats_sentError"));
        arrayList.add(new ThemeDescription(this.recyclerListView, 0, new Class[]{DialogCell.class}, null, new Drawable[]{Theme.dialogs_errorDrawable}, null, "chats_sentErrorIcon"));
        arrayList.add(new ThemeDescription(this.recyclerListView, 0, new Class[]{DialogCell.class, ProfileSearchCell.class}, null, new Drawable[]{Theme.dialogs_verifiedCheckDrawable}, null, "chats_verifiedCheck"));
        arrayList.add(new ThemeDescription(this.recyclerListView, 0, new Class[]{DialogCell.class, ProfileSearchCell.class}, null, new Drawable[]{Theme.dialogs_verifiedDrawable}, null, "chats_verifiedBackground"));
        arrayList.add(new ThemeDescription(this.recyclerListView, 0, new Class[]{DialogCell.class}, null, new Drawable[]{Theme.dialogs_muteDrawable}, null, "chats_muteIcon"));
        arrayList.add(new ThemeDescription(this.recyclerListView, 0, new Class[]{DialogCell.class}, null, new Drawable[]{Theme.dialogs_mentionDrawable}, null, "chats_mentionIcon"));
        arrayList.add(new ThemeDescription(this.recyclerListView, 0, new Class[]{DialogCell.class}, null, null, null, "chats_archivePinBackground"));
        arrayList.add(new ThemeDescription(this.recyclerListView, 0, new Class[]{DialogCell.class}, null, null, null, "chats_archiveBackground"));
        arrayList.add(new ThemeDescription(this.recyclerListView, 0, new Class[]{DialogCell.class}, null, null, null, "chats_onlineCircle"));
        arrayList.add(new ThemeDescription(this.recyclerListView, 0, new Class[]{DialogCell.class}, null, null, null, "windowBackgroundWhite"));
        arrayList.add(new ThemeDescription(this.recyclerListView, ThemeDescription.FLAG_CHECKBOX, new Class[]{DialogCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhite"));
        arrayList.add(new ThemeDescription(this.recyclerListView, ThemeDescription.FLAG_CHECKBOXCHECK, new Class[]{DialogCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "checkboxCheck"));
        arrayList.add(new ThemeDescription(this.recyclerListView, ThemeDescription.FLAG_SECTIONS, new Class[]{GraySectionCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "key_graySectionText"));
        arrayList.add(new ThemeDescription(this.recyclerListView, ThemeDescription.FLAG_CELLBACKGROUNDCOLOR | ThemeDescription.FLAG_SECTIONS, new Class[]{GraySectionCell.class}, null, null, null, "graySection"));
        arrayList.add(new ThemeDescription(this.emptyView.title, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, "windowBackgroundWhiteBlackText"));
        arrayList.add(new ThemeDescription(this.emptyView.subtitle, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, "windowBackgroundWhiteGrayText"));
        return arrayList;
    }
}
