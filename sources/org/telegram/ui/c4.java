package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
public final class c4 extends FrameLayout {
    public final org.telegram.ui.Components.ym0 f46369a;
    public final int f46370b;
    public final int f46371c;
    public int d;
    public final TextPaint f46372e;
    public final g4 f46373f;

    public c4(g4 g4Var, Context context) {
        super(context);
        this.f46373f = g4Var;
        this.f46370b = 12;
        this.f46371c = 30;
        setWillNotDraw(false);
        TextPaint textPaint = new TextPaint(1);
        this.f46372e = textPaint;
        textPaint.setTextSize(org.telegram.messenger.g0.L(16.0f));
        org.telegram.ui.Components.ym0 ym0Var = new org.telegram.ui.Components.ym0(context, null, false);
        this.f46369a = ym0Var;
        ym0Var.setReportChanges(true);
        ym0Var.setSeparatorsCount(19);
        ym0Var.setDelegate(new f(this, 3));
        addView(ym0Var, c8.ma.d(-1, 38.0f, 51, 5.0f, 5.0f, 39.0f, 0.0f));
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f46369a.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7 = org.telegram.ui.ActionBar.n6.I6;
        this.f46373f.getClass();
        int v02 = org.telegram.ui.ActionBar.n6.v0(i7);
        TextPaint textPaint = this.f46372e;
        textPaint.setColor(v02);
        canvas.drawText("" + org.telegram.messenger.bz.Z0, getMeasuredWidth() - org.telegram.messenger.g0.L(39.0f), org.telegram.messenger.g0.L(28.0f), textPaint);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        int size = View.MeasureSpec.getSize(i7);
        if (this.d != size) {
            int i11 = org.telegram.messenger.bz.Z0;
            int i12 = this.f46370b;
            this.f46369a.setProgress((i11 - i12) / (this.f46371c - i12));
            this.d = size;
        }
    }
}
