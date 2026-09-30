package org.telegram.ui.Components;

import j$.util.Objects;
import org.telegram.messenger.ContactsController;
import org.telegram.tgnet.TLRPC;
public final class rj {
    public final int f28031a;
    public final long f28032b;

    public rj(int i10, long j3) {
        this.f28031a = i10;
        this.f28032b = j3;
    }

    public static rj a(Object obj) {
        if (obj instanceof ContactsController.Contact) {
            return new rj(2, ((ContactsController.Contact) obj).contact_id);
        }
        if (obj instanceof TLRPC.User) {
            return new rj(1, ((TLRPC.User) obj).f18499id);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && rj.class == obj.getClass()) {
                rj rjVar = (rj) obj;
                if (this.f28032b == rjVar.f28032b && this.f28031a == rjVar.f28031a) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(m1.j.a(this.f28031a), Long.valueOf(this.f28032b));
    }
}
