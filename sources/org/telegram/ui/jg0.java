package org.telegram.ui;

import java.util.concurrent.atomic.AtomicBoolean;
public final class jg0 implements Runnable {
    public final int f48977a;
    public final Object f48978b;
    public final Object f48979c;
    public final Object d;
    public final Object f48980e;

    public jg0(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f48977a = i7;
        this.f48978b = obj;
        this.f48979c = obj2;
        this.d = obj3;
        this.f48980e = obj4;
    }

    private final void a() {
        ab.c0 c0Var = (ab.c0) this.f48978b;
        AtomicBoolean atomicBoolean = (AtomicBoolean) this.f48979c;
        p4.h hVar = (p4.h) this.d;
        AtomicBoolean atomicBoolean2 = (AtomicBoolean) this.f48980e;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jg0.run():void");
    }

    public jg0(org.telegram.messenger.fs fsVar, Object obj, Object obj2, String str, int i7) {
        this.f48977a = i7;
        this.f48978b = fsVar;
        this.f48979c = obj;
        this.f48980e = obj2;
        this.d = str;
    }
}
