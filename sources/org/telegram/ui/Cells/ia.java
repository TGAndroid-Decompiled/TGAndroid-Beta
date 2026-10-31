package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
public final class ia extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public boolean f22051a;
    public org.telegram.ui.Components.g9 f22052b;
    public TextView f22053c;
    public TextView d;

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20913c9));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f22051a) {
            canvas.drawLine(org.telegram.messenger.i0.L(72.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.t6.f21052k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(56.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.Components.g9 g9Var = this.f22052b;
        if (g9Var != null) {
            try {
                if (g9Var.getImageReceiver() != null && (g9Var.getImageReceiver().t() instanceof gg.d)) {
                    ((gg.d) g9Var.getImageReceiver().t()).a(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20913c9, false));
                    g9Var.invalidate();
                }
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        }
    }
}
