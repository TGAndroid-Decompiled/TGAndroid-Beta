package org.telegram.ui;

import j$.util.Objects;
public final class ht {
    public String f37806a;
    public String f37807b;
    public String f37808c;
    public String d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ht.class == obj.getClass()) {
            ht htVar = (ht) obj;
            if (Objects.equals(this.f37806a, htVar.f37806a) && Objects.equals(this.f37808c, htVar.f37808c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f37806a, this.f37808c);
    }
}
