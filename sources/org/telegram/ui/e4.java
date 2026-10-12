package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class e4 extends FrameLayout {
    public final org.telegram.ui.Components.qp0 f36966a;
    public final int f36967b;
    public final int f36968c;
    public int d;
    public final TextPaint f36969e;
    public final i4 f36970f;

    public e4(i4 i4Var, Context context) {
        super(context);
        this.f36970f = i4Var;
        this.f36967b = 12;
        this.f36968c = 30;
        setWillNotDraw(false);
        TextPaint textPaint = new TextPaint(1);
        this.f36969e = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(16.0f));
        org.telegram.ui.Components.qp0 qp0Var = new org.telegram.ui.Components.qp0(context, null, false);
        this.f36966a = qp0Var;
        qp0Var.setReportChanges(true);
        qp0Var.setSeparatorsCount(19);
        qp0Var.setDelegate(new g(this, 3));
        addView(qp0Var, w7.w5.a(38.0f, 5.0f, 5.0f, 39.0f, 0.0f, -1, 51));
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f36966a.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = org.telegram.ui.ActionBar.h6.I6;
        this.f36970f.getClass();
        int x02 = org.telegram.ui.ActionBar.h6.x0(null, i10, false);
        TextPaint textPaint = this.f36969e;
        textPaint.setColor(x02);
        canvas.drawText("" + SharedConfig.ivFontSize, getMeasuredWidth() - AndroidUtilities.dp(39.0f), AndroidUtilities.dp(28.0f), textPaint);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int size = View.MeasureSpec.getSize(i10);
        if (this.d != size) {
            int i12 = SharedConfig.ivFontSize;
            int i13 = this.f36967b;
            this.f36966a.setProgress((i12 - i13) / (this.f36968c - i13));
            this.d = size;
        }
    }
}
