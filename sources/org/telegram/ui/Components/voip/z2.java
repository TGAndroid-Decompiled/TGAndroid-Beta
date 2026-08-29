package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.view.View;
import nh.m6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class z2 extends View {
    public final TextPaint f34158a;
    public final Paint f34159b;
    public final float f34160c;
    public final String d;
    public volatile Bitmap f34161e;

    public z2(Context context, String str) {
        super(context);
        TextPaint textPaint = new TextPaint(1);
        this.f34158a = textPaint;
        this.f34159b = new Paint(1);
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
        textPaint.setColor(-1);
        textPaint.setTypeface(AndroidUtilities.bold());
        this.f34160c = textPaint.measureText(str);
        this.d = str;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f34161e != null) {
            canvas.drawBitmap(this.f34161e, 0.0f, 0.0f, this.f34159b);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            Utilities.globalQueue.postRunnable(new m6(this, 22));
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(getPaddingRight() + getPaddingLeft() + ((int) this.f34160c), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824));
    }
}
