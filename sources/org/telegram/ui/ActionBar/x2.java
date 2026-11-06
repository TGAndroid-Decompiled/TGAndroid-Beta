package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.a8;
public final class x2 extends View implements a6 {
    public final z2 f28744a;

    public x2(z2 z2Var, Context context) {
        super(context);
        this.f28744a = z2Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.f28744a.d);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.f22539n);
        setTranslationY(org.telegram.messenger.g0.f22539n);
    }

    @Override
    public final void updateColors() {
        z2 z2Var = this.f28744a;
        Paint paint = z2Var.d;
        try {
            h3 h3Var = z2Var.f28824a;
            if (h3Var != null) {
                boolean z9 = false;
                int e10 = h3Var.e(k6.x0(null, k6.f27793a7, false));
                if (paint.getColor() != e10) {
                    paint.setColor(e10);
                    invalidate();
                    org.telegram.messenger.g0.u3(z2Var, e10, true, null);
                    if (org.telegram.messenger.g0.B(e10) >= 0.721f) {
                        z9 = true;
                    }
                    org.telegram.messenger.g0.n3(z2Var, z9);
                }
            }
        } catch (Exception e11) {
            a8.g(e11, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
