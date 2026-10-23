package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class b9 extends mm0 {
    public final ArrayList Y2;
    public final int Z2;
    public int f24996a3;
    public final org.telegram.ui.z7 f24997b3;
    public a9 f24998c3;
    public final e9 f24999d3;

    public b9(e9 e9Var, Activity activity) {
        super(activity, null);
        this.f24999d3 = e9Var;
        this.Y2 = new ArrayList();
        this.Z2 = 200;
        this.f24996a3 = -1;
        s4.b0 b0Var = new s4.b0();
        b0Var.j1(0);
        setLayoutManager(b0Var);
        for (int i10 = 0; i10 < 7; i10++) {
            ?? obj = new Object();
            int i11 = this.Z2;
            this.Z2 = i11 + 1;
            obj.f24661a = i11;
            int[] iArr = e9.f25923c0[i10];
            obj.f24663c = iArr[0];
            obj.d = iArr[1];
            obj.e = iArr[2];
            obj.f24664f = iArr[3];
            this.Y2.add(obj);
        }
        for (int i12 = 0; i12 < 30; i12++) {
            ?? obj2 = new Object();
            int i13 = this.Z2;
            this.Z2 = i13 + 1;
            obj2.f24661a = i13;
            int[] iArr2 = e9.f25924d0[i12];
            obj2.f24663c = iArr2[0];
            obj2.d = iArr2[1];
            obj2.e = 0;
            obj2.f24664f = 0;
            obj2.f24662b = true;
            this.Y2.add(obj2);
        }
        setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        setClipToPadding(false);
        this.f28689f1 = true;
        setOnItemClickListener(new j(this, 2));
        org.telegram.ui.z7 z7Var = new org.telegram.ui.z7(this, 2);
        this.f24997b3 = z7Var;
        setAdapter(z7Var);
        setOverScrollMode(1);
    }

    public final void C1(a9 a9Var) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.Y2;
            if (i10 < arrayList.size()) {
                if (((a9) arrayList.get(i10)).equals(a9Var)) {
                    this.f24996a3 = ((a9) arrayList.get(i10)).f24661a;
                    break;
                }
                i10++;
            } else {
                this.f24998c3 = a9Var;
                this.f24996a3 = 1;
                break;
            }
        }
        this.f24997b3.l();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10) / this.f24997b3.h();
        e9 e9Var = this.f24999d3;
        e9Var.P = size;
        if (size < AndroidUtilities.dp(39.0f)) {
            e9Var.P = AndroidUtilities.dp(39.0f);
        } else if (e9Var.P > AndroidUtilities.dp(150.0f)) {
            e9Var.P = AndroidUtilities.dp(48.0f);
        }
        super.onMeasure(i10, i11);
    }
}
