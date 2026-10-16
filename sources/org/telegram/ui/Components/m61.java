package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import j$.util.Objects;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ta1;
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
    public View f26940c;
    public int d;
    public boolean e;
    public boolean f26941f;
    public boolean f26942g;
    public boolean h;
    public int f26943i;
    public boolean f26944j;
    public int f26945k;
    public CharSequence f26946l;
    public CharSequence f26947m;
    public CharSequence f26948n;
    public CharSequence f26949o;
    public String[] f26950p;
    public boolean f26951q;
    public boolean f26952r;
    public boolean f26953s;
    public boolean f26954t;
    public int f26955u;
    public int v;
    public boolean f26956w;
    public long f26957x;
    public int f26958y;
    public int f26959z;

    public m61(int i10) {
        super(i10, false);
        this.f26942g = true;
        this.f26955u = -1;
        this.I = true;
    }

    public static m61 A(int i10, CharSequence charSequence) {
        m61 m61Var = new m61(7);
        m61Var.d = i10;
        m61Var.f26946l = charSequence;
        return m61Var;
    }

    public static m61 B(CharSequence charSequence) {
        m61 m61Var = new m61(7);
        m61Var.f26946l = charSequence;
        return m61Var;
    }

    public static m61 C(int i10) {
        m61 m61Var = new m61(28);
        m61Var.f26959z = i10;
        return m61Var;
    }

    public static m61 D(int i10, int i11) {
        m61 m61Var = new m61(28);
        m61Var.d = i10;
        m61Var.f26959z = i11;
        return m61Var;
    }

    public static m61 E(int i10, String str) {
        m61 m61Var = new m61(39);
        m61Var.d = i10;
        m61Var.f26946l = str;
        m61Var.f26959z = 1;
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
        m61Var.f26946l = str;
        return m61Var;
    }

    public static m61 c(int i10, int i11, String str) {
        m61 m61Var = new m61(3);
        m61Var.d = i10;
        m61Var.f26945k = i11;
        m61Var.f26946l = str;
        return m61Var;
    }

    public static m61 d(int i10, int i11, String str, String str2) {
        m61 m61Var = new m61(3);
        m61Var.d = i10;
        m61Var.f26945k = i11;
        m61Var.f26946l = str;
        m61Var.f26948n = str2;
        return m61Var;
    }

    public static m61 e(int i10, String str) {
        m61 m61Var = new m61(3);
        m61Var.d = i10;
        m61Var.f26946l = str;
        return m61Var;
    }

    public static m61 f(String str, CharSequence charSequence, int i10) {
        m61 m61Var = new m61(3);
        m61Var.d = i10;
        m61Var.f26946l = str;
        m61Var.f26948n = charSequence;
        return m61Var;
    }

    public static m61 g(CharSequence charSequence) {
        m61 m61Var = new m61(7);
        m61Var.f26946l = charSequence;
        m61Var.f26951q = true;
        return m61Var;
    }

    public static m61 h(int i10, int i11, ta1 ta1Var) {
        m61 m61Var = new m61(i10 + 18);
        m61Var.f26959z = i11;
        m61Var.G = ta1Var;
        return m61Var;
    }

    public static m61 i(int i10, CharSequence charSequence) {
        m61 m61Var = new m61(4);
        m61Var.d = i10;
        m61Var.f26946l = charSequence;
        return m61Var;
    }

    public static m61 j(int i10, View view) {
        m61 m61Var = new m61(-1);
        m61Var.d = i10;
        m61Var.f26940c = view;
        m61Var.f26959z = -1;
        return m61Var;
    }

    public static m61 k(View view) {
        m61 m61Var = new m61(-1);
        m61Var.f26940c = view;
        m61Var.f26959z = -1;
        return m61Var;
    }

    public static m61 l(View view) {
        m61 m61Var = new m61(-4);
        m61Var.f26940c = view;
        m61Var.f26959z = -1;
        return m61Var;
    }

    public static m61 m(int i10, String str, String str2) {
        m61 m61Var = new m61(40);
        m61Var.d = i10;
        m61Var.f26946l = str;
        m61Var.f26949o = str2;
        return m61Var;
    }

    public static m61 n(int i10) {
        m61 m61Var = new m61(34);
        m61Var.f26959z = i10;
        return m61Var;
    }

    public static m61 o(int i10, int i11) {
        m61 m61Var = new m61(34);
        m61Var.d = i10;
        m61Var.f26959z = i11;
        return m61Var;
    }

    public static m61 p(View view, int i10, boolean z10) {
        m61 m61Var = new m61(-3);
        m61Var.f26940c = view;
        m61Var.f26959z = i10;
        m61Var.f26958y = z10 ? 1 : 0;
        return m61Var;
    }

    public static m61 q(String str) {
        m61 m61Var = new m61(31);
        m61Var.f26946l = str;
        return m61Var;
    }

    public static m61 r(String str, String str2, View.OnClickListener onClickListener) {
        m61 m61Var = new m61(31);
        m61Var.f26946l = str;
        m61Var.f26947m = str2;
        m61Var.D = onClickListener;
        return m61Var;
    }

    public static m61 s(int i10, String str) {
        m61 m61Var = new m61(0);
        m61Var.d = i10;
        m61Var.f26946l = str;
        return m61Var;
    }

    public static m61 t(String str) {
        m61 m61Var = new m61(0);
        m61Var.f26946l = str;
        return m61Var;
    }

    public static m61 u(org.telegram.ui.ne neVar) {
        m61 m61Var = new m61(24);
        m61Var.G = neVar;
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
        m61Var.f26946l = str;
        return m61Var;
    }

    public static m61 x(int i10, String str, String str2) {
        m61 m61Var = new m61(44);
        m61Var.d = i10;
        m61Var.f26946l = str;
        m61Var.f26948n = str2;
        return m61Var;
    }

    public static m61 y(int i10, CharSequence charSequence) {
        m61 m61Var = new m61(35);
        m61Var.d = i10;
        m61Var.f26946l = charSequence;
        return m61Var;
    }

    public static m61 z(String str, CharSequence charSequence, int i10) {
        m61 m61Var = new m61(41);
        m61Var.d = i10;
        m61Var.f26946l = charSequence;
        m61Var.f26949o = str;
        return m61Var;
    }

    public final boolean G(Class cls) {
        HashMap hashMap;
        l61 l61Var;
        if (this.f42904a >= 10000 && (hashMap = L) != null && (l61Var = (l61) hashMap.get(cls)) != null && l61Var.viewType == this.f42904a) {
            return true;
        }
        return false;
    }

    public final boolean H(org.telegram.ui.Components.m61 r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.m61.H(org.telegram.ui.Components.m61):boolean");
    }

    public final boolean I(m61 m61Var) {
        if (this.d == m61Var.d && this.f26943i == m61Var.f26943i && this.f26957x == m61Var.f26957x && this.f26945k == m61Var.f26945k && this.f26944j == m61Var.f26944j && this.f26953s == m61Var.f26953s && this.f26952r == m61Var.f26952r && this.f26954t == m61Var.f26954t && this.f26951q == m61Var.f26951q && this.f26940c == m61Var.f26940c && TextUtils.equals(this.f26946l, m61Var.f26946l) && TextUtils.equals(this.f26947m, m61Var.f26947m) && TextUtils.equals(this.f26948n, m61Var.f26948n) && this.f26940c == m61Var.f26940c && this.f26959z == m61Var.f26959z && Math.abs(this.A - m61Var.A) < 0.01f && this.B == m61Var.B && Objects.equals(this.G, m61Var.G) && Objects.equals(this.H, m61Var.H)) {
            return true;
        }
        return false;
    }

    public final void K(boolean z10) {
        this.e = z10;
        if (this.f42904a == 11) {
            this.f42904a = 12;
        }
    }

    @Override
    public final boolean a(pg.a aVar) {
        l61 F;
        if (this != aVar) {
            if (m61.class == aVar.getClass()) {
                m61 m61Var = (m61) aVar;
                int i10 = this.f42904a;
                if (i10 == m61Var.f42904a) {
                    if (i10 == 31) {
                        if (TextUtils.equals(this.f26946l, m61Var.f26946l) && TextUtils.equals(this.f26947m, m61Var.f26947m)) {
                            return true;
                        }
                        return false;
                    } else if (i10 == 28) {
                        if (this.f26959z == m61Var.f26959z) {
                            return true;
                        }
                        return false;
                    } else if (i10 != 35 && i10 != 37) {
                        if (i10 >= 10000 && (F = F(i10)) != null) {
                            return F.contentsEquals(this, m61Var);
                        }
                        return H(m61Var);
                    } else if (this.d == m61Var.d && TextUtils.equals(this.f26946l, m61Var.f26946l) && this.e == m61Var.e) {
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
                int i10 = this.f42904a;
                if (i10 == m61Var.f42904a) {
                    if (i10 != 36 && i10 != 35) {
                        if (i10 == 28) {
                            if (this.d == m61Var.d) {
                                return true;
                            }
                            return false;
                        } else if (i10 == 31) {
                            return TextUtils.equals(this.f26946l, m61Var.f26946l);
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
