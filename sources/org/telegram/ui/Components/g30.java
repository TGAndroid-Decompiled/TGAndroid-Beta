package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
public final class g30 extends Drawable {
    public byte[] f34787a;
    public final Paint f34788b = new Paint();
    public final int[] f34789c = {-1, -2758925, -13805707, -13657655};

    @Override
    public final void draw(Canvas canvas) {
        byte[] bArr = this.f34787a;
        if (bArr != null) {
            int length = bArr.length;
            int[] iArr = this.f34789c;
            Paint paint = this.f34788b;
            if (length == 16) {
                float floor = (float) Math.floor(Math.min(getBounds().width(), getBounds().height()) / 8.0f);
                float f10 = 8.0f * floor;
                float v = org.telegram.ui.Cells.y0.v(getBounds().width(), f10, 2.0f, 0.0f);
                float v10 = org.telegram.ui.Cells.y0.v(getBounds().height(), f10, 2.0f, 0.0f);
                int i7 = 0;
                for (int i10 = 0; i10 < 8; i10++) {
                    int i11 = 0;
                    while (i11 < 8) {
                        int i12 = i7 + 2;
                        paint.setColor(iArr[Math.abs((this.f34787a[i7 / 8] >> (i7 % 8)) & 3) % 4]);
                        float f11 = (i11 * floor) + v;
                        float f12 = i10 * floor;
                        canvas.drawRect(f11, f12 + v10, f11 + floor, f12 + floor + v10, paint);
                        i11++;
                        i7 = i12;
                    }
                }
                return;
            }
            float floor2 = (float) Math.floor(Math.min(getBounds().width(), getBounds().height()) / 12.0f);
            float f13 = 12.0f * floor2;
            float v11 = org.telegram.ui.Cells.y0.v(getBounds().width(), f13, 2.0f, 0.0f);
            float v12 = org.telegram.ui.Cells.y0.v(getBounds().height(), f13, 2.0f, 0.0f);
            int i13 = 0;
            int i14 = 0;
            while (i14 < 12) {
                int i15 = i13;
                for (int i16 = 0; i16 < 12; i16++) {
                    paint.setColor(iArr[Math.abs((this.f34787a[i15 / 8] >> (i15 % 8)) & 3) % 4]);
                    float f14 = (i16 * floor2) + v11;
                    float f15 = i14 * floor2;
                    canvas.drawRect(f14, f15 + v12, f14 + floor2, f15 + floor2 + v12, paint);
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
