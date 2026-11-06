package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import j$.util.Objects;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;
public final class r31 extends rg.a {
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
    public View f37591c;
    public int d;
    public boolean f37592e;
    public boolean f37593f;
    public boolean f37594g;
    public boolean h;
    public int f37595i;
    public boolean f37596j;
    public int f37597k;
    public CharSequence f37598l;
    public CharSequence f37599m;
    public CharSequence f37600n;
    public CharSequence f37601o;
    public String[] f37602p;
    public boolean f37603q;
    public boolean f37604r;
    public boolean f37605s;
    public boolean f37606t;
    public int f37607u;
    public int v;
    public boolean f37608w;
    public long f37609x;
    public int f37610y;
    public int f37611z;

    public r31(int i7) {
        super(i7, false);
        this.f37594g = true;
        this.f37607u = -1;
        this.I = true;
    }

    public static r31 A(String str, CharSequence charSequence, int i7) {
        r31 r31Var = new r31(41);
        r31Var.d = i7;
        r31Var.f37598l = charSequence;
        r31Var.f37601o = str;
        return r31Var;
    }

    public static r31 B(int i7, CharSequence charSequence) {
        r31 r31Var = new r31(7);
        r31Var.d = i7;
        r31Var.f37598l = charSequence;
        return r31Var;
    }

    public static r31 C(CharSequence charSequence) {
        r31 r31Var = new r31(7);
        r31Var.f37598l = charSequence;
        return r31Var;
    }

    public static r31 D(int i7) {
        r31 r31Var = new r31(28);
        r31Var.f37611z = i7;
        return r31Var;
    }

    public static r31 E(int i7, int i10) {
        r31 r31Var = new r31(28);
        r31Var.d = i7;
        r31Var.f37611z = i10;
        return r31Var;
    }

    public static r31 F(int i7, String str) {
        r31 r31Var = new r31(39);
        r31Var.d = i7;
        r31Var.f37598l = str;
        r31Var.f37611z = 1;
        return r31Var;
    }

