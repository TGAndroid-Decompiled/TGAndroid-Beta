package org.telegram.ui;

import j$.util.Objects;
public final class j extends wf.a {
    public final CharSequence f39327c;
    public final int d;

    public j(int i9, int i10, String str) {
        super(i9, false);
        this.d = i10;
        this.f39327c = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && j.class == obj.getClass()) {
                j jVar = (j) obj;
                if (this.d == jVar.d && Objects.equals(this.f39327c, jVar.f39327c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }
}
