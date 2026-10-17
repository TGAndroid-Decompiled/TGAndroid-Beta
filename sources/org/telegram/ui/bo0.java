package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class bo0 extends FrameLayout {
    public final Paint f35716a;
    public float f35717b;
    public o1.k f35718c;
    public final fo0 d;

    public bo0(fo0 fo0Var, Context context) {
        super(context);
        this.d = fo0Var;
        this.f35716a = new Paint(1);
        setWillNotDraw(false);
    }

    public final void a(boolean z10, boolean z11) {
        float f7;
        float f10;
        o1.k kVar = this.f35718c;
        if (kVar != null) {
            kVar.c();
        }
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        if (z11) {
            float f11 = this.f35717b;
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
            kVar2.f17555u = lVar;
            this.f35718c = kVar2;
            kVar2.b(new ad0(this, 1));
            this.f35718c.a(new p9(this, 1));
            this.f35718c.h();
            return;
        }
        this.f35717b = f7;
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
        fo0 fo0Var = this.d;
        canvas.drawColor(fo0Var.getThemedColor(i10));
        int themedColor = fo0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f21014ei);
        Paint paint = this.f35716a;
        paint.setColor(themedColor);
        if (LocaleController.isRTL) {
            dp = getWidth() - AndroidUtilities.dp(28.0f);
        } else {
            dp = AndroidUtilities.dp(28.0f);
        }
        canvas.drawCircle(dp, -AndroidUtilities.dp(28.0f), Math.max(getWidth(), getHeight()) * this.f35717b, paint);
    }
}
