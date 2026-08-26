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
import android.text.style.RelativeSizeSpan;
import android.util.StateSet;
import android.view.MotionEvent;
import com.google.android.gms.internal.mlkit_vision_common.zzlc;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.BaseCell;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Cells.DialogCell$$ExternalSyntheticLambda6;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.Premium.boosts.BoostRepository;
import org.telegram.ui.Components.StaticLayoutEx;
import org.telegram.ui.LinkEditActivity$$ExternalSyntheticLambda9;
import org.telegram.ui.iv.RichDetailsCell;

public final class GiveawayMessageCell {
    public static final HashMap monthsToEmoticon;
    public int additionPrizeHeight;
    public StaticLayout additionPrizeLayout;
    public AvatarDrawable[] avatarDrawables;
    public ImageReceiver[] avatarImageReceivers;
    public boolean[] avatarVisible;
    public int bottomHeight;
    public StaticLayout bottomLayout;
    public Paint chatBgPaint;
    public RectF chatRect;
    public TextPaint chatTextPaint;
    public float[] chatTitleWidths;
    public CharSequence[] chatTitles;
    public TLRPC.Chat[] chats;
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
    public int countriesHeight;
    public StaticLayout countriesLayout;
    public TextPaint countriesTextPaint;
    public int diffTextWidth;
    public ImageReceiver giftReceiver;
    public boolean isStars;
    public Paint lineDividerPaint;
    public MessageObject messageObject;
    public boolean[] needNewRow;
    public final ChatMessageCell parentView;
    public int[] pressedState;
    public Paint saveLayerPaint;
    public int selectorColor;
    public BaseCell.RippleDrawableSafe selectorDrawable;
    public String textDivider;
    public TextPaint textDividerPaint;
    public float textDividerWidth;
    public TextPaint textPaint;
    public int titleHeight;
    public StaticLayout titleLayout;
    public int topHeight;
    public StaticLayout topLayout;
    public int measuredHeight = 0;
    public int measuredWidth = 0;
    public int pressedPos = -1;
    public boolean isButtonPressed = false;
    public boolean isContainerPressed = false;

    static {
        HashMap map = new HashMap();
        monthsToEmoticon = map;
        zzlc.m(1, map, "1⃣", 3, "2⃣");
        zzlc.m(6, map, "3⃣", 12, "4⃣");
        map.put(24, "5⃣");
    }

    public GiveawayMessageCell(ChatMessageCell chatMessageCell) {
        this.parentView = chatMessageCell;
    }

