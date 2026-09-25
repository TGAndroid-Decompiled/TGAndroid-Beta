package org.telegram.ui.Components;

import j$.util.Objects;
import org.telegram.messenger.ContactsController;
import org.telegram.tgnet.TLRPC;
public final class pj {
    public final int f27361a;
    public final long f27362b;

    public pj(int i10, long j3) {
        this.f27361a = i10;
        this.f27362b = j3;
    }

    public static pj a(Object obj) {
        if (obj instanceof ContactsController.Contact) {
            return new pj(2, ((ContactsController.Contact) obj).contact_id);
        }
        if (obj instanceof TLRPC.User) {
            return new pj(1, ((TLRPC.User) obj).f18483id);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && pj.class == obj.getClass()) {
                pj pjVar = (pj) obj;
                if (this.f27362b == pjVar.f27362b && this.f27361a == pjVar.f27361a) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(m1.j.a(this.f27361a), Long.valueOf(this.f27362b));
    }
}
