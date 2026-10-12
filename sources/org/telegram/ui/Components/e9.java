package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class e9 extends mm0 {
    public final ArrayList V2;
    public final int W2;
    public int X2;
    public final org.telegram.ui.a8 Y2;
    public d9 Z2;
    public final h9 f24630a3;

    public e9(h9 h9Var, Activity activity) {
        super(activity, null);
        this.f24630a3 = h9Var;
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
            obj.f24320a = i11;
            int[] iArr = h9.f25562c0[i10];
            obj.f24322c = iArr[0];
            obj.d = iArr[1];
            obj.e = iArr[2];
            obj.f24323f = iArr[3];
            this.V2.add(obj);
        }
        for (int i12 = 0; i12 < 30; i12++) {
            ?? obj2 = new Object();
            int i13 = this.W2;
            this.W2 = i13 + 1;
            obj2.f24320a = i13;
            int[] iArr2 = h9.f25563d0[i12];
            obj2.f24322c = iArr2[0];
            obj2.d = iArr2[1];
            obj2.e = 0;
            obj2.f24323f = 0;
            obj2.f24321b = true;
            this.V2.add(obj2);
        }
        setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        setClipToPadding(false);
        this.f27423f1 = true;
        setOnItemClickListener(new j(this, 2));
        org.telegram.ui.a8 a8Var = new org.telegram.ui.a8(this, 2);
        this.Y2 = a8Var;
        setAdapter(a8Var);
        setOverScrollMode(1);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10) / this.Y2.h();
        h9 h9Var = this.f24630a3;
        h9Var.P = size;
        if (size < AndroidUtilities.dp(39.0f)) {
            h9Var.P = AndroidUtilities.dp(39.0f);
        } else if (h9Var.P > AndroidUtilities.dp(150.0f)) {
            h9Var.P = AndroidUtilities.dp(48.0f);
        }
        super.onMeasure(i10, i11);
    }

    public final void x1(d9 d9Var) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.V2;
            if (i10 < arrayList.size()) {
                if (((d9) arrayList.get(i10)).equals(d9Var)) {
                    this.X2 = ((d9) arrayList.get(i10)).f24320a;
                    break;
                }
                i10++;
            } else {
                this.Z2 = d9Var;
                this.X2 = 1;
                break;
            }
        }
        this.Y2.l();
    }
}
