package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
public final class o8 extends tj0 {
    public final ArrayList f36775f3;
    public final int f36776g3;
    public int f36777h3;
    public final org.telegram.ui.y7 i3;
    public n8 f36778j3;
    public final r8 f36779k3;

    public o8(r8 r8Var, Activity activity) {
        super(activity, null);
        this.f36779k3 = r8Var;
        this.f36775f3 = new ArrayList();
        this.f36776g3 = 200;
        this.f36777h3 = -1;
        u4.b0 b0Var = new u4.b0();
        b0Var.j1(0);
        setLayoutManager(b0Var);
        for (int i3 = 0; i3 < 7; i3++) {
            ?? obj = new Object();
            int i10 = this.f36776g3;
            this.f36776g3 = i10 + 1;
            obj.f36411a = i10;
            int[] iArr = r8.f37665d0[i3];
            obj.f36413c = iArr[0];
            obj.d = iArr[1];
            obj.f36414e = iArr[2];
            obj.f36415f = iArr[3];
            this.f36775f3.add(obj);
        }
        for (int i11 = 0; i11 < 30; i11++) {
            ?? obj2 = new Object();
            int i12 = this.f36776g3;
            this.f36776g3 = i12 + 1;
            obj2.f36411a = i12;
            int[] iArr2 = r8.f37666e0[i11];
            obj2.f36413c = iArr2[0];
            obj2.d = iArr2[1];
            obj2.f36414e = 0;
            obj2.f36415f = 0;
            obj2.f36412b = true;
            this.f36775f3.add(obj2);
        }
        setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        setClipToPadding(false);
        this.f38445g1 = true;
        setOnItemClickListener(new k(this, 2));
        org.telegram.ui.y7 y7Var = new org.telegram.ui.y7(this, 2);
        this.i3 = y7Var;
        setAdapter(y7Var);
        setOverScrollMode(1);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int size = View.MeasureSpec.getSize(i3) / this.i3.b();
        r8 r8Var = this.f36779k3;
        r8Var.Q = size;
        if (size < org.telegram.messenger.g0.L(39.0f)) {
            r8Var.Q = org.telegram.messenger.g0.L(39.0f);
        } else if (r8Var.Q > org.telegram.messenger.g0.L(150.0f)) {
            r8Var.Q = org.telegram.messenger.g0.L(48.0f);
        }
        super.onMeasure(i3, i10);
    }

    public final void z1(n8 n8Var) {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.f36775f3;
            if (i3 < arrayList.size()) {
                if (((n8) arrayList.get(i3)).equals(n8Var)) {
                    this.f36777h3 = ((n8) arrayList.get(i3)).f36411a;
                    break;
                }
                i3++;
            } else {
                this.f36778j3 = n8Var;
                this.f36777h3 = 1;
                break;
            }
        }
        this.i3.f();
    }
}
