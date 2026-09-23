package org.telegram.ui.Components;

import j$.util.Objects;
import org.telegram.messenger.ContactsController;
import org.telegram.tgnet.TLRPC;
public final class pj {
    public final int f27058a;
    public final long f27059b;

    public pj(int i10, long j3) {
        this.f27058a = i10;
        this.f27059b = j3;
    }

    public static pj a(Object obj) {
        if (obj instanceof ContactsController.Contact) {
            return new pj(2, ((ContactsController.Contact) obj).contact_id);
        }
        if (obj instanceof TLRPC.User) {
            return new pj(1, ((TLRPC.User) obj).f18230id);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && pj.class == obj.getClass()) {
                pj pjVar = (pj) obj;
                if (this.f27059b == pjVar.f27059b && this.f27058a == pjVar.f27058a) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(m1.j.a(this.f27058a), Long.valueOf(this.f27059b));
    }
}
