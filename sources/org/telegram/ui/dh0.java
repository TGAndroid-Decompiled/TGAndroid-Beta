package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.SparseArray;
import android.view.View;
import org.telegram.messenger.SharedConfig;
public final class dh0 implements ah.k {
    public final gh0 f33067a;

    public dh0(gh0 gh0Var) {
        this.f33067a = gh0Var;
    }

    @Override
    public void b(Canvas canvas) {
        fh.d x10;
        Canvas canvas2;
        gh0 gh0Var = this.f33067a;
        RectF rectF = gh0Var.T;
        int measuredWidth = gh0Var.fragmentView.getMeasuredWidth();
        int measuredHeight = gh0Var.fragmentView.getMeasuredHeight();
        canvas.drawColor(gh0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19109d6));
        SparseArray sparseArray = gh0Var.f32121a;
        int size = sparseArray.size();
        int i10 = 0;
        while (i10 < size) {
            org.telegram.ui.ActionBar.n2 n2Var = ((yh1) sparseArray.valueAt(i10)).f39963a;
            View view = n2Var.fragmentView;
            if (view == null || !hh.k.c(view, gh0Var.f32122b, rectF) || rectF.right <= 0.0f || rectF.left >= gh0Var.fragmentView.getMeasuredWidth() || !(n2Var instanceof fh0) || (x10 = ((fh0) n2Var).x()) == null) {
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
    public void y(ah.a aVar) {
        gh0 gh0Var = this.f33067a;
        RectF rectF = gh0Var.T;
        aVar.a(gh0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19109d6));
        aVar.b(SharedConfig.chatBlurEnabled());
        SparseArray sparseArray = gh0Var.f32121a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            org.telegram.ui.ActionBar.n2 n2Var = ((yh1) sparseArray.valueAt(i10)).f39963a;
            View view = n2Var.fragmentView;
            if (view != null && hh.k.c(view, gh0Var.f32122b, rectF) && rectF.right > 0.0f && rectF.left < gh0Var.fragmentView.getMeasuredWidth() && (n2Var instanceof fh0) && ((fh0) n2Var).x() != null) {
                aVar.c(rectF.left);
                aVar.c(rectF.top);
                aVar.a(n2Var.getClassGuid());
            }
        }
    }
}
