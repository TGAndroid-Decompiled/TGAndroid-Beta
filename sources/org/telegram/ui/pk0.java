package org.telegram.ui;

import j$.util.Objects;
public final class pk0 extends og.a {
    public int f40982c;
    public int d;
    public CharSequence f40983e;
    public CharSequence f40984f;
    public wk0 f40985g;
    public int h;
    public boolean f40986i;

    public static pk0 b(int i10, String str, boolean z10) {
        ?? aVar = new og.a(1, true);
        aVar.f40982c = i10;
        aVar.f40983e = str;
        aVar.f40986i = z10;
        return aVar;
    }

    public static pk0 c(int i10, String str, String str2) {
        ?? aVar = new og.a(5, true);
        aVar.f40982c = i10;
        aVar.f40983e = str;
        aVar.f40984f = str2;
        return aVar;
    }

    public static pk0 d(int i10, String str) {
        ?? aVar = new og.a(4, true);
        aVar.f40982c = i10;
        aVar.f40983e = str;
        return aVar;
    }

    @Override
    public final boolean a(og.a aVar) {
        if (this != aVar) {
            if (pk0.class == aVar.getClass()) {
                pk0 pk0Var = (pk0) aVar;
                if (this.f40982c == pk0Var.f40982c && this.d == pk0Var.d && this.h == pk0Var.h && this.f40986i == pk0Var.f40986i && Objects.equals(this.f40983e, pk0Var.f40983e) && Objects.equals(this.f40984f, pk0Var.f40984f) && this.f40985g == pk0Var.f40985g) {
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
        if (obj != null && pk0.class == obj.getClass()) {
            pk0 pk0Var = (pk0) obj;
            if (this.f40982c == pk0Var.f40982c && this.h == pk0Var.h && ((this.f16876a == 8 || (this.d == pk0Var.d && Objects.equals(this.f40983e, pk0Var.f40983e) && (this.f16876a == 6 || Objects.equals(this.f40984f, pk0Var.f40984f)))) && this.f40985g == pk0Var.f40985g)) {
                return true;
            }
        }
        return false;
    }
}
