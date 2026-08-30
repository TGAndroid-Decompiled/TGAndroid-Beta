package org.telegram.ui;

import j$.util.Objects;
public final class dk0 extends bg.b {
    public int f33671c;
    public int d;
    public CharSequence e;
    public CharSequence f33672f;
    public jk0 f33673g;
    public int h;
    public boolean f33674i;

    public static dk0 b(int i10, String str, boolean z4) {
        ?? bVar = new bg.b(1, true);
        bVar.f33671c = i10;
        bVar.e = str;
        bVar.f33674i = z4;
        return bVar;
    }

    public static dk0 c(int i10, String str, String str2) {
        ?? bVar = new bg.b(5, true);
        bVar.f33671c = i10;
        bVar.e = str;
        bVar.f33672f = str2;
        return bVar;
    }

    public static dk0 d(int i10, String str) {
        ?? bVar = new bg.b(4, true);
        bVar.f33671c = i10;
        bVar.e = str;
        return bVar;
    }

    @Override
    public final boolean a(bg.b bVar) {
        if (this != bVar) {
            if (dk0.class == bVar.getClass()) {
                dk0 dk0Var = (dk0) bVar;
                if (this.f33671c == dk0Var.f33671c && this.d == dk0Var.d && this.h == dk0Var.h && this.f33674i == dk0Var.f33674i && Objects.equals(this.e, dk0Var.e) && Objects.equals(this.f33672f, dk0Var.f33672f) && this.f33673g == dk0Var.f33673g) {
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
        if (obj != null && dk0.class == obj.getClass()) {
            dk0 dk0Var = (dk0) obj;
            if (this.f33671c == dk0Var.f33671c && this.h == dk0Var.h && ((this.f1808a == 8 || (this.d == dk0Var.d && Objects.equals(this.e, dk0Var.e) && (this.f1808a == 6 || Objects.equals(this.f33672f, dk0Var.f33672f)))) && this.f33673g == dk0Var.f33673g)) {
                return true;
            }
        }
        return false;
    }
}
