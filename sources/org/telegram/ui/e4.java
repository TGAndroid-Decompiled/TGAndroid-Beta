package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class e4 extends FrameLayout {
    public final org.telegram.ui.Components.lp0 f37190a;
    public final int f37191b;
    public final int f37192c;
    public int d;
    public final TextPaint f37193e;
    public final i4 f37194f;

    public e4(i4 i4Var, Context context) {
        super(context);
        this.f37194f = i4Var;
        this.f37191b = 12;
        this.f37192c = 30;
        setWillNotDraw(false);
        TextPaint textPaint = new TextPaint(1);
        this.f37193e = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(16.0f));
        org.telegram.ui.Components.lp0 lp0Var = new org.telegram.ui.Components.lp0(context, null, false);
        this.f37190a = lp0Var;
        lp0Var.setReportChanges(true);
        lp0Var.setSeparatorsCount(19);
        lp0Var.setDelegate(new g(this, 3));
        addView(lp0Var, w7.x5.a(38.0f, 5.0f, 5.0f, 39.0f, 0.0f, -1, 51));
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f37190a.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = org.telegram.ui.ActionBar.i6.I6;
        this.f37194f.getClass();
        int x02 = org.telegram.ui.ActionBar.i6.x0(null, i10, false);
        TextPaint textPaint = this.f37193e;
        textPaint.setColor(x02);
        canvas.drawText("" + SharedConfig.ivFontSize, getMeasuredWidth() - AndroidUtilities.dp(39.0f), AndroidUtilities.dp(28.0f), textPaint);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int size = View.MeasureSpec.getSize(i10);
        if (this.d != size) {
            int i12 = SharedConfig.ivFontSize;
            int i13 = this.f37191b;
            this.f37190a.setProgress((i12 - i13) / (this.f37192c - i13));
            this.d = size;
        }
    }
}
