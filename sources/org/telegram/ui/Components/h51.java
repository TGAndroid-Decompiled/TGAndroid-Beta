package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import j$.util.Objects;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.na1;
public final class h51 extends pg.a {
    public static int J = 10000;
    public static LongSparseArray K;
    public static HashMap L;
    public float A;
    public long B;
    public Utilities.Callback C;
    public View.OnClickListener D;
    public View.OnClickListener E;
    public org.telegram.ui.t3 F;
    public Object G;
    public Object H;
    public boolean I;
    public View f26587c;
    public int d;
    public boolean f26588e;
    public boolean f26589f;
    public boolean f26590g;
    public boolean h;
    public int f26591i;
    public boolean f26592j;
    public int f26593k;
    public CharSequence f26594l;
    public CharSequence f26595m;
    public CharSequence f26596n;
    public CharSequence f26597o;
    public String[] f26598p;
    public boolean f26599q;
    public boolean f26600r;
    public boolean f26601s;
    public boolean f26602t;
    public int f26603u;
    public int v;
    public boolean f26604w;
    public long f26605x;
    public int f26606y;
    public int f26607z;

    public h51(int i10) {
        super(i10, false);
        this.f26590g = true;
        this.f26603u = -1;
        this.I = true;
    }

    public static h51 A(int i10, CharSequence charSequence) {
        h51 h51Var = new h51(7);
        h51Var.d = i10;
        h51Var.f26594l = charSequence;
        return h51Var;
    }

    public static h51 B(CharSequence charSequence) {
        h51 h51Var = new h51(7);
        h51Var.f26594l = charSequence;
        return h51Var;
    }

    public static h51 C(int i10) {
        h51 h51Var = new h51(28);
        h51Var.f26607z = i10;
        return h51Var;
    }

    public static h51 D(int i10, int i11) {
        h51 h51Var = new h51(28);
        h51Var.d = i10;
        h51Var.f26607z = i11;
        return h51Var;
    }

    public static h51 E(int i10, String str) {
        h51 h51Var = new h51(39);
        h51Var.d = i10;
        h51Var.f26594l = str;
        h51Var.f26607z = 1;
        return h51Var;
    }

    public static g51 F(int i10) {
        LongSparseArray longSparseArray = K;
        if (longSparseArray == null) {
            return null;
        }
        return (g51) longSparseArray.get(i10);
    }

    public static h51 J(Class cls) {
        if (L == null) {
            L = new HashMap();
        }
        if (K == null) {
            K = new LongSparseArray();
        }
        g51 g51Var = (g51) L.get(cls);
        if (g51Var != null) {
            return new h51(g51Var.viewType);
        }
        throw new RuntimeException("UItemFactory was not setuped: " + cls);
    }

    public static h51 b(String str) {
        h51 h51Var = new h51(1);
        h51Var.f26594l = str;
        return h51Var;
    }

    public static h51 c(int i10, int i11, String str) {
        h51 h51Var = new h51(3);
        h51Var.d = i10;
        h51Var.f26593k = i11;
        h51Var.f26594l = str;
        return h51Var;
    }

    public static h51 d(int i10, int i11, String str, String str2) {
        h51 h51Var = new h51(3);
        h51Var.d = i10;
        h51Var.f26593k = i11;
        h51Var.f26594l = str;
        h51Var.f26596n = str2;
        return h51Var;
    }

    public static h51 e(int i10, String str) {
        h51 h51Var = new h51(3);
        h51Var.d = i10;
        h51Var.f26594l = str;
        return h51Var;
    }

    public static h51 f(String str, CharSequence charSequence, int i10) {
        h51 h51Var = new h51(3);
        h51Var.d = i10;
        h51Var.f26594l = str;
        h51Var.f26596n = charSequence;
        return h51Var;
    }

    public static h51 g(CharSequence charSequence) {
        h51 h51Var = new h51(7);
        h51Var.f26594l = charSequence;
        h51Var.f26599q = true;
        return h51Var;
    }

    public static h51 h(int i10, int i11, na1 na1Var) {
        h51 h51Var = new h51(i10 + 18);
        h51Var.f26607z = i11;
        h51Var.G = na1Var;
        return h51Var;
    }

    public static h51 i(int i10, CharSequence charSequence) {
        h51 h51Var = new h51(4);
        h51Var.d = i10;
        h51Var.f26594l = charSequence;
        return h51Var;
    }

    public static h51 j(int i10, View view) {
        h51 h51Var = new h51(-1);
        h51Var.d = i10;
        h51Var.f26587c = view;
        h51Var.f26607z = -1;
        return h51Var;
    }

    public static h51 k(View view) {
        h51 h51Var = new h51(-1);
        h51Var.f26587c = view;
        h51Var.f26607z = -1;
        return h51Var;
    }

    public static h51 l(View view) {
        h51 h51Var = new h51(-4);
        h51Var.f26587c = view;
        h51Var.f26607z = -1;
        return h51Var;
    }

    public static h51 m(int i10, String str, String str2) {
        h51 h51Var = new h51(40);
        h51Var.d = i10;
        h51Var.f26594l = str;
        h51Var.f26597o = str2;
        return h51Var;
    }

    public static h51 n(int i10) {
        h51 h51Var = new h51(34);
        h51Var.f26607z = i10;
        return h51Var;
    }

    public static h51 o(int i10, int i11) {
        h51 h51Var = new h51(34);
        h51Var.d = i10;
        h51Var.f26607z = i11;
        return h51Var;
    }

