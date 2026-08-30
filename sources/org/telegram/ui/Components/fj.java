package org.telegram.ui.Components;

import j$.util.Objects;
import org.telegram.messenger.ContactsController;
import org.telegram.tgnet.TLRPC;
public final class fj {
    public final int f24887a;
    public final long f24888b;

    public fj(int i10, long j10) {
        this.f24887a = i10;
        this.f24888b = j10;
    }

    public static fj a(Object obj) {
        if (obj instanceof ContactsController.Contact) {
            return new fj(2, ((ContactsController.Contact) obj).contact_id);
        }
        if (obj instanceof TLRPC.User) {
            return new fj(1, ((TLRPC.User) obj).f19331id);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && fj.class == obj.getClass()) {
                fj fjVar = (fj) obj;
                if (this.f24888b == fjVar.f24888b && this.f24887a == fjVar.f24887a) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Integer valueOf;
        Long valueOf2 = Long.valueOf(this.f24888b);
        int i10 = this.f24887a;
        if (i10 == 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(i10 - 1);
        }
        return Objects.hash(valueOf, valueOf2);
    }
}
