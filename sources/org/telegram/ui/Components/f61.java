package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import j$.util.Objects;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
public final class f61 extends pg.a {
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
    public View f26141c;
    public int d;
    public boolean e;
    public boolean f26142f;
    public boolean f26143g;
    public boolean h;
    public int f26144i;
    public boolean f26145j;
    public int f26146k;
    public CharSequence f26147l;
    public CharSequence f26148m;
    public CharSequence f26149n;
    public CharSequence f26150o;
    public String[] f26151p;
    public boolean f26152q;
    public boolean f26153r;
    public boolean f26154s;
    public boolean f26155t;
    public int f26156u;
    public int v;
    public boolean f26157w;
    public long f26158x;
    public int f26159y;
    public int f26160z;

    public f61(int i10) {
        super(i10, false);
        this.f26143g = true;
        this.f26156u = -1;
        this.I = true;
    }

    public static f61 A(int i10, CharSequence charSequence) {
        f61 f61Var = new f61(7);
        f61Var.d = i10;
        f61Var.f26147l = charSequence;
        return f61Var;
    }

    public static f61 B(CharSequence charSequence) {
        f61 f61Var = new f61(7);
        f61Var.f26147l = charSequence;
        return f61Var;
    }

    public static f61 C(int i10) {
        f61 f61Var = new f61(28);
        f61Var.f26160z = i10;
        return f61Var;
    }

    public static f61 D(int i10, int i11) {
        f61 f61Var = new f61(28);
        f61Var.d = i10;
        f61Var.f26160z = i11;
        return f61Var;
    }

    public static f61 E(int i10, String str) {
        f61 f61Var = new f61(39);
        f61Var.d = i10;
        f61Var.f26147l = str;
        f61Var.f26160z = 1;
        return f61Var;
    }

    public static e61 F(int i10) {
        LongSparseArray longSparseArray = K;
        if (longSparseArray == null) {
            return null;
        }
        return (e61) longSparseArray.get(i10);
    }

    public static f61 J(Class cls) {
        if (L == null) {
            L = new HashMap();
        }
        if (K == null) {
            K = new LongSparseArray();
        }
        e61 e61Var = (e61) L.get(cls);
        if (e61Var != null) {
            return new f61(e61Var.viewType);
        }
        throw new RuntimeException("UItemFactory was not setuped: " + cls);
    }

    public static f61 b(String str) {
        f61 f61Var = new f61(1);
        f61Var.f26147l = str;
        return f61Var;
    }

    public static f61 c(int i10, int i11, String str) {
        f61 f61Var = new f61(3);
        f61Var.d = i10;
        f61Var.f26146k = i11;
        f61Var.f26147l = str;
        return f61Var;
    }

    public static f61 d(int i10, int i11, String str, String str2) {
        f61 f61Var = new f61(3);
        f61Var.d = i10;
        f61Var.f26146k = i11;
        f61Var.f26147l = str;
        f61Var.f26149n = str2;
        return f61Var;
    }

    public static f61 e(int i10, String str) {
        f61 f61Var = new f61(3);
        f61Var.d = i10;
        f61Var.f26147l = str;
        return f61Var;
    }

    public static f61 f(String str, CharSequence charSequence, int i10) {
        f61 f61Var = new f61(3);
        f61Var.d = i10;
        f61Var.f26147l = str;
        f61Var.f26149n = charSequence;
        return f61Var;
    }

    public static f61 g(CharSequence charSequence) {
        f61 f61Var = new f61(7);
        f61Var.f26147l = charSequence;
        f61Var.f26152q = true;
        return f61Var;
    }

    public static f61 h(int i10, int i11, org.telegram.ui.d91 d91Var) {
        f61 f61Var = new f61(i10 + 18);
        f61Var.f26160z = i11;
        f61Var.G = d91Var;
        return f61Var;
    }

    public static f61 i(int i10, CharSequence charSequence) {
        f61 f61Var = new f61(4);
        f61Var.d = i10;
        f61Var.f26147l = charSequence;
        return f61Var;
    }

    public static f61 j(int i10, View view) {
        f61 f61Var = new f61(-1);
        f61Var.d = i10;
        f61Var.f26141c = view;
        f61Var.f26160z = -1;
        return f61Var;
    }

    public static f61 k(View view) {
        f61 f61Var = new f61(-1);
        f61Var.f26141c = view;
        f61Var.f26160z = -1;
        return f61Var;
    }

    public static f61 l(View view) {
        f61 f61Var = new f61(-4);
        f61Var.f26141c = view;
        f61Var.f26160z = -1;
        return f61Var;
    }

    public static f61 m(int i10, String str, String str2) {
        f61 f61Var = new f61(40);
        f61Var.d = i10;
        f61Var.f26147l = str;
        f61Var.f26150o = str2;
        return f61Var;
    }

    public static f61 n(int i10) {
        f61 f61Var = new f61(34);
        f61Var.f26160z = i10;
        return f61Var;
    }

    public static f61 o(int i10, int i11) {
        f61 f61Var = new f61(34);
        f61Var.d = i10;
        f61Var.f26160z = i11;
        return f61Var;
    }

    public static f61 p(View view, int i10, boolean z10) {
        f61 f61Var = new f61(-3);
        f61Var.f26141c = view;
        f61Var.f26160z = i10;
        f61Var.f26159y = z10 ? 1 : 0;
        return f61Var;
    }

