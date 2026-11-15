package org.telegram.ui;

import j$.util.Objects;
public final class ps {
    public String f50349a;
    public String f50350b;
    public String f50351c;
    public String d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ps.class == obj.getClass()) {
            ps psVar = (ps) obj;
            if (Objects.equals(this.f50349a, psVar.f50349a) && Objects.equals(this.f50351c, psVar.f50351c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f50349a, this.f50351c);
    }
}
