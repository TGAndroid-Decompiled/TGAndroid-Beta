package org.telegram.ui;

import j$.util.Objects;
public final class lk0 extends og.a {
    public int f38280c;
    public int d;
    public CharSequence f38281e;
    public CharSequence f38282f;
    public rk0 f38283g;
    public int h;
    public boolean f38284i;

    public static lk0 b(int i10, String str, boolean z10) {
        ?? aVar = new og.a(1, true);
        aVar.f38280c = i10;
        aVar.f38281e = str;
        aVar.f38284i = z10;
        return aVar;
    }

    public static lk0 c(int i10, String str, String str2) {
        ?? aVar = new og.a(5, true);
        aVar.f38280c = i10;
        aVar.f38281e = str;
        aVar.f38282f = str2;
        return aVar;
    }

    public static lk0 d(int i10, String str) {
        ?? aVar = new og.a(4, true);
        aVar.f38280c = i10;
        aVar.f38281e = str;
        return aVar;
    }

    @Override
    public final boolean a(og.a aVar) {
        if (this != aVar) {
            if (lk0.class == aVar.getClass()) {
                lk0 lk0Var = (lk0) aVar;
                if (this.f38280c == lk0Var.f38280c && this.d == lk0Var.d && this.h == lk0Var.h && this.f38284i == lk0Var.f38284i && Objects.equals(this.f38281e, lk0Var.f38281e) && Objects.equals(this.f38282f, lk0Var.f38282f) && this.f38283g == lk0Var.f38283g) {
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
            if (this.f38280c == lk0Var.f38280c && this.h == lk0Var.h && ((this.f17183a == 8 || (this.d == lk0Var.d && Objects.equals(this.f38281e, lk0Var.f38281e) && (this.f17183a == 6 || Objects.equals(this.f38282f, lk0Var.f38282f)))) && this.f38283g == lk0Var.f38283g)) {
                return true;
            }
        }
        return false;
    }
}
