package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class e4 extends FrameLayout {
    public final org.telegram.ui.Components.zo0 f35940a;
    public final int f35941b;
    public final int f35942c;
    public int d;
    public final TextPaint f35943e;
    public final i4 f35944f;

    public e4(i4 i4Var, Context context) {
        super(context);
        this.f35944f = i4Var;
        this.f35941b = 12;
        this.f35942c = 30;
        setWillNotDraw(false);
        TextPaint textPaint = new TextPaint(1);
        this.f35943e = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(16.0f));
        org.telegram.ui.Components.zo0 zo0Var = new org.telegram.ui.Components.zo0(context, null, false);
        this.f35940a = zo0Var;
        zo0Var.setReportChanges(true);
        zo0Var.setSeparatorsCount(19);
        zo0Var.setDelegate(new g(this, 3));
        addView(zo0Var, w7.z5.d(-1, 38.0f, 51, 5.0f, 5.0f, 39.0f, 0.0f));
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f35940a.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = org.telegram.ui.ActionBar.i6.I6;
        this.f35944f.getClass();
        int w02 = org.telegram.ui.ActionBar.i6.w0(null, i10, false);
        TextPaint textPaint = this.f35943e;
        textPaint.setColor(w02);
        canvas.drawText("" + SharedConfig.ivFontSize, getMeasuredWidth() - AndroidUtilities.dp(39.0f), AndroidUtilities.dp(28.0f), textPaint);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int size = View.MeasureSpec.getSize(i10);
        if (this.d != size) {
            int i12 = SharedConfig.ivFontSize;
            int i13 = this.f35941b;
            this.f35940a.setProgress((i12 - i13) / (this.f35942c - i13));
            this.d = size;
        }
    }
}