    public static q31 G(int i7) {
        LongSparseArray longSparseArray = K;
        if (longSparseArray == null) {
            return null;
        }
        return (q31) longSparseArray.get(i7);
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
            return new r31(q31Var.f37244a);
        }
        throw new RuntimeException("UItemFactory was not setuped: " + cls);
    }

    public static r31 b(String str) {
        r31 r31Var = new r31(1);
        r31Var.f37598l = str;
        return r31Var;
    }

    public static r31 c(int i7, int i10, String str) {
        r31 r31Var = new r31(3);
        r31Var.d = i7;
        r31Var.f37597k = i10;
        r31Var.f37598l = str;
        return r31Var;
    }

    public static r31 d(int i7, int i10, String str, String str2) {
        r31 r31Var = new r31(3);
        r31Var.d = i7;
        r31Var.f37597k = i10;
        r31Var.f37598l = str;
        r31Var.f37600n = str2;
        return r31Var;
    }

    public static r31 e(int i7, String str) {
        r31 r31Var = new r31(3);
        r31Var.d = i7;
        r31Var.f37598l = str;
        return r31Var;
    }

    public static r31 f(String str, CharSequence charSequence, int i7) {
        r31 r31Var = new r31(3);
        r31Var.d = i7;
        r31Var.f37598l = str;
        r31Var.f37600n = charSequence;
        return r31Var;
    }

    public static r31 g(CharSequence charSequence) {
        r31 r31Var = new r31(7);
        r31Var.f37598l = charSequence;
        r31Var.f37603q = true;
        return r31Var;
    }

    public static r31 h(int i7, int i10, org.telegram.ui.o41 o41Var) {
        r31 r31Var = new r31(i7 + 18);
        r31Var.f37611z = i10;
        r31Var.G = o41Var;
        return r31Var;
    }

    public static r31 i(int i7, CharSequence charSequence) {
        r31 r31Var = new r31(4);
        r31Var.d = i7;
        r31Var.f37598l = charSequence;
        return r31Var;
    }

    public static r31 j(int i7, View view) {
        r31 r31Var = new r31(-1);
        r31Var.d = i7;
        r31Var.f37591c = view;
        r31Var.f37611z = -1;
        return r31Var;
    }

    public static r31 k(View view) {
        r31 r31Var = new r31(-1);
        r31Var.f37591c = view;
        r31Var.f37611z = -1;
        return r31Var;
    }

    public static r31 l(int i7, View view) {
        r31 r31Var = new r31(-4);
        r31Var.d = i7;
        r31Var.f37591c = view;
        r31Var.f37611z = -1;
        return r31Var;
    }

    public static r31 m(View view) {
        r31 r31Var = new r31(-4);
        r31Var.f37591c = view;
        r31Var.f37611z = -1;
        return r31Var;
    }

    public static r31 n(View view, int i7) {
        r31 r31Var = new r31(-4);
        r31Var.f37591c = view;
        r31Var.f37611z = i7;
        return r31Var;
    }

    public static r31 o(int i7, String str, String str2) {
        r31 r31Var = new r31(40);
        r31Var.d = i7;
        r31Var.f37598l = str;
        r31Var.f37601o = str2;
        return r31Var;
    }

    public static r31 p(int i7) {
        r31 r31Var = new r31(34);
        r31Var.f37611z = i7;
        return r31Var;
    }

    public static r31 q(int i7, int i10) {
        r31 r31Var = new r31(34);
        r31Var.d = i7;
        r31Var.f37611z = i10;
        return r31Var;
    }

    public static r31 r(String str) {
        r31 r31Var = new r31(31);
        r31Var.f37598l = str;
        return r31Var;
    }

    public static r31 s(String str, String str2, View.OnClickListener onClickListener) {
        r31 r31Var = new r31(31);
        r31Var.f37598l = str;
        r31Var.f37599m = str2;
        r31Var.D = onClickListener;
        return r31Var;
    }

    public static r31 t(int i7, String str) {
        r31 r31Var = new r31(0);
        r31Var.d = i7;
        r31Var.f37598l = str;
        return r31Var;
    }

    public static r31 u(String str) {
        r31 r31Var = new r31(0);
        r31Var.f37598l = str;
        return r31Var;
    }

    public static r31 v(org.telegram.ui.wd wdVar) {
        r31 r31Var = new r31(24);
        r31Var.G = wdVar;
        return r31Var;
    }

    public static r31 w(TLObject tLObject) {
        r31 r31Var = new r31(32);
        r31Var.G = tLObject;
        return r31Var;
    }

    public static r31 x(int i7, String str) {
        r31 r31Var = new r31(10);
        r31Var.d = i7;
        r31Var.f37598l = str;
        return r31Var;
    }

    public static r31 y(int i7, String str, String str2) {
        r31 r31Var = new r31(44);
        r31Var.d = i7;
        r31Var.f37598l = str;
        r31Var.f37600n = str2;
        return r31Var;
    }

    public static r31 z(int i7, CharSequence charSequence) {
        r31 r31Var = new r31(35);
        r31Var.d = i7;
        r31Var.f37598l = charSequence;
        return r31Var;
    }

    public final boolean H(Class cls) {
        HashMap hashMap;
        q31 q31Var;
        if (this.f54415a >= 10000 && (hashMap = L) != null && (q31Var = (q31) hashMap.get(cls)) != null && q31Var.f37244a == this.f54415a) {
            return true;
        }
        return false;
    }

    public final boolean I(org.telegram.ui.Components.r31 r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.r31.I(org.telegram.ui.Components.r31):boolean");
    }

    public final boolean J(r31 r31Var) {
        if (this.d == r31Var.d && this.f37595i == r31Var.f37595i && this.f37609x == r31Var.f37609x && this.f37597k == r31Var.f37597k && this.f37596j == r31Var.f37596j && this.f37605s == r31Var.f37605s && this.f37604r == r31Var.f37604r && this.f37606t == r31Var.f37606t && this.f37603q == r31Var.f37603q && this.f37591c == r31Var.f37591c && TextUtils.equals(this.f37598l, r31Var.f37598l) && TextUtils.equals(this.f37599m, r31Var.f37599m) && TextUtils.equals(this.f37600n, r31Var.f37600n) && this.f37591c == r31Var.f37591c && this.f37611z == r31Var.f37611z && Math.abs(this.A - r31Var.A) < 0.01f && this.B == r31Var.B && Objects.equals(this.G, r31Var.G) && Objects.equals(this.H, r31Var.H)) {
            return true;
        }
        return false;
    }

    public final void L(boolean z9) {
        this.f37592e = z9;
        if (this.f54415a == 11) {
            this.f54415a = 12;
        }
    }

    @Override
    public final boolean a(rg.a aVar) {
        q31 G;
        if (this != aVar) {
            if (r31.class == aVar.getClass()) {
                r31 r31Var = (r31) aVar;
                int i7 = this.f54415a;
                if (i7 == r31Var.f54415a) {
                    if (i7 == 31) {
                        if (TextUtils.equals(this.f37598l, r31Var.f37598l) && TextUtils.equals(this.f37599m, r31Var.f37599m)) {
                            return true;
                        }
                        return false;
                    } else if (i7 == 28) {
                        if (this.f37611z == r31Var.f37611z) {
                            return true;
                        }
                        return false;
                    } else if (i7 != 35 && i7 != 37) {
                        if (i7 >= 10000 && (G = G(i7)) != null) {
                            return G.c(this, r31Var);
                        }
                        return I(r31Var);
                    } else if (this.d == r31Var.d && TextUtils.equals(this.f37598l, r31Var.f37598l) && this.f37592e == r31Var.f37592e) {
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
                int i7 = this.f54415a;
                if (i7 == r31Var.f54415a) {
                    if (i7 != 36 && i7 != 35) {
                        if (i7 == 28) {
                            if (this.d == r31Var.d) {
                                return true;
                            }
                            return false;
                        } else if (i7 == 31) {
                            return TextUtils.equals(this.f37598l, r31Var.f37598l);
                        } else {
                            if (i7 >= 10000 && (G = G(i7)) != null) {
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
