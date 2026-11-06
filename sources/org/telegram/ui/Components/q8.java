package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
public final class q8 extends pj0 {
    public final ArrayList f37304e3;
    public final int f37305f3;
    public int f37306g3;
    public final org.telegram.ui.x7 f37307h3;
    public p8 f37308i3;
    public final t8 j3;

    public q8(t8 t8Var, Activity activity) {
        super(activity, null);
        this.j3 = t8Var;
        this.f37304e3 = new ArrayList();
        this.f37305f3 = 200;
        this.f37306g3 = -1;
        v4.b0 b0Var = new v4.b0();
        b0Var.j1(0);
        setLayoutManager(b0Var);
        for (int i7 = 0; i7 < 7; i7++) {
            ?? obj = new Object();
            int i10 = this.f37305f3;
            this.f37305f3 = i10 + 1;
            obj.f36916a = i10;
            int[] iArr = t8.f38282c0[i7];
            obj.f36918c = iArr[0];
            obj.d = iArr[1];
            obj.f36919e = iArr[2];
            obj.f36920f = iArr[3];
            this.f37304e3.add(obj);
        }
        for (int i11 = 0; i11 < 30; i11++) {
            ?? obj2 = new Object();
            int i12 = this.f37305f3;
            this.f37305f3 = i12 + 1;
            obj2.f36916a = i12;
            int[] iArr2 = t8.f38283d0[i11];
            obj2.f36918c = iArr2[0];
            obj2.d = iArr2[1];
            obj2.f36919e = 0;
            obj2.f36920f = 0;
            obj2.f36917b = true;
            this.f37304e3.add(obj2);
        }
        setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        setClipToPadding(false);
        this.f37045f1 = true;
        setOnItemClickListener(new k(this, 2));
        org.telegram.ui.x7 x7Var = new org.telegram.ui.x7(this, 2);
        this.f37307h3 = x7Var;
        setAdapter(x7Var);
        setOverScrollMode(1);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7) / this.f37307h3.b();
        t8 t8Var = this.j3;
        t8Var.P = size;
        if (size < org.telegram.messenger.g0.L(39.0f)) {
            t8Var.P = org.telegram.messenger.g0.L(39.0f);
        } else if (t8Var.P > org.telegram.messenger.g0.L(150.0f)) {
            t8Var.P = org.telegram.messenger.g0.L(48.0f);
        }
        super.onMeasure(i7, i10);
    }

    public final void z1(p8 p8Var) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f37304e3;
            if (i7 < arrayList.size()) {
                if (((p8) arrayList.get(i7)).equals(p8Var)) {
                    this.f37306g3 = ((p8) arrayList.get(i7)).f36916a;
                    break;
                }
                i7++;
            } else {
                this.f37308i3 = p8Var;
                this.f37306g3 = 1;
                break;
            }
        }
        this.f37307h3.f();
    }
}
