package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
public final class z4 implements Runnable {
    public final int f26733a = 0;
    public final int f26734b;
    public final ArrayList f26735c;
    public final boolean d;
    public final c1 f26736e;
    public final Object f26737f;
    public final Object h;

    public z4(g5 g5Var, int i3, ArrayList arrayList, ArrayList arrayList2, a0.h hVar, boolean z10) {
        this.f26736e = g5Var;
        this.f26734b = i3;
        this.f26735c = arrayList;
        this.f26737f = arrayList2;
        this.h = hVar;
        this.d = z10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.z4.run():void");
    }

    public z4(yy yyVar, TLObject tLObject, int i3, ky kyVar, ArrayList arrayList, boolean z10) {
        this.f26736e = yyVar;
        this.f26737f = tLObject;
        this.f26734b = i3;
        this.h = kyVar;
        this.f26735c = arrayList;
        this.d = z10;
    }
}
