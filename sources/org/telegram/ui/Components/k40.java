package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class k40 extends Drawable {
    public byte[] f29918a;
    public final Paint f29919b = new Paint();
    public final int[] f29920c = {-1, -2758925, -13805707, -13657655};

    @Override
    public final void draw(Canvas canvas) {
        byte[] bArr = this.f29918a;
        if (bArr != null) {
            int length = bArr.length;
            int[] iArr = this.f29920c;
            Paint paint = this.f29919b;
            if (length == 16) {
                float floor = (float) Math.floor(Math.min(getBounds().width(), getBounds().height()) / 8.0f);
                float f9 = 8.0f * floor;
                float max = Math.max(0.0f, (getBounds().width() - f9) / 2.0f);
                float max2 = Math.max(0.0f, (getBounds().height() - f9) / 2.0f);
                int i10 = 0;
                for (int i11 = 0; i11 < 8; i11++) {
                    int i12 = 0;
                    while (i12 < 8) {
                        int i13 = i10 + 2;
                        paint.setColor(iArr[Math.abs((this.f29918a[i10 / 8] >> (i10 % 8)) & 3) % 4]);
                        float f10 = (i12 * floor) + max;
                        float f11 = i11 * floor;
                        canvas.drawRect(f10, f11 + max2, f10 + floor, f11 + floor + max2, paint);
                        i12++;
                        i10 = i13;
                    }
                }
                return;
            }
            float floor2 = (float) Math.floor(Math.min(getBounds().width(), getBounds().height()) / 12.0f);
            float f12 = 12.0f * floor2;
            float max3 = Math.max(0.0f, (getBounds().width() - f12) / 2.0f);
            float max4 = Math.max(0.0f, (getBounds().height() - f12) / 2.0f);
            int i14 = 0;
            int i15 = 0;
            while (i15 < 12) {
                int i16 = i14;
                for (int i17 = 0; i17 < 12; i17++) {
                    paint.setColor(iArr[Math.abs((this.f29918a[i16 / 8] >> (i16 % 8)) & 3) % 4]);
                    float f13 = (i17 * floor2) + max3;
                    float f14 = i15 * floor2;
                    canvas.drawRect(f13, f14 + max4, f13 + floor2, f14 + floor2 + max4, paint);
                    i16 += 2;
                }
                i15++;
                i14 = i16;
            }
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
