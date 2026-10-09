package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.SparseArray;
import android.view.View;
import org.telegram.messenger.SharedConfig;
public final class ch0 implements ah.j {
    public final fh0 f36670a;

    public ch0(fh0 fh0Var) {
        this.f36670a = fh0Var;
    }

    @Override
    public void B0(ah.a aVar) {
        fh0 fh0Var = this.f36670a;
        RectF rectF = fh0Var.T;
        aVar.a(fh0Var.getThemedColor(org.telegram.ui.ActionBar.i6.f20797d6));
        aVar.b(SharedConfig.chatBlurEnabled());
        SparseArray sparseArray = fh0Var.f36683a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            org.telegram.ui.ActionBar.n2 n2Var = ((ai1) sparseArray.valueAt(i10)).f35936a;
            View view = n2Var.fragmentView;
            if (view != null && hh.j.c(view, fh0Var.f36684b, rectF) && rectF.right > 0.0f && rectF.left < fh0Var.fragmentView.getMeasuredWidth() && (n2Var instanceof eh0) && ((eh0) n2Var).y() != null) {
                aVar.c(rectF.left);
                aVar.c(rectF.top);
                aVar.a(n2Var.getClassGuid());
            }
        }
    }

    @Override
    public void l(Canvas canvas) {
        fh.d y3;
        Canvas canvas2;
        fh0 fh0Var = this.f36670a;
        RectF rectF = fh0Var.T;
        int measuredWidth = fh0Var.fragmentView.getMeasuredWidth();
        int measuredHeight = fh0Var.fragmentView.getMeasuredHeight();
        canvas.drawColor(fh0Var.getThemedColor(org.telegram.ui.ActionBar.i6.f20797d6));
        SparseArray sparseArray = fh0Var.f36683a;
        int size = sparseArray.size();
        int i10 = 0;
        while (i10 < size) {
            org.telegram.ui.ActionBar.n2 n2Var = ((ai1) sparseArray.valueAt(i10)).f35936a;
            View view = n2Var.fragmentView;
            if (view == null || !hh.j.c(view, fh0Var.f36684b, rectF) || rectF.right <= 0.0f || rectF.left >= fh0Var.fragmentView.getMeasuredWidth() || !(n2Var instanceof eh0) || (y3 = ((eh0) n2Var).y()) == null) {
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
