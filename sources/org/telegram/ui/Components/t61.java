package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import j$.util.Objects;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
public final class t61 extends qg.a {
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
    public View f32866c;
    public int d;
    public boolean e;
    public boolean f32867f;
    public boolean f32868g;
    public boolean h;
    public int f32869i;
    public boolean f32870j;
    public int f32871k;
    public CharSequence f32872l;
    public CharSequence f32873m;
    public CharSequence f32874n;
    public CharSequence f32875o;
    public String[] f32876p;
    public boolean f32877q;
    public boolean f32878r;
    public boolean f32879s;
    public boolean f32880t;
    public int f32881u;
    public int v;
    public boolean f32882w;
    public long f32883x;
    public int f32884y;
    public int f32885z;

    public t61(int i10) {
        super(i10, false);
        this.f32868g = true;
        this.f32881u = -1;
        this.I = true;
    }

    public static t61 A(String str, CharSequence charSequence, int i10) {
        t61 t61Var = new t61(41);
        t61Var.d = i10;
        t61Var.f32872l = charSequence;
        t61Var.f32875o = str;
        return t61Var;
    }

    public static t61 B(int i10, CharSequence charSequence) {
        t61 t61Var = new t61(7);
        t61Var.d = i10;
        t61Var.f32872l = charSequence;
        return t61Var;
    }

    public static t61 C(CharSequence charSequence) {
        t61 t61Var = new t61(7);
        t61Var.f32872l = charSequence;
        return t61Var;
    }

    public static t61 D(int i10) {
        t61 t61Var = new t61(28);
        t61Var.f32885z = i10;
        return t61Var;
    }

    public static t61 E(int i10, int i11) {
        t61 t61Var = new t61(28);
        t61Var.d = i10;
        t61Var.f32885z = i11;
        return t61Var;
    }

    public static t61 F(int i10, String str) {
        t61 t61Var = new t61(39);
        t61Var.d = i10;
        t61Var.f32872l = str;
        t61Var.f32885z = 1;
        return t61Var;
    }

    public static s61 G(int i10) {
        LongSparseArray longSparseArray = K;
        if (longSparseArray == null) {
            return null;
        }
        return (s61) longSparseArray.get(i10);
    }

    public static t61 K(Class cls) {
        if (L == null) {
            L = new HashMap();
        }
        if (K == null) {
            K = new LongSparseArray();
        }
        s61 s61Var = (s61) L.get(cls);
        if (s61Var != null) {
            return new t61(s61Var.viewType);
        }
        throw new RuntimeException("UItemFactory was not setuped: " + cls);
    }

    public static t61 b(String str) {
        t61 t61Var = new t61(1);
        t61Var.f32872l = str;
        return t61Var;
    }

    public static t61 c(int i10, int i11, String str) {
        t61 t61Var = new t61(3);
        t61Var.d = i10;
        t61Var.f32871k = i11;
        t61Var.f32872l = str;
        return t61Var;
    }

    public static t61 d(int i10, int i11, String str, String str2) {
        t61 t61Var = new t61(3);
        t61Var.d = i10;
        t61Var.f32871k = i11;
        t61Var.f32872l = str;
        t61Var.f32874n = str2;
        return t61Var;
    }

    public static t61 e(int i10, String str) {
        t61 t61Var = new t61(3);
        t61Var.d = i10;
        t61Var.f32872l = str;
        return t61Var;
    }

    public static t61 f(String str, CharSequence charSequence, int i10) {
        t61 t61Var = new t61(3);
        t61Var.d = i10;
        t61Var.f32872l = str;
        t61Var.f32874n = charSequence;
        return t61Var;
    }

    public static t61 g(CharSequence charSequence) {
        t61 t61Var = new t61(7);
        t61Var.f32872l = charSequence;
        t61Var.f32877q = true;
        return t61Var;
    }

    public static t61 h(int i10, int i11, org.telegram.ui.i91 i91Var) {
        t61 t61Var = new t61(i10 + 18);
        t61Var.f32885z = i11;
        t61Var.G = i91Var;
        return t61Var;
    }

    public static t61 i(int i10, CharSequence charSequence) {
        t61 t61Var = new t61(4);
        t61Var.d = i10;
        t61Var.f32872l = charSequence;
        return t61Var;
    }

    public static t61 j(int i10, View view) {
        t61 t61Var = new t61(-1);
        t61Var.d = i10;
        t61Var.f32866c = view;
        t61Var.f32885z = -1;
        return t61Var;
    }

    public static t61 k(View view) {
        t61 t61Var = new t61(-1);
        t61Var.f32866c = view;
        t61Var.f32885z = -1;
        return t61Var;
    }

    public static t61 l(int i10, View view) {
        t61 t61Var = new t61(-4);
        t61Var.d = i10;
        t61Var.f32866c = view;
        t61Var.f32885z = -1;
        return t61Var;
    }

    public static t61 m(View view) {
        t61 t61Var = new t61(-4);
        t61Var.f32866c = view;
        t61Var.f32885z = -1;
        return t61Var;
    }

    public static t61 n(View view, int i10) {
        t61 t61Var = new t61(-4);
        t61Var.f32866c = view;
        t61Var.f32885z = i10;
        return t61Var;
    }

    public static t61 o(int i10, String str, String str2) {
        t61 t61Var = new t61(40);
        t61Var.d = i10;
        t61Var.f32872l = str;
        t61Var.f32875o = str2;
        return t61Var;
    }

