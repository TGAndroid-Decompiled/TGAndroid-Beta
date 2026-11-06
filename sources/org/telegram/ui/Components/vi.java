package org.telegram.ui.Components;

import j$.util.Objects;
import org.telegram.tgnet.TLRPC;
public final class vi {
    public final int f38957a;
    public final long f38958b;

    public vi(int i7, long j3) {
        this.f38957a = i7;
        this.f38958b = j3;
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
                if (this.f38958b == viVar.f38958b && this.f38957a == viVar.f38957a) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(p1.g.a(this.f38957a), Long.valueOf(this.f38958b));
    }
}
