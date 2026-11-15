package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
public final class n8 extends uj0 {
    public final ArrayList f37482f3;
    public final int f37483g3;
    public int f37484h3;
    public final org.telegram.ui.y7 f37485i3;
    public m8 j3;
    public final q8 f37486k3;

    public n8(q8 q8Var, Activity activity) {
        super(activity, null);
        this.f37486k3 = q8Var;
        this.f37482f3 = new ArrayList();
        this.f37483g3 = 200;
        this.f37484h3 = -1;
        v4.b0 b0Var = new v4.b0();
        b0Var.j1(0);
        setLayoutManager(b0Var);
        for (int i7 = 0; i7 < 7; i7++) {
            ?? obj = new Object();
            int i10 = this.f37483g3;
            this.f37483g3 = i10 + 1;
            obj.f37161a = i10;
            int[] iArr = q8.f38560d0[i7];
            obj.f37163c = iArr[0];
            obj.d = iArr[1];
            obj.f37164e = iArr[2];
            obj.f37165f = iArr[3];
            this.f37482f3.add(obj);
        }
        for (int i11 = 0; i11 < 30; i11++) {
            ?? obj2 = new Object();
            int i12 = this.f37483g3;
            this.f37483g3 = i12 + 1;
            obj2.f37161a = i12;
            int[] iArr2 = q8.f38561e0[i11];
            obj2.f37163c = iArr2[0];
            obj2.d = iArr2[1];
            obj2.f37164e = 0;
            obj2.f37165f = 0;
            obj2.f37162b = true;
            this.f37482f3.add(obj2);
        }
        setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        setClipToPadding(false);
        this.f40054g1 = true;
        setOnItemClickListener(new j(this, 2));
        org.telegram.ui.y7 y7Var = new org.telegram.ui.y7(this, 2);
        this.f37485i3 = y7Var;
        setAdapter(y7Var);
        setOverScrollMode(1);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7) / this.f37485i3.b();
        q8 q8Var = this.f37486k3;
        q8Var.Q = size;
        if (size < org.telegram.messenger.g0.L(39.0f)) {
            q8Var.Q = org.telegram.messenger.g0.L(39.0f);
        } else if (q8Var.Q > org.telegram.messenger.g0.L(150.0f)) {
            q8Var.Q = org.telegram.messenger.g0.L(48.0f);
        }
        super.onMeasure(i7, i10);
    }

    public final void z1(m8 m8Var) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f37482f3;
            if (i7 < arrayList.size()) {
                if (((m8) arrayList.get(i7)).equals(m8Var)) {
                    this.f37484h3 = ((m8) arrayList.get(i7)).f37161a;
                    break;
                }
                i7++;
            } else {
                this.j3 = m8Var;
                this.f37484h3 = 1;
                break;
            }
        }
        this.f37485i3.f();
    }
}
