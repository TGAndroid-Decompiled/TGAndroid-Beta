package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class h4 extends FrameLayout {
    public final org.telegram.ui.Components.lo0 f37319a;
    public final int f37320b;
    public final int f37321c;
    public int d;
    public final TextPaint f37322e;
    public final l4 f37323f;

    public h4(l4 l4Var, Context context) {
        super(context);
        this.f37323f = l4Var;
        this.f37320b = 12;
        this.f37321c = 30;
        setWillNotDraw(false);
        TextPaint textPaint = new TextPaint(1);
        this.f37322e = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(16.0f));
        org.telegram.ui.Components.lo0 lo0Var = new org.telegram.ui.Components.lo0(context, null, false);
        this.f37319a = lo0Var;
        lo0Var.setReportChanges(true);
        lo0Var.setSeparatorsCount(19);
        lo0Var.setDelegate(new h(this, 3));
        addView(lo0Var, k7.c6.d(-1, 38.0f, 51, 5.0f, 5.0f, 39.0f, 0.0f));
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f37319a.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = org.telegram.ui.ActionBar.k6.I6;
        this.f37323f.getClass();
        int w02 = org.telegram.ui.ActionBar.k6.w0(null, i10, false);
        TextPaint textPaint = this.f37322e;
        textPaint.setColor(w02);
        canvas.drawText("" + SharedConfig.ivFontSize, getMeasuredWidth() - AndroidUtilities.dp(39.0f), AndroidUtilities.dp(28.0f), textPaint);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int size = View.MeasureSpec.getSize(i10);
        if (this.d != size) {
            int i12 = SharedConfig.ivFontSize;
            int i13 = this.f37320b;
            this.f37319a.setProgress((i12 - i13) / (this.f37321c - i13));
            this.d = size;
        }
    }
}
