package org.telegram.ui;

import j$.util.Objects;
public final class qh0 extends rg.a {
    public int f51226c;
    public int d;
    public CharSequence f51227e;
    public CharSequence f51228f;
    public uh0 f51229g;
    public int h;
    public boolean f51230i;

    public static qh0 b(int i7, String str, boolean z10) {
        ?? aVar = new rg.a(1, true);
        aVar.f51226c = i7;
        aVar.f51227e = str;
        aVar.f51230i = z10;
        return aVar;
    }

    public static qh0 c(int i7, String str, String str2) {
        ?? aVar = new rg.a(5, true);
        aVar.f51226c = i7;
        aVar.f51227e = str;
        aVar.f51228f = str2;
        return aVar;
    }

    public static qh0 d(int i7, String str) {
        ?? aVar = new rg.a(4, true);
        aVar.f51226c = i7;
        aVar.f51227e = str;
        return aVar;
    }

    @Override
    public final boolean a(rg.a aVar) {
        if (this != aVar) {
            if (qh0.class == aVar.getClass()) {
                qh0 qh0Var = (qh0) aVar;
                if (this.f51226c == qh0Var.f51226c && this.d == qh0Var.d && this.h == qh0Var.h && this.f51230i == qh0Var.f51230i && Objects.equals(this.f51227e, qh0Var.f51227e) && Objects.equals(this.f51228f, qh0Var.f51228f) && this.f51229g == qh0Var.f51229g) {
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
        if (obj != null && qh0.class == obj.getClass()) {
            qh0 qh0Var = (qh0) obj;
            if (this.f51226c == qh0Var.f51226c && this.h == qh0Var.h && ((this.f56589a == 8 || (this.d == qh0Var.d && Objects.equals(this.f51227e, qh0Var.f51227e) && (this.f56589a == 6 || Objects.equals(this.f51228f, qh0Var.f51228f)))) && this.f51229g == qh0Var.f51229g)) {
                return true;
            }
        }
        return false;
    }
}
