package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.SparseArray;
import android.view.View;
import org.telegram.messenger.SharedConfig;
public final class kg0 implements bh.h {
    public final ng0 f38606a;

    public kg0(ng0 ng0Var) {
        this.f38606a = ng0Var;
    }

    @Override
    public void J(bh.a aVar) {
        ng0 ng0Var = this.f38606a;
        RectF rectF = ng0Var.T;
        aVar.a(ng0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20994d6));
        aVar.b(SharedConfig.chatBlurEnabled());
        SparseArray sparseArray = ng0Var.f39890a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            org.telegram.ui.ActionBar.n2 n2Var = ((mg1) sparseArray.valueAt(i10)).f39247a;
            View view = n2Var.fragmentView;
            if (view != null && ih.j.c(view, ng0Var.f39891b, rectF) && rectF.right > 0.0f && rectF.left < ng0Var.fragmentView.getMeasuredWidth() && (n2Var instanceof mg0) && ((mg0) n2Var).z() != null) {
                aVar.c(rectF.left);
                aVar.c(rectF.top);
                aVar.a(n2Var.getClassGuid());
            }
        }
    }

    @Override
    public void b(Canvas canvas) {
        gh.d z10;
        Canvas canvas2;
        ng0 ng0Var = this.f38606a;
        RectF rectF = ng0Var.T;
        int measuredWidth = ng0Var.fragmentView.getMeasuredWidth();
        int measuredHeight = ng0Var.fragmentView.getMeasuredHeight();
        canvas.drawColor(ng0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20994d6));
        SparseArray sparseArray = ng0Var.f39890a;
        int size = sparseArray.size();
        int i10 = 0;
        while (i10 < size) {
            org.telegram.ui.ActionBar.n2 n2Var = ((mg1) sparseArray.valueAt(i10)).f39247a;
            View view = n2Var.fragmentView;
            if (view == null || !ih.j.c(view, ng0Var.f39891b, rectF) || rectF.right <= 0.0f || rectF.left >= ng0Var.fragmentView.getMeasuredWidth() || !(n2Var instanceof mg0) || (z10 = ((mg0) n2Var).z()) == null) {
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
