package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class d4 extends FrameLayout {
    public final org.telegram.ui.Components.go0 f32991a;
    public final int f32992b;
    public final int f32993c;
    public int d;
    public final TextPaint e;
    public final h4 f32994f;

    public d4(h4 h4Var, Context context) {
        super(context);
        this.f32994f = h4Var;
        this.f32992b = 12;
        this.f32993c = 30;
        setWillNotDraw(false);
        TextPaint textPaint = new TextPaint(1);
        this.e = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(16.0f));
        org.telegram.ui.Components.go0 go0Var = new org.telegram.ui.Components.go0(context, null, false);
        this.f32991a = go0Var;
        go0Var.setReportChanges(true);
        go0Var.setSeparatorsCount(19);
        go0Var.setDelegate(new g(this, 3));
        addView(go0Var, w7.x5.d(-1, 38.0f, 51, 5.0f, 5.0f, 39.0f, 0.0f));
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f32991a.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = org.telegram.ui.ActionBar.j6.I6;
        this.f32994f.getClass();
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
            int i13 = this.f32992b;
            this.f32991a.setProgress((i12 - i13) / (this.f32993c - i13));
            this.d = size;
        }
    }
}
