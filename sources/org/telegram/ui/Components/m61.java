package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import j$.util.Objects;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
public final class m61 extends pg.a {
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
    public View f28553c;
    public int d;
    public boolean e;
    public boolean f28554f;
    public boolean f28555g;
    public boolean h;
    public int f28556i;
    public boolean f28557j;
    public int f28558k;
    public CharSequence f28559l;
    public CharSequence f28560m;
    public CharSequence f28561n;
    public CharSequence f28562o;
    public String[] f28563p;
    public boolean f28564q;
    public boolean f28565r;
    public boolean f28566s;
    public boolean f28567t;
    public int f28568u;
    public int v;
    public boolean f28569w;
    public long f28570x;
    public int f28571y;
    public int f28572z;

    public m61(int i10) {
        super(i10, false);
        this.f28555g = true;
        this.f28568u = -1;
        this.I = true;
    }

    public static m61 A(int i10, CharSequence charSequence) {
        m61 m61Var = new m61(7);
        m61Var.d = i10;
        m61Var.f28559l = charSequence;
        return m61Var;
    }

    public static m61 B(CharSequence charSequence) {
        m61 m61Var = new m61(7);
        m61Var.f28559l = charSequence;
        return m61Var;
    }

    public static m61 C(int i10) {
        m61 m61Var = new m61(28);
        m61Var.f28572z = i10;
        return m61Var;
    }

    public static m61 D(int i10, int i11) {
        m61 m61Var = new m61(28);
        m61Var.d = i10;
        m61Var.f28572z = i11;
        return m61Var;
    }

    public static m61 E(int i10, String str) {
        m61 m61Var = new m61(39);
        m61Var.d = i10;
        m61Var.f28559l = str;
        m61Var.f28572z = 1;
        return m61Var;
    }

    public static l61 F(int i10) {
        LongSparseArray longSparseArray = K;
        if (longSparseArray == null) {
            return null;
        }
        return (l61) longSparseArray.get(i10);
    }

    public static m61 J(Class cls) {
        if (L == null) {
            L = new HashMap();
        }
        if (K == null) {
            K = new LongSparseArray();
        }
        l61 l61Var = (l61) L.get(cls);
        if (l61Var != null) {
            return new m61(l61Var.viewType);
        }
        throw new RuntimeException("UItemFactory was not setuped: " + cls);
    }

    public static m61 b(String str) {
        m61 m61Var = new m61(1);
        m61Var.f28559l = str;
        return m61Var;
    }

    public static m61 c(int i10, int i11, String str) {
        m61 m61Var = new m61(3);
        m61Var.d = i10;
        m61Var.f28558k = i11;
        m61Var.f28559l = str;
        return m61Var;
    }

    public static m61 d(int i10, int i11, String str, String str2) {
        m61 m61Var = new m61(3);
        m61Var.d = i10;
        m61Var.f28558k = i11;
        m61Var.f28559l = str;
        m61Var.f28561n = str2;
        return m61Var;
    }

    public static m61 e(int i10, String str) {
        m61 m61Var = new m61(3);
        m61Var.d = i10;
        m61Var.f28559l = str;
        return m61Var;
    }

    public static m61 f(String str, CharSequence charSequence, int i10) {
        m61 m61Var = new m61(3);
        m61Var.d = i10;
        m61Var.f28559l = str;
        m61Var.f28561n = charSequence;
        return m61Var;
    }

    public static m61 g(CharSequence charSequence) {
        m61 m61Var = new m61(7);
        m61Var.f28559l = charSequence;
        m61Var.f28564q = true;
        return m61Var;
    }

    public static m61 h(int i10, int i11, org.telegram.ui.g91 g91Var) {
        m61 m61Var = new m61(i10 + 18);
        m61Var.f28572z = i11;
        m61Var.G = g91Var;
        return m61Var;
    }

    public static m61 i(int i10, CharSequence charSequence) {
        m61 m61Var = new m61(4);
        m61Var.d = i10;
        m61Var.f28559l = charSequence;
        return m61Var;
    }

    public static m61 j(int i10, View view) {
        m61 m61Var = new m61(-1);
        m61Var.d = i10;
        m61Var.f28553c = view;
        m61Var.f28572z = -1;
        return m61Var;
    }

    public static m61 k(View view) {
        m61 m61Var = new m61(-1);
        m61Var.f28553c = view;
        m61Var.f28572z = -1;
        return m61Var;
    }

    public static m61 l(View view) {
        m61 m61Var = new m61(-4);
        m61Var.f28553c = view;
        m61Var.f28572z = -1;
        return m61Var;
    }

    public static m61 m(int i10, String str, String str2) {
        m61 m61Var = new m61(40);
        m61Var.d = i10;
        m61Var.f28559l = str;
        m61Var.f28562o = str2;
        return m61Var;
    }

    public static m61 n(int i10) {
        m61 m61Var = new m61(34);
        m61Var.f28572z = i10;
        return m61Var;
    }

    public static m61 o(int i10, int i11) {
        m61 m61Var = new m61(34);
        m61Var.d = i10;
        m61Var.f28572z = i11;
        return m61Var;
    }

    public static m61 p(View view, int i10, boolean z10) {
        m61 m61Var = new m61(-3);
        m61Var.f28553c = view;
        m61Var.f28572z = i10;
        m61Var.f28571y = z10 ? 1 : 0;
        return m61Var;
    }

