package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import j$.util.Objects;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.na1;
public final class q61 extends og.a {
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
    public View f30056c;
    public int d;
    public boolean f30057e;
    public boolean f30058f;
    public boolean f30059g;
    public boolean h;
    public int f30060i;
    public boolean f30061j;
    public int f30062k;
    public CharSequence f30063l;
    public CharSequence f30064m;
    public CharSequence f30065n;
    public CharSequence f30066o;
    public String[] f30067p;
    public boolean f30068q;
    public boolean f30069r;
    public boolean f30070s;
    public boolean f30071t;
    public int f30072u;
    public int v;
    public boolean f30073w;
    public long f30074x;
    public int f30075y;
    public int f30076z;

    public q61(int i10) {
        super(i10, false);
        this.f30059g = true;
        this.f30072u = -1;
        this.I = true;
    }

    public static q61 A(int i10, CharSequence charSequence) {
        q61 q61Var = new q61(7);
        q61Var.d = i10;
        q61Var.f30063l = charSequence;
        return q61Var;
    }

    public static q61 B(CharSequence charSequence) {
        q61 q61Var = new q61(7);
        q61Var.f30063l = charSequence;
        return q61Var;
    }

    public static q61 C(int i10) {
        q61 q61Var = new q61(28);
        q61Var.f30076z = i10;
        return q61Var;
    }

    public static q61 D(int i10, int i11) {
        q61 q61Var = new q61(28);
        q61Var.d = i10;
        q61Var.f30076z = i11;
        return q61Var;
    }

    public static q61 E(int i10, String str) {
        q61 q61Var = new q61(39);
        q61Var.d = i10;
        q61Var.f30063l = str;
        q61Var.f30076z = 1;
        return q61Var;
    }

    public static p61 F(int i10) {
        LongSparseArray longSparseArray = K;
        if (longSparseArray == null) {
            return null;
        }
        return (p61) longSparseArray.get(i10);
    }

    public static q61 J(Class cls) {
        if (L == null) {
            L = new HashMap();
        }
        if (K == null) {
            K = new LongSparseArray();
        }
        p61 p61Var = (p61) L.get(cls);
        if (p61Var != null) {
            return new q61(p61Var.viewType);
        }
        throw new RuntimeException("UItemFactory was not setuped: " + cls);
    }

    public static q61 b(String str) {
        q61 q61Var = new q61(1);
        q61Var.f30063l = str;
        return q61Var;
    }

    public static q61 c(int i10, int i11, String str) {
        q61 q61Var = new q61(3);
        q61Var.d = i10;
        q61Var.f30062k = i11;
        q61Var.f30063l = str;
        return q61Var;
    }

    public static q61 d(int i10, int i11, String str, String str2) {
        q61 q61Var = new q61(3);
        q61Var.d = i10;
        q61Var.f30062k = i11;
        q61Var.f30063l = str;
        q61Var.f30065n = str2;
        return q61Var;
    }

    public static q61 e(int i10, String str) {
        q61 q61Var = new q61(3);
        q61Var.d = i10;
        q61Var.f30063l = str;
        return q61Var;
    }

    public static q61 f(String str, CharSequence charSequence, int i10) {
        q61 q61Var = new q61(3);
        q61Var.d = i10;
        q61Var.f30063l = str;
        q61Var.f30065n = charSequence;
        return q61Var;
    }

    public static q61 g(CharSequence charSequence) {
        q61 q61Var = new q61(7);
        q61Var.f30063l = charSequence;
        q61Var.f30068q = true;
        return q61Var;
    }

    public static q61 h(int i10, int i11, na1 na1Var) {
        q61 q61Var = new q61(i10 + 18);
        q61Var.f30076z = i11;
        q61Var.G = na1Var;
        return q61Var;
    }

    public static q61 i(int i10, CharSequence charSequence) {
        q61 q61Var = new q61(4);
        q61Var.d = i10;
        q61Var.f30063l = charSequence;
        return q61Var;
    }

    public static q61 j(int i10, View view) {
        q61 q61Var = new q61(-1);
        q61Var.d = i10;
        q61Var.f30056c = view;
        q61Var.f30076z = -1;
        return q61Var;
    }

    public static q61 k(View view) {
        q61 q61Var = new q61(-1);
        q61Var.f30056c = view;
        q61Var.f30076z = -1;
        return q61Var;
    }

    public static q61 l(View view) {
        q61 q61Var = new q61(-4);
        q61Var.f30056c = view;
        q61Var.f30076z = -1;
        return q61Var;
    }

    public static q61 m(int i10, String str, String str2) {
        q61 q61Var = new q61(40);
        q61Var.d = i10;
        q61Var.f30063l = str;
        q61Var.f30066o = str2;
        return q61Var;
    }

    public static q61 n(int i10) {
        q61 q61Var = new q61(34);
        q61Var.f30076z = i10;
        return q61Var;
    }

    public static q61 o(int i10, int i11) {
        q61 q61Var = new q61(34);
        q61Var.d = i10;
        q61Var.f30076z = i11;
        return q61Var;
    }

    public static q61 p(View view, int i10, boolean z10) {
        q61 q61Var = new q61(-3);
        q61Var.f30056c = view;
        q61Var.f30076z = i10;
        q61Var.f30075y = z10 ? 1 : 0;
        return q61Var;
    }

