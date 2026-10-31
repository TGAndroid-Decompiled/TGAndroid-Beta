package org.telegram.ui;
public final class cy implements org.telegram.messenger.z5 {
    public long f36567a;
    public long f36568b;
    public final String f36569c;
    public final dy d;

    public cy(dy dyVar, String str) {
        this.d = dyVar;
        this.f36569c = str;
    }

    @Override
    public final int getObserverTag() {
        return 0;
    }

    @Override
    public final void i(long j10, long j11) {
        this.f36568b = j10;
        this.f36567a = j11;
        this.d.b();
    }

    @Override
    public final void C(boolean z10) {
    }

    @Override
    public final void M(String str) {
    }

    @Override
    public final void n(long j10, long j11) {
    }
}
