package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import j$.util.Objects;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;
public final class b41 extends rg.a {
    public static int J = 10000;
    public static LongSparseArray K;
    public static HashMap L;
    public float A;
    public long B;
    public org.telegram.messenger.z10 C;
    public View.OnClickListener D;
    public View.OnClickListener E;
    public org.telegram.messenger.z10 F;
    public Object G;
    public Object H;
    public boolean I;
    public View f33174c;
    public int d;
    public boolean f33175e;
    public boolean f33176f;
    public boolean f33177g;
    public boolean h;
    public int f33178i;
    public boolean f33179j;
    public int f33180k;
    public CharSequence f33181l;
    public CharSequence f33182m;
    public CharSequence f33183n;
    public CharSequence f33184o;
    public String[] f33185p;
    public boolean f33186q;
    public boolean f33187r;
    public boolean f33188s;
    public boolean f33189t;
    public int f33190u;
    public int v;
    public boolean f33191w;
    public long f33192x;
    public int f33193y;
    public int f33194z;

    public b41(int i7) {
        super(i7, false);
        this.f33177g = true;
        this.f33190u = -1;
        this.I = true;
    }

    public static b41 A(String str, CharSequence charSequence, int i7) {
        b41 b41Var = new b41(41);
        b41Var.d = i7;
        b41Var.f33181l = charSequence;
        b41Var.f33184o = str;
        return b41Var;
    }

    public static b41 B(int i7, CharSequence charSequence) {
        b41 b41Var = new b41(7);
        b41Var.d = i7;
        b41Var.f33181l = charSequence;
        return b41Var;
    }

    public static b41 C(CharSequence charSequence) {
        b41 b41Var = new b41(7);
        b41Var.f33181l = charSequence;
        return b41Var;
    }

    public static b41 D(int i7) {
        b41 b41Var = new b41(28);
        b41Var.f33194z = i7;
        return b41Var;
    }

    public static b41 E(int i7, int i10) {
        b41 b41Var = new b41(28);
        b41Var.d = i7;
        b41Var.f33194z = i10;
        return b41Var;
    }

    public static b41 F(int i7, String str) {
        b41 b41Var = new b41(39);
        b41Var.d = i7;
        b41Var.f33181l = str;
        b41Var.f33194z = 1;
        return b41Var;
    }

    public static a41 G(int i7) {
        LongSparseArray longSparseArray = K;
        if (longSparseArray == null) {
            return null;
        }
        return (a41) longSparseArray.get(i7);
    }

    public static b41 K(Class cls) {
        if (L == null) {
            L = new HashMap();
        }
        if (K == null) {
            K = new LongSparseArray();
        }
        a41 a41Var = (a41) L.get(cls);
        if (a41Var != null) {
            return new b41(a41Var.f32849a);
        }
        throw new RuntimeException("UItemFactory was not setuped: " + cls);
    }

    public static b41 b(String str) {
        b41 b41Var = new b41(1);
        b41Var.f33181l = str;
        return b41Var;
    }

    public static b41 c(int i7, int i10, String str) {
        b41 b41Var = new b41(3);
        b41Var.d = i7;
        b41Var.f33180k = i10;
        b41Var.f33181l = str;
        return b41Var;
    }

    public static b41 d(int i7, int i10, String str, String str2) {
        b41 b41Var = new b41(3);
        b41Var.d = i7;
        b41Var.f33180k = i10;
        b41Var.f33181l = str;
        b41Var.f33183n = str2;
        return b41Var;
    }

    public static b41 e(int i7, String str) {
        b41 b41Var = new b41(3);
        b41Var.d = i7;
        b41Var.f33181l = str;
        return b41Var;
    }

    public static b41 f(String str, CharSequence charSequence, int i7) {
        b41 b41Var = new b41(3);
        b41Var.d = i7;
        b41Var.f33181l = str;
        b41Var.f33183n = charSequence;
        return b41Var;
    }

    public static b41 g(CharSequence charSequence) {
        b41 b41Var = new b41(7);
        b41Var.f33181l = charSequence;
        b41Var.f33186q = true;
        return b41Var;
    }

    public static b41 h(int i7, int i10, org.telegram.ui.l41 l41Var) {
        b41 b41Var = new b41(i7 + 18);
        b41Var.f33194z = i10;
        b41Var.G = l41Var;
        return b41Var;
    }

    public static b41 i(int i7, CharSequence charSequence) {
        b41 b41Var = new b41(4);
        b41Var.d = i7;
        b41Var.f33181l = charSequence;
        return b41Var;
    }

    public static b41 j(int i7, View view) {
        b41 b41Var = new b41(-1);
        b41Var.d = i7;
        b41Var.f33174c = view;
        b41Var.f33194z = -1;
        return b41Var;
    }

    public static b41 k(View view) {
        b41 b41Var = new b41(-1);
        b41Var.f33174c = view;
        b41Var.f33194z = -1;
        return b41Var;
    }

    public static b41 l(int i7, View view) {
        b41 b41Var = new b41(-4);
        b41Var.d = i7;
        b41Var.f33174c = view;
        b41Var.f33194z = -1;
        return b41Var;
    }

    public static b41 m(View view) {
        b41 b41Var = new b41(-4);
        b41Var.f33174c = view;
        b41Var.f33194z = -1;
        return b41Var;
    }

    public static b41 n(View view, int i7) {
        b41 b41Var = new b41(-4);
        b41Var.f33174c = view;
        b41Var.f33194z = i7;
        return b41Var;
    }

