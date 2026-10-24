package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class t41 extends o6 {
    public final Paint f30722s;
    public final t90 v;
    public final v41 f30723w;

    public t41(v41 v41Var, Context context) {
        super(context, false, false, false);
        this.f30723w = v41Var;
        this.f30722s = new Paint(1);
        this.v = new t90();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (LocaleController.isRTL) {
            AndroidUtilities.rectTmp.set(getWidth() - d(), (getHeight() - AndroidUtilities.dp(18.0f)) / 2.0f, getWidth(), (AndroidUtilities.dp(18.0f) + getHeight()) / 2.0f);
        } else {
            AndroidUtilities.rectTmp.set(0.0f, (getHeight() - AndroidUtilities.dp(18.0f)) / 2.0f, d(), (AndroidUtilities.dp(18.0f) + getHeight()) / 2.0f);
        }
        x41 x41Var = this.f30723w.f31321n;
        int i10 = org.telegram.ui.ActionBar.k6.Pi;
        String[] strArr = x41.X;
        int o12 = org.telegram.ui.ActionBar.k6.o1(0.1175f, x41Var.getThemedColor(i10));
        Paint paint = this.f30722s;
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
        x41 x41Var = this.f30723w.f31321n;
        int action = motionEvent.getAction();
        t90 t90Var = this.v;
        if (action == 0) {
            g6Var = ((org.telegram.ui.ActionBar.h3) x41Var).resourcesProvider;
            x90 x90Var = new x90(null, g6Var, motionEvent.getX(), motionEvent.getY(), 0);
            x90Var.d(org.telegram.ui.ActionBar.k6.o1(0.1175f, x41Var.getThemedColor(org.telegram.ui.ActionBar.k6.Pi)));
            q90 b10 = x90Var.b();
            if (LocaleController.isRTL) {
                AndroidUtilities.rectTmp.set(getWidth() - d(), (getHeight() - AndroidUtilities.dp(18.0f)) / 2.0f, getWidth(), (AndroidUtilities.dp(18.0f) + getHeight()) / 2.0f);
            } else {
                AndroidUtilities.rectTmp.set(0.0f, (getHeight() - AndroidUtilities.dp(18.0f)) / 2.0f, d(), (AndroidUtilities.dp(18.0f) + getHeight()) / 2.0f);
            }
            b10.addRect(AndroidUtilities.rectTmp, Path.Direction.CW);
            t90Var.a(x90Var, null);
            invalidate();
            return true;
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (motionEvent.getAction() == 1) {
                performClick();
            }
            t90Var.d(true);
            invalidate();
        }
        return super.onTouchEvent(motionEvent);
    }
}
