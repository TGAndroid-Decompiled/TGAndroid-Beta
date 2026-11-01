package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
public final class d4 extends FrameLayout {
    public final org.telegram.ui.Components.on0 f36476a;
    public final int f36477b;
    public final int f36478c;
    public int d;
    public final TextPaint e;
    public final h4 f36479f;

    public d4(h4 h4Var, Context context) {
        super(context);
        this.f36479f = h4Var;
        this.f36477b = 12;
        this.f36478c = 30;
        setWillNotDraw(false);
        TextPaint textPaint = new TextPaint(1);
        this.e = textPaint;
        textPaint.setTextSize(org.telegram.messenger.i0.L(16.0f));
        org.telegram.ui.Components.on0 on0Var = new org.telegram.ui.Components.on0(context, null, false);
        this.f36476a = on0Var;
        on0Var.setReportChanges(true);
        on0Var.setSeparatorsCount(19);
        on0Var.setDelegate(new e(this, 3));
        addView(on0Var, w7.b6.d(-1, 38.0f, 51, 5.0f, 5.0f, 39.0f, 0.0f));
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f36476a.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = org.telegram.ui.ActionBar.t6.I6;
        this.f36479f.getClass();
        int v02 = org.telegram.ui.ActionBar.t6.v0(i10);
        TextPaint textPaint = this.e;
        textPaint.setColor(v02);
        canvas.drawText("" + org.telegram.messenger.uz.Z0, getMeasuredWidth() - org.telegram.messenger.i0.L(39.0f), org.telegram.messenger.i0.L(28.0f), textPaint);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int size = View.MeasureSpec.getSize(i10);
        if (this.d != size) {
            int i12 = org.telegram.messenger.uz.Z0;
            int i13 = this.f36477b;
            this.f36476a.setProgress((i12 - i13) / (this.f36478c - i13));
            this.d = size;
        }
    }
}
