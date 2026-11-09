package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
public final class e30 extends Drawable {
    public byte[] f33274a;
    public final Paint f33275b = new Paint();
    public final int[] f33276c = {-1, -2758925, -13805707, -13657655};

    @Override
    public final void draw(Canvas canvas) {
        byte[] bArr = this.f33274a;
        if (bArr != null) {
            int length = bArr.length;
            int[] iArr = this.f33276c;
            Paint paint = this.f33275b;
            if (length == 16) {
                float floor = (float) Math.floor(Math.min(getBounds().width(), getBounds().height()) / 8.0f);
                float f10 = 8.0f * floor;
                float max = Math.max(0.0f, (getBounds().width() - f10) / 2.0f);
                float max2 = Math.max(0.0f, (getBounds().height() - f10) / 2.0f);
                int i7 = 0;
                for (int i10 = 0; i10 < 8; i10++) {
                    int i11 = 0;
                    while (i11 < 8) {
                        int i12 = i7 + 2;
                        paint.setColor(iArr[Math.abs((this.f33274a[i7 / 8] >> (i7 % 8)) & 3) % 4]);
                        float f11 = (i11 * floor) + max;
                        float f12 = i10 * floor;
                        canvas.drawRect(f11, f12 + max2, f11 + floor, f12 + floor + max2, paint);
                        i11++;
                        i7 = i12;
                    }
                }
                return;
            }
            float floor2 = (float) Math.floor(Math.min(getBounds().width(), getBounds().height()) / 12.0f);
            float f13 = 12.0f * floor2;
            float max3 = Math.max(0.0f, (getBounds().width() - f13) / 2.0f);
            float max4 = Math.max(0.0f, (getBounds().height() - f13) / 2.0f);
            int i13 = 0;
            int i14 = 0;
            while (i14 < 12) {
                int i15 = i13;
                for (int i16 = 0; i16 < 12; i16++) {
                    paint.setColor(iArr[Math.abs((this.f33274a[i15 / 8] >> (i15 % 8)) & 3) % 4]);
                    float f14 = (i16 * floor2) + max3;
                    float f15 = i14 * floor2;
                    canvas.drawRect(f14, f15 + max4, f14 + floor2, f15 + floor2 + max4, paint);
                    i15 += 2;
                }
                i14++;
                i13 = i15;
            }
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return org.telegram.messenger.g0.L(32.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return org.telegram.messenger.g0.L(32.0f);
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void setAlpha(int i7) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
