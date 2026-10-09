package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class e4 extends FrameLayout {
    public final org.telegram.ui.Components.kp0 f37146a;
    public final int f37147b;
    public final int f37148c;
    public int d;
    public final TextPaint f37149e;
    public final i4 f37150f;

    public e4(i4 i4Var, Context context) {
        super(context);
        this.f37150f = i4Var;
        this.f37147b = 12;
        this.f37148c = 30;
        setWillNotDraw(false);
        TextPaint textPaint = new TextPaint(1);
        this.f37149e = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(16.0f));
        org.telegram.ui.Components.kp0 kp0Var = new org.telegram.ui.Components.kp0(context, null, false);
        this.f37146a = kp0Var;
        kp0Var.setReportChanges(true);
        kp0Var.setSeparatorsCount(19);
        kp0Var.setDelegate(new g(this, 3));
        addView(kp0Var, w7.x5.a(38.0f, 5.0f, 5.0f, 39.0f, 0.0f, -1, 51));
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f37146a.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = org.telegram.ui.ActionBar.i6.I6;
        this.f37150f.getClass();
        int x02 = org.telegram.ui.ActionBar.i6.x0(null, i10, false);
        TextPaint textPaint = this.f37149e;
        textPaint.setColor(x02);
        canvas.drawText("" + SharedConfig.ivFontSize, getMeasuredWidth() - AndroidUtilities.dp(39.0f), AndroidUtilities.dp(28.0f), textPaint);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int size = View.MeasureSpec.getSize(i10);
        if (this.d != size) {
            int i12 = SharedConfig.ivFontSize;
            int i13 = this.f37147b;
            this.f37146a.setProgress((i12 - i13) / (this.f37148c - i13));
            this.d = size;
        }
    }
}
