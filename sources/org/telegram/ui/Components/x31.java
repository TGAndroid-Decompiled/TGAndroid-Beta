package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import j$.util.Objects;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;
public final class x31 extends rg.a {
    public static int J = 10000;
    public static LongSparseArray K;
    public static HashMap L;
    public float A;
    public long B;
    public org.telegram.messenger.c20 C;
    public View.OnClickListener D;
    public View.OnClickListener E;
    public org.telegram.messenger.c20 F;
    public Object G;
    public Object H;
    public boolean I;
    public View f40173c;
    public int d;
    public boolean f40174e;
    public boolean f40175f;
    public boolean f40176g;
    public boolean h;
    public int f40177i;
    public boolean f40178j;
    public int f40179k;
    public CharSequence f40180l;
    public CharSequence f40181m;
    public CharSequence f40182n;
    public CharSequence f40183o;
    public String[] f40184p;
    public boolean f40185q;
    public boolean f40186r;
    public boolean f40187s;
    public boolean f40188t;
    public int f40189u;
    public int v;
    public boolean f40190w;
    public long f40191x;
    public int f40192y;
    public int f40193z;

    public x31(int i7) {
        super(i7, false);
        this.f40176g = true;
        this.f40189u = -1;
        this.I = true;
    }

    public static x31 A(String str, CharSequence charSequence, int i7) {
        x31 x31Var = new x31(41);
        x31Var.d = i7;
        x31Var.f40180l = charSequence;
        x31Var.f40183o = str;
        return x31Var;
    }

    public static x31 B(int i7, CharSequence charSequence) {
        x31 x31Var = new x31(7);
        x31Var.d = i7;
        x31Var.f40180l = charSequence;
        return x31Var;
    }

    public static x31 C(CharSequence charSequence) {
        x31 x31Var = new x31(7);
        x31Var.f40180l = charSequence;
        return x31Var;
    }

    public static x31 D(int i7) {
        x31 x31Var = new x31(28);
        x31Var.f40193z = i7;
        return x31Var;
    }

    public static x31 E(int i7, int i10) {
        x31 x31Var = new x31(28);
        x31Var.d = i7;
        x31Var.f40193z = i10;
        return x31Var;
    }

    public static x31 F(int i7, String str) {
        x31 x31Var = new x31(39);
        x31Var.d = i7;
        x31Var.f40180l = str;
        x31Var.f40193z = 1;
        return x31Var;
    }

    public static w31 G(int i7) {
        LongSparseArray longSparseArray = K;
        if (longSparseArray == null) {
            return null;
        }
        return (w31) longSparseArray.get(i7);
    }

    public static x31 K(Class cls) {
        if (L == null) {
            L = new HashMap();
        }
        if (K == null) {
            K = new LongSparseArray();
        }
        w31 w31Var = (w31) L.get(cls);
        if (w31Var != null) {
            return new x31(w31Var.f39795a);
        }
        throw new RuntimeException("UItemFactory was not setuped: " + cls);
    }

    public static x31 b(String str) {
        x31 x31Var = new x31(1);
        x31Var.f40180l = str;
        return x31Var;
    }

    public static x31 c(int i7, int i10, String str) {
        x31 x31Var = new x31(3);
        x31Var.d = i7;
        x31Var.f40179k = i10;
        x31Var.f40180l = str;
        return x31Var;
    }

    public static x31 d(int i7, int i10, String str, String str2) {
        x31 x31Var = new x31(3);
        x31Var.d = i7;
        x31Var.f40179k = i10;
        x31Var.f40180l = str;
        x31Var.f40182n = str2;
        return x31Var;
    }

    public static x31 e(int i7, String str) {
        x31 x31Var = new x31(3);
        x31Var.d = i7;
        x31Var.f40180l = str;
        return x31Var;
    }

    public static x31 f(String str, CharSequence charSequence, int i7) {
        x31 x31Var = new x31(3);
        x31Var.d = i7;
        x31Var.f40180l = str;
        x31Var.f40182n = charSequence;
        return x31Var;
    }

    public static x31 g(CharSequence charSequence) {
        x31 x31Var = new x31(7);
        x31Var.f40180l = charSequence;
        x31Var.f40185q = true;
        return x31Var;
    }

    public static x31 h(int i7, int i10, org.telegram.ui.o41 o41Var) {
        x31 x31Var = new x31(i7 + 18);
        x31Var.f40193z = i10;
        x31Var.G = o41Var;
        return x31Var;
    }

    public static x31 i(int i7, CharSequence charSequence) {
        x31 x31Var = new x31(4);
        x31Var.d = i7;
        x31Var.f40180l = charSequence;
        return x31Var;
    }

    public static x31 j(int i7, View view) {
        x31 x31Var = new x31(-1);
        x31Var.d = i7;
        x31Var.f40173c = view;
        x31Var.f40193z = -1;
        return x31Var;
    }

    public static x31 k(View view) {
        x31 x31Var = new x31(-1);
        x31Var.f40173c = view;
        x31Var.f40193z = -1;
        return x31Var;
    }

    public static x31 l(int i7, View view) {
        x31 x31Var = new x31(-4);
        x31Var.d = i7;
        x31Var.f40173c = view;
        x31Var.f40193z = -1;
        return x31Var;
    }

    public static x31 m(View view) {
        x31 x31Var = new x31(-4);
        x31Var.f40173c = view;
        x31Var.f40193z = -1;
        return x31Var;
    }

    public static x31 n(View view, int i7) {
        x31 x31Var = new x31(-4);
        x31Var.f40173c = view;
        x31Var.f40193z = i7;
        return x31Var;
    }

