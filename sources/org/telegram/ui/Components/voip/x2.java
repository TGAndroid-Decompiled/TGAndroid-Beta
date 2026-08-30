package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.view.View;
import nh.n5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class x2 extends View {
    public final TextPaint f30033a;
    public final Paint f30034b;
    public final float f30035c;
    public final String d;
    public volatile Bitmap e;

    public x2(Context context, String str) {
        super(context);
        TextPaint textPaint = new TextPaint(1);
        this.f30033a = textPaint;
        this.f30034b = new Paint(1);
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
        textPaint.setColor(-1);
        textPaint.setTypeface(AndroidUtilities.bold());
        this.f30035c = textPaint.measureText(str);
        this.d = str;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.e != null) {
            canvas.drawBitmap(this.e, 0.0f, 0.0f, this.f30034b);
        }
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        if (z4) {
            Utilities.globalQueue.postRunnable(new n5(this, 27));
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(getPaddingRight() + getPaddingLeft() + ((int) this.f30035c), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824));
    }
}
