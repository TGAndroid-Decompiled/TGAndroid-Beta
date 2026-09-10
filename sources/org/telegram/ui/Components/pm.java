package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
public final class pm {
    public final ArrayList f26208a = new ArrayList();
    public final HashMap f26209b = new HashMap();
    public int f26210c;
    public int d;
    public int e;
    public float f26211f;
    public final ArrayList f26212g;
    public final xm h;

    public pm(xm xmVar, ArrayList arrayList) {
        this.h = xmVar;
        this.f26212g = arrayList;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.pm.a():void");
    }
}
