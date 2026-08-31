package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextPaint;
import android.view.animation.OvershootInterpolator;
import org.telegram.messenger.AndroidUtilities;
public final class ol extends org.telegram.ui.Components.s01 {
    public final xn H;

    public ol(Activity activity, org.telegram.ui.ActionBar.g6 g6Var, xn xnVar) {
        super(activity);
        this.H = xnVar;
        TextPaint textPaint = new TextPaint(1);
        this.f30928b = textPaint;
        Paint paint = new Paint(1);
        this.f30929c = paint;
        this.d = AndroidUtilities.dp(24.0f);
        this.f30930e = new OvershootInterpolator();
        this.E = new org.telegram.ui.Components.oq0(this, 14);
        this.G = new Path();
        int v02 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Hi, g6Var);
        int alpha = Color.alpha(v02);
        textPaint.setTextSize(AndroidUtilities.dp(15.0f));
        textPaint.setColor(v02);
        paint.setColor(v02);
        paint.setAlpha((int) (alpha * 0.14d));
        setBackground(org.telegram.ui.ActionBar.k6.b0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Fi, g6Var)));
    }

    public final void d() {
        int i10 = -(AndroidUtilities.dp(16.0f) + getMeasuredHeight());
        xn xnVar = this.H;
        int top = xnVar.V.getTop() - xnVar.U0.getMeasuredHeight();
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
