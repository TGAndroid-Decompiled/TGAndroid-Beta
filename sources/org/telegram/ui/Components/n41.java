package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import j$.util.Objects;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;
public final class n41 extends rg.a {
    public static int K = 10000;
    public static LongSparseArray L;
    public static HashMap M;
    public int A;
    public float B;
    public long C;
    public org.telegram.messenger.w10 D;
    public View.OnClickListener E;
    public View.OnClickListener F;
    public org.telegram.messenger.w10 G;
    public Object H;
    public Object I;
    public boolean J;
    public View f37647c;
    public int d;
    public boolean f37648e;
    public boolean f37649f;
    public boolean f37650g;
    public boolean h;
    public int f37651i;
    public boolean f37652j;
    public int f37653k;
    public Drawable f37654l;
    public CharSequence f37655m;
    public CharSequence f37656n;
    public CharSequence f37657o;
    public CharSequence f37658p;
    public String[] f37659q;
    public boolean f37660r;
    public boolean f37661s;
    public boolean f37662t;
    public boolean f37663u;
    public int v;
    public int f37664w;
    public boolean f37665x;
    public long f37666y;
    public int f37667z;

    public n41(int i7) {
        super(i7, false);
        this.f37650g = true;
        this.v = -1;
        this.J = true;
    }

    public static n41 A(String str, CharSequence charSequence, int i7) {
        n41 n41Var = new n41(41);
        n41Var.d = i7;
        n41Var.f37655m = charSequence;
        n41Var.f37658p = str;
        return n41Var;
    }

    public static n41 B(int i7, CharSequence charSequence) {
        n41 n41Var = new n41(7);
        n41Var.d = i7;
        n41Var.f37655m = charSequence;
        return n41Var;
    }

    public static n41 C(CharSequence charSequence) {
        n41 n41Var = new n41(7);
        n41Var.f37655m = charSequence;
        return n41Var;
    }

    public static n41 D(int i7) {
        n41 n41Var = new n41(28);
        n41Var.A = i7;
        return n41Var;
    }

    public static n41 E(int i7, int i10) {
        n41 n41Var = new n41(28);
        n41Var.d = i7;
        n41Var.A = i10;
        return n41Var;
    }

    public static n41 F(int i7, String str) {
        n41 n41Var = new n41(39);
        n41Var.d = i7;
        n41Var.f37655m = str;
        n41Var.A = 1;
        return n41Var;
    }

    public static m41 G(int i7) {
        LongSparseArray longSparseArray = L;
        if (longSparseArray == null) {
            return null;
        }
        return (m41) longSparseArray.get(i7);
    }

    public static n41 K(Class cls) {
        if (M == null) {
            M = new HashMap();
        }
        if (L == null) {
            L = new LongSparseArray();
        }
        m41 m41Var = (m41) M.get(cls);
        if (m41Var != null) {
            return new n41(m41Var.f37371a);
        }
        throw new RuntimeException("UItemFactory was not setuped: " + cls);
    }

    public static n41 b(String str) {
        n41 n41Var = new n41(1);
        n41Var.f37655m = str;
        return n41Var;
    }

    public static n41 c(int i7, int i10, String str) {
        n41 n41Var = new n41(3);
        n41Var.d = i7;
        n41Var.f37653k = i10;
        n41Var.f37655m = str;
        return n41Var;
    }

    public static n41 d(int i7, int i10, String str, String str2) {
        n41 n41Var = new n41(3);
        n41Var.d = i7;
        n41Var.f37653k = i10;
        n41Var.f37655m = str;
        n41Var.f37657o = str2;
        return n41Var;
    }

    public static n41 e(int i7, String str) {
        n41 n41Var = new n41(3);
        n41Var.d = i7;
        n41Var.f37655m = str;
        return n41Var;
    }

    public static n41 f(String str, CharSequence charSequence, int i7) {
        n41 n41Var = new n41(3);
        n41Var.d = i7;
        n41Var.f37655m = str;
        n41Var.f37657o = charSequence;
        return n41Var;
    }

    public static n41 g(CharSequence charSequence) {
        n41 n41Var = new n41(7);
        n41Var.f37655m = charSequence;
        n41Var.f37660r = true;
        return n41Var;
    }

    public static n41 h(int i7, int i10, org.telegram.ui.n41 n41Var) {
        n41 n41Var2 = new n41(i7 + 18);
        n41Var2.A = i10;
        n41Var2.H = n41Var;
        return n41Var2;
    }

    public static n41 i(int i7, CharSequence charSequence) {
        n41 n41Var = new n41(4);
        n41Var.d = i7;
        n41Var.f37655m = charSequence;
        return n41Var;
    }

    public static n41 j(int i7, View view) {
        n41 n41Var = new n41(-1);
        n41Var.d = i7;
        n41Var.f37647c = view;
        n41Var.A = -1;
        return n41Var;
    }

    public static n41 k(View view) {
        n41 n41Var = new n41(-1);
        n41Var.f37647c = view;
        n41Var.A = -1;
        return n41Var;
    }

    public static n41 l(int i7, View view) {
        n41 n41Var = new n41(-4);
        n41Var.d = i7;
        n41Var.f37647c = view;
        n41Var.A = -1;
        return n41Var;
    }

    public static n41 m(View view) {
        n41 n41Var = new n41(-4);
        n41Var.f37647c = view;
        n41Var.A = -1;
        return n41Var;
    }

    public static n41 n(View view, int i7) {
        n41 n41Var = new n41(-4);
        n41Var.f37647c = view;
        n41Var.A = i7;
        return n41Var;
    }

