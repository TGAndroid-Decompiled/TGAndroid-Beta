package org.telegram.ui;

import j$.util.Objects;
public final class gh0 extends sg.a {
    public int f45663c;
    public int d;
    public CharSequence f45664e;
    public CharSequence f45665f;
    public lh0 f45666g;
    public int h;
    public boolean f45667i;

    public static gh0 b(int i3, String str, boolean z10) {
        ?? aVar = new sg.a(1, true);
        aVar.f45663c = i3;
        aVar.f45664e = str;
        aVar.f45667i = z10;
        return aVar;
    }

    public static gh0 c(int i3, String str, String str2) {
        ?? aVar = new sg.a(5, true);
        aVar.f45663c = i3;
        aVar.f45664e = str;
        aVar.f45665f = str2;
        return aVar;
    }

    public static gh0 d(int i3, String str) {
        ?? aVar = new sg.a(4, true);
        aVar.f45663c = i3;
        aVar.f45664e = str;
        return aVar;
    }

    @Override
    public final boolean a(sg.a aVar) {
        if (this != aVar) {
            if (gh0.class == aVar.getClass()) {
                gh0 gh0Var = (gh0) aVar;
                if (this.f45663c == gh0Var.f45663c && this.d == gh0Var.d && this.h == gh0Var.h && this.f45667i == gh0Var.f45667i && Objects.equals(this.f45664e, gh0Var.f45664e) && Objects.equals(this.f45665f, gh0Var.f45665f) && this.f45666g == gh0Var.f45666g) {
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
        if (obj != null && gh0.class == obj.getClass()) {
            gh0 gh0Var = (gh0) obj;
            if (this.f45663c == gh0Var.f45663c && this.h == gh0Var.h && ((this.f54715a == 8 || (this.d == gh0Var.d && Objects.equals(this.f45664e, gh0Var.f45664e) && (this.f54715a == 6 || Objects.equals(this.f45665f, gh0Var.f45665f)))) && this.f45666g == gh0Var.f45666g)) {
                return true;
            }
        }
        return false;
    }
}
