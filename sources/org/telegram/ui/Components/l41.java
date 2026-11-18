package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import j$.util.Objects;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;
public final class l41 extends rg.a {
    public static int K = 10000;
    public static LongSparseArray L;
    public static HashMap M;
    public int A;
    public float B;
    public long C;
    public org.telegram.messenger.x10 D;
    public View.OnClickListener E;
    public View.OnClickListener F;
    public org.telegram.messenger.x10 G;
    public Object H;
    public Object I;
    public boolean J;
    public View f37010c;
    public int d;
    public boolean f37011e;
    public boolean f37012f;
    public boolean f37013g;
    public boolean h;
    public int f37014i;
    public boolean f37015j;
    public int f37016k;
    public Drawable f37017l;
    public CharSequence f37018m;
    public CharSequence f37019n;
    public CharSequence f37020o;
    public CharSequence f37021p;
    public String[] f37022q;
    public boolean f37023r;
    public boolean f37024s;
    public boolean f37025t;
    public boolean f37026u;
    public int v;
    public int f37027w;
    public boolean f37028x;
    public long f37029y;
    public int f37030z;

    public l41(int i7) {
        super(i7, false);
        this.f37013g = true;
        this.v = -1;
        this.J = true;
    }

    public static l41 A(String str, CharSequence charSequence, int i7) {
        l41 l41Var = new l41(41);
        l41Var.d = i7;
        l41Var.f37018m = charSequence;
        l41Var.f37021p = str;
        return l41Var;
    }

    public static l41 B(int i7, CharSequence charSequence) {
        l41 l41Var = new l41(7);
        l41Var.d = i7;
        l41Var.f37018m = charSequence;
        return l41Var;
    }

    public static l41 C(CharSequence charSequence) {
        l41 l41Var = new l41(7);
        l41Var.f37018m = charSequence;
        return l41Var;
    }

    public static l41 D(int i7) {
        l41 l41Var = new l41(28);
        l41Var.A = i7;
        return l41Var;
    }

    public static l41 E(int i7, int i10) {
        l41 l41Var = new l41(28);
        l41Var.d = i7;
        l41Var.A = i10;
        return l41Var;
    }

    public static l41 F(int i7, String str) {
        l41 l41Var = new l41(39);
        l41Var.d = i7;
        l41Var.f37018m = str;
        l41Var.A = 1;
        return l41Var;
    }

    public static k41 G(int i7) {
        LongSparseArray longSparseArray = L;
        if (longSparseArray == null) {
            return null;
        }
        return (k41) longSparseArray.get(i7);
    }

    public static l41 K(Class cls) {
        if (M == null) {
            M = new HashMap();
        }
        if (L == null) {
            L = new LongSparseArray();
        }
        k41 k41Var = (k41) M.get(cls);
        if (k41Var != null) {
            return new l41(k41Var.f36677a);
        }
        throw new RuntimeException("UItemFactory was not setuped: " + cls);
    }

    public static l41 b(String str) {
        l41 l41Var = new l41(1);
        l41Var.f37018m = str;
        return l41Var;
    }

    public static l41 c(int i7, int i10, String str) {
        l41 l41Var = new l41(3);
        l41Var.d = i7;
        l41Var.f37016k = i10;
        l41Var.f37018m = str;
        return l41Var;
    }

    public static l41 d(int i7, int i10, String str, String str2) {
        l41 l41Var = new l41(3);
        l41Var.d = i7;
        l41Var.f37016k = i10;
        l41Var.f37018m = str;
        l41Var.f37020o = str2;
        return l41Var;
    }

    public static l41 e(int i7, String str) {
        l41 l41Var = new l41(3);
        l41Var.d = i7;
        l41Var.f37018m = str;
        return l41Var;
    }

    public static l41 f(String str, CharSequence charSequence, int i7) {
        l41 l41Var = new l41(3);
        l41Var.d = i7;
        l41Var.f37018m = str;
        l41Var.f37020o = charSequence;
        return l41Var;
    }

    public static l41 g(CharSequence charSequence) {
        l41 l41Var = new l41(7);
        l41Var.f37018m = charSequence;
        l41Var.f37023r = true;
        return l41Var;
    }

    public static l41 h(int i7, int i10, org.telegram.ui.o41 o41Var) {
        l41 l41Var = new l41(i7 + 18);
        l41Var.A = i10;
        l41Var.H = o41Var;
        return l41Var;
    }

    public static l41 i(int i7, CharSequence charSequence) {
        l41 l41Var = new l41(4);
        l41Var.d = i7;
        l41Var.f37018m = charSequence;
        return l41Var;
    }

    public static l41 j(int i7, View view) {
        l41 l41Var = new l41(-1);
        l41Var.d = i7;
        l41Var.f37010c = view;
        l41Var.A = -1;
        return l41Var;
    }

    public static l41 k(View view) {
        l41 l41Var = new l41(-1);
        l41Var.f37010c = view;
        l41Var.A = -1;
        return l41Var;
    }

    public static l41 l(int i7, View view) {
        l41 l41Var = new l41(-4);
        l41Var.d = i7;
        l41Var.f37010c = view;
        l41Var.A = -1;
        return l41Var;
    }

    public static l41 m(View view) {
        l41 l41Var = new l41(-4);
        l41Var.f37010c = view;
        l41Var.A = -1;
        return l41Var;
    }

    public static l41 n(View view, int i7) {
        l41 l41Var = new l41(-4);
        l41Var.f37010c = view;
        l41Var.A = i7;
        return l41Var;
    }

