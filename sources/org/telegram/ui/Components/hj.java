package org.telegram.ui.Components;

import j$.util.Objects;
import org.telegram.messenger.ContactsController;
import org.telegram.tgnet.TLRPC;
public final class hj {
    public final int f27498a;
    public final long f27499b;

    public hj(int i10, long j10) {
        this.f27498a = i10;
        this.f27499b = j10;
    }

    public static hj a(Object obj) {
        if (obj instanceof ContactsController.Contact) {
            return new hj(2, ((ContactsController.Contact) obj).contact_id);
        }
        if (obj instanceof TLRPC.User) {
            return new hj(1, ((TLRPC.User) obj).f20990id);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && hj.class == obj.getClass()) {
                hj hjVar = (hj) obj;
                if (this.f27499b == hjVar.f27499b && this.f27498a == hjVar.f27498a) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(m1.j.a(this.f27498a), Long.valueOf(this.f27499b));
    }
}
