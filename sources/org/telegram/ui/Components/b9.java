package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class b9 extends zl0 {
    public final ArrayList f24862e3;
    public final int f24863f3;
    public int f24864g3;
    public final org.telegram.ui.z7 f24865h3;
    public a9 f24866i3;
    public final e9 j3;

    public b9(e9 e9Var, Activity activity) {
        super(activity, null);
        this.j3 = e9Var;
        this.f24862e3 = new ArrayList();
        this.f24863f3 = 200;
        this.f24864g3 = -1;
        s4.c0 c0Var = new s4.c0();
        c0Var.j1(0);
        setLayoutManager(c0Var);
        for (int i10 = 0; i10 < 7; i10++) {
            ?? obj = new Object();
            int i11 = this.f24863f3;
            this.f24863f3 = i11 + 1;
            obj.f24479a = i11;
            int[] iArr = e9.f26000c0[i10];
            obj.f24481c = iArr[0];
            obj.d = iArr[1];
            obj.f24482e = iArr[2];
            obj.f24483f = iArr[3];
            this.f24862e3.add(obj);
        }
        for (int i12 = 0; i12 < 30; i12++) {
            ?? obj2 = new Object();
            int i13 = this.f24863f3;
            this.f24863f3 = i13 + 1;
            obj2.f24479a = i13;
            int[] iArr2 = e9.f26001d0[i12];
            obj2.f24481c = iArr2[0];
            obj2.d = iArr2[1];
            obj2.f24482e = 0;
            obj2.f24483f = 0;
            obj2.f24480b = true;
            this.f24862e3.add(obj2);
        }
        setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        setClipToPadding(false);
        this.f33529h1 = true;
        setOnItemClickListener(new j(this, 2));
        org.telegram.ui.z7 z7Var = new org.telegram.ui.z7(this, 2);
        this.f24865h3 = z7Var;
        setAdapter(z7Var);
        setOverScrollMode(1);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10) / this.f24865h3.h();
        e9 e9Var = this.j3;
        e9Var.P = size;
        if (size < AndroidUtilities.dp(39.0f)) {
            e9Var.P = AndroidUtilities.dp(39.0f);
        } else if (e9Var.P > AndroidUtilities.dp(150.0f)) {
            e9Var.P = AndroidUtilities.dp(48.0f);
        }
        super.onMeasure(i10, i11);
    }

    public final void y1(a9 a9Var) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f24862e3;
            if (i10 < arrayList.size()) {
                if (((a9) arrayList.get(i10)).equals(a9Var)) {
                    this.f24864g3 = ((a9) arrayList.get(i10)).f24479a;
                    break;
                }
                i10++;
            } else {
                this.f24866i3 = a9Var;
                this.f24864g3 = 1;
                break;
            }
        }
        this.f24865h3.l();
    }
}
