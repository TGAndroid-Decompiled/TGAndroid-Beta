package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;

public final class b40 extends Drawable {

    public byte[] f26916a;

    public final Paint f26917b = new Paint();

    public final int[] f26918c = {-1, -2758925, -13805707, -13657655};

    @Override
    public final void draw(Canvas canvas) {
        byte[] bArr = this.f26916a;
        if (bArr == null) {
            return;
        }
        int length = bArr.length;
        int[] iArr = this.f26918c;
        Paint paint = this.f26917b;
        if (length == 16) {
            float fFloor = (float) Math.floor(Math.min(getBounds().width(), getBounds().height()) / 8.0f);
            float f10 = 8.0f * fFloor;
            float fMax = Math.max(0.0f, (getBounds().width() - f10) / 2.0f);
            float fMax2 = Math.max(0.0f, (getBounds().height() - f10) / 2.0f);
            int i10 = 0;
            for (int i11 = 0; i11 < 8; i11++) {
                int i12 = 0;
                while (i12 < 8) {
                    int i13 = i10 + 2;
                    paint.setColor(iArr[Math.abs((this.f26916a[i10 / 8] >> (i10 % 8)) & 3) % 4]);
                    float f11 = (i12 * fFloor) + fMax;
                    float f12 = i11 * fFloor;
                    canvas.drawRect(f11, f12 + fMax2, f11 + fFloor, f12 + fFloor + fMax2, paint);
                    i12++;
                    i10 = i13;
                }
            }
            return;
        }
        float fFloor2 = (float) Math.floor(Math.min(getBounds().width(), getBounds().height()) / 12.0f);
        float f13 = 12.0f * fFloor2;
        float fMax3 = Math.max(0.0f, (getBounds().width() - f13) / 2.0f);
        float fMax4 = Math.max(0.0f, (getBounds().height() - f13) / 2.0f);
        int i14 = 0;
        int i15 = 0;
        while (i15 < 12) {
            int i16 = i14;
            for (int i17 = 0; i17 < 12; i17++) {
                paint.setColor(iArr[Math.abs((this.f26916a[i16 / 8] >> (i16 % 8)) & 3) % 4]);
                float f14 = (i17 * fFloor2) + fMax3;
                float f15 = i15 * fFloor2;
                canvas.drawRect(f14, f15 + fMax4, f14 + fFloor2, f15 + fFloor2 + fMax4, paint);
                i16 += 2;
            }
            i15++;
            i14 = i16;
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
    public final void setAlpha(int i10) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
