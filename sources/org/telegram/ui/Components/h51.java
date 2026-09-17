package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import j$.util.Objects;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.na1;
public final class h51 extends pg.a {
    public static int J = 10000;
    public static LongSparseArray K;
    public static HashMap L;
    public float A;
    public long B;
    public Utilities.Callback C;
    public View.OnClickListener D;
    public View.OnClickListener E;
    public org.telegram.ui.t3 F;
    public Object G;
    public Object H;
    public boolean I;
    public View f26615c;
    public int d;
    public boolean f26616e;
    public boolean f26617f;
    public boolean f26618g;
    public boolean h;
    public int f26619i;
    public boolean f26620j;
    public int f26621k;
    public CharSequence f26622l;
    public CharSequence f26623m;
    public CharSequence f26624n;
    public CharSequence f26625o;
    public String[] f26626p;
    public boolean f26627q;
    public boolean f26628r;
    public boolean f26629s;
    public boolean f26630t;
    public int f26631u;
    public int v;
    public boolean f26632w;
    public long f26633x;
    public int f26634y;
    public int f26635z;

    public h51(int i10) {
        super(i10, false);
        this.f26618g = true;
        this.f26631u = -1;
        this.I = true;
    }

    public static h51 A(int i10, CharSequence charSequence) {
        h51 h51Var = new h51(7);
        h51Var.d = i10;
        h51Var.f26622l = charSequence;
        return h51Var;
    }

    public static h51 B(CharSequence charSequence) {
        h51 h51Var = new h51(7);
        h51Var.f26622l = charSequence;
        return h51Var;
    }

    public static h51 C(int i10) {
        h51 h51Var = new h51(28);
        h51Var.f26635z = i10;
        return h51Var;
    }

    public static h51 D(int i10, int i11) {
        h51 h51Var = new h51(28);
        h51Var.d = i10;
        h51Var.f26635z = i11;
        return h51Var;
    }

    public static h51 E(int i10, String str) {
        h51 h51Var = new h51(39);
        h51Var.d = i10;
        h51Var.f26622l = str;
        h51Var.f26635z = 1;
        return h51Var;
    }

    public static g51 F(int i10) {
        LongSparseArray longSparseArray = K;
        if (longSparseArray == null) {
            return null;
        }
        return (g51) longSparseArray.get(i10);
    }

    public static h51 J(Class cls) {
        if (L == null) {
            L = new HashMap();
        }
        if (K == null) {
            K = new LongSparseArray();
        }
        g51 g51Var = (g51) L.get(cls);
        if (g51Var != null) {
            return new h51(g51Var.viewType);
        }
        throw new RuntimeException("UItemFactory was not setuped: " + cls);
    }

    public static h51 b(String str) {
        h51 h51Var = new h51(1);
        h51Var.f26622l = str;
        return h51Var;
    }

    public static h51 c(int i10, int i11, String str) {
        h51 h51Var = new h51(3);
        h51Var.d = i10;
        h51Var.f26621k = i11;
        h51Var.f26622l = str;
        return h51Var;
    }

    public static h51 d(int i10, int i11, String str, String str2) {
        h51 h51Var = new h51(3);
        h51Var.d = i10;
        h51Var.f26621k = i11;
        h51Var.f26622l = str;
        h51Var.f26624n = str2;
        return h51Var;
    }

    public static h51 e(int i10, String str) {
        h51 h51Var = new h51(3);
        h51Var.d = i10;
        h51Var.f26622l = str;
        return h51Var;
    }

    public static h51 f(String str, CharSequence charSequence, int i10) {
        h51 h51Var = new h51(3);
        h51Var.d = i10;
        h51Var.f26622l = str;
        h51Var.f26624n = charSequence;
        return h51Var;
    }

    public static h51 g(CharSequence charSequence) {
        h51 h51Var = new h51(7);
        h51Var.f26622l = charSequence;
        h51Var.f26627q = true;
        return h51Var;
    }

    public static h51 h(int i10, int i11, na1 na1Var) {
        h51 h51Var = new h51(i10 + 18);
        h51Var.f26635z = i11;
        h51Var.G = na1Var;
        return h51Var;
    }

    public static h51 i(int i10, CharSequence charSequence) {
        h51 h51Var = new h51(4);
        h51Var.d = i10;
        h51Var.f26622l = charSequence;
        return h51Var;
    }

    public static h51 j(int i10, View view) {
        h51 h51Var = new h51(-1);
        h51Var.d = i10;
        h51Var.f26615c = view;
        h51Var.f26635z = -1;
        return h51Var;
    }

    public static h51 k(View view) {
        h51 h51Var = new h51(-1);
        h51Var.f26615c = view;
        h51Var.f26635z = -1;
        return h51Var;
    }

    public static h51 l(View view) {
        h51 h51Var = new h51(-4);
        h51Var.f26615c = view;
        h51Var.f26635z = -1;
        return h51Var;
    }

    public static h51 m(int i10, String str, String str2) {
        h51 h51Var = new h51(40);
        h51Var.d = i10;
        h51Var.f26622l = str;
        h51Var.f26625o = str2;
        return h51Var;
    }

    public static h51 n(int i10) {
        h51 h51Var = new h51(34);
        h51Var.f26635z = i10;
        return h51Var;
    }

    public static h51 o(int i10, int i11) {
        h51 h51Var = new h51(34);
        h51Var.d = i10;
        h51Var.f26635z = i11;
        return h51Var;
    }

