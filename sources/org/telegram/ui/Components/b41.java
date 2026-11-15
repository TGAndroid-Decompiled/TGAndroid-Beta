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
    public View f33177c;
    public int d;
    public boolean f33178e;
    public boolean f33179f;
    public boolean f33180g;
    public boolean h;
    public int f33181i;
    public boolean f33182j;
    public int f33183k;
    public CharSequence f33184l;
    public CharSequence f33185m;
    public CharSequence f33186n;
    public CharSequence f33187o;
    public String[] f33188p;
    public boolean f33189q;
    public boolean f33190r;
    public boolean f33191s;
    public boolean f33192t;
    public int f33193u;
    public int v;
    public boolean f33194w;
    public long f33195x;
    public int f33196y;
    public int f33197z;

    public b41(int i7) {
        super(i7, false);
        this.f33180g = true;
        this.f33193u = -1;
        this.I = true;
    }

    public static b41 A(String str, CharSequence charSequence, int i7) {
        b41 b41Var = new b41(41);
        b41Var.d = i7;
        b41Var.f33184l = charSequence;
        b41Var.f33187o = str;
        return b41Var;
    }

    public static b41 B(int i7, CharSequence charSequence) {
        b41 b41Var = new b41(7);
        b41Var.d = i7;
        b41Var.f33184l = charSequence;
        return b41Var;
    }

    public static b41 C(CharSequence charSequence) {
        b41 b41Var = new b41(7);
        b41Var.f33184l = charSequence;
        return b41Var;
    }

    public static b41 D(int i7) {
        b41 b41Var = new b41(28);
        b41Var.f33197z = i7;
        return b41Var;
    }

    public static b41 E(int i7, int i10) {
        b41 b41Var = new b41(28);
        b41Var.d = i7;
        b41Var.f33197z = i10;
        return b41Var;
    }

    public static b41 F(int i7, String str) {
        b41 b41Var = new b41(39);
        b41Var.d = i7;
        b41Var.f33184l = str;
        b41Var.f33197z = 1;
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
        b41Var.f33184l = str;
        return b41Var;
    }

    public static b41 c(int i7, int i10, String str) {
        b41 b41Var = new b41(3);
        b41Var.d = i7;
        b41Var.f33183k = i10;
        b41Var.f33184l = str;
        return b41Var;
    }

    public static b41 d(int i7, int i10, String str, String str2) {
        b41 b41Var = new b41(3);
        b41Var.d = i7;
        b41Var.f33183k = i10;
        b41Var.f33184l = str;
        b41Var.f33186n = str2;
        return b41Var;
    }

    public static b41 e(int i7, String str) {
        b41 b41Var = new b41(3);
        b41Var.d = i7;
        b41Var.f33184l = str;
        return b41Var;
    }

    public static b41 f(String str, CharSequence charSequence, int i7) {
        b41 b41Var = new b41(3);
        b41Var.d = i7;
        b41Var.f33184l = str;
        b41Var.f33186n = charSequence;
        return b41Var;
    }

    public static b41 g(CharSequence charSequence) {
        b41 b41Var = new b41(7);
        b41Var.f33184l = charSequence;
        b41Var.f33189q = true;
        return b41Var;
    }

    public static b41 h(int i7, int i10, org.telegram.ui.l41 l41Var) {
        b41 b41Var = new b41(i7 + 18);
        b41Var.f33197z = i10;
        b41Var.G = l41Var;
        return b41Var;
    }

    public static b41 i(int i7, CharSequence charSequence) {
        b41 b41Var = new b41(4);
        b41Var.d = i7;
        b41Var.f33184l = charSequence;
        return b41Var;
    }

    public static b41 j(int i7, View view) {
        b41 b41Var = new b41(-1);
        b41Var.d = i7;
        b41Var.f33177c = view;
        b41Var.f33197z = -1;
        return b41Var;
    }

    public static b41 k(View view) {
        b41 b41Var = new b41(-1);
        b41Var.f33177c = view;
        b41Var.f33197z = -1;
        return b41Var;
    }

    public static b41 l(int i7, View view) {
        b41 b41Var = new b41(-4);
        b41Var.d = i7;
        b41Var.f33177c = view;
        b41Var.f33197z = -1;
        return b41Var;
    }

    public static b41 m(View view) {
        b41 b41Var = new b41(-4);
        b41Var.f33177c = view;
        b41Var.f33197z = -1;
        return b41Var;
    }

    public static b41 n(View view, int i7) {
        b41 b41Var = new b41(-4);
        b41Var.f33177c = view;
        b41Var.f33197z = i7;
        return b41Var;
    }

    public static b41 o(int i7, String str, String str2) {
        b41 b41Var = new b41(40);
        b41Var.d = i7;
        b41Var.f33184l = str;
        b41Var.f33187o = str2;
        return b41Var;
    }

    public static b41 p(int i7) {
        b41 b41Var = new b41(34);
        b41Var.f33197z = i7;
        return b41Var;
    }

    public static b41 q(int i7, int i10) {
        b41 b41Var = new b41(34);
        b41Var.d = i7;
        b41Var.f33197z = i10;
        return b41Var;
    }

    public static b41 r(String str) {
        b41 b41Var = new b41(31);
        b41Var.f33184l = str;
        return b41Var;
    }

    public static b41 s(String str, String str2, View.OnClickListener onClickListener) {
        b41 b41Var = new b41(31);
        b41Var.f33184l = str;
        b41Var.f33185m = str2;
        b41Var.D = onClickListener;
        return b41Var;
    }

    public static b41 t(int i7, String str) {
        b41 b41Var = new b41(0);
        b41Var.d = i7;
        b41Var.f33184l = str;
        return b41Var;
    }

    public static b41 u(String str) {
        b41 b41Var = new b41(0);
        b41Var.f33184l = str;
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
        b41Var.f33184l = str;
        return b41Var;
    }

    public static b41 y(int i7, String str, String str2) {
        b41 b41Var = new b41(44);
        b41Var.d = i7;
        b41Var.f33184l = str;
        b41Var.f33186n = str2;
        return b41Var;
    }

    public static b41 z(int i7, CharSequence charSequence) {
        b41 b41Var = new b41(35);
        b41Var.d = i7;
        b41Var.f33184l = charSequence;
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
        if (this.d == b41Var.d && this.f33181i == b41Var.f33181i && this.f33195x == b41Var.f33195x && this.f33183k == b41Var.f33183k && this.f33182j == b41Var.f33182j && this.f33191s == b41Var.f33191s && this.f33190r == b41Var.f33190r && this.f33192t == b41Var.f33192t && this.f33189q == b41Var.f33189q && this.f33177c == b41Var.f33177c && TextUtils.equals(this.f33184l, b41Var.f33184l) && TextUtils.equals(this.f33185m, b41Var.f33185m) && TextUtils.equals(this.f33186n, b41Var.f33186n) && this.f33177c == b41Var.f33177c && this.f33197z == b41Var.f33197z && Math.abs(this.A - b41Var.A) < 0.01f && this.B == b41Var.B && Objects.equals(this.G, b41Var.G) && Objects.equals(this.H, b41Var.H)) {
            return true;
        }
        return false;
    }

    public final void L(boolean z10) {
        this.f33178e = z10;
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
                        if (TextUtils.equals(this.f33184l, b41Var.f33184l) && TextUtils.equals(this.f33185m, b41Var.f33185m)) {
                            return true;
                        }
                        return false;
                    } else if (i7 == 28) {
                        if (this.f33197z == b41Var.f33197z) {
                            return true;
                        }
                        return false;
                    } else if (i7 != 35 && i7 != 37) {
                        if (i7 >= 10000 && (G = G(i7)) != null) {
                            return G.c(this, b41Var);
                        }
                        return I(b41Var);
                    } else if (this.d == b41Var.d && TextUtils.equals(this.f33184l, b41Var.f33184l) && this.f33178e == b41Var.f33178e) {
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
                            return TextUtils.equals(this.f33184l, b41Var.f33184l);
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
