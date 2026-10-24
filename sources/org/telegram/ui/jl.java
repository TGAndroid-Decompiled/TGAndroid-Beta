package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextPaint;
import android.view.animation.OvershootInterpolator;
import org.telegram.messenger.AndroidUtilities;
public final class jl extends org.telegram.ui.Components.o11 {
    public final sn K;

    public jl(Activity activity, org.telegram.ui.ActionBar.g6 g6Var, sn snVar) {
        super(activity);
        this.K = snVar;
        TextPaint textPaint = new TextPaint(1);
        this.f29125b = textPaint;
        Paint paint = new Paint(1);
        this.f29126c = paint;
        this.d = AndroidUtilities.dp(24.0f);
        this.e = new OvershootInterpolator();
        this.H = new org.telegram.ui.Components.jr0(this, 15);
        this.J = new Path();
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Hi, g6Var);
        int alpha = Color.alpha(w02);
        textPaint.setTextSize(AndroidUtilities.dp(15.0f));
        textPaint.setColor(w02);
        paint.setColor(w02);
        paint.setAlpha((int) (alpha * 0.14d));
        int dp = AndroidUtilities.dp(6.0f);
        int i10 = org.telegram.ui.ActionBar.k6.Fi;
        ShapeDrawable c02 = org.telegram.ui.ActionBar.k6.c0(dp, org.telegram.ui.ActionBar.k6.w0(i10, g6Var));
        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i10);
        setBackground(c02);
        org.telegram.ui.ActionBar.r6.k(this, c02, O, null, g6Var);
    }

    public final void d() {
        int i10 = -(AndroidUtilities.dp(16.0f) + getMeasuredHeight());
        sn snVar = this.K;
        int top = snVar.Y.getTop() - snVar.f41558j1.getMeasuredHeight();
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
