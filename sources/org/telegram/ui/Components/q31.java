package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class q31 extends q6 {
    public final Paint f29564s;
    public final a90 v;
    public final s31 f29565w;

    public q31(s31 s31Var, Context context) {
        super(context, false, false, false);
        this.f29565w = s31Var;
        this.f29564s = new Paint(1);
        this.v = new a90();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (LocaleController.isRTL) {
            AndroidUtilities.rectTmp.set(getWidth() - d(), (getHeight() - AndroidUtilities.dp(18.0f)) / 2.0f, getWidth(), (AndroidUtilities.dp(18.0f) + getHeight()) / 2.0f);
        } else {
            AndroidUtilities.rectTmp.set(0.0f, (getHeight() - AndroidUtilities.dp(18.0f)) / 2.0f, d(), (AndroidUtilities.dp(18.0f) + getHeight()) / 2.0f);
        }
        u31 u31Var = this.f29565w.h;
        int i10 = org.telegram.ui.ActionBar.j6.Pi;
        String[] strArr = u31.R;
        int l1 = org.telegram.ui.ActionBar.j6.l1(0.1175f, u31Var.getThemedColor(i10));
        Paint paint = this.f29564s;
        paint.setColor(l1);
        canvas.drawRoundRect(AndroidUtilities.rectTmp, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint);
        if (this.v.f(canvas)) {
            invalidate();
        }
        super.onDraw(canvas);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.f6 f6Var;
        u31 u31Var = this.f29565w.h;
        int action = motionEvent.getAction();
        a90 a90Var = this.v;
        if (action == 0) {
            f6Var = ((org.telegram.ui.ActionBar.f3) u31Var).resourcesProvider;
            e90 e90Var = new e90(null, f6Var, motionEvent.getX(), motionEvent.getY(), 0);
            e90Var.d(org.telegram.ui.ActionBar.j6.l1(0.1175f, u31Var.getThemedColor(org.telegram.ui.ActionBar.j6.Pi)));
            x80 b10 = e90Var.b();
            if (LocaleController.isRTL) {
                AndroidUtilities.rectTmp.set(getWidth() - d(), (getHeight() - AndroidUtilities.dp(18.0f)) / 2.0f, getWidth(), (AndroidUtilities.dp(18.0f) + getHeight()) / 2.0f);
            } else {
                AndroidUtilities.rectTmp.set(0.0f, (getHeight() - AndroidUtilities.dp(18.0f)) / 2.0f, d(), (AndroidUtilities.dp(18.0f) + getHeight()) / 2.0f);
            }
            b10.addRect(AndroidUtilities.rectTmp, Path.Direction.CW);
            a90Var.a(e90Var, null);
            invalidate();
            return true;
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (motionEvent.getAction() == 1) {
                performClick();
            }
            a90Var.d(true);
            invalidate();
        }
        return super.onTouchEvent(motionEvent);
    }
}
