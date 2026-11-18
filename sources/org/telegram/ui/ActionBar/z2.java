package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.a8;
public final class z2 extends View implements c6 {
    public final b3 f30317a;

    public z2(b3 b3Var, Context context) {
        super(context);
        this.f30317a = b3Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.f30317a.d);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.f24116n);
        setTranslationY(org.telegram.messenger.g0.f24116n);
    }

    @Override
    public final void updateColors() {
        b3 b3Var = this.f30317a;
        Paint paint = b3Var.d;
        try {
            k3 k3Var = b3Var.f28803a;
            if (k3Var != null) {
                boolean z10 = false;
                int e10 = k3Var.e(n6.x0(null, n6.f29339a7, false));
                if (paint.getColor() != e10) {
                    paint.setColor(e10);
                    invalidate();
                    org.telegram.messenger.g0.s3(b3Var, e10, true, null);
                    if (org.telegram.messenger.g0.B(e10) >= 0.721f) {
                        z10 = true;
                    }
                    org.telegram.messenger.g0.m3(b3Var, z10);
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
