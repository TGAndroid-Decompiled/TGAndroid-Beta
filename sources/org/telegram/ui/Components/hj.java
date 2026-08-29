package org.telegram.ui.Components;

import j$.util.Objects;
import org.telegram.messenger.ContactsController;
import org.telegram.tgnet.TLRPC;
public final class hj {
    public final int f29189a;
    public final long f29190b;

    public hj(int i10, long j10) {
        this.f29189a = i10;
        this.f29190b = j10;
    }

    public static hj a(Object obj) {
        if (obj instanceof ContactsController.Contact) {
            return new hj(2, ((ContactsController.Contact) obj).contact_id);
        }
        if (obj instanceof TLRPC.User) {
            return new hj(1, ((TLRPC.User) obj).f22539id);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && hj.class == obj.getClass()) {
                hj hjVar = (hj) obj;
                if (this.f29190b == hjVar.f29190b && this.f29189a == hjVar.f29189a) {
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
        Long valueOf2 = Long.valueOf(this.f29190b);
        int i10 = this.f29189a;
        if (i10 == 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(i10 - 1);
        }
        return Objects.hash(valueOf, valueOf2);
    }
}
