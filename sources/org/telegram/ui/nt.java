package org.telegram.ui;

import j$.util.Objects;

public final class nt {

    public String f40915a;

    public String f40916b;

    public String f40917c;
    public String d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && nt.class == obj.getClass()) {
            nt ntVar = (nt) obj;
            if (Objects.equals(this.f40915a, ntVar.f40915a) && Objects.equals(this.f40917c, ntVar.f40917c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f40915a, this.f40917c);
    }
}
