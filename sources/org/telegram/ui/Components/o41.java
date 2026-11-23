package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import j$.util.Objects;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;
public final class o41 extends rg.a {
    public static int K = 10000;
    public static LongSparseArray L;
    public static HashMap M;
    public int A;
    public float B;
    public long C;
    public org.telegram.messenger.y10 D;
    public View.OnClickListener E;
    public View.OnClickListener F;
    public org.telegram.messenger.y10 G;
    public Object H;
    public Object I;
    public boolean J;
    public View f38050c;
    public int d;
    public boolean f38051e;
    public boolean f38052f;
    public boolean f38053g;
    public boolean h;
    public int f38054i;
    public boolean f38055j;
    public int f38056k;
    public Drawable f38057l;
    public CharSequence f38058m;
    public CharSequence f38059n;
    public CharSequence f38060o;
    public CharSequence f38061p;
    public String[] f38062q;
    public boolean f38063r;
    public boolean f38064s;
    public boolean f38065t;
    public boolean f38066u;
    public int v;
    public int f38067w;
    public boolean f38068x;
    public long f38069y;
    public int f38070z;

    public o41(int i7) {
        super(i7, false);
        this.f38053g = true;
        this.v = -1;
        this.J = true;
    }

    public static o41 A(String str, CharSequence charSequence, int i7) {
        o41 o41Var = new o41(41);
        o41Var.d = i7;
        o41Var.f38058m = charSequence;
        o41Var.f38061p = str;
        return o41Var;
    }

    public static o41 B(int i7, CharSequence charSequence) {
        o41 o41Var = new o41(7);
        o41Var.d = i7;
        o41Var.f38058m = charSequence;
        return o41Var;
    }

    public static o41 C(CharSequence charSequence) {
        o41 o41Var = new o41(7);
        o41Var.f38058m = charSequence;
        return o41Var;
    }

    public static o41 D(int i7) {
        o41 o41Var = new o41(28);
        o41Var.A = i7;
        return o41Var;
    }

    public static o41 E(int i7, int i10) {
        o41 o41Var = new o41(28);
        o41Var.d = i7;
        o41Var.A = i10;
        return o41Var;
    }

    public static o41 F(int i7, String str) {
        o41 o41Var = new o41(39);
        o41Var.d = i7;
        o41Var.f38058m = str;
        o41Var.A = 1;
        return o41Var;
    }

    public static n41 G(int i7) {
        LongSparseArray longSparseArray = L;
        if (longSparseArray == null) {
            return null;
        }
        return (n41) longSparseArray.get(i7);
    }

    public static o41 K(Class cls) {
        if (M == null) {
            M = new HashMap();
        }
        if (L == null) {
            L = new LongSparseArray();
        }
        n41 n41Var = (n41) M.get(cls);
        if (n41Var != null) {
            return new o41(n41Var.f37728a);
        }
        throw new RuntimeException("UItemFactory was not setuped: " + cls);
    }

    public static o41 b(String str) {
        o41 o41Var = new o41(1);
        o41Var.f38058m = str;
        return o41Var;
    }

    public static o41 c(int i7, int i10, String str) {
        o41 o41Var = new o41(3);
        o41Var.d = i7;
        o41Var.f38056k = i10;
        o41Var.f38058m = str;
        return o41Var;
    }

    public static o41 d(int i7, int i10, String str, String str2) {
        o41 o41Var = new o41(3);
        o41Var.d = i7;
        o41Var.f38056k = i10;
        o41Var.f38058m = str;
        o41Var.f38060o = str2;
        return o41Var;
    }

    public static o41 e(int i7, String str) {
        o41 o41Var = new o41(3);
        o41Var.d = i7;
        o41Var.f38058m = str;
        return o41Var;
    }

    public static o41 f(String str, CharSequence charSequence, int i7) {
        o41 o41Var = new o41(3);
        o41Var.d = i7;
        o41Var.f38058m = str;
        o41Var.f38060o = charSequence;
        return o41Var;
    }

    public static o41 g(CharSequence charSequence) {
        o41 o41Var = new o41(7);
        o41Var.f38058m = charSequence;
        o41Var.f38063r = true;
        return o41Var;
    }

    public static o41 h(int i7, int i10, org.telegram.ui.o41 o41Var) {
        o41 o41Var2 = new o41(i7 + 18);
        o41Var2.A = i10;
        o41Var2.H = o41Var;
        return o41Var2;
    }

    public static o41 i(int i7, CharSequence charSequence) {
        o41 o41Var = new o41(4);
        o41Var.d = i7;
        o41Var.f38058m = charSequence;
        return o41Var;
    }

    public static o41 j(int i7, View view) {
        o41 o41Var = new o41(-1);
        o41Var.d = i7;
        o41Var.f38050c = view;
        o41Var.A = -1;
        return o41Var;
    }

    public static o41 k(View view) {
        o41 o41Var = new o41(-1);
        o41Var.f38050c = view;
        o41Var.A = -1;
        return o41Var;
    }

    public static o41 l(int i7, View view) {
        o41 o41Var = new o41(-4);
        o41Var.d = i7;
        o41Var.f38050c = view;
        o41Var.A = -1;
        return o41Var;
    }

    public static o41 m(View view) {
        o41 o41Var = new o41(-4);
        o41Var.f38050c = view;
        o41Var.A = -1;
        return o41Var;
    }

    public static o41 n(View view, int i7) {
        o41 o41Var = new o41(-4);
        o41Var.f38050c = view;
        o41Var.A = i7;
        return o41Var;
    }

