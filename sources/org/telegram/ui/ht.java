package org.telegram.ui;

import j$.util.Objects;
public final class ht {
    public String f37784a;
    public String f37785b;
    public String f37786c;
    public String d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ht.class == obj.getClass()) {
            ht htVar = (ht) obj;
            if (Objects.equals(this.f37784a, htVar.f37784a) && Objects.equals(this.f37786c, htVar.f37786c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f37784a, this.f37786c);
    }
}
