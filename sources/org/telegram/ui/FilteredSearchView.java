package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda23;
import com.google.android.gms.internal.mlkit_vision_common.zzkl;
import com.stripe.android.Stripe;
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
import org.telegram.ui.Adapters.DialogsSearchAdapter;
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
import org.telegram.ui.Components.ChatAttachAlertDocumentLayout;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EmbedBottomSheet;
import org.telegram.ui.Components.FlickerLoadingView;
import org.telegram.ui.Components.Forum.ForumUtilities;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.SearchViewPager;
import org.telegram.ui.Components.StickerEmptyView;
import org.telegram.ui.Components.blur3.BlurredBackgroundDrawableViewFactory;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundProviderBuilder;
import org.telegram.ui.Components.spoilers.SpoilersTextView;

public final class FilteredSearchView extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, FactorAnimator.Target {
    public static final SpannableStringBuilder[] arrowSpan = new SpannableStringBuilder[3];
    public RecyclerListView.SelectionAdapter adapter;
    public final BoolAnimator animatorFloatingDataVisible;
    public SearchViewPager.ChatPreviewDelegate chatPreviewDelegate;
    public final LaunchActivity.AnonymousClass18 clearCurrentResultsRunnable;
    public int columnsCount;
    public String currentDataQuery;
    public boolean currentIncludeFolder;
    public long currentSearchCommunityId;
    public long currentSearchDialogId;
    public FiltersView.MediaFilterData currentSearchFilter;
    public long currentSearchMaxDate;
    public long currentSearchMinDate;
    public String currentSearchString;
    public Delegate delegate;
    public final OnlyUserFiltersAdapter dialogsAdapter;
    public final StickerEmptyView emptyView;
    public boolean endReached;
    public final CalendarActivity.AnonymousClass5 floatingDateView;
    public final ComposeDrawable$$ExternalSyntheticLambda0 hideFloatingDateRunnable;
    public boolean ignoreRequestLayout;
    public boolean isLoading;
    public int lastAccount;
    public String lastMessagesSearchString;
    public String lastSearchFilterQueryString;
    public final LinearLayoutManager layoutManager;
    public final AnonymousClass5 loadingView;
    public boolean localTipArchive;
    public final ArrayList localTipChats;
    public final ArrayList localTipDates;
    public final MessageHashId messageHashIdTmp;
    public final ArrayList messages;
    public final SparseArray messagesById;
    public int nextSearchRate;
    public final AnimationNotificationsLocker notificationsLocker;
    public final Activity parentActivity;
    public final BaseFragment parentFragment;
    public int photoViewerClassGuid;
    public final AnonymousClass2 provider;
    public final ChatActivity.AnonymousClass34 recyclerListView;
    public int requestIndex;
    public FilteredSearchView$$ExternalSyntheticLambda3 searchRunnable;
    public final HashMap sectionArrays;
    public final ArrayList sections;
    public final SharedDocumentsAdapter sharedAudioAdapter;
    public final SharedDocumentsAdapter sharedDocumentsAdapter;
    public final SharedLinksAdapter sharedLinksAdapter;
    public final SharedPhotoVideoAdapter sharedPhotoVideoAdapter;
    public final SharedDocumentsAdapter sharedVoiceAdapter;
    public int totalCount;
    public UiCallback uiCallback;
    public boolean useFromUserAsAvatar;

    public final class AnonymousClass6 extends RecyclerView.OnScrollListener {
        public AnonymousClass6() {
        }

        @Override
        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            if (i == 1) {
                AndroidUtilities.hideKeyboard(FilteredSearchView.this.parentActivity.getCurrentFocus());
            }
        }

