package org.telegram.ui.Components;

import j$.util.Objects;
import org.telegram.tgnet.TLRPC;
public final class lj {
    public final int f37153a;
    public final long f37154b;

    public lj(int i7, long j3) {
        this.f37153a = i7;
        this.f37154b = j3;
    }

    public static lj a(Object obj) {
        if (obj instanceof org.telegram.messenger.f5) {
            return new lj(2, ((org.telegram.messenger.f5) obj).f23824a);
        }
        if (obj instanceof TLRPC.User) {
            return new lj(1, ((TLRPC.User) obj).f28547id);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && lj.class == obj.getClass()) {
                lj ljVar = (lj) obj;
                if (this.f37154b == ljVar.f37154b && this.f37153a == ljVar.f37153a) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(p1.g.a(this.f37153a), Long.valueOf(this.f37154b));
    }
}
