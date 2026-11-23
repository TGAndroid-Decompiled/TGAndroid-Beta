package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
public final class u8 extends ek0 {
    public final ArrayList f40302f3;
    public final int f40303g3;
    public int f40304h3;
    public final org.telegram.ui.z7 f40305i3;
    public t8 j3;
    public final x8 f40306k3;

    public u8(x8 x8Var, Activity activity) {
        super(activity, null);
        this.f40306k3 = x8Var;
        this.f40302f3 = new ArrayList();
        this.f40303g3 = 200;
        this.f40304h3 = -1;
        v4.c0 c0Var = new v4.c0();
        c0Var.j1(0);
        setLayoutManager(c0Var);
        for (int i7 = 0; i7 < 7; i7++) {
            ?? obj = new Object();
            int i10 = this.f40303g3;
            this.f40303g3 = i10 + 1;
            obj.f39854a = i10;
            int[] iArr = x8.f41916d0[i7];
            obj.f39856c = iArr[0];
            obj.d = iArr[1];
            obj.f39857e = iArr[2];
            obj.f39858f = iArr[3];
            this.f40302f3.add(obj);
        }
        for (int i11 = 0; i11 < 30; i11++) {
            ?? obj2 = new Object();
            int i12 = this.f40303g3;
            this.f40303g3 = i12 + 1;
            obj2.f39854a = i12;
            int[] iArr2 = x8.f41917e0[i11];
            obj2.f39856c = iArr2[0];
            obj2.d = iArr2[1];
            obj2.f39857e = 0;
            obj2.f39858f = 0;
            obj2.f39855b = true;
            this.f40302f3.add(obj2);
        }
        setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        setClipToPadding(false);
        this.f34752g1 = true;
        setOnItemClickListener(new n(this, 2));
        org.telegram.ui.z7 z7Var = new org.telegram.ui.z7(this, 2);
        this.f40305i3 = z7Var;
        setAdapter(z7Var);
        setOverScrollMode(1);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7) / this.f40305i3.b();
        x8 x8Var = this.f40306k3;
        x8Var.Q = size;
        if (size < org.telegram.messenger.g0.L(39.0f)) {
            x8Var.Q = org.telegram.messenger.g0.L(39.0f);
        } else if (x8Var.Q > org.telegram.messenger.g0.L(150.0f)) {
            x8Var.Q = org.telegram.messenger.g0.L(48.0f);
        }
        super.onMeasure(i7, i10);
    }

    public final void z1(t8 t8Var) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f40302f3;
            if (i7 < arrayList.size()) {
                if (((t8) arrayList.get(i7)).equals(t8Var)) {
                    this.f40304h3 = ((t8) arrayList.get(i7)).f39854a;
                    break;
                }
                i7++;
            } else {
                this.j3 = t8Var;
                this.f40304h3 = 1;
                break;
            }
        }
        this.f40305i3.f();
    }
}
