package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
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
import com.google.android.gms.internal.mlkit_vision_common.zzkd;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import me.vkryl.android.animator.BoolAnimator;
import me.vkryl.android.animator.FactorAnimator;
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
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.AdjustPanLayoutHelper;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.PollCreateCheckCell;
import org.telegram.ui.Cells.PollEditTextCell;
import org.telegram.ui.Cells.ShadowSectionCell;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Cells.TextCheckCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda8;
import org.telegram.ui.Components.poll.PollAttachedMedia;
import org.telegram.ui.Components.poll.PollAttachedMediaPack;
import org.telegram.ui.Components.poll.WebPageLoader;
import org.telegram.ui.Components.poll.attached.PollAttachedMediaFile;
import org.telegram.ui.Components.poll.attached.PollAttachedMediaGallery;
import org.telegram.ui.Components.poll.attached.PollAttachedMediaLink;
import org.telegram.ui.Components.poll.attached.PollAttachedMediaLocation;
import org.telegram.ui.Components.poll.attached.PollAttachedMediaMusic;
import org.telegram.ui.Components.poll.attached.PollAttachedMediaSticker;
import org.telegram.ui.Components.poll.sheets.CountrySelectBottomSheet;
import org.telegram.ui.ContentPreviewViewer;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Stories.recorder.KeyboardNotifier;
import org.telegram.ui.bots.BotBiometry$$ExternalSyntheticLambda10;

public class ChatAttachAlertPollLayout extends ChatAttachAlert.AttachAlertLayout implements SizeNotifierFrameLayout.SizeNotifierFrameLayoutDelegate, NotificationCenter.NotificationCenterDelegate {
    public static final int MAX_ANSWER_LENGTH = 100;
    public static final int MAX_QUESTION_LENGTH = 255;
    public static final int MAX_SOLUTION_LENGTH = 200;
    private static final int done_button = 40;
    private final int MAX_CAPTION_LENGTH;
    private final int[] POLL_DURATION_OPTIONS;
    private int addAnswerRow;
    private boolean allowAdding;
    private boolean allowAddingOptions;
    private int allowAddingRow;
    private boolean allowMarking;
    private int allowMarkingRow;
    private boolean allowNesterScroll;
    private boolean allowRevoting;
    private boolean anonymousPoll;
    private int answerHeaderRow;
    private int answerSectionRow;
    private int answerStartRow;
    private final CharSequence[] answers;
    private final boolean[] answersChecks;
    private int answersCount;
    private final PollAttachedMediaPack attachedMedia;
    private final Paint checkboxPaint;
    private ArrayList<String> countriesList;
    private ChatAttachAlert currentAttachAlert;
    private int currentAttachAlertIndex;
    private PollEditTextCell currentCell;
    private PollCreateActivityDelegate delegate;
    private int descriptionRow;
    private CharSequence descriptionString;
    private boolean destroyed;
    private boolean doneItemEnabled;
    private int emojiPadding;
    public EmojiView emojiView;
    public boolean emojiViewVisible;
    public boolean emojiViewWasVisible;
    private int emptyRow;
    private boolean hideResults;
    private boolean hintShowed;
    private HintView hintView;
    private boolean ignoreLayout;
    private boolean isAnimatePopupClosing;
    public boolean isEmojiSearchOpened;
    private final boolean isPremium;
    private final DefaultItemAnimator itemAnimator;
    private int keyboardHeight;
    private int keyboardHeightLand;
    private final KeyboardNotifier keyboardNotifier;
    private boolean keyboardVisible;
    private int lastSizeChangeValue1;
    private boolean lastSizeChangeValue2;
    private final FillLastLinearLayoutManager layoutManager;
    private final ListAdapter listAdapter;
    private final RecyclerListView listView;
    private final int maxAnswersCount;
    private boolean multipleChoise;
    private final Runnable openKeyboardRunnable;
    private int paddingRow;
    private int poll2vAllowAddingRow;
    private int poll2vAllowRevotingRow;
    private int poll2vAnonymousRow;
    private int poll2vLimitByCountryListRow;
    private final ToggleRow poll2vLimitByCountryRow;
    private int poll2vLimitDurationHideResultsRow;
    private int poll2vLimitDurationHideResultsRowInfo;
    private int poll2vLimitDurationRow;
    private int poll2vLimitDurationTimeRow;
    private int poll2vMultipleRow;
    private int poll2vQuizRow;
    private int poll2vShuffleRow;
    private final ToggleRow poll2vSubscribersOnlyRow;
    private int pollLimitDeadline;
    private int pollLimitDuration;
    private int questionHeaderRow;
    private int questionRow;
    private int questionSectionRow;
    private CharSequence questionString;
    private boolean quizOnly;
    private boolean quizPoll;
    private int requestFieldFocusAtPosition;
    private int rowCount;
    private int settingsHeaderRow;
    private int settingsSectionRow;
    private int showMediaHintIndexAfterSmoothScroll;
    private boolean shuffleOptions;
    private boolean smoothScrollToOption;
    private int solutionInfoRow;
    private int solutionRow;
    private int solutionRowHeader;
    private CharSequence solutionString;
    private SuggestEmojiView suggestEmojiPanel;
    private final boolean todo;
    private final ToggleRow[] toggleRows;
    private int topPadding;
    private boolean waitingForKeyboardOpen;
    public boolean wasEmojiSearchOpened;
    private final WebPageLoader webPageLoader;

    public class AnonymousClass10 implements EmojiView.EmojiViewDelegate {
        public AnonymousClass10() {
        }

        public void lambda$onClearEmojiRecent$0(AlertDialog alertDialog, int i) {
            ChatAttachAlertPollLayout.this.emojiView.clearRecentEmoji();
        }

        @Override
        public final boolean canAddCaptionToGif(TLRPC.Document document) {
            return EmojiView.EmojiViewDelegate.CC.$default$canAddCaptionToGif(this, document);
        }

        @Override
        public final boolean canSchedule() {
            return EmojiView.EmojiViewDelegate.CC.$default$canSchedule(this);
        }

        @Override
        public final long getDialogId() {
            return EmojiView.EmojiViewDelegate.CC.$default$getDialogId(this);
        }

        @Override
        public final float getProgressToSearchOpened() {
            return EmojiView.EmojiViewDelegate.CC.$default$getProgressToSearchOpened(this);
        }

        @Override
        public final int getThreadId() {
            return EmojiView.EmojiViewDelegate.CC.$default$getThreadId(this);
        }

        @Override
        public final void invalidateEnterView() {
            EmojiView.EmojiViewDelegate.CC.$default$invalidateEnterView(this);
        }

        @Override
        public final boolean isExpanded() {
            return EmojiView.EmojiViewDelegate.CC.$default$isExpanded(this);
        }

        @Override
        public final boolean isInScheduleMode() {
            return EmojiView.EmojiViewDelegate.CC.$default$isInScheduleMode(this);
        }

        @Override
        public boolean isSearchOpened() {
            return ChatAttachAlertPollLayout.this.isEmojiSearchOpened;
        }

        @Override
        public final boolean isUserSelf() {
            return EmojiView.EmojiViewDelegate.CC.$default$isUserSelf(this);
        }

        @Override
        public final void onAnimatedEmojiUnlockClick() {
            EmojiView.EmojiViewDelegate.CC.$default$onAnimatedEmojiUnlockClick(this);
        }

        @Override
        public boolean onBackspace() {
            EditTextBoldCursor editField;
            if (ChatAttachAlertPollLayout.this.currentCell == null || (editField = ChatAttachAlertPollLayout.this.currentCell.getEditField()) == null) {
                return false;
            }
            editField.dispatchKeyEvent(new KeyEvent(0, 67));
            return true;
        }

        @Override
        public void onClearEmojiRecent() {
            AlertDialog.Builder builder = new AlertDialog.Builder(ChatAttachAlertPollLayout.this.getContext(), 0, ChatAttachAlertPollLayout.this.resourcesProvider);
            builder.setTitle(LocaleController.getString(R.string.ClearRecentEmojiTitle));
            builder.setMessage(LocaleController.getString(R.string.ClearRecentEmojiText));
            builder.setPositiveButton(LocaleController.getString(R.string.ClearButton), new EmojiView$$ExternalSyntheticLambda21(this, 5));
            builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
            builder.show();
        }

