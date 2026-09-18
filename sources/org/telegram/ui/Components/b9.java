package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class b9 extends wl0 {
    public final ArrayList X2;
    public final int Y2;
    public int Z2;
    public final org.telegram.ui.x7 f22895a3;
    public a9 f22896b3;
    public final e9 f22897c3;

    public b9(e9 e9Var, Activity activity) {
        super(activity, null);
        this.f22897c3 = e9Var;
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
            obj.f22564a = i11;
            int[] iArr = e9.f23809c0[i10];
            obj.f22566c = iArr[0];
            obj.d = iArr[1];
            obj.e = iArr[2];
            obj.f22567f = iArr[3];
            this.X2.add(obj);
        }
        for (int i12 = 0; i12 < 30; i12++) {
            ?? obj2 = new Object();
            int i13 = this.Y2;
            this.Y2 = i13 + 1;
            obj2.f22564a = i13;
            int[] iArr2 = e9.f23810d0[i12];
            obj2.f22566c = iArr2[0];
            obj2.d = iArr2[1];
            obj2.e = 0;
            obj2.f22567f = 0;
            obj2.f22565b = true;
            this.X2.add(obj2);
        }
        setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        setClipToPadding(false);
        this.f30074h1 = true;
        setOnItemClickListener(new j(this, 2));
        org.telegram.ui.x7 x7Var = new org.telegram.ui.x7(this, 2);
        this.f22895a3 = x7Var;
        setAdapter(x7Var);
        setOverScrollMode(1);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10) / this.f22895a3.h();
        e9 e9Var = this.f22897c3;
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
            ArrayList arrayList = this.X2;
            if (i10 < arrayList.size()) {
                if (((a9) arrayList.get(i10)).equals(a9Var)) {
                    this.Z2 = ((a9) arrayList.get(i10)).f22564a;
                    break;
                }
                i10++;
            } else {
                this.f22896b3 = a9Var;
                this.Z2 = 1;
                break;
            }
        }
        this.f22895a3.l();
    }
}
