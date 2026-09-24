package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class ko0 extends FrameLayout {
    public final Paint f35083a;
    public float f35084b;
    public o1.k f35085c;
    public final oo0 d;

    public ko0(oo0 oo0Var, Context context) {
        super(context);
        this.d = oo0Var;
        this.f35083a = new Paint(1);
        setWillNotDraw(false);
    }

    public final void a(boolean z10, boolean z11) {
        float f7;
        float f10;
        o1.k kVar = this.f35085c;
        if (kVar != null) {
            kVar.c();
        }
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        if (z11) {
            float f11 = this.f35084b;
            if (f11 == f7) {
                return;
            }
            o1.k kVar2 = new o1.k(new o1.j(f11 * 100.0f));
            o1.l lVar = new o1.l(f7 * 100.0f);
            if (z10) {
                f10 = 500.0f;
            } else {
                f10 = 650.0f;
            }
            lVar.b(f10);
            lVar.a(1.0f);
            kVar2.f15518u = lVar;
            this.f35085c = kVar2;
            kVar2.b(new nd0(this, 1));
            this.f35085c.a(new n9(this, 1));
            this.f35085c.f();
            return;
        }
        this.f35084b = f7;
        TextView textView = this.d.U;
        if (textView != null) {
            textView.setAlpha((f7 * 0.2f) + 0.8f);
        }
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int dp;
        super.onDraw(canvas);
        int i10 = org.telegram.ui.ActionBar.h6.O6;
        oo0 oo0Var = this.d;
        canvas.drawColor(oo0Var.getThemedColor(i10));
        int themedColor = oo0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f19073ei);
        Paint paint = this.f35083a;
        paint.setColor(themedColor);
        if (LocaleController.isRTL) {
            dp = getWidth() - AndroidUtilities.dp(28.0f);
        } else {
            dp = AndroidUtilities.dp(28.0f);
        }
        canvas.drawCircle(dp, -AndroidUtilities.dp(28.0f), Math.max(getWidth(), getHeight()) * this.f35084b, paint);
    }
}
