package org.telegram.ui;

import j$.util.Objects;
public final class lk0 extends og.a {
    public int f38339c;
    public int d;
    public CharSequence f38340e;
    public CharSequence f38341f;
    public rk0 f38342g;
    public int h;
    public boolean f38343i;

    public static lk0 b(int i10, String str, boolean z10) {
        ?? aVar = new og.a(1, true);
        aVar.f38339c = i10;
        aVar.f38340e = str;
        aVar.f38343i = z10;
        return aVar;
    }

    public static lk0 c(int i10, String str, String str2) {
        ?? aVar = new og.a(5, true);
        aVar.f38339c = i10;
        aVar.f38340e = str;
        aVar.f38341f = str2;
        return aVar;
    }

    public static lk0 d(int i10, String str) {
        ?? aVar = new og.a(4, true);
        aVar.f38339c = i10;
        aVar.f38340e = str;
        return aVar;
    }

    @Override
    public final boolean a(og.a aVar) {
        if (this != aVar) {
            if (lk0.class == aVar.getClass()) {
                lk0 lk0Var = (lk0) aVar;
                if (this.f38339c == lk0Var.f38339c && this.d == lk0Var.d && this.h == lk0Var.h && this.f38343i == lk0Var.f38343i && Objects.equals(this.f38340e, lk0Var.f38340e) && Objects.equals(this.f38341f, lk0Var.f38341f) && this.f38342g == lk0Var.f38342g) {
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
            if (this.f38339c == lk0Var.f38339c && this.h == lk0Var.h && ((this.f17192a == 8 || (this.d == lk0Var.d && Objects.equals(this.f38340e, lk0Var.f38340e) && (this.f17192a == 6 || Objects.equals(this.f38341f, lk0Var.f38341f)))) && this.f38342g == lk0Var.f38342g)) {
                return true;
            }
        }
        return false;
    }
}
