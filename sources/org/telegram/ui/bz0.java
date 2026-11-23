package org.telegram.ui;

import j$.util.Objects;
public final class bz0 extends rg.a {
    public final org.telegram.messenger.kv f46674c;
    public final String d;

    public bz0(int i7) {
        super(i7, false);
        this.f46674c = null;
    }

    public final boolean equals(Object obj) {
        org.telegram.messenger.kv kvVar;
        if (this == obj) {
            return true;
        }
        if (obj == null || bz0.class != obj.getClass()) {
            return false;
        }
        bz0 bz0Var = (bz0) obj;
        if (this.f56712a != bz0Var.f56712a) {
            return false;
        }
        String str = this.d;
        if (str != null) {
            return Objects.equals(str, bz0Var.d);
        }
        org.telegram.messenger.kv kvVar2 = this.f46674c;
        if (kvVar2 == null || (kvVar = bz0Var.f46674c) == null || kvVar2.d == kvVar.d) {
            return true;
        }
        return false;
    }

    public bz0(org.telegram.messenger.kv kvVar) {
        super(2, false);
        this.f46674c = kvVar;
    }

    public bz0(int i7, String str) {
        super(i7, false);
        this.d = str;
        this.f46674c = null;
    }
}
