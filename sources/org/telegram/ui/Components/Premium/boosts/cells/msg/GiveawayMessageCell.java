package org.telegram.ui.Components.Premium.boosts.cells.msg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.StateSet;
import android.view.MotionEvent;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.Premium.boosts.BoostDialogs;
public class GiveawayMessageCell {
    private static final Map<Integer, String> monthsToEmoticon;
    private int additionPrizeHeight;
    private StaticLayout additionPrizeLayout;
    private AvatarDrawable[] avatarDrawables;
    private ImageReceiver[] avatarImageReceivers;
    private boolean[] avatarVisible;
    private int bottomHeight;
    private StaticLayout bottomLayout;
    private Paint chatBgPaint;
    private RectF chatRect;
    private TextPaint chatTextPaint;
    private float[] chatTitleWidths;
    private CharSequence[] chatTitles;
    private TLRPC$Chat[] chats;
    private Rect[] clickRect;
    private Paint clipRectPaint;
    private Rect containerRect;
    private RectF countRect;
    private Paint counterBgPaint;
    private String counterStr;
    private Rect counterTextBounds;
    private TextPaint counterTextPaint;
    private int countriesHeight;
    private StaticLayout countriesLayout;
    private TextPaint countriesTextPaint;
    private int diffTextWidth;
    private ImageReceiver giftReceiver;
    private Paint lineDividerPaint;
    private MessageObject messageObject;
    private boolean[] needNewRow;
    private final ChatMessageCell parentView;
    private int[] pressedState;
    private Paint saveLayerPaint;
    private int selectorColor;
    private Drawable selectorDrawable;
    private String textDivider;
    private TextPaint textDividerPaint;
    private float textDividerWidth;
    private TextPaint textPaint;
    private int titleHeight;
    private StaticLayout titleLayout;
    private int topHeight;
    private StaticLayout topLayout;
    private int measuredHeight = 0;
    private int measuredWidth = 0;
    private int pressedPos = -1;
    private boolean isButtonPressed = false;
    private boolean isContainerPressed = false;

    static {
        HashMap hashMap = new HashMap();
        monthsToEmoticon = hashMap;
        hashMap.put(1, "1⃣");
        hashMap.put(3, "2⃣");
        hashMap.put(6, "3⃣");
        hashMap.put(12, "4⃣");
        hashMap.put(24, "5⃣");
    }

    public GiveawayMessageCell(ChatMessageCell chatMessageCell) {
        this.parentView = chatMessageCell;
    }

    private void init() {
        if (this.counterTextPaint != null) {
            return;
        }
        this.counterTextPaint = new TextPaint(1);
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
        this.chats = new TLRPC$Chat[10];
        this.chatTitleWidths = new float[10];
        this.needNewRow = new boolean[10];
        this.clickRect = new Rect[10];
        ImageReceiver imageReceiver = new ImageReceiver(this.parentView);
        this.giftReceiver = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        this.clipRectPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.counterTextPaint.setTypeface(AndroidUtilities.bold());
        this.counterTextPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.counterTextPaint.setTextSize(AndroidUtilities.dp(12.0f));
        this.counterTextPaint.setTextAlign(Paint.Align.CENTER);
        this.chatTextPaint.setTypeface(AndroidUtilities.bold());
        this.chatTextPaint.setTextSize(AndroidUtilities.dp(13.0f));
        this.countriesTextPaint.setTextSize(AndroidUtilities.dp(13.0f));
        this.textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        this.textDividerPaint.setTextSize(AndroidUtilities.dp(14.0f));
        this.textDividerPaint.setTextAlign(Paint.Align.CENTER);
    }

