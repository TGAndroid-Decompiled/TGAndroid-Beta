package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.SparseArray;
import android.view.View;
import org.telegram.messenger.SharedConfig;
public final class lg0 implements bh.h {
    public final og0 f38821a;

    public lg0(og0 og0Var) {
        this.f38821a = og0Var;
    }

    @Override
    public void H(bh.a aVar) {
        og0 og0Var = this.f38821a;
        RectF rectF = og0Var.T;
        aVar.a(og0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20986d6));
        aVar.b(SharedConfig.chatBlurEnabled());
        SparseArray sparseArray = og0Var.f40394a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            org.telegram.ui.ActionBar.n2 n2Var = ((og1) sparseArray.valueAt(i10)).f39786a;
            View view = n2Var.fragmentView;
            if (view != null && ih.j.c(view, og0Var.f40395b, rectF) && rectF.right > 0.0f && rectF.left < og0Var.fragmentView.getMeasuredWidth() && (n2Var instanceof ng0) && ((ng0) n2Var).z() != null) {
                aVar.c(rectF.left);
                aVar.c(rectF.top);
                aVar.a(n2Var.getClassGuid());
            }
        }
    }

    @Override
    public void r(Canvas canvas) {
        gh.d z10;
        Canvas canvas2;
        og0 og0Var = this.f38821a;
        RectF rectF = og0Var.T;
        int measuredWidth = og0Var.fragmentView.getMeasuredWidth();
        int measuredHeight = og0Var.fragmentView.getMeasuredHeight();
        canvas.drawColor(og0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20986d6));
        SparseArray sparseArray = og0Var.f40394a;
        int size = sparseArray.size();
        int i10 = 0;
        while (i10 < size) {
            org.telegram.ui.ActionBar.n2 n2Var = ((og1) sparseArray.valueAt(i10)).f39786a;
            View view = n2Var.fragmentView;
            if (view == null || !ih.j.c(view, og0Var.f40395b, rectF) || rectF.right <= 0.0f || rectF.left >= og0Var.fragmentView.getMeasuredWidth() || !(n2Var instanceof ng0) || (z10 = ((ng0) n2Var).z()) == null) {
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
