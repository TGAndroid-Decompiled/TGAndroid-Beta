package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class t8 extends tl0 {
    public final ArrayList U2;
    public final int V2;
    public int W2;
    public final org.telegram.ui.y7 X2;
    public s8 Y2;
    public final w8 Z2;

    public t8(w8 w8Var, Activity activity) {
        super(activity, null);
        this.Z2 = w8Var;
        this.U2 = new ArrayList();
        this.V2 = 200;
        this.W2 = -1;
        f2.j0 j0Var = new f2.j0();
        j0Var.j1(0);
        setLayoutManager(j0Var);
        for (int i10 = 0; i10 < 7; i10++) {
            ?? obj = new Object();
            int i11 = this.V2;
            this.V2 = i11 + 1;
            obj.f31004a = i11;
            int[] iArr = w8.Z[i10];
            obj.f31006c = iArr[0];
            obj.d = iArr[1];
            obj.f31007e = iArr[2];
            obj.f31008f = iArr[3];
            this.U2.add(obj);
        }
        for (int i12 = 0; i12 < 30; i12++) {
            ?? obj2 = new Object();
            int i13 = this.V2;
            this.V2 = i13 + 1;
            obj2.f31004a = i13;
            int[] iArr2 = w8.f32669a0[i12];
            obj2.f31006c = iArr2[0];
            obj2.d = iArr2[1];
            obj2.f31007e = 0;
            obj2.f31008f = 0;
            obj2.f31005b = true;
            this.U2.add(obj2);
        }
        setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        setClipToPadding(false);
        this.f31367e1 = true;
        setOnItemClickListener(new k(this, 2));
        org.telegram.ui.y7 y7Var = new org.telegram.ui.y7(this, 2);
        this.X2 = y7Var;
        setAdapter(y7Var);
        setOverScrollMode(1);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10) / this.X2.h();
        w8 w8Var = this.Z2;
        w8Var.M = size;
        if (size < AndroidUtilities.dp(39.0f)) {
            w8Var.M = AndroidUtilities.dp(39.0f);
        } else if (w8Var.M > AndroidUtilities.dp(150.0f)) {
            w8Var.M = AndroidUtilities.dp(48.0f);
        }
        super.onMeasure(i10, i11);
    }

    public final void w1(s8 s8Var) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.U2;
            if (i10 < arrayList.size()) {
                if (((s8) arrayList.get(i10)).equals(s8Var)) {
                    this.W2 = ((s8) arrayList.get(i10)).f31004a;
                    break;
                }
                i10++;
            } else {
                this.Y2 = s8Var;
                this.W2 = 1;
                break;
            }
        }
        this.X2.l();
    }
}
