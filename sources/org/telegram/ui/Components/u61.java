package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import j$.util.Objects;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.pa1;
public final class u61 extends og.a {
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
    public View f31064c;
    public int d;
    public boolean f31065e;
    public boolean f31066f;
    public boolean f31067g;
    public boolean h;
    public int f31068i;
    public boolean f31069j;
    public int f31070k;
    public CharSequence f31071l;
    public CharSequence f31072m;
    public CharSequence f31073n;
    public CharSequence f31074o;
    public String[] f31075p;
    public boolean f31076q;
    public boolean f31077r;
    public boolean f31078s;
    public boolean f31079t;
    public int f31080u;
    public int v;
    public boolean f31081w;
    public long f31082x;
    public int f31083y;
    public int f31084z;

    public u61(int i10) {
        super(i10, false);
        this.f31067g = true;
        this.f31080u = -1;
        this.I = true;
    }

    public static u61 A(int i10, CharSequence charSequence) {
        u61 u61Var = new u61(7);
        u61Var.d = i10;
        u61Var.f31071l = charSequence;
        return u61Var;
    }

    public static u61 B(CharSequence charSequence) {
        u61 u61Var = new u61(7);
        u61Var.f31071l = charSequence;
        return u61Var;
    }

    public static u61 C(int i10) {
        u61 u61Var = new u61(28);
        u61Var.f31084z = i10;
        return u61Var;
    }

    public static u61 D(int i10, int i11) {
        u61 u61Var = new u61(28);
        u61Var.d = i10;
        u61Var.f31084z = i11;
        return u61Var;
    }

    public static u61 E(int i10, String str) {
        u61 u61Var = new u61(39);
        u61Var.d = i10;
        u61Var.f31071l = str;
        u61Var.f31084z = 1;
        return u61Var;
    }

    public static t61 F(int i10) {
        LongSparseArray longSparseArray = K;
        if (longSparseArray == null) {
            return null;
        }
        return (t61) longSparseArray.get(i10);
    }

    public static u61 J(Class cls) {
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
        u61Var.f31071l = str;
        return u61Var;
    }

    public static u61 c(int i10, int i11, String str) {
        u61 u61Var = new u61(3);
        u61Var.d = i10;
        u61Var.f31070k = i11;
        u61Var.f31071l = str;
        return u61Var;
    }

    public static u61 d(int i10, int i11, String str, String str2) {
        u61 u61Var = new u61(3);
        u61Var.d = i10;
        u61Var.f31070k = i11;
        u61Var.f31071l = str;
        u61Var.f31073n = str2;
        return u61Var;
    }

    public static u61 e(int i10, String str) {
        u61 u61Var = new u61(3);
        u61Var.d = i10;
        u61Var.f31071l = str;
        return u61Var;
    }

    public static u61 f(String str, CharSequence charSequence, int i10) {
        u61 u61Var = new u61(3);
        u61Var.d = i10;
        u61Var.f31071l = str;
        u61Var.f31073n = charSequence;
        return u61Var;
    }

    public static u61 g(CharSequence charSequence) {
        u61 u61Var = new u61(7);
        u61Var.f31071l = charSequence;
        u61Var.f31076q = true;
        return u61Var;
    }

    public static u61 h(int i10, int i11, pa1 pa1Var) {
        u61 u61Var = new u61(i10 + 18);
        u61Var.f31084z = i11;
        u61Var.G = pa1Var;
        return u61Var;
    }

    public static u61 i(int i10, CharSequence charSequence) {
        u61 u61Var = new u61(4);
        u61Var.d = i10;
        u61Var.f31071l = charSequence;
        return u61Var;
    }

    public static u61 j(int i10, View view) {
        u61 u61Var = new u61(-1);
        u61Var.d = i10;
        u61Var.f31064c = view;
        u61Var.f31084z = -1;
        return u61Var;
    }

    public static u61 k(View view) {
        u61 u61Var = new u61(-1);
        u61Var.f31064c = view;
        u61Var.f31084z = -1;
        return u61Var;
    }

    public static u61 l(View view) {
        u61 u61Var = new u61(-4);
        u61Var.f31064c = view;
        u61Var.f31084z = -1;
        return u61Var;
    }

    public static u61 m(int i10, String str, String str2) {
        u61 u61Var = new u61(40);
        u61Var.d = i10;
        u61Var.f31071l = str;
        u61Var.f31074o = str2;
        return u61Var;
    }

    public static u61 n(int i10) {
        u61 u61Var = new u61(34);
        u61Var.f31084z = i10;
        return u61Var;
    }

    public static u61 o(int i10, int i11) {
        u61 u61Var = new u61(34);
        u61Var.d = i10;
        u61Var.f31084z = i11;
        return u61Var;
    }

    public static u61 p(View view, int i10, boolean z10) {
        u61 u61Var = new u61(-3);
        u61Var.f31064c = view;
        u61Var.f31084z = i10;
        u61Var.f31083y = z10 ? 1 : 0;
        return u61Var;
    }

