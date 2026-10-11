package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class d4 extends FrameLayout {
    public final org.telegram.ui.Components.mp0 f36893a;
    public final int f36894b;
    public final int f36895c;
    public int d;
    public final TextPaint f36896e;
    public final h4 f36897f;

    public d4(h4 h4Var, Context context) {
        super(context);
        this.f36897f = h4Var;
        this.f36894b = 12;
        this.f36895c = 30;
        setWillNotDraw(false);
        TextPaint textPaint = new TextPaint(1);
        this.f36896e = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(16.0f));
        org.telegram.ui.Components.mp0 mp0Var = new org.telegram.ui.Components.mp0(context, null, false);
        this.f36893a = mp0Var;
        mp0Var.setReportChanges(true);
        mp0Var.setSeparatorsCount(19);
        mp0Var.setDelegate(new g(this, 3));
        addView(mp0Var, w7.x5.a(38.0f, 5.0f, 5.0f, 39.0f, 0.0f, -1, 51));
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f36893a.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = org.telegram.ui.ActionBar.h6.I6;
        this.f36897f.getClass();
        int x02 = org.telegram.ui.ActionBar.h6.x0(null, i10, false);
        TextPaint textPaint = this.f36896e;
        textPaint.setColor(x02);
        canvas.drawText("" + SharedConfig.ivFontSize, getMeasuredWidth() - AndroidUtilities.dp(39.0f), AndroidUtilities.dp(28.0f), textPaint);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int size = View.MeasureSpec.getSize(i10);
        if (this.d != size) {
            int i12 = SharedConfig.ivFontSize;
            int i13 = this.f36894b;
            this.f36893a.setProgress((i12 - i13) / (this.f36895c - i13));
            this.d = size;
        }
    }
}
