package org.telegram.ui.Components.Premium.boosts.cells.msg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.text.style.RelativeSizeSpan;
import android.util.StateSet;
import android.view.MotionEvent;
import androidx.fragment.app.Fragment$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BottomSheetTabs$$ExternalSyntheticLambda4;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.BaseCell;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Cells.DialogCell$$ExternalSyntheticLambda6;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.LinkPath;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.Premium.boosts.BoostRepository;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.StaticLayoutEx;
import org.telegram.ui.iv.RichDetailsCell;

public final class GiveawayResultsMessageCell {
    public AvatarDrawable[] avatarDrawables;
    public ImageReceiver[] avatarImageReceivers;
    public boolean[] avatarVisible;
    public StaticLayout bottomLayout;
    public Paint chatBgPaint;
    public RectF chatRect;
    public TextPaint chatTextPaint;
    public Rect[] clickRect;
    public Paint clipRectPaint;
    public Rect containerRect;
    public RectF countRect;
    public Paint counterBgPaint;
    public Drawable counterIcon;
    public TextPaint counterStarsTextPaint;
    public String counterStr;
    public Rect counterTextBounds;
    public TextPaint counterTextPaint;
    public TextPaint countriesTextPaint;
    public int diffTextWidth;
    public RLottieDrawable giftDrawable;
    public ImageReceiver giftReceiver;
    public boolean isStars;
    public LinkSpanDrawable.LinkCollector links;
    public MessageObject messageObject;
    public boolean[] needNewRow;
    public final ChatMessageCell parentView;
    public int[] pressedState;
    public Paint saveLayerPaint;
    public int selectorColor;
    public BaseCell.RippleDrawableSafe selectorDrawable;
    public int subTitleMarginLeft;
    public int subTitleMarginTop;
    public TextPaint textDividerPaint;
    public TextPaint textPaint;
    public int titleHeight;
    public StaticLayout titleLayout;
    public int topHeight;
    public StaticLayout topLayout;
    public SpannableStringBuilder topStringBuilder;
    public float[] userTitleWidths;
    public CharSequence[] userTitles;
    public TLRPC.User[] users;
    public int measuredHeight = 0;
    public int measuredWidth = 0;
    public int pressedPos = -1;
    public boolean isButtonPressed = false;
    public boolean isContainerPressed = false;

    public GiveawayResultsMessageCell(ChatMessageCell chatMessageCell) {
        this.parentView = chatMessageCell;
    }

