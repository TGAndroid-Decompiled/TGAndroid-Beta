package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import j$.util.Objects;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;
public final class a51 extends hg.b {
    public static int J = 10000;
    public static LongSparseArray K;
    public static HashMap L;
    public float A;
    public long B;
    public org.telegram.messenger.q20 C;
    public View.OnClickListener D;
    public View.OnClickListener E;
    public org.telegram.messenger.q20 F;
    public Object G;
    public Object H;
    public boolean I;
    public View f24286c;
    public int d;
    public boolean e;
    public boolean f24287f;
    public boolean f24288g;
    public boolean h;
    public int f24289i;
    public boolean f24290j;
    public int f24291k;
    public CharSequence f24292l;
    public CharSequence f24293m;
    public CharSequence f24294n;
    public CharSequence f24295o;
    public String[] f24296p;
    public boolean f24297q;
    public boolean f24298r;
    public boolean f24299s;
    public boolean f24300t;
    public int f24301u;
    public int v;
    public boolean f24302w;
    public long f24303x;
    public int f24304y;
    public int f24305z;

    public a51(int i10) {
        super(i10, false);
        this.f24288g = true;
        this.f24301u = -1;
        this.I = true;
    }

    public static a51 A(String str, CharSequence charSequence, int i10) {
        a51 a51Var = new a51(41);
        a51Var.d = i10;
        a51Var.f24292l = charSequence;
        a51Var.f24295o = str;
        return a51Var;
    }

    public static a51 B(int i10, CharSequence charSequence) {
        a51 a51Var = new a51(7);
        a51Var.d = i10;
        a51Var.f24292l = charSequence;
        return a51Var;
    }

    public static a51 C(CharSequence charSequence) {
        a51 a51Var = new a51(7);
        a51Var.f24292l = charSequence;
        return a51Var;
    }

    public static a51 D(int i10) {
        a51 a51Var = new a51(28);
        a51Var.f24305z = i10;
        return a51Var;
    }

    public static a51 E(int i10, int i11) {
        a51 a51Var = new a51(28);
        a51Var.d = i10;
        a51Var.f24305z = i11;
        return a51Var;
    }

    public static a51 F(int i10, String str) {
        a51 a51Var = new a51(39);
        a51Var.d = i10;
        a51Var.f24292l = str;
        a51Var.f24305z = 1;
        return a51Var;
    }

    public static z41 G(int i10) {
        LongSparseArray longSparseArray = K;
        if (longSparseArray == null) {
            return null;
        }
        return (z41) longSparseArray.get(i10);
    }

    public static a51 K(Class cls) {
        if (L == null) {
            L = new HashMap();
        }
        if (K == null) {
            K = new LongSparseArray();
        }
        z41 z41Var = (z41) L.get(cls);
        if (z41Var != null) {
            return new a51(z41Var.f32898a);
        }
        throw new RuntimeException("UItemFactory was not setuped: " + cls);
    }

    public static a51 b(String str) {
        a51 a51Var = new a51(1);
        a51Var.f24292l = str;
        return a51Var;
    }

    public static a51 c(int i10, int i11, String str) {
        a51 a51Var = new a51(3);
        a51Var.d = i10;
        a51Var.f24291k = i11;
        a51Var.f24292l = str;
        return a51Var;
    }

    public static a51 d(int i10, int i11, String str, String str2) {
        a51 a51Var = new a51(3);
        a51Var.d = i10;
        a51Var.f24291k = i11;
        a51Var.f24292l = str;
        a51Var.f24294n = str2;
        return a51Var;
    }

    public static a51 e(int i10, String str) {
        a51 a51Var = new a51(3);
        a51Var.d = i10;
        a51Var.f24292l = str;
        return a51Var;
    }

    public static a51 f(String str, CharSequence charSequence, int i10) {
        a51 a51Var = new a51(3);
        a51Var.d = i10;
        a51Var.f24292l = str;
        a51Var.f24294n = charSequence;
        return a51Var;
    }

    public static a51 g(CharSequence charSequence) {
        a51 a51Var = new a51(7);
        a51Var.f24292l = charSequence;
        a51Var.f24297q = true;
        return a51Var;
    }

    public static a51 h(int i10, int i11, org.telegram.ui.g61 g61Var) {
        a51 a51Var = new a51(i10 + 18);
        a51Var.f24305z = i11;
        a51Var.G = g61Var;
        return a51Var;
    }

    public static a51 i(int i10, CharSequence charSequence) {
        a51 a51Var = new a51(4);
        a51Var.d = i10;
        a51Var.f24292l = charSequence;
        return a51Var;
    }

    public static a51 j(int i10, View view) {
        a51 a51Var = new a51(-1);
        a51Var.d = i10;
        a51Var.f24286c = view;
        a51Var.f24305z = -1;
        return a51Var;
    }

    public static a51 k(View view) {
        a51 a51Var = new a51(-1);
        a51Var.f24286c = view;
        a51Var.f24305z = -1;
        return a51Var;
    }

    public static a51 l(int i10, View view) {
        a51 a51Var = new a51(-4);
        a51Var.d = i10;
        a51Var.f24286c = view;
        a51Var.f24305z = -1;
        return a51Var;
    }

    public static a51 m(View view) {
        a51 a51Var = new a51(-4);
        a51Var.f24286c = view;
        a51Var.f24305z = -1;
        return a51Var;
    }

    public static a51 n(View view, int i10) {
        a51 a51Var = new a51(-4);
        a51Var.f24286c = view;
        a51Var.f24305z = i10;
        return a51Var;
    }

