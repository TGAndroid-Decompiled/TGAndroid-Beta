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
public final class kl extends org.telegram.ui.Components.x11 {
    public final un K;

    public kl(Activity activity, org.telegram.ui.ActionBar.u6 u6Var, un unVar) {
        super(activity);
        this.K = unVar;
        TextPaint textPaint = new TextPaint(1);
        this.f34581b = textPaint;
        Paint paint = new Paint(1);
        this.f34582c = paint;
        this.d = AndroidUtilities.dp(24.0f);
        this.e = new OvershootInterpolator();
        this.H = new org.telegram.ui.Components.mp0(this, 20);
        this.J = new Path();
        int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Hi, u6Var);
        int alpha = Color.alpha(w02);
        textPaint.setTextSize(AndroidUtilities.dp(15.0f));
        textPaint.setColor(w02);
        paint.setColor(w02);
        paint.setAlpha((int) (alpha * 0.14d));
        int dp = AndroidUtilities.dp(6.0f);
        int i10 = org.telegram.ui.ActionBar.y6.Fi;
        ShapeDrawable c02 = org.telegram.ui.ActionBar.y6.c0(dp, org.telegram.ui.ActionBar.y6.w0(i10, u6Var));
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i10);
        setBackground(c02);
        org.telegram.ui.ActionBar.f7.k(this, c02, N, null, u6Var);
    }

    public final void d() {
        int i10 = -(AndroidUtilities.dp(16.0f) + getMeasuredHeight());
        un unVar = this.K;
        int top = unVar.Y.getTop() - unVar.f44292j1.getMeasuredHeight();
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
