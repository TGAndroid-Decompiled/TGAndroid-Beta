package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.f8;
public final class b3 extends View implements k6 {
    public final d3 f20186a;

    public b3(d3 d3Var, Context context) {
        super(context);
        this.f20186a = d3Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.f20186a.d);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), org.telegram.messenger.i0.f16167n);
        setTranslationY(org.telegram.messenger.i0.f16167n);
    }

    @Override
    public final void updateColors() {
        d3 d3Var = this.f20186a;
        Paint paint = d3Var.d;
        try {
            n3 n3Var = d3Var.f20250a;
            if (n3Var != null) {
                boolean z10 = false;
                int e = n3Var.e(t6.x0(null, t6.f20873a7, false));
                if (paint.getColor() != e) {
                    paint.setColor(e);
                    invalidate();
                    org.telegram.messenger.i0.t3(d3Var, e, true, null);
                    if (org.telegram.messenger.i0.B(e) >= 0.721f) {
                        z10 = true;
                    }
                    org.telegram.messenger.i0.m3(d3Var, z10);
                }
            }
        } catch (Exception e7) {
            f8.g(e7, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
