package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class y8 extends jl0 {
    public final ArrayList T2;
    public final int U2;
    public int V2;
    public final org.telegram.ui.u7 W2;
    public x8 X2;
    public final b9 Y2;

    public y8(b9 b9Var, Activity activity) {
        super(activity, null);
        this.Y2 = b9Var;
        this.T2 = new ArrayList();
        this.U2 = 200;
        this.V2 = -1;
        f2.j0 j0Var = new f2.j0();
        j0Var.j1(0);
        setLayoutManager(j0Var);
        for (int i10 = 0; i10 < 7; i10++) {
            ?? obj = new Object();
            int i11 = this.U2;
            this.U2 = i11 + 1;
            obj.f34648a = i11;
            int[] iArr = b9.Y[i10];
            obj.f34650c = iArr[0];
            obj.d = iArr[1];
            obj.f34651e = iArr[2];
            obj.f34652f = iArr[3];
            this.T2.add(obj);
        }
        for (int i12 = 0; i12 < 30; i12++) {
            ?? obj2 = new Object();
            int i13 = this.U2;
            this.U2 = i13 + 1;
            obj2.f34648a = i13;
            int[] iArr2 = b9.Z[i12];
            obj2.f34650c = iArr2[0];
            obj2.d = iArr2[1];
            obj2.f34651e = 0;
            obj2.f34652f = 0;
            obj2.f34649b = true;
            this.T2.add(obj2);
        }
        setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        setClipToPadding(false);
        this.f29693d1 = true;
        setOnItemClickListener(new k(this, 2));
        org.telegram.ui.u7 u7Var = new org.telegram.ui.u7(this, 2);
        this.W2 = u7Var;
        setAdapter(u7Var);
        setOverScrollMode(1);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10) / this.W2.h();
        b9 b9Var = this.Y2;
        b9Var.L = size;
        if (size < AndroidUtilities.dp(39.0f)) {
            b9Var.L = AndroidUtilities.dp(39.0f);
        } else if (b9Var.L > AndroidUtilities.dp(150.0f)) {
            b9Var.L = AndroidUtilities.dp(48.0f);
        }
        super.onMeasure(i10, i11);
    }

    public final void w1(x8 x8Var) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.T2;
            if (i10 < arrayList.size()) {
                if (((x8) arrayList.get(i10)).equals(x8Var)) {
                    this.V2 = ((x8) arrayList.get(i10)).f34648a;
                    break;
                }
                i10++;
            } else {
                this.X2 = x8Var;
                this.V2 = 1;
                break;
            }
        }
        this.W2.l();
    }
}