        @Override
        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            if (recyclerView.getAdapter() != null) {
                FilteredSearchView filteredSearchView = FilteredSearchView.this;
                if (filteredSearchView.adapter == null) {
                    return;
                }
                LinearLayoutManager linearLayoutManager = filteredSearchView.layoutManager;
                int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
                int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
                int iAbs = Math.abs(iFindLastVisibleItemPosition - iFindFirstVisibleItemPosition) + 1;
                int itemCount = recyclerView.getAdapter().getItemCount();
                if (!filteredSearchView.isLoading && iAbs > 0 && iFindLastVisibleItemPosition >= itemCount - 10 && !filteredSearchView.endReached) {
                    AndroidUtilities.runOnUIThread(new ComposeDrawable$$ExternalSyntheticLambda0(this, 22));
                }
                RecyclerListView.SelectionAdapter selectionAdapter = filteredSearchView.adapter;
                CalendarActivity.AnonymousClass5 anonymousClass5 = filteredSearchView.floatingDateView;
                BoolAnimator boolAnimator = filteredSearchView.animatorFloatingDataVisible;
                ComposeDrawable$$ExternalSyntheticLambda0 composeDrawable$$ExternalSyntheticLambda0 = filteredSearchView.hideFloatingDateRunnable;
                if (selectionAdapter != filteredSearchView.sharedPhotoVideoAdapter) {
                    View pinnedHeader = filteredSearchView.recyclerListView.getPinnedHeader();
                    if (pinnedHeader instanceof GraySectionCell) {
                        GraySectionCell graySectionCell = (GraySectionCell) pinnedHeader;
                        CharSequence text = graySectionCell.getText();
                        if (!TextUtils.isEmpty(text) && graySectionCell.getAlpha() > 0.0f) {
                            String string = text.toString();
                            if (!TextUtils.equals((String) anonymousClass5.this$0, string)) {
                                anonymousClass5.this$0 = string;
                                ((AnimatedTextView.AnimatedTextDrawable) anonymousClass5.val$daysOfWeek).setText(string, true, true);
                            }
                            if (i2 != 0) {
                                AndroidUtilities.cancelRunOnUIThread(composeDrawable$$ExternalSyntheticLambda0);
                                AndroidUtilities.runOnUIThread(composeDrawable$$ExternalSyntheticLambda0, 1650L);
                                boolAnimator.setValue(true, true);
                                return;
                            }
                            return;
                        }
                    }
                    AndroidUtilities.cancelRunOnUIThread(composeDrawable$$ExternalSyntheticLambda0);
                    boolAnimator.setValue(false, true);
                    return;
                }
                if (i2 != 0 && !filteredSearchView.messages.isEmpty() && TextUtils.isEmpty(filteredSearchView.currentDataQuery)) {
                    AndroidUtilities.cancelRunOnUIThread(composeDrawable$$ExternalSyntheticLambda0);
                    AndroidUtilities.runOnUIThread(composeDrawable$$ExternalSyntheticLambda0, 1650L);
                    boolAnimator.setValue(true, true);
                }
                RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(iFindFirstVisibleItemPosition);
                if (viewHolderFindViewHolderForAdapterPosition == null || viewHolderFindViewHolderForAdapterPosition.mItemViewType != 0) {
                    return;
                }
                View view = viewHolderFindViewHolderForAdapterPosition.itemView;
                if (view instanceof SharedPhotoVideoCell) {
                    SharedPhotoVideoCell sharedPhotoVideoCell = (SharedPhotoVideoCell) view;
                    MessageObject messageObject = sharedPhotoVideoCell.itemsCount <= 0 ? null : sharedPhotoVideoCell.messageObjects[0];
                    if (messageObject != null) {
                        int i3 = messageObject.messageOwner.date;
                        anonymousClass5.getClass();
                        String dateChat = LocaleController.formatDateChat(i3);
                        if (TextUtils.equals((String) anonymousClass5.this$0, dateChat)) {
                            return;
                        }
                        anonymousClass5.this$0 = dateChat;
                        ((AnimatedTextView.AnimatedTextDrawable) anonymousClass5.val$daysOfWeek).setText(dateChat, true, true);
                    }
                }
            }
        }
    }

    public interface Delegate {
    }

    public final class MessageHashId {
        public long dialogId;
        public int messageId;

        public MessageHashId(int i, long j) {
            this.dialogId = j;
            this.messageId = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && MessageHashId.class == obj.getClass()) {
                MessageHashId messageHashId = (MessageHashId) obj;
                if (this.dialogId == messageHashId.dialogId && this.messageId == messageHashId.messageId) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return this.messageId;
        }
    }

    public final class OnlyUserFiltersAdapter extends RecyclerListView.SelectionAdapter {
        public OnlyUserFiltersAdapter() {
        }

        @Override
        public final int getItemCount() {
            FilteredSearchView filteredSearchView = FilteredSearchView.this;
            if (filteredSearchView.messages.isEmpty()) {
                return 0;
            }
            return filteredSearchView.messages.size() + (!filteredSearchView.endReached ? 1 : 0);
        }

        @Override
        public final int getItemViewType(int i) {
            return i >= FilteredSearchView.this.messages.size() ? 3 : 0;
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return true;
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            if (viewHolder.mItemViewType == 0) {
                DialogCell dialogCell = (DialogCell) viewHolder.itemView;
                FilteredSearchView filteredSearchView = FilteredSearchView.this;
                MessageObject messageObject = (MessageObject) filteredSearchView.messages.get(i);
                dialogCell.useFromUserAsAvatar = filteredSearchView.useFromUserAsAvatar;
                dialogCell.setDialog(messageObject.getDialogId(), messageObject, messageObject.messageOwner.date, false, false);
                dialogCell.useSeparator = i != getItemCount() - 1;
                dialogCell.getViewTreeObserver().addOnPreDrawListener(new SharedLinksAdapter.AnonymousClass2(this, dialogCell, messageObject, dialogCell.getMessage() != null && dialogCell.getMessage().getId() == messageObject.getId(), 2));
            }
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View anonymousClass3;
            if (i == 0) {
                DialogsActivity dialogsActivity = null;
                anonymousClass3 = new DialogsSearchAdapter.AnonymousClass3(dialogsActivity, viewGroup.getContext(), true, UserConfig.selectedAccount, null, 2);
            } else if (i != 3) {
                GraySectionCell graySectionCell = new GraySectionCell(viewGroup.getContext(), 16, null);
                graySectionCell.setText(LocaleController.getString(R.string.SearchMessages));
                anonymousClass3 = graySectionCell;
            } else {
                FlickerLoadingView flickerLoadingView = new FlickerLoadingView(viewGroup.getContext(), null);
                flickerLoadingView.setIsSingleCell(true);
                flickerLoadingView.setViewType(1);
                anonymousClass3 = flickerLoadingView;
            }
            return zzkl.m(anonymousClass3, anonymousClass3);
        }
    }

    public final class SharedDocumentsAdapter extends RecyclerListView.SectionsAdapter {
        public final int currentType;
        public final Context mContext;

        public SharedDocumentsAdapter(Context context, int i) {
            this.mContext = context;
            this.currentType = i;
        }

        @Override
        public final int getCountForSection(int i) {
            FilteredSearchView filteredSearchView = FilteredSearchView.this;
            if (i < filteredSearchView.sections.size()) {
                return ((ArrayList) filteredSearchView.sectionArrays.get(filteredSearchView.sections.get(i))).size() + (i == 0 ? 0 : 1);
            }
            return 1;
        }

        @Override
        public final Object getItem(int i, int i2) {
            return null;
        }

        @Override
        public final int getItemViewType(int i, int i2) {
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
        public final String getLetter(int i) {
            return null;
        }

        @Override
        public final void getPositionForScrollProgress(RecyclerListView recyclerListView, float f, int[] iArr) {
            iArr[0] = 0;
            iArr[1] = 0;
        }

        @Override
        public final int getSectionCount() {
            FilteredSearchView filteredSearchView = FilteredSearchView.this;
            int i = 0;
            if (filteredSearchView.sections.isEmpty()) {
                return 0;
            }
            int size = filteredSearchView.sections.size();
            if (!filteredSearchView.sections.isEmpty() && !filteredSearchView.endReached) {
                i = 1;
            }
            return size + i;
        }

        @Override
        public final View getSectionHeaderView$1(int i, View view) {
            if (view == null) {
                view = new GraySectionCell(this.mContext, 16, null);
                view.setBackgroundColor(Theme.getColor(null, Theme.key_graySection, false) & (-218103809));
            }
            if (i == 0) {
                view.setAlpha(0.0f);
                return view;
            }
            FilteredSearchView filteredSearchView = FilteredSearchView.this;
            if (i < filteredSearchView.sections.size()) {
                view.setAlpha(1.0f);
                ((GraySectionCell) view).setText(LocaleController.formatSectionDate(((MessageObject) ((ArrayList) filteredSearchView.sectionArrays.get((String) filteredSearchView.sections.get(i))).get(0)).messageOwner.date));
            }
            return view;
        }

        @Override
        public final boolean isEnabled(int i, int i2, RecyclerView.ViewHolder viewHolder) {
            return i == 0 || i2 != 0;
        }

        @Override
        public final void onBindViewHolder(int i, int i2, RecyclerView.ViewHolder viewHolder) {
            if (viewHolder.mItemViewType != 2) {
                FilteredSearchView filteredSearchView = FilteredSearchView.this;
                ArrayList arrayList = (ArrayList) filteredSearchView.sectionArrays.get((String) filteredSearchView.sections.get(i));
                int i3 = viewHolder.mItemViewType;
                boolean z = false;
                View view = viewHolder.itemView;
                if (i3 == 0) {
                    ((GraySectionCell) view).setText(LocaleController.formatSectionDate(((MessageObject) arrayList.get(0)).messageOwner.date));
                    return;
                }
                ArrayList arrayList2 = filteredSearchView.sections;
                if (i3 == 1) {
                    if (i != 0) {
                        i2--;
                    }
                    SharedDocumentCell sharedDocumentCell = (SharedDocumentCell) view;
                    MessageObject messageObject = (MessageObject) arrayList.get(i2);
                    boolean z2 = sharedDocumentCell.getMessage() != null && sharedDocumentCell.getMessage().getId() == messageObject.getId();
                    if (i2 != arrayList.size() - 1 || (i == arrayList2.size() - 1 && filteredSearchView.isLoading)) {
                        z = true;
                    }
                    sharedDocumentCell.setDocument(messageObject, z);
                    sharedDocumentCell.getViewTreeObserver().addOnPreDrawListener(new SharedLinksAdapter.AnonymousClass2(this, sharedDocumentCell, messageObject, z2, 3));
                    return;
                }
                if (i3 != 3) {
                    return;
                }
                if (i != 0) {
                    i2--;
                }
                SharedAudioCell sharedAudioCell = (SharedAudioCell) view;
                MessageObject messageObject2 = (MessageObject) arrayList.get(i2);
                boolean z3 = sharedAudioCell.getMessage() != null && sharedAudioCell.getMessage().getId() == messageObject2.getId();
                if (i2 != arrayList.size() - 1 || (i == arrayList2.size() - 1 && filteredSearchView.isLoading)) {
                    z = true;
                }
                sharedAudioCell.setMessageObject(messageObject2, z);
                sharedAudioCell.getViewTreeObserver().addOnPreDrawListener(new SharedLinksAdapter.AnonymousClass2(this, sharedAudioCell, messageObject2, z3, 4));
            }
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View graySectionCell;
            View view;
            Context context = this.mContext;
            if (i == 0) {
                graySectionCell = new GraySectionCell(context, 16, null);
            } else {
                if (i != 1) {
                    if (i != 2) {
                        view = new SharedAudioCell(context) {
                            @Override
                            public final boolean needPlayMessage(MessageObject messageObject) {
                                boolean zIsVoice = messageObject.isVoice();
                                SharedDocumentsAdapter sharedDocumentsAdapter = SharedDocumentsAdapter.this;
                                if (zIsVoice || messageObject.isRoundVideo()) {
                                    boolean zPlayMessage = MediaController.getInstance().playMessage(messageObject);
                                    MediaController.getInstance().setVoiceMessagesPlaylist(zPlayMessage ? FilteredSearchView.this.messages : null, false);
                                    return zPlayMessage;
                                }
                                if (!messageObject.isMusic()) {
                                    return false;
                                }
                                FilteredSearchView filteredSearchView = FilteredSearchView.this;
                                String str = filteredSearchView.currentDataQuery;
                                long j = filteredSearchView.currentSearchDialogId;
                                long j2 = filteredSearchView.currentSearchMinDate;
                                MediaController.PlaylistGlobalSearchParams playlistGlobalSearchParams = new MediaController.PlaylistGlobalSearchParams(str, j, j2, j2, filteredSearchView.currentSearchFilter);
                                FilteredSearchView filteredSearchView2 = FilteredSearchView.this;
                                playlistGlobalSearchParams.endReached = filteredSearchView2.endReached;
                                playlistGlobalSearchParams.nextSearchRate = filteredSearchView2.nextSearchRate;
                                playlistGlobalSearchParams.totalCount = filteredSearchView2.totalCount;
                                playlistGlobalSearchParams.folderId = filteredSearchView2.currentIncludeFolder ? 1 : 0;
                                return MediaController.getInstance().setPlaylist(FilteredSearchView.this.messages, messageObject, 0L, playlistGlobalSearchParams);
                            }
                        };
                    } else {
                        FlickerLoadingView flickerLoadingView = new FlickerLoadingView(context, null);
                        int i2 = this.currentType;
                        if (i2 == 2 || i2 == 4) {
                            flickerLoadingView.setViewType(4);
                        } else {
                            flickerLoadingView.setViewType(3);
                        }
                        flickerLoadingView.setIsSingleCell(true);
                        graySectionCell = flickerLoadingView;
                    }
                    return zzkl.m(view, view);
                }
                graySectionCell = new SharedDocumentCell(context, 2, null);
            }
            view = graySectionCell;
            return zzkl.m(view, view);
        }
    }

    public final class SharedLinksAdapter extends RecyclerListView.SectionsAdapter {
        public final Context mContext;
        public final AnonymousClass1 sharedLinkCellDelegate = new AnonymousClass1();

        public final class AnonymousClass1 implements SharedLinkCell.SharedLinkCellDelegate {
            public AnonymousClass1() {
            }

            @Override
            public final boolean canPerformActions() {
                return !FilteredSearchView.this.uiCallback.actionModeShowing();
            }

            @Override
            public final void needOpenWebView(TLRPC.WebPage webPage, MessageObject messageObject) {
                FilteredSearchView filteredSearchView = FilteredSearchView.this;
                SpannableStringBuilder[] spannableStringBuilderArr = FilteredSearchView.arrowSpan;
                EmbedBottomSheet.show(filteredSearchView.parentFragment, messageObject, filteredSearchView.provider, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
            }

            @Override
            public final void onLinkPress(String str, boolean z) {
                SharedLinksAdapter sharedLinksAdapter = SharedLinksAdapter.this;
                if (!z) {
                    FilteredSearchView filteredSearchView = FilteredSearchView.this;
                    SpannableStringBuilder[] spannableStringBuilderArr = FilteredSearchView.arrowSpan;
                    filteredSearchView.getClass();
                    if (AndroidUtilities.shouldShowUrlInAlert(str)) {
                        AlertsCreator.showOpenUrlAlert(filteredSearchView.parentFragment, str, true, true);
                        return;
                    } else {
                        Browser.openUrl(filteredSearchView.parentActivity, str);
                        return;
                    }
                }
                BottomSheet bottomSheet = new BottomSheet(FilteredSearchView.this.parentActivity, null, false, false);
                bottomSheet.fixNavigationBar();
                bottomSheet.title = str;
                bottomSheet.bigTitle = false;
                CharSequence[] charSequenceArr = {LocaleController.getString(R.string.Open), LocaleController.getString(R.string.Copy)};
                ArticleViewer$$ExternalSyntheticLambda24 articleViewer$$ExternalSyntheticLambda24 = new ArticleViewer$$ExternalSyntheticLambda24(8, this, str);
                bottomSheet.items = charSequenceArr;
                bottomSheet.onClickListener = articleViewer$$ExternalSyntheticLambda24;
                FilteredSearchView.this.parentFragment.showDialog(bottomSheet);
            }
        }

        public final class AnonymousClass2 implements ViewTreeObserver.OnPreDrawListener {
            public final int $r8$classId;
            public final RecyclerListView.SelectionAdapter this$1;
            public final boolean val$animated;
            public final MessageObject val$messageObject;
            public final ViewGroup val$sharedLinkCell;

            public AnonymousClass2(RecyclerListView.SelectionAdapter selectionAdapter, ViewGroup viewGroup, MessageObject messageObject, boolean z, int i) {
                this.$r8$classId = i;
                this.this$1 = selectionAdapter;
                this.val$sharedLinkCell = viewGroup;
                this.val$messageObject = messageObject;
                this.val$animated = z;
            }

            @Override
            public final boolean onPreDraw() {
                switch (this.$r8$classId) {
                    case 0:
                        SharedLinkCell sharedLinkCell = (SharedLinkCell) this.val$sharedLinkCell;
                        sharedLinkCell.getViewTreeObserver().removeOnPreDrawListener(this);
                        SharedLinksAdapter sharedLinksAdapter = (SharedLinksAdapter) this.this$1;
                        boolean zActionModeShowing = FilteredSearchView.this.uiCallback.actionModeShowing();
                        boolean z = this.val$animated;
                        if (!zActionModeShowing) {
                            sharedLinkCell.setChecked(false, z);
                        } else {
                            FilteredSearchView filteredSearchView = FilteredSearchView.this;
                            MessageHashId messageHashId = filteredSearchView.messageHashIdTmp;
                            MessageObject messageObject = this.val$messageObject;
                            int id = messageObject.getId();
                            messageHashId.dialogId = messageObject.getDialogId();
                            messageHashId.messageId = id;
                            sharedLinkCell.setChecked(filteredSearchView.uiCallback.isSelected(filteredSearchView.messageHashIdTmp), z);
                        }
                        break;
                    case 1:
                        SharedDocumentCell sharedDocumentCell = (SharedDocumentCell) this.val$sharedLinkCell;
                        sharedDocumentCell.getViewTreeObserver().removeOnPreDrawListener(this);
                        ChatAttachAlertDocumentLayout.SearchAdapter searchAdapter = (ChatAttachAlertDocumentLayout.SearchAdapter) this.this$1;
                        boolean zIsActionModeShowed = ChatAttachAlertDocumentLayout.this.parentAlert.actionBar.isActionModeShowed();
                        boolean z2 = this.val$animated;
                        if (!zIsActionModeShowed) {
                            sharedDocumentCell.setChecked(false, z2);
                        } else {
                            MessageHashId messageHashId2 = searchAdapter.messageHashIdTmp;
                            MessageObject messageObject2 = this.val$messageObject;
                            int id2 = messageObject2.getId();
                            messageHashId2.dialogId = messageObject2.getDialogId();
                            messageHashId2.messageId = id2;
                            sharedDocumentCell.setChecked(ChatAttachAlertDocumentLayout.this.selectedMessages.containsKey(searchAdapter.messageHashIdTmp), z2);
                        }
                        break;
                    case 2:
                        DialogCell dialogCell = (DialogCell) this.val$sharedLinkCell;
                        dialogCell.getViewTreeObserver().removeOnPreDrawListener(this);
                        FilteredSearchView filteredSearchView2 = FilteredSearchView.this;
                        boolean zActionModeShowing2 = filteredSearchView2.uiCallback.actionModeShowing();
                        boolean z3 = this.val$animated;
                        if (!zActionModeShowing2) {
                            dialogCell.setChecked(false, z3);
                        } else {
                            MessageHashId messageHashId3 = filteredSearchView2.messageHashIdTmp;
                            MessageObject messageObject3 = this.val$messageObject;
                            int id3 = messageObject3.getId();
                            messageHashId3.dialogId = messageObject3.getDialogId();
                            messageHashId3.messageId = id3;
                            dialogCell.setChecked(filteredSearchView2.uiCallback.isSelected(filteredSearchView2.messageHashIdTmp), z3);
                        }
                        break;
                    case 3:
                        SharedDocumentCell sharedDocumentCell2 = (SharedDocumentCell) this.val$sharedLinkCell;
                        sharedDocumentCell2.getViewTreeObserver().removeOnPreDrawListener(this);
                        SharedDocumentsAdapter sharedDocumentsAdapter = (SharedDocumentsAdapter) this.this$1;
                        boolean zActionModeShowing3 = FilteredSearchView.this.uiCallback.actionModeShowing();
                        boolean z4 = this.val$animated;
                        if (!zActionModeShowing3) {
                            sharedDocumentCell2.setChecked(false, z4);
                        } else {
                            FilteredSearchView filteredSearchView3 = FilteredSearchView.this;
                            MessageHashId messageHashId4 = filteredSearchView3.messageHashIdTmp;
                            MessageObject messageObject4 = this.val$messageObject;
                            int id4 = messageObject4.getId();
                            messageHashId4.dialogId = messageObject4.getDialogId();
                            messageHashId4.messageId = id4;
                            sharedDocumentCell2.setChecked(filteredSearchView3.uiCallback.isSelected(filteredSearchView3.messageHashIdTmp), z4);
                        }
                        break;
                    default:
                        SharedAudioCell sharedAudioCell = (SharedAudioCell) this.val$sharedLinkCell;
                        sharedAudioCell.getViewTreeObserver().removeOnPreDrawListener(this);
                        SharedDocumentsAdapter sharedDocumentsAdapter2 = (SharedDocumentsAdapter) this.this$1;
                        boolean zActionModeShowing4 = FilteredSearchView.this.uiCallback.actionModeShowing();
                        boolean z5 = this.val$animated;
                        if (!zActionModeShowing4) {
                            sharedAudioCell.setChecked(false, z5);
                        } else {
                            FilteredSearchView filteredSearchView4 = FilteredSearchView.this;
                            MessageHashId messageHashId5 = filteredSearchView4.messageHashIdTmp;
                            MessageObject messageObject5 = this.val$messageObject;
                            int id5 = messageObject5.getId();
                            messageHashId5.dialogId = messageObject5.getDialogId();
                            messageHashId5.messageId = id5;
                            sharedAudioCell.setChecked(filteredSearchView4.uiCallback.isSelected(filteredSearchView4.messageHashIdTmp), z5);
                        }
                        break;
                }
                return true;
            }
        }

        public SharedLinksAdapter(Context context) {
            this.mContext = context;
        }

        @Override
        public final int getCountForSection(int i) {
            FilteredSearchView filteredSearchView = FilteredSearchView.this;
            if (i < filteredSearchView.sections.size()) {
                return ((ArrayList) filteredSearchView.sectionArrays.get(filteredSearchView.sections.get(i))).size() + (i == 0 ? 0 : 1);
            }
            return 1;
        }

        @Override
        public final Object getItem(int i, int i2) {
            return null;
        }

        @Override
        public final int getItemViewType(int i, int i2) {
            if (i < FilteredSearchView.this.sections.size()) {
                return (i == 0 || i2 != 0) ? 1 : 0;
            }
            return 2;
        }

        @Override
        public final String getLetter(int i) {
            return null;
        }

        @Override
        public final void getPositionForScrollProgress(RecyclerListView recyclerListView, float f, int[] iArr) {
            iArr[0] = 0;
            iArr[1] = 0;
        }

        @Override
        public final int getSectionCount() {
            FilteredSearchView filteredSearchView = FilteredSearchView.this;
            int i = 0;
            if (!filteredSearchView.messages.isEmpty()) {
                ArrayList arrayList = filteredSearchView.sections;
                if (!arrayList.isEmpty() || !filteredSearchView.isLoading) {
                    int size = arrayList.size();
                    if (!arrayList.isEmpty() && !filteredSearchView.endReached) {
                        i = 1;
                    }
                    return size + i;
                }
            }
            return 0;
        }

        @Override
        public final View getSectionHeaderView$1(int i, View view) {
            if (view == null) {
                view = new GraySectionCell(this.mContext, 16, null);
                view.setBackgroundColor(Theme.getColor(null, Theme.key_graySection, false) & (-218103809));
            }
            if (i == 0) {
                view.setAlpha(0.0f);
                return view;
            }
            FilteredSearchView filteredSearchView = FilteredSearchView.this;
            if (i < filteredSearchView.sections.size()) {
                view.setAlpha(1.0f);
                ((GraySectionCell) view).setText(LocaleController.formatSectionDate(((MessageObject) ((ArrayList) filteredSearchView.sectionArrays.get((String) filteredSearchView.sections.get(i))).get(0)).messageOwner.date));
            }
            return view;
        }

        @Override
        public final boolean isEnabled(int i, int i2, RecyclerView.ViewHolder viewHolder) {
            return true;
        }

        @Override
        public final void onBindViewHolder(int i, int i2, RecyclerView.ViewHolder viewHolder) {
            if (viewHolder.mItemViewType != 2) {
                FilteredSearchView filteredSearchView = FilteredSearchView.this;
                ArrayList arrayList = (ArrayList) filteredSearchView.sectionArrays.get((String) filteredSearchView.sections.get(i));
                int i3 = viewHolder.mItemViewType;
                boolean z = false;
                View view = viewHolder.itemView;
                if (i3 == 0) {
                    ((GraySectionCell) view).setText(LocaleController.formatSectionDate(((MessageObject) arrayList.get(0)).messageOwner.date));
                    return;
                }
                if (i3 != 1) {
                    return;
                }
                if (i != 0) {
                    i2--;
                }
                SharedLinkCell sharedLinkCell = (SharedLinkCell) view;
                MessageObject messageObject = (MessageObject) arrayList.get(i2);
                boolean z2 = sharedLinkCell.getMessage() != null && sharedLinkCell.getMessage().getId() == messageObject.getId();
                if (i2 != arrayList.size() - 1 || (i == filteredSearchView.sections.size() - 1 && filteredSearchView.isLoading)) {
                    z = true;
                }
                sharedLinkCell.needDivider = z;
                sharedLinkCell.resetPressedLink();
                sharedLinkCell.message = messageObject;
                sharedLinkCell.requestLayout();
                sharedLinkCell.getViewTreeObserver().addOnPreDrawListener(new AnonymousClass2(this, sharedLinkCell, messageObject, z2, 0));
            }
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View graySectionCell;
            Context context = this.mContext;
            if (i == 0) {
                graySectionCell = new GraySectionCell(context, 16, null);
            } else if (i != 1) {
                FlickerLoadingView flickerLoadingView = new FlickerLoadingView(context, null);
                flickerLoadingView.setViewType(5);
                flickerLoadingView.setIsSingleCell(true);
                graySectionCell = flickerLoadingView;
            } else {
                SharedLinkCell sharedLinkCell = new SharedLinkCell(context, 1, null);
                sharedLinkCell.setDelegate(this.sharedLinkCellDelegate);
                graySectionCell = sharedLinkCell;
            }
            return zzkl.m(graySectionCell, graySectionCell);
        }
    }

    public final class SharedPhotoVideoAdapter extends RecyclerListView.SelectionAdapter {
        public final Context mContext;

        public final class AnonymousClass1 implements SharedPhotoVideoCell.SharedPhotoVideoCellDelegate {
            public AnonymousClass1() {
            }
        }

        public SharedPhotoVideoAdapter(Context context) {
            this.mContext = context;
        }

        @Override
        public final int getItemCount() {
            FilteredSearchView filteredSearchView = FilteredSearchView.this;
            if (filteredSearchView.messages.isEmpty()) {
                return 0;
            }
            return ((int) Math.ceil(filteredSearchView.messages.size() / filteredSearchView.columnsCount)) + (!filteredSearchView.endReached ? 1 : 0);
        }

        @Override
        public final int getItemViewType(int i) {
            FilteredSearchView filteredSearchView = FilteredSearchView.this;
            return i < ((int) Math.ceil((double) (((float) filteredSearchView.messages.size()) / ((float) filteredSearchView.columnsCount)))) ? 0 : 1;
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return false;
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            int i2 = viewHolder.mItemViewType;
            FilteredSearchView filteredSearchView = FilteredSearchView.this;
            View view = viewHolder.itemView;
            if (i2 != 0) {
                if (i2 != 3) {
                    if (i2 == 1) {
                        int iCeil = (int) Math.ceil(filteredSearchView.messages.size() / filteredSearchView.columnsCount);
                        int i3 = filteredSearchView.columnsCount;
                        ((FlickerLoadingView) view).skipDrawItemsCount = i3 - ((iCeil * i3) - filteredSearchView.messages.size());
                        return;
                    }
                    return;
                }
                DialogCell dialogCell = (DialogCell) view;
                dialogCell.useSeparator = i != getItemCount() - 1;
                MessageObject messageObject = (MessageObject) filteredSearchView.messages.get(i);
                boolean z = dialogCell.getMessage() != null && dialogCell.getMessage().getId() == messageObject.getId();
                dialogCell.useFromUserAsAvatar = filteredSearchView.useFromUserAsAvatar;
                dialogCell.setDialog(messageObject.getDialogId(), messageObject, messageObject.messageOwner.date, false, false);
                if (!filteredSearchView.uiCallback.actionModeShowing()) {
                    dialogCell.setChecked(false, z);
                    return;
                }
                int id = messageObject.getId();
                long dialogId = messageObject.getDialogId();
                MessageHashId messageHashId = filteredSearchView.messageHashIdTmp;
                messageHashId.dialogId = dialogId;
                messageHashId.messageId = id;
                dialogCell.setChecked(filteredSearchView.uiCallback.isSelected(messageHashId), z);
                return;
            }
            ArrayList arrayList = filteredSearchView.messages;
            SharedPhotoVideoCell sharedPhotoVideoCell = (SharedPhotoVideoCell) view;
            sharedPhotoVideoCell.setItemsCount(filteredSearchView.columnsCount);
            sharedPhotoVideoCell.setIsFirst(i == 0);
            int i4 = 0;
            while (true) {
                int i5 = filteredSearchView.columnsCount;
                if (i4 >= i5) {
                    sharedPhotoVideoCell.requestLayout();
                    return;
                }
                int i6 = (i5 * i) + i4;
                int size = arrayList.size();
                int[] iArr = sharedPhotoVideoCell.indeces;
                MessageObject[] messageObjectArr = sharedPhotoVideoCell.messageObjects;
                SharedPhotoVideoCell.PhotoVideoView[] photoVideoViewArr = sharedPhotoVideoCell.photoVideoViews;
                if (i6 < size) {
                    MessageObject messageObject2 = (MessageObject) arrayList.get(i6);
                    int iIndexOf = filteredSearchView.messages.indexOf(messageObject2);
                    messageObjectArr[i4] = messageObject2;
                    iArr[i4] = iIndexOf;
                    if (messageObject2 != null) {
                        photoVideoViewArr[i4].setVisibility(0);
                        photoVideoViewArr[i4].setMessageObject(messageObject2);
                    } else {
                        photoVideoViewArr[i4].clearAnimation();
                        photoVideoViewArr[i4].setVisibility(4);
                        messageObjectArr[i4] = null;
                    }
                    if (filteredSearchView.uiCallback.actionModeShowing()) {
                        int id2 = messageObject2.getId();
                        long dialogId2 = messageObject2.getDialogId();
                        MessageHashId messageHashId2 = filteredSearchView.messageHashIdTmp;
                        messageHashId2.dialogId = dialogId2;
                        messageHashId2.messageId = id2;
                        photoVideoViewArr[i4].setChecked(filteredSearchView.uiCallback.isSelected(messageHashId2));
                    } else {
                        photoVideoViewArr[i4].setChecked(false);
                    }
                } else {
                    messageObjectArr[i4] = null;
                    iArr[i4] = i6;
                    photoVideoViewArr[i4].clearAnimation();
                    photoVideoViewArr[i4].setVisibility(4);
                    messageObjectArr[i4] = null;
                }
                i4++;
            }
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View view;
            Context context = this.mContext;
            if (i == 0) {
                SharedPhotoVideoCell sharedPhotoVideoCell = new SharedPhotoVideoCell(context);
                sharedPhotoVideoCell.setDelegate(new AnonymousClass1());
                view = sharedPhotoVideoCell;
            } else if (i != 2) {
                FlickerLoadingView flickerLoadingView = new FlickerLoadingView(context) {
                    @Override
                    public final int getColumnsCount() {
                        return FilteredSearchView.this.columnsCount;
                    }
                };
                flickerLoadingView.setIsSingleCell(true);
                flickerLoadingView.setViewType(2);
                view = flickerLoadingView;
            } else {
                GraySectionCell graySectionCell = new GraySectionCell(context, 16, null);
                graySectionCell.setBackgroundColor(Theme.getColor(null, Theme.key_graySection, false) & (-218103809));
                view = graySectionCell;
            }
            return zzkl.m(view, view);
        }
    }

    public interface UiCallback {
        boolean actionModeShowing();

        void goToMessage(MessageObject messageObject);

        boolean isSelected(MessageHashId messageHashId);

        void showActionMode();

        void toggleItemSelection(MessageObject messageObject, View view, int i);
    }

    public FilteredSearchView(BaseFragment baseFragment) {
        super(baseFragment.getParentActivity());
        BoolAnimator boolAnimator = new BoolAnimator(0, this, CubicBezierInterpolator.EASE_OUT_QUINT, 380L, false);
        this.animatorFloatingDataVisible = boolAnimator;
        this.messages = new ArrayList();
        this.messagesById = new SparseArray();
        this.sections = new ArrayList();
        this.sectionArrays = new HashMap();
        this.columnsCount = 3;
        this.messageHashIdTmp = new MessageHashId(0, 0L);
        this.localTipChats = new ArrayList();
        this.localTipDates = new ArrayList();
        this.clearCurrentResultsRunnable = new LaunchActivity.AnonymousClass18(this, 10);
        this.provider = new PhotoViewer.EmptyPhotoViewerProvider() {
            @Override
            public final PhotoViewer.PlaceProviderObject getPlaceForPhoto(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i, boolean z, boolean z2) {
                ImageReceiver photoImage;
                View pinnedHeader;
                if (messageObject != null) {
                    ChatActivity.AnonymousClass34 anonymousClass34 = FilteredSearchView.this.recyclerListView;
                    int childCount = anonymousClass34.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        View childAt = anonymousClass34.getChildAt(i2);
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
                            placeProviderObject.parentView = anonymousClass34;
                            anonymousClass34.getLocationInWindow(iArr);
                            placeProviderObject.animatingImageViewYOffset = -iArr[1];
                            placeProviderObject.imageReceiver = photoImage;
                            placeProviderObject.allowTakeAnimation = false;
                            placeProviderObject.radius = photoImage.getRoundRadius(true);
                            placeProviderObject.thumb = placeProviderObject.imageReceiver.getBitmapSafe();
                            placeProviderObject.parentView.getLocationInWindow(iArr);
                            placeProviderObject.clipTopAddition = 0;
                            if (PhotoViewer.isShowingImage(messageObject) && (pinnedHeader = anonymousClass34.getPinnedHeader()) != null) {
                                int iDp = (childAt instanceof SharedDocumentCell ? AndroidUtilities.dp(8.0f) : 0) - placeProviderObject.viewY;
                                if (iDp > childAt.getHeight()) {
                                    anonymousClass34.scrollBy(0, -(pinnedHeader.getHeight() + iDp));
                                    return placeProviderObject;
                                }
                                int height = placeProviderObject.viewY - anonymousClass34.getHeight();
                                if (childAt instanceof SharedDocumentCell) {
                                    height -= AndroidUtilities.dp(8.0f);
                                }
                                if (height >= 0) {
                                    anonymousClass34.scrollBy(0, childAt.getHeight() + height);
                                }
                            }
                            return placeProviderObject;
                        }
                    }
                }
                return null;
            }

            @Override
            public final CharSequence getSubtitleFor(int i) {
                return LocaleController.formatDateAudio(((MessageObject) FilteredSearchView.this.messages.get(i)).messageOwner.date, false);
            }

            @Override
            public final CharSequence getTitleFor(int i) {
                return FilteredSearchView.createFromInfoString((MessageObject) FilteredSearchView.this.messages.get(i), true, 0, null);
            }

            @Override
            public final int getTotalImageCount() {
                return FilteredSearchView.this.totalCount;
            }

            @Override
            public final boolean loadMore() {
                FilteredSearchView filteredSearchView = FilteredSearchView.this;
                if (filteredSearchView.endReached) {
                    return true;
                }
                filteredSearchView.search(filteredSearchView.currentSearchDialogId, filteredSearchView.currentSearchCommunityId, filteredSearchView.currentSearchMinDate, filteredSearchView.currentSearchMaxDate, filteredSearchView.currentSearchFilter, filteredSearchView.currentIncludeFolder, filteredSearchView.lastMessagesSearchString, false);
                return true;
            }
        };
        this.notificationsLocker = new AnimationNotificationsLocker();
        this.hideFloatingDateRunnable = new ComposeDrawable$$ExternalSyntheticLambda0(this, 21);
        this.parentFragment = baseFragment;
        Activity parentActivity = baseFragment.getParentActivity();
        this.parentActivity = parentActivity;
        setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
        ChatActivity.AnonymousClass34 anonymousClass34 = new ChatActivity.AnonymousClass34(this, parentActivity, 23);
        this.recyclerListView = anonymousClass34;
        anonymousClass34.setOnItemClickListener(new PhotoViewer$$ExternalSyntheticLambda61(this, 13));
        anonymousClass34.setOnItemLongClickListener(new Stripe(this, 29));
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1, false);
        this.layoutManager = linearLayoutManager;
        anonymousClass34.setLayoutManager(linearLayoutManager);
        ?? r6 = new FlickerLoadingView(parentActivity) {
            @Override
            public final int getColumnsCount() {
                return FilteredSearchView.this.columnsCount;
            }
        };
        this.loadingView = r6;
        addView(r6);
        addView(anonymousClass34);
        anonymousClass34.setSectionsType(2);
        anonymousClass34.setSkipDrawSection(true);
        anonymousClass34.setOnScrollListener(new AnonymousClass6());
        CalendarActivity.AnonymousClass5 anonymousClass5 = new CalendarActivity.AnonymousClass5(parentActivity);
        this.floatingDateView = anonymousClass5;
        String dateChat = LocaleController.formatDateChat((int) (System.currentTimeMillis() / 1000));
        if (!TextUtils.equals((String) anonymousClass5.this$0, dateChat)) {
            anonymousClass5.this$0 = dateChat;
            ((AnimatedTextView.AnimatedTextDrawable) anonymousClass5.val$daysOfWeek).setText(dateChat, true, true);
        }
        addView(anonymousClass5, LayoutHelper.createFrame(-1, 33.0f, 49, 0.0f, -2.0f, 0.0f, 0.0f));
        this.dialogsAdapter = new OnlyUserFiltersAdapter();
        this.sharedPhotoVideoAdapter = new SharedPhotoVideoAdapter(getContext());
        this.sharedDocumentsAdapter = new SharedDocumentsAdapter(getContext(), 1);
        this.sharedLinksAdapter = new SharedLinksAdapter(getContext());
        this.sharedAudioAdapter = new SharedDocumentsAdapter(getContext(), 4);
        this.sharedVoiceAdapter = new SharedDocumentsAdapter(getContext(), 2);
        StickerEmptyView stickerEmptyView = new StickerEmptyView(1, null, parentActivity, r6);
        this.emptyView = stickerEmptyView;
        addView(stickerEmptyView);
        anonymousClass34.setEmptyView(stickerEmptyView);
        stickerEmptyView.setVisibility(8);
        float f = boolAnimator.floatValue;
        anonymousClass5.setTranslationY((1.0f - f) * (-AndroidUtilities.dp(24.0f)));
        anonymousClass5.setAlpha(f);
        anonymousClass5.setVisibility(f <= 0.0f ? 4 : 0);
    }

    public static void access$400(FilteredSearchView filteredSearchView, MessageObject messageObject, View view, int i) {
        if (!filteredSearchView.uiCallback.actionModeShowing()) {
            filteredSearchView.uiCallback.showActionMode();
        }
        if (filteredSearchView.uiCallback.actionModeShowing()) {
            filteredSearchView.uiCallback.toggleItemSelection(messageObject, view, i);
        }
    }

    public static CharSequence createFromInfoString(MessageObject messageObject, boolean z) {
        return createFromInfoString(messageObject, z, 0, null);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.emojiLoaded) {
            ChatActivity.AnonymousClass34 anonymousClass34 = this.recyclerListView;
            int childCount = anonymousClass34.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                if (anonymousClass34.getChildAt(i3) instanceof DialogCell) {
                    ((DialogCell) anonymousClass34.getChildAt(i3)).update(0, true);
                }
                anonymousClass34.getChildAt(i3).invalidate();
            }
        }
    }

    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ChatActivity$$ExternalSyntheticLambda94 chatActivity$$ExternalSyntheticLambda94 = new ChatActivity$$ExternalSyntheticLambda94(this, 26);
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
        int i = Theme.key_windowBackgroundWhite;
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, i));
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
        StickerEmptyView stickerEmptyView = this.emptyView;
        arrayList.add(new ThemeDescription(stickerEmptyView.title, 4, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(stickerEmptyView.subtitle, 4, null, null, null, null, Theme.key_windowBackgroundWhiteGrayText));
        return arrayList;
    }

    public final void messagesDeleted(long j, ArrayList arrayList) {
        RecyclerListView.SelectionAdapter selectionAdapter;
        int i;
        int i2 = 0;
        boolean z = false;
        while (true) {
            ArrayList arrayList2 = this.messages;
            if (i2 >= arrayList2.size()) {
                break;
            }
            MessageObject messageObject = (MessageObject) arrayList2.get(i2);
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
                    if (messageObject.getId() == ((Integer) arrayList.get(i3)).intValue()) {
                        arrayList2.remove(i2);
                        this.messagesById.remove(messageObject.getId());
                        HashMap map = this.sectionArrays;
                        ArrayList arrayList3 = (ArrayList) map.get(messageObject.monthKey);
                        arrayList3.remove(messageObject);
                        if (arrayList3.size() == 0) {
                            this.sections.remove(messageObject.monthKey);
                            map.remove(messageObject.monthKey);
                        }
                        i2--;
                        this.totalCount--;
                        z = true;
                    }
                }
            }
            i2++;
        }
        if (!z || (selectionAdapter = this.adapter) == null) {
            return;
        }
        selectionAdapter.notifyDataSetChanged();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i = UserConfig.selectedAccount;
        this.lastAccount = i;
        NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.lastAccount).removeObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override
    public final void onFactorChangeFinished(float f, int i) {
    }

    @Override
    public final void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
        if (i == 0) {
            float f3 = this.animatorFloatingDataVisible.floatValue;
            float f4 = (1.0f - f3) * (-AndroidUtilities.dp(24.0f));
            CalendarActivity.AnonymousClass5 anonymousClass5 = this.floatingDateView;
            anonymousClass5.setTranslationY(f4);
            anonymousClass5.setAlpha(f3);
            anonymousClass5.setVisibility(f3 > 0.0f ? 0 : 4);
        }
    }

    public final void onItemClick(int i, ViewGroup viewGroup, MessageObject messageObject, int i2) throws Throwable {
        String str;
        if (messageObject == null) {
            return;
        }
        if (this.uiCallback.actionModeShowing()) {
            this.uiCallback.toggleItemSelection(messageObject, viewGroup, i2);
            return;
        }
        if (viewGroup instanceof DialogCell) {
            this.uiCallback.goToMessage(messageObject);
            return;
        }
        int i3 = this.currentSearchFilter.filterType;
        ArrayList arrayList = this.messages;
        BaseFragment baseFragment = this.parentFragment;
        String string = null;
        if (i3 == 0) {
            PhotoViewer.getInstance().setParentActivity(null, baseFragment, null);
            PhotoViewer.getInstance().openPhoto(arrayList, i, 0L, 0L, 0L, this.provider);
            this.photoViewerClassGuid = PhotoViewer.getInstance().classGuid;
            return;
        }
        if (i3 == 3 || i3 == 5) {
            if (viewGroup instanceof SharedAudioCell) {
                ((SharedAudioCell) viewGroup).didPressedButton();
                return;
            }
            return;
        }
        Activity activity = this.parentActivity;
        if (i3 == 1) {
            if (viewGroup instanceof SharedDocumentCell) {
                SharedDocumentCell sharedDocumentCell = (SharedDocumentCell) viewGroup;
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
                    AndroidUtilities.openDocument(messageObject, activity, baseFragment);
                    return;
                }
                PhotoViewer.getInstance().setParentActivity(null, baseFragment, null);
                int iIndexOf = arrayList.indexOf(messageObject);
                if (iIndexOf >= 0) {
                    PhotoViewer.getInstance().setParentActivity(null, baseFragment, null);
                    PhotoViewer.getInstance().openPhoto(arrayList, iIndexOf, 0L, 0L, 0L, this.provider);
                    this.photoViewerClassGuid = PhotoViewer.getInstance().classGuid;
                    return;
                } else {
                    ArrayList arrayListM = MediaController$$ExternalSyntheticOutline1.m(messageObject);
                    PhotoViewer.getInstance().setParentActivity(null, baseFragment, null);
                    PhotoViewer.getInstance().openPhoto(arrayListM, 0, 0L, 0L, 0L, this.provider);
                    this.photoViewerClassGuid = PhotoViewer.getInstance().classGuid;
                    return;
                }
            }
            return;
        }
        if (i3 == 2) {
            try {
                TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
                TLRPC.WebPage webPage = messageMedia != null ? messageMedia.webpage : null;
                if (webPage == null || (webPage instanceof TLRPC.TL_webPageEmpty)) {
                    str = null;
                } else {
                    if (webPage.cached_page != null) {
                        LaunchActivity launchActivity = LaunchActivity.instance;
                        if (launchActivity == null || launchActivity.getBottomSheetTabs() == null || LaunchActivity.instance.getBottomSheetTabs().tryReopenTab(messageObject) == null) {
                            baseFragment.createArticleViewer(false).open(messageObject, null, null, null);
                            return;
                        }
                        return;
                    }
                    String str2 = webPage.embed_url;
                    if (str2 != null && str2.length() != 0) {
                        EmbedBottomSheet.show(this.parentFragment, messageObject, this.provider, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
                        return;
                    }
                    str = webPage.url;
                }
                if (str == null) {
                    SharedLinkCell sharedLinkCell = (SharedLinkCell) viewGroup;
                    if (sharedLinkCell.links.size() > 0) {
                        string = ((CharSequence) sharedLinkCell.links.get(0)).toString();
                    }
                } else {
                    string = str;
                }
                if (string != null) {
                    if (AndroidUtilities.shouldShowUrlInAlert(string)) {
                        AlertsCreator.showOpenUrlAlert(baseFragment, string, true, true);
                    } else {
                        Browser.openUrl(activity, string);
                    }
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        RecyclerListView.SelectionAdapter selectionAdapter;
        int i3 = this.columnsCount;
        if (!AndroidUtilities.isTablet() && getResources().getConfiguration().orientation == 2) {
            this.columnsCount = 6;
        } else {
            this.columnsCount = 3;
        }
        if (i3 != this.columnsCount && (selectionAdapter = this.adapter) == this.sharedPhotoVideoAdapter) {
            this.ignoreRequestLayout = true;
            selectionAdapter.notifyDataSetChanged();
            this.ignoreRequestLayout = false;
        }
        super.onMeasure(i, i2);
    }

    @Override
    public final void requestLayout() {
        if (this.ignoreRequestLayout) {
            return;
        }
        super.requestLayout();
    }

    public final void search(final long j, final long j2, final long j3, final long j4, final FiltersView.MediaFilterData mediaFilterData, final boolean z, String str, boolean z2) {
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
        FilteredSearchView$$ExternalSyntheticLambda3 filteredSearchView$$ExternalSyntheticLambda3 = this.searchRunnable;
        if (filteredSearchView$$ExternalSyntheticLambda3 != null) {
            AndroidUtilities.cancelRunOnUIThread(filteredSearchView$$ExternalSyntheticLambda3);
        }
        LaunchActivity.AnonymousClass18 anonymousClass18 = this.clearCurrentResultsRunnable;
        AndroidUtilities.cancelRunOnUIThread(anonymousClass18);
        if (z3 && z2) {
            return;
        }
        ArrayList arrayList = this.localTipDates;
        final boolean z5 = z3;
        ArrayList arrayList2 = this.localTipChats;
        StickerEmptyView stickerEmptyView = this.emptyView;
        ArrayList arrayList3 = this.messages;
        if (z4 || (mediaFilterData == null && j2 == 0 && j == 0 && j3 == 0 && j4 == 0)) {
            arrayList3.clear();
            this.sections.clear();
            this.sectionArrays.clear();
            this.isLoading = true;
            stickerEmptyView.setVisibility(0);
            RecyclerListView.SelectionAdapter selectionAdapter = this.adapter;
            if (selectionAdapter != null) {
                selectionAdapter.notifyDataSetChanged();
            }
            this.requestIndex++;
            ChatActivity.AnonymousClass34 anonymousClass34 = this.recyclerListView;
            if (anonymousClass34.getPinnedHeader() != null) {
                anonymousClass34.getPinnedHeader().setAlpha(0.0f);
            }
            arrayList2.clear();
            arrayList.clear();
            if (!z4) {
                return;
            }
        } else if (z2 && !arrayList3.isEmpty()) {
            return;
        } else {
            arrayList3 = arrayList3;
        }
        this.isLoading = true;
        RecyclerListView.SelectionAdapter selectionAdapter2 = this.adapter;
        if (selectionAdapter2 != null) {
            selectionAdapter2.notifyDataSetChanged();
        }
        if (!z5) {
            anonymousClass18.run();
            stickerEmptyView.showProgress(true, !z2);
        }
        if (TextUtils.isEmpty(str2)) {
            arrayList.clear();
            arrayList2.clear();
            Delegate delegate = this.delegate;
            if (delegate != null) {
                ((DialogsActivity$$ExternalSyntheticLambda10) delegate).updateFiltersView(false, null, null, false);
            }
        }
        final int i = this.requestIndex + 1;
        this.requestIndex = i;
        final int i2 = UserConfig.selectedAccount;
        ?? r0 = new Runnable() {
            @Override
            public final void run() throws Throwable {
                long j5;
                int i3;
                int i4;
                int i5;
                String str5;
                Object obj;
                final FilteredSearchView filteredSearchView = this.f$0;
                ArrayList arrayList4 = filteredSearchView.messages;
                String str6 = str2;
                long j6 = j;
                long j7 = j2;
                final FiltersView.MediaFilterData mediaFilterData2 = mediaFilterData;
                int i6 = i2;
                long j8 = j3;
                long j9 = j4;
                boolean z6 = z5;
                ArrayList<Object> arrayList5 = null;
                if (j6 == 0 || j7 != 0) {
                    boolean zIsEmpty = TextUtils.isEmpty(str6);
                    boolean z7 = z;
                    j5 = j8;
                    if (zIsEmpty) {
                        i3 = 20;
                        i4 = 1;
                        i5 = i6;
                        str5 = str6;
                    } else {
                        ArrayList<Object> arrayList6 = new ArrayList<>();
                        str5 = str6;
                        i5 = i6;
                        i3 = 20;
                        i4 = 1;
                        MessagesStorage.getInstance(i6).localSearch(0, str5, arrayList6, new ArrayList<>(), new ArrayList<>(), null, z7 ? 1 : 0);
                        arrayList5 = arrayList6;
                    }
                    TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = new TLRPC.TL_messages_searchGlobal();
                    tL_messages_searchGlobal.limit = i3;
                    tL_messages_searchGlobal.q = str5;
                    tL_messages_searchGlobal.filter = mediaFilterData2 == null ? new TLRPC.TL_inputMessagesFilterEmpty() : mediaFilterData2.filter;
                    tL_messages_searchGlobal.community = MessagesController.getInstance(i5).getInputChannel(j7);
                    if (j5 > 0) {
                        tL_messages_searchGlobal.min_date = (int) (j5 / 1000);
                    }
                    if (j9 > 0) {
                        tL_messages_searchGlobal.max_date = (int) (j9 / 1000);
                    }
                    if (z6 == 0 || !str5.equals(filteredSearchView.lastMessagesSearchString) || arrayList4.isEmpty()) {
                        tL_messages_searchGlobal.offset_rate = 0;
                        tL_messages_searchGlobal.offset_id = 0;
                        tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
                    } else {
                        MessageObject messageObject = (MessageObject) SurfaceContainer$$ExternalSyntheticOutline0.m(i4, arrayList4);
                        tL_messages_searchGlobal.offset_id = messageObject.getId();
                        tL_messages_searchGlobal.offset_rate = filteredSearchView.nextSearchRate;
                        tL_messages_searchGlobal.offset_peer = MessagesController.getInstance(i5).getInputPeer(MessageObject.getPeerId(messageObject.messageOwner.peer_id));
                    }
                    tL_messages_searchGlobal.flags |= i4;
                    tL_messages_searchGlobal.folder_id = z7 ? 1 : 0;
                    obj = tL_messages_searchGlobal;
                } else {
                    TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                    tL_messages_search.q = str6;
                    tL_messages_search.limit = 20;
                    tL_messages_search.filter = mediaFilterData2 == null ? new TLRPC.TL_inputMessagesFilterEmpty() : mediaFilterData2.filter;
                    tL_messages_search.peer = AccountInstance.getInstance(i6).getMessagesController().getInputPeer(j6);
                    if (j8 > 0) {
                        tL_messages_search.min_date = (int) (j8 / 1000);
                    }
                    if (j9 > 0) {
                        tL_messages_search.max_date = (int) (j9 / 1000);
                    }
                    if (z6 && str6.equals(filteredSearchView.lastMessagesSearchString) && !arrayList4.isEmpty()) {
                        tL_messages_search.offset_id = ((MessageObject) SurfaceContainer$$ExternalSyntheticOutline0.m(1, arrayList4)).getId();
                    } else {
                        tL_messages_search.offset_id = 0;
                    }
                    j5 = j8;
                    j6 = j6;
                    obj = tL_messages_search;
                    z6 = z6;
                    i5 = i6;
                    str5 = str6;
                }
                final ArrayList<Object> arrayList7 = arrayList5;
                filteredSearchView.lastMessagesSearchString = str5;
                filteredSearchView.lastSearchFilterQueryString = str3;
                final ArrayList arrayList8 = new ArrayList();
                FiltersView.fillTipDates(filteredSearchView.lastMessagesSearchString, arrayList8);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i5);
                final String str7 = str5;
                final int i7 = i;
                final boolean z8 = z6;
                final long j10 = j6;
                final long j11 = j5;
                final int i8 = i5;
                connectionsManager.sendRequestTyped(obj, new Utilities.Callback2() {
                    @Override
                    public final void run(Object obj2, Object obj3) {
                        final TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) obj2;
                        final TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                        final FilteredSearchView filteredSearchView2 = filteredSearchView;
                        filteredSearchView2.getClass();
                        final ArrayList arrayList9 = new ArrayList();
                        final String str8 = str7;
                        final int i9 = i8;
                        if (tL_error == null) {
                            int size = messages_messages.messages.size();
                            for (int i10 = 0; i10 < size; i10++) {
                                MessageObject messageObject2 = new MessageObject(i9, messages_messages.messages.get(i10), false, true);
                                messageObject2.setQuery(str8);
                                arrayList9.add(messageObject2);
                            }
                        }
                        final ArrayList arrayList10 = arrayList8;
                        final int i11 = i7;
                        final boolean z9 = z8;
                        final FiltersView.MediaFilterData mediaFilterData3 = mediaFilterData2;
                        final long j12 = j10;
                        final long j13 = j11;
                        final ArrayList arrayList11 = arrayList7;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                boolean z10;
                                boolean z11;
                                String string;
                                FilteredSearchView filteredSearchView3 = filteredSearchView2;
                                if (i11 != filteredSearchView3.requestIndex) {
                                    return;
                                }
                                filteredSearchView3.isLoading = false;
                                StickerEmptyView stickerEmptyView2 = filteredSearchView3.emptyView;
                                if (tL_error != null) {
                                    stickerEmptyView2.title.setText(LocaleController.getString(R.string.SearchEmptyViewTitle2));
                                    LinkSpanDrawable.LinksTextView linksTextView = stickerEmptyView2.subtitle;
                                    linksTextView.setVisibility(0);
                                    linksTextView.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                                    stickerEmptyView2.showProgress(false, true);
                                    return;
                                }
                                stickerEmptyView2.showProgress(false, true);
                                TLRPC.messages_Messages messages_messages2 = messages_messages;
                                filteredSearchView3.nextSearchRate = messages_messages2.next_rate;
                                int i12 = i9;
                                MessagesStorage.getInstance(i12).putUsersAndChats(messages_messages2.users, messages_messages2.chats, true, true);
                                MessagesController.getInstance(i12).putUsers(messages_messages2.users, false);
                                MessagesController.getInstance(i12).putChats(messages_messages2.chats, false);
                                ArrayList arrayList12 = filteredSearchView3.sections;
                                SparseArray sparseArray = filteredSearchView3.messagesById;
                                HashMap map = filteredSearchView3.sectionArrays;
                                ArrayList arrayList13 = filteredSearchView3.messages;
                                boolean z12 = z9;
                                if (!z12) {
                                    arrayList13.clear();
                                    sparseArray.clear();
                                    arrayList12.clear();
                                    map.clear();
                                }
                                filteredSearchView3.totalCount = messages_messages2.count;
                                String str9 = str8;
                                filteredSearchView3.currentDataQuery = str9;
                                ArrayList arrayList14 = arrayList9;
                                int size2 = arrayList14.size();
                                int i13 = 0;
                                while (i13 < size2) {
                                    MessageObject messageObject3 = (MessageObject) arrayList14.get(i13);
                                    ArrayList arrayList15 = (ArrayList) map.get(messageObject3.monthKey);
                                    if (arrayList15 == null) {
                                        arrayList15 = new ArrayList();
                                        map.put(messageObject3.monthKey, arrayList15);
                                        arrayList12.add(messageObject3.monthKey);
                                    }
                                    arrayList15.add(messageObject3);
                                    arrayList13.add(messageObject3);
                                    sparseArray.put(messageObject3.getId(), messageObject3);
                                    if (PhotoViewer.getInstance().isVisible()) {
                                        PhotoViewer photoViewer = PhotoViewer.getInstance();
                                        char c = 0;
                                        if (filteredSearchView3.photoViewerClassGuid != photoViewer.classGuid) {
                                            arrayList12 = arrayList12;
                                        } else {
                                            SparseArray[] sparseArrayArr = photoViewer.imagesByIds;
                                            int iIndexOfKey = sparseArrayArr[0].indexOfKey(messageObject3.getId());
                                            ArrayList arrayList16 = photoViewer.imagesArr;
                                            if (iIndexOfKey < 0) {
                                                if (photoViewer.opennedFromMedia) {
                                                    arrayList16.add(messageObject3);
                                                } else {
                                                    arrayList16.add(0, messageObject3);
                                                    c = 0;
                                                }
                                                sparseArrayArr[c].put(messageObject3.getId(), messageObject3);
                                            }
                                            photoViewer.endReached[c] = arrayList16.size() == photoViewer.totalImagesCount;
                                            photoViewer.setImages();
                                        }
                                    } else {
                                        arrayList12 = arrayList12;
                                    }
                                    i13++;
                                    arrayList12 = arrayList12;
                                }
                                if (arrayList13.size() > filteredSearchView3.totalCount) {
                                    filteredSearchView3.totalCount = arrayList13.size();
                                }
                                filteredSearchView3.endReached = arrayList13.size() >= filteredSearchView3.totalCount;
                                boolean zIsEmpty2 = arrayList13.isEmpty();
                                FiltersView.MediaFilterData mediaFilterData4 = mediaFilterData3;
                                if (zIsEmpty2) {
                                    SpoilersTextView spoilersTextView = stickerEmptyView2.title;
                                    LinkSpanDrawable.LinksTextView linksTextView2 = stickerEmptyView2.subtitle;
                                    if (mediaFilterData4 == null) {
                                        spoilersTextView.setText(LocaleController.getString(R.string.SearchEmptyViewTitle2));
                                        linksTextView2.setVisibility(8);
                                    } else if (TextUtils.isEmpty(filteredSearchView3.currentDataQuery) && j12 == 0 && j13 == 0) {
                                        spoilersTextView.setText(LocaleController.getString(R.string.SearchEmptyViewTitle));
                                        int i14 = mediaFilterData4.filterType;
                                        if (i14 == 1) {
                                            string = LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitleFiles);
                                        } else if (i14 == 0) {
                                            string = LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitleMedia);
                                        } else if (i14 == 2) {
                                            string = LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitleLinks);
                                        } else {
                                            string = i14 == 3 ? LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitleMusic) : LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitleVoice);
                                        }
                                        linksTextView2.setVisibility(0);
                                        linksTextView2.setText(string);
                                    } else {
                                        spoilersTextView.setText(LocaleController.getString(R.string.SearchEmptyViewTitle2));
                                        linksTextView2.setVisibility(0);
                                        linksTextView2.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                                    }
                                }
                                FilteredSearchView.OnlyUserFiltersAdapter onlyUserFiltersAdapter = filteredSearchView3.dialogsAdapter;
                                FilteredSearchView.SharedPhotoVideoAdapter sharedPhotoVideoAdapter = filteredSearchView3.sharedPhotoVideoAdapter;
                                if (mediaFilterData4 != null) {
                                    int i15 = mediaFilterData4.filterType;
                                    if (i15 != 0) {
                                        if (i15 == 1) {
                                            filteredSearchView3.adapter = filteredSearchView3.sharedDocumentsAdapter;
                                        } else if (i15 == 2) {
                                            filteredSearchView3.adapter = filteredSearchView3.sharedLinksAdapter;
                                        } else if (i15 == 3) {
                                            filteredSearchView3.adapter = filteredSearchView3.sharedAudioAdapter;
                                        } else if (i15 == 5) {
                                            filteredSearchView3.adapter = filteredSearchView3.sharedVoiceAdapter;
                                        }
                                    } else if (TextUtils.isEmpty(filteredSearchView3.currentDataQuery)) {
                                        filteredSearchView3.adapter = sharedPhotoVideoAdapter;
                                    } else {
                                        filteredSearchView3.adapter = onlyUserFiltersAdapter;
                                    }
                                } else {
                                    filteredSearchView3.adapter = onlyUserFiltersAdapter;
                                }
                                ?? r2 = filteredSearchView3.recyclerListView;
                                RecyclerView.Adapter adapter = r2.getAdapter();
                                RecyclerListView.SelectionAdapter selectionAdapter3 = filteredSearchView3.adapter;
                                if (adapter != selectionAdapter3) {
                                    r2.setAdapter(selectionAdapter3);
                                }
                                if (z12) {
                                    z10 = false;
                                } else {
                                    ArrayList arrayList17 = filteredSearchView3.localTipChats;
                                    arrayList17.clear();
                                    ArrayList arrayList18 = arrayList11;
                                    if (arrayList18 != null) {
                                        arrayList17.addAll(arrayList18);
                                    }
                                    if (str9.length() < 3 || (!LocaleController.getString(R.string.SavedMessages).toLowerCase().startsWith(str9) && !"saved messages".startsWith(str9))) {
                                        z11 = false;
                                        break;
                                    }
                                    int i16 = 0;
                                    while (true) {
                                        if (i16 >= arrayList17.size()) {
                                            z11 = false;
                                            arrayList17.add(0, UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser());
                                            break;
                                        } else {
                                            if ((arrayList17.get(i16) instanceof TLRPC.User) && UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser().id == ((TLRPC.User) arrayList17.get(i16)).id) {
                                                z11 = false;
                                                break;
                                            }
                                            i16++;
                                        }
                                    }
                                    ArrayList arrayList19 = filteredSearchView3.localTipDates;
                                    arrayList19.clear();
                                    arrayList19.addAll(arrayList10);
                                    filteredSearchView3.localTipArchive = z11;
                                    if (str9.length() >= 3 && (LocaleController.getString(R.string.ArchiveSearchFilter).toLowerCase().startsWith(str9) || "archive".startsWith(str9))) {
                                        filteredSearchView3.localTipArchive = true;
                                    }
                                    FilteredSearchView.Delegate delegate2 = filteredSearchView3.delegate;
                                    z10 = z11;
                                    if (delegate2 != null) {
                                        ((DialogsActivity$$ExternalSyntheticLambda10) delegate2).updateFiltersView(TextUtils.isEmpty(filteredSearchView3.currentDataQuery), arrayList17, arrayList19, filteredSearchView3.localTipArchive);
                                        z10 = z11;
                                    }
                                }
                                View view = null;
                                int childAdapterPosition = -1;
                                for (?? r8 = z10; r8 < size2; r8++) {
                                    View childAt = r2.getChildAt(r8);
                                    if (childAt instanceof FlickerLoadingView) {
                                        childAdapterPosition = RecyclerView.getChildAdapterPosition(childAt);
                                        view = childAt;
                                    }
                                }
                                if (view != null) {
                                    r2.removeView(view);
                                }
                                if ((filteredSearchView3.loadingView.getVisibility() == 0 && r2.getChildCount() == 0) || (r2.getAdapter() != sharedPhotoVideoAdapter && view != null)) {
                                    filteredSearchView3.getViewTreeObserver().addOnPreDrawListener(new ChatUsersActivity.AnonymousClass12(filteredSearchView3, (FlickerLoadingView) view, childAdapterPosition, 3));
                                }
                                filteredSearchView3.adapter.notifyDataSetChanged();
                            }
                        });
                    }
                });
            }
        };
        this.searchRunnable = r0;
        AndroidUtilities.runOnUIThread(r0, (!z5 || arrayList3.isEmpty()) ? 350L : 0L);
        AnonymousClass5 anonymousClass5 = this.loadingView;
        if (mediaFilterData == null) {
            anonymousClass5.setViewType(1);
            return;
        }
        int i3 = mediaFilterData.filterType;
        if (i3 == 0) {
            if (TextUtils.isEmpty(this.currentSearchString)) {
                anonymousClass5.setViewType(2);
                return;
            } else {
                anonymousClass5.setViewType(1);
                return;
            }
        }
        if (i3 == 1) {
            anonymousClass5.setViewType(3);
            return;
        }
        if (i3 == 3 || i3 == 5) {
            anonymousClass5.setViewType(4);
        } else if (i3 == 2) {
            anonymousClass5.setViewType(5);
        }
    }

    public void setBlurredBackgroundDrawableFactory(BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory) {
        BlurredBackgroundProviderBuilder blurredBackgroundProviderBuilder = new BlurredBackgroundProviderBuilder(null);
        blurredBackgroundProviderBuilder.backgroundColor = new ContactsActivity$$ExternalSyntheticLambda18(12);
        int i = 402653183;
        int i2 = 385875968;
        blurredBackgroundProviderBuilder.strokeColorTop = new ExoPlayerImpl$$ExternalSyntheticLambda23(i, i2, 2);
        blurredBackgroundProviderBuilder.strokeColorBottom = new ExoPlayerImpl$$ExternalSyntheticLambda23(i, i2, 2);
        int i3 = 0;
        blurredBackgroundProviderBuilder.shadowColor = new ExoPlayerImpl$$ExternalSyntheticLambda23(i3, i3, 2);
        blurredBackgroundProviderBuilder.strokeWidthTop = 1.0f;
        blurredBackgroundProviderBuilder.strokeWidthBottom = 1.0f;
        CalendarActivity.AnonymousClass5 anonymousClass5 = this.floatingDateView;
        BlurredBackgroundDrawable blurredBackgroundDrawableCreate = blurredBackgroundDrawableViewFactory.create(anonymousClass5, blurredBackgroundProviderBuilder, false);
        anonymousClass5.val$headerShadowDrawable = blurredBackgroundDrawableCreate;
        blurredBackgroundDrawableCreate.setRadius(AndroidUtilities.dp(11.5f));
        ((BlurredBackgroundDrawable) anonymousClass5.val$headerShadowDrawable).setPadding(AndroidUtilities.dp(5.0f));
    }

    public void setChatPreviewDelegate(SearchViewPager.ChatPreviewDelegate chatPreviewDelegate) {
        this.chatPreviewDelegate = chatPreviewDelegate;
    }

    public final void setPagesPaddings(int i, int i2, boolean z) {
        setClipToPadding(false);
        this.ignoreRequestLayout = z;
        setPadding(0, i, 0, i2);
        ChatActivity.AnonymousClass34 anonymousClass34 = this.recyclerListView;
        if (z) {
            anonymousClass34.setPaddingWithoutRequestLayout(0, i, 0, i2);
        } else {
            anonymousClass34.setPadding(0, i, 0, i2);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) anonymousClass34.getLayoutParams();
        marginLayoutParams.topMargin = -i;
        marginLayoutParams.bottomMargin = -i2;
        this.ignoreRequestLayout = false;
    }

    public void setUiCallback(UiCallback uiCallback) {
        this.uiCallback = uiCallback;
    }

    public void setUseFromUserAsAvatar(boolean z) {
        this.useFromUserAsAvatar = z;
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
            return messageObject.sponsoredRecommended ? LocaleController.getString(R.string.SponsoredMessage2Recommended) : LocaleController.getString(R.string.SponsoredMessage2);
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
            ColoredImageSpan coloredImageSpan = new ColoredImageSpan(i == 0 ? 2 : 1, ApplicationLoader.applicationContext.getDrawable(i2).mutate());
            if (i == 1 || i == 2) {
                coloredImageSpan.setScale(0.85f);
            }
            SpannableStringBuilder spannableStringBuilder = spannableStringBuilderArr[i];
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
            spannableStringBuilder2.append(Emoji.replaceEmoji(UserObject.getFirstName(user), textPaint != null ? textPaint.getFontMetricsInt() : null, false)).append((char) 8202).append((CharSequence) spannableStringBuilderArr[i]).append((char) 8202).append(charSequenceReplaceEmoji2);
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
