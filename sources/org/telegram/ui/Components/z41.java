package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class z41 extends r6 {
    public final Paint f33411s;
    public final ca0 v;
    public final b51 f33412w;

    public z41(b51 b51Var, Context context) {
        super(context, false, false, false);
        this.f33412w = b51Var;
        this.f33411s = new Paint(1);
        this.v = new ca0();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (LocaleController.isRTL) {
            AndroidUtilities.rectTmp.set(getWidth() - d(), (getHeight() - AndroidUtilities.dp(18.0f)) / 2.0f, getWidth(), (AndroidUtilities.dp(18.0f) + getHeight()) / 2.0f);
        } else {
            AndroidUtilities.rectTmp.set(0.0f, (getHeight() - AndroidUtilities.dp(18.0f)) / 2.0f, d(), (AndroidUtilities.dp(18.0f) + getHeight()) / 2.0f);
        }
        d51 d51Var = this.f33412w.f24866n;
        int i10 = org.telegram.ui.ActionBar.h6.Pi;
        String[] strArr = d51.R;
        int m12 = org.telegram.ui.ActionBar.h6.m1(0.1175f, d51Var.getThemedColor(i10));
        Paint paint = this.f33411s;
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
        d51 d51Var = this.f33412w.f24866n;
        int action = motionEvent.getAction();
        ca0 ca0Var = this.v;
        if (action == 0) {
            d6Var = ((org.telegram.ui.ActionBar.e3) d51Var).resourcesProvider;
            ga0 ga0Var = new ga0(null, d6Var, motionEvent.getX(), motionEvent.getY(), 0);
            ga0Var.d(org.telegram.ui.ActionBar.h6.m1(0.1175f, d51Var.getThemedColor(org.telegram.ui.ActionBar.h6.Pi)));
            z90 b10 = ga0Var.b();
            if (LocaleController.isRTL) {
                AndroidUtilities.rectTmp.set(getWidth() - d(), (getHeight() - AndroidUtilities.dp(18.0f)) / 2.0f, getWidth(), (AndroidUtilities.dp(18.0f) + getHeight()) / 2.0f);
            } else {
                AndroidUtilities.rectTmp.set(0.0f, (getHeight() - AndroidUtilities.dp(18.0f)) / 2.0f, d(), (AndroidUtilities.dp(18.0f) + getHeight()) / 2.0f);
            }
            b10.addRect(AndroidUtilities.rectTmp, Path.Direction.CW);
            ca0Var.a(ga0Var, null);
            invalidate();
            return true;
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (motionEvent.getAction() == 1) {
                performClick();
            }
            ca0Var.d(true);
            invalidate();
        }
        return super.onTouchEvent(motionEvent);
    }
}