    public static l41 o(int i7, String str, String str2) {
        l41 l41Var = new l41(40);
        l41Var.d = i7;
        l41Var.f37018m = str;
        l41Var.f37021p = str2;
        return l41Var;
    }

    public static l41 p(int i7) {
        l41 l41Var = new l41(34);
        l41Var.A = i7;
        return l41Var;
    }

    public static l41 q(int i7, int i10) {
        l41 l41Var = new l41(34);
        l41Var.d = i7;
        l41Var.A = i10;
        return l41Var;
    }

    public static l41 r(String str) {
        l41 l41Var = new l41(31);
        l41Var.f37018m = str;
        return l41Var;
    }

    public static l41 s(String str, String str2, View.OnClickListener onClickListener) {
        l41 l41Var = new l41(31);
        l41Var.f37018m = str;
        l41Var.f37019n = str2;
        l41Var.E = onClickListener;
        return l41Var;
    }

    public static l41 t(int i7, String str) {
        l41 l41Var = new l41(0);
        l41Var.d = i7;
        l41Var.f37018m = str;
        return l41Var;
    }

    public static l41 u(CharSequence charSequence) {
        l41 l41Var = new l41(0);
        l41Var.f37018m = charSequence;
        return l41Var;
    }

    public static l41 v(org.telegram.ui.ud udVar) {
        l41 l41Var = new l41(24);
        l41Var.H = udVar;
        return l41Var;
    }

    public static l41 w(TLObject tLObject) {
        l41 l41Var = new l41(32);
        l41Var.H = tLObject;
        return l41Var;
    }

    public static l41 x(int i7, String str) {
        l41 l41Var = new l41(10);
        l41Var.d = i7;
        l41Var.f37018m = str;
        return l41Var;
    }

    public static l41 y(int i7, String str, String str2) {
        l41 l41Var = new l41(44);
        l41Var.d = i7;
        l41Var.f37018m = str;
        l41Var.f37020o = str2;
        return l41Var;
    }

    public static l41 z(int i7, CharSequence charSequence) {
        l41 l41Var = new l41(35);
        l41Var.d = i7;
        l41Var.f37018m = charSequence;
        return l41Var;
    }

    public final boolean H(Class cls) {
        HashMap hashMap;
        k41 k41Var;
        if (this.f56589a >= 10000 && (hashMap = M) != null && (k41Var = (k41) hashMap.get(cls)) != null && k41Var.f36677a == this.f56589a) {
            return true;
        }
        return false;
    }

    public final boolean I(org.telegram.ui.Components.l41 r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.l41.I(org.telegram.ui.Components.l41):boolean");
    }

    public final boolean J(l41 l41Var) {
        if (this.d == l41Var.d && this.f37014i == l41Var.f37014i && this.f37029y == l41Var.f37029y && this.f37016k == l41Var.f37016k && this.f37015j == l41Var.f37015j && this.f37025t == l41Var.f37025t && this.f37024s == l41Var.f37024s && this.f37026u == l41Var.f37026u && this.f37023r == l41Var.f37023r && this.f37010c == l41Var.f37010c && TextUtils.equals(this.f37018m, l41Var.f37018m) && TextUtils.equals(this.f37019n, l41Var.f37019n) && TextUtils.equals(this.f37020o, l41Var.f37020o) && this.f37010c == l41Var.f37010c && this.A == l41Var.A && Math.abs(this.B - l41Var.B) < 0.01f && this.C == l41Var.C && this.f37017l == l41Var.f37017l && Objects.equals(this.H, l41Var.H) && Objects.equals(this.I, l41Var.I)) {
            return true;
        }
        return false;
    }

    public final void L(boolean z10) {
        this.f37011e = z10;
        if (this.f56589a == 11) {
            this.f56589a = 12;
        }
    }

    @Override
    public final boolean a(rg.a aVar) {
        k41 G;
        if (this != aVar) {
            if (l41.class == aVar.getClass()) {
                l41 l41Var = (l41) aVar;
                int i7 = this.f56589a;
                if (i7 == l41Var.f56589a) {
                    if (i7 == 31) {
                        if (TextUtils.equals(this.f37018m, l41Var.f37018m) && TextUtils.equals(this.f37019n, l41Var.f37019n)) {
                            return true;
                        }
                        return false;
                    } else if (i7 == 28) {
                        if (this.A == l41Var.A) {
                            return true;
                        }
                        return false;
                    } else if (i7 != 35 && i7 != 37) {
                        if (i7 >= 10000 && (G = G(i7)) != null) {
                            return G.c(this, l41Var);
                        }
                        return I(l41Var);
                    } else if (this.d == l41Var.d && TextUtils.equals(this.f37018m, l41Var.f37018m) && this.f37011e == l41Var.f37011e) {
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
        k41 G;
        if (this != obj) {
            if (obj != null && l41.class == obj.getClass()) {
                l41 l41Var = (l41) obj;
                int i7 = this.f56589a;
                if (i7 == l41Var.f56589a) {
                    if (i7 != 36 && i7 != 35) {
                        if (i7 == 28) {
                            if (this.d == l41Var.d) {
                                return true;
                            }
                            return false;
                        } else if (i7 == 31) {
                            return TextUtils.equals(this.f37018m, l41Var.f37018m);
                        } else {
                            if (i7 >= 10000 && (G = G(i7)) != null) {
                                return G.e(this, l41Var);
                            }
                            return J(l41Var);
                        }
                    } else if (this.d == l41Var.d) {
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
