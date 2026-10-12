package org.telegram.ui;

import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
public final class dp0 implements zf.b0, r0.o, org.telegram.ui.ActionBar.z1 {
    public final int f35343a;
    public final gq0 f35344b;

    public dp0(gq0 gq0Var, int i10) {
        this.f35343a = i10;
        this.f35344b = gq0Var;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        gq0 gq0Var = this.f35344b;
        gq0Var.f36451b0 = defaultWindowInsets;
        rp0 rp0Var = gq0Var.h.f34305b;
        int i10 = defaultWindowInsets.f10888a;
        int paddingTop = rp0Var.getPaddingTop();
        i0.b bVar = gq0Var.f36451b0;
        rp0Var.setPadding(i10, paddingTop, bVar.f10890c, AndroidUtilities.dp(72.0f) + bVar.d);
        rp0 rp0Var2 = gq0Var.f36463n.f34305b;
        int i11 = gq0Var.f36451b0.f10888a;
        int paddingTop2 = rp0Var2.getPaddingTop();
        i0.b bVar2 = gq0Var.f36451b0;
        rp0Var2.setPadding(i11, paddingTop2, bVar2.f10890c, AndroidUtilities.dp(72.0f) + bVar2.d);
        FrameLayout frameLayout = gq0Var.P;
        i0.b bVar3 = gq0Var.f36451b0;
        frameLayout.setPadding(bVar3.f10888a, 0, bVar3.f10890c, bVar3.d);
        return r0.l1.f43740b;
    }

    @Override
    public void a(int i10) {
        int i11;
        gq0 gq0Var = this.f35344b;
        gh.d dVar = gq0Var.f36458g0;
        ArrayList arrayList = gq0Var.f36462k0;
        bh.f fVar = gq0Var.f36457f0;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 31 && fVar != null) {
            ArrayList arrayList2 = gq0Var.f36461j0;
            if (i12 >= 29 && dVar != null) {
                i11 = dVar.d(0, AndroidUtilities.dp(8.0f), arrayList2);
            } else {
                i11 = 0;
            }
            int a2 = zf.f0.a(arrayList2, i11, arrayList);
            int measuredWidth = gq0Var.d.getMeasuredWidth();
            for (int i13 = 0; i13 < a2; i13++) {
                RectF rectF = (RectF) arrayList.get(i13);
                float f7 = measuredWidth;
                rectF.left = w7.s.a(rectF.left, 0.0f, f7);
                rectF.top = Math.max(0.0f, rectF.top);
                rectF.right = w7.s.a(rectF.right, 0.0f, f7);
                rectF.bottom = Math.min(gq0Var.d.getHeight(), rectF.bottom);
            }
            fVar.g(a2, arrayList);
            if (fVar.e(gq0Var.f36460i0, gq0Var.d.getWidth(), gq0Var.d.getHeight())) {
                if (dVar != null) {
                    dVar.e();
                }
                Iterator it = gq0Var.f36454d0.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
            }
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f35343a) {
            case 2:
                this.f35344b.finishFragment();
                return;
            default:
                this.f35344b.y0();
                return;
        }
    }
}
