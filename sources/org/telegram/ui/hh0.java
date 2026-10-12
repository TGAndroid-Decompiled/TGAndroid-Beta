package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.SparseArray;
import android.view.View;
import org.telegram.messenger.SharedConfig;
public final class hh0 implements bh.h {
    public final kh0 f36821a;

    public hh0(kh0 kh0Var) {
        this.f36821a = kh0Var;
    }

    @Override
    public void m0(bh.a aVar) {
        kh0 kh0Var = this.f36821a;
        RectF rectF = kh0Var.T;
        aVar.a(kh0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f19901d6));
        aVar.b(SharedConfig.chatBlurEnabled());
        SparseArray sparseArray = kh0Var.f37390a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            org.telegram.ui.ActionBar.m2 m2Var = ((hi1) sparseArray.valueAt(i10)).f36828a;
            View view = m2Var.fragmentView;
            if (view != null && ih.j.c(view, kh0Var.f37391b, rectF) && rectF.right > 0.0f && rectF.left < kh0Var.fragmentView.getMeasuredWidth() && (m2Var instanceof jh0) && ((jh0) m2Var).z() != null) {
                aVar.c(rectF.left);
                aVar.c(rectF.top);
                aVar.a(m2Var.getClassGuid());
            }
        }
    }

    @Override
    public void v(Canvas canvas) {
        gh.d z10;
        Canvas canvas2;
        kh0 kh0Var = this.f36821a;
        RectF rectF = kh0Var.T;
        int measuredWidth = kh0Var.fragmentView.getMeasuredWidth();
        int measuredHeight = kh0Var.fragmentView.getMeasuredHeight();
        canvas.drawColor(kh0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f19901d6));
        SparseArray sparseArray = kh0Var.f37390a;
        int size = sparseArray.size();
        int i10 = 0;
        while (i10 < size) {
            org.telegram.ui.ActionBar.m2 m2Var = ((hi1) sparseArray.valueAt(i10)).f36828a;
            View view = m2Var.fragmentView;
            if (view == null || !ih.j.c(view, kh0Var.f37391b, rectF) || rectF.right <= 0.0f || rectF.left >= kh0Var.fragmentView.getMeasuredWidth() || !(m2Var instanceof jh0) || (z10 = ((jh0) m2Var).z()) == null) {
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
}
