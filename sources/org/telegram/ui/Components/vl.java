package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
public final class vl {
    public float f38975a;
    public int f38976b;
    public int f38977c;
    public int d;
    public final Object f38978e;
    public final Object f38979f;
    public Object f38980g;
    public final Object h;

    public vl(Context context, n nVar) {
        this.f38976b = -1;
        this.f38977c = -1;
        this.d = -1;
        this.h = new int[]{Integer.MAX_VALUE, 0};
        this.f38978e = context;
        this.f38979f = nVar;
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
        this.f38978e = new ArrayList();
        this.f38980g = new HashMap();
        this.f38979f = arrayList;
        a();
    }
}
