package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import j$.util.Objects;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ea1;
public final class x51 extends og.a {
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
    public View f30286c;
    public int d;
    public boolean e;
    public boolean f30287f;
    public boolean f30288g;
    public boolean h;
    public int f30289i;
    public boolean f30290j;
    public int f30291k;
    public CharSequence f30292l;
    public CharSequence f30293m;
    public CharSequence f30294n;
    public CharSequence f30295o;
    public String[] f30296p;
    public boolean f30297q;
    public boolean f30298r;
    public boolean f30299s;
    public boolean f30300t;
    public int f30301u;
    public int v;
    public boolean f30302w;
    public long f30303x;
    public int f30304y;
    public int f30305z;

    public x51(int i10) {
        super(i10, false);
        this.f30288g = true;
        this.f30301u = -1;
        this.I = true;
    }

    public static x51 A(int i10, CharSequence charSequence) {
        x51 x51Var = new x51(7);
        x51Var.d = i10;
        x51Var.f30292l = charSequence;
        return x51Var;
    }

    public static x51 B(CharSequence charSequence) {
        x51 x51Var = new x51(7);
        x51Var.f30292l = charSequence;
        return x51Var;
    }

    public static x51 C(int i10) {
        x51 x51Var = new x51(28);
        x51Var.f30305z = i10;
        return x51Var;
    }

    public static x51 D(int i10, int i11) {
        x51 x51Var = new x51(28);
        x51Var.d = i10;
        x51Var.f30305z = i11;
        return x51Var;
    }

    public static x51 E(int i10, String str) {
        x51 x51Var = new x51(39);
        x51Var.d = i10;
        x51Var.f30292l = str;
        x51Var.f30305z = 1;
        return x51Var;
    }

    public static w51 F(int i10) {
        LongSparseArray longSparseArray = K;
        if (longSparseArray == null) {
            return null;
        }
        return (w51) longSparseArray.get(i10);
    }

    public static x51 J(Class cls) {
        if (L == null) {
            L = new HashMap();
        }
        if (K == null) {
            K = new LongSparseArray();
        }
        w51 w51Var = (w51) L.get(cls);
        if (w51Var != null) {
            return new x51(w51Var.viewType);
        }
        throw new RuntimeException("UItemFactory was not setuped: " + cls);
    }

    public static x51 b(String str) {
        x51 x51Var = new x51(1);
        x51Var.f30292l = str;
        return x51Var;
    }

    public static x51 c(int i10, int i11, String str) {
        x51 x51Var = new x51(3);
        x51Var.d = i10;
        x51Var.f30291k = i11;
        x51Var.f30292l = str;
        return x51Var;
    }

    public static x51 d(int i10, int i11, String str, String str2) {
        x51 x51Var = new x51(3);
        x51Var.d = i10;
        x51Var.f30291k = i11;
        x51Var.f30292l = str;
        x51Var.f30294n = str2;
        return x51Var;
    }

    public static x51 e(int i10, String str) {
        x51 x51Var = new x51(3);
        x51Var.d = i10;
        x51Var.f30292l = str;
        return x51Var;
    }

    public static x51 f(String str, CharSequence charSequence, int i10) {
        x51 x51Var = new x51(3);
        x51Var.d = i10;
        x51Var.f30292l = str;
        x51Var.f30294n = charSequence;
        return x51Var;
    }

    public static x51 g(CharSequence charSequence) {
        x51 x51Var = new x51(7);
        x51Var.f30292l = charSequence;
        x51Var.f30297q = true;
        return x51Var;
    }

    public static x51 h(int i10, int i11, ea1 ea1Var) {
        x51 x51Var = new x51(i10 + 18);
        x51Var.f30305z = i11;
        x51Var.G = ea1Var;
        return x51Var;
    }

    public static x51 i(int i10, CharSequence charSequence) {
        x51 x51Var = new x51(4);
        x51Var.d = i10;
        x51Var.f30292l = charSequence;
        return x51Var;
    }

    public static x51 j(int i10, View view) {
        x51 x51Var = new x51(-1);
        x51Var.d = i10;
        x51Var.f30286c = view;
        x51Var.f30305z = -1;
        return x51Var;
    }

    public static x51 k(View view) {
        x51 x51Var = new x51(-1);
        x51Var.f30286c = view;
        x51Var.f30305z = -1;
        return x51Var;
    }

    public static x51 l(View view) {
        x51 x51Var = new x51(-4);
        x51Var.f30286c = view;
        x51Var.f30305z = -1;
        return x51Var;
    }

    public static x51 m(int i10, String str, String str2) {
        x51 x51Var = new x51(40);
        x51Var.d = i10;
        x51Var.f30292l = str;
        x51Var.f30295o = str2;
        return x51Var;
    }

    public static x51 n(int i10) {
        x51 x51Var = new x51(34);
        x51Var.f30305z = i10;
        return x51Var;
    }

    public static x51 o(int i10, int i11) {
        x51 x51Var = new x51(34);
        x51Var.d = i10;
        x51Var.f30305z = i11;
        return x51Var;
    }

    public static x51 p(View view, int i10, boolean z10) {
        x51 x51Var = new x51(-3);
        x51Var.f30286c = view;
        x51Var.f30305z = i10;
        x51Var.f30304y = z10 ? 1 : 0;
        return x51Var;
    }

