package org.telegram.ui;

import j$.util.Objects;
public final class cz0 extends rg.a {
    public final org.telegram.messenger.kv f46782c;
    public final String d;

    public cz0(int i7) {
        super(i7, false);
        this.f46782c = null;
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
        if (this.f56589a != cz0Var.f56589a) {
            return false;
        }
        String str = this.d;
        if (str != null) {
            return Objects.equals(str, cz0Var.d);
        }
        org.telegram.messenger.kv kvVar2 = this.f46782c;
        if (kvVar2 == null || (kvVar = cz0Var.f46782c) == null || kvVar2.d == kvVar.d) {
            return true;
        }
        return false;
    }

    public cz0(org.telegram.messenger.kv kvVar) {
        super(2, false);
        this.f46782c = kvVar;
    }

    public cz0(int i7, String str) {
        super(i7, false);
        this.d = str;
        this.f46782c = null;
    }
}
