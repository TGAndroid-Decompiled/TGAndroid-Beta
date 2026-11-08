package org.telegram.ui.Components;

import j$.util.Objects;
import org.telegram.tgnet.TLRPC;
public final class vi {
    public final int f39010a;
    public final long f39011b;

    public vi(int i7, long j3) {
        this.f39010a = i7;
        this.f39011b = j3;
    }

    public static vi a(Object obj) {
        if (obj instanceof org.telegram.messenger.d5) {
            return new vi(2, ((org.telegram.messenger.d5) obj).f21986a);
        }
        if (obj instanceof TLRPC.User) {
            return new vi(1, ((TLRPC.User) obj).f27105id);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && vi.class == obj.getClass()) {
                vi viVar = (vi) obj;
                if (this.f39011b == viVar.f39011b && this.f39010a == viVar.f39010a) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(p1.g.a(this.f39010a), Long.valueOf(this.f39011b));
    }
}
