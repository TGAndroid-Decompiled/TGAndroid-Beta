package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
public final class mm {
    public final ArrayList f28649a = new ArrayList();
    public final HashMap f28650b = new HashMap();
    public int f28651c;
    public int d;
    public int f28652e;
    public float f28653f;
    public final ArrayList f28654g;
    public final tm h;

    public mm(tm tmVar, ArrayList arrayList) {
        this.h = tmVar;
        this.f28654g = arrayList;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.mm.a():void");
    }
}
