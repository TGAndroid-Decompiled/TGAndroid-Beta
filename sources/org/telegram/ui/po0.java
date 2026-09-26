package org.telegram.ui;

import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
public final class po0 implements yf.a0, r0.n, org.telegram.ui.ActionBar.z1 {
    public final int f36586a;
    public final tp0 f36587b;

    public po0(tp0 tp0Var, int i10) {
        this.f36586a = i10;
        this.f36587b = tp0Var;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        tp0 tp0Var = this.f36587b;
        tp0Var.f38167b0 = defaultWindowInsets;
        ep0 ep0Var = tp0Var.h.f35938b;
        int i10 = defaultWindowInsets.f10576a;
        int paddingTop = ep0Var.getPaddingTop();
        i0.b bVar = tp0Var.f38167b0;
        ep0Var.setPadding(i10, paddingTop, bVar.f10578c, AndroidUtilities.dp(72.0f) + bVar.d);
        ep0 ep0Var2 = tp0Var.f38179n.f35938b;
        int i11 = tp0Var.f38167b0.f10576a;
        int paddingTop2 = ep0Var2.getPaddingTop();
        i0.b bVar2 = tp0Var.f38167b0;
        ep0Var2.setPadding(i11, paddingTop2, bVar2.f10578c, AndroidUtilities.dp(72.0f) + bVar2.d);
        FrameLayout frameLayout = tp0Var.P;
        i0.b bVar3 = tp0Var.f38167b0;
        frameLayout.setPadding(bVar3.f10576a, 0, bVar3.f10578c, bVar3.d);
        return r0.l1.f42139b;
    }

    @Override
    public void a(int i10) {
        int i11;
        tp0 tp0Var = this.f36587b;
        fh.d dVar = tp0Var.f38174g0;
        ArrayList arrayList = tp0Var.f38178k0;
        ah.h hVar = tp0Var.f38173f0;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 31 && hVar != null) {
            ArrayList arrayList2 = tp0Var.f38177j0;
            if (i12 >= 29 && dVar != null) {
                i11 = dVar.e(0, AndroidUtilities.dp(8.0f), arrayList2);
            } else {
                i11 = 0;
            }
            int a2 = yf.e0.a(arrayList2, i11, arrayList);
            int measuredWidth = tp0Var.d.getMeasuredWidth();
            for (int i13 = 0; i13 < a2; i13++) {
                RectF rectF = (RectF) arrayList.get(i13);
                float f7 = measuredWidth;
                rectF.left = w7.q.a(rectF.left, 0.0f, f7);
                rectF.top = Math.max(0.0f, rectF.top);
                rectF.right = w7.q.a(rectF.right, 0.0f, f7);
                rectF.bottom = Math.min(tp0Var.d.getHeight(), rectF.bottom);
            }
            hVar.g(a2, arrayList);
            if (hVar.e(tp0Var.f38176i0, tp0Var.d.getWidth(), tp0Var.d.getHeight())) {
                if (dVar != null) {
                    dVar.f();
                }
                Iterator it = tp0Var.f38170d0.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
            }
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f36586a) {
            case 2:
                this.f36587b.finishFragment();
                return;
            default:
                this.f36587b.y0();
                return;
        }
    }
}
