package org.telegram.ui;

import j$.util.Objects;
public final class ps {
    public String f48826a;
    public String f48827b;
    public String f48828c;
    public String d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ps.class == obj.getClass()) {
            ps psVar = (ps) obj;
            if (Objects.equals(this.f48826a, psVar.f48826a) && Objects.equals(this.f48828c, psVar.f48828c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f48826a, this.f48828c);
    }
}
