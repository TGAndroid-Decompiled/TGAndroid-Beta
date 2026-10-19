package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.SparseArray;
import android.view.View;
import org.telegram.messenger.SharedConfig;
public final class jg0 implements bh.h {
    public final mg0 f38247a;

    public jg0(mg0 mg0Var) {
        this.f38247a = mg0Var;
    }

    @Override
    public void J(bh.a aVar) {
        mg0 mg0Var = this.f38247a;
        RectF rectF = mg0Var.T;
        aVar.a(mg0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20989d6));
        aVar.b(SharedConfig.chatBlurEnabled());
        SparseArray sparseArray = mg0Var.f39886a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            org.telegram.ui.ActionBar.n2 n2Var = ((mg1) sparseArray.valueAt(i10)).f39269a;
            View view = n2Var.fragmentView;
            if (view != null && ih.j.c(view, mg0Var.f39887b, rectF) && rectF.right > 0.0f && rectF.left < mg0Var.fragmentView.getMeasuredWidth() && (n2Var instanceof lg0) && ((lg0) n2Var).z() != null) {
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
        mg0 mg0Var = this.f38247a;
        RectF rectF = mg0Var.T;
        int measuredWidth = mg0Var.fragmentView.getMeasuredWidth();
        int measuredHeight = mg0Var.fragmentView.getMeasuredHeight();
        canvas.drawColor(mg0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20989d6));
        SparseArray sparseArray = mg0Var.f39886a;
        int size = sparseArray.size();
        int i10 = 0;
        while (i10 < size) {
            org.telegram.ui.ActionBar.n2 n2Var = ((mg1) sparseArray.valueAt(i10)).f39269a;
            View view = n2Var.fragmentView;
            if (view == null || !ih.j.c(view, mg0Var.f39887b, rectF) || rectF.right <= 0.0f || rectF.left >= mg0Var.fragmentView.getMeasuredWidth() || !(n2Var instanceof lg0) || (z10 = ((lg0) n2Var).z()) == null) {
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
