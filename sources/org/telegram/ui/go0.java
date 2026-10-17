package org.telegram.ui;

import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
public final class go0 implements zf.a0, r0.n, org.telegram.ui.ActionBar.a2 {
    public final int f37281a;
    public final jp0 f37282b;

    public go0(jp0 jp0Var, int i10) {
        this.f37281a = i10;
        this.f37282b = jp0Var;
    }

    @Override
    public r0.k1 B0(View view, r0.k1 k1Var) {
        i0.c defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        jp0 jp0Var = this.f37282b;
        jp0Var.f38242b0 = defaultWindowInsets;
        uo0 uo0Var = jp0Var.h.f36244b;
        int i10 = defaultWindowInsets.f12284a;
        int paddingTop = uo0Var.getPaddingTop();
        i0.c cVar = jp0Var.f38242b0;
        uo0Var.setPadding(i10, paddingTop, cVar.f12286c, AndroidUtilities.dp(72.0f) + cVar.d);
        uo0 uo0Var2 = jp0Var.f38254n.f36244b;
        int i11 = jp0Var.f38242b0.f12284a;
        int paddingTop2 = uo0Var2.getPaddingTop();
        i0.c cVar2 = jp0Var.f38242b0;
        uo0Var2.setPadding(i11, paddingTop2, cVar2.f12286c, AndroidUtilities.dp(72.0f) + cVar2.d);
        FrameLayout frameLayout = jp0Var.P;
        i0.c cVar3 = jp0Var.f38242b0;
        frameLayout.setPadding(cVar3.f12284a, 0, cVar3.f12286c, cVar3.d);
        return r0.k1.f44852b;
    }

    @Override
    public void a(int i10) {
        int i11;
        jp0 jp0Var = this.f37282b;
        gh.d dVar = jp0Var.f38249g0;
        ArrayList arrayList = jp0Var.f38253k0;
        bh.f fVar = jp0Var.f38248f0;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 31 && fVar != null) {
            ArrayList arrayList2 = jp0Var.f38252j0;
            if (i12 >= 29 && dVar != null) {
                i11 = dVar.d(0, AndroidUtilities.dp(8.0f), arrayList2);
            } else {
                i11 = 0;
            }
            int a2 = zf.e0.a(arrayList2, i11, arrayList);
            int measuredWidth = jp0Var.d.getMeasuredWidth();
            for (int i13 = 0; i13 < a2; i13++) {
                RectF rectF = (RectF) arrayList.get(i13);
                float f7 = measuredWidth;
                rectF.left = w7.r.a(rectF.left, 0.0f, f7);
                rectF.top = Math.max(0.0f, rectF.top);
                rectF.right = w7.r.a(rectF.right, 0.0f, f7);
                rectF.bottom = Math.min(jp0Var.d.getHeight(), rectF.bottom);
            }
            fVar.g(a2, arrayList);
            if (fVar.e(jp0Var.f38251i0, jp0Var.d.getWidth(), jp0Var.d.getHeight())) {
                if (dVar != null) {
                    dVar.e();
                }
                Iterator it = jp0Var.f38245d0.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
            }
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f37281a) {
            case 2:
                this.f37282b.finishFragment();
                return;
            default:
                this.f37282b.y0();
                return;
        }
    }
}