    public static t61 p(int i10) {
        t61 t61Var = new t61(34);
        t61Var.f32885z = i10;
        return t61Var;
    }

    public static t61 q(int i10, int i11) {
        t61 t61Var = new t61(34);
        t61Var.d = i10;
        t61Var.f32885z = i11;
        return t61Var;
    }

    public static t61 r(String str) {
        t61 t61Var = new t61(31);
        t61Var.f32872l = str;
        return t61Var;
    }

    public static t61 s(String str, String str2, View.OnClickListener onClickListener) {
        t61 t61Var = new t61(31);
        t61Var.f32872l = str;
        t61Var.f32873m = str2;
        t61Var.D = onClickListener;
        return t61Var;
    }

    public static t61 t(int i10, String str) {
        t61 t61Var = new t61(0);
        t61Var.d = i10;
        t61Var.f32872l = str;
        return t61Var;
    }

    public static t61 u(String str) {
        t61 t61Var = new t61(0);
        t61Var.f32872l = str;
        return t61Var;
    }

    public static t61 v(org.telegram.ui.he heVar) {
        t61 t61Var = new t61(24);
        t61Var.G = heVar;
        return t61Var;
    }

    public static t61 w(TLObject tLObject) {
        t61 t61Var = new t61(32);
        t61Var.G = tLObject;
        return t61Var;
    }

    public static t61 x(int i10, String str) {
        t61 t61Var = new t61(10);
        t61Var.d = i10;
        t61Var.f32872l = str;
        return t61Var;
    }

    public static t61 y(int i10, String str, String str2) {
        t61 t61Var = new t61(44);
        t61Var.d = i10;
        t61Var.f32872l = str;
        t61Var.f32874n = str2;
        return t61Var;
    }

    public static t61 z(int i10, CharSequence charSequence) {
        t61 t61Var = new t61(35);
        t61Var.d = i10;
        t61Var.f32872l = charSequence;
        return t61Var;
    }

    public final boolean H(Class cls) {
        HashMap hashMap;
        s61 s61Var;
        if (this.f47037a >= 10000 && (hashMap = L) != null && (s61Var = (s61) hashMap.get(cls)) != null && s61Var.viewType == this.f47037a) {
            return true;
        }
        return false;
    }

    public final boolean I(org.telegram.ui.Components.t61 r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.t61.I(org.telegram.ui.Components.t61):boolean");
    }

    public final boolean J(t61 t61Var) {
        if (this.d == t61Var.d && this.f32869i == t61Var.f32869i && this.f32883x == t61Var.f32883x && this.f32871k == t61Var.f32871k && this.f32870j == t61Var.f32870j && this.f32879s == t61Var.f32879s && this.f32878r == t61Var.f32878r && this.f32880t == t61Var.f32880t && this.f32877q == t61Var.f32877q && this.f32866c == t61Var.f32866c && TextUtils.equals(this.f32872l, t61Var.f32872l) && TextUtils.equals(this.f32873m, t61Var.f32873m) && TextUtils.equals(this.f32874n, t61Var.f32874n) && this.f32866c == t61Var.f32866c && this.f32885z == t61Var.f32885z && Math.abs(this.A - t61Var.A) < 0.01f && this.B == t61Var.B && Objects.equals(this.G, t61Var.G) && Objects.equals(this.H, t61Var.H)) {
            return true;
        }
        return false;
    }

    public final void L(boolean z10) {
        this.e = z10;
        if (this.f47037a == 11) {
            this.f47037a = 12;
        }
    }

    @Override
    public final boolean a(qg.a aVar) {
        s61 G;
        if (this != aVar) {
            if (t61.class == aVar.getClass()) {
                t61 t61Var = (t61) aVar;
                int i10 = this.f47037a;
                if (i10 == t61Var.f47037a) {
                    if (i10 == 31) {
                        if (TextUtils.equals(this.f32872l, t61Var.f32872l) && TextUtils.equals(this.f32873m, t61Var.f32873m)) {
                            return true;
                        }
                        return false;
                    } else if (i10 == 28) {
                        if (this.f32885z == t61Var.f32885z) {
                            return true;
                        }
                        return false;
                    } else if (i10 != 35 && i10 != 37) {
                        if (i10 >= 10000 && (G = G(i10)) != null) {
                            return G.contentsEquals(this, t61Var);
                        }
                        return I(t61Var);
                    } else if (this.d == t61Var.d && TextUtils.equals(this.f32872l, t61Var.f32872l) && this.e == t61Var.e) {
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
        s61 G;
        if (this != obj) {
            if (obj != null && t61.class == obj.getClass()) {
                t61 t61Var = (t61) obj;
                int i10 = this.f47037a;
                if (i10 == t61Var.f47037a) {
                    if (i10 != 36 && i10 != 35) {
                        if (i10 == 28) {
                            if (this.d == t61Var.d) {
                                return true;
                            }
                            return false;
                        } else if (i10 == 31) {
                            return TextUtils.equals(this.f32872l, t61Var.f32872l);
                        } else {
                            if (i10 >= 10000 && (G = G(i10)) != null) {
                                return G.equals(this, t61Var);
                            }
                            return J(t61Var);
                        }
                    } else if (this.d == t61Var.d) {
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
