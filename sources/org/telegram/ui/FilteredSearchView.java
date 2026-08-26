package org.telegram.ui;

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
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Property;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda23;
import com.google.android.gms.internal.mlkit_language_id_common.zzin;
import com.google.android.gms.internal.mlkit_vision_common.zzkd;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import me.vkryl.android.animator.BoolAnimator;
import me.vkryl.android.animator.FactorAnimator;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaController$$ExternalSyntheticOutline1;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Adapters.FiltersView;
import org.telegram.ui.Business.QuickRepliesController;
import org.telegram.ui.Cells.ContextLinkCell;
import org.telegram.ui.Cells.DialogCell;
import org.telegram.ui.Cells.GraySectionCell;
import org.telegram.ui.Cells.LoadingCell;
import org.telegram.ui.Cells.ProfileSearchCell;
import org.telegram.ui.Cells.SharedAudioCell;
import org.telegram.ui.Cells.SharedDocumentCell;
import org.telegram.ui.Cells.SharedLinkCell;
import org.telegram.ui.Cells.SharedMediaSectionCell;
import org.telegram.ui.Cells.SharedPhotoVideoCell;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EmbedBottomSheet;
import org.telegram.ui.Components.FlickerLoadingView;
import org.telegram.ui.Components.Forum.ForumUtilities;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.SearchViewPager;
import org.telegram.ui.Components.StickerEmptyView;
import org.telegram.ui.Components.blur3.BlurredBackgroundDrawableViewFactory;
import org.telegram.ui.Components.blur3.capture.IBlur3Capture;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundProviderBuilder;
import org.telegram.ui.Stories.LivePlayer$$ExternalSyntheticLambda1;

public class FilteredSearchView extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, FactorAnimator.Target {
    private static final int ANIMATOR_ID_FLOATING_DATE_VISIBLE = 0;
    private static SpannableStringBuilder[] arrowSpan = new SpannableStringBuilder[3];
    RecyclerView.Adapter adapter;
    private final BoolAnimator animatorFloatingDataVisible;
    BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableFactory;
    private SearchViewPager.ChatPreviewDelegate chatPreviewDelegate;
    Runnable clearCurrentResultsRunnable;
    private int columnsCount;
    private String currentDataQuery;
    boolean currentIncludeFolder;
    long currentSearchCommunityId;
    long currentSearchDialogId;
    FiltersView.MediaFilterData currentSearchFilter;
    long currentSearchMaxDate;
    long currentSearchMinDate;
    String currentSearchString;
    private Delegate delegate;
    private OnlyUserFiltersAdapter dialogsAdapter;
    StickerEmptyView emptyView;
    private boolean endReached;
    private boolean firstLoading;
    private final FloatingDateView floatingDateView;
    private final Runnable hideFloatingDateRunnable;
    public IBlur3Capture iBlur3Capture;
    boolean ignoreRequestLayout;
    private boolean isLoading;
    public int keyboardHeight;
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
    private AnimationNotificationsLocker notificationsLocker;
    Activity parentActivity;
    BaseFragment parentFragment;
    private int photoViewerClassGuid;
    private PhotoViewer.PhotoViewerProvider provider;
    public final RecyclerListView recyclerListView;
    private int requestIndex;
    private int searchIndex;
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

    public class AnonymousClass6 extends RecyclerView.OnScrollListener {
        public AnonymousClass6() {
        }

        public void lambda$onScrolled$0() {
            FilteredSearchView filteredSearchView = FilteredSearchView.this;
            filteredSearchView.search(filteredSearchView.currentSearchDialogId, filteredSearchView.currentSearchCommunityId, filteredSearchView.currentSearchMinDate, filteredSearchView.currentSearchMaxDate, filteredSearchView.currentSearchFilter, filteredSearchView.currentIncludeFolder, filteredSearchView.lastMessagesSearchString, false);
        }

        @Override
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            if (i == 1) {
                AndroidUtilities.hideKeyboard(FilteredSearchView.this.parentActivity.getCurrentFocus());
            }
        }

