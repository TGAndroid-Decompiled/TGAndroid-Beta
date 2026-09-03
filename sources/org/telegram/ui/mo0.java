package org.telegram.ui;

import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
public final class mo0 implements lf.d0, r0.o, org.telegram.ui.ActionBar.c2 {
    public final int f39012a;
    public final np0 f39013b;

    public mo0(np0 np0Var, int i10) {
        this.f39012a = i10;
        this.f39013b = np0Var;
    }

    @Override
    public r0.m1 M0(View view, r0.m1 m1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        np0 np0Var = this.f39013b;
        np0Var.Y = defaultWindowInsets;
        yo0 yo0Var = np0Var.h.f37443b;
        int i10 = defaultWindowInsets.f7757a;
        int paddingTop = yo0Var.getPaddingTop();
        i0.b bVar = np0Var.Y;
        yo0Var.setPadding(i10, paddingTop, bVar.f7759c, AndroidUtilities.dp(72.0f) + bVar.d);
        yo0 yo0Var2 = np0Var.f39435n.f37443b;
        int i11 = np0Var.Y.f7757a;
        int paddingTop2 = yo0Var2.getPaddingTop();
        i0.b bVar2 = np0Var.Y;
        yo0Var2.setPadding(i11, paddingTop2, bVar2.f7759c, AndroidUtilities.dp(72.0f) + bVar2.d);
        FrameLayout frameLayout = np0Var.M;
        i0.b bVar3 = np0Var.Y;
        frameLayout.setPadding(bVar3.f7757a, 0, bVar3.f7759c, bVar3.d);
        return r0.m1.f46482b;
    }

    @Override
    public void a(int i10) {
        int i11;
        np0 np0Var = this.f39013b;
        tg.d dVar = np0Var.f39428d0;
        ArrayList arrayList = np0Var.f39434h0;
        og.e eVar = np0Var.f39427c0;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 31 && eVar != null) {
            ArrayList arrayList2 = np0Var.f39433g0;
            if (i12 >= 29 && dVar != null) {
                i11 = dVar.d(arrayList2, 0, AndroidUtilities.dp(8.0f));
            } else {
                i11 = 0;
            }
            int a2 = lf.l0.a(i11, arrayList2, arrayList);
            int measuredWidth = np0Var.d.getMeasuredWidth();
            for (int i13 = 0; i13 < a2; i13++) {
                RectF rectF = (RectF) arrayList.get(i13);
                float f10 = measuredWidth;
                rectF.left = k7.o.a(rectF.left, 0.0f, f10);
                rectF.top = Math.max(0.0f, rectF.top);
                rectF.right = k7.o.a(rectF.right, 0.0f, f10);
                rectF.bottom = Math.min(np0Var.d.getHeight(), rectF.bottom);
            }
            eVar.g(a2, arrayList);
            if (eVar.e(np0Var.f39432f0, np0Var.d.getWidth(), np0Var.d.getHeight())) {
                if (dVar != null) {
                    dVar.e();
                }
                Iterator it = np0Var.f39423a0.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
            }
        }
    }

    @Override
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f39012a) {
            case 2:
                this.f39013b.finishFragment();
                return;
            default:
                this.f39013b.y0();
                return;
        }
    }
}
