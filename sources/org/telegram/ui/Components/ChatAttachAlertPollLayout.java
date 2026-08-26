package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.collection.LongSparseArray;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.fido.zzfz;
import com.google.android.gms.internal.mlkit_vision_common.zzkl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import me.vkryl.android.animator.BoolAnimator;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AiTonesController$$ExternalSyntheticLambda0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout$$ExternalSyntheticOutline1;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AdjustPanLayoutHelper;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.ArticleViewer;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda33;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.PollCreateCheckCell;
import org.telegram.ui.Cells.PollEditTextCell;
import org.telegram.ui.Cells.ShadowSectionCell;
import org.telegram.ui.Cells.StickerEmojiCell;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Cells.TextCheckCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.ChannelMonetizationLayout$$ExternalSyntheticLambda7;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda112;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda230;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda248;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda305;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda379;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.Components.blur3.drawable.color.impl.BlurredBackgroundProviderImpl;
import org.telegram.ui.Components.poll.PollAttachedMedia;
import org.telegram.ui.Components.poll.PollAttachedMediaPack;
import org.telegram.ui.Components.poll.WebPageLoader;
import org.telegram.ui.Components.poll.attached.PollAttachedMediaFile;
import org.telegram.ui.Components.poll.attached.PollAttachedMediaGallery;
import org.telegram.ui.Components.poll.attached.PollAttachedMediaLink;
import org.telegram.ui.Components.poll.attached.PollAttachedMediaLocation;
import org.telegram.ui.Components.poll.attached.PollAttachedMediaMusic;
import org.telegram.ui.Components.poll.attached.PollAttachedMediaSticker;
import org.telegram.ui.Components.voip.RateCallLayout$$ExternalSyntheticLambda1;
import org.telegram.ui.ContentPreviewViewer;
import org.telegram.ui.Gifts.AuctionBidSheet;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda23;
import org.telegram.ui.IntroActivity;
import org.telegram.ui.LinkManager$$ExternalSyntheticLambda17;
import org.telegram.ui.LoginActivity;
import org.telegram.ui.MessageSeenView;
import org.telegram.ui.OAuthSheet$$ExternalSyntheticLambda13;
import org.telegram.ui.OAuthSheet$$ExternalSyntheticLambda18;
import org.telegram.ui.PaymentFormActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.QrActivity;
import org.telegram.ui.StakedDiceSheet$$ExternalSyntheticLambda6;
import org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda102;
import org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda79;
import org.telegram.ui.Stories.recorder.KeyboardNotifier;
import org.telegram.ui.web.WebActionBar$$ExternalSyntheticLambda9;

public final class ChatAttachAlertPollLayout extends ChatAttachAlert.AttachAlertLayout implements SizeNotifierFrameLayout.SizeNotifierFrameLayoutDelegate, NotificationCenter.NotificationCenterDelegate {
    public static final int $r8$clinit = 0;
    public final int MAX_CAPTION_LENGTH;
    public final int[] POLL_DURATION_OPTIONS;
    public int addAnswerRow;
    public boolean allowAdding;
    public boolean allowAddingOptions;
    public int allowAddingRow;
    public boolean allowMarking;
    public int allowMarkingRow;
    public boolean allowNesterScroll;
    public boolean allowRevoting;
    public boolean anonymousPoll;
    public int answerHeaderRow;
    public int answerSectionRow;
    public int answerStartRow;
    public final CharSequence[] answers;
    public final boolean[] answersChecks;
    public int answersCount;
    public final PollAttachedMediaPack attachedMedia;
    public final ArrayList countriesList;
    public AnonymousClass14 currentAttachAlert;
    public int currentAttachAlertIndex;
    public PollEditTextCell currentCell;
    public PollCreateActivityDelegate delegate;
    public int descriptionRow;
    public Editable descriptionString;
    public boolean destroyed;
    public boolean doneItemEnabled;
    public int emojiPadding;
    public EmojiView emojiView;
    public boolean emojiViewVisible;
    public int emptyRow;
    public boolean hideResults;
    public boolean hintShowed;
    public final HintView hintView;
    public boolean ignoreLayout;
    public boolean isAnimatePopupClosing;
    public boolean isEmojiSearchOpened;
    public final boolean isPremium;
    public final AnonymousClass3 itemAnimator;
    public int keyboardHeight;
    public int keyboardHeightLand;
    public final KeyboardNotifier keyboardNotifier;
    public boolean keyboardVisible;
    public int lastSizeChangeValue1;
    public boolean lastSizeChangeValue2;
    public final AnonymousClass4 layoutManager;
    public final ListAdapter listAdapter;
    public final MessageSeenView.AnonymousClass1 listView;
    public final int maxAnswersCount;
    public boolean multipleChoise;
    public final BubbleActivity.AnonymousClass1 openKeyboardRunnable;
    public int poll2vAllowAddingRow;
    public int poll2vAllowRevotingRow;
    public int poll2vAnonymousRow;
    public int poll2vLimitByCountryListRow;
    public final zzfz poll2vLimitByCountryRow;
    public int poll2vLimitDurationHideResultsRow;
    public int poll2vLimitDurationHideResultsRowInfo;
    public int poll2vLimitDurationRow;
    public int poll2vLimitDurationTimeRow;
    public int poll2vMultipleRow;
    public int poll2vQuizRow;
    public int poll2vShuffleRow;
    public final zzfz poll2vSubscribersOnlyRow;
    public int pollLimitDeadline;
    public int pollLimitDuration;
    public int questionHeaderRow;
    public int questionRow;
    public int questionSectionRow;
    public Editable questionString;
    public final boolean quizOnly;
    public boolean quizPoll;
    public int requestFieldFocusAtPosition;
    public int rowCount;
    public int settingsHeaderRow;
    public int settingsSectionRow;
    public int showMediaHintIndexAfterSmoothScroll;
    public boolean shuffleOptions;
    public boolean smoothScrollToOption;
    public int solutionInfoRow;
    public int solutionRow;
    public int solutionRowHeader;
    public Editable solutionString;
    public final AnonymousClass7 suggestEmojiPanel;
    public final boolean todo;
    public final zzfz[] toggleRows;
    public int topPadding;
    public boolean waitingForKeyboardOpen;
    public boolean wasEmojiSearchOpened;
    public final WebPageLoader webPageLoader;

    public final class AnonymousClass10 implements EmojiView.EmojiViewDelegate {
        public AnonymousClass10() {
        }

        @Override
        public final boolean canAddCaptionToGif() {
            return false;
        }

        @Override
        public final boolean canSchedule() {
            return false;
        }

        @Override
        public final long getDialogId() {
            return 0L;
        }

        @Override
        public final float getProgressToSearchOpened() {
            return 0.0f;
        }

        @Override
        public final int getThreadId() {
            return 0;
        }

        @Override
        public final void invalidateEnterView() {
        }

        @Override
        public final boolean isExpanded() {
            return false;
        }

        @Override
        public final boolean isInScheduleMode() {
            return false;
        }

        @Override
        public final boolean isSearchOpened() {
            return ChatAttachAlertPollLayout.this.isEmojiSearchOpened;
        }

        @Override
        public final boolean isUserSelf() {
            return false;
        }

        @Override
        public final void onAnimatedEmojiUnlockClick() {
        }

        @Override
        public final boolean onBackspace() {
            EditTextBoldCursor editField;
            PollEditTextCell pollEditTextCell = ChatAttachAlertPollLayout.this.currentCell;
            if (pollEditTextCell == null || (editField = pollEditTextCell.getEditField()) == null) {
                return false;
            }
            editField.dispatchKeyEvent(new KeyEvent(0, 67));
            return true;
        }

        @Override
        public final void onClearEmojiRecent() {
            ChatAttachAlertPollLayout chatAttachAlertPollLayout = ChatAttachAlertPollLayout.this;
            AlertDialog.Builder builder = new AlertDialog.Builder(chatAttachAlertPollLayout.getContext(), 0, chatAttachAlertPollLayout.resourcesProvider);
            String string = LocaleController.getString(R.string.ClearRecentEmojiTitle);
            AlertDialog alertDialog = builder.alertDialog;
            alertDialog.title = string;
            alertDialog.message = LocaleController.getString(R.string.ClearRecentEmojiText);
            builder.setPositiveButton(LocaleController.getString(R.string.ClearButton), new ColorPicker$$ExternalSyntheticLambda6(this, 18));
            ArticleViewer.IBlock.CC.m(R.string.Cancel, builder, (AlertDialog.OnButtonClickListener) null);
        }

        @Override
        public final void onCustomEmojiSelected(long j, TLRPC.Document document, String str, boolean z) {
            EditTextBoldCursor editField;
            AnimatedEmojiSpan animatedEmojiSpan;
            PollEditTextCell pollEditTextCell = ChatAttachAlertPollLayout.this.currentCell;
            if (pollEditTextCell == null || (editField = pollEditTextCell.getEditField()) == null) {
                return;
            }
            int selectionEnd = editField.getSelectionEnd();
            if (selectionEnd < 0) {
                selectionEnd = 0;
            }
            try {
                SpannableString spannableString = new SpannableString(str);
                if (document != null) {
                    animatedEmojiSpan = new AnimatedEmojiSpan(document.id, 1.2f, editField.getPaint().getFontMetricsInt());
                    animatedEmojiSpan.document = document;
                } else {
                    animatedEmojiSpan = new AnimatedEmojiSpan(j, 1.2f, editField.getPaint().getFontMetricsInt());
                }
                animatedEmojiSpan.cacheType = 3;
                spannableString.setSpan(animatedEmojiSpan, 0, spannableString.length(), 33);
                editField.setText(editField.getText().insert(selectionEnd, spannableString));
                int length = selectionEnd + spannableString.length();
                editField.setSelection(length, length);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }

        @Override
        public final void onEmojiSelected(String str) {
            EditTextBoldCursor editField;
            PollEditTextCell pollEditTextCell = ChatAttachAlertPollLayout.this.currentCell;
            if (pollEditTextCell == null || (editField = pollEditTextCell.getEditField()) == null) {
                return;
            }
            int selectionEnd = editField.getSelectionEnd();
            if (selectionEnd < 0) {
                selectionEnd = 0;
            }
            try {
                CharSequence charSequenceReplaceEmoji = Emoji.replaceEmoji(str, editField.getPaint().getFontMetricsInt(), false);
                editField.setText(editField.getText().insert(selectionEnd, charSequenceReplaceEmoji));
                int length = selectionEnd + charSequenceReplaceEmoji.length();
                editField.setSelection(length, length);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }

        @Override
        public final void onEmojiSettingsClick(ArrayList arrayList) {
        }

        @Override
        public final void onGifSelected(View view, Object obj, String str, Object obj2, boolean z, int i, int i2) {
        }

        @Override
        public final void onGifSelectedForAddCaption(TLObject tLObject, Object obj) {
        }

        @Override
        public final void onSearchOpenClose(int i) {
            boolean z = i != 0;
            ChatAttachAlertPollLayout chatAttachAlertPollLayout = ChatAttachAlertPollLayout.this;
            chatAttachAlertPollLayout.isEmojiSearchOpened = z;
            chatAttachAlertPollLayout.parentAlert.sizeNotifierFrameLayout.requestLayout();
        }

        @Override
        public final void onShowStickerSet(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z) {
        }

        @Override
        public final void onStickerSelected(StickerEmojiCell stickerEmojiCell, TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z, int i) {
        }

        @Override
        public final void onStickerSetAdd(TLRPC.StickerSetCovered stickerSetCovered) {
        }

        @Override
        public final void onStickerSetRemove(TLRPC.StickerSetCovered stickerSetCovered) {
        }

        @Override
        public final void onStickersGroupClick(long j) {
        }

        @Override
        public final void onStickersSettingsClick() {
        }

        @Override
        public final void onTabOpened(int i) {
        }

        @Override
        public final void showTrendingStickersAlert(TrendingStickersLayout trendingStickersLayout) {
        }
    }

    public final class AnonymousClass13 implements ContentPreviewViewer.ContentPreviewViewerDelegate {
        public final int val$index;

        public AnonymousClass13(int i) {
            this.val$index = i;
        }

        @Override
        public final void addCaptionToGif(TLObject tLObject, Object obj) {
        }

        @Override
        public final void addToFavoriteSelected(String str) {
        }

        @Override
        public final boolean can() {
            return true;
        }

        @Override
        public final boolean canAddCaption() {
            return false;
        }

        @Override
        public final boolean canDeleteSticker() {
            return false;
        }

        @Override
        public final boolean canEditSticker() {
            return false;
        }

        @Override
        public final boolean canSchedule() {
            return false;
        }

        @Override
        public final boolean canSendSticker() {
            return true;
        }

        @Override
        public final Boolean canSetAsStatus(TLRPC.Document document) {
            return null;
        }

        @Override
        public final void copyEmoji(TLRPC.Document document) {
        }

        @Override
        public final void deleteSticker(TLRPC.Document document) {
        }

        @Override
        public final void editSticker(TLRPC.Document document) {
        }

        @Override
        public final ItemOptions getCustomItemOptions(IntroActivity.AnonymousClass1 anonymousClass1) {
            ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions(anonymousClass1, null, new View(ChatAttachAlertPollLayout.this.getContext()));
            itemOptionsMakeOptions.dimAlpha = 0;
            itemOptionsMakeOptions.drawScrim = false;
            int i = R.drawable.msg_replace;
            String string = LocaleController.getString(R.string.ReplaceAttachedPollMedia);
            final int i2 = this.val$index;
            final int i3 = 0;
            itemOptionsMakeOptions.add(i, string, new Runnable(this) {
                public final ChatAttachAlertPollLayout.AnonymousClass13 f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void run() {
                    switch (i3) {
                        case 0:
                            ChatAttachAlertPollLayout.this.openAttachMenuForOptions(i2);
                            break;
                        default:
                            ChatAttachAlertPollLayout.this.setAttachedMedia(i2, null);
                            break;
                    }
                }
            }, false);
            final int i4 = 1;
            itemOptionsMakeOptions.add(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new Runnable(this) {
                public final ChatAttachAlertPollLayout.AnonymousClass13 f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void run() {
                    switch (i4) {
                        case 0:
                            ChatAttachAlertPollLayout.this.openAttachMenuForOptions(i2);
                            break;
                        default:
                            ChatAttachAlertPollLayout.this.setAttachedMedia(i2, null);
                            break;
                    }
                }
            }, true);
            return itemOptionsMakeOptions;
        }

        @Override
        public final long getDialogId() {
            return 0L;
        }

        @Override
        public final TLRPC.TL_messageMediaPoll getPoll() {
            return null;
        }

        @Override
        public final TLRPC.PollAnswer getPollAnswer() {
            return null;
        }

        @Override
        public final MessageObject getPollMessageObject() {
            return null;
        }

        @Override
        public final String getQuery(boolean z) {
            return null;
        }

        @Override
        public final void gifAddedOrDeleted() {
        }

        @Override
        public final boolean isInScheduleMode() {
            return false;
        }

        @Override
        public final boolean isPhotoEditor() {
            return false;
        }

        @Override
        public final boolean isReplacedSticker() {
            return false;
        }

        @Override
        public final boolean isSettingIntroSticker() {
            return false;
        }

        @Override
        public final boolean isStickerEditor() {
            return false;
        }

        @Override
        public final boolean needCopy(TLRPC.Document document) {
            return false;
        }

        @Override
        public final boolean needOpen() {
            return true;
        }

        @Override
        public final boolean needRemove() {
            return false;
        }

        @Override
        public final boolean needRemoveFromRecent(TLRPC.Document document) {
            return false;
        }

        @Override
        public final boolean needSend(int i) {
            return false;
        }

        @Override
        public final void newStickerPackSelected(CharSequence charSequence, String str, OAuthSheet$$ExternalSyntheticLambda13 oAuthSheet$$ExternalSyntheticLambda13) {
        }

        @Override
        public final void openSet(TLRPC.InputStickerSet inputStickerSet, boolean z) {
        }

        @Override
        public final void remove(SendMessagesHelper.ImportingSticker importingSticker) {
        }

        @Override
        public final void removeFromRecent(TLRPC.Document document) {
        }

        @Override
        public final void resetTouch() {
        }

        @Override
        public final void retractVote() {
        }

        @Override
        public final void sendEmoji(TLRPC.Document document) {
        }

        @Override
        public final void sendGif(int i, int i2, Object obj, TLObject tLObject, boolean z) {
        }

        @Override
        public final void sendSticker(String str) {
        }

        @Override
        public final void sendVote() {
        }

        @Override
        public final void setAsEmojiStatus(TLRPC.Document document) {
        }

        @Override
        public final void setIntroSticker(String str) {
        }

        @Override
        public final void stickerSetSelected(TLRPC.StickerSet stickerSet, String str) {
        }

        @Override
        public final void sendSticker(TLRPC.Document document, String str, Object obj, boolean z, int i, int i2) {
        }
    }

    public final class AnonymousClass4 extends FillLastLinearLayoutManager {
        public final int $r8$classId;
        public final ChatAttachAlert.AttachAlertLayout this$0;

        public AnonymousClass4(ChatAttachAlert.AttachAlertLayout attachAlertLayout, int i, RecyclerListView recyclerListView, int i2) {
            super(i, 0, recyclerListView);
            this.$r8$classId = i2;
            this.this$0 = attachAlertLayout;
        }

        @Override
        public int[] getChildRectangleOnScreenScrollAmount(View view, Rect rect) {
            switch (this.$r8$classId) {
                case 0:
                    int paddingBottom = this.mHeight - getPaddingBottom();
                    int top = (view.getTop() + rect.top) - view.getScrollY();
                    int iHeight = rect.height() + top;
                    int iMin = Math.min(0, top);
                    int iMax = Math.max(0, iHeight - paddingBottom);
                    if (iMin == 0) {
                        iMin = Math.min(top, iMax);
                    }
                    return new int[]{0, iMin};
                default:
                    return super.getChildRectangleOnScreenScrollAmount(view, rect);
            }
        }

        @Override
        public final void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
            switch (this.$r8$classId) {
                case 0:
                    LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(recyclerView.getContext()) {
                        @Override
                        public final int calculateDyToMakeVisible(int i2, View view) {
                            int i3;
                            AnonymousClass4 anonymousClass4 = AnonymousClass4.this;
                            if (((ChatAttachAlertPollLayout) anonymousClass4.this$0).smoothScrollToOption) {
                                i2 = -1;
                            }
                            int iCalculateDyToMakeVisible = super.calculateDyToMakeVisible(i2, view);
                            ChatAttachAlertPollLayout chatAttachAlertPollLayout = (ChatAttachAlertPollLayout) anonymousClass4.this$0;
                            if (chatAttachAlertPollLayout.smoothScrollToOption) {
                                iCalculateDyToMakeVisible += AndroidUtilities.dp(160.0f);
                            }
                            if (!chatAttachAlertPollLayout.smoothScrollToOption) {
                                iCalculateDyToMakeVisible = RichMessageLayout$$ExternalSyntheticOutline1.m(chatAttachAlertPollLayout.topPadding - AndroidUtilities.statusBarHeight, 7.0f, iCalculateDyToMakeVisible);
                            }
                            if (chatAttachAlertPollLayout.smoothScrollToOption && iCalculateDyToMakeVisible == 0 && (i3 = chatAttachAlertPollLayout.showMediaHintIndexAfterSmoothScroll) >= 0) {
                                ChatAttachAlertPollLayout.access$1200(chatAttachAlertPollLayout, i3);
                                chatAttachAlertPollLayout.showMediaHintIndexAfterSmoothScroll = -1;
                            }
                            chatAttachAlertPollLayout.smoothScrollToOption = false;
                            return iCalculateDyToMakeVisible;
                        }

                        @Override
                        public final int calculateTimeForDeceleration(int i2) {
                            return super.calculateTimeForDeceleration(i2) * 2;
                        }
                    };
                    linearSmoothScroller.mTargetPosition = i;
                    startSmoothScroll(linearSmoothScroller);
                    break;
                case 1:
                    final Context context = recyclerView.getContext();
                    LinearSmoothScroller linearSmoothScroller2 = new LinearSmoothScroller(context) {
                        @Override
                        public final int calculateDyToMakeVisible(int i2, View view) {
                            return RichMessageLayout$$ExternalSyntheticOutline1.m(((ChatAttachAlertQuickRepliesLayout) this.this$1.this$0).listView.getPaddingTop() - AndroidUtilities.statusBarHeight, 8.0f, super.calculateDyToMakeVisible(i2, view));
                        }

                        @Override
                        public final int calculateTimeForDeceleration(int i2) {
                            return super.calculateTimeForDeceleration(i2) * 2;
                        }
                    };
                    linearSmoothScroller2.mTargetPosition = i;
                    startSmoothScroll(linearSmoothScroller2);
                    break;
                case 2:
                    final Context context2 = recyclerView.getContext();
                    LinearSmoothScroller linearSmoothScroller3 = new LinearSmoothScroller(context2) {
                        @Override
                        public final int calculateDyToMakeVisible(int i2, View view) {
                            return RichMessageLayout$$ExternalSyntheticOutline1.m(((ChatAttachAlertContactsLayout) this.this$1.this$0).listView.getPaddingTop() - AndroidUtilities.statusBarHeight, 8.0f, super.calculateDyToMakeVisible(i2, view));
                        }

                        @Override
                        public final int calculateTimeForDeceleration(int i2) {
                            return super.calculateTimeForDeceleration(i2) * 2;
                        }
                    };
                    linearSmoothScroller3.mTargetPosition = i;
                    startSmoothScroll(linearSmoothScroller3);
                    break;
                case 3:
                    final Context context3 = recyclerView.getContext();
                    LinearSmoothScroller linearSmoothScroller4 = new LinearSmoothScroller(context3) {
                        @Override
                        public final int calculateDyToMakeVisible(int i2, View view) {
                            return RichMessageLayout$$ExternalSyntheticOutline1.m(((ChatAttachAlertDocumentLayout) this.this$1.this$0).listView.getPaddingTop() - AndroidUtilities.statusBarHeight, 56.0f, super.calculateDyToMakeVisible(i2, view));
                        }

                        @Override
                        public final int calculateTimeForDeceleration(int i2) {
                            return super.calculateTimeForDeceleration(i2) * 2;
                        }
                    };
                    linearSmoothScroller4.mTargetPosition = i;
                    startSmoothScroll(linearSmoothScroller4);
                    break;
                default:
                    final Context context4 = recyclerView.getContext();
                    LinearSmoothScroller linearSmoothScroller5 = new LinearSmoothScroller(context4) {
                        @Override
                        public final int calculateDyToMakeVisible(int i2, View view) {
                            int iCalculateDyToMakeVisible = super.calculateDyToMakeVisible(i2, view);
                            ChatAttachAlertPollLayout.AnonymousClass4 anonymousClass4 = this.this$1;
                            int paddingTop = ((ChatAttachAlertLocationLayout) anonymousClass4.this$0).listView.getPaddingTop();
                            ChatAttachAlertLocationLayout chatAttachAlertLocationLayout = (ChatAttachAlertLocationLayout) anonymousClass4.this$0;
                            return iCalculateDyToMakeVisible - (paddingTop - (chatAttachAlertLocationLayout.mapHeight - chatAttachAlertLocationLayout.overScrollHeight));
                        }

                        @Override
                        public final int calculateTimeForDeceleration(int i2) {
                            return super.calculateTimeForDeceleration(i2) * 4;
                        }
                    };
                    linearSmoothScroller5.mTargetPosition = i;
                    startSmoothScroll(linearSmoothScroller5);
                    break;
            }
        }

        public AnonymousClass4(ChatAttachAlertLocationLayout chatAttachAlertLocationLayout, ChatActivity.AnonymousClass34 anonymousClass34) {
            super(0, 0, anonymousClass34);
            this.$r8$classId = 4;
            this.this$0 = chatAttachAlertLocationLayout;
        }
    }