    public final boolean checkMotionEvent(MotionEvent motionEvent) {
        StaticLayout staticLayout;
        int i;
        MessageObject messageObject = this.messageObject;
        if (messageObject != null && messageObject.isGiveawayResults()) {
            LinkSpanDrawable.LinkCollector linkCollector = this.links;
            ChatMessageCell chatMessageCell = this.parentView;
            if (linkCollector == null) {
                this.links = new LinkSpanDrawable.LinkCollector(chatMessageCell);
            }
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if ((action == 1 || action == 0) && this.topStringBuilder != null && (staticLayout = this.topLayout) != null && (i = y - this.subTitleMarginTop) > 0) {
                int offsetForHorizontal = this.topLayout.getOffsetForHorizontal(staticLayout.getLineForVertical(i - AndroidUtilities.dp(10.0f)), x - this.subTitleMarginLeft);
                ClickableSpan[] clickableSpanArr = (ClickableSpan[]) this.topStringBuilder.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                if (clickableSpanArr.length != 0) {
                    if (action == 1) {
                        this.links.clear();
                        clickableSpanArr[0].onClick(chatMessageCell);
                        return true;
                    }
                    LinkSpanDrawable linkSpanDrawable = new LinkSpanDrawable(clickableSpanArr[0], null, x, y);
                    this.links.addLink(linkSpanDrawable);
                    try {
                        int spanStart = this.topStringBuilder.getSpanStart(clickableSpanArr[0]);
                        LinkPath linkPathObtainNewPath = linkSpanDrawable.obtainNewPath();
                        linkPathObtainNewPath.setCurrentLayout(this.topLayout, spanStart, this.subTitleMarginLeft, this.subTitleMarginTop);
                        this.topLayout.getSelectionPath(spanStart, this.topStringBuilder.getSpanEnd(clickableSpanArr[0]), linkPathObtainNewPath);
                        return true;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return true;
                    }
                }
                this.links.clear();
                chatMessageCell.invalidate();
            }
            if (action == 0) {
                int i2 = 0;
                while (true) {
                    Rect[] rectArr = this.clickRect;
                    if (i2 >= rectArr.length) {
                        if (!this.containerRect.contains(x, y)) {
                            break;
                        }
                        this.isContainerPressed = true;
                        return true;
                    }
                    if (rectArr[i2].contains(x, y)) {
                        this.pressedPos = i2;
                        this.selectorDrawable.setHotspot(x, y);
                        this.isButtonPressed = true;
                        setButtonPressed(true);
                        return true;
                    }
                    i2++;
                }
            } else if (action == 1) {
                if (this.isButtonPressed) {
                    if (chatMessageCell.getDelegate() != null) {
                        chatMessageCell.getDelegate().didPressGiveawayChatButton(chatMessageCell, this.pressedPos);
                    }
                    chatMessageCell.playSoundEffect(0);
                    setButtonPressed(false);
                    this.isButtonPressed = false;
                }
                if (this.isContainerPressed) {
                    this.isContainerPressed = false;
                    MessageObject messageObject2 = this.messageObject;
                    if (messageObject2 != null && messageObject2.messageOwner != null) {
                        BoostRepository.getGiveawayInfo(messageObject2, new DialogCell$$ExternalSyntheticLambda6(messageObject2, 13), new BottomSheetTabs$$ExternalSyntheticLambda4(3));
                        return false;
                    }
                }
            } else if (action != 2 && action == 3) {
                this.links.clear();
                if (this.isButtonPressed) {
                    setButtonPressed(false);
                }
                this.isButtonPressed = false;
                this.isContainerPressed = false;
            }
        }
        return false;
    }

