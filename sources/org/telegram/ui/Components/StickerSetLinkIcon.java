package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;

public final class StickerSetLinkIcon extends Drawable {
    public final int N;
    public final int count;
    public final AnimatedEmojiDrawable[] drawables;
    public final boolean out;
    public int alpha = 255;
    public final RectF rect = new RectF();
    public boolean hit = false;

    public StickerSetLinkIcon(int i, ArrayList arrayList, boolean z) {
        this.out = z;
        int iMax = (int) Math.max(1.0d, Math.sqrt(arrayList.size()));
        this.N = iMax;
        int iMin = Math.min(iMax * iMax, arrayList.size());
        this.count = iMin;
        this.drawables = new AnimatedEmojiDrawable[iMin];
        if (!arrayList.isEmpty()) {
            MessageObject.isAnimatedEmoji((TLRPC.Document) arrayList.get(0));
        }
        int i2 = iMax < 2 ? 1 : 0;
        for (int i3 = 0; i3 < this.count; i3++) {
            this.drawables[i3] = AnimatedEmojiDrawable.make(i, i2, (TLRPC.Document) arrayList.get(i3));
        }
    }

    public final boolean die() {
        return this.hit;
    }

    @Override
    public final void draw(Canvas canvas) {
        AnimatedEmojiDrawable animatedEmojiDrawable;
        if (this.alpha <= 0) {
            return;
        }
        RectF rectF = this.rect;
        rectF.set(getBounds());
        float fCenterX = rectF.centerX() - (AndroidUtilities.dp(48.0f) / 2.0f);
        float fCenterY = rectF.centerY() - (AndroidUtilities.dp(48.0f) / 2.0f);
        int iDp = AndroidUtilities.dp(48.0f);
        int i = this.N;
        float f = iDp / i;
        float fDp = AndroidUtilities.dp(48.0f) / i;
        canvas.save();
        canvas.clipRect(fCenterX, fCenterY, AndroidUtilities.dp(48.0f) + fCenterX, AndroidUtilities.dp(48.0f) + fCenterY);
        for (int i2 = 0; i2 < i; i2++) {
            for (int i3 = 0; i3 < i; i3++) {
                int i4 = (i2 * i) + i3;
                if (i4 >= 0) {
                    AnimatedEmojiDrawable[] animatedEmojiDrawableArr = this.drawables;
                    if (i4 < animatedEmojiDrawableArr.length && (animatedEmojiDrawable = animatedEmojiDrawableArr[i4]) != null) {
                        animatedEmojiDrawable.setBounds((int) ((i3 * f) + fCenterX), (int) ((i2 * fDp) + fCenterY), (int) (((i3 + 1) * f) + fCenterX), (int) (((i2 + 1) * fDp) + fCenterY));
                        animatedEmojiDrawableArr[i4].setAlpha(this.alpha);
                        animatedEmojiDrawableArr[i4].setColorFilter(this.out ? Theme.chat_outAnimatedEmojiTextColorFilter : Theme.chat_animatedEmojiTextColorFilter);
                        animatedEmojiDrawableArr[i4].draw(canvas);
                    }
                }
            }
        }
        canvas.restore();
    }

    public final boolean equals(ArrayList arrayList) {
        AnimatedEmojiDrawable[] animatedEmojiDrawableArr = this.drawables;
        if (animatedEmojiDrawableArr.length == arrayList.size()) {
            for (int i = 0; i < animatedEmojiDrawableArr.length; i++) {
                TLRPC.Document document = animatedEmojiDrawableArr[i].document;
                if ((document == null ? 0L : document.id) == ((TLRPC.Document) arrayList.get(i)).id) {
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public final int getIntrinsicHeight() {
        return AndroidUtilities.dp(48.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return AndroidUtilities.dp(48.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public final void keepAlive() {
        this.hit = false;
    }

    public final void readyToDie() {
        this.hit = true;
    }

    @Override
    public final void setAlpha(int i) {
        this.alpha = i;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
