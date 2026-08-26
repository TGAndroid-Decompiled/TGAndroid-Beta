package org.telegram.ui.Components;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.CharacterStyle;
import android.text.style.ForegroundColorSpan;
import android.text.style.ReplacementSpan;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.internal.mlkit_vision_common.zzkg;
import java.util.ArrayList;
import me.vkryl.android.animator.FactorAnimator;
import org.telegram.messenger.AiTonesController$$ExternalSyntheticLambda0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.messenger.voip.VoIPService$$ExternalSyntheticOutline0;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Cells.PollEditTextCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Cells.TextSelectionHelper;
import org.telegram.ui.Components.chat.ChatActivityDraftMessageMeasureController;
import org.telegram.ui.GradientClip;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PinchToZoomHelper;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.Stories.recorder.PreviewView;

public class TagEditCell extends LinearLayout {
    private final AvatarDrawable avatarDrawable;
    private final BackupImageView avatarImageView;
    private final SizeNotifierFrameLayout chatView;
    private final ImageView clearImageView;
    private final int currentAccount;
    private final long dialogId;
    private final PollEditTextCell editTextCell;
    private boolean ignoreEdit;
    private boolean isAdmin;
    private boolean isOwner;
    private final AnimatedTextView limitTextView;
    private final ChatMessageCell messageCell;
    private MessageObject messageObject;
    private Utilities.Callback<String> onRankEdited;
    private final Theme.ResourcesProvider resourcesProvider;
    private float shakeDp;

    public static final class LineSpan extends ReplacementSpan {
        private final Paint paint;
        private final int width;

        public LineSpan(int i) {
            Paint paint = new Paint(1);
            this.paint = paint;
            this.width = i;
            paint.setColor(Theme.multAlpha(0.3f, Theme.getColor(null, Theme.key_chat_inTimeText, false)));
        }

        @Override
        public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
            float fDp = ((i3 + i5) / 2.0f) + AndroidUtilities.dp(1.33f);
            float fDp2 = AndroidUtilities.dp(6.66f);
            RectF rectF = AndroidUtilities.rectTmp;
            float f2 = fDp2 / 2.0f;
            rectF.set(f, fDp - f2, this.width + f, fDp + f2);
            canvas.drawRoundRect(rectF, f2, f2, this.paint);
        }

