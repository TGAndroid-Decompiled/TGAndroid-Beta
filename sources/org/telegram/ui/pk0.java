package org.telegram.ui;

import j$.util.Objects;
public final class pk0 extends og.a {
    public int f36653c;
    public int d;
    public CharSequence e;
    public CharSequence f36654f;
    public vk0 f36655g;
    public int h;
    public boolean f36656i;

    public static pk0 b(int i10, String str, boolean z10) {
        ?? aVar = new og.a(1, true);
        aVar.f36653c = i10;
        aVar.e = str;
        aVar.f36656i = z10;
        return aVar;
    }

    public static pk0 c(int i10, String str, String str2) {
        ?? aVar = new og.a(5, true);
        aVar.f36653c = i10;
        aVar.e = str;
        aVar.f36654f = str2;
        return aVar;
    }

    public static pk0 d(int i10, String str) {
        ?? aVar = new og.a(4, true);
        aVar.f36653c = i10;
        aVar.e = str;
        return aVar;
    }

    @Override
    public final boolean a(og.a aVar) {
        if (this != aVar) {
            if (pk0.class == aVar.getClass()) {
                pk0 pk0Var = (pk0) aVar;
                if (this.f36653c == pk0Var.f36653c && this.d == pk0Var.d && this.h == pk0Var.h && this.f36656i == pk0Var.f36656i && Objects.equals(this.e, pk0Var.e) && Objects.equals(this.f36654f, pk0Var.f36654f) && this.f36655g == pk0Var.f36655g) {
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
            if (this.f36653c == pk0Var.f36653c && this.h == pk0Var.h && ((this.f15543a == 8 || (this.d == pk0Var.d && Objects.equals(this.e, pk0Var.e) && (this.f15543a == 6 || Objects.equals(this.f36654f, pk0Var.f36654f)))) && this.f36655g == pk0Var.f36655g)) {
                return true;
            }
        }
        return false;
    }
}
