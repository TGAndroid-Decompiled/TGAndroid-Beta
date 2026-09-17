package org.telegram.ui;

import j$.util.Objects;
public final class pk0 extends og.a {
    public int f36648c;
    public int d;
    public CharSequence e;
    public CharSequence f36649f;
    public vk0 f36650g;
    public int h;
    public boolean f36651i;

    public static pk0 b(int i10, String str, boolean z10) {
        ?? aVar = new og.a(1, true);
        aVar.f36648c = i10;
        aVar.e = str;
        aVar.f36651i = z10;
        return aVar;
    }

    public static pk0 c(int i10, String str, String str2) {
        ?? aVar = new og.a(5, true);
        aVar.f36648c = i10;
        aVar.e = str;
        aVar.f36649f = str2;
        return aVar;
    }

    public static pk0 d(int i10, String str) {
        ?? aVar = new og.a(4, true);
        aVar.f36648c = i10;
        aVar.e = str;
        return aVar;
    }

    @Override
    public final boolean a(og.a aVar) {
        if (this != aVar) {
            if (pk0.class == aVar.getClass()) {
                pk0 pk0Var = (pk0) aVar;
                if (this.f36648c == pk0Var.f36648c && this.d == pk0Var.d && this.h == pk0Var.h && this.f36651i == pk0Var.f36651i && Objects.equals(this.e, pk0Var.e) && Objects.equals(this.f36649f, pk0Var.f36649f) && this.f36650g == pk0Var.f36650g) {
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
            if (this.f36648c == pk0Var.f36648c && this.h == pk0Var.h && ((this.f15543a == 8 || (this.d == pk0Var.d && Objects.equals(this.e, pk0Var.e) && (this.f15543a == 6 || Objects.equals(this.f36649f, pk0Var.f36649f)))) && this.f36650g == pk0Var.f36650g)) {
                return true;
            }
        }
        return false;
    }
}
