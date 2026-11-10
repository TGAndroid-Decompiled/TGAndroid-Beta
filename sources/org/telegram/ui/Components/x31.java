package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import j$.util.Objects;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;
public final class x31 extends rg.a {
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
    public View f40149c;
    public int d;
    public boolean f40150e;
    public boolean f40151f;
    public boolean f40152g;
    public boolean h;
    public int f40153i;
    public boolean f40154j;
    public int f40155k;
    public CharSequence f40156l;
    public CharSequence f40157m;
    public CharSequence f40158n;
    public CharSequence f40159o;
    public String[] f40160p;
    public boolean f40161q;
    public boolean f40162r;
    public boolean f40163s;
    public boolean f40164t;
    public int f40165u;
    public int v;
    public boolean f40166w;
    public long f40167x;
    public int f40168y;
    public int f40169z;

    public x31(int i7) {
        super(i7, false);
        this.f40152g = true;
        this.f40165u = -1;
        this.I = true;
    }

    public static x31 A(String str, CharSequence charSequence, int i7) {
        x31 x31Var = new x31(41);
        x31Var.d = i7;
        x31Var.f40156l = charSequence;
        x31Var.f40159o = str;
        return x31Var;
    }

    public static x31 B(int i7, CharSequence charSequence) {
        x31 x31Var = new x31(7);
        x31Var.d = i7;
        x31Var.f40156l = charSequence;
        return x31Var;
    }

    public static x31 C(CharSequence charSequence) {
        x31 x31Var = new x31(7);
        x31Var.f40156l = charSequence;
        return x31Var;
    }

    public static x31 D(int i7) {
        x31 x31Var = new x31(28);
        x31Var.f40169z = i7;
        return x31Var;
    }

    public static x31 E(int i7, int i10) {
        x31 x31Var = new x31(28);
        x31Var.d = i7;
        x31Var.f40169z = i10;
        return x31Var;
    }

    public static x31 F(int i7, String str) {
        x31 x31Var = new x31(39);
        x31Var.d = i7;
        x31Var.f40156l = str;
        x31Var.f40169z = 1;
        return x31Var;
    }

    public static w31 G(int i7) {
        LongSparseArray longSparseArray = K;
        if (longSparseArray == null) {
            return null;
        }
        return (w31) longSparseArray.get(i7);
    }

    public static x31 K(Class cls) {
        if (L == null) {
            L = new HashMap();
        }
        if (K == null) {
            K = new LongSparseArray();
        }
        w31 w31Var = (w31) L.get(cls);
        if (w31Var != null) {
            return new x31(w31Var.f39870a);
        }
        throw new RuntimeException("UItemFactory was not setuped: " + cls);
    }

    public static x31 b(String str) {
        x31 x31Var = new x31(1);
        x31Var.f40156l = str;
        return x31Var;
    }

    public static x31 c(int i7, int i10, String str) {
        x31 x31Var = new x31(3);
        x31Var.d = i7;
        x31Var.f40155k = i10;
        x31Var.f40156l = str;
        return x31Var;
    }

    public static x31 d(int i7, int i10, String str, String str2) {
        x31 x31Var = new x31(3);
        x31Var.d = i7;
        x31Var.f40155k = i10;
        x31Var.f40156l = str;
        x31Var.f40158n = str2;
        return x31Var;
    }

    public static x31 e(int i7, String str) {
        x31 x31Var = new x31(3);
        x31Var.d = i7;
        x31Var.f40156l = str;
        return x31Var;
    }

    public static x31 f(String str, CharSequence charSequence, int i7) {
        x31 x31Var = new x31(3);
        x31Var.d = i7;
        x31Var.f40156l = str;
        x31Var.f40158n = charSequence;
        return x31Var;
    }

    public static x31 g(CharSequence charSequence) {
        x31 x31Var = new x31(7);
        x31Var.f40156l = charSequence;
        x31Var.f40161q = true;
        return x31Var;
    }

    public static x31 h(int i7, int i10, org.telegram.ui.q41 q41Var) {
        x31 x31Var = new x31(i7 + 18);
        x31Var.f40169z = i10;
        x31Var.G = q41Var;
        return x31Var;
    }

    public static x31 i(int i7, CharSequence charSequence) {
        x31 x31Var = new x31(4);
        x31Var.d = i7;
        x31Var.f40156l = charSequence;
        return x31Var;
    }

    public static x31 j(int i7, View view) {
        x31 x31Var = new x31(-1);
        x31Var.d = i7;
        x31Var.f40149c = view;
        x31Var.f40169z = -1;
        return x31Var;
    }

    public static x31 k(View view) {
        x31 x31Var = new x31(-1);
        x31Var.f40149c = view;
        x31Var.f40169z = -1;
        return x31Var;
    }

    public static x31 l(int i7, View view) {
        x31 x31Var = new x31(-4);
        x31Var.d = i7;
        x31Var.f40149c = view;
        x31Var.f40169z = -1;
        return x31Var;
    }

    public static x31 m(View view) {
        x31 x31Var = new x31(-4);
        x31Var.f40149c = view;
        x31Var.f40169z = -1;
        return x31Var;
    }

    public static x31 n(View view, int i7) {
        x31 x31Var = new x31(-4);
        x31Var.f40149c = view;
        x31Var.f40169z = i7;
        return x31Var;
    }

