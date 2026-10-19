package org.telegram.ui.Components;

import j$.util.Objects;
import org.telegram.messenger.ContactsController;
import org.telegram.tgnet.TLRPC;
public final class nj {
    public final int f28782a;
    public final long f28783b;

    public nj(int i10, long j10) {
        this.f28782a = i10;
        this.f28783b = j10;
    }

    public static nj a(Object obj) {
        if (obj instanceof ContactsController.Contact) {
            return new nj(2, ((ContactsController.Contact) obj).contact_id);
        }
        if (obj instanceof TLRPC.User) {
            return new nj(1, ((TLRPC.User) obj).f20422id);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && nj.class == obj.getClass()) {
                nj njVar = (nj) obj;
                if (this.f28783b == njVar.f28783b && this.f28782a == njVar.f28782a) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(m1.j.a(this.f28782a), Long.valueOf(this.f28783b));
    }
}
