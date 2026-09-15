package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class z8 extends ll0 {
    public final ArrayList X2;
    public final int Y2;
    public int Z2;
    public final org.telegram.ui.w7 f30497a3;
    public y8 f30498b3;
    public final c9 f30499c3;

    public z8(c9 c9Var, Activity activity) {
        super(activity, null);
        this.f30499c3 = c9Var;
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
            obj.f30173a = i11;
            int[] iArr = c9.f22979c0[i10];
            obj.f30175c = iArr[0];
            obj.d = iArr[1];
            obj.e = iArr[2];
            obj.f30176f = iArr[3];
            this.X2.add(obj);
        }
        for (int i12 = 0; i12 < 30; i12++) {
            ?? obj2 = new Object();
            int i13 = this.Y2;
            this.Y2 = i13 + 1;
            obj2.f30173a = i13;
            int[] iArr2 = c9.f22980d0[i12];
            obj2.f30175c = iArr2[0];
            obj2.d = iArr2[1];
            obj2.e = 0;
            obj2.f30176f = 0;
            obj2.f30174b = true;
            this.X2.add(obj2);
        }
        setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        setClipToPadding(false);
        this.f25950h1 = true;
        setOnItemClickListener(new j(this, 2));
        org.telegram.ui.w7 w7Var = new org.telegram.ui.w7(this, 2);
        this.f30497a3 = w7Var;
        setAdapter(w7Var);
        setOverScrollMode(1);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10) / this.f30497a3.h();
        c9 c9Var = this.f30499c3;
        c9Var.P = size;
        if (size < AndroidUtilities.dp(39.0f)) {
            c9Var.P = AndroidUtilities.dp(39.0f);
        } else if (c9Var.P > AndroidUtilities.dp(150.0f)) {
            c9Var.P = AndroidUtilities.dp(48.0f);
        }
        super.onMeasure(i10, i11);
    }

    public final void w1(y8 y8Var) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.X2;
            if (i10 < arrayList.size()) {
                if (((y8) arrayList.get(i10)).equals(y8Var)) {
                    this.Z2 = ((y8) arrayList.get(i10)).f30173a;
                    break;
                }
                i10++;
            } else {
                this.f30498b3 = y8Var;
                this.Z2 = 1;
                break;
            }
        }
        this.f30497a3.l();
    }
}
