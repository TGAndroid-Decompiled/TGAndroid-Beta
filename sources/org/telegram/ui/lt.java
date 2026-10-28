package org.telegram.ui;

import j$.util.Objects;
public final class lt {
    public String f41258a;
    public String f41259b;
    public String f41260c;
    public String d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && lt.class == obj.getClass()) {
            lt ltVar = (lt) obj;
            if (Objects.equals(this.f41258a, ltVar.f41258a) && Objects.equals(this.f41260c, ltVar.f41260c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f41258a, this.f41260c);
    }
}
