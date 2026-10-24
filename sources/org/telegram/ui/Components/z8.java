package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class z8 extends lm0 {
    public final ArrayList Y2;
    public final int Z2;
    public int f33169a3;
    public final org.telegram.ui.z7 f33170b3;
    public y8 f33171c3;
    public final c9 f33172d3;

    public z8(c9 c9Var, Activity activity) {
        super(activity, null);
        this.f33172d3 = c9Var;
        this.Y2 = new ArrayList();
        this.Z2 = 200;
        this.f33169a3 = -1;
        s4.b0 b0Var = new s4.b0();
        b0Var.j1(0);
        setLayoutManager(b0Var);
        for (int i10 = 0; i10 < 7; i10++) {
            ?? obj = new Object();
            int i11 = this.Z2;
            this.Z2 = i11 + 1;
            obj.f32840a = i11;
            int[] iArr = c9.f25254c0[i10];
            obj.f32842c = iArr[0];
            obj.d = iArr[1];
            obj.e = iArr[2];
            obj.f32843f = iArr[3];
            this.Y2.add(obj);
        }
        for (int i12 = 0; i12 < 30; i12++) {
            ?? obj2 = new Object();
            int i13 = this.Z2;
            this.Z2 = i13 + 1;
            obj2.f32840a = i13;
            int[] iArr2 = c9.f25255d0[i12];
            obj2.f32842c = iArr2[0];
            obj2.d = iArr2[1];
            obj2.e = 0;
            obj2.f32843f = 0;
            obj2.f32841b = true;
            this.Y2.add(obj2);
        }
        setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        setClipToPadding(false);
        this.f28380f1 = true;
        setOnItemClickListener(new j(this, 2));
        org.telegram.ui.z7 z7Var = new org.telegram.ui.z7(this, 2);
        this.f33170b3 = z7Var;
        setAdapter(z7Var);
        setOverScrollMode(1);
    }

    public final void C1(y8 y8Var) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.Y2;
            if (i10 < arrayList.size()) {
                if (((y8) arrayList.get(i10)).equals(y8Var)) {
                    this.f33169a3 = ((y8) arrayList.get(i10)).f32840a;
                    break;
                }
                i10++;
            } else {
                this.f33171c3 = y8Var;
                this.f33169a3 = 1;
                break;
            }
        }
        this.f33170b3.l();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10) / this.f33170b3.h();
        c9 c9Var = this.f33172d3;
        c9Var.P = size;
        if (size < AndroidUtilities.dp(39.0f)) {
            c9Var.P = AndroidUtilities.dp(39.0f);
        } else if (c9Var.P > AndroidUtilities.dp(150.0f)) {
            c9Var.P = AndroidUtilities.dp(48.0f);
        }
        super.onMeasure(i10, i11);
    }
}
