package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import j$.util.Objects;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.e91;
public final class l41 extends wf.a {
    public static int J = 10000;
    public static LongSparseArray K;
    public static HashMap L;
    public float A;
    public long B;
    public Utilities.Callback C;
    public View.OnClickListener D;
    public View.OnClickListener E;
    public org.telegram.ui.w3 F;
    public Object G;
    public Object H;
    public boolean I;
    public View f30332c;
    public int d;
    public boolean f30333e;
    public boolean f30334f;
    public boolean f30335g;
    public boolean h;
    public int f30336i;
    public boolean f30337j;
    public int f30338k;
    public CharSequence f30339l;
    public CharSequence f30340m;
    public CharSequence f30341n;
    public CharSequence f30342o;
    public String[] f30343p;
    public boolean f30344q;
    public boolean f30345r;
    public boolean f30346s;
    public boolean f30347t;
    public int f30348u;
    public int v;
    public boolean f30349w;
    public long f30350x;
    public int f30351y;
    public int f30352z;

    public l41(int i9) {
        super(i9, false);
        this.f30335g = true;
        this.f30348u = -1;
        this.I = true;
    }

    public static l41 A(int i9, CharSequence charSequence) {
        l41 l41Var = new l41(7);
        l41Var.d = i9;
        l41Var.f30339l = charSequence;
        return l41Var;
    }

    public static l41 B(CharSequence charSequence) {
        l41 l41Var = new l41(7);
        l41Var.f30339l = charSequence;
        return l41Var;
    }

    public static l41 C(int i9) {
        l41 l41Var = new l41(28);
        l41Var.f30352z = i9;
        return l41Var;
    }

    public static l41 D(int i9, int i10) {
        l41 l41Var = new l41(28);
        l41Var.d = i9;
        l41Var.f30352z = i10;
        return l41Var;
    }

    public static l41 E(int i9, String str) {
        l41 l41Var = new l41(39);
        l41Var.d = i9;
        l41Var.f30339l = str;
        l41Var.f30352z = 1;
        return l41Var;
    }

    public static k41 F(int i9) {
        LongSparseArray longSparseArray = K;
        if (longSparseArray == null) {
            return null;
        }
        return (k41) longSparseArray.get(i9);
    }

    public static l41 J(Class cls) {
        if (L == null) {
            L = new HashMap();
        }
        if (K == null) {
            K = new LongSparseArray();
        }
        k41 k41Var = (k41) L.get(cls);
        if (k41Var != null) {
            return new l41(k41Var.viewType);
        }
        throw new RuntimeException("UItemFactory was not setuped: " + cls);
    }

    public static l41 b(String str) {
        l41 l41Var = new l41(1);
        l41Var.f30339l = str;
        return l41Var;
    }

    public static l41 c(int i9, int i10, String str) {
        l41 l41Var = new l41(3);
        l41Var.d = i9;
        l41Var.f30338k = i10;
        l41Var.f30339l = str;
        return l41Var;
    }

    public static l41 d(int i9, int i10, String str, String str2) {
        l41 l41Var = new l41(3);
        l41Var.d = i9;
        l41Var.f30338k = i10;
        l41Var.f30339l = str;
        l41Var.f30341n = str2;
        return l41Var;
    }

    public static l41 e(int i9, String str) {
        l41 l41Var = new l41(3);
        l41Var.d = i9;
        l41Var.f30339l = str;
        return l41Var;
    }

    public static l41 f(String str, CharSequence charSequence, int i9) {
        l41 l41Var = new l41(3);
        l41Var.d = i9;
        l41Var.f30339l = str;
        l41Var.f30341n = charSequence;
        return l41Var;
    }

    public static l41 g(CharSequence charSequence) {
        l41 l41Var = new l41(7);
        l41Var.f30339l = charSequence;
        l41Var.f30344q = true;
        return l41Var;
    }

    public static l41 h(int i9, int i10, e91 e91Var) {
        l41 l41Var = new l41(i9 + 18);
        l41Var.f30352z = i10;
        l41Var.G = e91Var;
        return l41Var;
    }

    public static l41 i(int i9, CharSequence charSequence) {
        l41 l41Var = new l41(4);
        l41Var.d = i9;
        l41Var.f30339l = charSequence;
        return l41Var;
    }

    public static l41 j(int i9, View view) {
        l41 l41Var = new l41(-1);
        l41Var.d = i9;
        l41Var.f30332c = view;
        l41Var.f30352z = -1;
        return l41Var;
    }

    public static l41 k(View view) {
        l41 l41Var = new l41(-1);
        l41Var.f30332c = view;
        l41Var.f30352z = -1;
        return l41Var;
    }

    public static l41 l(View view) {
        l41 l41Var = new l41(-4);
        l41Var.f30332c = view;
        l41Var.f30352z = -1;
        return l41Var;
    }

    public static l41 m(int i9, String str, String str2) {
        l41 l41Var = new l41(40);
        l41Var.d = i9;
        l41Var.f30339l = str;
        l41Var.f30342o = str2;
        return l41Var;
    }

    public static l41 n(int i9) {
        l41 l41Var = new l41(34);
        l41Var.f30352z = i9;
        return l41Var;
    }

    public static l41 o(int i9, int i10) {
        l41 l41Var = new l41(34);
        l41Var.d = i9;
        l41Var.f30352z = i10;
        return l41Var;
    }

