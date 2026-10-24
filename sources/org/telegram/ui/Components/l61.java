package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import j$.util.Objects;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
public final class l61 extends pg.a {
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
    public View f28221c;
    public int d;
    public boolean e;
    public boolean f28222f;
    public boolean f28223g;
    public boolean h;
    public int f28224i;
    public boolean f28225j;
    public int f28226k;
    public CharSequence f28227l;
    public CharSequence f28228m;
    public CharSequence f28229n;
    public CharSequence f28230o;
    public String[] f28231p;
    public boolean f28232q;
    public boolean f28233r;
    public boolean f28234s;
    public boolean f28235t;
    public int f28236u;
    public int v;
    public boolean f28237w;
    public long f28238x;
    public int f28239y;
    public int f28240z;

    public l61(int i10) {
        super(i10, false);
        this.f28223g = true;
        this.f28236u = -1;
        this.I = true;
    }

    public static l61 A(int i10, CharSequence charSequence) {
        l61 l61Var = new l61(7);
        l61Var.d = i10;
        l61Var.f28227l = charSequence;
        return l61Var;
    }

    public static l61 B(CharSequence charSequence) {
        l61 l61Var = new l61(7);
        l61Var.f28227l = charSequence;
        return l61Var;
    }

    public static l61 C(int i10) {
        l61 l61Var = new l61(28);
        l61Var.f28240z = i10;
        return l61Var;
    }

    public static l61 D(int i10, int i11) {
        l61 l61Var = new l61(28);
        l61Var.d = i10;
        l61Var.f28240z = i11;
        return l61Var;
    }

    public static l61 E(int i10, String str) {
        l61 l61Var = new l61(39);
        l61Var.d = i10;
        l61Var.f28227l = str;
        l61Var.f28240z = 1;
        return l61Var;
    }

    public static k61 F(int i10) {
        LongSparseArray longSparseArray = K;
        if (longSparseArray == null) {
            return null;
        }
        return (k61) longSparseArray.get(i10);
    }

    public static l61 J(Class cls) {
        if (L == null) {
            L = new HashMap();
        }
        if (K == null) {
            K = new LongSparseArray();
        }
        k61 k61Var = (k61) L.get(cls);
        if (k61Var != null) {
            return new l61(k61Var.viewType);
        }
        throw new RuntimeException("UItemFactory was not setuped: " + cls);
    }

    public static l61 b(String str) {
        l61 l61Var = new l61(1);
        l61Var.f28227l = str;
        return l61Var;
    }

    public static l61 c(int i10, int i11, String str) {
        l61 l61Var = new l61(3);
        l61Var.d = i10;
        l61Var.f28226k = i11;
        l61Var.f28227l = str;
        return l61Var;
    }

    public static l61 d(int i10, int i11, String str, String str2) {
        l61 l61Var = new l61(3);
        l61Var.d = i10;
        l61Var.f28226k = i11;
        l61Var.f28227l = str;
        l61Var.f28229n = str2;
        return l61Var;
    }

    public static l61 e(int i10, String str) {
        l61 l61Var = new l61(3);
        l61Var.d = i10;
        l61Var.f28227l = str;
        return l61Var;
    }

    public static l61 f(String str, CharSequence charSequence, int i10) {
        l61 l61Var = new l61(3);
        l61Var.d = i10;
        l61Var.f28227l = str;
        l61Var.f28229n = charSequence;
        return l61Var;
    }

    public static l61 g(CharSequence charSequence) {
        l61 l61Var = new l61(7);
        l61Var.f28227l = charSequence;
        l61Var.f28232q = true;
        return l61Var;
    }

    public static l61 h(int i10, int i11, org.telegram.ui.f91 f91Var) {
        l61 l61Var = new l61(i10 + 18);
        l61Var.f28240z = i11;
        l61Var.G = f91Var;
        return l61Var;
    }

    public static l61 i(int i10, CharSequence charSequence) {
        l61 l61Var = new l61(4);
        l61Var.d = i10;
        l61Var.f28227l = charSequence;
        return l61Var;
    }

    public static l61 j(int i10, View view) {
        l61 l61Var = new l61(-1);
        l61Var.d = i10;
        l61Var.f28221c = view;
        l61Var.f28240z = -1;
        return l61Var;
    }

    public static l61 k(View view) {
        l61 l61Var = new l61(-1);
        l61Var.f28221c = view;
        l61Var.f28240z = -1;
        return l61Var;
    }

    public static l61 l(View view) {
        l61 l61Var = new l61(-4);
        l61Var.f28221c = view;
        l61Var.f28240z = -1;
        return l61Var;
    }

    public static l61 m(int i10, String str, String str2) {
        l61 l61Var = new l61(40);
        l61Var.d = i10;
        l61Var.f28227l = str;
        l61Var.f28230o = str2;
        return l61Var;
    }

    public static l61 n(int i10) {
        l61 l61Var = new l61(34);
        l61Var.f28240z = i10;
        return l61Var;
    }

    public static l61 o(int i10, int i11) {
        l61 l61Var = new l61(34);
        l61Var.d = i10;
        l61Var.f28240z = i11;
        return l61Var;
    }

    public static l61 p(View view, int i10, boolean z10) {
        l61 l61Var = new l61(-3);
        l61Var.f28221c = view;
        l61Var.f28240z = i10;
        l61Var.f28239y = z10 ? 1 : 0;
        return l61Var;
    }