        @Override
        public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
            return this.width;
        }
    }

    public TagEditCell(Context context, int i, long j, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.shakeDp = -6.0f;
        this.currentAccount = i;
        this.dialogId = j;
        this.resourcesProvider = resourcesProvider;
        setOrientation(1);
        SizeNotifierFrameLayout sizeNotifierFrameLayout = new SizeNotifierFrameLayout(context) {
            @Override
            public Theme.ResourcesProvider getResourceProvider() {
                return TagEditCell.this.resourcesProvider;
            }

            @Override
            public boolean isActionBarVisible() {
                return false;
            }

            @Override
            public boolean isStatusBarVisible() {
                return false;
            }

            @Override
            public void onMeasure(int i2, int i3) {
                super.onMeasure(i2, i3);
                setMeasuredDimension(View.MeasureSpec.getSize(i2), TagEditCell.this.messageCell.getMeasuredHeight() + AndroidUtilities.dp(24.0f));
            }
        };
        this.chatView = sizeNotifierFrameLayout;
        sizeNotifierFrameLayout.setBackgroundImage(PreviewView.getBackgroundDrawable((Drawable) null, i, j, Theme.currentTheme.isDark()), false);
        ChatMessageCell chatMessageCell = new ChatMessageCell(context, i) {
            @Override
            public int getParentWidth() {
                int measuredWidth;
                int iDp;
                if (getMeasuredWidth() != 0) {
                    measuredWidth = getMeasuredWidth();
                    iDp = AndroidUtilities.dp(24.0f);
                } else {
                    measuredWidth = AndroidUtilities.displaySize.x;
                    iDp = AndroidUtilities.dp(24.0f);
                }
                return measuredWidth - iDp;
            }

            @Override
            public boolean isPressed() {
                return false;
            }

            @Override
            public void onFactorChangeFinished(int i2, float f, FactorAnimator factorAnimator) {
            }
        };
        this.messageCell = chatMessageCell;
        sizeNotifierFrameLayout.addView(chatMessageCell, LayoutHelper.createFrame(-1, -2.0f, 87, 0.0f, 12.0f, 0.0f, 12.0f));
        this.avatarDrawable = new AvatarDrawable();
        BackupImageView backupImageView = new BackupImageView(context);
        this.avatarImageView = backupImageView;
        backupImageView.setRoundRadius(AndroidUtilities.dp(21.0f));
        sizeNotifierFrameLayout.addView(backupImageView, LayoutHelper.createFrame(42, 42.0f, 83, 8.0f, 0.0f, 0.0f, 12.0f));
        addView(sizeNotifierFrameLayout, LayoutHelper.createLinear(-1, -2, 7));
        PollEditTextCell pollEditTextCell = new PollEditTextCell(context, 0, null, resourcesProvider);
        this.editTextCell = pollEditTextCell;
        final EditTextBoldCursor textView = pollEditTextCell.getTextView();
        textView.setEnabled(true);
        textView.setSingleLine(true);
        textView.setImeOptions(6);
        pollEditTextCell.setTextRight(114);
        ImageView imageView = new ImageView(context);
        this.clearImageView = imageView;
        imageView.setImageResource(R.drawable.menu_delete_old);
        imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText, resourcesProvider), PorterDuff.Mode.SRC_IN));
        pollEditTextCell.addView(imageView, LayoutHelper.createFrame(24, 24.0f, 21, 0.0f, 0.0f, 20.0f, 0.0f));
        ScaleStateListAnimator.apply(imageView);
        imageView.setOnClickListener(new SearchField$$ExternalSyntheticLambda0(textView, 16));
        AnimatedTextView animatedTextView = new AnimatedTextView(context, false, true, false);
        this.limitTextView = animatedTextView;
        animatedTextView.adaptWidth = false;
        animatedTextView.setTypeface(AndroidUtilities.bold());
        animatedTextView.setTextColor(Theme.getColor(Theme.key_text_RedBold, resourcesProvider));
        animatedTextView.setTextSize(AndroidUtilities.dp(14.0f));
        animatedTextView.setGravity(17);
        animatedTextView.setAllowCancel(true);
        animatedTextView.setScaleProperty(0.6f);
        pollEditTextCell.addView(animatedTextView, LayoutHelper.createFrame(56, 50.0f, 117, 0.0f, 0.0f, 44.0f, 0.0f));
        textView.addTextChangedListener(new TextWatcher() {
            @Override
            public void afterTextChanged(Editable editable) {
                if (TagEditCell.this.ignoreEdit) {
                    return;
                }
                String strTrim = editable.toString().trim();
                if (strTrim.length() > 16) {
                    TagEditCell.this.limitTextView.setText("-" + (strTrim.length() - 16));
                    strTrim = strTrim.substring(0, 16);
                } else {
                    TagEditCell.this.limitTextView.setText("");
                }
                if (TagEditCell.this.onRankEdited != null) {
                    TagEditCell.this.onRankEdited.run(strTrim);
                }
                if (TagEditCell.this.messageObject != null) {
                    TagEditCell.this.messageObject.forceUpdate = true;
                    TagEditCell.this.messageCell.setMessageObject(TagEditCell.this.messageObject, null, false, false, false);
                }
            }

            @Override
            public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            }
        });
        addView(pollEditTextCell, LayoutHelper.createLinear(-1, -2, 7));
        chatMessageCell.setDelegate(new ChatMessageCell.ChatMessageCellDelegate() {
            @Override
            public boolean allowAddPollOptions() {
                return false;
            }

            @Override
            public boolean canDrawOutboundsContent() {
                return true;
            }

            @Override
            public boolean canPerformActions() {
                return false;
            }

            @Override
            public boolean canPerformReply() {
                return canPerformActions();
            }

            @Override
            public boolean canSaveRichDocument(ChatMessageCell chatMessageCell2) {
                return false;
            }

            @Override
            public boolean canToggleRichMessageCheckbox(ChatMessageCell chatMessageCell2) {
                return false;
            }

            @Override
            public void didLongPress(ChatMessageCell chatMessageCell2, float f, float f2) {
            }

            @Override
            public void didLongPressBotButton(ChatMessageCell chatMessageCell2, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
            }

            @Override
            public boolean didLongPressChannelAvatar(ChatMessageCell chatMessageCell2, TLRPC.Chat chat, int i2, float f, float f2) {
                return false;
            }

            @Override
            public void didLongPressCustomBotButton(ChatMessageCell chatMessageCell2, BotInlineKeyboard.ButtonCustom buttonCustom) {
            }

            @Override
            public boolean didLongPressPollOption(ChatMessageCell chatMessageCell2, TLRPC.PollAnswer pollAnswer) {
                return false;
            }

            @Override
            public boolean didLongPressToDoButton(ChatMessageCell chatMessageCell2, TLRPC.TodoItem todoItem) {
                return false;
            }

            @Override
            public boolean didLongPressUserAvatar(ChatMessageCell chatMessageCell2, TLRPC.User user, float f, float f2) {
                return false;
            }

            @Override
            public void didPressAboutRevenueSharingAds() {
            }

            @Override
            public void didPressAddPollOptionButton(ChatMessageCell chatMessageCell2) {
            }

            @Override
            public void didPressAdmin(ChatMessageCell chatMessageCell2) {
            }

            @Override
            public boolean didPressAnimatedEmoji(ChatMessageCell chatMessageCell2, AnimatedEmojiSpan animatedEmojiSpan) {
                return false;
            }

            @Override
            public void didPressAppUpdateButton() {
            }

            @Override
            public void didPressBoostCounter(ChatMessageCell chatMessageCell2) {
            }

            @Override
            public void didPressBotButton(ChatMessageCell chatMessageCell2, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
            }

            @Override
            public void didPressCancelSendButton(ChatMessageCell chatMessageCell2) {
            }

            @Override
            public void didPressChannelAvatar(ChatMessageCell chatMessageCell2, TLRPC.Chat chat, int i2, float f, float f2, boolean z) {
            }

            @Override
            public void didPressChannelRecommendation(ChatMessageCell chatMessageCell2, TLObject tLObject, boolean z) {
            }

            @Override
            public void didPressChannelRecommendationsClose(ChatMessageCell chatMessageCell2) {
            }

            @Override
            public void didPressCodeCopy(ChatMessageCell chatMessageCell2, MessageObject.TextLayoutBlock textLayoutBlock) {
            }

            @Override
            public void didPressCommentButton(ChatMessageCell chatMessageCell2) {
            }

            @Override
            public void didPressCustomBotButton(ChatMessageCell chatMessageCell2, BotInlineKeyboard.ButtonCustom buttonCustom) {
            }

            public void didPressDialogButton(ChatMessageCell chatMessageCell2) {
            }

            @Override
            public void didPressEffect(ChatMessageCell chatMessageCell2) {
            }

            public void didPressEmojiStatus() {
            }

            @Override
            public void didPressExtendedMediaPreview(ChatMessageCell chatMessageCell2, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
            }

            @Override
            public void didPressFactCheck(ChatMessageCell chatMessageCell2) {
            }

            @Override
            public void didPressFactCheckWhat(ChatMessageCell chatMessageCell2, int i2, int i3) {
            }

            @Override
            public void didPressGiveawayChatButton(ChatMessageCell chatMessageCell2, int i2) {
            }

            @Override
            public void didPressGroupImage(ChatMessageCell chatMessageCell2, ImageReceiver imageReceiver, TLRPC.MessageExtendedMedia messageExtendedMedia, float f, float f2) {
            }

            @Override
            public void didPressHiddenForward(ChatMessageCell chatMessageCell2) {
            }

            @Override
            public void didPressHint(ChatMessageCell chatMessageCell2, int i2) {
            }

            @Override
            public void didPressImage(ChatMessageCell chatMessageCell2, float f, float f2, boolean z) {
            }

            @Override
            public void didPressInstantButton(ChatMessageCell chatMessageCell2, int i2) {
            }

            @Override
            public void didPressMoreChannelRecommendations(ChatMessageCell chatMessageCell2) {
            }

            @Override
            public void didPressOther(ChatMessageCell chatMessageCell2, float f, float f2) {
            }

            @Override
            public void didPressPollMedia(ChatMessageCell chatMessageCell2, ImageReceiver imageReceiver, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, float f, float f2, int i2) {
            }

            @Override
            public void didPressReaction(ChatMessageCell chatMessageCell2, TLRPC.ReactionCount reactionCount, boolean z, float f, float f2) {
            }

            @Override
            public void didPressReplyMessage(ChatMessageCell chatMessageCell2, int i2, float f, float f2, boolean z) {
            }

            @Override
            public void didPressRevealSensitiveContent(ChatMessageCell chatMessageCell2) {
            }

            @Override
            public void didPressRichDocumentOptions(ChatMessageCell chatMessageCell2, TLRPC.Document document, float f, float f2) {
            }

            @Override
            public void didPressShowMore(ChatMessageCell chatMessageCell2) {
            }

            @Override
            public void didPressSideButton(ChatMessageCell chatMessageCell2) {
            }

            @Override
            public void didPressSponsoredClose(ChatMessageCell chatMessageCell2) {
            }

            @Override
            public void didPressSponsoredInfo(ChatMessageCell chatMessageCell2, float f, float f2) {
            }

            @Override
            public void didPressSummarize(ChatMessageCell chatMessageCell2, boolean z) {
            }

            @Override
            public void didPressTime(ChatMessageCell chatMessageCell2) {
            }

            @Override
            public boolean didPressToDoButton(ChatMessageCell chatMessageCell2, TLRPC.TodoItem todoItem, boolean z) {
                return false;
            }

            public void didPressTopicButton(ChatMessageCell chatMessageCell2) {
            }

            @Override
            public void didPressUrl(ChatMessageCell chatMessageCell2, CharacterStyle characterStyle, boolean z) {
            }

            @Override
            public void didPressUserAvatar(ChatMessageCell chatMessageCell2, TLRPC.User user, float f, float f2, boolean z) {
            }

            @Override
            public void didPressUserStatus(ChatMessageCell chatMessageCell2, TLRPC.User user, TLRPC.Document document, String str) {
            }

            @Override
            public void didPressViaBot(ChatMessageCell chatMessageCell2, String str) {
            }

            @Override
            public void didPressViaBotNotInline(ChatMessageCell chatMessageCell2, long j2) {
            }

            @Override
            public void didPressVoteButtons(ChatMessageCell chatMessageCell2, ArrayList arrayList, int i2, int i3, int i4) {
            }

            @Override
            public void didPressWebPage(ChatMessageCell chatMessageCell2, TLRPC.WebPage webPage, String str, boolean z) {
                Browser.openUrl(chatMessageCell2.getContext(), str);
            }

            @Override
            public void didQuickShareEnd(ChatMessageCell chatMessageCell2, float f, float f2) {
            }

            @Override
            public void didQuickShareMove(ChatMessageCell chatMessageCell2, float f, float f2) {
            }

            @Override
            public void didQuickShareStart(ChatMessageCell chatMessageCell2, float f, float f2) {
            }

            @Override
            public void didStartVideoStream(MessageObject messageObject) {
            }

            @Override
            public void didTogglePollPreview(ChatMessageCell chatMessageCell2) {
            }

            @Override
            public void didToggleRichMessageCheckbox(ChatMessageCell chatMessageCell2, boolean z, Runnable runnable) {
            }

            @Override
            public boolean doNotShowLoadingReply(MessageObject messageObject) {
                return Theme.ResourcesProvider.CC.$default$doNotShowLoadingReply(messageObject);
            }

            @Override
            public void drawPollMode(Canvas canvas, ChatMessageCell chatMessageCell2) {
            }

            public boolean drawingVideoPlayerContainer() {
                return false;
            }

            @Override
            public void forceUpdate(ChatMessageCell chatMessageCell2, boolean z) {
            }

            @Override
            public void forceUpdateNoAnimation(ChatMessageCell chatMessageCell2, boolean z) {
            }

            @Override
            public int getAddPollOptionInputFieldHeight(ChatMessageCell chatMessageCell2) {
                return 0;
            }

            @Override
            public String getAdminRank(long j2) {
                String strTrim = textView.getText().toString().trim();
                if (strTrim.length() > 16) {
                    strTrim = strTrim.substring(0, 16);
                }
                if (TagEditCell.this.isAdmin || !TextUtils.isEmpty(strTrim)) {
                    return strTrim;
                }
                return null;
            }

            @Override
            public int getChatMode() {
                return 0;
            }

            @Override
            public ChatActivityDraftMessageMeasureController getDraftMessageMeasureController() {
                return null;
            }

            @Override
            public PinchToZoomHelper getPinchToZoomHelper() {
                return null;
            }

            @Override
            public String getProgressLoadingBotButtonUrl(ChatMessageCell chatMessageCell2) {
                return null;
            }

            @Override
            public CharacterStyle getProgressLoadingLink(ChatMessageCell chatMessageCell2) {
                return null;
            }

            @Override
            public TextSelectionHelper.ChatListTextSelectionHelper getTextSelectionHelper() {
                return null;
            }

            @Override
            public boolean hasSelectedMessages() {
                return false;
            }

            @Override
            public void invalidateBlur() {
            }

            @Override
            public boolean isAdmin(long j2) {
                return TagEditCell.this.isAdmin;
            }

            @Override
            public boolean isLandscape() {
                return false;
            }

            @Override
            public boolean isOwner(long j2) {
                return TagEditCell.this.isOwner;
            }

            @Override
            public boolean isProgressLoading(ChatMessageCell chatMessageCell2, int i2) {
                return false;
            }

            @Override
            public boolean isReplyOrSelf() {
                return false;
            }

            @Override
            public boolean keyboardIsOpened() {
                return false;
            }

            @Override
            public void needOpenWebView(MessageObject messageObject, String str, String str2, String str3, String str4, int i2, int i3) {
            }

            @Override
            public boolean needPlayMessage(ChatMessageCell chatMessageCell2, MessageObject messageObject, boolean z) {
                return false;
            }

            @Override
            public void needReloadPolls() {
            }

            @Override
            public void needShowPremiumBulletin(int i2) {
            }

            public void needShowPremiumFeatures(String str) {
            }

            @Override
            public boolean onAccessibilityAction(int i2, Bundle bundle) {
                return false;
            }

            @Override
            public void onDiceFinished() {
            }

            @Override
            public boolean openArticlePhoto(ChatMessageCell chatMessageCell2, TL_iv.PageBlock pageBlock) {
                return false;
            }

            @Override
            public void setShouldNotRepeatSticker(MessageObject messageObject) {
            }

            @Override
            public boolean shouldDrawThreadProgress(ChatMessageCell chatMessageCell2, boolean z) {
                return false;
            }

            @Override
            public boolean shouldRepeatSticker(MessageObject messageObject) {
                return true;
            }

            public boolean shouldShowDialogButton(ChatMessageCell chatMessageCell2) {
                return false;
            }

            public boolean shouldShowTopicButton(ChatMessageCell chatMessageCell2) {
                return false;
            }

            @Override
            public void videoTimerReached() {
            }

            @Override
            public void forceUpdate(ChatMessageCell chatMessageCell2, boolean z, boolean z2) {
                forceUpdate(chatMessageCell2, z);
            }
        });
    }

    public static void lambda$showInfoSheet$6(BottomSheet bottomSheet, boolean[] zArr, View view) {
        bottomSheet.lambda$showGiftOfferSheet$15();
        if (zArr[0]) {
            return;
        }
        MessagesController.getGlobalMainSettings().edit().putInt("showchattagsinfo", 0).apply();
        zArr[0] = true;
    }

    public static void lambda$showInfoSheet$7(BottomSheet bottomSheet, Context context, int i, long j, TLRPC.User user, String str, boolean z, boolean z2, Theme.ResourcesProvider resourcesProvider, boolean[] zArr, View view) {
        bottomSheet.lambda$showGiftOfferSheet$15();
        showSheet(context, i, j, user, str, z, z2, resourcesProvider);
        if (zArr[0]) {
            return;
        }
        MessagesController.getGlobalMainSettings().edit().putInt("showchattagsinfo", 0).apply();
        zArr[0] = true;
    }

    public static void lambda$showInfoSheet$8(boolean[] zArr) {
        if (zArr[0]) {
            return;
        }
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        globalMainSettings.edit().putInt("showchattagsinfo", globalMainSettings.getInt("showchattagsinfo", 3) - 1).apply();
        zArr[0] = true;
    }

    public static void lambda$showSheet$1(String[] strArr, ButtonWithCounterView buttonWithCounterView, boolean z, boolean z2, String str) {
        int i;
        strArr[0] = str;
        if (TextUtils.isEmpty(str) && !z && z2) {
            i = R.string.MemberTagButtonRemove;
        } else {
            i = z2 ? R.string.MemberTagButtonEdit : R.string.MemberTagButtonAdd;
        }
        buttonWithCounterView.setText(LocaleController.getString(i), true);
    }

    public static void lambda$showSheet$2(MessagesController messagesController, long j, TLRPC.User user, TLRPC.TL_messages_editChatParticipantRank tL_messages_editChatParticipantRank, BottomSheet bottomSheet, boolean z, Theme.ResourcesProvider resourcesProvider, ButtonWithCounterView buttonWithCounterView, TLRPC.Updates updates, TLRPC.TL_error tL_error) {
        if (updates == null) {
            if (tL_error != null) {
                BulletinFactory.of(bottomSheet.topBulletinContainer, resourcesProvider).showForError(tL_error);
                buttonWithCounterView.setLoading(false);
                return;
            }
            return;
        }
        messagesController.updateRank(-j, user.id, tL_messages_editChatParticipantRank.rank);
        messagesController.processUpdates(updates, false);
        bottomSheet.lambda$showGiftOfferSheet$15();
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (TextUtils.isEmpty(tL_messages_editChatParticipantRank.rank) || safeLastFragment == null) {
            return;
        }
        BulletinFactory.of(safeLastFragment).createSimpleBulletin(R.raw.contact_check, LocaleController.getString(z ? R.string.TagAdded : R.string.TagEdited), tL_messages_editChatParticipantRank.rank).wrapContent().show();
    }

    public static void lambda$showSheet$3(final ButtonWithCounterView buttonWithCounterView, TagEditCell tagEditCell, final MessagesController messagesController, final long j, final TLRPC.User user, String[] strArr, int i, final BottomSheet bottomSheet, final boolean z, final Theme.ResourcesProvider resourcesProvider, View view) {
        if (buttonWithCounterView.isLoading() || tagEditCell.isOverLimit()) {
            return;
        }
        buttonWithCounterView.setLoading(true);
        AndroidUtilities.hideKeyboard(tagEditCell.editTextCell);
        final TLRPC.TL_messages_editChatParticipantRank tL_messages_editChatParticipantRank = new TLRPC.TL_messages_editChatParticipantRank();
        tL_messages_editChatParticipantRank.peer = messagesController.getInputPeer(j);
        tL_messages_editChatParticipantRank.participant = MessagesController.getInputPeer(user);
        tL_messages_editChatParticipantRank.rank = strArr[0];
        ConnectionsManager.getInstance(i).sendRequestTyped(tL_messages_editChatParticipantRank, new AiTonesController$$ExternalSyntheticLambda0(), new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                MessagesController messagesController2 = messagesController;
                TLRPC.TL_messages_editChatParticipantRank tL_messages_editChatParticipantRank2 = tL_messages_editChatParticipantRank;
                ButtonWithCounterView buttonWithCounterView2 = buttonWithCounterView;
                TagEditCell.lambda$showSheet$2(messagesController2, j, user, tL_messages_editChatParticipantRank2, bottomSheet, z, resourcesProvider, buttonWithCounterView2, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
            }
        });
    }

    public static void lambda$showSheet$5(EditTextBoldCursor editTextBoldCursor) {
        editTextBoldCursor.requestFocus();
        editTextBoldCursor.setSelection(0, editTextBoldCursor.length());
        AndroidUtilities.showKeyboard(editTextBoldCursor);
    }

    public static void showInfoSheet(final Context context, final int i, final long j, final TLRPC.User user, final String str, final boolean z, final boolean z2, boolean z3, Theme.ResourcesProvider resourcesProvider) {
        int i2;
        int i3;
        final String string;
        int i4;
        LinearLayout linearLayout;
        int i5;
        BottomSheet bottomSheet;
        int i6;
        int i7 = i;
        long j2 = j;
        final Theme.ResourcesProvider resourcesProvider2 = resourcesProvider;
        TLRPC.Chat chat = MessagesController.getInstance(i7).getChat(Long.valueOf(-j2));
        if (chat == null) {
            return;
        }
        BottomSheet bottomSheetM = VoIPService$$ExternalSyntheticOutline0.m(context, true, false, resourcesProvider2);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        bottomSheetM.customView = linearLayout2;
        if (z2) {
            i2 = -6988581;
        } else {
            i2 = z ? -12539616 : -6905171;
        }
        BackupImageView backupImageView = new BackupImageView(context);
        backupImageView.setImageResource(R.drawable.large_user_tag);
        backupImageView.setBackground(Theme.createCircleDrawable(AndroidUtilities.dp(80.0f), i2));
        linearLayout2.addView(backupImageView, LayoutHelper.createLinear(80, 80, 49, 0, 18, 0, 0));
        int i8 = Theme.key_windowBackgroundWhiteBlackText;
        TextView textViewMakeTextView = TextHelper.makeTextView(context, 20.0f, i8, true);
        textViewMakeTextView.setGravity(17);
        if (z2) {
            i3 = R.string.TagInfoOwnerTitle;
        } else {
            i3 = z ? R.string.TagInfoAdminTitle : R.string.TagInfoMemberTitle;
        }
        textViewMakeTextView.setText(LocaleController.getString(i3));
        linearLayout2.addView(textViewMakeTextView, LayoutHelper.createFrame(-1, -2.0f, 49, 32.0f, 15.0f, 32.0f, 0.0f));
        TextView textViewMakeTextView2 = TextHelper.makeTextView(context, 14.0f, i8, false);
        textViewMakeTextView2.setGravity(17);
        textViewMakeTextView2.setLineSpacing(AndroidUtilities.dp(3.0f), 1.0f);
        if (str == null) {
            if (z2) {
                i6 = R.string.ChatTagOwner;
            } else if (z) {
                i6 = R.string.ChatTagAdmin;
            } else {
                string = "";
            }
            string = LocaleController.getString(i6);
        } else {
            string = str;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        if (z2 || z) {
            final int i9 = z2 ? -6988581 : -12539616;
            final Paint paint = new Paint(1);
            paint.setColor(Theme.multAlpha(0.1f, i9));
            spannableStringBuilder.setSpan(new ReplacementSpan() {
                private float textWidth;

                @Override
                public void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f, int i12, int i13, int i14, Paint paint2) {
                    float f2 = (i12 + i14) / 2.0f;
                    float fDp = AndroidUtilities.dp(19.0f);
                    paint2.setColor(i9);
                    float f3 = fDp / 2.0f;
                    canvas.drawRoundRect(f, f2 - f3, f + this.textWidth + AndroidUtilities.dp(11.33f), f2 + f3, f3, f3, paint);
                    canvas.drawText(string, AndroidUtilities.dpf2(5.66f) + f, i14 - AndroidUtilities.dp(6.0f), paint2);
                }

                @Override
                public int getSize(Paint paint2, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
                    float fDpf2 = AndroidUtilities.dpf2(11.33f);
                    float fMeasureText = paint2.measureText(string);
                    this.textWidth = fMeasureText;
                    return (int) (fDpf2 + fMeasureText);
                }
            }, 0, spannableStringBuilder.length(), 33);
        } else {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(Theme.getColor(null, Theme.key_chat_inTimeText, false)), 0, spannableStringBuilder.length(), 33);
        }
        if (z2) {
            i4 = R.string.TagInfoOwnerText;
        } else {
            i4 = z ? R.string.TagInfoAdminText : R.string.TagInfoMemberText;
        }
        textViewMakeTextView2.setText(AndroidUtilities.replaceCharSequence("un1", AndroidUtilities.replaceTags(LocaleController.formatString(i4, UserObject.getFirstName(user), chat.title)), spannableStringBuilder));
        linearLayout2.addView(textViewMakeTextView2, LayoutHelper.createFrame(-1, -2.0f, 49, 32.0f, 10.0f, 32.0f, 25.0f));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(0);
        linearLayout2.addView(linearLayout3, LayoutHelper.createLinear(-1, -2, 7, 16, 0, 16, 16));
        int i10 = 0;
        while (i10 < 2) {
            final ChatMessageCell chatMessageCell = new ChatMessageCell(context, i7) {
                @Override
                public int getParentWidth() {
                    return OKLCH.m$2(128.0f, AndroidUtilities.displaySize.x, 2);
                }

                @Override
                public boolean isPressed() {
                    return false;
                }

                @Override
                public void onFactorChangeFinished(int i11, float f, FactorAnimator factorAnimator) {
                }

                @Override
                public void updateTranslation() {
                }
            };
            final boolean z4 = i10 == 1;
            chatMessageCell.setDelegate(new ChatMessageCell.ChatMessageCellDelegate() {
                @Override
                public boolean allowAddPollOptions() {
                    return false;
                }

                @Override
                public boolean canDrawOutboundsContent() {
                    return true;
                }

                @Override
                public boolean canPerformActions() {
                    return false;
                }

                @Override
                public boolean canPerformReply() {
                    return canPerformActions();
                }

                @Override
                public boolean canSaveRichDocument(ChatMessageCell chatMessageCell2) {
                    return false;
                }

                @Override
                public boolean canToggleRichMessageCheckbox(ChatMessageCell chatMessageCell2) {
                    return false;
                }

                @Override
                public void didLongPress(ChatMessageCell chatMessageCell2, float f, float f2) {
                }

                @Override
                public void didLongPressBotButton(ChatMessageCell chatMessageCell2, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
                }

                @Override
                public boolean didLongPressChannelAvatar(ChatMessageCell chatMessageCell2, TLRPC.Chat chat2, int i11, float f, float f2) {
                    return false;
                }

                @Override
                public void didLongPressCustomBotButton(ChatMessageCell chatMessageCell2, BotInlineKeyboard.ButtonCustom buttonCustom) {
                }

                @Override
                public boolean didLongPressPollOption(ChatMessageCell chatMessageCell2, TLRPC.PollAnswer pollAnswer) {
                    return false;
                }

                @Override
                public boolean didLongPressToDoButton(ChatMessageCell chatMessageCell2, TLRPC.TodoItem todoItem) {
                    return false;
                }

                @Override
                public boolean didLongPressUserAvatar(ChatMessageCell chatMessageCell2, TLRPC.User user2, float f, float f2) {
                    return false;
                }

                @Override
                public void didPressAboutRevenueSharingAds() {
                }

                @Override
                public void didPressAddPollOptionButton(ChatMessageCell chatMessageCell2) {
                }

                @Override
                public void didPressAdmin(ChatMessageCell chatMessageCell2) {
                }

                @Override
                public boolean didPressAnimatedEmoji(ChatMessageCell chatMessageCell2, AnimatedEmojiSpan animatedEmojiSpan) {
                    return false;
                }

                @Override
                public void didPressAppUpdateButton() {
                }

                @Override
                public void didPressBoostCounter(ChatMessageCell chatMessageCell2) {
                }

                @Override
                public void didPressBotButton(ChatMessageCell chatMessageCell2, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
                }

                @Override
                public void didPressCancelSendButton(ChatMessageCell chatMessageCell2) {
                }

                @Override
                public void didPressChannelAvatar(ChatMessageCell chatMessageCell2, TLRPC.Chat chat2, int i11, float f, float f2, boolean z5) {
                }

                @Override
                public void didPressChannelRecommendation(ChatMessageCell chatMessageCell2, TLObject tLObject, boolean z5) {
                }

                @Override
                public void didPressChannelRecommendationsClose(ChatMessageCell chatMessageCell2) {
                }

                @Override
                public void didPressCodeCopy(ChatMessageCell chatMessageCell2, MessageObject.TextLayoutBlock textLayoutBlock) {
                }

                @Override
                public void didPressCommentButton(ChatMessageCell chatMessageCell2) {
                }

                @Override
                public void didPressCustomBotButton(ChatMessageCell chatMessageCell2, BotInlineKeyboard.ButtonCustom buttonCustom) {
                }

                public void didPressDialogButton(ChatMessageCell chatMessageCell2) {
                }

                @Override
                public void didPressEffect(ChatMessageCell chatMessageCell2) {
                }

                public void didPressEmojiStatus() {
                }

                @Override
                public void didPressExtendedMediaPreview(ChatMessageCell chatMessageCell2, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
                }

                @Override
                public void didPressFactCheck(ChatMessageCell chatMessageCell2) {
                }

                @Override
                public void didPressFactCheckWhat(ChatMessageCell chatMessageCell2, int i11, int i12) {
                }

                @Override
                public void didPressGiveawayChatButton(ChatMessageCell chatMessageCell2, int i11) {
                }

                @Override
                public void didPressGroupImage(ChatMessageCell chatMessageCell2, ImageReceiver imageReceiver, TLRPC.MessageExtendedMedia messageExtendedMedia, float f, float f2) {
                }

                @Override
                public void didPressHiddenForward(ChatMessageCell chatMessageCell2) {
                }

                @Override
                public void didPressHint(ChatMessageCell chatMessageCell2, int i11) {
                }

                @Override
                public void didPressImage(ChatMessageCell chatMessageCell2, float f, float f2, boolean z5) {
                }

                @Override
                public void didPressInstantButton(ChatMessageCell chatMessageCell2, int i11) {
                }

                @Override
                public void didPressMoreChannelRecommendations(ChatMessageCell chatMessageCell2) {
                }

                @Override
                public void didPressOther(ChatMessageCell chatMessageCell2, float f, float f2) {
                }

                @Override
                public void didPressPollMedia(ChatMessageCell chatMessageCell2, ImageReceiver imageReceiver, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, float f, float f2, int i11) {
                }

                @Override
                public void didPressReaction(ChatMessageCell chatMessageCell2, TLRPC.ReactionCount reactionCount, boolean z5, float f, float f2) {
                }

                @Override
                public void didPressReplyMessage(ChatMessageCell chatMessageCell2, int i11, float f, float f2, boolean z5) {
                }

                @Override
                public void didPressRevealSensitiveContent(ChatMessageCell chatMessageCell2) {
                }

                @Override
                public void didPressRichDocumentOptions(ChatMessageCell chatMessageCell2, TLRPC.Document document, float f, float f2) {
                }

                @Override
                public void didPressShowMore(ChatMessageCell chatMessageCell2) {
                }

                @Override
                public void didPressSideButton(ChatMessageCell chatMessageCell2) {
                }

                @Override
                public void didPressSponsoredClose(ChatMessageCell chatMessageCell2) {
                }

                @Override
                public void didPressSponsoredInfo(ChatMessageCell chatMessageCell2, float f, float f2) {
                }

                @Override
                public void didPressSummarize(ChatMessageCell chatMessageCell2, boolean z5) {
                }

                @Override
                public void didPressTime(ChatMessageCell chatMessageCell2) {
                }

                @Override
                public boolean didPressToDoButton(ChatMessageCell chatMessageCell2, TLRPC.TodoItem todoItem, boolean z5) {
                    return false;
                }

                public void didPressTopicButton(ChatMessageCell chatMessageCell2) {
                }

                @Override
                public void didPressUrl(ChatMessageCell chatMessageCell2, CharacterStyle characterStyle, boolean z5) {
                }

                @Override
                public void didPressUserAvatar(ChatMessageCell chatMessageCell2, TLRPC.User user2, float f, float f2, boolean z5) {
                }

                @Override
                public void didPressUserStatus(ChatMessageCell chatMessageCell2, TLRPC.User user2, TLRPC.Document document, String str2) {
                }

                @Override
                public void didPressViaBot(ChatMessageCell chatMessageCell2, String str2) {
                }

                @Override
                public void didPressViaBotNotInline(ChatMessageCell chatMessageCell2, long j3) {
                }

                @Override
                public void didPressVoteButtons(ChatMessageCell chatMessageCell2, ArrayList arrayList, int i11, int i12, int i13) {
                }

                @Override
                public void didPressWebPage(ChatMessageCell chatMessageCell2, TLRPC.WebPage webPage, String str2, boolean z5) {
                    Browser.openUrl(chatMessageCell2.getContext(), str2);
                }

                @Override
                public void didQuickShareEnd(ChatMessageCell chatMessageCell2, float f, float f2) {
                }

                @Override
                public void didQuickShareMove(ChatMessageCell chatMessageCell2, float f, float f2) {
                }

                @Override
                public void didQuickShareStart(ChatMessageCell chatMessageCell2, float f, float f2) {
                }

                @Override
                public void didStartVideoStream(MessageObject messageObject) {
                }

                @Override
                public void didTogglePollPreview(ChatMessageCell chatMessageCell2) {
                }

                @Override
                public void didToggleRichMessageCheckbox(ChatMessageCell chatMessageCell2, boolean z5, Runnable runnable) {
                }

                @Override
                public boolean doNotShowLoadingReply(MessageObject messageObject) {
                    return Theme.ResourcesProvider.CC.$default$doNotShowLoadingReply(messageObject);
                }

                @Override
                public void drawPollMode(Canvas canvas, ChatMessageCell chatMessageCell2) {
                }

                public boolean drawingVideoPlayerContainer() {
                    return false;
                }

                @Override
                public void forceUpdate(ChatMessageCell chatMessageCell2, boolean z5) {
                }

                @Override
                public void forceUpdateNoAnimation(ChatMessageCell chatMessageCell2, boolean z5) {
                }

                @Override
                public int getAddPollOptionInputFieldHeight(ChatMessageCell chatMessageCell2) {
                    return 0;
                }

                @Override
                public String getAdminRank(long j3) {
                    int i11;
                    if (z4) {
                        i11 = z2 ? R.string.TagInfoOwnerTitle : R.string.TagInfoAdminTitle;
                    } else {
                        i11 = R.string.TagInfoMemberTitle;
                    }
                    return LocaleController.getString(i11);
                }

                @Override
                public int getChatMode() {
                    return 0;
                }

                @Override
                public ChatActivityDraftMessageMeasureController getDraftMessageMeasureController() {
                    return null;
                }

                @Override
                public PinchToZoomHelper getPinchToZoomHelper() {
                    return null;
                }

                @Override
                public String getProgressLoadingBotButtonUrl(ChatMessageCell chatMessageCell2) {
                    return null;
                }

                @Override
                public CharacterStyle getProgressLoadingLink(ChatMessageCell chatMessageCell2) {
                    return null;
                }

                @Override
                public TextSelectionHelper.ChatListTextSelectionHelper getTextSelectionHelper() {
                    return null;
                }

                @Override
                public boolean hasSelectedMessages() {
                    return false;
                }

                @Override
                public void invalidateBlur() {
                }

                @Override
                public boolean isAdmin(long j3) {
                    return z4;
                }

                @Override
                public boolean isLandscape() {
                    return false;
                }

                @Override
                public boolean isOwner(long j3) {
                    return z4 && z2;
                }

                @Override
                public boolean isProgressLoading(ChatMessageCell chatMessageCell2, int i11) {
                    return false;
                }

                @Override
                public boolean isReplyOrSelf() {
                    return false;
                }

                @Override
                public boolean keyboardIsOpened() {
                    return false;
                }

                @Override
                public void needOpenWebView(MessageObject messageObject, String str2, String str3, String str4, String str5, int i11, int i12) {
                }

                @Override
                public boolean needPlayMessage(ChatMessageCell chatMessageCell2, MessageObject messageObject, boolean z5) {
                    return false;
                }

                @Override
                public void needReloadPolls() {
                }

                @Override
                public void needShowPremiumBulletin(int i11) {
                }

                public void needShowPremiumFeatures(String str2) {
                }

                @Override
                public boolean onAccessibilityAction(int i11, Bundle bundle) {
                    return false;
                }

                @Override
                public void onDiceFinished() {
                }

                @Override
                public boolean openArticlePhoto(ChatMessageCell chatMessageCell2, TL_iv.PageBlock pageBlock) {
                    return false;
                }

                @Override
                public void setShouldNotRepeatSticker(MessageObject messageObject) {
                }

                @Override
                public boolean shouldDrawThreadProgress(ChatMessageCell chatMessageCell2, boolean z5) {
                    return false;
                }

                @Override
                public boolean shouldRepeatSticker(MessageObject messageObject) {
                    return true;
                }

                public boolean shouldShowDialogButton(ChatMessageCell chatMessageCell2) {
                    return false;
                }

                public boolean shouldShowTopicButton(ChatMessageCell chatMessageCell2) {
                    return false;
                }

                @Override
                public void videoTimerReached() {
                }

                @Override
                public void forceUpdate(ChatMessageCell chatMessageCell2, boolean z5, boolean z6) {
                    forceUpdate(chatMessageCell2, z5);
                }
            });
            SizeNotifierFrameLayout sizeNotifierFrameLayout = new SizeNotifierFrameLayout(context) {
                private GradientClip clip = new GradientClip();

                @Override
                public boolean drawChild(Canvas canvas, View view, long j3) {
                    if (view != chatMessageCell) {
                        return super.drawChild(canvas, view, j3);
                    }
                    canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                    boolean zDrawChild = super.drawChild(canvas, view, j3);
                    canvas.save();
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, AndroidUtilities.dp(45.0f), getHeight());
                    this.clip.draw(canvas, rectF, 0, 1.0f);
                    canvas.restore();
                    canvas.restore();
                    return zDrawChild;
                }

                @Override
                public Theme.ResourcesProvider getResourceProvider() {
                    return resourcesProvider2;
                }

                @Override
                public boolean isActionBarVisible() {
                    return false;
                }

                @Override
                public boolean isStatusBarVisible() {
                    return false;
                }

                @Override
                public void onMeasure(int i11, int i12) {
                    super.onMeasure(i11, i12);
                    chatMessageCell.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, 1073741824), i12);
                    setMeasuredDimension(View.MeasureSpec.getSize(i11), chatMessageCell.getMeasuredHeight() + AndroidUtilities.dp(24.0f));
                }
            };
            sizeNotifierFrameLayout.setBackgroundImage(PreviewView.getBackgroundDrawable((Drawable) null, i7, j2, Theme.currentTheme.isDark()), false);
            sizeNotifierFrameLayout.addView(chatMessageCell, LayoutHelper.createFrame(-1, -2.0f, 87, 0.0f, 12.0f, 0.0f, 12.0f));
            linearLayout3.addView(sizeNotifierFrameLayout, LayoutHelper.createLinear(0, -1, 1.0f, 119, i10 == 1 ? 6 : 0, 0, i10 == 0 ? 6 : 0, 0));
            sizeNotifierFrameLayout.setClipToOutline(true);
            sizeNotifierFrameLayout.setOutlineProvider(new ViewOutlineProvider() {
                @Override
                public void getOutline(View view, Outline outline) {
                    outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), AndroidUtilities.dp(16.0f));
                }
            });
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            BottomSheet bottomSheet2 = bottomSheetM;
            LinearLayout linearLayout4 = linearLayout2;
            tL_message.from_id = MessagesController.getInstance(i7).getPeer(user.id);
            tL_message.peer_id = MessagesController.getInstance(i7).getPeer(j2);
            tL_message.message = "";
            tL_message.date = ConnectionsManager.getInstance(i7).getCurrentTime();
            tL_message.out = false;
            MessageObject messageObject = new MessageObject(i7, tL_message, true, false);
            messageObject.forceAvatar = true;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("_\n_  ");
            spannableStringBuilder2.setSpan(new LineSpan(AndroidUtilities.dp(200.0f)), 0, 1, 33);
            spannableStringBuilder2.setSpan(new LineSpan(AndroidUtilities.dp(160.0f)), 2, 3, 33);
            messageObject.messageText = spannableStringBuilder2;
            chatMessageCell.isChat = true;
            chatMessageCell.isMegagroup = ChatObject.isChannel(chat) && chat.megagroup;
            messageObject.generateLayout(null);
            chatMessageCell.setMessageObject(messageObject, null, false, false, false);
            chatMessageCell.setTranslationX(-AndroidUtilities.dp(140.0f));
            i10++;
            i7 = i;
            j2 = j;
            bottomSheetM = bottomSheet2;
            linearLayout2 = linearLayout4;
        }
        final BottomSheet bottomSheet3 = bottomSheetM;
        LinearLayout linearLayout5 = linearLayout2;
        ButtonWithCounterView buttonWithCounterViewM = zzkg.m(context, resourcesProvider2, true);
        boolean z5 = (ChatObject.canManageTags(chat) && (!z || ((!z2 && z3) || UserObject.isUserSelf(user)))) || (ChatObject.canManageMyTag(chat) && UserObject.isUserSelf(user));
        if (z5 || ChatObject.canManageTags(chat) || chat.creator || chat.admin_rights != null || z2) {
            linearLayout = linearLayout5;
        } else {
            TextView textViewMakeTextView3 = TextHelper.makeTextView(context, 12.0f, Theme.key_windowBackgroundWhiteGrayText, false);
            textViewMakeTextView3.setGravity(1);
            textViewMakeTextView3.setText(LocaleController.getString(R.string.CantEditTagAdmins));
            linearLayout = linearLayout5;
            linearLayout.addView(textViewMakeTextView3, LayoutHelper.createLinear(-1, -2, 32.0f, 0.0f, 32.0f, 0.0f));
        }
        linearLayout.addView(buttonWithCounterViewM, LayoutHelper.createLinear(-1, 48, 7, 16, 16, 16, 16));
        final boolean[] zArr = new boolean[1];
        if (z5) {
            if (UserObject.isUserSelf(user)) {
                i5 = TextUtils.isEmpty(str) ? R.string.TagInfoButtonAddMyTag : R.string.TagInfoButtonEditMyTag;
            } else {
                i5 = TextUtils.isEmpty(str) ? R.string.TagInfoButtonAddTag : R.string.TagInfoButtonEditTag;
            }
            buttonWithCounterViewM.setText(LocaleController.getString(i5));
            View.OnClickListener onClickListener = new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    boolean[] zArr2 = zArr;
                    TagEditCell.lambda$showInfoSheet$7(bottomSheet3, context, i, j, user, str, z, z2, resourcesProvider2, zArr2, view);
                }
            };
            bottomSheet = bottomSheet3;
            resourcesProvider2 = resourcesProvider2;
            buttonWithCounterViewM.setOnClickListener(onClickListener);
        } else {
            buttonWithCounterViewM.setText(StarGiftSheet.replaceUnderstood(LocaleController.getString(R.string.Understood)));
            buttonWithCounterViewM.setOnClickListener(new UndoView$$ExternalSyntheticLambda6(8, bottomSheet3, zArr));
            bottomSheet = bottomSheet3;
        }
        bottomSheet.smoothKeyboardAnimationEnabled = true;
        bottomSheet.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider2));
        bottomSheet.setOnDismissListener(new Tooltip$$ExternalSyntheticLambda0(zArr, 21));
        if (MessagesController.getGlobalMainSettings().getInt("showchattagsinfo", 3) > 0 || !z5) {
            bottomSheet.show();
        } else {
            showSheet(context, i, j, user, str, z, z2, resourcesProvider2);
        }
    }

    public static void showSheet(Context context, int i, long j, TLRPC.User user, String str, final boolean z, boolean z2, Theme.ResourcesProvider resourcesProvider) {
        int i2;
        MessagesController messagesController = MessagesController.getInstance(i);
        messagesController.getChat(Long.valueOf(-j));
        int i3 = 0;
        BottomSheet bottomSheetM = VoIPService$$ExternalSyntheticOutline0.m(context, true, false, resourcesProvider);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        bottomSheetM.customView = linearLayout;
        LinearLayout linearLayout2 = new LinearLayout(context);
        int i4 = Theme.key_windowBackgroundWhiteBlackText;
        TextView textViewMakeTextView = TextHelper.makeTextView(context, 20.0f, i4, true);
        textViewMakeTextView.setText(LocaleController.getString(R.string.MemberTagTitle));
        linearLayout2.addView(textViewMakeTextView, LayoutHelper.createLinear(0, -2, 1.0f, 19, 22, 0, 22, 0));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i4, resourcesProvider), PorterDuff.Mode.SRC_IN));
        imageView.setBackground(Theme.createSelectorDrawable(Theme.getColor(Theme.key_listSelector, resourcesProvider), 1, AndroidUtilities.dp(18.0f)));
        linearLayout2.addView(imageView, LayoutHelper.createLinear(32, 32, 21, 0, 0, 10, 0));
        linearLayout.addView(linearLayout2, LayoutHelper.createLinear(-1, -2, 0.0f, 6.0f, 0.0f, 6.0f));
        final ButtonWithCounterView buttonWithCounterViewM = zzkg.m(context, resourcesProvider, true);
        final boolean z3 = !TextUtils.isEmpty(str) || z;
        if (TextUtils.isEmpty(str) && !z && z3) {
            i2 = R.string.MemberTagButtonRemove;
        } else {
            i2 = z3 ? R.string.MemberTagButtonEdit : R.string.MemberTagButtonAdd;
        }
        buttonWithCounterViewM.setText(LocaleController.getString(i2));
        final String[] strArr = {str == null ? "" : str};
        TagEditCell tagEditCell = new TagEditCell(context, i, j, resourcesProvider);
        tagEditCell.setClipToOutline(true);
        tagEditCell.setOutlineProvider(new ViewOutlineProvider() {
            @Override
            public void getOutline(View view, Outline outline) {
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), AndroidUtilities.dp(16.0f));
            }
        });
        tagEditCell.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider));
        tagEditCell.set(user, str, z, z2, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                TagEditCell.lambda$showSheet$1(strArr, buttonWithCounterViewM, z, z3, (String) obj);
            }
        });
        linearLayout.addView(tagEditCell, LayoutHelper.createLinear(-1, -2, 7, 12.0f, 12.0f, 12.0f, 1.66f));
        TextInfoPrivacyCell textInfoPrivacyCell = new TextInfoPrivacyCell(context, 22, resourcesProvider);
        textInfoPrivacyCell.setText(UserObject.isUserSelf(user) ? LocaleController.getString(R.string.MemberTagSelfInfo) : LocaleController.formatString(R.string.MemberTagTheirInfo, UserObject.getUserName(user)));
        linearLayout.addView(textInfoPrivacyCell, LayoutHelper.createLinear(-1, -2, 7, 0, 0, 0, 0));
        linearLayout.addView(buttonWithCounterViewM, LayoutHelper.createLinear(-1, 48, 7, 14, 19, 14, 12));
        bottomSheetM.smoothKeyboardAnimationEnabled = true;
        bottomSheetM.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundGray, resourcesProvider));
        buttonWithCounterViewM.setOnClickListener(new TagEditCell$$ExternalSyntheticLambda1(buttonWithCounterViewM, tagEditCell, messagesController, j, user, strArr, i, bottomSheetM, (!TextUtils.isEmpty(str) || z || z2) ? false : true, resourcesProvider));
        imageView.setOnClickListener(new TagEditCell$$ExternalSyntheticLambda2(bottomSheetM, i3));
        bottomSheetM.show();
        EditTextBoldCursor textView = tagEditCell.editTextCell.getTextView();
        textView.post(new TagEditCell$$ExternalSyntheticLambda3(i3, textView));
    }

    public boolean isOverLimit() {
        EditTextBoldCursor textView = this.editTextCell.getTextView();
        if (textView.getText().toString().trim().length() <= 16) {
            return false;
        }
        float f = -this.shakeDp;
        this.shakeDp = f;
        AndroidUtilities.shakeViewSpring(textView, f);
        BotWebViewVibrationEffect.APP_ERROR.vibrate();
        return true;
    }

    public void set(TLRPC.User user, String str, boolean z, boolean z2, Utilities.Callback<String> callback) {
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.from_id = MessagesController.getInstance(this.currentAccount).getPeer(user.id);
        tL_message.peer_id = MessagesController.getInstance(this.currentAccount).getPeer(this.dialogId);
        tL_message.message = "";
        tL_message.date = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
        tL_message.out = false;
        this.isAdmin = z;
        this.isOwner = z2;
        MessageObject messageObject = new MessageObject(this.currentAccount, tL_message, true, false);
        this.messageObject = messageObject;
        messageObject.forceAvatar = true;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("_\n_  ");
        spannableStringBuilder.setSpan(new LineSpan((int) Math.min(AndroidUtilities.displaySize.x * 0.5f, AndroidUtilities.dp(200.0f))), 0, 1, 33);
        spannableStringBuilder.setSpan(new LineSpan((int) Math.min(AndroidUtilities.displaySize.x * 0.44f, AndroidUtilities.dp(160.0f))), 2, 3, 33);
        this.messageObject.messageText = spannableStringBuilder;
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.dialogId));
        ChatMessageCell chatMessageCell = this.messageCell;
        chatMessageCell.isChat = chat != null;
        chatMessageCell.isMegagroup = ChatObject.isChannel(chat) && chat.megagroup;
        this.messageObject.generateLayout(null);
        this.messageCell.setMessageObject(this.messageObject, null, false, false, false);
        this.avatarDrawable.setInfo(user);
        this.avatarImageView.setForUserOrChat(user, this.avatarDrawable);
        this.onRankEdited = callback;
        this.ignoreEdit = true;
        this.editTextCell.setTextAndHint(str, LocaleController.getString((!TextUtils.isEmpty(str) || z) ? R.string.MemberTagHintEdit : R.string.MemberTagHintAdd), false);
        this.ignoreEdit = false;
    }
}
