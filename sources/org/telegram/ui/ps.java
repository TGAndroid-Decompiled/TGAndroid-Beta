package org.telegram.ui;

import j$.util.Objects;
public final class ps {
    public String f50969a;
    public String f50970b;
    public String f50971c;
    public String d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ps.class == obj.getClass()) {
            ps psVar = (ps) obj;
            if (Objects.equals(this.f50969a, psVar.f50969a) && Objects.equals(this.f50971c, psVar.f50971c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f50969a, this.f50971c);
    }
}
