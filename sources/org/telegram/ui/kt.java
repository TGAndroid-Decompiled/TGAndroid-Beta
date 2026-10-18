package org.telegram.ui;

import j$.util.Objects;
public final class kt {
    public String f38624a;
    public String f38625b;
    public String f38626c;
    public String d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && kt.class == obj.getClass()) {
            kt ktVar = (kt) obj;
            if (Objects.equals(this.f38624a, ktVar.f38624a) && Objects.equals(this.f38626c, ktVar.f38626c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f38624a, this.f38626c);
    }
}
