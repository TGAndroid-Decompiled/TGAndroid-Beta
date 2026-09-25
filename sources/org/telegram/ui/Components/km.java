package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
public final class km {
    public final ArrayList f25815a = new ArrayList();
    public final HashMap f25816b = new HashMap();
    public int f25817c;
    public int d;
    public int e;
    public float f25818f;
    public final ArrayList f25819g;
    public final rm h;

    public km(rm rmVar, ArrayList arrayList) {
        this.h = rmVar;
        this.f25819g = arrayList;
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
