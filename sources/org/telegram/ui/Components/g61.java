package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import j$.util.Objects;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ha1;
public final class g61 extends og.a {
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
    public View f26667c;
    public int d;
    public boolean f26668e;
    public boolean f26669f;
    public boolean f26670g;
    public boolean h;
    public int f26671i;
    public boolean f26672j;
    public int f26673k;
    public CharSequence f26674l;
    public CharSequence f26675m;
    public CharSequence f26676n;
    public CharSequence f26677o;
    public String[] f26678p;
    public boolean f26679q;
    public boolean f26680r;
    public boolean f26681s;
    public boolean f26682t;
    public int f26683u;
    public int v;
    public boolean f26684w;
    public long f26685x;
    public int f26686y;
    public int f26687z;

    public g61(int i10) {
        super(i10, false);
        this.f26670g = true;
        this.f26683u = -1;
        this.I = true;
    }

    public static g61 A(int i10, CharSequence charSequence) {
        g61 g61Var = new g61(7);
        g61Var.d = i10;
        g61Var.f26674l = charSequence;
        return g61Var;
    }

    public static g61 B(CharSequence charSequence) {
        g61 g61Var = new g61(7);
        g61Var.f26674l = charSequence;
        return g61Var;
    }

    public static g61 C(int i10) {
        g61 g61Var = new g61(28);
        g61Var.f26687z = i10;
        return g61Var;
    }

    public static g61 D(int i10, int i11) {
        g61 g61Var = new g61(28);
        g61Var.d = i10;
        g61Var.f26687z = i11;
        return g61Var;
    }

    public static g61 E(int i10, String str) {
        g61 g61Var = new g61(39);
        g61Var.d = i10;
        g61Var.f26674l = str;
        g61Var.f26687z = 1;
        return g61Var;
    }

    public static f61 F(int i10) {
        LongSparseArray longSparseArray = K;
        if (longSparseArray == null) {
            return null;
        }
        return (f61) longSparseArray.get(i10);
    }

    public static g61 J(Class cls) {
        if (L == null) {
            L = new HashMap();
        }
        if (K == null) {
            K = new LongSparseArray();
        }
        f61 f61Var = (f61) L.get(cls);
        if (f61Var != null) {
            return new g61(f61Var.viewType);
        }
        throw new RuntimeException("UItemFactory was not setuped: " + cls);
    }

    public static g61 b(String str) {
        g61 g61Var = new g61(1);
        g61Var.f26674l = str;
        return g61Var;
    }

    public static g61 c(int i10, int i11, String str) {
        g61 g61Var = new g61(3);
        g61Var.d = i10;
        g61Var.f26673k = i11;
        g61Var.f26674l = str;
        return g61Var;
    }

    public static g61 d(int i10, int i11, String str, String str2) {
        g61 g61Var = new g61(3);
        g61Var.d = i10;
        g61Var.f26673k = i11;
        g61Var.f26674l = str;
        g61Var.f26676n = str2;
        return g61Var;
    }

    public static g61 e(int i10, String str) {
        g61 g61Var = new g61(3);
        g61Var.d = i10;
        g61Var.f26674l = str;
        return g61Var;
    }

    public static g61 f(String str, CharSequence charSequence, int i10) {
        g61 g61Var = new g61(3);
        g61Var.d = i10;
        g61Var.f26674l = str;
        g61Var.f26676n = charSequence;
        return g61Var;
    }

    public static g61 g(CharSequence charSequence) {
        g61 g61Var = new g61(7);
        g61Var.f26674l = charSequence;
        g61Var.f26679q = true;
        return g61Var;
    }

    public static g61 h(int i10, int i11, ha1 ha1Var) {
        g61 g61Var = new g61(i10 + 18);
        g61Var.f26687z = i11;
        g61Var.G = ha1Var;
        return g61Var;
    }

    public static g61 i(int i10, CharSequence charSequence) {
        g61 g61Var = new g61(4);
        g61Var.d = i10;
        g61Var.f26674l = charSequence;
        return g61Var;
    }

    public static g61 j(int i10, View view) {
        g61 g61Var = new g61(-1);
        g61Var.d = i10;
        g61Var.f26667c = view;
        g61Var.f26687z = -1;
        return g61Var;
    }

    public static g61 k(View view) {
        g61 g61Var = new g61(-1);
        g61Var.f26667c = view;
        g61Var.f26687z = -1;
        return g61Var;
    }

    public static g61 l(int i10, View view) {
        g61 g61Var = new g61(-4);
        g61Var.f26667c = view;
        g61Var.f26687z = i10;
        return g61Var;
    }

    public static g61 m(View view) {
        g61 g61Var = new g61(-4);
        g61Var.f26667c = view;
        g61Var.f26687z = -1;
        return g61Var;
    }

    public static g61 n(int i10, String str, String str2) {
        g61 g61Var = new g61(40);
        g61Var.d = i10;
        g61Var.f26674l = str;
        g61Var.f26677o = str2;
        return g61Var;
    }

    public static g61 o(int i10) {
        g61 g61Var = new g61(34);
        g61Var.f26687z = i10;
        return g61Var;
    }

    public static g61 p(int i10, int i11) {
        g61 g61Var = new g61(34);
        g61Var.d = i10;
        g61Var.f26687z = i11;
        return g61Var;
    }

