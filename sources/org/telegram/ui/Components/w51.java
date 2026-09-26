package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import j$.util.Objects;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ea1;
public final class w51 extends og.a {
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
    public View f29889c;
    public int d;
    public boolean e;
    public boolean f29890f;
    public boolean f29891g;
    public boolean h;
    public int f29892i;
    public boolean f29893j;
    public int f29894k;
    public CharSequence f29895l;
    public CharSequence f29896m;
    public CharSequence f29897n;
    public CharSequence f29898o;
    public String[] f29899p;
    public boolean f29900q;
    public boolean f29901r;
    public boolean f29902s;
    public boolean f29903t;
    public int f29904u;
    public int v;
    public boolean f29905w;
    public long f29906x;
    public int f29907y;
    public int f29908z;

    public w51(int i10) {
        super(i10, false);
        this.f29891g = true;
        this.f29904u = -1;
        this.I = true;
    }

    public static w51 A(int i10, CharSequence charSequence) {
        w51 w51Var = new w51(7);
        w51Var.d = i10;
        w51Var.f29895l = charSequence;
        return w51Var;
    }

    public static w51 B(CharSequence charSequence) {
        w51 w51Var = new w51(7);
        w51Var.f29895l = charSequence;
        return w51Var;
    }

    public static w51 C(int i10) {
        w51 w51Var = new w51(28);
        w51Var.f29908z = i10;
        return w51Var;
    }

    public static w51 D(int i10, int i11) {
        w51 w51Var = new w51(28);
        w51Var.d = i10;
        w51Var.f29908z = i11;
        return w51Var;
    }

    public static w51 E(int i10, String str) {
        w51 w51Var = new w51(39);
        w51Var.d = i10;
        w51Var.f29895l = str;
        w51Var.f29908z = 1;
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
        w51Var.f29895l = str;
        return w51Var;
    }

    public static w51 c(int i10, int i11, String str) {
        w51 w51Var = new w51(3);
        w51Var.d = i10;
        w51Var.f29894k = i11;
        w51Var.f29895l = str;
        return w51Var;
    }

    public static w51 d(int i10, int i11, String str, String str2) {
        w51 w51Var = new w51(3);
        w51Var.d = i10;
        w51Var.f29894k = i11;
        w51Var.f29895l = str;
        w51Var.f29897n = str2;
        return w51Var;
    }

    public static w51 e(int i10, String str) {
        w51 w51Var = new w51(3);
        w51Var.d = i10;
        w51Var.f29895l = str;
        return w51Var;
    }

    public static w51 f(String str, CharSequence charSequence, int i10) {
        w51 w51Var = new w51(3);
        w51Var.d = i10;
        w51Var.f29895l = str;
        w51Var.f29897n = charSequence;
        return w51Var;
    }

    public static w51 g(CharSequence charSequence) {
        w51 w51Var = new w51(7);
        w51Var.f29895l = charSequence;
        w51Var.f29900q = true;
        return w51Var;
    }

    public static w51 h(int i10, int i11, ea1 ea1Var) {
        w51 w51Var = new w51(i10 + 18);
        w51Var.f29908z = i11;
        w51Var.G = ea1Var;
        return w51Var;
    }

    public static w51 i(int i10, CharSequence charSequence) {
        w51 w51Var = new w51(4);
        w51Var.d = i10;
        w51Var.f29895l = charSequence;
        return w51Var;
    }

    public static w51 j(int i10, View view) {
        w51 w51Var = new w51(-1);
        w51Var.d = i10;
        w51Var.f29889c = view;
        w51Var.f29908z = -1;
        return w51Var;
    }

    public static w51 k(View view) {
        w51 w51Var = new w51(-1);
        w51Var.f29889c = view;
        w51Var.f29908z = -1;
        return w51Var;
    }

    public static w51 l(View view) {
        w51 w51Var = new w51(-4);
        w51Var.f29889c = view;
        w51Var.f29908z = -1;
        return w51Var;
    }

    public static w51 m(int i10, String str, String str2) {
        w51 w51Var = new w51(40);
        w51Var.d = i10;
        w51Var.f29895l = str;
        w51Var.f29898o = str2;
        return w51Var;
    }

    public static w51 n(int i10) {
        w51 w51Var = new w51(34);
        w51Var.f29908z = i10;
        return w51Var;
    }

    public static w51 o(int i10, int i11) {
        w51 w51Var = new w51(34);
        w51Var.d = i10;
        w51Var.f29908z = i11;
        return w51Var;
    }

