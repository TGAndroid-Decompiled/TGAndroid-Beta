package org.telegram.ui;

import j$.util.Objects;
public final class lt {
    public String f40272a;
    public String f40273b;
    public String f40274c;
    public String d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && lt.class == obj.getClass()) {
            lt ltVar = (lt) obj;
            if (Objects.equals(this.f40272a, ltVar.f40272a) && Objects.equals(this.f40274c, ltVar.f40274c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f40272a, this.f40274c);
    }
}
