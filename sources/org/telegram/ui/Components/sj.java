package org.telegram.ui.Components;

import j$.util.Objects;
import org.telegram.messenger.ContactsController;
import org.telegram.tgnet.TLRPC;
public final class sj {
    public final int f30812a;
    public final long f30813b;

    public sj(int i10, long j3) {
        this.f30812a = i10;
        this.f30813b = j3;
    }

    public static sj a(Object obj) {
        if (obj instanceof ContactsController.Contact) {
            return new sj(2, ((ContactsController.Contact) obj).contact_id);
        }
        if (obj instanceof TLRPC.User) {
            return new sj(1, ((TLRPC.User) obj).f20185id);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && sj.class == obj.getClass()) {
                sj sjVar = (sj) obj;
                if (this.f30813b == sjVar.f30813b && this.f30812a == sjVar.f30812a) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(m1.j.a(this.f30812a), Long.valueOf(this.f30813b));
    }
}
