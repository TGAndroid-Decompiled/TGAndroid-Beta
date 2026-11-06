package org.telegram.ui.Components;

import j$.util.Objects;
import org.telegram.tgnet.TLRPC;
public final class vi {
    public final int f38975a;
    public final long f38976b;

    public vi(int i7, long j3) {
        this.f38975a = i7;
        this.f38976b = j3;
    }

    public static vi a(Object obj) {
        if (obj instanceof org.telegram.messenger.d5) {
            return new vi(2, ((org.telegram.messenger.d5) obj).f21963a);
        }
        if (obj instanceof TLRPC.User) {
            return new vi(1, ((TLRPC.User) obj).f27102id);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && vi.class == obj.getClass()) {
                vi viVar = (vi) obj;
                if (this.f38976b == viVar.f38976b && this.f38975a == viVar.f38975a) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(p1.g.a(this.f38975a), Long.valueOf(this.f38976b));
    }
}
