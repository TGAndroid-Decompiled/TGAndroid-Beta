package org.telegram.ui.Components;

import j$.util.Objects;
import org.telegram.tgnet.TLRPC;
public final class cj {
    public final int f33612a;
    public final long f33613b;

    public cj(int i7, long j3) {
        this.f33612a = i7;
        this.f33613b = j3;
    }

    public static cj a(Object obj) {
        if (obj instanceof org.telegram.messenger.d5) {
            return new cj(2, ((org.telegram.messenger.d5) obj).f23031a);
        }
        if (obj instanceof TLRPC.User) {
            return new cj(1, ((TLRPC.User) obj).f28200id);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && cj.class == obj.getClass()) {
                cj cjVar = (cj) obj;
                if (this.f33613b == cjVar.f33613b && this.f33612a == cjVar.f33612a) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(p1.g.a(this.f33612a), Long.valueOf(this.f33613b));
    }
}
