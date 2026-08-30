package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
public final class gm {
    public final ArrayList f25193a = new ArrayList();
    public final HashMap f25194b = new HashMap();
    public int f25195c;
    public int d;
    public int e;
    public float f25196f;
    public final ArrayList f25197g;
    public final om h;

    public gm(om omVar, ArrayList arrayList) {
        this.h = omVar;
        this.f25197g = arrayList;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.gm.a():void");
    }
}
