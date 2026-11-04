package org.telegram.ui;

import j$.util.Objects;
public final class ks {
    public String f47004a;
    public String f47005b;
    public String f47006c;
    public String d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ks.class == obj.getClass()) {
            ks ksVar = (ks) obj;
            if (Objects.equals(this.f47004a, ksVar.f47004a) && Objects.equals(this.f47006c, ksVar.f47006c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f47004a, this.f47006c);
    }
}
