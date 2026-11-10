package org.telegram.ui;
public final class ax implements org.telegram.messenger.x5 {
    public long f43834a;
    public long f43835b;
    public final String f43836c;
    public final bx d;

    public ax(bx bxVar, String str) {
        this.d = bxVar;
        this.f43836c = str;
    }

    @Override
    public final int getObserverTag() {
        return 0;
    }

    @Override
    public final void i(long j3, long j10) {
        this.f43835b = j3;
        this.f43834a = j10;
        this.d.b();
    }

    @Override
    public final void C(boolean z9) {
    }

    @Override
    public final void M(String str) {
    }

    @Override
    public final void o(long j3, long j10) {
    }
}
