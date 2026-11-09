package org.telegram.ui;

import j$.util.Objects;
public final class mh0 extends rg.a {
    public int f47880c;
    public int d;
    public CharSequence f47881e;
    public CharSequence f47882f;
    public qh0 f47883g;
    public int h;
    public boolean f47884i;

    public static mh0 b(int i7, String str, boolean z9) {
        ?? aVar = new rg.a(1, true);
        aVar.f47880c = i7;
        aVar.f47881e = str;
        aVar.f47884i = z9;
        return aVar;
    }

    public static mh0 c(int i7, String str, String str2) {
        ?? aVar = new rg.a(5, true);
        aVar.f47880c = i7;
        aVar.f47881e = str;
        aVar.f47882f = str2;
        return aVar;
    }

    public static mh0 d(int i7, String str) {
        ?? aVar = new rg.a(4, true);
        aVar.f47880c = i7;
        aVar.f47881e = str;
        return aVar;
    }

    @Override
    public final boolean a(rg.a aVar) {
        if (this != aVar) {
            if (mh0.class == aVar.getClass()) {
                mh0 mh0Var = (mh0) aVar;
                if (this.f47880c == mh0Var.f47880c && this.d == mh0Var.d && this.h == mh0Var.h && this.f47884i == mh0Var.f47884i && Objects.equals(this.f47881e, mh0Var.f47881e) && Objects.equals(this.f47882f, mh0Var.f47882f) && this.f47883g == mh0Var.f47883g) {
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
        if (obj != null && mh0.class == obj.getClass()) {
            mh0 mh0Var = (mh0) obj;
            if (this.f47880c == mh0Var.f47880c && this.h == mh0Var.h && ((this.f54544a == 8 || (this.d == mh0Var.d && Objects.equals(this.f47881e, mh0Var.f47881e) && (this.f54544a == 6 || Objects.equals(this.f47882f, mh0Var.f47882f)))) && this.f47883g == mh0Var.f47883g)) {
                return true;
            }
        }
        return false;
    }
}
