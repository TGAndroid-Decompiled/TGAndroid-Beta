package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import j$.util.Objects;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
public final class u61 extends qg.a {
    public static int J = 10000;
    public static LongSparseArray K;
    public static HashMap L;
    public float A;
    public long B;
    public Utilities.Callback C;
    public View.OnClickListener D;
    public View.OnClickListener E;
    public Utilities.Callback F;
    public Object G;
    public Object H;
    public boolean I;
    public View f33243c;
    public int d;
    public boolean e;
    public boolean f33244f;
    public boolean f33245g;
    public boolean h;
    public int f33246i;
    public boolean f33247j;
    public int f33248k;
    public CharSequence f33249l;
    public CharSequence f33250m;
    public CharSequence f33251n;
    public CharSequence f33252o;
    public String[] f33253p;
    public boolean f33254q;
    public boolean f33255r;
    public boolean f33256s;
    public boolean f33257t;
    public int f33258u;
    public int v;
    public boolean f33259w;
    public long f33260x;
    public int f33261y;
    public int f33262z;

    public u61(int i10) {
        super(i10, false);
        this.f33245g = true;
        this.f33258u = -1;
        this.I = true;
    }

    public static u61 A(String str, CharSequence charSequence, int i10) {
        u61 u61Var = new u61(41);
        u61Var.d = i10;
        u61Var.f33249l = charSequence;
        u61Var.f33252o = str;
        return u61Var;
    }

    public static u61 B(int i10, CharSequence charSequence) {
        u61 u61Var = new u61(7);
        u61Var.d = i10;
        u61Var.f33249l = charSequence;
        return u61Var;
    }

    public static u61 C(CharSequence charSequence) {
        u61 u61Var = new u61(7);
        u61Var.f33249l = charSequence;
        return u61Var;
    }

    public static u61 D(int i10) {
        u61 u61Var = new u61(28);
        u61Var.f33262z = i10;
        return u61Var;
    }

    public static u61 E(int i10, int i11) {
        u61 u61Var = new u61(28);
        u61Var.d = i10;
        u61Var.f33262z = i11;
        return u61Var;
    }

    public static u61 F(int i10, String str) {
        u61 u61Var = new u61(39);
        u61Var.d = i10;
        u61Var.f33249l = str;
        u61Var.f33262z = 1;
        return u61Var;
    }

    public static t61 G(int i10) {
        LongSparseArray longSparseArray = K;
        if (longSparseArray == null) {
            return null;
        }
        return (t61) longSparseArray.get(i10);
    }

    public static u61 K(Class cls) {
        if (L == null) {
            L = new HashMap();
        }
        if (K == null) {
            K = new LongSparseArray();
        }
        t61 t61Var = (t61) L.get(cls);
        if (t61Var != null) {
            return new u61(t61Var.viewType);
        }
        throw new RuntimeException("UItemFactory was not setuped: " + cls);
    }

    public static u61 b(String str) {
        u61 u61Var = new u61(1);
        u61Var.f33249l = str;
        return u61Var;
    }

    public static u61 c(int i10, int i11, String str) {
        u61 u61Var = new u61(3);
        u61Var.d = i10;
        u61Var.f33248k = i11;
        u61Var.f33249l = str;
        return u61Var;
    }

    public static u61 d(int i10, int i11, String str, String str2) {
        u61 u61Var = new u61(3);
        u61Var.d = i10;
        u61Var.f33248k = i11;
        u61Var.f33249l = str;
        u61Var.f33251n = str2;
        return u61Var;
    }

    public static u61 e(int i10, String str) {
        u61 u61Var = new u61(3);
        u61Var.d = i10;
        u61Var.f33249l = str;
        return u61Var;
    }

    public static u61 f(String str, CharSequence charSequence, int i10) {
        u61 u61Var = new u61(3);
        u61Var.d = i10;
        u61Var.f33249l = str;
        u61Var.f33251n = charSequence;
        return u61Var;
    }

    public static u61 g(CharSequence charSequence) {
        u61 u61Var = new u61(7);
        u61Var.f33249l = charSequence;
        u61Var.f33254q = true;
        return u61Var;
    }

    public static u61 h(int i10, int i11, org.telegram.ui.k91 k91Var) {
        u61 u61Var = new u61(i10 + 18);
        u61Var.f33262z = i11;
        u61Var.G = k91Var;
        return u61Var;
    }

    public static u61 i(int i10, CharSequence charSequence) {
        u61 u61Var = new u61(4);
        u61Var.d = i10;
        u61Var.f33249l = charSequence;
        return u61Var;
    }

    public static u61 j(int i10, View view) {
        u61 u61Var = new u61(-1);
        u61Var.d = i10;
        u61Var.f33243c = view;
        u61Var.f33262z = -1;
        return u61Var;
    }

    public static u61 k(View view) {
        u61 u61Var = new u61(-1);
        u61Var.f33243c = view;
        u61Var.f33262z = -1;
        return u61Var;
    }

    public static u61 l(int i10, View view) {
        u61 u61Var = new u61(-4);
        u61Var.d = i10;
        u61Var.f33243c = view;
        u61Var.f33262z = -1;
        return u61Var;
    }

    public static u61 m(View view) {
        u61 u61Var = new u61(-4);
        u61Var.f33243c = view;
        u61Var.f33262z = -1;
        return u61Var;
    }

    public static u61 n(View view, int i10) {
        u61 u61Var = new u61(-4);
        u61Var.f33243c = view;
        u61Var.f33262z = i10;
        return u61Var;
    }

