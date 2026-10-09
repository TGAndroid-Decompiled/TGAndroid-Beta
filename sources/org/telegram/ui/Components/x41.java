package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class x41 extends r6 {
    public final Paint f32746s;
    public final ba0 v;
    public final z41 f32747w;

    public x41(z41 z41Var, Context context) {
        super(context, false, false, false);
        this.f32747w = z41Var;
        this.f32746s = new Paint(1);
        this.v = new ba0();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (LocaleController.isRTL) {
            AndroidUtilities.rectTmp.set(getWidth() - d(), (getHeight() - AndroidUtilities.dp(18.0f)) / 2.0f, getWidth(), (AndroidUtilities.dp(18.0f) + getHeight()) / 2.0f);
        } else {
            AndroidUtilities.rectTmp.set(0.0f, (getHeight() - AndroidUtilities.dp(18.0f)) / 2.0f, d(), (AndroidUtilities.dp(18.0f) + getHeight()) / 2.0f);
        }
        b51 b51Var = this.f32747w.f33472n;
        int i10 = org.telegram.ui.ActionBar.i6.Pi;
        String[] strArr = b51.R;
        int m12 = org.telegram.ui.ActionBar.i6.m1(0.1175f, b51Var.getThemedColor(i10));
        Paint paint = this.f32746s;
        paint.setColor(m12);
        canvas.drawRoundRect(AndroidUtilities.rectTmp, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint);
        if (this.v.f(canvas)) {
            invalidate();
        }
        super.onDraw(canvas);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.e6 e6Var;
        b51 b51Var = this.f32747w.f33472n;
        int action = motionEvent.getAction();
        ba0 ba0Var = this.v;
        if (action == 0) {
            e6Var = ((org.telegram.ui.ActionBar.f3) b51Var).resourcesProvider;
            fa0 fa0Var = new fa0(null, e6Var, motionEvent.getX(), motionEvent.getY(), 0);
            fa0Var.d(org.telegram.ui.ActionBar.i6.m1(0.1175f, b51Var.getThemedColor(org.telegram.ui.ActionBar.i6.Pi)));
            y90 b10 = fa0Var.b();
            if (LocaleController.isRTL) {
                AndroidUtilities.rectTmp.set(getWidth() - d(), (getHeight() - AndroidUtilities.dp(18.0f)) / 2.0f, getWidth(), (AndroidUtilities.dp(18.0f) + getHeight()) / 2.0f);
            } else {
                AndroidUtilities.rectTmp.set(0.0f, (getHeight() - AndroidUtilities.dp(18.0f)) / 2.0f, d(), (AndroidUtilities.dp(18.0f) + getHeight()) / 2.0f);
            }
            b10.addRect(AndroidUtilities.rectTmp, Path.Direction.CW);
            ba0Var.a(fa0Var, null);
            invalidate();
            return true;
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (motionEvent.getAction() == 1) {
                performClick();
            }
            ba0Var.d(true);
            invalidate();
        }
        return super.onTouchEvent(motionEvent);
    }
}
