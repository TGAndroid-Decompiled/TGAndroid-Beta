package org.telegram.ui;

import j$.util.Objects;
public final class ez0 extends rg.a {
    public final org.telegram.messenger.qv f45462c;
    public final String d;

    public ez0(int i7) {
        super(i7, false);
        this.f45462c = null;
    }

    public final boolean equals(Object obj) {
        org.telegram.messenger.qv qvVar;
        if (this == obj) {
            return true;
        }
        if (obj == null || ez0.class != obj.getClass()) {
            return false;
        }
        ez0 ez0Var = (ez0) obj;
        if (this.f54543a != ez0Var.f54543a) {
            return false;
        }
        String str = this.d;
        if (str != null) {
            return Objects.equals(str, ez0Var.d);
        }
        org.telegram.messenger.qv qvVar2 = this.f45462c;
        if (qvVar2 == null || (qvVar = ez0Var.f45462c) == null || qvVar2.d == qvVar.d) {
            return true;
        }
        return false;
    }

    public ez0(org.telegram.messenger.qv qvVar) {
        super(2, false);
        this.f45462c = qvVar;
    }

    public ez0(int i7, String str) {
        super(i7, false);
        this.d = str;
        this.f45462c = null;
    }
}
