package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import j$.util.Objects;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.na1;
public final class p61 extends og.a {
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
    public View f29727c;
    public int d;
    public boolean f29728e;
    public boolean f29729f;
    public boolean f29730g;
    public boolean h;
    public int f29731i;
    public boolean f29732j;
    public int f29733k;
    public CharSequence f29734l;
    public CharSequence f29735m;
    public CharSequence f29736n;
    public CharSequence f29737o;
    public String[] f29738p;
    public boolean f29739q;
    public boolean f29740r;
    public boolean f29741s;
    public boolean f29742t;
    public int f29743u;
    public int v;
    public boolean f29744w;
    public long f29745x;
    public int f29746y;
    public int f29747z;

    public p61(int i10) {
        super(i10, false);
        this.f29730g = true;
        this.f29743u = -1;
        this.I = true;
    }

    public static p61 A(int i10, CharSequence charSequence) {
        p61 p61Var = new p61(7);
        p61Var.d = i10;
        p61Var.f29734l = charSequence;
        return p61Var;
    }

    public static p61 B(CharSequence charSequence) {
        p61 p61Var = new p61(7);
        p61Var.f29734l = charSequence;
        return p61Var;
    }

    public static p61 C(int i10) {
        p61 p61Var = new p61(28);
        p61Var.f29747z = i10;
        return p61Var;
    }

    public static p61 D(int i10, int i11) {
        p61 p61Var = new p61(28);
        p61Var.d = i10;
        p61Var.f29747z = i11;
        return p61Var;
    }

    public static p61 E(int i10, String str) {
        p61 p61Var = new p61(39);
        p61Var.d = i10;
        p61Var.f29734l = str;
        p61Var.f29747z = 1;
        return p61Var;
    }

    public static o61 F(int i10) {
        LongSparseArray longSparseArray = K;
        if (longSparseArray == null) {
            return null;
        }
        return (o61) longSparseArray.get(i10);
    }

    public static p61 J(Class cls) {
        if (L == null) {
            L = new HashMap();
        }
        if (K == null) {
            K = new LongSparseArray();
        }
        o61 o61Var = (o61) L.get(cls);
        if (o61Var != null) {
            return new p61(o61Var.viewType);
        }
        throw new RuntimeException("UItemFactory was not setuped: " + cls);
    }

    public static p61 b(String str) {
        p61 p61Var = new p61(1);
        p61Var.f29734l = str;
        return p61Var;
    }

    public static p61 c(int i10, int i11, String str) {
        p61 p61Var = new p61(3);
        p61Var.d = i10;
        p61Var.f29733k = i11;
        p61Var.f29734l = str;
        return p61Var;
    }

    public static p61 d(int i10, int i11, String str, String str2) {
        p61 p61Var = new p61(3);
        p61Var.d = i10;
        p61Var.f29733k = i11;
        p61Var.f29734l = str;
        p61Var.f29736n = str2;
        return p61Var;
    }

    public static p61 e(int i10, String str) {
        p61 p61Var = new p61(3);
        p61Var.d = i10;
        p61Var.f29734l = str;
        return p61Var;
    }

    public static p61 f(String str, CharSequence charSequence, int i10) {
        p61 p61Var = new p61(3);
        p61Var.d = i10;
        p61Var.f29734l = str;
        p61Var.f29736n = charSequence;
        return p61Var;
    }

    public static p61 g(CharSequence charSequence) {
        p61 p61Var = new p61(7);
        p61Var.f29734l = charSequence;
        p61Var.f29739q = true;
        return p61Var;
    }

    public static p61 h(int i10, int i11, na1 na1Var) {
        p61 p61Var = new p61(i10 + 18);
        p61Var.f29747z = i11;
        p61Var.G = na1Var;
        return p61Var;
    }

    public static p61 i(int i10, CharSequence charSequence) {
        p61 p61Var = new p61(4);
        p61Var.d = i10;
        p61Var.f29734l = charSequence;
        return p61Var;
    }

    public static p61 j(int i10, View view) {
        p61 p61Var = new p61(-1);
        p61Var.d = i10;
        p61Var.f29727c = view;
        p61Var.f29747z = -1;
        return p61Var;
    }

    public static p61 k(View view) {
        p61 p61Var = new p61(-1);
        p61Var.f29727c = view;
        p61Var.f29747z = -1;
        return p61Var;
    }

    public static p61 l(View view) {
        p61 p61Var = new p61(-4);
        p61Var.f29727c = view;
        p61Var.f29747z = -1;
        return p61Var;
    }

    public static p61 m(int i10, String str, String str2) {
        p61 p61Var = new p61(40);
        p61Var.d = i10;
        p61Var.f29734l = str;
        p61Var.f29737o = str2;
        return p61Var;
    }

    public static p61 n(int i10) {
        p61 p61Var = new p61(34);
        p61Var.f29747z = i10;
        return p61Var;
    }

    public static p61 o(int i10, int i11) {
        p61 p61Var = new p61(34);
        p61Var.d = i10;
        p61Var.f29747z = i11;
        return p61Var;
    }

    public static p61 p(View view, int i10, boolean z10) {
        p61 p61Var = new p61(-3);
        p61Var.f29727c = view;
        p61Var.f29747z = i10;
        p61Var.f29746y = z10 ? 1 : 0;
        return p61Var;
    }

