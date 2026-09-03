package org.telegram.ui.Components;

import j$.util.Objects;
import org.telegram.messenger.ContactsController;
import org.telegram.tgnet.TLRPC;
public final class fj {
    public final int f24903a;
    public final long f24904b;

    public fj(int i10, long j10) {
        this.f24903a = i10;
        this.f24904b = j10;
    }

    public static fj a(Object obj) {
        if (obj instanceof ContactsController.Contact) {
            return new fj(2, ((ContactsController.Contact) obj).contact_id);
        }
        if (obj instanceof TLRPC.User) {
            return new fj(1, ((TLRPC.User) obj).f19306id);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && fj.class == obj.getClass()) {
                fj fjVar = (fj) obj;
                if (this.f24904b == fjVar.f24904b && this.f24903a == fjVar.f24903a) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(m1.j.a(this.f24903a), Long.valueOf(this.f24904b));
    }
}
