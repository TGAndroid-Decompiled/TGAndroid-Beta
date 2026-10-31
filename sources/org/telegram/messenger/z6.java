package org.telegram.messenger;
public final class z6 {
    public final int f19484a;
    public final long f19485b;

    public z6(long j10, int i10, long j11) {
        this.f19484a = i10;
        this.f19485b = j11;
    }

    public final int hashCode() {
        long j10 = this.f19485b;
        return (int) (j10 ^ (j10 >>> 32));
    }
}
