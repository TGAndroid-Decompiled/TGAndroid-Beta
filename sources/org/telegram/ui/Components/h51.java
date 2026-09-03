package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import j$.util.Objects;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.z91;
public final class h51 extends cg.b {
    public static int J = 10000;
    public static LongSparseArray K;
    public static HashMap L;
    public float A;
    public long B;
    public Utilities.Callback C;
    public View.OnClickListener D;
    public View.OnClickListener E;
    public org.telegram.ui.w3 F;
    public Object G;
    public Object H;
    public boolean I;
    public View f27368c;
    public int d;
    public boolean f27369e;
    public boolean f27370f;
    public boolean f27371g;
    public boolean h;
    public int f27372i;
    public boolean f27373j;
    public int f27374k;
    public CharSequence f27375l;
    public CharSequence f27376m;
    public CharSequence f27377n;
    public CharSequence f27378o;
    public String[] f27379p;
    public boolean f27380q;
    public boolean f27381r;
    public boolean f27382s;
    public boolean f27383t;
    public int f27384u;
    public int v;
    public boolean f27385w;
    public long f27386x;
    public int f27387y;
    public int f27388z;

    public h51(int i10) {
        super(i10, false);
        this.f27371g = true;
        this.f27384u = -1;
        this.I = true;
    }

    public static h51 A(int i10, CharSequence charSequence) {
        h51 h51Var = new h51(7);
        h51Var.d = i10;
        h51Var.f27375l = charSequence;
        return h51Var;
    }

    public static h51 B(CharSequence charSequence) {
        h51 h51Var = new h51(7);
        h51Var.f27375l = charSequence;
        return h51Var;
    }

    public static h51 C(int i10) {
        h51 h51Var = new h51(28);
        h51Var.f27388z = i10;
        return h51Var;
    }

    public static h51 D(int i10, int i11) {
        h51 h51Var = new h51(28);
        h51Var.d = i10;
        h51Var.f27388z = i11;
        return h51Var;
    }

    public static h51 E(int i10, String str) {
        h51 h51Var = new h51(39);
        h51Var.d = i10;
        h51Var.f27375l = str;
        h51Var.f27388z = 1;
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
        h51Var.f27375l = str;
        return h51Var;
    }

    public static h51 c(int i10, int i11, String str) {
        h51 h51Var = new h51(3);
        h51Var.d = i10;
        h51Var.f27374k = i11;
        h51Var.f27375l = str;
        return h51Var;
    }

    public static h51 d(int i10, int i11, String str, String str2) {
        h51 h51Var = new h51(3);
        h51Var.d = i10;
        h51Var.f27374k = i11;
        h51Var.f27375l = str;
        h51Var.f27377n = str2;
        return h51Var;
    }

    public static h51 e(int i10, String str) {
        h51 h51Var = new h51(3);
        h51Var.d = i10;
        h51Var.f27375l = str;
        return h51Var;
    }

    public static h51 f(String str, CharSequence charSequence, int i10) {
        h51 h51Var = new h51(3);
        h51Var.d = i10;
        h51Var.f27375l = str;
        h51Var.f27377n = charSequence;
        return h51Var;
    }

    public static h51 g(CharSequence charSequence) {
        h51 h51Var = new h51(7);
        h51Var.f27375l = charSequence;
        h51Var.f27380q = true;
        return h51Var;
    }

    public static h51 h(int i10, int i11, z91 z91Var) {
        h51 h51Var = new h51(i10 + 18);
        h51Var.f27388z = i11;
        h51Var.G = z91Var;
        return h51Var;
    }

    public static h51 i(int i10, CharSequence charSequence) {
        h51 h51Var = new h51(4);
        h51Var.d = i10;
        h51Var.f27375l = charSequence;
        return h51Var;
    }

    public static h51 j(int i10, View view) {
        h51 h51Var = new h51(-1);
        h51Var.d = i10;
        h51Var.f27368c = view;
        h51Var.f27388z = -1;
        return h51Var;
    }

    public static h51 k(View view) {
        h51 h51Var = new h51(-1);
        h51Var.f27368c = view;
        h51Var.f27388z = -1;
        return h51Var;
    }

    public static h51 l(View view) {
        h51 h51Var = new h51(-4);
        h51Var.f27368c = view;
        h51Var.f27388z = -1;
        return h51Var;
    }

    public static h51 m(int i10, String str, String str2) {
        h51 h51Var = new h51(40);
        h51Var.d = i10;
        h51Var.f27375l = str;
        h51Var.f27378o = str2;
        return h51Var;
    }

    public static h51 n(int i10) {
        h51 h51Var = new h51(34);
        h51Var.f27388z = i10;
        return h51Var;
    }

