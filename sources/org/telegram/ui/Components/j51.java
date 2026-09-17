package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import j$.util.Objects;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ma1;
public final class j51 extends og.a {
    public static int J = 10000;
    public static LongSparseArray K;
    public static HashMap L;
    public float A;
    public long B;
    public Utilities.Callback C;
    public View.OnClickListener D;
    public View.OnClickListener E;
    public org.telegram.ui.s3 F;
    public Object G;
    public Object H;
    public boolean I;
    public View f25118c;
    public int d;
    public boolean e;
    public boolean f25119f;
    public boolean f25120g;
    public boolean h;
    public int f25121i;
    public boolean f25122j;
    public int f25123k;
    public CharSequence f25124l;
    public CharSequence f25125m;
    public CharSequence f25126n;
    public CharSequence f25127o;
    public String[] f25128p;
    public boolean f25129q;
    public boolean f25130r;
    public boolean f25131s;
    public boolean f25132t;
    public int f25133u;
    public int v;
    public boolean f25134w;
    public long f25135x;
    public int f25136y;
    public int f25137z;

    public j51(int i10) {
        super(i10, false);
        this.f25120g = true;
        this.f25133u = -1;
        this.I = true;
    }

    public static j51 A(int i10, CharSequence charSequence) {
        j51 j51Var = new j51(7);
        j51Var.d = i10;
        j51Var.f25124l = charSequence;
        return j51Var;
    }

    public static j51 B(CharSequence charSequence) {
        j51 j51Var = new j51(7);
        j51Var.f25124l = charSequence;
        return j51Var;
    }

    public static j51 C(int i10) {
        j51 j51Var = new j51(28);
        j51Var.f25137z = i10;
        return j51Var;
    }

    public static j51 D(int i10, int i11) {
        j51 j51Var = new j51(28);
        j51Var.d = i10;
        j51Var.f25137z = i11;
        return j51Var;
    }

    public static j51 E(int i10, String str) {
        j51 j51Var = new j51(39);
        j51Var.d = i10;
        j51Var.f25124l = str;
        j51Var.f25137z = 1;
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
        j51Var.f25124l = str;
        return j51Var;
    }

    public static j51 c(int i10, int i11, String str) {
        j51 j51Var = new j51(3);
        j51Var.d = i10;
        j51Var.f25123k = i11;
        j51Var.f25124l = str;
        return j51Var;
    }

    public static j51 d(int i10, int i11, String str, String str2) {
        j51 j51Var = new j51(3);
        j51Var.d = i10;
        j51Var.f25123k = i11;
        j51Var.f25124l = str;
        j51Var.f25126n = str2;
        return j51Var;
    }

    public static j51 e(int i10, String str) {
        j51 j51Var = new j51(3);
        j51Var.d = i10;
        j51Var.f25124l = str;
        return j51Var;
    }

    public static j51 f(String str, CharSequence charSequence, int i10) {
        j51 j51Var = new j51(3);
        j51Var.d = i10;
        j51Var.f25124l = str;
        j51Var.f25126n = charSequence;
        return j51Var;
    }

    public static j51 g(CharSequence charSequence) {
        j51 j51Var = new j51(7);
        j51Var.f25124l = charSequence;
        j51Var.f25129q = true;
        return j51Var;
    }

    public static j51 h(int i10, int i11, ma1 ma1Var) {
        j51 j51Var = new j51(i10 + 18);
        j51Var.f25137z = i11;
        j51Var.G = ma1Var;
        return j51Var;
    }

    public static j51 i(int i10, CharSequence charSequence) {
        j51 j51Var = new j51(4);
        j51Var.d = i10;
        j51Var.f25124l = charSequence;
        return j51Var;
    }

    public static j51 j(int i10, View view) {
        j51 j51Var = new j51(-1);
        j51Var.d = i10;
        j51Var.f25118c = view;
        j51Var.f25137z = -1;
        return j51Var;
    }

    public static j51 k(View view) {
        j51 j51Var = new j51(-1);
        j51Var.f25118c = view;
        j51Var.f25137z = -1;
        return j51Var;
    }

    public static j51 l(View view) {
        j51 j51Var = new j51(-4);
        j51Var.f25118c = view;
        j51Var.f25137z = -1;
        return j51Var;
    }

    public static j51 m(int i10, String str, String str2) {
        j51 j51Var = new j51(40);
        j51Var.d = i10;
        j51Var.f25124l = str;
        j51Var.f25127o = str2;
        return j51Var;
    }

    public static j51 n(int i10) {
        j51 j51Var = new j51(34);
        j51Var.f25137z = i10;
        return j51Var;
    }

    public static j51 o(int i10, int i11) {
        j51 j51Var = new j51(34);
        j51Var.d = i10;
        j51Var.f25137z = i11;
        return j51Var;
    }

