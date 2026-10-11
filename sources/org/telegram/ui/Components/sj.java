package org.telegram.ui.Components;

import j$.util.Objects;
import org.telegram.messenger.ContactsController;
import org.telegram.tgnet.TLRPC;
public final class sj {
    public final int f30874a;
    public final long f30875b;

    public sj(int i10, long j3) {
        this.f30874a = i10;
        this.f30875b = j3;
    }

    public static sj a(Object obj) {
        if (obj instanceof ContactsController.Contact) {
            return new sj(2, ((ContactsController.Contact) obj).contact_id);
        }
        if (obj instanceof TLRPC.User) {
            return new sj(1, ((TLRPC.User) obj).f20215id);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && sj.class == obj.getClass()) {
                sj sjVar = (sj) obj;
                if (this.f30875b == sjVar.f30875b && this.f30874a == sjVar.f30874a) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(m1.j.a(this.f30874a), Long.valueOf(this.f30875b));
    }
}