    public static h51 o(int i10, int i11) {
        h51 h51Var = new h51(34);
        h51Var.d = i10;
        h51Var.f27388z = i11;
        return h51Var;
    }

    public static h51 p(View view, int i10, boolean z4) {
        h51 h51Var = new h51(-3);
        h51Var.f27368c = view;
        h51Var.f27388z = i10;
        h51Var.f27387y = z4 ? 1 : 0;
        return h51Var;
    }

    public static h51 q(String str) {
        h51 h51Var = new h51(31);
        h51Var.f27375l = str;
        return h51Var;
    }

    public static h51 r(String str, String str2, View.OnClickListener onClickListener) {
        h51 h51Var = new h51(31);
        h51Var.f27375l = str;
        h51Var.f27376m = str2;
        h51Var.D = onClickListener;
        return h51Var;
    }

    public static h51 s(int i10, String str) {
        h51 h51Var = new h51(0);
        h51Var.d = i10;
        h51Var.f27375l = str;
        return h51Var;
    }

    public static h51 t(String str) {
        h51 h51Var = new h51(0);
        h51Var.f27375l = str;
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
        h51Var.f27375l = str;
        return h51Var;
    }

    public static h51 x(int i10, String str, String str2) {
        h51 h51Var = new h51(44);
        h51Var.d = i10;
        h51Var.f27375l = str;
        h51Var.f27377n = str2;
        return h51Var;
    }

    public static h51 y(int i10, CharSequence charSequence) {
        h51 h51Var = new h51(35);
        h51Var.d = i10;
        h51Var.f27375l = charSequence;
        return h51Var;
    }

    public static h51 z(String str, CharSequence charSequence, int i10) {
        h51 h51Var = new h51(41);
        h51Var.d = i10;
        h51Var.f27375l = charSequence;
        h51Var.f27378o = str;
        return h51Var;
    }

    public final boolean G(Class cls) {
        HashMap hashMap;
        g51 g51Var;
        if (this.f2505a >= 10000 && (hashMap = L) != null && (g51Var = (g51) hashMap.get(cls)) != null && g51Var.viewType == this.f2505a) {
            return true;
        }
        return false;
    }

    public final boolean H(org.telegram.ui.Components.h51 r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.h51.H(org.telegram.ui.Components.h51):boolean");
    }

    public final boolean I(h51 h51Var) {
        if (this.d == h51Var.d && this.f27372i == h51Var.f27372i && this.f27386x == h51Var.f27386x && this.f27374k == h51Var.f27374k && this.f27373j == h51Var.f27373j && this.f27382s == h51Var.f27382s && this.f27381r == h51Var.f27381r && this.f27383t == h51Var.f27383t && this.f27380q == h51Var.f27380q && this.f27368c == h51Var.f27368c && TextUtils.equals(this.f27375l, h51Var.f27375l) && TextUtils.equals(this.f27376m, h51Var.f27376m) && TextUtils.equals(this.f27377n, h51Var.f27377n) && this.f27368c == h51Var.f27368c && this.f27388z == h51Var.f27388z && Math.abs(this.A - h51Var.A) < 0.01f && this.B == h51Var.B && Objects.equals(this.G, h51Var.G) && Objects.equals(this.H, h51Var.H)) {
            return true;
        }
        return false;
    }

    public final void K(boolean z4) {
        this.f27369e = z4;
        if (this.f2505a == 11) {
            this.f2505a = 12;
        }
    }

    @Override
    public final boolean a(cg.b bVar) {
        g51 F;
        if (this != bVar) {
            if (h51.class == bVar.getClass()) {
                h51 h51Var = (h51) bVar;
                int i10 = this.f2505a;
                if (i10 == h51Var.f2505a) {
                    if (i10 == 31) {
                        if (TextUtils.equals(this.f27375l, h51Var.f27375l) && TextUtils.equals(this.f27376m, h51Var.f27376m)) {
                            return true;
                        }
                        return false;
                    } else if (i10 == 28) {
                        if (this.f27388z == h51Var.f27388z) {
                            return true;
                        }
                        return false;
                    } else if (i10 != 35 && i10 != 37) {
                        if (i10 >= 10000 && (F = F(i10)) != null) {
                            return F.contentsEquals(this, h51Var);
                        }
                        return H(h51Var);
                    } else if (this.d == h51Var.d && TextUtils.equals(this.f27375l, h51Var.f27375l) && this.f27369e == h51Var.f27369e) {
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
                int i10 = this.f2505a;
                if (i10 == h51Var.f2505a) {
                    if (i10 != 36 && i10 != 35) {
                        if (i10 == 28) {
                            if (this.d == h51Var.d) {
                                return true;
                            }
                            return false;
                        } else if (i10 == 31) {
                            return TextUtils.equals(this.f27375l, h51Var.f27375l);
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
