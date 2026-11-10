package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
public final class ul {
    public float f38704a;
    public int f38705b;
    public int f38706c;
    public int d;
    public final Object f38707e;
    public final Object f38708f;
    public Object f38709g;
    public final Object h;

    public ul(Context context, m mVar) {
        this.f38705b = -1;
        this.f38706c = -1;
        this.d = -1;
        this.h = new int[]{Integer.MAX_VALUE, 0};
        this.f38707e = context;
        this.f38708f = mVar;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ul.a():void");
    }

    public ul(am amVar, ArrayList arrayList) {
        this.h = amVar;
        this.f38707e = new ArrayList();
        this.f38709g = new HashMap();
        this.f38708f = arrayList;
        a();
    }
}
