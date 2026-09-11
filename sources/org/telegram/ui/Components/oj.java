package org.telegram.ui.Components;

import j$.util.Objects;
import org.telegram.messenger.ContactsController;
import org.telegram.tgnet.TLRPC;
public final class oj {
    public final int f29082a;
    public final long f29083b;

    public oj(int i10, long j3) {
        this.f29082a = i10;
        this.f29083b = j3;
    }

    public static oj a(Object obj) {
        if (obj instanceof ContactsController.Contact) {
            return new oj(2, ((ContactsController.Contact) obj).contact_id);
        }
        if (obj instanceof TLRPC.User) {
            return new oj(1, ((TLRPC.User) obj).f20016id);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && oj.class == obj.getClass()) {
                oj ojVar = (oj) obj;
                if (this.f29083b == ojVar.f29083b && this.f29082a == ojVar.f29082a) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(m1.j.a(this.f29082a), Long.valueOf(this.f29083b));
    }
}