    public static g61 q(String str) {
        g61 g61Var = new g61(31);
        g61Var.f26674l = str;
        return g61Var;
    }

    public static g61 r(String str, String str2, View.OnClickListener onClickListener) {
        g61 g61Var = new g61(31);
        g61Var.f26674l = str;
        g61Var.f26675m = str2;
        g61Var.D = onClickListener;
        return g61Var;
    }

    public static g61 s(int i10, String str) {
        g61 g61Var = new g61(0);
        g61Var.d = i10;
        g61Var.f26674l = str;
        return g61Var;
    }

    public static g61 t(String str) {
        g61 g61Var = new g61(0);
        g61Var.f26674l = str;
        return g61Var;
    }

    public static g61 u(org.telegram.ui.je jeVar) {
        g61 g61Var = new g61(24);
        g61Var.G = jeVar;
        return g61Var;
    }

    public static g61 v(TLObject tLObject) {
        g61 g61Var = new g61(32);
        g61Var.G = tLObject;
        return g61Var;
    }

    public static g61 w(int i10, String str) {
        g61 g61Var = new g61(10);
        g61Var.d = i10;
        g61Var.f26674l = str;
        return g61Var;
    }

    public static g61 x(int i10, String str, String str2) {
        g61 g61Var = new g61(44);
        g61Var.d = i10;
        g61Var.f26674l = str;
        g61Var.f26676n = str2;
        return g61Var;
    }

    public static g61 y(int i10, CharSequence charSequence) {
        g61 g61Var = new g61(35);
        g61Var.d = i10;
        g61Var.f26674l = charSequence;
        return g61Var;
    }

    public static g61 z(String str, CharSequence charSequence, int i10) {
        g61 g61Var = new g61(41);
        g61Var.d = i10;
        g61Var.f26674l = charSequence;
        g61Var.f26677o = str;
        return g61Var;
    }

    public final boolean G(Class cls) {
        HashMap hashMap;
        f61 f61Var;
        if (this.f17187a >= 10000 && (hashMap = L) != null && (f61Var = (f61) hashMap.get(cls)) != null && f61Var.viewType == this.f17187a) {
            return true;
        }
        return false;
    }

    public final boolean H(org.telegram.ui.Components.g61 r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.g61.H(org.telegram.ui.Components.g61):boolean");
    }

    public final boolean I(g61 g61Var) {
        if (this.d == g61Var.d && this.f26671i == g61Var.f26671i && this.f26685x == g61Var.f26685x && this.f26673k == g61Var.f26673k && this.f26672j == g61Var.f26672j && this.f26681s == g61Var.f26681s && this.f26680r == g61Var.f26680r && this.f26682t == g61Var.f26682t && this.f26679q == g61Var.f26679q && this.f26667c == g61Var.f26667c && TextUtils.equals(this.f26674l, g61Var.f26674l) && TextUtils.equals(this.f26675m, g61Var.f26675m) && TextUtils.equals(this.f26676n, g61Var.f26676n) && this.f26667c == g61Var.f26667c && this.f26687z == g61Var.f26687z && Math.abs(this.A - g61Var.A) < 0.01f && this.B == g61Var.B && Objects.equals(this.G, g61Var.G) && Objects.equals(this.H, g61Var.H)) {
            return true;
        }
        return false;
    }

    public final void K(boolean z10) {
        this.f26668e = z10;
        if (this.f17187a == 11) {
            this.f17187a = 12;
        }
    }

    @Override
    public final boolean a(og.a aVar) {
        f61 F;
        if (this != aVar) {
            if (g61.class == aVar.getClass()) {
                g61 g61Var = (g61) aVar;
                int i10 = this.f17187a;
                if (i10 == g61Var.f17187a) {
                    if (i10 == 31) {
                        if (TextUtils.equals(this.f26674l, g61Var.f26674l) && TextUtils.equals(this.f26675m, g61Var.f26675m)) {
                            return true;
                        }
                        return false;
                    } else if (i10 == 28) {
                        if (this.f26687z == g61Var.f26687z) {
                            return true;
                        }
                        return false;
                    } else if (i10 != 35 && i10 != 37) {
                        if (i10 >= 10000 && (F = F(i10)) != null) {
                            return F.contentsEquals(this, g61Var);
                        }
                        return H(g61Var);
                    } else if (this.d == g61Var.d && TextUtils.equals(this.f26674l, g61Var.f26674l) && this.f26668e == g61Var.f26668e) {
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
        f61 F;
        if (this != obj) {
            if (obj != null && g61.class == obj.getClass()) {
                g61 g61Var = (g61) obj;
                int i10 = this.f17187a;
                if (i10 == g61Var.f17187a) {
                    if (i10 != 36 && i10 != 35) {
                        if (i10 == 28) {
                            if (this.d == g61Var.d) {
                                return true;
                            }
                            return false;
                        } else if (i10 == 31) {
                            return TextUtils.equals(this.f26674l, g61Var.f26674l);
                        } else {
                            if (i10 >= 10000 && (F = F(i10)) != null) {
                                return F.equals(this, g61Var);
                            }
                            return I(g61Var);
                        }
                    } else if (this.d == g61Var.d) {
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