    public static j51 p(View view, int i10, boolean z10) {
        j51 j51Var = new j51(-3);
        j51Var.f25118c = view;
        j51Var.f25137z = i10;
        j51Var.f25136y = z10 ? 1 : 0;
        return j51Var;
    }

    public static j51 q(String str) {
        j51 j51Var = new j51(31);
        j51Var.f25124l = str;
        return j51Var;
    }

    public static j51 r(String str, String str2, View.OnClickListener onClickListener) {
        j51 j51Var = new j51(31);
        j51Var.f25124l = str;
        j51Var.f25125m = str2;
        j51Var.D = onClickListener;
        return j51Var;
    }

    public static j51 s(int i10, String str) {
        j51 j51Var = new j51(0);
        j51Var.d = i10;
        j51Var.f25124l = str;
        return j51Var;
    }

    public static j51 t(String str) {
        j51 j51Var = new j51(0);
        j51Var.f25124l = str;
        return j51Var;
    }

    public static j51 u(org.telegram.ui.ie ieVar) {
        j51 j51Var = new j51(24);
        j51Var.G = ieVar;
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
        j51Var.f25124l = str;
        return j51Var;
    }

    public static j51 x(int i10, String str, String str2) {
        j51 j51Var = new j51(44);
        j51Var.d = i10;
        j51Var.f25124l = str;
        j51Var.f25126n = str2;
        return j51Var;
    }

    public static j51 y(int i10, CharSequence charSequence) {
        j51 j51Var = new j51(35);
        j51Var.d = i10;
        j51Var.f25124l = charSequence;
        return j51Var;
    }

    public static j51 z(String str, CharSequence charSequence, int i10) {
        j51 j51Var = new j51(41);
        j51Var.d = i10;
        j51Var.f25124l = charSequence;
        j51Var.f25127o = str;
        return j51Var;
    }

    public final boolean G(Class cls) {
        HashMap hashMap;
        i51 i51Var;
        if (this.f15543a >= 10000 && (hashMap = L) != null && (i51Var = (i51) hashMap.get(cls)) != null && i51Var.viewType == this.f15543a) {
            return true;
        }
        return false;
    }

    public final boolean H(org.telegram.ui.Components.j51 r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.j51.H(org.telegram.ui.Components.j51):boolean");
    }

    public final boolean I(j51 j51Var) {
        if (this.d == j51Var.d && this.f25121i == j51Var.f25121i && this.f25135x == j51Var.f25135x && this.f25123k == j51Var.f25123k && this.f25122j == j51Var.f25122j && this.f25131s == j51Var.f25131s && this.f25130r == j51Var.f25130r && this.f25132t == j51Var.f25132t && this.f25129q == j51Var.f25129q && this.f25118c == j51Var.f25118c && TextUtils.equals(this.f25124l, j51Var.f25124l) && TextUtils.equals(this.f25125m, j51Var.f25125m) && TextUtils.equals(this.f25126n, j51Var.f25126n) && this.f25118c == j51Var.f25118c && this.f25137z == j51Var.f25137z && Math.abs(this.A - j51Var.A) < 0.01f && this.B == j51Var.B && Objects.equals(this.G, j51Var.G) && Objects.equals(this.H, j51Var.H)) {
            return true;
        }
        return false;
    }

    public final void K(boolean z10) {
        this.e = z10;
        if (this.f15543a == 11) {
            this.f15543a = 12;
        }
    }

    @Override
    public final boolean a(og.a aVar) {
        i51 F;
        if (this != aVar) {
            if (j51.class == aVar.getClass()) {
                j51 j51Var = (j51) aVar;
                int i10 = this.f15543a;
                if (i10 == j51Var.f15543a) {
                    if (i10 == 31) {
                        if (TextUtils.equals(this.f25124l, j51Var.f25124l) && TextUtils.equals(this.f25125m, j51Var.f25125m)) {
                            return true;
                        }
                        return false;
                    } else if (i10 == 28) {
                        if (this.f25137z == j51Var.f25137z) {
                            return true;
                        }
                        return false;
                    } else if (i10 != 35 && i10 != 37) {
                        if (i10 >= 10000 && (F = F(i10)) != null) {
                            return F.contentsEquals(this, j51Var);
                        }
                        return H(j51Var);
                    } else if (this.d == j51Var.d && TextUtils.equals(this.f25124l, j51Var.f25124l) && this.e == j51Var.e) {
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
                int i10 = this.f15543a;
                if (i10 == j51Var.f15543a) {
                    if (i10 != 36 && i10 != 35) {
                        if (i10 == 28) {
                            if (this.d == j51Var.d) {
                                return true;
                            }
                            return false;
                        } else if (i10 == 31) {
                            return TextUtils.equals(this.f25124l, j51Var.f25124l);
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
