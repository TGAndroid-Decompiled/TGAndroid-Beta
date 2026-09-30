package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import j$.util.Objects;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ea1;
public final class y51 extends og.a {
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
    public View f30631c;
    public int d;
    public boolean e;
    public boolean f30632f;
    public boolean f30633g;
    public boolean h;
    public int f30634i;
    public boolean f30635j;
    public int f30636k;
    public CharSequence f30637l;
    public CharSequence f30638m;
    public CharSequence f30639n;
    public CharSequence f30640o;
    public String[] f30641p;
    public boolean f30642q;
    public boolean f30643r;
    public boolean f30644s;
    public boolean f30645t;
    public int f30646u;
    public int v;
    public boolean f30647w;
    public long f30648x;
    public int f30649y;
    public int f30650z;

    public y51(int i10) {
        super(i10, false);
        this.f30633g = true;
        this.f30646u = -1;
        this.I = true;
    }

    public static y51 A(int i10, CharSequence charSequence) {
        y51 y51Var = new y51(7);
        y51Var.d = i10;
        y51Var.f30637l = charSequence;
        return y51Var;
    }

    public static y51 B(CharSequence charSequence) {
        y51 y51Var = new y51(7);
        y51Var.f30637l = charSequence;
        return y51Var;
    }

    public static y51 C(int i10) {
        y51 y51Var = new y51(28);
        y51Var.f30650z = i10;
        return y51Var;
    }

    public static y51 D(int i10, int i11) {
        y51 y51Var = new y51(28);
        y51Var.d = i10;
        y51Var.f30650z = i11;
        return y51Var;
    }

    public static y51 E(int i10, String str) {
        y51 y51Var = new y51(39);
        y51Var.d = i10;
        y51Var.f30637l = str;
        y51Var.f30650z = 1;
        return y51Var;
    }

    public static x51 F(int i10) {
        LongSparseArray longSparseArray = K;
        if (longSparseArray == null) {
            return null;
        }
        return (x51) longSparseArray.get(i10);
    }

    public static y51 J(Class cls) {
        if (L == null) {
            L = new HashMap();
        }
        if (K == null) {
            K = new LongSparseArray();
        }
        x51 x51Var = (x51) L.get(cls);
        if (x51Var != null) {
            return new y51(x51Var.viewType);
        }
        throw new RuntimeException("UItemFactory was not setuped: " + cls);
    }

    public static y51 b(String str) {
        y51 y51Var = new y51(1);
        y51Var.f30637l = str;
        return y51Var;
    }

    public static y51 c(int i10, int i11, String str) {
        y51 y51Var = new y51(3);
        y51Var.d = i10;
        y51Var.f30636k = i11;
        y51Var.f30637l = str;
        return y51Var;
    }

    public static y51 d(int i10, int i11, String str, String str2) {
        y51 y51Var = new y51(3);
        y51Var.d = i10;
        y51Var.f30636k = i11;
        y51Var.f30637l = str;
        y51Var.f30639n = str2;
        return y51Var;
    }

    public static y51 e(int i10, String str) {
        y51 y51Var = new y51(3);
        y51Var.d = i10;
        y51Var.f30637l = str;
        return y51Var;
    }

    public static y51 f(String str, CharSequence charSequence, int i10) {
        y51 y51Var = new y51(3);
        y51Var.d = i10;
        y51Var.f30637l = str;
        y51Var.f30639n = charSequence;
        return y51Var;
    }

    public static y51 g(CharSequence charSequence) {
        y51 y51Var = new y51(7);
        y51Var.f30637l = charSequence;
        y51Var.f30642q = true;
        return y51Var;
    }

    public static y51 h(int i10, int i11, ea1 ea1Var) {
        y51 y51Var = new y51(i10 + 18);
        y51Var.f30650z = i11;
        y51Var.G = ea1Var;
        return y51Var;
    }

    public static y51 i(int i10, CharSequence charSequence) {
        y51 y51Var = new y51(4);
        y51Var.d = i10;
        y51Var.f30637l = charSequence;
        return y51Var;
    }

    public static y51 j(int i10, View view) {
        y51 y51Var = new y51(-1);
        y51Var.d = i10;
        y51Var.f30631c = view;
        y51Var.f30650z = -1;
        return y51Var;
    }

    public static y51 k(View view) {
        y51 y51Var = new y51(-1);
        y51Var.f30631c = view;
        y51Var.f30650z = -1;
        return y51Var;
    }

    public static y51 l(View view) {
        y51 y51Var = new y51(-4);
        y51Var.f30631c = view;
        y51Var.f30650z = -1;
        return y51Var;
    }

    public static y51 m(int i10, String str, String str2) {
        y51 y51Var = new y51(40);
        y51Var.d = i10;
        y51Var.f30637l = str;
        y51Var.f30640o = str2;
        return y51Var;
    }

    public static y51 n(int i10) {
        y51 y51Var = new y51(34);
        y51Var.f30650z = i10;
        return y51Var;
    }

    public static y51 o(int i10, int i11) {
        y51 y51Var = new y51(34);
        y51Var.d = i10;
        y51Var.f30650z = i11;
        return y51Var;
    }

