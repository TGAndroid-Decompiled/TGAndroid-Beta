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

public final class qz0 extends ReplacementSpan {

    public static final int f32008f = 0;

    public ImageReceiver f32009a;

    public int f32010b;

    public int f32011c;
    public final boolean d;

    public final int f32012e;

    public qz0(View view, Bitmap bitmap, int i10, int i11, int i12, int i13) {
        this.f32010b = i10;
        this.f32011c = i11;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f32009a = imageReceiver;
        imageReceiver.setInvalidateAll(true);
        imageReceiver.setImageBitmap(bitmap);
        imageReceiver.setColorFilter(new PorterDuffColorFilter(i12, PorterDuff.Mode.SRC_IN));
        this.f32012e = i13;
        this.d = true;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        int i15 = this.f32010b;
        int i16 = this.f32011c;
        ImageReceiver imageReceiver = this.f32009a;
        canvas.save();
        if (this.d) {
            imageReceiver.setImageCoords((int) f10, i13 - (i16 - this.f32012e), i15, i16);
        } else {
            imageReceiver.setImageCoords((int) f10, i0.a.B(org.telegram.messenger.y1.B(4.0f, i14, i12), i16, 2, i12), i15, i16);
        }
        imageReceiver.draw(canvas);
        canvas.restore();
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        int i12 = this.f32011c;
        if (fontMetricsInt != null) {
            if (this.d) {
                int i13 = this.f32012e;
                int i14 = -(i12 - i13);
                fontMetricsInt.ascent = i14;
                fontMetricsInt.top = i14;
                fontMetricsInt.descent = i13;
                fontMetricsInt.bottom = i13;
            } else {
                int iDp = ((-i12) / 2) - AndroidUtilities.dp(4.0f);
                fontMetricsInt.ascent = iDp;
                fontMetricsInt.top = iDp;
                int iDp2 = (i12 - (i12 / 2)) - AndroidUtilities.dp(4.0f);
                fontMetricsInt.descent = iDp2;
                fontMetricsInt.bottom = iDp2;
            }
        }
        return this.f32010b;
    }
}
