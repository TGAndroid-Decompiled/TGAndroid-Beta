package org.telegram.ui;

import j$.util.Objects;
public final class ik0 extends qg.a {
    public int f40253c;
    public int d;
    public CharSequence e;
    public CharSequence f40254f;
    public ok0 f40255g;
    public int h;
    public boolean f40256i;

    public static ik0 b(int i10, String str, boolean z10) {
        ?? aVar = new qg.a(1, true);
        aVar.f40253c = i10;
        aVar.e = str;
        aVar.f40256i = z10;
        return aVar;
    }

    public static ik0 c(int i10, String str, String str2) {
        ?? aVar = new qg.a(5, true);
        aVar.f40253c = i10;
        aVar.e = str;
        aVar.f40254f = str2;
        return aVar;
    }

    public static ik0 d(int i10, String str) {
        ?? aVar = new qg.a(4, true);
        aVar.f40253c = i10;
        aVar.e = str;
        return aVar;
    }

    @Override
    public final boolean a(qg.a aVar) {
        if (this != aVar) {
            if (ik0.class == aVar.getClass()) {
                ik0 ik0Var = (ik0) aVar;
                if (this.f40253c == ik0Var.f40253c && this.d == ik0Var.d && this.h == ik0Var.h && this.f40256i == ik0Var.f40256i && Objects.equals(this.e, ik0Var.e) && Objects.equals(this.f40254f, ik0Var.f40254f) && this.f40255g == ik0Var.f40255g) {
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
        if (obj != null && ik0.class == obj.getClass()) {
            ik0 ik0Var = (ik0) obj;
            if (this.f40253c == ik0Var.f40253c && this.h == ik0Var.h && ((this.f47037a == 8 || (this.d == ik0Var.d && Objects.equals(this.e, ik0Var.e) && (this.f47037a == 6 || Objects.equals(this.f40254f, ik0Var.f40254f)))) && this.f40255g == ik0Var.f40255g)) {
                return true;
            }
        }
        return false;
    }
}
