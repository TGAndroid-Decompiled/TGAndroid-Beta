package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import j$.util.Objects;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ma1;
public final class r61 extends og.a {
    public static int J = 10000;
    public static LongSparseArray K;
    public static HashMap L;
    public float A;
    public long B;
    public Utilities.Callback C;
    public View.OnClickListener D;
    public View.OnClickListener E;
    public Utilities.Callback F;
    public Object G;
    public Object H;
    public boolean I;
    public View f30354c;
    public int d;
    public boolean f30355e;
    public boolean f30356f;
    public boolean f30357g;
    public boolean h;
    public int f30358i;
    public boolean f30359j;
    public int f30360k;
    public CharSequence f30361l;
    public CharSequence f30362m;
    public CharSequence f30363n;
    public CharSequence f30364o;
    public String[] f30365p;
    public boolean f30366q;
    public boolean f30367r;
    public boolean f30368s;
    public boolean f30369t;
    public int f30370u;
    public int v;
    public boolean f30371w;
    public long f30372x;
    public int f30373y;
    public int f30374z;

    public r61(int i10) {
        super(i10, false);
        this.f30357g = true;
        this.f30370u = -1;
        this.I = true;
    }

    public static r61 A(int i10, CharSequence charSequence) {
        r61 r61Var = new r61(7);
        r61Var.d = i10;
        r61Var.f30361l = charSequence;
        return r61Var;
    }

    public static r61 B(CharSequence charSequence) {
        r61 r61Var = new r61(7);
        r61Var.f30361l = charSequence;
        return r61Var;
    }

    public static r61 C(int i10) {
        r61 r61Var = new r61(28);
        r61Var.f30374z = i10;
        return r61Var;
    }

    public static r61 D(int i10, int i11) {
        r61 r61Var = new r61(28);
        r61Var.d = i10;
        r61Var.f30374z = i11;
        return r61Var;
    }

    public static r61 E(int i10, String str) {
        r61 r61Var = new r61(39);
        r61Var.d = i10;
        r61Var.f30361l = str;
        r61Var.f30374z = 1;
        return r61Var;
    }

    public static q61 F(int i10) {
        LongSparseArray longSparseArray = K;
        if (longSparseArray == null) {
            return null;
        }
        return (q61) longSparseArray.get(i10);
    }

    public static r61 J(Class cls) {
        if (L == null) {
            L = new HashMap();
        }
        if (K == null) {
            K = new LongSparseArray();
        }
        q61 q61Var = (q61) L.get(cls);
        if (q61Var != null) {
            return new r61(q61Var.viewType);
        }
        throw new RuntimeException("UItemFactory was not setuped: " + cls);
    }

    public static r61 b(String str) {
        r61 r61Var = new r61(1);
        r61Var.f30361l = str;
        return r61Var;
    }

    public static r61 c(int i10, int i11, String str) {
        r61 r61Var = new r61(3);
        r61Var.d = i10;
        r61Var.f30360k = i11;
        r61Var.f30361l = str;
        return r61Var;
    }

    public static r61 d(int i10, int i11, String str, String str2) {
        r61 r61Var = new r61(3);
        r61Var.d = i10;
        r61Var.f30360k = i11;
        r61Var.f30361l = str;
        r61Var.f30363n = str2;
        return r61Var;
    }

    public static r61 e(int i10, String str) {
        r61 r61Var = new r61(3);
        r61Var.d = i10;
        r61Var.f30361l = str;
        return r61Var;
    }

    public static r61 f(String str, CharSequence charSequence, int i10) {
        r61 r61Var = new r61(3);
        r61Var.d = i10;
        r61Var.f30361l = str;
        r61Var.f30363n = charSequence;
        return r61Var;
    }

    public static r61 g(CharSequence charSequence) {
        r61 r61Var = new r61(7);
        r61Var.f30361l = charSequence;
        r61Var.f30366q = true;
        return r61Var;
    }

    public static r61 h(int i10, int i11, ma1 ma1Var) {
        r61 r61Var = new r61(i10 + 18);
        r61Var.f30374z = i11;
        r61Var.G = ma1Var;
        return r61Var;
    }

    public static r61 i(int i10, CharSequence charSequence) {
        r61 r61Var = new r61(4);
        r61Var.d = i10;
        r61Var.f30361l = charSequence;
        return r61Var;
    }

    public static r61 j(int i10, View view) {
        r61 r61Var = new r61(-1);
        r61Var.d = i10;
        r61Var.f30354c = view;
        r61Var.f30374z = -1;
        return r61Var;
    }

    public static r61 k(View view) {
        r61 r61Var = new r61(-1);
        r61Var.f30354c = view;
        r61Var.f30374z = -1;
        return r61Var;
    }

    public static r61 l(View view) {
        r61 r61Var = new r61(-4);
        r61Var.f30354c = view;
        r61Var.f30374z = -1;
        return r61Var;
    }

    public static r61 m(int i10, String str, String str2) {
        r61 r61Var = new r61(40);
        r61Var.d = i10;
        r61Var.f30361l = str;
        r61Var.f30364o = str2;
        return r61Var;
    }

    public static r61 n(int i10) {
        r61 r61Var = new r61(34);
        r61Var.f30374z = i10;
        return r61Var;
    }

    public static r61 o(int i10, int i11) {
        r61 r61Var = new r61(34);
        r61Var.d = i10;
        r61Var.f30374z = i11;
        return r61Var;
    }

