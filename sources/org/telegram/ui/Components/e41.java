package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class e41 extends p6 {
    public final Paint f23807s;
    public final k90 v;
    public final g41 f23808w;

    public e41(g41 g41Var, Context context) {
        super(context, false, false, false);
        this.f23808w = g41Var;
        this.f23807s = new Paint(1);
        this.v = new k90();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (LocaleController.isRTL) {
            AndroidUtilities.rectTmp.set(getWidth() - d(), (getHeight() - AndroidUtilities.dp(18.0f)) / 2.0f, getWidth(), (AndroidUtilities.dp(18.0f) + getHeight()) / 2.0f);
        } else {
            AndroidUtilities.rectTmp.set(0.0f, (getHeight() - AndroidUtilities.dp(18.0f)) / 2.0f, d(), (AndroidUtilities.dp(18.0f) + getHeight()) / 2.0f);
        }
        i41 i41Var = this.f23808w.h;
        int i10 = org.telegram.ui.ActionBar.h6.Pi;
        String[] strArr = i41.R;
        int l1 = org.telegram.ui.ActionBar.h6.l1(0.1175f, i41Var.getThemedColor(i10));
        Paint paint = this.f23807s;
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
        i41 i41Var = this.f23808w.h;
        int action = motionEvent.getAction();
        k90 k90Var = this.v;
        if (action == 0) {
            d6Var = ((org.telegram.ui.ActionBar.e3) i41Var).resourcesProvider;
            o90 o90Var = new o90(null, d6Var, motionEvent.getX(), motionEvent.getY(), 0);
            o90Var.d(org.telegram.ui.ActionBar.h6.l1(0.1175f, i41Var.getThemedColor(org.telegram.ui.ActionBar.h6.Pi)));
            h90 b10 = o90Var.b();
            if (LocaleController.isRTL) {
                AndroidUtilities.rectTmp.set(getWidth() - d(), (getHeight() - AndroidUtilities.dp(18.0f)) / 2.0f, getWidth(), (AndroidUtilities.dp(18.0f) + getHeight()) / 2.0f);
            } else {
                AndroidUtilities.rectTmp.set(0.0f, (getHeight() - AndroidUtilities.dp(18.0f)) / 2.0f, d(), (AndroidUtilities.dp(18.0f) + getHeight()) / 2.0f);
            }
            b10.addRect(AndroidUtilities.rectTmp, Path.Direction.CW);
            k90Var.a(o90Var, null);
            invalidate();
            return true;
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (motionEvent.getAction() == 1) {
                performClick();
            }
            k90Var.d(true);
            invalidate();
        }
        return super.onTouchEvent(motionEvent);
    }
}
