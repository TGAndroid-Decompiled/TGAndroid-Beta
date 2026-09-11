package org.telegram.ui;

import j$.util.Objects;
public final class qk0 extends pg.a {
    public int f39897c;
    public int d;
    public CharSequence f39898e;
    public CharSequence f39899f;
    public wk0 f39900g;
    public int h;
    public boolean f39901i;

    public static qk0 b(int i10, String str, boolean z10) {
        ?? aVar = new pg.a(1, true);
        aVar.f39897c = i10;
        aVar.f39898e = str;
        aVar.f39901i = z10;
        return aVar;
    }

    public static qk0 c(int i10, String str, String str2) {
        ?? aVar = new pg.a(5, true);
        aVar.f39897c = i10;
        aVar.f39898e = str;
        aVar.f39899f = str2;
        return aVar;
    }

    public static qk0 d(int i10, String str) {
        ?? aVar = new pg.a(4, true);
        aVar.f39897c = i10;
        aVar.f39898e = str;
        return aVar;
    }

    @Override
    public final boolean a(pg.a aVar) {
        if (this != aVar) {
            if (qk0.class == aVar.getClass()) {
                qk0 qk0Var = (qk0) aVar;
                if (this.f39897c == qk0Var.f39897c && this.d == qk0Var.d && this.h == qk0Var.h && this.f39901i == qk0Var.f39901i && Objects.equals(this.f39898e, qk0Var.f39898e) && Objects.equals(this.f39899f, qk0Var.f39899f) && this.f39900g == qk0Var.f39900g) {
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
        if (obj != null && qk0.class == obj.getClass()) {
            qk0 qk0Var = (qk0) obj;
            if (this.f39897c == qk0Var.f39897c && this.h == qk0Var.h && ((this.f44071a == 8 || (this.d == qk0Var.d && Objects.equals(this.f39898e, qk0Var.f39898e) && (this.f44071a == 6 || Objects.equals(this.f39899f, qk0Var.f39899f)))) && this.f39900g == qk0Var.f39900g)) {
                return true;
            }
        }
        return false;
    }
}
