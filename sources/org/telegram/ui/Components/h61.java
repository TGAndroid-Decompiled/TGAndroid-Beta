package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import j$.util.Objects;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
public final class h61 extends pg.a {
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
    public View f26776c;
    public int d;
    public boolean e;
    public boolean f26777f;
    public boolean f26778g;
    public boolean h;
    public int f26779i;
    public boolean f26780j;
    public int f26781k;
    public CharSequence f26782l;
    public CharSequence f26783m;
    public CharSequence f26784n;
    public CharSequence f26785o;
    public String[] f26786p;
    public boolean f26787q;
    public boolean f26788r;
    public boolean f26789s;
    public boolean f26790t;
    public int f26791u;
    public int v;
    public boolean f26792w;
    public long f26793x;
    public int f26794y;
    public int f26795z;

    public h61(int i10) {
        super(i10, false);
        this.f26778g = true;
        this.f26791u = -1;
        this.I = true;
    }

    public static h61 A(int i10, CharSequence charSequence) {
        h61 h61Var = new h61(7);
        h61Var.d = i10;
        h61Var.f26782l = charSequence;
        return h61Var;
    }

    public static h61 B(CharSequence charSequence) {
        h61 h61Var = new h61(7);
        h61Var.f26782l = charSequence;
        return h61Var;
    }

    public static h61 C(int i10) {
        h61 h61Var = new h61(28);
        h61Var.f26795z = i10;
        return h61Var;
    }

    public static h61 D(int i10, int i11) {
        h61 h61Var = new h61(28);
        h61Var.d = i10;
        h61Var.f26795z = i11;
        return h61Var;
    }

    public static h61 E(int i10, String str) {
        h61 h61Var = new h61(39);
        h61Var.d = i10;
        h61Var.f26782l = str;
        h61Var.f26795z = 1;
        return h61Var;
    }

    public static g61 F(int i10) {
        LongSparseArray longSparseArray = K;
        if (longSparseArray == null) {
            return null;
        }
        return (g61) longSparseArray.get(i10);
    }

    public static h61 J(Class cls) {
        if (L == null) {
            L = new HashMap();
        }
        if (K == null) {
            K = new LongSparseArray();
        }
        g61 g61Var = (g61) L.get(cls);
        if (g61Var != null) {
            return new h61(g61Var.viewType);
        }
        throw new RuntimeException("UItemFactory was not setuped: " + cls);
    }

    public static h61 b(String str) {
        h61 h61Var = new h61(1);
        h61Var.f26782l = str;
        return h61Var;
    }

    public static h61 c(int i10, int i11, String str) {
        h61 h61Var = new h61(3);
        h61Var.d = i10;
        h61Var.f26781k = i11;
        h61Var.f26782l = str;
        return h61Var;
    }

    public static h61 d(int i10, int i11, String str, String str2) {
        h61 h61Var = new h61(3);
        h61Var.d = i10;
        h61Var.f26781k = i11;
        h61Var.f26782l = str;
        h61Var.f26784n = str2;
        return h61Var;
    }

    public static h61 e(int i10, String str) {
        h61 h61Var = new h61(3);
        h61Var.d = i10;
        h61Var.f26782l = str;
        return h61Var;
    }

    public static h61 f(String str, CharSequence charSequence, int i10) {
        h61 h61Var = new h61(3);
        h61Var.d = i10;
        h61Var.f26782l = str;
        h61Var.f26784n = charSequence;
        return h61Var;
    }

    public static h61 g(CharSequence charSequence) {
        h61 h61Var = new h61(7);
        h61Var.f26782l = charSequence;
        h61Var.f26787q = true;
        return h61Var;
    }

    public static h61 h(int i10, int i11, org.telegram.ui.b91 b91Var) {
        h61 h61Var = new h61(i10 + 18);
        h61Var.f26795z = i11;
        h61Var.G = b91Var;
        return h61Var;
    }

    public static h61 i(int i10, CharSequence charSequence) {
        h61 h61Var = new h61(4);
        h61Var.d = i10;
        h61Var.f26782l = charSequence;
        return h61Var;
    }

    public static h61 j(int i10, View view) {
        h61 h61Var = new h61(-1);
        h61Var.d = i10;
        h61Var.f26776c = view;
        h61Var.f26795z = -1;
        return h61Var;
    }

    public static h61 k(View view) {
        h61 h61Var = new h61(-1);
        h61Var.f26776c = view;
        h61Var.f26795z = -1;
        return h61Var;
    }

    public static h61 l(View view) {
        h61 h61Var = new h61(-4);
        h61Var.f26776c = view;
        h61Var.f26795z = -1;
        return h61Var;
    }

    public static h61 m(int i10, String str, String str2) {
        h61 h61Var = new h61(40);
        h61Var.d = i10;
        h61Var.f26782l = str;
        h61Var.f26785o = str2;
        return h61Var;
    }

    public static h61 n(int i10) {
        h61 h61Var = new h61(34);
        h61Var.f26795z = i10;
        return h61Var;
    }

    public static h61 o(int i10, int i11) {
        h61 h61Var = new h61(34);
        h61Var.d = i10;
        h61Var.f26795z = i11;
        return h61Var;
    }

