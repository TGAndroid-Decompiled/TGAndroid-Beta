package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

public final class s8 extends zk0 {
    public final ArrayList T2;
    public final int U2;
    public int V2;
    public final org.telegram.ui.w7 W2;
    public r8 X2;
    public final v8 Y2;

    public s8(v8 v8Var, Activity activity) {
        super(activity, null);
        this.Y2 = v8Var;
        this.T2 = new ArrayList();
        this.U2 = 200;
        this.V2 = -1;
        f2.k0 k0Var = new f2.k0();
        k0Var.j1(0);
        setLayoutManager(k0Var);
        for (int i10 = 0; i10 < 7; i10++) {
            r8 r8Var = new r8();
            int i11 = this.U2;
            this.U2 = i11 + 1;
            r8Var.f32099a = i11;
            int[] iArr = v8.Y[i10];
            r8Var.f32101c = iArr[0];
            r8Var.d = iArr[1];
            r8Var.f32102e = iArr[2];
            r8Var.f32103f = iArr[3];
            this.T2.add(r8Var);
        }
        for (int i12 = 0; i12 < 30; i12++) {
            r8 r8Var2 = new r8();
            int i13 = this.U2;
            this.U2 = i13 + 1;
            r8Var2.f32099a = i13;
            int[] iArr2 = v8.Z[i12];
            r8Var2.f32101c = iArr2[0];
            r8Var2.d = iArr2[1];
            r8Var2.f32102e = 0;
            r8Var2.f32103f = 0;
            r8Var2.f32100b = true;
            this.T2.add(r8Var2);
        }
        setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        setClipToPadding(false);
        this.f35261d1 = true;
        int i14 = 2;
        setOnItemClickListener(new j(this, i14));
        org.telegram.ui.w7 w7Var = new org.telegram.ui.w7(this, i14);
        this.W2 = w7Var;
        setAdapter(w7Var);
        setOverScrollMode(1);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10) / this.W2.h();
        v8 v8Var = this.Y2;
        v8Var.L = size;
        if (size < AndroidUtilities.dp(39.0f)) {
            v8Var.L = AndroidUtilities.dp(39.0f);
        } else if (v8Var.L > AndroidUtilities.dp(150.0f)) {
            v8Var.L = AndroidUtilities.dp(48.0f);
        }
        super.onMeasure(i10, i11);
    }

    public final void w1(r8 r8Var) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.T2;
            if (i10 >= arrayList.size()) {
                this.X2 = r8Var;
                this.V2 = 1;
                break;
            } else {
                if (((r8) arrayList.get(i10)).equals(r8Var)) {
                    this.V2 = ((r8) arrayList.get(i10)).f32099a;
                    break;
                }
                i10++;
            }
        }
        this.W2.l();
    }
}
