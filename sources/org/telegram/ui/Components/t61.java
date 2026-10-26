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
    public View f32869c;
    public int d;
    public boolean e;
    public boolean f32870f;
    public boolean f32871g;
    public boolean h;
    public int f32872i;
    public boolean f32873j;
    public int f32874k;
    public CharSequence f32875l;
    public CharSequence f32876m;
    public CharSequence f32877n;
    public CharSequence f32878o;
    public String[] f32879p;
    public boolean f32880q;
    public boolean f32881r;
    public boolean f32882s;
    public boolean f32883t;
    public int f32884u;
    public int v;
    public boolean f32885w;
    public long f32886x;
    public int f32887y;
    public int f32888z;

    public t61(int i10) {
        super(i10, false);
        this.f32871g = true;
        this.f32884u = -1;
        this.I = true;
    }

    public static t61 A(String str, CharSequence charSequence, int i10) {
        t61 t61Var = new t61(41);
        t61Var.d = i10;
        t61Var.f32875l = charSequence;
        t61Var.f32878o = str;
        return t61Var;
    }

    public static t61 B(int i10, CharSequence charSequence) {
        t61 t61Var = new t61(7);
        t61Var.d = i10;
        t61Var.f32875l = charSequence;
        return t61Var;
    }

    public static t61 C(CharSequence charSequence) {
        t61 t61Var = new t61(7);
        t61Var.f32875l = charSequence;
        return t61Var;
    }

    public static t61 D(int i10) {
        t61 t61Var = new t61(28);
        t61Var.f32888z = i10;
        return t61Var;
    }

    public static t61 E(int i10, int i11) {
        t61 t61Var = new t61(28);
        t61Var.d = i10;
        t61Var.f32888z = i11;
        return t61Var;
    }

    public static t61 F(int i10, String str) {
        t61 t61Var = new t61(39);
        t61Var.d = i10;
        t61Var.f32875l = str;
        t61Var.f32888z = 1;
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
        t61Var.f32875l = str;
        return t61Var;
    }

    public static t61 c(int i10, int i11, String str) {
        t61 t61Var = new t61(3);
        t61Var.d = i10;
        t61Var.f32874k = i11;
        t61Var.f32875l = str;
        return t61Var;
    }

    public static t61 d(int i10, int i11, String str, String str2) {
        t61 t61Var = new t61(3);
        t61Var.d = i10;
        t61Var.f32874k = i11;
        t61Var.f32875l = str;
        t61Var.f32877n = str2;
        return t61Var;
    }

    public static t61 e(int i10, String str) {
        t61 t61Var = new t61(3);
        t61Var.d = i10;
        t61Var.f32875l = str;
        return t61Var;
    }

    public static t61 f(String str, CharSequence charSequence, int i10) {
        t61 t61Var = new t61(3);
        t61Var.d = i10;
        t61Var.f32875l = str;
        t61Var.f32877n = charSequence;
        return t61Var;
    }

    public static t61 g(CharSequence charSequence) {
        t61 t61Var = new t61(7);
        t61Var.f32875l = charSequence;
        t61Var.f32880q = true;
        return t61Var;
    }

    public static t61 h(int i10, int i11, org.telegram.ui.i91 i91Var) {
        t61 t61Var = new t61(i10 + 18);
        t61Var.f32888z = i11;
        t61Var.G = i91Var;
        return t61Var;
    }

    public static t61 i(int i10, CharSequence charSequence) {
        t61 t61Var = new t61(4);
        t61Var.d = i10;
        t61Var.f32875l = charSequence;
        return t61Var;
    }

    public static t61 j(int i10, View view) {
        t61 t61Var = new t61(-1);
        t61Var.d = i10;
        t61Var.f32869c = view;
        t61Var.f32888z = -1;
        return t61Var;
    }

    public static t61 k(View view) {
        t61 t61Var = new t61(-1);
        t61Var.f32869c = view;
        t61Var.f32888z = -1;
        return t61Var;
    }

    public static t61 l(int i10, View view) {
        t61 t61Var = new t61(-4);
        t61Var.d = i10;
        t61Var.f32869c = view;
        t61Var.f32888z = -1;
        return t61Var;
    }

    public static t61 m(View view) {
        t61 t61Var = new t61(-4);
        t61Var.f32869c = view;
        t61Var.f32888z = -1;
        return t61Var;
    }

    public static t61 n(View view, int i10) {
        t61 t61Var = new t61(-4);
        t61Var.f32869c = view;
        t61Var.f32888z = i10;
        return t61Var;
    }

    public static t61 o(int i10, String str, String str2) {
        t61 t61Var = new t61(40);
        t61Var.d = i10;
        t61Var.f32875l = str;
        t61Var.f32878o = str2;
        return t61Var;
    }

    public static t61 p(int i10) {
        t61 t61Var = new t61(34);
        t61Var.f32888z = i10;
        return t61Var;
    }

    public static t61 q(int i10, int i11) {
        t61 t61Var = new t61(34);
        t61Var.d = i10;
        t61Var.f32888z = i11;
        return t61Var;
    }

    public static t61 r(String str) {
        t61 t61Var = new t61(31);
        t61Var.f32875l = str;
        return t61Var;
    }

    public static t61 s(String str, String str2, View.OnClickListener onClickListener) {
        t61 t61Var = new t61(31);
        t61Var.f32875l = str;
        t61Var.f32876m = str2;
        t61Var.D = onClickListener;
        return t61Var;
    }

    public static t61 t(int i10, String str) {
        t61 t61Var = new t61(0);
        t61Var.d = i10;
        t61Var.f32875l = str;
        return t61Var;
    }

    public static t61 u(String str) {
        t61 t61Var = new t61(0);
        t61Var.f32875l = str;
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
        t61Var.f32875l = str;
        return t61Var;
    }

    public static t61 y(int i10, String str, String str2) {
        t61 t61Var = new t61(44);
        t61Var.d = i10;
        t61Var.f32875l = str;
        t61Var.f32877n = str2;
        return t61Var;
    }

    public static t61 z(int i10, CharSequence charSequence) {
        t61 t61Var = new t61(35);
        t61Var.d = i10;
        t61Var.f32875l = charSequence;
        return t61Var;
    }

    public final boolean H(Class cls) {
        HashMap hashMap;
        s61 s61Var;
        if (this.f47040a >= 10000 && (hashMap = L) != null && (s61Var = (s61) hashMap.get(cls)) != null && s61Var.viewType == this.f47040a) {
            return true;
        }
        return false;
    }

    public final boolean I(org.telegram.ui.Components.t61 r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.t61.I(org.telegram.ui.Components.t61):boolean");
    }

    public final boolean J(t61 t61Var) {
        if (this.d == t61Var.d && this.f32872i == t61Var.f32872i && this.f32886x == t61Var.f32886x && this.f32874k == t61Var.f32874k && this.f32873j == t61Var.f32873j && this.f32882s == t61Var.f32882s && this.f32881r == t61Var.f32881r && this.f32883t == t61Var.f32883t && this.f32880q == t61Var.f32880q && this.f32869c == t61Var.f32869c && TextUtils.equals(this.f32875l, t61Var.f32875l) && TextUtils.equals(this.f32876m, t61Var.f32876m) && TextUtils.equals(this.f32877n, t61Var.f32877n) && this.f32869c == t61Var.f32869c && this.f32888z == t61Var.f32888z && Math.abs(this.A - t61Var.A) < 0.01f && this.B == t61Var.B && Objects.equals(this.G, t61Var.G) && Objects.equals(this.H, t61Var.H)) {
            return true;
        }
        return false;
    }

    public final void L(boolean z10) {
        this.e = z10;
        if (this.f47040a == 11) {
            this.f47040a = 12;
        }
    }

    @Override
    public final boolean a(qg.a aVar) {
        s61 G;
        if (this != aVar) {
            if (t61.class == aVar.getClass()) {
                t61 t61Var = (t61) aVar;
                int i10 = this.f47040a;
                if (i10 == t61Var.f47040a) {
                    if (i10 == 31) {
                        if (TextUtils.equals(this.f32875l, t61Var.f32875l) && TextUtils.equals(this.f32876m, t61Var.f32876m)) {
                            return true;
                        }
                        return false;
                    } else if (i10 == 28) {
                        if (this.f32888z == t61Var.f32888z) {
                            return true;
                        }
                        return false;
                    } else if (i10 != 35 && i10 != 37) {
                        if (i10 >= 10000 && (G = G(i10)) != null) {
                            return G.contentsEquals(this, t61Var);
                        }
                        return I(t61Var);
                    } else if (this.d == t61Var.d && TextUtils.equals(this.f32875l, t61Var.f32875l) && this.e == t61Var.e) {
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
                int i10 = this.f47040a;
                if (i10 == t61Var.f47040a) {
                    if (i10 != 36 && i10 != 35) {
                        if (i10 == 28) {
                            if (this.d == t61Var.d) {
                                return true;
                            }
                            return false;
                        } else if (i10 == 31) {
                            return TextUtils.equals(this.f32875l, t61Var.f32875l);
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
