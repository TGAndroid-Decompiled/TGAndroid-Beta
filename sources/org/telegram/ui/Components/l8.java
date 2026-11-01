package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
public final class l8 extends uk0 {
    public final ArrayList f28075e3;
    public final int f28076f3;
    public int f28077g3;
    public final org.telegram.ui.x7 f28078h3;
    public k8 f28079i3;
    public final o8 f28080j3;

    public l8(o8 o8Var, Activity activity) {
        super(activity, null);
        this.f28080j3 = o8Var;
        this.f28075e3 = new ArrayList();
        this.f28076f3 = 200;
        this.f28077g3 = -1;
        s4.a0 a0Var = new s4.a0();
        a0Var.j1(0);
        setLayoutManager(a0Var);
        for (int i10 = 0; i10 < 7; i10++) {
            ?? obj = new Object();
            int i11 = this.f28076f3;
            this.f28076f3 = i11 + 1;
            obj.f27768a = i11;
            int[] iArr = o8.f29042c0[i10];
            obj.f27770c = iArr[0];
            obj.d = iArr[1];
            obj.e = iArr[2];
            obj.f27771f = iArr[3];
            this.f28075e3.add(obj);
        }
        for (int i12 = 0; i12 < 30; i12++) {
            ?? obj2 = new Object();
            int i13 = this.f28076f3;
            this.f28076f3 = i13 + 1;
            obj2.f27768a = i13;
            int[] iArr2 = o8.f29043d0[i12];
            obj2.f27770c = iArr2[0];
            obj2.d = iArr2[1];
            obj2.e = 0;
            obj2.f27771f = 0;
            obj2.f27769b = true;
            this.f28075e3.add(obj2);
        }
        setPadding(org.telegram.messenger.i0.L(4.0f), 0, org.telegram.messenger.i0.L(4.0f), 0);
        setClipToPadding(false);
        this.f30992f1 = true;
        setOnItemClickListener(new k(this, 2));
        org.telegram.ui.x7 x7Var = new org.telegram.ui.x7(this, 2);
        this.f28078h3 = x7Var;
        setAdapter(x7Var);
        setOverScrollMode(1);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10) / this.f28078h3.b();
        o8 o8Var = this.f28080j3;
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
            ArrayList arrayList = this.f28075e3;
            if (i10 < arrayList.size()) {
                if (((k8) arrayList.get(i10)).equals(k8Var)) {
                    this.f28077g3 = ((k8) arrayList.get(i10)).f27768a;
                    break;
                }
                i10++;
            } else {
                this.f28079i3 = k8Var;
                this.f28077g3 = 1;
                break;
            }
        }
        this.f28078h3.f();
    }
}
