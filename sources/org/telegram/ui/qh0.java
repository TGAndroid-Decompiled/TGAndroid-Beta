package org.telegram.ui;

import j$.util.Objects;
public final class qh0 extends rg.a {
    public int f51217c;
    public int d;
    public CharSequence f51218e;
    public CharSequence f51219f;
    public uh0 f51220g;
    public int h;
    public boolean f51221i;

    public static qh0 b(int i7, String str, boolean z10) {
        ?? aVar = new rg.a(1, true);
        aVar.f51217c = i7;
        aVar.f51218e = str;
        aVar.f51221i = z10;
        return aVar;
    }

    public static qh0 c(int i7, String str, String str2) {
        ?? aVar = new rg.a(5, true);
        aVar.f51217c = i7;
        aVar.f51218e = str;
        aVar.f51219f = str2;
        return aVar;
    }

    public static qh0 d(int i7, String str) {
        ?? aVar = new rg.a(4, true);
        aVar.f51217c = i7;
        aVar.f51218e = str;
        return aVar;
    }

    @Override
    public final boolean a(rg.a aVar) {
        if (this != aVar) {
            if (qh0.class == aVar.getClass()) {
                qh0 qh0Var = (qh0) aVar;
                if (this.f51217c == qh0Var.f51217c && this.d == qh0Var.d && this.h == qh0Var.h && this.f51221i == qh0Var.f51221i && Objects.equals(this.f51218e, qh0Var.f51218e) && Objects.equals(this.f51219f, qh0Var.f51219f) && this.f51220g == qh0Var.f51220g) {
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
            if (this.f51217c == qh0Var.f51217c && this.h == qh0Var.h && ((this.f56599a == 8 || (this.d == qh0Var.d && Objects.equals(this.f51218e, qh0Var.f51218e) && (this.f56599a == 6 || Objects.equals(this.f51219f, qh0Var.f51219f)))) && this.f51220g == qh0Var.f51220g)) {
                return true;
            }
        }
        return false;
    }
}
