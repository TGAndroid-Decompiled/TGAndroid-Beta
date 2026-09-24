package org.telegram.ui;

import j$.util.Objects;
public final class hk0 extends og.a {
    public int f34230c;
    public int d;
    public CharSequence e;
    public CharSequence f34231f;
    public nk0 f34232g;
    public int h;
    public boolean f34233i;

    public static hk0 b(int i10, String str, boolean z10) {
        ?? aVar = new og.a(1, true);
        aVar.f34230c = i10;
        aVar.e = str;
        aVar.f34233i = z10;
        return aVar;
    }

    public static hk0 c(int i10, String str, String str2) {
        ?? aVar = new og.a(5, true);
        aVar.f34230c = i10;
        aVar.e = str;
        aVar.f34231f = str2;
        return aVar;
    }

    public static hk0 d(int i10, String str) {
        ?? aVar = new og.a(4, true);
        aVar.f34230c = i10;
        aVar.e = str;
        return aVar;
    }

    @Override
    public final boolean a(og.a aVar) {
        if (this != aVar) {
            if (hk0.class == aVar.getClass()) {
                hk0 hk0Var = (hk0) aVar;
                if (this.f34230c == hk0Var.f34230c && this.d == hk0Var.d && this.h == hk0Var.h && this.f34233i == hk0Var.f34233i && Objects.equals(this.e, hk0Var.e) && Objects.equals(this.f34231f, hk0Var.f34231f) && this.f34232g == hk0Var.f34232g) {
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
            if (this.f34230c == hk0Var.f34230c && this.h == hk0Var.h && ((this.f15700a == 8 || (this.d == hk0Var.d && Objects.equals(this.e, hk0Var.e) && (this.f15700a == 6 || Objects.equals(this.f34231f, hk0Var.f34231f)))) && this.f34232g == hk0Var.f34232g)) {
                return true;
            }
        }
        return false;
    }
}
