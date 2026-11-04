package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextPaint;
import android.view.animation.OvershootInterpolator;
public final class pk extends org.telegram.ui.Components.sy0 {
    public final wm L;

    public pk(Activity activity, org.telegram.ui.ActionBar.e6 e6Var, wm wmVar) {
        super(activity);
        this.L = wmVar;
        TextPaint textPaint = new TextPaint(1);
        this.f38194b = textPaint;
        Paint paint = new Paint(1);
        this.f38195c = paint;
        this.d = org.telegram.messenger.g0.L(24.0f);
        this.f38196e = new OvershootInterpolator();
        this.I = new org.telegram.ui.Components.sp0(this, 14);
        this.K = new Path();
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.vj, e6Var);
        int alpha = Color.alpha(w02);
        textPaint.setTextSize(org.telegram.messenger.g0.L(15.0f));
        textPaint.setColor(w02);
        paint.setColor(w02);
        paint.setAlpha((int) (alpha * 0.14d));
        int L = org.telegram.messenger.g0.L(6.0f);
        int i3 = org.telegram.ui.ActionBar.k6.tj;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(L, org.telegram.ui.ActionBar.k6.w0(i3, e6Var));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i3);
        setBackground(d02);
        org.telegram.ui.ActionBar.r6.k(this, d02, N, null, e6Var);
    }

    public final void d() {
        int i3 = -(org.telegram.messenger.g0.L(16.0f) + getMeasuredHeight());
        wm wmVar = this.L;
        int top = wmVar.f51237a0.getTop() - wmVar.m1.getMeasuredHeight();
        setTranslationY(top - ((1.0f - getPrepareProgress()) * (top + i3)));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        d();
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        d();
    }
}
