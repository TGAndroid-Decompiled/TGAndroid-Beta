package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import j$.util.Objects;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ta1;
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
    public View f26948c;
    public int d;
    public boolean e;
    public boolean f26949f;
    public boolean f26950g;
    public boolean h;
    public int f26951i;
    public boolean f26952j;
    public int f26953k;
    public CharSequence f26954l;
    public CharSequence f26955m;
    public CharSequence f26956n;
    public CharSequence f26957o;
    public String[] f26958p;
    public boolean f26959q;
    public boolean f26960r;
    public boolean f26961s;
    public boolean f26962t;
    public int f26963u;
    public int v;
    public boolean f26964w;
    public long f26965x;
    public int f26966y;
    public int f26967z;

    public l61(int i10) {
        super(i10, false);
        this.f26950g = true;
        this.f26963u = -1;
        this.I = true;
    }

    public static l61 A(int i10, CharSequence charSequence) {
        l61 l61Var = new l61(7);
        l61Var.d = i10;
        l61Var.f26954l = charSequence;
        return l61Var;
    }

    public static l61 B(CharSequence charSequence) {
        l61 l61Var = new l61(7);
        l61Var.f26954l = charSequence;
        return l61Var;
    }

    public static l61 C(int i10) {
        l61 l61Var = new l61(28);
        l61Var.f26967z = i10;
        return l61Var;
    }

    public static l61 D(int i10, int i11) {
        l61 l61Var = new l61(28);
        l61Var.d = i10;
        l61Var.f26967z = i11;
        return l61Var;
    }

    public static l61 E(int i10, String str) {
        l61 l61Var = new l61(39);
        l61Var.d = i10;
        l61Var.f26954l = str;
        l61Var.f26967z = 1;
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
        l61Var.f26954l = str;
        return l61Var;
    }

    public static l61 c(int i10, int i11, String str) {
        l61 l61Var = new l61(3);
        l61Var.d = i10;
        l61Var.f26953k = i11;
        l61Var.f26954l = str;
        return l61Var;
    }

    public static l61 d(int i10, int i11, String str, String str2) {
        l61 l61Var = new l61(3);
        l61Var.d = i10;
        l61Var.f26953k = i11;
        l61Var.f26954l = str;
        l61Var.f26956n = str2;
        return l61Var;
    }

    public static l61 e(int i10, String str) {
        l61 l61Var = new l61(3);
        l61Var.d = i10;
        l61Var.f26954l = str;
        return l61Var;
    }

    public static l61 f(String str, CharSequence charSequence, int i10) {
        l61 l61Var = new l61(3);
        l61Var.d = i10;
        l61Var.f26954l = str;
        l61Var.f26956n = charSequence;
        return l61Var;
    }

    public static l61 g(CharSequence charSequence) {
        l61 l61Var = new l61(7);
        l61Var.f26954l = charSequence;
        l61Var.f26959q = true;
        return l61Var;
    }

    public static l61 h(int i10, int i11, ta1 ta1Var) {
        l61 l61Var = new l61(i10 + 18);
        l61Var.f26967z = i11;
        l61Var.G = ta1Var;
        return l61Var;
    }

    public static l61 i(int i10, CharSequence charSequence) {
        l61 l61Var = new l61(4);
        l61Var.d = i10;
        l61Var.f26954l = charSequence;
        return l61Var;
    }

    public static l61 j(int i10, View view) {
        l61 l61Var = new l61(-1);
        l61Var.d = i10;
        l61Var.f26948c = view;
        l61Var.f26967z = -1;
        return l61Var;
    }

    public static l61 k(View view) {
        l61 l61Var = new l61(-1);
        l61Var.f26948c = view;
        l61Var.f26967z = -1;
        return l61Var;
    }

    public static l61 l(View view) {
        l61 l61Var = new l61(-4);
        l61Var.f26948c = view;
        l61Var.f26967z = -1;
        return l61Var;
    }

    public static l61 m(int i10, String str, String str2) {
        l61 l61Var = new l61(40);
        l61Var.d = i10;
        l61Var.f26954l = str;
        l61Var.f26957o = str2;
        return l61Var;
    }

    public static l61 n(int i10) {
        l61 l61Var = new l61(34);
        l61Var.f26967z = i10;
        return l61Var;
    }

    public static l61 o(int i10, int i11) {
        l61 l61Var = new l61(34);
        l61Var.d = i10;
        l61Var.f26967z = i11;
        return l61Var;
    }

    public static l61 p(View view, int i10, boolean z10) {
        l61 l61Var = new l61(-3);
        l61Var.f26948c = view;
        l61Var.f26967z = i10;
        l61Var.f26966y = z10 ? 1 : 0;
        return l61Var;
    }

    public static l61 q(String str) {
        l61 l61Var = new l61(31);
        l61Var.f26954l = str;
        return l61Var;
    }

    public static l61 r(String str, String str2, View.OnClickListener onClickListener) {
        l61 l61Var = new l61(31);
        l61Var.f26954l = str;
        l61Var.f26955m = str2;
        l61Var.D = onClickListener;
        return l61Var;
    }

    public static l61 s(int i10, String str) {
        l61 l61Var = new l61(0);
        l61Var.d = i10;
        l61Var.f26954l = str;
        return l61Var;
    }

    public static l61 t(String str) {
        l61 l61Var = new l61(0);
        l61Var.f26954l = str;
        return l61Var;
    }

    public static l61 u(org.telegram.ui.ne neVar) {
        l61 l61Var = new l61(24);
        l61Var.G = neVar;
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
        l61Var.f26954l = str;
        return l61Var;
    }

    public static l61 x(int i10, String str, String str2) {
        l61 l61Var = new l61(44);
        l61Var.d = i10;
        l61Var.f26954l = str;
        l61Var.f26956n = str2;
        return l61Var;
    }

    public static l61 y(int i10, CharSequence charSequence) {
        l61 l61Var = new l61(35);
        l61Var.d = i10;
        l61Var.f26954l = charSequence;
        return l61Var;
    }

    public static l61 z(String str, CharSequence charSequence, int i10) {
        l61 l61Var = new l61(41);
        l61Var.d = i10;
        l61Var.f26954l = charSequence;
        l61Var.f26957o = str;
        return l61Var;
    }

    public final boolean G(Class cls) {
        HashMap hashMap;
        k61 k61Var;
        if (this.f43203a >= 10000 && (hashMap = L) != null && (k61Var = (k61) hashMap.get(cls)) != null && k61Var.viewType == this.f43203a) {
            return true;
        }
        return false;
    }

    public final boolean H(org.telegram.ui.Components.l61 r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.l61.H(org.telegram.ui.Components.l61):boolean");
    }

    public final boolean I(l61 l61Var) {
        if (this.d == l61Var.d && this.f26951i == l61Var.f26951i && this.f26965x == l61Var.f26965x && this.f26953k == l61Var.f26953k && this.f26952j == l61Var.f26952j && this.f26961s == l61Var.f26961s && this.f26960r == l61Var.f26960r && this.f26962t == l61Var.f26962t && this.f26959q == l61Var.f26959q && this.f26948c == l61Var.f26948c && TextUtils.equals(this.f26954l, l61Var.f26954l) && TextUtils.equals(this.f26955m, l61Var.f26955m) && TextUtils.equals(this.f26956n, l61Var.f26956n) && this.f26948c == l61Var.f26948c && this.f26967z == l61Var.f26967z && Math.abs(this.A - l61Var.A) < 0.01f && this.B == l61Var.B && Objects.equals(this.G, l61Var.G) && Objects.equals(this.H, l61Var.H)) {
            return true;
        }
        return false;
    }

    public final void K(boolean z10) {
        this.e = z10;
        if (this.f43203a == 11) {
            this.f43203a = 12;
        }
    }

    @Override
    public final boolean a(pg.a aVar) {
        k61 F;
        if (this != aVar) {
            if (l61.class == aVar.getClass()) {
                l61 l61Var = (l61) aVar;
                int i10 = this.f43203a;
                if (i10 == l61Var.f43203a) {
                    if (i10 == 31) {
                        if (TextUtils.equals(this.f26954l, l61Var.f26954l) && TextUtils.equals(this.f26955m, l61Var.f26955m)) {
                            return true;
                        }
                        return false;
                    } else if (i10 == 28) {
                        if (this.f26967z == l61Var.f26967z) {
                            return true;
                        }
                        return false;
                    } else if (i10 != 35 && i10 != 37) {
                        if (i10 >= 10000 && (F = F(i10)) != null) {
                            return F.contentsEquals(this, l61Var);
                        }
                        return H(l61Var);
                    } else if (this.d == l61Var.d && TextUtils.equals(this.f26954l, l61Var.f26954l) && this.e == l61Var.e) {
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
                int i10 = this.f43203a;
                if (i10 == l61Var.f43203a) {
                    if (i10 != 36 && i10 != 35) {
                        if (i10 == 28) {
                            if (this.d == l61Var.d) {
                                return true;
                            }
                            return false;
                        } else if (i10 == 31) {
                            return TextUtils.equals(this.f26954l, l61Var.f26954l);
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
