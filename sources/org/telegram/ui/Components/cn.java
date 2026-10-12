package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
public final class cn {
    public final ArrayList f24973a = new ArrayList();
    public final HashMap f24974b = new HashMap();
    public int f24975c;
    public int d;
    public int f24976e;
    public float f24977f;
    public final ArrayList f24978g;
    public final jn h;

    public cn(jn jnVar, ArrayList arrayList) {
        this.h = jnVar;
        this.f24978g = arrayList;
        a();
    }

    public static float b(float[] fArr, int i10, int i11) {
        float f7 = 0.0f;
        while (i10 < i11) {
            f7 += fArr[i10];
            i10++;
        }
        return 1000.0f / f7;
    }

    public final void a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.cn.a():void");
    }
}
