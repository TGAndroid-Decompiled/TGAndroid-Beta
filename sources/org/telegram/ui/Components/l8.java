package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
public final class l8 extends tk0 {
    public final ArrayList f28029e3;
    public final int f28030f3;
    public int f28031g3;
    public final org.telegram.ui.x7 f28032h3;
    public k8 f28033i3;
    public final o8 f28034j3;

    public l8(o8 o8Var, Activity activity) {
        super(activity, null);
        this.f28034j3 = o8Var;
        this.f28029e3 = new ArrayList();
        this.f28030f3 = 200;
        this.f28031g3 = -1;
        s4.a0 a0Var = new s4.a0();
        a0Var.j1(0);
        setLayoutManager(a0Var);
        for (int i10 = 0; i10 < 7; i10++) {
            ?? obj = new Object();
            int i11 = this.f28030f3;
            this.f28030f3 = i11 + 1;
            obj.f27674a = i11;
            int[] iArr = o8.f28985c0[i10];
            obj.f27676c = iArr[0];
            obj.d = iArr[1];
            obj.e = iArr[2];
            obj.f27677f = iArr[3];
            this.f28029e3.add(obj);
        }
        for (int i12 = 0; i12 < 30; i12++) {
            ?? obj2 = new Object();
            int i13 = this.f28030f3;
            this.f28030f3 = i13 + 1;
            obj2.f27674a = i13;
            int[] iArr2 = o8.f28986d0[i12];
            obj2.f27676c = iArr2[0];
            obj2.d = iArr2[1];
            obj2.e = 0;
            obj2.f27677f = 0;
            obj2.f27675b = true;
            this.f28029e3.add(obj2);
        }
        setPadding(org.telegram.messenger.i0.L(4.0f), 0, org.telegram.messenger.i0.L(4.0f), 0);
        setClipToPadding(false);
        this.f30609f1 = true;
        setOnItemClickListener(new k(this, 2));
        org.telegram.ui.x7 x7Var = new org.telegram.ui.x7(this, 2);
        this.f28032h3 = x7Var;
        setAdapter(x7Var);
        setOverScrollMode(1);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10) / this.f28032h3.b();
        o8 o8Var = this.f28034j3;
        o8Var.P = size;
        if (size < org.telegram.messenger.i0.L(39.0f)) {
            o8Var.P = org.telegram.messenger.i0.L(39.0f);
        } else if (o8Var.P > org.telegram.messenger.i0.L(150.0f)) {
            o8Var.P = org.telegram.messenger.i0.L(48.0f);
        }
        super.onMeasure(i10, i11);
    }

    public final void z1(k8 k8Var) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f28029e3;
            if (i10 < arrayList.size()) {
                if (((k8) arrayList.get(i10)).equals(k8Var)) {
                    this.f28031g3 = ((k8) arrayList.get(i10)).f27674a;
                    break;
                }
                i10++;
            } else {
                this.f28033i3 = k8Var;
                this.f28031g3 = 1;
                break;
            }
        }
        this.f28032h3.f();
    }
}
