package org.telegram.ui;

import j$.util.Objects;
public final class bk0 extends pg.a {
    public int f36090c;
    public int d;
    public CharSequence e;
    public CharSequence f36091f;
    public hk0 f36092g;
    public int h;
    public boolean f36093i;

    public static bk0 b(int i10, String str, boolean z10) {
        ?? aVar = new pg.a(1, true);
        aVar.f36090c = i10;
        aVar.e = str;
        aVar.f36093i = z10;
        return aVar;
    }

    public static bk0 c(int i10, String str, String str2) {
        ?? aVar = new pg.a(5, true);
        aVar.f36090c = i10;
        aVar.e = str;
        aVar.f36091f = str2;
        return aVar;
    }

    public static bk0 d(int i10, String str) {
        ?? aVar = new pg.a(4, true);
        aVar.f36090c = i10;
        aVar.e = str;
        return aVar;
    }

    @Override
    public final boolean a(pg.a aVar) {
        if (this != aVar) {
            if (bk0.class == aVar.getClass()) {
                bk0 bk0Var = (bk0) aVar;
                if (this.f36090c == bk0Var.f36090c && this.d == bk0Var.d && this.h == bk0Var.h && this.f36093i == bk0Var.f36093i && Objects.equals(this.e, bk0Var.e) && Objects.equals(this.f36091f, bk0Var.f36091f) && this.f36092g == bk0Var.f36092g) {
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
        if (obj != null && bk0.class == obj.getClass()) {
            bk0 bk0Var = (bk0) obj;
            if (this.f36090c == bk0Var.f36090c && this.h == bk0Var.h && ((this.f44712a == 8 || (this.d == bk0Var.d && Objects.equals(this.e, bk0Var.e) && (this.f44712a == 6 || Objects.equals(this.f36091f, bk0Var.f36091f)))) && this.f36092g == bk0Var.f36092g)) {
                return true;
            }
        }
        return false;
    }
}
