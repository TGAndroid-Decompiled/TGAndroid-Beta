package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
public final class ka extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public boolean f30944a;
    public org.telegram.ui.Components.q9 f30945b;
    public TextView f30946c;
    public TextView d;

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29379c9));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f30944a) {
            canvas.drawLine(org.telegram.messenger.g0.L(72.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.n6.f29517k0);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(56.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.Components.q9 q9Var = this.f30945b;
        if (q9Var != null) {
            try {
                if (q9Var.getImageReceiver() != null && (q9Var.getImageReceiver().t() instanceof qg.b)) {
                    ((qg.b) q9Var.getImageReceiver().t()).a(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29379c9, false));
                    q9Var.invalidate();
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }
}
