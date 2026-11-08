package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.m5;
public final class p2 extends View {
    public final TextPaint f39471a;
    public final Paint f39472b;
    public final float f39473c;
    public final String d;
    public volatile Bitmap f39474e;

    public p2(Context context, String str) {
        super(context);
        TextPaint textPaint = new TextPaint(1);
        this.f39471a = textPaint;
        this.f39472b = new Paint(1);
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
        textPaint.setColor(-1);
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        this.f39473c = textPaint.measureText(str);
        this.d = str;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f39474e != null) {
            canvas.drawBitmap(this.f39474e, 0.0f, 0.0f, this.f39472b);
        }
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        if (z9) {
            Utilities.f21336e.c(new m5(this, 10));
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(getPaddingRight() + getPaddingLeft() + ((int) this.f39473c), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824));
    }
}
