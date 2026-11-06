package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.style.ReplacementSpan;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
public final class my0 extends ReplacementSpan {
    public static final int f36160f = 0;
    public ImageReceiver f36161a;
    public int f36162b;
    public int f36163c;
    public final boolean d;
    public final int f36164e;

    public my0(View view, Bitmap bitmap, int i7, int i10, int i11, int i12) {
        this.f36162b = i7;
        this.f36163c = i10;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f36161a = imageReceiver;
        imageReceiver.J0 = true;
        imageReceiver.v0(bitmap);
        imageReceiver.f21206o1 = new PorterDuffColorFilter(i11, PorterDuff.Mode.SRC_IN);
        this.f36164e = i12;
        this.d = true;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        int i14 = this.f36162b;
        int i15 = this.f36163c;
        ImageReceiver imageReceiver = this.f36161a;
        canvas.save();
        if (this.d) {
            imageReceiver.y0((int) f10, i12 - (i15 - this.f36164e), i14, i15);
        } else {
            imageReceiver.y0((int) f10, jg.g.D(org.telegram.messenger.k5.z(4.0f, i13, i11), i15, 2, i11), i14, i15);
        }
        imageReceiver.h(canvas, null);
        canvas.restore();
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i7, int i10, Paint.FontMetricsInt fontMetricsInt) {
        int i11 = this.f36163c;
        if (fontMetricsInt != null) {
            if (this.d) {
                int i12 = this.f36164e;
                int i13 = -(i11 - i12);
                fontMetricsInt.ascent = i13;
                fontMetricsInt.top = i13;
                fontMetricsInt.descent = i12;
                fontMetricsInt.bottom = i12;
            } else {
                int L = ((-i11) / 2) - org.telegram.messenger.g0.L(4.0f);
                fontMetricsInt.ascent = L;
                fontMetricsInt.top = L;
                int L2 = (i11 - (i11 / 2)) - org.telegram.messenger.g0.L(4.0f);
                fontMetricsInt.descent = L2;
                fontMetricsInt.bottom = L2;
            }
        }
        return this.f36162b;
    }
}
