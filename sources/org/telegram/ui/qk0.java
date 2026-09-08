package org.telegram.ui;

import j$.util.Objects;
public final class qk0 extends pg.a {
    public int f39924c;
    public int d;
    public CharSequence f39925e;
    public CharSequence f39926f;
    public wk0 f39927g;
    public int h;
    public boolean f39928i;

    public static qk0 b(int i10, String str, boolean z10) {
        ?? aVar = new pg.a(1, true);
        aVar.f39924c = i10;
        aVar.f39925e = str;
        aVar.f39928i = z10;
        return aVar;
    }

    public static qk0 c(int i10, String str, String str2) {
        ?? aVar = new pg.a(5, true);
        aVar.f39924c = i10;
        aVar.f39925e = str;
        aVar.f39926f = str2;
        return aVar;
    }

    public static qk0 d(int i10, String str) {
        ?? aVar = new pg.a(4, true);
        aVar.f39924c = i10;
        aVar.f39925e = str;
        return aVar;
    }

    @Override
    public final boolean a(pg.a aVar) {
        if (this != aVar) {
            if (qk0.class == aVar.getClass()) {
                qk0 qk0Var = (qk0) aVar;
                if (this.f39924c == qk0Var.f39924c && this.d == qk0Var.d && this.h == qk0Var.h && this.f39928i == qk0Var.f39928i && Objects.equals(this.f39925e, qk0Var.f39925e) && Objects.equals(this.f39926f, qk0Var.f39926f) && this.f39927g == qk0Var.f39927g) {
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
            if (this.f39924c == qk0Var.f39924c && this.h == qk0Var.h && ((this.f44098a == 8 || (this.d == qk0Var.d && Objects.equals(this.f39925e, qk0Var.f39925e) && (this.f44098a == 6 || Objects.equals(this.f39926f, qk0Var.f39926f)))) && this.f39927g == qk0Var.f39927g)) {
                return true;
            }
        }
        return false;
    }
}
