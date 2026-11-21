package org.telegram.ui;

import j$.util.Objects;
public final class qh0 extends rg.a {
    public int f51280c;
    public int d;
    public CharSequence f51281e;
    public CharSequence f51282f;
    public uh0 f51283g;
    public int h;
    public boolean f51284i;

    public static qh0 b(int i7, String str, boolean z10) {
        ?? aVar = new rg.a(1, true);
        aVar.f51280c = i7;
        aVar.f51281e = str;
        aVar.f51284i = z10;
        return aVar;
    }

    public static qh0 c(int i7, String str, String str2) {
        ?? aVar = new rg.a(5, true);
        aVar.f51280c = i7;
        aVar.f51281e = str;
        aVar.f51282f = str2;
        return aVar;
    }

    public static qh0 d(int i7, String str) {
        ?? aVar = new rg.a(4, true);
        aVar.f51280c = i7;
        aVar.f51281e = str;
        return aVar;
    }

    @Override
    public final boolean a(rg.a aVar) {
        if (this != aVar) {
            if (qh0.class == aVar.getClass()) {
                qh0 qh0Var = (qh0) aVar;
                if (this.f51280c == qh0Var.f51280c && this.d == qh0Var.d && this.h == qh0Var.h && this.f51284i == qh0Var.f51284i && Objects.equals(this.f51281e, qh0Var.f51281e) && Objects.equals(this.f51282f, qh0Var.f51282f) && this.f51283g == qh0Var.f51283g) {
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
            if (this.f51280c == qh0Var.f51280c && this.h == qh0Var.h && ((this.f56630a == 8 || (this.d == qh0Var.d && Objects.equals(this.f51281e, qh0Var.f51281e) && (this.f56630a == 6 || Objects.equals(this.f51282f, qh0Var.f51282f)))) && this.f51283g == qh0Var.f51283g)) {
                return true;
            }
        }
        return false;
    }
}
