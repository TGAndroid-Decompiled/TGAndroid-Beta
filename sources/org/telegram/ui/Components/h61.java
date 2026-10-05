package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import j$.util.Objects;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.fa1;
public final class h61 extends og.a {
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
    public View f27086c;
    public int d;
    public boolean f27087e;
    public boolean f27088f;
    public boolean f27089g;
    public boolean h;
    public int f27090i;
    public boolean f27091j;
    public int f27092k;
    public CharSequence f27093l;
    public CharSequence f27094m;
    public CharSequence f27095n;
    public CharSequence f27096o;
    public String[] f27097p;
    public boolean f27098q;
    public boolean f27099r;
    public boolean f27100s;
    public boolean f27101t;
    public int f27102u;
    public int v;
    public boolean f27103w;
    public long f27104x;
    public int f27105y;
    public int f27106z;

    public h61(int i10) {
        super(i10, false);
        this.f27089g = true;
        this.f27102u = -1;
        this.I = true;
    }

    public static h61 A(String str, CharSequence charSequence, int i10) {
        h61 h61Var = new h61(41);
        h61Var.d = i10;
        h61Var.f27093l = charSequence;
        h61Var.f27096o = str;
        return h61Var;
    }

    public static h61 B(int i10, CharSequence charSequence) {
        h61 h61Var = new h61(7);
        h61Var.d = i10;
        h61Var.f27093l = charSequence;
        return h61Var;
    }

    public static h61 C(CharSequence charSequence) {
        h61 h61Var = new h61(7);
        h61Var.f27093l = charSequence;
        return h61Var;
    }

    public static h61 D(int i10) {
        h61 h61Var = new h61(28);
        h61Var.f27106z = i10;
        return h61Var;
    }

    public static h61 E(int i10, int i11) {
        h61 h61Var = new h61(28);
        h61Var.d = i10;
        h61Var.f27106z = i11;
        return h61Var;
    }

    public static h61 F(int i10, String str) {
        h61 h61Var = new h61(39);
        h61Var.d = i10;
        h61Var.f27093l = str;
        h61Var.f27106z = 1;
        return h61Var;
    }

    public static g61 G(int i10) {
        LongSparseArray longSparseArray = K;
        if (longSparseArray == null) {
            return null;
        }
        return (g61) longSparseArray.get(i10);
    }

    public static h61 K(Class cls) {
        if (L == null) {
            L = new HashMap();
        }
        if (K == null) {
            K = new LongSparseArray();
        }
        g61 g61Var = (g61) L.get(cls);
        if (g61Var != null) {
            return new h61(g61Var.viewType);
        }
        throw new RuntimeException("UItemFactory was not setuped: " + cls);
    }

    public static h61 b(String str) {
        h61 h61Var = new h61(1);
        h61Var.f27093l = str;
        return h61Var;
    }

    public static h61 c(int i10, int i11, String str) {
        h61 h61Var = new h61(3);
        h61Var.d = i10;
        h61Var.f27092k = i11;
        h61Var.f27093l = str;
        return h61Var;
    }

    public static h61 d(int i10, int i11, String str, String str2) {
        h61 h61Var = new h61(3);
        h61Var.d = i10;
        h61Var.f27092k = i11;
        h61Var.f27093l = str;
        h61Var.f27095n = str2;
        return h61Var;
    }

    public static h61 e(int i10, String str) {
        h61 h61Var = new h61(3);
        h61Var.d = i10;
        h61Var.f27093l = str;
        return h61Var;
    }

    public static h61 f(String str, CharSequence charSequence, int i10) {
        h61 h61Var = new h61(3);
        h61Var.d = i10;
        h61Var.f27093l = str;
        h61Var.f27095n = charSequence;
        return h61Var;
    }

    public static h61 g(CharSequence charSequence) {
        h61 h61Var = new h61(7);
        h61Var.f27093l = charSequence;
        h61Var.f27098q = true;
        return h61Var;
    }

    public static h61 h(int i10, int i11, fa1 fa1Var) {
        h61 h61Var = new h61(i10 + 18);
        h61Var.f27106z = i11;
        h61Var.G = fa1Var;
        return h61Var;
    }

    public static h61 i(int i10, CharSequence charSequence) {
        h61 h61Var = new h61(4);
        h61Var.d = i10;
        h61Var.f27093l = charSequence;
        return h61Var;
    }

    public static h61 j(int i10, View view) {
        h61 h61Var = new h61(-1);
        h61Var.d = i10;
        h61Var.f27086c = view;
        h61Var.f27106z = -1;
        return h61Var;
    }

    public static h61 k(View view) {
        h61 h61Var = new h61(-1);
        h61Var.f27086c = view;
        h61Var.f27106z = -1;
        return h61Var;
    }

    public static h61 l(int i10, View view) {
        h61 h61Var = new h61(-4);
        h61Var.d = i10;
        h61Var.f27086c = view;
        h61Var.f27106z = -1;
        return h61Var;
    }

    public static h61 m(View view) {
        h61 h61Var = new h61(-4);
        h61Var.f27086c = view;
        h61Var.f27106z = -1;
        return h61Var;
    }

    public static h61 n(View view, int i10) {
        h61 h61Var = new h61(-4);
        h61Var.f27086c = view;
        h61Var.f27106z = i10;
        return h61Var;
    }

