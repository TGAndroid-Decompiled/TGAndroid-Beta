package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
public final class dm {
    public float f25512a;
    public int f25513b;
    public int f25514c;
    public int d;
    public final Object e;
    public final Object f25515f;
    public Object f25516g;
    public final Object h;

    public dm(Context context, m2.t tVar) {
        this.f25513b = -1;
        this.f25514c = -1;
        this.d = -1;
        this.h = new int[]{Integer.MAX_VALUE, 0};
        this.e = context;
        this.f25515f = tVar;
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
        this.f25516g = new HashMap();
        this.f25515f = arrayList;
        a();
    }
}
