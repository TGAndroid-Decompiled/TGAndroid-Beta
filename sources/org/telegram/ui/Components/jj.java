package org.telegram.ui.Components;

import j$.util.Objects;
import org.telegram.tgnet.TLRPC;
public final class jj {
    public final int f36446a;
    public final long f36447b;

    public jj(int i7, long j3) {
        this.f36446a = i7;
        this.f36447b = j3;
    }

    public static jj a(Object obj) {
        if (obj instanceof org.telegram.messenger.f5) {
            return new jj(2, ((org.telegram.messenger.f5) obj).f23840a);
        }
        if (obj instanceof TLRPC.User) {
            return new jj(1, ((TLRPC.User) obj).f28554id);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && jj.class == obj.getClass()) {
                jj jjVar = (jj) obj;
                if (this.f36447b == jjVar.f36447b && this.f36446a == jjVar.f36446a) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(p1.g.a(this.f36446a), Long.valueOf(this.f36447b));
    }
}
