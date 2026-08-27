package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;

public final class i4 extends FrameLayout {

    public final org.telegram.ui.Components.qn0 f38970a;

    public final int f38971b;

    public final int f38972c;
    public int d;

    public final TextPaint f38973e;

    public final m4 f38974f;

    public i4(m4 m4Var, Context context) {
        super(context);
        this.f38974f = m4Var;
        this.f38971b = 12;
        this.f38972c = 30;
        setWillNotDraw(false);
        TextPaint textPaint = new TextPaint(1);
        this.f38973e = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(16.0f));
        org.telegram.ui.Components.qn0 qn0Var = new org.telegram.ui.Components.qn0(context, null, false);
        this.f38970a = qn0Var;
        qn0Var.setReportChanges(true);
        qn0Var.setSeparatorsCount(19);
        qn0Var.setDelegate(new g(this, 3));
        addView(qn0Var, h7.z5.d(-1, 38.0f, 51, 5.0f, 5.0f, 39.0f, 0.0f));
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f38970a.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = org.telegram.ui.ActionBar.g6.I6;
        this.f38974f.getClass();
        int iW0 = org.telegram.ui.ActionBar.g6.w0(null, i10, false);
        TextPaint textPaint = this.f38973e;
        textPaint.setColor(iW0);
        canvas.drawText("" + SharedConfig.ivFontSize, getMeasuredWidth() - AndroidUtilities.dp(39.0f), AndroidUtilities.dp(28.0f), textPaint);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int size = View.MeasureSpec.getSize(i10);
        if (this.d != size) {
            int i12 = SharedConfig.ivFontSize;
            int i13 = this.f38971b;
            this.f38970a.setProgress((i12 - i13) / (this.f38972c - i13));
            this.d = size;
        }
    }
}
