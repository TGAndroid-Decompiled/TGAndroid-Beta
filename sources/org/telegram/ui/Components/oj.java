package org.telegram.ui.Components;

import j$.util.Objects;
import org.telegram.messenger.ContactsController;
import org.telegram.tgnet.TLRPC;
public final class oj {
    public final int f29109a;
    public final long f29110b;

    public oj(int i10, long j3) {
        this.f29109a = i10;
        this.f29110b = j3;
    }

    public static oj a(Object obj) {
        if (obj instanceof ContactsController.Contact) {
            return new oj(2, ((ContactsController.Contact) obj).contact_id);
        }
        if (obj instanceof TLRPC.User) {
            return new oj(1, ((TLRPC.User) obj).f20043id);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && oj.class == obj.getClass()) {
                oj ojVar = (oj) obj;
                if (this.f29110b == ojVar.f29110b && this.f29109a == ojVar.f29109a) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(m1.j.a(this.f29109a), Long.valueOf(this.f29110b));
    }
}
