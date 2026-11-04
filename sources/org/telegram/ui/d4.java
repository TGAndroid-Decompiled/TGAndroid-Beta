package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
public final class d4 extends FrameLayout {
    public final org.telegram.ui.Components.pm0 f44533a;
    public final int f44534b;
    public final int f44535c;
    public int d;
    public final TextPaint f44536e;
    public final i4 f44537f;

    public d4(i4 i4Var, Context context) {
        super(context);
        this.f44537f = i4Var;
        this.f44534b = 12;
        this.f44535c = 30;
        setWillNotDraw(false);
        TextPaint textPaint = new TextPaint(1);
        this.f44536e = textPaint;
        textPaint.setTextSize(org.telegram.messenger.g0.L(16.0f));
        org.telegram.ui.Components.pm0 pm0Var = new org.telegram.ui.Components.pm0(context, null, false);
        this.f44533a = pm0Var;
        pm0Var.setReportChanges(true);
        pm0Var.setSeparatorsCount(19);
        pm0Var.setDelegate(new f(this, 3));
        addView(pm0Var, b8.mf.d(-1, 38.0f, 51, 5.0f, 5.0f, 39.0f, 0.0f));
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f44533a.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i3 = org.telegram.ui.ActionBar.k6.I6;
        this.f44537f.getClass();
        int v02 = org.telegram.ui.ActionBar.k6.v0(i3);
        TextPaint textPaint = this.f44536e;
        textPaint.setColor(v02);
        canvas.drawText("" + org.telegram.messenger.az.Z0, getMeasuredWidth() - org.telegram.messenger.g0.L(39.0f), org.telegram.messenger.g0.L(28.0f), textPaint);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        int size = View.MeasureSpec.getSize(i3);
        if (this.d != size) {
            int i11 = org.telegram.messenger.az.Z0;
            int i12 = this.f44534b;
            this.f44533a.setProgress((i11 - i12) / (this.f44535c - i12));
            this.d = size;
        }
    }
}
