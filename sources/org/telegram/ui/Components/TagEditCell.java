package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
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
import com.google.android.gms.internal.mlkit_vision_common.zzlp;
import com.google.zxing.BinaryBitmap;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLoader$$ExternalSyntheticLambda1;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService$$ExternalSyntheticOutline0;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Cells.PollEditTextCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Cells.TextSelectionHelper;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda422;
import org.telegram.ui.Components.chat.ChatActivityDraftMessageMeasureController;
import org.telegram.ui.ContactAddActivity$$ExternalSyntheticLambda8;
import org.telegram.ui.GradientClip;
import org.telegram.ui.GroupCallSheet$$ExternalSyntheticLambda5;
import org.telegram.ui.PeerColorActivity;
import org.telegram.ui.PinchToZoomHelper;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.Stories.recorder.PreviewView;
import org.telegram.ui.web.WebInstantView$$ExternalSyntheticLambda1;

public final class TagEditCell extends LinearLayout {
    public final AvatarDrawable avatarDrawable;
    public final BackupImageView avatarImageView;
    public final int currentAccount;
    public final long dialogId;
    public final PollEditTextCell editTextCell;
    public boolean ignoreEdit;
    public boolean isAdmin;
    public boolean isOwner;
    public final AnimatedTextView limitTextView;
    public final AnonymousClass2 messageCell;
    public MessageObject messageObject;
    public Utilities.Callback onRankEdited;
    public final Theme.ResourcesProvider resourcesProvider;
    public float shakeDp;

