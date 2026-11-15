package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.a8;
public final class w2 extends View implements z5 {
    public final y2 f29802a;

    public w2(y2 y2Var, Context context) {
        super(context);
        this.f29802a = y2Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.f29802a.d);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.f23606n);
        setTranslationY(org.telegram.messenger.g0.f23606n);
    }

    @Override
    public final void updateColors() {
        y2 y2Var = this.f29802a;
        Paint paint = y2Var.d;
        try {
            g3 g3Var = y2Var.f29886a;
            if (g3Var != null) {
                boolean z10 = false;
                int e10 = g3Var.e(j6.x0(null, j6.f28792a7, false));
                if (paint.getColor() != e10) {
                    paint.setColor(e10);
                    invalidate();
                    org.telegram.messenger.g0.t3(y2Var, e10, true, null);
                    if (org.telegram.messenger.g0.B(e10) >= 0.721f) {
                        z10 = true;
                    }
                    org.telegram.messenger.g0.n3(y2Var, z10);
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
