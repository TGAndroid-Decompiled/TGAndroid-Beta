package org.telegram.ui;

import j$.util.Objects;
public final class oi0 extends hg.b {
    public int f40167c;
    public int d;
    public CharSequence e;
    public CharSequence f40168f;
    public si0 f40169g;
    public int h;
    public boolean f40170i;

    public static oi0 b(int i10, String str, boolean z10) {
        ?? bVar = new hg.b(1, true);
        bVar.f40167c = i10;
        bVar.e = str;
        bVar.f40170i = z10;
        return bVar;
    }

    public static oi0 c(int i10, String str, String str2) {
        ?? bVar = new hg.b(5, true);
        bVar.f40167c = i10;
        bVar.e = str;
        bVar.f40168f = str2;
        return bVar;
    }

    public static oi0 d(int i10, String str) {
        ?? bVar = new hg.b(4, true);
        bVar.f40167c = i10;
        bVar.e = str;
        return bVar;
    }

    @Override
    public final boolean a(hg.b bVar) {
        if (this != bVar) {
            if (oi0.class == bVar.getClass()) {
                oi0 oi0Var = (oi0) bVar;
                if (this.f40167c == oi0Var.f40167c && this.d == oi0Var.d && this.h == oi0Var.h && this.f40170i == oi0Var.f40170i && Objects.equals(this.e, oi0Var.e) && Objects.equals(this.f40168f, oi0Var.f40168f) && this.f40169g == oi0Var.f40169g) {
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
        if (obj != null && oi0.class == obj.getClass()) {
            oi0 oi0Var = (oi0) obj;
            if (this.f40167c == oi0Var.f40167c && this.h == oi0Var.h && ((this.f7681a == 8 || (this.d == oi0Var.d && Objects.equals(this.e, oi0Var.e) && (this.f7681a == 6 || Objects.equals(this.f40168f, oi0Var.f40168f)))) && this.f40169g == oi0Var.f40169g)) {
                return true;
            }
        }
        return false;
    }
}
