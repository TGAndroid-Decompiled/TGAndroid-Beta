package org.telegram.ui;

import j$.util.Objects;
public final class qk0 extends pg.a {
    public int f39898c;
    public int d;
    public CharSequence f39899e;
    public CharSequence f39900f;
    public wk0 f39901g;
    public int h;
    public boolean f39902i;

    public static qk0 b(int i10, String str, boolean z10) {
        ?? aVar = new pg.a(1, true);
        aVar.f39898c = i10;
        aVar.f39899e = str;
        aVar.f39902i = z10;
        return aVar;
    }

    public static qk0 c(int i10, String str, String str2) {
        ?? aVar = new pg.a(5, true);
        aVar.f39898c = i10;
        aVar.f39899e = str;
        aVar.f39900f = str2;
        return aVar;
    }

    public static qk0 d(int i10, String str) {
        ?? aVar = new pg.a(4, true);
        aVar.f39898c = i10;
        aVar.f39899e = str;
        return aVar;
    }

    @Override
    public final boolean a(pg.a aVar) {
        if (this != aVar) {
            if (qk0.class == aVar.getClass()) {
                qk0 qk0Var = (qk0) aVar;
                if (this.f39898c == qk0Var.f39898c && this.d == qk0Var.d && this.h == qk0Var.h && this.f39902i == qk0Var.f39902i && Objects.equals(this.f39899e, qk0Var.f39899e) && Objects.equals(this.f39900f, qk0Var.f39900f) && this.f39901g == qk0Var.f39901g) {
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
            if (this.f39898c == qk0Var.f39898c && this.h == qk0Var.h && ((this.f44072a == 8 || (this.d == qk0Var.d && Objects.equals(this.f39899e, qk0Var.f39899e) && (this.f44072a == 6 || Objects.equals(this.f39900f, qk0Var.f39900f)))) && this.f39901g == qk0Var.f39901g)) {
                return true;
            }
        }
        return false;
    }
}
