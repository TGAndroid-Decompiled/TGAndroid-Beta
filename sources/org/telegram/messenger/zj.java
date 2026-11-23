package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
public final class zj implements Runnable {
    public final int f28406a;
    public final mp f28407b;
    public final bg.v f28408c;
    public final ConcurrentHashMap d;
    public final ConcurrentHashMap f28409e;

    public zj(mp mpVar, bg.v vVar, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2, int i7) {
        this.f28406a = i7;
        this.f28407b = mpVar;
        this.f28408c = vVar;
        this.d = concurrentHashMap;
        this.f28409e = concurrentHashMap2;
    }

    @Override
    public final void run() {
        switch (this.f28406a) {
            case 0:
                mp mpVar = this.f28407b;
                int i7 = mpVar.currentAccount;
                bg.v vVar = this.f28408c;
                vVar.b(i7, this.d, this.f28409e, 0);
                g0.g3(new pl(mpVar, vVar, 1));
                return;
            case 1:
                mp mpVar2 = this.f28407b;
                int i10 = mpVar2.currentAccount;
                bg.v vVar2 = this.f28408c;
                vVar2.b(i10, this.d, this.f28409e, 0);
                g0.g3(new pl(mpVar2, vVar2, 2));
                return;
            default:
                mp mpVar3 = this.f28407b;
                tr messagesStorage = mpVar3.getMessagesStorage();
                bg.v vVar3 = this.f28408c;
                ArrayList arrayList = vVar3.f3310a;
                zj zjVar = new zj(mpVar3, vVar3, this.d, this.f28409e, 1);
                messagesStorage.getClass();
                if (arrayList != null && !arrayList.isEmpty()) {
                    messagesStorage.I(new yf(messagesStorage, arrayList, zjVar, 3));
                    return;
                }
                return;
        }
    }
}
