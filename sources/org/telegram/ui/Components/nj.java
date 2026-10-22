package org.telegram.ui.Components;

import j$.util.Objects;
import org.telegram.messenger.ContactsController;
import org.telegram.tgnet.TLRPC;
public final class nj {
    public final int f28812a;
    public final long f28813b;

    public nj(int i10, long j10) {
        this.f28812a = i10;
        this.f28813b = j10;
    }

    public static nj a(Object obj) {
        if (obj instanceof ContactsController.Contact) {
            return new nj(2, ((ContactsController.Contact) obj).contact_id);
        }
        if (obj instanceof TLRPC.User) {
            return new nj(1, ((TLRPC.User) obj).f20426id);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && nj.class == obj.getClass()) {
                nj njVar = (nj) obj;
                if (this.f28813b == njVar.f28813b && this.f28812a == njVar.f28812a) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(m1.j.a(this.f28812a), Long.valueOf(this.f28813b));
    }
}
