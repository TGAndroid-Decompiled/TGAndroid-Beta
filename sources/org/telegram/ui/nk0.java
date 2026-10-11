package org.telegram.ui;

import j$.util.Objects;
public final class nk0 extends og.a {
    public int f40270c;
    public int d;
    public CharSequence f40271e;
    public CharSequence f40272f;
    public uk0 f40273g;
    public int h;
    public boolean f40274i;

    public static nk0 b(int i10, String str, boolean z10) {
        ?? aVar = new og.a(1, true);
        aVar.f40270c = i10;
        aVar.f40271e = str;
        aVar.f40274i = z10;
        return aVar;
    }

    public static nk0 c(int i10, String str, String str2) {
        ?? aVar = new og.a(5, true);
        aVar.f40270c = i10;
        aVar.f40271e = str;
        aVar.f40272f = str2;
        return aVar;
    }

    public static nk0 d(int i10, String str) {
        ?? aVar = new og.a(4, true);
        aVar.f40270c = i10;
        aVar.f40271e = str;
        return aVar;
    }

    @Override
    public final boolean a(og.a aVar) {
        if (this != aVar) {
            if (nk0.class == aVar.getClass()) {
                nk0 nk0Var = (nk0) aVar;
                if (this.f40270c == nk0Var.f40270c && this.d == nk0Var.d && this.h == nk0Var.h && this.f40274i == nk0Var.f40274i && Objects.equals(this.f40271e, nk0Var.f40271e) && Objects.equals(this.f40272f, nk0Var.f40272f) && this.f40273g == nk0Var.f40273g) {
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
            if (this.f40270c == nk0Var.f40270c && this.h == nk0Var.h && ((this.f17175a == 8 || (this.d == nk0Var.d && Objects.equals(this.f40271e, nk0Var.f40271e) && (this.f17175a == 6 || Objects.equals(this.f40272f, nk0Var.f40272f)))) && this.f40273g == nk0Var.f40273g)) {
                return true;
            }
        }
        return false;
    }
}
