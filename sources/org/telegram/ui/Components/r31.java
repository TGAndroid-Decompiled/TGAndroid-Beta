package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class r31 extends n6 {
    public final Paint f27543s;
    public final z80 v;
    public final t31 f27544w;

    public r31(t31 t31Var, Context context) {
        super(context, false, false, false);
        this.f27544w = t31Var;
        this.f27543s = new Paint(1);
        this.v = new z80();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (LocaleController.isRTL) {
            AndroidUtilities.rectTmp.set(getWidth() - d(), (getHeight() - AndroidUtilities.dp(18.0f)) / 2.0f, getWidth(), (AndroidUtilities.dp(18.0f) + getHeight()) / 2.0f);
        } else {
            AndroidUtilities.rectTmp.set(0.0f, (getHeight() - AndroidUtilities.dp(18.0f)) / 2.0f, d(), (AndroidUtilities.dp(18.0f) + getHeight()) / 2.0f);
        }
        v31 v31Var = this.f27544w.h;
        int i10 = org.telegram.ui.ActionBar.i6.Pi;
        String[] strArr = v31.R;
        int l1 = org.telegram.ui.ActionBar.i6.l1(0.1175f, v31Var.getThemedColor(i10));
        Paint paint = this.f27543s;
        paint.setColor(l1);
        canvas.drawRoundRect(AndroidUtilities.rectTmp, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint);
        if (this.v.f(canvas)) {
            invalidate();
        }
        super.onDraw(canvas);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.e6 e6Var;
        v31 v31Var = this.f27544w.h;
        int action = motionEvent.getAction();
        z80 z80Var = this.v;
        if (action == 0) {
            e6Var = ((org.telegram.ui.ActionBar.f3) v31Var).resourcesProvider;
            d90 d90Var = new d90(null, e6Var, motionEvent.getX(), motionEvent.getY(), 0);
            d90Var.d(org.telegram.ui.ActionBar.i6.l1(0.1175f, v31Var.getThemedColor(org.telegram.ui.ActionBar.i6.Pi)));
            w80 b10 = d90Var.b();
            if (LocaleController.isRTL) {
                AndroidUtilities.rectTmp.set(getWidth() - d(), (getHeight() - AndroidUtilities.dp(18.0f)) / 2.0f, getWidth(), (AndroidUtilities.dp(18.0f) + getHeight()) / 2.0f);
            } else {
                AndroidUtilities.rectTmp.set(0.0f, (getHeight() - AndroidUtilities.dp(18.0f)) / 2.0f, d(), (AndroidUtilities.dp(18.0f) + getHeight()) / 2.0f);
            }
            b10.addRect(AndroidUtilities.rectTmp, Path.Direction.CW);
            z80Var.a(d90Var, null);
            invalidate();
            return true;
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (motionEvent.getAction() == 1) {
                performClick();
            }
            z80Var.d(true);
            invalidate();
        }
        return super.onTouchEvent(motionEvent);
    }
}
