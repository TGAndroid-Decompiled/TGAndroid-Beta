package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class v21 extends j6 {
    public final Paint f33243s;
    public final i80 v;
    public final x21 f33244w;

    public v21(x21 x21Var, Context context) {
        super(context, false, false, false);
        this.f33244w = x21Var;
        this.f33243s = new Paint(1);
        this.v = new i80();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (LocaleController.isRTL) {
            AndroidUtilities.rectTmp.set(getWidth() - d(), (getHeight() - AndroidUtilities.dp(18.0f)) / 2.0f, getWidth(), (AndroidUtilities.dp(18.0f) + getHeight()) / 2.0f);
        } else {
            AndroidUtilities.rectTmp.set(0.0f, (getHeight() - AndroidUtilities.dp(18.0f)) / 2.0f, d(), (AndroidUtilities.dp(18.0f) + getHeight()) / 2.0f);
        }
        z21 z21Var = this.f33244w.h;
        int i9 = org.telegram.ui.ActionBar.f6.Pi;
        String[] strArr = z21.N;
        int l1 = org.telegram.ui.ActionBar.f6.l1(0.1175f, z21Var.getThemedColor(i9));
        Paint paint = this.f33243s;
        paint.setColor(l1);
        canvas.drawRoundRect(AndroidUtilities.rectTmp, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint);
        if (this.v.f(canvas)) {
            invalidate();
        }
        super.onDraw(canvas);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.b6 b6Var;
        z21 z21Var = this.f33244w.h;
        int action = motionEvent.getAction();
        i80 i80Var = this.v;
        if (action == 0) {
            b6Var = ((org.telegram.ui.ActionBar.f3) z21Var).resourcesProvider;
            m80 m80Var = new m80(null, b6Var, motionEvent.getX(), motionEvent.getY(), 0);
            m80Var.d(org.telegram.ui.ActionBar.f6.l1(0.1175f, z21Var.getThemedColor(org.telegram.ui.ActionBar.f6.Pi)));
            f80 b10 = m80Var.b();
            if (LocaleController.isRTL) {
                AndroidUtilities.rectTmp.set(getWidth() - d(), (getHeight() - AndroidUtilities.dp(18.0f)) / 2.0f, getWidth(), (AndroidUtilities.dp(18.0f) + getHeight()) / 2.0f);
            } else {
                AndroidUtilities.rectTmp.set(0.0f, (getHeight() - AndroidUtilities.dp(18.0f)) / 2.0f, d(), (AndroidUtilities.dp(18.0f) + getHeight()) / 2.0f);
            }
            b10.addRect(AndroidUtilities.rectTmp, Path.Direction.CW);
            i80Var.a(m80Var, null);
            invalidate();
            return true;
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (motionEvent.getAction() == 1) {
                performClick();
            }
            i80Var.d(true);
            invalidate();
        }
        return super.onTouchEvent(motionEvent);
    }
}
