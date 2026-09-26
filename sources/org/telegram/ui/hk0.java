package org.telegram.ui;

import j$.util.Objects;
public final class hk0 extends og.a {
    public int f34242c;
    public int d;
    public CharSequence e;
    public CharSequence f34243f;
    public nk0 f34244g;
    public int h;
    public boolean f34245i;

    public static hk0 b(int i10, String str, boolean z10) {
        ?? aVar = new og.a(1, true);
        aVar.f34242c = i10;
        aVar.e = str;
        aVar.f34245i = z10;
        return aVar;
    }

    public static hk0 c(int i10, String str, String str2) {
        ?? aVar = new og.a(5, true);
        aVar.f34242c = i10;
        aVar.e = str;
        aVar.f34243f = str2;
        return aVar;
    }

    public static hk0 d(int i10, String str) {
        ?? aVar = new og.a(4, true);
        aVar.f34242c = i10;
        aVar.e = str;
        return aVar;
    }

    @Override
    public final boolean a(og.a aVar) {
        if (this != aVar) {
            if (hk0.class == aVar.getClass()) {
                hk0 hk0Var = (hk0) aVar;
                if (this.f34242c == hk0Var.f34242c && this.d == hk0Var.d && this.h == hk0Var.h && this.f34245i == hk0Var.f34245i && Objects.equals(this.e, hk0Var.e) && Objects.equals(this.f34243f, hk0Var.f34243f) && this.f34244g == hk0Var.f34244g) {
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
            if (this.f34242c == hk0Var.f34242c && this.h == hk0Var.h && ((this.f15715a == 8 || (this.d == hk0Var.d && Objects.equals(this.e, hk0Var.e) && (this.f15715a == 6 || Objects.equals(this.f34243f, hk0Var.f34243f)))) && this.f34244g == hk0Var.f34244g)) {
                return true;
            }
        }
        return false;
    }
}
