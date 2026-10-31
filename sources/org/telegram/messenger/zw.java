package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.tgnet.TLObject;
public final class zw implements Runnable {
    public final int f19768a;
    public final qz f19769b;
    public final TLObject f19770c;
    public final jj d;
    public final String e;
    public final cz f19771f;
    public final boolean h;
    public final cz f19772n;
    public final Object f19773r;
    public final HashMap f19774s;
    public final boolean f19775w;

    public zw(qz qzVar, TLObject tLObject, jj jjVar, String str, cz czVar, boolean z10, cz czVar2, Object obj, HashMap hashMap, boolean z11, int i10) {
        this.f19768a = i10;
        this.f19769b = qzVar;
        this.f19770c = tLObject;
        this.d = jjVar;
        this.e = str;
        this.f19771f = czVar;
        this.h = z10;
        this.f19772n = czVar2;
        this.f19773r = obj;
        this.f19774s = hashMap;
        this.f19775w = z11;
    }

    @Override
    public final void run() {
        switch (this.f19768a) {
            case 0:
                this.f19769b.O(this.f19770c, this.d, this.e, this.f19771f, this.h, this.f19772n, this.f19773r, this.f19774s, this.f19775w);
                return;
            case 1:
                this.f19769b.O(this.f19770c, this.d, this.e, this.f19771f, this.h, this.f19772n, this.f19773r, this.f19774s, this.f19775w);
                return;
            default:
                this.f19769b.O(this.f19770c, this.d, this.e, this.f19771f, this.h, this.f19772n, this.f19773r, this.f19774s, this.f19775w);
                return;
        }
    }
}
