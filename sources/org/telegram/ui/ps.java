package org.telegram.ui;

import j$.util.Objects;
public final class ps {
    public String f51135a;
    public String f51136b;
    public String f51137c;
    public String d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ps.class == obj.getClass()) {
            ps psVar = (ps) obj;
            if (Objects.equals(this.f51135a, psVar.f51135a) && Objects.equals(this.f51137c, psVar.f51137c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f51135a, this.f51137c);
    }
}