        @Override
        public void onCustomEmojiSelected(long j, TLRPC.Document document, String str, boolean z) {
            EditTextBoldCursor editField;
            if (ChatAttachAlertPollLayout.this.currentCell == null || (editField = ChatAttachAlertPollLayout.this.currentCell.getEditField()) == null) {
                return;
            }
            int selectionEnd = editField.getSelectionEnd();
            if (selectionEnd < 0) {
                selectionEnd = 0;
            }
            try {
                SpannableString spannableString = new SpannableString(str);
                AnimatedEmojiSpan animatedEmojiSpan = document != null ? new AnimatedEmojiSpan(document, editField.getPaint().getFontMetricsInt()) : new AnimatedEmojiSpan(j, editField.getPaint().getFontMetricsInt());
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
        public void onEmojiSelected(String str) {
            EditTextBoldCursor editField;
            if (ChatAttachAlertPollLayout.this.currentCell == null || (editField = ChatAttachAlertPollLayout.this.currentCell.getEditField()) == null) {
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
            EmojiView.EmojiViewDelegate.CC.$default$onEmojiSettingsClick(this, arrayList);
        }

        @Override
        public final void onGifSelected(View view, Object obj, String str, Object obj2, boolean z, int i, int i2) {
            EmojiView.EmojiViewDelegate.CC.$default$onGifSelected(this, view, obj, str, obj2, z, i, i2);
        }

        @Override
        public final void onGifSelectedForAddCaption(View view, Object obj, String str, Object obj2, boolean z, int i, int i2) {
            EmojiView.EmojiViewDelegate.CC.$default$onGifSelectedForAddCaption(this, view, obj, str, obj2, z, i, i2);
        }

        @Override
        public void onSearchOpenClose(int i) {
            ChatAttachAlertPollLayout chatAttachAlertPollLayout = ChatAttachAlertPollLayout.this;
            chatAttachAlertPollLayout.isEmojiSearchOpened = i != 0;
            chatAttachAlertPollLayout.parentAlert.sizeNotifierFrameLayout.requestLayout();
        }

        @Override
        public final void onShowStickerSet(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z) {
            EmojiView.EmojiViewDelegate.CC.$default$onShowStickerSet(this, stickerSet, inputStickerSet, z);
        }

        @Override
        public final void onStickerSelected(View view, TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z, int i, int i2) {
            EmojiView.EmojiViewDelegate.CC.$default$onStickerSelected(this, view, document, str, obj, sendAnimationData, z, i, i2);
        }

        @Override
        public final void onStickerSetAdd(TLRPC.StickerSetCovered stickerSetCovered) {
            EmojiView.EmojiViewDelegate.CC.$default$onStickerSetAdd(this, stickerSetCovered);
        }

        @Override
        public final void onStickerSetRemove(TLRPC.StickerSetCovered stickerSetCovered) {
            EmojiView.EmojiViewDelegate.CC.$default$onStickerSetRemove(this, stickerSetCovered);
        }

        @Override
        public final void onStickersGroupClick(long j) {
            EmojiView.EmojiViewDelegate.CC.$default$onStickersGroupClick(this, j);
        }

        @Override
        public final void onStickersSettingsClick() {
            EmojiView.EmojiViewDelegate.CC.$default$onStickersSettingsClick(this);
        }

        @Override
        public final void onTabOpened(int i) {
            EmojiView.EmojiViewDelegate.CC.$default$onTabOpened(this, i);
        }

        @Override
        public final void showTrendingStickersAlert(TrendingStickersLayout trendingStickersLayout) {
            EmojiView.EmojiViewDelegate.CC.$default$showTrendingStickersAlert(this, trendingStickersLayout);
        }
    }

    public class AnonymousClass13 implements ContentPreviewViewer.ContentPreviewViewerDelegate {
        final int val$index;

        public AnonymousClass13(int i) {
            this.val$index = i;
        }

        public void lambda$getCustomItemOptions$0(int i) {
            ChatAttachAlertPollLayout.this.lambda$showOptionsForDrawable$19(i);
        }

        public void lambda$getCustomItemOptions$1(int i) {
            ChatAttachAlertPollLayout.this.lambda$openAttachMenuForOptions$23(i, null);
        }

        @Override
        public final void addCaptionToGif(Object obj, Object obj2, boolean z, int i, int i2) {
            ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$addCaptionToGif(this, obj, obj2, z, i, i2);
        }

        @Override
        public final void addToFavoriteSelected(String str) {
            ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$addToFavoriteSelected(this, str);
        }

        @Override
        public final boolean can() {
            return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$can(this);
        }

        @Override
        public final boolean canAddCaption(TLRPC.Document document) {
            return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$canAddCaption(this, document);
        }

        @Override
        public final boolean canDeleteSticker(TLRPC.Document document) {
            return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$canDeleteSticker(this, document);
        }

        @Override
        public final boolean canEditSticker() {
            return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$canEditSticker(this);
        }

        @Override
        public final boolean canSchedule() {
            return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$canSchedule(this);
        }

        @Override
        public final boolean canSendSticker() {
            return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$canSendSticker(this);
        }

        @Override
        public final Boolean canSetAsStatus(TLRPC.Document document) {
            return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$canSetAsStatus(this, document);
        }

        @Override
        public final void copyEmoji(TLRPC.Document document) {
            ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$copyEmoji(this, document);
        }

        @Override
        public final void deleteSticker(TLRPC.Document document) {
            ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$deleteSticker(this, document);
        }

        @Override
        public final void editSticker(TLRPC.Document document) {
            ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$editSticker(this, document);
        }

        @Override
        public ItemOptions getCustomItemOptions(ViewGroup viewGroup, View view) {
            ItemOptions drawScrim = ItemOptions.makeOptions(viewGroup, new View(ChatAttachAlertPollLayout.this.getContext())).setDimAlpha(0).setDrawScrim(false);
            int i = R.drawable.msg_replace;
            String string = LocaleController.getString(R.string.ReplaceAttachedPollMedia);
            final int i2 = this.val$index;
            final int i3 = 0;
            ItemOptions itemOptionsAdd = drawScrim.add(i, string, new Runnable(this) {
                public final ChatAttachAlertPollLayout.AnonymousClass13 f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void run() {
                    switch (i3) {
                        case 0:
                            this.f$0.lambda$getCustomItemOptions$0(i2);
                            break;
                        default:
                            this.f$0.lambda$getCustomItemOptions$1(i2);
                            break;
                    }
                }
            });
            int i4 = R.drawable.msg_delete;
            String string2 = LocaleController.getString(R.string.Delete);
            final int i5 = this.val$index;
            final int i6 = 1;
            return itemOptionsAdd.add(i4, (CharSequence) string2, true, new Runnable(this) {
                public final ChatAttachAlertPollLayout.AnonymousClass13 f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void run() {
                    switch (i6) {
                        case 0:
                            this.f$0.lambda$getCustomItemOptions$0(i5);
                            break;
                        default:
                            this.f$0.lambda$getCustomItemOptions$1(i5);
                            break;
                    }
                }
            });
        }

        @Override
        public long getDialogId() {
            return 0L;
        }

        @Override
        public final TLRPC.TL_messageMediaPoll getPoll() {
            return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$getPoll(this);
        }

        @Override
        public final TLRPC.PollAnswer getPollAnswer() {
            return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$getPollAnswer(this);
        }

        @Override
        public final MessageObject getPollMessageObject() {
            return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$getPollMessageObject(this);
        }

        @Override
        public final String getQuery(boolean z) {
            return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$getQuery(this, z);
        }

        @Override
        public final void gifAddedOrDeleted() {
            ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$gifAddedOrDeleted(this);
        }

        @Override
        public final boolean isInScheduleMode() {
            return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$isInScheduleMode(this);
        }

        @Override
        public final boolean isPhotoEditor() {
            return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$isPhotoEditor(this);
        }

        @Override
        public final boolean isReplacedSticker() {
            return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$isReplacedSticker(this);
        }

        @Override
        public final boolean isSettingIntroSticker() {
            return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$isSettingIntroSticker(this);
        }

        @Override
        public final boolean isStickerEditor() {
            return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$isStickerEditor(this);
        }

        @Override
        public final boolean needCopy(TLRPC.Document document) {
            return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$needCopy(this, document);
        }

        @Override
        public final boolean needMenu() {
            return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$needMenu(this);
        }

        @Override
        public final boolean needOpen() {
            return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$needOpen(this);
        }

        @Override
        public final boolean needRemove() {
            return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$needRemove(this);
        }

        @Override
        public final boolean needRemoveFromRecent(TLRPC.Document document) {
            return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$needRemoveFromRecent(this, document);
        }

        @Override
        public final boolean needSend(int i) {
            return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$needSend(this, i);
        }

        @Override
        public final void newStickerPackSelected(CharSequence charSequence, String str, Utilities.Callback callback) {
            ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$newStickerPackSelected(this, charSequence, str, callback);
        }

        @Override
        public final void openSet(TLRPC.InputStickerSet inputStickerSet, boolean z) {
            ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$openSet(this, inputStickerSet, z);
        }

        @Override
        public final void remove(SendMessagesHelper.ImportingSticker importingSticker) {
            ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$remove(this, importingSticker);
        }

        @Override
        public final void removeFromRecent(TLRPC.Document document) {
            ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$removeFromRecent(this, document);
        }

        @Override
        public final void resetTouch() {
            ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$resetTouch(this);
        }

        @Override
        public final void retractVote() {
            ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$retractVote(this);
        }

        @Override
        public final void sendEmoji(TLRPC.Document document) {
            ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$sendEmoji(this, document);
        }

        @Override
        public final void sendGif(Object obj, Object obj2, boolean z, int i, int i2) {
            ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$sendGif(this, obj, obj2, z, i, i2);
        }

        @Override
        public final void sendIntroSticker() {
            ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$sendIntroSticker(this);
        }

        @Override
        public final void sendSticker(String str) {
            ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$sendSticker(this, str);
        }

        @Override
        public final void sendVote() {
            ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$sendVote(this);
        }

        @Override
        public final void setAsEmojiStatus(TLRPC.Document document, Integer num) {
            ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$setAsEmojiStatus(this, document, num);
        }

        @Override
        public final void setIntroSticker(String str) {
            ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$setIntroSticker(this, str);
        }

        @Override
        public final void stickerSetSelected(TLRPC.StickerSet stickerSet, String str) {
            ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$stickerSetSelected(this, stickerSet, str);
        }

        @Override
        public final void sendSticker(TLRPC.Document document, String str, Object obj, boolean z, int i, int i2) {
            ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$sendSticker(this, document, str, obj, z, i, i2);
        }
    }

    public class AnonymousClass15 implements ChatAttachAlert.ChatAttachViewDelegate {
        final Utilities.Callback val$callback;
        final ChatAttachAlert val$chatAttachAlert;
        final BaseFragment val$fragment;

        public AnonymousClass15(BaseFragment baseFragment, Utilities.Callback callback, ChatAttachAlert chatAttachAlert) {
            this.val$fragment = baseFragment;
            this.val$callback = callback;
            this.val$chatAttachAlert = chatAttachAlert;
        }

        public static void lambda$didPressedButton$0(Utilities.Callback callback, String str) {
            callback.run(new PollAttachedMediaLink(str));
        }

        @Override
        public void didPressedButton(int i, boolean z, boolean z2, int i2, int i3, long j, boolean z3, boolean z4, long j2) {
            if (i == 15) {
                AlertsCreator.showAddLinkToPoll(this.val$fragment.getContext(), this.val$fragment.getResourceProvider(), null, null, new PermissionRequest$$ExternalSyntheticLambda3(1, this.val$callback), null);
            } else if (i == 7 || i == 8) {
                HashMap<Object, Object> selectedPhotos = this.val$chatAttachAlert.getPhotoLayout().getSelectedPhotos();
                ArrayList<Object> selectedPhotosOrder = this.val$chatAttachAlert.getPhotoLayout().getSelectedPhotosOrder();
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
                    this.val$callback.run(new PollAttachedMediaGallery(sendingMediaInfo));
                }
            }
            this.val$chatAttachAlert.dismiss(true);
        }

        @Override
        public void didSelectBot(TLRPC.User user) {
        }

        @Override
        public void doOnIdle(Runnable runnable) {
            NotificationCenter.getInstance(this.val$fragment.getCurrentAccount()).doOnIdle(runnable);
        }

        @Override
        public final View getRevealView() {
            return ChatAttachAlert.ChatAttachViewDelegate.CC.$default$getRevealView(this);
        }

        @Override
        public boolean needEnterComment() {
            return false;
        }

        @Override
        public void onCameraOpened() {
        }

        @Override
        public final void onWallpaperSelected(Object obj) {
            ChatAttachAlert.ChatAttachViewDelegate.CC.$default$onWallpaperSelected(this, obj);
        }

        @Override
        public final void openAvatarsSearch() {
            ChatAttachAlert.ChatAttachViewDelegate.CC.$default$openAvatarsSearch(this);
        }

        @Override
        public final boolean selectItemOnClicking() {
            return ChatAttachAlert.ChatAttachViewDelegate.CC.$default$selectItemOnClicking(this);
        }

        @Override
        public final void sendAudio(ArrayList arrayList, CharSequence charSequence, boolean z, int i, int i2, long j, boolean z2, long j2) {
            ChatAttachAlert.ChatAttachViewDelegate.CC.$default$sendAudio(this, arrayList, charSequence, z, i, i2, j, z2, j2);
        }
    }

    public static class EmptyView extends View {
        public EmptyView(Context context) {
            super(context);
        }
    }

    public class ListAdapter extends RecyclerListView.SelectionAdapter {
        private static final int VIEW_TYPE_ANSWER = 5;
        private static final int VIEW_TYPE_CHECK_V2 = 10;
        private static final int VIEW_TYPE_HEADER = 0;
        private static final int VIEW_TYPE_INPUT_DESCRIPTION = 11;
        private static final int VIEW_TYPE_INPUT_QUESTION = 4;
        private final Context mContext;

        public ListAdapter(Context context) {
            this.mContext = context;
        }

        public void lambda$onCreateViewHolder$0(View view) {
            ChatAttachAlertPollLayout.this.openAttachOrReplaceMenuForOptions(-2);
        }

        public void lambda$onCreateViewHolder$1(View view) {
            ChatAttachAlertPollLayout.this.openAttachOrReplaceMenuForOptions(-3);
        }

        public void lambda$onCreateViewHolder$2(View view) {
            ChatAttachAlertPollLayout.this.deletePollAnswerView(view, (PollEditTextCell) view.getParent(), true);
        }

        public void lambda$onCreateViewHolder$3(PollEditTextCell pollEditTextCell, View view) {
            int adapterPosition;
            RecyclerView.ViewHolder viewHolderFindContainingViewHolder = ChatAttachAlertPollLayout.this.listView.findContainingViewHolder(pollEditTextCell);
            if (viewHolderFindContainingViewHolder == null || (adapterPosition = viewHolderFindContainingViewHolder.getAdapterPosition() - ChatAttachAlertPollLayout.this.answerStartRow) < 0 || adapterPosition >= ChatAttachAlertPollLayout.this.answers.length) {
                return;
            }
            ChatAttachAlertPollLayout.this.openAttachOrReplaceMenuForOptions(adapterPosition);
        }

        public boolean lambda$onCreateViewHolder$4(PollEditTextCell pollEditTextCell, TextView textView, int i, KeyEvent keyEvent) {
            int adapterPosition;
            if (i != 5) {
                return false;
            }
            RecyclerView.ViewHolder viewHolderFindContainingViewHolder = ChatAttachAlertPollLayout.this.listView.findContainingViewHolder(pollEditTextCell);
            if (viewHolderFindContainingViewHolder != null && (adapterPosition = viewHolderFindContainingViewHolder.getAdapterPosition()) != -1) {
                int i2 = adapterPosition - ChatAttachAlertPollLayout.this.answerStartRow;
                if (i2 == ChatAttachAlertPollLayout.this.answersCount - 1 && ChatAttachAlertPollLayout.this.answersCount < ChatAttachAlertPollLayout.this.maxAnswersCount) {
                    ChatAttachAlertPollLayout.this.addNewField();
                } else if (i2 == ChatAttachAlertPollLayout.this.answersCount - 1) {
                    AndroidUtilities.hideKeyboard(pollEditTextCell.getTextView());
                } else {
                    RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = ChatAttachAlertPollLayout.this.listView.findViewHolderForAdapterPosition(adapterPosition + 1);
                    if (viewHolderFindViewHolderForAdapterPosition != null) {
                        View view = viewHolderFindViewHolderForAdapterPosition.itemView;
                        if (view instanceof PollEditTextCell) {
                            ((PollEditTextCell) view).getTextView().requestFocus();
                        }
                    }
                }
            }
            return true;
        }

        public static boolean lambda$onCreateViewHolder$5(PollEditTextCell pollEditTextCell, View view, int i, KeyEvent keyEvent) {
            EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
            if (i != 67 || keyEvent.getAction() != 0 || editTextBoldCursor.length() != 0) {
                return false;
            }
            pollEditTextCell.callOnDelete();
            return true;
        }

        @Override
        public int getItemCount() {
            return ChatAttachAlertPollLayout.this.rowCount;
        }

        @Override
        public int getItemViewType(int i) {
            if (i == ChatAttachAlertPollLayout.this.poll2vAnonymousRow || i == ChatAttachAlertPollLayout.this.poll2vMultipleRow || i == ChatAttachAlertPollLayout.this.poll2vQuizRow || i == ChatAttachAlertPollLayout.this.poll2vAllowAddingRow || i == ChatAttachAlertPollLayout.this.poll2vAllowRevotingRow || i == ChatAttachAlertPollLayout.this.poll2vShuffleRow || i == ChatAttachAlertPollLayout.this.poll2vLimitDurationRow || i == ChatAttachAlertPollLayout.this.poll2vSubscribersOnlyRow.row || i == ChatAttachAlertPollLayout.this.poll2vLimitByCountryRow.row) {
                return 10;
            }
            if (i == ChatAttachAlertPollLayout.this.questionHeaderRow || i == ChatAttachAlertPollLayout.this.answerHeaderRow || i == ChatAttachAlertPollLayout.this.settingsHeaderRow || i == ChatAttachAlertPollLayout.this.solutionRowHeader) {
                return 0;
            }
            if (i == ChatAttachAlertPollLayout.this.questionSectionRow) {
                return 1;
            }
            if (i == ChatAttachAlertPollLayout.this.answerSectionRow || i == ChatAttachAlertPollLayout.this.settingsSectionRow || i == ChatAttachAlertPollLayout.this.solutionInfoRow || i == ChatAttachAlertPollLayout.this.poll2vLimitDurationHideResultsRowInfo) {
                return 2;
            }
            if (i == ChatAttachAlertPollLayout.this.addAnswerRow || i == ChatAttachAlertPollLayout.this.poll2vLimitDurationTimeRow || i == ChatAttachAlertPollLayout.this.poll2vLimitByCountryListRow) {
                return 3;
            }
            if (i == ChatAttachAlertPollLayout.this.questionRow) {
                return 4;
            }
            if (i == ChatAttachAlertPollLayout.this.descriptionRow) {
                return 11;
            }
            if (i == ChatAttachAlertPollLayout.this.solutionRow) {
                return 7;
            }
            if (i == ChatAttachAlertPollLayout.this.allowAddingRow || i == ChatAttachAlertPollLayout.this.allowMarkingRow || i == ChatAttachAlertPollLayout.this.poll2vLimitDurationHideResultsRow) {
                return 6;
            }
            if (i == ChatAttachAlertPollLayout.this.emptyRow) {
                return 8;
            }
            return i == ChatAttachAlertPollLayout.this.paddingRow ? 9 : 5;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            int adapterPosition = viewHolder.getAdapterPosition();
            return adapterPosition == ChatAttachAlertPollLayout.this.addAnswerRow || adapterPosition == ChatAttachAlertPollLayout.this.poll2vQuizRow || adapterPosition == ChatAttachAlertPollLayout.this.poll2vAnonymousRow || adapterPosition == ChatAttachAlertPollLayout.this.poll2vMultipleRow || adapterPosition == ChatAttachAlertPollLayout.this.poll2vAllowAddingRow || adapterPosition == ChatAttachAlertPollLayout.this.poll2vLimitDurationRow || adapterPosition == ChatAttachAlertPollLayout.this.poll2vAllowRevotingRow || adapterPosition == ChatAttachAlertPollLayout.this.poll2vShuffleRow || adapterPosition == ChatAttachAlertPollLayout.this.poll2vLimitDurationTimeRow || adapterPosition == ChatAttachAlertPollLayout.this.poll2vLimitDurationHideResultsRow || adapterPosition == ChatAttachAlertPollLayout.this.poll2vLimitByCountryRow.row || adapterPosition == ChatAttachAlertPollLayout.this.poll2vSubscribersOnlyRow.row || adapterPosition == ChatAttachAlertPollLayout.this.poll2vLimitByCountryListRow;
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            boolean z = true;
            int itemViewType = viewHolder.getItemViewType();
            if (itemViewType == 0) {
                HeaderCell headerCell = (HeaderCell) viewHolder.itemView;
                if (i == ChatAttachAlertPollLayout.this.questionHeaderRow) {
                    headerCell.getTextView().setGravity(19);
                    headerCell.setText(LocaleController.getString(ChatAttachAlertPollLayout.this.todo ? R.string.TodoTitle : R.string.PollQuestion2));
                    return;
                }
                if (i == ChatAttachAlertPollLayout.this.solutionRowHeader) {
                    headerCell.getTextView().setGravity(19);
                    headerCell.setText(LocaleController.getString(R.string.AddAnExplanationHeader));
                    return;
                }
                headerCell.getTextView().setGravity((LocaleController.isRTL ? 5 : 3) | 16);
                if (i != ChatAttachAlertPollLayout.this.answerHeaderRow) {
                    if (i == ChatAttachAlertPollLayout.this.settingsHeaderRow) {
                        headerCell.setText(LocaleController.getString(R.string.Settings));
                        return;
                    }
                    return;
                } else if (ChatAttachAlertPollLayout.this.quizOnly) {
                    headerCell.setText(LocaleController.getString(R.string.QuizAnswers));
                    return;
                } else {
                    headerCell.setText(LocaleController.getString(ChatAttachAlertPollLayout.this.todo ? R.string.TodoItemsTitle : R.string.AnswerOptions2));
                    return;
                }
            }
            if (itemViewType == 6) {
                TextCheckCell textCheckCell = (TextCheckCell) viewHolder.itemView;
                if (i == ChatAttachAlertPollLayout.this.allowAddingRow) {
                    textCheckCell.setTextAndCheck(LocaleController.getString(R.string.TodoAllowAddingTasks), ChatAttachAlertPollLayout.this.allowAdding, ChatAttachAlertPollLayout.this.allowMarkingRow != -1);
                    textCheckCell.setEnabled(true, null);
                    return;
                } else if (i == ChatAttachAlertPollLayout.this.allowMarkingRow) {
                    textCheckCell.setTextAndCheck(LocaleController.getString(R.string.TodoAllowMarkingDone), ChatAttachAlertPollLayout.this.allowMarking, false);
                    textCheckCell.setEnabled(true, null);
                    return;
                } else {
                    if (i == ChatAttachAlertPollLayout.this.poll2vLimitDurationHideResultsRow) {
                        textCheckCell.setTextAndCheck(LocaleController.getString(R.string.PollV2HideResults), ChatAttachAlertPollLayout.this.hideResults, false);
                        textCheckCell.setEnabled(true, null);
                        return;
                    }
                    return;
                }
            }
            if (itemViewType == 2) {
                TextInfoPrivacyCell textInfoPrivacyCell = (TextInfoPrivacyCell) viewHolder.itemView;
                textInfoPrivacyCell.setFixedSize(0);
                new CombinedDrawable(new ColorDrawable(ChatAttachAlertPollLayout.this.getThemedColor(Theme.key_windowBackgroundGray)), Theme.getThemedDrawableByKey(this.mContext, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow)).setFullsize(true);
                if (i == ChatAttachAlertPollLayout.this.solutionInfoRow) {
                    textInfoPrivacyCell.setText(LocaleController.getString(R.string.AddAnExplanationInfo));
                    return;
                }
                if (i == ChatAttachAlertPollLayout.this.settingsSectionRow) {
                    textInfoPrivacyCell.setFixedSize(12);
                    textInfoPrivacyCell.setText(null);
                    return;
                } else {
                    if (ChatAttachAlertPollLayout.this.maxAnswersCount - ChatAttachAlertPollLayout.this.answersCount <= 0) {
                        textInfoPrivacyCell.setText(LocaleController.getString(ChatAttachAlertPollLayout.this.todo ? R.string.TodoAddTaskInfoMax : R.string.AddAnOptionInfoMax));
                        return;
                    }
                    if (ChatAttachAlertPollLayout.this.todo) {
                        textInfoPrivacyCell.setText(LocaleController.formatPluralStringComma("TodoNewTaskInfo", ChatAttachAlertPollLayout.this.maxAnswersCount - ChatAttachAlertPollLayout.this.answersCount));
                        return;
                    } else if (i == ChatAttachAlertPollLayout.this.poll2vLimitDurationHideResultsRowInfo) {
                        textInfoPrivacyCell.setText(LocaleController.getString(R.string.PollV2HideResultsInfo));
                        return;
                    } else {
                        textInfoPrivacyCell.setText(LocaleController.formatString(R.string.AddAnOptionInfo, LocaleController.formatPluralString("Option", ChatAttachAlertPollLayout.this.maxAnswersCount - ChatAttachAlertPollLayout.this.answersCount, new Object[0])));
                        return;
                    }
                }
            }
            if (itemViewType == 3) {
                TextCell textCell = (TextCell) viewHolder.itemView;
                if (i == ChatAttachAlertPollLayout.this.poll2vLimitByCountryListRow) {
                    ChatAttachAlertPollLayout.this.checkAllowedCountriesList(textCell, false);
                    return;
                }
                if (i == ChatAttachAlertPollLayout.this.poll2vLimitDurationTimeRow) {
                    ChatAttachAlertPollLayout.this.checkDurationInfoRow(textCell, false);
                    return;
                }
                textCell.setColors(-1, Theme.key_telegram_color_text);
                Drawable drawable = this.mContext.getResources().getDrawable(R.drawable.poll_add_circle);
                Drawable drawable2 = this.mContext.getResources().getDrawable(R.drawable.poll_add_plus);
                int themedColor = ChatAttachAlertPollLayout.this.getThemedColor(Theme.key_switchTrackChecked);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                drawable.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
                drawable2.setColorFilter(new PorterDuffColorFilter(ChatAttachAlertPollLayout.this.getThemedColor(Theme.key_checkboxCheck), mode));
                textCell.setTextAndIcon((CharSequence) LocaleController.getString(ChatAttachAlertPollLayout.this.todo ? R.string.TodoNewTask : R.string.AddAnOption), (Drawable) new CombinedDrawable(drawable, drawable2), false);
                textCell.imageLeft = 20;
                textCell.offsetFromImage = 58;
                return;
            }
            if (itemViewType == 9) {
                viewHolder.itemView.requestLayout();
                return;
            }
            if (itemViewType != 10) {
                return;
            }
            PollCreateCheckCell pollCreateCheckCell = (PollCreateCheckCell) viewHolder.itemView;
            pollCreateCheckCell.setDivider(false);
            if (i == ChatAttachAlertPollLayout.this.poll2vAnonymousRow) {
                pollCreateCheckCell.setTextAndValueAndIconAndCheck(LocaleController.getString(R.string.PollV2ShowWhoVoted), LocaleController.getString(R.string.PollV2ShowWhoVotedInfo), IconBackgroundColors.BLUE, R.drawable.filled_poll_view_24, !ChatAttachAlertPollLayout.this.anonymousPoll);
            } else if (i == ChatAttachAlertPollLayout.this.poll2vMultipleRow) {
                pollCreateCheckCell.setTextAndValueAndIconAndCheck(LocaleController.getString(R.string.PollV2AllowMultipleAnswers), LocaleController.getString(R.string.PollV2AllowMultipleAnswersInfo), IconBackgroundColors.ORANGE, R.drawable.filled_poll_multiple_24, ChatAttachAlertPollLayout.this.multipleChoise);
            } else if (i == ChatAttachAlertPollLayout.this.poll2vAllowRevotingRow) {
                pollCreateCheckCell.setTextAndValueAndIconAndCheck(LocaleController.getString(R.string.PollV2AllowRevoting), LocaleController.getString(R.string.PollV2AllowRevotingInfo), IconBackgroundColors.PURPLE, R.drawable.filled_poll_revote_24, ChatAttachAlertPollLayout.this.allowRevoting);
            } else if (i == ChatAttachAlertPollLayout.this.poll2vAllowAddingRow) {
                pollCreateCheckCell.setTextAndValueAndIconAndCheck(LocaleController.getString(R.string.PollV2AllowAddingOptions), LocaleController.getString(R.string.PollV2AllowAddingOptionsInfo), IconBackgroundColors.CYAN, R.drawable.filled_poll_add_24, ChatAttachAlertPollLayout.this.allowAddingOptions);
            } else if (i == ChatAttachAlertPollLayout.this.poll2vShuffleRow) {
                pollCreateCheckCell.setTextAndValueAndIconAndCheck(LocaleController.getString(R.string.PollV2ShuffleOptions), LocaleController.getString(R.string.PollV2ShuffleOptionsInfo), IconBackgroundColors.ORANGE_DEEP, R.drawable.filled_poll_shuffle_24, ChatAttachAlertPollLayout.this.shuffleOptions);
            } else if (i == ChatAttachAlertPollLayout.this.poll2vQuizRow) {
                pollCreateCheckCell.setTextAndValueAndIconAndCheck(LocaleController.getString(R.string.PollV2SetCorrectAnswer), LocaleController.getString(R.string.PollV2SetCorrectAnswerInfo), IconBackgroundColors.GREEN, R.drawable.filled_poll_correct_24, ChatAttachAlertPollLayout.this.quizPoll);
            } else if (i == ChatAttachAlertPollLayout.this.poll2vLimitByCountryRow.row) {
                pollCreateCheckCell.setTextAndValueAndIconAndCheck(LocaleController.getString(R.string.PollV2LimitByCountry), LocaleController.getString(R.string.PollV2LimitByCountryInfo), IconBackgroundColors.BLUE_LIGHT, R.drawable.filled_location, ChatAttachAlertPollLayout.this.poll2vLimitByCountryRow.checked);
            } else if (i == ChatAttachAlertPollLayout.this.poll2vSubscribersOnlyRow.row) {
                pollCreateCheckCell.setTextAndValueAndIconAndCheck(LocaleController.getString(R.string.PollV2RestrictToSubscribers), LocaleController.getString(R.string.PollV2RestrictToSubscribersInfo), IconBackgroundColors.BLUE_DEEP, R.drawable.msg_folders_groups, ChatAttachAlertPollLayout.this.poll2vSubscribersOnlyRow.checked);
            } else if (i == ChatAttachAlertPollLayout.this.poll2vLimitDurationRow) {
                pollCreateCheckCell.setTextAndValueAndIconAndCheck(LocaleController.getString(R.string.PollV2LimitDuration), LocaleController.getString(R.string.PollV2LimitDurationInfo), IconBackgroundColors.RED, R.drawable.filled_poll_deadline_24, (ChatAttachAlertPollLayout.this.pollLimitDuration == 0 && ChatAttachAlertPollLayout.this.pollLimitDeadline == 0) ? false : true);
                pollCreateCheckCell.setDivider((ChatAttachAlertPollLayout.this.pollLimitDuration == 0 && ChatAttachAlertPollLayout.this.pollLimitDeadline == 0) ? false : true);
            }
            if (i == ChatAttachAlertPollLayout.this.poll2vQuizRow) {
                pollCreateCheckCell.getCheckBox().setIconVisible(ChatAttachAlertPollLayout.this.quizOnly, false);
                return;
            }
            if (i != ChatAttachAlertPollLayout.this.poll2vAllowAddingRow) {
                pollCreateCheckCell.getCheckBox().setIconVisible(false, false);
                return;
            }
            Switch checkBox = pollCreateCheckCell.getCheckBox();
            if (!ChatAttachAlertPollLayout.this.quizPoll && !ChatAttachAlertPollLayout.this.anonymousPoll) {
                z = false;
            }
            checkBox.setIconVisible(z, false);
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, final int i) {
            View headerCell;
            View view;
            switch (i) {
                case 0:
                    headerCell = new HeaderCell(this.mContext, Theme.key_windowBackgroundWhiteBlueHeader, 21, 15, 0, false, false, ChatAttachAlertPollLayout.this.resourcesProvider);
                    break;
                case 1:
                    ShadowSectionCell shadowSectionCell = new ShadowSectionCell(this.mContext, ChatAttachAlertPollLayout.this.resourcesProvider, 0);
                    new CombinedDrawable(new ColorDrawable(ChatAttachAlertPollLayout.this.getThemedColor(Theme.key_windowBackgroundGray)), Theme.getThemedDrawableByKey(this.mContext, R.drawable.greydivider, Theme.key_windowBackgroundGrayShadow)).setFullsize(true);
                    headerCell = shadowSectionCell;
                    break;
                case 2:
                    headerCell = new TextInfoPrivacyCell(this.mContext, 24, ChatAttachAlertPollLayout.this.resourcesProvider);
                    break;
                case 3:
                    headerCell = new TextCell(23, this.mContext, ChatAttachAlertPollLayout.this.resourcesProvider, false, false);
                    break;
                case 4:
                case 11:
                    Context context = this.mContext;
                    boolean z = ChatAttachAlertPollLayout.this.isPremium;
                    Theme.ResourcesProvider resourcesProvider = ChatAttachAlertPollLayout.this.resourcesProvider;
                    final PollEditTextCell pollEditTextCell = new PollEditTextCell(context, false, z ? 1 : 0, null, resourcesProvider, i) {
                        final int val$viewType;

                        {
                            this.val$viewType = i;
                        }

                        @Override
                        public void onActionModeStart(EditTextBoldCursor editTextBoldCursor, ActionMode actionMode) {
                            if (!ChatAttachAlertPollLayout.this.todo && this.val$viewType == 11 && editTextBoldCursor.isFocused() && editTextBoldCursor.hasSelection()) {
                                Menu menu = actionMode.getMenu();
                                if (menu.findItem(16908321) == null) {
                                    return;
                                }
                                ChatActivity.fillActionModeMenu(menu, ((ChatActivity) ChatAttachAlertPollLayout.this.parentAlert.baseFragment).getCurrentEncryptedChat(), false, true);
                            }
                        }

                        @Override
                        public void onEditTextFocusChanged(boolean z2) {
                            ChatAttachAlertPollLayout.this.onCellFocusChanges(this, z2);
                        }

                        @Override
                        public void lambda$new$1$10(PollEditTextCell pollEditTextCell2) {
                            ChatAttachAlertPollLayout.this.onEmojiClicked(pollEditTextCell2);
                        }

                        @Override
                        public void onFactorChangeFinished(int i2, float f, FactorAnimator factorAnimator) {
                        }

                        @Override
                        public void onFieldTouchUp(EditTextBoldCursor editTextBoldCursor) {
                            ChatAttachAlertPollLayout.this.parentAlert.makeFocusable(editTextBoldCursor, true);
                        }

                        @Override
                        public boolean onPastedMultipleLines(ArrayList<CharSequence> arrayList) {
                            if (arrayList.isEmpty()) {
                                return false;
                            }
                            this.textView.getText().replace(this.textView.getSelectionStart(), this.textView.getSelectionEnd(), arrayList.remove(0));
                            int i2 = 0;
                            while (!arrayList.isEmpty() && i2 < ChatAttachAlertPollLayout.this.maxAnswersCount) {
                                for (int length = ChatAttachAlertPollLayout.this.answers.length - 1; length > i2; length--) {
                                    ChatAttachAlertPollLayout.this.answers[length] = ChatAttachAlertPollLayout.this.answers[length - 1];
                                }
                                ChatAttachAlertPollLayout.this.answers[i2] = arrayList.remove(0);
                                ChatAttachAlertPollLayout.access$2708(ChatAttachAlertPollLayout.this);
                                i2++;
                            }
                            ChatAttachAlertPollLayout.this.updateRows();
                            ChatAttachAlertPollLayout chatAttachAlertPollLayout = ChatAttachAlertPollLayout.this;
                            chatAttachAlertPollLayout.requestFieldFocusAtPosition = (chatAttachAlertPollLayout.answerStartRow + i2) - 1;
                            ChatAttachAlertPollLayout.this.listView.lambda$onCellEnter$52(ChatAttachAlertPollLayout.this.itemAnimator);
                            ChatAttachAlertPollLayout.this.listAdapter.notifyDataSetChanged();
                            return true;
                        }
                    };
                    if (i == 11 && !ChatAttachAlertPollLayout.this.todo) {
                        pollEditTextCell.setTextRight(98);
                        final int i2 = 2;
                        pollEditTextCell.addAttachView().setOnClickListener(new View.OnClickListener(this) {
                            public final ChatAttachAlertPollLayout.ListAdapter f$0;

                            {
                                this.f$0 = this;
                            }

                            @Override
                            public final void onClick(View view2) {
                                switch (i2) {
                                    case 0:
                                        this.f$0.lambda$onCreateViewHolder$2(view2);
                                        break;
                                    case 1:
                                        this.f$0.lambda$onCreateViewHolder$1(view2);
                                        break;
                                    default:
                                        this.f$0.lambda$onCreateViewHolder$0(view2);
                                        break;
                                }
                            }
                        });
                    }
                    pollEditTextCell.createErrorTextView();
                    pollEditTextCell.setIconsColor(Theme.key_pollCreateIcons);
                    pollEditTextCell.addTextWatcher(new TextWatcher() {
                        @Override
                        public void afterTextChanged(Editable editable) {
                            if (pollEditTextCell.getTag() != null) {
                                return;
                            }
                            int i3 = i == 11 ? ChatAttachAlertPollLayout.this.descriptionRow : ChatAttachAlertPollLayout.this.questionRow;
                            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = ChatAttachAlertPollLayout.this.listView.findViewHolderForAdapterPosition(i3);
                            if (viewHolderFindViewHolderForAdapterPosition != null && ChatAttachAlertPollLayout.this.suggestEmojiPanel != null) {
                                for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                                    editable.removeSpan(imageSpan);
                                }
                                Emoji.replaceEmoji(editable, pollEditTextCell.getEditField().getPaint().getFontMetricsInt(), false);
                                ChatAttachAlertPollLayout.this.suggestEmojiPanel.setDirection(1);
                                ChatAttachAlertPollLayout.this.suggestEmojiPanel.setDelegate(pollEditTextCell);
                                ChatAttachAlertPollLayout.this.suggestEmojiPanel.setTranslationY(viewHolderFindViewHolderForAdapterPosition.itemView.getY());
                                ChatAttachAlertPollLayout.this.suggestEmojiPanel.fireUpdate();
                            }
                            if (i == 11) {
                                ChatAttachAlertPollLayout.this.descriptionString = editable;
                            } else {
                                ChatAttachAlertPollLayout.this.questionString = editable;
                            }
                            if (viewHolderFindViewHolderForAdapterPosition != null) {
                                ChatAttachAlertPollLayout.this.setTextLeft(viewHolderFindViewHolderForAdapterPosition.itemView, i3);
                            }
                            ChatAttachAlertPollLayout.this.checkDoneButton();
                        }

                        @Override
                        public void beforeTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
                        }

                        @Override
                        public void onTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
                        }
                    });
                    headerCell = pollEditTextCell;
                    break;
                case 5:
                default:
                    Context context2 = this.mContext;
                    boolean z2 = ChatAttachAlertPollLayout.this.isPremium;
                    final int i3 = 0;
                    final PollEditTextCell pollEditTextCell2 = new PollEditTextCell(context2, false, z2 ? 1 : 0, new View.OnClickListener(this) {
                        public final ChatAttachAlertPollLayout.ListAdapter f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override
                        public final void onClick(View view2) {
                            switch (i3) {
                                case 0:
                                    this.f$0.lambda$onCreateViewHolder$2(view2);
                                    break;
                                case 1:
                                    this.f$0.lambda$onCreateViewHolder$1(view2);
                                    break;
                                default:
                                    this.f$0.lambda$onCreateViewHolder$0(view2);
                                    break;
                            }
                        }
                    }, ChatAttachAlertPollLayout.this.resourcesProvider) {
                        @Override
                        public boolean drawDivider() {
                            RecyclerView.ViewHolder viewHolderFindContainingViewHolder = ChatAttachAlertPollLayout.this.listView.findContainingViewHolder(this);
                            if (viewHolderFindContainingViewHolder != null) {
                                int adapterPosition = viewHolderFindContainingViewHolder.getAdapterPosition();
                                if (ChatAttachAlertPollLayout.this.answersCount == ChatAttachAlertPollLayout.this.maxAnswersCount) {
                                    if (adapterPosition == (ChatAttachAlertPollLayout.this.answersCount + ChatAttachAlertPollLayout.this.answerStartRow) - 1) {
                                        return false;
                                    }
                                }
                            }
                            return true;
                        }

                        @Override
                        public boolean isChecked(PollEditTextCell pollEditTextCell3) {
                            int adapterPosition;
                            RecyclerView.ViewHolder viewHolderFindContainingViewHolder = ChatAttachAlertPollLayout.this.listView.findContainingViewHolder(pollEditTextCell3);
                            if (viewHolderFindContainingViewHolder == null || (adapterPosition = viewHolderFindContainingViewHolder.getAdapterPosition()) == -1) {
                                return false;
                            }
                            return ChatAttachAlertPollLayout.this.answersChecks[adapterPosition - ChatAttachAlertPollLayout.this.answerStartRow];
                        }

                        @Override
                        public void onActionModeStart(EditTextBoldCursor editTextBoldCursor, ActionMode actionMode) {
                            if (ChatAttachAlertPollLayout.this.todo && editTextBoldCursor.isFocused() && editTextBoldCursor.hasSelection()) {
                                Menu menu = actionMode.getMenu();
                                if (menu.findItem(16908321) == null) {
                                    return;
                                }
                                ChatActivity.fillActionModeMenu(menu, ((ChatActivity) ChatAttachAlertPollLayout.this.parentAlert.baseFragment).getCurrentEncryptedChat(), false, true);
                            }
                        }

                        @Override
                        public void onCheckBoxClick(PollEditTextCell pollEditTextCell3, boolean z3) {
                            int adapterPosition;
                            if (z3 && ChatAttachAlertPollLayout.this.quizPoll && !ChatAttachAlertPollLayout.this.multipleChoise) {
                                Arrays.fill(ChatAttachAlertPollLayout.this.answersChecks, false);
                                ChatAttachAlertPollLayout.this.listView.getChildCount();
                                for (int i4 = ChatAttachAlertPollLayout.this.answerStartRow; i4 < ChatAttachAlertPollLayout.this.answersCount + ChatAttachAlertPollLayout.this.answerStartRow; i4++) {
                                    RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = ChatAttachAlertPollLayout.this.listView.findViewHolderForAdapterPosition(i4);
                                    if (viewHolderFindViewHolderForAdapterPosition != null) {
                                        View view2 = viewHolderFindViewHolderForAdapterPosition.itemView;
                                        if (view2 instanceof PollEditTextCell) {
                                            ((PollEditTextCell) view2).setChecked(false, true);
                                        }
                                    }
                                }
                            }
                            super.onCheckBoxClick(pollEditTextCell3, z3);
                            RecyclerView.ViewHolder viewHolderFindContainingViewHolder = ChatAttachAlertPollLayout.this.listView.findContainingViewHolder(pollEditTextCell3);
                            if (viewHolderFindContainingViewHolder != null && (adapterPosition = viewHolderFindContainingViewHolder.getAdapterPosition()) != -1) {
                                ChatAttachAlertPollLayout.this.answersChecks[adapterPosition - ChatAttachAlertPollLayout.this.answerStartRow] = z3;
                            }
                            ChatAttachAlertPollLayout.this.checkDoneButton();
                        }

                        @Override
                        public void onEditTextFocusChanged(boolean z3) {
                            ChatAttachAlertPollLayout.this.onCellFocusChanges(this, z3);
                        }

                        @Override
                        public void lambda$new$1$10(PollEditTextCell pollEditTextCell3) {
                            ChatAttachAlertPollLayout.this.onEmojiClicked(pollEditTextCell3);
                        }

                        @Override
                        public void onFactorChangeFinished(int i4, float f, FactorAnimator factorAnimator) {
                        }

                        @Override
                        public void onFieldTouchUp(EditTextBoldCursor editTextBoldCursor) {
                            ChatAttachAlertPollLayout.this.parentAlert.makeFocusable(editTextBoldCursor, true);
                        }

                        @Override
                        public boolean onPastedMultipleLines(ArrayList<CharSequence> arrayList) {
                            int childAdapterPosition;
                            if (arrayList.isEmpty() || (childAdapterPosition = ChatAttachAlertPollLayout.this.listView.getChildAdapterPosition(this) - ChatAttachAlertPollLayout.this.answerStartRow) < 0) {
                                return false;
                            }
                            this.textView.getText().replace(this.textView.getSelectionStart(), this.textView.getSelectionEnd(), arrayList.remove(0));
                            int i4 = childAdapterPosition + 1;
                            while (!arrayList.isEmpty() && i4 < ChatAttachAlertPollLayout.this.maxAnswersCount) {
                                for (int length = ChatAttachAlertPollLayout.this.answers.length - 1; length > i4; length--) {
                                    ChatAttachAlertPollLayout.this.answers[length] = ChatAttachAlertPollLayout.this.answers[length - 1];
                                }
                                ChatAttachAlertPollLayout.this.answers[i4] = arrayList.remove(0);
                                ChatAttachAlertPollLayout.access$2708(ChatAttachAlertPollLayout.this);
                                i4++;
                            }
                            ChatAttachAlertPollLayout.this.updateRows();
                            ChatAttachAlertPollLayout chatAttachAlertPollLayout = ChatAttachAlertPollLayout.this;
                            chatAttachAlertPollLayout.requestFieldFocusAtPosition = (chatAttachAlertPollLayout.answerStartRow + i4) - 1;
                            ChatAttachAlertPollLayout.this.listView.lambda$onCellEnter$52(ChatAttachAlertPollLayout.this.itemAnimator);
                            ChatAttachAlertPollLayout.this.listAdapter.notifyDataSetChanged();
                            return true;
                        }

                        @Override
                        public boolean shouldShowCheckBox() {
                            return ChatAttachAlertPollLayout.this.quizPoll;
                        }
                    };
                    if (!ChatAttachAlertPollLayout.this.todo) {
                        pollEditTextCell2.setTextRight(140);
                        pollEditTextCell2.addAttachView().setOnClickListener(new AIEditorAlert$$ExternalSyntheticLambda16(2, this, pollEditTextCell2));
                    }
                    int i4 = Theme.key_pollCreateIcons;
                    pollEditTextCell2.setIconsColor(i4);
                    pollEditTextCell2.supportMultiselect();
                    pollEditTextCell2.getCheckBox().setColor(-1, i4, Theme.key_checkboxCheck);
                    pollEditTextCell2.addTextWatcher(new TextWatcher() {
                        @Override
                        public void afterTextChanged(Editable editable) {
                            int adapterPosition;
                            int adapterPosition2;
                            RecyclerView.ViewHolder viewHolderFindContainingViewHolder = ChatAttachAlertPollLayout.this.listView.findContainingViewHolder(pollEditTextCell2);
                            if (viewHolderFindContainingViewHolder == null || (adapterPosition2 = (adapterPosition = viewHolderFindContainingViewHolder.getAdapterPosition()) - ChatAttachAlertPollLayout.this.answerStartRow) < 0 || adapterPosition2 >= ChatAttachAlertPollLayout.this.answers.length) {
                                return;
                            }
                            if (ChatAttachAlertPollLayout.this.suggestEmojiPanel != null) {
                                for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                                    editable.removeSpan(imageSpan);
                                }
                                Emoji.replaceEmoji(editable, pollEditTextCell2.getEditField().getPaint().getFontMetricsInt(), false);
                                float y = (viewHolderFindContainingViewHolder.itemView.getY() - AndroidUtilities.dp(166.0f)) + viewHolderFindContainingViewHolder.itemView.getMeasuredHeight();
                                if (y > 0.0f) {
                                    ChatAttachAlertPollLayout.this.suggestEmojiPanel.setDirection(0);
                                    ChatAttachAlertPollLayout.this.suggestEmojiPanel.setTranslationY(y);
                                } else {
                                    ChatAttachAlertPollLayout.this.suggestEmojiPanel.setDirection(1);
                                    ChatAttachAlertPollLayout.this.suggestEmojiPanel.setTranslationY(viewHolderFindContainingViewHolder.itemView.getY());
                                }
                                ChatAttachAlertPollLayout.this.suggestEmojiPanel.setDelegate(pollEditTextCell2);
                                ChatAttachAlertPollLayout.this.suggestEmojiPanel.fireUpdate();
                            }
                            ChatAttachAlertPollLayout.this.answers[adapterPosition2] = editable;
                            ChatAttachAlertPollLayout.this.setTextLeft(pollEditTextCell2, adapterPosition);
                            ChatAttachAlertPollLayout.this.checkDoneButton();
                        }

                        @Override
                        public void beforeTextChanged(CharSequence charSequence, int i5, int i6, int i7) {
                        }

                        @Override
                        public void onTextChanged(CharSequence charSequence, int i5, int i6, int i7) {
                        }
                    });
                    pollEditTextCell2.setShowNextButton(true);
                    EditTextBoldCursor textView = pollEditTextCell2.getTextView();
                    textView.setImeOptions(textView.getImeOptions() | 5);
                    int i5 = 1;
                    textView.setOnEditorActionListener(new AlertsCreator$$ExternalSyntheticLambda44(i5, this, pollEditTextCell2));
                    textView.setOnKeyListener(new AlertsCreator$$ExternalSyntheticLambda65(pollEditTextCell2, i5));
                    headerCell = pollEditTextCell2;
                    break;
                case 6:
                    headerCell = new TextCheckCell(this.mContext, 21, false, ChatAttachAlertPollLayout.this.resourcesProvider);
                    break;
                case 7:
                    final PollEditTextCell pollEditTextCell3 = new PollEditTextCell(this.mContext, false, ChatAttachAlertPollLayout.this.isPremium ? 1 : 0, null) {
                        @Override
                        public void onActionModeStart(EditTextBoldCursor editTextBoldCursor, ActionMode actionMode) {
                            if (editTextBoldCursor.isFocused() && editTextBoldCursor.hasSelection()) {
                                Menu menu = actionMode.getMenu();
                                if (menu.findItem(16908321) == null) {
                                    return;
                                }
                                ChatActivity.fillActionModeMenu(menu, ((ChatActivity) ChatAttachAlertPollLayout.this.parentAlert.baseFragment).getCurrentEncryptedChat(), false, true);
                            }
                        }

                        @Override
                        public void onEditTextFocusChanged(boolean z3) {
                            ChatAttachAlertPollLayout.this.onCellFocusChanges(this, z3);
                        }

                        @Override
                        public void lambda$new$1$10(PollEditTextCell pollEditTextCell4) {
                            ChatAttachAlertPollLayout.this.onEmojiClicked(pollEditTextCell4);
                        }

                        @Override
                        public void onFactorChangeFinished(int i6, float f, FactorAnimator factorAnimator) {
                        }

                        @Override
                        public void onFieldTouchUp(EditTextBoldCursor editTextBoldCursor) {
                            ChatAttachAlertPollLayout.this.parentAlert.makeFocusable(editTextBoldCursor, true);
                        }
                    };
                    pollEditTextCell3.createErrorTextView();
                    if (!ChatAttachAlertPollLayout.this.todo) {
                        pollEditTextCell3.setTextRight(98);
                        final int i6 = 1;
                        pollEditTextCell3.addAttachView().setOnClickListener(new View.OnClickListener(this) {
                            public final ChatAttachAlertPollLayout.ListAdapter f$0;

                            {
                                this.f$0 = this;
                            }

                            @Override
                            public final void onClick(View view2) {
                                switch (i6) {
                                    case 0:
                                        this.f$0.lambda$onCreateViewHolder$2(view2);
                                        break;
                                    case 1:
                                        this.f$0.lambda$onCreateViewHolder$1(view2);
                                        break;
                                    default:
                                        this.f$0.lambda$onCreateViewHolder$0(view2);
                                        break;
                                }
                            }
                        });
                    }
                    pollEditTextCell3.setIconsColor(Theme.key_pollCreateIcons);
                    pollEditTextCell3.addTextWatcher(new TextWatcher() {
                        @Override
                        public void afterTextChanged(Editable editable) {
                            if (pollEditTextCell3.getTag() != null) {
                                return;
                            }
                            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = ChatAttachAlertPollLayout.this.listView.findViewHolderForAdapterPosition(ChatAttachAlertPollLayout.this.solutionRow);
                            if (viewHolderFindViewHolderForAdapterPosition != null && ChatAttachAlertPollLayout.this.suggestEmojiPanel != null) {
                                for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                                    editable.removeSpan(imageSpan);
                                }
                                Emoji.replaceEmoji(editable, pollEditTextCell3.getEditField().getPaint().getFontMetricsInt(), false);
                                ChatAttachAlertPollLayout.this.suggestEmojiPanel.setDirection(1);
                                ChatAttachAlertPollLayout.this.suggestEmojiPanel.setDelegate(pollEditTextCell3);
                                ChatAttachAlertPollLayout.this.suggestEmojiPanel.setTranslationY(viewHolderFindViewHolderForAdapterPosition.itemView.getY());
                                ChatAttachAlertPollLayout.this.suggestEmojiPanel.fireUpdate();
                            }
                            ChatAttachAlertPollLayout.this.solutionString = editable;
                            if (viewHolderFindViewHolderForAdapterPosition != null) {
                                ChatAttachAlertPollLayout chatAttachAlertPollLayout = ChatAttachAlertPollLayout.this;
                                chatAttachAlertPollLayout.setTextLeft(viewHolderFindViewHolderForAdapterPosition.itemView, chatAttachAlertPollLayout.solutionRow);
                            }
                            ChatAttachAlertPollLayout.this.checkDoneButton();
                        }

                        @Override
                        public void beforeTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
                        }

