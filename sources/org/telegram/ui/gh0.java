package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.SparseArray;
import android.view.View;
import org.telegram.messenger.SharedConfig;
public final class gh0 implements bh.h {
    public final jh0 f36218a;

    public gh0(jh0 jh0Var) {
        this.f36218a = jh0Var;
    }

    @Override
    public void k(Canvas canvas) {
        gh.d z10;
        Canvas canvas2;
        jh0 jh0Var = this.f36218a;
        RectF rectF = jh0Var.T;
        int measuredWidth = jh0Var.fragmentView.getMeasuredWidth();
        int measuredHeight = jh0Var.fragmentView.getMeasuredHeight();
        canvas.drawColor(jh0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f19601d6));
        SparseArray sparseArray = jh0Var.f37070a;
        int size = sparseArray.size();
        int i10 = 0;
        while (i10 < size) {
            org.telegram.ui.ActionBar.m2 m2Var = ((hi1) sparseArray.valueAt(i10)).f36579a;
            View view = m2Var.fragmentView;
            if (view == null || !ih.j.c(view, jh0Var.f37071b, rectF) || rectF.right <= 0.0f || rectF.left >= jh0Var.fragmentView.getMeasuredWidth() || !(m2Var instanceof ih0) || (z10 = ((ih0) m2Var).z()) == null) {
                canvas2 = canvas;
            } else {
                canvas.save();
                canvas.translate(rectF.left, rectF.top);
                canvas2 = canvas;
                z10.v(canvas2, 0.0f, 0.0f, measuredWidth, measuredHeight);
                canvas2.restore();
            }
            i10++;
            canvas = canvas2;
        }
    }

    @Override
    public void m0(bh.a aVar) {
        jh0 jh0Var = this.f36218a;
        RectF rectF = jh0Var.T;
        aVar.a(jh0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f19601d6));
        aVar.b(SharedConfig.chatBlurEnabled());
        SparseArray sparseArray = jh0Var.f37070a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            org.telegram.ui.ActionBar.m2 m2Var = ((hi1) sparseArray.valueAt(i10)).f36579a;
            View view = m2Var.fragmentView;
            if (view != null && ih.j.c(view, jh0Var.f37071b, rectF) && rectF.right > 0.0f && rectF.left < jh0Var.fragmentView.getMeasuredWidth() && (m2Var instanceof ih0) && ((ih0) m2Var).z() != null) {
                aVar.c(rectF.left);
                aVar.c(rectF.top);
                aVar.a(m2Var.getClassGuid());
            }
        }
    }
}
