package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextPaint;
import android.view.animation.OvershootInterpolator;
import org.telegram.messenger.AndroidUtilities;
public final class fl extends org.telegram.ui.Components.uz0 {
    public final qn G;

    public fl(Activity activity, org.telegram.ui.ActionBar.b6 b6Var, qn qnVar) {
        super(activity);
        this.G = qnVar;
        TextPaint textPaint = new TextPaint(1);
        this.f33175b = textPaint;
        Paint paint = new Paint(1);
        this.f33176c = paint;
        this.d = AndroidUtilities.dp(24.0f);
        this.f33177e = new OvershootInterpolator();
        this.D = new org.telegram.ui.Components.tp0(this, 14);
        this.F = new Path();
        int v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Hi, b6Var);
        int alpha = Color.alpha(v02);
        textPaint.setTextSize(AndroidUtilities.dp(15.0f));
        textPaint.setColor(v02);
        paint.setColor(v02);
        paint.setAlpha((int) (alpha * 0.14d));
        setBackground(org.telegram.ui.ActionBar.f6.b0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Fi, b6Var)));
    }

    public final void d() {
        int i9 = -(AndroidUtilities.dp(16.0f) + getMeasuredHeight());
        qn qnVar = this.G;
        int top = qnVar.U.getTop() - qnVar.T0.getMeasuredHeight();
        setTranslationY(top - ((1.0f - getPrepareProgress()) * (top + i9)));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        d();
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        d();
    }
}
