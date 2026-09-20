package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import j$.util.Objects;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.na1;
public final class w51 extends og.a {
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
    public View f29942c;
    public int d;
    public boolean e;
    public boolean f29943f;
    public boolean f29944g;
    public boolean h;
    public int f29945i;
    public boolean f29946j;
    public int f29947k;
    public CharSequence f29948l;
    public CharSequence f29949m;
    public CharSequence f29950n;
    public CharSequence f29951o;
    public String[] f29952p;
    public boolean f29953q;
    public boolean f29954r;
    public boolean f29955s;
    public boolean f29956t;
    public int f29957u;
    public int v;
    public boolean f29958w;
    public long f29959x;
    public int f29960y;
    public int f29961z;

    public w51(int i10) {
        super(i10, false);
        this.f29944g = true;
        this.f29957u = -1;
        this.I = true;
    }

    public static w51 A(int i10, CharSequence charSequence) {
        w51 w51Var = new w51(7);
        w51Var.d = i10;
        w51Var.f29948l = charSequence;
        return w51Var;
    }

    public static w51 B(CharSequence charSequence) {
        w51 w51Var = new w51(7);
        w51Var.f29948l = charSequence;
        return w51Var;
    }

    public static w51 C(int i10) {
        w51 w51Var = new w51(28);
        w51Var.f29961z = i10;
        return w51Var;
    }

    public static w51 D(int i10, int i11) {
        w51 w51Var = new w51(28);
        w51Var.d = i10;
        w51Var.f29961z = i11;
        return w51Var;
    }

    public static w51 E(int i10, String str) {
        w51 w51Var = new w51(39);
        w51Var.d = i10;
        w51Var.f29948l = str;
        w51Var.f29961z = 1;
        return w51Var;
    }

    public static v51 F(int i10) {
        LongSparseArray longSparseArray = K;
        if (longSparseArray == null) {
            return null;
        }
        return (v51) longSparseArray.get(i10);
    }

    public static w51 J(Class cls) {
        if (L == null) {
            L = new HashMap();
        }
        if (K == null) {
            K = new LongSparseArray();
        }
        v51 v51Var = (v51) L.get(cls);
        if (v51Var != null) {
            return new w51(v51Var.viewType);
        }
        throw new RuntimeException("UItemFactory was not setuped: " + cls);
    }

    public static w51 b(String str) {
        w51 w51Var = new w51(1);
        w51Var.f29948l = str;
        return w51Var;
    }

    public static w51 c(int i10, int i11, String str) {
        w51 w51Var = new w51(3);
        w51Var.d = i10;
        w51Var.f29947k = i11;
        w51Var.f29948l = str;
        return w51Var;
    }

    public static w51 d(int i10, int i11, String str, String str2) {
        w51 w51Var = new w51(3);
        w51Var.d = i10;
        w51Var.f29947k = i11;
        w51Var.f29948l = str;
        w51Var.f29950n = str2;
        return w51Var;
    }

    public static w51 e(int i10, String str) {
        w51 w51Var = new w51(3);
        w51Var.d = i10;
        w51Var.f29948l = str;
        return w51Var;
    }

    public static w51 f(String str, CharSequence charSequence, int i10) {
        w51 w51Var = new w51(3);
        w51Var.d = i10;
        w51Var.f29948l = str;
        w51Var.f29950n = charSequence;
        return w51Var;
    }

    public static w51 g(CharSequence charSequence) {
        w51 w51Var = new w51(7);
        w51Var.f29948l = charSequence;
        w51Var.f29953q = true;
        return w51Var;
    }

    public static w51 h(int i10, int i11, na1 na1Var) {
        w51 w51Var = new w51(i10 + 18);
        w51Var.f29961z = i11;
        w51Var.G = na1Var;
        return w51Var;
    }

    public static w51 i(int i10, CharSequence charSequence) {
        w51 w51Var = new w51(4);
        w51Var.d = i10;
        w51Var.f29948l = charSequence;
        return w51Var;
    }

    public static w51 j(int i10, View view) {
        w51 w51Var = new w51(-1);
        w51Var.d = i10;
        w51Var.f29942c = view;
        w51Var.f29961z = -1;
        return w51Var;
    }

    public static w51 k(View view) {
        w51 w51Var = new w51(-1);
        w51Var.f29942c = view;
        w51Var.f29961z = -1;
        return w51Var;
    }

    public static w51 l(View view) {
        w51 w51Var = new w51(-4);
        w51Var.f29942c = view;
        w51Var.f29961z = -1;
        return w51Var;
    }

    public static w51 m(int i10, String str, String str2) {
        w51 w51Var = new w51(40);
        w51Var.d = i10;
        w51Var.f29948l = str;
        w51Var.f29951o = str2;
        return w51Var;
    }

    public static w51 n(int i10) {
        w51 w51Var = new w51(34);
        w51Var.f29961z = i10;
        return w51Var;
    }

    public static w51 o(int i10, int i11) {
        w51 w51Var = new w51(34);
        w51Var.d = i10;
        w51Var.f29961z = i11;
        return w51Var;
    }

    public static w51 p(View view, int i10, boolean z10) {
        w51 w51Var = new w51(-3);
        w51Var.f29942c = view;
        w51Var.f29961z = i10;
        w51Var.f29960y = z10 ? 1 : 0;
        return w51Var;
    }

