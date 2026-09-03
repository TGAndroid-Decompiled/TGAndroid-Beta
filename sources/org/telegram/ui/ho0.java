package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class ho0 extends FrameLayout {
    public final Paint f37434a;
    public float f37435b;
    public o1.j f37436c;
    public final lo0 d;

    public ho0(lo0 lo0Var, Context context) {
        super(context);
        this.d = lo0Var;
        this.f37434a = new Paint(1);
        setWillNotDraw(false);
    }

    public final void a(boolean z4, boolean z10) {
        float f10;
        float f11;
        o1.j jVar = this.f37436c;
        if (jVar != null) {
            jVar.c();
        }
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        if (z10) {
            float f12 = this.f37435b;
            if (f12 == f10) {
                return;
            }
            o1.j jVar2 = new o1.j(new kb.a(f12 * 100.0f));
            o1.k kVar = new o1.k(f10 * 100.0f);
            if (z4) {
                f11 = 500.0f;
            } else {
                f11 = 650.0f;
            }
            kVar.b(f11);
            kVar.a(1.0f);
            jVar2.f16338u = kVar;
            this.f37436c = jVar2;
            jVar2.b(new md0(this, 1));
            this.f37436c.a(new o9(this, 1));
            this.f37436c.f();
            return;
        }
        this.f37435b = f10;
        TextView textView = this.d.R;
        if (textView != null) {
            textView.setAlpha((f10 * 0.2f) + 0.8f);
        }
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int dp;
        super.onDraw(canvas);
        int i10 = org.telegram.ui.ActionBar.k6.O6;
        lo0 lo0Var = this.d;
        canvas.drawColor(lo0Var.getThemedColor(i10));
        int themedColor = lo0Var.getThemedColor(org.telegram.ui.ActionBar.k6.ei);
        Paint paint = this.f37434a;
        paint.setColor(themedColor);
        if (LocaleController.isRTL) {
            dp = getWidth() - AndroidUtilities.dp(28.0f);
        } else {
            dp = AndroidUtilities.dp(28.0f);
        }
        canvas.drawCircle(dp, -AndroidUtilities.dp(28.0f), Math.max(getWidth(), getHeight()) * this.f37435b, paint);
    }
}
