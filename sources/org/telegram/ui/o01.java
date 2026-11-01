package org.telegram.ui;

import j$.util.Objects;
public final class o01 extends hg.b {
    public final org.telegram.messenger.cw f40002c;
    public final String d;

    public o01(int i10) {
        super(i10, false);
        this.f40002c = null;
    }

    public final boolean equals(Object obj) {
        org.telegram.messenger.cw cwVar;
        if (this == obj) {
            return true;
        }
        if (obj == null || o01.class != obj.getClass()) {
            return false;
        }
        o01 o01Var = (o01) obj;
        if (this.f7681a != o01Var.f7681a) {
            return false;
        }
        String str = this.d;
        if (str != null) {
            return Objects.equals(str, o01Var.d);
        }
        org.telegram.messenger.cw cwVar2 = this.f40002c;
        if (cwVar2 == null || (cwVar = o01Var.f40002c) == null || cwVar2.d == cwVar.d) {
            return true;
        }
        return false;
    }

    public o01(org.telegram.messenger.cw cwVar) {
        super(2, false);
        this.f40002c = cwVar;
    }

    public o01(int i10, String str) {
        super(i10, false);
        this.d = str;
        this.f40002c = null;
    }
}
