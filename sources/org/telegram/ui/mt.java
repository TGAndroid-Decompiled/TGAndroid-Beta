package org.telegram.ui;

import j$.util.Objects;
public final class mt {
    public String f39611a;
    public String f39612b;
    public String f39613c;
    public String d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && mt.class == obj.getClass()) {
            mt mtVar = (mt) obj;
            if (Objects.equals(this.f39611a, mtVar.f39611a) && Objects.equals(this.f39613c, mtVar.f39613c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f39611a, this.f39613c);
    }
}
