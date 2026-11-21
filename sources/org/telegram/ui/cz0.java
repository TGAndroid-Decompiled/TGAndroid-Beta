package org.telegram.ui;

import j$.util.Objects;
public final class cz0 extends rg.a {
    public final org.telegram.messenger.kv f46838c;
    public final String d;

    public cz0(int i7) {
        super(i7, false);
        this.f46838c = null;
    }

    public final boolean equals(Object obj) {
        org.telegram.messenger.kv kvVar;
        if (this == obj) {
            return true;
        }
        if (obj == null || cz0.class != obj.getClass()) {
            return false;
        }
        cz0 cz0Var = (cz0) obj;
        if (this.f56630a != cz0Var.f56630a) {
            return false;
        }
        String str = this.d;
        if (str != null) {
            return Objects.equals(str, cz0Var.d);
        }
        org.telegram.messenger.kv kvVar2 = this.f46838c;
        if (kvVar2 == null || (kvVar = cz0Var.f46838c) == null || kvVar2.d == kvVar.d) {
            return true;
        }
        return false;
    }

    public cz0(org.telegram.messenger.kv kvVar) {
        super(2, false);
        this.f46838c = kvVar;
    }

    public cz0(int i7, String str) {
        super(i7, false);
        this.d = str;
        this.f46838c = null;
    }
}
