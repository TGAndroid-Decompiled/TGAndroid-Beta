package org.telegram.ui;

import j$.util.Objects;
public final class ms {
    public String f47842a;
    public String f47843b;
    public String f47844c;
    public String d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ms.class == obj.getClass()) {
            ms msVar = (ms) obj;
            if (Objects.equals(this.f47842a, msVar.f47842a) && Objects.equals(this.f47844c, msVar.f47844c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f47842a, this.f47844c);
    }
}
