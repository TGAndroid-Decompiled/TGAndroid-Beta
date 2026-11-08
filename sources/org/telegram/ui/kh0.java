package org.telegram.ui;

import j$.util.Objects;
public final class kh0 extends rg.a {
    public int f47196c;
    public int d;
    public CharSequence f47197e;
    public CharSequence f47198f;
    public oh0 f47199g;
    public int h;
    public boolean f47200i;

    public static kh0 b(int i7, String str, boolean z9) {
        ?? aVar = new rg.a(1, true);
        aVar.f47196c = i7;
        aVar.f47197e = str;
        aVar.f47200i = z9;
        return aVar;
    }

    public static kh0 c(int i7, String str, String str2) {
        ?? aVar = new rg.a(5, true);
        aVar.f47196c = i7;
        aVar.f47197e = str;
        aVar.f47198f = str2;
        return aVar;
    }

    public static kh0 d(int i7, String str) {
        ?? aVar = new rg.a(4, true);
        aVar.f47196c = i7;
        aVar.f47197e = str;
        return aVar;
    }

    @Override
    public final boolean a(rg.a aVar) {
        if (this != aVar) {
            if (kh0.class == aVar.getClass()) {
                kh0 kh0Var = (kh0) aVar;
                if (this.f47196c == kh0Var.f47196c && this.d == kh0Var.d && this.h == kh0Var.h && this.f47200i == kh0Var.f47200i && Objects.equals(this.f47197e, kh0Var.f47197e) && Objects.equals(this.f47198f, kh0Var.f47198f) && this.f47199g == kh0Var.f47199g) {
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
        if (obj != null && kh0.class == obj.getClass()) {
            kh0 kh0Var = (kh0) obj;
            if (this.f47196c == kh0Var.f47196c && this.h == kh0Var.h && ((this.f54531a == 8 || (this.d == kh0Var.d && Objects.equals(this.f47197e, kh0Var.f47197e) && (this.f54531a == 6 || Objects.equals(this.f47198f, kh0Var.f47198f)))) && this.f47199g == kh0Var.f47199g)) {
                return true;
            }
        }
        return false;
    }
}