    public static w51 q(String str) {
        w51 w51Var = new w51(31);
        w51Var.f29948l = str;
        return w51Var;
    }

    public static w51 r(String str, String str2, View.OnClickListener onClickListener) {
        w51 w51Var = new w51(31);
        w51Var.f29948l = str;
        w51Var.f29949m = str2;
        w51Var.D = onClickListener;
        return w51Var;
    }

    public static w51 s(int i10, String str) {
        w51 w51Var = new w51(0);
        w51Var.d = i10;
        w51Var.f29948l = str;
        return w51Var;
    }

    public static w51 t(String str) {
        w51 w51Var = new w51(0);
        w51Var.f29948l = str;
        return w51Var;
    }

    public static w51 u(org.telegram.ui.he heVar) {
        w51 w51Var = new w51(24);
        w51Var.G = heVar;
        return w51Var;
    }

    public static w51 v(TLObject tLObject) {
        w51 w51Var = new w51(32);
        w51Var.G = tLObject;
        return w51Var;
    }

    public static w51 w(int i10, String str) {
        w51 w51Var = new w51(10);
        w51Var.d = i10;
        w51Var.f29948l = str;
        return w51Var;
    }

    public static w51 x(int i10, String str, String str2) {
        w51 w51Var = new w51(44);
        w51Var.d = i10;
        w51Var.f29948l = str;
        w51Var.f29950n = str2;
        return w51Var;
    }

    public static w51 y(int i10, CharSequence charSequence) {
        w51 w51Var = new w51(35);
        w51Var.d = i10;
        w51Var.f29948l = charSequence;
        return w51Var;
    }

    public static w51 z(String str, CharSequence charSequence, int i10) {
        w51 w51Var = new w51(41);
        w51Var.d = i10;
        w51Var.f29948l = charSequence;
        w51Var.f29951o = str;
        return w51Var;
    }

    public final boolean G(Class cls) {
        HashMap hashMap;
        v51 v51Var;
        if (this.f15704a >= 10000 && (hashMap = L) != null && (v51Var = (v51) hashMap.get(cls)) != null && v51Var.viewType == this.f15704a) {
            return true;
        }
        return false;
    }

    public final boolean H(org.telegram.ui.Components.w51 r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.w51.H(org.telegram.ui.Components.w51):boolean");
    }

    public final boolean I(w51 w51Var) {
        if (this.d == w51Var.d && this.f29945i == w51Var.f29945i && this.f29959x == w51Var.f29959x && this.f29947k == w51Var.f29947k && this.f29946j == w51Var.f29946j && this.f29955s == w51Var.f29955s && this.f29954r == w51Var.f29954r && this.f29956t == w51Var.f29956t && this.f29953q == w51Var.f29953q && this.f29942c == w51Var.f29942c && TextUtils.equals(this.f29948l, w51Var.f29948l) && TextUtils.equals(this.f29949m, w51Var.f29949m) && TextUtils.equals(this.f29950n, w51Var.f29950n) && this.f29942c == w51Var.f29942c && this.f29961z == w51Var.f29961z && Math.abs(this.A - w51Var.A) < 0.01f && this.B == w51Var.B && Objects.equals(this.G, w51Var.G) && Objects.equals(this.H, w51Var.H)) {
            return true;
        }
        return false;
    }

    public final void K(boolean z10) {
        this.e = z10;
        if (this.f15704a == 11) {
            this.f15704a = 12;
        }
    }

    @Override
    public final boolean a(og.a aVar) {
        v51 F;
        if (this != aVar) {
            if (w51.class == aVar.getClass()) {
                w51 w51Var = (w51) aVar;
                int i10 = this.f15704a;
                if (i10 == w51Var.f15704a) {
                    if (i10 == 31) {
                        if (TextUtils.equals(this.f29948l, w51Var.f29948l) && TextUtils.equals(this.f29949m, w51Var.f29949m)) {
                            return true;
                        }
                        return false;
                    } else if (i10 == 28) {
                        if (this.f29961z == w51Var.f29961z) {
                            return true;
                        }
                        return false;
                    } else if (i10 != 35 && i10 != 37) {
                        if (i10 >= 10000 && (F = F(i10)) != null) {
                            return F.contentsEquals(this, w51Var);
                        }
                        return H(w51Var);
                    } else if (this.d == w51Var.d && TextUtils.equals(this.f29948l, w51Var.f29948l) && this.e == w51Var.e) {
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
        v51 F;
        if (this != obj) {
            if (obj != null && w51.class == obj.getClass()) {
                w51 w51Var = (w51) obj;
                int i10 = this.f15704a;
                if (i10 == w51Var.f15704a) {
                    if (i10 != 36 && i10 != 35) {
                        if (i10 == 28) {
                            if (this.d == w51Var.d) {
                                return true;
                            }
                            return false;
                        } else if (i10 == 31) {
                            return TextUtils.equals(this.f29948l, w51Var.f29948l);
                        } else {
                            if (i10 >= 10000 && (F = F(i10)) != null) {
                                return F.equals(this, w51Var);
                            }
                            return I(w51Var);
                        }
                    } else if (this.d == w51Var.d) {
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
