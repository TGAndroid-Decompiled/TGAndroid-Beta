package org.telegram.ui;

import j$.util.Objects;
public final class nk0 extends og.a {
    public int f40304c;
    public int d;
    public CharSequence f40305e;
    public CharSequence f40306f;
    public uk0 f40307g;
    public int h;
    public boolean f40308i;

    public static nk0 b(int i10, String str, boolean z10) {
        ?? aVar = new og.a(1, true);
        aVar.f40304c = i10;
        aVar.f40305e = str;
        aVar.f40308i = z10;
        return aVar;
    }

    public static nk0 c(int i10, String str, String str2) {
        ?? aVar = new og.a(5, true);
        aVar.f40304c = i10;
        aVar.f40305e = str;
        aVar.f40306f = str2;
        return aVar;
    }

    public static nk0 d(int i10, String str) {
        ?? aVar = new og.a(4, true);
        aVar.f40304c = i10;
        aVar.f40305e = str;
        return aVar;
    }

    @Override
    public final boolean a(og.a aVar) {
        if (this != aVar) {
            if (nk0.class == aVar.getClass()) {
                nk0 nk0Var = (nk0) aVar;
                if (this.f40304c == nk0Var.f40304c && this.d == nk0Var.d && this.h == nk0Var.h && this.f40308i == nk0Var.f40308i && Objects.equals(this.f40305e, nk0Var.f40305e) && Objects.equals(this.f40306f, nk0Var.f40306f) && this.f40307g == nk0Var.f40307g) {
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
            if (this.f40304c == nk0Var.f40304c && this.h == nk0Var.h && ((this.f17211a == 8 || (this.d == nk0Var.d && Objects.equals(this.f40305e, nk0Var.f40305e) && (this.f17211a == 6 || Objects.equals(this.f40306f, nk0Var.f40306f)))) && this.f40307g == nk0Var.f40307g)) {
                return true;
            }
        }
        return false;
    }
}
