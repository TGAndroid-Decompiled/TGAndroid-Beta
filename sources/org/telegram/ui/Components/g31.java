package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class g31 extends o6 {
    public final Paint f28742s;
    public final v80 v;
    public final i31 f28743w;

    public g31(i31 i31Var, Context context) {
        super(context, false, false, false);
        this.f28743w = i31Var;
        this.f28742s = new Paint(1);
        this.v = new v80();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (LocaleController.isRTL) {
            AndroidUtilities.rectTmp.set(getWidth() - d(), (getHeight() - AndroidUtilities.dp(18.0f)) / 2.0f, getWidth(), (AndroidUtilities.dp(18.0f) + getHeight()) / 2.0f);
        } else {
            AndroidUtilities.rectTmp.set(0.0f, (getHeight() - AndroidUtilities.dp(18.0f)) / 2.0f, d(), (AndroidUtilities.dp(18.0f) + getHeight()) / 2.0f);
        }
        k31 k31Var = this.f28743w.h;
        int i10 = org.telegram.ui.ActionBar.g6.Pi;
        String[] strArr = k31.N;
        int l1 = org.telegram.ui.ActionBar.g6.l1(0.1175f, k31Var.getThemedColor(i10));
        Paint paint = this.f28742s;
        paint.setColor(l1);
        canvas.drawRoundRect(AndroidUtilities.rectTmp, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint);
        if (this.v.f(canvas)) {
            invalidate();
        }
        super.onDraw(canvas);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.c6 c6Var;
        k31 k31Var = this.f28743w.h;
        int action = motionEvent.getAction();
        v80 v80Var = this.v;
        if (action == 0) {
            c6Var = ((org.telegram.ui.ActionBar.f3) k31Var).resourcesProvider;
            z80 z80Var = new z80(null, c6Var, motionEvent.getX(), motionEvent.getY(), 0);
            z80Var.d(org.telegram.ui.ActionBar.g6.l1(0.1175f, k31Var.getThemedColor(org.telegram.ui.ActionBar.g6.Pi)));
            s80 b10 = z80Var.b();
            if (LocaleController.isRTL) {
                AndroidUtilities.rectTmp.set(getWidth() - d(), (getHeight() - AndroidUtilities.dp(18.0f)) / 2.0f, getWidth(), (AndroidUtilities.dp(18.0f) + getHeight()) / 2.0f);
            } else {
                AndroidUtilities.rectTmp.set(0.0f, (getHeight() - AndroidUtilities.dp(18.0f)) / 2.0f, d(), (AndroidUtilities.dp(18.0f) + getHeight()) / 2.0f);
            }
            b10.addRect(AndroidUtilities.rectTmp, Path.Direction.CW);
            v80Var.a(z80Var, null);
            invalidate();
            return true;
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (motionEvent.getAction() == 1) {
                performClick();
            }
            v80Var.d(true);
            invalidate();
        }
        return super.onTouchEvent(motionEvent);
    }
}
