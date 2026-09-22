package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class d4 extends FrameLayout {
    public final org.telegram.ui.Components.fo0 f32924a;
    public final int f32925b;
    public final int f32926c;
    public int d;
    public final TextPaint e;
    public final h4 f32927f;

    public d4(h4 h4Var, Context context) {
        super(context);
        this.f32927f = h4Var;
        this.f32925b = 12;
        this.f32926c = 30;
        setWillNotDraw(false);
        TextPaint textPaint = new TextPaint(1);
        this.e = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(16.0f));
        org.telegram.ui.Components.fo0 fo0Var = new org.telegram.ui.Components.fo0(context, null, false);
        this.f32924a = fo0Var;
        fo0Var.setReportChanges(true);
        fo0Var.setSeparatorsCount(19);
        fo0Var.setDelegate(new g(this, 3));
        addView(fo0Var, w7.x5.d(-1, 38.0f, 51, 5.0f, 5.0f, 39.0f, 0.0f));
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f32924a.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = org.telegram.ui.ActionBar.i6.I6;
        this.f32927f.getClass();
        int w02 = org.telegram.ui.ActionBar.i6.w0(null, i10, false);
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
            int i13 = this.f32925b;
            this.f32924a.setProgress((i12 - i13) / (this.f32926c - i13));
            this.d = size;
        }
    }
}
