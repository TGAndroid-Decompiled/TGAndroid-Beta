package org.telegram.ui.Components;

import j$.util.Objects;
import org.telegram.messenger.ContactsController;
import org.telegram.tgnet.TLRPC;
public final class lj {
    public final int f28346a;
    public final long f28347b;

    public lj(int i10, long j10) {
        this.f28346a = i10;
        this.f28347b = j10;
    }

    public static lj a(Object obj) {
        if (obj instanceof ContactsController.Contact) {
            return new lj(2, ((ContactsController.Contact) obj).contact_id);
        }
        if (obj instanceof TLRPC.User) {
            return new lj(1, ((TLRPC.User) obj).f20491id);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && lj.class == obj.getClass()) {
                lj ljVar = (lj) obj;
                if (this.f28347b == ljVar.f28347b && this.f28346a == ljVar.f28346a) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(m1.j.a(this.f28346a), Long.valueOf(this.f28347b));
    }
}
