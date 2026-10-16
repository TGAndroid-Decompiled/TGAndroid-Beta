package org.telegram.ui;

import j$.util.Objects;
public final class j extends pg.a {
    public final CharSequence f36896c;
    public final int d;

    public j(int i10, int i11, String str) {
        super(i10, false);
        this.d = i11;
        this.f36896c = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && j.class == obj.getClass()) {
                j jVar = (j) obj;
                if (this.d == jVar.d && Objects.equals(this.f36896c, jVar.f36896c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }
}