    public final class AnonymousClass7 extends SuggestEmojiView {
        @Override
        public final int emojiCacheType() {
            return 3;
        }
    }

    public final class AnonymousClass8 extends AnimatorListenerAdapter {
        public final int $r8$classId;
        public final ChatAttachAlertPollLayout this$0;

        public AnonymousClass8(ChatAttachAlertPollLayout chatAttachAlertPollLayout, int i) {
            this.$r8$classId = i;
            this.this$0 = chatAttachAlertPollLayout;
        }

        @Override
        public final void onAnimationEnd(Animator animator) {
            switch (this.$r8$classId) {
                case 0:
                    this.this$0.emojiView.setTranslationY(0.0f);
                    break;
                case 1:
                    this.this$0.emojiView.setTranslationY(0.0f);
                    break;
                default:
                    ChatAttachAlertPollLayout chatAttachAlertPollLayout = this.this$0;
                    chatAttachAlertPollLayout.isAnimatePopupClosing = false;
                    chatAttachAlertPollLayout.emojiView.setTranslationY(0.0f);
                    chatAttachAlertPollLayout.hideEmojiView();
                    break;
            }
        }
    }

    public final class ListAdapter extends RecyclerListView.SelectionAdapter {
        public final Context mContext;

        public ListAdapter(Context context) {
            this.mContext = context;
        }

        @Override
        public final int getItemCount() {
            return ChatAttachAlertPollLayout.this.rowCount;
        }

