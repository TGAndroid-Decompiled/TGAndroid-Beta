package org.telegram.ui.Components;

import j$.util.Objects;
import org.telegram.messenger.ContactsController;
import org.telegram.tgnet.TLRPC;
public final class uj {
    public final int f31170a;
    public final long f31171b;

    public uj(int i10, long j3) {
        this.f31170a = i10;
        this.f31171b = j3;
    }

    public static uj a(Object obj) {
        if (obj instanceof ContactsController.Contact) {
            return new uj(2, ((ContactsController.Contact) obj).contact_id);
        }
        if (obj instanceof TLRPC.User) {
            return new uj(1, ((TLRPC.User) obj).f19950id);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && uj.class == obj.getClass()) {
                uj ujVar = (uj) obj;
                if (this.f31171b == ujVar.f31171b && this.f31170a == ujVar.f31170a) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(m1.j.a(this.f31170a), Long.valueOf(this.f31171b));
    }
}
