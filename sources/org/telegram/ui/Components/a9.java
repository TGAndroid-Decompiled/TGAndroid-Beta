package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class a9 extends vl0 {
    public final ArrayList X2;
    public final int Y2;
    public int Z2;
    public final org.telegram.ui.w7 f21437a3;
    public z8 f21438b3;
    public final d9 f21439c3;

    public a9(d9 d9Var, Activity activity) {
        super(activity, null);
        this.f21439c3 = d9Var;
        this.X2 = new ArrayList();
        this.Y2 = 200;
        this.Z2 = -1;
        s4.c0 c0Var = new s4.c0();
        c0Var.j1(0);
        setLayoutManager(c0Var);
        for (int i10 = 0; i10 < 7; i10++) {
            ?? obj = new Object();
            int i11 = this.Y2;
            this.Y2 = i11 + 1;
            obj.f29613a = i11;
            int[] iArr = d9.f22323c0[i10];
            obj.f29615c = iArr[0];
            obj.d = iArr[1];
            obj.e = iArr[2];
            obj.f29616f = iArr[3];
            this.X2.add(obj);
        }
        for (int i12 = 0; i12 < 30; i12++) {
            ?? obj2 = new Object();
            int i13 = this.Y2;
            this.Y2 = i13 + 1;
            obj2.f29613a = i13;
            int[] iArr2 = d9.f22324d0[i12];
            obj2.f29615c = iArr2[0];
            obj2.d = iArr2[1];
            obj2.e = 0;
            obj2.f29616f = 0;
            obj2.f29614b = true;
            this.X2.add(obj2);
        }
        setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        setClipToPadding(false);
        this.f27971h1 = true;
        setOnItemClickListener(new k(this, 2));
        org.telegram.ui.w7 w7Var = new org.telegram.ui.w7(this, 2);
        this.f21437a3 = w7Var;
        setAdapter(w7Var);
        setOverScrollMode(1);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10) / this.f21437a3.h();
        d9 d9Var = this.f21439c3;
        d9Var.P = size;
        if (size < AndroidUtilities.dp(39.0f)) {
            d9Var.P = AndroidUtilities.dp(39.0f);
        } else if (d9Var.P > AndroidUtilities.dp(150.0f)) {
            d9Var.P = AndroidUtilities.dp(48.0f);
        }
        super.onMeasure(i10, i11);
    }

    public final void v1(z8 z8Var) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.X2;
            if (i10 < arrayList.size()) {
                if (((z8) arrayList.get(i10)).equals(z8Var)) {
                    this.Z2 = ((z8) arrayList.get(i10)).f29613a;
                    break;
                }
                i10++;
            } else {
                this.f21438b3 = z8Var;
                this.Z2 = 1;
                break;
            }
        }
        this.f21437a3.l();
    }
}
