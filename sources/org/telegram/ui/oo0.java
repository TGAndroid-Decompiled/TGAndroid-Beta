package org.telegram.ui;

import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
public final class oo0 implements yf.a0, r0.n, org.telegram.ui.ActionBar.z1 {
    public final int f36413a;
    public final sp0 f36414b;

    public oo0(sp0 sp0Var, int i10) {
        this.f36413a = i10;
        this.f36414b = sp0Var;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        sp0 sp0Var = this.f36414b;
        sp0Var.f37938b0 = defaultWindowInsets;
        dp0 dp0Var = sp0Var.h.f35734b;
        int i10 = defaultWindowInsets.f10590a;
        int paddingTop = dp0Var.getPaddingTop();
        i0.b bVar = sp0Var.f37938b0;
        dp0Var.setPadding(i10, paddingTop, bVar.f10592c, AndroidUtilities.dp(72.0f) + bVar.d);
        dp0 dp0Var2 = sp0Var.f37950n.f35734b;
        int i11 = sp0Var.f37938b0.f10590a;
        int paddingTop2 = dp0Var2.getPaddingTop();
        i0.b bVar2 = sp0Var.f37938b0;
        dp0Var2.setPadding(i11, paddingTop2, bVar2.f10592c, AndroidUtilities.dp(72.0f) + bVar2.d);
        FrameLayout frameLayout = sp0Var.P;
        i0.b bVar3 = sp0Var.f37938b0;
        frameLayout.setPadding(bVar3.f10590a, 0, bVar3.f10592c, bVar3.d);
        return r0.l1.f42244b;
    }

    @Override
    public void a(int i10) {
        int i11;
        sp0 sp0Var = this.f36414b;
        fh.d dVar = sp0Var.f37945g0;
        ArrayList arrayList = sp0Var.f37949k0;
        ah.h hVar = sp0Var.f37944f0;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 31 && hVar != null) {
            ArrayList arrayList2 = sp0Var.f37948j0;
            if (i12 >= 29 && dVar != null) {
                i11 = dVar.e(0, AndroidUtilities.dp(8.0f), arrayList2);
            } else {
                i11 = 0;
            }
            int a2 = yf.e0.a(arrayList2, i11, arrayList);
            int measuredWidth = sp0Var.d.getMeasuredWidth();
            for (int i13 = 0; i13 < a2; i13++) {
                RectF rectF = (RectF) arrayList.get(i13);
                float f7 = measuredWidth;
                rectF.left = w7.q.a(rectF.left, 0.0f, f7);
                rectF.top = Math.max(0.0f, rectF.top);
                rectF.right = w7.q.a(rectF.right, 0.0f, f7);
                rectF.bottom = Math.min(sp0Var.d.getHeight(), rectF.bottom);
            }
            hVar.g(a2, arrayList);
            if (hVar.e(sp0Var.f37947i0, sp0Var.d.getWidth(), sp0Var.d.getHeight())) {
                if (dVar != null) {
                    dVar.f();
                }
                Iterator it = sp0Var.f37941d0.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
            }
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f36413a) {
            case 2:
                this.f36414b.finishFragment();
                return;
            default:
                this.f36414b.y0();
                return;
        }
    }
}
