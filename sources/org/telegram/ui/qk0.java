package org.telegram.ui;

import j$.util.Objects;
public final class qk0 extends og.a {
    public int f36950c;
    public int d;
    public CharSequence e;
    public CharSequence f36951f;
    public wk0 f36952g;
    public int h;
    public boolean f36953i;

    public static qk0 b(int i10, String str, boolean z10) {
        ?? aVar = new og.a(1, true);
        aVar.f36950c = i10;
        aVar.e = str;
        aVar.f36953i = z10;
        return aVar;
    }

    public static qk0 c(int i10, String str, String str2) {
        ?? aVar = new og.a(5, true);
        aVar.f36950c = i10;
        aVar.e = str;
        aVar.f36951f = str2;
        return aVar;
    }

    public static qk0 d(int i10, String str) {
        ?? aVar = new og.a(4, true);
        aVar.f36950c = i10;
        aVar.e = str;
        return aVar;
    }

    @Override
    public final boolean a(og.a aVar) {
        if (this != aVar) {
            if (qk0.class == aVar.getClass()) {
                qk0 qk0Var = (qk0) aVar;
                if (this.f36950c == qk0Var.f36950c && this.d == qk0Var.d && this.h == qk0Var.h && this.f36953i == qk0Var.f36953i && Objects.equals(this.e, qk0Var.e) && Objects.equals(this.f36951f, qk0Var.f36951f) && this.f36952g == qk0Var.f36952g) {
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
            if (this.f36950c == qk0Var.f36950c && this.h == qk0Var.h && ((this.f15719a == 8 || (this.d == qk0Var.d && Objects.equals(this.e, qk0Var.e) && (this.f15719a == 6 || Objects.equals(this.f36951f, qk0Var.f36951f)))) && this.f36952g == qk0Var.f36952g)) {
                return true;
            }
        }
        return false;
    }
}
