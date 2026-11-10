package org.telegram.ui.Components;

import j$.util.Objects;
import org.telegram.tgnet.TLRPC;
public final class ui {
    public final int f38662a;
    public final long f38663b;

    public ui(int i7, long j3) {
        this.f38662a = i7;
        this.f38663b = j3;
    }

    public static ui a(Object obj) {
        if (obj instanceof org.telegram.messenger.d5) {
            return new ui(2, ((org.telegram.messenger.d5) obj).f21990a);
        }
        if (obj instanceof TLRPC.User) {
            return new ui(1, ((TLRPC.User) obj).f27109id);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && ui.class == obj.getClass()) {
                ui uiVar = (ui) obj;
                if (this.f38663b == uiVar.f38663b && this.f38662a == uiVar.f38662a) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(p1.g.a(this.f38662a), Long.valueOf(this.f38663b));
    }
}
