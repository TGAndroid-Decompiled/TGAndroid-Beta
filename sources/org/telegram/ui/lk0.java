package org.telegram.ui;

import j$.util.Objects;
public final class lk0 extends og.a {
    public int f38285c;
    public int d;
    public CharSequence f38286e;
    public CharSequence f38287f;
    public rk0 f38288g;
    public int h;
    public boolean f38289i;

    public static lk0 b(int i10, String str, boolean z10) {
        ?? aVar = new og.a(1, true);
        aVar.f38285c = i10;
        aVar.f38286e = str;
        aVar.f38289i = z10;
        return aVar;
    }

    public static lk0 c(int i10, String str, String str2) {
        ?? aVar = new og.a(5, true);
        aVar.f38285c = i10;
        aVar.f38286e = str;
        aVar.f38287f = str2;
        return aVar;
    }

    public static lk0 d(int i10, String str) {
        ?? aVar = new og.a(4, true);
        aVar.f38285c = i10;
        aVar.f38286e = str;
        return aVar;
    }

    @Override
    public final boolean a(og.a aVar) {
        if (this != aVar) {
            if (lk0.class == aVar.getClass()) {
                lk0 lk0Var = (lk0) aVar;
                if (this.f38285c == lk0Var.f38285c && this.d == lk0Var.d && this.h == lk0Var.h && this.f38289i == lk0Var.f38289i && Objects.equals(this.f38286e, lk0Var.f38286e) && Objects.equals(this.f38287f, lk0Var.f38287f) && this.f38288g == lk0Var.f38288g) {
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
        if (obj != null && lk0.class == obj.getClass()) {
            lk0 lk0Var = (lk0) obj;
            if (this.f38285c == lk0Var.f38285c && this.h == lk0Var.h && ((this.f17187a == 8 || (this.d == lk0Var.d && Objects.equals(this.f38286e, lk0Var.f38286e) && (this.f17187a == 6 || Objects.equals(this.f38287f, lk0Var.f38287f)))) && this.f38288g == lk0Var.f38288g)) {
                return true;
            }
        }
        return false;
    }
}
