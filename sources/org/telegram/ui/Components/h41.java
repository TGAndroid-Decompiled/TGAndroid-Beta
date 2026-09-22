package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class h41 extends o6 {
    public final Paint f24683s;
    public final k90 v;
    public final j41 f24684w;

    public h41(j41 j41Var, Context context) {
        super(context, false, false, false);
        this.f24684w = j41Var;
        this.f24683s = new Paint(1);
        this.v = new k90();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (LocaleController.isRTL) {
            AndroidUtilities.rectTmp.set(getWidth() - d(), (getHeight() - AndroidUtilities.dp(18.0f)) / 2.0f, getWidth(), (AndroidUtilities.dp(18.0f) + getHeight()) / 2.0f);
        } else {
            AndroidUtilities.rectTmp.set(0.0f, (getHeight() - AndroidUtilities.dp(18.0f)) / 2.0f, d(), (AndroidUtilities.dp(18.0f) + getHeight()) / 2.0f);
        }
        l41 l41Var = this.f24684w.h;
        int i10 = org.telegram.ui.ActionBar.j6.Pi;
        String[] strArr = l41.R;
        int l1 = org.telegram.ui.ActionBar.j6.l1(0.1175f, l41Var.getThemedColor(i10));
        Paint paint = this.f24683s;
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
        l41 l41Var = this.f24684w.h;
        int action = motionEvent.getAction();
        k90 k90Var = this.v;
        if (action == 0) {
            f6Var = ((org.telegram.ui.ActionBar.f3) l41Var).resourcesProvider;
            o90 o90Var = new o90(null, f6Var, motionEvent.getX(), motionEvent.getY(), 0);
            o90Var.d(org.telegram.ui.ActionBar.j6.l1(0.1175f, l41Var.getThemedColor(org.telegram.ui.ActionBar.j6.Pi)));
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
