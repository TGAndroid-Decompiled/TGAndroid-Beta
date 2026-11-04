package org.telegram.ui;

import j$.util.Objects;
public final class i extends sg.a {
    public final CharSequence f46019c;
    public final int d;

    public i(int i3, int i10, String str) {
        super(i3, false);
        this.d = i10;
        this.f46019c = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && i.class == obj.getClass()) {
                i iVar = (i) obj;
                if (this.d == iVar.d && Objects.equals(this.f46019c, iVar.f46019c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }
}
