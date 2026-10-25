package org.telegram.ui;

import j$.util.Objects;
public final class jt {
    public String f40740a;
    public String f40741b;
    public String f40742c;
    public String d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && jt.class == obj.getClass()) {
            jt jtVar = (jt) obj;
            if (Objects.equals(this.f40740a, jtVar.f40740a) && Objects.equals(this.f40742c, jtVar.f40742c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f40740a, this.f40742c);
    }
}
