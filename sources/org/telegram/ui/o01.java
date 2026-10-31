package org.telegram.ui;

import j$.util.Objects;
public final class o01 extends hg.b {
    public final org.telegram.messenger.bw f40090c;
    public final String d;

    public o01(int i10) {
        super(i10, false);
        this.f40090c = null;
    }

    public final boolean equals(Object obj) {
        org.telegram.messenger.bw bwVar;
        if (this == obj) {
            return true;
        }
        if (obj == null || o01.class != obj.getClass()) {
            return false;
        }
        o01 o01Var = (o01) obj;
        if (this.f7680a != o01Var.f7680a) {
            return false;
        }
        String str = this.d;
        if (str != null) {
            return Objects.equals(str, o01Var.d);
        }
        org.telegram.messenger.bw bwVar2 = this.f40090c;
        if (bwVar2 == null || (bwVar = o01Var.f40090c) == null || bwVar2.d == bwVar.d) {
            return true;
        }
        return false;
    }

    public o01(org.telegram.messenger.bw bwVar) {
        super(2, false);
        this.f40090c = bwVar;
    }

    public o01(int i10, String str) {
        super(i10, false);
        this.d = str;
        this.f40090c = null;
    }
}
