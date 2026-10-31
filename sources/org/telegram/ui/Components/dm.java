package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
public final class dm {
    public float f25463a;
    public int f25464b;
    public int f25465c;
    public int d;
    public final Object e;
    public final Object f25466f;
    public Object f25467g;
    public final Object h;

    public dm(Context context, m2.t tVar) {
        this.f25464b = -1;
        this.f25465c = -1;
        this.d = -1;
        this.h = new int[]{Integer.MAX_VALUE, 0};
        this.e = context;
        this.f25466f = tVar;
    }

    public static float b(int i10, int i11, float[] fArr) {
        float f7 = 0.0f;
        while (i10 < i11) {
            f7 += fArr[i10];
            i10++;
        }
        return 1000.0f / f7;
    }

    public void a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.dm.a():void");
    }

    public dm(jm jmVar, ArrayList arrayList) {
        this.h = jmVar;
        this.e = new ArrayList();
        this.f25467g = new HashMap();
        this.f25466f = arrayList;
        a();
    }
}
