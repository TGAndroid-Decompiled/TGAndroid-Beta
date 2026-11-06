package org.telegram.ui.Components;

import j$.util.Objects;
import org.telegram.tgnet.TLRPC;
public final class vi {
    public final int f38954a;
    public final long f38955b;

    public vi(int i7, long j3) {
        this.f38954a = i7;
        this.f38955b = j3;
    }

    public static vi a(Object obj) {
        if (obj instanceof org.telegram.messenger.d5) {
            return new vi(2, ((org.telegram.messenger.d5) obj).f21956a);
        }
        if (obj instanceof TLRPC.User) {
            return new vi(1, ((TLRPC.User) obj).f27101id);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && vi.class == obj.getClass()) {
                vi viVar = (vi) obj;
                if (this.f38955b == viVar.f38955b && this.f38954a == viVar.f38954a) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(p1.g.a(this.f38954a), Long.valueOf(this.f38955b));
    }
}
