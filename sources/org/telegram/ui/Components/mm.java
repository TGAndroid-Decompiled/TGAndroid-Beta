package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
public final class mm {
    public final ArrayList f26320a = new ArrayList();
    public final HashMap f26321b = new HashMap();
    public int f26322c;
    public int d;
    public int e;
    public float f26323f;
    public final ArrayList f26324g;
    public final tm h;

    public mm(tm tmVar, ArrayList arrayList) {
        this.h = tmVar;
        this.f26324g = arrayList;
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
