package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.SparseArray;
import android.view.View;
import org.telegram.messenger.SharedConfig;
public final class dh0 implements ah.j {
    public final gh0 f36826a;

    public dh0(gh0 gh0Var) {
        this.f36826a = gh0Var;
    }

    @Override
    public void g0(ah.a aVar) {
        gh0 gh0Var = this.f36826a;
        RectF rectF = gh0Var.T;
        aVar.a(gh0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20559d6));
        aVar.b(SharedConfig.chatBlurEnabled());
        SparseArray sparseArray = gh0Var.f37114a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            org.telegram.ui.ActionBar.m2 m2Var = ((ci1) sparseArray.valueAt(i10)).f36441a;
            View view = m2Var.fragmentView;
            if (view != null && hh.j.c(view, gh0Var.f37115b, rectF) && rectF.right > 0.0f && rectF.left < gh0Var.fragmentView.getMeasuredWidth() && (m2Var instanceof fh0) && ((fh0) m2Var).y() != null) {
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
        gh0 gh0Var = this.f36826a;
        RectF rectF = gh0Var.T;
        int measuredWidth = gh0Var.fragmentView.getMeasuredWidth();
        int measuredHeight = gh0Var.fragmentView.getMeasuredHeight();
        canvas.drawColor(gh0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20559d6));
        SparseArray sparseArray = gh0Var.f37114a;
        int size = sparseArray.size();
        int i10 = 0;
        while (i10 < size) {
            org.telegram.ui.ActionBar.m2 m2Var = ((ci1) sparseArray.valueAt(i10)).f36441a;
            View view = m2Var.fragmentView;
            if (view == null || !hh.j.c(view, gh0Var.f37115b, rectF) || rectF.right <= 0.0f || rectF.left >= gh0Var.fragmentView.getMeasuredWidth() || !(m2Var instanceof fh0) || (y3 = ((fh0) m2Var).y()) == null) {
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
