package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class h41 extends p6 {
    public final Paint f24738s;
    public final n90 v;
    public final j41 f24739w;

    public h41(j41 j41Var, Context context) {
        super(context, false, false, false);
        this.f24739w = j41Var;
        this.f24738s = new Paint(1);
        this.v = new n90();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (LocaleController.isRTL) {
            AndroidUtilities.rectTmp.set(getWidth() - d(), (getHeight() - AndroidUtilities.dp(18.0f)) / 2.0f, getWidth(), (AndroidUtilities.dp(18.0f) + getHeight()) / 2.0f);
        } else {
            AndroidUtilities.rectTmp.set(0.0f, (getHeight() - AndroidUtilities.dp(18.0f)) / 2.0f, d(), (AndroidUtilities.dp(18.0f) + getHeight()) / 2.0f);
        }
        l41 l41Var = this.f24739w.h;
        int i10 = org.telegram.ui.ActionBar.h6.Pi;
        String[] strArr = l41.R;
        int l1 = org.telegram.ui.ActionBar.h6.l1(0.1175f, l41Var.getThemedColor(i10));
        Paint paint = this.f24738s;
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
        l41 l41Var = this.f24739w.h;
        int action = motionEvent.getAction();
        n90 n90Var = this.v;
        if (action == 0) {
            d6Var = ((org.telegram.ui.ActionBar.e3) l41Var).resourcesProvider;
            r90 r90Var = new r90(null, d6Var, motionEvent.getX(), motionEvent.getY(), 0);
            r90Var.d(org.telegram.ui.ActionBar.h6.l1(0.1175f, l41Var.getThemedColor(org.telegram.ui.ActionBar.h6.Pi)));
            k90 b10 = r90Var.b();
            if (LocaleController.isRTL) {
                AndroidUtilities.rectTmp.set(getWidth() - d(), (getHeight() - AndroidUtilities.dp(18.0f)) / 2.0f, getWidth(), (AndroidUtilities.dp(18.0f) + getHeight()) / 2.0f);
            } else {
                AndroidUtilities.rectTmp.set(0.0f, (getHeight() - AndroidUtilities.dp(18.0f)) / 2.0f, d(), (AndroidUtilities.dp(18.0f) + getHeight()) / 2.0f);
            }
            b10.addRect(AndroidUtilities.rectTmp, Path.Direction.CW);
            n90Var.a(r90Var, null);
            invalidate();
            return true;
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (motionEvent.getAction() == 1) {
                performClick();
            }
            n90Var.d(true);
            invalidate();
        }
        return super.onTouchEvent(motionEvent);
    }
}
