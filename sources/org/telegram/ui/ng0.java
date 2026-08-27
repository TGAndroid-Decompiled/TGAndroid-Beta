package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.SparseArray;
import android.view.View;
import org.telegram.messenger.SharedConfig;

public final class ng0 implements jg.g {

    public final qg0 f40828a;

    public ng0(qg0 qg0Var) {
        this.f40828a = qg0Var;
    }

    @Override
    public void A(g.y yVar) {
        qg0 qg0Var = this.f40828a;
        RectF rectF = qg0Var.Q;
        yVar.a(qg0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6));
        yVar.b(SharedConfig.chatBlurEnabled());
        SparseArray sparseArray = qg0Var.f42638a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            org.telegram.ui.ActionBar.n2 n2Var = ((qg1) sparseArray.valueAt(i10)).f41659a;
            View view = n2Var.fragmentView;
            if (view != null && qg.j.c(view, qg0Var.f42639b, rectF) && rectF.right > 0.0f && rectF.left < qg0Var.fragmentView.getMeasuredWidth() && (n2Var instanceof pg0) && ((pg0) n2Var).z() != null) {
                yVar.c(rectF.left);
                yVar.c(rectF.top);
                yVar.a(n2Var.getClassGuid());
            }
        }
    }

    @Override
    public void n(Canvas canvas) {
        og.d dVarZ;
        Canvas canvas2;
        qg0 qg0Var = this.f40828a;
        RectF rectF = qg0Var.Q;
        int measuredWidth = qg0Var.fragmentView.getMeasuredWidth();
        int measuredHeight = qg0Var.fragmentView.getMeasuredHeight();
        canvas.drawColor(qg0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6));
        SparseArray sparseArray = qg0Var.f42638a;
        int size = sparseArray.size();
        int i10 = 0;
        while (i10 < size) {
            org.telegram.ui.ActionBar.n2 n2Var = ((qg1) sparseArray.valueAt(i10)).f41659a;
            View view = n2Var.fragmentView;
            if (view != null && qg.j.c(view, qg0Var.f42639b, rectF) && rectF.right > 0.0f && rectF.left < qg0Var.fragmentView.getMeasuredWidth() && (n2Var instanceof pg0) && (dVarZ = ((pg0) n2Var).z()) != null) {
                canvas.save();
                canvas.translate(rectF.left, rectF.top);
                canvas2 = canvas;
                dVarZ.T0(canvas2, 0.0f, 0.0f, measuredWidth, measuredHeight);
                canvas2.restore();
            } else {
                canvas2 = canvas;
            }
            i10++;
            canvas = canvas2;
        }
    }
}
