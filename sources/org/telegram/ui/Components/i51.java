package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import j$.util.Objects;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.aa1;
public final class i51 extends bg.b {
    public static int J = 10000;
    public static LongSparseArray K;
    public static HashMap L;
    public float A;
    public long B;
    public Utilities.Callback C;
    public View.OnClickListener D;
    public View.OnClickListener E;
    public org.telegram.ui.y3 F;
    public Object G;
    public Object H;
    public boolean I;
    public View f25579c;
    public int d;
    public boolean e;
    public boolean f25580f;
    public boolean f25581g;
    public boolean h;
    public int f25582i;
    public boolean f25583j;
    public int f25584k;
    public CharSequence f25585l;
    public CharSequence f25586m;
    public CharSequence f25587n;
    public CharSequence f25588o;
    public String[] f25589p;
    public boolean f25590q;
    public boolean f25591r;
    public boolean f25592s;
    public boolean f25593t;
    public int f25594u;
    public int v;
    public boolean f25595w;
    public long f25596x;
    public int f25597y;
    public int f25598z;

    public i51(int i10) {
        super(i10, false);
        this.f25581g = true;
        this.f25594u = -1;
        this.I = true;
    }

    public static i51 A(int i10, CharSequence charSequence) {
        i51 i51Var = new i51(7);
        i51Var.d = i10;
        i51Var.f25585l = charSequence;
        return i51Var;
    }

    public static i51 B(CharSequence charSequence) {
        i51 i51Var = new i51(7);
        i51Var.f25585l = charSequence;
        return i51Var;
    }

    public static i51 C(int i10) {
        i51 i51Var = new i51(28);
        i51Var.f25598z = i10;
        return i51Var;
    }

    public static i51 D(int i10, int i11) {
        i51 i51Var = new i51(28);
        i51Var.d = i10;
        i51Var.f25598z = i11;
        return i51Var;
    }

    public static i51 E(int i10, String str) {
        i51 i51Var = new i51(39);
        i51Var.d = i10;
        i51Var.f25585l = str;
        i51Var.f25598z = 1;
        return i51Var;
    }

    public static h51 F(int i10) {
        LongSparseArray longSparseArray = K;
        if (longSparseArray == null) {
            return null;
        }
        return (h51) longSparseArray.get(i10);
    }

    public static i51 J(Class cls) {
        if (L == null) {
            L = new HashMap();
        }
        if (K == null) {
            K = new LongSparseArray();
        }
        h51 h51Var = (h51) L.get(cls);
        if (h51Var != null) {
            return new i51(h51Var.viewType);
        }
        throw new RuntimeException("UItemFactory was not setuped: " + cls);
    }

    public static i51 b(String str) {
        i51 i51Var = new i51(1);
        i51Var.f25585l = str;
        return i51Var;
    }

    public static i51 c(int i10, int i11, String str) {
        i51 i51Var = new i51(3);
        i51Var.d = i10;
        i51Var.f25584k = i11;
        i51Var.f25585l = str;
        return i51Var;
    }

    public static i51 d(int i10, int i11, String str, String str2) {
        i51 i51Var = new i51(3);
        i51Var.d = i10;
        i51Var.f25584k = i11;
        i51Var.f25585l = str;
        i51Var.f25587n = str2;
        return i51Var;
    }

    public static i51 e(int i10, String str) {
        i51 i51Var = new i51(3);
        i51Var.d = i10;
        i51Var.f25585l = str;
        return i51Var;
    }

    public static i51 f(String str, CharSequence charSequence, int i10) {
        i51 i51Var = new i51(3);
        i51Var.d = i10;
        i51Var.f25585l = str;
        i51Var.f25587n = charSequence;
        return i51Var;
    }

    public static i51 g(CharSequence charSequence) {
        i51 i51Var = new i51(7);
        i51Var.f25585l = charSequence;
        i51Var.f25590q = true;
        return i51Var;
    }

    public static i51 h(int i10, int i11, aa1 aa1Var) {
        i51 i51Var = new i51(i10 + 18);
        i51Var.f25598z = i11;
        i51Var.G = aa1Var;
        return i51Var;
    }

    public static i51 i(int i10, CharSequence charSequence) {
        i51 i51Var = new i51(4);
        i51Var.d = i10;
        i51Var.f25585l = charSequence;
        return i51Var;
    }

    public static i51 j(int i10, View view) {
        i51 i51Var = new i51(-1);
        i51Var.d = i10;
        i51Var.f25579c = view;
        i51Var.f25598z = -1;
        return i51Var;
    }

    public static i51 k(View view) {
        i51 i51Var = new i51(-1);
        i51Var.f25579c = view;
        i51Var.f25598z = -1;
        return i51Var;
    }

    public static i51 l(View view) {
        i51 i51Var = new i51(-4);
        i51Var.f25579c = view;
        i51Var.f25598z = -1;
        return i51Var;
    }

    public static i51 m(int i10, String str, String str2) {
        i51 i51Var = new i51(40);
        i51Var.d = i10;
        i51Var.f25585l = str;
        i51Var.f25588o = str2;
        return i51Var;
    }

    public static i51 n(int i10) {
        i51 i51Var = new i51(34);
        i51Var.f25598z = i10;
        return i51Var;
    }

    public static i51 o(int i10, int i11) {
        i51 i51Var = new i51(34);
        i51Var.d = i10;
        i51Var.f25598z = i11;
        return i51Var;
    }

