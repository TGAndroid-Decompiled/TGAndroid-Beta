package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.SparseArray;
import android.view.View;
import org.telegram.messenger.SharedConfig;
public final class kg0 implements ig.g {
    public final ng0 f39830a;

    public kg0(ng0 ng0Var) {
        this.f39830a = ng0Var;
    }

    @Override
    public void k(Canvas canvas) {
        ng.d y10;
        Canvas canvas2;
        ng0 ng0Var = this.f39830a;
        RectF rectF = ng0Var.Q;
        int measuredWidth = ng0Var.fragmentView.getMeasuredWidth();
        int measuredHeight = ng0Var.fragmentView.getMeasuredHeight();
        canvas.drawColor(ng0Var.getThemedColor(org.telegram.ui.ActionBar.f6.f23001d6));
        SparseArray sparseArray = ng0Var.f42997a;
        int size = sparseArray.size();
        int i9 = 0;
        while (i9 < size) {
            org.telegram.ui.ActionBar.o2 o2Var = ((rg1) sparseArray.valueAt(i9)).f42421a;
            View view = o2Var.fragmentView;
            if (view == null || !pg.i.c(view, ng0Var.f42998b, rectF) || rectF.right <= 0.0f || rectF.left >= ng0Var.fragmentView.getMeasuredWidth() || !(o2Var instanceof mg0) || (y10 = ((mg0) o2Var).y()) == null) {
                canvas2 = canvas;
            } else {
                canvas.save();
                canvas.translate(rectF.left, rectF.top);
                canvas2 = canvas;
                y10.T0(canvas2, 0.0f, 0.0f, measuredWidth, measuredHeight);
                canvas2.restore();
            }
            i9++;
            canvas = canvas2;
        }
    }

    @Override
    public void x0(g.x xVar) {
        ng0 ng0Var = this.f39830a;
        RectF rectF = ng0Var.Q;
        xVar.a(ng0Var.getThemedColor(org.telegram.ui.ActionBar.f6.f23001d6));
        xVar.b(SharedConfig.chatBlurEnabled());
        SparseArray sparseArray = ng0Var.f42997a;
        int size = sparseArray.size();
        for (int i9 = 0; i9 < size; i9++) {
            org.telegram.ui.ActionBar.o2 o2Var = ((rg1) sparseArray.valueAt(i9)).f42421a;
            View view = o2Var.fragmentView;
            if (view != null && pg.i.c(view, ng0Var.f42998b, rectF) && rectF.right > 0.0f && rectF.left < ng0Var.fragmentView.getMeasuredWidth() && (o2Var instanceof mg0) && ((mg0) o2Var).y() != null) {
                xVar.c(rectF.left);
                xVar.c(rectF.top);
                xVar.a(o2Var.getClassGuid());
            }
        }
    }
}
