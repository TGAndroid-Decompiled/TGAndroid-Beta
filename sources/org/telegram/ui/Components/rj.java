package org.telegram.ui.Components;

import j$.util.Objects;
import org.telegram.messenger.ContactsController;
import org.telegram.tgnet.TLRPC;
public final class rj {
    public final int f30426a;
    public final long f30427b;

    public rj(int i10, long j3) {
        this.f30426a = i10;
        this.f30427b = j3;
    }

    public static rj a(Object obj) {
        if (obj instanceof ContactsController.Contact) {
            return new rj(2, ((ContactsController.Contact) obj).contact_id);
        }
        if (obj instanceof TLRPC.User) {
            return new rj(1, ((TLRPC.User) obj).f20189id);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && rj.class == obj.getClass()) {
                rj rjVar = (rj) obj;
                if (this.f30427b == rjVar.f30427b && this.f30426a == rjVar.f30426a) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(m1.j.a(this.f30426a), Long.valueOf(this.f30427b));
    }
}
