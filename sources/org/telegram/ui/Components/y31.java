package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import j$.util.Objects;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;
public final class y31 extends rg.a {
    public static int J = 10000;
    public static LongSparseArray K;
    public static HashMap L;
    public float A;
    public long B;
    public org.telegram.messenger.c20 C;
    public View.OnClickListener D;
    public View.OnClickListener E;
    public org.telegram.messenger.c20 F;
    public Object G;
    public Object H;
    public boolean I;
    public View f40561c;
    public int d;
    public boolean f40562e;
    public boolean f40563f;
    public boolean f40564g;
    public boolean h;
    public int f40565i;
    public boolean f40566j;
    public int f40567k;
    public CharSequence f40568l;
    public CharSequence f40569m;
    public CharSequence f40570n;
    public CharSequence f40571o;
    public String[] f40572p;
    public boolean f40573q;
    public boolean f40574r;
    public boolean f40575s;
    public boolean f40576t;
    public int f40577u;
    public int v;
    public boolean f40578w;
    public long f40579x;
    public int f40580y;
    public int f40581z;

    public y31(int i7) {
        super(i7, false);
        this.f40564g = true;
        this.f40577u = -1;
        this.I = true;
    }

    public static y31 A(String str, CharSequence charSequence, int i7) {
        y31 y31Var = new y31(41);
        y31Var.d = i7;
        y31Var.f40568l = charSequence;
        y31Var.f40571o = str;
        return y31Var;
    }

    public static y31 B(int i7, CharSequence charSequence) {
        y31 y31Var = new y31(7);
        y31Var.d = i7;
        y31Var.f40568l = charSequence;
        return y31Var;
    }

    public static y31 C(CharSequence charSequence) {
        y31 y31Var = new y31(7);
        y31Var.f40568l = charSequence;
        return y31Var;
    }

    public static y31 D(int i7) {
        y31 y31Var = new y31(28);
        y31Var.f40581z = i7;
        return y31Var;
    }

    public static y31 E(int i7, int i10) {
        y31 y31Var = new y31(28);
        y31Var.d = i7;
        y31Var.f40581z = i10;
        return y31Var;
    }

    public static y31 F(int i7, String str) {
        y31 y31Var = new y31(39);
        y31Var.d = i7;
        y31Var.f40568l = str;
        y31Var.f40581z = 1;
        return y31Var;
    }

    public static x31 G(int i7) {
        LongSparseArray longSparseArray = K;
        if (longSparseArray == null) {
            return null;
        }
        return (x31) longSparseArray.get(i7);
    }

    public static y31 K(Class cls) {
        if (L == null) {
            L = new HashMap();
        }
        if (K == null) {
            K = new LongSparseArray();
        }
        x31 x31Var = (x31) L.get(cls);
        if (x31Var != null) {
            return new y31(x31Var.f40286a);
        }
        throw new RuntimeException("UItemFactory was not setuped: " + cls);
    }

    public static y31 b(String str) {
        y31 y31Var = new y31(1);
        y31Var.f40568l = str;
        return y31Var;
    }

    public static y31 c(int i7, int i10, String str) {
        y31 y31Var = new y31(3);
        y31Var.d = i7;
        y31Var.f40567k = i10;
        y31Var.f40568l = str;
        return y31Var;
    }

    public static y31 d(int i7, int i10, String str, String str2) {
        y31 y31Var = new y31(3);
        y31Var.d = i7;
        y31Var.f40567k = i10;
        y31Var.f40568l = str;
        y31Var.f40570n = str2;
        return y31Var;
    }

    public static y31 e(int i7, String str) {
        y31 y31Var = new y31(3);
        y31Var.d = i7;
        y31Var.f40568l = str;
        return y31Var;
    }

    public static y31 f(String str, CharSequence charSequence, int i7) {
        y31 y31Var = new y31(3);
        y31Var.d = i7;
        y31Var.f40568l = str;
        y31Var.f40570n = charSequence;
        return y31Var;
    }

    public static y31 g(CharSequence charSequence) {
        y31 y31Var = new y31(7);
        y31Var.f40568l = charSequence;
        y31Var.f40573q = true;
        return y31Var;
    }

    public static y31 h(int i7, int i10, org.telegram.ui.p41 p41Var) {
        y31 y31Var = new y31(i7 + 18);
        y31Var.f40581z = i10;
        y31Var.G = p41Var;
        return y31Var;
    }

    public static y31 i(int i7, CharSequence charSequence) {
        y31 y31Var = new y31(4);
        y31Var.d = i7;
        y31Var.f40568l = charSequence;
        return y31Var;
    }

    public static y31 j(int i7, View view) {
        y31 y31Var = new y31(-1);
        y31Var.d = i7;
        y31Var.f40561c = view;
        y31Var.f40581z = -1;
        return y31Var;
    }

    public static y31 k(View view) {
        y31 y31Var = new y31(-1);
        y31Var.f40561c = view;
        y31Var.f40581z = -1;
        return y31Var;
    }

    public static y31 l(int i7, View view) {
        y31 y31Var = new y31(-4);
        y31Var.d = i7;
        y31Var.f40561c = view;
        y31Var.f40581z = -1;
        return y31Var;
    }

    public static y31 m(View view) {
        y31 y31Var = new y31(-4);
        y31Var.f40561c = view;
        y31Var.f40581z = -1;
        return y31Var;
    }

    public static y31 n(View view, int i7) {
        y31 y31Var = new y31(-4);
        y31Var.f40561c = view;
        y31Var.f40581z = i7;
        return y31Var;
    }

