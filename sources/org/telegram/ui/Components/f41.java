package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class f41 extends o6 {
    public final Paint f23998s;
    public final h90 v;
    public final h41 f23999w;

    public f41(h41 h41Var, Context context) {
        super(context, false, false, false);
        this.f23999w = h41Var;
        this.f23998s = new Paint(1);
        this.v = new h90();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (LocaleController.isRTL) {
            AndroidUtilities.rectTmp.set(getWidth() - d(), (getHeight() - AndroidUtilities.dp(18.0f)) / 2.0f, getWidth(), (AndroidUtilities.dp(18.0f) + getHeight()) / 2.0f);
        } else {
            AndroidUtilities.rectTmp.set(0.0f, (getHeight() - AndroidUtilities.dp(18.0f)) / 2.0f, d(), (AndroidUtilities.dp(18.0f) + getHeight()) / 2.0f);
        }
        j41 j41Var = this.f23999w.h;
        int i10 = org.telegram.ui.ActionBar.j6.Pi;
        String[] strArr = j41.R;
        int l1 = org.telegram.ui.ActionBar.j6.l1(0.1175f, j41Var.getThemedColor(i10));
        Paint paint = this.f23998s;
        paint.setColor(l1);
        canvas.drawRoundRect(AndroidUtilities.rectTmp, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint);
        if (this.v.f(canvas)) {
            invalidate();
        }
        super.onDraw(canvas);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.f6 f6Var;
        j41 j41Var = this.f23999w.h;
        int action = motionEvent.getAction();
        h90 h90Var = this.v;
        if (action == 0) {
            f6Var = ((org.telegram.ui.ActionBar.f3) j41Var).resourcesProvider;
            l90 l90Var = new l90(null, f6Var, motionEvent.getX(), motionEvent.getY(), 0);
            l90Var.d(org.telegram.ui.ActionBar.j6.l1(0.1175f, j41Var.getThemedColor(org.telegram.ui.ActionBar.j6.Pi)));
            e90 b10 = l90Var.b();
            if (LocaleController.isRTL) {
                AndroidUtilities.rectTmp.set(getWidth() - d(), (getHeight() - AndroidUtilities.dp(18.0f)) / 2.0f, getWidth(), (AndroidUtilities.dp(18.0f) + getHeight()) / 2.0f);
            } else {
                AndroidUtilities.rectTmp.set(0.0f, (getHeight() - AndroidUtilities.dp(18.0f)) / 2.0f, d(), (AndroidUtilities.dp(18.0f) + getHeight()) / 2.0f);
            }
            b10.addRect(AndroidUtilities.rectTmp, Path.Direction.CW);
            h90Var.a(l90Var, null);
            invalidate();
            return true;
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (motionEvent.getAction() == 1) {
                performClick();
            }
            h90Var.d(true);
            invalidate();
        }
        return super.onTouchEvent(motionEvent);
    }
}
