package org.telegram.ui;

import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
public final class fo0 implements zf.a0, r0.n, org.telegram.ui.ActionBar.a2 {
    public final int f37052a;
    public final ip0 f37053b;

    public fo0(ip0 ip0Var, int i10) {
        this.f37052a = i10;
        this.f37053b = ip0Var;
    }

    @Override
    public r0.k1 B0(View view, r0.k1 k1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        ip0 ip0Var = this.f37053b;
        ip0Var.f38086b0 = defaultWindowInsets;
        to0 to0Var = ip0Var.h.f36024b;
        int i10 = defaultWindowInsets.f12283a;
        int paddingTop = to0Var.getPaddingTop();
        i0.b bVar = ip0Var.f38086b0;
        to0Var.setPadding(i10, paddingTop, bVar.f12285c, AndroidUtilities.dp(72.0f) + bVar.d);
        to0 to0Var2 = ip0Var.f38098n.f36024b;
        int i11 = ip0Var.f38086b0.f12283a;
        int paddingTop2 = to0Var2.getPaddingTop();
        i0.b bVar2 = ip0Var.f38086b0;
        to0Var2.setPadding(i11, paddingTop2, bVar2.f12285c, AndroidUtilities.dp(72.0f) + bVar2.d);
        FrameLayout frameLayout = ip0Var.P;
        i0.b bVar3 = ip0Var.f38086b0;
        frameLayout.setPadding(bVar3.f12283a, 0, bVar3.f12285c, bVar3.d);
        return r0.k1.f44837b;
    }

    @Override
    public void a(int i10) {
        int i11;
        ip0 ip0Var = this.f37053b;
        gh.d dVar = ip0Var.f38093g0;
        ArrayList arrayList = ip0Var.f38097k0;
        bh.f fVar = ip0Var.f38092f0;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 31 && fVar != null) {
            ArrayList arrayList2 = ip0Var.f38096j0;
            if (i12 >= 29 && dVar != null) {
                i11 = dVar.d(0, AndroidUtilities.dp(8.0f), arrayList2);
            } else {
                i11 = 0;
            }
            int a2 = zf.f0.a(arrayList2, i11, arrayList);
            int measuredWidth = ip0Var.d.getMeasuredWidth();
            for (int i13 = 0; i13 < a2; i13++) {
                RectF rectF = (RectF) arrayList.get(i13);
                float f7 = measuredWidth;
                rectF.left = w7.r.a(rectF.left, 0.0f, f7);
                rectF.top = Math.max(0.0f, rectF.top);
                rectF.right = w7.r.a(rectF.right, 0.0f, f7);
                rectF.bottom = Math.min(ip0Var.d.getHeight(), rectF.bottom);
            }
            fVar.g(a2, arrayList);
            if (fVar.e(ip0Var.f38095i0, ip0Var.d.getWidth(), ip0Var.d.getHeight())) {
                if (dVar != null) {
                    dVar.e();
                }
                Iterator it = ip0Var.f38089d0.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
            }
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f37052a) {
            case 2:
                this.f37053b.finishFragment();
                return;
            default:
                this.f37053b.y0();
                return;
        }
    }
}