    public static u61 q(String str) {
        u61 u61Var = new u61(31);
        u61Var.f31071l = str;
        return u61Var;
    }

    public static u61 r(String str, String str2, View.OnClickListener onClickListener) {
        u61 u61Var = new u61(31);
        u61Var.f31071l = str;
        u61Var.f31072m = str2;
        u61Var.D = onClickListener;
        return u61Var;
    }

    public static u61 s(int i10, String str) {
        u61 u61Var = new u61(0);
        u61Var.d = i10;
        u61Var.f31071l = str;
        return u61Var;
    }

    public static u61 t(String str) {
        u61 u61Var = new u61(0);
        u61Var.f31071l = str;
        return u61Var;
    }

    public static u61 u(org.telegram.ui.le leVar) {
        u61 u61Var = new u61(24);
        u61Var.G = leVar;
        return u61Var;
    }

    public static u61 v(TLObject tLObject) {
        u61 u61Var = new u61(32);
        u61Var.G = tLObject;
        return u61Var;
    }

    public static u61 w(int i10, String str) {
        u61 u61Var = new u61(10);
        u61Var.d = i10;
        u61Var.f31071l = str;
        return u61Var;
    }

    public static u61 x(int i10, String str, String str2) {
        u61 u61Var = new u61(44);
        u61Var.d = i10;
        u61Var.f31071l = str;
        u61Var.f31073n = str2;
        return u61Var;
    }

    public static u61 y(int i10, CharSequence charSequence) {
        u61 u61Var = new u61(35);
        u61Var.d = i10;
        u61Var.f31071l = charSequence;
        return u61Var;
    }

    public static u61 z(String str, CharSequence charSequence, int i10) {
        u61 u61Var = new u61(41);
        u61Var.d = i10;
        u61Var.f31071l = charSequence;
        u61Var.f31074o = str;
        return u61Var;
    }

    public final boolean G(Class cls) {
        HashMap hashMap;
        t61 t61Var;
        if (this.f16877a >= 10000 && (hashMap = L) != null && (t61Var = (t61) hashMap.get(cls)) != null && t61Var.viewType == this.f16877a) {
            return true;
        }
        return false;
    }

    public final boolean H(org.telegram.ui.Components.u61 r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.u61.H(org.telegram.ui.Components.u61):boolean");
    }

    public final boolean I(u61 u61Var) {
        if (this.d == u61Var.d && this.f31068i == u61Var.f31068i && this.f31082x == u61Var.f31082x && this.f31070k == u61Var.f31070k && this.f31069j == u61Var.f31069j && this.f31078s == u61Var.f31078s && this.f31077r == u61Var.f31077r && this.f31079t == u61Var.f31079t && this.f31076q == u61Var.f31076q && this.f31064c == u61Var.f31064c && TextUtils.equals(this.f31071l, u61Var.f31071l) && TextUtils.equals(this.f31072m, u61Var.f31072m) && TextUtils.equals(this.f31073n, u61Var.f31073n) && this.f31064c == u61Var.f31064c && this.f31084z == u61Var.f31084z && Math.abs(this.A - u61Var.A) < 0.01f && this.B == u61Var.B && Objects.equals(this.G, u61Var.G) && Objects.equals(this.H, u61Var.H)) {
            return true;
        }
        return false;
    }

    public final void K(boolean z10) {
        this.f31065e = z10;
        if (this.f16877a == 11) {
            this.f16877a = 12;
        }
    }

    @Override
    public final boolean a(og.a aVar) {
        t61 F;
        if (this != aVar) {
            if (u61.class == aVar.getClass()) {
                u61 u61Var = (u61) aVar;
                int i10 = this.f16877a;
                if (i10 == u61Var.f16877a) {
                    if (i10 == 31) {
                        if (TextUtils.equals(this.f31071l, u61Var.f31071l) && TextUtils.equals(this.f31072m, u61Var.f31072m)) {
                            return true;
                        }
                        return false;
                    } else if (i10 == 28) {
                        if (this.f31084z == u61Var.f31084z) {
                            return true;
                        }
                        return false;
                    } else if (i10 != 35 && i10 != 37) {
                        if (i10 >= 10000 && (F = F(i10)) != null) {
                            return F.contentsEquals(this, u61Var);
                        }
                        return H(u61Var);
                    } else if (this.d == u61Var.d && TextUtils.equals(this.f31071l, u61Var.f31071l) && this.f31065e == u61Var.f31065e) {
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
        t61 F;
        if (this != obj) {
            if (obj != null && u61.class == obj.getClass()) {
                u61 u61Var = (u61) obj;
                int i10 = this.f16877a;
                if (i10 == u61Var.f16877a) {
                    if (i10 != 36 && i10 != 35) {
                        if (i10 == 28) {
                            if (this.d == u61Var.d) {
                                return true;
                            }
                            return false;
                        } else if (i10 == 31) {
                            return TextUtils.equals(this.f31071l, u61Var.f31071l);
                        } else {
                            if (i10 >= 10000 && (F = F(i10)) != null) {
                                return F.equals(this, u61Var);
                            }
                            return I(u61Var);
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
