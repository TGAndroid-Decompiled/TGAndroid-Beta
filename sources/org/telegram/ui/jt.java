package org.telegram.ui;

import j$.util.Objects;
public final class jt {
    public String f40743a;
    public String f40744b;
    public String f40745c;
    public String d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && jt.class == obj.getClass()) {
            jt jtVar = (jt) obj;
            if (Objects.equals(this.f40743a, jtVar.f40743a) && Objects.equals(this.f40745c, jtVar.f40745c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f40743a, this.f40745c);
    }
}
