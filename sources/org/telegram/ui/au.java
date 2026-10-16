package org.telegram.ui;

import j$.util.Objects;
public final class au {
    public String f34084a;
    public String f34085b;
    public String f34086c;
    public String d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && au.class == obj.getClass()) {
            au auVar = (au) obj;
            if (Objects.equals(this.f34084a, auVar.f34084a) && Objects.equals(this.f34086c, auVar.f34086c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f34084a, this.f34086c);
    }
}