    public boolean checkMotionEvent(MotionEvent motionEvent) {
        MessageObject messageObject = this.messageObject;
        if (messageObject != null && messageObject.isGiveaway()) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (motionEvent.getAction() == 0) {
                int i = 0;
                while (true) {
                    Rect[] rectArr = this.clickRect;
                    if (i < rectArr.length) {
                        if (rectArr[i].contains(x, y)) {
                            this.pressedPos = i;
                            if (Build.VERSION.SDK_INT >= 21) {
                                this.selectorDrawable.setHotspot(x, y);
                            }
                            this.isButtonPressed = true;
                            setButtonPressed(true);
                            return true;
                        }
                        i++;
                    } else if (this.containerRect.contains(x, y)) {
                        this.isContainerPressed = true;
                        return true;
                    }
                }
            } else if (motionEvent.getAction() == 1) {
                if (this.isButtonPressed) {
                    if (this.parentView.getDelegate() != null) {
                        this.parentView.getDelegate().didPressGiveawayChatButton(this.parentView, this.pressedPos);
                    }
                    this.parentView.playSoundEffect(0);
                    setButtonPressed(false);
                    this.isButtonPressed = false;
                }
                if (this.isContainerPressed) {
                    this.isContainerPressed = false;
                    BoostDialogs.showBulletinAbout(this.messageObject);
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

    public void setButtonPressed(boolean z) {
        Drawable drawable;
        MessageObject messageObject = this.messageObject;
        if (messageObject == null || !messageObject.isGiveaway() || (drawable = this.selectorDrawable) == null) {
            return;
        }
        if (z) {
            drawable.setCallback(new Drawable.Callback() {
                @Override
                public void invalidateDrawable(Drawable drawable2) {
                    GiveawayMessageCell.this.parentView.invalidate();
                }

                @Override
                public void scheduleDrawable(Drawable drawable2, Runnable runnable, long j) {
                    GiveawayMessageCell.this.parentView.invalidate();
                }

                @Override
                public void unscheduleDrawable(Drawable drawable2, Runnable runnable) {
                    GiveawayMessageCell.this.parentView.invalidate();
                }
            });
            this.selectorDrawable.setState(this.pressedState);
            this.parentView.invalidate();
            return;
        }
        drawable.setState(StateSet.NOTHING);
        this.parentView.invalidate();
    }

    public void setMessageContent(org.telegram.messenger.MessageObject r21, int r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.Premium.boosts.cells.msg.GiveawayMessageCell.setMessageContent(org.telegram.messenger.MessageObject, int, int):void");
    }

    private int getChatColor(TLRPC$Chat tLRPC$Chat, Theme.ResourcesProvider resourcesProvider) {
        if (this.messageObject.isOutOwner()) {
            return Theme.getColor(Theme.key_chat_outPreviewInstantText, resourcesProvider);
        }
        int colorId = ChatObject.getColorId(tLRPC$Chat);
        if (colorId < 7) {
            return Theme.getColor(Theme.keys_avatar_nameInMessage[colorId], resourcesProvider);
        }
        MessagesController.PeerColors peerColors = MessagesController.getInstance(UserConfig.selectedAccount).peerColors;
        MessagesController.PeerColor color = peerColors == null ? null : peerColors.getColor(colorId);
        if (color != null) {
            return color.getColor(0, resourcesProvider);
        }
        return Theme.getColor(Theme.keys_avatar_nameInMessage[0], resourcesProvider);
    }

    public void draw(Canvas canvas, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
        float f;
        boolean[] zArr;
        int i3;
        MessageObject messageObject = this.messageObject;
        if (messageObject == null || !messageObject.isGiveaway()) {
            return;
        }
        if (this.selectorDrawable == null) {
            int color = Theme.getColor(Theme.key_listSelector);
            this.selectorColor = color;
            Drawable createRadSelectorDrawable = Theme.createRadSelectorDrawable(color, 12, 12);
            this.selectorDrawable = createRadSelectorDrawable;
            createRadSelectorDrawable.setCallback(this.parentView);
        }
        this.textPaint.setColor(Theme.chat_msgTextPaint.getColor());
        this.textDividerPaint.setColor(Theme.multAlpha(Theme.chat_msgTextPaint.getColor(), 0.45f));
        this.lineDividerPaint.setColor(Theme.multAlpha(Theme.chat_msgTextPaint.getColor(), 0.15f));
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
        canvas.save();
        int dp = i2 - AndroidUtilities.dp(4.0f);
        canvas.translate(dp, i);
        this.containerRect.set(dp, i, getMeasuredWidth() + dp, getMeasuredHeight() + i);
        canvas.saveLayer(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.saveLayerPaint, 31);
        this.giftReceiver.draw(canvas);
        float f2 = 2.0f;
        float measuredWidth = getMeasuredWidth() / 2.0f;
        float dp2 = AndroidUtilities.dp(106.0f);
        int width = this.counterTextBounds.width() + AndroidUtilities.dp(12.0f);
        int height = this.counterTextBounds.height() + AndroidUtilities.dp(10.0f);
        this.countRect.set(measuredWidth - ((AndroidUtilities.dp(2.0f) + width) / 2.0f), dp2 - ((AndroidUtilities.dp(2.0f) + height) / 2.0f), ((width + AndroidUtilities.dp(2.0f)) / 2.0f) + measuredWidth, ((height + AndroidUtilities.dp(2.0f)) / 2.0f) + dp2);
        canvas.drawRoundRect(this.countRect, AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), this.clipRectPaint);
        float f3 = width / 2.0f;
        float f4 = height / 2.0f;
        this.countRect.set(measuredWidth - f3, dp2 - f4, f3 + measuredWidth, dp2 + f4);
        canvas.drawRoundRect(this.countRect, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), this.counterBgPaint);
        canvas.drawText(this.counterStr, this.countRect.centerX(), this.countRect.centerY() + AndroidUtilities.dp(4.0f), this.counterTextPaint);
        canvas.restore();
        canvas.translate(0.0f, AndroidUtilities.dp(128.0f));
        int dp3 = i + AndroidUtilities.dp(128.0f);
        canvas.save();
        canvas.translate(this.diffTextWidth / 2.0f, 0.0f);
        this.titleLayout.draw(canvas);
        canvas.translate(0.0f, this.titleHeight);
        float f5 = 16.0f;
        if (this.additionPrizeLayout != null) {
            canvas.restore();
            canvas.save();
            float dp4 = (this.titleHeight + this.additionPrizeHeight) - AndroidUtilities.dp(6.0f);
            float f6 = this.measuredWidth / 2.0f;
            canvas.drawText(this.textDivider, f6, dp4, this.textDividerPaint);
            canvas.drawLine(AndroidUtilities.dp(17.0f), dp4 - AndroidUtilities.dp(4.0f), (f6 - (this.textDividerWidth / 2.0f)) - AndroidUtilities.dp(6.0f), dp4 - AndroidUtilities.dp(4.0f), this.lineDividerPaint);
            canvas.drawLine(f6 + (this.textDividerWidth / 2.0f) + AndroidUtilities.dp(6.0f), dp4 - AndroidUtilities.dp(4.0f), this.measuredWidth - AndroidUtilities.dp(16.0f), dp4 - AndroidUtilities.dp(4.0f), this.lineDividerPaint);
            canvas.translate((this.measuredWidth - this.additionPrizeLayout.getWidth()) / 2.0f, this.titleHeight);
            this.additionPrizeLayout.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.translate(this.diffTextWidth / 2.0f, this.additionPrizeHeight + this.titleHeight);
        }
        this.topLayout.draw(canvas);
        canvas.restore();
        canvas.translate(0.0f, this.topHeight + AndroidUtilities.dp(6.0f));
        int i6 = 0;
        int dp5 = dp3 + this.topHeight + AndroidUtilities.dp(6.0f);
        int i7 = 0;
        while (true) {
            boolean[] zArr2 = this.avatarVisible;
            if (i6 >= zArr2.length) {
                break;
            }
            if (zArr2[i6]) {
                canvas.save();
                int i8 = i6;
                float f7 = 0.0f;
                do {
                    f7 += this.chatTitleWidths[i8] + AndroidUtilities.dp(40.0f);
                    i8++;
                    zArr = this.avatarVisible;
                    if (i8 >= zArr.length || this.needNewRow[i8]) {
                        break;
                    }
                } while (zArr[i8]);
                float f8 = measuredWidth - (f7 / f2);
                canvas.translate(f8, 0.0f);
                int i9 = i6;
                int i10 = ((int) f8) + dp;
                while (true) {
                    int chatColor = getChatColor(this.chats[i9], resourcesProvider);
                    int i11 = this.pressedPos;
                    i3 = (i11 < 0 || i11 != i9) ? i7 : chatColor;
                    this.chatTextPaint.setColor(chatColor);
                    this.chatBgPaint.setColor(chatColor);
                    this.chatBgPaint.setAlpha(25);
                    this.avatarImageReceivers[i9].draw(canvas);
                    CharSequence[] charSequenceArr = this.chatTitles;
                    int i12 = i10;
                    int i13 = i9;
                    canvas.drawText(charSequenceArr[i9], 0, charSequenceArr[i9].length(), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(f5), this.chatTextPaint);
                    this.chatRect.set(0.0f, 0.0f, this.chatTitleWidths[i13] + AndroidUtilities.dp(40.0f), AndroidUtilities.dp(24.0f));
                    canvas.drawRoundRect(this.chatRect, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), this.chatBgPaint);
                    float f9 = i12;
                    this.clickRect[i13].set(i12, dp5, (int) (this.chatRect.width() + f9), AndroidUtilities.dp(24.0f) + dp5);
                    canvas.translate(this.chatRect.width() + AndroidUtilities.dp(6.0f), 0.0f);
                    i10 = (int) (f9 + this.chatRect.width() + AndroidUtilities.dp(6.0f));
                    i9 = i13 + 1;
                    boolean[] zArr3 = this.avatarVisible;
                    if (i9 >= zArr3.length || this.needNewRow[i9] || !zArr3[i9]) {
                        break;
                    }
                    i7 = i3;
                    f5 = 16.0f;
                }
                canvas.restore();
                canvas.translate(0.0f, AndroidUtilities.dp(30.0f));
                dp5 += AndroidUtilities.dp(30.0f);
                i6 = i9;
                i7 = i3;
            } else {
                i6++;
            }
            f5 = 16.0f;
            f2 = 2.0f;
        }
        if (this.countriesLayout != null) {
            canvas.save();
            canvas.translate((this.measuredWidth - this.countriesLayout.getWidth()) / 2.0f, AndroidUtilities.dp(4.0f));
            this.countriesLayout.draw(canvas);
            canvas.restore();
            f = 0.0f;
            canvas.translate(0.0f, this.countriesHeight);
        } else {
            f = 0.0f;
        }
        canvas.translate(f, AndroidUtilities.dp(6.0f));
        canvas.save();
        canvas.translate(this.diffTextWidth / 2.0f, f);
        this.bottomLayout.draw(canvas);
        canvas.restore();
        canvas.restore();
        if (this.pressedPos >= 0) {
            int multAlpha = Theme.multAlpha(i7, Theme.isCurrentThemeDark() ? 0.12f : 0.1f);
            if (this.selectorColor != multAlpha) {
                Drawable drawable = this.selectorDrawable;
                this.selectorColor = multAlpha;
                Theme.setSelectorDrawableColor(drawable, multAlpha, true);
            }
            this.selectorDrawable.setBounds(this.clickRect[this.pressedPos]);
            this.selectorDrawable.setCallback(this.parentView);
        }
    }

