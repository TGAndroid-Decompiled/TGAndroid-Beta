package org.telegram.ui;

import j$.util.Objects;
public final class ms {
    public String f47870a;
    public String f47871b;
    public String f47872c;
    public String d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ms.class == obj.getClass()) {
            ms msVar = (ms) obj;
            if (Objects.equals(this.f47870a, msVar.f47870a) && Objects.equals(this.f47872c, msVar.f47872c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f47870a, this.f47872c);
    }
}
