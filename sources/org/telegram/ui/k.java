package org.telegram.ui;

import j$.util.Objects;

public final class k extends xf.a {

    public final CharSequence f39550c;
    public final int d;

    public k(int i10, int i11, String str) {
        super(i10, false);
        this.d = i11;
        this.f39550c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k.class != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        return this.d == kVar.d && Objects.equals(this.f39550c, kVar.f39550c);
    }
}