                        @Override
                        public void onTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
                        }
                    });
                    headerCell = pollEditTextCell3;
                    break;
                case 8:
                    EmptyView emptyView = new EmptyView(this.mContext);
                    emptyView.setTag(-33024);
                    view = emptyView;
                    headerCell = view;
                    break;
                case 9:
                    View view2 = new View(this.mContext) {
                        @Override
                        public void onMeasure(int i7, int i8) {
                            setMeasuredDimension(View.MeasureSpec.getSize(i7), ChatAttachAlertPollLayout.this.topPadding);
                        }
                    };
                    view2.setTag(-33024);
                    view = view2;
                    headerCell = view;
                    break;
                case 10:
                    PollCreateCheckCell pollCreateCheckCell = new PollCreateCheckCell(this.mContext, ChatAttachAlertPollLayout.this.resourcesProvider);
                    pollCreateCheckCell.getCheckBox().setIcon(R.drawable.permission_locked);
                    headerCell = pollCreateCheckCell;
                    break;
            }
            return zzkd.m(headerCell, headerCell, -2);
        }

        @Override
        public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
            int itemViewType = viewHolder.getItemViewType();
            if (itemViewType == 4) {
                PollEditTextCell pollEditTextCell = (PollEditTextCell) viewHolder.itemView;
                pollEditTextCell.setTag(1);
                pollEditTextCell.setTextAndHint(ChatAttachAlertPollLayout.this.questionString != null ? ChatAttachAlertPollLayout.this.questionString : "", LocaleController.getString(ChatAttachAlertPollLayout.this.todo ? R.string.TodoTitlePlaceholder : R.string.QuestionHint), true);
                pollEditTextCell.setTag(null);
                ChatAttachAlertPollLayout.this.setTextLeft(viewHolder.itemView, viewHolder.getAdapterPosition());
                return;
            }
            if (itemViewType == 11) {
                PollEditTextCell pollEditTextCell2 = (PollEditTextCell) viewHolder.itemView;
                pollEditTextCell2.setTag(1);
                pollEditTextCell2.setTextAndHint(ChatAttachAlertPollLayout.this.descriptionString != null ? ChatAttachAlertPollLayout.this.descriptionString : "", LocaleController.getString(R.string.QuestionDescriptionHint), false);
                pollEditTextCell2.setTag(null);
                pollEditTextCell2.attachView.setAttachedMedia((PollAttachedMedia) ChatAttachAlertPollLayout.this.attachedMedia.medias.get(-2), false);
                ChatAttachAlertPollLayout.this.setTextLeft(viewHolder.itemView, viewHolder.getAdapterPosition());
                return;
            }
            if (itemViewType != 5) {
                if (itemViewType == 7) {
                    PollEditTextCell pollEditTextCell3 = (PollEditTextCell) viewHolder.itemView;
                    pollEditTextCell3.setTag(1);
                    pollEditTextCell3.setTextAndHint(ChatAttachAlertPollLayout.this.solutionString != null ? ChatAttachAlertPollLayout.this.solutionString : "", LocaleController.getString(R.string.AddAnExplanation), false);
                    pollEditTextCell3.setTag(null);
                    if (!ChatAttachAlertPollLayout.this.todo) {
                        pollEditTextCell3.attachView.setAttachedMedia((PollAttachedMedia) ChatAttachAlertPollLayout.this.attachedMedia.medias.get(-3), false);
                    }
                    ChatAttachAlertPollLayout.this.setTextLeft(viewHolder.itemView, viewHolder.getAdapterPosition());
                    return;
                }
                return;
            }
            int adapterPosition = viewHolder.getAdapterPosition();
            PollEditTextCell pollEditTextCell4 = (PollEditTextCell) viewHolder.itemView;
            pollEditTextCell4.setTag(1);
            pollEditTextCell4.setCheckboxMultiselect(ChatAttachAlertPollLayout.this.multipleChoise, false);
            int i = adapterPosition - ChatAttachAlertPollLayout.this.answerStartRow;
            pollEditTextCell4.setTextAndHint(ChatAttachAlertPollLayout.this.answers[i], LocaleController.getString(ChatAttachAlertPollLayout.this.todo ? R.string.TodoTaskPlaceholder : R.string.OptionHint), true);
            pollEditTextCell4.setTag(null);
            if (ChatAttachAlertPollLayout.this.requestFieldFocusAtPosition == adapterPosition) {
                EditTextBoldCursor textView = pollEditTextCell4.getTextView();
                textView.requestFocus();
                AndroidUtilities.showKeyboard(textView);
                ChatAttachAlertPollLayout.this.requestFieldFocusAtPosition = -1;
            }
            if (!ChatAttachAlertPollLayout.this.todo) {
                pollEditTextCell4.attachView.setAttachedMedia((PollAttachedMedia) ChatAttachAlertPollLayout.this.attachedMedia.medias.get(i), false);
            }
            ChatAttachAlertPollLayout.this.setTextLeft(viewHolder.itemView, adapterPosition);
        }

        @Override
        public void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
            if (viewHolder.getItemViewType() == 4 || viewHolder.getItemViewType() == 11 || viewHolder.getItemViewType() == 5) {
                EditTextBoldCursor textView = ((PollEditTextCell) viewHolder.itemView).getTextView();
                if (textView.isFocused()) {
                    if (ChatAttachAlertPollLayout.this.isPremium) {
                        if (ChatAttachAlertPollLayout.this.suggestEmojiPanel != null) {
                            ChatAttachAlertPollLayout.this.suggestEmojiPanel.forceClose();
                        }
                        ChatAttachAlertPollLayout.this.hideEmojiPopup(true);
                    }
                    ChatAttachAlertPollLayout.this.currentCell = null;
                    textView.clearFocus();
                    AndroidUtilities.hideKeyboard(textView);
                }
            }
        }

        public void swapElements(int i, int i2) {
            int i3 = i - ChatAttachAlertPollLayout.this.answerStartRow;
            int i4 = i2 - ChatAttachAlertPollLayout.this.answerStartRow;
            if (i3 < 0 || i4 < 0 || i3 >= ChatAttachAlertPollLayout.this.answersCount || i4 >= ChatAttachAlertPollLayout.this.answersCount) {
                return;
            }
            PollAttachedMedia pollAttachedMedia = (PollAttachedMedia) ChatAttachAlertPollLayout.this.attachedMedia.medias.get(i3);
            PollAttachedMediaPack pollAttachedMediaPack = ChatAttachAlertPollLayout.this.attachedMedia;
            pollAttachedMediaPack.medias.put(i3, (PollAttachedMedia) ChatAttachAlertPollLayout.this.attachedMedia.medias.get(i4));
            ChatAttachAlertPollLayout.this.attachedMedia.medias.put(i4, pollAttachedMedia);
            CharSequence charSequence = ChatAttachAlertPollLayout.this.answers[i3];
            ChatAttachAlertPollLayout.this.answers[i3] = ChatAttachAlertPollLayout.this.answers[i4];
            ChatAttachAlertPollLayout.this.answers[i4] = charSequence;
            boolean z = ChatAttachAlertPollLayout.this.answersChecks[i3];
            ChatAttachAlertPollLayout.this.answersChecks[i3] = ChatAttachAlertPollLayout.this.answersChecks[i4];
            ChatAttachAlertPollLayout.this.answersChecks[i4] = z;
            notifyItemMoved(i, i2);
        }
    }

    public interface PollCreateActivityDelegate {
        void sendPoll(TLRPC.MessageMedia messageMedia, CharSequence charSequence, PollAttachedMediaPack pollAttachedMediaPack, ArrayList<Integer> arrayList, boolean z, int i, long j);
    }

    public class ToggleRow {
        public boolean checked;
        public int row;

        private ToggleRow() {
        }

        public void addRows(int i) {
            ChatAttachAlertPollLayout.this.listAdapter.notifyItemRangeInserted(this.row + 1, i);
        }

        public void removeRows(int i) {
            ChatAttachAlertPollLayout.this.listAdapter.notifyItemRangeRemoved(this.row + 1, i);
        }

        public void setDivider(boolean z) {
            if (this.row < 0) {
                return;
            }
            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = ChatAttachAlertPollLayout.this.listView.findViewHolderForAdapterPosition(this.row);
            if (viewHolderFindViewHolderForAdapterPosition != null) {
                View view = viewHolderFindViewHolderForAdapterPosition.itemView;
                if (view instanceof PollCreateCheckCell) {
                    ((PollCreateCheckCell) view).setDivider(z);
                    return;
                }
            }
            ChatAttachAlertPollLayout.this.listAdapter.lambda$onBindViewHolder$31(this.row);
        }
    }

    public class TouchHelperCallback extends ItemTouchHelper.Callback {
        public TouchHelperCallback() {
        }

        @Override
        public void clearView(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            super.clearView(recyclerView, viewHolder);
            viewHolder.itemView.setPressed(false);
            viewHolder.itemView.setBackground(null);
        }

        @Override
        public int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            return viewHolder.getItemViewType() != 5 ? ItemTouchHelper.Callback.makeMovementFlags(0, 0) : ItemTouchHelper.Callback.makeMovementFlags(3, 0);
        }

        @Override
        public boolean isLongPressDragEnabled() {
            return true;
        }

        @Override
        public void onChildDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, float f, float f2, int i, boolean z) {
            super.onChildDraw(canvas, recyclerView, viewHolder, f, f2, i, z);
        }

        @Override
        public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
            if (viewHolder.getItemViewType() != viewHolder2.getItemViewType()) {
                return false;
            }
            ChatAttachAlertPollLayout.this.listAdapter.swapElements(viewHolder.getAdapterPosition(), viewHolder2.getAdapterPosition());
            return true;
        }

        @Override
        public void onSelectedChanged(RecyclerView.ViewHolder viewHolder, int i) {
            if (i != 0) {
                ChatAttachAlertPollLayout.this.listView.lambda$onCellEnter$52(ChatAttachAlertPollLayout.this.itemAnimator);
                ChatAttachAlertPollLayout.this.listView.cancelClickRunnables(false);
                viewHolder.itemView.setPressed(true);
                viewHolder.itemView.setBackgroundColor(ChatAttachAlertPollLayout.this.getThemedColor(Theme.key_dialogBackground));
            }
            super.onSelectedChanged(viewHolder, i);
        }

        @Override
        public void onSwiped(RecyclerView.ViewHolder viewHolder, int i) {
        }
    }

    public ChatAttachAlertPollLayout(ChatAttachAlert chatAttachAlert, Context context, boolean z, Theme.ResourcesProvider resourcesProvider, Boolean bool) {
        super(chatAttachAlert, context, resourcesProvider);
        this.answersCount = 1;
        this.allowRevoting = true;
        this.shuffleOptions = true;
        this.allowAddingOptions = true;
        this.multipleChoise = true;
        this.allowAdding = true;
        this.allowMarking = true;
        this.requestFieldFocusAtPosition = -1;
        ToggleRow toggleRow = new ToggleRow();
        this.poll2vSubscribersOnlyRow = toggleRow;
        ToggleRow toggleRow2 = new ToggleRow();
        this.poll2vLimitByCountryRow = toggleRow2;
        this.toggleRows = new ToggleRow[]{toggleRow, toggleRow2};
        this.countriesList = new ArrayList<>();
        this.POLL_DURATION_OPTIONS = new int[]{3600, 10800, 28800, 86400, 259200};
        this.openKeyboardRunnable = new Runnable() {
            @Override
            public void run() {
                if (ChatAttachAlertPollLayout.this.currentCell != null) {
                    EditTextBoldCursor editField = ChatAttachAlertPollLayout.this.currentCell.getEditField();
                    if (ChatAttachAlertPollLayout.this.destroyed || editField == null || !ChatAttachAlertPollLayout.this.waitingForKeyboardOpen || ChatAttachAlertPollLayout.this.keyboardVisible || AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow || !AndroidUtilities.isTablet()) {
                        return;
                    }
                    editField.requestFocus();
                    AndroidUtilities.showKeyboard(editField);
                    AndroidUtilities.cancelRunOnUIThread(ChatAttachAlertPollLayout.this.openKeyboardRunnable);
                    AndroidUtilities.runOnUIThread(ChatAttachAlertPollLayout.this.openKeyboardRunnable, 100L);
                }
            }
        };
        this.smoothScrollToOption = false;
        this.showMediaHintIndexAfterSmoothScroll = -1;
        this.isEmojiSearchOpened = false;
        this.wasEmojiSearchOpened = false;
        Paint paint = new Paint(1);
        this.checkboxPaint = paint;
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
        updateRows();
        paint.setColor(getThemedColor(Theme.key_telegram_color));
        this.parentAlert.sizeNotifierFrameLayout.setDelegate(this);
        ListAdapter listAdapter = new ListAdapter(context);
        this.listAdapter = listAdapter;
        RecyclerListView recyclerListView = new RecyclerListView(context) {
            @Override
            public void requestChildOnScreen(View view, View view2) {
                if (view instanceof PollEditTextCell) {
                    super.requestChildOnScreen(view, view2);
                }
            }

            @Override
            public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z3) {
                rect.bottom = AndroidUtilities.dp(60.0f) + rect.bottom;
                return super.requestChildRectangleOnScreen(view, rect, z3);
            }
        };
        this.listView = recyclerListView;
        this.iBlur3Capture = recyclerListView;
        this.iBlur3CaptureView = recyclerListView;
        this.occupyStatusBar = true;
        this.occupyNavigationBar = true;
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator() {
            @Override
            public void onMoveAnimationUpdate(RecyclerView.ViewHolder viewHolder) {
                if (viewHolder.getAdapterPosition() == 0) {
                    ChatAttachAlertPollLayout chatAttachAlertPollLayout = ChatAttachAlertPollLayout.this;
                    chatAttachAlertPollLayout.parentAlert.updateLayout(chatAttachAlertPollLayout, true, 0);
                }
            }
        };
        this.itemAnimator = defaultItemAnimator;
        recyclerListView.lambda$onCellEnter$52(defaultItemAnimator);
        this.countriesList.clear();
        defaultItemAnimator.setSupportsChangeAnimations(false);
        defaultItemAnimator.setDelayAnimations(false);
        defaultItemAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        defaultItemAnimator.setDurations(350L);
        recyclerListView.setClipToPadding(false);
        recyclerListView.setVerticalScrollBarEnabled(false);
        recyclerListView.setSections(true);
        FillLastLinearLayoutManager fillLastLinearLayoutManager = new FillLastLinearLayoutManager(context, 1, false, AndroidUtilities.dp(65.0f) + AndroidUtilities.statusBarHeight, recyclerListView) {
            @Override
            public int[] getChildRectangleOnScreenScrollAmount(View view, Rect rect) {
                int height = getHeight() - getPaddingBottom();
                int top = (view.getTop() + rect.top) - view.getScrollY();
                int iHeight = rect.height() + top;
                int iMin = Math.min(0, top);
                int iMax = Math.max(0, iHeight - height);
                if (iMin == 0) {
                    iMin = Math.min(top, iMax);
                }
                return new int[]{0, iMin};
            }

            @Override
            public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
                LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(recyclerView.getContext()) {
                    @Override
                    public int calculateDyToMakeVisible(View view, int i2) {
                        if (ChatAttachAlertPollLayout.this.smoothScrollToOption) {
                            i2 = -1;
                        }
                        int iCalculateDyToMakeVisible = super.calculateDyToMakeVisible(view, i2);
                        if (ChatAttachAlertPollLayout.this.smoothScrollToOption) {
                            iCalculateDyToMakeVisible += AndroidUtilities.dp(160.0f);
                        }
                        if (!ChatAttachAlertPollLayout.this.smoothScrollToOption) {
                            iCalculateDyToMakeVisible -= (ChatAttachAlertPollLayout.this.topPadding - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(7.0f);
                        }
                        if (ChatAttachAlertPollLayout.this.smoothScrollToOption && iCalculateDyToMakeVisible == 0 && ChatAttachAlertPollLayout.this.showMediaHintIndexAfterSmoothScroll >= 0) {
                            ChatAttachAlertPollLayout chatAttachAlertPollLayout = ChatAttachAlertPollLayout.this;
                            chatAttachAlertPollLayout.showMediaHint(chatAttachAlertPollLayout.showMediaHintIndexAfterSmoothScroll);
                            ChatAttachAlertPollLayout.this.showMediaHintIndexAfterSmoothScroll = -1;
                        }
                        ChatAttachAlertPollLayout.this.smoothScrollToOption = false;
                        return iCalculateDyToMakeVisible;
                    }

                    @Override
                    public int calculateTimeForDeceleration(int i2) {
                        return super.calculateTimeForDeceleration(i2) * 2;
                    }
                };
                linearSmoothScroller.setTargetPosition(i);
                startSmoothScroll(linearSmoothScroller);
            }
        };
        this.layoutManager = fillLastLinearLayoutManager;
        recyclerListView.setLayoutManager(fillLastLinearLayoutManager);
        fillLastLinearLayoutManager.setSkipFirstItem();
        new ItemTouchHelper(new TouchHelperCallback()).attachToRecyclerView(recyclerListView);
        addView(recyclerListView, LayoutHelper.createFrame(-1, -1, 51));
        recyclerListView.setPreserveFocusAfterLayout(true);
        recyclerListView.setAdapter(listAdapter);
        recyclerListView.setOnItemClickListener(new EmojiPacksAlert$$ExternalSyntheticLambda8(this, resourcesProvider, chatAttachAlert, context));
        recyclerListView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                RecyclerListView.Holder holder;
                int top;
                if (i == 0) {
                    int iDp = AndroidUtilities.dp(13.0f);
                    int backgroundPaddingTop = ChatAttachAlertPollLayout.this.parentAlert.getBackgroundPaddingTop();
                    if (((ChatAttachAlertPollLayout.this.parentAlert.scrollOffsetY[0] - backgroundPaddingTop) - iDp) + backgroundPaddingTop < ActionBar.getCurrentActionBarHeight() && (holder = (RecyclerListView.Holder) ChatAttachAlertPollLayout.this.listView.findViewHolderForAdapterPosition(1)) != null && (top = (holder.itemView.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(65.0f)) > 0) {
                        ChatAttachAlertPollLayout.this.listView.smoothScrollBy(0, top);
                    }
                    if (ChatAttachAlertPollLayout.this.showMediaHintIndexAfterSmoothScroll >= 0) {
                        ChatAttachAlertPollLayout chatAttachAlertPollLayout = ChatAttachAlertPollLayout.this;
                        chatAttachAlertPollLayout.showMediaHint(chatAttachAlertPollLayout.showMediaHintIndexAfterSmoothScroll);
                        ChatAttachAlertPollLayout.this.showMediaHintIndexAfterSmoothScroll = -1;
                    }
                }
            }

            @Override
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                ChatAttachAlertPollLayout chatAttachAlertPollLayout = ChatAttachAlertPollLayout.this;
                chatAttachAlertPollLayout.parentAlert.updateLayout(chatAttachAlertPollLayout, true, i2);
                if (ChatAttachAlertPollLayout.this.suggestEmojiPanel != null && ChatAttachAlertPollLayout.this.suggestEmojiPanel.isShown()) {
                    SuggestEmojiView.AnchorViewDelegate delegate = ChatAttachAlertPollLayout.this.suggestEmojiPanel.getDelegate();
                    if (delegate instanceof PollEditTextCell) {
                        RecyclerView.ViewHolder viewHolderFindContainingViewHolder = ChatAttachAlertPollLayout.this.listView.findContainingViewHolder((PollEditTextCell) delegate);
                        if (viewHolderFindContainingViewHolder != null) {
                            int adapterPosition = viewHolderFindContainingViewHolder.getAdapterPosition();
                            if (ChatAttachAlertPollLayout.this.suggestEmojiPanel.getDirection() == 0) {
                                ChatAttachAlertPollLayout.this.suggestEmojiPanel.setTranslationY((viewHolderFindContainingViewHolder.itemView.getY() - AndroidUtilities.dp(166.0f)) + viewHolderFindContainingViewHolder.itemView.getMeasuredHeight());
                            } else {
                                ChatAttachAlertPollLayout.this.suggestEmojiPanel.setTranslationY(viewHolderFindContainingViewHolder.itemView.getY());
                            }
                            if (adapterPosition < ChatAttachAlertPollLayout.this.layoutManager.findFirstVisibleItemPosition() || adapterPosition > ChatAttachAlertPollLayout.this.layoutManager.findLastVisibleItemPosition()) {
                                ChatAttachAlertPollLayout.this.suggestEmojiPanel.forceClose();
                            }
                        } else {
                            ChatAttachAlertPollLayout.this.suggestEmojiPanel.forceClose();
                        }
                    } else {
                        ChatAttachAlertPollLayout.this.suggestEmojiPanel.forceClose();
                    }
                }
                if (i2 == 0 || ChatAttachAlertPollLayout.this.hintView == null) {
                    return;
                }
                ChatAttachAlertPollLayout.this.hintView.hide();
            }
        });
        HintView hintView = new HintView(context, 4);
        this.hintView = hintView;
        hintView.setAlpha(0.0f);
        this.hintView.setVisibility(4);
        addView(this.hintView, LayoutHelper.createFrame(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
        this.MAX_CAPTION_LENGTH = MessagesController.getInstance(this.parentAlert.currentAccount).config.pollCaptionLengthMax.get();
        this.webPageLoader = new WebPageLoader(this.parentAlert.currentAccount);
        NotificationCenter.getInstance(this.parentAlert.currentAccount).addObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        if (zIsPremium) {
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
            SuggestEmojiView suggestEmojiView = new SuggestEmojiView(context, this.parentAlert.currentAccount, null, resourcesProvider) {
                @Override
                public int emojiCacheType() {
                    return 3;
                }
            };
            this.suggestEmojiPanel = suggestEmojiView;
            suggestEmojiView.forbidCopy();
            this.suggestEmojiPanel.forbidSetAsStatus();
            this.suggestEmojiPanel.setHorizontalPadding(AndroidUtilities.dp(24.0f));
            addView(this.suggestEmojiPanel, LayoutHelper.createFrame(-2, 160, 51));
        }
        this.keyboardNotifier = new KeyboardNotifier(this.parentAlert.sizeNotifierFrameLayout, false, null);
        checkDoneButton();
    }

    public static int access$2708(ChatAttachAlertPollLayout chatAttachAlertPollLayout) {
        int i = chatAttachAlertPollLayout.answersCount;
        chatAttachAlertPollLayout.answersCount = i + 1;
        return i;
    }

    public void addNewField() {
        resetSuggestEmojiPanel();
        this.listView.lambda$onCellEnter$52(this.itemAnimator);
        boolean[] zArr = this.answersChecks;
        int i = this.answersCount;
        zArr[i] = false;
        int i2 = i + 1;
        this.answersCount = i2;
        if (i2 == this.answers.length) {
            this.listAdapter.notifyItemRemoved(this.addAnswerRow);
        }
        this.listAdapter.notifyItemInserted(this.addAnswerRow);
        updateRows();
        this.requestFieldFocusAtPosition = (this.answerStartRow + this.answersCount) - 1;
        this.listAdapter.lambda$onBindViewHolder$31(this.answerSectionRow);
        this.listAdapter.lambda$onBindViewHolder$31(this.emptyRow);
    }

    private void animateEmojiViewTranslationY(float f, final float f2) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new EmojiTabsStrip$$ExternalSyntheticLambda0(this, f, f2, 1));
        valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                ChatAttachAlertPollLayout.this.emojiView.setTranslationY(f2);
            }
        });
        valueAnimatorOfFloat.setDuration(250L);
        valueAnimatorOfFloat.setInterpolator(AdjustPanLayoutHelper.keyboardInterpolator);
        valueAnimatorOfFloat.start();
    }

    private void checkAllowAddingOptionsRow() {
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
            this.listAdapter.lambda$onBindViewHolder$31(this.poll2vAllowAddingRow);
            return;
        }
        PollCreateCheckCell pollCreateCheckCell = (PollCreateCheckCell) viewHolderFindViewHolderForAdapterPosition.itemView;
        if (!z) {
            pollCreateCheckCell.setChecked(false);
        }
        pollCreateCheckCell.getCheckBox().setIconVisible(!z, true);
    }

    public void checkAllowedCountriesList(TextCell textCell, boolean z) {
        textCell.setTextAndValue(LocaleController.getString(R.string.PollV2AllowedCountries), formatCountriesList(this.countriesList), z, true);
    }

    private boolean checkDiscard() {
        boolean zIsEmpty = TextUtils.isEmpty(getFixedString(this.questionString)) && TextUtils.isEmpty(getFixedString(this.descriptionString)) && TextUtils.isEmpty(getFixedString(this.solutionString)) && this.attachedMedia.medias.size() == 0;
        if (zIsEmpty) {
            for (int i = 0; i < this.answersCount && (zIsEmpty = TextUtils.isEmpty(getFixedString(this.answers[i]))); i++) {
            }
        }
        if (!zIsEmpty) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this.parentAlert.baseFragment.getParentActivity(), 0, null);
            builder.setTitle(LocaleController.getString(this.todo ? R.string.CancelTodoAlertTitle : R.string.CancelPollAlertTitle));
            builder.setMessage(LocaleController.getString(this.todo ? R.string.CancelTodoAlertText : R.string.CancelPollAlertText));
            builder.setPositiveButton(LocaleController.getString(R.string.PassportDiscard), new EmojiView$$ExternalSyntheticLambda21(this, 29));
            builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
            builder.show();
        }
        return zIsEmpty;
    }

    public void checkDoneButton() {
        int i;
        if (this.quizPoll) {
            i = 0;
            for (int i2 = 0; i2 < this.answersChecks.length; i2++) {
                if (!TextUtils.isEmpty(getFixedString(this.answers[i2])) && this.answersChecks[i2]) {
                    i++;
                }
            }
        } else {
            i = 0;
        }
        int i3 = this.todo ? getMessagesController().todoTitleLengthMax : 255;
        int i4 = this.todo ? getMessagesController().todoItemLengthMax : 100;
        boolean z = (TextUtils.isEmpty(getFixedString(this.descriptionString)) || this.descriptionString.length() <= this.MAX_CAPTION_LENGTH) && (TextUtils.isEmpty(getFixedString(this.solutionString)) || this.solutionString.length() <= 200) && !TextUtils.isEmpty(getFixedString(this.questionString)) && this.questionString.length() <= i3;
        int i5 = 0;
        int i6 = 0;
        boolean z2 = false;
        while (true) {
            CharSequence[] charSequenceArr = this.answers;
            if (i5 >= charSequenceArr.length) {
                break;
            }
            if (!TextUtils.isEmpty(getFixedString(charSequenceArr[i5]))) {
                if (this.answers[i5].length() > i4) {
                    i6 = 0;
                    z2 = true;
                    break;
                } else {
                    i6++;
                    z2 = true;
                }
            }
            i5++;
        }
        if (i6 < 1 || (this.quizPoll && i < 1)) {
            z = false;
        }
        if (TextUtils.isEmpty(this.solutionString) && TextUtils.isEmpty(this.questionString) && TextUtils.isEmpty(this.descriptionString) && !z2 && this.attachedMedia.medias.size() <= 0) {
            this.allowNesterScroll = true;
        } else {
            this.allowNesterScroll = false;
        }
        this.parentAlert.setAllowNestedScroll(this.allowNesterScroll);
        this.doneItemEnabled = z;
        this.parentAlert.updateDoneItemEnabled();
    }

    public void checkDurationInfoRow(TextCell textCell, boolean z) {
        if (this.pollLimitDeadline != 0) {
            textCell.setTextAndValue(LocaleController.getString(R.string.PollV2PollEnds), LocaleController.formatShortDateTime(this.pollLimitDeadline), z, false);
        } else if (this.pollLimitDuration != 0) {
            textCell.setTextAndValue(LocaleController.getString(R.string.PollV2PollDuration), LocaleController.formatPluralString("Hours", this.pollLimitDuration / 3600, new Object[0]), z, false);
        } else {
            textCell.setTextAndValue(LocaleController.getString(R.string.PollV2PollEnds), null, z, false);
        }
    }

    private void checkPollLinkMedia(PollAttachedMediaLink pollAttachedMediaLink, boolean z) {
        TLRPC.Photo photo;
        boolean zContainsKey = this.webPageLoader.callbacks.containsKey(pollAttachedMediaLink.url);
        TLRPC.WebPage webPage = (TLRPC.WebPage) this.webPageLoader.pages.get(pollAttachedMediaLink.url);
        pollAttachedMediaLink.animatorProgress.setValue(zContainsKey || (webPage instanceof TLRPC.TL_webPagePending), z);
        pollAttachedMediaLink.webPage = webPage;
        BoolAnimator boolAnimator = pollAttachedMediaLink.animatorHasImage;
        ImageReceiver imageReceiver = pollAttachedMediaLink.imageReceiver;
        if (webPage == null || (photo = webPage.photo) == null) {
            boolAnimator.setValue(false, z);
            imageReceiver.clearImage();
        } else {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 40);
            imageReceiver.setImage(ImageLocation.getForObject(FileLoader.getClosestPhotoSizeWithSize(webPage.photo.sizes, AndroidUtilities.dp(36.0f), false, closestPhotoSizeWithSize, true), webPage.photo), "48_48", ImageLocation.getForObject(closestPhotoSizeWithSize, webPage.photo), "48_48_b", 0L, null, webPage, 1);
            boolAnimator.setValue(true, z);
        }
    }

    private void collapseSearchEmojiView() {
        if (this.isEmojiSearchOpened) {
            this.emojiView.closeSearch(false);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.emojiView.getLayoutParams();
            layoutParams.height -= AndroidUtilities.dp(120.0f);
            this.emojiView.setLayoutParams(layoutParams);
            this.emojiPadding = layoutParams.height;
            this.wasEmojiSearchOpened = this.isEmojiSearchOpened;
            this.isEmojiSearchOpened = false;
            animateEmojiViewTranslationY(-AndroidUtilities.dp(120.0f), 0.0f);
        }
    }

    private void createEmojiView() {
        EmojiView emojiView = this.emojiView;
        if (emojiView != null && emojiView.currentAccount != UserConfig.selectedAccount) {
            this.parentAlert.sizeNotifierFrameLayout.removeView(emojiView);
            this.emojiView = null;
        }
        if (this.emojiView != null) {
            return;
        }
        EmojiView emojiView2 = new EmojiView(null, true, false, false, getContext(), true, null, null, true, this.resourcesProvider, false);
        this.emojiView = emojiView2;
        emojiView2.emojiCacheType = 3;
        emojiView2.shouldLightenBackground = false;
        emojiView2.fixBottomTabContainerTranslation = false;
        emojiView2.setShouldDrawBackground(false);
        this.emojiView.allowEmojisForNonPremium(false);
        this.emojiView.setVisibility(8);
        if (AndroidUtilities.isTablet()) {
            this.emojiView.setForseMultiwindowLayout(true);
        }
        this.emojiView.setDelegate(new AnonymousClass10());
        this.parentAlert.sizeNotifierFrameLayout.addView(this.emojiView);
        this.emojiView.setBottomInset(AndroidUtilities.navigationBarHeight);
    }

    public void deletePollAnswerView(View view, PollEditTextCell pollEditTextCell, boolean z) {
        int adapterPosition;
        BaseFragment baseFragment;
        if (view.getTag() != null) {
            return;
        }
        view.setTag(1);
        RecyclerView.ViewHolder viewHolderFindContainingViewHolder = this.listView.findContainingViewHolder(pollEditTextCell);
        if (viewHolderFindContainingViewHolder == null || (adapterPosition = viewHolderFindContainingViewHolder.getAdapterPosition()) == -1) {
            return;
        }
        int i = adapterPosition - this.answerStartRow;
        boolean z2 = ((PollAttachedMedia) this.attachedMedia.medias.get(i)) != null;
        if (z && z2 && (baseFragment = this.parentAlert.baseFragment) != null) {
            AlertDialog alertDialogCreate = new AlertDialog.Builder(baseFragment.getParentActivity(), 0, this.resourcesProvider).setTitle(LocaleController.getString(!this.quizPoll ? R.string.DiscardPollOptionWithMediaAlertTitle : R.string.DiscardQuizOptionWithMediaAlertTitle)).setMessage(LocaleController.getString(!this.quizPoll ? R.string.DiscardPollOptionWithMediaMessage : R.string.DiscardQuizOptionWithMediaMessage)).setPositiveButton(LocaleController.getString(R.string.Delete), new AlertsCreator$$ExternalSyntheticLambda201(this, view, pollEditTextCell, 11)).setNegativeButton(LocaleController.getString(R.string.Cancel), null).setOnCancelListener(new ChatAttachAlert$$ExternalSyntheticLambda5(view, 1)).create();
            alertDialogCreate.show();
            TextView textView = (TextView) alertDialogCreate.getButton(-1);
            if (textView != null) {
                textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
                return;
            }
            return;
        }
        this.attachedMedia.removeAnswerAndShift(i);
        this.listView.lambda$onCellEnter$52(this.itemAnimator);
        this.listAdapter.notifyItemRemoved(adapterPosition);
        CharSequence[] charSequenceArr = this.answers;
        int i2 = i + 1;
        System.arraycopy(charSequenceArr, i2, charSequenceArr, i, (charSequenceArr.length - 1) - i);
        boolean[] zArr = this.answersChecks;
        System.arraycopy(zArr, i2, zArr, i, (zArr.length - 1) - i);
        CharSequence[] charSequenceArr2 = this.answers;
        charSequenceArr2[charSequenceArr2.length - 1] = null;
        boolean[] zArr2 = this.answersChecks;
        zArr2[zArr2.length - 1] = false;
        int i3 = this.answersCount - 1;
        this.answersCount = i3;
        if (i3 == charSequenceArr2.length - 1) {
            this.listAdapter.notifyItemInserted((this.answerStartRow + charSequenceArr2.length) - 1);
        }
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = this.listView.findViewHolderForAdapterPosition(adapterPosition - 1);
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
        checkDoneButton();
        updateRows();
        SuggestEmojiView suggestEmojiView = this.suggestEmojiPanel;
        if (suggestEmojiView != null) {
            suggestEmojiView.forceClose();
            this.suggestEmojiPanel.setDelegate(null);
        }
        this.listAdapter.lambda$onBindViewHolder$31(this.answerSectionRow);
        this.listAdapter.lambda$onBindViewHolder$31(this.emptyRow);
    }

    private static String formatCountriesList(ArrayList<String> arrayList) {
        if (arrayList.isEmpty()) {
            return LocaleController.getString(R.string.SearchCountriesSelect);
        }
        return arrayList.size() == 1 ? LocaleController.getCountryName(arrayList.get(0)) : LocaleController.formatPluralString("PollV2AllowedCountriesListManyP", arrayList.size(), new Object[0]);
    }

    public static int getAllowedLayoutsForIndex(int i) {
        return (i == -2 || i == -3) ? 74 : 41026;
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

    public static int getStartLayoutForMedia(PollAttachedMedia pollAttachedMedia) {
        if (pollAttachedMedia instanceof PollAttachedMediaMusic) {
            return 3;
        }
        if (pollAttachedMedia instanceof PollAttachedMediaFile) {
            return 4;
        }
        if (pollAttachedMedia instanceof PollAttachedMediaSticker) {
            return ((PollAttachedMediaSticker) pollAttachedMedia).isEmoji ? 14 : 13;
        }
        if (pollAttachedMedia instanceof PollAttachedMediaLocation) {
            return 6;
        }
        return pollAttachedMedia instanceof PollAttachedMediaLink ? 15 : 1;
    }

    public void hideEmojiPopup(boolean z) {
        int i = 0;
        if (this.isPremium) {
            if (this.emojiViewVisible) {
                this.emojiView.scrollEmojiToTop();
                this.emojiView.closeSearch(false);
                if (z) {
                    this.emojiView.hideSearchKeyboard();
                }
                this.isEmojiSearchOpened = false;
                showEmojiPopup(0);
            }
            if (z) {
                EmojiView emojiView = this.emojiView;
                if (emojiView == null || emojiView.getVisibility() != 0) {
                    hideEmojiView();
                    return;
                }
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, this.emojiView.getMeasuredHeight());
                valueAnimatorOfFloat.addUpdateListener(new ChatAttachAlertPollLayout$$ExternalSyntheticLambda4(this, i));
                this.isAnimatePopupClosing = true;
                valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        ChatAttachAlertPollLayout.this.isAnimatePopupClosing = false;
                        ChatAttachAlertPollLayout.this.emojiView.setTranslationY(0.0f);
                        ChatAttachAlertPollLayout.this.hideEmojiView();
                    }
                });
                valueAnimatorOfFloat.setDuration(250L);
                valueAnimatorOfFloat.setInterpolator(AdjustPanLayoutHelper.keyboardInterpolator);
                valueAnimatorOfFloat.start();
            }
        }
    }

    public void lambda$animateEmojiViewTranslationY$12(float f, float f2, ValueAnimator valueAnimator) {
        this.emojiView.setTranslationY(AndroidUtilities.lerp(f, f2, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
    }

    public void lambda$checkDiscard$9(AlertDialog alertDialog, int i) {
        this.parentAlert.lambda$showGiftOfferSheet$15();
    }

    public void lambda$deletePollAnswerView$13(View view, PollEditTextCell pollEditTextCell, AlertDialog alertDialog, int i) {
        view.setTag(null);
        deletePollAnswerView(view, pollEditTextCell, false);
    }

    public void lambda$hideEmojiPopup$11(ValueAnimator valueAnimator) {
        this.emojiView.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public void lambda$new$0(int i, View view) {
        this.pollLimitDeadline = 0;
        this.pollLimitDuration = i;
        if (view instanceof TextCell) {
            checkDurationInfoRow((TextCell) view, true);
        } else {
            this.listAdapter.lambda$onBindViewHolder$31(this.poll2vLimitDurationTimeRow);
        }
    }

    public void lambda$new$1(View view, boolean z, int i, int i2) {
        if (z) {
            this.pollLimitDeadline = i;
            this.pollLimitDuration = 0;
            if (view instanceof TextCell) {
                checkDurationInfoRow((TextCell) view, true);
            } else {
                this.listAdapter.lambda$onBindViewHolder$31(this.poll2vLimitDurationTimeRow);
            }
        }
    }

    public static void lambda$new$2() {
    }

    public void lambda$new$3(Context context, View view, Theme.ResourcesProvider resourcesProvider) {
        AlertsCreator.createPollCloseDatePickerDialog(context, this.pollLimitDeadline, new AIEditorAlert$$ExternalSyntheticLambda34(22, this, view), new UndoView$$ExternalSyntheticLambda7(14), new AlertsCreator.ScheduleDatePickerColors(resourcesProvider), resourcesProvider);
    }

    public void lambda$new$4(Theme.ResourcesProvider resourcesProvider, ChatAttachAlert chatAttachAlert, Context context, View view, int i) {
        boolean z;
        boolean z2;
        if (i == this.poll2vLimitByCountryListRow) {
            CountrySelectBottomSheet countrySelectBottomSheet = new CountrySelectBottomSheet(getContext(), resourcesProvider);
            countrySelectBottomSheet.listener = new CountrySelectBottomSheet.Listener() {
                @Override
                public void onCountrySelected(List<String> list) {
                    ChatAttachAlertPollLayout.this.countriesList.clear();
                    ChatAttachAlertPollLayout.this.countriesList.addAll(list);
                    if (ChatAttachAlertPollLayout.this.poll2vLimitByCountryListRow >= 0) {
                        ChatAttachAlertPollLayout.this.listAdapter.lambda$onBindViewHolder$31(ChatAttachAlertPollLayout.this.poll2vLimitByCountryListRow);
                    }
                }
            };
            ArrayList<String> arrayList = this.countriesList;
            countrySelectBottomSheet.query = null;
            countrySelectBottomSheet.countriesToSelect = new HashSet(arrayList);
            countrySelectBottomSheet.show();
            return;
        }
        boolean z3 = false;
        if (i != this.poll2vLimitDurationTimeRow) {
            if (i == this.addAnswerRow) {
                addNewField();
                return;
            }
            boolean z4 = view instanceof TextCheckCell;
            if (z4 || (view instanceof PollCreateCheckCell)) {
                boolean z5 = this.quizPoll;
                SuggestEmojiView suggestEmojiView = this.suggestEmojiPanel;
                if (suggestEmojiView != null) {
                    suggestEmojiView.forceClose();
                }
                ToggleRow[] toggleRowArr = this.toggleRows;
                int length = toggleRowArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        z = false;
                        z2 = false;
                        break;
                    }
                    ToggleRow toggleRow = toggleRowArr[i2];
                    if (i == toggleRow.row) {
                        boolean z6 = toggleRow.checked;
                        z2 = !z6;
                        toggleRow.checked = z2;
                        if (i == this.poll2vLimitByCountryRow.row) {
                            this.listView.lambda$onCellEnter$52(this.itemAnimator);
                            this.poll2vLimitByCountryRow.setDivider(z2);
                            if (z6) {
                                this.poll2vLimitByCountryRow.removeRows(1);
                            } else {
                                this.poll2vLimitByCountryRow.addRows(1);
                            }
                            updateRows();
                        }
                        z = true;
                        break;
                    }
                    i2++;
                }
                if (z) {
                    z3 = z2;
                } else if (i == this.poll2vAnonymousRow) {
                    z3 = this.anonymousPoll;
                    this.anonymousPoll = !z3;
                    checkAllowAddingOptionsRow();
                } else {
                    int i3 = this.allowAddingRow;
                    if (i == i3) {
                        z3 = !this.allowAdding;
                        this.allowAdding = z3;
                    } else if (i == this.poll2vAllowAddingRow) {
                        if (!this.quizPoll && !this.anonymousPoll) {
                            this.allowAddingOptions = !this.allowAddingOptions;
                        }
                        z3 = this.allowAddingOptions;
                    } else if (i == this.poll2vShuffleRow) {
                        z3 = !this.shuffleOptions;
                        this.shuffleOptions = z3;
                    } else if (i == this.poll2vLimitDurationRow) {
                        if (this.pollLimitDuration == 0 && this.pollLimitDeadline == 0) {
                            this.pollLimitDuration = 86400;
                            this.pollLimitDeadline = 0;
                            int i4 = this.poll2vLimitDurationTimeRow;
                            updateRows();
                            if (i4 < 0) {
                                RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = this.listView.findViewHolderForAdapterPosition(this.poll2vLimitDurationRow);
                                if (viewHolderFindViewHolderForAdapterPosition != null) {
                                    View view2 = viewHolderFindViewHolderForAdapterPosition.itemView;
                                    if (view2 instanceof PollCreateCheckCell) {
                                        ((PollCreateCheckCell) view2).setDivider(true);
                                    }
                                }
                                this.listView.lambda$onCellEnter$52(this.itemAnimator);
                                this.listAdapter.notifyItemRangeInserted(this.poll2vLimitDurationTimeRow, 3);
                            }
                        } else {
                            this.pollLimitDuration = 0;
                            this.pollLimitDeadline = 0;
                            int i5 = this.poll2vLimitDurationTimeRow;
                            updateRows();
                            this.listView.lambda$onCellEnter$52(this.itemAnimator);
                            this.listAdapter.notifyItemRangeRemoved(i5, 3);
                            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition2 = this.listView.findViewHolderForAdapterPosition(this.poll2vLimitDurationRow);
                            if (viewHolderFindViewHolderForAdapterPosition2 != null) {
                                View view3 = viewHolderFindViewHolderForAdapterPosition2.itemView;
                                if (view3 instanceof PollCreateCheckCell) {
                                    ((PollCreateCheckCell) view3).setDivider(false);
                                }
                            }
                        }
                        if (this.pollLimitDuration != 0 || this.pollLimitDeadline != 0) {
                            z3 = true;
                        }
                    } else if (i == this.poll2vAllowRevotingRow) {
                        z3 = !this.allowRevoting;
                        this.allowRevoting = z3;
                    } else if (i == this.allowMarkingRow) {
                        z3 = !this.allowMarking;
                        this.allowMarking = z3;
                        updateRows();
                        int i6 = this.allowAddingRow;
                        if (i6 >= 0 && i3 < 0) {
                            this.listView.lambda$onCellEnter$52(this.itemAnimator);
                            this.listAdapter.notifyItemInserted(this.allowAddingRow);
                        } else if (i3 >= 0 && i6 < 0) {
                            this.listView.lambda$onCellEnter$52(this.itemAnimator);
                            this.listAdapter.notifyItemRemoved(i3);
                        }
                    } else {
                        if (i == this.poll2vMultipleRow) {
                            boolean z7 = this.multipleChoise;
                            z2 = !z7;
                            this.multipleChoise = z2;
                            if (z7 && this.quizPoll) {
                                int i7 = 0;
                                boolean z8 = false;
                                while (true) {
                                    boolean[] zArr = this.answersChecks;
                                    if (i7 >= zArr.length) {
                                        break;
                                    }
                                    if (z8) {
                                        zArr[i7] = false;
                                    } else if (zArr[i7]) {
                                        z8 = true;
                                    }
                                    i7++;
                                }
                            }
                            int childCount = this.listView.getChildCount();
                            for (int i8 = 0; i8 < childCount; i8++) {
                                RecyclerListView recyclerListView = this.listView;
                                RecyclerView.ViewHolder childViewHolder = recyclerListView.getChildViewHolder(recyclerListView.getChildAt(i8));
                                if (childViewHolder.getItemViewType() == 5) {
                                    ((PollEditTextCell) childViewHolder.itemView).setCheckboxMultiselect(this.multipleChoise, true);
                                }
                            }
                        } else if (i == this.poll2vLimitDurationHideResultsRow) {
                            z3 = !this.hideResults;
                            this.hideResults = z3;
                        } else if (i == this.poll2vQuizRow) {
                            if (this.quizOnly) {
                                return;
                            }
                            this.listView.lambda$onCellEnter$52(this.itemAnimator);
                            boolean z9 = !this.quizPoll;
                            this.quizPoll = z9;
                            int i9 = this.solutionRowHeader;
                            updateRows();
                            if (this.quizPoll) {
                                this.listAdapter.notifyItemRangeInserted(this.solutionRowHeader, 3);
                            } else {
                                this.listAdapter.notifyItemRangeRemoved(i9, 3);
                            }
                            this.listAdapter.lambda$onBindViewHolder$31(this.emptyRow);
                            if (this.quizPoll) {
                                this.allowRevoting = false;
                                int i10 = this.poll2vAllowRevotingRow;
                                if (i10 >= 0) {
                                    RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition3 = this.listView.findViewHolderForAdapterPosition(i10);
                                    if (viewHolderFindViewHolderForAdapterPosition3 != null) {
                                        ((PollCreateCheckCell) viewHolderFindViewHolderForAdapterPosition3.itemView).setChecked(false);
                                    } else {
                                        this.listAdapter.lambda$onBindViewHolder$31(this.poll2vAllowRevotingRow);
                                    }
                                }
                            } else {
                                int i11 = this.poll2vAllowRevotingRow;
                                if (i11 >= 0 && this.listView.findViewHolderForAdapterPosition(i11) == null) {
                                    this.listAdapter.lambda$onBindViewHolder$31(this.poll2vAllowRevotingRow);
                                }
                            }
                            checkAllowAddingOptionsRow();
                            if (this.quizPoll && !this.multipleChoise) {
                                int i12 = 0;
                                boolean z10 = false;
                                while (true) {
                                    boolean[] zArr2 = this.answersChecks;
                                    if (i12 >= zArr2.length) {
                                        break;
                                    }
                                    if (z10) {
                                        zArr2[i12] = false;
                                    } else if (zArr2[i12]) {
                                        z10 = true;
                                    }
                                    i12++;
                                }
                            }
                            z3 = z9;
                        }
                        z3 = z2;
                    }
                }
                if (this.hintShowed && !this.quizPoll) {
                    this.hintView.hide();
                }
                this.listView.getChildCount();
                for (int i13 = this.answerStartRow; i13 < this.answerStartRow + this.answersCount; i13++) {
                    RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition4 = this.listView.findViewHolderForAdapterPosition(i13);
                    if (viewHolderFindViewHolderForAdapterPosition4 != null) {
                        View view4 = viewHolderFindViewHolderForAdapterPosition4.itemView;
                        if (view4 instanceof PollEditTextCell) {
                            PollEditTextCell pollEditTextCell = (PollEditTextCell) view4;
                            pollEditTextCell.setShowCheckBox(this.quizPoll, true);
                            pollEditTextCell.setChecked(this.answersChecks[i13 - this.answerStartRow], z5);
                            if (pollEditTextCell.getTop() > AndroidUtilities.dp(40.0f) && i == this.poll2vQuizRow && !this.hintShowed) {
                                this.hintView.setText(LocaleController.getString(R.string.PollTapToSelect));
                                this.hintView.showForView(pollEditTextCell.getCheckBox(), true);
                                this.hintShowed = true;
                            }
                        }
                    }
                }
                if (z4) {
                    ((TextCheckCell) view).setChecked(z3);
                } else if (view instanceof PollCreateCheckCell) {
                    ((PollCreateCheckCell) view).setChecked(z3);
                }
                checkDoneButton();
                return;
            }
            return;
        }
        ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions(chatAttachAlert.container, resourcesProvider, view);
        int i14 = 0;
        while (true) {
            int[] iArr = this.POLL_DURATION_OPTIONS;
            if (i14 >= iArr.length) {
                itemOptionsMakeOptions.add(R.drawable.msg_customize, LocaleController.getString(R.string.PollV2PollDurationOptionCustom), new ShareAlert$$ExternalSyntheticLambda1(9, this, context, view, resourcesProvider));
                itemOptionsMakeOptions.setDrawScrim(false);
                itemOptionsMakeOptions.setDimAlpha(0);
                itemOptionsMakeOptions.show();
                return;
            }
            int i15 = iArr[i14];
            TimerDrawable ttlIcon = TimerDrawable.getTtlIcon(i15);
            ttlIcon.setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_actionBarDefaultSubmenuItemIcon), PorterDuff.Mode.SRC_IN));
            itemOptionsMakeOptions.add(ttlIcon, LocaleController.formatPluralString("Hours", i15 / 3600, new Object[0]), new SlotsDrawable$$ExternalSyntheticLambda9(this, i15, view, 13));
            i14++;
        }
    }

    public void lambda$onPollDoneButtonClick$7(TLRPC.TL_messageMediaPoll tL_messageMediaPoll, ArrayList arrayList, Long l, boolean z, int i, int i2) {
        this.delegate.sendPoll(tL_messageMediaPoll, this.descriptionString, this.attachedMedia, arrayList, z, i, l.longValue());
        this.parentAlert.dismiss(true);
    }

    public void lambda$onPollDoneButtonClick$8(ChatActivity chatActivity, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, ArrayList arrayList, Long l) {
        if (chatActivity.isInScheduleMode()) {
            AlertsCreator.createScheduleDatePickerDialog(chatActivity.getParentActivity(), chatActivity.getDialogId(), new AudioPlayerAlert$$ExternalSyntheticLambda2(this, tL_messageMediaPoll, arrayList, l));
        } else {
            this.delegate.sendPoll(tL_messageMediaPoll, this.descriptionString, this.attachedMedia, arrayList, true, 0, l.longValue());
            this.parentAlert.dismiss(true);
        }
    }

    public void lambda$onTodoDoneButtonClick$5(TLRPC.TL_messageMediaToDo tL_messageMediaToDo, Long l, boolean z, int i, int i2) {
        this.delegate.sendPoll(tL_messageMediaToDo, null, null, null, z, i, l.longValue());
        this.parentAlert.dismiss(true);
    }

    public void lambda$onTodoDoneButtonClick$6(ChatActivity chatActivity, TLRPC.TL_messageMediaToDo tL_messageMediaToDo, Long l) {
        if (chatActivity.isInScheduleMode()) {
            AlertsCreator.createScheduleDatePickerDialog(chatActivity.getParentActivity(), chatActivity.getDialogId(), new AlertsCreator$$ExternalSyntheticLambda201(this, tL_messageMediaToDo, l, 10));
        } else {
            this.delegate.sendPoll(tL_messageMediaToDo, null, null, null, true, 0, l.longValue());
            this.parentAlert.dismiss(true);
        }
    }

    public void lambda$openAttachMenuForOptions$24() {
        this.currentAttachAlertIndex = -1;
        this.currentAttachAlert = null;
    }

    public static Drawable lambda$openEditOrReplaceMenu$15(String str, String str2, View view) {
        return PollAttachedMediaFile.createMessagePreviewDrawable(view, str, str2, null, null);
    }

    public static Drawable lambda$openEditOrReplaceMenu$16(String str, String str2, PollAttachedMediaMusic pollAttachedMediaMusic, View view) {
        return PollAttachedMediaFile.createMessagePreviewDrawable(view, str, str2, pollAttachedMediaMusic.messageObject.getDocument(), pollAttachedMediaMusic.messageObject);
    }

    public void lambda$openEditOrReplaceMenu$17(int i, String str) {
        lambda$openAttachMenuForOptions$23(i, new PollAttachedMediaLink(str));
    }

    public void lambda$openEditOrReplaceMenu$18(int i) {
        lambda$openAttachMenuForOptions$23(i, null);
    }

    public static void lambda$openPollAttachMenu$21(Utilities.Callback callback, TLRPC.MessageMedia messageMedia, int i, boolean z, int i2, long j) {
        callback.run(new PollAttachedMediaLocation(messageMedia));
    }

    public static void lambda$openPollAttachMenu$22(Utilities.Callback callback, ChatAttachAlert chatAttachAlert, ArrayList arrayList, CharSequence charSequence, boolean z, int i, int i2, long j, boolean z2, long j2) {
        if (arrayList != null && !arrayList.isEmpty()) {
            callback.run(new PollAttachedMediaMusic((MessageObject) arrayList.get(0)));
        }
        chatAttachAlert.dismiss(true);
    }

    public void lambda$setAttachedMedia$25(PollAttachedMedia pollAttachedMedia, TLRPC.WebPage webPage, TLObject tLObject) {
        checkPollLinkMedia((PollAttachedMediaLink) pollAttachedMedia, true);
    }

    public void lambda$showEmojiPopup$10(ValueAnimator valueAnimator) {
        this.emojiView.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public void lambda$showOptionsForDrawable$20(int i) {
        lambda$openAttachMenuForOptions$23(i, null);
    }

    private int mediaIndexToAdapterPosition(int i) {
        if (i == -2) {
            return this.descriptionRow;
        }
        if (i == -3) {
            return this.solutionRow;
        }
        int i2 = this.answerStartRow;
        if (i2 < 0 || i < 0 || i >= this.answersCount) {
            return -1;
        }
        return i2 + i;
    }

    public void onCellFocusChanges(PollEditTextCell pollEditTextCell, boolean z) {
        if (this.isPremium && z) {
            if (this.currentCell == pollEditTextCell && this.emojiViewVisible && this.isEmojiSearchOpened) {
                collapseSearchEmojiView();
                this.emojiViewVisible = false;
            }
            PollEditTextCell pollEditTextCell2 = this.currentCell;
            this.currentCell = pollEditTextCell;
            pollEditTextCell.setEmojiButtonVisibility(true);
            ChatActivityEnterViewAnimatedIconView emojiButton = pollEditTextCell.getEmojiButton();
            ChatActivityEnterViewAnimatedIconView.State state = ChatActivityEnterViewAnimatedIconView.State.SMILE;
            emojiButton.setState(state, false);
            updateSuggestEmojiPanelDelegate(this.listView.findContainingViewHolder(pollEditTextCell));
            if (pollEditTextCell2 == null || pollEditTextCell2 == pollEditTextCell) {
                return;
            }
            if (this.emojiViewVisible) {
                collapseSearchEmojiView();
                hideEmojiPopup(false);
                openKeyboardInternal();
            }
            pollEditTextCell2.setEmojiButtonVisibility(false);
            pollEditTextCell2.getEmojiButton().setState(state, false);
        }
    }

    public void onEmojiClicked(PollEditTextCell pollEditTextCell) {
        this.currentCell = pollEditTextCell;
        if (!this.emojiViewVisible) {
            showEmojiPopup(1);
        } else {
            collapseSearchEmojiView();
            openKeyboardInternal();
        }
    }

    private void onPollDoneButtonClick() {
        if (this.quizPoll && !this.doneItemEnabled) {
            int i = 0;
            for (int i2 = 0; i2 < this.answersChecks.length; i2++) {
                if (!TextUtils.isEmpty(getFixedString(this.answers[i2])) && this.answersChecks[i2]) {
                    i++;
                }
            }
            if (i <= 0) {
                showQuizHint();
                return;
            }
            return;
        }
        int i3 = 0;
        while (true) {
            CharSequence[] charSequenceArr = this.answers;
            if (i3 >= charSequenceArr.length) {
                CharSequence[] charSequenceArr2 = {getFixedString(this.questionString)};
                ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(this.parentAlert.currentAccount).getEntities(charSequenceArr2, true);
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
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = new TLRPC.TL_messageMediaPoll();
                TLRPC.TL_poll tL_poll = new TLRPC.TL_poll();
                tL_messageMediaPoll.poll = tL_poll;
                tL_poll.multiple_choice = this.multipleChoise;
                tL_poll.quiz = this.quizPoll;
                tL_poll.public_voters = !this.anonymousPoll;
                tL_poll.open_answers = this.allowAddingOptions;
                tL_poll.revoting_disabled = !this.allowRevoting;
                tL_poll.shuffle_answers = this.shuffleOptions;
                tL_poll.subscribers_only = this.poll2vSubscribersOnlyRow.checked;
                if (this.poll2vLimitByCountryRow.checked && !this.countriesList.isEmpty()) {
                    TLRPC.Poll poll = tL_messageMediaPoll.poll;
                    poll.flags |= 4096;
                    poll.countries_iso2.addAll(this.countriesList);
                }
                TLRPC.Poll poll2 = tL_messageMediaPoll.poll;
                poll2.creator = true;
                int i5 = this.pollLimitDuration;
                if (i5 != 0) {
                    poll2.hide_results_until_close = this.hideResults;
                    poll2.close_period = i5;
                    poll2.flags |= 16;
                } else {
                    int i6 = this.pollLimitDeadline;
                    if (i6 != 0) {
                        poll2.hide_results_until_close = this.hideResults;
                        poll2.close_date = i6;
                        poll2.flags |= 32;
                    }
                }
                poll2.question = new TLRPC.TL_textWithEntities();
                tL_messageMediaPoll.poll.question.text = charSequence.toString();
                tL_messageMediaPoll.poll.question.entities = entities;
                ArrayList arrayList = new ArrayList(this.maxAnswersCount);
                int i7 = 0;
                while (true) {
                    CharSequence[] charSequenceArr3 = this.answers;
                    if (i7 >= charSequenceArr3.length) {
                        break;
                    }
                    if (TextUtils.isEmpty(getFixedString(charSequenceArr3[i7]))) {
                        this.attachedMedia.removeAnswerAndShift(tL_messageMediaPoll.poll.answers.size());
                    } else {
                        CharSequence[] charSequenceArr4 = {getFixedString(this.answers[i7])};
                        ArrayList<TLRPC.MessageEntity> entities2 = MediaDataController.getInstance(this.parentAlert.currentAccount).getEntities(charSequenceArr4, true);
                        CharSequence charSequence2 = charSequenceArr4[0];
                        if (entities2 != null) {
                            int size2 = entities2.size();
                            for (int i8 = 0; i8 < size2; i8++) {
                                TLRPC.MessageEntity messageEntity2 = entities2.get(i8);
                                if (messageEntity2.offset + messageEntity2.length > charSequence2.length()) {
                                    messageEntity2.length = charSequence2.length() - messageEntity2.offset;
                                }
                            }
                        }
                        TLRPC.TL_pollAnswer tL_pollAnswer = new TLRPC.TL_pollAnswer();
                        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
                        tL_pollAnswer.text = tL_textWithEntities;
                        tL_textWithEntities.text = charSequence2.toString();
                        tL_pollAnswer.text.entities = entities2;
                        tL_pollAnswer.option = new byte[]{(byte) (tL_messageMediaPoll.poll.answers.size() + 48)};
                        if ((this.multipleChoise || this.quizPoll) && this.answersChecks[i7]) {
                            arrayList.add(Integer.valueOf(tL_messageMediaPoll.poll.answers.size()));
                        }
                        tL_messageMediaPoll.poll.answers.add(tL_pollAnswer);
                    }
                    i7++;
                }
                tL_messageMediaPoll.results = new TLRPC.TL_pollResults();
                CharSequence fixedString = getFixedString(this.solutionString);
                if (fixedString != null) {
                    tL_messageMediaPoll.results.solution = fixedString.toString();
                    ArrayList<TLRPC.MessageEntity> entities3 = MediaDataController.getInstance(this.parentAlert.currentAccount).getEntities(new CharSequence[]{fixedString}, true);
                    if (entities3 != null && !entities3.isEmpty()) {
                        tL_messageMediaPoll.results.solution_entities = entities3;
                    }
                    if (!TextUtils.isEmpty(tL_messageMediaPoll.results.solution)) {
                        tL_messageMediaPoll.results.flags |= 16;
                    }
                }
                ChatAttachAlert chatAttachAlert = this.parentAlert;
                AlertsCreator.ensurePaidMessageConfirmation(chatAttachAlert.currentAccount, chatAttachAlert.getDialogId(), this.parentAlert.getAdditionalMessagesCount() + 1, new SharedMediaLayout$$ExternalSyntheticLambda15(5, this, (ChatActivity) chatAttachAlert.baseFragment, tL_messageMediaPoll, arrayList));
                return;
            }
            if (TextUtils.isEmpty(getFixedString(charSequenceArr[i3])) && ((PollAttachedMedia) this.attachedMedia.medias.get(i3)) != null) {
                this.smoothScrollToOption = true;
                this.showMediaHintIndexAfterSmoothScroll = i3;
                this.listView.smoothScrollToPosition(this.answerStartRow + i3);
                return;
            }
            i3++;
        }
    }

    private void onTodoDoneButtonClick() {
        CharSequence[] charSequenceArr = {getFixedString(this.questionString)};
        ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(this.parentAlert.currentAccount).getEntities(charSequenceArr, true);
        CharSequence charSequence = charSequenceArr[0];
        if (entities != null) {
            int size = entities.size();
            for (int i = 0; i < size; i++) {
                TLRPC.MessageEntity messageEntity = entities.get(i);
                if (messageEntity.offset + messageEntity.length > charSequence.length()) {
                    messageEntity.length = charSequence.length() - messageEntity.offset;
                }
            }
        }
        TLRPC.TL_messageMediaToDo tL_messageMediaToDo = new TLRPC.TL_messageMediaToDo();
        TLRPC.TodoList todoList = new TLRPC.TodoList();
        tL_messageMediaToDo.todo = todoList;
        boolean z = this.allowMarking;
        todoList.others_can_append = z && this.allowAdding;
        todoList.others_can_complete = z;
        todoList.title = new TLRPC.TL_textWithEntities();
        tL_messageMediaToDo.todo.title.text = charSequence.toString();
        tL_messageMediaToDo.todo.title.entities = entities;
        int i2 = 0;
        while (true) {
            CharSequence[] charSequenceArr2 = this.answers;
            if (i2 >= charSequenceArr2.length) {
                ChatAttachAlert chatAttachAlert = this.parentAlert;
                AlertsCreator.ensurePaidMessageConfirmation(chatAttachAlert.currentAccount, chatAttachAlert.getDialogId(), this.parentAlert.getAdditionalMessagesCount() + 1, new StickersDialogs$$ExternalSyntheticLambda12(this, (ChatActivity) chatAttachAlert.baseFragment, tL_messageMediaToDo, 3));
                return;
            }
            if (!TextUtils.isEmpty(getFixedString(charSequenceArr2[i2]))) {
                CharSequence[] charSequenceArr3 = {getFixedString(this.answers[i2])};
                ArrayList<TLRPC.MessageEntity> entities2 = MediaDataController.getInstance(this.parentAlert.currentAccount).getEntities(charSequenceArr3, true);
                CharSequence charSequence2 = charSequenceArr3[0];
                if (entities2 != null) {
                    int size2 = entities2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        TLRPC.MessageEntity messageEntity2 = entities2.get(i3);
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
            i2++;
        }
    }

    public void lambda$showOptionsForDrawable$19(int i) {
        this.currentAttachAlertIndex = i;
        this.currentAttachAlert = openPollAttachMenu(this.parentAlert.baseFragment, getStartLayoutForMedia((PollAttachedMedia) this.attachedMedia.medias.get(i)), getAllowedLayoutsForIndex(i), new ChatAttachAlertPollLayout$$ExternalSyntheticLambda11(this, i, 0), new GroupCallPip$$ExternalSyntheticLambda2(this, 3));
    }

    public void openAttachOrReplaceMenuForOptions(int i) {
        if (((PollAttachedMedia) this.attachedMedia.medias.get(i)) != null) {
            openEditOrReplaceMenu(i);
        } else {
            lambda$showOptionsForDrawable$19(i);
        }
    }

    private void openEditOrReplaceMenu(final int i) {
        ChatAttachAlert chatAttachAlert;
        BaseFragment baseFragment;
        PollAttachedMedia pollAttachedMedia = (PollAttachedMedia) this.attachedMedia.medias.get(i);
        if (pollAttachedMedia == null || (chatAttachAlert = this.parentAlert) == null || (baseFragment = chatAttachAlert.baseFragment) == null) {
            return;
        }
        Activity parentActivity = baseFragment.getParentActivity();
        if (pollAttachedMedia instanceof PollAttachedMediaGallery) {
            ArrayList<Object> arrayList = new ArrayList<>(1);
            arrayList.add(((PollAttachedMediaGallery) pollAttachedMedia).photoEntry);
            PhotoViewer.getInstance().setParentActivity(parentActivity);
            PhotoViewer.getInstance().openPhotoForSelect(arrayList, 0, 14, false, new PhotoViewer.EmptyPhotoViewerProvider() {
                private boolean openReplace;

                @Override
                public boolean allowCaption() {
                    return false;
                }

                @Override
                public void onClose() {
                    super.onClose();
                    if (this.openReplace) {
                        ChatAttachAlertPollLayout.this.lambda$showOptionsForDrawable$19(i);
                    }
                }

                @Override
                public void onPollAttachDelete() {
                    ChatAttachAlertPollLayout.this.lambda$openAttachMenuForOptions$23(i, null);
                }

                @Override
                public void onPollAttachReplace() {
                    this.openReplace = true;
                }
            }, null);
            return;
        }
        if (pollAttachedMedia instanceof PollAttachedMediaSticker) {
            PollAttachedMediaSticker pollAttachedMediaSticker = (PollAttachedMediaSticker) pollAttachedMedia;
            ContentPreviewViewer.getInstance().setParentActivity(parentActivity);
            ContentPreviewViewer.getInstance().setDelegate(new AnonymousClass13(i));
            ContentPreviewViewer contentPreviewViewer = ContentPreviewViewer.getInstance();
            TLRPC.Document document = pollAttachedMediaSticker.sticker;
            contentPreviewViewer.open(document, null, "", null, null, MessageObject.isAnimatedEmoji(document) ? 2 : 0, false, pollAttachedMediaSticker.parent, this.resourcesProvider, 200);
            return;
        }
        if (pollAttachedMedia instanceof PollAttachedMediaFile) {
            PollAttachedMediaFile pollAttachedMediaFile = (PollAttachedMediaFile) pollAttachedMedia;
            final String str = AndroidUtilities.formatFileSize(pollAttachedMediaFile.size, true, true) + " " + pollAttachedMediaFile.ext;
            final String str2 = pollAttachedMediaFile.name;
            showOptionsForDrawable(i, new Utilities.CallbackReturn() {
                @Override
                public final Object run(Object obj) {
                    return ChatAttachAlertPollLayout.lambda$openEditOrReplaceMenu$15(str2, str, (View) obj);
                }
            }, AndroidUtilities.dp(240.0f), AndroidUtilities.dp(60.0f));
            return;
        }
        if (pollAttachedMedia instanceof PollAttachedMediaMusic) {
            PollAttachedMediaMusic pollAttachedMediaMusic = (PollAttachedMediaMusic) pollAttachedMedia;
            TLRPC.Document document2 = pollAttachedMediaMusic.messageObject.getDocument();
            showOptionsForDrawable(i, new AIEditorAlert$$ExternalSyntheticLambda13(MessageObject.getMusicTitle(document2, true), MessageObject.getMusicAuthor(document2, true) + " - " + LocaleController.formatShortDuration((int) MessageObject.getDocumentDuration(document2)), pollAttachedMediaMusic, 1), AndroidUtilities.dp(240.0f), AndroidUtilities.dp(60.0f));
            return;
        }
        if (pollAttachedMedia instanceof PollAttachedMediaLocation) {
            showOptionsForDrawable(i, new RecyclerListView$$ExternalSyntheticLambda2((PollAttachedMediaLocation) pollAttachedMedia, 2), AndroidUtilities.dp(300.0f), (AndroidUtilities.dp(300.0f) * 9) / 16);
        } else if (!(pollAttachedMedia instanceof PollAttachedMediaLink)) {
            lambda$showOptionsForDrawable$19(i);
        } else {
            PollAttachedMediaLink pollAttachedMediaLink = (PollAttachedMediaLink) pollAttachedMedia;
            AlertsCreator.showAddLinkToPoll(getContext(), this.resourcesProvider, pollAttachedMediaLink.url, pollAttachedMediaLink.webPage, new ChatAttachAlertPollLayout$$ExternalSyntheticLambda11(this, i, 1), new ChatAttachAlertPollLayout$$ExternalSyntheticLambda21(this, i, 0));
        }
    }

    private void openKeyboardInternal() {
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
        AndroidUtilities.cancelRunOnUIThread(this.openKeyboardRunnable);
        AndroidUtilities.runOnUIThread(this.openKeyboardRunnable, 100L);
    }

    public static ChatAttachAlert openPollAttachMenu(final BaseFragment baseFragment, int i, int i2, final Utilities.Callback<PollAttachedMedia> callback, final Runnable runnable) {
        if (baseFragment == null) {
            return null;
        }
        boolean z = false;
        boolean z2 = false;
        final ChatAttachAlert chatAttachAlert = new ChatAttachAlert(baseFragment.getContext(), baseFragment, z, z2, true, baseFragment.getResourceProvider()) {
            @Override
            public void dismissInternal() {
                super.dismissInternal();
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }

            @Override
            public void setLastVisible(boolean z3) {
            }
        };
        chatAttachAlert.setDelegate(new AnonymousClass15(baseFragment, callback, chatAttachAlert));
        chatAttachAlert.setEmojiViewDelegate(new EmojiView.EmojiViewDelegate() {
            @Override
            public final boolean canAddCaptionToGif(TLRPC.Document document) {
                return EmojiView.EmojiViewDelegate.CC.$default$canAddCaptionToGif(this, document);
            }

            @Override
            public final boolean canSchedule() {
                return EmojiView.EmojiViewDelegate.CC.$default$canSchedule(this);
            }

            @Override
            public final long getDialogId() {
                return EmojiView.EmojiViewDelegate.CC.$default$getDialogId(this);
            }

            @Override
            public final float getProgressToSearchOpened() {
                return EmojiView.EmojiViewDelegate.CC.$default$getProgressToSearchOpened(this);
            }

            @Override
            public final int getThreadId() {
                return EmojiView.EmojiViewDelegate.CC.$default$getThreadId(this);
            }

            @Override
            public final void invalidateEnterView() {
                EmojiView.EmojiViewDelegate.CC.$default$invalidateEnterView(this);
            }

            @Override
            public final boolean isExpanded() {
                return EmojiView.EmojiViewDelegate.CC.$default$isExpanded(this);
            }

            @Override
            public final boolean isInScheduleMode() {
                return EmojiView.EmojiViewDelegate.CC.$default$isInScheduleMode(this);
            }

            @Override
            public final boolean isSearchOpened() {
                return EmojiView.EmojiViewDelegate.CC.$default$isSearchOpened(this);
            }

            @Override
            public final boolean isUserSelf() {
                return EmojiView.EmojiViewDelegate.CC.$default$isUserSelf(this);
            }

            @Override
            public final void onAnimatedEmojiUnlockClick() {
                EmojiView.EmojiViewDelegate.CC.$default$onAnimatedEmojiUnlockClick(this);
            }

            @Override
            public final boolean onBackspace() {
                return EmojiView.EmojiViewDelegate.CC.$default$onBackspace(this);
            }

            @Override
            public final void onClearEmojiRecent() {
                EmojiView.EmojiViewDelegate.CC.$default$onClearEmojiRecent(this);
            }

            @Override
            public void onCustomEmojiSelected(long j, TLRPC.Document document, String str, boolean z3) {
                callback.run(new PollAttachedMediaSticker(document, null));
                chatAttachAlert.dismiss(true);
            }

            @Override
            public final void onEmojiSelected(String str) {
                EmojiView.EmojiViewDelegate.CC.$default$onEmojiSelected(this, str);
            }

            @Override
            public final void onEmojiSettingsClick(ArrayList arrayList) {
                EmojiView.EmojiViewDelegate.CC.$default$onEmojiSettingsClick(this, arrayList);
            }

            @Override
            public final void onGifSelected(View view, Object obj, String str, Object obj2, boolean z3, int i3, int i4) {
                EmojiView.EmojiViewDelegate.CC.$default$onGifSelected(this, view, obj, str, obj2, z3, i3, i4);
            }

            @Override
            public final void onGifSelectedForAddCaption(View view, Object obj, String str, Object obj2, boolean z3, int i3, int i4) {
                EmojiView.EmojiViewDelegate.CC.$default$onGifSelectedForAddCaption(this, view, obj, str, obj2, z3, i3, i4);
            }

            @Override
            public final void onSearchOpenClose(int i3) {
                EmojiView.EmojiViewDelegate.CC.$default$onSearchOpenClose(this, i3);
            }

            @Override
            public final void onShowStickerSet(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z3) {
                EmojiView.EmojiViewDelegate.CC.$default$onShowStickerSet(this, stickerSet, inputStickerSet, z3);
            }

            @Override
            public void onStickerSelected(View view, TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z3, int i3, int i4) {
                callback.run(new PollAttachedMediaSticker(document, obj));
                chatAttachAlert.dismiss(true);
            }

            @Override
            public final void onStickerSetAdd(TLRPC.StickerSetCovered stickerSetCovered) {
                EmojiView.EmojiViewDelegate.CC.$default$onStickerSetAdd(this, stickerSetCovered);
            }

            @Override
            public final void onStickerSetRemove(TLRPC.StickerSetCovered stickerSetCovered) {
                EmojiView.EmojiViewDelegate.CC.$default$onStickerSetRemove(this, stickerSetCovered);
            }

            @Override
            public final void onStickersGroupClick(long j) {
                EmojiView.EmojiViewDelegate.CC.$default$onStickersGroupClick(this, j);
            }

            @Override
            public final void onStickersSettingsClick() {
                EmojiView.EmojiViewDelegate.CC.$default$onStickersSettingsClick(this);
            }

            @Override
            public final void onTabOpened(int i3) {
                EmojiView.EmojiViewDelegate.CC.$default$onTabOpened(this, i3);
            }

            @Override
            public final void showTrendingStickersAlert(TrendingStickersLayout trendingStickersLayout) {
                EmojiView.EmojiViewDelegate.CC.$default$showTrendingStickersAlert(this, trendingStickersLayout);
            }
        });
        chatAttachAlert.getPhotoLayout().loadGalleryPhotos();
        chatAttachAlert.setMaxSelectedPhotos(1, true);
        chatAttachAlert.enablePollAttachMode(i2);
        chatAttachAlert.setLocationActivityDelegate(new FolderBottomSheet$$ExternalSyntheticLambda6(callback));
        chatAttachAlert.setDocumentsDelegate(new ChatAttachAlertDocumentLayout.DocumentSelectActivityDelegate() {
            @Override
            public void didSelectFiles(ArrayList<String> arrayList, String str, ArrayList<TLRPC.MessageEntity> arrayList2, ArrayList<MessageObject> arrayList3, boolean z3, int i3, int i4, long j, boolean z4, long j2) {
                if (arrayList != null && !arrayList.isEmpty()) {
                    callback.run(new PollAttachedMediaFile(arrayList.get(0)));
                }
                chatAttachAlert.dismiss(true);
            }

            @Override
            public void didSelectPhotos(ArrayList<SendMessagesHelper.SendingMediaInfo> arrayList, boolean z3, int i3, int i4, long j) {
                if (arrayList != null && !arrayList.isEmpty()) {
                    callback.run(new PollAttachedMediaGallery(arrayList.get(0)));
                }
                chatAttachAlert.dismiss(true);
            }

            @Override
            public void startDocumentSelectActivity() {
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
                ChatAttachAlertDocumentLayout.DocumentSelectActivityDelegate.CC.$default$startMusicSelectActivity(this);
            }
        });
        chatAttachAlert.setAudioSelectDelegate(new ChatThemeBottomSheet$13$$ExternalSyntheticLambda0(callback, chatAttachAlert));
        chatAttachAlert.init();
        chatAttachAlert.setFocusable(true);
        chatAttachAlert.show();
        return chatAttachAlert;
    }

    private void resetSuggestEmojiPanel() {
        SuggestEmojiView suggestEmojiView = this.suggestEmojiPanel;
        if (suggestEmojiView != null) {
            suggestEmojiView.setDelegate(null);
            this.suggestEmojiPanel.forceClose();
        }
    }

    public void lambda$openAttachMenuForOptions$23(int i, PollAttachedMedia pollAttachedMedia) {
        if (pollAttachedMedia != null) {
            this.attachedMedia.medias.put(i, pollAttachedMedia);
        } else {
            this.attachedMedia.medias.remove(i);
        }
        int iMediaIndexToAdapterPosition = mediaIndexToAdapterPosition(i);
        if (iMediaIndexToAdapterPosition >= 0) {
            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = this.listView.findViewHolderForAdapterPosition(iMediaIndexToAdapterPosition);
            if (viewHolderFindViewHolderForAdapterPosition != null) {
                View view = viewHolderFindViewHolderForAdapterPosition.itemView;
                if (view instanceof PollEditTextCell) {
                    ((PollEditTextCell) view).attachView.setAttachedMedia(pollAttachedMedia, true);
                } else {
                    this.listAdapter.lambda$onBindViewHolder$31(iMediaIndexToAdapterPosition);
                }
            } else {
                this.listAdapter.lambda$onBindViewHolder$31(iMediaIndexToAdapterPosition);
            }
        }
        if (pollAttachedMedia instanceof PollAttachedMediaLink) {
            WebPageLoader webPageLoader = this.webPageLoader;
            PollAttachedMediaLink pollAttachedMediaLink = (PollAttachedMediaLink) pollAttachedMedia;
            String str = pollAttachedMediaLink.url;
            ScrimOptions$$ExternalSyntheticLambda2 scrimOptions$$ExternalSyntheticLambda2 = new ScrimOptions$$ExternalSyntheticLambda2(2, this, (PollAttachedMediaLink) pollAttachedMedia);
            HashMap map = webPageLoader.pages;
            if (map.containsKey(str)) {
                scrimOptions$$ExternalSyntheticLambda2.run((TLRPC.WebPage) map.get(str), null);
            } else {
                HashMap map2 = webPageLoader.callbacks;
                boolean zContainsKey = map2.containsKey(str);
                ArrayList arrayList = (ArrayList) map2.get(str);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    map2.put(str, arrayList);
                }
                arrayList.add(scrimOptions$$ExternalSyntheticLambda2);
                if (!zContainsKey) {
                    TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
                    getwebpagepreview.message = str;
                    ConnectionsManager.getInstance(webPageLoader.currentAccount).sendRequestTyped(getwebpagepreview, new AiTonesController$$ExternalSyntheticLambda0(), new BotBiometry$$ExternalSyntheticLambda10(3, webPageLoader, str));
                }
            }
            checkPollLinkMedia(pollAttachedMediaLink, false);
        }
        checkDoneButton();
    }

    public void setTextLeft(View view, int i) {
        int length;
        int i2;
        int length2;
        if (view instanceof PollEditTextCell) {
            PollEditTextCell pollEditTextCell = (PollEditTextCell) view;
            if (i == this.descriptionRow) {
                i2 = this.MAX_CAPTION_LENGTH;
                CharSequence charSequence = this.descriptionString;
                if (charSequence != null) {
                    length2 = charSequence.length();
                } else {
                    length2 = 0;
                }
                length = i2 - length2;
            } else if (i == this.questionRow) {
                i2 = this.todo ? getMessagesController().todoTitleLengthMax : 255;
                CharSequence charSequence2 = this.questionString;
                if (charSequence2 != null) {
                    length2 = charSequence2.length();
                } else {
                    length2 = 0;
                }
                length = i2 - length2;
            } else if (i == this.solutionRow) {
                CharSequence charSequence3 = this.solutionString;
                length = 200 - (charSequence3 != null ? charSequence3.length() : 0);
                i2 = 200;
            } else {
                int i3 = this.answerStartRow;
                if (i < i3 || i >= this.answersCount + i3) {
                    return;
                }
                int i4 = i - i3;
                int i5 = this.todo ? getMessagesController().todoItemLengthMax : 100;
                CharSequence charSequence4 = this.answers[i4];
                int i6 = i5;
                length = i5 - (charSequence4 != null ? charSequence4.length() : 0);
                i2 = i6;
            }
            float f = i2;
            if (length > f - (0.7f * f)) {
                pollEditTextCell.setText2("");
                return;
            }
            pollEditTextCell.setText2(String.format("%d", Integer.valueOf(length)));
            SimpleTextView textView2 = pollEditTextCell.getTextView2();
            int i7 = length < 0 ? Theme.key_text_RedRegular : Theme.key_windowBackgroundWhiteGrayText3;
            textView2.setTextColor(getThemedColor(i7));
            textView2.setTag(Integer.valueOf(i7));
        }
    }

    private void showEmojiPopup(int i) {
        ChatActivityEnterViewAnimatedIconView emojiButton;
        PollEditTextCell pollEditTextCell;
        int i2 = 1;
        if (this.isPremium) {
            if (i != 1) {
                PollEditTextCell pollEditTextCell2 = this.currentCell;
                emojiButton = pollEditTextCell2 != null ? pollEditTextCell2.getEmojiButton() : null;
                if (emojiButton != null) {
                    emojiButton.setState(ChatActivityEnterViewAnimatedIconView.State.SMILE, true);
                }
                EmojiView emojiView = this.emojiView;
                if (emojiView != null) {
                    this.emojiViewWasVisible = this.emojiViewVisible;
                    this.emojiViewVisible = false;
                    this.isEmojiSearchOpened = false;
                    if (AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                        emojiView.setVisibility(8);
                    }
                }
                if (i == 0) {
                    this.emojiPadding = 0;
                }
                this.keyboardNotifier.fire();
                this.parentAlert.sizeNotifierFrameLayout.requestLayout();
                return;
            }
            EmojiView emojiView2 = this.emojiView;
            boolean z = emojiView2 != null && emojiView2.getVisibility() == 0;
            createEmojiView();
            this.emojiView.setVisibility(0);
            this.emojiViewWasVisible = this.emojiViewVisible;
            this.emojiViewVisible = true;
            EmojiView emojiView3 = this.emojiView;
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
            int i3 = point.x > point.y ? this.keyboardHeightLand : this.keyboardHeight;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) emojiView3.getLayoutParams();
            layoutParams.height = AndroidUtilities.navigationBarHeight + i3;
            emojiView3.setLayoutParams(layoutParams);
            if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet() && (pollEditTextCell = this.currentCell) != null) {
                AndroidUtilities.hideKeyboard(pollEditTextCell.getEditField());
            }
            this.emojiPadding = i3;
            this.keyboardNotifier.fire();
            this.parentAlert.sizeNotifierFrameLayout.requestLayout();
            PollEditTextCell pollEditTextCell3 = this.currentCell;
            emojiButton = pollEditTextCell3 != null ? pollEditTextCell3.getEmojiButton() : null;
            if (emojiButton != null) {
                emojiButton.setState(ChatActivityEnterViewAnimatedIconView.State.KEYBOARD, true);
            }
            if (z || this.keyboardVisible) {
                return;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.emojiPadding, 0.0f);
            valueAnimatorOfFloat.addUpdateListener(new ChatAttachAlertPollLayout$$ExternalSyntheticLambda4(this, i2));
            valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    ChatAttachAlertPollLayout.this.emojiView.setTranslationY(0.0f);
                }
            });
            valueAnimatorOfFloat.setDuration(250L);
            valueAnimatorOfFloat.setInterpolator(AdjustPanLayoutHelper.keyboardInterpolator);
            valueAnimatorOfFloat.start();
        }
    }

    public void showMediaHint(int i) {
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = this.listView.findViewHolderForAdapterPosition(this.answerStartRow + i);
        if (viewHolderFindViewHolderForAdapterPosition != null) {
            View view = viewHolderFindViewHolderForAdapterPosition.itemView;
            if (view instanceof PollEditTextCell) {
                PollEditTextCell pollEditTextCell = (PollEditTextCell) view;
                if (pollEditTextCell.getTop() > AndroidUtilities.dp(40.0f)) {
                    SuggestEmojiView suggestEmojiView = this.suggestEmojiPanel;
                    if (suggestEmojiView != null) {
                        suggestEmojiView.forceClose();
                    }
                    this.hintView.setText(LocaleController.getString(R.string.PollAddTextOrRemoveMedia));
                    this.hintView.showForView(pollEditTextCell.getCheckBox(), true);
                    ImageView imageView = this.hintView.arrowImageView;
                    imageView.setTranslationX(imageView.getTranslationX() + AndroidUtilities.dp(48.0f));
                    HintView hintView = this.hintView;
                    hintView.setTranslationY(hintView.getTranslationY() + AndroidUtilities.dp(10.0f));
                }
            }
        }
    }

    private void showOptionsForDrawable(int i, Utilities.CallbackReturn<View, Drawable> callbackReturn, int i2, int i3) {
        ItemOptions itemOptionsAdd = ItemOptions.makeOptions(this, new View(getContext())).setDimAlpha(0).setDrawScrim(false).add(R.drawable.msg_replace, LocaleController.getString(R.string.ReplaceAttachedPollMedia), new ChatAttachAlertPollLayout$$ExternalSyntheticLambda21(this, i, 1)).add(R.drawable.msg_delete, (CharSequence) LocaleController.getString(R.string.Delete), true, (Runnable) new ChatAttachAlertPollLayout$$ExternalSyntheticLambda21(this, i, 2));
        ScrimOptions scrimOptions = new ScrimOptions(getContext(), this.resourcesProvider);
        itemOptionsAdd.setOnDismiss(new ChatActivity$$ExternalSyntheticLambda8(scrimOptions, 1));
        itemOptionsAdd.setMinWidth(AndroidUtilities.dp(185.0f));
        itemOptionsAdd.setupSelectors();
        scrimOptions.setItemOptions(itemOptionsAdd);
        scrimOptions.setScrimDrawable(callbackReturn.run(scrimOptions.getWindowView()), i2, i3);
        scrimOptions.setOptionsAtCenter();
        scrimOptions.show();
    }

    private void showQuizHint() {
        for (int i = this.answerStartRow; i < this.answerStartRow + this.answersCount; i++) {
            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = this.listView.findViewHolderForAdapterPosition(i);
            if (viewHolderFindViewHolderForAdapterPosition != null) {
                View view = viewHolderFindViewHolderForAdapterPosition.itemView;
                if (view instanceof PollEditTextCell) {
                    PollEditTextCell pollEditTextCell = (PollEditTextCell) view;
                    if (pollEditTextCell.getTop() > AndroidUtilities.dp(40.0f)) {
                        SuggestEmojiView suggestEmojiView = this.suggestEmojiPanel;
                        if (suggestEmojiView != null) {
                            suggestEmojiView.forceClose();
                        }
                        this.hintView.setText(LocaleController.getString(R.string.PollTapToSelect));
                        this.hintView.showForView(pollEditTextCell.getCheckBox(), true);
                        return;
                    }
                } else {
                    continue;
                }
            }
        }
    }

    public void updateRows() {
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
        this.poll2vSubscribersOnlyRow.row = -1;
        this.poll2vLimitByCountryRow.row = -1;
        this.poll2vLimitByCountryListRow = -1;
        this.allowAddingRow = -1;
        this.allowMarkingRow = -1;
        this.addAnswerRow = -1;
        this.answerStartRow = -1;
        this.settingsSectionRow = -1;
        this.descriptionRow = -1;
        this.paddingRow = 0;
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
            TLRPC.Chat currentChat = ((ChatActivity) this.parentAlert.baseFragment).getCurrentChat();
            boolean z2 = ChatObject.isChannel(currentChat) && !currentChat.megagroup;
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
                ToggleRow toggleRow = this.poll2vSubscribersOnlyRow;
                int i14 = i12 + 4;
                this.rowCount = i14;
                toggleRow.row = i13;
                ToggleRow toggleRow2 = this.poll2vLimitByCountryRow;
                int i15 = i12 + 5;
                this.rowCount = i15;
                toggleRow2.row = i14;
                if (toggleRow2.checked) {
                    this.rowCount = i12 + 6;
                    this.poll2vLimitByCountryListRow = i15;
                }
            }
            int i16 = this.rowCount;
            int i17 = i16 + 1;
            this.rowCount = i17;
            this.poll2vLimitDurationRow = i16;
            if (this.pollLimitDuration != 0 || this.pollLimitDeadline != 0) {
                this.poll2vLimitDurationTimeRow = i17;
                this.poll2vLimitDurationHideResultsRow = i16 + 2;
                this.rowCount = i16 + 4;
                this.poll2vLimitDurationHideResultsRowInfo = i16 + 3;
            }
            int i18 = this.rowCount;
            int i19 = i18 + 1;
            this.rowCount = i19;
            this.settingsSectionRow = i18;
            if (this.quizPoll) {
                this.solutionRowHeader = i19;
                this.solutionRow = i18 + 2;
                this.rowCount = i18 + 4;
                this.solutionInfoRow = i18 + 3;
            }
        }
        int i20 = this.rowCount;
        this.rowCount = i20 + 1;
        this.emptyRow = i20;
    }

    private void updateSuggestEmojiPanelDelegate(RecyclerView.ViewHolder viewHolder) {
        SuggestEmojiView suggestEmojiView = this.suggestEmojiPanel;
        if (suggestEmojiView != null) {
            suggestEmojiView.forceClose();
            SuggestEmojiView suggestEmojiView2 = this.suggestEmojiPanel;
            if (suggestEmojiView2 == null || viewHolder == null || !(viewHolder.itemView instanceof PollEditTextCell)) {
                return;
            }
            SuggestEmojiView.AnchorViewDelegate delegate = suggestEmojiView2.getDelegate();
            View view = viewHolder.itemView;
            if (delegate != view) {
                this.suggestEmojiPanel.setDelegate((PollEditTextCell) view);
            }
        }
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        TLRPC.WebPage webPage;
        if (i != NotificationCenter.didReceivedWebpagesInUpdates) {
            if (i == NotificationCenter.emojiLoaded) {
                EmojiView emojiView = this.emojiView;
                if (emojiView != null) {
                    emojiView.invalidateViews();
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
        int size = this.attachedMedia.medias.size();
        for (int i3 = 0; i3 < size; i3++) {
            PollAttachedMedia pollAttachedMedia = (PollAttachedMedia) this.attachedMedia.medias.get(i3);
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
        if (this.listView.getChildCount() <= 1 || (childAt = this.listView.getChildAt(1)) == null) {
            return Integer.MAX_VALUE;
        }
        RecyclerListView.Holder holder = (RecyclerListView.Holder) this.listView.findContainingViewHolder(childAt);
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
        arrayList.add(new ThemeDescription(this.listView, 16, new Class[]{EmptyView.class}, null, null, null, i2));
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

    @Override
    public boolean hasDoneItem() {
        return true;
    }

    public void hideEmojiView() {
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

    public boolean isAnimatePopupClosing() {
        return this.isAnimatePopupClosing;
    }

    @Override
    public boolean isDoneItemEnabled() {
        return this.doneItemEnabled;
    }

    public boolean isPopupShowing() {
        return this.emojiViewVisible;
    }

    public boolean isPopupVisible() {
        EmojiView emojiView = this.emojiView;
        return emojiView != null && emojiView.getVisibility() == 0;
    }

    public boolean isWaitingForKeyboardOpen() {
        return this.waitingForKeyboardOpen;
    }

    @Override
    public int needsActionBar() {
        return 1;
    }

    @Override
    public boolean onBackPressed() {
        if (this.emojiViewVisible) {
            hideEmojiPopup(true);
            return true;
        }
        if (checkDiscard()) {
            return super.onBackPressed();
        }
        return true;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        this.destroyed = true;
        NotificationCenter.getInstance(this.parentAlert.currentAccount).removeObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        if (this.isPremium) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
            EmojiView emojiView = this.emojiView;
            if (emojiView != null) {
                this.parentAlert.sizeNotifierFrameLayout.removeView(emojiView);
            }
        }
    }

    @Override
    public boolean onDismissWithTouchOutside() {
        if (checkDiscard()) {
            return super.onDismissWithTouchOutside();
        }
        return false;
    }

    @Override
    public void onHidden() {
        this.parentAlert.updateDoneItemEnabled();
    }

    @Override
    public void onHideShowProgress(float f) {
        this.parentAlert.updateDoneItemEnabled();
    }

    @Override
    public void onMenuItemClick(int i) {
        if (i == 40) {
            if (this.todo) {
                onTodoDoneButtonClick();
            } else {
                onPollDoneButtonClick();
            }
        }
    }

    @Override
    public void onPause() {
        super.onPause();
        ListAdapter listAdapter = this.listAdapter;
        if (listAdapter != null) {
            listAdapter.notifyDataSetChanged();
        }
        if (this.isPremium) {
            hideEmojiPopup(false);
            SuggestEmojiView suggestEmojiView = this.suggestEmojiPanel;
            if (suggestEmojiView != null) {
                suggestEmojiView.forceClose();
            }
            PollEditTextCell pollEditTextCell = this.currentCell;
            if (pollEditTextCell != null) {
                pollEditTextCell.setEmojiButtonVisibility(false);
                this.currentCell.getTextView().clearFocus();
                AndroidUtilities.hideKeyboard(this.currentCell.getEditField());
            }
        }
    }

    public void onPollAttachFilePicker(Intent intent) {
        Uri uri;
        if (this.currentAttachAlertIndex == -1 || this.currentAttachAlert == null) {
            return;
        }
        if (intent == null) {
            uri = null;
        } else if (intent.getData() != null) {
            uri = intent.getData();
        } else if (intent.getClipData() != null) {
            ClipData clipData = intent.getClipData();
            if (clipData.getItemCount() > 0) {
                uri = clipData.getItemAt(0).getUri();
            } else {
                uri = null;
            }
        } else {
            uri = null;
        }
        if (uri == null) {
            BulletinFactory.of(this.parentAlert.container, this.resourcesProvider).createErrorBulletin(LocaleController.getString(R.string.UnsupportedAttachment), this.resourcesProvider).show();
            return;
        }
        lambda$openAttachMenuForOptions$23(this.currentAttachAlertIndex, new PollAttachedMediaFile(uri));
        ChatAttachAlert chatAttachAlert = this.currentAttachAlert;
        if (chatAttachAlert != null) {
            chatAttachAlert.dismiss(true);
        }
    }

    @Override
    public void onPreMeasure(int i, int i2) {
        int iDp;
        int i3;
        if (this.parentAlert.sizeNotifierFrameLayout.measureKeyboardHeight() > AndroidUtilities.dp(20.0f) || this.emojiViewVisible || this.isAnimatePopupClosing || this.isEmojiSearchOpened) {
            iDp = AndroidUtilities.dp(52.0f);
            this.parentAlert.setAllowNestedScroll(false);
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
            this.parentAlert.setAllowNestedScroll(this.allowNesterScroll);
        }
        int i4 = iDp + AndroidUtilities.statusBarHeight;
        this.ignoreLayout = true;
        if (this.topPadding != i4 || this.listView.getPaddingBottom() != this.listPaddingBottom) {
            this.topPadding = i4;
            this.listView.setPaddingWithoutRequestLayout(0, 0, 0, this.listPaddingBottom);
            this.listView.lambda$onCellEnter$52(null);
            this.listAdapter.lambda$onBindViewHolder$31(this.paddingRow);
        }
        this.ignoreLayout = false;
    }

    @Override
    public void onShow(ChatAttachAlert.AttachAlertLayout attachAlertLayout) {
        try {
            this.parentAlert.actionBar.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        if (this.todo) {
            this.parentAlert.actionBar.setTitle(LocaleController.getString(R.string.TodoTitle));
        } else if (this.quizOnly) {
            this.parentAlert.actionBar.setTitle(LocaleController.getString(R.string.NewQuiz));
        } else {
            this.parentAlert.actionBar.setTitle(LocaleController.getString(R.string.NewPoll));
        }
        this.parentAlert.updateDoneItemEnabled();
        this.layoutManager.scrollToPositionWithOffset(0, 0);
    }

    @Override
    public void onSizeChanged(int i, boolean z) {
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
            if (this.emojiViewVisible) {
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
                    this.keyboardNotifier.fire();
                    this.parentAlert.sizeNotifierFrameLayout.requestLayout();
                    boolean z3 = this.wasEmojiSearchOpened;
                    if (z3 != this.isEmojiSearchOpened) {
                        animateEmojiViewTranslationY(z3 ? -AndroidUtilities.dp(120.0f) : AndroidUtilities.dp(120.0f), 0.0f);
                    }
                    this.wasEmojiSearchOpened = this.isEmojiSearchOpened;
                }
            }
            if (this.lastSizeChangeValue1 == i && this.lastSizeChangeValue2 == z) {
                return;
            }
            this.lastSizeChangeValue1 = i;
            this.lastSizeChangeValue2 = z;
            boolean z4 = this.keyboardVisible;
            PollEditTextCell pollEditTextCell = this.currentCell;
            if (pollEditTextCell != null) {
                this.keyboardVisible = pollEditTextCell.getEditField().isFocused() && this.keyboardNotifier.keyboardVisible() && i > 0;
            } else {
                this.keyboardVisible = false;
            }
            if (this.keyboardVisible && this.emojiViewVisible) {
                showEmojiPopup(0);
            }
            if (this.emojiPadding != 0 && !(z2 = this.keyboardVisible) && z2 != z4 && !this.emojiViewVisible) {
                this.emojiPadding = 0;
                this.keyboardNotifier.fire();
                this.parentAlert.sizeNotifierFrameLayout.requestLayout();
            }
            if (this.keyboardVisible && this.waitingForKeyboardOpen) {
                this.waitingForKeyboardOpen = false;
                AndroidUtilities.cancelRunOnUIThread(this.openKeyboardRunnable);
            }
        }
    }

    @Override
    public void requestLayout() {
        if (this.ignoreLayout) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public void scrollToTop() {
        this.listView.smoothScrollToPosition(1);
    }

    public void setDelegate(PollCreateActivityDelegate pollCreateActivityDelegate) {
        this.delegate = pollCreateActivityDelegate;
    }

    @Override
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        this.parentAlert.getSheetContainer().invalidate();
    }
}
