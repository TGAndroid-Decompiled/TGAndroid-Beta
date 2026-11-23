package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.Utilities;
public final class s2 extends View {
    public final TextPaint f41313a;
    public final Paint f41314b;
    public final float f41315c;
    public final String d;
    public volatile Bitmap f41316e;

    public s2(Context context, String str) {
        super(context);
        TextPaint textPaint = new TextPaint(1);
        this.f41313a = textPaint;
        this.f41314b = new Paint(1);
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
        textPaint.setColor(-1);
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        this.f41315c = textPaint.measureText(str);
        this.d = str;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f41316e != null) {
            canvas.drawBitmap(this.f41316e, 0.0f, 0.0f, this.f41314b);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        if (z10) {
            Utilities.f22774e.c(new org.telegram.tgnet.m(this, 23));
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(getPaddingRight() + getPaddingLeft() + ((int) this.f41315c), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824));
    }
}