    public static a51 o(int i10, String str, String str2) {
        a51 a51Var = new a51(40);
        a51Var.d = i10;
        a51Var.f24292l = str;
        a51Var.f24295o = str2;
        return a51Var;
    }

    public static a51 p(int i10) {
        a51 a51Var = new a51(34);
        a51Var.f24305z = i10;
        return a51Var;
    }

    public static a51 q(int i10, int i11) {
        a51 a51Var = new a51(34);
        a51Var.d = i10;
        a51Var.f24305z = i11;
        return a51Var;
    }

    public static a51 r(String str) {
        a51 a51Var = new a51(31);
        a51Var.f24292l = str;
        return a51Var;
    }

    public static a51 s(String str, String str2, View.OnClickListener onClickListener) {
        a51 a51Var = new a51(31);
        a51Var.f24292l = str;
        a51Var.f24293m = str2;
        a51Var.D = onClickListener;
        return a51Var;
    }

    public static a51 t(int i10, String str) {
        a51 a51Var = new a51(0);
        a51Var.d = i10;
        a51Var.f24292l = str;
        return a51Var;
    }

    public static a51 u(String str) {
        a51 a51Var = new a51(0);
        a51Var.f24292l = str;
        return a51Var;
    }

    public static a51 v(org.telegram.ui.ie ieVar) {
        a51 a51Var = new a51(24);
        a51Var.G = ieVar;
        return a51Var;
    }

    public static a51 w(TLObject tLObject) {
        a51 a51Var = new a51(32);
        a51Var.G = tLObject;
        return a51Var;
    }

    public static a51 x(int i10, String str) {
        a51 a51Var = new a51(10);
        a51Var.d = i10;
        a51Var.f24292l = str;
        return a51Var;
    }

    public static a51 y(int i10, String str, String str2) {
        a51 a51Var = new a51(44);
        a51Var.d = i10;
        a51Var.f24292l = str;
        a51Var.f24294n = str2;
        return a51Var;
    }

    public static a51 z(int i10, CharSequence charSequence) {
        a51 a51Var = new a51(35);
        a51Var.d = i10;
        a51Var.f24292l = charSequence;
        return a51Var;
    }

    public final boolean H(Class cls) {
        HashMap hashMap;
        z41 z41Var;
        if (this.f7680a >= 10000 && (hashMap = L) != null && (z41Var = (z41) hashMap.get(cls)) != null && z41Var.f32898a == this.f7680a) {
            return true;
        }
        return false;
    }

    public final boolean I(org.telegram.ui.Components.a51 r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.a51.I(org.telegram.ui.Components.a51):boolean");
    }

    public final boolean J(a51 a51Var) {
        if (this.d == a51Var.d && this.f24289i == a51Var.f24289i && this.f24303x == a51Var.f24303x && this.f24291k == a51Var.f24291k && this.f24290j == a51Var.f24290j && this.f24299s == a51Var.f24299s && this.f24298r == a51Var.f24298r && this.f24300t == a51Var.f24300t && this.f24297q == a51Var.f24297q && this.f24286c == a51Var.f24286c && TextUtils.equals(this.f24292l, a51Var.f24292l) && TextUtils.equals(this.f24293m, a51Var.f24293m) && TextUtils.equals(this.f24294n, a51Var.f24294n) && this.f24286c == a51Var.f24286c && this.f24305z == a51Var.f24305z && Math.abs(this.A - a51Var.A) < 0.01f && this.B == a51Var.B && Objects.equals(this.G, a51Var.G) && Objects.equals(this.H, a51Var.H)) {
            return true;
        }
        return false;
    }

    public final void L(boolean z10) {
        this.e = z10;
        if (this.f7680a == 11) {
            this.f7680a = 12;
        }
    }

    @Override
    public final boolean a(hg.b bVar) {
        z41 G;
        if (this != bVar) {
            if (a51.class == bVar.getClass()) {
                a51 a51Var = (a51) bVar;
                int i10 = this.f7680a;
                if (i10 == a51Var.f7680a) {
                    if (i10 == 31) {
                        if (TextUtils.equals(this.f24292l, a51Var.f24292l) && TextUtils.equals(this.f24293m, a51Var.f24293m)) {
                            return true;
                        }
                        return false;
                    } else if (i10 == 28) {
                        if (this.f24305z == a51Var.f24305z) {
                            return true;
                        }
                        return false;
                    } else if (i10 != 35 && i10 != 37) {
                        if (i10 >= 10000 && (G = G(i10)) != null) {
                            return G.c(this, a51Var);
                        }
                        return I(a51Var);
                    } else if (this.d == a51Var.d && TextUtils.equals(this.f24292l, a51Var.f24292l) && this.e == a51Var.e) {
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
        z41 G;
        if (this != obj) {
            if (obj != null && a51.class == obj.getClass()) {
                a51 a51Var = (a51) obj;
                int i10 = this.f7680a;
                if (i10 == a51Var.f7680a) {
                    if (i10 != 36 && i10 != 35) {
                        if (i10 == 28) {
                            if (this.d == a51Var.d) {
                                return true;
                            }
                            return false;
                        } else if (i10 == 31) {
                            return TextUtils.equals(this.f24292l, a51Var.f24292l);
                        } else {
                            if (i10 >= 10000 && (G = G(i10)) != null) {
                                return G.e(this, a51Var);
                            }
                            return J(a51Var);
                        }
                    } else if (this.d == a51Var.d) {
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