    public static m61 q(String str) {
        m61 m61Var = new m61(31);
        m61Var.f28559l = str;
        return m61Var;
    }

    public static m61 r(String str, String str2, View.OnClickListener onClickListener) {
        m61 m61Var = new m61(31);
        m61Var.f28559l = str;
        m61Var.f28560m = str2;
        m61Var.D = onClickListener;
        return m61Var;
    }

    public static m61 s(int i10, String str) {
        m61 m61Var = new m61(0);
        m61Var.d = i10;
        m61Var.f28559l = str;
        return m61Var;
    }

    public static m61 t(String str) {
        m61 m61Var = new m61(0);
        m61Var.f28559l = str;
        return m61Var;
    }

    public static m61 u(org.telegram.ui.fe feVar) {
        m61 m61Var = new m61(24);
        m61Var.G = feVar;
        return m61Var;
    }

    public static m61 v(TLObject tLObject) {
        m61 m61Var = new m61(32);
        m61Var.G = tLObject;
        return m61Var;
    }

    public static m61 w(int i10, String str) {
        m61 m61Var = new m61(10);
        m61Var.d = i10;
        m61Var.f28559l = str;
        return m61Var;
    }

    public static m61 x(int i10, String str, String str2) {
        m61 m61Var = new m61(44);
        m61Var.d = i10;
        m61Var.f28559l = str;
        m61Var.f28561n = str2;
        return m61Var;
    }

    public static m61 y(int i10, CharSequence charSequence) {
        m61 m61Var = new m61(35);
        m61Var.d = i10;
        m61Var.f28559l = charSequence;
        return m61Var;
    }

    public static m61 z(String str, CharSequence charSequence, int i10) {
        m61 m61Var = new m61(41);
        m61Var.d = i10;
        m61Var.f28559l = charSequence;
        m61Var.f28562o = str;
        return m61Var;
    }

    public final boolean G(Class cls) {
        HashMap hashMap;
        l61 l61Var;
        if (this.f44713a >= 10000 && (hashMap = L) != null && (l61Var = (l61) hashMap.get(cls)) != null && l61Var.viewType == this.f44713a) {
            return true;
        }
        return false;
    }

    public final boolean H(org.telegram.ui.Components.m61 r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.m61.H(org.telegram.ui.Components.m61):boolean");
    }

    public final boolean I(m61 m61Var) {
        if (this.d == m61Var.d && this.f28556i == m61Var.f28556i && this.f28570x == m61Var.f28570x && this.f28558k == m61Var.f28558k && this.f28557j == m61Var.f28557j && this.f28566s == m61Var.f28566s && this.f28565r == m61Var.f28565r && this.f28567t == m61Var.f28567t && this.f28564q == m61Var.f28564q && this.f28553c == m61Var.f28553c && TextUtils.equals(this.f28559l, m61Var.f28559l) && TextUtils.equals(this.f28560m, m61Var.f28560m) && TextUtils.equals(this.f28561n, m61Var.f28561n) && this.f28553c == m61Var.f28553c && this.f28572z == m61Var.f28572z && Math.abs(this.A - m61Var.A) < 0.01f && this.B == m61Var.B && Objects.equals(this.G, m61Var.G) && Objects.equals(this.H, m61Var.H)) {
            return true;
        }
        return false;
    }

    public final void K(boolean z10) {
        this.e = z10;
        if (this.f44713a == 11) {
            this.f44713a = 12;
        }
    }

    @Override
    public final boolean a(pg.a aVar) {
        l61 F;
        if (this != aVar) {
            if (m61.class == aVar.getClass()) {
                m61 m61Var = (m61) aVar;
                int i10 = this.f44713a;
                if (i10 == m61Var.f44713a) {
                    if (i10 == 31) {
                        if (TextUtils.equals(this.f28559l, m61Var.f28559l) && TextUtils.equals(this.f28560m, m61Var.f28560m)) {
                            return true;
                        }
                        return false;
                    } else if (i10 == 28) {
                        if (this.f28572z == m61Var.f28572z) {
                            return true;
                        }
                        return false;
                    } else if (i10 != 35 && i10 != 37) {
                        if (i10 >= 10000 && (F = F(i10)) != null) {
                            return F.contentsEquals(this, m61Var);
                        }
                        return H(m61Var);
                    } else if (this.d == m61Var.d && TextUtils.equals(this.f28559l, m61Var.f28559l) && this.e == m61Var.e) {
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
        l61 F;
        if (this != obj) {
            if (obj != null && m61.class == obj.getClass()) {
                m61 m61Var = (m61) obj;
                int i10 = this.f44713a;
                if (i10 == m61Var.f44713a) {
                    if (i10 != 36 && i10 != 35) {
                        if (i10 == 28) {
                            if (this.d == m61Var.d) {
                                return true;
                            }
                            return false;
                        } else if (i10 == 31) {
                            return TextUtils.equals(this.f28559l, m61Var.f28559l);
                        } else {
                            if (i10 >= 10000 && (F = F(i10)) != null) {
                                return F.equals(this, m61Var);
                            }
                            return I(m61Var);
                        }
                    } else if (this.d == m61Var.d) {
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
