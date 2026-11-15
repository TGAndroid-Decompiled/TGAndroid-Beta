package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
public final class cm {
    public float f33630a;
    public int f33631b;
    public int f33632c;
    public int d;
    public final Object f33633e;
    public final Object f33634f;
    public Object f33635g;
    public final Object h;

    public cm(Context context, org.telegram.messenger.ou ouVar) {
        this.f33631b = -1;
        this.f33632c = -1;
        this.d = -1;
        this.h = new int[]{Integer.MAX_VALUE, 0};
        this.f33633e = context;
        this.f33634f = ouVar;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.cm.a():void");
    }

    public cm(im imVar, ArrayList arrayList) {
        this.h = imVar;
        this.f33633e = new ArrayList();
        this.f33635g = new HashMap();
        this.f33634f = arrayList;
        a();
    }
}