    public static h51 p(View view, int i10, boolean z10) {
        h51 h51Var = new h51(-3);
        h51Var.f26587c = view;
        h51Var.f26607z = i10;
        h51Var.f26606y = z10 ? 1 : 0;
        return h51Var;
    }

    public static h51 q(String str) {
        h51 h51Var = new h51(31);
        h51Var.f26594l = str;
        return h51Var;
    }

    public static h51 r(String str, String str2, View.OnClickListener onClickListener) {
        h51 h51Var = new h51(31);
        h51Var.f26594l = str;
        h51Var.f26595m = str2;
        h51Var.D = onClickListener;
        return h51Var;
    }

    public static h51 s(int i10, String str) {
        h51 h51Var = new h51(0);
        h51Var.d = i10;
        h51Var.f26594l = str;
        return h51Var;
    }

    public static h51 t(String str) {
        h51 h51Var = new h51(0);
        h51Var.f26594l = str;
        return h51Var;
    }

    public static h51 u(org.telegram.ui.he heVar) {
        h51 h51Var = new h51(24);
        h51Var.G = heVar;
        return h51Var;
    }

    public static h51 v(TLObject tLObject) {
        h51 h51Var = new h51(32);
        h51Var.G = tLObject;
        return h51Var;
    }

    public static h51 w(int i10, String str) {
        h51 h51Var = new h51(10);
        h51Var.d = i10;
        h51Var.f26594l = str;
        return h51Var;
    }

    public static h51 x(int i10, String str, String str2) {
        h51 h51Var = new h51(44);
        h51Var.d = i10;
        h51Var.f26594l = str;
        h51Var.f26596n = str2;
        return h51Var;
    }

    public static h51 y(int i10, CharSequence charSequence) {
        h51 h51Var = new h51(35);
        h51Var.d = i10;
        h51Var.f26594l = charSequence;
        return h51Var;
    }

    public static h51 z(String str, CharSequence charSequence, int i10) {
        h51 h51Var = new h51(41);
        h51Var.d = i10;
        h51Var.f26594l = charSequence;
        h51Var.f26597o = str;
        return h51Var;
    }

    public final boolean G(Class cls) {
        HashMap hashMap;
        g51 g51Var;
        if (this.f44071a >= 10000 && (hashMap = L) != null && (g51Var = (g51) hashMap.get(cls)) != null && g51Var.viewType == this.f44071a) {
            return true;
        }
        return false;
    }

    public final boolean H(org.telegram.ui.Components.h51 r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.h51.H(org.telegram.ui.Components.h51):boolean");
    }

    public final boolean I(h51 h51Var) {
        if (this.d == h51Var.d && this.f26591i == h51Var.f26591i && this.f26605x == h51Var.f26605x && this.f26593k == h51Var.f26593k && this.f26592j == h51Var.f26592j && this.f26601s == h51Var.f26601s && this.f26600r == h51Var.f26600r && this.f26602t == h51Var.f26602t && this.f26599q == h51Var.f26599q && this.f26587c == h51Var.f26587c && TextUtils.equals(this.f26594l, h51Var.f26594l) && TextUtils.equals(this.f26595m, h51Var.f26595m) && TextUtils.equals(this.f26596n, h51Var.f26596n) && this.f26587c == h51Var.f26587c && this.f26607z == h51Var.f26607z && Math.abs(this.A - h51Var.A) < 0.01f && this.B == h51Var.B && Objects.equals(this.G, h51Var.G) && Objects.equals(this.H, h51Var.H)) {
            return true;
        }
        return false;
    }

    public final void K(boolean z10) {
        this.f26588e = z10;
        if (this.f44071a == 11) {
            this.f44071a = 12;
        }
    }

    @Override
    public final boolean a(pg.a aVar) {
        g51 F;
        if (this != aVar) {
            if (h51.class == aVar.getClass()) {
                h51 h51Var = (h51) aVar;
                int i10 = this.f44071a;
                if (i10 == h51Var.f44071a) {
                    if (i10 == 31) {
                        if (TextUtils.equals(this.f26594l, h51Var.f26594l) && TextUtils.equals(this.f26595m, h51Var.f26595m)) {
                            return true;
                        }
                        return false;
                    } else if (i10 == 28) {
                        if (this.f26607z == h51Var.f26607z) {
                            return true;
                        }
                        return false;
                    } else if (i10 != 35 && i10 != 37) {
                        if (i10 >= 10000 && (F = F(i10)) != null) {
                            return F.contentsEquals(this, h51Var);
                        }
                        return H(h51Var);
                    } else if (this.d == h51Var.d && TextUtils.equals(this.f26594l, h51Var.f26594l) && this.f26588e == h51Var.f26588e) {
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
        g51 F;
        if (this != obj) {
            if (obj != null && h51.class == obj.getClass()) {
                h51 h51Var = (h51) obj;
                int i10 = this.f44071a;
                if (i10 == h51Var.f44071a) {
                    if (i10 != 36 && i10 != 35) {
                        if (i10 == 28) {
                            if (this.d == h51Var.d) {
                                return true;
                            }
                            return false;
                        } else if (i10 == 31) {
                            return TextUtils.equals(this.f26594l, h51Var.f26594l);
                        } else {
                            if (i10 >= 10000 && (F = F(i10)) != null) {
                                return F.equals(this, h51Var);
                            }
                            return I(h51Var);
                        }
                    } else if (this.d == h51Var.d) {
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
