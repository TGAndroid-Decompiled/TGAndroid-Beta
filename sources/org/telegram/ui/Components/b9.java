package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class b9 extends jm0 {
    public final ArrayList V2;
    public final int W2;
    public int X2;
    public final org.telegram.ui.z7 Y2;
    public a9 Z2;
    public final e9 f24830a3;

    public b9(e9 e9Var, Activity activity) {
        super(activity, null);
        this.f24830a3 = e9Var;
        this.V2 = new ArrayList();
        this.W2 = 200;
        this.X2 = -1;
        s4.b0 b0Var = new s4.b0();
        b0Var.j1(0);
        setLayoutManager(b0Var);
        for (int i10 = 0; i10 < 7; i10++) {
            ?? obj = new Object();
            int i11 = this.W2;
            this.W2 = i11 + 1;
            obj.f24546a = i11;
            int[] iArr = e9.f25840c0[i10];
            obj.f24548c = iArr[0];
            obj.d = iArr[1];
            obj.e = iArr[2];
            obj.f24549f = iArr[3];
            this.V2.add(obj);
        }
        for (int i12 = 0; i12 < 30; i12++) {
            ?? obj2 = new Object();
            int i13 = this.W2;
            this.W2 = i13 + 1;
            obj2.f24546a = i13;
            int[] iArr2 = e9.f25841d0[i12];
            obj2.f24548c = iArr2[0];
            obj2.d = iArr2[1];
            obj2.e = 0;
            obj2.f24549f = 0;
            obj2.f24547b = true;
            this.V2.add(obj2);
        }
        setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        setClipToPadding(false);
        this.f27563f1 = true;
        setOnItemClickListener(new j(this, 2));
        org.telegram.ui.z7 z7Var = new org.telegram.ui.z7(this, 2);
        this.Y2 = z7Var;
        setAdapter(z7Var);
        setOverScrollMode(1);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10) / this.Y2.h();
        e9 e9Var = this.f24830a3;
        e9Var.P = size;
        if (size < AndroidUtilities.dp(39.0f)) {
            e9Var.P = AndroidUtilities.dp(39.0f);
        } else if (e9Var.P > AndroidUtilities.dp(150.0f)) {
            e9Var.P = AndroidUtilities.dp(48.0f);
        }
        super.onMeasure(i10, i11);
    }

    public final void x1(a9 a9Var) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.V2;
            if (i10 < arrayList.size()) {
                if (((a9) arrayList.get(i10)).equals(a9Var)) {
                    this.X2 = ((a9) arrayList.get(i10)).f24546a;
                    break;
                }
                i10++;
            } else {
                this.Z2 = a9Var;
                this.X2 = 1;
                break;
            }
        }
        this.Y2.l();
    }
}
