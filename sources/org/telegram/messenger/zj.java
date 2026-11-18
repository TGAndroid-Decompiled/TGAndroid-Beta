package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
public final class zj implements Runnable {
    public final int f28316a;
    public final mp f28317b;
    public final bg.v f28318c;
    public final ConcurrentHashMap d;
    public final ConcurrentHashMap f28319e;

    public zj(mp mpVar, bg.v vVar, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2, int i7) {
        this.f28316a = i7;
        this.f28317b = mpVar;
        this.f28318c = vVar;
        this.d = concurrentHashMap;
        this.f28319e = concurrentHashMap2;
    }

    @Override
    public final void run() {
        switch (this.f28316a) {
            case 0:
                mp mpVar = this.f28317b;
                int i7 = mpVar.currentAccount;
                bg.v vVar = this.f28318c;
                vVar.b(i7, this.d, this.f28319e, 0);
                g0.g3(new pl(mpVar, vVar, 1));
                return;
            case 1:
                mp mpVar2 = this.f28317b;
                int i10 = mpVar2.currentAccount;
                bg.v vVar2 = this.f28318c;
                vVar2.b(i10, this.d, this.f28319e, 0);
                g0.g3(new pl(mpVar2, vVar2, 2));
                return;
            default:
                mp mpVar3 = this.f28317b;
                tr messagesStorage = mpVar3.getMessagesStorage();
                bg.v vVar3 = this.f28318c;
                ArrayList arrayList = vVar3.f3339a;
                zj zjVar = new zj(mpVar3, vVar3, this.d, this.f28319e, 1);
                messagesStorage.getClass();
                if (arrayList != null && !arrayList.isEmpty()) {
                    messagesStorage.I(new yf(messagesStorage, arrayList, zjVar, 3));
                    return;
                }
                return;
        }
    }
}
