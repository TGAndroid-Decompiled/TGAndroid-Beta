package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
public final class hm {
    public final ArrayList f27560a = new ArrayList();
    public final HashMap f27561b = new HashMap();
    public int f27562c;
    public int d;
    public int f27563e;
    public float f27564f;
    public final ArrayList f27565g;
    public final pm h;

    public hm(pm pmVar, ArrayList arrayList) {
        this.h = pmVar;
        this.f27565g = arrayList;
        a();
    }

    public static float b(float[] fArr, int i10, int i11) {
        float f10 = 0.0f;
        while (i10 < i11) {
            f10 += fArr[i10];
            i10++;
        }
        return 1000.0f / f10;
    }

    public final void a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.hm.a():void");
    }
}
