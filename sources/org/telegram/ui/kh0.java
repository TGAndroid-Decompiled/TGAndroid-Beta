package org.telegram.ui;

import j$.util.Objects;
public final class kh0 extends rg.a {
    public int f47191c;
    public int d;
    public CharSequence f47192e;
    public CharSequence f47193f;
    public oh0 f47194g;
    public int h;
    public boolean f47195i;

    public static kh0 b(int i7, String str, boolean z9) {
        ?? aVar = new rg.a(1, true);
        aVar.f47191c = i7;
        aVar.f47192e = str;
        aVar.f47195i = z9;
        return aVar;
    }

    public static kh0 c(int i7, String str, String str2) {
        ?? aVar = new rg.a(5, true);
        aVar.f47191c = i7;
        aVar.f47192e = str;
        aVar.f47193f = str2;
        return aVar;
    }

    public static kh0 d(int i7, String str) {
        ?? aVar = new rg.a(4, true);
        aVar.f47191c = i7;
        aVar.f47192e = str;
        return aVar;
    }

    @Override
    public final boolean a(rg.a aVar) {
        if (this != aVar) {
            if (kh0.class == aVar.getClass()) {
                kh0 kh0Var = (kh0) aVar;
                if (this.f47191c == kh0Var.f47191c && this.d == kh0Var.d && this.h == kh0Var.h && this.f47195i == kh0Var.f47195i && Objects.equals(this.f47192e, kh0Var.f47192e) && Objects.equals(this.f47193f, kh0Var.f47193f) && this.f47194g == kh0Var.f47194g) {
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
        if (obj != null && kh0.class == obj.getClass()) {
            kh0 kh0Var = (kh0) obj;
            if (this.f47191c == kh0Var.f47191c && this.h == kh0Var.h && ((this.f54439a == 8 || (this.d == kh0Var.d && Objects.equals(this.f47192e, kh0Var.f47192e) && (this.f54439a == 6 || Objects.equals(this.f47193f, kh0Var.f47193f)))) && this.f47194g == kh0Var.f47194g)) {
                return true;
            }
        }
        return false;
    }
}
