package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import j$.util.Objects;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;
public final class w31 extends rg.a {
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
    public View f39823c;
    public int d;
    public boolean f39824e;
    public boolean f39825f;
    public boolean f39826g;
    public boolean h;
    public int f39827i;
    public boolean f39828j;
    public int f39829k;
    public CharSequence f39830l;
    public CharSequence f39831m;
    public CharSequence f39832n;
    public CharSequence f39833o;
    public String[] f39834p;
    public boolean f39835q;
    public boolean f39836r;
    public boolean f39837s;
    public boolean f39838t;
    public int f39839u;
    public int v;
    public boolean f39840w;
    public long f39841x;
    public int f39842y;
    public int f39843z;

    public w31(int i7) {
        super(i7, false);
        this.f39826g = true;
        this.f39839u = -1;
        this.I = true;
    }

    public static w31 A(String str, CharSequence charSequence, int i7) {
        w31 w31Var = new w31(41);
        w31Var.d = i7;
        w31Var.f39830l = charSequence;
        w31Var.f39833o = str;
        return w31Var;
    }

    public static w31 B(int i7, CharSequence charSequence) {
        w31 w31Var = new w31(7);
        w31Var.d = i7;
        w31Var.f39830l = charSequence;
        return w31Var;
    }

    public static w31 C(CharSequence charSequence) {
        w31 w31Var = new w31(7);
        w31Var.f39830l = charSequence;
        return w31Var;
    }

    public static w31 D(int i7) {
        w31 w31Var = new w31(28);
        w31Var.f39843z = i7;
        return w31Var;
    }

    public static w31 E(int i7, int i10) {
        w31 w31Var = new w31(28);
        w31Var.d = i7;
        w31Var.f39843z = i10;
        return w31Var;
    }

    public static w31 F(int i7, String str) {
        w31 w31Var = new w31(39);
        w31Var.d = i7;
        w31Var.f39830l = str;
        w31Var.f39843z = 1;
        return w31Var;
    }

    public static v31 G(int i7) {
        LongSparseArray longSparseArray = K;
        if (longSparseArray == null) {
            return null;
        }
        return (v31) longSparseArray.get(i7);
    }

    public static w31 K(Class cls) {
        if (L == null) {
            L = new HashMap();
        }
        if (K == null) {
            K = new LongSparseArray();
        }
        v31 v31Var = (v31) L.get(cls);
        if (v31Var != null) {
            return new w31(v31Var.f38813a);
        }
        throw new RuntimeException("UItemFactory was not setuped: " + cls);
    }

    public static w31 b(String str) {
        w31 w31Var = new w31(1);
        w31Var.f39830l = str;
        return w31Var;
    }

    public static w31 c(int i7, int i10, String str) {
        w31 w31Var = new w31(3);
        w31Var.d = i7;
        w31Var.f39829k = i10;
        w31Var.f39830l = str;
        return w31Var;
    }

    public static w31 d(int i7, int i10, String str, String str2) {
        w31 w31Var = new w31(3);
        w31Var.d = i7;
        w31Var.f39829k = i10;
        w31Var.f39830l = str;
        w31Var.f39832n = str2;
        return w31Var;
    }

    public static w31 e(int i7, String str) {
        w31 w31Var = new w31(3);
        w31Var.d = i7;
        w31Var.f39830l = str;
        return w31Var;
    }

    public static w31 f(String str, CharSequence charSequence, int i7) {
        w31 w31Var = new w31(3);
        w31Var.d = i7;
        w31Var.f39830l = str;
        w31Var.f39832n = charSequence;
        return w31Var;
    }

    public static w31 g(CharSequence charSequence) {
        w31 w31Var = new w31(7);
        w31Var.f39830l = charSequence;
        w31Var.f39835q = true;
        return w31Var;
    }

    public static w31 h(int i7, int i10, org.telegram.ui.o41 o41Var) {
        w31 w31Var = new w31(i7 + 18);
        w31Var.f39843z = i10;
        w31Var.G = o41Var;
        return w31Var;
    }

    public static w31 i(int i7, CharSequence charSequence) {
        w31 w31Var = new w31(4);
        w31Var.d = i7;
        w31Var.f39830l = charSequence;
        return w31Var;
    }

    public static w31 j(int i7, View view) {
        w31 w31Var = new w31(-1);
        w31Var.d = i7;
        w31Var.f39823c = view;
        w31Var.f39843z = -1;
        return w31Var;
    }

    public static w31 k(View view) {
        w31 w31Var = new w31(-1);
        w31Var.f39823c = view;
        w31Var.f39843z = -1;
        return w31Var;
    }

    public static w31 l(int i7, View view) {
        w31 w31Var = new w31(-4);
        w31Var.d = i7;
        w31Var.f39823c = view;
        w31Var.f39843z = -1;
        return w31Var;
    }

    public static w31 m(View view) {
        w31 w31Var = new w31(-4);
        w31Var.f39823c = view;
        w31Var.f39843z = -1;
        return w31Var;
    }

    public static w31 n(View view, int i7) {
        w31 w31Var = new w31(-4);
        w31Var.f39823c = view;
        w31Var.f39843z = i7;
        return w31Var;
    }

    public static w31 o(int i7, String str, String str2) {
        w31 w31Var = new w31(40);
        w31Var.d = i7;
        w31Var.f39830l = str;
        w31Var.f39833o = str2;
        return w31Var;
    }

