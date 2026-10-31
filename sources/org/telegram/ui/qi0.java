package org.telegram.ui;

import j$.util.Objects;
public final class qi0 extends hg.b {
    public int f40992c;
    public int d;
    public CharSequence e;
    public CharSequence f40993f;
    public ui0 f40994g;
    public int h;
    public boolean f40995i;

    public static qi0 b(int i10, String str, boolean z10) {
        ?? bVar = new hg.b(1, true);
        bVar.f40992c = i10;
        bVar.e = str;
        bVar.f40995i = z10;
        return bVar;
    }

    public static qi0 c(int i10, String str, String str2) {
        ?? bVar = new hg.b(5, true);
        bVar.f40992c = i10;
        bVar.e = str;
        bVar.f40993f = str2;
        return bVar;
    }

    public static qi0 d(int i10, String str) {
        ?? bVar = new hg.b(4, true);
        bVar.f40992c = i10;
        bVar.e = str;
        return bVar;
    }

    @Override
    public final boolean a(hg.b bVar) {
        if (this != bVar) {
            if (qi0.class == bVar.getClass()) {
                qi0 qi0Var = (qi0) bVar;
                if (this.f40992c == qi0Var.f40992c && this.d == qi0Var.d && this.h == qi0Var.h && this.f40995i == qi0Var.f40995i && Objects.equals(this.e, qi0Var.e) && Objects.equals(this.f40993f, qi0Var.f40993f) && this.f40994g == qi0Var.f40994g) {
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
        if (obj != null && qi0.class == obj.getClass()) {
            qi0 qi0Var = (qi0) obj;
            if (this.f40992c == qi0Var.f40992c && this.h == qi0Var.h && ((this.f7680a == 8 || (this.d == qi0Var.d && Objects.equals(this.e, qi0Var.e) && (this.f7680a == 6 || Objects.equals(this.f40993f, qi0Var.f40993f)))) && this.f40994g == qi0Var.f40994g)) {
                return true;
            }
        }
        return false;
    }
}
