package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextPaint;
import android.view.animation.OvershootInterpolator;
import org.telegram.messenger.AndroidUtilities;
public final class il extends org.telegram.ui.Components.m11 {
    public final qn K;

    public il(Activity activity, org.telegram.ui.ActionBar.d6 d6Var, qn qnVar) {
        super(activity);
        this.K = qnVar;
        TextPaint textPaint = new TextPaint(1);
        this.f28347b = textPaint;
        Paint paint = new Paint(1);
        this.f28348c = paint;
        this.d = AndroidUtilities.dp(24.0f);
        this.e = new OvershootInterpolator();
        this.H = new org.telegram.ui.Components.hr0(this, 14);
        this.J = new Path();
        int w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Hi, d6Var);
        int alpha = Color.alpha(w02);
        textPaint.setTextSize(AndroidUtilities.dp(15.0f));
        textPaint.setColor(w02);
        paint.setColor(w02);
        paint.setAlpha((int) (alpha * 0.14d));
        setBackground(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Fi, d6Var)));
    }

    public final void d() {
        int i10 = -(AndroidUtilities.dp(16.0f) + getMeasuredHeight());
        qn qnVar = this.K;
        int top = qnVar.Y.getTop() - qnVar.X0.getMeasuredHeight();
        setTranslationY(top - ((1.0f - getPrepareProgress()) * (top + i10)));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        d();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        d();
    }
}
