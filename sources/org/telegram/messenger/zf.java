package org.telegram.messenger;
public final class zf implements Runnable {
    public final int f26802a;
    public final li f26803b;
    public final long f26804c;
    public final long d;
    public final int[] f26805e;

    public zf(li liVar, long j10, long j11, int[] iArr, int i3) {
        this.f26802a = i3;
        this.f26803b = liVar;
        this.f26804c = j10;
        this.d = j11;
        this.f26805e = iArr;
    }

    @Override
    public final void run() {
        int i3 = this.f26802a;
        int[] iArr = this.f26805e;
        long j10 = this.d;
        long j11 = this.f26804c;
        li liVar = this.f26803b;
        switch (i3) {
            case 0:
                liVar.getNotificationCenter().k(34, Long.valueOf(j11), Long.valueOf(j10), iArr);
                return;
            case 1:
                liVar.getNotificationCenter().k(34, Long.valueOf(j11), Long.valueOf(j10), iArr);
                return;
            default:
                liVar.getNotificationCenter().k(34, Long.valueOf(j11), Long.valueOf(j10), iArr);
                return;
        }
    }
}
