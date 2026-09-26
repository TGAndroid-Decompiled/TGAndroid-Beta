package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class f41 extends p6 {
    public final Paint f24138s;
    public final l90 v;
    public final h41 f24139w;

    public f41(h41 h41Var, Context context) {
        super(context, false, false, false);
        this.f24139w = h41Var;
        this.f24138s = new Paint(1);
        this.v = new l90();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (LocaleController.isRTL) {
            AndroidUtilities.rectTmp.set(getWidth() - d(), (getHeight() - AndroidUtilities.dp(18.0f)) / 2.0f, getWidth(), (AndroidUtilities.dp(18.0f) + getHeight()) / 2.0f);
        } else {
            AndroidUtilities.rectTmp.set(0.0f, (getHeight() - AndroidUtilities.dp(18.0f)) / 2.0f, d(), (AndroidUtilities.dp(18.0f) + getHeight()) / 2.0f);
        }
        j41 j41Var = this.f24139w.h;
        int i10 = org.telegram.ui.ActionBar.h6.Pi;
        String[] strArr = j41.R;
        int l1 = org.telegram.ui.ActionBar.h6.l1(0.1175f, j41Var.getThemedColor(i10));
        Paint paint = this.f24138s;
        paint.setColor(l1);
        canvas.drawRoundRect(AndroidUtilities.rectTmp, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint);
        if (this.v.f(canvas)) {
            invalidate();
        }
        super.onDraw(canvas);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.d6 d6Var;
        j41 j41Var = this.f24139w.h;
        int action = motionEvent.getAction();
        l90 l90Var = this.v;
        if (action == 0) {
            d6Var = ((org.telegram.ui.ActionBar.e3) j41Var).resourcesProvider;
            p90 p90Var = new p90(null, d6Var, motionEvent.getX(), motionEvent.getY(), 0);
            p90Var.d(org.telegram.ui.ActionBar.h6.l1(0.1175f, j41Var.getThemedColor(org.telegram.ui.ActionBar.h6.Pi)));
            i90 b10 = p90Var.b();
            if (LocaleController.isRTL) {
                AndroidUtilities.rectTmp.set(getWidth() - d(), (getHeight() - AndroidUtilities.dp(18.0f)) / 2.0f, getWidth(), (AndroidUtilities.dp(18.0f) + getHeight()) / 2.0f);
            } else {
                AndroidUtilities.rectTmp.set(0.0f, (getHeight() - AndroidUtilities.dp(18.0f)) / 2.0f, d(), (AndroidUtilities.dp(18.0f) + getHeight()) / 2.0f);
            }
            b10.addRect(AndroidUtilities.rectTmp, Path.Direction.CW);
            l90Var.a(p90Var, null);
            invalidate();
            return true;
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (motionEvent.getAction() == 1) {
                performClick();
            }
            l90Var.d(true);
            invalidate();
        }
        return super.onTouchEvent(motionEvent);
    }
}
