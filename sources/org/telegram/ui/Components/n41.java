package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import j$.util.Objects;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.c91;

public final class n41 extends xf.a {
    public static int J = 10000;
    public static LongSparseArray K;
    public static HashMap L;
    public float A;
    public long B;
    public Utilities.Callback C;
    public View.OnClickListener D;
    public View.OnClickListener E;
    public org.telegram.ui.x3 F;
    public Object G;
    public Object H;
    public boolean I;

    public View f30837c;
    public int d;

    public boolean f30838e;

    public boolean f30839f;

    public boolean f30840g;
    public boolean h;

    public int f30841i;

    public boolean f30842j;

    public int f30843k;

    public CharSequence f30844l;

    public CharSequence f30845m;

    public CharSequence f30846n;

    public CharSequence f30847o;

    public String[] f30848p;

    public boolean f30849q;

    public boolean f30850r;

    public boolean f30851s;

    public boolean f30852t;

    public int f30853u;
    public int v;

    public boolean f30854w;

    public long f30855x;

    public int f30856y;

    public int f30857z;

    public n41(int i10) {
        super(i10, false);
        this.f30840g = true;
        this.f30853u = -1;
        this.I = true;
    }

    public static n41 A(int i10, CharSequence charSequence) {
        n41 n41Var = new n41(7);
        n41Var.d = i10;
        n41Var.f30844l = charSequence;
        return n41Var;
    }

    public static n41 B(CharSequence charSequence) {
        n41 n41Var = new n41(7);
        n41Var.f30844l = charSequence;
        return n41Var;
    }

    public static n41 C(int i10) {
        n41 n41Var = new n41(28);
        n41Var.f30857z = i10;
        return n41Var;
    }

    public static n41 D(int i10, int i11) {
        n41 n41Var = new n41(28);
        n41Var.d = i10;
        n41Var.f30857z = i11;
        return n41Var;
    }

    public static n41 E(int i10, String str) {
        n41 n41Var = new n41(39);
        n41Var.d = i10;
        n41Var.f30844l = str;
        n41Var.f30857z = 1;
        return n41Var;
    }

    public static m41 F(int i10) {
        LongSparseArray longSparseArray = K;
        if (longSparseArray == null) {
            return null;
        }
        return (m41) longSparseArray.get(i10);
    }

    public static n41 J(Class cls) {
        if (L == null) {
            L = new HashMap();
        }
        if (K == null) {
            K = new LongSparseArray();
        }
        m41 m41Var = (m41) L.get(cls);
        if (m41Var != null) {
            return new n41(m41Var.viewType);
        }
        throw new RuntimeException("UItemFactory was not setuped: " + cls);
    }

    public static n41 b(String str) {
        n41 n41Var = new n41(1);
        n41Var.f30844l = str;
        return n41Var;
    }

    public static n41 c(int i10, int i11, String str) {
        n41 n41Var = new n41(3);
        n41Var.d = i10;
        n41Var.f30843k = i11;
        n41Var.f30844l = str;
        return n41Var;
    }

    public static n41 d(int i10, int i11, String str, String str2) {
        n41 n41Var = new n41(3);
        n41Var.d = i10;
        n41Var.f30843k = i11;
        n41Var.f30844l = str;
        n41Var.f30846n = str2;
        return n41Var;
    }

    public static n41 e(int i10, String str) {
        n41 n41Var = new n41(3);
        n41Var.d = i10;
        n41Var.f30844l = str;
        return n41Var;
    }

    public static n41 f(String str, CharSequence charSequence, int i10) {
        n41 n41Var = new n41(3);
        n41Var.d = i10;
        n41Var.f30844l = str;
        n41Var.f30846n = charSequence;
        return n41Var;
    }

    public static n41 g(CharSequence charSequence) {
        n41 n41Var = new n41(7);
        n41Var.f30844l = charSequence;
        n41Var.f30849q = true;
        return n41Var;
    }

    public static n41 h(int i10, int i11, c91 c91Var) {
        n41 n41Var = new n41(i10 + 18);
        n41Var.f30857z = i11;
        n41Var.G = c91Var;
        return n41Var;
    }

    public static n41 i(int i10, CharSequence charSequence) {
        n41 n41Var = new n41(4);
        n41Var.d = i10;
        n41Var.f30844l = charSequence;
        return n41Var;
    }

    public static n41 j(int i10, View view) {
        n41 n41Var = new n41(-1);
        n41Var.d = i10;
        n41Var.f30837c = view;
        n41Var.f30857z = -1;
        return n41Var;
    }

    public static n41 k(View view) {
        n41 n41Var = new n41(-1);
        n41Var.f30837c = view;
        n41Var.f30857z = -1;
        return n41Var;
    }

    public static n41 l(View view) {
        n41 n41Var = new n41(-4);
        n41Var.f30837c = view;
        n41Var.f30857z = -1;
        return n41Var;
    }

    public static n41 m(int i10, String str, String str2) {
        n41 n41Var = new n41(40);
        n41Var.d = i10;
        n41Var.f30844l = str;
        n41Var.f30847o = str2;
        return n41Var;
    }

    public static n41 n(int i10) {
        n41 n41Var = new n41(34);
        n41Var.f30857z = i10;
        return n41Var;
    }

    public static n41 o(int i10, int i11) {
        n41 n41Var = new n41(34);
        n41Var.d = i10;
        n41Var.f30857z = i11;
        return n41Var;
    }

