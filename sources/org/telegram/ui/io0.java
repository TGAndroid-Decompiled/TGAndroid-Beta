package org.telegram.ui;

import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
public final class io0 implements zf.a0, r0.n, org.telegram.ui.ActionBar.z1 {
    public final int f38348a;
    public final kp0 f38349b;

    public io0(kp0 kp0Var, int i10) {
        this.f38348a = i10;
        this.f38349b = kp0Var;
    }

    @Override
    public r0.k1 B0(View view, r0.k1 k1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        kp0 kp0Var = this.f38349b;
        kp0Var.f39001b0 = defaultWindowInsets;
        vo0 vo0Var = kp0Var.h.f36966b;
        int i10 = defaultWindowInsets.f12315a;
        int paddingTop = vo0Var.getPaddingTop();
        i0.b bVar = kp0Var.f39001b0;
        vo0Var.setPadding(i10, paddingTop, bVar.f12317c, AndroidUtilities.dp(72.0f) + bVar.d);
        vo0 vo0Var2 = kp0Var.f39013n.f36966b;
        int i11 = kp0Var.f39001b0.f12315a;
        int paddingTop2 = vo0Var2.getPaddingTop();
        i0.b bVar2 = kp0Var.f39001b0;
        vo0Var2.setPadding(i11, paddingTop2, bVar2.f12317c, AndroidUtilities.dp(72.0f) + bVar2.d);
        FrameLayout frameLayout = kp0Var.P;
        i0.b bVar3 = kp0Var.f39001b0;
        frameLayout.setPadding(bVar3.f12315a, 0, bVar3.f12317c, bVar3.d);
        return r0.k1.f45249b;
    }

    @Override
    public void a(int i10) {
        int i11;
        kp0 kp0Var = this.f38349b;
        gh.d dVar = kp0Var.f39008g0;
        ArrayList arrayList = kp0Var.f39012k0;
        bh.f fVar = kp0Var.f39007f0;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 31 && fVar != null) {
            ArrayList arrayList2 = kp0Var.f39011j0;
            if (i12 >= 29 && dVar != null) {
                i11 = dVar.e(0, AndroidUtilities.dp(8.0f), arrayList2);
            } else {
                i11 = 0;
            }
            int a2 = zf.f0.a(arrayList2, i11, arrayList);
            int measuredWidth = kp0Var.d.getMeasuredWidth();
            for (int i13 = 0; i13 < a2; i13++) {
                RectF rectF = (RectF) arrayList.get(i13);
                float f7 = measuredWidth;
                rectF.left = w7.r.a(rectF.left, 0.0f, f7);
                rectF.top = Math.max(0.0f, rectF.top);
                rectF.right = w7.r.a(rectF.right, 0.0f, f7);
                rectF.bottom = Math.min(kp0Var.d.getHeight(), rectF.bottom);
            }
            fVar.g(a2, arrayList);
            if (fVar.e(kp0Var.f39010i0, kp0Var.d.getWidth(), kp0Var.d.getHeight())) {
                if (dVar != null) {
                    dVar.f();
                }
                Iterator it = kp0Var.f39004d0.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
            }
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f38348a) {
            case 2:
                this.f38349b.finishFragment();
                return;
            default:
                this.f38349b.y0();
                return;
        }
    }
}
