package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
public final class c4 extends FrameLayout {
    public final org.telegram.ui.Components.mm0 f44537a;
    public final int f44538b;
    public final int f44539c;
    public int d;
    public final TextPaint f44540e;
    public final g4 f44541f;

    public c4(g4 g4Var, Context context) {
        super(context);
        this.f44541f = g4Var;
        this.f44538b = 12;
        this.f44539c = 30;
        setWillNotDraw(false);
        TextPaint textPaint = new TextPaint(1);
        this.f44540e = textPaint;
        textPaint.setTextSize(org.telegram.messenger.g0.L(16.0f));
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(context, null, false);
        this.f44537a = mm0Var;
        mm0Var.setReportChanges(true);
        mm0Var.setSeparatorsCount(19);
        mm0Var.setDelegate(new f(this, 3));
        addView(mm0Var, c8.ha.d(-1, 38.0f, 51, 5.0f, 5.0f, 39.0f, 0.0f));
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f44537a.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7 = org.telegram.ui.ActionBar.k6.I6;
        this.f44541f.getClass();
        int v02 = org.telegram.ui.ActionBar.k6.v0(i7);
        TextPaint textPaint = this.f44540e;
        textPaint.setColor(v02);
        canvas.drawText("" + org.telegram.messenger.iz.Z0, getMeasuredWidth() - org.telegram.messenger.g0.L(39.0f), org.telegram.messenger.g0.L(28.0f), textPaint);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        int size = View.MeasureSpec.getSize(i7);
        if (this.d != size) {
            int i11 = org.telegram.messenger.iz.Z0;
            int i12 = this.f44538b;
            this.f44537a.setProgress((i11 - i12) / (this.f44539c - i12));
            this.d = size;
        }
    }
}
