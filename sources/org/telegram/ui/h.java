package org.telegram.ui;

import j$.util.Objects;
public final class h extends hg.b {
    public final CharSequence f37674c;
    public final int d;

    public h(int i10, int i11, String str) {
        super(i10, false);
        this.d = i11;
        this.f37674c = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && h.class == obj.getClass()) {
                h hVar = (h) obj;
                if (this.d == hVar.d && Objects.equals(this.f37674c, hVar.f37674c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }
}