    public final class AnonymousClass10 extends ViewOutlineProvider {
        @Override
        public final void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), AndroidUtilities.dp(16.0f));
        }
    }

    public final class AnonymousClass2 extends ChatMessageCell {
        @Override
        public final int getParentWidth() {
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
        public final boolean isPressed() {
            return false;
        }
    }

    public final class AnonymousClass5 extends ViewOutlineProvider {
        @Override
        public final void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), AndroidUtilities.dp(16.0f));
        }
    }

    public final class AnonymousClass7 extends ChatMessageCell {
        @Override
        public final int getParentWidth() {
            return OKLCH.m$2(128.0f, AndroidUtilities.displaySize.x, 2);
        }

        @Override
        public final boolean isPressed() {
            return false;
        }

        @Override
        public final void updateTranslation() {
        }
    }

    public TagEditCell(int i, long j, Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.shakeDp = -6.0f;
        this.currentAccount = i;
        this.dialogId = j;
        this.resourcesProvider = resourcesProvider;
        setOrientation(1);
        SizeNotifierFrameLayout sizeNotifierFrameLayout = new SizeNotifierFrameLayout(context) {
            @Override
            public final Theme.ResourcesProvider getResourceProvider() {
                return TagEditCell.this.resourcesProvider;
            }

            @Override
            public final boolean isActionBarVisible() {
                return false;
            }

            @Override
            public final boolean isStatusBarVisible$1() {
                return false;
            }

            @Override
            public final void onMeasure(int i2, int i3) {
                super.onMeasure(i2, i3);
                setMeasuredDimension(View.MeasureSpec.getSize(i2), TagEditCell.this.messageCell.getMeasuredHeight() + AndroidUtilities.dp(24.0f));
            }
        };
        sizeNotifierFrameLayout.setBackgroundImage(PreviewView.getBackgroundDrawable((Drawable) null, i, j, Theme.currentTheme.isDark()));
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(context, i, false, null, null);
        this.messageCell = anonymousClass2;
        sizeNotifierFrameLayout.addView(anonymousClass2, LayoutHelper.createFrame(-1, -2.0f, 87, 0.0f, 12.0f, 0.0f, 12.0f));
        this.avatarDrawable = new AvatarDrawable((Theme.ResourcesProvider) null);
        BackupImageView backupImageView = new BackupImageView(context);
        this.avatarImageView = backupImageView;
        backupImageView.setRoundRadius(AndroidUtilities.dp(21.0f));
        sizeNotifierFrameLayout.addView(backupImageView, LayoutHelper.createFrame(42, 42.0f, 83, 8.0f, 0.0f, 0.0f, 12.0f));
        addView(sizeNotifierFrameLayout, LayoutHelper.createLinear(-1, -2, 7));
        PollEditTextCell pollEditTextCell = new PollEditTextCell(context, 0, null, resourcesProvider);
        this.editTextCell = pollEditTextCell;
        EditTextBoldCursor textView = pollEditTextCell.getTextView();
        textView.setEnabled(true);
        textView.setSingleLine(true);
        textView.setImeOptions(6);
        pollEditTextCell.setTextRight(114);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.menu_delete_old);
        imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText, resourcesProvider), PorterDuff.Mode.SRC_IN));
        pollEditTextCell.addView(imageView, LayoutHelper.createFrame(24, 24.0f, 21, 0.0f, 0.0f, 20.0f, 0.0f));
        ScaleStateListAnimator.apply(imageView, 0.1f, 1.5f);
        imageView.setOnClickListener(new GroupCallSheet$$ExternalSyntheticLambda5(textView, 4));
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
            public final void afterTextChanged(Editable editable) {
                TagEditCell tagEditCell = TagEditCell.this;
                if (tagEditCell.ignoreEdit) {
                    return;
                }
                String strTrim = editable.toString().trim();
                int length = strTrim.length();
                AnimatedTextView animatedTextView2 = tagEditCell.limitTextView;
                if (length > 16) {
                    animatedTextView2.setText("-" + (strTrim.length() - 16));
                    strTrim = strTrim.substring(0, 16);
                } else {
                    animatedTextView2.setText("");
                }
                Utilities.Callback callback = tagEditCell.onRankEdited;
                if (callback != null) {
                    callback.run(strTrim);
                }
                MessageObject messageObject = tagEditCell.messageObject;
                if (messageObject != null) {
                    messageObject.forceUpdate = true;
                    tagEditCell.messageCell.setMessageObject(messageObject, null, false, false, false, false);
                }
            }

            @Override
            public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            }

            @Override
            public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            }
        });
        addView(pollEditTextCell, LayoutHelper.createLinear(-1, -2, 7));
        anonymousClass2.setDelegate(new BinaryBitmap(29, this, textView));
    }

    public static void showInfoSheet(final Context context, final int i, final long j, final TLRPC.User user, final String str, final boolean z, final boolean z2, boolean z3, Theme.ResourcesProvider resourcesProvider) {
        int i2;
        int i3;
        final String string;
        int i4;
        int i5;
        BottomSheet bottomSheet;
        TLRPC.Chat chat;
        int i6;
        Context context2 = context;
        final Theme.ResourcesProvider resourcesProvider2 = resourcesProvider;
        TLRPC.Chat chat2 = MessagesController.getInstance(i).getChat(Long.valueOf(-j));
        if (chat2 == null) {
            return;
        }
        final BottomSheet bottomSheetM = VoIPService$$ExternalSyntheticOutline0.m(context2, resourcesProvider2, true, false);
        LinearLayout linearLayout = new LinearLayout(context2);
        linearLayout.setOrientation(1);
        bottomSheetM.customView = linearLayout;
        if (z2) {
            i2 = -6988581;
        } else {
            i2 = z ? -12539616 : -6905171;
        }
        BackupImageView backupImageView = new BackupImageView(context2);
        backupImageView.setImageResource(R.drawable.large_user_tag);
        backupImageView.setBackground(Theme.createCircleDrawable(AndroidUtilities.dp(80.0f), i2));
        linearLayout.addView(backupImageView, LayoutHelper.createLinear(80, 80, 49, 0, 18, 0, 0));
        int i7 = Theme.key_windowBackgroundWhiteBlackText;
        TextView textViewMakeTextView = TextHelper.makeTextView(context2, 20.0f, i7, true, null);
        textViewMakeTextView.setGravity(17);
        if (z2) {
            i3 = R.string.TagInfoOwnerTitle;
        } else {
            i3 = z ? R.string.TagInfoAdminTitle : R.string.TagInfoMemberTitle;
        }
        textViewMakeTextView.setText(LocaleController.getString(i3));
        linearLayout.addView(textViewMakeTextView, LayoutHelper.createFrame(-1, -2.0f, 49, 32.0f, 15.0f, 32.0f, 0.0f));
        TextView textViewMakeTextView2 = TextHelper.makeTextView(context2, 14.0f, i7, false, null);
        textViewMakeTextView2.setGravity(17);
        textViewMakeTextView2.setLineSpacing(AndroidUtilities.dp(3.0f), 1.0f);
        String str2 = "";
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
            final int i8 = z2 ? -6988581 : -12539616;
            final Paint paint = new Paint(1);
            paint.setColor(Theme.multAlpha(0.1f, i8));
            spannableStringBuilder.setSpan(new ReplacementSpan() {
                public float textWidth;

                @Override
                public final void draw(Canvas canvas, CharSequence charSequence, int i9, int i10, float f, int i11, int i12, int i13, Paint paint2) {
                    float f2 = (i11 + i13) / 2.0f;
                    float fDp = AndroidUtilities.dp(19.0f);
                    paint2.setColor(i8);
                    float f3 = fDp / 2.0f;
                    canvas.drawRoundRect(f, f2 - f3, f + this.textWidth + AndroidUtilities.dp(11.33f), f2 + f3, f3, f3, paint);
                    canvas.drawText(string, AndroidUtilities.dpf2(5.66f) + f, i13 - AndroidUtilities.dp(6.0f), paint2);
                }

                @Override
                public final int getSize(Paint paint2, CharSequence charSequence, int i9, int i10, Paint.FontMetricsInt fontMetricsInt) {
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
        textViewMakeTextView2.setText(AndroidUtilities.replaceCharSequence("un1", AndroidUtilities.replaceTags(LocaleController.formatString(i4, UserObject.getFirstName(user), chat2.title)), spannableStringBuilder));
        linearLayout.addView(textViewMakeTextView2, LayoutHelper.createFrame(-1, -2.0f, 49, 32.0f, 10.0f, 32.0f, 25.0f));
        LinearLayout linearLayout2 = new LinearLayout(context2);
        linearLayout2.setOrientation(0);
        linearLayout.addView(linearLayout2, LayoutHelper.createLinear(-1, -2, 7, 16, 0, 16, 16));
        int i9 = 0;
        while (i9 < 2) {
            String str3 = str2;
            Context context3 = context2;
            final AnonymousClass7 anonymousClass7 = new AnonymousClass7(context3, i, false, null, null);
            context2 = context3;
            final boolean z4 = i9 == 1;
            anonymousClass7.setDelegate(new ChatMessageCell.ChatMessageCellDelegate() {
                @Override
                public final boolean allowAddPollOptions() {
                    return false;
                }

                @Override
                public final boolean canDrawOutboundsContent() {
                    return true;
                }

                @Override
                public final boolean canPerformActions() {
                    return false;
                }

                @Override
                public final boolean canPerformReply() {
                    return false;
                }

                @Override
                public final boolean canSaveRichDocument(ChatMessageCell chatMessageCell) {
                    return false;
                }

                @Override
                public final boolean canToggleRichMessageCheckbox(ChatMessageCell chatMessageCell) {
                    return false;
                }

                @Override
                public final void didLongPress(ChatMessageCell chatMessageCell, float f, float f2) {
                }

                @Override
                public final void didLongPressBotButton(ChatMessageCell chatMessageCell, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
                }

                @Override
                public final boolean didLongPressChannelAvatar(ChatMessageCell chatMessageCell, TLRPC.Chat chat3) {
                    return false;
                }

                @Override
                public final boolean didLongPressPollOption(ChatMessageCell chatMessageCell, TLRPC.PollAnswer pollAnswer) {
                    return false;
                }

                @Override
                public final boolean didLongPressToDoButton(ChatMessageCell chatMessageCell, TLRPC.TodoItem todoItem) {
                    return false;
                }

                @Override
                public final boolean didLongPressUserAvatar(ChatMessageCell chatMessageCell, TLRPC.User user2) {
                    return false;
                }

                @Override
                public final void didPressAboutRevenueSharingAds() {
                }

                @Override
                public final void didPressAddPollOptionButton(ChatMessageCell chatMessageCell) {
                }

                @Override
                public final void didPressAdmin(ChatMessageCell chatMessageCell) {
                }

                @Override
                public final boolean didPressAnimatedEmoji(AnimatedEmojiSpan animatedEmojiSpan) {
                    return false;
                }

                @Override
                public final void didPressAppUpdateButton() {
                }

                @Override
                public final void didPressBoostCounter(ChatMessageCell chatMessageCell) {
                }

                @Override
                public final void didPressBotButton(ChatMessageCell chatMessageCell, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
                }

                @Override
                public final void didPressCancelSendButton(ChatMessageCell chatMessageCell) {
                }

                @Override
                public final void didPressChannelAvatar(ChatMessageCell chatMessageCell, TLRPC.Chat chat3, int i10, float f, float f2, boolean z5) {
                }

                @Override
                public final void didPressChannelRecommendation(ChatMessageCell chatMessageCell, TLObject tLObject, boolean z5) {
                }

                @Override
                public final void didPressChannelRecommendationsClose(ChatMessageCell chatMessageCell) {
                }

                @Override
                public final void didPressCodeCopy(MessageObject.TextLayoutBlock textLayoutBlock) {
                }

                @Override
                public final void didPressCommentButton(ChatMessageCell chatMessageCell) {
                }

                @Override
                public final void didPressCustomBotButton(ChatMessageCell chatMessageCell, BotInlineKeyboard.ButtonCustom buttonCustom) {
                }

                @Override
                public final void didPressEffect(ChatMessageCell chatMessageCell) {
                }

                @Override
                public final void didPressExtendedMediaPreview(ChatMessageCell chatMessageCell, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
                }

                @Override
                public final void didPressFactCheck(ChatMessageCell chatMessageCell) {
                }

                @Override
                public final void didPressFactCheckWhat(ChatMessageCell chatMessageCell, int i10, int i11) {
                }

                @Override
                public final void didPressGiveawayChatButton(int i10, ChatMessageCell chatMessageCell) {
                }

                @Override
                public final void didPressGroupImage(ChatMessageCell chatMessageCell, TLRPC.MessageExtendedMedia messageExtendedMedia) {
                }

                @Override
                public final void didPressHiddenForward(ChatMessageCell chatMessageCell) {
                }

                @Override
                public final void didPressHint(ChatMessageCell chatMessageCell) {
                }

                @Override
                public final void didPressImage(ChatMessageCell chatMessageCell, float f, float f2, boolean z5) {
                }

                @Override
                public final void didPressInstantButton(int i10, ChatMessageCell chatMessageCell) {
                }

                @Override
                public final void didPressMoreChannelRecommendations() {
                }

                @Override
                public final void didPressOther(ChatMessageCell chatMessageCell, float f, float f2) {
                }

                @Override
                public final void didPressPollMedia(ChatMessageCell chatMessageCell, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
                }

                @Override
                public final void didPressReaction(ChatMessageCell chatMessageCell, TLRPC.ReactionCount reactionCount, boolean z5, float f, float f2) {
                }

                @Override
                public final void didPressReplyMessage(ChatMessageCell chatMessageCell, int i10, float f, float f2, boolean z5) {
                }

                @Override
                public final void didPressRevealSensitiveContent(ChatMessageCell chatMessageCell) {
                }

                @Override
                public final void didPressRichDocumentOptions(ChatMessageCell chatMessageCell, TLRPC.Document document) {
                }

                @Override
                public final void didPressShowMore(ChatMessageCell chatMessageCell) {
                }

                @Override
                public final void didPressSideButton(ChatMessageCell chatMessageCell) {
                }

                @Override
                public final void didPressSponsoredClose(ChatMessageCell chatMessageCell) {
                }

                @Override
                public final void didPressSponsoredInfo(ChatMessageCell chatMessageCell, float f, float f2) {
                }

                @Override
                public final void didPressSummarize(ChatMessageCell chatMessageCell) {
                }

                @Override
                public final void didPressTime() {
                }

                @Override
                public final boolean didPressToDoButton(ChatMessageCell chatMessageCell, TLRPC.TodoItem todoItem, boolean z5) {
                    return false;
                }

                @Override
                public final void didPressUrl(ChatMessageCell chatMessageCell, CharacterStyle characterStyle, boolean z5) {
                }

                @Override
                public final void didPressUserAvatar(ChatMessageCell chatMessageCell, TLRPC.User user2, float f, float f2) {
                }

                @Override
                public final void didPressUserStatus(ChatMessageCell chatMessageCell, TLRPC.User user2, TLRPC.Document document, String str4) {
                }

                @Override
                public final void didPressViaBot(String str4) {
                }

                @Override
                public final void didPressViaBotNotInline(ChatMessageCell chatMessageCell, long j2) {
                }

                @Override
                public final void didPressVoteButtons(ChatMessageCell chatMessageCell, ArrayList arrayList, int i10, int i11, int i12) {
                }

                @Override
                public final void didPressWebPage(ChatMessageCell chatMessageCell, TLRPC.WebPage webPage, String str4, boolean z5) {
                    ArticleViewer.IBlock.CC.$default$didPressWebPage(chatMessageCell, str4);
                }

                @Override
                public final void didQuickShareEnd(ChatMessageCell chatMessageCell) {
                }

                @Override
                public final void didQuickShareMove(ChatMessageCell chatMessageCell, float f, float f2) {
                }

                @Override
                public final void didQuickShareStart(ChatMessageCell chatMessageCell) {
                }

                @Override
                public final void didStartVideoStream(MessageObject messageObject) {
                }

                @Override
                public final void didTogglePollPreview(ChatMessageCell chatMessageCell) {
                }

                @Override
                public final void didToggleRichMessageCheckbox(ChatMessageCell chatMessageCell, FileLoader$$ExternalSyntheticLambda1 fileLoader$$ExternalSyntheticLambda1) {
                }

                @Override
                public final boolean doNotShowLoadingReply(MessageObject messageObject) {
                    return ArticleViewer.IBlock.CC.$default$doNotShowLoadingReply(messageObject);
                }

                @Override
                public final void drawPollMode(ChatMessageCell chatMessageCell) {
                }

                @Override
                public final void forceUpdate(ChatMessageCell chatMessageCell) {
                }

                @Override
                public final void forceUpdateNoAnimation(ChatMessageCell chatMessageCell) {
                }

                @Override
                public final int getAddPollOptionInputFieldHeight(ChatMessageCell chatMessageCell) {
                    return 0;
                }

                @Override
                public final String getAdminRank(long j2) {
                    int i10;
                    if (z4) {
                        i10 = z2 ? R.string.TagInfoOwnerTitle : R.string.TagInfoAdminTitle;
                    } else {
                        i10 = R.string.TagInfoMemberTitle;
                    }
                    return LocaleController.getString(i10);
                }

                @Override
                public final int getChatMode() {
                    return 0;
                }

                @Override
                public final ChatActivityDraftMessageMeasureController getDraftMessageMeasureController() {
                    return null;
                }

                @Override
                public final PinchToZoomHelper getPinchToZoomHelper() {
                    return null;
                }

                @Override
                public final String getProgressLoadingBotButtonUrl(ChatMessageCell chatMessageCell) {
                    return null;
                }

                @Override
                public final CharacterStyle getProgressLoadingLink(ChatMessageCell chatMessageCell) {
                    return null;
                }

                @Override
                public final TextSelectionHelper.ChatListTextSelectionHelper getTextSelectionHelper() {
                    return null;
                }

                @Override
                public final boolean hasSelectedMessages() {
                    return false;
                }

                @Override
                public final void invalidateBlur() {
                }

                @Override
                public final boolean isAdmin(long j2) {
                    return z4;
                }

                @Override
                public final boolean isLandscape() {
                    return false;
                }

                @Override
                public final boolean isOwner(long j2) {
                    return z4 && z2;
                }

                @Override
                public final boolean isProgressLoading(int i10, ChatMessageCell chatMessageCell) {
                    return false;
                }

                @Override
                public final boolean isReplyOrSelf() {
                    return false;
                }

                @Override
                public final boolean keyboardIsOpened() {
                    return false;
                }

                @Override
                public final void needOpenWebView(MessageObject messageObject, String str4, String str5, String str6, String str7, int i10, int i11) {
                }

                @Override
                public final boolean needPlayMessage(ChatMessageCell chatMessageCell, MessageObject messageObject) {
                    return false;
                }

                @Override
                public final void needReloadPolls() {
                }

                @Override
                public final void needShowPremiumBulletin(int i10) {
                }

                @Override
                public final boolean onAccessibilityAction(int i10) {
                    return false;
                }

                @Override
                public final void onDiceFinished() {
                }

                @Override
                public final void openArticlePhoto(ChatMessageCell chatMessageCell, TL_iv.PageBlock pageBlock) {
                }

                @Override
                public final void setShouldNotRepeatSticker(MessageObject messageObject) {
                }

                @Override
                public final boolean shouldDrawThreadProgress(ChatMessageCell chatMessageCell, boolean z5) {
                    return false;
                }

                @Override
                public final boolean shouldRepeatSticker(MessageObject messageObject) {
                    return true;
                }

                @Override
                public final void videoTimerReached() {
                }

                @Override
                public final void forceUpdate(ChatMessageCell chatMessageCell, boolean z5) {
                }
            });
            SizeNotifierFrameLayout sizeNotifierFrameLayout = new SizeNotifierFrameLayout(context2) {
                public final GradientClip clip = new GradientClip();

                @Override
                public final boolean drawChild(Canvas canvas, View view, long j2) {
                    if (view != anonymousClass7) {
                        return super.drawChild(canvas, view, j2);
                    }
                    canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                    boolean zDrawChild = super.drawChild(canvas, view, j2);
                    canvas.save();
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, AndroidUtilities.dp(45.0f), getHeight());
                    this.clip.draw(canvas, rectF, 0, 1.0f);
                    canvas.restore();
                    canvas.restore();
                    return zDrawChild;
                }

                @Override
                public final Theme.ResourcesProvider getResourceProvider() {
                    return resourcesProvider2;
                }

                @Override
                public final boolean isActionBarVisible() {
                    return false;
                }

                @Override
                public final boolean isStatusBarVisible$1() {
                    return false;
                }

                @Override
                public final void onMeasure(int i10, int i11) {
                    super.onMeasure(i10, i11);
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, 1073741824);
                    AnonymousClass7 anonymousClass8 = anonymousClass7;
                    anonymousClass8.measure(iMakeMeasureSpec, i11);
                    setMeasuredDimension(View.MeasureSpec.getSize(i10), anonymousClass8.getMeasuredHeight() + AndroidUtilities.dp(24.0f));
                }
            };
            sizeNotifierFrameLayout.setBackgroundImage(PreviewView.getBackgroundDrawable((Drawable) null, i, j, Theme.currentTheme.isDark()));
            sizeNotifierFrameLayout.addView(anonymousClass7, LayoutHelper.createFrame(-1, -2.0f, 87, 0.0f, 12.0f, 0.0f, 12.0f));
            linearLayout2.addView(sizeNotifierFrameLayout, LayoutHelper.createLinear(0, -1, 1.0f, 119, i9 == 1 ? 6 : 0, 0, i9 == 0 ? 6 : 0, 0));
            sizeNotifierFrameLayout.setClipToOutline(true);
            sizeNotifierFrameLayout.setOutlineProvider(new AnonymousClass10());
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            TLRPC.Chat chat3 = chat2;
            tL_message.from_id = MessagesController.getInstance(i).getPeer(user.id);
            tL_message.peer_id = MessagesController.getInstance(i).getPeer(j);
            tL_message.message = str3;
            tL_message.date = ConnectionsManager.getInstance(i).getCurrentTime();
            tL_message.out = false;
            MessageObject messageObject = new MessageObject(i, tL_message, true, false);
            messageObject.forceAvatar = true;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("_\n_  ");
            spannableStringBuilder2.setSpan(new LineSpan(AndroidUtilities.dp(200.0f)), 0, 1, 33);
            spannableStringBuilder2.setSpan(new LineSpan(AndroidUtilities.dp(160.0f)), 2, 3, 33);
            messageObject.messageText = spannableStringBuilder2;
            anonymousClass7.isChat = true;
            if (ChatObject.isChannel(chat3)) {
                chat = chat3;
                boolean z5 = chat.megagroup;
                anonymousClass7.isMegagroup = z5;
                messageObject.generateLayout(null);
                anonymousClass7.setMessageObject(messageObject, null, false, false, false, false);
                anonymousClass7.setTranslationX(-AndroidUtilities.dp(140.0f));
                i9++;
                chat2 = chat;
                str2 = str3;
            } else {
                chat = chat3;
            }
            anonymousClass7.isMegagroup = z5;
            messageObject.generateLayout(null);
            anonymousClass7.setMessageObject(messageObject, null, false, false, false, false);
            anonymousClass7.setTranslationX(-AndroidUtilities.dp(140.0f));
            i9++;
            chat2 = chat;
            str2 = str3;
        }
        TLRPC.Chat chat4 = chat2;
        ButtonWithCounterView buttonWithCounterViewM = zzlp.m(context2, resourcesProvider2, true);
        boolean z6 = (ChatObject.canManageTags(chat4) && (!z || ((!z2 && z3) || UserObject.isUserSelf(user)))) || (ChatObject.canManageMyTag(chat4) && UserObject.isUserSelf(user));
        if (!z6 && !ChatObject.canManageTags(chat4) && !chat4.creator && chat4.admin_rights == null && !z2) {
            TextView textViewMakeTextView3 = TextHelper.makeTextView(context2, 12.0f, Theme.key_windowBackgroundWhiteGrayText, false, null);
            textViewMakeTextView3.setGravity(1);
            textViewMakeTextView3.setText(LocaleController.getString(R.string.CantEditTagAdmins));
            linearLayout.addView(textViewMakeTextView3, LayoutHelper.createLinear(32.0f, 0.0f, 32.0f, 0.0f, -1, -2));
        }
        linearLayout.addView(buttonWithCounterViewM, LayoutHelper.createLinear(-1, 48, 7, 16, 16, 16, 16));
        final boolean[] zArr = new boolean[1];
        if (z6) {
            if (UserObject.isUserSelf(user)) {
                i5 = TextUtils.isEmpty(str) ? R.string.TagInfoButtonAddMyTag : R.string.TagInfoButtonEditMyTag;
            } else {
                i5 = TextUtils.isEmpty(str) ? R.string.TagInfoButtonAddTag : R.string.TagInfoButtonEditTag;
            }
            buttonWithCounterViewM.setText(LocaleController.getString(i5));
            View.OnClickListener onClickListener = new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    bottomSheetM.lambda$showGiftOfferSheet$15();
                    TagEditCell.showSheet(context, i, j, user, str, z, z2, resourcesProvider2);
                    boolean[] zArr2 = zArr;
                    if (zArr2[0]) {
                        return;
                    }
                    MessagesController.getGlobalMainSettings().edit().putInt("showchattagsinfo", 0).apply();
                    zArr2[0] = true;
                }
            };
            bottomSheet = bottomSheetM;
            resourcesProvider2 = resourcesProvider2;
            buttonWithCounterViewM.setOnClickListener(onClickListener);
        } else {
            buttonWithCounterViewM.setText(StarGiftSheet.replaceUnderstood(LocaleController.getString(R.string.Understood)));
            buttonWithCounterViewM.setOnClickListener(new ContactAddActivity$$ExternalSyntheticLambda8(19, bottomSheetM, zArr));
            bottomSheet = bottomSheetM;
        }
        bottomSheet.smoothKeyboardAnimationEnabled = true;
        bottomSheet.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider2));
        bottomSheet.setOnDismissListener(new WebInstantView$$ExternalSyntheticLambda1(1, zArr));
        if (MessagesController.getGlobalMainSettings().getInt("showchattagsinfo", 3) > 0 || !z6) {
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
        BottomSheet bottomSheetM = VoIPService$$ExternalSyntheticOutline0.m(context, resourcesProvider, true, false);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        bottomSheetM.customView = linearLayout;
        LinearLayout linearLayout2 = new LinearLayout(context);
        int i4 = Theme.key_windowBackgroundWhiteBlackText;
        TextView textViewMakeTextView = TextHelper.makeTextView(context, 20.0f, i4, true, null);
        textViewMakeTextView.setText(LocaleController.getString(R.string.MemberTagTitle));
        linearLayout2.addView(textViewMakeTextView, LayoutHelper.createLinear(0, -2, 1.0f, 19, 22, 0, 22, 0));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i4, resourcesProvider), PorterDuff.Mode.SRC_IN));
        imageView.setBackground(Theme.createSelectorDrawable(Theme.getColor(Theme.key_listSelector, resourcesProvider), 1, AndroidUtilities.dp(18.0f)));
        linearLayout2.addView(imageView, LayoutHelper.createLinear(32, 32, 21, 0, 0, 10, 0));
        linearLayout.addView(linearLayout2, LayoutHelper.createLinear(0.0f, 6.0f, 0.0f, 6.0f, -1, -2));
        final ButtonWithCounterView buttonWithCounterViewM = zzlp.m(context, resourcesProvider, true);
        final boolean z3 = !TextUtils.isEmpty(str) || z;
        if (TextUtils.isEmpty(str) && !z && z3) {
            i2 = R.string.MemberTagButtonRemove;
        } else {
            i2 = z3 ? R.string.MemberTagButtonEdit : R.string.MemberTagButtonAdd;
        }
        buttonWithCounterViewM.setText(LocaleController.getString(i2));
        final String[] strArr = {str == null ? "" : str};
        TagEditCell tagEditCell = new TagEditCell(i, j, context, resourcesProvider);
        tagEditCell.setClipToOutline(true);
        tagEditCell.setOutlineProvider(new AnonymousClass5());
        tagEditCell.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider));
        tagEditCell.set(user, str, z, z2, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                int i5;
                String str2 = (String) obj;
                strArr[0] = str2;
                boolean zIsEmpty = TextUtils.isEmpty(str2);
                boolean z4 = z3;
                if (zIsEmpty && !z && z4) {
                    i5 = R.string.MemberTagButtonRemove;
                } else {
                    i5 = z4 ? R.string.MemberTagButtonEdit : R.string.MemberTagButtonAdd;
                }
                buttonWithCounterViewM.setText(LocaleController.getString(i5), true, true);
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
        textView.post(new ChatActivity$$ExternalSyntheticLambda422(4, textView));
    }

    public final void set(TLRPC.User user, String str, boolean z, boolean z2, Utilities.Callback callback) {
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        int i = this.currentAccount;
        tL_message.from_id = MessagesController.getInstance(i).getPeer(user.id);
        MessagesController messagesController = MessagesController.getInstance(i);
        long j = this.dialogId;
        tL_message.peer_id = messagesController.getPeer(j);
        tL_message.message = "";
        tL_message.date = ConnectionsManager.getInstance(i).getCurrentTime();
        tL_message.out = false;
        this.isAdmin = z;
        this.isOwner = z2;
        MessageObject messageObject = new MessageObject(i, tL_message, true, false);
        this.messageObject = messageObject;
        messageObject.forceAvatar = true;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("_\n_  ");
        spannableStringBuilder.setSpan(new LineSpan((int) Math.min(AndroidUtilities.displaySize.x * 0.5f, AndroidUtilities.dp(200.0f))), 0, 1, 33);
        spannableStringBuilder.setSpan(new LineSpan((int) Math.min(AndroidUtilities.displaySize.x * 0.44f, AndroidUtilities.dp(160.0f))), 2, 3, 33);
        this.messageObject.messageText = spannableStringBuilder;
        TLRPC.Chat chat = MessagesController.getInstance(i).getChat(Long.valueOf(-j));
        boolean z3 = chat != null;
        AnonymousClass2 anonymousClass2 = this.messageCell;
        anonymousClass2.isChat = z3;
        anonymousClass2.isMegagroup = ChatObject.isChannel(chat) && chat.megagroup;
        this.messageObject.generateLayout(null);
        this.messageCell.setMessageObject(this.messageObject, null, false, false, false, false);
        AvatarDrawable avatarDrawable = this.avatarDrawable;
        avatarDrawable.setInfo(UserConfig.selectedAccount, user);
        BackupImageView backupImageView = this.avatarImageView;
        backupImageView.imageReceiver.setForUserOrChat(user, avatarDrawable);
        backupImageView.onNewImageSet();
        this.onRankEdited = callback;
        this.ignoreEdit = true;
        this.editTextCell.setTextAndHint(str, LocaleController.getString((!TextUtils.isEmpty(str) || z) ? R.string.MemberTagHintEdit : R.string.MemberTagHintAdd), false);
        this.ignoreEdit = false;
    }

    public final class LineSpan extends ReplacementSpan {
        public final int $r8$classId;
        public final Object paint;
        public int width;

        public LineSpan(int i) {
            this.$r8$classId = 0;
            Paint paint = new Paint(1);
            this.paint = paint;
            this.width = i;
            paint.setColor(Theme.multAlpha(0.3f, Theme.getColor(null, Theme.key_chat_inTimeText, false)));
        }

        @Override
        public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
            switch (this.$r8$classId) {
                case 0:
                    float fDp = ((i3 + i5) / 2.0f) + AndroidUtilities.dp(1.33f);
                    float fDp2 = AndroidUtilities.dp(6.66f);
                    RectF rectF = AndroidUtilities.rectTmp;
                    float f2 = fDp2 / 2.0f;
                    rectF.set(f, fDp - f2, this.width + f, fDp + f2);
                    canvas.drawRoundRect(rectF, f2, f2, (Paint) this.paint);
                    break;
                default:
                    PeerColorActivity.PeerColorDrawable peerColorDrawable = (PeerColorActivity.PeerColorDrawable) this.paint;
                    if (peerColorDrawable != null) {
                        int i6 = (i3 + i5) / 2;
                        int iDp = (int) (AndroidUtilities.dp(3.0f) + f);
                        int i7 = i6 - this.width;
                        float fDp3 = f + AndroidUtilities.dp(5.0f);
                        int i8 = this.width;
                        peerColorDrawable.setBounds(iDp, i7, (int) (fDp3 + i8), i6 + i8);
                        peerColorDrawable.draw(canvas);
                    }
                    break;
            }
        }

        @Override
        public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
            switch (this.$r8$classId) {
                case 0:
                    return this.width;
                default:
                    return AndroidUtilities.dp(3.0f) + AndroidUtilities.dp(3.0f) + this.width;
            }
        }

        public LineSpan(boolean z, int i, int i2) {
            PeerColorActivity.PeerColorDrawable peerColorDrawableFrom;
            this.$r8$classId = 1;
            this.width = AndroidUtilities.dp(21.0f);
            if (z) {
                int i3 = PeerColorActivity.PeerColorDrawable.$r8$clinit;
                MessagesController.PeerColors peerColors = MessagesController.getInstance(i).profilePeerColors;
                peerColorDrawableFrom = PeerColorActivity.PeerColorDrawable.from(peerColors == null ? null : peerColors.getColor(i2), true);
            } else {
                peerColorDrawableFrom = PeerColorActivity.PeerColorDrawable.from(i, i2);
            }
            this.paint = peerColorDrawableFrom;
        }
    }
}
