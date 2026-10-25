package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class b51 extends s6 {
    public final Paint f26756s;
    public final w90 v;
    public final d51 f26757w;

    public b51(d51 d51Var, Context context) {
        super(context, false, false, false);
        this.f26757w = d51Var;
        this.f26756s = new Paint(1);
        this.v = new w90();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (LocaleController.isRTL) {
            AndroidUtilities.rectTmp.set(getWidth() - d(), (getHeight() - AndroidUtilities.dp(18.0f)) / 2.0f, getWidth(), (AndroidUtilities.dp(18.0f) + getHeight()) / 2.0f);
        } else {
            AndroidUtilities.rectTmp.set(0.0f, (getHeight() - AndroidUtilities.dp(18.0f)) / 2.0f, d(), (AndroidUtilities.dp(18.0f) + getHeight()) / 2.0f);
        }
        f51 f51Var = this.f26757w.f27402n;
        int i10 = org.telegram.ui.ActionBar.y6.Pi;
        String[] strArr = f51.X;
        int o12 = org.telegram.ui.ActionBar.y6.o1(0.1175f, f51Var.getThemedColor(i10));
        Paint paint = this.f26756s;
        paint.setColor(o12);
        canvas.drawRoundRect(AndroidUtilities.rectTmp, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint);
        if (this.v.f(canvas)) {
            invalidate();
        }
        super.onDraw(canvas);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.u6 u6Var;
        f51 f51Var = this.f26757w.f27402n;
        int action = motionEvent.getAction();
        w90 w90Var = this.v;
        if (action == 0) {
            u6Var = ((org.telegram.ui.ActionBar.k3) f51Var).resourcesProvider;
            aa0 aa0Var = new aa0(null, u6Var, motionEvent.getX(), motionEvent.getY(), 0);
            aa0Var.d(org.telegram.ui.ActionBar.y6.o1(0.1175f, f51Var.getThemedColor(org.telegram.ui.ActionBar.y6.Pi)));
            s90 b10 = aa0Var.b();
            if (LocaleController.isRTL) {
                AndroidUtilities.rectTmp.set(getWidth() - d(), (getHeight() - AndroidUtilities.dp(18.0f)) / 2.0f, getWidth(), (AndroidUtilities.dp(18.0f) + getHeight()) / 2.0f);
            } else {
                AndroidUtilities.rectTmp.set(0.0f, (getHeight() - AndroidUtilities.dp(18.0f)) / 2.0f, d(), (AndroidUtilities.dp(18.0f) + getHeight()) / 2.0f);
            }
            b10.addRect(AndroidUtilities.rectTmp, Path.Direction.CW);
            w90Var.a(aa0Var, null);
            invalidate();
            return true;
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (motionEvent.getAction() == 1) {
                performClick();
            }
            w90Var.d(true);
            invalidate();
        }
        return super.onTouchEvent(motionEvent);
    }
}
