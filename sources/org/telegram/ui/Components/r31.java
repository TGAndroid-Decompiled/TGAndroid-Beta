package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import j$.util.Objects;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;
public final class r31 extends sg.a {
    public static int J = 10000;
    public static LongSparseArray K;
    public static HashMap L;
    public float A;
    public long B;
    public org.telegram.messenger.u10 C;
    public View.OnClickListener D;
    public View.OnClickListener E;
    public org.telegram.messenger.u10 F;
    public Object G;
    public Object H;
    public boolean I;
    public View f37620c;
    public int d;
    public boolean f37621e;
    public boolean f37622f;
    public boolean f37623g;
    public boolean h;
    public int f37624i;
    public boolean f37625j;
    public int f37626k;
    public CharSequence f37627l;
    public CharSequence f37628m;
    public CharSequence f37629n;
    public CharSequence f37630o;
    public String[] f37631p;
    public boolean f37632q;
    public boolean f37633r;
    public boolean f37634s;
    public boolean f37635t;
    public int f37636u;
    public int v;
    public boolean f37637w;
    public long f37638x;
    public int f37639y;
    public int f37640z;

    public r31(int i3) {
        super(i3, false);
        this.f37623g = true;
        this.f37636u = -1;
        this.I = true;
    }

    public static r31 A(String str, CharSequence charSequence, int i3) {
        r31 r31Var = new r31(41);
        r31Var.d = i3;
        r31Var.f37627l = charSequence;
        r31Var.f37630o = str;
        return r31Var;
    }

    public static r31 B(int i3, CharSequence charSequence) {
        r31 r31Var = new r31(7);
        r31Var.d = i3;
        r31Var.f37627l = charSequence;
        return r31Var;
    }

    public static r31 C(CharSequence charSequence) {
        r31 r31Var = new r31(7);
        r31Var.f37627l = charSequence;
        return r31Var;
    }

    public static r31 D(int i3) {
        r31 r31Var = new r31(28);
        r31Var.f37640z = i3;
        return r31Var;
    }

    public static r31 E(int i3, int i10) {
        r31 r31Var = new r31(28);
        r31Var.d = i3;
        r31Var.f37640z = i10;
        return r31Var;
    }

    public static r31 F(int i3, String str) {
        r31 r31Var = new r31(39);
        r31Var.d = i3;
        r31Var.f37627l = str;
        r31Var.f37640z = 1;
        return r31Var;
    }

    public static q31 G(int i3) {
        LongSparseArray longSparseArray = K;
        if (longSparseArray == null) {
            return null;
        }
        return (q31) longSparseArray.get(i3);
    }

    public static r31 K(Class cls) {
        if (L == null) {
            L = new HashMap();
        }
        if (K == null) {
            K = new LongSparseArray();
        }
        q31 q31Var = (q31) L.get(cls);
        if (q31Var != null) {
            return new r31(q31Var.f37334a);
        }
        throw new RuntimeException("UItemFactory was not setuped: " + cls);
    }

    public static r31 b(String str) {
        r31 r31Var = new r31(1);
        r31Var.f37627l = str;
        return r31Var;
    }

    public static r31 c(int i3, int i10, String str) {
        r31 r31Var = new r31(3);
        r31Var.d = i3;
        r31Var.f37626k = i10;
        r31Var.f37627l = str;
        return r31Var;
    }

    public static r31 d(int i3, int i10, String str, String str2) {
        r31 r31Var = new r31(3);
        r31Var.d = i3;
        r31Var.f37626k = i10;
        r31Var.f37627l = str;
        r31Var.f37629n = str2;
        return r31Var;
    }

    public static r31 e(int i3, String str) {
        r31 r31Var = new r31(3);
        r31Var.d = i3;
        r31Var.f37627l = str;
        return r31Var;
    }

    public static r31 f(String str, CharSequence charSequence, int i3) {
        r31 r31Var = new r31(3);
        r31Var.d = i3;
        r31Var.f37627l = str;
        r31Var.f37629n = charSequence;
        return r31Var;
    }

    public static r31 g(CharSequence charSequence) {
        r31 r31Var = new r31(7);
        r31Var.f37627l = charSequence;
        r31Var.f37632q = true;
        return r31Var;
    }

    public static r31 h(int i3, int i10, org.telegram.ui.d41 d41Var) {
        r31 r31Var = new r31(i3 + 18);
        r31Var.f37640z = i10;
        r31Var.G = d41Var;
        return r31Var;
    }

    public static r31 i(int i3, CharSequence charSequence) {
        r31 r31Var = new r31(4);
        r31Var.d = i3;
        r31Var.f37627l = charSequence;
        return r31Var;
    }

    public static r31 j(int i3, View view) {
        r31 r31Var = new r31(-1);
        r31Var.d = i3;
        r31Var.f37620c = view;
        r31Var.f37640z = -1;
        return r31Var;
    }

    public static r31 k(View view) {
        r31 r31Var = new r31(-1);
        r31Var.f37620c = view;
        r31Var.f37640z = -1;
        return r31Var;
    }

    public static r31 l(int i3, View view) {
        r31 r31Var = new r31(-4);
        r31Var.d = i3;
        r31Var.f37620c = view;
        r31Var.f37640z = -1;
        return r31Var;
    }

    public static r31 m(View view) {
        r31 r31Var = new r31(-4);
        r31Var.f37620c = view;
        r31Var.f37640z = -1;
        return r31Var;
    }

    public static r31 n(View view, int i3) {
        r31 r31Var = new r31(-4);
        r31Var.f37620c = view;
        r31Var.f37640z = i3;
        return r31Var;
    }

