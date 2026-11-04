package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.d4;
public final class e2 extends View {
    public final TextPaint f39320a;
    public final Paint f39321b;
    public final float f39322c;
    public final String d;
    public volatile Bitmap f39323e;

    public e2(Context context, String str) {
        super(context);
        TextPaint textPaint = new TextPaint(1);
        this.f39320a = textPaint;
        this.f39321b = new Paint(1);
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
        textPaint.setColor(-1);
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        this.f39322c = textPaint.measureText(str);
        this.d = str;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f39323e != null) {
            canvas.drawBitmap(this.f39323e, 0.0f, 0.0f, this.f39321b);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        if (z10) {
            Utilities.f21387e.c(new d4(this, 15));
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(getPaddingRight() + getPaddingLeft() + ((int) this.f39322c), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824));
    }
}