    public static q61 q(String str) {
        q61 q61Var = new q61(31);
        q61Var.f30063l = str;
        return q61Var;
    }

    public static q61 r(String str, String str2, View.OnClickListener onClickListener) {
        q61 q61Var = new q61(31);
        q61Var.f30063l = str;
        q61Var.f30064m = str2;
        q61Var.D = onClickListener;
        return q61Var;
    }

    public static q61 s(int i10, String str) {
        q61 q61Var = new q61(0);
        q61Var.d = i10;
        q61Var.f30063l = str;
        return q61Var;
    }

    public static q61 t(String str) {
        q61 q61Var = new q61(0);
        q61Var.f30063l = str;
        return q61Var;
    }

    public static q61 u(org.telegram.ui.he heVar) {
        q61 q61Var = new q61(24);
        q61Var.G = heVar;
        return q61Var;
    }

    public static q61 v(TLObject tLObject) {
        q61 q61Var = new q61(32);
        q61Var.G = tLObject;
        return q61Var;
    }

    public static q61 w(int i10, String str) {
        q61 q61Var = new q61(10);
        q61Var.d = i10;
        q61Var.f30063l = str;
        return q61Var;
    }

    public static q61 x(int i10, String str, String str2) {
        q61 q61Var = new q61(44);
        q61Var.d = i10;
        q61Var.f30063l = str;
        q61Var.f30065n = str2;
        return q61Var;
    }

    public static q61 y(int i10, CharSequence charSequence) {
        q61 q61Var = new q61(35);
        q61Var.d = i10;
        q61Var.f30063l = charSequence;
        return q61Var;
    }

    public static q61 z(String str, CharSequence charSequence, int i10) {
        q61 q61Var = new q61(41);
        q61Var.d = i10;
        q61Var.f30063l = charSequence;
        q61Var.f30066o = str;
        return q61Var;
    }

    public final boolean G(Class cls) {
        HashMap hashMap;
        p61 p61Var;
        if (this.f17129a >= 10000 && (hashMap = L) != null && (p61Var = (p61) hashMap.get(cls)) != null && p61Var.viewType == this.f17129a) {
            return true;
        }
        return false;
    }

    public final boolean H(org.telegram.ui.Components.q61 r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.q61.H(org.telegram.ui.Components.q61):boolean");
    }

    public final boolean I(q61 q61Var) {
        if (this.d == q61Var.d && this.f30060i == q61Var.f30060i && this.f30074x == q61Var.f30074x && this.f30062k == q61Var.f30062k && this.f30061j == q61Var.f30061j && this.f30070s == q61Var.f30070s && this.f30069r == q61Var.f30069r && this.f30071t == q61Var.f30071t && this.f30068q == q61Var.f30068q && this.f30056c == q61Var.f30056c && TextUtils.equals(this.f30063l, q61Var.f30063l) && TextUtils.equals(this.f30064m, q61Var.f30064m) && TextUtils.equals(this.f30065n, q61Var.f30065n) && this.f30056c == q61Var.f30056c && this.f30076z == q61Var.f30076z && Math.abs(this.A - q61Var.A) < 0.01f && this.B == q61Var.B && Objects.equals(this.G, q61Var.G) && Objects.equals(this.H, q61Var.H)) {
            return true;
        }
        return false;
    }

    public final void K(boolean z10) {
        this.f30057e = z10;
        if (this.f17129a == 11) {
            this.f17129a = 12;
        }
    }

    @Override
    public final boolean a(og.a aVar) {
        p61 F;
        if (this != aVar) {
            if (q61.class == aVar.getClass()) {
                q61 q61Var = (q61) aVar;
                int i10 = this.f17129a;
                if (i10 == q61Var.f17129a) {
                    if (i10 == 31) {
                        if (TextUtils.equals(this.f30063l, q61Var.f30063l) && TextUtils.equals(this.f30064m, q61Var.f30064m)) {
                            return true;
                        }
                        return false;
                    } else if (i10 == 28) {
                        if (this.f30076z == q61Var.f30076z) {
                            return true;
                        }
                        return false;
                    } else if (i10 != 35 && i10 != 37) {
                        if (i10 >= 10000 && (F = F(i10)) != null) {
                            return F.contentsEquals(this, q61Var);
                        }
                        return H(q61Var);
                    } else if (this.d == q61Var.d && TextUtils.equals(this.f30063l, q61Var.f30063l) && this.f30057e == q61Var.f30057e) {
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
        p61 F;
        if (this != obj) {
            if (obj != null && q61.class == obj.getClass()) {
                q61 q61Var = (q61) obj;
                int i10 = this.f17129a;
                if (i10 == q61Var.f17129a) {
                    if (i10 != 36 && i10 != 35) {
                        if (i10 == 28) {
                            if (this.d == q61Var.d) {
                                return true;
                            }
                            return false;
                        } else if (i10 == 31) {
                            return TextUtils.equals(this.f30063l, q61Var.f30063l);
                        } else {
                            if (i10 >= 10000 && (F = F(i10)) != null) {
                                return F.equals(this, q61Var);
                            }
                            return I(q61Var);
                        }
                    } else if (this.d == q61Var.d) {
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
