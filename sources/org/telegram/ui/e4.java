package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class e4 extends FrameLayout {
    public final org.telegram.ui.Components.fo0 f35919a;
    public final int f35920b;
    public final int f35921c;
    public int d;
    public final TextPaint f35922e;
    public final i4 f35923f;

    public e4(i4 i4Var, Context context) {
        super(context);
        this.f35923f = i4Var;
        this.f35920b = 12;
        this.f35921c = 30;
        setWillNotDraw(false);
        TextPaint textPaint = new TextPaint(1);
        this.f35922e = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(16.0f));
        org.telegram.ui.Components.fo0 fo0Var = new org.telegram.ui.Components.fo0(context, null, false);
        this.f35919a = fo0Var;
        fo0Var.setReportChanges(true);
        fo0Var.setSeparatorsCount(19);
        fo0Var.setDelegate(new g(this, 3));
        addView(fo0Var, w7.x5.d(-1, 38.0f, 51, 5.0f, 5.0f, 39.0f, 0.0f));
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f35919a.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = org.telegram.ui.ActionBar.j6.I6;
        this.f35923f.getClass();
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, i10, false);
        TextPaint textPaint = this.f35922e;
        textPaint.setColor(w02);
        canvas.drawText("" + SharedConfig.ivFontSize, getMeasuredWidth() - AndroidUtilities.dp(39.0f), AndroidUtilities.dp(28.0f), textPaint);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int size = View.MeasureSpec.getSize(i10);
        if (this.d != size) {
            int i12 = SharedConfig.ivFontSize;
            int i13 = this.f35920b;
            this.f35919a.setProgress((i12 - i13) / (this.f35921c - i13));
            this.d = size;
        }
    }
}
