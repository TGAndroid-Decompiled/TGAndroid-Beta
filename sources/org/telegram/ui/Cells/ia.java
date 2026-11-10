package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
public final class ia extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public boolean f29343a;
    public org.telegram.ui.Components.k9 f29344b;
    public TextView f29345c;
    public TextView d;

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27875c9));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f29343a) {
            canvas.drawLine(org.telegram.messenger.g0.L(72.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.m6.f28013k0);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(56.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.Components.k9 k9Var = this.f29344b;
        if (k9Var != null) {
            try {
                if (k9Var.getImageReceiver() != null && (k9Var.getImageReceiver().t() instanceof qg.c)) {
                    ((qg.c) k9Var.getImageReceiver().t()).a(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f27875c9, false));
                    k9Var.invalidate();
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }
}
