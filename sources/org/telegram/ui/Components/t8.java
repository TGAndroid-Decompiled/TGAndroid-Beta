package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class t8 extends wk0 {
    public final ArrayList T2;
    public final int U2;
    public int V2;
    public final org.telegram.ui.v7 W2;
    public s8 X2;
    public final w8 Y2;

    public t8(w8 w8Var, Activity activity) {
        super(activity, null);
        this.Y2 = w8Var;
        this.T2 = new ArrayList();
        this.U2 = 200;
        this.V2 = -1;
        f2.m0 m0Var = new f2.m0();
        m0Var.j1(0);
        setLayoutManager(m0Var);
        for (int i9 = 0; i9 < 7; i9++) {
            ?? obj = new Object();
            int i10 = this.U2;
            this.U2 = i10 + 1;
            obj.f32391a = i10;
            int[] iArr = w8.Y[i9];
            obj.f32393c = iArr[0];
            obj.d = iArr[1];
            obj.f32394e = iArr[2];
            obj.f32395f = iArr[3];
            this.T2.add(obj);
        }
        for (int i11 = 0; i11 < 30; i11++) {
            ?? obj2 = new Object();
            int i12 = this.U2;
            this.U2 = i12 + 1;
            obj2.f32391a = i12;
            int[] iArr2 = w8.Z[i11];
            obj2.f32393c = iArr2[0];
            obj2.d = iArr2[1];
            obj2.f32394e = 0;
            obj2.f32395f = 0;
            obj2.f32392b = true;
            this.T2.add(obj2);
        }
        setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        setClipToPadding(false);
        this.f34244d1 = true;
        setOnItemClickListener(new j(this, 2));
        org.telegram.ui.v7 v7Var = new org.telegram.ui.v7(this, 2);
        this.W2 = v7Var;
        setAdapter(v7Var);
        setOverScrollMode(1);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int size = View.MeasureSpec.getSize(i9) / this.W2.h();
        w8 w8Var = this.Y2;
        w8Var.L = size;
        if (size < AndroidUtilities.dp(39.0f)) {
            w8Var.L = AndroidUtilities.dp(39.0f);
        } else if (w8Var.L > AndroidUtilities.dp(150.0f)) {
            w8Var.L = AndroidUtilities.dp(48.0f);
        }
        super.onMeasure(i9, i10);
    }

    public final void w1(s8 s8Var) {
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.T2;
            if (i9 < arrayList.size()) {
                if (((s8) arrayList.get(i9)).equals(s8Var)) {
                    this.V2 = ((s8) arrayList.get(i9)).f32391a;
                    break;
                }
                i9++;
            } else {
                this.X2 = s8Var;
                this.V2 = 1;
                break;
            }
        }
        this.W2.l();
    }
}