    public static l61 q(String str) {
        l61 l61Var = new l61(31);
        l61Var.f28227l = str;
        return l61Var;
    }

    public static l61 r(String str, String str2, View.OnClickListener onClickListener) {
        l61 l61Var = new l61(31);
        l61Var.f28227l = str;
        l61Var.f28228m = str2;
        l61Var.D = onClickListener;
        return l61Var;
    }

    public static l61 s(int i10, String str) {
        l61 l61Var = new l61(0);
        l61Var.d = i10;
        l61Var.f28227l = str;
        return l61Var;
    }

    public static l61 t(String str) {
        l61 l61Var = new l61(0);
        l61Var.f28227l = str;
        return l61Var;
    }

    public static l61 u(org.telegram.ui.fe feVar) {
        l61 l61Var = new l61(24);
        l61Var.G = feVar;
        return l61Var;
    }

    public static l61 v(TLObject tLObject) {
        l61 l61Var = new l61(32);
        l61Var.G = tLObject;
        return l61Var;
    }

    public static l61 w(int i10, String str) {
        l61 l61Var = new l61(10);
        l61Var.d = i10;
        l61Var.f28227l = str;
        return l61Var;
    }

    public static l61 x(int i10, String str, String str2) {
        l61 l61Var = new l61(44);
        l61Var.d = i10;
        l61Var.f28227l = str;
        l61Var.f28229n = str2;
        return l61Var;
    }

    public static l61 y(int i10, CharSequence charSequence) {
        l61 l61Var = new l61(35);
        l61Var.d = i10;
        l61Var.f28227l = charSequence;
        return l61Var;
    }

    public static l61 z(String str, CharSequence charSequence, int i10) {
        l61 l61Var = new l61(41);
        l61Var.d = i10;
        l61Var.f28227l = charSequence;
        l61Var.f28230o = str;
        return l61Var;
    }

    public final boolean G(Class cls) {
        HashMap hashMap;
        k61 k61Var;
        if (this.f44712a >= 10000 && (hashMap = L) != null && (k61Var = (k61) hashMap.get(cls)) != null && k61Var.viewType == this.f44712a) {
            return true;
        }
        return false;
    }

    public final boolean H(org.telegram.ui.Components.l61 r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.l61.H(org.telegram.ui.Components.l61):boolean");
    }

    public final boolean I(l61 l61Var) {
        if (this.d == l61Var.d && this.f28224i == l61Var.f28224i && this.f28238x == l61Var.f28238x && this.f28226k == l61Var.f28226k && this.f28225j == l61Var.f28225j && this.f28234s == l61Var.f28234s && this.f28233r == l61Var.f28233r && this.f28235t == l61Var.f28235t && this.f28232q == l61Var.f28232q && this.f28221c == l61Var.f28221c && TextUtils.equals(this.f28227l, l61Var.f28227l) && TextUtils.equals(this.f28228m, l61Var.f28228m) && TextUtils.equals(this.f28229n, l61Var.f28229n) && this.f28221c == l61Var.f28221c && this.f28240z == l61Var.f28240z && Math.abs(this.A - l61Var.A) < 0.01f && this.B == l61Var.B && Objects.equals(this.G, l61Var.G) && Objects.equals(this.H, l61Var.H)) {
            return true;
        }
        return false;
    }

    public final void K(boolean z10) {
        this.e = z10;
        if (this.f44712a == 11) {
            this.f44712a = 12;
        }
    }

    @Override
    public final boolean a(pg.a aVar) {
        k61 F;
        if (this != aVar) {
            if (l61.class == aVar.getClass()) {
                l61 l61Var = (l61) aVar;
                int i10 = this.f44712a;
                if (i10 == l61Var.f44712a) {
                    if (i10 == 31) {
                        if (TextUtils.equals(this.f28227l, l61Var.f28227l) && TextUtils.equals(this.f28228m, l61Var.f28228m)) {
                            return true;
                        }
                        return false;
                    } else if (i10 == 28) {
                        if (this.f28240z == l61Var.f28240z) {
                            return true;
                        }
                        return false;
                    } else if (i10 != 35 && i10 != 37) {
                        if (i10 >= 10000 && (F = F(i10)) != null) {
                            return F.contentsEquals(this, l61Var);
                        }
                        return H(l61Var);
                    } else if (this.d == l61Var.d && TextUtils.equals(this.f28227l, l61Var.f28227l) && this.e == l61Var.e) {
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
        k61 F;
        if (this != obj) {
            if (obj != null && l61.class == obj.getClass()) {
                l61 l61Var = (l61) obj;
                int i10 = this.f44712a;
                if (i10 == l61Var.f44712a) {
                    if (i10 != 36 && i10 != 35) {
                        if (i10 == 28) {
                            if (this.d == l61Var.d) {
                                return true;
                            }
                            return false;
                        } else if (i10 == 31) {
                            return TextUtils.equals(this.f28227l, l61Var.f28227l);
                        } else {
                            if (i10 >= 10000 && (F = F(i10)) != null) {
                                return F.equals(this, l61Var);
                            }
                            return I(l61Var);
                        }
                    } else if (this.d == l61Var.d) {
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
