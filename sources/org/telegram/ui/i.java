package org.telegram.ui;

import j$.util.Objects;
public final class i extends qg.a {
    public final CharSequence f40112c;
    public final int d;

    public i(int i10, int i11, String str) {
        super(i10, false);
        this.d = i11;
        this.f40112c = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && i.class == obj.getClass()) {
                i iVar = (i) obj;
                if (this.d == iVar.d && Objects.equals(this.f40112c, iVar.f40112c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }
}
