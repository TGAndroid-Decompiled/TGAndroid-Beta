package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
public final class jm {
    public float f36456a;
    public int f36457b;
    public int f36458c;
    public int d;
    public final Object f36459e;
    public final Object f36460f;
    public Object f36461g;
    public final Object h;

    public jm(Context context, org.telegram.ui.Cells.aa aaVar) {
        this.f36457b = -1;
        this.f36458c = -1;
        this.d = -1;
        this.h = new int[]{Integer.MAX_VALUE, 0};
        this.f36459e = context;
        this.f36460f = aaVar;
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
        this.f36459e = new ArrayList();
        this.f36461g = new HashMap();
        this.f36460f = arrayList;
        a();
    }
}
