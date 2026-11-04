package org.telegram.ui.Components;

import j$.util.Objects;
import org.telegram.tgnet.TLRPC;
public final class ui {
    public final int f38759a;
    public final long f38760b;

    public ui(int i3, long j10) {
        this.f38759a = i3;
        this.f38760b = j10;
    }

    public static ui a(Object obj) {
        if (obj instanceof org.telegram.messenger.d5) {
            return new ui(2, ((org.telegram.messenger.d5) obj).f22147a);
        }
        if (obj instanceof TLRPC.User) {
            return new ui(1, ((TLRPC.User) obj).f27150id);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && ui.class == obj.getClass()) {
                ui uiVar = (ui) obj;
                if (this.f38760b == uiVar.f38760b && this.f38759a == uiVar.f38759a) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(o1.g.a(this.f38759a), Long.valueOf(this.f38760b));
    }
}
