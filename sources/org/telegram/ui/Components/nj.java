package org.telegram.ui.Components;

import j$.util.Objects;
import org.telegram.messenger.ContactsController;
import org.telegram.tgnet.TLRPC;
public final class nj {
    public final int f28958a;
    public final long f28959b;

    public nj(int i10, long j10) {
        this.f28958a = i10;
        this.f28959b = j10;
    }

    public static nj a(Object obj) {
        if (obj instanceof ContactsController.Contact) {
            return new nj(2, ((ContactsController.Contact) obj).contact_id);
        }
        if (obj instanceof TLRPC.User) {
            return new nj(1, ((TLRPC.User) obj).f20490id);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && nj.class == obj.getClass()) {
                nj njVar = (nj) obj;
                if (this.f28959b == njVar.f28959b && this.f28958a == njVar.f28958a) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(m1.j.a(this.f28958a), Long.valueOf(this.f28959b));
    }
}