    public static x51 q(String str) {
        x51 x51Var = new x51(31);
        x51Var.f30292l = str;
        return x51Var;
    }

    public static x51 r(String str, String str2, View.OnClickListener onClickListener) {
        x51 x51Var = new x51(31);
        x51Var.f30292l = str;
        x51Var.f30293m = str2;
        x51Var.D = onClickListener;
        return x51Var;
    }

    public static x51 s(int i10, String str) {
        x51 x51Var = new x51(0);
        x51Var.d = i10;
        x51Var.f30292l = str;
        return x51Var;
    }

    public static x51 t(String str) {
        x51 x51Var = new x51(0);
        x51Var.f30292l = str;
        return x51Var;
    }

    public static x51 u(org.telegram.ui.ge geVar) {
        x51 x51Var = new x51(24);
        x51Var.G = geVar;
        return x51Var;
    }

    public static x51 v(TLObject tLObject) {
        x51 x51Var = new x51(32);
        x51Var.G = tLObject;
        return x51Var;
    }

    public static x51 w(int i10, String str) {
        x51 x51Var = new x51(10);
        x51Var.d = i10;
        x51Var.f30292l = str;
        return x51Var;
    }

    public static x51 x(int i10, String str, String str2) {
        x51 x51Var = new x51(44);
        x51Var.d = i10;
        x51Var.f30292l = str;
        x51Var.f30294n = str2;
        return x51Var;
    }

    public static x51 y(int i10, CharSequence charSequence) {
        x51 x51Var = new x51(35);
        x51Var.d = i10;
        x51Var.f30292l = charSequence;
        return x51Var;
    }

    public static x51 z(String str, CharSequence charSequence, int i10) {
        x51 x51Var = new x51(41);
        x51Var.d = i10;
        x51Var.f30292l = charSequence;
        x51Var.f30295o = str;
        return x51Var;
    }

    public final boolean G(Class cls) {
        HashMap hashMap;
        w51 w51Var;
        if (this.f15715a >= 10000 && (hashMap = L) != null && (w51Var = (w51) hashMap.get(cls)) != null && w51Var.viewType == this.f15715a) {
            return true;
        }
        return false;
    }

    public final boolean H(org.telegram.ui.Components.x51 r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.x51.H(org.telegram.ui.Components.x51):boolean");
    }

    public final boolean I(x51 x51Var) {
        if (this.d == x51Var.d && this.f30289i == x51Var.f30289i && this.f30303x == x51Var.f30303x && this.f30291k == x51Var.f30291k && this.f30290j == x51Var.f30290j && this.f30299s == x51Var.f30299s && this.f30298r == x51Var.f30298r && this.f30300t == x51Var.f30300t && this.f30297q == x51Var.f30297q && this.f30286c == x51Var.f30286c && TextUtils.equals(this.f30292l, x51Var.f30292l) && TextUtils.equals(this.f30293m, x51Var.f30293m) && TextUtils.equals(this.f30294n, x51Var.f30294n) && this.f30286c == x51Var.f30286c && this.f30305z == x51Var.f30305z && Math.abs(this.A - x51Var.A) < 0.01f && this.B == x51Var.B && Objects.equals(this.G, x51Var.G) && Objects.equals(this.H, x51Var.H)) {
            return true;
        }
        return false;
    }

    public final void K(boolean z10) {
        this.e = z10;
        if (this.f15715a == 11) {
            this.f15715a = 12;
        }
    }

    @Override
    public final boolean a(og.a aVar) {
        w51 F;
        if (this != aVar) {
            if (x51.class == aVar.getClass()) {
                x51 x51Var = (x51) aVar;
                int i10 = this.f15715a;
                if (i10 == x51Var.f15715a) {
                    if (i10 == 31) {
                        if (TextUtils.equals(this.f30292l, x51Var.f30292l) && TextUtils.equals(this.f30293m, x51Var.f30293m)) {
                            return true;
                        }
                        return false;
                    } else if (i10 == 28) {
                        if (this.f30305z == x51Var.f30305z) {
                            return true;
                        }
                        return false;
                    } else if (i10 != 35 && i10 != 37) {
                        if (i10 >= 10000 && (F = F(i10)) != null) {
                            return F.contentsEquals(this, x51Var);
                        }
                        return H(x51Var);
                    } else if (this.d == x51Var.d && TextUtils.equals(this.f30292l, x51Var.f30292l) && this.e == x51Var.e) {
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
        w51 F;
        if (this != obj) {
            if (obj != null && x51.class == obj.getClass()) {
                x51 x51Var = (x51) obj;
                int i10 = this.f15715a;
                if (i10 == x51Var.f15715a) {
                    if (i10 != 36 && i10 != 35) {
                        if (i10 == 28) {
                            if (this.d == x51Var.d) {
                                return true;
                            }
                            return false;
                        } else if (i10 == 31) {
                            return TextUtils.equals(this.f30292l, x51Var.f30292l);
                        } else {
                            if (i10 >= 10000 && (F = F(i10)) != null) {
                                return F.equals(this, x51Var);
                            }
                            return I(x51Var);
                        }
                    } else if (this.d == x51Var.d) {
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
