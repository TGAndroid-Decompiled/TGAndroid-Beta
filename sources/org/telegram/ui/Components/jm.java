package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
public final class jm {
    public final ArrayList f25400a = new ArrayList();
    public final HashMap f25401b = new HashMap();
    public int f25402c;
    public int d;
    public int e;
    public float f25403f;
    public final ArrayList f25404g;
    public final qm h;

    public jm(qm qmVar, ArrayList arrayList) {
        this.h = qmVar;
        this.f25404g = arrayList;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.jm.a():void");
    }
}
