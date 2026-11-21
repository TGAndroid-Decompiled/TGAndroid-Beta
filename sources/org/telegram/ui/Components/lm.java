package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
public final class lm {
    public float f37232a;
    public int f37233b;
    public int f37234c;
    public int d;
    public final Object f37235e;
    public final Object f37236f;
    public Object f37237g;
    public final Object h;

    public lm(Context context, jn jnVar) {
        this.f37233b = -1;
        this.f37234c = -1;
        this.d = -1;
        this.h = new int[]{Integer.MAX_VALUE, 0};
        this.f37235e = context;
        this.f37236f = jnVar;
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
        this.f37235e = new ArrayList();
        this.f37237g = new HashMap();
        this.f37236f = arrayList;
        a();
    }
}
