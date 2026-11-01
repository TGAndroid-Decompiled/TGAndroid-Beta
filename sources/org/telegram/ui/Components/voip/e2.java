package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.w5;
public final class e2 extends View {
    public final TextPaint f31469a;
    public final Paint f31470b;
    public final float f31471c;
    public final String d;
    public volatile Bitmap e;

    public e2(Context context, String str) {
        super(context);
        TextPaint textPaint = new TextPaint(1);
        this.f31469a = textPaint;
        this.f31470b = new Paint(1);
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTextSize(org.telegram.messenger.i0.L(13.0f));
        textPaint.setColor(-1);
        textPaint.setTypeface(org.telegram.messenger.i0.o());
        this.f31471c = textPaint.measureText(str);
        this.d = str;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.e != null) {
            canvas.drawBitmap(this.e, 0.0f, 0.0f, this.f31470b);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            Utilities.e.c(new w5(this, 11));
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(getPaddingRight() + getPaddingLeft() + ((int) this.f31471c), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824));
    }
}
