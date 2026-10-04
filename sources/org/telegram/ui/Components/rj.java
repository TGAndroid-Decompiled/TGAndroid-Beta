package org.telegram.ui.Components;

import j$.util.Objects;
import org.telegram.messenger.ContactsController;
import org.telegram.tgnet.TLRPC;
public final class rj {
    public final int f30420a;
    public final long f30421b;

    public rj(int i10, long j3) {
        this.f30420a = i10;
        this.f30421b = j3;
    }

    public static rj a(Object obj) {
        if (obj instanceof ContactsController.Contact) {
            return new rj(2, ((ContactsController.Contact) obj).contact_id);
        }
        if (obj instanceof TLRPC.User) {
            return new rj(1, ((TLRPC.User) obj).f20185id);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && rj.class == obj.getClass()) {
                rj rjVar = (rj) obj;
                if (this.f30421b == rjVar.f30421b && this.f30420a == rjVar.f30420a) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(m1.j.a(this.f30420a), Long.valueOf(this.f30421b));
    }
}