    public static w31 p(int i7) {
        w31 w31Var = new w31(34);
        w31Var.f39843z = i7;
        return w31Var;
    }

    public static w31 q(int i7, int i10) {
        w31 w31Var = new w31(34);
        w31Var.d = i7;
        w31Var.f39843z = i10;
        return w31Var;
    }

    public static w31 r(String str) {
        w31 w31Var = new w31(31);
        w31Var.f39830l = str;
        return w31Var;
    }

    public static w31 s(String str, String str2, View.OnClickListener onClickListener) {
        w31 w31Var = new w31(31);
        w31Var.f39830l = str;
        w31Var.f39831m = str2;
        w31Var.D = onClickListener;
        return w31Var;
    }

    public static w31 t(int i7, String str) {
        w31 w31Var = new w31(0);
        w31Var.d = i7;
        w31Var.f39830l = str;
        return w31Var;
    }

    public static w31 u(String str) {
        w31 w31Var = new w31(0);
        w31Var.f39830l = str;
        return w31Var;
    }

    public static w31 v(org.telegram.ui.wd wdVar) {
        w31 w31Var = new w31(24);
        w31Var.G = wdVar;
        return w31Var;
    }

    public static w31 w(TLObject tLObject) {
        w31 w31Var = new w31(32);
        w31Var.G = tLObject;
        return w31Var;
    }

    public static w31 x(int i7, String str) {
        w31 w31Var = new w31(10);
        w31Var.d = i7;
        w31Var.f39830l = str;
        return w31Var;
    }

    public static w31 y(int i7, String str, String str2) {
        w31 w31Var = new w31(44);
        w31Var.d = i7;
        w31Var.f39830l = str;
        w31Var.f39832n = str2;
        return w31Var;
    }

    public static w31 z(int i7, CharSequence charSequence) {
        w31 w31Var = new w31(35);
        w31Var.d = i7;
        w31Var.f39830l = charSequence;
        return w31Var;
    }

    public final boolean H(Class cls) {
        HashMap hashMap;
        v31 v31Var;
        if (this.f54440a >= 10000 && (hashMap = L) != null && (v31Var = (v31) hashMap.get(cls)) != null && v31Var.f38813a == this.f54440a) {
            return true;
        }
        return false;
    }

    public final boolean I(org.telegram.ui.Components.w31 r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.w31.I(org.telegram.ui.Components.w31):boolean");
    }

    public final boolean J(w31 w31Var) {
        if (this.d == w31Var.d && this.f39827i == w31Var.f39827i && this.f39841x == w31Var.f39841x && this.f39829k == w31Var.f39829k && this.f39828j == w31Var.f39828j && this.f39837s == w31Var.f39837s && this.f39836r == w31Var.f39836r && this.f39838t == w31Var.f39838t && this.f39835q == w31Var.f39835q && this.f39823c == w31Var.f39823c && TextUtils.equals(this.f39830l, w31Var.f39830l) && TextUtils.equals(this.f39831m, w31Var.f39831m) && TextUtils.equals(this.f39832n, w31Var.f39832n) && this.f39823c == w31Var.f39823c && this.f39843z == w31Var.f39843z && Math.abs(this.A - w31Var.A) < 0.01f && this.B == w31Var.B && Objects.equals(this.G, w31Var.G) && Objects.equals(this.H, w31Var.H)) {
            return true;
        }
        return false;
    }

    public final void L(boolean z9) {
        this.f39824e = z9;
        if (this.f54440a == 11) {
            this.f54440a = 12;
        }
    }

    @Override
    public final boolean a(rg.a aVar) {
        v31 G;
        if (this != aVar) {
            if (w31.class == aVar.getClass()) {
                w31 w31Var = (w31) aVar;
                int i7 = this.f54440a;
                if (i7 == w31Var.f54440a) {
                    if (i7 == 31) {
                        if (TextUtils.equals(this.f39830l, w31Var.f39830l) && TextUtils.equals(this.f39831m, w31Var.f39831m)) {
                            return true;
                        }
                        return false;
                    } else if (i7 == 28) {
                        if (this.f39843z == w31Var.f39843z) {
                            return true;
                        }
                        return false;
                    } else if (i7 != 35 && i7 != 37) {
                        if (i7 >= 10000 && (G = G(i7)) != null) {
                            return G.c(this, w31Var);
                        }
                        return I(w31Var);
                    } else if (this.d == w31Var.d && TextUtils.equals(this.f39830l, w31Var.f39830l) && this.f39824e == w31Var.f39824e) {
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
        v31 G;
        if (this != obj) {
            if (obj != null && w31.class == obj.getClass()) {
                w31 w31Var = (w31) obj;
                int i7 = this.f54440a;
                if (i7 == w31Var.f54440a) {
                    if (i7 != 36 && i7 != 35) {
                        if (i7 == 28) {
                            if (this.d == w31Var.d) {
                                return true;
                            }
                            return false;
                        } else if (i7 == 31) {
                            return TextUtils.equals(this.f39830l, w31Var.f39830l);
                        } else {
                            if (i7 >= 10000 && (G = G(i7)) != null) {
                                return G.e(this, w31Var);
                            }
                            return J(w31Var);
                        }
                    } else if (this.d == w31Var.d) {
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
