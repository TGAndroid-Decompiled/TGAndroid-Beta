package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import j$.util.Objects;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;
public final class b51 extends hg.b {
    public static int J = 10000;
    public static LongSparseArray K;
    public static HashMap L;
    public float A;
    public long B;
    public org.telegram.messenger.r20 C;
    public View.OnClickListener D;
    public View.OnClickListener E;
    public org.telegram.messenger.r20 F;
    public Object G;
    public Object H;
    public boolean I;
    public View f24637c;
    public int d;
    public boolean e;
    public boolean f24638f;
    public boolean f24639g;
    public boolean h;
    public int f24640i;
    public boolean f24641j;
    public int f24642k;
    public CharSequence f24643l;
    public CharSequence f24644m;
    public CharSequence f24645n;
    public CharSequence f24646o;
    public String[] f24647p;
    public boolean f24648q;
    public boolean f24649r;
    public boolean f24650s;
    public boolean f24651t;
    public int f24652u;
    public int v;
    public boolean f24653w;
    public long f24654x;
    public int f24655y;
    public int f24656z;

    public b51(int i10) {
        super(i10, false);
        this.f24639g = true;
        this.f24652u = -1;
        this.I = true;
    }

    public static b51 A(String str, CharSequence charSequence, int i10) {
        b51 b51Var = new b51(41);
        b51Var.d = i10;
        b51Var.f24643l = charSequence;
        b51Var.f24646o = str;
        return b51Var;
    }

    public static b51 B(int i10, CharSequence charSequence) {
        b51 b51Var = new b51(7);
        b51Var.d = i10;
        b51Var.f24643l = charSequence;
        return b51Var;
    }

    public static b51 C(CharSequence charSequence) {
        b51 b51Var = new b51(7);
        b51Var.f24643l = charSequence;
        return b51Var;
    }

    public static b51 D(int i10) {
        b51 b51Var = new b51(28);
        b51Var.f24656z = i10;
        return b51Var;
    }

    public static b51 E(int i10, int i11) {
        b51 b51Var = new b51(28);
        b51Var.d = i10;
        b51Var.f24656z = i11;
        return b51Var;
    }

    public static b51 F(int i10, String str) {
        b51 b51Var = new b51(39);
        b51Var.d = i10;
        b51Var.f24643l = str;
        b51Var.f24656z = 1;
        return b51Var;
    }

    public static a51 G(int i10) {
        LongSparseArray longSparseArray = K;
        if (longSparseArray == null) {
            return null;
        }
        return (a51) longSparseArray.get(i10);
    }

    public static b51 K(Class cls) {
        if (L == null) {
            L = new HashMap();
        }
        if (K == null) {
            K = new LongSparseArray();
        }
        a51 a51Var = (a51) L.get(cls);
        if (a51Var != null) {
            return new b51(a51Var.f24290a);
        }
        throw new RuntimeException("UItemFactory was not setuped: " + cls);
    }

    public static b51 b(String str) {
        b51 b51Var = new b51(1);
        b51Var.f24643l = str;
        return b51Var;
    }

    public static b51 c(int i10, int i11, String str) {
        b51 b51Var = new b51(3);
        b51Var.d = i10;
        b51Var.f24642k = i11;
        b51Var.f24643l = str;
        return b51Var;
    }

    public static b51 d(int i10, int i11, String str, String str2) {
        b51 b51Var = new b51(3);
        b51Var.d = i10;
        b51Var.f24642k = i11;
        b51Var.f24643l = str;
        b51Var.f24645n = str2;
        return b51Var;
    }

    public static b51 e(int i10, String str) {
        b51 b51Var = new b51(3);
        b51Var.d = i10;
        b51Var.f24643l = str;
        return b51Var;
    }

    public static b51 f(String str, CharSequence charSequence, int i10) {
        b51 b51Var = new b51(3);
        b51Var.d = i10;
        b51Var.f24643l = str;
        b51Var.f24645n = charSequence;
        return b51Var;
    }

    public static b51 g(CharSequence charSequence) {
        b51 b51Var = new b51(7);
        b51Var.f24643l = charSequence;
        b51Var.f24648q = true;
        return b51Var;
    }

    public static b51 h(int i10, int i11, org.telegram.ui.e61 e61Var) {
        b51 b51Var = new b51(i10 + 18);
        b51Var.f24656z = i11;
        b51Var.G = e61Var;
        return b51Var;
    }

    public static b51 i(int i10, CharSequence charSequence) {
        b51 b51Var = new b51(4);
        b51Var.d = i10;
        b51Var.f24643l = charSequence;
        return b51Var;
    }

    public static b51 j(int i10, View view) {
        b51 b51Var = new b51(-1);
        b51Var.d = i10;
        b51Var.f24637c = view;
        b51Var.f24656z = -1;
        return b51Var;
    }

    public static b51 k(View view) {
        b51 b51Var = new b51(-1);
        b51Var.f24637c = view;
        b51Var.f24656z = -1;
        return b51Var;
    }

    public static b51 l(int i10, View view) {
        b51 b51Var = new b51(-4);
        b51Var.d = i10;
        b51Var.f24637c = view;
        b51Var.f24656z = -1;
        return b51Var;
    }

    public static b51 m(View view) {
        b51 b51Var = new b51(-4);
        b51Var.f24637c = view;
        b51Var.f24656z = -1;
        return b51Var;
    }

    public static b51 n(View view, int i10) {
        b51 b51Var = new b51(-4);
        b51Var.f24637c = view;
        b51Var.f24656z = i10;
        return b51Var;
    }

