package org.telegram.ui.Components;

import j$.util.Objects;
import org.telegram.messenger.ContactsController;
import org.telegram.tgnet.TLRPC;
public final class qj {
    public final int f27734a;
    public final long f27735b;

    public qj(int i10, long j3) {
        this.f27734a = i10;
        this.f27735b = j3;
    }

    public static qj a(Object obj) {
        if (obj instanceof ContactsController.Contact) {
            return new qj(2, ((ContactsController.Contact) obj).contact_id);
        }
        if (obj instanceof TLRPC.User) {
            return new qj(1, ((TLRPC.User) obj).f18482id);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && qj.class == obj.getClass()) {
                qj qjVar = (qj) obj;
                if (this.f27735b == qjVar.f27735b && this.f27734a == qjVar.f27734a) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(m1.j.a(this.f27734a), Long.valueOf(this.f27735b));
    }
}
