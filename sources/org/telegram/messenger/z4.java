package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
public final class z4 implements Runnable {
    public final int f26788a = 0;
    public final int f26789b;
    public final ArrayList f26790c;
    public final boolean d;
    public final c1 f26791e;
    public final Object f26792f;
    public final Object h;

    public z4(g5 g5Var, int i7, ArrayList arrayList, ArrayList arrayList2, a0.h hVar, boolean z9) {
        this.f26791e = g5Var;
        this.f26789b = i7;
        this.f26790c = arrayList;
        this.f26792f = arrayList2;
        this.h = hVar;
        this.d = z9;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.z4.run():void");
    }

    public z4(gz gzVar, TLObject tLObject, int i7, sy syVar, ArrayList arrayList, boolean z9) {
        this.f26791e = gzVar;
        this.f26792f = tLObject;
        this.f26789b = i7;
        this.h = syVar;
        this.f26790c = arrayList;
        this.d = z9;
    }
}
