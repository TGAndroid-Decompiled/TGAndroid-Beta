package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
public final class ul {
    public float f38814a;
    public int f38815b;
    public int f38816c;
    public int d;
    public final Object f38817e;
    public final Object f38818f;
    public Object f38819g;
    public final Object h;

    public ul(Context context, i9 i9Var) {
        this.f38815b = -1;
        this.f38816c = -1;
        this.d = -1;
        this.h = new int[]{Integer.MAX_VALUE, 0};
        this.f38817e = context;
        this.f38818f = i9Var;
    }

    public static float b(int i3, int i10, float[] fArr) {
        float f10 = 0.0f;
        while (i3 < i10) {
            f10 += fArr[i3];
            i3++;
        }
        return 1000.0f / f10;
    }

    public void a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ul.a():void");
    }

    public ul(am amVar, ArrayList arrayList) {
        this.h = amVar;
        this.f38817e = new ArrayList();
        this.f38819g = new HashMap();
        this.f38818f = arrayList;
        a();
    }
}
