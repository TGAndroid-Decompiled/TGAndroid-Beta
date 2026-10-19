package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class g4 extends FrameLayout {
    public final org.telegram.ui.Components.cp0 f37171a;
    public final int f37172b;
    public final int f37173c;
    public int d;
    public final TextPaint e;
    public final l4 f37174f;

    public g4(l4 l4Var, Context context) {
        super(context);
        this.f37174f = l4Var;
        this.f37172b = 12;
        this.f37173c = 30;
        setWillNotDraw(false);
        TextPaint textPaint = new TextPaint(1);
        this.e = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(16.0f));
        org.telegram.ui.Components.cp0 cp0Var = new org.telegram.ui.Components.cp0(context, null, false);
        this.f37171a = cp0Var;
        cp0Var.setReportChanges(true);
        cp0Var.setSeparatorsCount(19);
        cp0Var.setDelegate(new g(this, 3));
        addView(cp0Var, w7.z5.d(-1, 38.0f, 51, 5.0f, 5.0f, 39.0f, 0.0f));
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f37171a.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = org.telegram.ui.ActionBar.h6.I6;
        this.f37174f.getClass();
        int x02 = org.telegram.ui.ActionBar.h6.x0(null, i10, false);
        TextPaint textPaint = this.e;
        textPaint.setColor(x02);
        canvas.drawText("" + SharedConfig.ivFontSize, getMeasuredWidth() - AndroidUtilities.dp(39.0f), AndroidUtilities.dp(28.0f), textPaint);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int size = View.MeasureSpec.getSize(i10);
        if (this.d != size) {
            int i12 = SharedConfig.ivFontSize;
            int i13 = this.f37172b;
            this.f37171a.setProgress((i12 - i13) / (this.f37173c - i13));
            this.d = size;
        }
    }
}
