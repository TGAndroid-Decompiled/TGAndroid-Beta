package org.telegram.ui;

import j$.util.Objects;
public final class dz0 extends rg.a {
    public final org.telegram.messenger.qv f45134c;
    public final String d;

    public dz0(int i7) {
        super(i7, false);
        this.f45134c = null;
    }

    public final boolean equals(Object obj) {
        org.telegram.messenger.qv qvVar;
        if (this == obj) {
            return true;
        }
        if (obj == null || dz0.class != obj.getClass()) {
            return false;
        }
        dz0 dz0Var = (dz0) obj;
        if (this.f54544a != dz0Var.f54544a) {
            return false;
        }
        String str = this.d;
        if (str != null) {
            return Objects.equals(str, dz0Var.d);
        }
        org.telegram.messenger.qv qvVar2 = this.f45134c;
        if (qvVar2 == null || (qvVar = dz0Var.f45134c) == null || qvVar2.d == qvVar.d) {
            return true;
        }
        return false;
    }

    public dz0(org.telegram.messenger.qv qvVar) {
        super(2, false);
        this.f45134c = qvVar;
    }

    public dz0(int i7, String str) {
        super(i7, false);
        this.d = str;
        this.f45134c = null;
    }
}
