package org.telegram.ui.Components;

import j$.util.Objects;
import org.telegram.messenger.ContactsController;
import org.telegram.tgnet.TLRPC;
public final class hj {
    public final int f27515a;
    public final long f27516b;

    public hj(int i10, long j10) {
        this.f27515a = i10;
        this.f27516b = j10;
    }

    public static hj a(Object obj) {
        if (obj instanceof ContactsController.Contact) {
            return new hj(2, ((ContactsController.Contact) obj).contact_id);
        }
        if (obj instanceof TLRPC.User) {
            return new hj(1, ((TLRPC.User) obj).f20992id);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && hj.class == obj.getClass()) {
                hj hjVar = (hj) obj;
                if (this.f27516b == hjVar.f27516b && this.f27515a == hjVar.f27515a) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(m1.j.a(this.f27515a), Long.valueOf(this.f27516b));
    }
}
