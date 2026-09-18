package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class d4 extends FrameLayout {
    public final org.telegram.ui.Components.to0 f32857a;
    public final int f32858b;
    public final int f32859c;
    public int d;
    public final TextPaint e;
    public final h4 f32860f;

    public d4(h4 h4Var, Context context) {
        super(context);
        this.f32860f = h4Var;
        this.f32858b = 12;
        this.f32859c = 30;
        setWillNotDraw(false);
        TextPaint textPaint = new TextPaint(1);
        this.e = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(16.0f));
        org.telegram.ui.Components.to0 to0Var = new org.telegram.ui.Components.to0(context, null, false);
        this.f32857a = to0Var;
        to0Var.setReportChanges(true);
        to0Var.setSeparatorsCount(19);
        to0Var.setDelegate(new g(this, 3));
        addView(to0Var, w7.y5.d(-1, 38.0f, 51, 5.0f, 5.0f, 39.0f, 0.0f));
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f32857a.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = org.telegram.ui.ActionBar.j6.I6;
        this.f32860f.getClass();
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, i10, false);
        TextPaint textPaint = this.e;
        textPaint.setColor(w02);
        canvas.drawText("" + SharedConfig.ivFontSize, getMeasuredWidth() - AndroidUtilities.dp(39.0f), AndroidUtilities.dp(28.0f), textPaint);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int size = View.MeasureSpec.getSize(i10);
        if (this.d != size) {
            int i12 = SharedConfig.ivFontSize;
            int i13 = this.f32858b;
            this.f32857a.setProgress((i12 - i13) / (this.f32859c - i13));
            this.d = size;
        }
    }
}
