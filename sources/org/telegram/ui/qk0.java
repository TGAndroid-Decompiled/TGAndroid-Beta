package org.telegram.ui;

import j$.util.Objects;
public final class qk0 extends og.a {
    public int f36925c;
    public int d;
    public CharSequence e;
    public CharSequence f36926f;
    public wk0 f36927g;
    public int h;
    public boolean f36928i;

    public static qk0 b(int i10, String str, boolean z10) {
        ?? aVar = new og.a(1, true);
        aVar.f36925c = i10;
        aVar.e = str;
        aVar.f36928i = z10;
        return aVar;
    }

    public static qk0 c(int i10, String str, String str2) {
        ?? aVar = new og.a(5, true);
        aVar.f36925c = i10;
        aVar.e = str;
        aVar.f36926f = str2;
        return aVar;
    }

    public static qk0 d(int i10, String str) {
        ?? aVar = new og.a(4, true);
        aVar.f36925c = i10;
        aVar.e = str;
        return aVar;
    }

    @Override
    public final boolean a(og.a aVar) {
        if (this != aVar) {
            if (qk0.class == aVar.getClass()) {
                qk0 qk0Var = (qk0) aVar;
                if (this.f36925c == qk0Var.f36925c && this.d == qk0Var.d && this.h == qk0Var.h && this.f36928i == qk0Var.f36928i && Objects.equals(this.e, qk0Var.e) && Objects.equals(this.f36926f, qk0Var.f36926f) && this.f36927g == qk0Var.f36927g) {
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
        if (obj != null && qk0.class == obj.getClass()) {
            qk0 qk0Var = (qk0) obj;
            if (this.f36925c == qk0Var.f36925c && this.h == qk0Var.h && ((this.f15704a == 8 || (this.d == qk0Var.d && Objects.equals(this.e, qk0Var.e) && (this.f15704a == 6 || Objects.equals(this.f36926f, qk0Var.f36926f)))) && this.f36927g == qk0Var.f36927g)) {
                return true;
            }
        }
        return false;
    }
}
