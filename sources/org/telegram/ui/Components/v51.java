package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import j$.util.Objects;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ea1;
public final class v51 extends og.a {
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
    public View f29036c;
    public int d;
    public boolean e;
    public boolean f29037f;
    public boolean f29038g;
    public boolean h;
    public int f29039i;
    public boolean f29040j;
    public int f29041k;
    public CharSequence f29042l;
    public CharSequence f29043m;
    public CharSequence f29044n;
    public CharSequence f29045o;
    public String[] f29046p;
    public boolean f29047q;
    public boolean f29048r;
    public boolean f29049s;
    public boolean f29050t;
    public int f29051u;
    public int v;
    public boolean f29052w;
    public long f29053x;
    public int f29054y;
    public int f29055z;

    public v51(int i10) {
        super(i10, false);
        this.f29038g = true;
        this.f29051u = -1;
        this.I = true;
    }

    public static v51 A(int i10, CharSequence charSequence) {
        v51 v51Var = new v51(7);
        v51Var.d = i10;
        v51Var.f29042l = charSequence;
        return v51Var;
    }

    public static v51 B(CharSequence charSequence) {
        v51 v51Var = new v51(7);
        v51Var.f29042l = charSequence;
        return v51Var;
    }

    public static v51 C(int i10) {
        v51 v51Var = new v51(28);
        v51Var.f29055z = i10;
        return v51Var;
    }

    public static v51 D(int i10, int i11) {
        v51 v51Var = new v51(28);
        v51Var.d = i10;
        v51Var.f29055z = i11;
        return v51Var;
    }

    public static v51 E(int i10, String str) {
        v51 v51Var = new v51(39);
        v51Var.d = i10;
        v51Var.f29042l = str;
        v51Var.f29055z = 1;
        return v51Var;
    }

    public static u51 F(int i10) {
        LongSparseArray longSparseArray = K;
        if (longSparseArray == null) {
            return null;
        }
        return (u51) longSparseArray.get(i10);
    }

    public static v51 J(Class cls) {
        if (L == null) {
            L = new HashMap();
        }
        if (K == null) {
            K = new LongSparseArray();
        }
        u51 u51Var = (u51) L.get(cls);
        if (u51Var != null) {
            return new v51(u51Var.viewType);
        }
        throw new RuntimeException("UItemFactory was not setuped: " + cls);
    }

    public static v51 b(String str) {
        v51 v51Var = new v51(1);
        v51Var.f29042l = str;
        return v51Var;
    }

    public static v51 c(int i10, int i11, String str) {
        v51 v51Var = new v51(3);
        v51Var.d = i10;
        v51Var.f29041k = i11;
        v51Var.f29042l = str;
        return v51Var;
    }

    public static v51 d(int i10, int i11, String str, String str2) {
        v51 v51Var = new v51(3);
        v51Var.d = i10;
        v51Var.f29041k = i11;
        v51Var.f29042l = str;
        v51Var.f29044n = str2;
        return v51Var;
    }

    public static v51 e(int i10, String str) {
        v51 v51Var = new v51(3);
        v51Var.d = i10;
        v51Var.f29042l = str;
        return v51Var;
    }

    public static v51 f(String str, CharSequence charSequence, int i10) {
        v51 v51Var = new v51(3);
        v51Var.d = i10;
        v51Var.f29042l = str;
        v51Var.f29044n = charSequence;
        return v51Var;
    }

    public static v51 g(CharSequence charSequence) {
        v51 v51Var = new v51(7);
        v51Var.f29042l = charSequence;
        v51Var.f29047q = true;
        return v51Var;
    }

    public static v51 h(int i10, int i11, ea1 ea1Var) {
        v51 v51Var = new v51(i10 + 18);
        v51Var.f29055z = i11;
        v51Var.G = ea1Var;
        return v51Var;
    }

    public static v51 i(int i10, CharSequence charSequence) {
        v51 v51Var = new v51(4);
        v51Var.d = i10;
        v51Var.f29042l = charSequence;
        return v51Var;
    }

    public static v51 j(int i10, View view) {
        v51 v51Var = new v51(-1);
        v51Var.d = i10;
        v51Var.f29036c = view;
        v51Var.f29055z = -1;
        return v51Var;
    }

    public static v51 k(View view) {
        v51 v51Var = new v51(-1);
        v51Var.f29036c = view;
        v51Var.f29055z = -1;
        return v51Var;
    }

    public static v51 l(View view) {
        v51 v51Var = new v51(-4);
        v51Var.f29036c = view;
        v51Var.f29055z = -1;
        return v51Var;
    }

    public static v51 m(int i10, String str, String str2) {
        v51 v51Var = new v51(40);
        v51Var.d = i10;
        v51Var.f29042l = str;
        v51Var.f29045o = str2;
        return v51Var;
    }

    public static v51 n(int i10) {
        v51 v51Var = new v51(34);
        v51Var.f29055z = i10;
        return v51Var;
    }

    public static v51 o(int i10, int i11) {
        v51 v51Var = new v51(34);
        v51Var.d = i10;
        v51Var.f29055z = i11;
        return v51Var;
    }

    public static v51 p(View view, int i10, boolean z10) {
        v51 v51Var = new v51(-3);
        v51Var.f29036c = view;
        v51Var.f29055z = i10;
        v51Var.f29054y = z10 ? 1 : 0;
        return v51Var;
    }