    public final void draw(Canvas canvas, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
        boolean[] zArr;
        int color1;
        int i3;
        MessageObject messageObject = this.messageObject;
        if (messageObject == null || !messageObject.isGiveawayResults()) {
            return;
        }
        BaseCell.RippleDrawableSafe rippleDrawableSafe = this.selectorDrawable;
        ChatMessageCell chatMessageCell = this.parentView;
        if (rippleDrawableSafe == null) {
            int color = Theme.getColor(null, Theme.key_listSelector, false);
            this.selectorColor = color;
            BaseCell.RippleDrawableSafe rippleDrawableSafeCreateRadSelectorDrawable = Theme.createRadSelectorDrawable(color, 12, 12);
            this.selectorDrawable = rippleDrawableSafeCreateRadSelectorDrawable;
            rippleDrawableSafeCreateRadSelectorDrawable.setCallback(chatMessageCell);
        }
        this.textPaint.setColor(Theme.chat_msgTextPaint.getColor());
        this.textDividerPaint.setColor(Theme.getColor(null, Theme.key_dialogTextGray2, false));
        this.countriesTextPaint.setColor(Theme.chat_msgTextPaint.getColor());
        if (this.messageObject.isOutOwner()) {
            TextPaint textPaint = this.chatTextPaint;
            int i4 = Theme.key_chat_outPreviewInstantText;
            textPaint.setColor(Theme.getColor(i4, resourcesProvider));
            this.counterBgPaint.setColor(Theme.getColor(i4, resourcesProvider));
            this.chatBgPaint.setColor(Theme.getColor(Theme.key_chat_outReplyLine, resourcesProvider));
        } else {
            TextPaint textPaint2 = this.chatTextPaint;
            int i5 = Theme.key_chat_inPreviewInstantText;
            textPaint2.setColor(Theme.getColor(i5, resourcesProvider));
            this.counterBgPaint.setColor(Theme.getColor(i5, resourcesProvider));
            this.chatBgPaint.setColor(Theme.getColor(Theme.key_chat_inReplyLine, resourcesProvider));
        }
        if (this.isStars) {
            this.counterBgPaint.setColor(Theme.getColor(Theme.key_starsGradient1, resourcesProvider));
        }
        canvas.save();
        int iDp = i2 - AndroidUtilities.dp(4.0f);
        float f = iDp;
        canvas.translate(f, i);
        this.containerRect.set(iDp, i, this.measuredWidth + iDp, this.measuredHeight + i);
        canvas.saveLayer(0.0f, 0.0f, this.measuredWidth, this.measuredHeight, this.saveLayerPaint, 31);
        this.giftReceiver.draw(canvas);
        float f2 = this.measuredWidth / 2.0f;
        float fDp = AndroidUtilities.dp(106.0f);
        int iDp2 = AndroidUtilities.dp(12.0f) + this.counterTextBounds.width();
        int iDp3 = AndroidUtilities.dp(10.0f) + this.counterTextBounds.height();
        this.countRect.set(f2 - ((AndroidUtilities.dp(2.0f) + iDp2) / 2.0f), fDp - ((AndroidUtilities.dp(2.0f) + iDp3) / 2.0f), ((AndroidUtilities.dp(2.0f) + iDp2) / 2.0f) + f2, ((AndroidUtilities.dp(2.0f) + iDp3) / 2.0f) + fDp);
        canvas.drawRoundRect(this.countRect, AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), this.clipRectPaint);
        float f3 = iDp2 / 2.0f;
        float f4 = iDp3 / 2.0f;
        this.countRect.set(f2 - f3, fDp - f4, f2 + f3, fDp + f4);
        canvas.drawRoundRect(this.countRect, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), this.counterBgPaint);
        Drawable drawable = this.counterIcon;
        if (drawable != null) {
            drawable.setBounds(AndroidUtilities.dp(5.0f) + ((int) this.countRect.left), ((int) this.countRect.centerY()) - AndroidUtilities.dp(6.96f), AndroidUtilities.dp(21.24f) + ((int) this.countRect.left), AndroidUtilities.dp(6.96f) + ((int) this.countRect.centerY()));
            this.counterIcon.draw(canvas);
        }
        canvas.drawText(this.counterStr, this.countRect.centerX() + AndroidUtilities.dp(this.isStars ? 8.0f : 0.0f), this.countRect.centerY() + AndroidUtilities.dp(4.0f), this.isStars ? this.counterStarsTextPaint : this.counterTextPaint);
        canvas.restore();
        canvas.translate(0.0f, AndroidUtilities.dp(128.0f));
        int iDp4 = AndroidUtilities.dp(128.0f) + i;
        this.subTitleMarginTop = this.titleHeight + iDp4;
        this.subTitleMarginLeft = (int) ((this.diffTextWidth / 2.0f) + f);
        canvas.save();
        canvas.translate(this.diffTextWidth / 2.0f, 0.0f);
        this.titleLayout.draw(canvas);
        canvas.translate(0.0f, this.titleHeight);
        this.topLayout.draw(canvas);
        canvas.restore();
        canvas.translate(0.0f, AndroidUtilities.dp(6.0f) + this.topHeight);
        int iM = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(6.0f, this.topHeight, iDp4);
        int i6 = 0;
        int i7 = 0;
        while (true) {
            boolean[] zArr2 = this.avatarVisible;
            if (i6 >= zArr2.length) {
                break;
            }
            if (zArr2[i6]) {
                canvas.save();
                int i8 = i6;
                float fDp2 = 0.0f;
                do {
                    fDp2 += this.userTitleWidths[i8] + AndroidUtilities.dp(40.0f);
                    i8++;
                    zArr = this.avatarVisible;
                    if (i8 >= zArr.length || this.needNewRow[i8]) {
                        break;
                    }
                } while (zArr[i8]);
                float f5 = f2 - (fDp2 / 2.0f);
                canvas.translate(f5, 0.0f);
                int iWidth = ((int) f5) + iDp;
                int i9 = i6;
                while (true) {
                    TLRPC.User user = this.users[i9];
                    if (this.messageObject.isOutOwner()) {
                        color1 = Theme.getColor(Theme.key_chat_outPreviewInstantText, resourcesProvider);
                    } else {
                        int colorId = UserObject.getColorId(user);
                        if (colorId < 7) {
                            color1 = Theme.getColor(Theme.keys_avatar_nameInMessage[colorId], resourcesProvider);
                        } else {
                            MessagesController.PeerColors peerColors = MessagesController.getInstance(UserConfig.selectedAccount).peerColors;
                            MessagesController.PeerColor color2 = peerColors == null ? null : peerColors.getColor(colorId);
                            color1 = color2 != null ? color2.getColor1() : Theme.getColor(Theme.keys_avatar_nameInMessage[0], resourcesProvider);
                        }
                    }
                    int i10 = this.pressedPos;
                    i3 = (i10 < 0 || i10 != i9) ? i7 : color1;
                    this.chatTextPaint.setColor(color1);
                    this.chatBgPaint.setColor(color1);
                    this.chatBgPaint.setAlpha(25);
                    this.avatarImageReceivers[i9].draw(canvas);
                    CharSequence charSequence = this.userTitles[i9];
                    int i11 = iWidth;
                    canvas.drawText(charSequence, 0, charSequence.length(), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(16.0f), this.chatTextPaint);
                    this.chatRect.set(0.0f, 0.0f, this.userTitleWidths[i9] + AndroidUtilities.dp(40.0f), AndroidUtilities.dp(24.0f));
                    canvas.drawRoundRect(this.chatRect, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), this.chatBgPaint);
                    float f6 = i11;
                    this.clickRect[i9].set(i11, iM, (int) (this.chatRect.width() + f6), AndroidUtilities.dp(24.0f) + iM);
                    canvas.translate(this.chatRect.width() + AndroidUtilities.dp(6.0f), 0.0f);
                    iWidth = (int) (this.chatRect.width() + AndroidUtilities.dp(6.0f) + f6);
                    i9++;
                    boolean[] zArr3 = this.avatarVisible;
                    if (i9 >= zArr3.length || this.needNewRow[i9] || !zArr3[i9]) {
                        break;
                    } else {
                        i7 = i3;
                    }
                }
                canvas.restore();
                canvas.translate(0.0f, AndroidUtilities.dp(30.0f));
                iM += AndroidUtilities.dp(30.0f);
                i6 = i9;
                i7 = i3;
            } else {
                i6++;
            }
        }
        canvas.translate(0.0f, AndroidUtilities.dp(6.0f));
        canvas.save();
        canvas.translate(this.diffTextWidth / 2.0f, 0.0f);
        this.bottomLayout.draw(canvas);
        canvas.restore();
        canvas.restore();
        if (this.pressedPos >= 0) {
            int iMultAlpha = Theme.multAlpha(Theme.currentTheme.isDark() ? 0.12f : 0.1f, i7);
            if (this.selectorColor != iMultAlpha) {
                BaseCell.RippleDrawableSafe rippleDrawableSafe2 = this.selectorDrawable;
                this.selectorColor = iMultAlpha;
                Theme.setSelectorDrawableColor(rippleDrawableSafe2, iMultAlpha, true);
            }
            this.selectorDrawable.setBounds(this.clickRect[this.pressedPos]);
            this.selectorDrawable.setCallback(chatMessageCell);
        }
        LinkSpanDrawable.LinkCollector linkCollector = this.links;
        if (linkCollector == null || !linkCollector.draw(canvas)) {
            return;
        }
        chatMessageCell.invalidate();
    }

    public final void setButtonPressed(boolean z) {
        MessageObject messageObject = this.messageObject;
        if (messageObject == null || !messageObject.isGiveawayResults() || this.selectorDrawable == null) {
            return;
        }
        LinkSpanDrawable.LinkCollector linkCollector = this.links;
        if (linkCollector != null) {
            linkCollector.clear();
        }
        ChatMessageCell chatMessageCell = this.parentView;
        if (!z) {
            this.selectorDrawable.setState(StateSet.NOTHING);
            chatMessageCell.invalidate();
        } else {
            this.selectorDrawable.setCallback(new RichDetailsCell.AnonymousClass1(this, 4));
            this.selectorDrawable.setState(this.pressedState);
            chatMessageCell.invalidate();
        }
    }

    public final void setMessageContent(int i, MessageObject messageObject) {
        TLRPC.User user;
        TLRPC.User user2 = null;
        this.messageObject = null;
        this.titleLayout = null;
        this.topLayout = null;
        this.bottomLayout = null;
        this.measuredHeight = 0;
        this.measuredWidth = 0;
        this.isStars = false;
        if (messageObject.isGiveawayResults()) {
            this.messageObject = messageObject;
            boolean z = true;
            if (this.counterTextPaint == null) {
                this.counterTextPaint = new TextPaint(1);
                this.counterStarsTextPaint = new TextPaint(1);
                this.chatTextPaint = new TextPaint(1);
                this.textPaint = new TextPaint(1);
                this.textDividerPaint = new TextPaint(1);
                this.countriesTextPaint = new TextPaint(1);
                this.counterBgPaint = new Paint(1);
                this.chatBgPaint = new Paint(1);
                this.saveLayerPaint = new Paint();
                this.clipRectPaint = new Paint();
                this.countRect = new RectF();
                this.chatRect = new RectF();
                this.counterTextBounds = new Rect();
                this.containerRect = new Rect();
                this.pressedState = new int[]{16842910, 16842919};
                this.userTitles = new CharSequence[10];
                this.users = new TLRPC.User[10];
                this.userTitleWidths = new float[10];
                this.needNewRow = new boolean[10];
                this.clickRect = new Rect[10];
                ImageReceiver imageReceiver = new ImageReceiver(this.parentView);
                this.giftReceiver = imageReceiver;
                imageReceiver.setAllowLoadingOnAttachedOnly(true);
                Paint paint = this.clipRectPaint;
                PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
                paint.setXfermode(new PorterDuffXfermode(mode));
                this.counterTextPaint.setTypeface(AndroidUtilities.bold());
                this.counterTextPaint.setXfermode(new PorterDuffXfermode(mode));
                this.counterTextPaint.setTextSize(AndroidUtilities.dp(12.0f));
                TextPaint textPaint = this.counterTextPaint;
                Paint.Align align = Paint.Align.CENTER;
                textPaint.setTextAlign(align);
                this.counterStarsTextPaint.setTypeface(AndroidUtilities.bold());
                this.counterStarsTextPaint.setTextSize(AndroidUtilities.dp(12.0f));
                this.counterStarsTextPaint.setTextAlign(align);
                this.counterStarsTextPaint.setColor(-1);
                this.chatTextPaint.setTypeface(AndroidUtilities.bold());
                this.chatTextPaint.setTextSize(AndroidUtilities.dp(13.0f));
                this.countriesTextPaint.setTextSize(AndroidUtilities.dp(13.0f));
                this.textPaint.setTextSize(AndroidUtilities.dp(14.0f));
                this.textDividerPaint.setTextSize(AndroidUtilities.dp(14.0f));
                this.textDividerPaint.setTextAlign(align);
            }
            if (this.avatarImageReceivers == null) {
                this.avatarImageReceivers = new ImageReceiver[10];
                this.avatarDrawables = new AvatarDrawable[10];
                this.avatarVisible = new boolean[10];
                int i2 = 0;
                while (true) {
                    ImageReceiver[] imageReceiverArr = this.avatarImageReceivers;
                    if (i2 >= imageReceiverArr.length) {
                        break;
                    }
                    imageReceiverArr[i2] = new ImageReceiver(this.parentView);
                    this.avatarImageReceivers[i2].setAllowLoadingOnAttachedOnly(true);
                    this.avatarImageReceivers[i2].setRoundRadius(AndroidUtilities.dp(12.0f));
                    this.avatarDrawables[i2] = new AvatarDrawable();
                    this.avatarDrawables[i2].setTextSize(AndroidUtilities.dp(18.0f));
                    this.clickRect[i2] = new Rect();
                    i2++;
                }
            }
            this.giftReceiver.setAllowStartLottieAnimation(false);
            if (this.giftDrawable == null) {
                int i3 = R.raw.giveaway_results;
                this.giftDrawable = new RLottieDrawable(i3, Fragment$$ExternalSyntheticOutline0.m(i3, ""), AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f));
            }
            this.giftReceiver.setImageBitmap(this.giftDrawable);
            TLRPC.TL_messageMediaGiveawayResults tL_messageMediaGiveawayResults = (TLRPC.TL_messageMediaGiveawayResults) messageObject.messageOwner.media;
            int size = tL_messageMediaGiveawayResults.winners.size();
            ImageReceiver[] imageReceiverArr2 = this.avatarImageReceivers;
            if (imageReceiverArr2.length < size) {
                int length = imageReceiverArr2.length;
                this.avatarImageReceivers = (ImageReceiver[]) Arrays.copyOf(imageReceiverArr2, size);
                this.avatarDrawables = (AvatarDrawable[]) Arrays.copyOf(this.avatarDrawables, size);
                this.avatarVisible = Arrays.copyOf(this.avatarVisible, size);
                this.userTitles = (CharSequence[]) Arrays.copyOf(this.userTitles, size);
                this.userTitleWidths = Arrays.copyOf(this.userTitleWidths, size);
                this.needNewRow = Arrays.copyOf(this.needNewRow, size);
                this.clickRect = (Rect[]) Arrays.copyOf(this.clickRect, size);
                this.users = (TLRPC.User[]) Arrays.copyOf(this.users, size);
                for (int i4 = length - 1; i4 < size; i4++) {
                    this.avatarImageReceivers[i4] = new ImageReceiver(this.parentView);
                    this.avatarImageReceivers[i4].setAllowLoadingOnAttachedOnly(true);
                    this.avatarImageReceivers[i4].setRoundRadius(AndroidUtilities.dp(12.0f));
                    this.avatarDrawables[i4] = new AvatarDrawable();
                    this.avatarDrawables[i4].setTextSize(AndroidUtilities.dp(18.0f));
                    this.clickRect[i4] = new Rect();
                }
            }
            int iDp = AndroidUtilities.dp(90.0f);
            int iDp2 = AndroidUtilities.dp(230.0f);
            SpannableStringBuilder spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.getString("BoostingGiveawayResultsMsgWinnersSelected", R.string.BoostingGiveawayResultsMsgWinnersSelected));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spannableStringBuilderReplaceTags);
            spannableStringBuilder.setSpan(new RelativeSizeSpan(1.05f), 0, spannableStringBuilderReplaceTags.length(), 33);
            this.topStringBuilder = new SpannableStringBuilder();
            SpannableStringBuilder spannableStringBuilderReplaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getPluralString("BoostingGiveawayResultsMsgWinnersTitle", tL_messageMediaGiveawayResults.winners_count), Theme.key_chat_messageLinkIn, 0, new GiveawayResultsMessageCell$$ExternalSyntheticLambda0(this, messageObject, tL_messageMediaGiveawayResults, 0));
            this.topStringBuilder.append((CharSequence) AndroidUtilities.replaceCharSequence("%1$d", spannableStringBuilderReplaceSingleTag, AndroidUtilities.replaceTags("**" + tL_messageMediaGiveawayResults.winners_count + "**")));
            this.topStringBuilder.append((CharSequence) "\n\n");
            this.topStringBuilder.setSpan(new RelativeSizeSpan(0.4f), this.topStringBuilder.length() - 1, this.topStringBuilder.length(), 33);
            SpannableStringBuilder spannableStringBuilderReplaceTags2 = AndroidUtilities.replaceTags(LocaleController.getPluralString("BoostingGiveawayResultsMsgWinners", tL_messageMediaGiveawayResults.winners_count));
            this.topStringBuilder.append((CharSequence) spannableStringBuilderReplaceTags2);
            this.topStringBuilder.setSpan(new RelativeSizeSpan(1.05f), spannableStringBuilderReplaceSingleTag.length() + 2, spannableStringBuilderReplaceTags2.length() + spannableStringBuilderReplaceSingleTag.length() + 2, 33);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            if (tL_messageMediaGiveawayResults.winners_count != tL_messageMediaGiveawayResults.winners.size()) {
                spannableStringBuilder2.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGiveawayResultsMsgAllAndMoreWinners", tL_messageMediaGiveawayResults.winners_count - tL_messageMediaGiveawayResults.winners.size(), new Object[0])));
                spannableStringBuilder2.setSpan(new RelativeSizeSpan(1.05f), 0, spannableStringBuilder2.length(), 33);
                spannableStringBuilder2.append((CharSequence) "\n");
            }
            boolean z2 = (tL_messageMediaGiveawayResults.flags & 32) != 0;
            this.isStars = z2;
            if (z2) {
                spannableStringBuilder2.append((CharSequence) LocaleController.formatPluralStringSpaced("BoostingStarsGiveawayResultsMsgAllWinnersReceivedLinks", (int) tL_messageMediaGiveawayResults.stars));
            } else {
                spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.BoostingGiveawayResultsMsgAllWinnersReceivedLinks));
            }
            TextPaint textPaint2 = this.textPaint;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
            float fDp = AndroidUtilities.dp(2.0f);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            this.titleLayout = StaticLayoutEx.createStaticLayout(spannableStringBuilder, textPaint2, iDp2, alignment, 1.0f, fDp, false, truncateAt, iDp2, 10);
            this.topLayout = StaticLayoutEx.createStaticLayout(this.topStringBuilder, this.textPaint, iDp2, alignment, 1.0f, AndroidUtilities.dp(2.0f), false, truncateAt, iDp2, 10);
            this.bottomLayout = StaticLayoutEx.createStaticLayout(spannableStringBuilder2, this.textPaint, iDp2, alignment, 1.0f, AndroidUtilities.dp(3.0f), false, truncateAt, iDp2, 10);
            int iMax = Math.max(i, iDp2);
            this.diffTextWidth = iMax - iDp2;
            float f = iMax;
            float f2 = iDp;
            float f3 = f2 / 2.0f;
            this.giftReceiver.setImageCoords((f / 2.0f) - f3, AndroidUtilities.dp(70.0f) - f3, f2, f2);
            StaticLayout staticLayout = this.titleLayout;
            int iDp3 = AndroidUtilities.dp(5.0f) + staticLayout.getLineBottom(staticLayout.getLineCount() - 1);
            this.titleHeight = iDp3;
            StaticLayout staticLayout2 = this.topLayout;
            this.topHeight = staticLayout2.getLineBottom(staticLayout2.getLineCount() - 1) + iDp3;
            StaticLayout staticLayout3 = this.bottomLayout;
            int lineBottom = this.measuredHeight + this.topHeight + staticLayout3.getLineBottom(staticLayout3.getLineCount() - 1);
            this.measuredHeight = lineBottom;
            this.measuredHeight = AndroidUtilities.dp(128.0f) + lineBottom;
            this.measuredWidth = iMax;
            if (this.isStars) {
                if (this.counterIcon == null) {
                    this.counterIcon = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.filled_giveaway_stars).mutate();
                }
                this.counterStr = LocaleController.formatNumber((int) tL_messageMediaGiveawayResults.stars, ',');
            } else {
                this.counterIcon = null;
                this.counterStr = "x" + tL_messageMediaGiveawayResults.winners_count;
            }
            TextPaint textPaint3 = this.counterTextPaint;
            String str = this.counterStr;
            textPaint3.getTextBounds(str, 0, str.length(), this.counterTextBounds);
            if (this.isStars) {
                Rect rect = this.counterTextBounds;
                rect.right = AndroidUtilities.dp(20.0f) + rect.right;
            }
            Arrays.fill(this.avatarVisible, false);
            this.measuredHeight = AndroidUtilities.dp(30.0f) + this.measuredHeight;
            ArrayList arrayList = new ArrayList(tL_messageMediaGiveawayResults.winners.size());
            ArrayList<Long> arrayList2 = tL_messageMediaGiveawayResults.winners;
            int size2 = arrayList2.size();
            int i5 = 0;
            while (i5 < size2) {
                Long l = arrayList2.get(i5);
                i5++;
                Long l2 = l;
                if (MessagesController.getInstance(UserConfig.selectedAccount).getUser(l2) != null) {
                    arrayList.add(l2);
                }
            }
            int i6 = 0;
            float f4 = 0.0f;
            while (i6 < arrayList.size()) {
                Long l3 = (Long) arrayList.get(i6);
                long jLongValue = l3.longValue();
                TLRPC.User user3 = MessagesController.getInstance(UserConfig.selectedAccount).getUser(l3);
                if (user3 != null) {
                    this.avatarVisible[i6] = z;
                    this.users[i6] = user3;
                    user = user2;
                    this.userTitles[i6] = TextUtils.ellipsize(Emoji.replaceEmoji(UserObject.getUserName(user3), this.chatTextPaint.getFontMetricsInt(), false), this.chatTextPaint, f * 0.8f, TextUtils.TruncateAt.END);
                    float[] fArr = this.userTitleWidths;
                    TextPaint textPaint4 = this.chatTextPaint;
                    CharSequence charSequence = this.userTitles[i6];
                    fArr[i6] = textPaint4.measureText(charSequence, 0, charSequence.length());
                    float fDp2 = this.userTitleWidths[i6] + AndroidUtilities.dp(40.0f);
                    f4 += fDp2;
                    if (i6 > 0) {
                        boolean[] zArr = this.needNewRow;
                        boolean z3 = f4 > 0.9f * f;
                        zArr[i6] = z3;
                        if (z3) {
                            this.measuredHeight = AndroidUtilities.dp(30.0f) + this.measuredHeight;
                            f4 = fDp2;
                        }
                    } else {
                        this.needNewRow[i6] = false;
                    }
                    this.avatarDrawables[i6].setInfo(user3);
                    this.avatarImageReceivers[i6].setForUserOrChat(user3, this.avatarDrawables[i6]);
                    this.avatarImageReceivers[i6].setImageCoords(0.0f, 0.0f, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
                } else {
                    user = user2;
                    this.users[i6] = user;
                    this.avatarVisible[i6] = false;
                    this.userTitles[i6] = "";
                    this.needNewRow[i6] = false;
                    this.userTitleWidths[i6] = AndroidUtilities.dp(20.0f);
                    this.avatarDrawables[i6].setInfo(jLongValue, "", "");
                }
                i6++;
                user2 = user;
                z = true;
            }
        }
    }
}
