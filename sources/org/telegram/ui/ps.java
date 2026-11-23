package org.telegram.ui;

import j$.util.Objects;
public final class ps {
    public String f50902a;
    public String f50903b;
    public String f50904c;
    public String d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ps.class == obj.getClass()) {
            ps psVar = (ps) obj;
            if (Objects.equals(this.f50902a, psVar.f50902a) && Objects.equals(this.f50904c, psVar.f50904c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f50902a, this.f50904c);
    }
}
