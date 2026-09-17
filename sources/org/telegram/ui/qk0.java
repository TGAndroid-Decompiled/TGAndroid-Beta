package org.telegram.ui;

import j$.util.Objects;
public final class qk0 extends pg.a {
    public int f39925c;
    public int d;
    public CharSequence f39926e;
    public CharSequence f39927f;
    public wk0 f39928g;
    public int h;
    public boolean f39929i;

    public static qk0 b(int i10, String str, boolean z10) {
        ?? aVar = new pg.a(1, true);
        aVar.f39925c = i10;
        aVar.f39926e = str;
        aVar.f39929i = z10;
        return aVar;
    }

    public static qk0 c(int i10, String str, String str2) {
        ?? aVar = new pg.a(5, true);
        aVar.f39925c = i10;
        aVar.f39926e = str;
        aVar.f39927f = str2;
        return aVar;
    }

    public static qk0 d(int i10, String str) {
        ?? aVar = new pg.a(4, true);
        aVar.f39925c = i10;
        aVar.f39926e = str;
        return aVar;
    }

    @Override
    public final boolean a(pg.a aVar) {
        if (this != aVar) {
            if (qk0.class == aVar.getClass()) {
                qk0 qk0Var = (qk0) aVar;
                if (this.f39925c == qk0Var.f39925c && this.d == qk0Var.d && this.h == qk0Var.h && this.f39929i == qk0Var.f39929i && Objects.equals(this.f39926e, qk0Var.f39926e) && Objects.equals(this.f39927f, qk0Var.f39927f) && this.f39928g == qk0Var.f39928g) {
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
            if (this.f39925c == qk0Var.f39925c && this.h == qk0Var.h && ((this.f44099a == 8 || (this.d == qk0Var.d && Objects.equals(this.f39926e, qk0Var.f39926e) && (this.f44099a == 6 || Objects.equals(this.f39927f, qk0Var.f39927f)))) && this.f39928g == qk0Var.f39928g)) {
                return true;
            }
        }
        return false;
    }
}
