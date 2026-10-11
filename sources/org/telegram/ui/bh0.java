package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.SparseArray;
import android.view.View;
import org.telegram.messenger.SharedConfig;
public final class bh0 implements ah.j {
    public final eh0 f36388a;

    public bh0(eh0 eh0Var) {
        this.f36388a = eh0Var;
    }

    @Override
    public void B0(ah.a aVar) {
        eh0 eh0Var = this.f36388a;
        RectF rectF = eh0Var.T;
        aVar.a(eh0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20786d6));
        aVar.b(SharedConfig.chatBlurEnabled());
        SparseArray sparseArray = eh0Var.f36399a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            org.telegram.ui.ActionBar.m2 m2Var = ((zh1) sparseArray.valueAt(i10)).f44668a;
            View view = m2Var.fragmentView;
            if (view != null && hh.j.c(view, eh0Var.f36400b, rectF) && rectF.right > 0.0f && rectF.left < eh0Var.fragmentView.getMeasuredWidth() && (m2Var instanceof dh0) && ((dh0) m2Var).y() != null) {
                aVar.c(rectF.left);
                aVar.c(rectF.top);
                aVar.a(m2Var.getClassGuid());
            }
        }
    }

    @Override
    public void l(Canvas canvas) {
        fh.d y3;
        Canvas canvas2;
        eh0 eh0Var = this.f36388a;
        RectF rectF = eh0Var.T;
        int measuredWidth = eh0Var.fragmentView.getMeasuredWidth();
        int measuredHeight = eh0Var.fragmentView.getMeasuredHeight();
        canvas.drawColor(eh0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20786d6));
        SparseArray sparseArray = eh0Var.f36399a;
        int size = sparseArray.size();
        int i10 = 0;
        while (i10 < size) {
            org.telegram.ui.ActionBar.m2 m2Var = ((zh1) sparseArray.valueAt(i10)).f44668a;
            View view = m2Var.fragmentView;
            if (view == null || !hh.j.c(view, eh0Var.f36400b, rectF) || rectF.right <= 0.0f || rectF.left >= eh0Var.fragmentView.getMeasuredWidth() || !(m2Var instanceof dh0) || (y3 = ((dh0) m2Var).y()) == null) {
                canvas2 = canvas;
            } else {
                canvas.save();
                canvas.translate(rectF.left, rectF.top);
                canvas2 = canvas;
                y3.v(canvas2, 0.0f, 0.0f, measuredWidth, measuredHeight);
                canvas2.restore();
            }
            i10++;
            canvas = canvas2;
        }
    }
}
