package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
public final class lm {
    public float f37237a;
    public int f37238b;
    public int f37239c;
    public int d;
    public final Object f37240e;
    public final Object f37241f;
    public Object f37242g;
    public final Object h;

    public lm(Context context, jn jnVar) {
        this.f37238b = -1;
        this.f37239c = -1;
        this.d = -1;
        this.h = new int[]{Integer.MAX_VALUE, 0};
        this.f37240e = context;
        this.f37241f = jnVar;
    }

    public static float b(int i7, int i10, float[] fArr) {
        float f10 = 0.0f;
        while (i7 < i10) {
            f10 += fArr[i7];
            i7++;
        }
        return 1000.0f / f10;
    }

    public void a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.lm.a():void");
    }

    public lm(rm rmVar, ArrayList arrayList) {
        this.h = rmVar;
        this.f37240e = new ArrayList();
        this.f37242g = new HashMap();
        this.f37241f = arrayList;
        a();
    }
}
