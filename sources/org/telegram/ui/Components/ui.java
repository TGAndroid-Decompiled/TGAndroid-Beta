package org.telegram.ui.Components;

import j$.util.Objects;
import org.telegram.tgnet.TLRPC;
public final class ui {
    public final int f30971a;
    public final long f30972b;

    public ui(int i10, long j10) {
        this.f30971a = i10;
        this.f30972b = j10;
    }

    public static ui a(Object obj) {
        if (obj instanceof org.telegram.messenger.f5) {
            return new ui(2, ((org.telegram.messenger.f5) obj).f15692a);
        }
        if (obj instanceof TLRPC.User) {
            return new ui(1, ((TLRPC.User) obj).f19943id);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && ui.class == obj.getClass()) {
                ui uiVar = (ui) obj;
                if (this.f30972b == uiVar.f30972b && this.f30971a == uiVar.f30971a) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(m1.j.a(this.f30971a), Long.valueOf(this.f30972b));
    }
}