    public static x31 o(int i7, String str, String str2) {
        x31 x31Var = new x31(40);
        x31Var.d = i7;
        x31Var.f40156l = str;
        x31Var.f40159o = str2;
        return x31Var;
    }

    public static x31 p(int i7) {
        x31 x31Var = new x31(34);
        x31Var.f40169z = i7;
        return x31Var;
    }

    public static x31 q(int i7, int i10) {
        x31 x31Var = new x31(34);
        x31Var.d = i7;
        x31Var.f40169z = i10;
        return x31Var;
    }

    public static x31 r(String str) {
        x31 x31Var = new x31(31);
        x31Var.f40156l = str;
        return x31Var;
    }

    public static x31 s(String str, String str2, View.OnClickListener onClickListener) {
        x31 x31Var = new x31(31);
        x31Var.f40156l = str;
        x31Var.f40157m = str2;
        x31Var.D = onClickListener;
        return x31Var;
    }

    public static x31 t(int i7, String str) {
        x31 x31Var = new x31(0);
        x31Var.d = i7;
        x31Var.f40156l = str;
        return x31Var;
    }

    public static x31 u(String str) {
        x31 x31Var = new x31(0);
        x31Var.f40156l = str;
        return x31Var;
    }

    public static x31 v(org.telegram.ui.wd wdVar) {
        x31 x31Var = new x31(24);
        x31Var.G = wdVar;
        return x31Var;
    }

    public static x31 w(TLObject tLObject) {
        x31 x31Var = new x31(32);
        x31Var.G = tLObject;
        return x31Var;
    }

    public static x31 x(int i7, String str) {
        x31 x31Var = new x31(10);
        x31Var.d = i7;
        x31Var.f40156l = str;
        return x31Var;
    }

    public static x31 y(int i7, String str, String str2) {
        x31 x31Var = new x31(44);
        x31Var.d = i7;
        x31Var.f40156l = str;
        x31Var.f40158n = str2;
        return x31Var;
    }

    public static x31 z(int i7, CharSequence charSequence) {
        x31 x31Var = new x31(35);
        x31Var.d = i7;
        x31Var.f40156l = charSequence;
        return x31Var;
    }

    public final boolean H(Class cls) {
        HashMap hashMap;
        w31 w31Var;
        if (this.f54543a >= 10000 && (hashMap = L) != null && (w31Var = (w31) hashMap.get(cls)) != null && w31Var.f39870a == this.f54543a) {
            return true;
        }
        return false;
    }

    public final boolean I(org.telegram.ui.Components.x31 r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.x31.I(org.telegram.ui.Components.x31):boolean");
    }

    public final boolean J(x31 x31Var) {
        if (this.d == x31Var.d && this.f40153i == x31Var.f40153i && this.f40167x == x31Var.f40167x && this.f40155k == x31Var.f40155k && this.f40154j == x31Var.f40154j && this.f40163s == x31Var.f40163s && this.f40162r == x31Var.f40162r && this.f40164t == x31Var.f40164t && this.f40161q == x31Var.f40161q && this.f40149c == x31Var.f40149c && TextUtils.equals(this.f40156l, x31Var.f40156l) && TextUtils.equals(this.f40157m, x31Var.f40157m) && TextUtils.equals(this.f40158n, x31Var.f40158n) && this.f40149c == x31Var.f40149c && this.f40169z == x31Var.f40169z && Math.abs(this.A - x31Var.A) < 0.01f && this.B == x31Var.B && Objects.equals(this.G, x31Var.G) && Objects.equals(this.H, x31Var.H)) {
            return true;
        }
        return false;
    }

    public final void L(boolean z9) {
        this.f40150e = z9;
        if (this.f54543a == 11) {
            this.f54543a = 12;
        }
    }

    @Override
    public final boolean a(rg.a aVar) {
        w31 G;
        if (this != aVar) {
            if (x31.class == aVar.getClass()) {
                x31 x31Var = (x31) aVar;
                int i7 = this.f54543a;
                if (i7 == x31Var.f54543a) {
                    if (i7 == 31) {
                        if (TextUtils.equals(this.f40156l, x31Var.f40156l) && TextUtils.equals(this.f40157m, x31Var.f40157m)) {
                            return true;
                        }
                        return false;
                    } else if (i7 == 28) {
                        if (this.f40169z == x31Var.f40169z) {
                            return true;
                        }
                        return false;
                    } else if (i7 != 35 && i7 != 37) {
                        if (i7 >= 10000 && (G = G(i7)) != null) {
                            return G.c(this, x31Var);
                        }
                        return I(x31Var);
                    } else if (this.d == x31Var.d && TextUtils.equals(this.f40156l, x31Var.f40156l) && this.f40150e == x31Var.f40150e) {
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
        w31 G;
        if (this != obj) {
            if (obj != null && x31.class == obj.getClass()) {
                x31 x31Var = (x31) obj;
                int i7 = this.f54543a;
                if (i7 == x31Var.f54543a) {
                    if (i7 != 36 && i7 != 35) {
                        if (i7 == 28) {
                            if (this.d == x31Var.d) {
                                return true;
                            }
                            return false;
                        } else if (i7 == 31) {
                            return TextUtils.equals(this.f40156l, x31Var.f40156l);
                        } else {
                            if (i7 >= 10000 && (G = G(i7)) != null) {
                                return G.e(this, x31Var);
                            }
                            return J(x31Var);
                        }
                    } else if (this.d == x31Var.d) {
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
