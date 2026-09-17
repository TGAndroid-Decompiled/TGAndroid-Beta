package org.telegram.ui;

import j$.util.Objects;
public final class j extends pg.a {
    public final CharSequence f37487c;
    public final int d;

    public j(int i10, int i11, String str) {
        super(i10, false);
        this.d = i11;
        this.f37487c = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && j.class == obj.getClass()) {
                j jVar = (j) obj;
                if (this.d == jVar.d && Objects.equals(this.f37487c, jVar.f37487c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }
}
