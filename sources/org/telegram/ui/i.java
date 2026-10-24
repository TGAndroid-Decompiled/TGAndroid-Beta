package org.telegram.ui;

import j$.util.Objects;
public final class i extends pg.a {
    public final CharSequence f38084c;
    public final int d;

    public i(int i10, int i11, String str) {
        super(i10, false);
        this.d = i11;
        this.f38084c = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && i.class == obj.getClass()) {
                i iVar = (i) obj;
                if (this.d == iVar.d && Objects.equals(this.f38084c, iVar.f38084c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }
}
