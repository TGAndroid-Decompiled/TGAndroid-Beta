package org.telegram.ui;

import j$.util.Objects;
public final class oh0 extends rg.a {
    public int f50697c;
    public int d;
    public CharSequence f50698e;
    public CharSequence f50699f;
    public sh0 f50700g;
    public int h;
    public boolean f50701i;

    public static oh0 b(int i7, String str, boolean z10) {
        ?? aVar = new rg.a(1, true);
        aVar.f50697c = i7;
        aVar.f50698e = str;
        aVar.f50701i = z10;
        return aVar;
    }

    public static oh0 c(int i7, String str, String str2) {
        ?? aVar = new rg.a(5, true);
        aVar.f50697c = i7;
        aVar.f50698e = str;
        aVar.f50699f = str2;
        return aVar;
    }

    public static oh0 d(int i7, String str) {
        ?? aVar = new rg.a(4, true);
        aVar.f50697c = i7;
        aVar.f50698e = str;
        return aVar;
    }

    @Override
    public final boolean a(rg.a aVar) {
        if (this != aVar) {
            if (oh0.class == aVar.getClass()) {
                oh0 oh0Var = (oh0) aVar;
                if (this.f50697c == oh0Var.f50697c && this.d == oh0Var.d && this.h == oh0Var.h && this.f50701i == oh0Var.f50701i && Objects.equals(this.f50698e, oh0Var.f50698e) && Objects.equals(this.f50699f, oh0Var.f50699f) && this.f50700g == oh0Var.f50700g) {
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
        if (obj != null && oh0.class == obj.getClass()) {
            oh0 oh0Var = (oh0) obj;
            if (this.f50697c == oh0Var.f50697c && this.h == oh0Var.h && ((this.f56712a == 8 || (this.d == oh0Var.d && Objects.equals(this.f50698e, oh0Var.f50698e) && (this.f56712a == 6 || Objects.equals(this.f50699f, oh0Var.f50699f)))) && this.f50700g == oh0Var.f50700g)) {
                return true;
            }
        }
        return false;
    }
}
