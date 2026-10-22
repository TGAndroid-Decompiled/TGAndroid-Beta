package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class p41 extends q6 {
    public final Paint f29209s;
    public final u90 v;
    public final r41 f29210w;

    public p41(r41 r41Var, Context context) {
        super(context, false, false, false);
        this.f29210w = r41Var;
        this.f29209s = new Paint(1);
        this.v = new u90();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (LocaleController.isRTL) {
            AndroidUtilities.rectTmp.set(getWidth() - d(), (getHeight() - AndroidUtilities.dp(18.0f)) / 2.0f, getWidth(), (AndroidUtilities.dp(18.0f) + getHeight()) / 2.0f);
        } else {
            AndroidUtilities.rectTmp.set(0.0f, (getHeight() - AndroidUtilities.dp(18.0f)) / 2.0f, d(), (AndroidUtilities.dp(18.0f) + getHeight()) / 2.0f);
        }
        t41 t41Var = this.f29210w.f29827n;
        int i10 = org.telegram.ui.ActionBar.h6.Pi;
        String[] strArr = t41.R;
        int m12 = org.telegram.ui.ActionBar.h6.m1(0.1175f, t41Var.getThemedColor(i10));
        Paint paint = this.f29209s;
        paint.setColor(m12);
        canvas.drawRoundRect(AndroidUtilities.rectTmp, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint);
        if (this.v.f(canvas)) {
            invalidate();
        }
        super.onDraw(canvas);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.d6 d6Var;
        t41 t41Var = this.f29210w.f29827n;
        int action = motionEvent.getAction();
        u90 u90Var = this.v;
        if (action == 0) {
            d6Var = ((org.telegram.ui.ActionBar.f3) t41Var).resourcesProvider;
            y90 y90Var = new y90(null, d6Var, motionEvent.getX(), motionEvent.getY(), 0);
            y90Var.d(org.telegram.ui.ActionBar.h6.m1(0.1175f, t41Var.getThemedColor(org.telegram.ui.ActionBar.h6.Pi)));
            r90 b10 = y90Var.b();
            if (LocaleController.isRTL) {
                AndroidUtilities.rectTmp.set(getWidth() - d(), (getHeight() - AndroidUtilities.dp(18.0f)) / 2.0f, getWidth(), (AndroidUtilities.dp(18.0f) + getHeight()) / 2.0f);
            } else {
                AndroidUtilities.rectTmp.set(0.0f, (getHeight() - AndroidUtilities.dp(18.0f)) / 2.0f, d(), (AndroidUtilities.dp(18.0f) + getHeight()) / 2.0f);
            }
            b10.addRect(AndroidUtilities.rectTmp, Path.Direction.CW);
            u90Var.a(y90Var, null);
            invalidate();
            return true;
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (motionEvent.getAction() == 1) {
                performClick();
            }
            u90Var.d(true);
            invalidate();
        }
        return super.onTouchEvent(motionEvent);
    }
}