    public static w51 p(View view, int i10, boolean z10) {
        w51 w51Var = new w51(-3);
        w51Var.f29889c = view;
        w51Var.f29908z = i10;
        w51Var.f29907y = z10 ? 1 : 0;
        return w51Var;
    }

    public static w51 q(String str) {
        w51 w51Var = new w51(31);
        w51Var.f29895l = str;
        return w51Var;
    }

    public static w51 r(String str, String str2, View.OnClickListener onClickListener) {
        w51 w51Var = new w51(31);
        w51Var.f29895l = str;
        w51Var.f29896m = str2;
        w51Var.D = onClickListener;
        return w51Var;
    }

    public static w51 s(int i10, String str) {
        w51 w51Var = new w51(0);
        w51Var.d = i10;
        w51Var.f29895l = str;
        return w51Var;
    }

    public static w51 t(String str) {
        w51 w51Var = new w51(0);
        w51Var.f29895l = str;
        return w51Var;
    }

    public static w51 u(org.telegram.ui.ge geVar) {
        w51 w51Var = new w51(24);
        w51Var.G = geVar;
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
        w51Var.f29895l = str;
        return w51Var;
    }

    public static w51 x(int i10, String str, String str2) {
        w51 w51Var = new w51(44);
        w51Var.d = i10;
        w51Var.f29895l = str;
        w51Var.f29897n = str2;
        return w51Var;
    }

    public static w51 y(int i10, CharSequence charSequence) {
        w51 w51Var = new w51(35);
        w51Var.d = i10;
        w51Var.f29895l = charSequence;
        return w51Var;
    }

    public static w51 z(String str, CharSequence charSequence, int i10) {
        w51 w51Var = new w51(41);
        w51Var.d = i10;
        w51Var.f29895l = charSequence;
        w51Var.f29898o = str;
        return w51Var;
    }

    public final boolean G(Class cls) {
        HashMap hashMap;
        v51 v51Var;
        if (this.f15715a >= 10000 && (hashMap = L) != null && (v51Var = (v51) hashMap.get(cls)) != null && v51Var.viewType == this.f15715a) {
            return true;
        }
        return false;
    }

    public final boolean H(org.telegram.ui.Components.w51 r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.w51.H(org.telegram.ui.Components.w51):boolean");
    }

    public final boolean I(w51 w51Var) {
        if (this.d == w51Var.d && this.f29892i == w51Var.f29892i && this.f29906x == w51Var.f29906x && this.f29894k == w51Var.f29894k && this.f29893j == w51Var.f29893j && this.f29902s == w51Var.f29902s && this.f29901r == w51Var.f29901r && this.f29903t == w51Var.f29903t && this.f29900q == w51Var.f29900q && this.f29889c == w51Var.f29889c && TextUtils.equals(this.f29895l, w51Var.f29895l) && TextUtils.equals(this.f29896m, w51Var.f29896m) && TextUtils.equals(this.f29897n, w51Var.f29897n) && this.f29889c == w51Var.f29889c && this.f29908z == w51Var.f29908z && Math.abs(this.A - w51Var.A) < 0.01f && this.B == w51Var.B && Objects.equals(this.G, w51Var.G) && Objects.equals(this.H, w51Var.H)) {
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
        v51 F;
        if (this != aVar) {
            if (w51.class == aVar.getClass()) {
                w51 w51Var = (w51) aVar;
                int i10 = this.f15715a;
                if (i10 == w51Var.f15715a) {
                    if (i10 == 31) {
                        if (TextUtils.equals(this.f29895l, w51Var.f29895l) && TextUtils.equals(this.f29896m, w51Var.f29896m)) {
                            return true;
                        }
                        return false;
                    } else if (i10 == 28) {
                        if (this.f29908z == w51Var.f29908z) {
                            return true;
                        }
                        return false;
                    } else if (i10 != 35 && i10 != 37) {
                        if (i10 >= 10000 && (F = F(i10)) != null) {
                            return F.contentsEquals(this, w51Var);
                        }
                        return H(w51Var);
                    } else if (this.d == w51Var.d && TextUtils.equals(this.f29895l, w51Var.f29895l) && this.e == w51Var.e) {
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
                int i10 = this.f15715a;
                if (i10 == w51Var.f15715a) {
                    if (i10 != 36 && i10 != 35) {
                        if (i10 == 28) {
                            if (this.d == w51Var.d) {
                                return true;
                            }
                            return false;
                        } else if (i10 == 31) {
                            return TextUtils.equals(this.f29895l, w51Var.f29895l);
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
