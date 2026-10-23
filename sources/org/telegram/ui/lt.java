package org.telegram.ui;

import j$.util.Objects;
public final class lt {
    public String f39322a;
    public String f39323b;
    public String f39324c;
    public String d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && lt.class == obj.getClass()) {
            lt ltVar = (lt) obj;
            if (Objects.equals(this.f39322a, ltVar.f39322a) && Objects.equals(this.f39324c, ltVar.f39324c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f39322a, this.f39324c);
    }
}