    public static r61 p(View view, int i10, boolean z10) {
        r61 r61Var = new r61(-3);
        r61Var.f30354c = view;
        r61Var.f30374z = i10;
        r61Var.f30373y = z10 ? 1 : 0;
        return r61Var;
    }

    public static r61 q(String str) {
        r61 r61Var = new r61(31);
        r61Var.f30361l = str;
        return r61Var;
    }

    public static r61 r(String str, String str2, View.OnClickListener onClickListener) {
        r61 r61Var = new r61(31);
        r61Var.f30361l = str;
        r61Var.f30362m = str2;
        r61Var.D = onClickListener;
        return r61Var;
    }

    public static r61 s(int i10, String str) {
        r61 r61Var = new r61(0);
        r61Var.d = i10;
        r61Var.f30361l = str;
        return r61Var;
    }

    public static r61 t(String str) {
        r61 r61Var = new r61(0);
        r61Var.f30361l = str;
        return r61Var;
    }

    public static r61 u(org.telegram.ui.ge geVar) {
        r61 r61Var = new r61(24);
        r61Var.G = geVar;
        return r61Var;
    }

    public static r61 v(TLObject tLObject) {
        r61 r61Var = new r61(32);
        r61Var.G = tLObject;
        return r61Var;
    }

    public static r61 w(int i10, String str) {
        r61 r61Var = new r61(10);
        r61Var.d = i10;
        r61Var.f30361l = str;
        return r61Var;
    }

    public static r61 x(int i10, String str, String str2) {
        r61 r61Var = new r61(44);
        r61Var.d = i10;
        r61Var.f30361l = str;
        r61Var.f30363n = str2;
        return r61Var;
    }

    public static r61 y(int i10, CharSequence charSequence) {
        r61 r61Var = new r61(35);
        r61Var.d = i10;
        r61Var.f30361l = charSequence;
        return r61Var;
    }

    public static r61 z(String str, CharSequence charSequence, int i10) {
        r61 r61Var = new r61(41);
        r61Var.d = i10;
        r61Var.f30361l = charSequence;
        r61Var.f30364o = str;
        return r61Var;
    }

    public final boolean G(Class cls) {
        HashMap hashMap;
        q61 q61Var;
        if (this.f17175a >= 10000 && (hashMap = L) != null && (q61Var = (q61) hashMap.get(cls)) != null && q61Var.viewType == this.f17175a) {
            return true;
        }
        return false;
    }

    public final boolean H(org.telegram.ui.Components.r61 r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.r61.H(org.telegram.ui.Components.r61):boolean");
    }

    public final boolean I(r61 r61Var) {
        if (this.d == r61Var.d && this.f30358i == r61Var.f30358i && this.f30372x == r61Var.f30372x && this.f30360k == r61Var.f30360k && this.f30359j == r61Var.f30359j && this.f30368s == r61Var.f30368s && this.f30367r == r61Var.f30367r && this.f30369t == r61Var.f30369t && this.f30366q == r61Var.f30366q && this.f30354c == r61Var.f30354c && TextUtils.equals(this.f30361l, r61Var.f30361l) && TextUtils.equals(this.f30362m, r61Var.f30362m) && TextUtils.equals(this.f30363n, r61Var.f30363n) && this.f30354c == r61Var.f30354c && this.f30374z == r61Var.f30374z && Math.abs(this.A - r61Var.A) < 0.01f && this.B == r61Var.B && Objects.equals(this.G, r61Var.G) && Objects.equals(this.H, r61Var.H)) {
            return true;
        }
        return false;
    }

    public final void K(boolean z10) {
        this.f30355e = z10;
        if (this.f17175a == 11) {
            this.f17175a = 12;
        }
    }

    @Override
    public final boolean a(og.a aVar) {
        q61 F;
        if (this != aVar) {
            if (r61.class == aVar.getClass()) {
                r61 r61Var = (r61) aVar;
                int i10 = this.f17175a;
                if (i10 == r61Var.f17175a) {
                    if (i10 == 31) {
                        if (TextUtils.equals(this.f30361l, r61Var.f30361l) && TextUtils.equals(this.f30362m, r61Var.f30362m)) {
                            return true;
                        }
                        return false;
                    } else if (i10 == 28) {
                        if (this.f30374z == r61Var.f30374z) {
                            return true;
                        }
                        return false;
                    } else if (i10 != 35 && i10 != 37) {
                        if (i10 >= 10000 && (F = F(i10)) != null) {
                            return F.contentsEquals(this, r61Var);
                        }
                        return H(r61Var);
                    } else if (this.d == r61Var.d && TextUtils.equals(this.f30361l, r61Var.f30361l) && this.f30355e == r61Var.f30355e) {
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
        q61 F;
        if (this != obj) {
            if (obj != null && r61.class == obj.getClass()) {
                r61 r61Var = (r61) obj;
                int i10 = this.f17175a;
                if (i10 == r61Var.f17175a) {
                    if (i10 != 36 && i10 != 35) {
                        if (i10 == 28) {
                            if (this.d == r61Var.d) {
                                return true;
                            }
                            return false;
                        } else if (i10 == 31) {
                            return TextUtils.equals(this.f30361l, r61Var.f30361l);
                        } else {
                            if (i10 >= 10000 && (F = F(i10)) != null) {
                                return F.equals(this, r61Var);
                            }
                            return I(r61Var);
                        }
                    } else if (this.d == r61Var.d) {
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
