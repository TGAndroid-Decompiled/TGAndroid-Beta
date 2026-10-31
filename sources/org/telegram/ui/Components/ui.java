package org.telegram.ui.Components;

import j$.util.Objects;
import org.telegram.tgnet.TLRPC;
public final class ui {
    public final int f30950a;
    public final long f30951b;

    public ui(int i10, long j10) {
        this.f30950a = i10;
        this.f30951b = j10;
    }

    public static ui a(Object obj) {
        if (obj instanceof org.telegram.messenger.f5) {
            return new ui(2, ((org.telegram.messenger.f5) obj).f15508a);
        }
        if (obj instanceof TLRPC.User) {
            return new ui(1, ((TLRPC.User) obj).f19942id);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && ui.class == obj.getClass()) {
                ui uiVar = (ui) obj;
                if (this.f30951b == uiVar.f30951b && this.f30950a == uiVar.f30950a) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(m1.j.a(this.f30950a), Long.valueOf(this.f30951b));
    }
}
