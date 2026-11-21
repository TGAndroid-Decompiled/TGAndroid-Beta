package org.telegram.ui;

import j$.util.Objects;
public final class ps {
    public String f50965a;
    public String f50966b;
    public String f50967c;
    public String d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ps.class == obj.getClass()) {
            ps psVar = (ps) obj;
            if (Objects.equals(this.f50965a, psVar.f50965a) && Objects.equals(this.f50967c, psVar.f50967c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f50965a, this.f50967c);
    }
}
