package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
public final class c4 extends FrameLayout {
    public final org.telegram.ui.Components.qm0 f45891a;
    public final int f45892b;
    public final int f45893c;
    public int d;
    public final TextPaint f45894e;
    public final g4 f45895f;

    public c4(g4 g4Var, Context context) {
        super(context);
        this.f45895f = g4Var;
        this.f45892b = 12;
        this.f45893c = 30;
        setWillNotDraw(false);
        TextPaint textPaint = new TextPaint(1);
        this.f45894e = textPaint;
        textPaint.setTextSize(org.telegram.messenger.g0.L(16.0f));
        org.telegram.ui.Components.qm0 qm0Var = new org.telegram.ui.Components.qm0(context, null, false);
        this.f45891a = qm0Var;
        qm0Var.setReportChanges(true);
        qm0Var.setSeparatorsCount(19);
        qm0Var.setDelegate(new f(this, 3));
        addView(qm0Var, c8.ja.d(-1, 38.0f, 51, 5.0f, 5.0f, 39.0f, 0.0f));
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f45891a.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7 = org.telegram.ui.ActionBar.j6.I6;
        this.f45895f.getClass();
        int v02 = org.telegram.ui.ActionBar.j6.v0(i7);
        TextPaint textPaint = this.f45894e;
        textPaint.setColor(v02);
        canvas.drawText("" + org.telegram.messenger.gz.Z0, getMeasuredWidth() - org.telegram.messenger.g0.L(39.0f), org.telegram.messenger.g0.L(28.0f), textPaint);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        int size = View.MeasureSpec.getSize(i7);
        if (this.d != size) {
            int i11 = org.telegram.messenger.gz.Z0;
            int i12 = this.f45892b;
            this.f45891a.setProgress((i11 - i12) / (this.f45893c - i12));
            this.d = size;
        }
    }
}
