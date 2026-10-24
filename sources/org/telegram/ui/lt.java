package org.telegram.ui;

import j$.util.Objects;
public final class lt {
    public String f39375a;
    public String f39376b;
    public String f39377c;
    public String d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && lt.class == obj.getClass()) {
            lt ltVar = (lt) obj;
            if (Objects.equals(this.f39375a, ltVar.f39375a) && Objects.equals(this.f39377c, ltVar.f39377c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f39375a, this.f39377c);
    }
}
