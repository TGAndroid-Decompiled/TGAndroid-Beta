package org.telegram.ui;

import j$.util.Objects;
public final class lk0 extends og.a {
    public int f38279c;
    public int d;
    public CharSequence f38280e;
    public CharSequence f38281f;
    public rk0 f38282g;
    public int h;
    public boolean f38283i;

    public static lk0 b(int i10, String str, boolean z10) {
        ?? aVar = new og.a(1, true);
        aVar.f38279c = i10;
        aVar.f38280e = str;
        aVar.f38283i = z10;
        return aVar;
    }

    public static lk0 c(int i10, String str, String str2) {
        ?? aVar = new og.a(5, true);
        aVar.f38279c = i10;
        aVar.f38280e = str;
        aVar.f38281f = str2;
        return aVar;
    }

    public static lk0 d(int i10, String str) {
        ?? aVar = new og.a(4, true);
        aVar.f38279c = i10;
        aVar.f38280e = str;
        return aVar;
    }

    @Override
    public final boolean a(og.a aVar) {
        if (this != aVar) {
            if (lk0.class == aVar.getClass()) {
                lk0 lk0Var = (lk0) aVar;
                if (this.f38279c == lk0Var.f38279c && this.d == lk0Var.d && this.h == lk0Var.h && this.f38283i == lk0Var.f38283i && Objects.equals(this.f38280e, lk0Var.f38280e) && Objects.equals(this.f38281f, lk0Var.f38281f) && this.f38282g == lk0Var.f38282g) {
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
            if (this.f38279c == lk0Var.f38279c && this.h == lk0Var.h && ((this.f17182a == 8 || (this.d == lk0Var.d && Objects.equals(this.f38280e, lk0Var.f38280e) && (this.f17182a == 6 || Objects.equals(this.f38281f, lk0Var.f38281f)))) && this.f38282g == lk0Var.f38282g)) {
                return true;
            }
        }
        return false;
    }
}
