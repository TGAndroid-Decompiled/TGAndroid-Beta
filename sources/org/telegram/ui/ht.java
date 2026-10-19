package org.telegram.ui;

import j$.util.Objects;
public final class ht {
    public String f37777a;
    public String f37778b;
    public String f37779c;
    public String d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ht.class == obj.getClass()) {
            ht htVar = (ht) obj;
            if (Objects.equals(this.f37777a, htVar.f37777a) && Objects.equals(this.f37779c, htVar.f37779c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f37777a, this.f37779c);
    }
}
