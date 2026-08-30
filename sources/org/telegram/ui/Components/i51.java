package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import j$.util.Objects;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.s91;
public final class i51 extends bg.b {
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
    public View f25559c;
    public int d;
    public boolean e;
    public boolean f25560f;
    public boolean f25561g;
    public boolean h;
    public int f25562i;
    public boolean f25563j;
    public int f25564k;
    public CharSequence f25565l;
    public CharSequence f25566m;
    public CharSequence f25567n;
    public CharSequence f25568o;
    public String[] f25569p;
    public boolean f25570q;
    public boolean f25571r;
    public boolean f25572s;
    public boolean f25573t;
    public int f25574u;
    public int v;
    public boolean f25575w;
    public long f25576x;
    public int f25577y;
    public int f25578z;

    public i51(int i10) {
        super(i10, false);
        this.f25561g = true;
        this.f25574u = -1;
        this.I = true;
    }

    public static i51 A(int i10, CharSequence charSequence) {
        i51 i51Var = new i51(7);
        i51Var.d = i10;
        i51Var.f25565l = charSequence;
        return i51Var;
    }

    public static i51 B(CharSequence charSequence) {
        i51 i51Var = new i51(7);
        i51Var.f25565l = charSequence;
        return i51Var;
    }

    public static i51 C(int i10) {
        i51 i51Var = new i51(28);
        i51Var.f25578z = i10;
        return i51Var;
    }

    public static i51 D(int i10, int i11) {
        i51 i51Var = new i51(28);
        i51Var.d = i10;
        i51Var.f25578z = i11;
        return i51Var;
    }

    public static i51 E(int i10, String str) {
        i51 i51Var = new i51(39);
        i51Var.d = i10;
        i51Var.f25565l = str;
        i51Var.f25578z = 1;
        return i51Var;
    }

    public static h51 F(int i10) {
        LongSparseArray longSparseArray = K;
        if (longSparseArray == null) {
            return null;
        }
        return (h51) longSparseArray.get(i10);
    }

    public static i51 J(Class cls) {
        if (L == null) {
            L = new HashMap();
        }
        if (K == null) {
            K = new LongSparseArray();
        }
        h51 h51Var = (h51) L.get(cls);
        if (h51Var != null) {
            return new i51(h51Var.viewType);
        }
        throw new RuntimeException("UItemFactory was not setuped: " + cls);
    }

    public static i51 b(String str) {
        i51 i51Var = new i51(1);
        i51Var.f25565l = str;
        return i51Var;
    }

    public static i51 c(int i10, int i11, String str) {
        i51 i51Var = new i51(3);
        i51Var.d = i10;
        i51Var.f25564k = i11;
        i51Var.f25565l = str;
        return i51Var;
    }

    public static i51 d(int i10, int i11, String str, String str2) {
        i51 i51Var = new i51(3);
        i51Var.d = i10;
        i51Var.f25564k = i11;
        i51Var.f25565l = str;
        i51Var.f25567n = str2;
        return i51Var;
    }

    public static i51 e(int i10, String str) {
        i51 i51Var = new i51(3);
        i51Var.d = i10;
        i51Var.f25565l = str;
        return i51Var;
    }

    public static i51 f(String str, CharSequence charSequence, int i10) {
        i51 i51Var = new i51(3);
        i51Var.d = i10;
        i51Var.f25565l = str;
        i51Var.f25567n = charSequence;
        return i51Var;
    }

    public static i51 g(CharSequence charSequence) {
        i51 i51Var = new i51(7);
        i51Var.f25565l = charSequence;
        i51Var.f25570q = true;
        return i51Var;
    }

    public static i51 h(int i10, int i11, s91 s91Var) {
        i51 i51Var = new i51(i10 + 18);
        i51Var.f25578z = i11;
        i51Var.G = s91Var;
        return i51Var;
    }

    public static i51 i(int i10, CharSequence charSequence) {
        i51 i51Var = new i51(4);
        i51Var.d = i10;
        i51Var.f25565l = charSequence;
        return i51Var;
    }

    public static i51 j(int i10, View view) {
        i51 i51Var = new i51(-1);
        i51Var.d = i10;
        i51Var.f25559c = view;
        i51Var.f25578z = -1;
        return i51Var;
    }

    public static i51 k(View view) {
        i51 i51Var = new i51(-1);
        i51Var.f25559c = view;
        i51Var.f25578z = -1;
        return i51Var;
    }

    public static i51 l(View view) {
        i51 i51Var = new i51(-4);
        i51Var.f25559c = view;
        i51Var.f25578z = -1;
        return i51Var;
    }

    public static i51 m(int i10, String str, String str2) {
        i51 i51Var = new i51(40);
        i51Var.d = i10;
        i51Var.f25565l = str;
        i51Var.f25568o = str2;
        return i51Var;
    }

    public static i51 n(int i10) {
        i51 i51Var = new i51(34);
        i51Var.f25578z = i10;
        return i51Var;
    }

    public static i51 o(int i10, int i11) {
        i51 i51Var = new i51(34);
        i51Var.d = i10;
        i51Var.f25578z = i11;
        return i51Var;
    }

    public static i51 p(View view, int i10, boolean z4) {
        i51 i51Var = new i51(-3);
        i51Var.f25559c = view;
        i51Var.f25578z = i10;
        i51Var.f25577y = z4 ? 1 : 0;
        return i51Var;
    }

