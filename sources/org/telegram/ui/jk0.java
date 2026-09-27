package org.telegram.ui;

import j$.util.Objects;
public final class jk0 extends og.a {
    public int f34754c;
    public int d;
    public CharSequence e;
    public CharSequence f34755f;
    public pk0 f34756g;
    public int h;
    public boolean f34757i;

    public static jk0 b(int i10, String str, boolean z10) {
        ?? aVar = new og.a(1, true);
        aVar.f34754c = i10;
        aVar.e = str;
        aVar.f34757i = z10;
        return aVar;
    }

    public static jk0 c(int i10, String str, String str2) {
        ?? aVar = new og.a(5, true);
        aVar.f34754c = i10;
        aVar.e = str;
        aVar.f34755f = str2;
        return aVar;
    }

    public static jk0 d(int i10, String str) {
        ?? aVar = new og.a(4, true);
        aVar.f34754c = i10;
        aVar.e = str;
        return aVar;
    }

    @Override
    public final boolean a(og.a aVar) {
        if (this != aVar) {
            if (jk0.class == aVar.getClass()) {
                jk0 jk0Var = (jk0) aVar;
                if (this.f34754c == jk0Var.f34754c && this.d == jk0Var.d && this.h == jk0Var.h && this.f34757i == jk0Var.f34757i && Objects.equals(this.e, jk0Var.e) && Objects.equals(this.f34755f, jk0Var.f34755f) && this.f34756g == jk0Var.f34756g) {
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
        if (obj != null && jk0.class == obj.getClass()) {
            jk0 jk0Var = (jk0) obj;
            if (this.f34754c == jk0Var.f34754c && this.h == jk0Var.h && ((this.f15754a == 8 || (this.d == jk0Var.d && Objects.equals(this.e, jk0Var.e) && (this.f15754a == 6 || Objects.equals(this.f34755f, jk0Var.f34755f)))) && this.f34756g == jk0Var.f34756g)) {
                return true;
            }
        }
        return false;
    }
}
