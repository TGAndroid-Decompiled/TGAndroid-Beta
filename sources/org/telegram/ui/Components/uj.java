package org.telegram.ui.Components;

import j$.util.Objects;
import org.telegram.messenger.ContactsController;
import org.telegram.tgnet.TLRPC;
public final class uj {
    public final int f31178a;
    public final long f31179b;

    public uj(int i10, long j3) {
        this.f31178a = i10;
        this.f31179b = j3;
    }

    public static uj a(Object obj) {
        if (obj instanceof ContactsController.Contact) {
            return new uj(2, ((ContactsController.Contact) obj).contact_id);
        }
        if (obj instanceof TLRPC.User) {
            return new uj(1, ((TLRPC.User) obj).f19949id);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && uj.class == obj.getClass()) {
                uj ujVar = (uj) obj;
                if (this.f31179b == ujVar.f31179b && this.f31178a == ujVar.f31178a) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(m1.j.a(this.f31178a), Long.valueOf(this.f31179b));
    }
}