    public static i51 q(String str) {
        i51 i51Var = new i51(31);
        i51Var.f25565l = str;
        return i51Var;
    }

    public static i51 r(String str, String str2, View.OnClickListener onClickListener) {
        i51 i51Var = new i51(31);
        i51Var.f25565l = str;
        i51Var.f25566m = str2;
        i51Var.D = onClickListener;
        return i51Var;
    }

    public static i51 s(int i10, String str) {
        i51 i51Var = new i51(0);
        i51Var.d = i10;
        i51Var.f25565l = str;
        return i51Var;
    }

    public static i51 t(String str) {
        i51 i51Var = new i51(0);
        i51Var.f25565l = str;
        return i51Var;
    }

    public static i51 u(org.telegram.ui.he heVar) {
        i51 i51Var = new i51(24);
        i51Var.G = heVar;
        return i51Var;
    }

    public static i51 v(TLObject tLObject) {
        i51 i51Var = new i51(32);
        i51Var.G = tLObject;
        return i51Var;
    }

    public static i51 w(int i10, String str) {
        i51 i51Var = new i51(10);
        i51Var.d = i10;
        i51Var.f25565l = str;
        return i51Var;
    }

    public static i51 x(int i10, String str, String str2) {
        i51 i51Var = new i51(44);
        i51Var.d = i10;
        i51Var.f25565l = str;
        i51Var.f25567n = str2;
        return i51Var;
    }

    public static i51 y(int i10, CharSequence charSequence) {
        i51 i51Var = new i51(35);
        i51Var.d = i10;
        i51Var.f25565l = charSequence;
        return i51Var;
    }

    public static i51 z(String str, CharSequence charSequence, int i10) {
        i51 i51Var = new i51(41);
        i51Var.d = i10;
        i51Var.f25565l = charSequence;
        i51Var.f25568o = str;
        return i51Var;
    }

    public final boolean G(Class cls) {
        HashMap hashMap;
        h51 h51Var;
        if (this.f1808a >= 10000 && (hashMap = L) != null && (h51Var = (h51) hashMap.get(cls)) != null && h51Var.viewType == this.f1808a) {
            return true;
        }
        return false;
    }

    public final boolean H(org.telegram.ui.Components.i51 r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.i51.H(org.telegram.ui.Components.i51):boolean");
    }

    public final boolean I(i51 i51Var) {
        if (this.d == i51Var.d && this.f25562i == i51Var.f25562i && this.f25576x == i51Var.f25576x && this.f25564k == i51Var.f25564k && this.f25563j == i51Var.f25563j && this.f25572s == i51Var.f25572s && this.f25571r == i51Var.f25571r && this.f25573t == i51Var.f25573t && this.f25570q == i51Var.f25570q && this.f25559c == i51Var.f25559c && TextUtils.equals(this.f25565l, i51Var.f25565l) && TextUtils.equals(this.f25566m, i51Var.f25566m) && TextUtils.equals(this.f25567n, i51Var.f25567n) && this.f25559c == i51Var.f25559c && this.f25578z == i51Var.f25578z && Math.abs(this.A - i51Var.A) < 0.01f && this.B == i51Var.B && Objects.equals(this.G, i51Var.G) && Objects.equals(this.H, i51Var.H)) {
            return true;
        }
        return false;
    }

    public final void K(boolean z4) {
        this.e = z4;
        if (this.f1808a == 11) {
            this.f1808a = 12;
        }
    }

    @Override
    public final boolean a(bg.b bVar) {
        h51 F;
        if (this != bVar) {
            if (i51.class == bVar.getClass()) {
                i51 i51Var = (i51) bVar;
                int i10 = this.f1808a;
                if (i10 == i51Var.f1808a) {
                    if (i10 == 31) {
                        if (TextUtils.equals(this.f25565l, i51Var.f25565l) && TextUtils.equals(this.f25566m, i51Var.f25566m)) {
                            return true;
                        }
                        return false;
                    } else if (i10 == 28) {
                        if (this.f25578z == i51Var.f25578z) {
                            return true;
                        }
                        return false;
                    } else if (i10 != 35 && i10 != 37) {
                        if (i10 >= 10000 && (F = F(i10)) != null) {
                            return F.contentsEquals(this, i51Var);
                        }
                        return H(i51Var);
                    } else if (this.d == i51Var.d && TextUtils.equals(this.f25565l, i51Var.f25565l) && this.e == i51Var.e) {
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
        h51 F;
        if (this != obj) {
            if (obj != null && i51.class == obj.getClass()) {
                i51 i51Var = (i51) obj;
                int i10 = this.f1808a;
                if (i10 == i51Var.f1808a) {
                    if (i10 != 36 && i10 != 35) {
                        if (i10 == 28) {
                            if (this.d == i51Var.d) {
                                return true;
                            }
                            return false;
                        } else if (i10 == 31) {
                            return TextUtils.equals(this.f25565l, i51Var.f25565l);
                        } else {
                            if (i10 >= 10000 && (F = F(i10)) != null) {
                                return F.equals(this, i51Var);
                            }
                            return I(i51Var);
                        }
                    } else if (this.d == i51Var.d) {
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
