package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class u41 extends q6 {
    public final Paint f31080s;
    public final v90 v;
    public final w41 f31081w;

    public u41(w41 w41Var, Context context) {
        super(context, false, false, false);
        this.f31081w = w41Var;
        this.f31080s = new Paint(1);
        this.v = new v90();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (LocaleController.isRTL) {
            AndroidUtilities.rectTmp.set(getWidth() - d(), (getHeight() - AndroidUtilities.dp(18.0f)) / 2.0f, getWidth(), (AndroidUtilities.dp(18.0f) + getHeight()) / 2.0f);
        } else {
            AndroidUtilities.rectTmp.set(0.0f, (getHeight() - AndroidUtilities.dp(18.0f)) / 2.0f, d(), (AndroidUtilities.dp(18.0f) + getHeight()) / 2.0f);
        }
        y41 y41Var = this.f31081w.f32157n;
        int i10 = org.telegram.ui.ActionBar.k6.Pi;
        String[] strArr = y41.X;
        int o12 = org.telegram.ui.ActionBar.k6.o1(0.1175f, y41Var.getThemedColor(i10));
        Paint paint = this.f31080s;
        paint.setColor(o12);
        canvas.drawRoundRect(AndroidUtilities.rectTmp, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint);
        if (this.v.f(canvas)) {
            invalidate();
        }
        super.onDraw(canvas);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.g6 g6Var;
        y41 y41Var = this.f31081w.f32157n;
        int action = motionEvent.getAction();
        v90 v90Var = this.v;
        if (action == 0) {
            g6Var = ((org.telegram.ui.ActionBar.h3) y41Var).resourcesProvider;
            z90 z90Var = new z90(null, g6Var, motionEvent.getX(), motionEvent.getY(), 0);
            z90Var.d(org.telegram.ui.ActionBar.k6.o1(0.1175f, y41Var.getThemedColor(org.telegram.ui.ActionBar.k6.Pi)));
            s90 b10 = z90Var.b();
            if (LocaleController.isRTL) {
                AndroidUtilities.rectTmp.set(getWidth() - d(), (getHeight() - AndroidUtilities.dp(18.0f)) / 2.0f, getWidth(), (AndroidUtilities.dp(18.0f) + getHeight()) / 2.0f);
            } else {
                AndroidUtilities.rectTmp.set(0.0f, (getHeight() - AndroidUtilities.dp(18.0f)) / 2.0f, d(), (AndroidUtilities.dp(18.0f) + getHeight()) / 2.0f);
            }
            b10.addRect(AndroidUtilities.rectTmp, Path.Direction.CW);
            v90Var.a(z90Var, null);
            invalidate();
            return true;
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (motionEvent.getAction() == 1) {
                performClick();
            }
            v90Var.d(true);
            invalidate();
        }
        return super.onTouchEvent(motionEvent);
    }
}