    public static y31 o(int i7, String str, String str2) {
        y31 y31Var = new y31(40);
        y31Var.d = i7;
        y31Var.f40568l = str;
        y31Var.f40571o = str2;
        return y31Var;
    }

    public static y31 p(int i7) {
        y31 y31Var = new y31(34);
        y31Var.f40581z = i7;
        return y31Var;
    }

    public static y31 q(int i7, int i10) {
        y31 y31Var = new y31(34);
        y31Var.d = i7;
        y31Var.f40581z = i10;
        return y31Var;
    }

    public static y31 r(String str) {
        y31 y31Var = new y31(31);
        y31Var.f40568l = str;
        return y31Var;
    }

    public static y31 s(String str, String str2, View.OnClickListener onClickListener) {
        y31 y31Var = new y31(31);
        y31Var.f40568l = str;
        y31Var.f40569m = str2;
        y31Var.D = onClickListener;
        return y31Var;
    }

    public static y31 t(int i7, String str) {
        y31 y31Var = new y31(0);
        y31Var.d = i7;
        y31Var.f40568l = str;
        return y31Var;
    }

    public static y31 u(String str) {
        y31 y31Var = new y31(0);
        y31Var.f40568l = str;
        return y31Var;
    }

    public static y31 v(org.telegram.ui.wd wdVar) {
        y31 y31Var = new y31(24);
        y31Var.G = wdVar;
        return y31Var;
    }

    public static y31 w(TLObject tLObject) {
        y31 y31Var = new y31(32);
        y31Var.G = tLObject;
        return y31Var;
    }

    public static y31 x(int i7, String str) {
        y31 y31Var = new y31(10);
        y31Var.d = i7;
        y31Var.f40568l = str;
        return y31Var;
    }

    public static y31 y(int i7, String str, String str2) {
        y31 y31Var = new y31(44);
        y31Var.d = i7;
        y31Var.f40568l = str;
        y31Var.f40570n = str2;
        return y31Var;
    }

    public static y31 z(int i7, CharSequence charSequence) {
        y31 y31Var = new y31(35);
        y31Var.d = i7;
        y31Var.f40568l = charSequence;
        return y31Var;
    }

    public final boolean H(Class cls) {
        HashMap hashMap;
        x31 x31Var;
        if (this.f54544a >= 10000 && (hashMap = L) != null && (x31Var = (x31) hashMap.get(cls)) != null && x31Var.f40286a == this.f54544a) {
            return true;
        }
        return false;
    }

    public final boolean I(org.telegram.ui.Components.y31 r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.y31.I(org.telegram.ui.Components.y31):boolean");
    }

    public final boolean J(y31 y31Var) {
        if (this.d == y31Var.d && this.f40565i == y31Var.f40565i && this.f40579x == y31Var.f40579x && this.f40567k == y31Var.f40567k && this.f40566j == y31Var.f40566j && this.f40575s == y31Var.f40575s && this.f40574r == y31Var.f40574r && this.f40576t == y31Var.f40576t && this.f40573q == y31Var.f40573q && this.f40561c == y31Var.f40561c && TextUtils.equals(this.f40568l, y31Var.f40568l) && TextUtils.equals(this.f40569m, y31Var.f40569m) && TextUtils.equals(this.f40570n, y31Var.f40570n) && this.f40561c == y31Var.f40561c && this.f40581z == y31Var.f40581z && Math.abs(this.A - y31Var.A) < 0.01f && this.B == y31Var.B && Objects.equals(this.G, y31Var.G) && Objects.equals(this.H, y31Var.H)) {
            return true;
        }
        return false;
    }

    public final void L(boolean z9) {
        this.f40562e = z9;
        if (this.f54544a == 11) {
            this.f54544a = 12;
        }
    }

    @Override
    public final boolean a(rg.a aVar) {
        x31 G;
        if (this != aVar) {
            if (y31.class == aVar.getClass()) {
                y31 y31Var = (y31) aVar;
                int i7 = this.f54544a;
                if (i7 == y31Var.f54544a) {
                    if (i7 == 31) {
                        if (TextUtils.equals(this.f40568l, y31Var.f40568l) && TextUtils.equals(this.f40569m, y31Var.f40569m)) {
                            return true;
                        }
                        return false;
                    } else if (i7 == 28) {
                        if (this.f40581z == y31Var.f40581z) {
                            return true;
                        }
                        return false;
                    } else if (i7 != 35 && i7 != 37) {
                        if (i7 >= 10000 && (G = G(i7)) != null) {
                            return G.c(this, y31Var);
                        }
                        return I(y31Var);
                    } else if (this.d == y31Var.d && TextUtils.equals(this.f40568l, y31Var.f40568l) && this.f40562e == y31Var.f40562e) {
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
        x31 G;
        if (this != obj) {
            if (obj != null && y31.class == obj.getClass()) {
                y31 y31Var = (y31) obj;
                int i7 = this.f54544a;
                if (i7 == y31Var.f54544a) {
                    if (i7 != 36 && i7 != 35) {
                        if (i7 == 28) {
                            if (this.d == y31Var.d) {
                                return true;
                            }
                            return false;
                        } else if (i7 == 31) {
                            return TextUtils.equals(this.f40568l, y31Var.f40568l);
                        } else {
                            if (i7 >= 10000 && (G = G(i7)) != null) {
                                return G.e(this, y31Var);
                            }
                            return J(y31Var);
                        }
                    } else if (this.d == y31Var.d) {
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
