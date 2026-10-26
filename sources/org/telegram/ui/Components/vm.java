package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
public final class vm {
    public final ArrayList f33684a = new ArrayList();
    public final HashMap f33685b = new HashMap();
    public int f33686c;
    public int d;
    public int e;
    public float f33687f;
    public final ArrayList f33688g;
    public final cn h;

    public vm(cn cnVar, ArrayList arrayList) {
        this.h = cnVar;
        this.f33688g = arrayList;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vm.a():void");
    }
}
