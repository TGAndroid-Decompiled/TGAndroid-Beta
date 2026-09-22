package org.telegram.ui.Components;

import j$.util.Objects;
import org.telegram.messenger.ContactsController;
import org.telegram.tgnet.TLRPC;
public final class oj {
    public final int f27085a;
    public final long f27086b;

    public oj(int i10, long j3) {
        this.f27085a = i10;
        this.f27086b = j3;
    }

    public static oj a(Object obj) {
        if (obj instanceof ContactsController.Contact) {
            return new oj(2, ((ContactsController.Contact) obj).contact_id);
        }
        if (obj instanceof TLRPC.User) {
            return new oj(1, ((TLRPC.User) obj).f18490id);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && oj.class == obj.getClass()) {
                oj ojVar = (oj) obj;
                if (this.f27086b == ojVar.f27086b && this.f27085a == ojVar.f27085a) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(m1.j.a(this.f27085a), Long.valueOf(this.f27086b));
    }
}