    public static b41 o(int i7, String str, String str2) {
        b41 b41Var = new b41(40);
        b41Var.d = i7;
        b41Var.f33181l = str;
        b41Var.f33184o = str2;
        return b41Var;
    }

    public static b41 p(int i7) {
        b41 b41Var = new b41(34);
        b41Var.f33194z = i7;
        return b41Var;
    }

    public static b41 q(int i7, int i10) {
        b41 b41Var = new b41(34);
        b41Var.d = i7;
        b41Var.f33194z = i10;
        return b41Var;
    }

    public static b41 r(String str) {
        b41 b41Var = new b41(31);
        b41Var.f33181l = str;
        return b41Var;
    }

    public static b41 s(String str, String str2, View.OnClickListener onClickListener) {
        b41 b41Var = new b41(31);
        b41Var.f33181l = str;
        b41Var.f33182m = str2;
        b41Var.D = onClickListener;
        return b41Var;
    }

    public static b41 t(int i7, String str) {
        b41 b41Var = new b41(0);
        b41Var.d = i7;
        b41Var.f33181l = str;
        return b41Var;
    }

    public static b41 u(String str) {
        b41 b41Var = new b41(0);
        b41Var.f33181l = str;
        return b41Var;
    }

    public static b41 v(org.telegram.ui.ud udVar) {
        b41 b41Var = new b41(24);
        b41Var.G = udVar;
        return b41Var;
    }

    public static b41 w(TLObject tLObject) {
        b41 b41Var = new b41(32);
        b41Var.G = tLObject;
        return b41Var;
    }

    public static b41 x(int i7, String str) {
        b41 b41Var = new b41(10);
        b41Var.d = i7;
        b41Var.f33181l = str;
        return b41Var;
    }

    public static b41 y(int i7, String str, String str2) {
        b41 b41Var = new b41(44);
        b41Var.d = i7;
        b41Var.f33181l = str;
        b41Var.f33183n = str2;
        return b41Var;
    }

    public static b41 z(int i7, CharSequence charSequence) {
        b41 b41Var = new b41(35);
        b41Var.d = i7;
        b41Var.f33181l = charSequence;
        return b41Var;
    }

    public final boolean H(Class cls) {
        HashMap hashMap;
        a41 a41Var;
        if (this.f56015a >= 10000 && (hashMap = L) != null && (a41Var = (a41) hashMap.get(cls)) != null && a41Var.f32849a == this.f56015a) {
            return true;
        }
        return false;
    }

    public final boolean I(org.telegram.ui.Components.b41 r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.b41.I(org.telegram.ui.Components.b41):boolean");
    }

    public final boolean J(b41 b41Var) {
        if (this.d == b41Var.d && this.f33178i == b41Var.f33178i && this.f33192x == b41Var.f33192x && this.f33180k == b41Var.f33180k && this.f33179j == b41Var.f33179j && this.f33188s == b41Var.f33188s && this.f33187r == b41Var.f33187r && this.f33189t == b41Var.f33189t && this.f33186q == b41Var.f33186q && this.f33174c == b41Var.f33174c && TextUtils.equals(this.f33181l, b41Var.f33181l) && TextUtils.equals(this.f33182m, b41Var.f33182m) && TextUtils.equals(this.f33183n, b41Var.f33183n) && this.f33174c == b41Var.f33174c && this.f33194z == b41Var.f33194z && Math.abs(this.A - b41Var.A) < 0.01f && this.B == b41Var.B && Objects.equals(this.G, b41Var.G) && Objects.equals(this.H, b41Var.H)) {
            return true;
        }
        return false;
    }

    public final void L(boolean z10) {
        this.f33175e = z10;
        if (this.f56015a == 11) {
            this.f56015a = 12;
        }
    }

    @Override
    public final boolean a(rg.a aVar) {
        a41 G;
        if (this != aVar) {
            if (b41.class == aVar.getClass()) {
                b41 b41Var = (b41) aVar;
                int i7 = this.f56015a;
                if (i7 == b41Var.f56015a) {
                    if (i7 == 31) {
                        if (TextUtils.equals(this.f33181l, b41Var.f33181l) && TextUtils.equals(this.f33182m, b41Var.f33182m)) {
                            return true;
                        }
                        return false;
                    } else if (i7 == 28) {
                        if (this.f33194z == b41Var.f33194z) {
                            return true;
                        }
                        return false;
                    } else if (i7 != 35 && i7 != 37) {
                        if (i7 >= 10000 && (G = G(i7)) != null) {
                            return G.c(this, b41Var);
                        }
                        return I(b41Var);
                    } else if (this.d == b41Var.d && TextUtils.equals(this.f33181l, b41Var.f33181l) && this.f33175e == b41Var.f33175e) {
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
        a41 G;
        if (this != obj) {
            if (obj != null && b41.class == obj.getClass()) {
                b41 b41Var = (b41) obj;
                int i7 = this.f56015a;
                if (i7 == b41Var.f56015a) {
                    if (i7 != 36 && i7 != 35) {
                        if (i7 == 28) {
                            if (this.d == b41Var.d) {
                                return true;
                            }
                            return false;
                        } else if (i7 == 31) {
                            return TextUtils.equals(this.f33181l, b41Var.f33181l);
                        } else {
                            if (i7 >= 10000 && (G = G(i7)) != null) {
                                return G.e(this, b41Var);
                            }
                            return J(b41Var);
                        }
                    } else if (this.d == b41Var.d) {
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
