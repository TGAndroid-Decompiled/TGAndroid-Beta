package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.a8;
public final class v2 extends View implements z5 {
    public final x2 f28741a;

    public v2(x2 x2Var, Context context) {
        super(context);
        this.f28741a = x2Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.f28741a.d);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i3), org.telegram.messenger.g0.f22603n);
        setTranslationY(org.telegram.messenger.g0.f22603n);
    }

    @Override
    public final void updateColors() {
        x2 x2Var = this.f28741a;
        Paint paint = x2Var.d;
        try {
            g3 g3Var = x2Var.f28796a;
            if (g3Var != null) {
                boolean z10 = false;
                int e10 = g3Var.e(k6.x0(null, k6.f27824a7, false));
                if (paint.getColor() != e10) {
                    paint.setColor(e10);
                    invalidate();
                    org.telegram.messenger.g0.u3(x2Var, e10, true, null);
                    if (org.telegram.messenger.g0.B(e10) >= 0.721f) {
                        z10 = true;
                    }
                    org.telegram.messenger.g0.n3(x2Var, z10);
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
