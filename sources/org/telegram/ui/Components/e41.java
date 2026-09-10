package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class e41 extends o6 {
    public final Paint f22549s;
    public final j90 v;
    public final g41 f22550w;

    public e41(g41 g41Var, Context context) {
        super(context, false, false, false);
        this.f22550w = g41Var;
        this.f22549s = new Paint(1);
        this.v = new j90();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (LocaleController.isRTL) {
            AndroidUtilities.rectTmp.set(getWidth() - d(), (getHeight() - AndroidUtilities.dp(18.0f)) / 2.0f, getWidth(), (AndroidUtilities.dp(18.0f) + getHeight()) / 2.0f);
        } else {
            AndroidUtilities.rectTmp.set(0.0f, (getHeight() - AndroidUtilities.dp(18.0f)) / 2.0f, d(), (AndroidUtilities.dp(18.0f) + getHeight()) / 2.0f);
        }
        i41 i41Var = this.f22550w.h;
        int i10 = org.telegram.ui.ActionBar.j6.Pi;
        String[] strArr = i41.R;
        int l1 = org.telegram.ui.ActionBar.j6.l1(0.1175f, i41Var.getThemedColor(i10));
        Paint paint = this.f22549s;
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
        i41 i41Var = this.f22550w.h;
        int action = motionEvent.getAction();
        j90 j90Var = this.v;
        if (action == 0) {
            f6Var = ((org.telegram.ui.ActionBar.h3) i41Var).resourcesProvider;
            n90 n90Var = new n90(null, f6Var, motionEvent.getX(), motionEvent.getY(), 0);
            n90Var.d(org.telegram.ui.ActionBar.j6.l1(0.1175f, i41Var.getThemedColor(org.telegram.ui.ActionBar.j6.Pi)));
            g90 b10 = n90Var.b();
            if (LocaleController.isRTL) {
                AndroidUtilities.rectTmp.set(getWidth() - d(), (getHeight() - AndroidUtilities.dp(18.0f)) / 2.0f, getWidth(), (AndroidUtilities.dp(18.0f) + getHeight()) / 2.0f);
            } else {
                AndroidUtilities.rectTmp.set(0.0f, (getHeight() - AndroidUtilities.dp(18.0f)) / 2.0f, d(), (AndroidUtilities.dp(18.0f) + getHeight()) / 2.0f);
            }
            b10.addRect(AndroidUtilities.rectTmp, Path.Direction.CW);
            j90Var.a(n90Var, null);
            invalidate();
            return true;
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (motionEvent.getAction() == 1) {
                performClick();
            }
            j90Var.d(true);
            invalidate();
        }
        return super.onTouchEvent(motionEvent);
    }
}