    public static y51 p(View view, int i10, boolean z10) {
        y51 y51Var = new y51(-3);
        y51Var.f30631c = view;
        y51Var.f30650z = i10;
        y51Var.f30649y = z10 ? 1 : 0;
        return y51Var;
    }

    public static y51 q(String str) {
        y51 y51Var = new y51(31);
        y51Var.f30637l = str;
        return y51Var;
    }

    public static y51 r(String str, String str2, View.OnClickListener onClickListener) {
        y51 y51Var = new y51(31);
        y51Var.f30637l = str;
        y51Var.f30638m = str2;
        y51Var.D = onClickListener;
        return y51Var;
    }

    public static y51 s(int i10, String str) {
        y51 y51Var = new y51(0);
        y51Var.d = i10;
        y51Var.f30637l = str;
        return y51Var;
    }

    public static y51 t(String str) {
        y51 y51Var = new y51(0);
        y51Var.f30637l = str;
        return y51Var;
    }

    public static y51 u(org.telegram.ui.ge geVar) {
        y51 y51Var = new y51(24);
        y51Var.G = geVar;
        return y51Var;
    }

    public static y51 v(TLObject tLObject) {
        y51 y51Var = new y51(32);
        y51Var.G = tLObject;
        return y51Var;
    }

    public static y51 w(int i10, String str) {
        y51 y51Var = new y51(10);
        y51Var.d = i10;
        y51Var.f30637l = str;
        return y51Var;
    }

    public static y51 x(int i10, String str, String str2) {
        y51 y51Var = new y51(44);
        y51Var.d = i10;
        y51Var.f30637l = str;
        y51Var.f30639n = str2;
        return y51Var;
    }

    public static y51 y(int i10, CharSequence charSequence) {
        y51 y51Var = new y51(35);
        y51Var.d = i10;
        y51Var.f30637l = charSequence;
        return y51Var;
    }

    public static y51 z(String str, CharSequence charSequence, int i10) {
        y51 y51Var = new y51(41);
        y51Var.d = i10;
        y51Var.f30637l = charSequence;
        y51Var.f30640o = str;
        return y51Var;
    }

    public final boolean G(Class cls) {
        HashMap hashMap;
        x51 x51Var;
        if (this.f15731a >= 10000 && (hashMap = L) != null && (x51Var = (x51) hashMap.get(cls)) != null && x51Var.viewType == this.f15731a) {
            return true;
        }
        return false;
    }

    public final boolean H(org.telegram.ui.Components.y51 r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.y51.H(org.telegram.ui.Components.y51):boolean");
    }

    public final boolean I(y51 y51Var) {
        if (this.d == y51Var.d && this.f30634i == y51Var.f30634i && this.f30648x == y51Var.f30648x && this.f30636k == y51Var.f30636k && this.f30635j == y51Var.f30635j && this.f30644s == y51Var.f30644s && this.f30643r == y51Var.f30643r && this.f30645t == y51Var.f30645t && this.f30642q == y51Var.f30642q && this.f30631c == y51Var.f30631c && TextUtils.equals(this.f30637l, y51Var.f30637l) && TextUtils.equals(this.f30638m, y51Var.f30638m) && TextUtils.equals(this.f30639n, y51Var.f30639n) && this.f30631c == y51Var.f30631c && this.f30650z == y51Var.f30650z && Math.abs(this.A - y51Var.A) < 0.01f && this.B == y51Var.B && Objects.equals(this.G, y51Var.G) && Objects.equals(this.H, y51Var.H)) {
            return true;
        }
        return false;
    }

    public final void K(boolean z10) {
        this.e = z10;
        if (this.f15731a == 11) {
            this.f15731a = 12;
        }
    }

    @Override
    public final boolean a(og.a aVar) {
        x51 F;
        if (this != aVar) {
            if (y51.class == aVar.getClass()) {
                y51 y51Var = (y51) aVar;
                int i10 = this.f15731a;
                if (i10 == y51Var.f15731a) {
                    if (i10 == 31) {
                        if (TextUtils.equals(this.f30637l, y51Var.f30637l) && TextUtils.equals(this.f30638m, y51Var.f30638m)) {
                            return true;
                        }
                        return false;
                    } else if (i10 == 28) {
                        if (this.f30650z == y51Var.f30650z) {
                            return true;
                        }
                        return false;
                    } else if (i10 != 35 && i10 != 37) {
                        if (i10 >= 10000 && (F = F(i10)) != null) {
                            return F.contentsEquals(this, y51Var);
                        }
                        return H(y51Var);
                    } else if (this.d == y51Var.d && TextUtils.equals(this.f30637l, y51Var.f30637l) && this.e == y51Var.e) {
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
        x51 F;
        if (this != obj) {
            if (obj != null && y51.class == obj.getClass()) {
                y51 y51Var = (y51) obj;
                int i10 = this.f15731a;
                if (i10 == y51Var.f15731a) {
                    if (i10 != 36 && i10 != 35) {
                        if (i10 == 28) {
                            if (this.d == y51Var.d) {
                                return true;
                            }
                            return false;
                        } else if (i10 == 31) {
                            return TextUtils.equals(this.f30637l, y51Var.f30637l);
                        } else {
                            if (i10 >= 10000 && (F = F(i10)) != null) {
                                return F.equals(this, y51Var);
                            }
                            return I(y51Var);
                        }
                    } else if (this.d == y51Var.d) {
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
