package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
public final class sm {
    public final ArrayList f30566a = new ArrayList();
    public final HashMap f30567b = new HashMap();
    public int f30568c;
    public int d;
    public int e;
    public float f30569f;
    public final ArrayList f30570g;
    public final zm h;

    public sm(zm zmVar, ArrayList arrayList) {
        this.h = zmVar;
        this.f30570g = arrayList;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.sm.a():void");
    }
}
