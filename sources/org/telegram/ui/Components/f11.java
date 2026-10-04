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
public final class f11 extends ReplacementSpan {
    public static final int f26234f = 0;
    public ImageReceiver f26235a;
    public int f26236b;
    public int f26237c;
    public final boolean d;
    public final int f26238e;

    public f11(View view, Bitmap bitmap, int i10, int i11, int i12, int i13) {
        this.f26236b = i10;
        this.f26237c = i11;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f26235a = imageReceiver;
        imageReceiver.setInvalidateAll(true);
        imageReceiver.setImageBitmap(bitmap);
        imageReceiver.setColorFilter(new PorterDuffColorFilter(i12, PorterDuff.Mode.SRC_IN));
        this.f26238e = i13;
        this.d = true;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        int i15 = this.f26236b;
        int i16 = this.f26237c;
        ImageReceiver imageReceiver = this.f26235a;
        canvas.save();
        if (this.d) {
            imageReceiver.setImageCoords((int) f7, i13 - (i16 - this.f26238e), i15, i16);
        } else {
            imageReceiver.setImageCoords((int) f7, hg.c.y(org.telegram.messenger.q.B(4.0f, i14, i12), i16, 2, i12), i15, i16);
        }
        imageReceiver.draw(canvas);
        canvas.restore();
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        int i12 = this.f26237c;
        if (fontMetricsInt != null) {
            if (this.d) {
                int i13 = this.f26238e;
                int i14 = -(i12 - i13);
                fontMetricsInt.ascent = i14;
                fontMetricsInt.top = i14;
                fontMetricsInt.descent = i13;
                fontMetricsInt.bottom = i13;
            } else {
                int dp = ((-i12) / 2) - AndroidUtilities.dp(4.0f);
                fontMetricsInt.ascent = dp;
                fontMetricsInt.top = dp;
                int dp2 = (i12 - (i12 / 2)) - AndroidUtilities.dp(4.0f);
                fontMetricsInt.descent = dp2;
                fontMetricsInt.bottom = dp2;
            }
        }
        return this.f26236b;
    }
}
