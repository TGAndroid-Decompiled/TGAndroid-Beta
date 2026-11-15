package org.telegram.ui;

import j$.util.Objects;
public final class ps {
    public String f50358a;
    public String f50359b;
    public String f50360c;
    public String d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ps.class == obj.getClass()) {
            ps psVar = (ps) obj;
            if (Objects.equals(this.f50358a, psVar.f50358a) && Objects.equals(this.f50360c, psVar.f50360c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f50358a, this.f50360c);
    }
}