    public static n41 o(int i7, String str, String str2) {
        n41 n41Var = new n41(40);
        n41Var.d = i7;
        n41Var.f37655m = str;
        n41Var.f37658p = str2;
        return n41Var;
    }

    public static n41 p(int i7) {
        n41 n41Var = new n41(34);
        n41Var.A = i7;
        return n41Var;
    }

    public static n41 q(int i7, int i10) {
        n41 n41Var = new n41(34);
        n41Var.d = i7;
        n41Var.A = i10;
        return n41Var;
    }

    public static n41 r(String str) {
        n41 n41Var = new n41(31);
        n41Var.f37655m = str;
        return n41Var;
    }

    public static n41 s(String str, String str2, View.OnClickListener onClickListener) {
        n41 n41Var = new n41(31);
        n41Var.f37655m = str;
        n41Var.f37656n = str2;
        n41Var.E = onClickListener;
        return n41Var;
    }

    public static n41 t(int i7, String str) {
        n41 n41Var = new n41(0);
        n41Var.d = i7;
        n41Var.f37655m = str;
        return n41Var;
    }

    public static n41 u(CharSequence charSequence) {
        n41 n41Var = new n41(0);
        n41Var.f37655m = charSequence;
        return n41Var;
    }

    public static n41 v(org.telegram.ui.ud udVar) {
        n41 n41Var = new n41(24);
        n41Var.H = udVar;
        return n41Var;
    }

    public static n41 w(TLObject tLObject) {
        n41 n41Var = new n41(32);
        n41Var.H = tLObject;
        return n41Var;
    }

    public static n41 x(int i7, String str) {
        n41 n41Var = new n41(10);
        n41Var.d = i7;
        n41Var.f37655m = str;
        return n41Var;
    }

    public static n41 y(int i7, String str, String str2) {
        n41 n41Var = new n41(44);
        n41Var.d = i7;
        n41Var.f37655m = str;
        n41Var.f37657o = str2;
        return n41Var;
    }

    public static n41 z(int i7, CharSequence charSequence) {
        n41 n41Var = new n41(35);
        n41Var.d = i7;
        n41Var.f37655m = charSequence;
        return n41Var;
    }

    public final boolean H(Class cls) {
        HashMap hashMap;
        m41 m41Var;
        if (this.f56712a >= 10000 && (hashMap = M) != null && (m41Var = (m41) hashMap.get(cls)) != null && m41Var.f37371a == this.f56712a) {
            return true;
        }
        return false;
    }

    public final boolean I(org.telegram.ui.Components.n41 r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.n41.I(org.telegram.ui.Components.n41):boolean");
    }

    public final boolean J(n41 n41Var) {
        if (this.d == n41Var.d && this.f37651i == n41Var.f37651i && this.f37666y == n41Var.f37666y && this.f37653k == n41Var.f37653k && this.f37652j == n41Var.f37652j && this.f37662t == n41Var.f37662t && this.f37661s == n41Var.f37661s && this.f37663u == n41Var.f37663u && this.f37660r == n41Var.f37660r && this.f37647c == n41Var.f37647c && TextUtils.equals(this.f37655m, n41Var.f37655m) && TextUtils.equals(this.f37656n, n41Var.f37656n) && TextUtils.equals(this.f37657o, n41Var.f37657o) && this.f37647c == n41Var.f37647c && this.A == n41Var.A && Math.abs(this.B - n41Var.B) < 0.01f && this.C == n41Var.C && this.f37654l == n41Var.f37654l && Objects.equals(this.H, n41Var.H) && Objects.equals(this.I, n41Var.I)) {
            return true;
        }
        return false;
    }

    public final void L(boolean z10) {
        this.f37648e = z10;
        if (this.f56712a == 11) {
            this.f56712a = 12;
        }
    }

    @Override
    public final boolean a(rg.a aVar) {
        m41 G;
        if (this != aVar) {
            if (n41.class == aVar.getClass()) {
                n41 n41Var = (n41) aVar;
                int i7 = this.f56712a;
                if (i7 == n41Var.f56712a) {
                    if (i7 == 31) {
                        if (TextUtils.equals(this.f37655m, n41Var.f37655m) && TextUtils.equals(this.f37656n, n41Var.f37656n)) {
                            return true;
                        }
                        return false;
                    } else if (i7 == 28) {
                        if (this.A == n41Var.A) {
                            return true;
                        }
                        return false;
                    } else if (i7 != 35 && i7 != 37) {
                        if (i7 >= 10000 && (G = G(i7)) != null) {
                            return G.c(this, n41Var);
                        }
                        return I(n41Var);
                    } else if (this.d == n41Var.d && TextUtils.equals(this.f37655m, n41Var.f37655m) && this.f37648e == n41Var.f37648e) {
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
        m41 G;
        if (this != obj) {
            if (obj != null && n41.class == obj.getClass()) {
                n41 n41Var = (n41) obj;
                int i7 = this.f56712a;
                if (i7 == n41Var.f56712a) {
                    if (i7 != 36 && i7 != 35) {
                        if (i7 == 28) {
                            if (this.d == n41Var.d) {
                                return true;
                            }
                            return false;
                        } else if (i7 == 31) {
                            return TextUtils.equals(this.f37655m, n41Var.f37655m);
                        } else {
                            if (i7 >= 10000 && (G = G(i7)) != null) {
                                return G.e(this, n41Var);
                            }
                            return J(n41Var);
                        }
                    } else if (this.d == n41Var.d) {
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
