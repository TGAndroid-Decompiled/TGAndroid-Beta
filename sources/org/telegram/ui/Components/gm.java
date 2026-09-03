package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
public final class gm {
    public final ArrayList f25196a = new ArrayList();
    public final HashMap f25197b = new HashMap();
    public int f25198c;
    public int d;
    public int e;
    public float f25199f;
    public final ArrayList f25200g;
    public final nm h;

    public gm(nm nmVar, ArrayList arrayList) {
        this.h = nmVar;
        this.f25200g = arrayList;
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
