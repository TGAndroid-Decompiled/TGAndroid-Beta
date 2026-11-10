package org.telegram.ui;

import j$.util.Objects;
public final class nh0 extends rg.a {
    public int f48212c;
    public int d;
    public CharSequence f48213e;
    public CharSequence f48214f;
    public rh0 f48215g;
    public int h;
    public boolean f48216i;

    public static nh0 b(int i7, String str, boolean z9) {
        ?? aVar = new rg.a(1, true);
        aVar.f48212c = i7;
        aVar.f48213e = str;
        aVar.f48216i = z9;
        return aVar;
    }

    public static nh0 c(int i7, String str, String str2) {
        ?? aVar = new rg.a(5, true);
        aVar.f48212c = i7;
        aVar.f48213e = str;
        aVar.f48214f = str2;
        return aVar;
    }

    public static nh0 d(int i7, String str) {
        ?? aVar = new rg.a(4, true);
        aVar.f48212c = i7;
        aVar.f48213e = str;
        return aVar;
    }

    @Override
    public final boolean a(rg.a aVar) {
        if (this != aVar) {
            if (nh0.class == aVar.getClass()) {
                nh0 nh0Var = (nh0) aVar;
                if (this.f48212c == nh0Var.f48212c && this.d == nh0Var.d && this.h == nh0Var.h && this.f48216i == nh0Var.f48216i && Objects.equals(this.f48213e, nh0Var.f48213e) && Objects.equals(this.f48214f, nh0Var.f48214f) && this.f48215g == nh0Var.f48215g) {
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
        if (obj != null && nh0.class == obj.getClass()) {
            nh0 nh0Var = (nh0) obj;
            if (this.f48212c == nh0Var.f48212c && this.h == nh0Var.h && ((this.f54543a == 8 || (this.d == nh0Var.d && Objects.equals(this.f48213e, nh0Var.f48213e) && (this.f54543a == 6 || Objects.equals(this.f48214f, nh0Var.f48214f)))) && this.f48215g == nh0Var.f48215g)) {
                return true;
            }
        }
        return false;
    }
}
