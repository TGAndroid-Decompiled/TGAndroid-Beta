package org.telegram.ui;

import java.util.concurrent.atomic.AtomicBoolean;
public final class kg0 implements Runnable {
    public final int f49313a;
    public final Object f49314b;
    public final Object f49315c;
    public final Object d;
    public final Object f49316e;

    public kg0(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f49313a = i7;
        this.f49314b = obj;
        this.f49315c = obj2;
        this.d = obj3;
        this.f49316e = obj4;
    }

    private final void a() {
        ab.c0 c0Var = (ab.c0) this.f49314b;
        AtomicBoolean atomicBoolean = (AtomicBoolean) this.f49315c;
        p4.h hVar = (p4.h) this.d;
        AtomicBoolean atomicBoolean2 = (AtomicBoolean) this.f49316e;
        synchronized (c0Var.f908b) {
            try {
                if (!atomicBoolean.get()) {
                    c0Var.k(hVar);
                } else {
                    atomicBoolean2.set(true);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.kg0.run():void");
    }

    public kg0(org.telegram.messenger.gs gsVar, Object obj, Object obj2, String str, int i7) {
        this.f49313a = i7;
        this.f49314b = gsVar;
        this.f49315c = obj;
        this.f49316e = obj2;
        this.d = str;
    }
}
