package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import j$.util.Objects;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.f91;
public final class w41 extends zf.a {
    public static int J = 10000;
    public static LongSparseArray K;
    public static HashMap L;
    public float A;
    public long B;
    public Utilities.Callback C;
    public View.OnClickListener D;
    public View.OnClickListener E;
    public org.telegram.ui.x3 F;
    public Object G;
    public Object H;
    public boolean I;
    public View f34293c;
    public int d;
    public boolean f34294e;
    public boolean f34295f;
    public boolean f34296g;
    public boolean h;
    public int f34297i;
    public boolean f34298j;
    public int f34299k;
    public CharSequence f34300l;
    public CharSequence f34301m;
    public CharSequence f34302n;
    public CharSequence f34303o;
    public String[] f34304p;
    public boolean f34305q;
    public boolean f34306r;
    public boolean f34307s;
    public boolean f34308t;
    public int f34309u;
    public int v;
    public boolean f34310w;
    public long f34311x;
    public int f34312y;
    public int f34313z;

    public w41(int i10) {
        super(i10, false);
        this.f34296g = true;
        this.f34309u = -1;
        this.I = true;
    }

    public static w41 A(int i10, CharSequence charSequence) {
        w41 w41Var = new w41(7);
        w41Var.d = i10;
        w41Var.f34300l = charSequence;
        return w41Var;
    }

    public static w41 B(CharSequence charSequence) {
        w41 w41Var = new w41(7);
        w41Var.f34300l = charSequence;
        return w41Var;
    }

    public static w41 C(int i10) {
        w41 w41Var = new w41(28);
        w41Var.f34313z = i10;
        return w41Var;
    }

    public static w41 D(int i10, int i11) {
        w41 w41Var = new w41(28);
        w41Var.d = i10;
        w41Var.f34313z = i11;
        return w41Var;
    }

    public static w41 E(int i10, String str) {
        w41 w41Var = new w41(39);
        w41Var.d = i10;
        w41Var.f34300l = str;
        w41Var.f34313z = 1;
        return w41Var;
    }

    public static v41 F(int i10) {
        LongSparseArray longSparseArray = K;
        if (longSparseArray == null) {
            return null;
        }
        return (v41) longSparseArray.get(i10);
    }

    public static w41 J(Class cls) {
        if (L == null) {
            L = new HashMap();
        }
        if (K == null) {
            K = new LongSparseArray();
        }
        v41 v41Var = (v41) L.get(cls);
        if (v41Var != null) {
            return new w41(v41Var.viewType);
        }
        throw new RuntimeException("UItemFactory was not setuped: " + cls);
    }

    public static w41 b(String str) {
        w41 w41Var = new w41(1);
        w41Var.f34300l = str;
        return w41Var;
    }

    public static w41 c(int i10, int i11, String str) {
        w41 w41Var = new w41(3);
        w41Var.d = i10;
        w41Var.f34299k = i11;
        w41Var.f34300l = str;
        return w41Var;
    }

    public static w41 d(int i10, int i11, String str, String str2) {
        w41 w41Var = new w41(3);
        w41Var.d = i10;
        w41Var.f34299k = i11;
        w41Var.f34300l = str;
        w41Var.f34302n = str2;
        return w41Var;
    }

    public static w41 e(int i10, String str) {
        w41 w41Var = new w41(3);
        w41Var.d = i10;
        w41Var.f34300l = str;
        return w41Var;
    }

    public static w41 f(String str, CharSequence charSequence, int i10) {
        w41 w41Var = new w41(3);
        w41Var.d = i10;
        w41Var.f34300l = str;
        w41Var.f34302n = charSequence;
        return w41Var;
    }

    public static w41 g(CharSequence charSequence) {
        w41 w41Var = new w41(7);
        w41Var.f34300l = charSequence;
        w41Var.f34305q = true;
        return w41Var;
    }

    public static w41 h(int i10, int i11, f91 f91Var) {
        w41 w41Var = new w41(i10 + 18);
        w41Var.f34313z = i11;
        w41Var.G = f91Var;
        return w41Var;
    }

    public static w41 i(int i10, CharSequence charSequence) {
        w41 w41Var = new w41(4);
        w41Var.d = i10;
        w41Var.f34300l = charSequence;
        return w41Var;
    }

    public static w41 j(int i10, View view) {
        w41 w41Var = new w41(-1);
        w41Var.d = i10;
        w41Var.f34293c = view;
        w41Var.f34313z = -1;
        return w41Var;
    }

    public static w41 k(View view) {
        w41 w41Var = new w41(-1);
        w41Var.f34293c = view;
        w41Var.f34313z = -1;
        return w41Var;
    }

    public static w41 l(View view) {
        w41 w41Var = new w41(-4);
        w41Var.f34293c = view;
        w41Var.f34313z = -1;
        return w41Var;
    }

    public static w41 m(int i10, String str, String str2) {
        w41 w41Var = new w41(40);
        w41Var.d = i10;
        w41Var.f34300l = str;
        w41Var.f34303o = str2;
        return w41Var;
    }

    public static w41 n(int i10) {
        w41 w41Var = new w41(34);
        w41Var.f34313z = i10;
        return w41Var;
    }

    public static w41 o(int i10, int i11) {
        w41 w41Var = new w41(34);
        w41Var.d = i10;
        w41Var.f34313z = i11;
        return w41Var;
    }

