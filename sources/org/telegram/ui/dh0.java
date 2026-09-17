package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.SparseArray;
import android.view.View;
import org.telegram.messenger.SharedConfig;
public final class dh0 implements ah.k {
    public final gh0 f33125a;

    public dh0(gh0 gh0Var) {
        this.f33125a = gh0Var;
    }

    @Override
    public void b(Canvas canvas) {
        fh.d x10;
        Canvas canvas2;
        gh0 gh0Var = this.f33125a;
        RectF rectF = gh0Var.U;
        int measuredWidth = gh0Var.fragmentView.getMeasuredWidth();
        int measuredHeight = gh0Var.fragmentView.getMeasuredHeight();
        canvas.drawColor(gh0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f18862d6));
        SparseArray sparseArray = gh0Var.f31898a;
        int size = sparseArray.size();
        int i10 = 0;
        while (i10 < size) {
            org.telegram.ui.ActionBar.o2 o2Var = ((yh1) sparseArray.valueAt(i10)).f39918a;
            View view = o2Var.fragmentView;
            if (view == null || !hh.k.c(view, gh0Var.f31899b, rectF) || rectF.right <= 0.0f || rectF.left >= gh0Var.fragmentView.getMeasuredWidth() || !(o2Var instanceof fh0) || (x10 = ((fh0) o2Var).x()) == null) {
                canvas2 = canvas;
            } else {
                canvas.save();
                canvas.translate(rectF.left, rectF.top);
                canvas2 = canvas;
                x10.y(canvas2, 0.0f, 0.0f, measuredWidth, measuredHeight);
                canvas2.restore();
            }
            i10++;
            canvas = canvas2;
        }
    }

    @Override
    public void m(ah.a aVar) {
        gh0 gh0Var = this.f33125a;
        RectF rectF = gh0Var.U;
        aVar.a(gh0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f18862d6));
        aVar.b(SharedConfig.chatBlurEnabled());
        SparseArray sparseArray = gh0Var.f31898a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            org.telegram.ui.ActionBar.o2 o2Var = ((yh1) sparseArray.valueAt(i10)).f39918a;
            View view = o2Var.fragmentView;
            if (view != null && hh.k.c(view, gh0Var.f31899b, rectF) && rectF.right > 0.0f && rectF.left < gh0Var.fragmentView.getMeasuredWidth() && (o2Var instanceof fh0) && ((fh0) o2Var).x() != null) {
                aVar.c(rectF.left);
                aVar.c(rectF.top);
                aVar.a(o2Var.getClassGuid());
            }
        }
    }
}
