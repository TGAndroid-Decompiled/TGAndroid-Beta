package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.style.ReplacementSpan;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
public final class yy0 extends ReplacementSpan {
    public static final int f42592f = 0;
    public ImageReceiver f42593a;
    public int f42594b;
    public int f42595c;
    public final boolean d;
    public final int f42596e;

    public yy0(View view, Bitmap bitmap, int i7, int i10, int i11, int i12) {
        this.f42594b = i7;
        this.f42595c = i10;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f42593a = imageReceiver;
        imageReceiver.K0 = true;
        imageReceiver.v0(bitmap);
        imageReceiver.f22684p1 = new PorterDuffColorFilter(i11, PorterDuff.Mode.SRC_IN);
        this.f42596e = i12;
        this.d = true;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        int i14 = this.f42594b;
        int i15 = this.f42595c;
        ImageReceiver imageReceiver = this.f42593a;
        canvas.save();
        if (this.d) {
            imageReceiver.y0((int) f10, i12 - (i15 - this.f42596e), i14, i15);
        } else {
            imageReceiver.y0((int) f10, i5.c.e(org.telegram.messenger.f3.z(4.0f, i13, i11), i15, 2, i11), i14, i15);
        }
        imageReceiver.h(canvas, null);
        canvas.restore();
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i7, int i10, Paint.FontMetricsInt fontMetricsInt) {
        int i11 = this.f42595c;
        if (fontMetricsInt != null) {
            if (this.d) {
                int i12 = this.f42596e;
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
        return this.f42594b;
    }
}
