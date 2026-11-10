package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
public final class p8 extends pj0 {
    public final ArrayList f36833e3;
    public final int f36834f3;
    public int f36835g3;
    public final org.telegram.ui.x7 f36836h3;
    public o8 f36837i3;
    public final s8 j3;

    public p8(s8 s8Var, Activity activity) {
        super(activity, null);
        this.j3 = s8Var;
        this.f36833e3 = new ArrayList();
        this.f36834f3 = 200;
        this.f36835g3 = -1;
        v4.b0 b0Var = new v4.b0();
        b0Var.j1(0);
        setLayoutManager(b0Var);
        for (int i7 = 0; i7 < 7; i7++) {
            ?? obj = new Object();
            int i10 = this.f36834f3;
            this.f36834f3 = i10 + 1;
            obj.f36533a = i10;
            int[] iArr = s8.f37885c0[i7];
            obj.f36535c = iArr[0];
            obj.d = iArr[1];
            obj.f36536e = iArr[2];
            obj.f36537f = iArr[3];
            this.f36833e3.add(obj);
        }
        for (int i11 = 0; i11 < 30; i11++) {
            ?? obj2 = new Object();
            int i12 = this.f36834f3;
            this.f36834f3 = i12 + 1;
            obj2.f36533a = i12;
            int[] iArr2 = s8.f37886d0[i11];
            obj2.f36535c = iArr2[0];
            obj2.d = iArr2[1];
            obj2.f36536e = 0;
            obj2.f36537f = 0;
            obj2.f36534b = true;
            this.f36833e3.add(obj2);
        }
        setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        setClipToPadding(false);
        this.f36965f1 = true;
        setOnItemClickListener(new j(this, 2));
        org.telegram.ui.x7 x7Var = new org.telegram.ui.x7(this, 2);
        this.f36836h3 = x7Var;
        setAdapter(x7Var);
        setOverScrollMode(1);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7) / this.f36836h3.b();
        s8 s8Var = this.j3;
        s8Var.P = size;
        if (size < org.telegram.messenger.g0.L(39.0f)) {
            s8Var.P = org.telegram.messenger.g0.L(39.0f);
        } else if (s8Var.P > org.telegram.messenger.g0.L(150.0f)) {
            s8Var.P = org.telegram.messenger.g0.L(48.0f);
        }
        super.onMeasure(i7, i10);
    }

    public final void z1(o8 o8Var) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f36833e3;
            if (i7 < arrayList.size()) {
                if (((o8) arrayList.get(i7)).equals(o8Var)) {
                    this.f36835g3 = ((o8) arrayList.get(i7)).f36533a;
                    break;
                }
                i7++;
            } else {
                this.f36837i3 = o8Var;
                this.f36835g3 = 1;
                break;
            }
        }
        this.f36836h3.f();
    }
}
