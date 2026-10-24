package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.SparseArray;
import android.view.View;
import org.telegram.messenger.SharedConfig;
public final class ng0 implements bh.h {
    public final qg0 f39820a;

    public ng0(qg0 qg0Var) {
        this.f39820a = qg0Var;
    }

    @Override
    public void J(bh.a aVar) {
        qg0 qg0Var = this.f39820a;
        RectF rectF = qg0Var.T;
        aVar.a(qg0Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21184d6));
        aVar.b(SharedConfig.chatBlurEnabled());
        SparseArray sparseArray = qg0Var.f42049a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            org.telegram.ui.ActionBar.o2 o2Var = ((rg1) sparseArray.valueAt(i10)).f41154a;
            View view = o2Var.fragmentView;
            if (view != null && ih.k.c(view, qg0Var.f42050b, rectF) && rectF.right > 0.0f && rectF.left < qg0Var.fragmentView.getMeasuredWidth() && (o2Var instanceof pg0) && ((pg0) o2Var).z() != null) {
                aVar.c(rectF.left);
                aVar.c(rectF.top);
                aVar.a(o2Var.getClassGuid());
            }
        }
    }

    @Override
    public void z(Canvas canvas) {
        gh.d z10;
        Canvas canvas2;
        qg0 qg0Var = this.f39820a;
        RectF rectF = qg0Var.T;
        int measuredWidth = qg0Var.fragmentView.getMeasuredWidth();
        int measuredHeight = qg0Var.fragmentView.getMeasuredHeight();
        canvas.drawColor(qg0Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21184d6));
        SparseArray sparseArray = qg0Var.f42049a;
        int size = sparseArray.size();
        int i10 = 0;
        while (i10 < size) {
            org.telegram.ui.ActionBar.o2 o2Var = ((rg1) sparseArray.valueAt(i10)).f41154a;
            View view = o2Var.fragmentView;
            if (view == null || !ih.k.c(view, qg0Var.f42050b, rectF) || rectF.right <= 0.0f || rectF.left >= qg0Var.fragmentView.getMeasuredWidth() || !(o2Var instanceof pg0) || (z10 = ((pg0) o2Var).z()) == null) {
                canvas2 = canvas;
            } else {
                canvas.save();
                canvas.translate(rectF.left, rectF.top);
                canvas2 = canvas;
                z10.y(canvas2, 0.0f, 0.0f, measuredWidth, measuredHeight);
                canvas2.restore();
            }
            i10++;
            canvas = canvas2;
        }
    }
}
