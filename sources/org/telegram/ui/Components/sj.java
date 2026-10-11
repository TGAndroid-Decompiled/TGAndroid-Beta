package org.telegram.ui.Components;

import j$.util.Objects;
import org.telegram.messenger.ContactsController;
import org.telegram.tgnet.TLRPC;
public final class sj {
    public final int f30757a;
    public final long f30758b;

    public sj(int i10, long j3) {
        this.f30757a = i10;
        this.f30758b = j3;
    }

    public static sj a(Object obj) {
        if (obj instanceof ContactsController.Contact) {
            return new sj(2, ((ContactsController.Contact) obj).contact_id);
        }
        if (obj instanceof TLRPC.User) {
            return new sj(1, ((TLRPC.User) obj).f20179id);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && sj.class == obj.getClass()) {
                sj sjVar = (sj) obj;
                if (this.f30758b == sjVar.f30758b && this.f30757a == sjVar.f30757a) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(m1.j.a(this.f30757a), Long.valueOf(this.f30758b));
    }
}