    public final boolean checkMotionEvent(MotionEvent motionEvent) {
        MessageObject messageObject = this.messageObject;
        if (messageObject != null && messageObject.isGiveaway()) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (motionEvent.getAction() == 0) {
                int i = 0;
                while (true) {
                    Rect[] rectArr = this.clickRect;
                    if (i >= rectArr.length) {
                        if (!this.containerRect.contains(x, y)) {
                            break;
                        }
                        this.isContainerPressed = true;
                        return true;
                    }
                    if (rectArr[i].contains(x, y)) {
                        this.pressedPos = i;
                        this.selectorDrawable.setHotspot(x, y);
                        this.isButtonPressed = true;
                        setButtonPressed(true);
                        return true;
                    }
                    i++;
                }
            } else if (motionEvent.getAction() == 1) {
                if (this.isButtonPressed) {
                    ChatMessageCell chatMessageCell = this.parentView;
                    if (chatMessageCell.getDelegate() != null) {
                        chatMessageCell.getDelegate().didPressGiveawayChatButton(this.pressedPos, chatMessageCell);
                    }
                    chatMessageCell.playSoundEffect(0);
                    setButtonPressed(false);
                    this.isButtonPressed = false;
                }
                if (this.isContainerPressed) {
                    this.isContainerPressed = false;
                    MessageObject messageObject2 = this.messageObject;
                    if (messageObject2 != null && messageObject2.messageOwner != null) {
                        BoostRepository.getGiveawayInfo(messageObject2, new DialogCell$$ExternalSyntheticLambda6(messageObject2, 28), new LinkEditActivity$$ExternalSyntheticLambda9(4));
                        return false;
                    }
                }
            } else if (motionEvent.getAction() != 2 && motionEvent.getAction() == 3) {
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
        float f;
        boolean[] zArr;
        int color;
        int i3;
        Canvas canvas2 = canvas;
        MessageObject messageObject = this.messageObject;
        if (messageObject == null || !messageObject.isGiveaway()) {
            return;
        }
        BaseCell.RippleDrawableSafe rippleDrawableSafe = this.selectorDrawable;
        ChatMessageCell chatMessageCell = this.parentView;
        int i4 = 0;
        if (rippleDrawableSafe == null) {
            int color2 = Theme.getColor(null, Theme.key_listSelector, false);
            this.selectorColor = color2;
            BaseCell.RippleDrawableSafe rippleDrawableSafeCreateRadSelectorDrawable = Theme.createRadSelectorDrawable(color2, 12, 12);
            this.selectorDrawable = rippleDrawableSafeCreateRadSelectorDrawable;
            rippleDrawableSafeCreateRadSelectorDrawable.setCallback(chatMessageCell);
        }
        this.textPaint.setColor(Theme.chat_msgTextPaint.getColor());
        this.textDividerPaint.setColor(Theme.multAlpha(0.45f, Theme.chat_msgTextPaint.getColor()));
        this.lineDividerPaint.setColor(Theme.multAlpha(0.15f, Theme.chat_msgTextPaint.getColor()));
        this.countriesTextPaint.setColor(Theme.chat_msgTextPaint.getColor());
        if (this.messageObject.isOutOwner()) {
            TextPaint textPaint = this.chatTextPaint;
            int i5 = Theme.key_chat_outPreviewInstantText;
            textPaint.setColor(Theme.getColor(i5, resourcesProvider));
            this.counterBgPaint.setColor(Theme.getColor(i5, resourcesProvider));
            this.chatBgPaint.setColor(Theme.getColor(Theme.key_chat_outReplyLine, resourcesProvider));
        } else {
            TextPaint textPaint2 = this.chatTextPaint;
            int i6 = Theme.key_chat_inPreviewInstantText;
            textPaint2.setColor(Theme.getColor(i6, resourcesProvider));
            this.counterBgPaint.setColor(Theme.getColor(i6, resourcesProvider));
            this.chatBgPaint.setColor(Theme.getColor(Theme.key_chat_inReplyLine, resourcesProvider));
        }
        if (this.isStars) {
            this.counterBgPaint.setColor(Theme.getColor(Theme.key_starsGradient1, resourcesProvider));
        }
        canvas2.save();
        int iDp = i2 - AndroidUtilities.dp(4.0f);
        canvas2.translate(iDp, i);
        this.containerRect.set(iDp, i, this.measuredWidth + iDp, this.measuredHeight + i);
        canvas2.saveLayer(0.0f, 0.0f, this.measuredWidth, this.measuredHeight, this.saveLayerPaint, 31);
        this.giftReceiver.draw(canvas2);
        float f2 = this.measuredWidth / 2.0f;
        float fDp = AndroidUtilities.dp(106.0f);
        int iDp2 = AndroidUtilities.dp(12.0f) + this.counterTextBounds.width();
        int iDp3 = AndroidUtilities.dp(10.0f) + this.counterTextBounds.height();
        this.countRect.set(f2 - ((AndroidUtilities.dp(2.0f) + iDp2) / 2.0f), fDp - ((AndroidUtilities.dp(2.0f) + iDp3) / 2.0f), ((AndroidUtilities.dp(2.0f) + iDp2) / 2.0f) + f2, ((AndroidUtilities.dp(2.0f) + iDp3) / 2.0f) + fDp);
        canvas2.drawRoundRect(this.countRect, AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), this.clipRectPaint);
        float f3 = iDp2 / 2.0f;
        float f4 = iDp3 / 2.0f;
        this.countRect.set(f2 - f3, fDp - f4, f2 + f3, fDp + f4);
        canvas2.drawRoundRect(this.countRect, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), this.counterBgPaint);
        Drawable drawable = this.counterIcon;
        if (drawable != null) {
            drawable.setBounds(AndroidUtilities.dp(5.0f) + ((int) this.countRect.left), ((int) this.countRect.centerY()) - AndroidUtilities.dp(6.96f), AndroidUtilities.dp(21.24f) + ((int) this.countRect.left), AndroidUtilities.dp(6.96f) + ((int) this.countRect.centerY()));
            this.counterIcon.draw(canvas2);
        }
        canvas2.drawText(this.counterStr, this.countRect.centerX() + AndroidUtilities.dp(this.isStars ? 8.0f : 0.0f), this.countRect.centerY() + AndroidUtilities.dp(4.0f), this.isStars ? this.counterStarsTextPaint : this.counterTextPaint);
        canvas2.restore();
        canvas2.translate(0.0f, AndroidUtilities.dp(128.0f));
        int iDp4 = AndroidUtilities.dp(128.0f) + i;
        canvas2.save();
        canvas2.translate(this.diffTextWidth / 2.0f, 0.0f);
        this.titleLayout.draw(canvas2);
        canvas2.translate(0.0f, this.titleHeight);
        if (this.additionPrizeLayout != null) {
            canvas2.restore();
            canvas2.save();
            float fDp2 = (this.titleHeight + this.additionPrizeHeight) - AndroidUtilities.dp(6.0f);
            float f5 = this.measuredWidth / 2.0f;
            canvas2.drawText(this.textDivider, f5, fDp2, this.textDividerPaint);
            f = 16.0f;
            canvas2.drawLine(AndroidUtilities.dp(17.0f), fDp2 - AndroidUtilities.dp(4.0f), (f5 - (this.textDividerWidth / 2.0f)) - AndroidUtilities.dp(6.0f), fDp2 - AndroidUtilities.dp(4.0f), this.lineDividerPaint);
            canvas2 = canvas;
            canvas2.drawLine(AndroidUtilities.dp(6.0f) + (this.textDividerWidth / 2.0f) + f5, fDp2 - AndroidUtilities.dp(4.0f), this.measuredWidth - AndroidUtilities.dp(16.0f), fDp2 - AndroidUtilities.dp(4.0f), this.lineDividerPaint);
            canvas2.translate((this.measuredWidth - this.additionPrizeLayout.getWidth()) / 2.0f, this.titleHeight);
            this.additionPrizeLayout.draw(canvas2);
            canvas2.restore();
            canvas2.save();
            canvas2.translate(this.diffTextWidth / 2.0f, this.additionPrizeHeight + this.titleHeight);
        } else {
            f = 16.0f;
        }
        this.topLayout.draw(canvas2);
        canvas2.restore();
        canvas2.translate(0.0f, AndroidUtilities.dp(6.0f) + this.topHeight);
        int iM = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(this.topHeight, 6.0f, iDp4);
        int i7 = 0;
        int i8 = 0;
        while (true) {
            boolean[] zArr2 = this.avatarVisible;
            if (i7 >= zArr2.length) {
                break;
            }
            if (zArr2[i7]) {
                canvas2.save();
                int i9 = i7;
                float fDp3 = 0.0f;
                do {
                    fDp3 += this.chatTitleWidths[i9] + AndroidUtilities.dp(40.0f);
                    i9++;
                    zArr = this.avatarVisible;
                    if (i9 >= zArr.length || this.needNewRow[i9]) {
                        break;
                    }
                } while (zArr[i9]);
                float f6 = f2 - (fDp3 / 2.0f);
                canvas2.translate(f6, 0.0f);
                int iWidth = ((int) f6) + iDp;
                int i10 = i7;
                while (true) {
                    TLRPC.Chat chat = this.chats[i10];
                    if (this.messageObject.isOutOwner()) {
                        color = Theme.getColor(Theme.key_chat_outPreviewInstantText, resourcesProvider);
                    } else {
                        int colorId = ChatObject.getColorId(chat);
                        if (colorId < 7) {
                            color = Theme.getColor(Theme.keys_avatar_nameInMessage[colorId], resourcesProvider);
                        } else {
                            MessagesController.PeerColors peerColors = MessagesController.getInstance(UserConfig.selectedAccount).peerColors;
                            MessagesController.PeerColor color3 = peerColors == null ? null : peerColors.getColor(colorId);
                            color = color3 != null ? color3.getColor(i4, resourcesProvider) : Theme.getColor(Theme.keys_avatar_nameInMessage[i4], resourcesProvider);
                        }
                    }
                    int i11 = this.pressedPos;
                    i3 = (i11 < 0 || i11 != i10) ? i8 : color;
                    this.chatTextPaint.setColor(color);
                    this.chatBgPaint.setColor(color);
                    this.chatBgPaint.setAlpha(25);
                    this.avatarImageReceivers[i10].draw(canvas2);
                    CharSequence charSequence = this.chatTitles[i10];
                    int i12 = iWidth;
                    canvas2.drawText(charSequence, 0, charSequence.length(), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(f), this.chatTextPaint);
                    this.chatRect.set(0.0f, 0.0f, this.chatTitleWidths[i10] + AndroidUtilities.dp(40.0f), AndroidUtilities.dp(24.0f));
                    canvas2.drawRoundRect(this.chatRect, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), this.chatBgPaint);
                    float f7 = i12;
                    this.clickRect[i10].set(i12, iM, (int) (this.chatRect.width() + f7), AndroidUtilities.dp(24.0f) + iM);
                    canvas2.translate(this.chatRect.width() + AndroidUtilities.dp(6.0f), 0.0f);
                    iWidth = (int) (this.chatRect.width() + AndroidUtilities.dp(6.0f) + f7);
                    i10++;
                    boolean[] zArr3 = this.avatarVisible;
                    if (i10 >= zArr3.length || this.needNewRow[i10] || !zArr3[i10]) {
                        break;
                    }
                    i8 = i3;
                    i4 = 0;
                }
                canvas2.restore();
                canvas2.translate(0.0f, AndroidUtilities.dp(30.0f));
                iM += AndroidUtilities.dp(30.0f);
                i7 = i10;
                i8 = i3;
            } else {
                i7++;
            }
            i4 = 0;
        }
        if (this.countriesLayout != null) {
            canvas2.save();
            canvas2.translate((this.measuredWidth - this.countriesLayout.getWidth()) / 2.0f, AndroidUtilities.dp(4.0f));
            this.countriesLayout.draw(canvas2);
            canvas2.restore();
            canvas2.translate(0.0f, this.countriesHeight);
        }
        canvas2.translate(0.0f, AndroidUtilities.dp(6.0f));
        canvas2.save();
        canvas2.translate(this.diffTextWidth / 2.0f, 0.0f);
        this.bottomLayout.draw(canvas2);
        canvas2.restore();
        canvas2.restore();
        if (this.pressedPos >= 0) {
            int iMultAlpha = Theme.multAlpha(Theme.currentTheme.isDark() ? 0.12f : 0.1f, i8);
            if (this.selectorColor != iMultAlpha) {
                BaseCell.RippleDrawableSafe rippleDrawableSafe2 = this.selectorDrawable;
                this.selectorColor = iMultAlpha;
                Theme.setSelectorDrawableColor(rippleDrawableSafe2, iMultAlpha, true);
            }
            this.selectorDrawable.setBounds(this.clickRect[this.pressedPos]);
            this.selectorDrawable.setCallback(chatMessageCell);
        }
    }

    public final void setButtonPressed(boolean z) {
        BaseCell.RippleDrawableSafe rippleDrawableSafe;
        MessageObject messageObject = this.messageObject;
        if (messageObject == null || !messageObject.isGiveaway() || (rippleDrawableSafe = this.selectorDrawable) == null) {
            return;
        }
        ChatMessageCell chatMessageCell = this.parentView;
        if (!z) {
            rippleDrawableSafe.setState(StateSet.NOTHING);
            chatMessageCell.invalidate();
        } else {
            rippleDrawableSafe.setCallback(new RichDetailsCell.AnonymousClass1(this, 5));
            this.selectorDrawable.setState(this.pressedState);
            chatMessageCell.invalidate();
        }
    }

    public final void setMessageContent(int i, int i2, MessageObject messageObject) {
        float f;
        float f2;
        TLRPC.Document document;
        int i3 = 1;
        this.messageObject = null;
        this.titleLayout = null;
        this.additionPrizeLayout = null;
        this.topLayout = null;
        this.bottomLayout = null;
        this.countriesLayout = null;
        this.measuredHeight = 0;
        this.measuredWidth = 0;
        this.additionPrizeHeight = 0;
        this.textDividerWidth = 0.0f;
        if (messageObject.isGiveaway()) {
            this.messageObject = messageObject;
            if (this.counterTextPaint == null) {
                this.counterTextPaint = new TextPaint(1);
                this.counterStarsTextPaint = new TextPaint(1);
                this.chatTextPaint = new TextPaint(1);
                this.textPaint = new TextPaint(1);
                this.textDividerPaint = new TextPaint(1);
                this.lineDividerPaint = new Paint(1);
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
                this.chatTitles = new CharSequence[10];
                this.chats = new TLRPC.Chat[10];
                this.chatTitleWidths = new float[10];
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
                int i4 = 0;
                while (true) {
                    ImageReceiver[] imageReceiverArr = this.avatarImageReceivers;
                    if (i4 >= imageReceiverArr.length) {
                        break;
                    }
                    imageReceiverArr[i4] = new ImageReceiver(this.parentView);
                    this.avatarImageReceivers[i4].setAllowLoadingOnAttachedOnly(true);
                    this.avatarImageReceivers[i4].setRoundRadius(AndroidUtilities.dp(12.0f));
                    this.avatarDrawables[i4] = new AvatarDrawable((Theme.ResourcesProvider) null);
                    this.avatarDrawables[i4].namePaint.setTextSize(AndroidUtilities.dp(18.0f));
                    this.clickRect[i4] = new Rect();
                    i4++;
                }
            }
            TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway = (TLRPC.TL_messageMediaGiveaway) messageObject.messageOwner.media;
            String str = UserConfig.getInstance(UserConfig.selectedAccount).premiumGiftsStickerPack;
            if (str == null) {
                MediaDataController.getInstance(UserConfig.selectedAccount).checkPremiumGiftStickers();
                f = 12.0f;
                f2 = 18.0f;
            } else {
                TLRPC.TL_messages_stickerSet stickerSetByName = MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSetByName(str);
                if (stickerSetByName == null) {
                    stickerSetByName = MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSetByEmojiOrName(str);
                }
                if (stickerSetByName != null) {
                    String str2 = (String) monthsToEmoticon.get(Integer.valueOf(tL_messageMediaGiveaway.months));
                    ArrayList<TLRPC.TL_stickerPack> arrayList = stickerSetByName.packs;
                    int size = arrayList.size();
                    document = null;
                    int i5 = 0;
                    while (true) {
                        if (i5 >= size) {
                            f = 12.0f;
                            f2 = 18.0f;
                            break;
                        }
                        TLRPC.TL_stickerPack tL_stickerPack = arrayList.get(i5);
                        i5 += i3;
                        f = 12.0f;
                        TLRPC.TL_stickerPack tL_stickerPack2 = tL_stickerPack;
                        f2 = 18.0f;
                        if (!Objects.equals(tL_stickerPack2.emoticon, str2)) {
                            break;
                            break;
                        }
                        ArrayList<Long> arrayList2 = tL_stickerPack2.documents;
                        int size2 = arrayList2.size();
                        int i6 = 0;
                        while (true) {
                            if (i6 >= size2) {
                                break;
                            }
                            Long l = arrayList2.get(i6);
                            i6 += i3;
                            long jLongValue = l.longValue();
                            ArrayList<TLRPC.Document> arrayList3 = stickerSetByName.documents;
                            int size3 = arrayList3.size();
                            int i7 = 0;
                            while (i7 < size3) {
                                TLRPC.Document document2 = arrayList3.get(i7);
                                int i8 = i7 + 1;
                                TLRPC.Document document3 = document2;
                                ArrayList<TLRPC.Document> arrayList4 = arrayList3;
                                if (document3.id == jLongValue) {
                                    document = document3;
                                    break;
                                } else {
                                    arrayList3 = arrayList4;
                                    i7 = i8;
                                }
                            }
                            if (document != null) {
                                break;
                            } else {
                                i3 = 1;
                            }
                        }
                        if (document != null) {
                            break;
                        } else {
                            i3 = 1;
                        }
                    }
                    if (document == null && !stickerSetByName.documents.isEmpty()) {
                        document = stickerSetByName.documents.get(0);
                    }
                } else {
                    f = 12.0f;
                    f2 = 18.0f;
                    document = null;
                }
                if (document != null) {
                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document.thumbs, Theme.key_emptyListPlaceholder, 0.2f);
                    if (svgThumb != null) {
                        svgThumb.overrideWidthAndHeight(512, 512);
                    }
                    this.giftReceiver.setImage(ImageLocation.getForDocument(document), "160_160_firstframe", svgThumb, "tgs", stickerSetByName, 1);
                } else {
                    MediaDataController.getInstance(UserConfig.selectedAccount).loadStickersByEmojiOrName(str, false, stickerSetByName == null);
                }
            }
            TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway2 = (TLRPC.TL_messageMediaGiveaway) messageObject.messageOwner.media;
            this.isStars = (tL_messageMediaGiveaway2.flags & 32) != 0;
            int size4 = tL_messageMediaGiveaway2.channels.size();
            ImageReceiver[] imageReceiverArr2 = this.avatarImageReceivers;
            if (imageReceiverArr2.length < size4) {
                int length = imageReceiverArr2.length;
                this.avatarImageReceivers = (ImageReceiver[]) Arrays.copyOf(imageReceiverArr2, size4);
                this.avatarDrawables = (AvatarDrawable[]) Arrays.copyOf(this.avatarDrawables, size4);
                this.avatarVisible = Arrays.copyOf(this.avatarVisible, size4);
                this.chatTitles = (CharSequence[]) Arrays.copyOf(this.chatTitles, size4);
                this.chatTitleWidths = Arrays.copyOf(this.chatTitleWidths, size4);
                this.needNewRow = Arrays.copyOf(this.needNewRow, size4);
                this.clickRect = (Rect[]) Arrays.copyOf(this.clickRect, size4);
                this.chats = (TLRPC.Chat[]) Arrays.copyOf(this.chats, size4);
                for (int i9 = length - 1; i9 < size4; i9++) {
                    this.avatarImageReceivers[i9] = new ImageReceiver(this.parentView);
                    this.avatarImageReceivers[i9].setAllowLoadingOnAttachedOnly(true);
                    this.avatarImageReceivers[i9].setRoundRadius(AndroidUtilities.dp(f));
                    this.avatarDrawables[i9] = new AvatarDrawable((Theme.ResourcesProvider) null);
                    this.avatarDrawables[i9].namePaint.setTextSize(AndroidUtilities.dp(f2));
                    this.clickRect[i9] = new Rect();
                }
            }
            int iDp = AndroidUtilities.dp(148.0f);
            int minTabletSide = AndroidUtilities.isTablet() ? AndroidUtilities.getMinTabletSide() - AndroidUtilities.dp(80.0f) : i - AndroidUtilities.dp(80.0f);
            MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
            boolean zIsForwarded = messageObject.isForwarded();
            TLRPC.Message message = messageObject.messageOwner;
            boolean zIsChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(messagesController.getChat(Long.valueOf(-MessageObject.getPeerId(zIsForwarded ? message.fwd_from.from_id : message.peer_id))));
            SpannableStringBuilder spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.BoostingGiveawayPrizes));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spannableStringBuilderReplaceTags);
            spannableStringBuilder.setSpan(new RelativeSizeSpan(1.05f), 0, spannableStringBuilderReplaceTags.length(), 33);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            if (this.isStars) {
                spannableStringBuilder2.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("BoostingStarsGiveawayMsgInfoPlural1", (int) tL_messageMediaGiveaway2.stars)));
                spannableStringBuilder2.append((CharSequence) "\n");
                spannableStringBuilder2.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingStarsGiveawayMsgInfoPlural2", tL_messageMediaGiveaway2.quantity, new Object[0])));
            } else {
                spannableStringBuilder2.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("BoostingGiveawayMsgInfoPlural1", tL_messageMediaGiveaway2.quantity)));
                spannableStringBuilder2.append((CharSequence) "\n");
                spannableStringBuilder2.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGiveawayMsgInfoPlural2", tL_messageMediaGiveaway2.quantity, LocaleController.formatPluralString("BoldMonths", tL_messageMediaGiveaway2.months, new Object[0]))));
            }
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
            spannableStringBuilder3.append((CharSequence) spannableStringBuilder2);
            spannableStringBuilder3.append((CharSequence) "\n\n");
            spannableStringBuilder3.setSpan(new RelativeSizeSpan(0.4f), spannableStringBuilder3.length() - 1, spannableStringBuilder3.length(), 33);
            SpannableStringBuilder spannableStringBuilderReplaceTags2 = AndroidUtilities.replaceTags(LocaleController.getString("BoostingGiveawayMsgParticipants", R.string.BoostingGiveawayMsgParticipants));
            spannableStringBuilder3.append((CharSequence) spannableStringBuilderReplaceTags2);
            spannableStringBuilder3.setSpan(new RelativeSizeSpan(1.05f), spannableStringBuilder2.length() + 2, spannableStringBuilderReplaceTags2.length() + spannableStringBuilder2.length() + 2, 33);
            spannableStringBuilder3.append((CharSequence) "\n");
            if (tL_messageMediaGiveaway2.only_new_subscribers) {
                spannableStringBuilder3.append((CharSequence) LocaleController.formatPluralString(zIsChannelAndNotMegaGroup ? "BoostingGiveawayMsgNewSubsPlural" : "BoostingGiveawayMsgNewSubsGroupPlural", tL_messageMediaGiveaway2.channels.size(), new Object[0]));
            } else {
                spannableStringBuilder3.append((CharSequence) LocaleController.formatPluralString(zIsChannelAndNotMegaGroup ? "BoostingGiveawayMsgAllSubsPlural" : "BoostingGiveawayMsgAllSubsGroupPlural", tL_messageMediaGiveaway2.channels.size(), new Object[0]));
            }
            SpannableStringBuilder spannableStringBuilderReplaceTags3 = AndroidUtilities.replaceTags(LocaleController.getString("BoostingWinnersDate", R.string.BoostingWinnersDate));
            SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(spannableStringBuilderReplaceTags3);
            spannableStringBuilder4.setSpan(new RelativeSizeSpan(1.05f), 0, spannableStringBuilderReplaceTags3.length(), 33);
            Date date = new Date(((long) tL_messageMediaGiveaway2.until_date) * 1000);
            String str3 = LocaleController.getInstance().getFormatterGiveawayCard().format(date);
            String str4 = LocaleController.getInstance().getFormatterDay().format(date);
            spannableStringBuilder4.append((CharSequence) "\n");
            spannableStringBuilder4.append((CharSequence) LocaleController.formatString("formatDateAtTime", R.string.formatDateAtTime, str3, str4));
            TextPaint textPaint2 = this.textPaint;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
            float fDp = AndroidUtilities.dp(2.0f);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            this.titleLayout = StaticLayoutEx.createStaticLayout(spannableStringBuilder, textPaint2, minTabletSide, alignment, fDp, false, truncateAt, minTabletSide, 10, true);
            this.topLayout = StaticLayoutEx.createStaticLayout(spannableStringBuilder3, this.textPaint, minTabletSide, alignment, AndroidUtilities.dp(2.0f), false, truncateAt, minTabletSide, 10, true);
            this.bottomLayout = StaticLayoutEx.createStaticLayout(spannableStringBuilder4, this.textPaint, minTabletSide, alignment, AndroidUtilities.dp(3.0f), false, truncateAt, minTabletSide, 10, true);
            int iDp2 = 0;
            for (int i10 = 0; i10 < this.titleLayout.getLineCount(); i10++) {
                iDp2 = (int) Math.max(iDp2, Math.ceil(this.titleLayout.getLineWidth(i10)));
            }
            for (int i11 = 0; i11 < this.topLayout.getLineCount(); i11++) {
                iDp2 = (int) Math.max(iDp2, Math.ceil(this.topLayout.getLineWidth(i11)));
            }
            for (int i12 = 0; i12 < this.bottomLayout.getLineCount(); i12++) {
                iDp2 = (int) Math.max(iDp2, Math.ceil(this.bottomLayout.getLineWidth(i12)));
            }
            if (iDp2 < AndroidUtilities.dp(180.0f)) {
                iDp2 = AndroidUtilities.dp(180.0f);
            }
            int i13 = iDp2;
            String str5 = tL_messageMediaGiveaway2.prize_description;
            if (str5 != null && !str5.isEmpty()) {
                StaticLayout staticLayoutCreateStaticLayout = StaticLayoutEx.createStaticLayout(Emoji.replaceEmoji(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGiveawayMsgPrizes", tL_messageMediaGiveaway2.quantity, tL_messageMediaGiveaway2.prize_description)), this.countriesTextPaint.getFontMetricsInt(), false), this.textPaint, i13, Layout.Alignment.ALIGN_CENTER, AndroidUtilities.dp(2.0f), false, TextUtils.TruncateAt.END, i13, 20, true);
                this.additionPrizeLayout = staticLayoutCreateStaticLayout;
                this.additionPrizeHeight = AndroidUtilities.dp(22.0f) + staticLayoutCreateStaticLayout.getLineBottom(staticLayoutCreateStaticLayout.getLineCount() - 1);
                String string = LocaleController.getString(R.string.BoostingGiveawayMsgWithDivider);
                this.textDivider = string;
                this.textDividerWidth = this.textDividerPaint.measureText(string, 0, string.length());
            }
            if (tL_messageMediaGiveaway2.countries_iso2.size() > 0) {
                ArrayList arrayList5 = new ArrayList();
                ArrayList<String> arrayList6 = tL_messageMediaGiveaway2.countries_iso2;
                int size5 = arrayList6.size();
                int i14 = 0;
                while (i14 < size5) {
                    String str6 = arrayList6.get(i14);
                    i14++;
                    String str7 = str6;
                    String displayCountry = new Locale("", str7).getDisplayCountry(Locale.getDefault());
                    String languageFlag = LocaleController.getLanguageFlag(str7);
                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder();
                    if (languageFlag != null) {
                        spannableStringBuilder5.append((CharSequence) languageFlag).append((CharSequence) " ");
                    }
                    spannableStringBuilder5.append((CharSequence) displayCountry);
                    arrayList5.add(spannableStringBuilder5);
                }
                if (!arrayList5.isEmpty()) {
                    this.countriesLayout = StaticLayoutEx.createStaticLayout(Emoji.replaceEmoji(AndroidUtilities.replaceTags(LocaleController.formatString("BoostingGiveAwayFromCountries", R.string.BoostingGiveAwayFromCountries, TextUtils.join(", ", arrayList5))), this.countriesTextPaint.getFontMetricsInt(), false), this.countriesTextPaint, i13, Layout.Alignment.ALIGN_CENTER, 0.0f, false, TextUtils.TruncateAt.END, i13, 10, true);
                }
            }
            int iMax = Math.max(i2, Math.min(AndroidUtilities.dp(38.0f) + i13, minTabletSide));
            this.diffTextWidth = iMax - minTabletSide;
            float f3 = iMax;
            float f4 = iDp;
            float f5 = f4 / 2.0f;
            this.giftReceiver.setImageCoords((f3 / 2.0f) - f5, AndroidUtilities.dp(42.0f) - f5, f4, f4);
            StaticLayout staticLayout = this.titleLayout;
            int iDp3 = AndroidUtilities.dp(5.0f) + staticLayout.getLineBottom(staticLayout.getLineCount() - 1);
            this.titleHeight = iDp3;
            int i15 = iDp3 + this.additionPrizeHeight;
            StaticLayout staticLayout2 = this.topLayout;
            this.topHeight = staticLayout2.getLineBottom(staticLayout2.getLineCount() - 1) + i15;
            StaticLayout staticLayout3 = this.bottomLayout;
            this.bottomHeight = staticLayout3.getLineBottom(staticLayout3.getLineCount() - 1);
            StaticLayout staticLayout4 = this.countriesLayout;
            int lineBottom = staticLayout4 != null ? staticLayout4.getLineBottom(staticLayout4.getLineCount() - 1) + AndroidUtilities.dp(f) : 0;
            this.countriesHeight = lineBottom;
            int i16 = this.measuredHeight + this.topHeight + lineBottom + this.bottomHeight;
            this.measuredHeight = i16;
            this.measuredHeight = AndroidUtilities.dp(128.0f) + i16;
            this.measuredWidth = iMax;
            if (this.isStars) {
                if (this.counterIcon == null) {
                    this.counterIcon = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.filled_giveaway_stars).mutate();
                }
                this.counterStr = LocaleController.formatNumber((int) tL_messageMediaGiveaway2.stars, ',');
            } else {
                this.counterIcon = null;
                this.counterStr = "x" + tL_messageMediaGiveaway2.quantity;
            }
            TextPaint textPaint3 = this.counterTextPaint;
            String str8 = this.counterStr;
            textPaint3.getTextBounds(str8, 0, str8.length(), this.counterTextBounds);
            if (tL_messageMediaGiveaway2.stars != 0) {
                Rect rect = this.counterTextBounds;
                rect.right = AndroidUtilities.dp(20.0f) + rect.right;
            }
            Arrays.fill(this.avatarVisible, false);
            this.measuredHeight = AndroidUtilities.dp(30.0f) + this.measuredHeight;
            ArrayList arrayList7 = new ArrayList(tL_messageMediaGiveaway2.channels.size());
            ArrayList<Long> arrayList8 = tL_messageMediaGiveaway2.channels;
            int size6 = arrayList8.size();
            int i17 = 0;
            while (i17 < size6) {
                Long l2 = arrayList8.get(i17);
                i17++;
                Long l3 = l2;
                if (MessagesController.getInstance(UserConfig.selectedAccount).getChat(l3) != null) {
                    arrayList7.add(l3);
                }
            }
            float f6 = 0.0f;
            for (int i18 = 0; i18 < arrayList7.size(); i18++) {
                Long l4 = (Long) arrayList7.get(i18);
                long jLongValue2 = l4.longValue();
                TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(l4);
                if (chat != null) {
                    this.avatarVisible[i18] = true;
                    this.chats[i18] = chat;
                    this.chatTitles[i18] = TextUtils.ellipsize(Emoji.replaceEmoji(chat.title, this.chatTextPaint.getFontMetricsInt(), false), this.chatTextPaint, 0.8f * f3, TextUtils.TruncateAt.END);
                    float[] fArr = this.chatTitleWidths;
                    TextPaint textPaint4 = this.chatTextPaint;
                    CharSequence charSequence = this.chatTitles[i18];
                    fArr[i18] = textPaint4.measureText(charSequence, 0, charSequence.length());
                    float fDp2 = this.chatTitleWidths[i18] + AndroidUtilities.dp(40.0f);
                    f6 += fDp2;
                    if (i18 > 0) {
                        boolean[] zArr = this.needNewRow;
                        boolean z = f6 > 0.9f * f3;
                        zArr[i18] = z;
                        if (z) {
                            this.measuredHeight = AndroidUtilities.dp(30.0f) + this.measuredHeight;
                            f6 = fDp2;
                        }
                    } else {
                        this.needNewRow[i18] = false;
                    }
                    this.avatarDrawables[i18].setInfo(UserConfig.selectedAccount, chat);
                    this.avatarImageReceivers[i18].setForUserOrChat(chat, this.avatarDrawables[i18]);
                    this.avatarImageReceivers[i18].setImageCoords(0.0f, 0.0f, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
                } else {
                    this.chats[i18] = null;
                    this.avatarVisible[i18] = false;
                    this.chatTitles[i18] = "";
                    this.needNewRow[i18] = false;
                    this.chatTitleWidths[i18] = AndroidUtilities.dp(20.0f);
                    this.avatarDrawables[i18].setInfo(jLongValue2, "", "", null, null);
                }
            }
        }
    }
}
