package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextPaint;
import android.view.animation.OvershootInterpolator;
import org.telegram.messenger.AndroidUtilities;
public final class il extends org.telegram.ui.Components.g01 {
    public final tn G;

    public il(Activity activity, org.telegram.ui.ActionBar.c6 c6Var, tn tnVar) {
        super(activity);
        this.G = tnVar;
        TextPaint textPaint = new TextPaint(1);
        this.f28696b = textPaint;
        Paint paint = new Paint(1);
        this.f28697c = paint;
        this.d = AndroidUtilities.dp(24.0f);
        this.f28698e = new OvershootInterpolator();
        this.D = new org.telegram.ui.Components.fq0(this, 14);
        this.F = new Path();
        int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Hi, c6Var);
        int alpha = Color.alpha(v02);
        textPaint.setTextSize(AndroidUtilities.dp(15.0f));
        textPaint.setColor(v02);
        paint.setColor(v02);
        paint.setAlpha((int) (alpha * 0.14d));
        setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Fi, c6Var)));
    }

    public final void d() {
        int i10 = -(AndroidUtilities.dp(16.0f) + getMeasuredHeight());
        tn tnVar = this.G;
        int top = tnVar.U.getTop() - tnVar.T0.getMeasuredHeight();
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
