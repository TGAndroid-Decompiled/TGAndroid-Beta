package org.telegram.ui;

import j$.util.Objects;
public final class ht {
    public String f37783a;
    public String f37784b;
    public String f37785c;
    public String d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ht.class == obj.getClass()) {
            ht htVar = (ht) obj;
            if (Objects.equals(this.f37783a, htVar.f37783a) && Objects.equals(this.f37785c, htVar.f37785c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f37783a, this.f37785c);
    }
}
