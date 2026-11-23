package org.telegram.ui.Components;

import j$.util.Objects;
import org.telegram.tgnet.TLRPC;
public final class kj {
    public final int f36755a;
    public final long f36756b;

    public kj(int i7, long j3) {
        this.f36755a = i7;
        this.f36756b = j3;
    }

    public static kj a(Object obj) {
        if (obj instanceof org.telegram.messenger.f5) {
            return new kj(2, ((org.telegram.messenger.f5) obj).f23948a);
        }
        if (obj instanceof TLRPC.User) {
            return new kj(1, ((TLRPC.User) obj).f28641id);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && kj.class == obj.getClass()) {
                kj kjVar = (kj) obj;
                if (this.f36756b == kjVar.f36756b && this.f36755a == kjVar.f36755a) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(p1.g.a(this.f36755a), Long.valueOf(this.f36756b));
    }
}
