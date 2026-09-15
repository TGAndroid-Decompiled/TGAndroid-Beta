package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import j$.util.Objects;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ka1;
public final class i51 extends og.a {
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
    public View f24888c;
    public int d;
    public boolean e;
    public boolean f24889f;
    public boolean f24890g;
    public boolean h;
    public int f24891i;
    public boolean f24892j;
    public int f24893k;
    public CharSequence f24894l;
    public CharSequence f24895m;
    public CharSequence f24896n;
    public CharSequence f24897o;
    public String[] f24898p;
    public boolean f24899q;
    public boolean f24900r;
    public boolean f24901s;
    public boolean f24902t;
    public int f24903u;
    public int v;
    public boolean f24904w;
    public long f24905x;
    public int f24906y;
    public int f24907z;

    public i51(int i10) {
        super(i10, false);
        this.f24890g = true;
        this.f24903u = -1;
        this.I = true;
    }

    public static i51 A(int i10, CharSequence charSequence) {
        i51 i51Var = new i51(7);
        i51Var.d = i10;
        i51Var.f24894l = charSequence;
        return i51Var;
    }

    public static i51 B(CharSequence charSequence) {
        i51 i51Var = new i51(7);
        i51Var.f24894l = charSequence;
        return i51Var;
    }

    public static i51 C(int i10) {
        i51 i51Var = new i51(28);
        i51Var.f24907z = i10;
        return i51Var;
    }

    public static i51 D(int i10, int i11) {
        i51 i51Var = new i51(28);
        i51Var.d = i10;
        i51Var.f24907z = i11;
        return i51Var;
    }

    public static i51 E(int i10, String str) {
        i51 i51Var = new i51(39);
        i51Var.d = i10;
        i51Var.f24894l = str;
        i51Var.f24907z = 1;
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
        i51Var.f24894l = str;
        return i51Var;
    }

    public static i51 c(int i10, int i11, String str) {
        i51 i51Var = new i51(3);
        i51Var.d = i10;
        i51Var.f24893k = i11;
        i51Var.f24894l = str;
        return i51Var;
    }

    public static i51 d(int i10, int i11, String str, String str2) {
        i51 i51Var = new i51(3);
        i51Var.d = i10;
        i51Var.f24893k = i11;
        i51Var.f24894l = str;
        i51Var.f24896n = str2;
        return i51Var;
    }

    public static i51 e(int i10, String str) {
        i51 i51Var = new i51(3);
        i51Var.d = i10;
        i51Var.f24894l = str;
        return i51Var;
    }

    public static i51 f(String str, CharSequence charSequence, int i10) {
        i51 i51Var = new i51(3);
        i51Var.d = i10;
        i51Var.f24894l = str;
        i51Var.f24896n = charSequence;
        return i51Var;
    }

    public static i51 g(CharSequence charSequence) {
        i51 i51Var = new i51(7);
        i51Var.f24894l = charSequence;
        i51Var.f24899q = true;
        return i51Var;
    }

    public static i51 h(int i10, int i11, ka1 ka1Var) {
        i51 i51Var = new i51(i10 + 18);
        i51Var.f24907z = i11;
        i51Var.G = ka1Var;
        return i51Var;
    }

    public static i51 i(int i10, CharSequence charSequence) {
        i51 i51Var = new i51(4);
        i51Var.d = i10;
        i51Var.f24894l = charSequence;
        return i51Var;
    }

    public static i51 j(int i10, View view) {
        i51 i51Var = new i51(-1);
        i51Var.d = i10;
        i51Var.f24888c = view;
        i51Var.f24907z = -1;
        return i51Var;
    }

    public static i51 k(View view) {
        i51 i51Var = new i51(-1);
        i51Var.f24888c = view;
        i51Var.f24907z = -1;
        return i51Var;
    }

    public static i51 l(View view) {
        i51 i51Var = new i51(-4);
        i51Var.f24888c = view;
        i51Var.f24907z = -1;
        return i51Var;
    }

    public static i51 m(int i10, String str, String str2) {
        i51 i51Var = new i51(40);
        i51Var.d = i10;
        i51Var.f24894l = str;
        i51Var.f24897o = str2;
        return i51Var;
    }

    public static i51 n(int i10) {
        i51 i51Var = new i51(34);
        i51Var.f24907z = i10;
        return i51Var;
    }

    public static i51 o(int i10, int i11) {
        i51 i51Var = new i51(34);
        i51Var.d = i10;
        i51Var.f24907z = i11;
        return i51Var;
    }

    public static i51 p(View view, int i10, boolean z10) {
        i51 i51Var = new i51(-3);
        i51Var.f24888c = view;
        i51Var.f24907z = i10;
        i51Var.f24906y = z10 ? 1 : 0;
        return i51Var;
    }

