package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
public final class vl {
    public float f38978a;
    public int f38979b;
    public int f38980c;
    public int d;
    public final Object f38981e;
    public final Object f38982f;
    public Object f38983g;
    public final Object h;

    public vl(Context context, n nVar) {
        this.f38979b = -1;
        this.f38980c = -1;
        this.d = -1;
        this.h = new int[]{Integer.MAX_VALUE, 0};
        this.f38981e = context;
        this.f38982f = nVar;
    }

    public static float b(int i7, int i10, float[] fArr) {
        float f10 = 0.0f;
        while (i7 < i10) {
            f10 += fArr[i7];
            i7++;
        }
        return 1000.0f / f10;
    }

    public void a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vl.a():void");
    }

    public vl(bm bmVar, ArrayList arrayList) {
        this.h = bmVar;
        this.f38981e = new ArrayList();
        this.f38983g = new HashMap();
        this.f38982f = arrayList;
        a();
    }
}
