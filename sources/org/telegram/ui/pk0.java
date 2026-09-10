package org.telegram.ui;

import j$.util.Objects;
public final class pk0 extends ng.a {
    public int f35857c;
    public int d;
    public CharSequence e;
    public CharSequence f35858f;
    public vk0 f35859g;
    public int h;
    public boolean f35860i;

    public static pk0 b(int i10, String str, boolean z10) {
        ?? aVar = new ng.a(1, true);
        aVar.f35857c = i10;
        aVar.e = str;
        aVar.f35860i = z10;
        return aVar;
    }

    public static pk0 c(int i10, String str, String str2) {
        ?? aVar = new ng.a(5, true);
        aVar.f35857c = i10;
        aVar.e = str;
        aVar.f35858f = str2;
        return aVar;
    }

    public static pk0 d(int i10, String str) {
        ?? aVar = new ng.a(4, true);
        aVar.f35857c = i10;
        aVar.e = str;
        return aVar;
    }

    @Override
    public final boolean a(ng.a aVar) {
        if (this != aVar) {
            if (pk0.class == aVar.getClass()) {
                pk0 pk0Var = (pk0) aVar;
                if (this.f35857c == pk0Var.f35857c && this.d == pk0Var.d && this.h == pk0Var.h && this.f35860i == pk0Var.f35860i && Objects.equals(this.e, pk0Var.e) && Objects.equals(this.f35858f, pk0Var.f35858f) && this.f35859g == pk0Var.f35859g) {
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
            if (this.f35857c == pk0Var.f35857c && this.h == pk0Var.h && ((this.f14046a == 8 || (this.d == pk0Var.d && Objects.equals(this.e, pk0Var.e) && (this.f14046a == 6 || Objects.equals(this.f35858f, pk0Var.f35858f)))) && this.f35859g == pk0Var.f35859g)) {
                return true;
            }
        }
        return false;
    }
}
