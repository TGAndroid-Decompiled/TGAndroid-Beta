package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.style.ReplacementSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public final class oz0 extends ReplacementSpan {
    public static final int f31478f = 0;
    public ImageReceiver f31479a;
    public int f31480b;
    public int f31481c;
    public final boolean d;
    public final int f31482e;

    public oz0(View view, Bitmap bitmap, int i9, int i10, int i11, int i12) {
        this.f31480b = i9;
        this.f31481c = i10;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f31479a = imageReceiver;
        imageReceiver.setInvalidateAll(true);
        imageReceiver.setImageBitmap(bitmap);
        imageReceiver.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.SRC_IN));
        this.f31482e = i12;
        this.d = true;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i9, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        int i14 = this.f31480b;
        int i15 = this.f31481c;
        ImageReceiver imageReceiver = this.f31479a;
        canvas.save();
        if (this.d) {
            imageReceiver.setImageCoords((int) f10, i12 - (i15 - this.f31482e), i14, i15);
        } else {
            imageReceiver.setImageCoords((int) f10, j3.r0.d(org.telegram.messenger.l0.B(4.0f, i13, i11), i15, 2, i11), i14, i15);
        }
        imageReceiver.draw(canvas);
        canvas.restore();
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i9, int i10, Paint.FontMetricsInt fontMetricsInt) {
        int i11 = this.f31481c;
        if (fontMetricsInt != null) {
            if (this.d) {
                int i12 = this.f31482e;
                int i13 = -(i11 - i12);
                fontMetricsInt.ascent = i13;
                fontMetricsInt.top = i13;
                fontMetricsInt.descent = i12;
                fontMetricsInt.bottom = i12;
            } else {
                int dp = ((-i11) / 2) - AndroidUtilities.dp(4.0f);
                fontMetricsInt.ascent = dp;
                fontMetricsInt.top = dp;
                int dp2 = (i11 - (i11 / 2)) - AndroidUtilities.dp(4.0f);
                fontMetricsInt.descent = dp2;
                fontMetricsInt.bottom = dp2;
            }
        }
        return this.f31480b;
    }
}
