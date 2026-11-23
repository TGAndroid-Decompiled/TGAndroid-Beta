package org.telegram.ui;
public final class cx implements org.telegram.messenger.y5 {
    public long f46891a;
    public long f46892b;
    public final String f46893c;
    public final dx d;

    public cx(dx dxVar, String str) {
        this.d = dxVar;
        this.f46893c = str;
    }

    @Override
    public final int getObserverTag() {
        return 0;
    }

    @Override
    public final void i(long j3, long j10) {
        this.f46892b = j3;
        this.f46891a = j10;
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