    public static i51 q(String str) {
        i51 i51Var = new i51(31);
        i51Var.f24894l = str;
        return i51Var;
    }

    public static i51 r(String str, String str2, View.OnClickListener onClickListener) {
        i51 i51Var = new i51(31);
        i51Var.f24894l = str;
        i51Var.f24895m = str2;
        i51Var.D = onClickListener;
        return i51Var;
    }

    public static i51 s(int i10, String str) {
        i51 i51Var = new i51(0);
        i51Var.d = i10;
        i51Var.f24894l = str;
        return i51Var;
    }

    public static i51 t(String str) {
        i51 i51Var = new i51(0);
        i51Var.f24894l = str;
        return i51Var;
    }

    public static i51 u(org.telegram.ui.ge geVar) {
        i51 i51Var = new i51(24);
        i51Var.G = geVar;
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
        i51Var.f24894l = str;
        return i51Var;
    }

    public static i51 x(int i10, String str, String str2) {
        i51 i51Var = new i51(44);
        i51Var.d = i10;
        i51Var.f24894l = str;
        i51Var.f24896n = str2;
        return i51Var;
    }

    public static i51 y(int i10, CharSequence charSequence) {
        i51 i51Var = new i51(35);
        i51Var.d = i10;
        i51Var.f24894l = charSequence;
        return i51Var;
    }

    public static i51 z(String str, CharSequence charSequence, int i10) {
        i51 i51Var = new i51(41);
        i51Var.d = i10;
        i51Var.f24894l = charSequence;
        i51Var.f24897o = str;
        return i51Var;
    }

    public final boolean G(Class cls) {
        HashMap hashMap;
        h51 h51Var;
        if (this.f15533a >= 10000 && (hashMap = L) != null && (h51Var = (h51) hashMap.get(cls)) != null && h51Var.viewType == this.f15533a) {
            return true;
        }
        return false;
    }

    public final boolean H(org.telegram.ui.Components.i51 r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.i51.H(org.telegram.ui.Components.i51):boolean");
    }

    public final boolean I(i51 i51Var) {
        if (this.d == i51Var.d && this.f24891i == i51Var.f24891i && this.f24905x == i51Var.f24905x && this.f24893k == i51Var.f24893k && this.f24892j == i51Var.f24892j && this.f24901s == i51Var.f24901s && this.f24900r == i51Var.f24900r && this.f24902t == i51Var.f24902t && this.f24899q == i51Var.f24899q && this.f24888c == i51Var.f24888c && TextUtils.equals(this.f24894l, i51Var.f24894l) && TextUtils.equals(this.f24895m, i51Var.f24895m) && TextUtils.equals(this.f24896n, i51Var.f24896n) && this.f24888c == i51Var.f24888c && this.f24907z == i51Var.f24907z && Math.abs(this.A - i51Var.A) < 0.01f && this.B == i51Var.B && Objects.equals(this.G, i51Var.G) && Objects.equals(this.H, i51Var.H)) {
            return true;
        }
        return false;
    }

    public final void K(boolean z10) {
        this.e = z10;
        if (this.f15533a == 11) {
            this.f15533a = 12;
        }
    }

    @Override
    public final boolean a(og.a aVar) {
        h51 F;
        if (this != aVar) {
            if (i51.class == aVar.getClass()) {
                i51 i51Var = (i51) aVar;
                int i10 = this.f15533a;
                if (i10 == i51Var.f15533a) {
                    if (i10 == 31) {
                        if (TextUtils.equals(this.f24894l, i51Var.f24894l) && TextUtils.equals(this.f24895m, i51Var.f24895m)) {
                            return true;
                        }
                        return false;
                    } else if (i10 == 28) {
                        if (this.f24907z == i51Var.f24907z) {
                            return true;
                        }
                        return false;
                    } else if (i10 != 35 && i10 != 37) {
                        if (i10 >= 10000 && (F = F(i10)) != null) {
                            return F.contentsEquals(this, i51Var);
                        }
                        return H(i51Var);
                    } else if (this.d == i51Var.d && TextUtils.equals(this.f24894l, i51Var.f24894l) && this.e == i51Var.e) {
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
                int i10 = this.f15533a;
                if (i10 == i51Var.f15533a) {
                    if (i10 != 36 && i10 != 35) {
                        if (i10 == 28) {
                            if (this.d == i51Var.d) {
                                return true;
                            }
                            return false;
                        } else if (i10 == 31) {
                            return TextUtils.equals(this.f24894l, i51Var.f24894l);
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
