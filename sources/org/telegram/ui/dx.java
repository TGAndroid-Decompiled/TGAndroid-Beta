package org.telegram.ui;
public final class dx implements org.telegram.messenger.y5 {
    public long f47065a;
    public long f47066b;
    public final String f47067c;
    public final ex d;

    public dx(ex exVar, String str) {
        this.d = exVar;
        this.f47067c = str;
    }

    @Override
    public final int getObserverTag() {
        return 0;
    }

    @Override
    public final void i(long j3, long j10) {
        this.f47066b = j3;
        this.f47065a = j10;
        this.d.b();
    }

    @Override
    public final void C(boolean z10) {
    }

    @Override
    public final void N(String str) {
    }

    @Override
    public final void o(long j3, long j10) {
    }
}
