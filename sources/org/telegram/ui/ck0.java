package org.telegram.ui;

import j$.util.Objects;
public final class ck0 extends pg.a {
    public int f36384c;
    public int d;
    public CharSequence e;
    public CharSequence f36385f;
    public ik0 f36386g;
    public int h;
    public boolean f36387i;

    public static ck0 b(int i10, String str, boolean z10) {
        ?? aVar = new pg.a(1, true);
        aVar.f36384c = i10;
        aVar.e = str;
        aVar.f36387i = z10;
        return aVar;
    }

    public static ck0 c(int i10, String str, String str2) {
        ?? aVar = new pg.a(5, true);
        aVar.f36384c = i10;
        aVar.e = str;
        aVar.f36385f = str2;
        return aVar;
    }

    public static ck0 d(int i10, String str) {
        ?? aVar = new pg.a(4, true);
        aVar.f36384c = i10;
        aVar.e = str;
        return aVar;
    }

    @Override
    public final boolean a(pg.a aVar) {
        if (this != aVar) {
            if (ck0.class == aVar.getClass()) {
                ck0 ck0Var = (ck0) aVar;
                if (this.f36384c == ck0Var.f36384c && this.d == ck0Var.d && this.h == ck0Var.h && this.f36387i == ck0Var.f36387i && Objects.equals(this.e, ck0Var.e) && Objects.equals(this.f36385f, ck0Var.f36385f) && this.f36386g == ck0Var.f36386g) {
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
        if (obj != null && ck0.class == obj.getClass()) {
            ck0 ck0Var = (ck0) obj;
            if (this.f36384c == ck0Var.f36384c && this.h == ck0Var.h && ((this.f44713a == 8 || (this.d == ck0Var.d && Objects.equals(this.e, ck0Var.e) && (this.f44713a == 6 || Objects.equals(this.f36385f, ck0Var.f36385f)))) && this.f36386g == ck0Var.f36386g)) {
                return true;
            }
        }
        return false;
    }
}
