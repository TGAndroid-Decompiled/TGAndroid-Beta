package org.telegram.ui.Components;

import j$.util.Objects;
import org.telegram.tgnet.TLRPC;
public final class lj {
    public final int f37197a;
    public final long f37198b;

    public lj(int i7, long j3) {
        this.f37197a = i7;
        this.f37198b = j3;
    }

    public static lj a(Object obj) {
        if (obj instanceof org.telegram.messenger.f5) {
            return new lj(2, ((org.telegram.messenger.f5) obj).f23860a);
        }
        if (obj instanceof TLRPC.User) {
            return new lj(1, ((TLRPC.User) obj).f28583id);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && lj.class == obj.getClass()) {
                lj ljVar = (lj) obj;
                if (this.f37198b == ljVar.f37198b && this.f37197a == ljVar.f37197a) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(p1.g.a(this.f37197a), Long.valueOf(this.f37198b));
    }
}
