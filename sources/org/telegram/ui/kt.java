package org.telegram.ui;

import j$.util.Objects;
public final class kt {
    public String f38669a;
    public String f38670b;
    public String f38671c;
    public String d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && kt.class == obj.getClass()) {
            kt ktVar = (kt) obj;
            if (Objects.equals(this.f38669a, ktVar.f38669a) && Objects.equals(this.f38671c, ktVar.f38671c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f38669a, this.f38671c);
    }
}
