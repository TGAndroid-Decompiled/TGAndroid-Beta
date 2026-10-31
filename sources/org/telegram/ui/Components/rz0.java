package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.style.ReplacementSpan;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
public final class rz0 extends ReplacementSpan {
    public static final int f30069f = 0;
    public ImageReceiver f30070a;
    public int f30071b;
    public int f30072c;
    public final boolean d;
    public final int e;

    public rz0(View view, Bitmap bitmap, int i10, int i11, int i12, int i13) {
        this.f30071b = i10;
        this.f30072c = i11;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f30070a = imageReceiver;
        imageReceiver.J0 = true;
        imageReceiver.v0(bitmap);
        imageReceiver.f14397o1 = new PorterDuffColorFilter(i12, PorterDuff.Mode.SRC_IN);
        this.e = i13;
        this.d = true;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        int i15 = this.f30071b;
        int i16 = this.f30072c;
        ImageReceiver imageReceiver = this.f30070a;
        canvas.save();
        if (this.d) {
            imageReceiver.y0((int) f7, i13 - (i16 - this.e), i15, i16);
        } else {
            imageReceiver.y0((int) f7, i0.a.u(org.telegram.messenger.m5.z(4.0f, i14, i12), i16, 2, i12), i15, i16);
        }
        imageReceiver.h(canvas, null);
        canvas.restore();
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        int i12 = this.f30072c;
        if (fontMetricsInt != null) {
            if (this.d) {
                int i13 = this.e;
                int i14 = -(i12 - i13);
                fontMetricsInt.ascent = i14;
                fontMetricsInt.top = i14;
                fontMetricsInt.descent = i13;
                fontMetricsInt.bottom = i13;
            } else {
                int L = ((-i12) / 2) - org.telegram.messenger.i0.L(4.0f);
                fontMetricsInt.ascent = L;
                fontMetricsInt.top = L;
                int L2 = (i12 - (i12 / 2)) - org.telegram.messenger.i0.L(4.0f);
                fontMetricsInt.descent = L2;
                fontMetricsInt.bottom = L2;
            }
        }
        return this.f30071b;
    }
}