        @Override
        public final int getItemViewType(int i) {
            ChatAttachAlertPollLayout chatAttachAlertPollLayout = ChatAttachAlertPollLayout.this;
            if (i == chatAttachAlertPollLayout.poll2vAnonymousRow || i == chatAttachAlertPollLayout.poll2vMultipleRow || i == chatAttachAlertPollLayout.poll2vQuizRow || i == chatAttachAlertPollLayout.poll2vAllowAddingRow || i == chatAttachAlertPollLayout.poll2vAllowRevotingRow || i == chatAttachAlertPollLayout.poll2vShuffleRow || i == chatAttachAlertPollLayout.poll2vLimitDurationRow || i == chatAttachAlertPollLayout.poll2vSubscribersOnlyRow.zzb || i == chatAttachAlertPollLayout.poll2vLimitByCountryRow.zzb) {
                return 10;
            }
            if (i == chatAttachAlertPollLayout.questionHeaderRow || i == chatAttachAlertPollLayout.answerHeaderRow || i == chatAttachAlertPollLayout.settingsHeaderRow || i == chatAttachAlertPollLayout.solutionRowHeader) {
                return 0;
            }
            if (i == chatAttachAlertPollLayout.questionSectionRow) {
                return 1;
            }
            if (i == chatAttachAlertPollLayout.answerSectionRow || i == chatAttachAlertPollLayout.settingsSectionRow || i == chatAttachAlertPollLayout.solutionInfoRow || i == chatAttachAlertPollLayout.poll2vLimitDurationHideResultsRowInfo) {
                return 2;
            }
            if (i == chatAttachAlertPollLayout.addAnswerRow || i == chatAttachAlertPollLayout.poll2vLimitDurationTimeRow || i == chatAttachAlertPollLayout.poll2vLimitByCountryListRow) {
                return 3;
            }
            if (i == chatAttachAlertPollLayout.questionRow) {
                return 4;
            }
            if (i == chatAttachAlertPollLayout.descriptionRow) {
                return 11;
            }
            if (i == chatAttachAlertPollLayout.solutionRow) {
                return 7;
            }
            if (i == chatAttachAlertPollLayout.allowAddingRow || i == chatAttachAlertPollLayout.allowMarkingRow || i == chatAttachAlertPollLayout.poll2vLimitDurationHideResultsRow) {
                return 6;
            }
            if (i == chatAttachAlertPollLayout.emptyRow) {
                return 8;
            }
            return i == 0 ? 9 : 5;
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            int adapterPosition = viewHolder.getAdapterPosition();
            ChatAttachAlertPollLayout chatAttachAlertPollLayout = ChatAttachAlertPollLayout.this;
            return adapterPosition == chatAttachAlertPollLayout.addAnswerRow || adapterPosition == chatAttachAlertPollLayout.poll2vQuizRow || adapterPosition == chatAttachAlertPollLayout.poll2vAnonymousRow || adapterPosition == chatAttachAlertPollLayout.poll2vMultipleRow || adapterPosition == chatAttachAlertPollLayout.poll2vAllowAddingRow || adapterPosition == chatAttachAlertPollLayout.poll2vLimitDurationRow || adapterPosition == chatAttachAlertPollLayout.poll2vAllowRevotingRow || adapterPosition == chatAttachAlertPollLayout.poll2vShuffleRow || adapterPosition == chatAttachAlertPollLayout.poll2vLimitDurationTimeRow || adapterPosition == chatAttachAlertPollLayout.poll2vLimitDurationHideResultsRow || adapterPosition == chatAttachAlertPollLayout.poll2vLimitByCountryRow.zzb || adapterPosition == chatAttachAlertPollLayout.poll2vSubscribersOnlyRow.zzb || adapterPosition == chatAttachAlertPollLayout.poll2vLimitByCountryListRow;
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            String countryName;
            boolean z = true;
            int i2 = viewHolder.mItemViewType;
            ChatAttachAlertPollLayout chatAttachAlertPollLayout = ChatAttachAlertPollLayout.this;
            View view = viewHolder.itemView;
            if (i2 == 0) {
                HeaderCell headerCell = (HeaderCell) view;
                int i3 = chatAttachAlertPollLayout.questionHeaderRow;
                boolean z2 = chatAttachAlertPollLayout.todo;
                if (i == i3) {
                    headerCell.getTextView().setGravity(19);
                    headerCell.setText(LocaleController.getString(z2 ? R.string.TodoTitle : R.string.PollQuestion2));
                    return;
                }
                if (i == chatAttachAlertPollLayout.solutionRowHeader) {
                    headerCell.getTextView().setGravity(19);
                    headerCell.setText(LocaleController.getString(R.string.AddAnExplanationHeader));
                    return;
                }
                headerCell.getTextView().setGravity((LocaleController.isRTL ? 5 : 3) | 16);
                if (i != chatAttachAlertPollLayout.answerHeaderRow) {
                    if (i == chatAttachAlertPollLayout.settingsHeaderRow) {
                        headerCell.setText(LocaleController.getString(R.string.Settings));
                        return;
                    }
                    return;
                } else if (chatAttachAlertPollLayout.quizOnly) {
                    headerCell.setText(LocaleController.getString(R.string.QuizAnswers));
                    return;
                } else {
                    headerCell.setText(LocaleController.getString(z2 ? R.string.TodoItemsTitle : R.string.AnswerOptions2));
                    return;
                }
            }
            if (i2 == 6) {
                TextCheckCell textCheckCell = (TextCheckCell) view;
                if (i == chatAttachAlertPollLayout.allowAddingRow) {
                    textCheckCell.setTextAndCheck(LocaleController.getString(R.string.TodoAllowAddingTasks), chatAttachAlertPollLayout.allowAdding, chatAttachAlertPollLayout.allowMarkingRow != -1);
                    textCheckCell.setEnabled(null, true);
                    return;
                } else if (i == chatAttachAlertPollLayout.allowMarkingRow) {
                    textCheckCell.setTextAndCheck(LocaleController.getString(R.string.TodoAllowMarkingDone), chatAttachAlertPollLayout.allowMarking, false);
                    textCheckCell.setEnabled(null, true);
                    return;
                } else {
                    if (i == chatAttachAlertPollLayout.poll2vLimitDurationHideResultsRow) {
                        textCheckCell.setTextAndCheck(LocaleController.getString(R.string.PollV2HideResults), chatAttachAlertPollLayout.hideResults, false);
                        textCheckCell.setEnabled(null, true);
                        return;
                    }
                    return;
                }
            }
            Context context = this.mContext;
            if (i2 == 2) {
                TextInfoPrivacyCell textInfoPrivacyCell = (TextInfoPrivacyCell) view;
                textInfoPrivacyCell.setFixedSize(0);
                new CombinedDrawable(new ColorDrawable(Theme.getColor(Theme.key_windowBackgroundGray, chatAttachAlertPollLayout.resourcesProvider)), Theme.getThemedDrawableByKey(context, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow)).fullSize = true;
                if (i == chatAttachAlertPollLayout.solutionInfoRow) {
                    textInfoPrivacyCell.setText(LocaleController.getString(R.string.AddAnExplanationInfo));
                    return;
                }
                if (i == chatAttachAlertPollLayout.settingsSectionRow) {
                    textInfoPrivacyCell.setFixedSize(12);
                    textInfoPrivacyCell.setText(null);
                    return;
                }
                int i4 = chatAttachAlertPollLayout.maxAnswersCount - chatAttachAlertPollLayout.answersCount;
                boolean z3 = chatAttachAlertPollLayout.todo;
                if (i4 <= 0) {
                    textInfoPrivacyCell.setText(LocaleController.getString(z3 ? R.string.TodoAddTaskInfoMax : R.string.AddAnOptionInfoMax));
                    return;
                }
                if (z3) {
                    textInfoPrivacyCell.setText(LocaleController.formatPluralStringComma("TodoNewTaskInfo", i4));
                    return;
                } else if (i == chatAttachAlertPollLayout.poll2vLimitDurationHideResultsRowInfo) {
                    textInfoPrivacyCell.setText(LocaleController.getString(R.string.PollV2HideResultsInfo));
                    return;
                } else {
                    textInfoPrivacyCell.setText(LocaleController.formatString(R.string.AddAnOptionInfo, LocaleController.formatPluralString("Option", i4, new Object[0])));
                    return;
                }
            }
            if (i2 == 3) {
                TextCell textCell = (TextCell) view;
                if (i == chatAttachAlertPollLayout.poll2vLimitByCountryListRow) {
                    String string = LocaleController.getString(R.string.PollV2AllowedCountries);
                    ArrayList arrayList = chatAttachAlertPollLayout.countriesList;
                    if (arrayList.isEmpty()) {
                        countryName = LocaleController.getString(R.string.SearchCountriesSelect);
                    } else {
                        countryName = arrayList.size() == 1 ? LocaleController.getCountryName((String) arrayList.get(0)) : LocaleController.formatPluralString("PollV2AllowedCountriesListManyP", arrayList.size(), new Object[0]);
                    }
                    textCell.setTextAndValue(string, countryName, false, true);
                    return;
                }
                if (i == chatAttachAlertPollLayout.poll2vLimitDurationTimeRow) {
                    chatAttachAlertPollLayout.checkDurationInfoRow(textCell, false);
                    return;
                }
                textCell.setColors(-1, Theme.key_telegram_color_text);
                Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
                Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
                int i5 = Theme.key_switchTrackChecked;
                Theme.ResourcesProvider resourcesProvider = chatAttachAlertPollLayout.resourcesProvider;
                int color = Theme.getColor(i5, resourcesProvider);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                drawable.setColorFilter(new PorterDuffColorFilter(color, mode));
                drawable2.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_checkboxCheck, resourcesProvider), mode));
                textCell.setTextAndIcon((CharSequence) LocaleController.getString(chatAttachAlertPollLayout.todo ? R.string.TodoNewTask : R.string.AddAnOption), (Drawable) new CombinedDrawable(drawable, drawable2), false);
                textCell.imageLeft = 20;
                textCell.offsetFromImage = 58;
                return;
            }
            if (i2 == 9) {
                view.requestLayout();
                return;
            }
            if (i2 != 10) {
                return;
            }
            PollCreateCheckCell pollCreateCheckCell = (PollCreateCheckCell) view;
            pollCreateCheckCell.setDivider(false);
            if (i == chatAttachAlertPollLayout.poll2vAnonymousRow) {
                pollCreateCheckCell.setTextAndValueAndIconAndCheck(LocaleController.getString(R.string.PollV2ShowWhoVoted), LocaleController.getString(R.string.PollV2ShowWhoVotedInfo), 1, R.drawable.filled_poll_view_24, !chatAttachAlertPollLayout.anonymousPoll);
            } else if (i == chatAttachAlertPollLayout.poll2vMultipleRow) {
                pollCreateCheckCell.setTextAndValueAndIconAndCheck(LocaleController.getString(R.string.PollV2AllowMultipleAnswers), LocaleController.getString(R.string.PollV2AllowMultipleAnswersInfo), 5, R.drawable.filled_poll_multiple_24, chatAttachAlertPollLayout.multipleChoise);
            } else if (i == chatAttachAlertPollLayout.poll2vAllowRevotingRow) {
                pollCreateCheckCell.setTextAndValueAndIconAndCheck(LocaleController.getString(R.string.PollV2AllowRevoting), LocaleController.getString(R.string.PollV2AllowRevotingInfo), 10, R.drawable.filled_poll_revote_24, chatAttachAlertPollLayout.allowRevoting);
            } else if (i == chatAttachAlertPollLayout.poll2vAllowAddingRow) {
                pollCreateCheckCell.setTextAndValueAndIconAndCheck(LocaleController.getString(R.string.PollV2AllowAddingOptions), LocaleController.getString(R.string.PollV2AllowAddingOptionsInfo), 9, R.drawable.filled_poll_add_24, chatAttachAlertPollLayout.allowAddingOptions);
            } else if (i == chatAttachAlertPollLayout.poll2vShuffleRow) {
                pollCreateCheckCell.setTextAndValueAndIconAndCheck(LocaleController.getString(R.string.PollV2ShuffleOptions), LocaleController.getString(R.string.PollV2ShuffleOptionsInfo), 6, R.drawable.filled_poll_shuffle_24, chatAttachAlertPollLayout.shuffleOptions);
            } else if (i == chatAttachAlertPollLayout.poll2vQuizRow) {
                pollCreateCheckCell.setTextAndValueAndIconAndCheck(LocaleController.getString(R.string.PollV2SetCorrectAnswer), LocaleController.getString(R.string.PollV2SetCorrectAnswerInfo), 7, R.drawable.filled_poll_correct_24, chatAttachAlertPollLayout.quizPoll);
            } else {
                zzfz zzfzVar = chatAttachAlertPollLayout.poll2vLimitByCountryRow;
                if (i == zzfzVar.zzb) {
                    pollCreateCheckCell.setTextAndValueAndIconAndCheck(LocaleController.getString(R.string.PollV2LimitByCountry), LocaleController.getString(R.string.PollV2LimitByCountryInfo), 4, R.drawable.filled_location, zzfzVar.zzc);
                } else {
                    zzfz zzfzVar2 = chatAttachAlertPollLayout.poll2vSubscribersOnlyRow;
                    if (i == zzfzVar2.zzb) {
                        pollCreateCheckCell.setTextAndValueAndIconAndCheck(LocaleController.getString(R.string.PollV2RestrictToSubscribers), LocaleController.getString(R.string.PollV2RestrictToSubscribersInfo), 3, R.drawable.msg_folders_groups, zzfzVar2.zzc);
                    } else if (i == chatAttachAlertPollLayout.poll2vLimitDurationRow) {
                        pollCreateCheckCell.setTextAndValueAndIconAndCheck(LocaleController.getString(R.string.PollV2LimitDuration), LocaleController.getString(R.string.PollV2LimitDurationInfo), 8, R.drawable.filled_poll_deadline_24, (chatAttachAlertPollLayout.pollLimitDuration == 0 && chatAttachAlertPollLayout.pollLimitDeadline == 0) ? false : true);
                        pollCreateCheckCell.setDivider((chatAttachAlertPollLayout.pollLimitDuration == 0 && chatAttachAlertPollLayout.pollLimitDeadline == 0) ? false : true);
                    }
                }
            }
            if (i == chatAttachAlertPollLayout.poll2vQuizRow) {
                pollCreateCheckCell.getCheckBox().animatorIconVisibility.setValue(chatAttachAlertPollLayout.quizOnly, false);
                return;
            }
            if (i != chatAttachAlertPollLayout.poll2vAllowAddingRow) {
                pollCreateCheckCell.getCheckBox().animatorIconVisibility.setValue(false, false);
                return;
            }
            Switch checkBox = pollCreateCheckCell.getCheckBox();
            if (!chatAttachAlertPollLayout.quizPoll && !chatAttachAlertPollLayout.anonymousPoll) {
                z = false;
            }
            checkBox.animatorIconVisibility.setValue(z, false);
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, final int i) {
            ?? headerCell;
            Object obj;
            Context context = this.mContext;
            ChatAttachAlertPollLayout chatAttachAlertPollLayout = ChatAttachAlertPollLayout.this;
            switch (i) {
                case 0:
                    headerCell = new HeaderCell(this.mContext, Theme.key_windowBackgroundWhiteBlueHeader, 21, 15, 0, false, false, chatAttachAlertPollLayout.resourcesProvider);
                    break;
                case 1:
                    Theme.ResourcesProvider resourcesProvider = chatAttachAlertPollLayout.resourcesProvider;
                    ShadowSectionCell shadowSectionCell = new ShadowSectionCell(context, (Object) null);
                    new CombinedDrawable(new ColorDrawable(Theme.getColor(Theme.key_windowBackgroundGray, chatAttachAlertPollLayout.resourcesProvider)), Theme.getThemedDrawableByKey(context, R.drawable.greydivider, Theme.key_windowBackgroundGrayShadow)).fullSize = true;
                    headerCell = shadowSectionCell;
                    break;
                case 2:
                    headerCell = new TextInfoPrivacyCell(context, 24, chatAttachAlertPollLayout.resourcesProvider);
                    break;
                case 3:
                    headerCell = new TextCell(23, this.mContext, chatAttachAlertPollLayout.resourcesProvider, false, false);
                    break;
                case 4:
                case 11:
                    final ?? r0 = new PollEditTextCell(this.mContext, chatAttachAlertPollLayout.isPremium ? 1 : 0, chatAttachAlertPollLayout.resourcesProvider) {
                        @Override
                        public final void onActionModeStart(AuctionBidSheet.AnonymousClass4 anonymousClass4, ActionMode actionMode) {
                            ChatAttachAlertPollLayout chatAttachAlertPollLayout2 = ChatAttachAlertPollLayout.this;
                            if (!chatAttachAlertPollLayout2.todo && i == 11 && anonymousClass4.isFocused() && anonymousClass4.hasSelection()) {
                                Menu menu = actionMode.getMenu();
                                if (menu.findItem(16908321) == null) {
                                    return;
                                }
                                ChatActivity.fillActionModeMenu(menu, ((ChatActivity) chatAttachAlertPollLayout2.parentAlert.baseFragment).currentEncryptedChat, false, true, true, true);
                            }
                        }

                        @Override
                        public final void onEditTextFocusChanged(boolean z) {
                            ChatAttachAlertPollLayout.access$6700(ChatAttachAlertPollLayout.this, this, z);
                        }

                        @Override
                        public final void onEmojiButtonClicked(PollEditTextCell pollEditTextCell) {
                            ChatAttachAlertPollLayout chatAttachAlertPollLayout2 = ChatAttachAlertPollLayout.this;
                            chatAttachAlertPollLayout2.currentCell = pollEditTextCell;
                            if (!chatAttachAlertPollLayout2.emojiViewVisible) {
                                chatAttachAlertPollLayout2.showEmojiPopup(1);
                            } else {
                                chatAttachAlertPollLayout2.collapseSearchEmojiView();
                                chatAttachAlertPollLayout2.openKeyboardInternal$1();
                            }
                        }

                        @Override
                        public final void onFieldTouchUp(AuctionBidSheet.AnonymousClass4 anonymousClass4) {
                            ChatAttachAlertPollLayout.this.parentAlert.makeFocusable(anonymousClass4, true);
                        }

                        @Override
                        public final boolean onPastedMultipleLines(ArrayList arrayList) {
                            ChatAttachAlertPollLayout chatAttachAlertPollLayout2;
                            if (arrayList.isEmpty()) {
                                return false;
                            }
                            AuctionBidSheet.AnonymousClass4 anonymousClass4 = this.textView;
                            anonymousClass4.getText().replace(anonymousClass4.getSelectionStart(), anonymousClass4.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                            int i2 = 0;
                            while (true) {
                                boolean zIsEmpty = arrayList.isEmpty();
                                chatAttachAlertPollLayout2 = ChatAttachAlertPollLayout.this;
                                if (zIsEmpty || i2 >= chatAttachAlertPollLayout2.maxAnswersCount) {
                                    break;
                                }
                                for (int length = chatAttachAlertPollLayout2.answers.length - 1; length > i2; length--) {
                                    CharSequence[] charSequenceArr = chatAttachAlertPollLayout2.answers;
                                    charSequenceArr[length] = charSequenceArr[length - 1];
                                }
                                chatAttachAlertPollLayout2.answers[i2] = (CharSequence) arrayList.remove(0);
                                chatAttachAlertPollLayout2.answersCount++;
                                i2++;
                            }
                            chatAttachAlertPollLayout2.updateRows$5();
                            chatAttachAlertPollLayout2.requestFieldFocusAtPosition = (chatAttachAlertPollLayout2.answerStartRow + i2) - 1;
                            chatAttachAlertPollLayout2.listView.setItemAnimator(chatAttachAlertPollLayout2.itemAnimator);
                            chatAttachAlertPollLayout2.listAdapter.mObservable.notifyChanged();
                            return true;
                        }
                    };
                    if (i == 11 && !chatAttachAlertPollLayout.todo) {
                        r0.setTextRight(98);
                        final int i2 = 2;
                        r0.addAttachView().setOnClickListener(new View.OnClickListener(this) {
                            public final ChatAttachAlertPollLayout.ListAdapter f$0;

                            {
                                this.f$0 = this;
                            }

                            @Override
                            public final void onClick(View view) {
                                switch (i2) {
                                    case 0:
                                        ChatAttachAlertPollLayout.ListAdapter listAdapter = this.f$0;
                                        listAdapter.getClass();
                                        ChatAttachAlertPollLayout.this.deletePollAnswerView(view, (PollEditTextCell) view.getParent(), true);
                                        break;
                                    case 1:
                                        ChatAttachAlertPollLayout chatAttachAlertPollLayout2 = ChatAttachAlertPollLayout.this;
                                        if (((PollAttachedMedia) chatAttachAlertPollLayout2.attachedMedia.medias.get(-3)) == null) {
                                            chatAttachAlertPollLayout2.openAttachMenuForOptions(-3);
                                        } else {
                                            chatAttachAlertPollLayout2.openEditOrReplaceMenu(-3);
                                        }
                                        break;
                                    default:
                                        ChatAttachAlertPollLayout chatAttachAlertPollLayout3 = ChatAttachAlertPollLayout.this;
                                        if (((PollAttachedMedia) chatAttachAlertPollLayout3.attachedMedia.medias.get(-2)) == null) {
                                            chatAttachAlertPollLayout3.openAttachMenuForOptions(-2);
                                        } else {
                                            chatAttachAlertPollLayout3.openEditOrReplaceMenu(-2);
                                        }
                                        break;
                                }
                            }
                        });
                    }
                    r0.createErrorTextView();
                    r0.setIconsColor(Theme.key_pollCreateIcons);
                    r0.textView.addTextChangedListener(new TextWatcher() {
                        @Override
                        public final void afterTextChanged(Editable editable) {
                            AnonymousClass1 anonymousClass1 = r0;
                            if (anonymousClass1.getTag() != null) {
                                return;
                            }
                            ListAdapter listAdapter = ListAdapter.this;
                            int i3 = i;
                            ChatAttachAlertPollLayout chatAttachAlertPollLayout2 = ChatAttachAlertPollLayout.this;
                            int i4 = i3 == 11 ? chatAttachAlertPollLayout2.descriptionRow : chatAttachAlertPollLayout2.questionRow;
                            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = chatAttachAlertPollLayout2.listView.findViewHolderForAdapterPosition(i4);
                            if (viewHolderFindViewHolderForAdapterPosition != null && chatAttachAlertPollLayout2.suggestEmojiPanel != null) {
                                for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                                    editable.removeSpan(imageSpan);
                                }
                                Emoji.replaceEmoji(editable, anonymousClass1.getEditField().getPaint().getFontMetricsInt(), false);
                                chatAttachAlertPollLayout2.suggestEmojiPanel.setDirection(1);
                                chatAttachAlertPollLayout2.suggestEmojiPanel.setDelegate(anonymousClass1);
                                chatAttachAlertPollLayout2.suggestEmojiPanel.setTranslationY(viewHolderFindViewHolderForAdapterPosition.itemView.getY());
                                chatAttachAlertPollLayout2.suggestEmojiPanel.fireUpdate();
                            }
                            if (i3 == 11) {
                                chatAttachAlertPollLayout2.descriptionString = editable;
                            } else {
                                chatAttachAlertPollLayout2.questionString = editable;
                            }
                            if (viewHolderFindViewHolderForAdapterPosition != null) {
                                ChatAttachAlertPollLayout.access$5700(chatAttachAlertPollLayout2, viewHolderFindViewHolderForAdapterPosition.itemView, i4);
                            }
                            chatAttachAlertPollLayout2.checkDoneButton$1();
                        }

                        @Override
                        public final void beforeTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
                        }

                        @Override
                        public final void onTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
                        }
                    });
                    headerCell = r0;
                    break;
                case 5:
                default:
                    final int i3 = 0;
                    PollEditTextCell pollEditTextCell = new PollEditTextCell(this.mContext, chatAttachAlertPollLayout.isPremium ? 1 : 0, new View.OnClickListener(this) {
                        public final ChatAttachAlertPollLayout.ListAdapter f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (i3) {
                                case 0:
                                    ChatAttachAlertPollLayout.ListAdapter listAdapter = this.f$0;
                                    listAdapter.getClass();
                                    ChatAttachAlertPollLayout.this.deletePollAnswerView(view, (PollEditTextCell) view.getParent(), true);
                                    break;
                                case 1:
                                    ChatAttachAlertPollLayout chatAttachAlertPollLayout2 = ChatAttachAlertPollLayout.this;
                                    if (((PollAttachedMedia) chatAttachAlertPollLayout2.attachedMedia.medias.get(-3)) == null) {
                                        chatAttachAlertPollLayout2.openAttachMenuForOptions(-3);
                                    } else {
                                        chatAttachAlertPollLayout2.openEditOrReplaceMenu(-3);
                                    }
                                    break;
                                default:
                                    ChatAttachAlertPollLayout chatAttachAlertPollLayout3 = ChatAttachAlertPollLayout.this;
                                    if (((PollAttachedMedia) chatAttachAlertPollLayout3.attachedMedia.medias.get(-2)) == null) {
                                        chatAttachAlertPollLayout3.openAttachMenuForOptions(-2);
                                    } else {
                                        chatAttachAlertPollLayout3.openEditOrReplaceMenu(-2);
                                    }
                                    break;
                            }
                        }
                    }, chatAttachAlertPollLayout.resourcesProvider) {
                        @Override
                        public final boolean drawDivider() {
                            ListAdapter listAdapter = ListAdapter.this;
                            MessageSeenView.AnonymousClass1 anonymousClass1 = ChatAttachAlertPollLayout.this.listView;
                            View viewFindContainingItemView = anonymousClass1.findContainingItemView(this);
                            RecyclerView.ViewHolder childViewHolder = viewFindContainingItemView == null ? null : anonymousClass1.getChildViewHolder(viewFindContainingItemView);
                            if (childViewHolder != null) {
                                int adapterPosition = childViewHolder.getAdapterPosition();
                                ChatAttachAlertPollLayout chatAttachAlertPollLayout2 = ChatAttachAlertPollLayout.this;
                                int i4 = chatAttachAlertPollLayout2.answersCount;
                                if (i4 == chatAttachAlertPollLayout2.maxAnswersCount && adapterPosition == (chatAttachAlertPollLayout2.answerStartRow + i4) - 1) {
                                    return false;
                                }
                            }
                            return true;
                        }

                        @Override
                        public final boolean isChecked(PollEditTextCell pollEditTextCell2) {
                            int adapterPosition;
                            ChatAttachAlertPollLayout chatAttachAlertPollLayout2 = ChatAttachAlertPollLayout.this;
                            MessageSeenView.AnonymousClass1 anonymousClass1 = chatAttachAlertPollLayout2.listView;
                            View viewFindContainingItemView = anonymousClass1.findContainingItemView(pollEditTextCell2);
                            RecyclerView.ViewHolder childViewHolder = viewFindContainingItemView == null ? null : anonymousClass1.getChildViewHolder(viewFindContainingItemView);
                            if (childViewHolder == null || (adapterPosition = childViewHolder.getAdapterPosition()) == -1) {
                                return false;
                            }
                            return chatAttachAlertPollLayout2.answersChecks[adapterPosition - chatAttachAlertPollLayout2.answerStartRow];
                        }

                        @Override
                        public final void onActionModeStart(AuctionBidSheet.AnonymousClass4 anonymousClass4, ActionMode actionMode) {
                            ChatAttachAlertPollLayout chatAttachAlertPollLayout2 = ChatAttachAlertPollLayout.this;
                            if (chatAttachAlertPollLayout2.todo && anonymousClass4.isFocused() && anonymousClass4.hasSelection()) {
                                Menu menu = actionMode.getMenu();
                                if (menu.findItem(16908321) == null) {
                                    return;
                                }
                                ChatActivity.fillActionModeMenu(menu, ((ChatActivity) chatAttachAlertPollLayout2.parentAlert.baseFragment).currentEncryptedChat, false, true, true, true);
                            }
                        }

                        @Override
                        public final void onCheckBoxClick(PollEditTextCell pollEditTextCell2, boolean z) {
                            int adapterPosition;
                            ListAdapter listAdapter = ListAdapter.this;
                            if (z) {
                                ChatAttachAlertPollLayout chatAttachAlertPollLayout2 = ChatAttachAlertPollLayout.this;
                                if (chatAttachAlertPollLayout2.quizPoll && !chatAttachAlertPollLayout2.multipleChoise) {
                                    Arrays.fill(chatAttachAlertPollLayout2.answersChecks, false);
                                    ChatAttachAlertPollLayout.this.listView.getChildCount();
                                    int i4 = ChatAttachAlertPollLayout.this.answerStartRow;
                                    while (true) {
                                        ChatAttachAlertPollLayout chatAttachAlertPollLayout3 = ChatAttachAlertPollLayout.this;
                                        if (i4 >= chatAttachAlertPollLayout3.answerStartRow + chatAttachAlertPollLayout3.answersCount) {
                                            break;
                                        }
                                        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = chatAttachAlertPollLayout3.listView.findViewHolderForAdapterPosition(i4);
                                        if (viewHolderFindViewHolderForAdapterPosition != null) {
                                            View view = viewHolderFindViewHolderForAdapterPosition.itemView;
                                            if (view instanceof PollEditTextCell) {
                                                ((PollEditTextCell) view).checkBox.checkBoxBase.setChecked(-1, false, true);
                                            }
                                        }
                                        i4++;
                                    }
                                }
                            }
                            super.onCheckBoxClick(pollEditTextCell2, z);
                            MessageSeenView.AnonymousClass1 anonymousClass1 = ChatAttachAlertPollLayout.this.listView;
                            View viewFindContainingItemView = anonymousClass1.findContainingItemView(pollEditTextCell2);
                            RecyclerView.ViewHolder childViewHolder = viewFindContainingItemView == null ? null : anonymousClass1.getChildViewHolder(viewFindContainingItemView);
                            if (childViewHolder != null && (adapterPosition = childViewHolder.getAdapterPosition()) != -1) {
                                ChatAttachAlertPollLayout chatAttachAlertPollLayout4 = ChatAttachAlertPollLayout.this;
                                chatAttachAlertPollLayout4.answersChecks[adapterPosition - chatAttachAlertPollLayout4.answerStartRow] = z;
                            }
                            ChatAttachAlertPollLayout.this.checkDoneButton$1();
                        }

                        @Override
                        public final void onEditTextFocusChanged(boolean z) {
                            ChatAttachAlertPollLayout.access$6700(ChatAttachAlertPollLayout.this, this, z);
                        }

                        @Override
                        public final void onEmojiButtonClicked(PollEditTextCell pollEditTextCell2) {
                            ChatAttachAlertPollLayout chatAttachAlertPollLayout2 = ChatAttachAlertPollLayout.this;
                            chatAttachAlertPollLayout2.currentCell = pollEditTextCell2;
                            if (!chatAttachAlertPollLayout2.emojiViewVisible) {
                                chatAttachAlertPollLayout2.showEmojiPopup(1);
                            } else {
                                chatAttachAlertPollLayout2.collapseSearchEmojiView();
                                chatAttachAlertPollLayout2.openKeyboardInternal$1();
                            }
                        }

                        @Override
                        public final void onFieldTouchUp(AuctionBidSheet.AnonymousClass4 anonymousClass4) {
                            ChatAttachAlertPollLayout.this.parentAlert.makeFocusable(anonymousClass4, true);
                        }

                        @Override
                        public final boolean onPastedMultipleLines(ArrayList arrayList) {
                            if (!arrayList.isEmpty()) {
                                ChatAttachAlertPollLayout chatAttachAlertPollLayout2 = ChatAttachAlertPollLayout.this;
                                chatAttachAlertPollLayout2.listView.getClass();
                                int childAdapterPosition = RecyclerView.getChildAdapterPosition(this) - chatAttachAlertPollLayout2.answerStartRow;
                                if (childAdapterPosition >= 0) {
                                    AuctionBidSheet.AnonymousClass4 anonymousClass4 = this.textView;
                                    anonymousClass4.getText().replace(anonymousClass4.getSelectionStart(), anonymousClass4.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                                    int i4 = childAdapterPosition + 1;
                                    while (!arrayList.isEmpty() && i4 < chatAttachAlertPollLayout2.maxAnswersCount) {
                                        for (int length = chatAttachAlertPollLayout2.answers.length - 1; length > i4; length--) {
                                            CharSequence[] charSequenceArr = chatAttachAlertPollLayout2.answers;
                                            charSequenceArr[length] = charSequenceArr[length - 1];
                                        }
                                        chatAttachAlertPollLayout2.answers[i4] = (CharSequence) arrayList.remove(0);
                                        chatAttachAlertPollLayout2.answersCount++;
                                        i4++;
                                    }
                                    chatAttachAlertPollLayout2.updateRows$5();
                                    chatAttachAlertPollLayout2.requestFieldFocusAtPosition = (chatAttachAlertPollLayout2.answerStartRow + i4) - 1;
                                    chatAttachAlertPollLayout2.listView.setItemAnimator(chatAttachAlertPollLayout2.itemAnimator);
                                    chatAttachAlertPollLayout2.listAdapter.mObservable.notifyChanged();
                                    return true;
                                }
                            }
                            return false;
                        }

                        @Override
                        public final boolean shouldShowCheckBox() {
                            return ChatAttachAlertPollLayout.this.quizPoll;
                        }
                    };
                    if (!chatAttachAlertPollLayout.todo) {
                        pollEditTextCell.setTextRight(140);
                        pollEditTextCell.addAttachView().setOnClickListener(new ItemOptions$$ExternalSyntheticLambda7(14, this, pollEditTextCell));
                    }
                    int i4 = Theme.key_pollCreateIcons;
                    pollEditTextCell.setIconsColor(i4);
                    CheckBox2 checkBox2 = pollEditTextCell.checkBox;
                    if (checkBox2 != null) {
                        checkBox2.getCheckBoxBase().setCustomRadius(AndroidUtilities.dp(6.0f));
                        CheckBoxBase checkBoxBase = checkBox2.getCheckBoxBase();
                        float f = pollEditTextCell.animatorCheckboxMultiselect.floatValue;
                        if (checkBoxBase.customRadiusFactor != f) {
                            checkBoxBase.customRadiusFactor = f;
                            checkBoxBase.invalidate();
                        }
                    }
                    pollEditTextCell.getCheckBox().checkBoxBase.setColor(-1, i4, Theme.key_checkboxCheck);
                    pollEditTextCell.textView.addTextChangedListener(new LoginActivity.AnonymousClass7(2, this, pollEditTextCell));
                    pollEditTextCell.setShowNextButton(true);
                    EditTextBoldCursor textView = pollEditTextCell.getTextView();
                    textView.setImeOptions(textView.getImeOptions() | 5);
                    textView.setOnEditorActionListener(new ChannelMonetizationLayout$$ExternalSyntheticLambda7(2, this, pollEditTextCell));
                    textView.setOnKeyListener(new ChatActivity$$ExternalSyntheticLambda379(pollEditTextCell, 1));
                    headerCell = pollEditTextCell;
                    break;
                case 6:
                    headerCell = new TextCheckCell(21, context, chatAttachAlertPollLayout.resourcesProvider, false);
                    break;
                case 7:
                    PollEditTextCell pollEditTextCell2 = new PollEditTextCell(context, chatAttachAlertPollLayout.isPremium ? 1 : 0) {
                        @Override
                        public final void onActionModeStart(AuctionBidSheet.AnonymousClass4 anonymousClass4, ActionMode actionMode) {
                            if (anonymousClass4.isFocused() && anonymousClass4.hasSelection()) {
                                Menu menu = actionMode.getMenu();
                                if (menu.findItem(16908321) == null) {
                                    return;
                                }
                                ChatActivity.fillActionModeMenu(menu, ((ChatActivity) ChatAttachAlertPollLayout.this.parentAlert.baseFragment).currentEncryptedChat, false, true, true, true);
                            }
                        }

                        @Override
                        public final void onEditTextFocusChanged(boolean z) {
                            ChatAttachAlertPollLayout.access$6700(ChatAttachAlertPollLayout.this, this, z);
                        }

                        @Override
                        public final void onEmojiButtonClicked(PollEditTextCell pollEditTextCell3) {
                            ChatAttachAlertPollLayout chatAttachAlertPollLayout2 = ChatAttachAlertPollLayout.this;
                            chatAttachAlertPollLayout2.currentCell = pollEditTextCell3;
                            if (!chatAttachAlertPollLayout2.emojiViewVisible) {
                                chatAttachAlertPollLayout2.showEmojiPopup(1);
                            } else {
                                chatAttachAlertPollLayout2.collapseSearchEmojiView();
                                chatAttachAlertPollLayout2.openKeyboardInternal$1();
                            }
                        }

                        @Override
                        public final void onFieldTouchUp(AuctionBidSheet.AnonymousClass4 anonymousClass4) {
                            ChatAttachAlertPollLayout.this.parentAlert.makeFocusable(anonymousClass4, true);
                        }
                    };
                    pollEditTextCell2.createErrorTextView();
                    if (!chatAttachAlertPollLayout.todo) {
                        pollEditTextCell2.setTextRight(98);
                        final int i5 = 1;
                        pollEditTextCell2.addAttachView().setOnClickListener(new View.OnClickListener(this) {
                            public final ChatAttachAlertPollLayout.ListAdapter f$0;

                            {
                                this.f$0 = this;
                            }

                            @Override
                            public final void onClick(View view) {
                                switch (i5) {
                                    case 0:
                                        ChatAttachAlertPollLayout.ListAdapter listAdapter = this.f$0;
                                        listAdapter.getClass();
                                        ChatAttachAlertPollLayout.this.deletePollAnswerView(view, (PollEditTextCell) view.getParent(), true);
                                        break;
                                    case 1:
                                        ChatAttachAlertPollLayout chatAttachAlertPollLayout2 = ChatAttachAlertPollLayout.this;
                                        if (((PollAttachedMedia) chatAttachAlertPollLayout2.attachedMedia.medias.get(-3)) == null) {
                                            chatAttachAlertPollLayout2.openAttachMenuForOptions(-3);
                                        } else {
                                            chatAttachAlertPollLayout2.openEditOrReplaceMenu(-3);
                                        }
                                        break;
                                    default:
                                        ChatAttachAlertPollLayout chatAttachAlertPollLayout3 = ChatAttachAlertPollLayout.this;
                                        if (((PollAttachedMedia) chatAttachAlertPollLayout3.attachedMedia.medias.get(-2)) == null) {
                                            chatAttachAlertPollLayout3.openAttachMenuForOptions(-2);
                                        } else {
                                            chatAttachAlertPollLayout3.openEditOrReplaceMenu(-2);
                                        }
                                        break;
                                }
                            }
                        });
                    }
                    pollEditTextCell2.setIconsColor(Theme.key_pollCreateIcons);
                    pollEditTextCell2.textView.addTextChangedListener(new LoginActivity.AnonymousClass7(1, this, pollEditTextCell2));
                    headerCell = pollEditTextCell2;
                    break;
                case 8:
                    PaymentFormActivity.AnonymousClass2 anonymousClass2 = new PaymentFormActivity.AnonymousClass2(context, 1);
                    anonymousClass2.setTag(-33024);
                    obj = anonymousClass2;
                    headerCell = obj;
                    break;
                case 9:
                    QrActivity.AnonymousClass2 anonymousClass3 = new QrActivity.AnonymousClass2(this, context, 6);
                    anonymousClass3.setTag(-33024);
                    obj = anonymousClass3;
                    headerCell = obj;
                    break;
                case 10:
                    PollCreateCheckCell pollCreateCheckCell = new PollCreateCheckCell(context, chatAttachAlertPollLayout.resourcesProvider);
                    pollCreateCheckCell.getCheckBox().setIcon(R.drawable.permission_locked);
                    headerCell = pollCreateCheckCell;
                    break;
            }
            return zzkl.m(headerCell, headerCell);
        }

        @Override
        public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
            int i = viewHolder.mItemViewType;
            ChatAttachAlertPollLayout chatAttachAlertPollLayout = ChatAttachAlertPollLayout.this;
            View view = viewHolder.itemView;
            if (i == 4) {
                PollEditTextCell pollEditTextCell = (PollEditTextCell) view;
                pollEditTextCell.setTag(1);
                Editable editable = chatAttachAlertPollLayout.questionString;
                pollEditTextCell.setTextAndHint(editable != null ? editable : "", LocaleController.getString(chatAttachAlertPollLayout.todo ? R.string.TodoTitlePlaceholder : R.string.QuestionHint), true);
                pollEditTextCell.setTag(null);
                ChatAttachAlertPollLayout.access$5700(chatAttachAlertPollLayout, view, viewHolder.getAdapterPosition());
                return;
            }
            if (i == 11) {
                PollEditTextCell pollEditTextCell2 = (PollEditTextCell) view;
                pollEditTextCell2.setTag(1);
                Editable editable2 = chatAttachAlertPollLayout.descriptionString;
                pollEditTextCell2.setTextAndHint(editable2 != null ? editable2 : "", LocaleController.getString(R.string.QuestionDescriptionHint), false);
                pollEditTextCell2.setTag(null);
                pollEditTextCell2.attachView.setAttachedMedia((PollAttachedMedia) chatAttachAlertPollLayout.attachedMedia.medias.get(-2), false);
                ChatAttachAlertPollLayout.access$5700(chatAttachAlertPollLayout, view, viewHolder.getAdapterPosition());
                return;
            }
            if (i != 5) {
                if (i == 7) {
                    PollEditTextCell pollEditTextCell3 = (PollEditTextCell) view;
                    pollEditTextCell3.setTag(1);
                    Editable editable3 = chatAttachAlertPollLayout.solutionString;
                    pollEditTextCell3.setTextAndHint(editable3 != null ? editable3 : "", LocaleController.getString(R.string.AddAnExplanation), false);
                    pollEditTextCell3.setTag(null);
                    if (!chatAttachAlertPollLayout.todo) {
                        pollEditTextCell3.attachView.setAttachedMedia((PollAttachedMedia) chatAttachAlertPollLayout.attachedMedia.medias.get(-3), false);
                    }
                    ChatAttachAlertPollLayout.access$5700(chatAttachAlertPollLayout, view, viewHolder.getAdapterPosition());
                    return;
                }
                return;
            }
            int adapterPosition = viewHolder.getAdapterPosition();
            PollEditTextCell pollEditTextCell4 = (PollEditTextCell) view;
            pollEditTextCell4.setTag(1);
            pollEditTextCell4.animatorCheckboxMultiselect.setValue(chatAttachAlertPollLayout.multipleChoise, false);
            int i2 = adapterPosition - chatAttachAlertPollLayout.answerStartRow;
            CharSequence charSequence = chatAttachAlertPollLayout.answers[i2];
            boolean z = chatAttachAlertPollLayout.todo;
            pollEditTextCell4.setTextAndHint(charSequence, LocaleController.getString(z ? R.string.TodoTaskPlaceholder : R.string.OptionHint), true);
            pollEditTextCell4.setTag(null);
            if (chatAttachAlertPollLayout.requestFieldFocusAtPosition == adapterPosition) {
                EditTextBoldCursor textView = pollEditTextCell4.getTextView();
                textView.requestFocus();
                AndroidUtilities.showKeyboard(textView);
                chatAttachAlertPollLayout.requestFieldFocusAtPosition = -1;
            }
            if (!z) {
                pollEditTextCell4.attachView.setAttachedMedia((PollAttachedMedia) chatAttachAlertPollLayout.attachedMedia.medias.get(i2), false);
            }
            ChatAttachAlertPollLayout.access$5700(chatAttachAlertPollLayout, view, adapterPosition);
        }

        @Override
        public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
            int i = viewHolder.mItemViewType;
            if (i == 4 || i == 11 || i == 5) {
                EditTextBoldCursor textView = ((PollEditTextCell) viewHolder.itemView).getTextView();
                if (textView.isFocused()) {
                    ChatAttachAlertPollLayout chatAttachAlertPollLayout = ChatAttachAlertPollLayout.this;
                    if (chatAttachAlertPollLayout.isPremium) {
                        AnonymousClass7 anonymousClass7 = chatAttachAlertPollLayout.suggestEmojiPanel;
                        if (anonymousClass7 != null) {
                            anonymousClass7.forceClose();
                        }
                        chatAttachAlertPollLayout.hideEmojiPopup(true);
                    }
                    chatAttachAlertPollLayout.currentCell = null;
                    textView.clearFocus();
                    AndroidUtilities.hideKeyboard(textView);
                }
            }
        }
    }

    public interface PollCreateActivityDelegate {
        void sendPoll(TLRPC.MessageMedia messageMedia, CharSequence charSequence, PollAttachedMediaPack pollAttachedMediaPack, ArrayList arrayList, boolean z, int i, long j);
    }

    public ChatAttachAlertPollLayout(ChatAttachAlert chatAttachAlert, Context context, boolean z, Theme.ResourcesProvider resourcesProvider, Boolean bool) {
        super(context, resourcesProvider, chatAttachAlert);
        this.answersCount = 1;
        this.allowRevoting = true;
        this.shuffleOptions = true;
        this.allowAddingOptions = true;
        this.multipleChoise = true;
        this.allowAdding = true;
        this.allowMarking = true;
        this.requestFieldFocusAtPosition = -1;
        zzfz zzfzVar = new zzfz(this);
        this.poll2vSubscribersOnlyRow = zzfzVar;
        zzfz zzfzVar2 = new zzfz(this);
        this.poll2vLimitByCountryRow = zzfzVar2;
        int i = 2;
        int i2 = 0;
        this.toggleRows = new zzfz[]{zzfzVar, zzfzVar2};
        ArrayList arrayList = new ArrayList();
        this.countriesList = arrayList;
        this.POLL_DURATION_OPTIONS = new int[]{3600, 10800, 28800, 86400, 259200};
        this.openKeyboardRunnable = new BubbleActivity.AnonymousClass1(this, 15);
        this.smoothScrollToOption = false;
        this.showMediaHintIndexAfterSmoothScroll = -1;
        this.isEmojiSearchOpened = false;
        this.wasEmojiSearchOpened = false;
        Paint paint = new Paint(1);
        this.attachedMedia = new PollAttachedMediaPack();
        this.todo = z;
        int answersMaxCount = getAnswersMaxCount();
        this.maxAnswersCount = answersMaxCount;
        this.answers = new CharSequence[answersMaxCount];
        this.answersChecks = new boolean[answersMaxCount];
        boolean zIsPremium = AccountInstance.getInstance(this.parentAlert.currentAccount).getUserConfig().isPremium();
        this.isPremium = zIsPremium;
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            this.quizPoll = zBooleanValue;
            this.quizOnly = zBooleanValue;
            boolean z2 = !zBooleanValue;
            this.allowAddingOptions = z2;
            this.allowRevoting = z2;
        }
        updateRows$5();
        paint.setColor(Theme.getColor(Theme.key_telegram_color, this.resourcesProvider));
        this.parentAlert.sizeNotifierFrameLayout.setDelegate(this);
        ListAdapter listAdapter = new ListAdapter(context);
        this.listAdapter = listAdapter;
        MessageSeenView.AnonymousClass1 anonymousClass1 = new MessageSeenView.AnonymousClass1(context, 5, null);
        this.listView = anonymousClass1;
        this.iBlur3Capture = anonymousClass1;
        this.iBlur3CaptureView = anonymousClass1;
        this.occupyStatusBar = true;
        this.occupyNavigationBar = true;
        ?? r13 = new DefaultItemAnimator() {
            @Override
            public final void onMoveAnimationUpdate(RecyclerView.ViewHolder viewHolder) {
                if (viewHolder.getAdapterPosition() == 0) {
                    ChatAttachAlertPollLayout chatAttachAlertPollLayout = ChatAttachAlertPollLayout.this;
                    chatAttachAlertPollLayout.parentAlert.updateLayout(chatAttachAlertPollLayout, true, 0);
                }
            }
        };
        this.itemAnimator = r13;
        anonymousClass1.setItemAnimator(r13);
        arrayList.clear();
        r13.mSupportsChangeAnimations = false;
        r13.delayAnimations = false;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        r13.mAddInterpolator = cubicBezierInterpolator;
        r13.mMoveInterpolator = cubicBezierInterpolator;
        r13.mRemoveInterpolator = cubicBezierInterpolator;
        r13.mChangeInterpolator = cubicBezierInterpolator;
        r13.setDurations(350L);
        anonymousClass1.setClipToPadding(false);
        anonymousClass1.setVerticalScrollBarEnabled(false);
        anonymousClass1.setSections(true);
        AnonymousClass4 anonymousClass4 = new AnonymousClass4(this, AndroidUtilities.dp(65.0f) + AndroidUtilities.statusBarHeight, anonymousClass1, i2);
        this.layoutManager = anonymousClass4;
        anonymousClass1.setLayoutManager(anonymousClass4);
        anonymousClass4.skipFirstItem = true;
        new ItemTouchHelper(new ViewPagerFixed.TabsView.AnonymousClass6(this, i)).attachToRecyclerView(anonymousClass1);
        addView(anonymousClass1, LayoutHelper.createFrame(-1, -1, 51));
        anonymousClass1.setPreserveFocusAfterLayout(true);
        anonymousClass1.setAdapter(listAdapter);
        anonymousClass1.setOnItemClickListener(new EmojiPacksAlert$$ExternalSyntheticLambda0(this, resourcesProvider, chatAttachAlert, context));
        anonymousClass1.setOnScrollListener(new ChatActivity.AnonymousClass53(this, 21));
        HintView hintView = new HintView(4, context, null, false);
        this.hintView = hintView;
        hintView.setAlpha(0.0f);
        hintView.setVisibility(4);
        addView(hintView, LayoutHelper.createFrame(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
        this.MAX_CAPTION_LENGTH = MessagesController.getInstance(this.parentAlert.currentAccount).config.pollCaptionLengthMax.get();
        this.webPageLoader = new WebPageLoader(this.parentAlert.currentAccount);
        NotificationCenter.getInstance(this.parentAlert.currentAccount).addObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        if (zIsPremium) {
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
            AnonymousClass7 anonymousClass7 = new AnonymousClass7(context, this.parentAlert.currentAccount, null, resourcesProvider);
            this.suggestEmojiPanel = anonymousClass7;
            anonymousClass7.isCopyForbidden = true;
            anonymousClass7.isSetAsStatusForbidden = true;
            anonymousClass7.setHorizontalPadding(AndroidUtilities.dp(24.0f));
            addView(anonymousClass7, LayoutHelper.createFrame(-2, 160, 51));
        }
        this.keyboardNotifier = new KeyboardNotifier(this.parentAlert.sizeNotifierFrameLayout, false, null);
        checkDoneButton$1();
    }

    public static void access$1200(ChatAttachAlertPollLayout chatAttachAlertPollLayout, int i) {
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = chatAttachAlertPollLayout.listView.findViewHolderForAdapterPosition(chatAttachAlertPollLayout.answerStartRow + i);
        if (viewHolderFindViewHolderForAdapterPosition != null) {
            View view = viewHolderFindViewHolderForAdapterPosition.itemView;
            if (view instanceof PollEditTextCell) {
                PollEditTextCell pollEditTextCell = (PollEditTextCell) view;
                if (pollEditTextCell.getTop() > AndroidUtilities.dp(40.0f)) {
                    AnonymousClass7 anonymousClass7 = chatAttachAlertPollLayout.suggestEmojiPanel;
                    if (anonymousClass7 != null) {
                        anonymousClass7.forceClose();
                    }
                    HintView hintView = chatAttachAlertPollLayout.hintView;
                    hintView.setText(LocaleController.getString(R.string.PollAddTextOrRemoveMedia));
                    hintView.showForView(pollEditTextCell.getCheckBox(), true);
                    ImageView imageView = hintView.arrowImageView;
                    imageView.setTranslationX(imageView.getTranslationX() + AndroidUtilities.dp(48.0f));
                    hintView.setTranslationY(hintView.getTranslationY() + AndroidUtilities.dp(10.0f));
                }
            }
        }
    }

    public static void access$5700(ChatAttachAlertPollLayout chatAttachAlertPollLayout, View view, int i) {
        int i2;
        int length;
        int length2;
        chatAttachAlertPollLayout.getClass();
        if (view instanceof PollEditTextCell) {
            PollEditTextCell pollEditTextCell = (PollEditTextCell) view;
            if (i == chatAttachAlertPollLayout.descriptionRow) {
                Editable editable = chatAttachAlertPollLayout.descriptionString;
                i2 = chatAttachAlertPollLayout.MAX_CAPTION_LENGTH;
                if (editable != null) {
                    length = editable.length();
                } else {
                    length = 0;
                }
                length2 = i2 - length;
            } else {
                int i3 = chatAttachAlertPollLayout.questionRow;
                boolean z = chatAttachAlertPollLayout.todo;
                if (i == i3) {
                    i2 = z ? chatAttachAlertPollLayout.getMessagesController().todoTitleLengthMax : 255;
                    Editable editable2 = chatAttachAlertPollLayout.questionString;
                    if (editable2 != null) {
                        length = editable2.length();
                    } else {
                        length = 0;
                    }
                    length2 = i2 - length;
                } else if (i == chatAttachAlertPollLayout.solutionRow) {
                    Editable editable3 = chatAttachAlertPollLayout.solutionString;
                    i2 = 200;
                    length2 = 200 - (editable3 != null ? editable3.length() : 0);
                } else {
                    int i4 = chatAttachAlertPollLayout.answerStartRow;
                    if (i < i4 || i >= chatAttachAlertPollLayout.answersCount + i4) {
                        return;
                    }
                    int i5 = i - i4;
                    i2 = z ? chatAttachAlertPollLayout.getMessagesController().todoItemLengthMax : 100;
                    CharSequence charSequence = chatAttachAlertPollLayout.answers[i5];
                    if (charSequence != null) {
                        length = charSequence.length();
                    } else {
                        length = 0;
                    }
                    length2 = i2 - length;
                }
            }
            float f = i2;
            if (length2 > f - (0.7f * f)) {
                pollEditTextCell.setText2("");
                return;
            }
            pollEditTextCell.setText2(String.format("%d", Integer.valueOf(length2)));
            SimpleTextView textView2 = pollEditTextCell.getTextView2();
            int i6 = length2 < 0 ? Theme.key_text_RedRegular : Theme.key_windowBackgroundWhiteGrayText3;
            textView2.setTextColor(Theme.getColor(i6, chatAttachAlertPollLayout.resourcesProvider));
            textView2.setTag(Integer.valueOf(i6));
        }
    }

    public static void access$6700(ChatAttachAlertPollLayout chatAttachAlertPollLayout, PollEditTextCell pollEditTextCell, boolean z) {
        if (chatAttachAlertPollLayout.isPremium && z) {
            if (chatAttachAlertPollLayout.currentCell == pollEditTextCell && chatAttachAlertPollLayout.emojiViewVisible && chatAttachAlertPollLayout.isEmojiSearchOpened) {
                chatAttachAlertPollLayout.collapseSearchEmojiView();
                chatAttachAlertPollLayout.emojiViewVisible = false;
            }
            PollEditTextCell pollEditTextCell2 = chatAttachAlertPollLayout.currentCell;
            chatAttachAlertPollLayout.currentCell = pollEditTextCell;
            pollEditTextCell.setEmojiButtonVisibility(true);
            ChatActivityEnterViewAnimatedIconView emojiButton = pollEditTextCell.getEmojiButton();
            ChatActivityEnterViewAnimatedIconView.State state = ChatActivityEnterViewAnimatedIconView.State.SMILE;
            emojiButton.setState(state, false);
            MessageSeenView.AnonymousClass1 anonymousClass1 = chatAttachAlertPollLayout.listView;
            View viewFindContainingItemView = anonymousClass1.findContainingItemView(pollEditTextCell);
            RecyclerView.ViewHolder childViewHolder = viewFindContainingItemView == null ? null : anonymousClass1.getChildViewHolder(viewFindContainingItemView);
            AnonymousClass7 anonymousClass7 = chatAttachAlertPollLayout.suggestEmojiPanel;
            if (anonymousClass7 != null) {
                anonymousClass7.forceClose();
                if (childViewHolder != null) {
                    View view = childViewHolder.itemView;
                    if ((view instanceof PollEditTextCell) && anonymousClass7.getDelegate() != view) {
                        anonymousClass7.setDelegate((PollEditTextCell) view);
                    }
                }
            }
            if (pollEditTextCell2 == null || pollEditTextCell2 == pollEditTextCell) {
                return;
            }
            if (chatAttachAlertPollLayout.emojiViewVisible) {
                chatAttachAlertPollLayout.collapseSearchEmojiView();
                chatAttachAlertPollLayout.hideEmojiPopup(false);
                chatAttachAlertPollLayout.openKeyboardInternal$1();
            }
            pollEditTextCell2.setEmojiButtonVisibility(false);
            pollEditTextCell2.getEmojiButton().setState(state, false);
        }
    }

    private int getAnswersMaxCount() {
        return this.todo ? getMessagesController().todoItemsMax : getMessagesController().config.pollAnswersMax.get();
    }

    private int getCurrentAccount() {
        ChatAttachAlert chatAttachAlert = this.parentAlert;
        return chatAttachAlert != null ? chatAttachAlert.currentAccount : UserConfig.selectedAccount;
    }

    public static CharSequence getFixedString(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return charSequence;
        }
        CharSequence trimmedString = AndroidUtilities.getTrimmedString(charSequence);
        while (TextUtils.indexOf(trimmedString, "\n\n\n") >= 0) {
            trimmedString = TextUtils.replace(trimmedString, new String[]{"\n\n\n"}, new CharSequence[]{"\n\n"});
        }
        while (TextUtils.indexOf(trimmedString, "\n\n\n") == 0) {
            trimmedString = TextUtils.replace(trimmedString, new String[]{"\n\n\n"}, new CharSequence[]{"\n\n"});
        }
        return trimmedString;
    }

    private MessagesController getMessagesController() {
        return MessagesController.getInstance(getCurrentAccount());
    }

    public static AnonymousClass14 openPollAttachMenu(final BaseFragment baseFragment, int i, final Utilities.Callback callback, final Bulletin$2$$ExternalSyntheticLambda1 bulletin$2$$ExternalSyntheticLambda1) {
        if (baseFragment == null) {
            return null;
        }
        final ?? r0 = new ChatAttachAlert(baseFragment, baseFragment.getContext(), baseFragment.getResourceProvider()) {
            @Override
            public final void dismissInternal() {
                super.dismissInternal();
                Bulletin$2$$ExternalSyntheticLambda1 bulletin$2$$ExternalSyntheticLambda2 = bulletin$2$$ExternalSyntheticLambda1;
                if (bulletin$2$$ExternalSyntheticLambda2 != null) {
                    bulletin$2$$ExternalSyntheticLambda2.run();
                }
            }
        };
        r0.delegate = new ChatAttachAlert.ChatAttachViewDelegate() {
            @Override
            public final void didPressedButton(int i2, boolean z, boolean z2, int i3, int i4, long j, boolean z3, boolean z4, long j2) {
                Utilities.Callback callback2 = callback;
                AnonymousClass14 anonymousClass14 = r0;
                if (i2 == 15) {
                    BaseFragment baseFragment2 = baseFragment;
                    AlertsCreator.showAddLinkToPoll(baseFragment2.getContext(), baseFragment2.getResourceProvider(), null, null, new StarGiftSheet$$ExternalSyntheticLambda102(1, callback2), null);
                } else if (i2 == 7 || i2 == 8) {
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = anonymousClass14.photoLayout;
                    HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
                    ArrayList<Object> selectedPhotosOrder = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
                    if (selectedPhotosOrder.size() > 0) {
                        Object obj = selectedPhotos.get(selectedPhotosOrder.get(0));
                        SendMessagesHelper.SendingMediaInfo sendingMediaInfo = new SendMessagesHelper.SendingMediaInfo();
                        if (obj instanceof MediaController.PhotoEntry) {
                            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                            String str = photoEntry.imagePath;
                            if (str != null) {
                                sendingMediaInfo.path = str;
                            } else {
                                sendingMediaInfo.path = photoEntry.path;
                            }
                            sendingMediaInfo.thumbPath = photoEntry.thumbPath;
                            sendingMediaInfo.coverPath = photoEntry.coverPath;
                            sendingMediaInfo.videoEditedInfo = photoEntry.editedInfo;
                            sendingMediaInfo.isLivePhoto = photoEntry.isLivePhoto();
                            sendingMediaInfo.livePhotoVideoOffset = photoEntry.livePhotoVideoOffset;
                            sendingMediaInfo.discardLivePhoto = true;
                            sendingMediaInfo.isVideo = photoEntry.isVideo;
                            CharSequence charSequence = photoEntry.caption;
                            sendingMediaInfo.caption = charSequence != null ? charSequence.toString() : null;
                            sendingMediaInfo.entities = photoEntry.entities;
                            sendingMediaInfo.masks = photoEntry.stickers;
                            sendingMediaInfo.ttl = photoEntry.ttl;
                            sendingMediaInfo.emojiMarkup = photoEntry.emojiMarkup;
                            sendingMediaInfo.originalPhotoEntry = photoEntry;
                        } else if (obj instanceof MediaController.SearchImage) {
                            MediaController.SearchImage searchImage = (MediaController.SearchImage) obj;
                            String str2 = searchImage.imagePath;
                            if (str2 != null) {
                                sendingMediaInfo.path = str2;
                            } else {
                                sendingMediaInfo.searchImage = searchImage;
                            }
                            sendingMediaInfo.thumbPath = searchImage.thumbPath;
                            sendingMediaInfo.coverPath = searchImage.coverPath;
                            sendingMediaInfo.videoEditedInfo = searchImage.editedInfo;
                            CharSequence charSequence2 = searchImage.caption;
                            sendingMediaInfo.caption = charSequence2 != null ? charSequence2.toString() : null;
                            sendingMediaInfo.entities = searchImage.entities;
                            sendingMediaInfo.masks = searchImage.stickers;
                            sendingMediaInfo.ttl = searchImage.ttl;
                            TLRPC.BotInlineResult botInlineResult = searchImage.inlineResult;
                            if (botInlineResult != null && searchImage.type == 1) {
                                sendingMediaInfo.inlineResult = botInlineResult;
                                sendingMediaInfo.params = searchImage.params;
                            }
                            searchImage.date = (int) (System.currentTimeMillis() / 1000);
                        }
                        callback2.run(new PollAttachedMediaGallery(sendingMediaInfo));
                    }
                }
                anonymousClass14.dismiss(true);
            }

            @Override
            public final void didSelectBot(TLRPC.User user) {
            }

            @Override
            public final void doOnIdle(ChatAttachAlert$$ExternalSyntheticLambda7 chatAttachAlert$$ExternalSyntheticLambda7) {
                NotificationCenter.getInstance(baseFragment.getCurrentAccount()).doOnIdle(chatAttachAlert$$ExternalSyntheticLambda7);
            }

            @Override
            public final boolean needEnterComment() {
                return false;
            }

            @Override
            public final void onCameraOpened() {
            }

            @Override
            public final void onWallpaperSelected(Object obj) {
            }

            @Override
            public final void openAvatarsSearch() {
            }

            @Override
            public final boolean selectItemOnClicking() {
                return false;
            }

            @Override
            public final void sendAudio(ArrayList arrayList, Editable editable, boolean z, int i2, int i3, long j, boolean z2, long j2) {
            }
        };
        r0.emojiViewDelegate = new EmojiView.EmojiViewDelegate() {
            @Override
            public final boolean canAddCaptionToGif() {
                return false;
            }

            @Override
            public final boolean canSchedule() {
                return false;
            }

            @Override
            public final long getDialogId() {
                return 0L;
            }

            @Override
            public final float getProgressToSearchOpened() {
                return 0.0f;
            }

            @Override
            public final int getThreadId() {
                return 0;
            }

            @Override
            public final void invalidateEnterView() {
            }

            @Override
            public final boolean isExpanded() {
                return false;
            }

            @Override
            public final boolean isInScheduleMode() {
                return false;
            }

            @Override
            public final boolean isSearchOpened() {
                return false;
            }

            @Override
            public final boolean isUserSelf() {
                return false;
            }

            @Override
            public final void onAnimatedEmojiUnlockClick() {
            }

            @Override
            public final boolean onBackspace() {
                return false;
            }

            @Override
            public final void onClearEmojiRecent() {
            }

            @Override
            public final void onCustomEmojiSelected(long j, TLRPC.Document document, String str, boolean z) {
                callback.run(new PollAttachedMediaSticker(document, null));
                dismiss(true);
            }

            @Override
            public final void onEmojiSelected(String str) {
            }

            @Override
            public final void onEmojiSettingsClick(ArrayList arrayList) {
            }

            @Override
            public final void onGifSelected(View view, Object obj, String str, Object obj2, boolean z, int i2, int i3) {
            }

            @Override
            public final void onGifSelectedForAddCaption(TLObject tLObject, Object obj) {
            }

            @Override
            public final void onSearchOpenClose(int i2) {
            }

            @Override
            public final void onShowStickerSet(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z) {
            }

            @Override
            public final void onStickerSelected(StickerEmojiCell stickerEmojiCell, TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z, int i2) {
                callback.run(new PollAttachedMediaSticker(document, obj));
                dismiss(true);
            }

            @Override
            public final void onStickerSetAdd(TLRPC.StickerSetCovered stickerSetCovered) {
            }

            @Override
            public final void onStickerSetRemove(TLRPC.StickerSetCovered stickerSetCovered) {
            }

            @Override
            public final void onStickersGroupClick(long j) {
            }

            @Override
            public final void onStickersSettingsClick() {
            }

            @Override
            public final void onTabOpened(int i2) {
            }

            @Override
            public final void showTrendingStickersAlert(TrendingStickersLayout trendingStickersLayout) {
            }
        };
        r0.photoLayout.loadGalleryPhotos();
        r0.setMaxSelectedPhotos(1, true);
        r0.enablePollAttachMode(i);
        r0.locationActivityDelegate = new StarGiftSheet$$ExternalSyntheticLambda79(1, callback);
        r0.documentsDelegate = new ChatAttachAlertDocumentLayout.DocumentSelectActivityDelegate() {
            @Override
            public final void didSelectFiles(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z, int i2, long j, boolean z2, long j2) {
                if (!arrayList.isEmpty()) {
                    callback.run(new PollAttachedMediaFile((String) arrayList.get(0)));
                }
                dismiss(true);
            }

            @Override
            public final void didSelectPhotos(long j, ArrayList arrayList, boolean z, int i2) {
                if (!arrayList.isEmpty()) {
                    callback.run(new PollAttachedMediaGallery((SendMessagesHelper.SendingMediaInfo) arrayList.get(0)));
                }
                dismiss(true);
            }

            @Override
            public final void startDocumentSelectActivity() {
                try {
                    Intent intent = new Intent("android.intent.action.GET_CONTENT");
                    intent.setType("*/*");
                    baseFragment.getParentActivity().startActivityForResult(intent, 28);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }

            @Override
            public final void startMusicSelectActivity() {
            }
        };
        r0.audioSelectDelegate = new RateCallLayout$$ExternalSyntheticLambda1(1, callback, (Object) r0);
        r0.init();
        r0.setFocusable(true);
        r0.show();
        return r0;
    }

    public final void addNewField() {
        AnonymousClass7 anonymousClass7 = this.suggestEmojiPanel;
        if (anonymousClass7 != null) {
            anonymousClass7.setDelegate(null);
            anonymousClass7.forceClose();
        }
        this.listView.setItemAnimator(this.itemAnimator);
        int i = this.answersCount;
        this.answersChecks[i] = false;
        int i2 = i + 1;
        this.answersCount = i2;
        int length = this.answers.length;
        ListAdapter listAdapter = this.listAdapter;
        if (i2 == length) {
            listAdapter.mObservable.notifyItemRangeRemoved(this.addAnswerRow, 1);
        }
        listAdapter.mObservable.notifyItemRangeInserted(this.addAnswerRow, 1);
        updateRows$5();
        this.requestFieldFocusAtPosition = (this.answerStartRow + this.answersCount) - 1;
        listAdapter.notifyItemChanged(this.answerSectionRow);
        listAdapter.notifyItemChanged(this.emptyRow);
    }

    public final void animateEmojiViewTranslationY(float f) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ChatActivity$$ExternalSyntheticLambda305(this, f, 2));
        valueAnimatorOfFloat.addListener(new AnonymousClass8(this, 1));
        valueAnimatorOfFloat.setDuration(250L);
        valueAnimatorOfFloat.setInterpolator(AdjustPanLayoutHelper.keyboardInterpolator);
        valueAnimatorOfFloat.start();
    }

    public final void checkAllowAddingOptionsRow() {
        boolean z = (this.quizPoll || this.anonymousPoll) ? false : true;
        if (!z) {
            this.allowAddingOptions = false;
        }
        int i = this.poll2vAllowAddingRow;
        if (i < 0) {
            return;
        }
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = this.listView.findViewHolderForAdapterPosition(i);
        if (viewHolderFindViewHolderForAdapterPosition == null) {
            this.listAdapter.notifyItemChanged(this.poll2vAllowAddingRow);
            return;
        }
        PollCreateCheckCell pollCreateCheckCell = (PollCreateCheckCell) viewHolderFindViewHolderForAdapterPosition.itemView;
        if (!z) {
            pollCreateCheckCell.setChecked(false);
        }
        pollCreateCheckCell.getCheckBox().animatorIconVisibility.setValue(!z, true);
    }

    public final boolean checkDiscard() {
        boolean zIsEmpty = TextUtils.isEmpty(getFixedString(this.questionString)) && TextUtils.isEmpty(getFixedString(this.descriptionString)) && TextUtils.isEmpty(getFixedString(this.solutionString)) && this.attachedMedia.medias.size() == 0;
        if (zIsEmpty) {
            for (int i = 0; i < this.answersCount && (zIsEmpty = TextUtils.isEmpty(getFixedString(this.answers[i]))); i++) {
            }
        }
        if (!zIsEmpty) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this.parentAlert.baseFragment.getParentActivity(), 0, null);
            boolean z = this.todo;
            String string = LocaleController.getString(z ? R.string.CancelTodoAlertTitle : R.string.CancelPollAlertTitle);
            AlertDialog alertDialog = builder.alertDialog;
            alertDialog.title = string;
            alertDialog.message = LocaleController.getString(z ? R.string.CancelTodoAlertText : R.string.CancelPollAlertText);
            builder.setPositiveButton(LocaleController.getString(R.string.PassportDiscard), new ColorPicker$$ExternalSyntheticLambda6(this, 17));
            ArticleViewer.IBlock.CC.m(R.string.Cancel, builder, (AlertDialog.OnButtonClickListener) null);
        }
        return zIsEmpty;
    }

    public final void checkDoneButton$1() {
        int i;
        boolean z = this.quizPoll;
        CharSequence[] charSequenceArr = this.answers;
        if (z) {
            int i2 = 0;
            i = 0;
            while (true) {
                boolean[] zArr = this.answersChecks;
                if (i2 >= zArr.length) {
                    break;
                }
                if (!TextUtils.isEmpty(getFixedString(charSequenceArr[i2])) && zArr[i2]) {
                    i++;
                }
                i2++;
            }
        } else {
            i = 0;
        }
        boolean z2 = this.todo;
        int i3 = z2 ? getMessagesController().todoTitleLengthMax : 255;
        int i4 = z2 ? getMessagesController().todoItemLengthMax : 100;
        boolean z3 = (TextUtils.isEmpty(getFixedString(this.descriptionString)) || this.descriptionString.length() <= this.MAX_CAPTION_LENGTH) && (TextUtils.isEmpty(getFixedString(this.solutionString)) || this.solutionString.length() <= 200) && !TextUtils.isEmpty(getFixedString(this.questionString)) && this.questionString.length() <= i3;
        int i5 = 0;
        boolean z4 = false;
        for (int i6 = 0; i6 < charSequenceArr.length; i6++) {
            if (!TextUtils.isEmpty(getFixedString(charSequenceArr[i6]))) {
                if (charSequenceArr[i6].length() > i4) {
                    i5 = 0;
                    z4 = true;
                    break;
                } else {
                    i5++;
                    z4 = true;
                }
            }
        }
        if (i5 < 1 || (this.quizPoll && i < 1)) {
            z3 = false;
        }
        if (TextUtils.isEmpty(this.solutionString) && TextUtils.isEmpty(this.questionString) && TextUtils.isEmpty(this.descriptionString) && !z4 && this.attachedMedia.medias.size() <= 0) {
            this.allowNesterScroll = true;
        } else {
            this.allowNesterScroll = false;
        }
        boolean z5 = this.allowNesterScroll;
        ChatAttachAlert chatAttachAlert = this.parentAlert;
        chatAttachAlert.setAllowNestedScroll(z5);
        this.doneItemEnabled = z3;
        chatAttachAlert.updateDoneItemEnabled();
    }

    public final void checkDurationInfoRow(TextCell textCell, boolean z) {
        if (this.pollLimitDeadline != 0) {
            textCell.setTextAndValue(LocaleController.getString(R.string.PollV2PollEnds), LocaleController.formatShortDateTime(this.pollLimitDeadline), z, false);
        } else if (this.pollLimitDuration != 0) {
            textCell.setTextAndValue(LocaleController.getString(R.string.PollV2PollDuration), LocaleController.formatPluralString("Hours", this.pollLimitDuration / 3600, new Object[0]), z, false);
        } else {
            textCell.setTextAndValue(LocaleController.getString(R.string.PollV2PollEnds), null, z, false);
        }
    }

    public final void checkPollLinkMedia(PollAttachedMediaLink pollAttachedMediaLink, boolean z) {
        TLRPC.Photo photo;
        String str = pollAttachedMediaLink.url;
        WebPageLoader webPageLoader = this.webPageLoader;
        boolean zContainsKey = webPageLoader.callbacks.containsKey(str);
        TLRPC.WebPage webPage = (TLRPC.WebPage) webPageLoader.pages.get(pollAttachedMediaLink.url);
        pollAttachedMediaLink.animatorProgress.setValue(zContainsKey || (webPage instanceof TLRPC.TL_webPagePending), z);
        pollAttachedMediaLink.webPage = webPage;
        ImageReceiver imageReceiver = pollAttachedMediaLink.imageReceiver;
        BoolAnimator boolAnimator = pollAttachedMediaLink.animatorHasImage;
        if (webPage == null || (photo = webPage.photo) == null) {
            boolAnimator.setValue(false, z);
            imageReceiver.clearImage();
        } else {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 40);
            imageReceiver.setImage(ImageLocation.getForObject(FileLoader.getClosestPhotoSizeWithSize(webPage.photo.sizes, AndroidUtilities.dp(36.0f), false, closestPhotoSizeWithSize, true), webPage.photo), "48_48", ImageLocation.getForObject(closestPhotoSizeWithSize, webPage.photo), "48_48_b", 0L, null, webPage, 1);
            boolAnimator.setValue(true, z);
        }
    }

    public final void collapseSearchEmojiView() {
        if (this.isEmojiSearchOpened) {
            this.emojiView.closeSearch(-1L, false);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.emojiView.getLayoutParams();
            layoutParams.height -= AndroidUtilities.dp(120.0f);
            this.emojiView.setLayoutParams(layoutParams);
            this.emojiPadding = layoutParams.height;
            this.wasEmojiSearchOpened = this.isEmojiSearchOpened;
            this.isEmojiSearchOpened = false;
            animateEmojiViewTranslationY(-AndroidUtilities.dp(120.0f));
        }
    }

    public final void deletePollAnswerView(View view, PollEditTextCell pollEditTextCell, boolean z) {
        int adapterPosition;
        BaseFragment baseFragment;
        if (view.getTag() != null) {
            return;
        }
        view.setTag(1);
        MessageSeenView.AnonymousClass1 anonymousClass1 = this.listView;
        RecyclerView.ViewHolder viewHolderFindContainingViewHolder = anonymousClass1.findContainingViewHolder(pollEditTextCell);
        if (viewHolderFindContainingViewHolder == null || (adapterPosition = viewHolderFindContainingViewHolder.getAdapterPosition()) == -1) {
            return;
        }
        int i = adapterPosition - this.answerStartRow;
        PollAttachedMediaPack pollAttachedMediaPack = this.attachedMedia;
        boolean z2 = ((PollAttachedMedia) pollAttachedMediaPack.medias.get(i)) != null;
        if (z && z2 && (baseFragment = this.parentAlert.baseFragment) != null) {
            AlertDialog.Builder builder = new AlertDialog.Builder(baseFragment.getParentActivity(), 0, this.resourcesProvider);
            String string = LocaleController.getString(!this.quizPoll ? R.string.DiscardPollOptionWithMediaAlertTitle : R.string.DiscardQuizOptionWithMediaAlertTitle);
            AlertDialog alertDialog = builder.alertDialog;
            alertDialog.title = string;
            alertDialog.message = LocaleController.getString(!this.quizPoll ? R.string.DiscardPollOptionWithMediaMessage : R.string.DiscardQuizOptionWithMediaMessage);
            builder.setPositiveButton(LocaleController.getString(R.string.Delete), new ChatActivity$$ExternalSyntheticLambda248(this, view, pollEditTextCell, 29));
            builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
            alertDialog.setOnCancelListener(new LinkManager$$ExternalSyntheticLambda17(view, 5));
            alertDialog.show();
            TextView textView = (TextView) alertDialog.getButton(-1);
            if (textView != null) {
                textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
                return;
            }
            return;
        }
        pollAttachedMediaPack.removeAnswerAndShift(i);
        anonymousClass1.setItemAnimator(this.itemAnimator);
        ListAdapter listAdapter = this.listAdapter;
        listAdapter.mObservable.notifyItemRangeRemoved(adapterPosition, 1);
        int i2 = i + 1;
        CharSequence[] charSequenceArr = this.answers;
        System.arraycopy(charSequenceArr, i2, charSequenceArr, i, (charSequenceArr.length - 1) - i);
        boolean[] zArr = this.answersChecks;
        System.arraycopy(zArr, i2, zArr, i, (zArr.length - 1) - i);
        charSequenceArr[charSequenceArr.length - 1] = null;
        zArr[zArr.length - 1] = false;
        int i3 = this.answersCount - 1;
        this.answersCount = i3;
        if (i3 == charSequenceArr.length - 1) {
            listAdapter.mObservable.notifyItemRangeInserted((this.answerStartRow + charSequenceArr.length) - 1, 1);
        }
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = anonymousClass1.findViewHolderForAdapterPosition(adapterPosition - 1);
        EditTextBoldCursor textView2 = pollEditTextCell.getTextView();
        if (viewHolderFindViewHolderForAdapterPosition != null) {
            View view2 = viewHolderFindViewHolderForAdapterPosition.itemView;
            if (view2 instanceof PollEditTextCell) {
                ((PollEditTextCell) view2).getTextView().requestFocus();
            } else if (textView2.isFocused()) {
                AndroidUtilities.hideKeyboard(textView2);
                hideEmojiPopup(true);
            } else if (this.isEmojiSearchOpened) {
                hideEmojiPopup(true);
            }
        } else if (textView2.isFocused()) {
            AndroidUtilities.hideKeyboard(textView2);
            hideEmojiPopup(true);
        } else if (this.isEmojiSearchOpened) {
            hideEmojiPopup(true);
        }
        textView2.clearFocus();
        checkDoneButton$1();
        updateRows$5();
        AnonymousClass7 anonymousClass7 = this.suggestEmojiPanel;
        if (anonymousClass7 != null) {
            anonymousClass7.forceClose();
            anonymousClass7.setDelegate(null);
        }
        listAdapter.notifyItemChanged(this.answerSectionRow);
        listAdapter.notifyItemChanged(this.emptyRow);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        TLRPC.WebPage webPage;
        if (i != NotificationCenter.didReceivedWebpagesInUpdates) {
            if (i == NotificationCenter.emojiLoaded) {
                EmojiView emojiView = this.emojiView;
                if (emojiView != null) {
                    emojiView.emojiGridView.invalidateViews();
                }
                PollEditTextCell pollEditTextCell = this.currentCell;
                if (pollEditTextCell != null) {
                    int currentTextColor = pollEditTextCell.getEditField().getCurrentTextColor();
                    this.currentCell.getEditField().setTextColor(-1);
                    this.currentCell.getEditField().setTextColor(currentTextColor);
                    return;
                }
                return;
            }
            return;
        }
        LongSparseArray longSparseArray = (LongSparseArray) objArr[0];
        for (Map.Entry entry : this.webPageLoader.pages.entrySet()) {
            if (entry.getValue() != null && (webPage = (TLRPC.WebPage) longSparseArray.get(((TLRPC.WebPage) entry.getValue()).id)) != null) {
                entry.setValue(webPage);
            }
        }
        PollAttachedMediaPack pollAttachedMediaPack = this.attachedMedia;
        int size = pollAttachedMediaPack.medias.size();
        for (int i3 = 0; i3 < size; i3++) {
            PollAttachedMedia pollAttachedMedia = (PollAttachedMedia) pollAttachedMediaPack.medias.get(i3);
            if (pollAttachedMedia instanceof PollAttachedMediaLink) {
                checkPollLinkMedia((PollAttachedMediaLink) pollAttachedMedia, true);
            }
        }
    }

    @Override
    public int getButtonsHideOffset() {
        return AndroidUtilities.dp(70.0f);
    }

    @Override
    public int getCurrentItemTop() {
        View childAt;
        MessageSeenView.AnonymousClass1 anonymousClass1 = this.listView;
        if (anonymousClass1.getChildCount() <= 1 || (childAt = anonymousClass1.getChildAt(1)) == null) {
            return Integer.MAX_VALUE;
        }
        View viewFindContainingItemView = anonymousClass1.findContainingItemView(childAt);
        RecyclerListView.Holder holder = (RecyclerListView.Holder) (viewFindContainingItemView == null ? null : anonymousClass1.getChildViewHolder(viewFindContainingItemView));
        int y = (((int) childAt.getY()) - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(20.0f);
        int i = (y <= 0 || holder == null || holder.getAdapterPosition() != 1) ? 0 : y;
        if (y < 0 || holder == null || holder.getAdapterPosition() != 1) {
            y = i;
        }
        return AndroidUtilities.dp(25.0f) + y;
    }

    public int getEmojiPadding() {
        return this.emojiPadding;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(17.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.topPadding;
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
        arrayList.add(new ThemeDescription(this.listView, 32768, null, null, null, null, Theme.key_dialogScrollGlow));
        int i = Theme.key_windowBackgroundGrayShadow;
        arrayList.add(new ThemeDescription(this.listView, 32, new Class[]{ShadowSectionCell.class}, null, null, null, i));
        int i2 = Theme.key_windowBackgroundGray;
        arrayList.add(new ThemeDescription(this.listView, 48, new Class[]{ShadowSectionCell.class}, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.listView, 16, new Class[]{PaymentFormActivity.AnonymousClass2.class}, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.listView, 32, new Class[]{TextInfoPrivacyCell.class}, null, null, null, i));
        arrayList.add(new ThemeDescription(this.listView, 48, new Class[]{TextInfoPrivacyCell.class}, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteGrayText4));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{HeaderCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteBlueHeader));
        int i3 = Theme.key_text_RedRegular;
        arrayList.add(new ThemeDescription(this.listView, 262144, new Class[]{HeaderCell.class}, new String[]{"textView2"}, null, null, -1, null, i3));
        arrayList.add(new ThemeDescription(this.listView, 262144, new Class[]{HeaderCell.class}, new String[]{"textView2"}, null, null, -1, null, Theme.key_windowBackgroundWhiteGrayText3));
        int i4 = Theme.key_windowBackgroundWhiteBlackText;
        arrayList.add(new ThemeDescription(this.listView, 4, new Class[]{PollEditTextCell.class}, new String[]{"textView"}, null, null, -1, null, i4));
        arrayList.add(new ThemeDescription(this.listView, 8388608, new Class[]{PollEditTextCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteHintText));
        int i5 = Theme.key_windowBackgroundWhiteGrayIcon;
        arrayList.add(new ThemeDescription(this.listView, 8388608, new Class[]{PollEditTextCell.class}, new String[]{"deleteImageView"}, null, null, -1, null, i5));
        arrayList.add(new ThemeDescription(this.listView, 8388608, new Class[]{PollEditTextCell.class}, new String[]{"moveImageView"}, null, null, -1, null, i5));
        arrayList.add(new ThemeDescription(this.listView, 196608, new Class[]{PollEditTextCell.class}, new String[]{"deleteImageView"}, null, null, -1, null, Theme.key_stickers_menuSelector));
        arrayList.add(new ThemeDescription(this.listView, 262144, new Class[]{PollEditTextCell.class}, new String[]{"textView2"}, null, null, -1, null, i3));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{PollEditTextCell.class}, new String[]{"checkBox"}, null, null, -1, null, i5));
        int i6 = Theme.key_checkboxCheck;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{PollEditTextCell.class}, new String[]{"checkBox"}, null, null, -1, null, i6));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell.class}, new String[]{"textView"}, null, null, -1, null, i4));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell.class}, new String[]{"valueTextView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteGrayText2));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell.class}, new String[]{"checkBox"}, null, null, -1, null, Theme.key_switchTrack));
        int i7 = Theme.key_switchTrackChecked;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell.class}, new String[]{"checkBox"}, null, null, -1, null, i7));
        arrayList.add(new ThemeDescription(this.listView, 4096, null, null, null, null, Theme.key_listSelector));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, Theme.dividerPaint, null, null, Theme.key_divider));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_telegram_color_text));
        arrayList.add(new ThemeDescription(this.listView, 32, new Class[]{TextCell.class}, new String[]{"imageView"}, null, null, -1, null, i7));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCell.class}, new String[]{"imageView"}, null, null, -1, null, i6));
        return arrayList;
    }

    public final void hideEmojiPopup(boolean z) {
        int i = 2;
        int i2 = 0;
        if (this.isPremium) {
            if (this.emojiViewVisible) {
                EmojiView emojiView = this.emojiView;
                emojiView.emojiGridView.stopScroll();
                emojiView.emojiTabs.scrollTo(0, 0);
                emojiView.resetTabsY(1);
                EmojiView.AnonymousClass6 anonymousClass6 = emojiView.emojiLayoutManager;
                anonymousClass6.scrollToPositionWithOffset(0, 0, anonymousClass6.mShouldReverseLayout);
                this.emojiView.closeSearch(-1L, false);
                if (z) {
                    this.emojiView.hideSearchKeyboard();
                }
                this.isEmojiSearchOpened = false;
                showEmojiPopup(0);
            }
            if (z) {
                EmojiView emojiView2 = this.emojiView;
                if (emojiView2 == null || emojiView2.getVisibility() != 0) {
                    hideEmojiView();
                    return;
                }
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, this.emojiView.getMeasuredHeight());
                valueAnimatorOfFloat.addUpdateListener(new ChatAttachAlertPollLayout$$ExternalSyntheticLambda2(this, i2));
                this.isAnimatePopupClosing = true;
                valueAnimatorOfFloat.addListener(new AnonymousClass8(this, i));
                valueAnimatorOfFloat.setDuration(250L);
                valueAnimatorOfFloat.setInterpolator(AdjustPanLayoutHelper.keyboardInterpolator);
                valueAnimatorOfFloat.start();
            }
        }
    }

    public final void hideEmojiView() {
        EmojiView emojiView;
        ChatActivityEnterViewAnimatedIconView emojiButton;
        if (!this.emojiViewVisible && (emojiView = this.emojiView) != null && emojiView.getVisibility() != 8) {
            PollEditTextCell pollEditTextCell = this.currentCell;
            if (pollEditTextCell != null && (emojiButton = pollEditTextCell.getEmojiButton()) != null) {
                emojiButton.setState(ChatActivityEnterViewAnimatedIconView.State.SMILE, false);
            }
            this.emojiView.setVisibility(8);
        }
        int i = this.emojiPadding;
        this.emojiPadding = 0;
        if (i != 0) {
            this.keyboardNotifier.fire();
        }
    }

    @Override
    public final boolean isDoneItemEnabled() {
        return this.doneItemEnabled;
    }

    @Override
    public final int needsActionBar() {
        return 1;
    }

    @Override
    public final boolean onBackPressed() {
        if (!this.emojiViewVisible) {
            return !checkDiscard();
        }
        hideEmojiPopup(true);
        return true;
    }

    @Override
    public final void onDestroy() {
        this.destroyed = true;
        ChatAttachAlert chatAttachAlert = this.parentAlert;
        NotificationCenter.getInstance(chatAttachAlert.currentAccount).removeObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        if (this.isPremium) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
            EmojiView emojiView = this.emojiView;
            if (emojiView != null) {
                chatAttachAlert.sizeNotifierFrameLayout.removeView(emojiView);
            }
        }
    }

    @Override
    public final boolean onDismissWithTouchOutside() {
        return checkDiscard();
    }

    @Override
    public final void onHidden() {
        this.parentAlert.updateDoneItemEnabled();
    }

    @Override
    public final void onHideShowProgress(float f) {
        this.parentAlert.updateDoneItemEnabled();
    }

    @Override
    public final void onMenuItemClick(int i) {
        int i2;
        int i3 = 0;
        if (i != 40) {
            return;
        }
        boolean z = this.todo;
        CharSequence[] charSequenceArr = this.answers;
        ChatAttachAlert chatAttachAlert = this.parentAlert;
        if (z) {
            CharSequence[] charSequenceArr2 = {getFixedString(this.questionString)};
            ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(chatAttachAlert.currentAccount).getEntities(charSequenceArr2, true);
            CharSequence charSequence = charSequenceArr2[0];
            if (entities != null) {
                int size = entities.size();
                for (int i4 = 0; i4 < size; i4++) {
                    TLRPC.MessageEntity messageEntity = entities.get(i4);
                    if (messageEntity.offset + messageEntity.length > charSequence.length()) {
                        messageEntity.length = charSequence.length() - messageEntity.offset;
                    }
                }
            }
            TLRPC.TL_messageMediaToDo tL_messageMediaToDo = new TLRPC.TL_messageMediaToDo();
            TLRPC.TodoList todoList = new TLRPC.TodoList();
            tL_messageMediaToDo.todo = todoList;
            boolean z2 = this.allowMarking;
            todoList.others_can_append = z2 && this.allowAdding;
            todoList.others_can_complete = z2;
            todoList.title = new TLRPC.TL_textWithEntities();
            tL_messageMediaToDo.todo.title.text = charSequence.toString();
            tL_messageMediaToDo.todo.title.entities = entities;
            for (int i5 = 0; i5 < charSequenceArr.length; i5++) {
                if (!TextUtils.isEmpty(getFixedString(charSequenceArr[i5]))) {
                    CharSequence[] charSequenceArr3 = {getFixedString(charSequenceArr[i5])};
                    ArrayList<TLRPC.MessageEntity> entities2 = MediaDataController.getInstance(chatAttachAlert.currentAccount).getEntities(charSequenceArr3, true);
                    CharSequence charSequence2 = charSequenceArr3[0];
                    if (entities2 != null) {
                        int size2 = entities2.size();
                        for (int i6 = 0; i6 < size2; i6++) {
                            TLRPC.MessageEntity messageEntity2 = entities2.get(i6);
                            if (messageEntity2.offset + messageEntity2.length > charSequence2.length()) {
                                messageEntity2.length = charSequence2.length() - messageEntity2.offset;
                            }
                        }
                    }
                    TLRPC.TodoItem todoItem = new TLRPC.TodoItem();
                    TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
                    todoItem.title = tL_textWithEntities;
                    tL_textWithEntities.text = charSequence2.toString();
                    todoItem.title.entities = entities2;
                    todoItem.id = tL_messageMediaToDo.todo.list.size() + 1;
                    tL_messageMediaToDo.todo.list.add(todoItem);
                }
            }
            AlertsCreator.ensurePaidMessageConfirmation(chatAttachAlert.currentAccount, chatAttachAlert.getDialogId(), chatAttachAlert.getAdditionalMessagesCount() + 1, new ArticleViewer$$ExternalSyntheticLambda33(this, (ChatActivity) chatAttachAlert.baseFragment, tL_messageMediaToDo, 7), 0L);
            return;
        }
        boolean z3 = this.quizPoll;
        MessageSeenView.AnonymousClass1 anonymousClass1 = this.listView;
        boolean[] zArr = this.answersChecks;
        if (z3 && !this.doneItemEnabled) {
            int i7 = 0;
            while (i3 < zArr.length) {
                if (!TextUtils.isEmpty(getFixedString(charSequenceArr[i3])) && zArr[i3]) {
                    i7++;
                }
                i3++;
            }
            if (i7 <= 0) {
                for (int i8 = this.answerStartRow; i8 < this.answerStartRow + this.answersCount; i8++) {
                    RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = anonymousClass1.findViewHolderForAdapterPosition(i8);
                    if (viewHolderFindViewHolderForAdapterPosition != null) {
                        View view = viewHolderFindViewHolderForAdapterPosition.itemView;
                        if (view instanceof PollEditTextCell) {
                            PollEditTextCell pollEditTextCell = (PollEditTextCell) view;
                            if (pollEditTextCell.getTop() > AndroidUtilities.dp(40.0f)) {
                                AnonymousClass7 anonymousClass7 = this.suggestEmojiPanel;
                                if (anonymousClass7 != null) {
                                    anonymousClass7.forceClose();
                                }
                                HintView hintView = this.hintView;
                                hintView.setText(LocaleController.getString(R.string.PollTapToSelect));
                                hintView.showForView(pollEditTextCell.getCheckBox(), true);
                                return;
                            }
                        } else {
                            continue;
                        }
                    }
                }
                return;
            }
            return;
        }
        int i9 = 0;
        while (true) {
            int length = charSequenceArr.length;
            PollAttachedMediaPack pollAttachedMediaPack = this.attachedMedia;
            if (i9 >= length) {
                CharSequence[] charSequenceArr4 = {getFixedString(this.questionString)};
                ArrayList<TLRPC.MessageEntity> entities3 = MediaDataController.getInstance(chatAttachAlert.currentAccount).getEntities(charSequenceArr4, true);
                CharSequence charSequence3 = charSequenceArr4[0];
                if (entities3 != null) {
                    int size3 = entities3.size();
                    for (int i10 = 0; i10 < size3; i10++) {
                        TLRPC.MessageEntity messageEntity3 = entities3.get(i10);
                        if (messageEntity3.offset + messageEntity3.length > charSequence3.length()) {
                            messageEntity3.length = charSequence3.length() - messageEntity3.offset;
                        }
                    }
                }
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = new TLRPC.TL_messageMediaPoll();
                TLRPC.TL_poll tL_poll = new TLRPC.TL_poll();
                tL_messageMediaPoll.poll = tL_poll;
                tL_poll.multiple_choice = this.multipleChoise;
                tL_poll.quiz = this.quizPoll;
                tL_poll.public_voters = !this.anonymousPoll;
                tL_poll.open_answers = this.allowAddingOptions;
                tL_poll.revoting_disabled = !this.allowRevoting;
                tL_poll.shuffle_answers = this.shuffleOptions;
                tL_poll.subscribers_only = this.poll2vSubscribersOnlyRow.zzc;
                if (this.poll2vLimitByCountryRow.zzc) {
                    ArrayList arrayList = this.countriesList;
                    if (!arrayList.isEmpty()) {
                        TLRPC.Poll poll = tL_messageMediaPoll.poll;
                        poll.flags |= 4096;
                        poll.countries_iso2.addAll(arrayList);
                    }
                }
                TLRPC.Poll poll2 = tL_messageMediaPoll.poll;
                poll2.creator = true;
                int i11 = this.pollLimitDuration;
                if (i11 != 0) {
                    poll2.hide_results_until_close = this.hideResults;
                    poll2.close_period = i11;
                    poll2.flags |= 16;
                } else {
                    int i12 = this.pollLimitDeadline;
                    if (i12 != 0) {
                        poll2.hide_results_until_close = this.hideResults;
                        poll2.close_date = i12;
                        poll2.flags |= 32;
                    }
                }
                poll2.question = new TLRPC.TL_textWithEntities();
                tL_messageMediaPoll.poll.question.text = charSequence3.toString();
                tL_messageMediaPoll.poll.question.entities = entities3;
                ArrayList arrayList2 = new ArrayList(this.maxAnswersCount);
                int i13 = 0;
                while (true) {
                    int length2 = charSequenceArr.length;
                    i2 = chatAttachAlert.currentAccount;
                    if (i13 >= length2) {
                        break;
                    }
                    if (TextUtils.isEmpty(getFixedString(charSequenceArr[i13]))) {
                        pollAttachedMediaPack.removeAnswerAndShift(tL_messageMediaPoll.poll.answers.size());
                    } else {
                        CharSequence[] charSequenceArr5 = new CharSequence[1];
                        charSequenceArr5[i3] = getFixedString(charSequenceArr[i13]);
                        ArrayList<TLRPC.MessageEntity> entities4 = MediaDataController.getInstance(i2).getEntities(charSequenceArr5, true);
                        CharSequence charSequence4 = charSequenceArr5[i3];
                        if (entities4 != null) {
                            int size4 = entities4.size();
                            for (int i14 = 0; i14 < size4; i14++) {
                                TLRPC.MessageEntity messageEntity4 = entities4.get(i14);
                                if (messageEntity4.offset + messageEntity4.length > charSequence4.length()) {
                                    messageEntity4.length = charSequence4.length() - messageEntity4.offset;
                                }
                            }
                        }
                        TLRPC.TL_pollAnswer tL_pollAnswer = new TLRPC.TL_pollAnswer();
                        TLRPC.TL_textWithEntities tL_textWithEntities2 = new TLRPC.TL_textWithEntities();
                        tL_pollAnswer.text = tL_textWithEntities2;
                        tL_textWithEntities2.text = charSequence4.toString();
                        tL_pollAnswer.text.entities = entities4;
                        tL_pollAnswer.option = new byte[]{(byte) (tL_messageMediaPoll.poll.answers.size() + 48)};
                        if ((this.multipleChoise || this.quizPoll) && zArr[i13]) {
                            arrayList2.add(Integer.valueOf(tL_messageMediaPoll.poll.answers.size()));
                        }
                        tL_messageMediaPoll.poll.answers.add(tL_pollAnswer);
                    }
                    i13++;
                    i3 = 0;
                }
                tL_messageMediaPoll.results = new TLRPC.TL_pollResults();
                CharSequence fixedString = getFixedString(this.solutionString);
                if (fixedString != null) {
                    tL_messageMediaPoll.results.solution = fixedString.toString();
                    ArrayList<TLRPC.MessageEntity> entities5 = MediaDataController.getInstance(i2).getEntities(new CharSequence[]{fixedString}, true);
                    if (entities5 != null && !entities5.isEmpty()) {
                        tL_messageMediaPoll.results.solution_entities = entities5;
                    }
                    if (!TextUtils.isEmpty(tL_messageMediaPoll.results.solution)) {
                        tL_messageMediaPoll.results.flags |= 16;
                    }
                }
                AlertsCreator.ensurePaidMessageConfirmation(chatAttachAlert.currentAccount, chatAttachAlert.getDialogId(), chatAttachAlert.getAdditionalMessagesCount() + 1, new GiftSheet$$ExternalSyntheticLambda23(this, (ChatActivity) chatAttachAlert.baseFragment, tL_messageMediaPoll, arrayList2, 6), 0L);
                return;
            }
            if (TextUtils.isEmpty(getFixedString(charSequenceArr[i9])) && ((PollAttachedMedia) pollAttachedMediaPack.medias.get(i9)) != null) {
                this.smoothScrollToOption = true;
                this.showMediaHintIndexAfterSmoothScroll = i9;
                anonymousClass1.smoothScrollToPosition(this.answerStartRow + i9);
                return;
            }
            i9++;
        }
    }

    @Override
    public final void onPause() {
        ListAdapter listAdapter = this.listAdapter;
        if (listAdapter != null) {
            listAdapter.mObservable.notifyChanged();
        }
        if (this.isPremium) {
            hideEmojiPopup(false);
            AnonymousClass7 anonymousClass7 = this.suggestEmojiPanel;
            if (anonymousClass7 != null) {
                anonymousClass7.forceClose();
            }
            PollEditTextCell pollEditTextCell = this.currentCell;
            if (pollEditTextCell != null) {
                pollEditTextCell.setEmojiButtonVisibility(false);
                this.currentCell.getTextView().clearFocus();
                AndroidUtilities.hideKeyboard(this.currentCell.getEditField());
            }
        }
    }

    @Override
    public final void onPreMeasure(int i, int i2) {
        int iDp;
        int i3;
        ChatAttachAlert chatAttachAlert = this.parentAlert;
        if (chatAttachAlert.sizeNotifierFrameLayout.measureKeyboardHeight() > AndroidUtilities.dp(20.0f) || this.emojiViewVisible || this.isAnimatePopupClosing || this.isEmojiSearchOpened) {
            iDp = AndroidUtilities.dp(52.0f);
            chatAttachAlert.setAllowNestedScroll(false);
        } else {
            if (AndroidUtilities.isTablet()) {
                i3 = (i2 / 5) * 2;
            } else {
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i3 = (int) (i2 / 3.5f);
                } else {
                    i3 = (i2 / 5) * 2;
                }
            }
            iDp = i3 - AndroidUtilities.dp(13.0f);
            if (iDp < 0) {
                iDp = 0;
            }
            chatAttachAlert.setAllowNestedScroll(this.allowNesterScroll);
        }
        int i4 = iDp + AndroidUtilities.statusBarHeight;
        this.ignoreLayout = true;
        int i5 = this.topPadding;
        MessageSeenView.AnonymousClass1 anonymousClass1 = this.listView;
        if (i5 != i4 || anonymousClass1.getPaddingBottom() != this.listPaddingBottom) {
            this.topPadding = i4;
            anonymousClass1.setPaddingWithoutRequestLayout(0, 0, 0, this.listPaddingBottom);
            anonymousClass1.setItemAnimator(null);
            this.listAdapter.notifyItemChanged(0);
        }
        this.ignoreLayout = false;
    }

    @Override
    public final void onShow(ChatAttachAlert.AttachAlertLayout attachAlertLayout) {
        ChatAttachAlert chatAttachAlert = this.parentAlert;
        try {
            chatAttachAlert.actionBar.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        if (this.todo) {
            chatAttachAlert.actionBar.setTitle(LocaleController.getString(R.string.TodoTitle));
        } else if (this.quizOnly) {
            chatAttachAlert.actionBar.setTitle(LocaleController.getString(R.string.NewQuiz));
        } else {
            chatAttachAlert.actionBar.setTitle(LocaleController.getString(R.string.NewPoll));
        }
        chatAttachAlert.updateDoneItemEnabled();
        AnonymousClass4 anonymousClass4 = this.layoutManager;
        anonymousClass4.scrollToPositionWithOffset(0, 0, anonymousClass4.mShouldReverseLayout);
    }

    @Override
    public final void onSizeChanged(int i, boolean z) {
        boolean z2;
        if (this.isPremium) {
            if (i > AndroidUtilities.dp(50.0f) && this.keyboardVisible && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                if (z) {
                    this.keyboardHeightLand = i;
                    MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.keyboardHeightLand).commit();
                } else {
                    this.keyboardHeight = i;
                    MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.keyboardHeight).commit();
                }
            }
            boolean z3 = this.emojiViewVisible;
            KeyboardNotifier keyboardNotifier = this.keyboardNotifier;
            ChatAttachAlert chatAttachAlert = this.parentAlert;
            if (z3) {
                int iDp = z ? this.keyboardHeightLand : this.keyboardHeight;
                if (this.isEmojiSearchOpened) {
                    iDp += AndroidUtilities.dp(120.0f);
                }
                int i2 = iDp + AndroidUtilities.navigationBarHeight;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.emojiView.getLayoutParams();
                int i3 = layoutParams.width;
                int i4 = AndroidUtilities.displaySize.x;
                if (i3 != i4 || layoutParams.height != i2 || this.wasEmojiSearchOpened != this.isEmojiSearchOpened) {
                    layoutParams.width = i4;
                    layoutParams.height = i2;
                    this.emojiView.setLayoutParams(layoutParams);
                    this.emojiPadding = layoutParams.height;
                    keyboardNotifier.fire();
                    chatAttachAlert.sizeNotifierFrameLayout.requestLayout();
                    boolean z4 = this.wasEmojiSearchOpened;
                    if (z4 != this.isEmojiSearchOpened) {
                        animateEmojiViewTranslationY(z4 ? -AndroidUtilities.dp(120.0f) : AndroidUtilities.dp(120.0f));
                    }
                    this.wasEmojiSearchOpened = this.isEmojiSearchOpened;
                }
            }
            if (this.lastSizeChangeValue1 == i && this.lastSizeChangeValue2 == z) {
                return;
            }
            this.lastSizeChangeValue1 = i;
            this.lastSizeChangeValue2 = z;
            boolean z5 = this.keyboardVisible;
            PollEditTextCell pollEditTextCell = this.currentCell;
            if (pollEditTextCell != null) {
                this.keyboardVisible = pollEditTextCell.getEditField().isFocused() && keyboardNotifier.keyboardVisible() && i > 0;
            } else {
                this.keyboardVisible = false;
            }
            if (this.keyboardVisible && this.emojiViewVisible) {
                showEmojiPopup(0);
            }
            if (this.emojiPadding != 0 && !(z2 = this.keyboardVisible) && z2 != z5 && !this.emojiViewVisible) {
                this.emojiPadding = 0;
                keyboardNotifier.fire();
                chatAttachAlert.sizeNotifierFrameLayout.requestLayout();
            }
            if (this.keyboardVisible && this.waitingForKeyboardOpen) {
                this.waitingForKeyboardOpen = false;
                AndroidUtilities.cancelRunOnUIThread(this.openKeyboardRunnable);
            }
        }
    }

    public final void openAttachMenuForOptions(int i) {
        this.currentAttachAlertIndex = i;
        BaseFragment baseFragment = this.parentAlert.baseFragment;
        PollAttachedMedia pollAttachedMedia = (PollAttachedMedia) this.attachedMedia.medias.get(i);
        if (!(pollAttachedMedia instanceof PollAttachedMediaMusic) && !(pollAttachedMedia instanceof PollAttachedMediaFile)) {
            if (pollAttachedMedia instanceof PollAttachedMediaSticker) {
                boolean z = ((PollAttachedMediaSticker) pollAttachedMedia).isEmoji;
            } else if (!(pollAttachedMedia instanceof PollAttachedMediaLocation)) {
                boolean z2 = pollAttachedMedia instanceof PollAttachedMediaLink;
            }
        }
        this.currentAttachAlert = openPollAttachMenu(baseFragment, (i == -2 || i == -3) ? 74 : 41026, new ChatAttachAlertPollLayout$$ExternalSyntheticLambda16(this, i, 0), new Bulletin$2$$ExternalSyntheticLambda1(this, 18));
    }

    public final void openEditOrReplaceMenu(final int i) {
        ChatAttachAlert chatAttachAlert;
        BaseFragment baseFragment;
        PollAttachedMedia pollAttachedMedia = (PollAttachedMedia) this.attachedMedia.medias.get(i);
        if (pollAttachedMedia == null || (chatAttachAlert = this.parentAlert) == null || (baseFragment = chatAttachAlert.baseFragment) == null) {
            return;
        }
        Activity parentActivity = baseFragment.getParentActivity();
        if (pollAttachedMedia instanceof PollAttachedMediaGallery) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(((PollAttachedMediaGallery) pollAttachedMedia).photoEntry);
            PhotoViewer.getInstance().setParentActivity(parentActivity, null, null);
            PhotoViewer.getInstance().openPhotoForSelect(arrayList, 0, 14, false, new PhotoViewer.EmptyPhotoViewerProvider() {
                public boolean openReplace;

                @Override
                public final boolean allowCaption() {
                    return false;
                }

                @Override
                public final void onClose() {
                    if (this.openReplace) {
                        ChatAttachAlertPollLayout.this.openAttachMenuForOptions(i);
                    }
                }

                @Override
                public final void onPollAttachDelete() {
                    ChatAttachAlertPollLayout.this.setAttachedMedia(i, null);
                }

                @Override
                public final void onPollAttachReplace() {
                    this.openReplace = true;
                }
            }, null);
            return;
        }
        if (pollAttachedMedia instanceof PollAttachedMediaSticker) {
            PollAttachedMediaSticker pollAttachedMediaSticker = (PollAttachedMediaSticker) pollAttachedMedia;
            ContentPreviewViewer.getInstance().setParentActivity(parentActivity);
            ContentPreviewViewer contentPreviewViewer = ContentPreviewViewer.getInstance();
            contentPreviewViewer.delegate = new AnonymousClass13(i);
            contentPreviewViewer.isPhotoEditor = false;
            contentPreviewViewer.isStickerEditor = false;
            ContentPreviewViewer contentPreviewViewer2 = ContentPreviewViewer.getInstance();
            TLRPC.Document document = pollAttachedMediaSticker.sticker;
            contentPreviewViewer2.open(document, null, "", null, null, MessageObject.isAnimatedEmoji(document) ? 2 : 0, false, pollAttachedMediaSticker.parent, this.resourcesProvider, 200);
            return;
        }
        if (pollAttachedMedia instanceof PollAttachedMediaFile) {
            PollAttachedMediaFile pollAttachedMediaFile = (PollAttachedMediaFile) pollAttachedMedia;
            showOptionsForDrawable(i, new ChatActivity$$ExternalSyntheticLambda230(1, pollAttachedMediaFile.name, AndroidUtilities.formatFileSize(pollAttachedMediaFile.size, true, true) + " " + pollAttachedMediaFile.ext), AndroidUtilities.dp(240.0f), AndroidUtilities.dp(60.0f));
            return;
        }
        if (pollAttachedMedia instanceof PollAttachedMediaMusic) {
            PollAttachedMediaMusic pollAttachedMediaMusic = (PollAttachedMediaMusic) pollAttachedMedia;
            TLRPC.Document document2 = pollAttachedMediaMusic.messageObject.getDocument();
            showOptionsForDrawable(i, new StakedDiceSheet$$ExternalSyntheticLambda6(MessageObject.getMusicTitle(document2, true), MessageObject.getMusicAuthor(document2, true) + " - " + LocaleController.formatShortDuration((int) MessageObject.getDocumentDuration(document2)), pollAttachedMediaMusic, 2), AndroidUtilities.dp(240.0f), AndroidUtilities.dp(60.0f));
            return;
        }
        if (pollAttachedMedia instanceof PollAttachedMediaLocation) {
            showOptionsForDrawable(i, new WebActionBar$$ExternalSyntheticLambda9((PollAttachedMediaLocation) pollAttachedMedia, 2), AndroidUtilities.dp(300.0f), (AndroidUtilities.dp(300.0f) * 9) / 16);
        } else if (!(pollAttachedMedia instanceof PollAttachedMediaLink)) {
            openAttachMenuForOptions(i);
        } else {
            PollAttachedMediaLink pollAttachedMediaLink = (PollAttachedMediaLink) pollAttachedMedia;
            AlertsCreator.showAddLinkToPoll(getContext(), this.resourcesProvider, pollAttachedMediaLink.url, pollAttachedMediaLink.webPage, new ChatAttachAlertPollLayout$$ExternalSyntheticLambda16(this, i, 1), new ChatAttachAlertPollLayout$$ExternalSyntheticLambda24(this, i, 0));
        }
    }

    public final void openKeyboardInternal$1() {
        PollEditTextCell pollEditTextCell = this.currentCell;
        if (pollEditTextCell != null) {
            this.keyboardNotifier.awaitingKeyboard = true;
            EditTextBoldCursor editField = pollEditTextCell.getEditField();
            editField.requestFocus();
            AndroidUtilities.showKeyboard(editField);
        }
        showEmojiPopup(AndroidUtilities.usingHardwareInput ? 0 : 2);
        if (AndroidUtilities.usingHardwareInput || this.keyboardVisible || AndroidUtilities.isInMultiwindow || AndroidUtilities.isTablet()) {
            return;
        }
        this.waitingForKeyboardOpen = true;
        BubbleActivity.AnonymousClass1 anonymousClass1 = this.openKeyboardRunnable;
        AndroidUtilities.cancelRunOnUIThread(anonymousClass1);
        AndroidUtilities.runOnUIThread(anonymousClass1, 100L);
    }

    @Override
    public final void requestLayout() {
        if (this.ignoreLayout) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void scrollToTop() {
        this.listView.smoothScrollToPosition(1);
    }

    public final void setAttachedMedia(int i, PollAttachedMedia pollAttachedMedia) {
        int i2;
        PollAttachedMediaPack pollAttachedMediaPack = this.attachedMedia;
        if (pollAttachedMedia != null) {
            pollAttachedMediaPack.medias.put(i, pollAttachedMedia);
        } else {
            pollAttachedMediaPack.medias.remove(i);
        }
        if (i == -2) {
            i2 = this.descriptionRow;
        } else if (i == -3) {
            i2 = this.solutionRow;
        } else {
            int i3 = this.answerStartRow;
            i2 = (i3 < 0 || i < 0 || i >= this.answersCount) ? -1 : i + i3;
        }
        if (i2 >= 0) {
            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = this.listView.findViewHolderForAdapterPosition(i2);
            if (viewHolderFindViewHolderForAdapterPosition != null) {
                View view = viewHolderFindViewHolderForAdapterPosition.itemView;
                if (view instanceof PollEditTextCell) {
                    ((PollEditTextCell) view).attachView.setAttachedMedia(pollAttachedMedia, true);
                } else {
                    this.listAdapter.notifyItemChanged(i2);
                }
            } else {
                this.listAdapter.notifyItemChanged(i2);
            }
        }
        if (pollAttachedMedia instanceof PollAttachedMediaLink) {
            PollAttachedMediaLink pollAttachedMediaLink = (PollAttachedMediaLink) pollAttachedMedia;
            String str = pollAttachedMediaLink.url;
            OAuthSheet$$ExternalSyntheticLambda18 oAuthSheet$$ExternalSyntheticLambda18 = new OAuthSheet$$ExternalSyntheticLambda18(8, this, pollAttachedMedia);
            WebPageLoader webPageLoader = this.webPageLoader;
            HashMap map = webPageLoader.pages;
            if (map.containsKey(str)) {
                oAuthSheet$$ExternalSyntheticLambda18.run((TLRPC.WebPage) map.get(str), null);
            } else {
                HashMap map2 = webPageLoader.callbacks;
                boolean zContainsKey = map2.containsKey(str);
                ArrayList arrayList = (ArrayList) map2.get(str);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    map2.put(str, arrayList);
                }
                arrayList.add(oAuthSheet$$ExternalSyntheticLambda18);
                if (!zContainsKey) {
                    TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
                    getwebpagepreview.message = str;
                    ConnectionsManager.getInstance(webPageLoader.currentAccount).sendRequestTyped(getwebpagepreview, new AiTonesController$$ExternalSyntheticLambda0(), new OAuthSheet$$ExternalSyntheticLambda18(13, webPageLoader, str));
                }
            }
            checkPollLinkMedia(pollAttachedMediaLink, false);
        }
        checkDoneButton$1();
    }

    public void setDelegate(PollCreateActivityDelegate pollCreateActivityDelegate) {
        this.delegate = pollCreateActivityDelegate;
    }

    @Override
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        this.parentAlert.getSheetContainer().invalidate();
    }

    public final void showEmojiPopup(int i) {
        ChatActivityEnterViewAnimatedIconView emojiButton;
        PollEditTextCell pollEditTextCell;
        int i2 = 0;
        int i3 = 1;
        if (this.isPremium) {
            KeyboardNotifier keyboardNotifier = this.keyboardNotifier;
            ChatAttachAlert chatAttachAlert = this.parentAlert;
            if (i != 1) {
                PollEditTextCell pollEditTextCell2 = this.currentCell;
                emojiButton = pollEditTextCell2 != null ? pollEditTextCell2.getEmojiButton() : null;
                if (emojiButton != null) {
                    emojiButton.setState(ChatActivityEnterViewAnimatedIconView.State.SMILE, true);
                }
                EmojiView emojiView = this.emojiView;
                if (emojiView != null) {
                    this.emojiViewVisible = false;
                    this.isEmojiSearchOpened = false;
                    if (AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                        emojiView.setVisibility(8);
                    }
                }
                if (i == 0) {
                    this.emojiPadding = 0;
                }
                keyboardNotifier.fire();
                chatAttachAlert.sizeNotifierFrameLayout.requestLayout();
                return;
            }
            EmojiView emojiView2 = this.emojiView;
            boolean z = emojiView2 != null && emojiView2.getVisibility() == 0;
            EmojiView emojiView3 = this.emojiView;
            if (emojiView3 != null && emojiView3.currentAccount != UserConfig.selectedAccount) {
                chatAttachAlert.sizeNotifierFrameLayout.removeView(emojiView3);
                this.emojiView = null;
            }
            if (this.emojiView == null) {
                EmojiView emojiView4 = new EmojiView(null, true, false, false, getContext(), true, null, null, true, this.resourcesProvider, false, false);
                this.emojiView = emojiView4;
                emojiView4.emojiCacheType = 3;
                emojiView4.shouldLightenBackground = false;
                emojiView4.fixBottomTabContainerTranslation = false;
                emojiView4.setShouldDrawBackground(false);
                EmojiView emojiView5 = this.emojiView;
                emojiView5.allowEmojisForNonPremium = false;
                emojiView5.setVisibility(8);
                if (AndroidUtilities.isTablet()) {
                    this.emojiView.setForseMultiwindowLayout(true);
                }
                this.emojiView.setDelegate(new AnonymousClass10());
                chatAttachAlert.sizeNotifierFrameLayout.addView(this.emojiView);
                this.emojiView.setBottomInset(AndroidUtilities.navigationBarHeight);
            }
            this.emojiView.setVisibility(0);
            this.emojiViewVisible = true;
            EmojiView emojiView6 = this.emojiView;
            if (this.keyboardHeight <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.keyboardHeight = AndroidUtilities.dp(150.0f);
                } else {
                    this.keyboardHeight = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
                }
            }
            if (this.keyboardHeightLand <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.keyboardHeightLand = AndroidUtilities.dp(150.0f);
                } else {
                    this.keyboardHeightLand = MessagesController.getGlobalEmojiSettings().getInt("kbd_height_land3", AndroidUtilities.dp(200.0f));
                }
            }
            Point point = AndroidUtilities.displaySize;
            int i4 = point.x > point.y ? this.keyboardHeightLand : this.keyboardHeight;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) emojiView6.getLayoutParams();
            layoutParams.height = AndroidUtilities.navigationBarHeight + i4;
            emojiView6.setLayoutParams(layoutParams);
            if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet() && (pollEditTextCell = this.currentCell) != null) {
                AndroidUtilities.hideKeyboard(pollEditTextCell.getEditField());
            }
            this.emojiPadding = i4;
            keyboardNotifier.fire();
            chatAttachAlert.sizeNotifierFrameLayout.requestLayout();
            PollEditTextCell pollEditTextCell3 = this.currentCell;
            emojiButton = pollEditTextCell3 != null ? pollEditTextCell3.getEmojiButton() : null;
            if (emojiButton != null) {
                emojiButton.setState(ChatActivityEnterViewAnimatedIconView.State.KEYBOARD, true);
            }
            if (z || this.keyboardVisible) {
                return;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.emojiPadding, 0.0f);
            valueAnimatorOfFloat.addUpdateListener(new ChatAttachAlertPollLayout$$ExternalSyntheticLambda2(this, i3));
            valueAnimatorOfFloat.addListener(new AnonymousClass8(this, i2));
            valueAnimatorOfFloat.setDuration(250L);
            valueAnimatorOfFloat.setInterpolator(AdjustPanLayoutHelper.keyboardInterpolator);
            valueAnimatorOfFloat.start();
        }
    }

    public final void showOptionsForDrawable(int i, Utilities.CallbackReturn callbackReturn, int i2, int i3) {
        ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions(this, null, new View(getContext()));
        itemOptionsMakeOptions.dimAlpha = 0;
        itemOptionsMakeOptions.drawScrim = false;
        itemOptionsMakeOptions.add(R.drawable.msg_replace, LocaleController.getString(R.string.ReplaceAttachedPollMedia), new ChatAttachAlertPollLayout$$ExternalSyntheticLambda24(this, i, 1), false);
        itemOptionsMakeOptions.add(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new ChatAttachAlertPollLayout$$ExternalSyntheticLambda24(this, i, 2), true);
        ScrimOptions scrimOptions = new ScrimOptions(getContext(), this.resourcesProvider);
        itemOptionsMakeOptions.dismissListener = new ChatActivity$$ExternalSyntheticLambda112(scrimOptions, 1);
        itemOptionsMakeOptions.minWidthDp = AndroidUtilities.dp(185.0f);
        itemOptionsMakeOptions.setupSelectors();
        scrimOptions.setItemOptions(itemOptionsMakeOptions);
        Drawable drawable = (Drawable) callbackReturn.run(scrimOptions.windowView);
        BlurredBackgroundDrawable blurredBackgroundDrawableCreate = scrimOptions.iBlur3Factory.create(null, null, false);
        blurredBackgroundDrawableCreate.setColorProvider(BlurredBackgroundProviderImpl.scrimMenuBackground(scrimOptions.resourcesProvider));
        blurredBackgroundDrawableCreate.setPadding(AndroidUtilities.dp(8.0f));
        blurredBackgroundDrawableCreate.boundProps.hasPadding = true;
        blurredBackgroundDrawableCreate.setRadius(AndroidUtilities.dp(16.0f));
        scrimOptions.scrimDrawableBackground = blurredBackgroundDrawableCreate;
        scrimOptions.scrimDrawable = drawable;
        Point point = AndroidUtilities.displaySize;
        int i4 = (point.x - i2) / 2;
        int i5 = (point.y - i3) / 2;
        int i6 = i2 + i4;
        int i7 = i3 + i5;
        blurredBackgroundDrawableCreate.setBounds(i4 - AndroidUtilities.dp(8.0f), i5 - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f) + i6, AndroidUtilities.dp(8.0f) + i7);
        scrimOptions.scrimDrawable.setBounds(i4, i5, i6, i7);
        ((FrameLayout.LayoutParams) scrimOptions.optionsContainer.getLayoutParams()).gravity = 1;
        scrimOptions.optionsAtCenter = true;
        scrimOptions.show();
    }

    public final void updateRows$5() {
        this.solutionRowHeader = -1;
        this.solutionRow = -1;
        this.solutionInfoRow = -1;
        this.poll2vMultipleRow = -1;
        this.poll2vAnonymousRow = -1;
        this.poll2vLimitDurationRow = -1;
        this.poll2vLimitDurationTimeRow = -1;
        this.poll2vLimitDurationHideResultsRow = -1;
        this.poll2vLimitDurationHideResultsRowInfo = -1;
        this.poll2vAllowAddingRow = -1;
        this.poll2vShuffleRow = -1;
        this.poll2vAllowRevotingRow = -1;
        this.poll2vQuizRow = -1;
        zzfz zzfzVar = this.poll2vSubscribersOnlyRow;
        zzfzVar.zzb = -1;
        zzfz zzfzVar2 = this.poll2vLimitByCountryRow;
        zzfzVar2.zzb = -1;
        this.poll2vLimitByCountryListRow = -1;
        this.allowAddingRow = -1;
        this.allowMarkingRow = -1;
        this.addAnswerRow = -1;
        this.answerStartRow = -1;
        this.settingsSectionRow = -1;
        this.descriptionRow = -1;
        this.questionHeaderRow = 1;
        this.rowCount = 3;
        this.questionRow = 2;
        boolean z = this.todo;
        if (!z) {
            this.rowCount = 4;
            this.descriptionRow = 3;
        }
        int i = this.rowCount;
        int i2 = i + 1;
        this.questionSectionRow = i;
        int i3 = i + 2;
        this.rowCount = i3;
        this.answerHeaderRow = i2;
        int i4 = this.answersCount;
        if (i4 != 0) {
            this.answerStartRow = i3;
            this.rowCount = i3 + i4;
        }
        if (i4 != this.answers.length) {
            int i5 = this.rowCount;
            this.rowCount = i5 + 1;
            this.addAnswerRow = i5;
        }
        int i6 = this.rowCount;
        this.answerSectionRow = i6;
        int i7 = i6 + 2;
        this.rowCount = i7;
        this.settingsHeaderRow = i6 + 1;
        if (z) {
            int i8 = i6 + 3;
            this.rowCount = i8;
            this.allowMarkingRow = i7;
            if (this.allowMarking) {
                this.rowCount = i6 + 4;
                this.allowAddingRow = i8;
            }
        } else {
            TLRPC.Chat chat = ((ChatActivity) this.parentAlert.baseFragment).currentChat;
            boolean z2 = ChatObject.isChannel(chat) && !chat.megagroup;
            if (z2) {
                this.anonymousPoll = true;
            } else {
                int i9 = this.rowCount;
                this.rowCount = i9 + 1;
                this.poll2vAnonymousRow = i9;
            }
            int i10 = this.rowCount;
            int i11 = i10 + 1;
            this.rowCount = i11;
            this.poll2vMultipleRow = i10;
            if (z2) {
                this.allowAddingOptions = false;
            } else {
                this.rowCount = i10 + 2;
                this.poll2vAllowAddingRow = i11;
            }
            int i12 = this.rowCount;
            this.poll2vAllowRevotingRow = i12;
            this.poll2vShuffleRow = i12 + 1;
            int i13 = i12 + 3;
            this.rowCount = i13;
            this.poll2vQuizRow = i12 + 2;
            if (z2) {
                zzfzVar.zzb = i13;
                int i14 = i12 + 5;
                this.rowCount = i14;
                zzfzVar2.zzb = i12 + 4;
                if (zzfzVar2.zzc) {
                    this.rowCount = i12 + 6;
                    this.poll2vLimitByCountryListRow = i14;
                }
            }
            int i15 = this.rowCount;
            int i16 = i15 + 1;
            this.rowCount = i16;
            this.poll2vLimitDurationRow = i15;
            if (this.pollLimitDuration != 0 || this.pollLimitDeadline != 0) {
                this.poll2vLimitDurationTimeRow = i16;
                this.poll2vLimitDurationHideResultsRow = i15 + 2;
                this.rowCount = i15 + 4;
                this.poll2vLimitDurationHideResultsRowInfo = i15 + 3;
            }
            int i17 = this.rowCount;
            int i18 = i17 + 1;
            this.rowCount = i18;
            this.settingsSectionRow = i17;
            if (this.quizPoll) {
                this.solutionRowHeader = i18;
                this.solutionRow = i17 + 2;
                this.rowCount = i17 + 4;
                this.solutionInfoRow = i17 + 3;
            }
        }
        int i19 = this.rowCount;
        this.rowCount = i19 + 1;
        this.emptyRow = i19;
    }
}
