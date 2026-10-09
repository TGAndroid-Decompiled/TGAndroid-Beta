package org.telegram.ui;

import j$.util.Objects;
public final class ok0 extends og.a {
    public int f40550c;
    public int d;
    public CharSequence f40551e;
    public CharSequence f40552f;
    public vk0 f40553g;
    public int h;
    public boolean f40554i;

    public static ok0 b(int i10, String str, boolean z10) {
        ?? aVar = new og.a(1, true);
        aVar.f40550c = i10;
        aVar.f40551e = str;
        aVar.f40554i = z10;
        return aVar;
    }

    public static ok0 c(int i10, String str, String str2) {
        ?? aVar = new og.a(5, true);
        aVar.f40550c = i10;
        aVar.f40551e = str;
        aVar.f40552f = str2;
        return aVar;
    }

    public static ok0 d(int i10, String str) {
        ?? aVar = new og.a(4, true);
        aVar.f40550c = i10;
        aVar.f40551e = str;
        return aVar;
    }

    @Override
    public final boolean a(og.a aVar) {
        if (this != aVar) {
            if (ok0.class == aVar.getClass()) {
                ok0 ok0Var = (ok0) aVar;
                if (this.f40550c == ok0Var.f40550c && this.d == ok0Var.d && this.h == ok0Var.h && this.f40554i == ok0Var.f40554i && Objects.equals(this.f40551e, ok0Var.f40551e) && Objects.equals(this.f40552f, ok0Var.f40552f) && this.f40553g == ok0Var.f40553g) {
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
            if (this.f40550c == ok0Var.f40550c && this.h == ok0Var.h && ((this.f17125a == 8 || (this.d == ok0Var.d && Objects.equals(this.f40551e, ok0Var.f40551e) && (this.f17125a == 6 || Objects.equals(this.f40552f, ok0Var.f40552f)))) && this.f40553g == ok0Var.f40553g)) {
                return true;
            }
        }
        return false;
    }
}
