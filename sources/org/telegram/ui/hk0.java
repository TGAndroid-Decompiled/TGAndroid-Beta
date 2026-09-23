package org.telegram.ui;

import j$.util.Objects;
public final class hk0 extends og.a {
    public int f33876c;
    public int d;
    public CharSequence e;
    public CharSequence f33877f;
    public nk0 f33878g;
    public int h;
    public boolean f33879i;

    public static hk0 b(int i10, String str, boolean z10) {
        ?? aVar = new og.a(1, true);
        aVar.f33876c = i10;
        aVar.e = str;
        aVar.f33879i = z10;
        return aVar;
    }

    public static hk0 c(int i10, String str, String str2) {
        ?? aVar = new og.a(5, true);
        aVar.f33876c = i10;
        aVar.e = str;
        aVar.f33877f = str2;
        return aVar;
    }

    public static hk0 d(int i10, String str) {
        ?? aVar = new og.a(4, true);
        aVar.f33876c = i10;
        aVar.e = str;
        return aVar;
    }

    @Override
    public final boolean a(og.a aVar) {
        if (this != aVar) {
            if (hk0.class == aVar.getClass()) {
                hk0 hk0Var = (hk0) aVar;
                if (this.f33876c == hk0Var.f33876c && this.d == hk0Var.d && this.h == hk0Var.h && this.f33879i == hk0Var.f33879i && Objects.equals(this.e, hk0Var.e) && Objects.equals(this.f33877f, hk0Var.f33877f) && this.f33878g == hk0Var.f33878g) {
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
        if (obj != null && hk0.class == obj.getClass()) {
            hk0 hk0Var = (hk0) obj;
            if (this.f33876c == hk0Var.f33876c && this.h == hk0Var.h && ((this.f15508a == 8 || (this.d == hk0Var.d && Objects.equals(this.e, hk0Var.e) && (this.f15508a == 6 || Objects.equals(this.f33877f, hk0Var.f33877f)))) && this.f33878g == hk0Var.f33878g)) {
                return true;
            }
        }
        return false;
    }
}