    public static p61 q(String str) {
        p61 p61Var = new p61(31);
        p61Var.f29734l = str;
        return p61Var;
    }

    public static p61 r(String str, String str2, View.OnClickListener onClickListener) {
        p61 p61Var = new p61(31);
        p61Var.f29734l = str;
        p61Var.f29735m = str2;
        p61Var.D = onClickListener;
        return p61Var;
    }

    public static p61 s(int i10, String str) {
        p61 p61Var = new p61(0);
        p61Var.d = i10;
        p61Var.f29734l = str;
        return p61Var;
    }

    public static p61 t(String str) {
        p61 p61Var = new p61(0);
        p61Var.f29734l = str;
        return p61Var;
    }

    public static p61 u(org.telegram.ui.he heVar) {
        p61 p61Var = new p61(24);
        p61Var.G = heVar;
        return p61Var;
    }

    public static p61 v(TLObject tLObject) {
        p61 p61Var = new p61(32);
        p61Var.G = tLObject;
        return p61Var;
    }

    public static p61 w(int i10, String str) {
        p61 p61Var = new p61(10);
        p61Var.d = i10;
        p61Var.f29734l = str;
        return p61Var;
    }

    public static p61 x(int i10, String str, String str2) {
        p61 p61Var = new p61(44);
        p61Var.d = i10;
        p61Var.f29734l = str;
        p61Var.f29736n = str2;
        return p61Var;
    }

    public static p61 y(int i10, CharSequence charSequence) {
        p61 p61Var = new p61(35);
        p61Var.d = i10;
        p61Var.f29734l = charSequence;
        return p61Var;
    }

    public static p61 z(String str, CharSequence charSequence, int i10) {
        p61 p61Var = new p61(41);
        p61Var.d = i10;
        p61Var.f29734l = charSequence;
        p61Var.f29737o = str;
        return p61Var;
    }

    public final boolean G(Class cls) {
        HashMap hashMap;
        o61 o61Var;
        if (this.f17125a >= 10000 && (hashMap = L) != null && (o61Var = (o61) hashMap.get(cls)) != null && o61Var.viewType == this.f17125a) {
            return true;
        }
        return false;
    }

    public final boolean H(org.telegram.ui.Components.p61 r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.p61.H(org.telegram.ui.Components.p61):boolean");
    }

    public final boolean I(p61 p61Var) {
        if (this.d == p61Var.d && this.f29731i == p61Var.f29731i && this.f29745x == p61Var.f29745x && this.f29733k == p61Var.f29733k && this.f29732j == p61Var.f29732j && this.f29741s == p61Var.f29741s && this.f29740r == p61Var.f29740r && this.f29742t == p61Var.f29742t && this.f29739q == p61Var.f29739q && this.f29727c == p61Var.f29727c && TextUtils.equals(this.f29734l, p61Var.f29734l) && TextUtils.equals(this.f29735m, p61Var.f29735m) && TextUtils.equals(this.f29736n, p61Var.f29736n) && this.f29727c == p61Var.f29727c && this.f29747z == p61Var.f29747z && Math.abs(this.A - p61Var.A) < 0.01f && this.B == p61Var.B && Objects.equals(this.G, p61Var.G) && Objects.equals(this.H, p61Var.H)) {
            return true;
        }
        return false;
    }

    public final void K(boolean z10) {
        this.f29728e = z10;
        if (this.f17125a == 11) {
            this.f17125a = 12;
        }
    }

    @Override
    public final boolean a(og.a aVar) {
        o61 F;
        if (this != aVar) {
            if (p61.class == aVar.getClass()) {
                p61 p61Var = (p61) aVar;
                int i10 = this.f17125a;
                if (i10 == p61Var.f17125a) {
                    if (i10 == 31) {
                        if (TextUtils.equals(this.f29734l, p61Var.f29734l) && TextUtils.equals(this.f29735m, p61Var.f29735m)) {
                            return true;
                        }
                        return false;
                    } else if (i10 == 28) {
                        if (this.f29747z == p61Var.f29747z) {
                            return true;
                        }
                        return false;
                    } else if (i10 != 35 && i10 != 37) {
                        if (i10 >= 10000 && (F = F(i10)) != null) {
                            return F.contentsEquals(this, p61Var);
                        }
                        return H(p61Var);
                    } else if (this.d == p61Var.d && TextUtils.equals(this.f29734l, p61Var.f29734l) && this.f29728e == p61Var.f29728e) {
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
        o61 F;
        if (this != obj) {
            if (obj != null && p61.class == obj.getClass()) {
                p61 p61Var = (p61) obj;
                int i10 = this.f17125a;
                if (i10 == p61Var.f17125a) {
                    if (i10 != 36 && i10 != 35) {
                        if (i10 == 28) {
                            if (this.d == p61Var.d) {
                                return true;
                            }
                            return false;
                        } else if (i10 == 31) {
                            return TextUtils.equals(this.f29734l, p61Var.f29734l);
                        } else {
                            if (i10 >= 10000 && (F = F(i10)) != null) {
                                return F.equals(this, p61Var);
                            }
                            return I(p61Var);
                        }
                    } else if (this.d == p61Var.d) {
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
