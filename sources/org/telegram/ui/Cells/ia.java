package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
public final class ia extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public boolean f29324a;
    public org.telegram.ui.Components.l9 f29325b;
    public TextView f29326c;
    public TextView d;

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27833c9));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f29324a) {
            canvas.drawLine(org.telegram.messenger.g0.L(72.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.f27971k0);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(56.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.Components.l9 l9Var = this.f29325b;
        if (l9Var != null) {
            try {
                if (l9Var.getImageReceiver() != null && (l9Var.getImageReceiver().t() instanceof qg.c)) {
                    ((qg.c) l9Var.getImageReceiver().t()).a(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27833c9, false));
                    l9Var.invalidate();
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }
}