    public static i51 p(View view, int i10, boolean z4) {
        i51 i51Var = new i51(-3);
        i51Var.f25579c = view;
        i51Var.f25598z = i10;
        i51Var.f25597y = z4 ? 1 : 0;
        return i51Var;
    }

    public static i51 q(String str) {
        i51 i51Var = new i51(31);
        i51Var.f25585l = str;
        return i51Var;
    }

    public static i51 r(String str, String str2, View.OnClickListener onClickListener) {
        i51 i51Var = new i51(31);
        i51Var.f25585l = str;
        i51Var.f25586m = str2;
        i51Var.D = onClickListener;
        return i51Var;
    }

    public static i51 s(int i10, String str) {
        i51 i51Var = new i51(0);
        i51Var.d = i10;
        i51Var.f25585l = str;
        return i51Var;
    }

    public static i51 t(String str) {
        i51 i51Var = new i51(0);
        i51Var.f25585l = str;
        return i51Var;
    }

    public static i51 u(org.telegram.ui.je jeVar) {
        i51 i51Var = new i51(24);
        i51Var.G = jeVar;
        return i51Var;
    }

    public static i51 v(TLObject tLObject) {
        i51 i51Var = new i51(32);
        i51Var.G = tLObject;
        return i51Var;
    }

    public static i51 w(int i10, String str) {
        i51 i51Var = new i51(10);
        i51Var.d = i10;
        i51Var.f25585l = str;
        return i51Var;
    }

    public static i51 x(int i10, String str, String str2) {
        i51 i51Var = new i51(44);
        i51Var.d = i10;
        i51Var.f25585l = str;
        i51Var.f25587n = str2;
        return i51Var;
    }

    public static i51 y(int i10, CharSequence charSequence) {
        i51 i51Var = new i51(35);
        i51Var.d = i10;
        i51Var.f25585l = charSequence;
        return i51Var;
    }

    public static i51 z(String str, CharSequence charSequence, int i10) {
        i51 i51Var = new i51(41);
        i51Var.d = i10;
        i51Var.f25585l = charSequence;
        i51Var.f25588o = str;
        return i51Var;
    }

    public final boolean G(Class cls) {
        HashMap hashMap;
        h51 h51Var;
        if (this.f1830a >= 10000 && (hashMap = L) != null && (h51Var = (h51) hashMap.get(cls)) != null && h51Var.viewType == this.f1830a) {
            return true;
        }
        return false;
    }

    public final boolean H(org.telegram.ui.Components.i51 r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.i51.H(org.telegram.ui.Components.i51):boolean");
    }

    public final boolean I(i51 i51Var) {
        if (this.d == i51Var.d && this.f25582i == i51Var.f25582i && this.f25596x == i51Var.f25596x && this.f25584k == i51Var.f25584k && this.f25583j == i51Var.f25583j && this.f25592s == i51Var.f25592s && this.f25591r == i51Var.f25591r && this.f25593t == i51Var.f25593t && this.f25590q == i51Var.f25590q && this.f25579c == i51Var.f25579c && TextUtils.equals(this.f25585l, i51Var.f25585l) && TextUtils.equals(this.f25586m, i51Var.f25586m) && TextUtils.equals(this.f25587n, i51Var.f25587n) && this.f25579c == i51Var.f25579c && this.f25598z == i51Var.f25598z && Math.abs(this.A - i51Var.A) < 0.01f && this.B == i51Var.B && Objects.equals(this.G, i51Var.G) && Objects.equals(this.H, i51Var.H)) {
            return true;
        }
        return false;
    }

    public final void K(boolean z4) {
        this.e = z4;
        if (this.f1830a == 11) {
            this.f1830a = 12;
        }
    }

    @Override
    public final boolean a(bg.b bVar) {
        h51 F;
        if (this != bVar) {
            if (i51.class == bVar.getClass()) {
                i51 i51Var = (i51) bVar;
                int i10 = this.f1830a;
                if (i10 == i51Var.f1830a) {
                    if (i10 == 31) {
                        if (TextUtils.equals(this.f25585l, i51Var.f25585l) && TextUtils.equals(this.f25586m, i51Var.f25586m)) {
                            return true;
                        }
                        return false;
                    } else if (i10 == 28) {
                        if (this.f25598z == i51Var.f25598z) {
                            return true;
                        }
                        return false;
                    } else if (i10 != 35 && i10 != 37) {
                        if (i10 >= 10000 && (F = F(i10)) != null) {
                            return F.contentsEquals(this, i51Var);
                        }
                        return H(i51Var);
                    } else if (this.d == i51Var.d && TextUtils.equals(this.f25585l, i51Var.f25585l) && this.e == i51Var.e) {
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
        h51 F;
        if (this != obj) {
            if (obj != null && i51.class == obj.getClass()) {
                i51 i51Var = (i51) obj;
                int i10 = this.f1830a;
                if (i10 == i51Var.f1830a) {
                    if (i10 != 36 && i10 != 35) {
                        if (i10 == 28) {
                            if (this.d == i51Var.d) {
                                return true;
                            }
                            return false;
                        } else if (i10 == 31) {
                            return TextUtils.equals(this.f25585l, i51Var.f25585l);
                        } else {
                            if (i10 >= 10000 && (F = F(i10)) != null) {
                                return F.equals(this, i51Var);
                            }
                            return I(i51Var);
                        }
                    } else if (this.d == i51Var.d) {
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