    public static f61 q(String str) {
        f61 f61Var = new f61(31);
        f61Var.f26147l = str;
        return f61Var;
    }

    public static f61 r(String str, String str2, View.OnClickListener onClickListener) {
        f61 f61Var = new f61(31);
        f61Var.f26147l = str;
        f61Var.f26148m = str2;
        f61Var.D = onClickListener;
        return f61Var;
    }

    public static f61 s(int i10, String str) {
        f61 f61Var = new f61(0);
        f61Var.d = i10;
        f61Var.f26147l = str;
        return f61Var;
    }

    public static f61 t(String str) {
        f61 f61Var = new f61(0);
        f61Var.f26147l = str;
        return f61Var;
    }

    public static f61 u(org.telegram.ui.he heVar) {
        f61 f61Var = new f61(24);
        f61Var.G = heVar;
        return f61Var;
    }

    public static f61 v(TLObject tLObject) {
        f61 f61Var = new f61(32);
        f61Var.G = tLObject;
        return f61Var;
    }

    public static f61 w(int i10, String str) {
        f61 f61Var = new f61(10);
        f61Var.d = i10;
        f61Var.f26147l = str;
        return f61Var;
    }

    public static f61 x(int i10, String str, String str2) {
        f61 f61Var = new f61(44);
        f61Var.d = i10;
        f61Var.f26147l = str;
        f61Var.f26149n = str2;
        return f61Var;
    }

    public static f61 y(int i10, CharSequence charSequence) {
        f61 f61Var = new f61(35);
        f61Var.d = i10;
        f61Var.f26147l = charSequence;
        return f61Var;
    }

    public static f61 z(String str, CharSequence charSequence, int i10) {
        f61 f61Var = new f61(41);
        f61Var.d = i10;
        f61Var.f26147l = charSequence;
        f61Var.f26150o = str;
        return f61Var;
    }

    public final boolean G(Class cls) {
        HashMap hashMap;
        e61 e61Var;
        if (this.f44334a >= 10000 && (hashMap = L) != null && (e61Var = (e61) hashMap.get(cls)) != null && e61Var.viewType == this.f44334a) {
            return true;
        }
        return false;
    }

    public final boolean H(org.telegram.ui.Components.f61 r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.f61.H(org.telegram.ui.Components.f61):boolean");
    }

    public final boolean I(f61 f61Var) {
        if (this.d == f61Var.d && this.f26144i == f61Var.f26144i && this.f26158x == f61Var.f26158x && this.f26146k == f61Var.f26146k && this.f26145j == f61Var.f26145j && this.f26154s == f61Var.f26154s && this.f26153r == f61Var.f26153r && this.f26155t == f61Var.f26155t && this.f26152q == f61Var.f26152q && this.f26141c == f61Var.f26141c && TextUtils.equals(this.f26147l, f61Var.f26147l) && TextUtils.equals(this.f26148m, f61Var.f26148m) && TextUtils.equals(this.f26149n, f61Var.f26149n) && this.f26141c == f61Var.f26141c && this.f26160z == f61Var.f26160z && Math.abs(this.A - f61Var.A) < 0.01f && this.B == f61Var.B && Objects.equals(this.G, f61Var.G) && Objects.equals(this.H, f61Var.H)) {
            return true;
        }
        return false;
    }

    public final void K(boolean z10) {
        this.e = z10;
        if (this.f44334a == 11) {
            this.f44334a = 12;
        }
    }

    @Override
    public final boolean a(pg.a aVar) {
        e61 F;
        if (this != aVar) {
            if (f61.class == aVar.getClass()) {
                f61 f61Var = (f61) aVar;
                int i10 = this.f44334a;
                if (i10 == f61Var.f44334a) {
                    if (i10 == 31) {
                        if (TextUtils.equals(this.f26147l, f61Var.f26147l) && TextUtils.equals(this.f26148m, f61Var.f26148m)) {
                            return true;
                        }
                        return false;
                    } else if (i10 == 28) {
                        if (this.f26160z == f61Var.f26160z) {
                            return true;
                        }
                        return false;
                    } else if (i10 != 35 && i10 != 37) {
                        if (i10 >= 10000 && (F = F(i10)) != null) {
                            return F.contentsEquals(this, f61Var);
                        }
                        return H(f61Var);
                    } else if (this.d == f61Var.d && TextUtils.equals(this.f26147l, f61Var.f26147l) && this.e == f61Var.e) {
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
        e61 F;
        if (this != obj) {
            if (obj != null && f61.class == obj.getClass()) {
                f61 f61Var = (f61) obj;
                int i10 = this.f44334a;
                if (i10 == f61Var.f44334a) {
                    if (i10 != 36 && i10 != 35) {
                        if (i10 == 28) {
                            if (this.d == f61Var.d) {
                                return true;
                            }
                            return false;
                        } else if (i10 == 31) {
                            return TextUtils.equals(this.f26147l, f61Var.f26147l);
                        } else {
                            if (i10 >= 10000 && (F = F(i10)) != null) {
                                return F.equals(this, f61Var);
                            }
                            return I(f61Var);
                        }
                    } else if (this.d == f61Var.d) {
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
