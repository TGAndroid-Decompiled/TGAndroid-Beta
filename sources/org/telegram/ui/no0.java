package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class no0 extends FrameLayout {
    public final Paint f41830a;
    public float f41831b;
    public o1.j f41832c;
    public final ro0 d;

    public no0(ro0 ro0Var, Context context) {
        super(context);
        this.d = ro0Var;
        this.f41830a = new Paint(1);
        setWillNotDraw(false);
    }

    public final void a(boolean z10, boolean z11) {
        float f7;
        float f10;
        o1.j jVar = this.f41832c;
        if (jVar != null) {
            jVar.c();
        }
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        if (z11) {
            float f11 = this.f41831b;
            if (f11 == f7) {
                return;
            }
            o1.j jVar2 = new o1.j(new ac.a(f11 * 100.0f));
            o1.k kVar = new o1.k(f7 * 100.0f);
            if (z10) {
                f10 = 500.0f;
            } else {
                f10 = 650.0f;
            }
            kVar.b(f10);
            kVar.a(1.0f);
            jVar2.f18968u = kVar;
            this.f41832c = jVar2;
            jVar2.b(new cd0(this, 1));
            this.f41832c.a(new r9(this, 1));
            this.f41832c.h();
            return;
        }
        this.f41831b = f7;
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
        int i10 = org.telegram.ui.ActionBar.y6.O6;
        ro0 ro0Var = this.d;
        canvas.drawColor(ro0Var.getThemedColor(i10));
        int themedColor = ro0Var.getThemedColor(org.telegram.ui.ActionBar.y6.f23386ei);
        Paint paint = this.f41830a;
        paint.setColor(themedColor);
        if (LocaleController.isRTL) {
            dp = getWidth() - AndroidUtilities.dp(28.0f);
        } else {
            dp = AndroidUtilities.dp(28.0f);
        }
        canvas.drawCircle(dp, -AndroidUtilities.dp(28.0f), Math.max(getWidth(), getHeight()) * this.f41831b, paint);
    }
}
