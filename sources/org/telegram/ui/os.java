package org.telegram.ui;

import j$.util.Objects;
public final class os {
    public String f48510a;
    public String f48511b;
    public String f48512c;
    public String d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && os.class == obj.getClass()) {
            os osVar = (os) obj;
            if (Objects.equals(this.f48510a, osVar.f48510a) && Objects.equals(this.f48512c, osVar.f48512c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f48510a, this.f48512c);
    }
}