    public static h51 p(View view, int i10, boolean z10) {
        h51 h51Var = new h51(-3);
        h51Var.f26615c = view;
        h51Var.f26635z = i10;
        h51Var.f26634y = z10 ? 1 : 0;
        return h51Var;
    }

    public static h51 q(String str) {
        h51 h51Var = new h51(31);
        h51Var.f26622l = str;
        return h51Var;
    }

    public static h51 r(String str, String str2, View.OnClickListener onClickListener) {
        h51 h51Var = new h51(31);
        h51Var.f26622l = str;
        h51Var.f26623m = str2;
        h51Var.D = onClickListener;
        return h51Var;
    }

    public static h51 s(int i10, String str) {
        h51 h51Var = new h51(0);
        h51Var.d = i10;
        h51Var.f26622l = str;
        return h51Var;
    }

    public static h51 t(String str) {
        h51 h51Var = new h51(0);
        h51Var.f26622l = str;
        return h51Var;
    }

    public static h51 u(org.telegram.ui.he heVar) {
        h51 h51Var = new h51(24);
        h51Var.G = heVar;
        return h51Var;
    }

    public static h51 v(TLObject tLObject) {
        h51 h51Var = new h51(32);
        h51Var.G = tLObject;
        return h51Var;
    }

    public static h51 w(int i10, String str) {
        h51 h51Var = new h51(10);
        h51Var.d = i10;
        h51Var.f26622l = str;
        return h51Var;
    }

    public static h51 x(int i10, String str, String str2) {
        h51 h51Var = new h51(44);
        h51Var.d = i10;
        h51Var.f26622l = str;
        h51Var.f26624n = str2;
        return h51Var;
    }

    public static h51 y(int i10, CharSequence charSequence) {
        h51 h51Var = new h51(35);
        h51Var.d = i10;
        h51Var.f26622l = charSequence;
        return h51Var;
    }

    public static h51 z(String str, CharSequence charSequence, int i10) {
        h51 h51Var = new h51(41);
        h51Var.d = i10;
        h51Var.f26622l = charSequence;
        h51Var.f26625o = str;
        return h51Var;
    }

    public final boolean G(Class cls) {
        HashMap hashMap;
        g51 g51Var;
        if (this.f44099a >= 10000 && (hashMap = L) != null && (g51Var = (g51) hashMap.get(cls)) != null && g51Var.viewType == this.f44099a) {
            return true;
        }
        return false;
    }

    public final boolean H(org.telegram.ui.Components.h51 r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.h51.H(org.telegram.ui.Components.h51):boolean");
    }

    public final boolean I(h51 h51Var) {
        if (this.d == h51Var.d && this.f26619i == h51Var.f26619i && this.f26633x == h51Var.f26633x && this.f26621k == h51Var.f26621k && this.f26620j == h51Var.f26620j && this.f26629s == h51Var.f26629s && this.f26628r == h51Var.f26628r && this.f26630t == h51Var.f26630t && this.f26627q == h51Var.f26627q && this.f26615c == h51Var.f26615c && TextUtils.equals(this.f26622l, h51Var.f26622l) && TextUtils.equals(this.f26623m, h51Var.f26623m) && TextUtils.equals(this.f26624n, h51Var.f26624n) && this.f26615c == h51Var.f26615c && this.f26635z == h51Var.f26635z && Math.abs(this.A - h51Var.A) < 0.01f && this.B == h51Var.B && Objects.equals(this.G, h51Var.G) && Objects.equals(this.H, h51Var.H)) {
            return true;
        }
        return false;
    }

    public final void K(boolean z10) {
        this.f26616e = z10;
        if (this.f44099a == 11) {
            this.f44099a = 12;
        }
    }

    @Override
    public final boolean a(pg.a aVar) {
        g51 F;
        if (this != aVar) {
            if (h51.class == aVar.getClass()) {
                h51 h51Var = (h51) aVar;
                int i10 = this.f44099a;
                if (i10 == h51Var.f44099a) {
                    if (i10 == 31) {
                        if (TextUtils.equals(this.f26622l, h51Var.f26622l) && TextUtils.equals(this.f26623m, h51Var.f26623m)) {
                            return true;
                        }
                        return false;
                    } else if (i10 == 28) {
                        if (this.f26635z == h51Var.f26635z) {
                            return true;
                        }
                        return false;
                    } else if (i10 != 35 && i10 != 37) {
                        if (i10 >= 10000 && (F = F(i10)) != null) {
                            return F.contentsEquals(this, h51Var);
                        }
                        return H(h51Var);
                    } else if (this.d == h51Var.d && TextUtils.equals(this.f26622l, h51Var.f26622l) && this.f26616e == h51Var.f26616e) {
                        return true;
                    } else {
                        return false;
                    }
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        g51 F;
        if (this != obj) {
            if (obj != null && h51.class == obj.getClass()) {
                h51 h51Var = (h51) obj;
                int i10 = this.f44099a;
                if (i10 == h51Var.f44099a) {
                    if (i10 != 36 && i10 != 35) {
                        if (i10 == 28) {
                            if (this.d == h51Var.d) {
                                return true;
                            }
                            return false;
                        } else if (i10 == 31) {
                            return TextUtils.equals(this.f26622l, h51Var.f26622l);
                        } else {
                            if (i10 >= 10000 && (F = F(i10)) != null) {
                                return F.equals(this, h51Var);
                            }
                            return I(h51Var);
                        }
                    } else if (this.d == h51Var.d) {
                        return true;
                    } else {
                        return false;
                    }
                }
                return false;
            }
            return false;
        }
        return true;
    }
}
