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
    public View f30272c;
    public int d;
    public boolean e;
    public boolean f30273f;
    public boolean f30274g;
    public boolean h;
    public int f30275i;
    public boolean f30276j;
    public int f30277k;
    public CharSequence f30278l;
    public CharSequence f30279m;
    public CharSequence f30280n;
    public CharSequence f30281o;
    public String[] f30282p;
    public boolean f30283q;
    public boolean f30284r;
    public boolean f30285s;
    public boolean f30286t;
    public int f30287u;
    public int v;
    public boolean f30288w;
    public long f30289x;
    public int f30290y;
    public int f30291z;

    public x51(int i10) {
        super(i10, false);
        this.f30274g = true;
        this.f30287u = -1;
        this.I = true;
    }

    public static x51 A(int i10, CharSequence charSequence) {
        x51 x51Var = new x51(7);
        x51Var.d = i10;
        x51Var.f30278l = charSequence;
        return x51Var;
    }

    public static x51 B(CharSequence charSequence) {
        x51 x51Var = new x51(7);
        x51Var.f30278l = charSequence;
        return x51Var;
    }

    public static x51 C(int i10) {
        x51 x51Var = new x51(28);
        x51Var.f30291z = i10;
        return x51Var;
    }

    public static x51 D(int i10, int i11) {
        x51 x51Var = new x51(28);
        x51Var.d = i10;
        x51Var.f30291z = i11;
        return x51Var;
    }

    public static x51 E(int i10, String str) {
        x51 x51Var = new x51(39);
        x51Var.d = i10;
        x51Var.f30278l = str;
        x51Var.f30291z = 1;
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
        x51Var.f30278l = str;
        return x51Var;
    }

    public static x51 c(int i10, int i11, String str) {
        x51 x51Var = new x51(3);
        x51Var.d = i10;
        x51Var.f30277k = i11;
        x51Var.f30278l = str;
        return x51Var;
    }

    public static x51 d(int i10, int i11, String str, String str2) {
        x51 x51Var = new x51(3);
        x51Var.d = i10;
        x51Var.f30277k = i11;
        x51Var.f30278l = str;
        x51Var.f30280n = str2;
        return x51Var;
    }

    public static x51 e(int i10, String str) {
        x51 x51Var = new x51(3);
        x51Var.d = i10;
        x51Var.f30278l = str;
        return x51Var;
    }

    public static x51 f(String str, CharSequence charSequence, int i10) {
        x51 x51Var = new x51(3);
        x51Var.d = i10;
        x51Var.f30278l = str;
        x51Var.f30280n = charSequence;
        return x51Var;
    }

    public static x51 g(CharSequence charSequence) {
        x51 x51Var = new x51(7);
        x51Var.f30278l = charSequence;
        x51Var.f30283q = true;
        return x51Var;
    }

    public static x51 h(int i10, int i11, ea1 ea1Var) {
        x51 x51Var = new x51(i10 + 18);
        x51Var.f30291z = i11;
        x51Var.G = ea1Var;
        return x51Var;
    }

    public static x51 i(int i10, CharSequence charSequence) {
        x51 x51Var = new x51(4);
        x51Var.d = i10;
        x51Var.f30278l = charSequence;
        return x51Var;
    }

    public static x51 j(int i10, View view) {
        x51 x51Var = new x51(-1);
        x51Var.d = i10;
        x51Var.f30272c = view;
        x51Var.f30291z = -1;
        return x51Var;
    }

    public static x51 k(View view) {
        x51 x51Var = new x51(-1);
        x51Var.f30272c = view;
        x51Var.f30291z = -1;
        return x51Var;
    }

    public static x51 l(View view) {
        x51 x51Var = new x51(-4);
        x51Var.f30272c = view;
        x51Var.f30291z = -1;
        return x51Var;
    }

    public static x51 m(int i10, String str, String str2) {
        x51 x51Var = new x51(40);
        x51Var.d = i10;
        x51Var.f30278l = str;
        x51Var.f30281o = str2;
        return x51Var;
    }

    public static x51 n(int i10) {
        x51 x51Var = new x51(34);
        x51Var.f30291z = i10;
        return x51Var;
    }

    public static x51 o(int i10, int i11) {
        x51 x51Var = new x51(34);
        x51Var.d = i10;
        x51Var.f30291z = i11;
        return x51Var;
    }

    public static x51 p(View view, int i10, boolean z10) {
        x51 x51Var = new x51(-3);
        x51Var.f30272c = view;
        x51Var.f30291z = i10;
        x51Var.f30290y = z10 ? 1 : 0;
        return x51Var;
    }

    public static x51 q(String str) {
        x51 x51Var = new x51(31);
        x51Var.f30278l = str;
        return x51Var;
    }

    public static x51 r(String str, String str2, View.OnClickListener onClickListener) {
        x51 x51Var = new x51(31);
        x51Var.f30278l = str;
        x51Var.f30279m = str2;
        x51Var.D = onClickListener;
        return x51Var;
    }

    public static x51 s(int i10, String str) {
        x51 x51Var = new x51(0);
        x51Var.d = i10;
        x51Var.f30278l = str;
        return x51Var;
    }

    public static x51 t(String str) {
        x51 x51Var = new x51(0);
        x51Var.f30278l = str;
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
        x51Var.f30278l = str;
        return x51Var;
    }

    public static x51 x(int i10, String str, String str2) {
        x51 x51Var = new x51(44);
        x51Var.d = i10;
        x51Var.f30278l = str;
        x51Var.f30280n = str2;
        return x51Var;
    }

    public static x51 y(int i10, CharSequence charSequence) {
        x51 x51Var = new x51(35);
        x51Var.d = i10;
        x51Var.f30278l = charSequence;
        return x51Var;
    }

    public static x51 z(String str, CharSequence charSequence, int i10) {
        x51 x51Var = new x51(41);
        x51Var.d = i10;
        x51Var.f30278l = charSequence;
        x51Var.f30281o = str;
        return x51Var;
    }

    public final boolean G(Class cls) {
        HashMap hashMap;
        w51 w51Var;
        if (this.f15716a >= 10000 && (hashMap = L) != null && (w51Var = (w51) hashMap.get(cls)) != null && w51Var.viewType == this.f15716a) {
            return true;
        }
        return false;
    }

    public final boolean H(org.telegram.ui.Components.x51 r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.x51.H(org.telegram.ui.Components.x51):boolean");
    }

    public final boolean I(x51 x51Var) {
        if (this.d == x51Var.d && this.f30275i == x51Var.f30275i && this.f30289x == x51Var.f30289x && this.f30277k == x51Var.f30277k && this.f30276j == x51Var.f30276j && this.f30285s == x51Var.f30285s && this.f30284r == x51Var.f30284r && this.f30286t == x51Var.f30286t && this.f30283q == x51Var.f30283q && this.f30272c == x51Var.f30272c && TextUtils.equals(this.f30278l, x51Var.f30278l) && TextUtils.equals(this.f30279m, x51Var.f30279m) && TextUtils.equals(this.f30280n, x51Var.f30280n) && this.f30272c == x51Var.f30272c && this.f30291z == x51Var.f30291z && Math.abs(this.A - x51Var.A) < 0.01f && this.B == x51Var.B && Objects.equals(this.G, x51Var.G) && Objects.equals(this.H, x51Var.H)) {
            return true;
        }
        return false;
    }

    public final void K(boolean z10) {
        this.e = z10;
        if (this.f15716a == 11) {
            this.f15716a = 12;
        }
    }

    @Override
    public final boolean a(og.a aVar) {
        w51 F;
        if (this != aVar) {
            if (x51.class == aVar.getClass()) {
                x51 x51Var = (x51) aVar;
                int i10 = this.f15716a;
                if (i10 == x51Var.f15716a) {
                    if (i10 == 31) {
                        if (TextUtils.equals(this.f30278l, x51Var.f30278l) && TextUtils.equals(this.f30279m, x51Var.f30279m)) {
                            return true;
                        }
                        return false;
                    } else if (i10 == 28) {
                        if (this.f30291z == x51Var.f30291z) {
                            return true;
                        }
                        return false;
                    } else if (i10 != 35 && i10 != 37) {
                        if (i10 >= 10000 && (F = F(i10)) != null) {
                            return F.contentsEquals(this, x51Var);
                        }
                        return H(x51Var);
                    } else if (this.d == x51Var.d && TextUtils.equals(this.f30278l, x51Var.f30278l) && this.e == x51Var.e) {
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
                int i10 = this.f15716a;
                if (i10 == x51Var.f15716a) {
                    if (i10 != 36 && i10 != 35) {
                        if (i10 == 28) {
                            if (this.d == x51Var.d) {
                                return true;
                            }
                            return false;
                        } else if (i10 == 31) {
                            return TextUtils.equals(this.f30278l, x51Var.f30278l);
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
