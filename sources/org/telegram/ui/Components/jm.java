package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
public final class jm {
    public float f36486a;
    public int f36487b;
    public int f36488c;
    public int d;
    public final Object f36489e;
    public final Object f36490f;
    public Object f36491g;
    public final Object h;

    public jm(Context context, hn hnVar) {
        this.f36487b = -1;
        this.f36488c = -1;
        this.d = -1;
        this.h = new int[]{Integer.MAX_VALUE, 0};
        this.f36489e = context;
        this.f36490f = hnVar;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.jm.a():void");
    }

    public jm(pm pmVar, ArrayList arrayList) {
        this.h = pmVar;
        this.f36489e = new ArrayList();
        this.f36491g = new HashMap();
        this.f36490f = arrayList;
        a();
    }
}
