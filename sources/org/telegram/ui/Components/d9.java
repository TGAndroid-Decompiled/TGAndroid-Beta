package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class d9 extends mm0 {
    public final ArrayList f27433f3;
    public final int f27434g3;
    public int f27435h3;
    public final org.telegram.ui.c8 f27436i3;
    public c9 f27437j3;
    public final g9 f27438k3;

    public d9(g9 g9Var, Activity activity) {
        super(activity, null);
        this.f27438k3 = g9Var;
        this.f27433f3 = new ArrayList();
        this.f27434g3 = 200;
        this.f27435h3 = -1;
        s4.c0 c0Var = new s4.c0();
        c0Var.k1(0);
        setLayoutManager(c0Var);
        for (int i10 = 0; i10 < 7; i10++) {
            ?? obj = new Object();
            int i11 = this.f27434g3;
            this.f27434g3 = i11 + 1;
            obj.f27093a = i11;
            int[] iArr = g9.f28487c0[i10];
            obj.f27095c = iArr[0];
            obj.d = iArr[1];
            obj.e = iArr[2];
            obj.f27096f = iArr[3];
            this.f27433f3.add(obj);
        }
        for (int i12 = 0; i12 < 30; i12++) {
            ?? obj2 = new Object();
            int i13 = this.f27434g3;
            this.f27434g3 = i13 + 1;
            obj2.f27093a = i13;
            int[] iArr2 = g9.f28488d0[i12];
            obj2.f27095c = iArr2[0];
            obj2.d = iArr2[1];
            obj2.e = 0;
            obj2.f27096f = 0;
            obj2.f27094b = true;
            this.f27433f3.add(obj2);
        }
        setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        setClipToPadding(false);
        this.f30630f1 = true;
        setOnItemClickListener(new j(this, 2));
        org.telegram.ui.c8 c8Var = new org.telegram.ui.c8(this, 2);
        this.f27436i3 = c8Var;
        setAdapter(c8Var);
        setOverScrollMode(1);
    }

    public final void C1(c9 c9Var) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f27433f3;
            if (i10 < arrayList.size()) {
                if (((c9) arrayList.get(i10)).equals(c9Var)) {
                    this.f27435h3 = ((c9) arrayList.get(i10)).f27093a;
                    break;
                }
                i10++;
            } else {
                this.f27437j3 = c9Var;
                this.f27435h3 = 1;
                break;
            }
        }
        this.f27436i3.l();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10) / this.f27436i3.h();
        g9 g9Var = this.f27438k3;
        g9Var.P = size;
        if (size < AndroidUtilities.dp(39.0f)) {
            g9Var.P = AndroidUtilities.dp(39.0f);
        } else if (g9Var.P > AndroidUtilities.dp(150.0f)) {
            g9Var.P = AndroidUtilities.dp(48.0f);
        }
        super.onMeasure(i10, i11);
    }
}
