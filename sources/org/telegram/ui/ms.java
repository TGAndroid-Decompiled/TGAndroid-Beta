package org.telegram.ui;

import j$.util.Objects;
public final class ms {
    public String f47869a;
    public String f47870b;
    public String f47871c;
    public String d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ms.class == obj.getClass()) {
            ms msVar = (ms) obj;
            if (Objects.equals(this.f47869a, msVar.f47869a) && Objects.equals(this.f47871c, msVar.f47871c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f47869a, this.f47871c);
    }
}
