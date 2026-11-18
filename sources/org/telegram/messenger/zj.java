package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
public final class zj implements Runnable {
    public final int f28314a;
    public final mp f28315b;
    public final bg.v f28316c;
    public final ConcurrentHashMap d;
    public final ConcurrentHashMap f28317e;

    public zj(mp mpVar, bg.v vVar, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2, int i7) {
        this.f28314a = i7;
        this.f28315b = mpVar;
        this.f28316c = vVar;
        this.d = concurrentHashMap;
        this.f28317e = concurrentHashMap2;
    }

    @Override
    public final void run() {
        switch (this.f28314a) {
            case 0:
                mp mpVar = this.f28315b;
                int i7 = mpVar.currentAccount;
                bg.v vVar = this.f28316c;
                vVar.b(i7, this.d, this.f28317e, 0);
                g0.g3(new pl(mpVar, vVar, 1));
                return;
            case 1:
                mp mpVar2 = this.f28315b;
                int i10 = mpVar2.currentAccount;
                bg.v vVar2 = this.f28316c;
                vVar2.b(i10, this.d, this.f28317e, 0);
                g0.g3(new pl(mpVar2, vVar2, 2));
                return;
            default:
                mp mpVar3 = this.f28315b;
                tr messagesStorage = mpVar3.getMessagesStorage();
                bg.v vVar3 = this.f28316c;
                ArrayList arrayList = vVar3.f3340a;
                zj zjVar = new zj(mpVar3, vVar3, this.d, this.f28317e, 1);
                messagesStorage.getClass();
                if (arrayList != null && !arrayList.isEmpty()) {
                    messagesStorage.I(new yf(messagesStorage, arrayList, zjVar, 3));
                    return;
                }
                return;
        }
    }
}