    public static n41 p(View view, int i10, boolean z10) {
        n41 n41Var = new n41(-3);
        n41Var.f30837c = view;
        n41Var.f30857z = i10;
        n41Var.f30856y = z10 ? 1 : 0;
        return n41Var;
    }

    public static n41 q(String str) {
        n41 n41Var = new n41(31);
        n41Var.f30844l = str;
        return n41Var;
    }

    public static n41 r(String str, String str2, View.OnClickListener onClickListener) {
        n41 n41Var = new n41(31);
        n41Var.f30844l = str;
        n41Var.f30845m = str2;
        n41Var.D = onClickListener;
        return n41Var;
    }

    public static n41 s(int i10, String str) {
        n41 n41Var = new n41(0);
        n41Var.d = i10;
        n41Var.f30844l = str;
        return n41Var;
    }

    public static n41 t(String str) {
        n41 n41Var = new n41(0);
        n41Var.f30844l = str;
        return n41Var;
    }

    public static n41 u(org.telegram.ui.ce ceVar) {
        n41 n41Var = new n41(24);
        n41Var.G = ceVar;
        return n41Var;
    }

    public static n41 v(TLObject tLObject) {
        n41 n41Var = new n41(32);
        n41Var.G = tLObject;
        return n41Var;
    }

    public static n41 w(int i10, String str) {
        n41 n41Var = new n41(10);
        n41Var.d = i10;
        n41Var.f30844l = str;
        return n41Var;
    }

    public static n41 x(int i10, String str, String str2) {
        n41 n41Var = new n41(44);
        n41Var.d = i10;
        n41Var.f30844l = str;
        n41Var.f30846n = str2;
        return n41Var;
    }

    public static n41 y(int i10, CharSequence charSequence) {
        n41 n41Var = new n41(35);
        n41Var.d = i10;
        n41Var.f30844l = charSequence;
        return n41Var;
    }

    public static n41 z(String str, CharSequence charSequence, int i10) {
        n41 n41Var = new n41(41);
        n41Var.d = i10;
        n41Var.f30844l = charSequence;
        n41Var.f30847o = str;
        return n41Var;
    }

    public final boolean G(Class cls) {
        HashMap map;
        m41 m41Var;
        return this.f49413a >= 10000 && (map = L) != null && (m41Var = (m41) map.get(cls)) != null && m41Var.viewType == this.f49413a;
    }

    public final boolean H(org.telegram.ui.Components.n41 r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.n41.H(org.telegram.ui.Components.n41):boolean");
    }

    public final boolean I(n41 n41Var) {
        return this.d == n41Var.d && this.f30841i == n41Var.f30841i && this.f30855x == n41Var.f30855x && this.f30843k == n41Var.f30843k && this.f30842j == n41Var.f30842j && this.f30851s == n41Var.f30851s && this.f30850r == n41Var.f30850r && this.f30852t == n41Var.f30852t && this.f30849q == n41Var.f30849q && this.f30837c == n41Var.f30837c && TextUtils.equals(this.f30844l, n41Var.f30844l) && TextUtils.equals(this.f30845m, n41Var.f30845m) && TextUtils.equals(this.f30846n, n41Var.f30846n) && this.f30837c == n41Var.f30837c && this.f30857z == n41Var.f30857z && Math.abs(this.A - n41Var.A) < 0.01f && this.B == n41Var.B && Objects.equals(this.G, n41Var.G) && Objects.equals(this.H, n41Var.H);
    }

    public final void K(boolean z10) {
        this.f30838e = z10;
        if (this.f49413a == 11) {
            this.f49413a = 12;
        }
    }

    @Override
    public final boolean a(xf.a aVar) {
        m41 m41VarF;
        if (this == aVar) {
            return true;
        }
        if (n41.class != aVar.getClass()) {
            return false;
        }
        n41 n41Var = (n41) aVar;
        int i10 = this.f49413a;
        if (i10 != n41Var.f49413a) {
            return false;
        }
        if (i10 == 31) {
            return TextUtils.equals(this.f30844l, n41Var.f30844l) && TextUtils.equals(this.f30845m, n41Var.f30845m);
        }
        if (i10 == 28) {
            return this.f30857z == n41Var.f30857z;
        }
        if (i10 == 35 || i10 == 37) {
            return this.d == n41Var.d && TextUtils.equals(this.f30844l, n41Var.f30844l) && this.f30838e == n41Var.f30838e;
        }
        return (i10 < 10000 || (m41VarF = F(i10)) == null) ? H(n41Var) : m41VarF.contentsEquals(this, n41Var);
    }

    public final boolean equals(Object obj) {
        m41 m41VarF;
        if (this == obj) {
            return true;
        }
        if (obj == null || n41.class != obj.getClass()) {
            return false;
        }
        n41 n41Var = (n41) obj;
        int i10 = this.f49413a;
        if (i10 != n41Var.f49413a) {
            return false;
        }
        if (i10 == 36 || i10 == 35) {
            return this.d == n41Var.d;
        }
        if (i10 == 28) {
            return this.d == n41Var.d;
        }
        if (i10 == 31) {
            return TextUtils.equals(this.f30844l, n41Var.f30844l);
        }
        return (i10 < 10000 || (m41VarF = F(i10)) == null) ? I(n41Var) : m41VarF.equals(this, n41Var);
    }
}
