package org.telegram.ui;

import j$.util.Objects;
public final class l extends bg.b {
    public final CharSequence f35613c;
    public final int d;

    public l(int i10, int i11, String str) {
        super(i10, false);
        this.d = i11;
        this.f35613c = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && l.class == obj.getClass()) {
                l lVar = (l) obj;
                if (this.d == lVar.d && Objects.equals(this.f35613c, lVar.f35613c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }
}