    public static b51 o(int i10, String str, String str2) {
        b51 b51Var = new b51(40);
        b51Var.d = i10;
        b51Var.f24643l = str;
        b51Var.f24646o = str2;
        return b51Var;
    }

    public static b51 p(int i10) {
        b51 b51Var = new b51(34);
        b51Var.f24656z = i10;
        return b51Var;
    }

    public static b51 q(int i10, int i11) {
        b51 b51Var = new b51(34);
        b51Var.d = i10;
        b51Var.f24656z = i11;
        return b51Var;
    }

    public static b51 r(String str) {
        b51 b51Var = new b51(31);
        b51Var.f24643l = str;
        return b51Var;
    }

    public static b51 s(String str, String str2, View.OnClickListener onClickListener) {
        b51 b51Var = new b51(31);
        b51Var.f24643l = str;
        b51Var.f24644m = str2;
        b51Var.D = onClickListener;
        return b51Var;
    }

    public static b51 t(int i10, String str) {
        b51 b51Var = new b51(0);
        b51Var.d = i10;
        b51Var.f24643l = str;
        return b51Var;
    }

    public static b51 u(String str) {
        b51 b51Var = new b51(0);
        b51Var.f24643l = str;
        return b51Var;
    }

    public static b51 v(org.telegram.ui.ie ieVar) {
        b51 b51Var = new b51(24);
        b51Var.G = ieVar;
        return b51Var;
    }

    public static b51 w(TLObject tLObject) {
        b51 b51Var = new b51(32);
        b51Var.G = tLObject;
        return b51Var;
    }

    public static b51 x(int i10, String str) {
        b51 b51Var = new b51(10);
        b51Var.d = i10;
        b51Var.f24643l = str;
        return b51Var;
    }

    public static b51 y(int i10, String str, String str2) {
        b51 b51Var = new b51(44);
        b51Var.d = i10;
        b51Var.f24643l = str;
        b51Var.f24645n = str2;
        return b51Var;
    }

    public static b51 z(int i10, CharSequence charSequence) {
        b51 b51Var = new b51(35);
        b51Var.d = i10;
        b51Var.f24643l = charSequence;
        return b51Var;
    }

    public final boolean H(Class cls) {
        HashMap hashMap;
        a51 a51Var;
        if (this.f7681a >= 10000 && (hashMap = L) != null && (a51Var = (a51) hashMap.get(cls)) != null && a51Var.f24290a == this.f7681a) {
            return true;
        }
        return false;
    }

    public final boolean I(org.telegram.ui.Components.b51 r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.b51.I(org.telegram.ui.Components.b51):boolean");
    }

    public final boolean J(b51 b51Var) {
        if (this.d == b51Var.d && this.f24640i == b51Var.f24640i && this.f24654x == b51Var.f24654x && this.f24642k == b51Var.f24642k && this.f24641j == b51Var.f24641j && this.f24650s == b51Var.f24650s && this.f24649r == b51Var.f24649r && this.f24651t == b51Var.f24651t && this.f24648q == b51Var.f24648q && this.f24637c == b51Var.f24637c && TextUtils.equals(this.f24643l, b51Var.f24643l) && TextUtils.equals(this.f24644m, b51Var.f24644m) && TextUtils.equals(this.f24645n, b51Var.f24645n) && this.f24637c == b51Var.f24637c && this.f24656z == b51Var.f24656z && Math.abs(this.A - b51Var.A) < 0.01f && this.B == b51Var.B && Objects.equals(this.G, b51Var.G) && Objects.equals(this.H, b51Var.H)) {
            return true;
        }
        return false;
    }

    public final void L(boolean z10) {
        this.e = z10;
        if (this.f7681a == 11) {
            this.f7681a = 12;
        }
    }

    @Override
    public final boolean a(hg.b bVar) {
        a51 G;
        if (this != bVar) {
            if (b51.class == bVar.getClass()) {
                b51 b51Var = (b51) bVar;
                int i10 = this.f7681a;
                if (i10 == b51Var.f7681a) {
                    if (i10 == 31) {
                        if (TextUtils.equals(this.f24643l, b51Var.f24643l) && TextUtils.equals(this.f24644m, b51Var.f24644m)) {
                            return true;
                        }
                        return false;
                    } else if (i10 == 28) {
                        if (this.f24656z == b51Var.f24656z) {
                            return true;
                        }
                        return false;
                    } else if (i10 != 35 && i10 != 37) {
                        if (i10 >= 10000 && (G = G(i10)) != null) {
                            return G.c(this, b51Var);
                        }
                        return I(b51Var);
                    } else if (this.d == b51Var.d && TextUtils.equals(this.f24643l, b51Var.f24643l) && this.e == b51Var.e) {
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
        a51 G;
        if (this != obj) {
            if (obj != null && b51.class == obj.getClass()) {
                b51 b51Var = (b51) obj;
                int i10 = this.f7681a;
                if (i10 == b51Var.f7681a) {
                    if (i10 != 36 && i10 != 35) {
                        if (i10 == 28) {
                            if (this.d == b51Var.d) {
                                return true;
                            }
                            return false;
                        } else if (i10 == 31) {
                            return TextUtils.equals(this.f24643l, b51Var.f24643l);
                        } else {
                            if (i10 >= 10000 && (G = G(i10)) != null) {
                                return G.e(this, b51Var);
                            }
                            return J(b51Var);
                        }
                    } else if (this.d == b51Var.d) {
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
