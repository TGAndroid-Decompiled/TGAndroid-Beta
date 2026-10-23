package org.telegram.ui;

import j$.util.Objects;
public final class ht {
    public String f37788a;
    public String f37789b;
    public String f37790c;
    public String d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ht.class == obj.getClass()) {
            ht htVar = (ht) obj;
            if (Objects.equals(this.f37788a, htVar.f37788a) && Objects.equals(this.f37790c, htVar.f37790c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f37788a, this.f37790c);
    }
}
