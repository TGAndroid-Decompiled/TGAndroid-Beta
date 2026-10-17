package org.telegram.ui;

import j$.util.Objects;
public final class kt {
    public String f38677a;
    public String f38678b;
    public String f38679c;
    public String d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && kt.class == obj.getClass()) {
            kt ktVar = (kt) obj;
            if (Objects.equals(this.f38677a, ktVar.f38677a) && Objects.equals(this.f38679c, ktVar.f38679c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f38677a, this.f38679c);
    }
}
