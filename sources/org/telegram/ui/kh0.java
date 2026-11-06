package org.telegram.ui;

import j$.util.Objects;
public final class kh0 extends rg.a {
    public int f47192c;
    public int d;
    public CharSequence f47193e;
    public CharSequence f47194f;
    public oh0 f47195g;
    public int h;
    public boolean f47196i;

    public static kh0 b(int i7, String str, boolean z9) {
        ?? aVar = new rg.a(1, true);
        aVar.f47192c = i7;
        aVar.f47193e = str;
        aVar.f47196i = z9;
        return aVar;
    }

    public static kh0 c(int i7, String str, String str2) {
        ?? aVar = new rg.a(5, true);
        aVar.f47192c = i7;
        aVar.f47193e = str;
        aVar.f47194f = str2;
        return aVar;
    }

    public static kh0 d(int i7, String str) {
        ?? aVar = new rg.a(4, true);
        aVar.f47192c = i7;
        aVar.f47193e = str;
        return aVar;
    }

    @Override
    public final boolean a(rg.a aVar) {
        if (this != aVar) {
            if (kh0.class == aVar.getClass()) {
                kh0 kh0Var = (kh0) aVar;
                if (this.f47192c == kh0Var.f47192c && this.d == kh0Var.d && this.h == kh0Var.h && this.f47196i == kh0Var.f47196i && Objects.equals(this.f47193e, kh0Var.f47193e) && Objects.equals(this.f47194f, kh0Var.f47194f) && this.f47195g == kh0Var.f47195g) {
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
            if (this.f47192c == kh0Var.f47192c && this.h == kh0Var.h && ((this.f54440a == 8 || (this.d == kh0Var.d && Objects.equals(this.f47193e, kh0Var.f47193e) && (this.f54440a == 6 || Objects.equals(this.f47194f, kh0Var.f47194f)))) && this.f47195g == kh0Var.f47195g)) {
                return true;
            }
        }
        return false;
    }
}
