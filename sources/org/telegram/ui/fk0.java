package org.telegram.ui;

import j$.util.Objects;
public final class fk0 extends cg.b {
    public int f36905c;
    public int d;
    public CharSequence f36906e;
    public CharSequence f36907f;
    public lk0 f36908g;
    public int h;
    public boolean f36909i;

    public static fk0 b(int i10, String str, boolean z4) {
        ?? bVar = new cg.b(1, true);
        bVar.f36905c = i10;
        bVar.f36906e = str;
        bVar.f36909i = z4;
        return bVar;
    }

    public static fk0 c(int i10, String str, String str2) {
        ?? bVar = new cg.b(5, true);
        bVar.f36905c = i10;
        bVar.f36906e = str;
        bVar.f36907f = str2;
        return bVar;
    }

    public static fk0 d(int i10, String str) {
        ?? bVar = new cg.b(4, true);
        bVar.f36905c = i10;
        bVar.f36906e = str;
        return bVar;
    }

    @Override
    public final boolean a(cg.b bVar) {
        if (this != bVar) {
            if (fk0.class == bVar.getClass()) {
                fk0 fk0Var = (fk0) bVar;
                if (this.f36905c == fk0Var.f36905c && this.d == fk0Var.d && this.h == fk0Var.h && this.f36909i == fk0Var.f36909i && Objects.equals(this.f36906e, fk0Var.f36906e) && Objects.equals(this.f36907f, fk0Var.f36907f) && this.f36908g == fk0Var.f36908g) {
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
        if (obj != null && fk0.class == obj.getClass()) {
            fk0 fk0Var = (fk0) obj;
            if (this.f36905c == fk0Var.f36905c && this.h == fk0Var.h && ((this.f2505a == 8 || (this.d == fk0Var.d && Objects.equals(this.f36906e, fk0Var.f36906e) && (this.f2505a == 6 || Objects.equals(this.f36907f, fk0Var.f36907f)))) && this.f36908g == fk0Var.f36908g)) {
                return true;
            }
        }
        return false;
    }
}
