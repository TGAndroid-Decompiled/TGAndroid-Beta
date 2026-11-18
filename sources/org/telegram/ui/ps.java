package org.telegram.ui;

import j$.util.Objects;
public final class ps {
    public String f50920a;
    public String f50921b;
    public String f50922c;
    public String d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ps.class == obj.getClass()) {
            ps psVar = (ps) obj;
            if (Objects.equals(this.f50920a, psVar.f50920a) && Objects.equals(this.f50922c, psVar.f50922c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f50920a, this.f50922c);
    }
}
