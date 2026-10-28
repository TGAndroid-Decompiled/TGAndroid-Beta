package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class e4 extends FrameLayout {
    public final org.telegram.ui.Components.mp0 f38749a;
    public final int f38750b;
    public final int f38751c;
    public int d;
    public final TextPaint e;
    public final j4 f38752f;

    public e4(j4 j4Var, Context context) {
        super(context);
        this.f38752f = j4Var;
        this.f38750b = 12;
        this.f38751c = 30;
        setWillNotDraw(false);
        TextPaint textPaint = new TextPaint(1);
        this.e = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(16.0f));
        org.telegram.ui.Components.mp0 mp0Var = new org.telegram.ui.Components.mp0(context, null, false);
        this.f38749a = mp0Var;
        mp0Var.setReportChanges(true);
        mp0Var.setSeparatorsCount(19);
        mp0Var.setDelegate(new f(this, 3));
        addView(mp0Var, org.telegram.ui.Components.kb1.h(-1, 38.0f, 51, 5.0f, 5.0f, 39.0f, 0.0f));
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f38749a.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = org.telegram.ui.ActionBar.y6.I6;
        this.f38752f.getClass();
        int x02 = org.telegram.ui.ActionBar.y6.x0(null, i10, false);
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
            int i13 = this.f38750b;
            this.f38749a.setProgress((i12 - i13) / (this.f38751c - i13));
            this.d = size;
        }
    }
}
