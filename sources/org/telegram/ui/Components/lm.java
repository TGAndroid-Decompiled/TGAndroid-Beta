package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
public final class lm {
    public final ArrayList f26106a = new ArrayList();
    public final HashMap f26107b = new HashMap();
    public int f26108c;
    public int d;
    public int e;
    public float f26109f;
    public final ArrayList f26110g;
    public final sm h;

    public lm(sm smVar, ArrayList arrayList) {
        this.h = smVar;
        this.f26110g = arrayList;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.lm.a():void");
    }
}