    public static h61 o(int i10, String str, String str2) {
        h61 h61Var = new h61(40);
        h61Var.d = i10;
        h61Var.f27093l = str;
        h61Var.f27096o = str2;
        return h61Var;
    }

    public static h61 p(int i10) {
        h61 h61Var = new h61(34);
        h61Var.f27106z = i10;
        return h61Var;
    }

    public static h61 q(int i10, int i11) {
        h61 h61Var = new h61(34);
        h61Var.d = i10;
        h61Var.f27106z = i11;
        return h61Var;
    }

    public static h61 r(String str) {
        h61 h61Var = new h61(31);
        h61Var.f27093l = str;
        return h61Var;
    }

    public static h61 s(String str, String str2, View.OnClickListener onClickListener) {
        h61 h61Var = new h61(31);
        h61Var.f27093l = str;
        h61Var.f27094m = str2;
        h61Var.D = onClickListener;
        return h61Var;
    }

    public static h61 t(int i10, String str) {
        h61 h61Var = new h61(0);
        h61Var.d = i10;
        h61Var.f27093l = str;
        return h61Var;
    }

    public static h61 u(String str) {
        h61 h61Var = new h61(0);
        h61Var.f27093l = str;
        return h61Var;
    }

    public static h61 v(org.telegram.ui.je jeVar) {
        h61 h61Var = new h61(24);
        h61Var.G = jeVar;
        return h61Var;
    }

    public static h61 w(TLObject tLObject) {
        h61 h61Var = new h61(32);
        h61Var.G = tLObject;
        return h61Var;
    }

    public static h61 x(int i10, String str) {
        h61 h61Var = new h61(10);
        h61Var.d = i10;
        h61Var.f27093l = str;
        return h61Var;
    }

    public static h61 y(int i10, String str, String str2) {
        h61 h61Var = new h61(44);
        h61Var.d = i10;
        h61Var.f27093l = str;
        h61Var.f27095n = str2;
        return h61Var;
    }

    public static h61 z(int i10, CharSequence charSequence) {
        h61 h61Var = new h61(35);
        h61Var.d = i10;
        h61Var.f27093l = charSequence;
        return h61Var;
    }

    public final boolean H(Class cls) {
        HashMap hashMap;
        g61 g61Var;
        if (this.f17192a >= 10000 && (hashMap = L) != null && (g61Var = (g61) hashMap.get(cls)) != null && g61Var.viewType == this.f17192a) {
            return true;
        }
        return false;
    }

    public final boolean I(org.telegram.ui.Components.h61 r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.h61.I(org.telegram.ui.Components.h61):boolean");
    }

    public final boolean J(h61 h61Var) {
        if (this.d == h61Var.d && this.f27090i == h61Var.f27090i && this.f27104x == h61Var.f27104x && this.f27092k == h61Var.f27092k && this.f27091j == h61Var.f27091j && this.f27100s == h61Var.f27100s && this.f27099r == h61Var.f27099r && this.f27101t == h61Var.f27101t && this.f27098q == h61Var.f27098q && this.f27086c == h61Var.f27086c && TextUtils.equals(this.f27093l, h61Var.f27093l) && TextUtils.equals(this.f27094m, h61Var.f27094m) && TextUtils.equals(this.f27095n, h61Var.f27095n) && this.f27086c == h61Var.f27086c && this.f27106z == h61Var.f27106z && Math.abs(this.A - h61Var.A) < 0.01f && this.B == h61Var.B && Objects.equals(this.G, h61Var.G) && Objects.equals(this.H, h61Var.H)) {
            return true;
        }
        return false;
    }

    public final void L(boolean z10) {
        this.f27087e = z10;
        if (this.f17192a == 11) {
            this.f17192a = 12;
        }
    }

    @Override
    public final boolean a(og.a aVar) {
        g61 G;
        if (this != aVar) {
            if (h61.class == aVar.getClass()) {
                h61 h61Var = (h61) aVar;
                int i10 = this.f17192a;
                if (i10 == h61Var.f17192a) {
                    if (i10 == 31) {
                        if (TextUtils.equals(this.f27093l, h61Var.f27093l) && TextUtils.equals(this.f27094m, h61Var.f27094m)) {
                            return true;
                        }
                        return false;
                    } else if (i10 == 28) {
                        if (this.f27106z == h61Var.f27106z) {
                            return true;
                        }
                        return false;
                    } else if (i10 != 35 && i10 != 37) {
                        if (i10 >= 10000 && (G = G(i10)) != null) {
                            return G.contentsEquals(this, h61Var);
                        }
                        return I(h61Var);
                    } else if (this.d == h61Var.d && TextUtils.equals(this.f27093l, h61Var.f27093l) && this.f27087e == h61Var.f27087e) {
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
        g61 G;
        if (this != obj) {
            if (obj != null && h61.class == obj.getClass()) {
                h61 h61Var = (h61) obj;
                int i10 = this.f17192a;
                if (i10 == h61Var.f17192a) {
                    if (i10 != 36 && i10 != 35) {
                        if (i10 == 28) {
                            if (this.d == h61Var.d) {
                                return true;
                            }
                            return false;
                        } else if (i10 == 31) {
                            return TextUtils.equals(this.f27093l, h61Var.f27093l);
                        } else {
                            if (i10 >= 10000 && (G = G(i10)) != null) {
                                return G.equals(this, h61Var);
                            }
                            return J(h61Var);
                        }
                    } else if (this.d == h61Var.d) {
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
