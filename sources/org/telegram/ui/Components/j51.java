package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import j$.util.Objects;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.t91;
public final class j51 extends cg.b {
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
    public View f28007c;
    public int d;
    public boolean f28008e;
    public boolean f28009f;
    public boolean f28010g;
    public boolean h;
    public int f28011i;
    public boolean f28012j;
    public int f28013k;
    public CharSequence f28014l;
    public CharSequence f28015m;
    public CharSequence f28016n;
    public CharSequence f28017o;
    public String[] f28018p;
    public boolean f28019q;
    public boolean f28020r;
    public boolean f28021s;
    public boolean f28022t;
    public int f28023u;
    public int v;
    public boolean f28024w;
    public long f28025x;
    public int f28026y;
    public int f28027z;

    public j51(int i10) {
        super(i10, false);
        this.f28010g = true;
        this.f28023u = -1;
        this.I = true;
    }

    public static j51 A(int i10, CharSequence charSequence) {
        j51 j51Var = new j51(7);
        j51Var.d = i10;
        j51Var.f28014l = charSequence;
        return j51Var;
    }

    public static j51 B(CharSequence charSequence) {
        j51 j51Var = new j51(7);
        j51Var.f28014l = charSequence;
        return j51Var;
    }

    public static j51 C(int i10) {
        j51 j51Var = new j51(28);
        j51Var.f28027z = i10;
        return j51Var;
    }

    public static j51 D(int i10, int i11) {
        j51 j51Var = new j51(28);
        j51Var.d = i10;
        j51Var.f28027z = i11;
        return j51Var;
    }

    public static j51 E(int i10, String str) {
        j51 j51Var = new j51(39);
        j51Var.d = i10;
        j51Var.f28014l = str;
        j51Var.f28027z = 1;
        return j51Var;
    }

    public static i51 F(int i10) {
        LongSparseArray longSparseArray = K;
        if (longSparseArray == null) {
            return null;
        }
        return (i51) longSparseArray.get(i10);
    }

    public static j51 J(Class cls) {
        if (L == null) {
            L = new HashMap();
        }
        if (K == null) {
            K = new LongSparseArray();
        }
        i51 i51Var = (i51) L.get(cls);
        if (i51Var != null) {
            return new j51(i51Var.viewType);
        }
        throw new RuntimeException("UItemFactory was not setuped: " + cls);
    }

    public static j51 b(String str) {
        j51 j51Var = new j51(1);
        j51Var.f28014l = str;
        return j51Var;
    }

    public static j51 c(int i10, int i11, String str) {
        j51 j51Var = new j51(3);
        j51Var.d = i10;
        j51Var.f28013k = i11;
        j51Var.f28014l = str;
        return j51Var;
    }

    public static j51 d(int i10, int i11, String str, String str2) {
        j51 j51Var = new j51(3);
        j51Var.d = i10;
        j51Var.f28013k = i11;
        j51Var.f28014l = str;
        j51Var.f28016n = str2;
        return j51Var;
    }

    public static j51 e(int i10, String str) {
        j51 j51Var = new j51(3);
        j51Var.d = i10;
        j51Var.f28014l = str;
        return j51Var;
    }

    public static j51 f(String str, CharSequence charSequence, int i10) {
        j51 j51Var = new j51(3);
        j51Var.d = i10;
        j51Var.f28014l = str;
        j51Var.f28016n = charSequence;
        return j51Var;
    }

    public static j51 g(CharSequence charSequence) {
        j51 j51Var = new j51(7);
        j51Var.f28014l = charSequence;
        j51Var.f28019q = true;
        return j51Var;
    }

    public static j51 h(int i10, int i11, t91 t91Var) {
        j51 j51Var = new j51(i10 + 18);
        j51Var.f28027z = i11;
        j51Var.G = t91Var;
        return j51Var;
    }

    public static j51 i(int i10, CharSequence charSequence) {
        j51 j51Var = new j51(4);
        j51Var.d = i10;
        j51Var.f28014l = charSequence;
        return j51Var;
    }

    public static j51 j(int i10, View view) {
        j51 j51Var = new j51(-1);
        j51Var.d = i10;
        j51Var.f28007c = view;
        j51Var.f28027z = -1;
        return j51Var;
    }

    public static j51 k(View view) {
        j51 j51Var = new j51(-1);
        j51Var.f28007c = view;
        j51Var.f28027z = -1;
        return j51Var;
    }

    public static j51 l(View view) {
        j51 j51Var = new j51(-4);
        j51Var.f28007c = view;
        j51Var.f28027z = -1;
        return j51Var;
    }

    public static j51 m(int i10, String str, String str2) {
        j51 j51Var = new j51(40);
        j51Var.d = i10;
        j51Var.f28014l = str;
        j51Var.f28017o = str2;
        return j51Var;
    }

    public static j51 n(int i10) {
        j51 j51Var = new j51(34);
        j51Var.f28027z = i10;
        return j51Var;
    }

    public static j51 o(int i10, int i11) {
        j51 j51Var = new j51(34);
        j51Var.d = i10;
        j51Var.f28027z = i11;
        return j51Var;
    }

    public static j51 p(View view, int i10, boolean z4) {
        j51 j51Var = new j51(-3);
        j51Var.f28007c = view;
        j51Var.f28027z = i10;
        j51Var.f28026y = z4 ? 1 : 0;
        return j51Var;
    }

