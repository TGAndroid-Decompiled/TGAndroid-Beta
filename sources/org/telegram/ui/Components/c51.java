package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class c51 extends r6 {
    public final Paint f24830s;
    public final fa0 v;
    public final e51 f24831w;

    public c51(e51 e51Var, Context context) {
        super(context, false, false, false);
        this.f24831w = e51Var;
        this.f24830s = new Paint(1);
        this.v = new fa0();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (LocaleController.isRTL) {
            AndroidUtilities.rectTmp.set(getWidth() - d(), (getHeight() - AndroidUtilities.dp(18.0f)) / 2.0f, getWidth(), (AndroidUtilities.dp(18.0f) + getHeight()) / 2.0f);
        } else {
            AndroidUtilities.rectTmp.set(0.0f, (getHeight() - AndroidUtilities.dp(18.0f)) / 2.0f, d(), (AndroidUtilities.dp(18.0f) + getHeight()) / 2.0f);
        }
        g51 g51Var = this.f24831w.f25604n;
        int i10 = org.telegram.ui.ActionBar.h6.Pi;
        String[] strArr = g51.R;
        int m12 = org.telegram.ui.ActionBar.h6.m1(0.1175f, g51Var.getThemedColor(i10));
        Paint paint = this.f24830s;
        paint.setColor(m12);
        canvas.drawRoundRect(AndroidUtilities.rectTmp, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint);
        if (this.v.f(canvas)) {
            invalidate();
        }
        super.onDraw(canvas);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.c6 c6Var;
        g51 g51Var = this.f24831w.f25604n;
        int action = motionEvent.getAction();
        fa0 fa0Var = this.v;
        if (action == 0) {
            c6Var = ((org.telegram.ui.ActionBar.e3) g51Var).resourcesProvider;
            ja0 ja0Var = new ja0(null, c6Var, motionEvent.getX(), motionEvent.getY(), 0);
            ja0Var.d(org.telegram.ui.ActionBar.h6.m1(0.1175f, g51Var.getThemedColor(org.telegram.ui.ActionBar.h6.Pi)));
            ca0 b10 = ja0Var.b();
            if (LocaleController.isRTL) {
                AndroidUtilities.rectTmp.set(getWidth() - d(), (getHeight() - AndroidUtilities.dp(18.0f)) / 2.0f, getWidth(), (AndroidUtilities.dp(18.0f) + getHeight()) / 2.0f);
            } else {
                AndroidUtilities.rectTmp.set(0.0f, (getHeight() - AndroidUtilities.dp(18.0f)) / 2.0f, d(), (AndroidUtilities.dp(18.0f) + getHeight()) / 2.0f);
            }
            b10.addRect(AndroidUtilities.rectTmp, Path.Direction.CW);
            fa0Var.a(ja0Var, null);
            invalidate();
            return true;
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (motionEvent.getAction() == 1) {
                performClick();
            }
            fa0Var.d(true);
            invalidate();
        }
        return super.onTouchEvent(motionEvent);
    }
}
