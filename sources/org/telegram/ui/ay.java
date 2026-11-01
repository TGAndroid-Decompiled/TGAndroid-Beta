package org.telegram.ui;
public final class ay implements org.telegram.messenger.z5 {
    public long f35855a;
    public long f35856b;
    public final String f35857c;
    public final cy d;

    public ay(cy cyVar, String str) {
        this.d = cyVar;
        this.f35857c = str;
    }

    @Override
    public final int getObserverTag() {
        return 0;
    }

    @Override
    public final void i(long j10, long j11) {
        this.f35856b = j10;
        this.f35855a = j11;
        this.d.b();
    }

    @Override
    public final void D(boolean z10) {
    }

    @Override
    public final void N(String str) {
    }

    @Override
    public final void o(long j10, long j11) {
    }
}
