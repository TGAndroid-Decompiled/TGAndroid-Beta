package org.telegram.ui.Components;

import j$.util.Objects;
import org.telegram.messenger.ContactsController;
import org.telegram.tgnet.TLRPC;

public final class aj {

    public final int f26750a;

    public final long f26751b;

    public aj(int i10, long j10) {
        this.f26750a = i10;
        this.f26751b = j10;
    }

    public static aj a(Object obj) {
        if (obj instanceof ContactsController.Contact) {
            return new aj(2, ((ContactsController.Contact) obj).contact_id);
        }
        if (obj instanceof TLRPC.User) {
            return new aj(1, ((TLRPC.User) obj).f22527id);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || aj.class != obj.getClass()) {
            return false;
        }
        aj ajVar = (aj) obj;
        return this.f26751b == ajVar.f26751b && this.f26750a == ajVar.f26750a;
    }

    public final int hashCode() {
        Long lValueOf = Long.valueOf(this.f26751b);
        int i10 = this.f26750a;
        return Objects.hash(i10 == 0 ? null : Integer.valueOf(i10 - 1), lValueOf);
    }
}
