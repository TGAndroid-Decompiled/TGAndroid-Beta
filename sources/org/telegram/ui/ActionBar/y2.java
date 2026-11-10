package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.a8;
public final class y2 extends View implements c6 {
    public final a3 f28789a;

    public y2(a3 a3Var, Context context) {
        super(context);
        this.f28789a = a3Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.f28789a.d);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.f22562n);
        setTranslationY(org.telegram.messenger.g0.f22562n);
    }

    @Override
    public final void updateColors() {
        a3 a3Var = this.f28789a;
        Paint paint = a3Var.d;
        try {
            i3 i3Var = a3Var.f27309a;
            if (i3Var != null) {
                boolean z9 = false;
                int e10 = i3Var.e(m6.x0(null, m6.f27834a7, false));
                if (paint.getColor() != e10) {
                    paint.setColor(e10);
                    invalidate();
                    org.telegram.messenger.g0.u3(a3Var, e10, true, null);
                    if (org.telegram.messenger.g0.B(e10) >= 0.721f) {
                        z9 = true;
                    }
                    org.telegram.messenger.g0.n3(a3Var, z9);
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
