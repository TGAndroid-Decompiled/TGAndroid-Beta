package org.telegram.ui;

import j$.util.Objects;
public final class ok0 extends og.a {
    public int f40596c;
    public int d;
    public CharSequence f40597e;
    public CharSequence f40598f;
    public vk0 f40599g;
    public int h;
    public boolean f40600i;

    public static ok0 b(int i10, String str, boolean z10) {
        ?? aVar = new og.a(1, true);
        aVar.f40596c = i10;
        aVar.f40597e = str;
        aVar.f40600i = z10;
        return aVar;
    }

    public static ok0 c(int i10, String str, String str2) {
        ?? aVar = new og.a(5, true);
        aVar.f40596c = i10;
        aVar.f40597e = str;
        aVar.f40598f = str2;
        return aVar;
    }

    public static ok0 d(int i10, String str) {
        ?? aVar = new og.a(4, true);
        aVar.f40596c = i10;
        aVar.f40597e = str;
        return aVar;
    }

    @Override
    public final boolean a(og.a aVar) {
        if (this != aVar) {
            if (ok0.class == aVar.getClass()) {
                ok0 ok0Var = (ok0) aVar;
                if (this.f40596c == ok0Var.f40596c && this.d == ok0Var.d && this.h == ok0Var.h && this.f40600i == ok0Var.f40600i && Objects.equals(this.f40597e, ok0Var.f40597e) && Objects.equals(this.f40598f, ok0Var.f40598f) && this.f40599g == ok0Var.f40599g) {
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
        if (obj != null && ok0.class == obj.getClass()) {
            ok0 ok0Var = (ok0) obj;
            if (this.f40596c == ok0Var.f40596c && this.h == ok0Var.h && ((this.f17129a == 8 || (this.d == ok0Var.d && Objects.equals(this.f40597e, ok0Var.f40597e) && (this.f17129a == 6 || Objects.equals(this.f40598f, ok0Var.f40598f)))) && this.f40599g == ok0Var.f40599g)) {
                return true;
            }
        }
        return false;
    }
}
