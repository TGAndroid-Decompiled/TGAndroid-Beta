package org.telegram.ui;

import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
public final class bp0 implements zf.b0, r0.n, org.telegram.ui.ActionBar.z1 {
    public final int f34362a;
    public final eq0 f34363b;

    public bp0(eq0 eq0Var, int i10) {
        this.f34362a = i10;
        this.f34363b = eq0Var;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        eq0 eq0Var = this.f34363b;
        eq0Var.f35350b0 = defaultWindowInsets;
        pp0 pp0Var = eq0Var.h.f41863b;
        int i10 = defaultWindowInsets.f10892a;
        int paddingTop = pp0Var.getPaddingTop();
        i0.b bVar = eq0Var.f35350b0;
        pp0Var.setPadding(i10, paddingTop, bVar.f10894c, AndroidUtilities.dp(72.0f) + bVar.d);
        pp0 pp0Var2 = eq0Var.f35362n.f41863b;
        int i11 = eq0Var.f35350b0.f10892a;
        int paddingTop2 = pp0Var2.getPaddingTop();
        i0.b bVar2 = eq0Var.f35350b0;
        pp0Var2.setPadding(i11, paddingTop2, bVar2.f10894c, AndroidUtilities.dp(72.0f) + bVar2.d);
        FrameLayout frameLayout = eq0Var.P;
        i0.b bVar3 = eq0Var.f35350b0;
        frameLayout.setPadding(bVar3.f10892a, 0, bVar3.f10894c, bVar3.d);
        return r0.l1.f43496b;
    }

    @Override
    public void a(int i10) {
        int i11;
        eq0 eq0Var = this.f34363b;
        gh.d dVar = eq0Var.f35357g0;
        ArrayList arrayList = eq0Var.f35361k0;
        bh.f fVar = eq0Var.f35356f0;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 31 && fVar != null) {
            ArrayList arrayList2 = eq0Var.f35360j0;
            if (i12 >= 29 && dVar != null) {
                i11 = dVar.d(0, AndroidUtilities.dp(8.0f), arrayList2);
            } else {
                i11 = 0;
            }
            int a2 = zf.f0.a(arrayList2, i11, arrayList);
            int measuredWidth = eq0Var.d.getMeasuredWidth();
            for (int i13 = 0; i13 < a2; i13++) {
                RectF rectF = (RectF) arrayList.get(i13);
                float f7 = measuredWidth;
                rectF.left = w7.r.a(rectF.left, 0.0f, f7);
                rectF.top = Math.max(0.0f, rectF.top);
                rectF.right = w7.r.a(rectF.right, 0.0f, f7);
                rectF.bottom = Math.min(eq0Var.d.getHeight(), rectF.bottom);
            }
            fVar.g(a2, arrayList);
            if (fVar.e(eq0Var.f35359i0, eq0Var.d.getWidth(), eq0Var.d.getHeight())) {
                if (dVar != null) {
                    dVar.e();
                }
                Iterator it = eq0Var.f35353d0.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
            }
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f34362a) {
            case 2:
                this.f34363b.finishFragment();
                return;
            default:
                this.f34363b.y0();
                return;
        }
    }
}
