package org.telegram.ui;

import j$.util.Objects;
public final class pk0 extends og.a {
    public int f40984c;
    public int d;
    public CharSequence f40985e;
    public CharSequence f40986f;
    public wk0 f40987g;
    public int h;
    public boolean f40988i;

    public static pk0 b(int i10, String str, boolean z10) {
        ?? aVar = new og.a(1, true);
        aVar.f40984c = i10;
        aVar.f40985e = str;
        aVar.f40988i = z10;
        return aVar;
    }

    public static pk0 c(int i10, String str, String str2) {
        ?? aVar = new og.a(5, true);
        aVar.f40984c = i10;
        aVar.f40985e = str;
        aVar.f40986f = str2;
        return aVar;
    }

    public static pk0 d(int i10, String str) {
        ?? aVar = new og.a(4, true);
        aVar.f40984c = i10;
        aVar.f40985e = str;
        return aVar;
    }

    @Override
    public final boolean a(og.a aVar) {
        if (this != aVar) {
            if (pk0.class == aVar.getClass()) {
                pk0 pk0Var = (pk0) aVar;
                if (this.f40984c == pk0Var.f40984c && this.d == pk0Var.d && this.h == pk0Var.h && this.f40988i == pk0Var.f40988i && Objects.equals(this.f40985e, pk0Var.f40985e) && Objects.equals(this.f40986f, pk0Var.f40986f) && this.f40987g == pk0Var.f40987g) {
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
            if (this.f40984c == pk0Var.f40984c && this.h == pk0Var.h && ((this.f16877a == 8 || (this.d == pk0Var.d && Objects.equals(this.f40985e, pk0Var.f40985e) && (this.f16877a == 6 || Objects.equals(this.f40986f, pk0Var.f40986f)))) && this.f40987g == pk0Var.f40987g)) {
                return true;
            }
        }
        return false;
    }
}
