package org.telegram.ui;

import j$.util.Objects;
public final class cz0 extends rg.a {
    public final org.telegram.messenger.lv f46841c;
    public final String d;

    public cz0(int i7) {
        super(i7, false);
        this.f46841c = null;
    }

    public final boolean equals(Object obj) {
        org.telegram.messenger.lv lvVar;
        if (this == obj) {
            return true;
        }
        if (obj == null || cz0.class != obj.getClass()) {
            return false;
        }
        cz0 cz0Var = (cz0) obj;
        if (this.f56634a != cz0Var.f56634a) {
            return false;
        }
        String str = this.d;
        if (str != null) {
            return Objects.equals(str, cz0Var.d);
        }
        org.telegram.messenger.lv lvVar2 = this.f46841c;
        if (lvVar2 == null || (lvVar = cz0Var.f46841c) == null || lvVar2.d == lvVar.d) {
            return true;
        }
        return false;
    }

    public cz0(org.telegram.messenger.lv lvVar) {
        super(2, false);
        this.f46841c = lvVar;
    }

    public cz0(int i7, String str) {
        super(i7, false);
        this.d = str;
        this.f46841c = null;
    }
}
