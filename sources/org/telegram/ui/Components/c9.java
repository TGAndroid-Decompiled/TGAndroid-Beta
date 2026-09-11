package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class c9 extends ll0 {
    public final ArrayList X2;
    public final int Y2;
    public int Z2;
    public final org.telegram.ui.w7 f24923a3;
    public b9 f24924b3;
    public final f9 f24925c3;

    public c9(f9 f9Var, Activity activity) {
        super(activity, null);
        this.f24925c3 = f9Var;
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
            obj.f24599a = i11;
            int[] iArr = f9.f25962c0[i10];
            obj.f24601c = iArr[0];
            obj.d = iArr[1];
            obj.f24602e = iArr[2];
            obj.f24603f = iArr[3];
            this.X2.add(obj);
        }
        for (int i12 = 0; i12 < 30; i12++) {
            ?? obj2 = new Object();
            int i13 = this.Y2;
            this.Y2 = i13 + 1;
            obj2.f24599a = i13;
            int[] iArr2 = f9.f25963d0[i12];
            obj2.f24601c = iArr2[0];
            obj2.d = iArr2[1];
            obj2.f24602e = 0;
            obj2.f24603f = 0;
            obj2.f24600b = true;
            this.X2.add(obj2);
        }
        setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        setClipToPadding(false);
        this.f28208h1 = true;
        setOnItemClickListener(new k(this, 2));
        org.telegram.ui.w7 w7Var = new org.telegram.ui.w7(this, 2);
        this.f24923a3 = w7Var;
        setAdapter(w7Var);
        setOverScrollMode(1);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10) / this.f24923a3.h();
        f9 f9Var = this.f24925c3;
        f9Var.P = size;
        if (size < AndroidUtilities.dp(39.0f)) {
            f9Var.P = AndroidUtilities.dp(39.0f);
        } else if (f9Var.P > AndroidUtilities.dp(150.0f)) {
            f9Var.P = AndroidUtilities.dp(48.0f);
        }
        super.onMeasure(i10, i11);
    }

    public final void v1(b9 b9Var) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.X2;
            if (i10 < arrayList.size()) {
                if (((b9) arrayList.get(i10)).equals(b9Var)) {
                    this.Z2 = ((b9) arrayList.get(i10)).f24599a;
                    break;
                }
                i10++;
            } else {
                this.f24924b3 = b9Var;
                this.Z2 = 1;
                break;
            }
        }
        this.f24923a3.l();
    }
}