        @Override
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            if (recyclerView.getAdapter() != null) {
                FilteredSearchView filteredSearchView = FilteredSearchView.this;
                if (filteredSearchView.adapter == null) {
                    return;
                }
                int iFindFirstVisibleItemPosition = filteredSearchView.layoutManager.findFirstVisibleItemPosition();
                int iFindLastVisibleItemPosition = FilteredSearchView.this.layoutManager.findLastVisibleItemPosition();
                int iAbs = Math.abs(iFindLastVisibleItemPosition - iFindFirstVisibleItemPosition) + 1;
                int itemCount = recyclerView.getAdapter().getItemCount();
                if (!FilteredSearchView.this.isLoading && iAbs > 0 && iFindLastVisibleItemPosition >= itemCount - 10 && !FilteredSearchView.this.endReached) {
                    AndroidUtilities.runOnUIThread(new ChatActivity$21$$ExternalSyntheticLambda4(this, 22));
                }
                FilteredSearchView filteredSearchView2 = FilteredSearchView.this;
                if (filteredSearchView2.adapter != filteredSearchView2.sharedPhotoVideoAdapter) {
                    View pinnedHeader = FilteredSearchView.this.recyclerListView.getPinnedHeader();
                    if (pinnedHeader instanceof GraySectionCell) {
                        GraySectionCell graySectionCell = (GraySectionCell) pinnedHeader;
                        CharSequence text = graySectionCell.getText();
                        if (!TextUtils.isEmpty(text) && graySectionCell.getAlpha() > 0.0f) {
                            FilteredSearchView.this.floatingDateView.setCustomText(text.toString());
                            if (i2 != 0) {
                                FilteredSearchView.this.showFloatingDateView();
                                return;
                            }
                            return;
                        }
                    }
                    FilteredSearchView.this.lambda$new$0();
                    return;
                }
                if (i2 != 0 && !FilteredSearchView.this.messages.isEmpty() && TextUtils.isEmpty(FilteredSearchView.this.currentDataQuery)) {
                    FilteredSearchView.this.showFloatingDateView();
                }
                RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(iFindFirstVisibleItemPosition);
                if (viewHolderFindViewHolderForAdapterPosition == null || viewHolderFindViewHolderForAdapterPosition.getItemViewType() != 0) {
                    return;
                }
                View view = viewHolderFindViewHolderForAdapterPosition.itemView;
                if (view instanceof SharedPhotoVideoCell) {
                    SharedPhotoVideoCell sharedPhotoVideoCell = (SharedPhotoVideoCell) view;
                    MessageObject messageObject = sharedPhotoVideoCell.itemsCount <= 0 ? null : sharedPhotoVideoCell.messageObjects[0];
                    if (messageObject != null) {
                        FilteredSearchView.this.floatingDateView.setCustomDate(messageObject.messageOwner.date);
                    }
                }
            }
        }
    }

    public interface Delegate {
        void updateFiltersView(boolean z, ArrayList<Object> arrayList, ArrayList<FiltersView.DateData> arrayList2, boolean z2);
    }

    public static class FloatingDateView extends View {
        private BlurredBackgroundDrawable bgDrawable;
        private final AnimatedTextView.AnimatedTextDrawable mDrawable;
        private String text;

        public FloatingDateView(Context context) {
            super(context);
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable(true, false, false);
            this.mDrawable = animatedTextDrawable;
            animatedTextDrawable.setTextColor(-1);
            animatedTextDrawable.setGravity(17);
            animatedTextDrawable.setTypeface(AndroidUtilities.bold());
            animatedTextDrawable.setTextSize(AndroidUtilities.dp(14.0f));
            animatedTextDrawable.setCallback(this);
        }

        @Override
        public void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            int iDpf2 = (int) (AndroidUtilities.dpf2(30.0f) + this.mDrawable.getCurrentWidth());
            int width = (getWidth() - iDpf2) / 2;
            int i = iDpf2 + width;
            BlurredBackgroundDrawable blurredBackgroundDrawable = this.bgDrawable;
            if (blurredBackgroundDrawable != null) {
                blurredBackgroundDrawable.setBounds(width, 0, i, getHeight());
                this.bgDrawable.draw(canvas);
            }
            this.mDrawable.draw(canvas);
        }

        @Override
        public void onSizeChanged(int i, int i2, int i3, int i4) {
            super.onSizeChanged(i, i2, i3, i4);
            this.mDrawable.setBounds(0, 0, i, i2);
        }

        public void setBlurredBackgroundDrawable(BlurredBackgroundDrawable blurredBackgroundDrawable) {
            this.bgDrawable = blurredBackgroundDrawable;
            blurredBackgroundDrawable.setRadius(AndroidUtilities.dp(11.5f));
            this.bgDrawable.setPadding(AndroidUtilities.dp(5.0f));
        }

        public void setCustomDate(int i) {
            setCustomText(LocaleController.formatDateChat(i));
        }

        public void setCustomText(String str) {
            if (TextUtils.equals(this.text, str)) {
                return;
            }
            this.text = str;
            this.mDrawable.setText(str, true);
        }

        public void updateColors() {
            BlurredBackgroundDrawable blurredBackgroundDrawable = this.bgDrawable;
            if (blurredBackgroundDrawable != null) {
                blurredBackgroundDrawable.updateColors();
            }
        }

        @Override
        public boolean verifyDrawable(Drawable drawable) {
            return super.verifyDrawable(drawable) || drawable == this.mDrawable;
        }
    }

    public static class MessageHashId {
        public long dialogId;
        public int messageId;

        public MessageHashId(int i, long j) {
            this.dialogId = j;
            this.messageId = i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                MessageHashId messageHashId = (MessageHashId) obj;
                if (this.dialogId == messageHashId.dialogId && this.messageId == messageHashId.messageId) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return this.messageId;
        }

        public void set(int i, long j) {
            this.dialogId = j;
            this.messageId = i;
        }
    }

    public class OnlyUserFiltersAdapter extends RecyclerListView.SelectionAdapter {
        public OnlyUserFiltersAdapter() {
        }

        @Override
        public int getItemCount() {
            if (FilteredSearchView.this.messages.isEmpty()) {
                return 0;
            }
            return FilteredSearchView.this.messages.size() + (!FilteredSearchView.this.endReached ? 1 : 0);
        }

        @Override
        public int getItemViewType(int i) {
            return i >= FilteredSearchView.this.messages.size() ? 3 : 0;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return true;
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            if (viewHolder.getItemViewType() == 0) {
                final DialogCell dialogCell = (DialogCell) viewHolder.itemView;
                final MessageObject messageObject = FilteredSearchView.this.messages.get(i);
                dialogCell.useFromUserAsAvatar = FilteredSearchView.this.useFromUserAsAvatar;
                dialogCell.setDialog(messageObject.getDialogId(), messageObject, messageObject.messageOwner.date, false, false);
                dialogCell.useSeparator = i != getItemCount() - 1;
                final boolean z = dialogCell.getMessage() != null && dialogCell.getMessage().getId() == messageObject.getId();
                dialogCell.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
                    @Override
                    public boolean onPreDraw() {
                        dialogCell.getViewTreeObserver().removeOnPreDrawListener(this);
                        if (!FilteredSearchView.this.uiCallback.actionModeShowing()) {
                            dialogCell.setChecked(false, z);
                            return true;
                        }
                        FilteredSearchView.this.messageHashIdTmp.set(messageObject.getId(), messageObject.getDialogId());
                        dialogCell.setChecked(FilteredSearchView.this.uiCallback.isSelected(FilteredSearchView.this.messageHashIdTmp), z);
                        return true;
                    }
                });
            }
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View view;
            if (i == 0) {
                view = new DialogCell(null, viewGroup.getContext(), true, true) {
                    {
                        int i2 = UserConfig.selectedAccount;
                    }

                    @Override
                    public boolean isForumCell() {
                        return false;
                    }
                };
            } else if (i != 3) {
                GraySectionCell graySectionCell = new GraySectionCell(viewGroup.getContext(), 16, null);
                graySectionCell.setText(LocaleController.getString(R.string.SearchMessages));
                view = graySectionCell;
            } else {
                FlickerLoadingView flickerLoadingView = new FlickerLoadingView(viewGroup.getContext());
                flickerLoadingView.setIsSingleCell(true);
                flickerLoadingView.setViewType(1);
                view = flickerLoadingView;
            }
            return zzkd.m(view, view, -2);
        }
    }

    public class SharedDocumentsAdapter extends RecyclerListView.SectionsAdapter {
        private int currentType;
        private Context mContext;

        public SharedDocumentsAdapter(Context context, int i) {
            this.mContext = context;
            this.currentType = i;
        }

        @Override
        public int getCountForSection(int i) {
            if (i >= FilteredSearchView.this.sections.size()) {
                return 1;
            }
            FilteredSearchView filteredSearchView = FilteredSearchView.this;
            return filteredSearchView.sectionArrays.get(filteredSearchView.sections.get(i)).size() + (i == 0 ? 0 : 1);
        }

        @Override
        public Object getItem(int i, int i2) {
            return null;
        }

        @Override
        public int getItemViewType(int i, int i2) {
            if (i >= FilteredSearchView.this.sections.size()) {
                return 2;
            }
            if (i != 0 && i2 == 0) {
                return 0;
            }
            int i3 = this.currentType;
            return (i3 == 2 || i3 == 4) ? 3 : 1;
        }

        @Override
        public String getLetter(int i) {
            return null;
        }

        @Override
        public void getPositionForScrollProgress(RecyclerListView recyclerListView, float f, int[] iArr) {
            iArr[0] = 0;
            iArr[1] = 0;
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
        public View getSectionHeaderView(int i, View view) {
            if (view == null) {
                view = new GraySectionCell(this.mContext, 16, null);
                view.setBackgroundColor(Theme.getColor(null, Theme.key_graySection, false) & (-218103809));
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
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder, int i, int i2) {
            return i == 0 || i2 != 0;
        }

        @Override
        public void onBindViewHolder(int i, int i2, RecyclerView.ViewHolder viewHolder) {
            if (viewHolder.getItemViewType() != 2) {
                ArrayList<MessageObject> arrayList = FilteredSearchView.this.sectionArrays.get(FilteredSearchView.this.sections.get(i));
                int itemViewType = viewHolder.getItemViewType();
                boolean z = false;
                if (itemViewType == 0) {
                    ((GraySectionCell) viewHolder.itemView).setText(LocaleController.formatSectionDate(arrayList.get(0).messageOwner.date));
                    return;
                }
                if (itemViewType == 1) {
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
                            if (!FilteredSearchView.this.uiCallback.actionModeShowing()) {
                                sharedDocumentCell.setChecked(false, z2);
                                return true;
                            }
                            FilteredSearchView.this.messageHashIdTmp.set(messageObject.getId(), messageObject.getDialogId());
                            sharedDocumentCell.setChecked(FilteredSearchView.this.uiCallback.isSelected(FilteredSearchView.this.messageHashIdTmp), z2);
                            return true;
                        }
                    });
                    return;
                }
                if (itemViewType != 3) {
                    return;
                }
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
                        if (!FilteredSearchView.this.uiCallback.actionModeShowing()) {
                            sharedAudioCell.setChecked(false, z3);
                            return true;
                        }
                        FilteredSearchView.this.messageHashIdTmp.set(messageObject2.getId(), messageObject2.getDialogId());
                        sharedAudioCell.setChecked(FilteredSearchView.this.uiCallback.isSelected(FilteredSearchView.this.messageHashIdTmp), z3);
                        return true;
                    }
                });
            }
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View graySectionCell;
            Theme.ResourcesProvider resourcesProvider = null;
            if (i != 0) {
                int i2 = 1;
                if (i == 1) {
                    graySectionCell = new SharedDocumentCell(this.mContext, 2, null);
                } else if (i != 2) {
                    graySectionCell = new SharedAudioCell(this.mContext, i2, resourcesProvider) {
                        @Override
                        public boolean needPlayMessage(MessageObject messageObject) {
                            if (messageObject.isVoice() || messageObject.isRoundVideo()) {
                                boolean zPlayMessage = MediaController.getInstance().playMessage(messageObject);
                                MediaController.getInstance().setVoiceMessagesPlaylist(zPlayMessage ? FilteredSearchView.this.messages : null, false);
                                return zPlayMessage;
                            }
                            if (!messageObject.isMusic()) {
                                return false;
                            }
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
                        }
                    };
                } else {
                    FlickerLoadingView flickerLoadingView = new FlickerLoadingView(this.mContext);
                    int i3 = this.currentType;
                    if (i3 == 2 || i3 == 4) {
                        flickerLoadingView.setViewType(4);
                    } else {
                        flickerLoadingView.setViewType(3);
                    }
                    flickerLoadingView.setIsSingleCell(true);
                    graySectionCell = flickerLoadingView;
                }
            } else {
                graySectionCell = new GraySectionCell(this.mContext, 16, null);
            }
            return zzkd.m(graySectionCell, graySectionCell, -2);
        }
    }

    public class SharedLinksAdapter extends RecyclerListView.SectionsAdapter {
        private Context mContext;
        private final SharedLinkCell.SharedLinkCellDelegate sharedLinkCellDelegate = new AnonymousClass1();

        public class AnonymousClass1 implements SharedLinkCell.SharedLinkCellDelegate {
            public AnonymousClass1() {
            }

            public void lambda$onLinkPress$0(String str, DialogInterface dialogInterface, int i) {
                if (i == 0) {
                    FilteredSearchView.this.openUrl(str);
                    return;
                }
                if (i == 1) {
                    if (str.startsWith("mailto:")) {
                        str = str.substring(7);
                    } else if (str.startsWith("tel:")) {
                        str = str.substring(4);
                    }
                    AndroidUtilities.addToClipboard(str);
                }
            }

            @Override
            public boolean canPerformActions() {
                return !FilteredSearchView.this.uiCallback.actionModeShowing();
            }

            @Override
            public void needOpenWebView(TLRPC.WebPage webPage, MessageObject messageObject) {
                FilteredSearchView.this.openWebView(webPage, messageObject);
            }

            @Override
            public void onLinkPress(String str, boolean z) {
                int i = 2;
                if (!z) {
                    FilteredSearchView.this.openUrl(str);
                    return;
                }
                BottomSheet bottomSheet = new BottomSheet(FilteredSearchView.this.parentActivity, false, false, null);
                bottomSheet.fixNavigationBar();
                bottomSheet.title = str;
                bottomSheet.bigTitle = false;
                CharSequence[] charSequenceArr = {LocaleController.getString(R.string.Open), LocaleController.getString(R.string.Copy)};
                ArticleViewer$$ExternalSyntheticLambda1 articleViewer$$ExternalSyntheticLambda1 = new ArticleViewer$$ExternalSyntheticLambda1(i, this, str);
                bottomSheet.items = charSequenceArr;
                bottomSheet.onClickListener = articleViewer$$ExternalSyntheticLambda1;
                FilteredSearchView.this.parentFragment.showDialog(bottomSheet);
            }
        }

        public SharedLinksAdapter(Context context) {
            this.mContext = context;
        }

        @Override
        public int getCountForSection(int i) {
            if (i >= FilteredSearchView.this.sections.size()) {
                return 1;
            }
            FilteredSearchView filteredSearchView = FilteredSearchView.this;
            return filteredSearchView.sectionArrays.get(filteredSearchView.sections.get(i)).size() + (i == 0 ? 0 : 1);
        }

        @Override
        public Object getItem(int i, int i2) {
            return null;
        }

        @Override
        public int getItemViewType(int i, int i2) {
            if (i < FilteredSearchView.this.sections.size()) {
                return (i == 0 || i2 != 0) ? 1 : 0;
            }
            return 2;
        }

        @Override
        public String getLetter(int i) {
            return null;
        }

        @Override
        public void getPositionForScrollProgress(RecyclerListView recyclerListView, float f, int[] iArr) {
            iArr[0] = 0;
            iArr[1] = 0;
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
        public View getSectionHeaderView(int i, View view) {
            if (view == null) {
                view = new GraySectionCell(this.mContext, 16, null);
                view.setBackgroundColor(Theme.getColor(null, Theme.key_graySection, false) & (-218103809));
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
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder, int i, int i2) {
            return true;
        }

        @Override
        public void onBindViewHolder(int i, int i2, RecyclerView.ViewHolder viewHolder) {
            if (viewHolder.getItemViewType() != 2) {
                ArrayList<MessageObject> arrayList = FilteredSearchView.this.sectionArrays.get(FilteredSearchView.this.sections.get(i));
                int itemViewType = viewHolder.getItemViewType();
                boolean z = false;
                if (itemViewType == 0) {
                    ((GraySectionCell) viewHolder.itemView).setText(LocaleController.formatSectionDate(arrayList.get(0).messageOwner.date));
                    return;
                }
                if (itemViewType != 1) {
                    return;
                }
                if (i != 0) {
                    i2--;
                }
                final SharedLinkCell sharedLinkCell = (SharedLinkCell) viewHolder.itemView;
                final MessageObject messageObject = arrayList.get(i2);
                final boolean z2 = sharedLinkCell.getMessage() != null && sharedLinkCell.getMessage().getId() == messageObject.getId();
                if (i2 != arrayList.size() - 1 || (i == FilteredSearchView.this.sections.size() - 1 && FilteredSearchView.this.isLoading)) {
                    z = true;
                }
                sharedLinkCell.needDivider = z;
                sharedLinkCell.resetPressedLink();
                sharedLinkCell.message = messageObject;
                sharedLinkCell.requestLayout();
                sharedLinkCell.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
                    @Override
                    public boolean onPreDraw() {
                        sharedLinkCell.getViewTreeObserver().removeOnPreDrawListener(this);
                        if (!FilteredSearchView.this.uiCallback.actionModeShowing()) {
                            sharedLinkCell.setChecked(false, z2);
                            return true;
                        }
                        FilteredSearchView.this.messageHashIdTmp.set(messageObject.getId(), messageObject.getDialogId());
                        sharedLinkCell.setChecked(FilteredSearchView.this.uiCallback.isSelected(FilteredSearchView.this.messageHashIdTmp), z2);
                        return true;
                    }
                });
            }
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View graySectionCell;
            View view;
            if (i != 0) {
                if (i != 1) {
                    FlickerLoadingView flickerLoadingView = new FlickerLoadingView(this.mContext);
                    flickerLoadingView.setViewType(5);
                    flickerLoadingView.setIsSingleCell(true);
                    view = flickerLoadingView;
                } else {
                    SharedLinkCell sharedLinkCell = new SharedLinkCell(this.mContext, 1, null);
                    sharedLinkCell.setDelegate(this.sharedLinkCellDelegate);
                    graySectionCell = sharedLinkCell;
                }
                return zzkd.m(view, view, -2);
            }
            graySectionCell = new GraySectionCell(this.mContext, 16, null);
            view = graySectionCell;
            return zzkd.m(view, view, -2);
        }
    }

    public class SharedPhotoVideoAdapter extends RecyclerListView.SelectionAdapter {
        private Context mContext;

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
        public int getItemViewType(int i) {
            return i < ((int) Math.ceil((double) (((float) FilteredSearchView.this.messages.size()) / ((float) FilteredSearchView.this.columnsCount)))) ? 0 : 1;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return false;
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            if (viewHolder.getItemViewType() != 0) {
                if (viewHolder.getItemViewType() != 3) {
                    if (viewHolder.getItemViewType() == 1) {
                        ((FlickerLoadingView) viewHolder.itemView).skipDrawItemsCount(FilteredSearchView.this.columnsCount - ((FilteredSearchView.this.columnsCount * ((int) Math.ceil(FilteredSearchView.this.messages.size() / FilteredSearchView.this.columnsCount))) - FilteredSearchView.this.messages.size()));
                        return;
                    }
                    return;
                }
                DialogCell dialogCell = (DialogCell) viewHolder.itemView;
                dialogCell.useSeparator = i != getItemCount() - 1;
                MessageObject messageObject = FilteredSearchView.this.messages.get(i);
                boolean z = dialogCell.getMessage() != null && dialogCell.getMessage().getId() == messageObject.getId();
                dialogCell.useFromUserAsAvatar = FilteredSearchView.this.useFromUserAsAvatar;
                dialogCell.setDialog(messageObject.getDialogId(), messageObject, messageObject.messageOwner.date, false, false);
                if (!FilteredSearchView.this.uiCallback.actionModeShowing()) {
                    dialogCell.setChecked(false, z);
                    return;
                } else {
                    FilteredSearchView.this.messageHashIdTmp.set(messageObject.getId(), messageObject.getDialogId());
                    dialogCell.setChecked(FilteredSearchView.this.uiCallback.isSelected(FilteredSearchView.this.messageHashIdTmp), z);
                    return;
                }
            }
            FilteredSearchView filteredSearchView = FilteredSearchView.this;
            ArrayList<MessageObject> arrayList = filteredSearchView.messages;
            SharedPhotoVideoCell sharedPhotoVideoCell = (SharedPhotoVideoCell) viewHolder.itemView;
            sharedPhotoVideoCell.setItemsCount(filteredSearchView.columnsCount);
            sharedPhotoVideoCell.setIsFirst(i == 0);
            for (int i2 = 0; i2 < FilteredSearchView.this.columnsCount; i2++) {
                int i3 = (FilteredSearchView.this.columnsCount * i) + i2;
                int size = arrayList.size();
                int[] iArr = sharedPhotoVideoCell.indeces;
                MessageObject[] messageObjectArr = sharedPhotoVideoCell.messageObjects;
                SharedPhotoVideoCell.PhotoVideoView[] photoVideoViewArr = sharedPhotoVideoCell.photoVideoViews;
                if (i3 < size) {
                    MessageObject messageObject2 = arrayList.get(i3);
                    int iIndexOf = FilteredSearchView.this.messages.indexOf(messageObject2);
                    messageObjectArr[i2] = messageObject2;
                    iArr[i2] = iIndexOf;
                    if (messageObject2 != null) {
                        photoVideoViewArr[i2].setVisibility(0);
                        photoVideoViewArr[i2].setMessageObject(messageObject2);
                    } else {
                        photoVideoViewArr[i2].clearAnimation();
                        photoVideoViewArr[i2].setVisibility(4);
                        messageObjectArr[i2] = null;
                    }
                    if (FilteredSearchView.this.uiCallback.actionModeShowing()) {
                        FilteredSearchView.this.messageHashIdTmp.set(messageObject2.getId(), messageObject2.getDialogId());
                        photoVideoViewArr[i2].setChecked(FilteredSearchView.this.uiCallback.isSelected(FilteredSearchView.this.messageHashIdTmp));
                    } else {
                        photoVideoViewArr[i2].setChecked(false);
                    }
                } else {
                    messageObjectArr[i2] = null;
                    iArr[i2] = i3;
                    photoVideoViewArr[i2].clearAnimation();
                    photoVideoViewArr[i2].setVisibility(4);
                    messageObjectArr[i2] = null;
                }
            }
            sharedPhotoVideoCell.requestLayout();
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View view;
            if (i == 0) {
                SharedPhotoVideoCell sharedPhotoVideoCell = new SharedPhotoVideoCell(this.mContext);
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
                view = sharedPhotoVideoCell;
            } else if (i != 2) {
                FlickerLoadingView flickerLoadingView = new FlickerLoadingView(this.mContext) {
                    @Override
                    public int getColumnsCount() {
                        return FilteredSearchView.this.columnsCount;
                    }
                };
                flickerLoadingView.setIsSingleCell(true);
                flickerLoadingView.setViewType(2);
                view = flickerLoadingView;
            } else {
                GraySectionCell graySectionCell = new GraySectionCell(this.mContext, 16, null);
                graySectionCell.setBackgroundColor(Theme.getColor(null, Theme.key_graySection, false) & (-218103809));
                view = graySectionCell;
            }
            return zzkd.m(view, view, -2);
        }
    }

    public interface UiCallback {
        boolean actionModeShowing();

        int getFolderId();

        void goToMessage(MessageObject messageObject);

        boolean isSelected(MessageHashId messageHashId);

        void showActionMode();

        void toggleItemSelection(MessageObject messageObject, View view, int i);
    }

    public FilteredSearchView(BaseFragment baseFragment) {
        super(baseFragment.getParentActivity());
        this.animatorFloatingDataVisible = new BoolAnimator(0, this, CubicBezierInterpolator.EASE_OUT_QUINT, 380L, false);
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
            public PhotoViewer.PlaceProviderObject getPlaceForPhoto(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i, boolean z, boolean z2) {
                ImageReceiver photoImage;
                View pinnedHeader;
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
                        int i3 = 0;
                        while (i3 < 6) {
                            MessageObject messageObject2 = i3 >= sharedPhotoVideoCell.itemsCount ? null : sharedPhotoVideoCell.messageObjects[i3];
                            if (messageObject2 == null) {
                                break;
                            }
                            if (messageObject2.getId() == messageObject.getId()) {
                                BackupImageView backupImageView = i3 >= sharedPhotoVideoCell.itemsCount ? null : sharedPhotoVideoCell.photoVideoViews[i3].imageView;
                                ImageReceiver imageReceiver = backupImageView.getImageReceiver();
                                backupImageView.getLocationInWindow(iArr);
                                photoImage = imageReceiver;
                            }
                            i3++;
                        }
                    } else if (childAt instanceof SharedDocumentCell) {
                        SharedDocumentCell sharedDocumentCell = (SharedDocumentCell) childAt;
                        if (sharedDocumentCell.getMessage().getId() == messageObject.getId()) {
                            BackupImageView imageView = sharedDocumentCell.getImageView();
                            photoImage = imageView.getImageReceiver();
                            imageView.getLocationInWindow(iArr);
                        } else {
                            photoImage = null;
                        }
                    } else if (childAt instanceof ContextLinkCell) {
                        ContextLinkCell contextLinkCell = (ContextLinkCell) childAt;
                        MessageObject messageObject3 = (MessageObject) contextLinkCell.getParentObject();
                        if (messageObject3 == null || messageObject3.getId() != messageObject.getId()) {
                            photoImage = null;
                        } else {
                            photoImage = contextLinkCell.getPhotoImage();
                            contextLinkCell.getLocationInWindow(iArr);
                        }
                    } else {
                        photoImage = null;
                    }
                    if (photoImage != null) {
                        PhotoViewer.PlaceProviderObject placeProviderObject = new PhotoViewer.PlaceProviderObject();
                        placeProviderObject.viewX = iArr[0];
                        placeProviderObject.viewY = iArr[1];
                        placeProviderObject.parentView = recyclerListView;
                        recyclerListView.getLocationInWindow(iArr);
                        placeProviderObject.animatingImageViewYOffset = -iArr[1];
                        placeProviderObject.imageReceiver = photoImage;
                        placeProviderObject.allowTakeAnimation = false;
                        placeProviderObject.radius = photoImage.getRoundRadius(true);
                        placeProviderObject.thumb = placeProviderObject.imageReceiver.getBitmapSafe();
                        placeProviderObject.parentView.getLocationInWindow(iArr);
                        placeProviderObject.clipTopAddition = 0;
                        if (PhotoViewer.isShowingImage(messageObject) && (pinnedHeader = recyclerListView.getPinnedHeader()) != null) {
                            int iDp = (childAt instanceof SharedDocumentCell ? AndroidUtilities.dp(8.0f) : 0) - placeProviderObject.viewY;
                            if (iDp > childAt.getHeight()) {
                                recyclerListView.scrollBy(0, -(pinnedHeader.getHeight() + iDp));
                                return placeProviderObject;
                            }
                            int height = placeProviderObject.viewY - recyclerListView.getHeight();
                            if (childAt instanceof SharedDocumentCell) {
                                height -= AndroidUtilities.dp(8.0f);
                            }
                            if (height >= 0) {
                                recyclerListView.scrollBy(0, childAt.getHeight() + height);
                            }
                        }
                        return placeProviderObject;
                    }
                }
                return null;
            }

            @Override
            public CharSequence getSubtitleFor(int i) {
                return LocaleController.formatDateAudio(FilteredSearchView.this.messages.get(i).messageOwner.date, false);
            }

            @Override
            public CharSequence getTitleFor(int i) {
                return FilteredSearchView.createFromInfoString(FilteredSearchView.this.messages.get(i), 0);
            }

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
                filteredSearchView.search(filteredSearchView.currentSearchDialogId, filteredSearchView.currentSearchCommunityId, filteredSearchView.currentSearchMinDate, filteredSearchView.currentSearchMaxDate, filteredSearchView.currentSearchFilter, filteredSearchView.currentIncludeFolder, filteredSearchView.lastMessagesSearchString, false);
                return true;
            }
        };
        this.firstLoading = true;
        this.notificationsLocker = new AnimationNotificationsLocker();
        this.hideFloatingDateRunnable = new IntroActivity$$ExternalSyntheticLambda5(this, 24);
        this.parentFragment = baseFragment;
        Activity parentActivity = baseFragment.getParentActivity();
        this.parentActivity = parentActivity;
        setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
        RecyclerListView recyclerListView = new RecyclerListView(parentActivity) {
            @Override
            public void dispatchDraw(Canvas canvas) {
                if (getAdapter() == FilteredSearchView.this.sharedPhotoVideoAdapter) {
                    for (int i = 0; i < getChildCount(); i++) {
                        if (getChildViewHolder(getChildAt(i)).getItemViewType() == 1) {
                            canvas.save();
                            canvas.translate(getChildAt(i).getX(), (getChildAt(i).getY() - getChildAt(i).getMeasuredHeight()) + AndroidUtilities.dp(2.0f));
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
        this.recyclerListView = recyclerListView;
        recyclerListView.setOnItemClickListener(new PhotoViewer$$ExternalSyntheticLambda100(this, 17));
        recyclerListView.setOnItemLongClickListener(new RecyclerListView.OnItemLongClickListenerExtended() {
            @Override
            public boolean mo2353onItemClick(View view, int i, float f, float f2) {
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
            public void onLongClickRelease() {
                FilteredSearchView.this.chatPreviewDelegate.finish();
            }

            @Override
            public void onMove(float f, float f2) {
                FilteredSearchView.this.chatPreviewDelegate.move(f2);
            }
        });
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1, false);
        this.layoutManager = linearLayoutManager;
        recyclerListView.setLayoutManager(linearLayoutManager);
        FlickerLoadingView flickerLoadingView = new FlickerLoadingView(parentActivity) {
            @Override
            public int getColumnsCount() {
                return FilteredSearchView.this.columnsCount;
            }
        };
        this.loadingView = flickerLoadingView;
        addView(flickerLoadingView);
        addView(recyclerListView);
        recyclerListView.setSectionsType(2);
        recyclerListView.setSkipDrawSection(true);
        recyclerListView.setOnScrollListener(new AnonymousClass6());
        FloatingDateView floatingDateView = new FloatingDateView(parentActivity);
        this.floatingDateView = floatingDateView;
        floatingDateView.setCustomDate((int) (System.currentTimeMillis() / 1000));
        addView(floatingDateView, LayoutHelper.createFrame(-1, 33.0f, 49, 0.0f, -2.0f, 0.0f, 0.0f));
        this.dialogsAdapter = new OnlyUserFiltersAdapter();
        this.sharedPhotoVideoAdapter = new SharedPhotoVideoAdapter(getContext());
        this.sharedDocumentsAdapter = new SharedDocumentsAdapter(getContext(), 1);
        this.sharedLinksAdapter = new SharedLinksAdapter(getContext());
        this.sharedAudioAdapter = new SharedDocumentsAdapter(getContext(), 4);
        this.sharedVoiceAdapter = new SharedDocumentsAdapter(getContext(), 2);
        StickerEmptyView stickerEmptyView = new StickerEmptyView(parentActivity, flickerLoadingView, 1);
        this.emptyView = stickerEmptyView;
        addView(stickerEmptyView);
        recyclerListView.setEmptyView(this.emptyView);
        this.emptyView.setVisibility(8);
        checkUi_floatingDateView();
    }

    private void checkUi_floatingDateView() {
        float f = this.animatorFloatingDataVisible.floatValue;
        this.floatingDateView.setTranslationY((1.0f - f) * (-AndroidUtilities.dp(24.0f)));
        this.floatingDateView.setAlpha(f);
        this.floatingDateView.setVisibility(f > 0.0f ? 0 : 4);
    }

    public static CharSequence createFromInfoString(MessageObject messageObject, int i) {
        return createFromInfoString(messageObject, true, i);
    }

    public void lambda$new$0() {
        AndroidUtilities.cancelRunOnUIThread(this.hideFloatingDateRunnable);
        this.animatorFloatingDataVisible.setValue(false, true);
    }

    public void lambda$getThemeDescriptions$5() {
        FloatingDateView floatingDateView = this.floatingDateView;
        if (floatingDateView != null) {
            floatingDateView.updateColors();
        }
    }

    public void lambda$new$1(View view, int i) {
        if (view instanceof SharedDocumentCell) {
            onItemClick(i, view, ((SharedDocumentCell) view).getMessage(), 0);
            return;
        }
        if (view instanceof SharedLinkCell) {
            onItemClick(i, view, ((SharedLinkCell) view).getMessage(), 0);
            return;
        }
        if (view instanceof SharedAudioCell) {
            onItemClick(i, view, ((SharedAudioCell) view).getMessage(), 0);
        } else if (view instanceof ContextLinkCell) {
            onItemClick(i, view, ((ContextLinkCell) view).getMessageObject(), 0);
        } else if (view instanceof DialogCell) {
            onItemClick(i, view, ((DialogCell) view).getMessage(), 0);
        }
    }

    public void lambda$search$2(int i, TLRPC.TL_error tL_error, TLRPC.messages_Messages messages_messages, int i2, boolean z, String str, ArrayList arrayList, FiltersView.MediaFilterData mediaFilterData, long j, long j2, ArrayList arrayList2, ArrayList arrayList3) {
        String string;
        if (i != this.requestIndex) {
            return;
        }
        this.isLoading = false;
        if (tL_error != null) {
            this.emptyView.title.setText(LocaleController.getString(R.string.SearchEmptyViewTitle2));
            this.emptyView.subtitle.setVisibility(0);
            this.emptyView.subtitle.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
            this.emptyView.showProgress(false, true);
            return;
        }
        this.emptyView.showProgress(false);
        this.nextSearchRate = messages_messages.next_rate;
        MessagesStorage.getInstance(i2).putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
        MessagesController.getInstance(i2).putUsers(messages_messages.users, false);
        MessagesController.getInstance(i2).putChats(messages_messages.chats, false);
        if (!z) {
            this.messages.clear();
            this.messagesById.clear();
            this.sections.clear();
            this.sectionArrays.clear();
        }
        this.totalCount = messages_messages.count;
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
            if (mediaFilterData == null) {
                this.emptyView.title.setText(LocaleController.getString(R.string.SearchEmptyViewTitle2));
                this.emptyView.subtitle.setVisibility(8);
            } else if (TextUtils.isEmpty(this.currentDataQuery) && j == 0 && j2 == 0) {
                this.emptyView.title.setText(LocaleController.getString(R.string.SearchEmptyViewTitle));
                int i4 = mediaFilterData.filterType;
                if (i4 == 1) {
                    string = LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitleFiles);
                } else if (i4 == 0) {
                    string = LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitleMedia);
                } else if (i4 == 2) {
                    string = LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitleLinks);
                } else {
                    string = i4 == 3 ? LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitleMusic) : LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitleVoice);
                }
                this.emptyView.subtitle.setVisibility(0);
                this.emptyView.subtitle.setText(string);
            } else {
                this.emptyView.title.setText(LocaleController.getString(R.string.SearchEmptyViewTitle2));
                this.emptyView.subtitle.setVisibility(0);
                this.emptyView.subtitle.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
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
            if (str != null && str.length() >= 3 && (LocaleController.getString(R.string.SavedMessages).toLowerCase().startsWith(str) || "saved messages".startsWith(str))) {
                int i6 = 0;
                while (true) {
                    if (i6 >= this.localTipChats.size()) {
                        this.localTipChats.add(0, UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser());
                        break;
                    } else if ((this.localTipChats.get(i6) instanceof TLRPC.User) && UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser().id == ((TLRPC.User) this.localTipChats.get(i6)).id) {
                        break;
                    } else {
                        i6++;
                    }
                }
            }
            this.localTipDates.clear();
            this.localTipDates.addAll(arrayList3);
            this.localTipArchive = false;
            if (str != null && str.length() >= 3 && (LocaleController.getString(R.string.ArchiveSearchFilter).toLowerCase().startsWith(str) || "archive".startsWith(str))) {
                this.localTipArchive = true;
            }
            Delegate delegate = this.delegate;
            if (delegate != null) {
                delegate.updateFiltersView(TextUtils.isEmpty(this.currentDataQuery), this.localTipChats, this.localTipDates, this.localTipArchive);
            }
        }
        this.firstLoading = false;
        final View view = null;
        final int childAdapterPosition = -1;
        for (int i7 = 0; i7 < size; i7++) {
            View childAt = this.recyclerListView.getChildAt(i7);
            if (childAt instanceof FlickerLoadingView) {
                childAdapterPosition = this.recyclerListView.getChildAdapterPosition(childAt);
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
                    for (int i8 = 0; i8 < childCount; i8++) {
                        View childAt2 = FilteredSearchView.this.recyclerListView.getChildAt(i8);
                        if (view == null || FilteredSearchView.this.recyclerListView.getChildAdapterPosition(childAt2) >= childAdapterPosition) {
                            childAt2.setAlpha(0.0f);
                            int iMin = (int) ((Math.min(FilteredSearchView.this.recyclerListView.getMeasuredHeight(), Math.max(0, childAt2.getTop())) / FilteredSearchView.this.recyclerListView.getMeasuredHeight()) * 100.0f);
                            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(childAt2, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                            objectAnimatorOfFloat.setStartDelay(iMin);
                            objectAnimatorOfFloat.setDuration(200L);
                            animatorSet.playTogether(objectAnimatorOfFloat);
                        }
                    }
                    animatorSet.addListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationEnd(Animator animator) {
                            FilteredSearchView.this.notificationsLocker.unlock();
                        }
                    });
                    FilteredSearchView.this.notificationsLocker.lock();
                    animatorSet.start();
                    View view2 = view;
                    if (view2 != null && view2.getParent() == null) {
                        FilteredSearchView.this.recyclerListView.addView(view);
                        final RecyclerView.LayoutManager layoutManager = FilteredSearchView.this.recyclerListView.getLayoutManager();
                        if (layoutManager != null) {
                            layoutManager.ignoreView(view);
                            View view3 = view;
                            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view3, (Property<View, Float>) View.ALPHA, view3.getAlpha(), 0.0f);
                            objectAnimatorOfFloat2.addListener(new AnimatorListenerAdapter() {
                                @Override
                                public void onAnimationEnd(Animator animator) {
                                    view.setAlpha(1.0f);
                                    layoutManager.stopIgnoringView(view);
                                    AnonymousClass7 anonymousClass7 = AnonymousClass7.this;
                                    FilteredSearchView.this.recyclerListView.removeView(view);
                                }
                            });
                            objectAnimatorOfFloat2.start();
                        }
                    }
                    return true;
                }
            });
        }
        this.adapter.notifyDataSetChanged();
    }

    public void lambda$search$3(final int i, final String str, final int i2, final boolean z, final FiltersView.MediaFilterData mediaFilterData, final long j, final long j2, final ArrayList arrayList, final ArrayList arrayList2, final TLRPC.messages_Messages messages_messages, final TLRPC.TL_error tL_error) {
        final ArrayList arrayList3 = new ArrayList();
        if (tL_error == null) {
            int size = messages_messages.messages.size();
            for (int i3 = 0; i3 < size; i3++) {
                MessageObject messageObject = new MessageObject(i, messages_messages.messages.get(i3), false, true);
                messageObject.setQuery(str);
                arrayList3.add(messageObject);
            }
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$search$2(i2, tL_error, messages_messages, i, z, str, arrayList3, mediaFilterData, j, j2, arrayList, arrayList2);
            }
        });
    }

    public void lambda$search$4(final long j, long j2, final String str, final FiltersView.MediaFilterData mediaFilterData, final int i, final long j3, long j4, final boolean z, boolean z2, String str2, final int i2) throws Throwable {
        Object obj;
        ArrayList<Object> arrayList = null;
        if (j == 0 || j2 != 0) {
            if (!TextUtils.isEmpty(str)) {
                ArrayList<Object> arrayList2 = new ArrayList<>();
                MessagesStorage.getInstance(i).localSearch(0, str, arrayList2, new ArrayList<>(), new ArrayList<>(), null, z2 ? 1 : 0);
                arrayList = arrayList2;
            }
            TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = new TLRPC.TL_messages_searchGlobal();
            tL_messages_searchGlobal.limit = 20;
            tL_messages_searchGlobal.q = str;
            tL_messages_searchGlobal.filter = mediaFilterData == null ? new TLRPC.TL_inputMessagesFilterEmpty() : mediaFilterData.filter;
            tL_messages_searchGlobal.community = MessagesController.getInstance(i).getInputChannel(j2);
            if (j3 > 0) {
                tL_messages_searchGlobal.min_date = (int) (j3 / 1000);
            }
            if (j4 > 0) {
                tL_messages_searchGlobal.max_date = (int) (j4 / 1000);
            }
            if (z && str.equals(this.lastMessagesSearchString) && !this.messages.isEmpty()) {
                MessageObject messageObject = (MessageObject) zzin.m(1, this.messages);
                tL_messages_searchGlobal.offset_id = messageObject.getId();
                tL_messages_searchGlobal.offset_rate = this.nextSearchRate;
                tL_messages_searchGlobal.offset_peer = MessagesController.getInstance(i).getInputPeer(MessageObject.getPeerId(messageObject.messageOwner.peer_id));
            } else {
                tL_messages_searchGlobal.offset_rate = 0;
                tL_messages_searchGlobal.offset_id = 0;
                tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
            }
            tL_messages_searchGlobal.flags |= 1;
            tL_messages_searchGlobal.folder_id = z2 ? 1 : 0;
            obj = tL_messages_searchGlobal;
        } else {
            TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
            tL_messages_search.q = str;
            tL_messages_search.limit = 20;
            tL_messages_search.filter = mediaFilterData == null ? new TLRPC.TL_inputMessagesFilterEmpty() : mediaFilterData.filter;
            tL_messages_search.peer = AccountInstance.getInstance(i).getMessagesController().getInputPeer(j);
            if (j3 > 0) {
                tL_messages_search.min_date = (int) (j3 / 1000);
            }
            if (j4 > 0) {
                tL_messages_search.max_date = (int) (j4 / 1000);
            }
            if (z && str.equals(this.lastMessagesSearchString) && !this.messages.isEmpty()) {
                tL_messages_search.offset_id = ((MessageObject) zzin.m(1, this.messages)).getId();
            } else {
                tL_messages_search.offset_id = 0;
            }
            obj = tL_messages_search;
        }
        this.lastMessagesSearchString = str;
        this.lastSearchFilterQueryString = str2;
        final ArrayList arrayList3 = new ArrayList();
        FiltersView.fillTipDates(this.lastMessagesSearchString, arrayList3);
        final ArrayList<Object> arrayList4 = arrayList;
        ConnectionsManager.getInstance(i).sendRequestTyped(obj, new Utilities.Callback2() {
            @Override
            public final void run(Object obj2, Object obj3) {
                FilteredSearchView filteredSearchView = this.f$0;
                ArrayList arrayList5 = arrayList3;
                filteredSearchView.lambda$search$3(i, str, i2, z, mediaFilterData, j, j3, arrayList4, arrayList5, (TLRPC.messages_Messages) obj2, (TLRPC.TL_error) obj3);
            }
        });
    }

    public void onItemClick(int i, View view, MessageObject messageObject, int i2) {
        String str;
        if (messageObject == null) {
            return;
        }
        if (this.uiCallback.actionModeShowing()) {
            this.uiCallback.toggleItemSelection(messageObject, view, i2);
            return;
        }
        if (view instanceof DialogCell) {
            this.uiCallback.goToMessage(messageObject);
            return;
        }
        int i3 = this.currentSearchFilter.filterType;
        if (i3 == 0) {
            PhotoViewer.getInstance().setParentActivity(this.parentFragment);
            PhotoViewer.getInstance().openPhoto(this.messages, i, 0L, 0L, 0L, this.provider);
            this.photoViewerClassGuid = PhotoViewer.getInstance().getClassGuid();
            return;
        }
        if (i3 == 3 || i3 == 5) {
            if (view instanceof SharedAudioCell) {
                ((SharedAudioCell) view).didPressedButton();
                return;
            }
            return;
        }
        if (i3 == 1) {
            if (view instanceof SharedDocumentCell) {
                SharedDocumentCell sharedDocumentCell = (SharedDocumentCell) view;
                TLRPC.Document document = messageObject.getDocument();
                if (!sharedDocumentCell.loaded) {
                    if (sharedDocumentCell.loading) {
                        AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().cancelLoadFile(document);
                        sharedDocumentCell.updateFileExistIcon(true);
                        return;
                    } else {
                        MessageObject message = sharedDocumentCell.getMessage();
                        message.putInDownloadsStore = true;
                        AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().loadFile(document, message, 0, 0);
                        sharedDocumentCell.updateFileExistIcon(true);
                        return;
                    }
                }
                if (!messageObject.canPreviewDocument()) {
                    AndroidUtilities.openDocument(messageObject, this.parentActivity, this.parentFragment);
                    return;
                }
                PhotoViewer.getInstance().setParentActivity(this.parentFragment);
                int iIndexOf = this.messages.indexOf(messageObject);
                if (iIndexOf >= 0) {
                    PhotoViewer.getInstance().setParentActivity(this.parentFragment);
                    PhotoViewer.getInstance().openPhoto(this.messages, iIndexOf, 0L, 0L, 0L, this.provider);
                    this.photoViewerClassGuid = PhotoViewer.getInstance().getClassGuid();
                    return;
                } else {
                    ArrayList<MessageObject> arrayListM = MediaController$$ExternalSyntheticOutline1.m(messageObject);
                    PhotoViewer.getInstance().setParentActivity(this.parentFragment);
                    PhotoViewer.getInstance().openPhoto(arrayListM, 0, 0L, 0L, 0L, this.provider);
                    this.photoViewerClassGuid = PhotoViewer.getInstance().getClassGuid();
                    return;
                }
            }
            return;
        }
        if (i3 == 2) {
            try {
                TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
                String string = null;
                TLRPC.WebPage webPage = messageMedia != null ? messageMedia.webpage : null;
                if (webPage == null || (webPage instanceof TLRPC.TL_webPageEmpty)) {
                    str = null;
                } else {
                    if (webPage.cached_page != null) {
                        LaunchActivity launchActivity = LaunchActivity.instance;
                        if (launchActivity == null || launchActivity.getBottomSheetTabs() == null || LaunchActivity.instance.getBottomSheetTabs().tryReopenTab(messageObject) == null) {
                            this.parentFragment.createArticleViewer(false).open(messageObject);
                            return;
                        }
                        return;
                    }
                    String str2 = webPage.embed_url;
                    if (str2 != null && str2.length() != 0) {
                        openWebView(webPage, messageObject);
                        return;
                    }
                    str = webPage.url;
                }
                if (str == null) {
                    SharedLinkCell sharedLinkCell = (SharedLinkCell) view;
                    if (sharedLinkCell.links.size() > 0) {
                        string = ((CharSequence) sharedLinkCell.links.get(0)).toString();
                    }
                } else {
                    string = str;
                }
                if (string != null) {
                    openUrl(string);
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public boolean onItemLongClick(MessageObject messageObject, View view, int i) {
        if (!this.uiCallback.actionModeShowing()) {
            this.uiCallback.showActionMode();
        }
        if (!this.uiCallback.actionModeShowing()) {
            return true;
        }
        this.uiCallback.toggleItemSelection(messageObject, view, i);
        return true;
    }

    public void openUrl(String str) {
        if (AndroidUtilities.shouldShowUrlInAlert(str)) {
            AlertsCreator.showOpenUrlAlert(this.parentFragment, str, true, true);
        } else {
            Browser.openUrl(this.parentActivity, str);
        }
    }

    public void openWebView(TLRPC.WebPage webPage, MessageObject messageObject) {
        EmbedBottomSheet.show(this.parentFragment, messageObject, this.provider, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, false);
    }

    public void showFloatingDateView() {
        AndroidUtilities.cancelRunOnUIThread(this.hideFloatingDateRunnable);
        AndroidUtilities.runOnUIThread(this.hideFloatingDateRunnable, 1650L);
        this.animatorFloatingDataVisible.setValue(true, true);
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

    public ArrayList<ThemeDescription> getThemeDescriptions() {
        IntroActivity$$ExternalSyntheticLambda0 introActivity$$ExternalSyntheticLambda0 = new IntroActivity$$ExternalSyntheticLambda0(this, 15);
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
        int i = Theme.key_windowBackgroundWhite;
        arrayList.add(new ThemeDescription(null, 0, null, null, null, introActivity$$ExternalSyntheticLambda0, i));
        arrayList.add(new ThemeDescription(this, 1, null, null, null, null, i));
        arrayList.add(new ThemeDescription(this, 0, null, null, null, null, Theme.key_dialogBackground));
        arrayList.add(new ThemeDescription(this, 0, null, null, null, null, Theme.key_windowBackgroundGray));
        int i2 = Theme.key_windowBackgroundWhiteBlackText;
        arrayList.add(new ThemeDescription(this.recyclerListView, 4, new Class[]{SharedDocumentCell.class}, new String[]{"nameTextView"}, null, null, -1, null, i2));
        arrayList.add(new ThemeDescription(this.recyclerListView, 4, new Class[]{SharedDocumentCell.class}, new String[]{"dateTextView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteGrayText3));
        int i3 = Theme.key_sharedMedia_startStopLoadIcon;
        arrayList.add(new ThemeDescription(this.recyclerListView, 2048, new Class[]{SharedDocumentCell.class}, new String[]{"progressView"}, null, null, -1, null, i3));
        arrayList.add(new ThemeDescription(this.recyclerListView, 8, new Class[]{SharedDocumentCell.class}, new String[]{"statusImageView"}, null, null, -1, null, i3));
        int i4 = Theme.key_checkbox;
        arrayList.add(new ThemeDescription(this.recyclerListView, 8192, new Class[]{SharedDocumentCell.class}, new String[]{"checkBox"}, null, null, -1, null, i4));
        int i5 = Theme.key_checkboxCheck;
        arrayList.add(new ThemeDescription(this.recyclerListView, 16384, new Class[]{SharedDocumentCell.class}, new String[]{"checkBox"}, null, null, -1, null, i5));
        arrayList.add(new ThemeDescription(this.recyclerListView, 8, new Class[]{SharedDocumentCell.class}, new String[]{"thumbImageView"}, null, null, -1, null, Theme.key_files_folderIcon));
        arrayList.add(new ThemeDescription(this.recyclerListView, 4, new Class[]{SharedDocumentCell.class}, new String[]{"extTextView"}, null, null, -1, null, Theme.key_files_iconText));
        arrayList.add(new ThemeDescription(this.recyclerListView, 0, new Class[]{LoadingCell.class}, new String[]{"progressBar"}, null, null, -1, null, Theme.key_progressCircle));
        arrayList.add(new ThemeDescription(this.recyclerListView, 8192, new Class[]{SharedAudioCell.class}, new String[]{"checkBox"}, null, null, -1, null, i4));
        arrayList.add(new ThemeDescription(this.recyclerListView, 16384, new Class[]{SharedAudioCell.class}, new String[]{"checkBox"}, null, null, -1, null, i5));
        arrayList.add(new ThemeDescription(this.recyclerListView, 4, new Class[]{SharedAudioCell.class}, Theme.chat_contextResult_titleTextPaint, null, null, i2));
        arrayList.add(new ThemeDescription(this.recyclerListView, 4, new Class[]{SharedAudioCell.class}, Theme.chat_contextResult_descriptionTextPaint, null, null, Theme.key_windowBackgroundWhiteGrayText2));
        arrayList.add(new ThemeDescription(this.recyclerListView, 8192, new Class[]{SharedLinkCell.class}, new String[]{"checkBox"}, null, null, -1, null, i4));
        arrayList.add(new ThemeDescription(this.recyclerListView, 16384, new Class[]{SharedLinkCell.class}, new String[]{"checkBox"}, null, null, -1, null, i5));
        arrayList.add(new ThemeDescription(this.recyclerListView, 0, new Class[]{SharedLinkCell.class}, new String[]{"titleTextPaint"}, null, null, -1, null, i2));
        arrayList.add(new ThemeDescription(this.recyclerListView, 0, new Class[]{SharedLinkCell.class}, null, null, null, Theme.key_windowBackgroundWhiteLinkText));
        arrayList.add(new ThemeDescription(this.recyclerListView, 0, new Class[]{SharedLinkCell.class}, Theme.linkSelectionPaint, null, null, Theme.key_windowBackgroundWhiteLinkSelection));
        arrayList.add(new ThemeDescription(this.recyclerListView, 0, new Class[]{SharedLinkCell.class}, new String[]{"letterDrawable"}, null, null, -1, null, Theme.key_sharedMedia_linkPlaceholderText));
        arrayList.add(new ThemeDescription(this.recyclerListView, 32, new Class[]{SharedLinkCell.class}, new String[]{"letterDrawable"}, null, null, -1, null, Theme.key_sharedMedia_linkPlaceholder));
        arrayList.add(new ThemeDescription(this.recyclerListView, 524304, new Class[]{SharedMediaSectionCell.class}, null, null, null, i));
        arrayList.add(new ThemeDescription(this.recyclerListView, 524288, new Class[]{SharedMediaSectionCell.class}, new String[]{"textView"}, null, null, -1, null, i2));
        arrayList.add(new ThemeDescription(this.recyclerListView, 0, new Class[]{SharedMediaSectionCell.class}, new String[]{"textView"}, null, null, -1, null, i2));
        arrayList.add(new ThemeDescription(this.recyclerListView, 0, new Class[]{DialogCell.class, ProfileSearchCell.class}, null, Theme.avatarDrawables, null, Theme.key_avatar_text));
        arrayList.add(new ThemeDescription(this.recyclerListView, 0, new Class[]{DialogCell.class}, Theme.dialogs_countPaint, null, null, Theme.key_chats_unreadCounter));
        arrayList.add(new ThemeDescription(this.recyclerListView, 0, new Class[]{DialogCell.class}, Theme.dialogs_countGrayPaint, null, null, Theme.key_chats_unreadCounterMuted));
        arrayList.add(new ThemeDescription(this.recyclerListView, 0, new Class[]{DialogCell.class}, Theme.dialogs_countTextPaint, null, null, Theme.key_chats_unreadCounterText));
        arrayList.add(new ThemeDescription(this.recyclerListView, 0, new Class[]{DialogCell.class, ProfileSearchCell.class}, null, new Drawable[]{Theme.dialogs_lockDrawable}, null, Theme.key_chats_secretIcon));
        Drawable[] drawableArr = {Theme.dialogs_scamDrawable, Theme.dialogs_fakeDrawable};
        int i6 = Theme.key_chats_draft;
        arrayList.add(new ThemeDescription(this.recyclerListView, 0, new Class[]{DialogCell.class, ProfileSearchCell.class}, null, drawableArr, null, i6));
        arrayList.add(new ThemeDescription(this.recyclerListView, 0, new Class[]{DialogCell.class}, null, new Drawable[]{Theme.dialogs_pinnedDrawable, Theme.dialogs_pinnedDrawable2, Theme.dialogs_reorderDrawable}, null, Theme.key_chats_pinnedIcon));
        TextPaint[] textPaintArr = Theme.dialogs_namePaint;
        arrayList.add(new ThemeDescription(this.recyclerListView, 0, new Class[]{DialogCell.class, ProfileSearchCell.class}, null, new Paint[]{textPaintArr[0], textPaintArr[1], Theme.dialogs_searchNamePaint}, null, -1, null, Theme.key_chats_name));
        TextPaint[] textPaintArr2 = Theme.dialogs_nameEncryptedPaint;
        arrayList.add(new ThemeDescription(this.recyclerListView, 0, new Class[]{DialogCell.class, ProfileSearchCell.class}, null, new Paint[]{textPaintArr2[0], textPaintArr2[1], Theme.dialogs_searchNameEncryptedPaint}, null, -1, null, Theme.key_chats_secretName));
        arrayList.add(new ThemeDescription(this.recyclerListView, 0, new Class[]{DialogCell.class}, Theme.dialogs_messagePaint[1], null, null, Theme.key_chats_message_threeLines));
        arrayList.add(new ThemeDescription(this.recyclerListView, 0, new Class[]{DialogCell.class}, Theme.dialogs_messagePaint[0], null, null, Theme.key_chats_message));
        arrayList.add(new ThemeDescription(this.recyclerListView, 0, new Class[]{DialogCell.class}, Theme.dialogs_messageNamePaint, null, null, Theme.key_chats_nameMessage_threeLines));
        arrayList.add(new ThemeDescription(this.recyclerListView, 0, new Class[]{DialogCell.class}, null, null, null, i6));
        arrayList.add(new ThemeDescription(this.recyclerListView, 0, new Class[]{DialogCell.class}, null, Theme.dialogs_messagePrintingPaint, null, -1, null, Theme.key_chats_actionMessage));
        arrayList.add(new ThemeDescription(this.recyclerListView, 0, new Class[]{DialogCell.class}, Theme.dialogs_timePaint, null, null, Theme.key_chats_date));
        arrayList.add(new ThemeDescription(this.recyclerListView, 0, new Class[]{DialogCell.class}, Theme.dialogs_pinnedPaint, null, null, Theme.key_chats_pinnedOverlay));
        arrayList.add(new ThemeDescription(this.recyclerListView, 0, new Class[]{DialogCell.class}, Theme.dialogs_tabletSeletedPaint, null, null, Theme.key_chats_tabletSelectedOverlay));
        arrayList.add(new ThemeDescription(this.recyclerListView, 0, new Class[]{DialogCell.class}, null, new Drawable[]{Theme.dialogs_checkDrawable}, null, Theme.key_chats_sentCheck));
        arrayList.add(new ThemeDescription(this.recyclerListView, 0, new Class[]{DialogCell.class}, null, new Drawable[]{Theme.dialogs_checkReadDrawable, Theme.dialogs_halfCheckDrawable}, null, Theme.key_chats_sentReadCheck));
        arrayList.add(new ThemeDescription(this.recyclerListView, 0, new Class[]{DialogCell.class}, null, new Drawable[]{Theme.dialogs_clockDrawable}, null, Theme.key_chats_sentClock));
        arrayList.add(new ThemeDescription(this.recyclerListView, 0, new Class[]{DialogCell.class}, Theme.dialogs_errorPaint, null, null, Theme.key_chats_sentError));
        arrayList.add(new ThemeDescription(this.recyclerListView, 0, new Class[]{DialogCell.class}, null, new Drawable[]{Theme.dialogs_errorDrawable}, null, Theme.key_chats_sentErrorIcon));
        arrayList.add(new ThemeDescription(this.recyclerListView, 0, new Class[]{DialogCell.class, ProfileSearchCell.class}, null, new Drawable[]{Theme.dialogs_verifiedCheckDrawable}, null, Theme.key_chats_verifiedCheck));
        arrayList.add(new ThemeDescription(this.recyclerListView, 0, new Class[]{DialogCell.class, ProfileSearchCell.class}, null, new Drawable[]{Theme.dialogs_verifiedDrawable}, null, Theme.key_chats_verifiedBackground));
        arrayList.add(new ThemeDescription(this.recyclerListView, 0, new Class[]{DialogCell.class}, null, new Drawable[]{Theme.dialogs_muteDrawable}, null, Theme.key_chats_muteIcon));
        arrayList.add(new ThemeDescription(this.recyclerListView, 0, new Class[]{DialogCell.class}, null, new Drawable[]{Theme.dialogs_mentionDrawable}, null, Theme.key_chats_mentionIcon));
        arrayList.add(new ThemeDescription(this.recyclerListView, 0, new Class[]{DialogCell.class}, null, null, null, Theme.key_chats_archivePinBackground));
        arrayList.add(new ThemeDescription(this.recyclerListView, 0, new Class[]{DialogCell.class}, null, null, null, Theme.key_chats_archiveBackground));
        arrayList.add(new ThemeDescription(this.recyclerListView, 0, new Class[]{DialogCell.class}, null, null, null, Theme.key_chats_onlineCircle));
        arrayList.add(new ThemeDescription(this.recyclerListView, 0, new Class[]{DialogCell.class}, null, null, null, i));
        arrayList.add(new ThemeDescription(this.recyclerListView, 8192, new Class[]{DialogCell.class}, new String[]{"checkBox"}, null, null, -1, null, i));
        arrayList.add(new ThemeDescription(this.recyclerListView, 16384, new Class[]{DialogCell.class}, new String[]{"checkBox"}, null, null, -1, null, i5));
        arrayList.add(new ThemeDescription(this.recyclerListView, 524288, new Class[]{GraySectionCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_graySectionText));
        arrayList.add(new ThemeDescription(this.recyclerListView, 524304, new Class[]{GraySectionCell.class}, null, null, null, Theme.key_graySection));
        arrayList.add(new ThemeDescription(this.emptyView.title, 4, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.emptyView.subtitle, 4, null, null, null, null, Theme.key_windowBackgroundWhiteGrayText));
        return arrayList;
    }

    public void messagesDeleted(long j, ArrayList<Integer> arrayList) {
        RecyclerView.Adapter adapter;
        int i;
        int i2 = 0;
        boolean z = false;
        while (i2 < this.messages.size()) {
            MessageObject messageObject = this.messages.get(i2);
            long dialogId = messageObject.getDialogId();
            if (dialogId < 0) {
                i = (int) (-dialogId);
                if (!ChatObject.isChannel(i, UserConfig.selectedAccount)) {
                    i = 0;
                }
            } else {
                i = 0;
            }
            if (i == j) {
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    if (messageObject.getId() == arrayList.get(i3).intValue()) {
                        this.messages.remove(i2);
                        this.messagesById.remove(messageObject.getId());
                        ArrayList<MessageObject> arrayList2 = this.sectionArrays.get(messageObject.monthKey);
                        arrayList2.remove(messageObject);
                        if (arrayList2.size() == 0) {
                            this.sections.remove(messageObject.monthKey);
                            this.sectionArrays.remove(messageObject.monthKey);
                        }
                        i2--;
                        this.totalCount--;
                        z = true;
                    }
                }
            }
            i2++;
        }
        if (!z || (adapter = this.adapter) == null) {
            return;
        }
        adapter.notifyDataSetChanged();
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i = UserConfig.selectedAccount;
        this.lastAccount = i;
        NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.lastAccount).removeObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override
    public void onFactorChangeFinished(int i, float f, FactorAnimator factorAnimator) {
    }

    @Override
    public void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
        if (i == 0) {
            checkUi_floatingDateView();
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        RecyclerView.Adapter adapter;
        int i3 = this.columnsCount;
        if (!AndroidUtilities.isTablet() && getResources().getConfiguration().orientation == 2) {
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

    public void search(final long j, final long j2, final long j3, final long j4, final FiltersView.MediaFilterData mediaFilterData, final boolean z, String str, boolean z2) {
        final String str2 = str == null ? "" : str;
        Locale locale = Locale.ENGLISH;
        final String str3 = j + j2 + j3 + j4 + (mediaFilterData == null ? -1 : mediaFilterData.filterType) + str2 + z;
        String str4 = this.lastSearchFilterQueryString;
        boolean z3 = str4 != null && str4.equals(str3);
        boolean z4 = !z3 && z2;
        this.currentSearchFilter = mediaFilterData;
        this.currentSearchDialogId = j;
        this.currentSearchCommunityId = j2;
        this.currentSearchMinDate = j3;
        this.currentSearchMaxDate = j4;
        this.currentSearchString = str2;
        this.currentIncludeFolder = z;
        Runnable runnable = this.searchRunnable;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        AndroidUtilities.cancelRunOnUIThread(this.clearCurrentResultsRunnable);
        if (z3 && z2) {
            return;
        }
        if (z4 || (mediaFilterData == null && j2 == 0 && j == 0 && j3 == 0 && j4 == 0)) {
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
            this.firstLoading = true;
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
        if (TextUtils.isEmpty(str2)) {
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
            public final void run() throws Throwable {
                this.f$0.lambda$search$4(j, j2, str2, mediaFilterData, i2, j3, j4, z5, z, str3, i);
            }
        };
        this.searchRunnable = runnable2;
        AndroidUtilities.runOnUIThread(runnable2, (!z5 || this.messages.isEmpty()) ? 350L : 0L);
        if (mediaFilterData == null) {
            this.loadingView.setViewType(1);
            return;
        }
        int i3 = mediaFilterData.filterType;
        if (i3 == 0) {
            if (TextUtils.isEmpty(this.currentSearchString)) {
                this.loadingView.setViewType(2);
                return;
            } else {
                this.loadingView.setViewType(1);
                return;
            }
        }
        if (i3 == 1) {
            this.loadingView.setViewType(3);
            return;
        }
        if (i3 == 3 || i3 == 5) {
            this.loadingView.setViewType(4);
        } else if (i3 == 2) {
            this.loadingView.setViewType(5);
        }
    }

    public void setBlurredBackgroundDrawableFactory(BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory) {
        this.blurredBackgroundDrawableFactory = blurredBackgroundDrawableViewFactory;
        FloatingDateView floatingDateView = this.floatingDateView;
        BlurredBackgroundProviderBuilder blurredBackgroundProviderBuilder = new BlurredBackgroundProviderBuilder(null);
        blurredBackgroundProviderBuilder.backgroundColor = new LivePlayer$$ExternalSyntheticLambda1(11);
        int i = 402653183;
        int i2 = 385875968;
        blurredBackgroundProviderBuilder.strokeColorTop = new ExoPlayerImpl$$ExternalSyntheticLambda23(i, i2, 2);
        blurredBackgroundProviderBuilder.strokeColorBottom = new ExoPlayerImpl$$ExternalSyntheticLambda23(i, i2, 2);
        int i3 = 0;
        blurredBackgroundProviderBuilder.shadowColor = new ExoPlayerImpl$$ExternalSyntheticLambda23(i3, i3, 2);
        blurredBackgroundProviderBuilder.strokeWidthTop = 1.0f;
        blurredBackgroundProviderBuilder.strokeWidthBottom = 1.0f;
        floatingDateView.setBlurredBackgroundDrawable(blurredBackgroundDrawableViewFactory.create(floatingDateView, blurredBackgroundProviderBuilder, false));
    }

    public void setChatPreviewDelegate(SearchViewPager.ChatPreviewDelegate chatPreviewDelegate) {
        this.chatPreviewDelegate = chatPreviewDelegate;
    }

    public void setDelegate(Delegate delegate, boolean z) {
        this.delegate = delegate;
        if (!z || delegate == null || this.localTipChats.isEmpty()) {
            return;
        }
        delegate.updateFiltersView(false, this.localTipChats, this.localTipDates, this.localTipArchive);
    }

    public void setKeyboardHeight(int i, boolean z) {
        this.emptyView.setKeyboardHeight(i, z);
    }

    public void setPagesPaddings(int i, int i2) {
        setPagesPaddings(i, i2, false);
    }

    public void setUiCallback(UiCallback uiCallback) {
        this.uiCallback = uiCallback;
    }

    public void setUseFromUserAsAvatar(boolean z) {
        this.useFromUserAsAvatar = z;
    }

    public void update() {
        RecyclerView.Adapter adapter = this.adapter;
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }

    public static CharSequence createFromInfoString(MessageObject messageObject, boolean z, int i) {
        return createFromInfoString(messageObject, z, i, null);
    }

    public void setPagesPaddings(int i, int i2, boolean z) {
        setClipToPadding(false);
        this.ignoreRequestLayout = z;
        setPadding(0, i, 0, i2);
        this.recyclerListView.setPadding(0, i, 0, i2, z);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.recyclerListView.getLayoutParams();
        marginLayoutParams.topMargin = -i;
        marginLayoutParams.bottomMargin = -i2;
        this.ignoreRequestLayout = false;
    }

    public static CharSequence createFromInfoString(MessageObject messageObject, boolean z, int i, TextPaint textPaint) {
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        TLRPC.User user;
        TLRPC.TL_forumTopic tL_forumTopicFindTopic;
        TLRPC.TL_forumTopic tL_forumTopicFindTopic2;
        int i2;
        if (messageObject == null || messageObject.messageOwner == null) {
            return "";
        }
        if (messageObject.isQuickReply()) {
            QuickRepliesController.QuickReply quickReplyFindReply = QuickRepliesController.getInstance(messageObject.currentAccount).findReply(messageObject.getQuickReplyId());
            return quickReplyFindReply == null ? "" : quickReplyFindReply.name;
        }
        if (messageObject.isSponsored()) {
            if (messageObject.sponsoredCanReport) {
                return LocaleController.getString(R.string.SponsoredMessageAd);
            }
            if (messageObject.sponsoredRecommended) {
                return LocaleController.getString(R.string.SponsoredMessage2Recommended);
            }
            return LocaleController.getString(R.string.SponsoredMessage2);
        }
        SpannableStringBuilder[] spannableStringBuilderArr = arrowSpan;
        if (spannableStringBuilderArr[i] == null) {
            spannableStringBuilderArr[i] = new SpannableStringBuilder(">");
            if (i == 0) {
                i2 = R.drawable.attach_arrow_right;
            } else if (i == 1) {
                i2 = R.drawable.msg_mini_arrow_mediathin;
            } else {
                if (i != 2) {
                    return "";
                }
                i2 = R.drawable.msg_mini_arrow_mediabold;
            }
            ColoredImageSpan coloredImageSpan = new ColoredImageSpan(ApplicationLoader.applicationContext.getDrawable(i2).mutate(), i == 0 ? 2 : 1);
            if (i == 1 || i == 2) {
                coloredImageSpan.setScale(0.85f);
            }
            SpannableStringBuilder spannableStringBuilder = arrowSpan[i];
            spannableStringBuilder.setSpan(coloredImageSpan, 0, spannableStringBuilder.length(), 0);
        }
        TLRPC.Message message = messageObject.messageOwner;
        CharSequence charSequenceReplaceEmoji = null;
        if (message.saved_peer_id != null) {
            if (messageObject.getSavedDialogId() >= 0) {
                user = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(messageObject.getSavedDialogId()));
                chat = null;
            } else if (messageObject.getSavedDialogId() < 0) {
                chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-messageObject.getSavedDialogId()));
                user = null;
                chat2 = null;
            } else {
                user = null;
                chat = null;
            }
            chat2 = chat;
        } else {
            TLRPC.User user2 = message.from_id.user_id != 0 ? MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(messageObject.messageOwner.from_id.user_id)) : null;
            chat = messageObject.messageOwner.from_id.chat_id != 0 ? MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(messageObject.messageOwner.peer_id.chat_id)) : null;
            if (chat == null) {
                chat = messageObject.messageOwner.from_id.channel_id != 0 ? MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(messageObject.messageOwner.peer_id.channel_id)) : null;
            }
            chat2 = messageObject.messageOwner.peer_id.channel_id != 0 ? MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(messageObject.messageOwner.peer_id.channel_id)) : null;
            if (chat2 == null) {
                chat2 = messageObject.messageOwner.peer_id.chat_id != 0 ? MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(messageObject.messageOwner.peer_id.chat_id)) : null;
            }
            if (ChatObject.isChannelAndNotMegaGroup(chat2) || z) {
                user = user2;
            } else {
                user = user2;
                chat2 = null;
            }
        }
        if (user != null && chat2 != null) {
            CharSequence topicSpannedName = chat2.title;
            if (ChatObject.isForum(chat2) && (tL_forumTopicFindTopic2 = MessagesController.getInstance(UserConfig.selectedAccount).getTopicsController().findTopic(chat2.id, MessageObject.getTopicId(messageObject.currentAccount, messageObject.messageOwner, true))) != null) {
                topicSpannedName = ForumUtilities.getTopicSpannedName(tL_forumTopicFindTopic2, null, null);
            }
            CharSequence charSequenceReplaceEmoji2 = Emoji.replaceEmoji(topicSpannedName, textPaint == null ? null : textPaint.getFontMetricsInt(), false);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append(Emoji.replaceEmoji(UserObject.getFirstName(user), textPaint != null ? textPaint.getFontMetricsInt() : null, false)).append((char) 8202).append((CharSequence) arrowSpan[i]).append((char) 8202).append(charSequenceReplaceEmoji2);
            charSequenceReplaceEmoji = spannableStringBuilder2;
        } else if (user != null) {
            charSequenceReplaceEmoji = Emoji.replaceEmoji(UserObject.getUserName(user), textPaint != null ? textPaint.getFontMetricsInt() : null, false);
        } else if (chat != null) {
            CharSequence topicSpannedName2 = chat.title;
            if (ChatObject.isForum(chat) && (tL_forumTopicFindTopic = MessagesController.getInstance(UserConfig.selectedAccount).getTopicsController().findTopic(chat.id, MessageObject.getTopicId(messageObject.currentAccount, messageObject.messageOwner, true))) != null) {
                topicSpannedName2 = ForumUtilities.getTopicSpannedName(tL_forumTopicFindTopic, null, null);
            }
            charSequenceReplaceEmoji = Emoji.replaceEmoji(topicSpannedName2, textPaint != null ? textPaint.getFontMetricsInt() : null, false);
        }
        return charSequenceReplaceEmoji == null ? "" : charSequenceReplaceEmoji;
    }
}
