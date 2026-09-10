package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class f4 extends FrameLayout {
    public final org.telegram.ui.Components.oo0 f32677a;
    public final int f32678b;
    public final int f32679c;
    public int d;
    public final TextPaint e;
    public final j4 f32680f;

    public f4(j4 j4Var, Context context) {
        super(context);
        this.f32680f = j4Var;
        this.f32678b = 12;
        this.f32679c = 30;
        setWillNotDraw(false);
        TextPaint textPaint = new TextPaint(1);
        this.e = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(16.0f));
        org.telegram.ui.Components.oo0 oo0Var = new org.telegram.ui.Components.oo0(context, null, false);
        this.f32677a = oo0Var;
        oo0Var.setReportChanges(true);
        oo0Var.setSeparatorsCount(19);
        oo0Var.setDelegate(new g(this, 3));
        addView(oo0Var, w7.a6.d(-1, 38.0f, 51, 5.0f, 5.0f, 39.0f, 0.0f));
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f32677a.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = org.telegram.ui.ActionBar.j6.I6;
        this.f32680f.getClass();
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, i10, false);
        TextPaint textPaint = this.e;
        textPaint.setColor(w02);
        canvas.drawText("" + SharedConfig.ivFontSize, getMeasuredWidth() - AndroidUtilities.dp(39.0f), AndroidUtilities.dp(28.0f), textPaint);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int size = View.MeasureSpec.getSize(i10);
        if (this.d != size) {
            int i12 = SharedConfig.ivFontSize;
            int i13 = this.f32678b;
            this.f32677a.setProgress((i12 - i13) / (this.f32679c - i13));
            this.d = size;
        }
    }
}
