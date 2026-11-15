package org.telegram.ui.Components;

import j$.util.Objects;
import org.telegram.tgnet.TLRPC;
public final class cj {
    public final int f33614a;
    public final long f33615b;

    public cj(int i7, long j3) {
        this.f33614a = i7;
        this.f33615b = j3;
    }

    public static cj a(Object obj) {
        if (obj instanceof org.telegram.messenger.d5) {
            return new cj(2, ((org.telegram.messenger.d5) obj).f23039a);
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
                if (this.f33615b == cjVar.f33615b && this.f33614a == cjVar.f33614a) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(p1.g.a(this.f33614a), Long.valueOf(this.f33615b));
    }
}
