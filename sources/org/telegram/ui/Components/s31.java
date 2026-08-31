package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class s31 extends k6 {
    public final Paint f30976s;
    public final d90 v;
    public final u31 f30977w;

    public s31(u31 u31Var, Context context) {
        super(context, false, false, false);
        this.f30977w = u31Var;
        this.f30976s = new Paint(1);
        this.v = new d90();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (LocaleController.isRTL) {
            AndroidUtilities.rectTmp.set(getWidth() - d(), (getHeight() - AndroidUtilities.dp(18.0f)) / 2.0f, getWidth(), (AndroidUtilities.dp(18.0f) + getHeight()) / 2.0f);
        } else {
            AndroidUtilities.rectTmp.set(0.0f, (getHeight() - AndroidUtilities.dp(18.0f)) / 2.0f, d(), (AndroidUtilities.dp(18.0f) + getHeight()) / 2.0f);
        }
        w31 w31Var = this.f30977w.h;
        int i10 = org.telegram.ui.ActionBar.k6.Pi;
        String[] strArr = w31.O;
        int l1 = org.telegram.ui.ActionBar.k6.l1(0.1175f, w31Var.getThemedColor(i10));
        Paint paint = this.f30976s;
        paint.setColor(l1);
        canvas.drawRoundRect(AndroidUtilities.rectTmp, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint);
        if (this.v.f(canvas)) {
            invalidate();
        }
        super.onDraw(canvas);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.g6 g6Var;
        w31 w31Var = this.f30977w.h;
        int action = motionEvent.getAction();
        d90 d90Var = this.v;
        if (action == 0) {
            g6Var = ((org.telegram.ui.ActionBar.h3) w31Var).resourcesProvider;
            h90 h90Var = new h90(null, g6Var, motionEvent.getX(), motionEvent.getY(), 0);
            h90Var.d(org.telegram.ui.ActionBar.k6.l1(0.1175f, w31Var.getThemedColor(org.telegram.ui.ActionBar.k6.Pi)));
            z80 b10 = h90Var.b();
            if (LocaleController.isRTL) {
                AndroidUtilities.rectTmp.set(getWidth() - d(), (getHeight() - AndroidUtilities.dp(18.0f)) / 2.0f, getWidth(), (AndroidUtilities.dp(18.0f) + getHeight()) / 2.0f);
            } else {
                AndroidUtilities.rectTmp.set(0.0f, (getHeight() - AndroidUtilities.dp(18.0f)) / 2.0f, d(), (AndroidUtilities.dp(18.0f) + getHeight()) / 2.0f);
            }
            b10.addRect(AndroidUtilities.rectTmp, Path.Direction.CW);
            d90Var.a(h90Var, null);
            invalidate();
            return true;
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (motionEvent.getAction() == 1) {
                performClick();
            }
            d90Var.d(true);
            invalidate();
        }
        return super.onTouchEvent(motionEvent);
    }
}