    public static o41 o(int i7, String str, String str2) {
        o41 o41Var = new o41(40);
        o41Var.d = i7;
        o41Var.f38058m = str;
        o41Var.f38061p = str2;
        return o41Var;
    }

    public static o41 p(int i7) {
        o41 o41Var = new o41(34);
        o41Var.A = i7;
        return o41Var;
    }

    public static o41 q(int i7, int i10) {
        o41 o41Var = new o41(34);
        o41Var.d = i7;
        o41Var.A = i10;
        return o41Var;
    }

    public static o41 r(String str) {
        o41 o41Var = new o41(31);
        o41Var.f38058m = str;
        return o41Var;
    }

    public static o41 s(String str, String str2, View.OnClickListener onClickListener) {
        o41 o41Var = new o41(31);
        o41Var.f38058m = str;
        o41Var.f38059n = str2;
        o41Var.E = onClickListener;
        return o41Var;
    }

    public static o41 t(int i7, String str) {
        o41 o41Var = new o41(0);
        o41Var.d = i7;
        o41Var.f38058m = str;
        return o41Var;
    }

    public static o41 u(CharSequence charSequence) {
        o41 o41Var = new o41(0);
        o41Var.f38058m = charSequence;
        return o41Var;
    }

    public static o41 v(org.telegram.ui.ud udVar) {
        o41 o41Var = new o41(24);
        o41Var.H = udVar;
        return o41Var;
    }

    public static o41 w(TLObject tLObject) {
        o41 o41Var = new o41(32);
        o41Var.H = tLObject;
        return o41Var;
    }

    public static o41 x(int i7, String str) {
        o41 o41Var = new o41(10);
        o41Var.d = i7;
        o41Var.f38058m = str;
        return o41Var;
    }

    public static o41 y(int i7, String str, String str2) {
        o41 o41Var = new o41(44);
        o41Var.d = i7;
        o41Var.f38058m = str;
        o41Var.f38060o = str2;
        return o41Var;
    }

    public static o41 z(int i7, CharSequence charSequence) {
        o41 o41Var = new o41(35);
        o41Var.d = i7;
        o41Var.f38058m = charSequence;
        return o41Var;
    }

    public final boolean H(Class cls) {
        HashMap hashMap;
        n41 n41Var;
        if (this.f56599a >= 10000 && (hashMap = M) != null && (n41Var = (n41) hashMap.get(cls)) != null && n41Var.f37728a == this.f56599a) {
            return true;
        }
        return false;
    }

    public final boolean I(org.telegram.ui.Components.o41 r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.o41.I(org.telegram.ui.Components.o41):boolean");
    }

    public final boolean J(o41 o41Var) {
        if (this.d == o41Var.d && this.f38054i == o41Var.f38054i && this.f38069y == o41Var.f38069y && this.f38056k == o41Var.f38056k && this.f38055j == o41Var.f38055j && this.f38065t == o41Var.f38065t && this.f38064s == o41Var.f38064s && this.f38066u == o41Var.f38066u && this.f38063r == o41Var.f38063r && this.f38050c == o41Var.f38050c && TextUtils.equals(this.f38058m, o41Var.f38058m) && TextUtils.equals(this.f38059n, o41Var.f38059n) && TextUtils.equals(this.f38060o, o41Var.f38060o) && this.f38050c == o41Var.f38050c && this.A == o41Var.A && Math.abs(this.B - o41Var.B) < 0.01f && this.C == o41Var.C && this.f38057l == o41Var.f38057l && Objects.equals(this.H, o41Var.H) && Objects.equals(this.I, o41Var.I)) {
            return true;
        }
        return false;
    }

    public final void L(boolean z10) {
        this.f38051e = z10;
        if (this.f56599a == 11) {
            this.f56599a = 12;
        }
    }

    @Override
    public final boolean a(rg.a aVar) {
        n41 G;
        if (this != aVar) {
            if (o41.class == aVar.getClass()) {
                o41 o41Var = (o41) aVar;
                int i7 = this.f56599a;
                if (i7 == o41Var.f56599a) {
                    if (i7 == 31) {
                        if (TextUtils.equals(this.f38058m, o41Var.f38058m) && TextUtils.equals(this.f38059n, o41Var.f38059n)) {
                            return true;
                        }
                        return false;
                    } else if (i7 == 28) {
                        if (this.A == o41Var.A) {
                            return true;
                        }
                        return false;
                    } else if (i7 != 35 && i7 != 37) {
                        if (i7 >= 10000 && (G = G(i7)) != null) {
                            return G.c(this, o41Var);
                        }
                        return I(o41Var);
                    } else if (this.d == o41Var.d && TextUtils.equals(this.f38058m, o41Var.f38058m) && this.f38051e == o41Var.f38051e) {
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
        n41 G;
        if (this != obj) {
            if (obj != null && o41.class == obj.getClass()) {
                o41 o41Var = (o41) obj;
                int i7 = this.f56599a;
                if (i7 == o41Var.f56599a) {
                    if (i7 != 36 && i7 != 35) {
                        if (i7 == 28) {
                            if (this.d == o41Var.d) {
                                return true;
                            }
                            return false;
                        } else if (i7 == 31) {
                            return TextUtils.equals(this.f38058m, o41Var.f38058m);
                        } else {
                            if (i7 >= 10000 && (G = G(i7)) != null) {
                                return G.e(this, o41Var);
                            }
                            return J(o41Var);
                        }
                    } else if (this.d == o41Var.d) {
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
