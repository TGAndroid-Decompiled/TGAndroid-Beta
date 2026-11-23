package org.telegram.ui;

import j$.util.Objects;
public final class qh0 extends rg.a {
    public int f51284c;
    public int d;
    public CharSequence f51285e;
    public CharSequence f51286f;
    public uh0 f51287g;
    public int h;
    public boolean f51288i;

    public static qh0 b(int i7, String str, boolean z10) {
        ?? aVar = new rg.a(1, true);
        aVar.f51284c = i7;
        aVar.f51285e = str;
        aVar.f51288i = z10;
        return aVar;
    }

    public static qh0 c(int i7, String str, String str2) {
        ?? aVar = new rg.a(5, true);
        aVar.f51284c = i7;
        aVar.f51285e = str;
        aVar.f51286f = str2;
        return aVar;
    }

    public static qh0 d(int i7, String str) {
        ?? aVar = new rg.a(4, true);
        aVar.f51284c = i7;
        aVar.f51285e = str;
        return aVar;
    }

    @Override
    public final boolean a(rg.a aVar) {
        if (this != aVar) {
            if (qh0.class == aVar.getClass()) {
                qh0 qh0Var = (qh0) aVar;
                if (this.f51284c == qh0Var.f51284c && this.d == qh0Var.d && this.h == qh0Var.h && this.f51288i == qh0Var.f51288i && Objects.equals(this.f51285e, qh0Var.f51285e) && Objects.equals(this.f51286f, qh0Var.f51286f) && this.f51287g == qh0Var.f51287g) {
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
            if (this.f51284c == qh0Var.f51284c && this.h == qh0Var.h && ((this.f56634a == 8 || (this.d == qh0Var.d && Objects.equals(this.f51285e, qh0Var.f51285e) && (this.f56634a == 6 || Objects.equals(this.f51286f, qh0Var.f51286f)))) && this.f51287g == qh0Var.f51287g)) {
                return true;
            }
        }
        return false;
    }
}
