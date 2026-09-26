package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class e4 extends FrameLayout {
    public final org.telegram.ui.Components.so0 f33269a;
    public final int f33270b;
    public final int f33271c;
    public int d;
    public final TextPaint e;
    public final i4 f33272f;

    public e4(i4 i4Var, Context context) {
        super(context);
        this.f33272f = i4Var;
        this.f33270b = 12;
        this.f33271c = 30;
        setWillNotDraw(false);
        TextPaint textPaint = new TextPaint(1);
        this.e = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(16.0f));
        org.telegram.ui.Components.so0 so0Var = new org.telegram.ui.Components.so0(context, null, false);
        this.f33269a = so0Var;
        so0Var.setReportChanges(true);
        so0Var.setSeparatorsCount(19);
        so0Var.setDelegate(new g(this, 3));
        addView(so0Var, w7.y5.d(-1, 38.0f, 51, 5.0f, 5.0f, 39.0f, 0.0f));
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f33269a.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = org.telegram.ui.ActionBar.h6.I6;
        this.f33272f.getClass();
        int w02 = org.telegram.ui.ActionBar.h6.w0(null, i10, false);
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
            int i13 = this.f33270b;
            this.f33269a.setProgress((i12 - i13) / (this.f33271c - i13));
            this.d = size;
        }
    }
}
