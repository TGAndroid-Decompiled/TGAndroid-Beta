package org.telegram.ui;

import j$.util.Objects;
public final class mh0 extends rg.a {
    public int f49229c;
    public int d;
    public CharSequence f49230e;
    public CharSequence f49231f;
    public qh0 f49232g;
    public int h;
    public boolean f49233i;

    public static mh0 b(int i7, String str, boolean z10) {
        ?? aVar = new rg.a(1, true);
        aVar.f49229c = i7;
        aVar.f49230e = str;
        aVar.f49233i = z10;
        return aVar;
    }

    public static mh0 c(int i7, String str, String str2) {
        ?? aVar = new rg.a(5, true);
        aVar.f49229c = i7;
        aVar.f49230e = str;
        aVar.f49231f = str2;
        return aVar;
    }

    public static mh0 d(int i7, String str) {
        ?? aVar = new rg.a(4, true);
        aVar.f49229c = i7;
        aVar.f49230e = str;
        return aVar;
    }

    @Override
    public final boolean a(rg.a aVar) {
        if (this != aVar) {
            if (mh0.class == aVar.getClass()) {
                mh0 mh0Var = (mh0) aVar;
                if (this.f49229c == mh0Var.f49229c && this.d == mh0Var.d && this.h == mh0Var.h && this.f49233i == mh0Var.f49233i && Objects.equals(this.f49230e, mh0Var.f49230e) && Objects.equals(this.f49231f, mh0Var.f49231f) && this.f49232g == mh0Var.f49232g) {
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
            if (this.f49229c == mh0Var.f49229c && this.h == mh0Var.h && ((this.f56015a == 8 || (this.d == mh0Var.d && Objects.equals(this.f49230e, mh0Var.f49230e) && (this.f56015a == 6 || Objects.equals(this.f49231f, mh0Var.f49231f)))) && this.f49232g == mh0Var.f49232g)) {
                return true;
            }
        }
        return false;
    }
}
