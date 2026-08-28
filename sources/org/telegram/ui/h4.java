package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class h4 extends FrameLayout {
    public final org.telegram.ui.Components.pn0 f38672a;
    public final int f38673b;
    public final int f38674c;
    public int d;
    public final TextPaint f38675e;
    public final l4 f38676f;

    public h4(l4 l4Var, Context context) {
        super(context);
        this.f38676f = l4Var;
        this.f38673b = 12;
        this.f38674c = 30;
        setWillNotDraw(false);
        TextPaint textPaint = new TextPaint(1);
        this.f38675e = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(16.0f));
        org.telegram.ui.Components.pn0 pn0Var = new org.telegram.ui.Components.pn0(context, null, false);
        this.f38672a = pn0Var;
        pn0Var.setReportChanges(true);
        pn0Var.setSeparatorsCount(19);
        pn0Var.setDelegate(new g(this, 3));
        addView(pn0Var, g7.e6.d(-1, 38.0f, 51, 5.0f, 5.0f, 39.0f, 0.0f));
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f38672a.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i9 = org.telegram.ui.ActionBar.f6.I6;
        this.f38676f.getClass();
        int w02 = org.telegram.ui.ActionBar.f6.w0(null, i9, false);
        TextPaint textPaint = this.f38675e;
        textPaint.setColor(w02);
        canvas.drawText("" + SharedConfig.ivFontSize, getMeasuredWidth() - AndroidUtilities.dp(39.0f), AndroidUtilities.dp(28.0f), textPaint);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        int size = View.MeasureSpec.getSize(i9);
        if (this.d != size) {
            int i11 = SharedConfig.ivFontSize;
            int i12 = this.f38673b;
            this.f38672a.setProgress((i11 - i12) / (this.f38674c - i12));
            this.d = size;
        }
    }
}
