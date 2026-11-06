package org.telegram.ui;

import j$.util.Objects;
public final class i extends rg.a {
    public final CharSequence f46534c;
    public final int d;

    public i(int i7, int i10, String str) {
        super(i7, false);
        this.d = i10;
        this.f46534c = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && i.class == obj.getClass()) {
                i iVar = (i) obj;
                if (this.d == iVar.d && Objects.equals(this.f46534c, iVar.f46534c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }
}
