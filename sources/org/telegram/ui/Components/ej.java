package org.telegram.ui.Components;

import j$.util.Objects;
import org.telegram.messenger.ContactsController;
import org.telegram.tgnet.TLRPC;
public final class ej {
    public final int f28035a;
    public final long f28036b;

    public ej(int i9, long j10) {
        this.f28035a = i9;
        this.f28036b = j10;
    }

    public static ej a(Object obj) {
        if (obj instanceof ContactsController.Contact) {
            return new ej(2, ((ContactsController.Contact) obj).contact_id);
        }
        if (obj instanceof TLRPC.User) {
            return new ej(1, ((TLRPC.User) obj).f22527id);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && ej.class == obj.getClass()) {
                ej ejVar = (ej) obj;
                if (this.f28036b == ejVar.f28036b && this.f28035a == ejVar.f28035a) {
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
        Long valueOf2 = Long.valueOf(this.f28036b);
        int i9 = this.f28035a;
        if (i9 == 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(i9 - 1);
        }
        return Objects.hash(valueOf, valueOf2);
    }
}