    public static u61 o(int i10, String str, String str2) {
        u61 u61Var = new u61(40);
        u61Var.d = i10;
        u61Var.f33249l = str;
        u61Var.f33252o = str2;
        return u61Var;
    }

    public static u61 p(int i10) {
        u61 u61Var = new u61(34);
        u61Var.f33262z = i10;
        return u61Var;
    }

    public static u61 q(int i10, int i11) {
        u61 u61Var = new u61(34);
        u61Var.d = i10;
        u61Var.f33262z = i11;
        return u61Var;
    }

    public static u61 r(String str) {
        u61 u61Var = new u61(31);
        u61Var.f33249l = str;
        return u61Var;
    }

    public static u61 s(String str, String str2, View.OnClickListener onClickListener) {
        u61 u61Var = new u61(31);
        u61Var.f33249l = str;
        u61Var.f33250m = str2;
        u61Var.D = onClickListener;
        return u61Var;
    }

    public static u61 t(int i10, String str) {
        u61 u61Var = new u61(0);
        u61Var.d = i10;
        u61Var.f33249l = str;
        return u61Var;
    }

    public static u61 u(String str) {
        u61 u61Var = new u61(0);
        u61Var.f33249l = str;
        return u61Var;
    }

    public static u61 v(org.telegram.ui.he heVar) {
        u61 u61Var = new u61(24);
        u61Var.G = heVar;
        return u61Var;
    }

    public static u61 w(TLObject tLObject) {
        u61 u61Var = new u61(32);
        u61Var.G = tLObject;
        return u61Var;
    }

    public static u61 x(int i10, String str) {
        u61 u61Var = new u61(10);
        u61Var.d = i10;
        u61Var.f33249l = str;
        return u61Var;
    }

    public static u61 y(int i10, String str, String str2) {
        u61 u61Var = new u61(44);
        u61Var.d = i10;
        u61Var.f33249l = str;
        u61Var.f33251n = str2;
        return u61Var;
    }

    public static u61 z(int i10, CharSequence charSequence) {
        u61 u61Var = new u61(35);
        u61Var.d = i10;
        u61Var.f33249l = charSequence;
        return u61Var;
    }

    public final boolean H(Class cls) {
        HashMap hashMap;
        t61 t61Var;
        if (this.f47075a >= 10000 && (hashMap = L) != null && (t61Var = (t61) hashMap.get(cls)) != null && t61Var.viewType == this.f47075a) {
            return true;
        }
        return false;
    }

    public final boolean I(org.telegram.ui.Components.u61 r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.u61.I(org.telegram.ui.Components.u61):boolean");
    }

    public final boolean J(u61 u61Var) {
        if (this.d == u61Var.d && this.f33246i == u61Var.f33246i && this.f33260x == u61Var.f33260x && this.f33248k == u61Var.f33248k && this.f33247j == u61Var.f33247j && this.f33256s == u61Var.f33256s && this.f33255r == u61Var.f33255r && this.f33257t == u61Var.f33257t && this.f33254q == u61Var.f33254q && this.f33243c == u61Var.f33243c && TextUtils.equals(this.f33249l, u61Var.f33249l) && TextUtils.equals(this.f33250m, u61Var.f33250m) && TextUtils.equals(this.f33251n, u61Var.f33251n) && this.f33243c == u61Var.f33243c && this.f33262z == u61Var.f33262z && Math.abs(this.A - u61Var.A) < 0.01f && this.B == u61Var.B && Objects.equals(this.G, u61Var.G) && Objects.equals(this.H, u61Var.H)) {
            return true;
        }
        return false;
    }

    public final void L(boolean z10) {
        this.e = z10;
        if (this.f47075a == 11) {
            this.f47075a = 12;
        }
    }

    @Override
    public final boolean a(qg.a aVar) {
        t61 G;
        if (this != aVar) {
            if (u61.class == aVar.getClass()) {
                u61 u61Var = (u61) aVar;
                int i10 = this.f47075a;
                if (i10 == u61Var.f47075a) {
                    if (i10 == 31) {
                        if (TextUtils.equals(this.f33249l, u61Var.f33249l) && TextUtils.equals(this.f33250m, u61Var.f33250m)) {
                            return true;
                        }
                        return false;
                    } else if (i10 == 28) {
                        if (this.f33262z == u61Var.f33262z) {
                            return true;
                        }
                        return false;
                    } else if (i10 != 35 && i10 != 37) {
                        if (i10 >= 10000 && (G = G(i10)) != null) {
                            return G.contentsEquals(this, u61Var);
                        }
                        return I(u61Var);
                    } else if (this.d == u61Var.d && TextUtils.equals(this.f33249l, u61Var.f33249l) && this.e == u61Var.e) {
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
        t61 G;
        if (this != obj) {
            if (obj != null && u61.class == obj.getClass()) {
                u61 u61Var = (u61) obj;
                int i10 = this.f47075a;
                if (i10 == u61Var.f47075a) {
                    if (i10 != 36 && i10 != 35) {
                        if (i10 == 28) {
                            if (this.d == u61Var.d) {
                                return true;
                            }
                            return false;
                        } else if (i10 == 31) {
                            return TextUtils.equals(this.f33249l, u61Var.f33249l);
                        } else {
                            if (i10 >= 10000 && (G = G(i10)) != null) {
                                return G.equals(this, u61Var);
                            }
                            return J(u61Var);
                        }
                    } else if (this.d == u61Var.d) {
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