    public void onDetachedFromWindow() {
        ImageReceiver imageReceiver = this.giftReceiver;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
        }
        ImageReceiver[] imageReceiverArr = this.avatarImageReceivers;
        if (imageReceiverArr != null) {
            for (ImageReceiver imageReceiver2 : imageReceiverArr) {
                imageReceiver2.onDetachedFromWindow();
            }
        }
    }

    public void onAttachedToWindow() {
        ImageReceiver imageReceiver = this.giftReceiver;
        if (imageReceiver != null) {
            imageReceiver.onAttachedToWindow();
        }
        ImageReceiver[] imageReceiverArr = this.avatarImageReceivers;
        if (imageReceiverArr != null) {
            for (ImageReceiver imageReceiver2 : imageReceiverArr) {
                imageReceiver2.onAttachedToWindow();
            }
        }
    }

    public int getMeasuredHeight() {
        return this.measuredHeight;
    }

    public int getMeasuredWidth() {
        return this.measuredWidth;
    }

    private void createImages() {
        if (this.avatarImageReceivers != null) {
            return;
        }
        this.avatarImageReceivers = new ImageReceiver[10];
        this.avatarDrawables = new AvatarDrawable[10];
        this.avatarVisible = new boolean[10];
        int i = 0;
        while (true) {
            ImageReceiver[] imageReceiverArr = this.avatarImageReceivers;
            if (i >= imageReceiverArr.length) {
                return;
            }
            imageReceiverArr[i] = new ImageReceiver(this.parentView);
            this.avatarImageReceivers[i].setAllowLoadingOnAttachedOnly(true);
            this.avatarImageReceivers[i].setRoundRadius(AndroidUtilities.dp(12.0f));
            this.avatarDrawables[i] = new AvatarDrawable();
            this.avatarDrawables[i].setTextSize(AndroidUtilities.dp(18.0f));
            this.clickRect[i] = new Rect();
            i++;
        }
    }

    private void checkArraysLimits(int i) {
        ImageReceiver[] imageReceiverArr = this.avatarImageReceivers;
        if (imageReceiverArr.length < i) {
            int length = imageReceiverArr.length;
            this.avatarImageReceivers = (ImageReceiver[]) Arrays.copyOf(imageReceiverArr, i);
            this.avatarDrawables = (AvatarDrawable[]) Arrays.copyOf(this.avatarDrawables, i);
            this.avatarVisible = Arrays.copyOf(this.avatarVisible, i);
            this.chatTitles = (CharSequence[]) Arrays.copyOf(this.chatTitles, i);
            this.chatTitleWidths = Arrays.copyOf(this.chatTitleWidths, i);
            this.needNewRow = Arrays.copyOf(this.needNewRow, i);
            this.clickRect = (Rect[]) Arrays.copyOf(this.clickRect, i);
            this.chats = (TLRPC$Chat[]) Arrays.copyOf(this.chats, i);
            for (int i2 = length - 1; i2 < i; i2++) {
                this.avatarImageReceivers[i2] = new ImageReceiver(this.parentView);
                this.avatarImageReceivers[i2].setAllowLoadingOnAttachedOnly(true);
                this.avatarImageReceivers[i2].setRoundRadius(AndroidUtilities.dp(12.0f));
                this.avatarDrawables[i2] = new AvatarDrawable();
                this.avatarDrawables[i2].setTextSize(AndroidUtilities.dp(18.0f));
                this.clickRect[i2] = new Rect();
            }
        }
    }

    private void setGiftImage(org.telegram.messenger.MessageObject r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.Premium.boosts.cells.msg.GiveawayMessageCell.setGiftImage(org.telegram.messenger.MessageObject):void");
    }
}
