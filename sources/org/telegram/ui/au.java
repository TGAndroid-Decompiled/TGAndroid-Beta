package org.telegram.ui;

import j$.util.Objects;
public final class au {
    public String f34339a;
    public String f34340b;
    public String f34341c;
    public String d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && au.class == obj.getClass()) {
            au auVar = (au) obj;
            if (Objects.equals(this.f34339a, auVar.f34339a) && Objects.equals(this.f34341c, auVar.f34341c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f34339a, this.f34341c);
    }
}
