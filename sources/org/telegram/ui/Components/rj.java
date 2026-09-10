package org.telegram.ui.Components;

import j$.util.Objects;
import org.telegram.messenger.ContactsController;
import org.telegram.tgnet.TLRPC;
public final class rj {
    public final int f26676a;
    public final long f26677b;

    public rj(int i10, long j3) {
        this.f26676a = i10;
        this.f26677b = j3;
    }

    public static rj a(Object obj) {
        if (obj instanceof ContactsController.Contact) {
            return new rj(2, ((ContactsController.Contact) obj).contact_id);
        }
        if (obj instanceof TLRPC.User) {
            return new rj(1, ((TLRPC.User) obj).f17342id);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && rj.class == obj.getClass()) {
                rj rjVar = (rj) obj;
                if (this.f26677b == rjVar.f26677b && this.f26676a == rjVar.f26676a) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(m1.j.a(this.f26676a), Long.valueOf(this.f26677b));
    }
}
