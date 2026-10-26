package org.telegram.ui.Components;

import j$.util.Objects;
import org.telegram.messenger.ContactsController;
import org.telegram.tgnet.TLRPC;
public final class nj {
    public final int f31006a;
    public final long f31007b;

    public nj(int i10, long j10) {
        this.f31006a = i10;
        this.f31007b = j10;
    }

    public static nj a(Object obj) {
        if (obj instanceof ContactsController.Contact) {
            return new nj(2, ((ContactsController.Contact) obj).contact_id);
        }
        if (obj instanceof TLRPC.User) {
            return new nj(1, ((TLRPC.User) obj).f22176id);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && nj.class == obj.getClass()) {
                nj njVar = (nj) obj;
                if (this.f31007b == njVar.f31007b && this.f31006a == njVar.f31006a) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(m1.j.a(this.f31006a), Long.valueOf(this.f31007b));
    }
}
