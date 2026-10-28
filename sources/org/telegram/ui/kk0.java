package org.telegram.ui;

import j$.util.Objects;
public final class kk0 extends qg.a {
    public int f40819c;
    public int d;
    public CharSequence e;
    public CharSequence f40820f;
    public qk0 f40821g;
    public int h;
    public boolean f40822i;

    public static kk0 b(int i10, String str, boolean z10) {
        ?? aVar = new qg.a(1, true);
        aVar.f40819c = i10;
        aVar.e = str;
        aVar.f40822i = z10;
        return aVar;
    }

    public static kk0 c(int i10, String str, String str2) {
        ?? aVar = new qg.a(5, true);
        aVar.f40819c = i10;
        aVar.e = str;
        aVar.f40820f = str2;
        return aVar;
    }

    public static kk0 d(int i10, String str) {
        ?? aVar = new qg.a(4, true);
        aVar.f40819c = i10;
        aVar.e = str;
        return aVar;
    }

    @Override
    public final boolean a(qg.a aVar) {
        if (this != aVar) {
            if (kk0.class == aVar.getClass()) {
                kk0 kk0Var = (kk0) aVar;
                if (this.f40819c == kk0Var.f40819c && this.d == kk0Var.d && this.h == kk0Var.h && this.f40822i == kk0Var.f40822i && Objects.equals(this.e, kk0Var.e) && Objects.equals(this.f40820f, kk0Var.f40820f) && this.f40821g == kk0Var.f40821g) {
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
        if (obj != null && kk0.class == obj.getClass()) {
            kk0 kk0Var = (kk0) obj;
            if (this.f40819c == kk0Var.f40819c && this.h == kk0Var.h && ((this.f47075a == 8 || (this.d == kk0Var.d && Objects.equals(this.e, kk0Var.e) && (this.f47075a == 6 || Objects.equals(this.f40820f, kk0Var.f40820f)))) && this.f40821g == kk0Var.f40821g)) {
                return true;
            }
        }
        return false;
    }
}
