package org.telegram.ui;

import j$.util.Objects;
public final class i extends pg.a {
    public final CharSequence f37998c;
    public final int d;

    public i(int i10, int i11, String str) {
        super(i10, false);
        this.d = i11;
        this.f37998c = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && i.class == obj.getClass()) {
                i iVar = (i) obj;
                if (this.d == iVar.d && Objects.equals(this.f37998c, iVar.f37998c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }
}
