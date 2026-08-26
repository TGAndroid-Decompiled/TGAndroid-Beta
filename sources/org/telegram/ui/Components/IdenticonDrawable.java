package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ChatActivity$$ExternalSyntheticOutline0;

public final class IdenticonDrawable extends Drawable {
    public byte[] data;
    public final Paint paint = new Paint();
    public final int[] colors = {-1, -2758925, -13805707, -13657655};

    @Override
    public final void draw(Canvas canvas) {
        byte[] bArr = this.data;
        if (bArr == null) {
            return;
        }
        int length = bArr.length;
        int[] iArr = this.colors;
        Paint paint = this.paint;
        if (length == 16) {
            float fFloor = (float) Math.floor(Math.min(getBounds().width(), getBounds().height()) / 8.0f);
            float f = 8.0f * fFloor;
            float fM = ChatActivity$$ExternalSyntheticOutline0.m(getBounds().width(), f, 2.0f, 0.0f);
            float fM2 = ChatActivity$$ExternalSyntheticOutline0.m(getBounds().height(), f, 2.0f, 0.0f);
            int i = 0;
            for (int i2 = 0; i2 < 8; i2++) {
                int i3 = 0;
                while (i3 < 8) {
                    int i4 = i + 2;
                    paint.setColor(iArr[Math.abs((this.data[i / 8] >> (i % 8)) & 3) % 4]);
                    float f2 = (i3 * fFloor) + fM;
                    float f3 = i2 * fFloor;
                    canvas.drawRect(f2, f3 + fM2, f2 + fFloor, f3 + fFloor + fM2, paint);
                    i3++;
                    i = i4;
                }
            }
            return;
        }
        float fFloor2 = (float) Math.floor(Math.min(getBounds().width(), getBounds().height()) / 12.0f);
        float f4 = 12.0f * fFloor2;
        float fM3 = ChatActivity$$ExternalSyntheticOutline0.m(getBounds().width(), f4, 2.0f, 0.0f);
        float fM4 = ChatActivity$$ExternalSyntheticOutline0.m(getBounds().height(), f4, 2.0f, 0.0f);
        int i5 = 0;
        int i6 = 0;
        while (i6 < 12) {
            int i7 = i5;
            for (int i8 = 0; i8 < 12; i8++) {
                paint.setColor(iArr[Math.abs((this.data[i7 / 8] >> (i7 % 8)) & 3) % 4]);
                float f5 = (i8 * fFloor2) + fM3;
                float f6 = i6 * fFloor2;
                canvas.drawRect(f5, f6 + fM4, f5 + fFloor2, f6 + fFloor2 + fM4, paint);
                i7 += 2;
            }
            i6++;
            i5 = i7;
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return AndroidUtilities.dp(32.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return AndroidUtilities.dp(32.0f);
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void setAlpha(int i) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
