package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
public final class v8 extends ek0 {
    public final ArrayList f40717f3;
    public final int f40718g3;
    public int f40719h3;
    public final org.telegram.ui.y7 f40720i3;
    public u8 j3;
    public final y8 f40721k3;

    public v8(y8 y8Var, Activity activity) {
        super(activity, null);
        this.f40721k3 = y8Var;
        this.f40717f3 = new ArrayList();
        this.f40718g3 = 200;
        this.f40719h3 = -1;
        v4.c0 c0Var = new v4.c0();
        c0Var.j1(0);
        setLayoutManager(c0Var);
        for (int i7 = 0; i7 < 7; i7++) {
            ?? obj = new Object();
            int i10 = this.f40718g3;
            this.f40718g3 = i10 + 1;
            obj.f40297a = i10;
            int[] iArr = y8.f42348d0[i7];
            obj.f40299c = iArr[0];
            obj.d = iArr[1];
            obj.f40300e = iArr[2];
            obj.f40301f = iArr[3];
            this.f40717f3.add(obj);
        }
        for (int i11 = 0; i11 < 30; i11++) {
            ?? obj2 = new Object();
            int i12 = this.f40718g3;
            this.f40718g3 = i12 + 1;
            obj2.f40297a = i12;
            int[] iArr2 = y8.f42349e0[i11];
            obj2.f40299c = iArr2[0];
            obj2.d = iArr2[1];
            obj2.f40300e = 0;
            obj2.f40301f = 0;
            obj2.f40298b = true;
            this.f40717f3.add(obj2);
        }
        setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        setClipToPadding(false);
        this.f34860g1 = true;
        setOnItemClickListener(new o(this, 2));
        org.telegram.ui.y7 y7Var = new org.telegram.ui.y7(this, 2);
        this.f40720i3 = y7Var;
        setAdapter(y7Var);
        setOverScrollMode(1);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7) / this.f40720i3.b();
        y8 y8Var = this.f40721k3;
        y8Var.Q = size;
        if (size < org.telegram.messenger.g0.L(39.0f)) {
            y8Var.Q = org.telegram.messenger.g0.L(39.0f);
        } else if (y8Var.Q > org.telegram.messenger.g0.L(150.0f)) {
            y8Var.Q = org.telegram.messenger.g0.L(48.0f);
        }
        super.onMeasure(i7, i10);
    }

    public final void z1(u8 u8Var) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f40717f3;
            if (i7 < arrayList.size()) {
                if (((u8) arrayList.get(i7)).equals(u8Var)) {
                    this.f40719h3 = ((u8) arrayList.get(i7)).f40297a;
                    break;
                }
                i7++;
            } else {
                this.j3 = u8Var;
                this.f40719h3 = 1;
                break;
            }
        }
        this.f40720i3.f();
    }
}
