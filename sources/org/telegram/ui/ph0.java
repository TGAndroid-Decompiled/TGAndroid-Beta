package org.telegram.ui;

import j$.util.Objects;
public final class ph0 extends rg.a {
    public int f50912c;
    public int d;
    public CharSequence f50913e;
    public CharSequence f50914f;
    public th0 f50915g;
    public int h;
    public boolean f50916i;

    public static ph0 b(int i7, String str, boolean z10) {
        ?? aVar = new rg.a(1, true);
        aVar.f50912c = i7;
        aVar.f50913e = str;
        aVar.f50916i = z10;
        return aVar;
    }

    public static ph0 c(int i7, String str, String str2) {
        ?? aVar = new rg.a(5, true);
        aVar.f50912c = i7;
        aVar.f50913e = str;
        aVar.f50914f = str2;
        return aVar;
    }

    public static ph0 d(int i7, String str) {
        ?? aVar = new rg.a(4, true);
        aVar.f50912c = i7;
        aVar.f50913e = str;
        return aVar;
    }

    @Override
    public final boolean a(rg.a aVar) {
        if (this != aVar) {
            if (ph0.class == aVar.getClass()) {
                ph0 ph0Var = (ph0) aVar;
                if (this.f50912c == ph0Var.f50912c && this.d == ph0Var.d && this.h == ph0Var.h && this.f50916i == ph0Var.f50916i && Objects.equals(this.f50913e, ph0Var.f50913e) && Objects.equals(this.f50914f, ph0Var.f50914f) && this.f50915g == ph0Var.f50915g) {
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
        if (obj != null && ph0.class == obj.getClass()) {
            ph0 ph0Var = (ph0) obj;
            if (this.f50912c == ph0Var.f50912c && this.h == ph0Var.h && ((this.f56589a == 8 || (this.d == ph0Var.d && Objects.equals(this.f50913e, ph0Var.f50913e) && (this.f56589a == 6 || Objects.equals(this.f50914f, ph0Var.f50914f)))) && this.f50915g == ph0Var.f50915g)) {
                return true;
            }
        }
        return false;
    }
}
