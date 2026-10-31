package org.telegram.ui;

import j$.util.Objects;
public final class nt {
    public String f40047a;
    public String f40048b;
    public String f40049c;
    public String d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && nt.class == obj.getClass()) {
            nt ntVar = (nt) obj;
            if (Objects.equals(this.f40047a, ntVar.f40047a) && Objects.equals(this.f40049c, ntVar.f40049c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f40047a, this.f40049c);
    }
}
