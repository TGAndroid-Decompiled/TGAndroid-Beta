package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class d9 extends wm0 {
    public final ArrayList V2;
    public final int W2;
    public int X2;
    public final org.telegram.ui.y7 Y2;
    public c9 Z2;
    public final g9 f25259a3;

    public d9(g9 g9Var, Activity activity) {
        super(activity, null);
        this.f25259a3 = g9Var;
        this.V2 = new ArrayList();
        this.W2 = 200;
        this.X2 = -1;
        s4.d0 d0Var = new s4.d0();
        d0Var.j1(0);
        setLayoutManager(d0Var);
        for (int i10 = 0; i10 < 7; i10++) {
            ?? obj = new Object();
            int i11 = this.W2;
            this.W2 = i11 + 1;
            obj.f24854a = i11;
            int[] iArr = g9.f26346c0[i10];
            obj.f24856c = iArr[0];
            obj.d = iArr[1];
            obj.f24857e = iArr[2];
            obj.f24858f = iArr[3];
            this.V2.add(obj);
        }
        for (int i12 = 0; i12 < 30; i12++) {
            ?? obj2 = new Object();
            int i13 = this.W2;
            this.W2 = i13 + 1;
            obj2.f24854a = i13;
            int[] iArr2 = g9.f26347d0[i12];
            obj2.f24856c = iArr2[0];
            obj2.d = iArr2[1];
            obj2.f24857e = 0;
            obj2.f24858f = 0;
            obj2.f24855b = true;
            this.V2.add(obj2);
        }
        setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        setClipToPadding(false);
        this.f32451f1 = true;
        setOnItemClickListener(new j(this, 2));
        org.telegram.ui.y7 y7Var = new org.telegram.ui.y7(this, 2);
        this.Y2 = y7Var;
        setAdapter(y7Var);
        setOverScrollMode(1);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10) / this.Y2.h();
        g9 g9Var = this.f25259a3;
        g9Var.P = size;
        if (size < AndroidUtilities.dp(39.0f)) {
            g9Var.P = AndroidUtilities.dp(39.0f);
        } else if (g9Var.P > AndroidUtilities.dp(150.0f)) {
            g9Var.P = AndroidUtilities.dp(48.0f);
        }
        super.onMeasure(i10, i11);
    }

    public final void x1(c9 c9Var) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.V2;
            if (i10 < arrayList.size()) {
                if (((c9) arrayList.get(i10)).equals(c9Var)) {
                    this.X2 = ((c9) arrayList.get(i10)).f24854a;
                    break;
                }
                i10++;
            } else {
                this.Z2 = c9Var;
                this.X2 = 1;
                break;
            }
        }
        this.Y2.l();
    }
}
