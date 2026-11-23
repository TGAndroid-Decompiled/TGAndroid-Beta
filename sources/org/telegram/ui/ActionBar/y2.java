package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.a8;
public final class y2 extends View implements c6 {
    public final a3 f30358a;

    public y2(a3 a3Var, Context context) {
        super(context);
        this.f30358a = a3Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.f30358a.d);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.f24221n);
        setTranslationY(org.telegram.messenger.g0.f24221n);
    }

    @Override
    public final void updateColors() {
        a3 a3Var = this.f30358a;
        Paint paint = a3Var.d;
        try {
            j3 j3Var = a3Var.f28845a;
            if (j3Var != null) {
                boolean z10 = false;
                int e10 = j3Var.e(n6.x0(null, n6.f29394a7, false));
                if (paint.getColor() != e10) {
                    paint.setColor(e10);
                    invalidate();
                    org.telegram.messenger.g0.s3(a3Var, e10, true, null);
                    if (org.telegram.messenger.g0.B(e10) >= 0.721f) {
                        z10 = true;
                    }
                    org.telegram.messenger.g0.m3(a3Var, z10);
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
