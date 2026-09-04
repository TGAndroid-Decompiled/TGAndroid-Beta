package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.SparseArray;
import android.view.View;
import org.telegram.messenger.SharedConfig;
public final class bh0 implements bh.h {
    public final eh0 f34805a;

    public bh0(eh0 eh0Var) {
        this.f34805a = eh0Var;
    }

    @Override
    public void k(Canvas canvas) {
        gh.d x10;
        Canvas canvas2;
        eh0 eh0Var = this.f34805a;
        RectF rectF = eh0Var.U;
        int measuredWidth = eh0Var.fragmentView.getMeasuredWidth();
        int measuredHeight = eh0Var.fragmentView.getMeasuredHeight();
        canvas.drawColor(eh0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f20663d6));
        SparseArray sparseArray = eh0Var.f34814a;
        int size = sparseArray.size();
        int i10 = 0;
        while (i10 < size) {
            org.telegram.ui.ActionBar.n2 n2Var = ((zh1) sparseArray.valueAt(i10)).f43438a;
            View view = n2Var.fragmentView;
            if (view == null || !ih.k.c(view, eh0Var.f34815b, rectF) || rectF.right <= 0.0f || rectF.left >= eh0Var.fragmentView.getMeasuredWidth() || !(n2Var instanceof dh0) || (x10 = ((dh0) n2Var).x()) == null) {
                canvas2 = canvas;
            } else {
                canvas.save();
                canvas.translate(rectF.left, rectF.top);
                canvas2 = canvas;
                x10.v(canvas2, 0.0f, 0.0f, measuredWidth, measuredHeight);
                canvas2.restore();
            }
            i10++;
            canvas = canvas2;
        }
    }

    @Override
    public void v(bh.a aVar) {
        eh0 eh0Var = this.f34805a;
        RectF rectF = eh0Var.U;
        aVar.a(eh0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f20663d6));
        aVar.b(SharedConfig.chatBlurEnabled());
        SparseArray sparseArray = eh0Var.f34814a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            org.telegram.ui.ActionBar.n2 n2Var = ((zh1) sparseArray.valueAt(i10)).f43438a;
            View view = n2Var.fragmentView;
            if (view != null && ih.k.c(view, eh0Var.f34815b, rectF) && rectF.right > 0.0f && rectF.left < eh0Var.fragmentView.getMeasuredWidth() && (n2Var instanceof dh0) && ((dh0) n2Var).x() != null) {
                aVar.c(rectF.left);
                aVar.c(rectF.top);
                aVar.a(n2Var.getClassGuid());
            }
        }
    }
}