    public static h61 p(View view, int i10, boolean z10) {
        h61 h61Var = new h61(-3);
        h61Var.f26776c = view;
        h61Var.f26795z = i10;
        h61Var.f26794y = z10 ? 1 : 0;
        return h61Var;
    }

    public static h61 q(String str) {
        h61 h61Var = new h61(31);
        h61Var.f26782l = str;
        return h61Var;
    }

    public static h61 r(String str, String str2, View.OnClickListener onClickListener) {
        h61 h61Var = new h61(31);
        h61Var.f26782l = str;
        h61Var.f26783m = str2;
        h61Var.D = onClickListener;
        return h61Var;
    }

    public static h61 s(int i10, String str) {
        h61 h61Var = new h61(0);
        h61Var.d = i10;
        h61Var.f26782l = str;
        return h61Var;
    }

    public static h61 t(String str) {
        h61 h61Var = new h61(0);
        h61Var.f26782l = str;
        return h61Var;
    }

    public static h61 u(org.telegram.ui.fe feVar) {
        h61 h61Var = new h61(24);
        h61Var.G = feVar;
        return h61Var;
    }

    public static h61 v(TLObject tLObject) {
        h61 h61Var = new h61(32);
        h61Var.G = tLObject;
        return h61Var;
    }

    public static h61 w(int i10, String str) {
        h61 h61Var = new h61(10);
        h61Var.d = i10;
        h61Var.f26782l = str;
        return h61Var;
    }

    public static h61 x(int i10, String str, String str2) {
        h61 h61Var = new h61(44);
        h61Var.d = i10;
        h61Var.f26782l = str;
        h61Var.f26784n = str2;
        return h61Var;
    }

    public static h61 y(int i10, CharSequence charSequence) {
        h61 h61Var = new h61(35);
        h61Var.d = i10;
        h61Var.f26782l = charSequence;
        return h61Var;
    }

    public static h61 z(String str, CharSequence charSequence, int i10) {
        h61 h61Var = new h61(41);
        h61Var.d = i10;
        h61Var.f26782l = charSequence;
        h61Var.f26785o = str;
        return h61Var;
    }

    public final boolean G(Class cls) {
        HashMap hashMap;
        g61 g61Var;
        if (this.f44296a >= 10000 && (hashMap = L) != null && (g61Var = (g61) hashMap.get(cls)) != null && g61Var.viewType == this.f44296a) {
            return true;
        }
        return false;
    }

    public final boolean H(org.telegram.ui.Components.h61 r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.h61.H(org.telegram.ui.Components.h61):boolean");
    }

    public final boolean I(h61 h61Var) {
        if (this.d == h61Var.d && this.f26779i == h61Var.f26779i && this.f26793x == h61Var.f26793x && this.f26781k == h61Var.f26781k && this.f26780j == h61Var.f26780j && this.f26789s == h61Var.f26789s && this.f26788r == h61Var.f26788r && this.f26790t == h61Var.f26790t && this.f26787q == h61Var.f26787q && this.f26776c == h61Var.f26776c && TextUtils.equals(this.f26782l, h61Var.f26782l) && TextUtils.equals(this.f26783m, h61Var.f26783m) && TextUtils.equals(this.f26784n, h61Var.f26784n) && this.f26776c == h61Var.f26776c && this.f26795z == h61Var.f26795z && Math.abs(this.A - h61Var.A) < 0.01f && this.B == h61Var.B && Objects.equals(this.G, h61Var.G) && Objects.equals(this.H, h61Var.H)) {
            return true;
        }
        return false;
    }

    public final void K(boolean z10) {
        this.e = z10;
        if (this.f44296a == 11) {
            this.f44296a = 12;
        }
    }

    @Override
    public final boolean a(pg.a aVar) {
        g61 F;
        if (this != aVar) {
            if (h61.class == aVar.getClass()) {
                h61 h61Var = (h61) aVar;
                int i10 = this.f44296a;
                if (i10 == h61Var.f44296a) {
                    if (i10 == 31) {
                        if (TextUtils.equals(this.f26782l, h61Var.f26782l) && TextUtils.equals(this.f26783m, h61Var.f26783m)) {
                            return true;
                        }
                        return false;
                    } else if (i10 == 28) {
                        if (this.f26795z == h61Var.f26795z) {
                            return true;
                        }
                        return false;
                    } else if (i10 != 35 && i10 != 37) {
                        if (i10 >= 10000 && (F = F(i10)) != null) {
                            return F.contentsEquals(this, h61Var);
                        }
                        return H(h61Var);
                    } else if (this.d == h61Var.d && TextUtils.equals(this.f26782l, h61Var.f26782l) && this.e == h61Var.e) {
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
        g61 F;
        if (this != obj) {
            if (obj != null && h61.class == obj.getClass()) {
                h61 h61Var = (h61) obj;
                int i10 = this.f44296a;
                if (i10 == h61Var.f44296a) {
                    if (i10 != 36 && i10 != 35) {
                        if (i10 == 28) {
                            if (this.d == h61Var.d) {
                                return true;
                            }
                            return false;
                        } else if (i10 == 31) {
                            return TextUtils.equals(this.f26782l, h61Var.f26782l);
                        } else {
                            if (i10 >= 10000 && (F = F(i10)) != null) {
                                return F.equals(this, h61Var);
                            }
                            return I(h61Var);
                        }
                    } else if (this.d == h61Var.d) {
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
