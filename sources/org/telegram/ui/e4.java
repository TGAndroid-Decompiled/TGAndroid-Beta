package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class e4 extends FrameLayout {
    public final org.telegram.ui.Components.yo0 f35895a;
    public final int f35896b;
    public final int f35897c;
    public int d;
    public final TextPaint f35898e;
    public final i4 f35899f;

    public e4(i4 i4Var, Context context) {
        super(context);
        this.f35899f = i4Var;
        this.f35896b = 12;
        this.f35897c = 30;
        setWillNotDraw(false);
        TextPaint textPaint = new TextPaint(1);
        this.f35898e = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(16.0f));
        org.telegram.ui.Components.yo0 yo0Var = new org.telegram.ui.Components.yo0(context, null, false);
        this.f35895a = yo0Var;
        yo0Var.setReportChanges(true);
        yo0Var.setSeparatorsCount(19);
        yo0Var.setDelegate(new g(this, 3));
        addView(yo0Var, w7.z5.d(-1, 38.0f, 51, 5.0f, 5.0f, 39.0f, 0.0f));
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f35895a.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = org.telegram.ui.ActionBar.i6.I6;
        this.f35899f.getClass();
        int w02 = org.telegram.ui.ActionBar.i6.w0(null, i10, false);
        TextPaint textPaint = this.f35898e;
        textPaint.setColor(w02);
        canvas.drawText("" + SharedConfig.ivFontSize, getMeasuredWidth() - AndroidUtilities.dp(39.0f), AndroidUtilities.dp(28.0f), textPaint);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int size = View.MeasureSpec.getSize(i10);
        if (this.d != size) {
            int i12 = SharedConfig.ivFontSize;
            int i13 = this.f35896b;
            this.f35895a.setProgress((i12 - i13) / (this.f35897c - i13));
            this.d = size;
        }
    }
}
