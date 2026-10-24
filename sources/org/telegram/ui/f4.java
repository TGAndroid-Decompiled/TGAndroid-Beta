package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class f4 extends FrameLayout {
    public final org.telegram.ui.Components.gp0 f37182a;
    public final int f37183b;
    public final int f37184c;
    public int d;
    public final TextPaint e;
    public final k4 f37185f;

    public f4(k4 k4Var, Context context) {
        super(context);
        this.f37185f = k4Var;
        this.f37183b = 12;
        this.f37184c = 30;
        setWillNotDraw(false);
        TextPaint textPaint = new TextPaint(1);
        this.e = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(16.0f));
        org.telegram.ui.Components.gp0 gp0Var = new org.telegram.ui.Components.gp0(context, null, false);
        this.f37182a = gp0Var;
        gp0Var.setReportChanges(true);
        gp0Var.setSeparatorsCount(19);
        gp0Var.setDelegate(new f(this, 3));
        addView(gp0Var, w7.z5.d(-1, 38.0f, 51, 5.0f, 5.0f, 39.0f, 0.0f));
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f37182a.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = org.telegram.ui.ActionBar.k6.I6;
        this.f37185f.getClass();
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, i10, false);
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
            int i13 = this.f37183b;
            this.f37182a.setProgress((i12 - i13) / (this.f37184c - i13));
            this.d = size;
        }
    }
}