    public static v51 q(String str) {
        v51 v51Var = new v51(31);
        v51Var.f29042l = str;
        return v51Var;
    }

    public static v51 r(String str, String str2, View.OnClickListener onClickListener) {
        v51 v51Var = new v51(31);
        v51Var.f29042l = str;
        v51Var.f29043m = str2;
        v51Var.D = onClickListener;
        return v51Var;
    }

    public static v51 s(int i10, String str) {
        v51 v51Var = new v51(0);
        v51Var.d = i10;
        v51Var.f29042l = str;
        return v51Var;
    }

    public static v51 t(String str) {
        v51 v51Var = new v51(0);
        v51Var.f29042l = str;
        return v51Var;
    }

    public static v51 u(org.telegram.ui.ge geVar) {
        v51 v51Var = new v51(24);
        v51Var.G = geVar;
        return v51Var;
    }

    public static v51 v(TLObject tLObject) {
        v51 v51Var = new v51(32);
        v51Var.G = tLObject;
        return v51Var;
    }

    public static v51 w(int i10, String str) {
        v51 v51Var = new v51(10);
        v51Var.d = i10;
        v51Var.f29042l = str;
        return v51Var;
    }

    public static v51 x(int i10, String str, String str2) {
        v51 v51Var = new v51(44);
        v51Var.d = i10;
        v51Var.f29042l = str;
        v51Var.f29044n = str2;
        return v51Var;
    }

    public static v51 y(int i10, CharSequence charSequence) {
        v51 v51Var = new v51(35);
        v51Var.d = i10;
        v51Var.f29042l = charSequence;
        return v51Var;
    }

    public static v51 z(String str, CharSequence charSequence, int i10) {
        v51 v51Var = new v51(41);
        v51Var.d = i10;
        v51Var.f29042l = charSequence;
        v51Var.f29045o = str;
        return v51Var;
    }

    public final boolean G(Class cls) {
        HashMap hashMap;
        u51 u51Var;
        if (this.f15700a >= 10000 && (hashMap = L) != null && (u51Var = (u51) hashMap.get(cls)) != null && u51Var.viewType == this.f15700a) {
            return true;
        }
        return false;
    }

    public final boolean H(org.telegram.ui.Components.v51 r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.v51.H(org.telegram.ui.Components.v51):boolean");
    }

    public final boolean I(v51 v51Var) {
        if (this.d == v51Var.d && this.f29039i == v51Var.f29039i && this.f29053x == v51Var.f29053x && this.f29041k == v51Var.f29041k && this.f29040j == v51Var.f29040j && this.f29049s == v51Var.f29049s && this.f29048r == v51Var.f29048r && this.f29050t == v51Var.f29050t && this.f29047q == v51Var.f29047q && this.f29036c == v51Var.f29036c && TextUtils.equals(this.f29042l, v51Var.f29042l) && TextUtils.equals(this.f29043m, v51Var.f29043m) && TextUtils.equals(this.f29044n, v51Var.f29044n) && this.f29036c == v51Var.f29036c && this.f29055z == v51Var.f29055z && Math.abs(this.A - v51Var.A) < 0.01f && this.B == v51Var.B && Objects.equals(this.G, v51Var.G) && Objects.equals(this.H, v51Var.H)) {
            return true;
        }
        return false;
    }

    public final void K(boolean z10) {
        this.e = z10;
        if (this.f15700a == 11) {
            this.f15700a = 12;
        }
    }

    @Override
    public final boolean a(og.a aVar) {
        u51 F;
        if (this != aVar) {
            if (v51.class == aVar.getClass()) {
                v51 v51Var = (v51) aVar;
                int i10 = this.f15700a;
                if (i10 == v51Var.f15700a) {
                    if (i10 == 31) {
                        if (TextUtils.equals(this.f29042l, v51Var.f29042l) && TextUtils.equals(this.f29043m, v51Var.f29043m)) {
                            return true;
                        }
                        return false;
                    } else if (i10 == 28) {
                        if (this.f29055z == v51Var.f29055z) {
                            return true;
                        }
                        return false;
                    } else if (i10 != 35 && i10 != 37) {
                        if (i10 >= 10000 && (F = F(i10)) != null) {
                            return F.contentsEquals(this, v51Var);
                        }
                        return H(v51Var);
                    } else if (this.d == v51Var.d && TextUtils.equals(this.f29042l, v51Var.f29042l) && this.e == v51Var.e) {
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
        u51 F;
        if (this != obj) {
            if (obj != null && v51.class == obj.getClass()) {
                v51 v51Var = (v51) obj;
                int i10 = this.f15700a;
                if (i10 == v51Var.f15700a) {
                    if (i10 != 36 && i10 != 35) {
                        if (i10 == 28) {
                            if (this.d == v51Var.d) {
                                return true;
                            }
                            return false;
                        } else if (i10 == 31) {
                            return TextUtils.equals(this.f29042l, v51Var.f29042l);
                        } else {
                            if (i10 >= 10000 && (F = F(i10)) != null) {
                                return F.equals(this, v51Var);
                            }
                            return I(v51Var);
                        }
                    } else if (this.d == v51Var.d) {
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
