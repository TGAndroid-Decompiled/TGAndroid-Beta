package org.telegram.ui;

import j$.util.Objects;
public final class ht {
    public String f37787a;
    public String f37788b;
    public String f37789c;
    public String d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ht.class == obj.getClass()) {
            ht htVar = (ht) obj;
            if (Objects.equals(this.f37787a, htVar.f37787a) && Objects.equals(this.f37789c, htVar.f37789c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f37787a, this.f37789c);
    }
}
