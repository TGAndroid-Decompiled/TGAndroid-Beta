package org.telegram.ui;

import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
public final class jo0 implements zf.a0, r0.n, org.telegram.ui.ActionBar.z1 {
    public final int f38609a;
    public final lp0 f38610b;

    public jo0(lp0 lp0Var, int i10) {
        this.f38609a = i10;
        this.f38610b = lp0Var;
    }

    @Override
    public r0.k1 B0(View view, r0.k1 k1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        lp0 lp0Var = this.f38610b;
        lp0Var.f39293b0 = defaultWindowInsets;
        wo0 wo0Var = lp0Var.h.f37385b;
        int i10 = defaultWindowInsets.f12315a;
        int paddingTop = wo0Var.getPaddingTop();
        i0.b bVar = lp0Var.f39293b0;
        wo0Var.setPadding(i10, paddingTop, bVar.f12317c, AndroidUtilities.dp(72.0f) + bVar.d);
        wo0 wo0Var2 = lp0Var.f39305n.f37385b;
        int i11 = lp0Var.f39293b0.f12315a;
        int paddingTop2 = wo0Var2.getPaddingTop();
        i0.b bVar2 = lp0Var.f39293b0;
        wo0Var2.setPadding(i11, paddingTop2, bVar2.f12317c, AndroidUtilities.dp(72.0f) + bVar2.d);
        FrameLayout frameLayout = lp0Var.P;
        i0.b bVar3 = lp0Var.f39293b0;
        frameLayout.setPadding(bVar3.f12315a, 0, bVar3.f12317c, bVar3.d);
        return r0.k1.f45250b;
    }

    @Override
    public void a(int i10) {
        int i11;
        lp0 lp0Var = this.f38610b;
        gh.d dVar = lp0Var.f39300g0;
        ArrayList arrayList = lp0Var.f39304k0;
        bh.f fVar = lp0Var.f39299f0;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 31 && fVar != null) {
            ArrayList arrayList2 = lp0Var.f39303j0;
            if (i12 >= 29 && dVar != null) {
                i11 = dVar.e(0, AndroidUtilities.dp(8.0f), arrayList2);
            } else {
                i11 = 0;
            }
            int a2 = zf.f0.a(arrayList2, i11, arrayList);
            int measuredWidth = lp0Var.d.getMeasuredWidth();
            for (int i13 = 0; i13 < a2; i13++) {
                RectF rectF = (RectF) arrayList.get(i13);
                float f7 = measuredWidth;
                rectF.left = w7.r.a(rectF.left, 0.0f, f7);
                rectF.top = Math.max(0.0f, rectF.top);
                rectF.right = w7.r.a(rectF.right, 0.0f, f7);
                rectF.bottom = Math.min(lp0Var.d.getHeight(), rectF.bottom);
            }
            fVar.g(a2, arrayList);
            if (fVar.e(lp0Var.f39302i0, lp0Var.d.getWidth(), lp0Var.d.getHeight())) {
                if (dVar != null) {
                    dVar.f();
                }
                Iterator it = lp0Var.f39296d0.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
            }
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f38609a) {
            case 2:
                this.f38610b.finishFragment();
                return;
            default:
                this.f38610b.y0();
                return;
        }
    }
}