    public static l41 p(View view, int i9, boolean z10) {
        l41 l41Var = new l41(-3);
        l41Var.f30332c = view;
        l41Var.f30352z = i9;
        l41Var.f30351y = z10 ? 1 : 0;
        return l41Var;
    }

    public static l41 q(String str) {
        l41 l41Var = new l41(31);
        l41Var.f30339l = str;
        return l41Var;
    }

    public static l41 r(String str, String str2, View.OnClickListener onClickListener) {
        l41 l41Var = new l41(31);
        l41Var.f30339l = str;
        l41Var.f30340m = str2;
        l41Var.D = onClickListener;
        return l41Var;
    }

    public static l41 s(int i9, String str) {
        l41 l41Var = new l41(0);
        l41Var.d = i9;
        l41Var.f30339l = str;
        return l41Var;
    }

    public static l41 t(String str) {
        l41 l41Var = new l41(0);
        l41Var.f30339l = str;
        return l41Var;
    }

    public static l41 u(org.telegram.ui.ce ceVar) {
        l41 l41Var = new l41(24);
        l41Var.G = ceVar;
        return l41Var;
    }

    public static l41 v(TLObject tLObject) {
        l41 l41Var = new l41(32);
        l41Var.G = tLObject;
        return l41Var;
    }

    public static l41 w(int i9, String str) {
        l41 l41Var = new l41(10);
        l41Var.d = i9;
        l41Var.f30339l = str;
        return l41Var;
    }

    public static l41 x(int i9, String str, String str2) {
        l41 l41Var = new l41(44);
        l41Var.d = i9;
        l41Var.f30339l = str;
        l41Var.f30341n = str2;
        return l41Var;
    }

    public static l41 y(int i9, CharSequence charSequence) {
        l41 l41Var = new l41(35);
        l41Var.d = i9;
        l41Var.f30339l = charSequence;
        return l41Var;
    }

    public static l41 z(String str, CharSequence charSequence, int i9) {
        l41 l41Var = new l41(41);
        l41Var.d = i9;
        l41Var.f30339l = charSequence;
        l41Var.f30342o = str;
        return l41Var;
    }

    public final boolean G(Class cls) {
        HashMap hashMap;
        k41 k41Var;
        if (this.f48814a >= 10000 && (hashMap = L) != null && (k41Var = (k41) hashMap.get(cls)) != null && k41Var.viewType == this.f48814a) {
            return true;
        }
        return false;
    }

    public final boolean H(org.telegram.ui.Components.l41 r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.l41.H(org.telegram.ui.Components.l41):boolean");
    }

    public final boolean I(l41 l41Var) {
        if (this.d == l41Var.d && this.f30336i == l41Var.f30336i && this.f30350x == l41Var.f30350x && this.f30338k == l41Var.f30338k && this.f30337j == l41Var.f30337j && this.f30346s == l41Var.f30346s && this.f30345r == l41Var.f30345r && this.f30347t == l41Var.f30347t && this.f30344q == l41Var.f30344q && this.f30332c == l41Var.f30332c && TextUtils.equals(this.f30339l, l41Var.f30339l) && TextUtils.equals(this.f30340m, l41Var.f30340m) && TextUtils.equals(this.f30341n, l41Var.f30341n) && this.f30332c == l41Var.f30332c && this.f30352z == l41Var.f30352z && Math.abs(this.A - l41Var.A) < 0.01f && this.B == l41Var.B && Objects.equals(this.G, l41Var.G) && Objects.equals(this.H, l41Var.H)) {
            return true;
        }
        return false;
    }

    public final void K(boolean z10) {
        this.f30333e = z10;
        if (this.f48814a == 11) {
            this.f48814a = 12;
        }
    }

    @Override
    public final boolean a(wf.a aVar) {
        k41 F;
        if (this != aVar) {
            if (l41.class == aVar.getClass()) {
                l41 l41Var = (l41) aVar;
                int i9 = this.f48814a;
                if (i9 == l41Var.f48814a) {
                    if (i9 == 31) {
                        if (TextUtils.equals(this.f30339l, l41Var.f30339l) && TextUtils.equals(this.f30340m, l41Var.f30340m)) {
                            return true;
                        }
                        return false;
                    } else if (i9 == 28) {
                        if (this.f30352z == l41Var.f30352z) {
                            return true;
                        }
                        return false;
                    } else if (i9 != 35 && i9 != 37) {
                        if (i9 >= 10000 && (F = F(i9)) != null) {
                            return F.contentsEquals(this, l41Var);
                        }
                        return H(l41Var);
                    } else if (this.d == l41Var.d && TextUtils.equals(this.f30339l, l41Var.f30339l) && this.f30333e == l41Var.f30333e) {
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
        k41 F;
        if (this != obj) {
            if (obj != null && l41.class == obj.getClass()) {
                l41 l41Var = (l41) obj;
                int i9 = this.f48814a;
                if (i9 == l41Var.f48814a) {
                    if (i9 != 36 && i9 != 35) {
                        if (i9 == 28) {
                            if (this.d == l41Var.d) {
                                return true;
                            }
                            return false;
                        } else if (i9 == 31) {
                            return TextUtils.equals(this.f30339l, l41Var.f30339l);
                        } else {
                            if (i9 >= 10000 && (F = F(i9)) != null) {
                                return F.equals(this, l41Var);
                            }
                            return I(l41Var);
                        }
                    } else if (this.d == l41Var.d) {
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