    public static x31 o(int i7, String str, String str2) {
        x31 x31Var = new x31(40);
        x31Var.d = i7;
        x31Var.f40180l = str;
        x31Var.f40183o = str2;
        return x31Var;
    }

    public static x31 p(int i7) {
        x31 x31Var = new x31(34);
        x31Var.f40193z = i7;
        return x31Var;
    }

    public static x31 q(int i7, int i10) {
        x31 x31Var = new x31(34);
        x31Var.d = i7;
        x31Var.f40193z = i10;
        return x31Var;
    }

    public static x31 r(String str) {
        x31 x31Var = new x31(31);
        x31Var.f40180l = str;
        return x31Var;
    }

    public static x31 s(String str, String str2, View.OnClickListener onClickListener) {
        x31 x31Var = new x31(31);
        x31Var.f40180l = str;
        x31Var.f40181m = str2;
        x31Var.D = onClickListener;
        return x31Var;
    }

    public static x31 t(int i7, String str) {
        x31 x31Var = new x31(0);
        x31Var.d = i7;
        x31Var.f40180l = str;
        return x31Var;
    }

    public static x31 u(String str) {
        x31 x31Var = new x31(0);
        x31Var.f40180l = str;
        return x31Var;
    }

    public static x31 v(org.telegram.ui.wd wdVar) {
        x31 x31Var = new x31(24);
        x31Var.G = wdVar;
        return x31Var;
    }

    public static x31 w(TLObject tLObject) {
        x31 x31Var = new x31(32);
        x31Var.G = tLObject;
        return x31Var;
    }

    public static x31 x(int i7, String str) {
        x31 x31Var = new x31(10);
        x31Var.d = i7;
        x31Var.f40180l = str;
        return x31Var;
    }

    public static x31 y(int i7, String str, String str2) {
        x31 x31Var = new x31(44);
        x31Var.d = i7;
        x31Var.f40180l = str;
        x31Var.f40182n = str2;
        return x31Var;
    }

    public static x31 z(int i7, CharSequence charSequence) {
        x31 x31Var = new x31(35);
        x31Var.d = i7;
        x31Var.f40180l = charSequence;
        return x31Var;
    }

    public final boolean H(Class cls) {
        HashMap hashMap;
        w31 w31Var;
        if (this.f54532a >= 10000 && (hashMap = L) != null && (w31Var = (w31) hashMap.get(cls)) != null && w31Var.f39795a == this.f54532a) {
            return true;
        }
        return false;
    }

    public final boolean I(org.telegram.ui.Components.x31 r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.x31.I(org.telegram.ui.Components.x31):boolean");
    }

    public final boolean J(x31 x31Var) {
        if (this.d == x31Var.d && this.f40177i == x31Var.f40177i && this.f40191x == x31Var.f40191x && this.f40179k == x31Var.f40179k && this.f40178j == x31Var.f40178j && this.f40187s == x31Var.f40187s && this.f40186r == x31Var.f40186r && this.f40188t == x31Var.f40188t && this.f40185q == x31Var.f40185q && this.f40173c == x31Var.f40173c && TextUtils.equals(this.f40180l, x31Var.f40180l) && TextUtils.equals(this.f40181m, x31Var.f40181m) && TextUtils.equals(this.f40182n, x31Var.f40182n) && this.f40173c == x31Var.f40173c && this.f40193z == x31Var.f40193z && Math.abs(this.A - x31Var.A) < 0.01f && this.B == x31Var.B && Objects.equals(this.G, x31Var.G) && Objects.equals(this.H, x31Var.H)) {
            return true;
        }
        return false;
    }

    public final void L(boolean z9) {
        this.f40174e = z9;
        if (this.f54532a == 11) {
            this.f54532a = 12;
        }
    }

    @Override
    public final boolean a(rg.a aVar) {
        w31 G;
        if (this != aVar) {
            if (x31.class == aVar.getClass()) {
                x31 x31Var = (x31) aVar;
                int i7 = this.f54532a;
                if (i7 == x31Var.f54532a) {
                    if (i7 == 31) {
                        if (TextUtils.equals(this.f40180l, x31Var.f40180l) && TextUtils.equals(this.f40181m, x31Var.f40181m)) {
                            return true;
                        }
                        return false;
                    } else if (i7 == 28) {
                        if (this.f40193z == x31Var.f40193z) {
                            return true;
                        }
                        return false;
                    } else if (i7 != 35 && i7 != 37) {
                        if (i7 >= 10000 && (G = G(i7)) != null) {
                            return G.c(this, x31Var);
                        }
                        return I(x31Var);
                    } else if (this.d == x31Var.d && TextUtils.equals(this.f40180l, x31Var.f40180l) && this.f40174e == x31Var.f40174e) {
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
        w31 G;
        if (this != obj) {
            if (obj != null && x31.class == obj.getClass()) {
                x31 x31Var = (x31) obj;
                int i7 = this.f54532a;
                if (i7 == x31Var.f54532a) {
                    if (i7 != 36 && i7 != 35) {
                        if (i7 == 28) {
                            if (this.d == x31Var.d) {
                                return true;
                            }
                            return false;
                        } else if (i7 == 31) {
                            return TextUtils.equals(this.f40180l, x31Var.f40180l);
                        } else {
                            if (i7 >= 10000 && (G = G(i7)) != null) {
                                return G.e(this, x31Var);
                            }
                            return J(x31Var);
                        }
                    } else if (this.d == x31Var.d) {
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