    public static w41 p(View view, int i10, boolean z10) {
        w41 w41Var = new w41(-3);
        w41Var.f34293c = view;
        w41Var.f34313z = i10;
        w41Var.f34312y = z10 ? 1 : 0;
        return w41Var;
    }

    public static w41 q(String str) {
        w41 w41Var = new w41(31);
        w41Var.f34300l = str;
        return w41Var;
    }

    public static w41 r(String str, String str2, View.OnClickListener onClickListener) {
        w41 w41Var = new w41(31);
        w41Var.f34300l = str;
        w41Var.f34301m = str2;
        w41Var.D = onClickListener;
        return w41Var;
    }

    public static w41 s(int i10, String str) {
        w41 w41Var = new w41(0);
        w41Var.d = i10;
        w41Var.f34300l = str;
        return w41Var;
    }

    public static w41 t(String str) {
        w41 w41Var = new w41(0);
        w41Var.f34300l = str;
        return w41Var;
    }

    public static w41 u(org.telegram.ui.ae aeVar) {
        w41 w41Var = new w41(24);
        w41Var.G = aeVar;
        return w41Var;
    }

    public static w41 v(TLObject tLObject) {
        w41 w41Var = new w41(32);
        w41Var.G = tLObject;
        return w41Var;
    }

    public static w41 w(int i10, String str) {
        w41 w41Var = new w41(10);
        w41Var.d = i10;
        w41Var.f34300l = str;
        return w41Var;
    }

    public static w41 x(int i10, String str, String str2) {
        w41 w41Var = new w41(44);
        w41Var.d = i10;
        w41Var.f34300l = str;
        w41Var.f34302n = str2;
        return w41Var;
    }

    public static w41 y(int i10, CharSequence charSequence) {
        w41 w41Var = new w41(35);
        w41Var.d = i10;
        w41Var.f34300l = charSequence;
        return w41Var;
    }

    public static w41 z(String str, CharSequence charSequence, int i10) {
        w41 w41Var = new w41(41);
        w41Var.d = i10;
        w41Var.f34300l = charSequence;
        w41Var.f34303o = str;
        return w41Var;
    }

    public final boolean G(Class cls) {
        HashMap hashMap;
        v41 v41Var;
        if (this.f50845a >= 10000 && (hashMap = L) != null && (v41Var = (v41) hashMap.get(cls)) != null && v41Var.viewType == this.f50845a) {
            return true;
        }
        return false;
    }

    public final boolean H(org.telegram.ui.Components.w41 r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.w41.H(org.telegram.ui.Components.w41):boolean");
    }

    public final boolean I(w41 w41Var) {
        if (this.d == w41Var.d && this.f34297i == w41Var.f34297i && this.f34311x == w41Var.f34311x && this.f34299k == w41Var.f34299k && this.f34298j == w41Var.f34298j && this.f34307s == w41Var.f34307s && this.f34306r == w41Var.f34306r && this.f34308t == w41Var.f34308t && this.f34305q == w41Var.f34305q && this.f34293c == w41Var.f34293c && TextUtils.equals(this.f34300l, w41Var.f34300l) && TextUtils.equals(this.f34301m, w41Var.f34301m) && TextUtils.equals(this.f34302n, w41Var.f34302n) && this.f34293c == w41Var.f34293c && this.f34313z == w41Var.f34313z && Math.abs(this.A - w41Var.A) < 0.01f && this.B == w41Var.B && Objects.equals(this.G, w41Var.G) && Objects.equals(this.H, w41Var.H)) {
            return true;
        }
        return false;
    }

    public final void K(boolean z10) {
        this.f34294e = z10;
        if (this.f50845a == 11) {
            this.f50845a = 12;
        }
    }

    @Override
    public final boolean a(zf.a aVar) {
        v41 F;
        if (this != aVar) {
            if (w41.class == aVar.getClass()) {
                w41 w41Var = (w41) aVar;
                int i10 = this.f50845a;
                if (i10 == w41Var.f50845a) {
                    if (i10 == 31) {
                        if (TextUtils.equals(this.f34300l, w41Var.f34300l) && TextUtils.equals(this.f34301m, w41Var.f34301m)) {
                            return true;
                        }
                        return false;
                    } else if (i10 == 28) {
                        if (this.f34313z == w41Var.f34313z) {
                            return true;
                        }
                        return false;
                    } else if (i10 != 35 && i10 != 37) {
                        if (i10 >= 10000 && (F = F(i10)) != null) {
                            return F.contentsEquals(this, w41Var);
                        }
                        return H(w41Var);
                    } else if (this.d == w41Var.d && TextUtils.equals(this.f34300l, w41Var.f34300l) && this.f34294e == w41Var.f34294e) {
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
        v41 F;
        if (this != obj) {
            if (obj != null && w41.class == obj.getClass()) {
                w41 w41Var = (w41) obj;
                int i10 = this.f50845a;
                if (i10 == w41Var.f50845a) {
                    if (i10 != 36 && i10 != 35) {
                        if (i10 == 28) {
                            if (this.d == w41Var.d) {
                                return true;
                            }
                            return false;
                        } else if (i10 == 31) {
                            return TextUtils.equals(this.f34300l, w41Var.f34300l);
                        } else {
                            if (i10 >= 10000 && (F = F(i10)) != null) {
                                return F.equals(this, w41Var);
                            }
                            return I(w41Var);
                        }
                    } else if (this.d == w41Var.d) {
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
