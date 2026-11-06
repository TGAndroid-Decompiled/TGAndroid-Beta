package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
public final class vl {
    public float f38996a;
    public int f38997b;
    public int f38998c;
    public int d;
    public final Object f38999e;
    public final Object f39000f;
    public Object f39001g;
    public final Object h;

    public vl(Context context, n nVar) {
        this.f38997b = -1;
        this.f38998c = -1;
        this.d = -1;
        this.h = new int[]{Integer.MAX_VALUE, 0};
        this.f38999e = context;
        this.f39000f = nVar;
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
        this.f38999e = new ArrayList();
        this.f39001g = new HashMap();
        this.f39000f = arrayList;
        a();
    }
}
