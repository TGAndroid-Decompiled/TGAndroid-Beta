package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

public final class x21 extends j6 {

    public final Paint f34449s;
    public final m80 v;

    public final z21 f34450w;

    public x21(z21 z21Var, Context context) {
        super(context, false, false, false);
        this.f34450w = z21Var;
        this.f34449s = new Paint(1);
        this.v = new m80();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (LocaleController.isRTL) {
            AndroidUtilities.rectTmp.set(getWidth() - d(), (getHeight() - AndroidUtilities.dp(18.0f)) / 2.0f, getWidth(), (AndroidUtilities.dp(18.0f) + getHeight()) / 2.0f);
        } else {
            AndroidUtilities.rectTmp.set(0.0f, (getHeight() - AndroidUtilities.dp(18.0f)) / 2.0f, d(), (AndroidUtilities.dp(18.0f) + getHeight()) / 2.0f);
        }
        b31 b31Var = this.f34450w.h;
        int i10 = org.telegram.ui.ActionBar.g6.Pi;
        String[] strArr = b31.N;
        int iL1 = org.telegram.ui.ActionBar.g6.l1(0.1175f, b31Var.getThemedColor(i10));
        Paint paint = this.f34449s;
        paint.setColor(iL1);
        canvas.drawRoundRect(AndroidUtilities.rectTmp, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint);
        if (this.v.f(canvas)) {
            invalidate();
        }
        super.onDraw(canvas);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        b31 b31Var = this.f34450w.h;
        int action = motionEvent.getAction();
        m80 m80Var = this.v;
        if (action != 0) {
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (motionEvent.getAction() == 1) {
                    performClick();
                }
                m80Var.d(true);
                invalidate();
            }
            return super.onTouchEvent(motionEvent);
        }
        q80 q80Var = new q80(null, ((org.telegram.ui.ActionBar.e3) b31Var).resourcesProvider, motionEvent.getX(), motionEvent.getY(), 0);
        q80Var.d(org.telegram.ui.ActionBar.g6.l1(0.1175f, b31Var.getThemedColor(org.telegram.ui.ActionBar.g6.Pi)));
        j80 j80VarB = q80Var.b();
        if (LocaleController.isRTL) {
            AndroidUtilities.rectTmp.set(getWidth() - d(), (getHeight() - AndroidUtilities.dp(18.0f)) / 2.0f, getWidth(), (AndroidUtilities.dp(18.0f) + getHeight()) / 2.0f);
        } else {
            AndroidUtilities.rectTmp.set(0.0f, (getHeight() - AndroidUtilities.dp(18.0f)) / 2.0f, d(), (AndroidUtilities.dp(18.0f) + getHeight()) / 2.0f);
        }
        j80VarB.addRect(AndroidUtilities.rectTmp, Path.Direction.CW);
        m80Var.a(q80Var, null);
        invalidate();
        return true;
    }
}