    public static r31 o(int i3, String str, String str2) {
        r31 r31Var = new r31(40);
        r31Var.d = i3;
        r31Var.f37627l = str;
        r31Var.f37630o = str2;
        return r31Var;
    }

    public static r31 p(int i3) {
        r31 r31Var = new r31(34);
        r31Var.f37640z = i3;
        return r31Var;
    }

    public static r31 q(int i3, int i10) {
        r31 r31Var = new r31(34);
        r31Var.d = i3;
        r31Var.f37640z = i10;
        return r31Var;
    }

    public static r31 r(String str) {
        r31 r31Var = new r31(31);
        r31Var.f37627l = str;
        return r31Var;
    }

    public static r31 s(String str, String str2, View.OnClickListener onClickListener) {
        r31 r31Var = new r31(31);
        r31Var.f37627l = str;
        r31Var.f37628m = str2;
        r31Var.D = onClickListener;
        return r31Var;
    }

    public static r31 t(int i3, String str) {
        r31 r31Var = new r31(0);
        r31Var.d = i3;
        r31Var.f37627l = str;
        return r31Var;
    }

    public static r31 u(String str) {
        r31 r31Var = new r31(0);
        r31Var.f37627l = str;
        return r31Var;
    }

    public static r31 v(org.telegram.ui.ud udVar) {
        r31 r31Var = new r31(24);
        r31Var.G = udVar;
        return r31Var;
    }

    public static r31 w(TLObject tLObject) {
        r31 r31Var = new r31(32);
        r31Var.G = tLObject;
        return r31Var;
    }

    public static r31 x(int i3, String str) {
        r31 r31Var = new r31(10);
        r31Var.d = i3;
        r31Var.f37627l = str;
        return r31Var;
    }

    public static r31 y(int i3, String str, String str2) {
        r31 r31Var = new r31(44);
        r31Var.d = i3;
        r31Var.f37627l = str;
        r31Var.f37629n = str2;
        return r31Var;
    }

    public static r31 z(int i3, CharSequence charSequence) {
        r31 r31Var = new r31(35);
        r31Var.d = i3;
        r31Var.f37627l = charSequence;
        return r31Var;
    }

    public final boolean H(Class cls) {
        HashMap hashMap;
        q31 q31Var;
        if (this.f54715a >= 10000 && (hashMap = L) != null && (q31Var = (q31) hashMap.get(cls)) != null && q31Var.f37334a == this.f54715a) {
            return true;
        }
        return false;
    }

    public final boolean I(org.telegram.ui.Components.r31 r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.r31.I(org.telegram.ui.Components.r31):boolean");
    }

    public final boolean J(r31 r31Var) {
        if (this.d == r31Var.d && this.f37624i == r31Var.f37624i && this.f37638x == r31Var.f37638x && this.f37626k == r31Var.f37626k && this.f37625j == r31Var.f37625j && this.f37634s == r31Var.f37634s && this.f37633r == r31Var.f37633r && this.f37635t == r31Var.f37635t && this.f37632q == r31Var.f37632q && this.f37620c == r31Var.f37620c && TextUtils.equals(this.f37627l, r31Var.f37627l) && TextUtils.equals(this.f37628m, r31Var.f37628m) && TextUtils.equals(this.f37629n, r31Var.f37629n) && this.f37620c == r31Var.f37620c && this.f37640z == r31Var.f37640z && Math.abs(this.A - r31Var.A) < 0.01f && this.B == r31Var.B && Objects.equals(this.G, r31Var.G) && Objects.equals(this.H, r31Var.H)) {
            return true;
        }
        return false;
    }

    public final void L(boolean z10) {
        this.f37621e = z10;
        if (this.f54715a == 11) {
            this.f54715a = 12;
        }
    }

    @Override
    public final boolean a(sg.a aVar) {
        q31 G;
        if (this != aVar) {
            if (r31.class == aVar.getClass()) {
                r31 r31Var = (r31) aVar;
                int i3 = this.f54715a;
                if (i3 == r31Var.f54715a) {
                    if (i3 == 31) {
                        if (TextUtils.equals(this.f37627l, r31Var.f37627l) && TextUtils.equals(this.f37628m, r31Var.f37628m)) {
                            return true;
                        }
                        return false;
                    } else if (i3 == 28) {
                        if (this.f37640z == r31Var.f37640z) {
                            return true;
                        }
                        return false;
                    } else if (i3 != 35 && i3 != 37) {
                        if (i3 >= 10000 && (G = G(i3)) != null) {
                            return G.c(this, r31Var);
                        }
                        return I(r31Var);
                    } else if (this.d == r31Var.d && TextUtils.equals(this.f37627l, r31Var.f37627l) && this.f37621e == r31Var.f37621e) {
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
        q31 G;
        if (this != obj) {
            if (obj != null && r31.class == obj.getClass()) {
                r31 r31Var = (r31) obj;
                int i3 = this.f54715a;
                if (i3 == r31Var.f54715a) {
                    if (i3 != 36 && i3 != 35) {
                        if (i3 == 28) {
                            if (this.d == r31Var.d) {
                                return true;
                            }
                            return false;
                        } else if (i3 == 31) {
                            return TextUtils.equals(this.f37627l, r31Var.f37627l);
                        } else {
                            if (i3 >= 10000 && (G = G(i3)) != null) {
                                return G.e(this, r31Var);
                            }
                            return J(r31Var);
                        }
                    } else if (this.d == r31Var.d) {
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
