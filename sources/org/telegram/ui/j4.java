package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class j4 extends FrameLayout {
    public final org.telegram.ui.Components.jo0 f35078a;
    public final int f35079b;
    public final int f35080c;
    public int d;
    public final TextPaint e;
    public final n4 f35081f;

    public j4(n4 n4Var, Context context) {
        super(context);
        this.f35081f = n4Var;
        this.f35079b = 12;
        this.f35080c = 30;
        setWillNotDraw(false);
        TextPaint textPaint = new TextPaint(1);
        this.e = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(16.0f));
        org.telegram.ui.Components.jo0 jo0Var = new org.telegram.ui.Components.jo0(context, null, false);
        this.f35078a = jo0Var;
        jo0Var.setReportChanges(true);
        jo0Var.setSeparatorsCount(19);
        jo0Var.setDelegate(new h(this, 3));
        addView(jo0Var, k7.b6.d(-1, 38.0f, 51, 5.0f, 5.0f, 39.0f, 0.0f));
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f35078a.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = org.telegram.ui.ActionBar.j6.I6;
        this.f35081f.getClass();
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
            int i13 = this.f35079b;
            this.f35078a.setProgress((i12 - i13) / (this.f35080c - i13));
            this.d = size;
        }
    }
}
