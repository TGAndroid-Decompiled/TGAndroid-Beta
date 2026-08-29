package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
public final class em {
    public final ArrayList f28107a = new ArrayList();
    public final HashMap f28108b = new HashMap();
    public int f28109c;
    public int d;
    public int f28110e;
    public float f28111f;
    public final ArrayList f28112g;
    public final lm h;

    public em(lm lmVar, ArrayList arrayList) {
        this.h = lmVar;
        this.f28112g = arrayList;
        a();
    }

    public static float b(float[] fArr, int i10, int i11) {
        float f9 = 0.0f;
        while (i10 < i11) {
            f9 += fArr[i10];
            i10++;
        }
        return 1000.0f / f9;
    }

    public final void a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.em.a():void");
    }
}
