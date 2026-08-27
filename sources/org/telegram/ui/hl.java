package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextPaint;
import android.view.animation.OvershootInterpolator;
import org.telegram.messenger.AndroidUtilities;

public final class hl extends org.telegram.ui.Components.wz0 {
    public final rn G;

    public hl(Activity activity, org.telegram.ui.ActionBar.c6 c6Var, rn rnVar) {
        super(activity);
        this.G = rnVar;
        TextPaint textPaint = new TextPaint(1);
        this.f34399b = textPaint;
        Paint paint = new Paint(1);
        this.f34400c = paint;
        this.d = AndroidUtilities.dp(24.0f);
        this.f34401e = new OvershootInterpolator();
        this.D = new org.telegram.ui.Components.up0(this, 14);
        this.F = new Path();
        int iV0 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Hi, c6Var);
        int iAlpha = Color.alpha(iV0);
        textPaint.setTextSize(AndroidUtilities.dp(15.0f));
        textPaint.setColor(iV0);
        paint.setColor(iV0);
        paint.setAlpha((int) (((double) iAlpha) * 0.14d));
        setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Fi, c6Var)));
    }

    public final void d() {
        int i10 = -(AndroidUtilities.dp(16.0f) + getMeasuredHeight());
        rn rnVar = this.G;
        int top = rnVar.U.getTop() - rnVar.T0.getMeasuredHeight();
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
