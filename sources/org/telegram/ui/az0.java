package org.telegram.ui;

import j$.util.Objects;
public final class az0 extends rg.a {
    public final org.telegram.messenger.qv f44133c;
    public final String d;

    public az0(int i7) {
        super(i7, false);
        this.f44133c = null;
    }

    public final boolean equals(Object obj) {
        org.telegram.messenger.qv qvVar;
        if (this == obj) {
            return true;
        }
        if (obj == null || az0.class != obj.getClass()) {
            return false;
        }
        az0 az0Var = (az0) obj;
        if (this.f54439a != az0Var.f54439a) {
            return false;
        }
        String str = this.d;
        if (str != null) {
            return Objects.equals(str, az0Var.d);
        }
        org.telegram.messenger.qv qvVar2 = this.f44133c;
        if (qvVar2 == null || (qvVar = az0Var.f44133c) == null || qvVar2.d == qvVar.d) {
            return true;
        }
        return false;
    }

    public az0(org.telegram.messenger.qv qvVar) {
        super(2, false);
        this.f44133c = qvVar;
    }

    public az0(int i7, String str) {
        super(i7, false);
        this.d = str;
        this.f44133c = null;
    }
}
