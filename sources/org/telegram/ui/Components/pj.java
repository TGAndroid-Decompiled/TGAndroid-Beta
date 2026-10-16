package org.telegram.ui.Components;

import j$.util.Objects;
import org.telegram.messenger.ContactsController;
import org.telegram.tgnet.TLRPC;
public final class pj {
    public final int f28027a;
    public final long f28028b;

    public pj(int i10, long j10) {
        this.f28027a = i10;
        this.f28028b = j10;
    }

    public static pj a(Object obj) {
        if (obj instanceof ContactsController.Contact) {
            return new pj(2, ((ContactsController.Contact) obj).contact_id);
        }
        if (obj instanceof TLRPC.User) {
            return new pj(1, ((TLRPC.User) obj).f19063id);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && pj.class == obj.getClass()) {
                pj pjVar = (pj) obj;
                if (this.f28028b == pjVar.f28028b && this.f28027a == pjVar.f28027a) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(m1.j.a(this.f28027a), Long.valueOf(this.f28028b));
    }
}
