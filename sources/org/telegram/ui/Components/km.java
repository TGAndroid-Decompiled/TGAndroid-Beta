package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
public final class km {
    public final ArrayList f25814a = new ArrayList();
    public final HashMap f25815b = new HashMap();
    public int f25816c;
    public int d;
    public int e;
    public float f25817f;
    public final ArrayList f25818g;
    public final rm h;

    public km(rm rmVar, ArrayList arrayList) {
        this.h = rmVar;
        this.f25818g = arrayList;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.km.a():void");
    }
}
