package org.telegram.ui;

import j$.util.Objects;
public final class nk0 extends og.a {
    public int f35997c;
    public int d;
    public CharSequence e;
    public CharSequence f35998f;
    public tk0 f35999g;
    public int h;
    public boolean f36000i;

    public static nk0 b(int i10, String str, boolean z10) {
        ?? aVar = new og.a(1, true);
        aVar.f35997c = i10;
        aVar.e = str;
        aVar.f36000i = z10;
        return aVar;
    }

    public static nk0 c(int i10, String str, String str2) {
        ?? aVar = new og.a(5, true);
        aVar.f35997c = i10;
        aVar.e = str;
        aVar.f35998f = str2;
        return aVar;
    }

    public static nk0 d(int i10, String str) {
        ?? aVar = new og.a(4, true);
        aVar.f35997c = i10;
        aVar.e = str;
        return aVar;
    }

    @Override
    public final boolean a(og.a aVar) {
        if (this != aVar) {
            if (nk0.class == aVar.getClass()) {
                nk0 nk0Var = (nk0) aVar;
                if (this.f35997c == nk0Var.f35997c && this.d == nk0Var.d && this.h == nk0Var.h && this.f36000i == nk0Var.f36000i && Objects.equals(this.e, nk0Var.e) && Objects.equals(this.f35998f, nk0Var.f35998f) && this.f35999g == nk0Var.f35999g) {
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
        if (obj != null && nk0.class == obj.getClass()) {
            nk0 nk0Var = (nk0) obj;
            if (this.f35997c == nk0Var.f35997c && this.h == nk0Var.h && ((this.f15533a == 8 || (this.d == nk0Var.d && Objects.equals(this.e, nk0Var.e) && (this.f15533a == 6 || Objects.equals(this.f35998f, nk0Var.f35998f)))) && this.f35999g == nk0Var.f35999g)) {
                return true;
            }
        }
        return false;
    }
}