    public static j51 q(String str) {
        j51 j51Var = new j51(31);
        j51Var.f28014l = str;
        return j51Var;
    }

    public static j51 r(String str, String str2, View.OnClickListener onClickListener) {
        j51 j51Var = new j51(31);
        j51Var.f28014l = str;
        j51Var.f28015m = str2;
        j51Var.D = onClickListener;
        return j51Var;
    }

    public static j51 s(int i10, String str) {
        j51 j51Var = new j51(0);
        j51Var.d = i10;
        j51Var.f28014l = str;
        return j51Var;
    }

    public static j51 t(String str) {
        j51 j51Var = new j51(0);
        j51Var.f28014l = str;
        return j51Var;
    }

    public static j51 u(org.telegram.ui.he heVar) {
        j51 j51Var = new j51(24);
        j51Var.G = heVar;
        return j51Var;
    }

    public static j51 v(TLObject tLObject) {
        j51 j51Var = new j51(32);
        j51Var.G = tLObject;
        return j51Var;
    }

    public static j51 w(int i10, String str) {
        j51 j51Var = new j51(10);
        j51Var.d = i10;
        j51Var.f28014l = str;
        return j51Var;
    }

    public static j51 x(int i10, String str, String str2) {
        j51 j51Var = new j51(44);
        j51Var.d = i10;
        j51Var.f28014l = str;
        j51Var.f28016n = str2;
        return j51Var;
    }

    public static j51 y(int i10, CharSequence charSequence) {
        j51 j51Var = new j51(35);
        j51Var.d = i10;
        j51Var.f28014l = charSequence;
        return j51Var;
    }

    public static j51 z(String str, CharSequence charSequence, int i10) {
        j51 j51Var = new j51(41);
        j51Var.d = i10;
        j51Var.f28014l = charSequence;
        j51Var.f28017o = str;
        return j51Var;
    }

    public final boolean G(Class cls) {
        HashMap hashMap;
        i51 i51Var;
        if (this.f2505a >= 10000 && (hashMap = L) != null && (i51Var = (i51) hashMap.get(cls)) != null && i51Var.viewType == this.f2505a) {
            return true;
        }
        return false;
    }

    public final boolean H(org.telegram.ui.Components.j51 r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.j51.H(org.telegram.ui.Components.j51):boolean");
    }

    public final boolean I(j51 j51Var) {
        if (this.d == j51Var.d && this.f28011i == j51Var.f28011i && this.f28025x == j51Var.f28025x && this.f28013k == j51Var.f28013k && this.f28012j == j51Var.f28012j && this.f28021s == j51Var.f28021s && this.f28020r == j51Var.f28020r && this.f28022t == j51Var.f28022t && this.f28019q == j51Var.f28019q && this.f28007c == j51Var.f28007c && TextUtils.equals(this.f28014l, j51Var.f28014l) && TextUtils.equals(this.f28015m, j51Var.f28015m) && TextUtils.equals(this.f28016n, j51Var.f28016n) && this.f28007c == j51Var.f28007c && this.f28027z == j51Var.f28027z && Math.abs(this.A - j51Var.A) < 0.01f && this.B == j51Var.B && Objects.equals(this.G, j51Var.G) && Objects.equals(this.H, j51Var.H)) {
            return true;
        }
        return false;
    }

    public final void K(boolean z4) {
        this.f28008e = z4;
        if (this.f2505a == 11) {
            this.f2505a = 12;
        }
    }

    @Override
    public final boolean a(cg.b bVar) {
        i51 F;
        if (this != bVar) {
            if (j51.class == bVar.getClass()) {
                j51 j51Var = (j51) bVar;
                int i10 = this.f2505a;
                if (i10 == j51Var.f2505a) {
                    if (i10 == 31) {
                        if (TextUtils.equals(this.f28014l, j51Var.f28014l) && TextUtils.equals(this.f28015m, j51Var.f28015m)) {
                            return true;
                        }
                        return false;
                    } else if (i10 == 28) {
                        if (this.f28027z == j51Var.f28027z) {
                            return true;
                        }
                        return false;
                    } else if (i10 != 35 && i10 != 37) {
                        if (i10 >= 10000 && (F = F(i10)) != null) {
                            return F.contentsEquals(this, j51Var);
                        }
                        return H(j51Var);
                    } else if (this.d == j51Var.d && TextUtils.equals(this.f28014l, j51Var.f28014l) && this.f28008e == j51Var.f28008e) {
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
        i51 F;
        if (this != obj) {
            if (obj != null && j51.class == obj.getClass()) {
                j51 j51Var = (j51) obj;
                int i10 = this.f2505a;
                if (i10 == j51Var.f2505a) {
                    if (i10 != 36 && i10 != 35) {
                        if (i10 == 28) {
                            if (this.d == j51Var.d) {
                                return true;
                            }
                            return false;
                        } else if (i10 == 31) {
                            return TextUtils.equals(this.f28014l, j51Var.f28014l);
                        } else {
                            if (i10 >= 10000 && (F = F(i10)) != null) {
                                return F.equals(this, j51Var);
                            }
                            return I(j51Var);
                        }
                    } else if (this.d == j51Var.d) {
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
