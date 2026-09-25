package org.telegram.ui;

import j$.util.Objects;
public final class hk0 extends og.a {
    public int f34244c;
    public int d;
    public CharSequence e;
    public CharSequence f34245f;
    public nk0 f34246g;
    public int h;
    public boolean f34247i;

    public static hk0 b(int i10, String str, boolean z10) {
        ?? aVar = new og.a(1, true);
        aVar.f34244c = i10;
        aVar.e = str;
        aVar.f34247i = z10;
        return aVar;
    }

    public static hk0 c(int i10, String str, String str2) {
        ?? aVar = new og.a(5, true);
        aVar.f34244c = i10;
        aVar.e = str;
        aVar.f34245f = str2;
        return aVar;
    }

    public static hk0 d(int i10, String str) {
        ?? aVar = new og.a(4, true);
        aVar.f34244c = i10;
        aVar.e = str;
        return aVar;
    }

    @Override
    public final boolean a(og.a aVar) {
        if (this != aVar) {
            if (hk0.class == aVar.getClass()) {
                hk0 hk0Var = (hk0) aVar;
                if (this.f34244c == hk0Var.f34244c && this.d == hk0Var.d && this.h == hk0Var.h && this.f34247i == hk0Var.f34247i && Objects.equals(this.e, hk0Var.e) && Objects.equals(this.f34245f, hk0Var.f34245f) && this.f34246g == hk0Var.f34246g) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && hk0.class == obj.getClass()) {
            hk0 hk0Var = (hk0) obj;
            if (this.f34244c == hk0Var.f34244c && this.h == hk0Var.h && ((this.f15715a == 8 || (this.d == hk0Var.d && Objects.equals(this.e, hk0Var.e) && (this.f15715a == 6 || Objects.equals(this.f34245f, hk0Var.f34245f)))) && this.f34246g == hk0Var.f34246g)) {
                return true;
            }
        }
        return false;
    }
}
