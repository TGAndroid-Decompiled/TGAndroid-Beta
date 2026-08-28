package org.telegram.ui;

import j$.util.Objects;
public final class lt {
    public String f40225a;
    public String f40226b;
    public String f40227c;
    public String d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && lt.class == obj.getClass()) {
            lt ltVar = (lt) obj;
            if (Objects.equals(this.f40225a, ltVar.f40225a) && Objects.equals(this.f40227c, ltVar.f40227c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f40225a, this.f40227c);
    }
}
