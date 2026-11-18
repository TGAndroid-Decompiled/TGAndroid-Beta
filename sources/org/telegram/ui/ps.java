package org.telegram.ui;

import j$.util.Objects;
public final class ps {
    public String f50999a;
    public String f51000b;
    public String f51001c;
    public String d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ps.class == obj.getClass()) {
            ps psVar = (ps) obj;
            if (Objects.equals(this.f50999a, psVar.f50999a) && Objects.equals(this.f51001c, psVar.f51001c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f50999a, this.f51001c);
    }
}
