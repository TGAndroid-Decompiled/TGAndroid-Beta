package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class h4 extends FrameLayout {
    public final org.telegram.ui.Components.ko0 f37215a;
    public final int f37216b;
    public final int f37217c;
    public int d;
    public final TextPaint f37218e;
    public final l4 f37219f;

    public h4(l4 l4Var, Context context) {
        super(context);
        this.f37219f = l4Var;
        this.f37216b = 12;
        this.f37217c = 30;
        setWillNotDraw(false);
        TextPaint textPaint = new TextPaint(1);
        this.f37218e = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(16.0f));
        org.telegram.ui.Components.ko0 ko0Var = new org.telegram.ui.Components.ko0(context, null, false);
        this.f37215a = ko0Var;
        ko0Var.setReportChanges(true);
        ko0Var.setSeparatorsCount(19);
        ko0Var.setDelegate(new h(this, 3));
        addView(ko0Var, k7.c6.d(-1, 38.0f, 51, 5.0f, 5.0f, 39.0f, 0.0f));
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f37215a.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = org.telegram.ui.ActionBar.k6.I6;
        this.f37219f.getClass();
        int w02 = org.telegram.ui.ActionBar.k6.w0(null, i10, false);
        TextPaint textPaint = this.f37218e;
        textPaint.setColor(w02);
        canvas.drawText("" + SharedConfig.ivFontSize, getMeasuredWidth() - AndroidUtilities.dp(39.0f), AndroidUtilities.dp(28.0f), textPaint);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int size = View.MeasureSpec.getSize(i10);
        if (this.d != size) {
            int i12 = SharedConfig.ivFontSize;
            int i13 = this.f37216b;
            this.f37215a.setProgress((i12 - i13) / (this.f37217c - i13));
            this.d = size;
        }
    }
}
