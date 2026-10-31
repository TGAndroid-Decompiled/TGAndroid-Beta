package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
public class p51 extends hg.c {
    public bg.h E;
    public m51 I;
    public m51 J;
    public int K;
    public boolean L;
    public org.telegram.messenger.j20 M;
    public boolean N;
    public final tk0 d;
    public final Context e;
    public final int f29293f;
    public final int h;
    public final boolean f29294n;
    public boolean f29296s;
    public org.telegram.messenger.j20 f29297w;
    public final org.telegram.ui.ActionBar.p6 f29298x;
    public boolean f29295r = true;
    public final ArrayList f29299y = new ArrayList();
    public final ArrayList D = new ArrayList();
    public int F = 0;
    public final ArrayList G = new ArrayList();
    public final ArrayList H = new ArrayList();
    public final org.telegram.ui.ActionBar.v1 O = new org.telegram.ui.ActionBar.v1(this, 2);

    public p51(tk0 tk0Var, Context context, int i10, int i11, boolean z10, org.telegram.messenger.j20 j20Var, org.telegram.ui.ActionBar.p6 p6Var) {
        this.d = tk0Var;
        this.e = context;
        this.f29293f = i10;
        this.h = i11;
        this.f29294n = z10;
        this.f29297w = j20Var;
        this.f29298x = p6Var;
        O(false);
    }

    public static boolean K(int i10) {
        if (i10 >= 10000) {
            z41 G = a51.G(i10);
            if (G == null || !G.g()) {
                return false;
            }
            return true;
        } else if (i10 != 7 && i10 != 8 && i10 != 38 && i10 != 31 && i10 != -4 && i10 != 28 && i10 != 2 && i10 != -2) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f47901f;
        a51 G = G(c1Var.b());
        if (i10 >= 10000) {
            z41 G2 = a51.G(i10);
            if (G2 == null || !G2.f()) {
                return false;
            }
        } else if (i10 != 3 && i10 != 5 && i10 != 6 && i10 != 30 && i10 != 4 && i10 != 10 && i10 != 44 && i10 != 11 && i10 != 12 && i10 != 17 && i10 != 16 && i10 != 29 && i10 != 25 && i10 != 27 && i10 != 32 && i10 != 33 && i10 != 35 && i10 != 36 && i10 != 37 && i10 != 41 && i10 != 39 && i10 != 40 && i10 != 38) {
            return false;
        }
        if (G != null && !G.f24288g) {
            return false;
        }
        return true;
    }

    public final void F(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.H;
            if (i10 < arrayList.size()) {
                m51 m51Var = (m51) arrayList.get(i10);
                this.M.a(Integer.valueOf(i10), new ArrayList(this.D.subList(m51Var.f28292a, m51Var.f28293b + 1)));
                this.L = false;
            }
        }
    }

    public final a51 G(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.D;
            if (i10 < arrayList.size()) {
                return (a51) arrayList.get(i10);
            }
            return null;
        }
        return null;
    }

    public final int H(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.H;
            if (i11 < arrayList.size()) {
                m51 m51Var = (m51) arrayList.get(i11);
                if (i10 >= m51Var.f28292a && i10 <= m51Var.f28293b) {
                    return i11;
                }
                i11++;
            } else {
                return -1;
            }
        }
    }

    public int I(int i10) {
        return org.telegram.ui.ActionBar.t6.w0(i10, this.f29298x);
    }

    public final boolean J(int i10) {
        a51 G = G(i10);
        a51 G2 = G(i10 + 1);
        if (G != null && !G.f24290j && G2 != null && K(G2.f7680a) == K(G.f7680a)) {
            return true;
        }
        return false;
    }

    public final void L() {
        m51 m51Var = this.J;
        if (m51Var != null) {
            m51Var.f28293b = Math.max(0, this.D.size() - 1);
        }
    }

    public final int M() {
        ?? obj = new Object();
        this.J = obj;
        obj.f28292a = this.D.size();
        m51 m51Var = this.J;
        m51Var.f28293b = -1;
        ArrayList arrayList = this.H;
        arrayList.add(m51Var);
        return arrayList.size() - 1;
    }

    public final boolean N(int i10) {
        if (this.f29295r) {
            tk0 tk0Var = this.d;
            if (tk0Var == null || !tk0Var.b1() || !tk0Var.getSectionsDrawBackground()) {
                if (i10 >= 10000) {
                    return true;
                }
                switch (i10) {
                    case -5:
                    case -3:
                    case 0:
                    case 1:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                        return true;
                    case -4:
                    case -2:
                    case -1:
                    case 2:
                    case 7:
                    case 8:
                    case 26:
                    case 31:
                    case 38:
                    default:
                        return false;
                }
            }
            return false;
        }
        return false;
    }

    public void O(boolean z10) {
        tk0 tk0Var = this.d;
        if (tk0Var != null && tk0Var.c0()) {
            tk0Var.post(new k2.v(25, this, z10));
        } else {
            Q(z10);
        }
    }

    public final void P(s4.c1 c1Var) {
        int i10;
        View view = c1Var.f47898a;
        if (view instanceof org.telegram.ui.ActionBar.k6) {
            ((org.telegram.ui.ActionBar.k6) view).updateColors();
            Object tag = view.getTag(2131296710);
            int i11 = org.telegram.ui.ActionBar.a7.f20158b;
            if (N(c1Var.f47901f) && (!(tag instanceof Integer) || ((Integer) tag).intValue() != i11)) {
                if (this.f29294n) {
                    i10 = org.telegram.ui.ActionBar.t6.f21001h5;
                } else {
                    i10 = org.telegram.ui.ActionBar.t6.f20929d6;
                }
                view.setBackgroundColor(I(i10));
            }
            view.setTag(2131296710, Integer.valueOf(i11));
        }
    }

    public final void Q(boolean z10) {
        tk0 tk0Var = this.d;
        if (tk0Var == null || !tk0Var.c0()) {
            ArrayList arrayList = this.f29299y;
            arrayList.clear();
            ArrayList arrayList2 = this.D;
            arrayList.addAll(arrayList2);
            arrayList2.clear();
            this.I = null;
            this.G.clear();
            this.H.clear();
            org.telegram.messenger.j20 j20Var = this.f29297w;
            if (j20Var != null) {
                j20Var.a(arrayList2, this);
                S();
                if (z10) {
                    E(arrayList, arrayList2);
                } else {
                    f();
                }
            }
        }
    }

    public final void R(s4.c1 c1Var, boolean z10) {
        if (c1Var != null) {
            View view = c1Var.f47898a;
            int i10 = c1Var.f47901f;
            if (i10 >= 10000) {
                z41 G = a51.G(i10);
                if (G != null) {
                    G.a(this.d, view, G(c1Var.b()));
                }
            } else if (i10 != 16) {
            } else {
                ((ag.y2) view).setReorder(z10);
            }
        }
    }

    public final void S() {
        tk0 tk0Var = this.d;
        if (tk0Var != null) {
            ArrayList arrayList = tk0Var.K2;
            if (arrayList == null) {
                tk0Var.K2 = new ArrayList();
            } else {
                arrayList.clear();
            }
            ArrayList arrayList2 = this.G;
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                m51 m51Var = (m51) obj;
                tk0Var.K2.add(Long.valueOf(org.telegram.messenger.i0.w2(m51Var.f28292a, m51Var.f28293b)));
            }
        }
    }

    public final void T() {
        ArrayList arrayList = this.f29299y;
        arrayList.clear();
        ArrayList arrayList2 = this.D;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        this.G.clear();
        this.H.clear();
        org.telegram.messenger.j20 j20Var = this.f29297w;
        if (j20Var != null) {
            j20Var.a(arrayList2, this);
        }
        S();
    }

    public final void U() {
        m51 m51Var = this.I;
        if (m51Var != null) {
            m51Var.f28293b = Math.max(0, (this.D.size() + this.F) - 1);
            m51 m51Var2 = this.I;
            if (m51Var2.f28292a == m51Var2.f28293b) {
                this.G.remove(m51Var2);
            }
            this.I = null;
        }
    }

    public final void V() {
        ?? obj = new Object();
        this.I = obj;
        obj.f28292a = this.D.size() + this.F;
        m51 m51Var = this.I;
        m51Var.f28293b = -1;
        this.G.add(m51Var);
    }

    @Override
    public final int b() {
        return this.D.size();
    }

    @Override
    public final int d(int i10) {
        a51 G = G(i10);
        if (G == null) {
            return 0;
        }
        return G.f7680a;
    }

    @Override
    public void t(s4.c1 r38, int r39) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.p51.t(s4.c1, int):void");
    }

    @Override
    public s4.c1 w(ViewGroup viewGroup, int i10) {
        int i11;
        View frameLayout;
        zz p4Var;
        View p4Var2;
        View l5Var;
        boolean z10;
        int i12;
        int i13;
        float f7;
        float f10;
        int i14;
        int i15;
        int i16;
        org.telegram.ui.Cells.p4 p4Var3;
        boolean z11 = this.f29294n;
        if (z11) {
            i11 = org.telegram.ui.ActionBar.t6.f21001h5;
        } else {
            i11 = org.telegram.ui.ActionBar.t6.f20929d6;
        }
        tk0 tk0Var = this.d;
        org.telegram.ui.ActionBar.p6 p6Var = this.f29298x;
        Context context = this.e;
        if (i10 >= 10000) {
            z41 G = a51.G(i10);
            if (G != null) {
                p4Var = G.d(context, tk0Var, this.f29293f, p6Var);
            } else {
                p4Var = new View(context);
            }
        } else {
            int i17 = 3;
            int i18 = 8;
            boolean z12 = true;
            switch (i10) {
                case -5:
                    frameLayout = new FrameLayout(context);
                    frameLayout.setTag(-33024);
                    p4Var = frameLayout;
                    break;
                case -4:
                case -1:
                    frameLayout = new org.telegram.ui.Cells.a5(context, 27);
                    if (i10 == -4) {
                        frameLayout.setTag(-33024);
                    }
                    p4Var = frameLayout;
                    break;
                case -3:
                    ?? frameLayout2 = new FrameLayout(context);
                    frameLayout2.f28015a = 0;
                    p4Var = frameLayout2;
                    break;
                case -2:
                    p4Var = new org.telegram.ui.Cells.a5(context, 28);
                    break;
                case 0:
                    if (z11) {
                        p4Var = new org.telegram.ui.Cells.p4(this.e, org.telegram.ui.ActionBar.t6.L6, 21, 15, 0, false, false, this.f29298x);
                        break;
                    } else {
                        p4Var = new org.telegram.ui.Cells.p4(context, p6Var);
                        break;
                    }
                case 1:
                    p4Var2 = new org.telegram.ui.Cells.p4(this.e, org.telegram.ui.ActionBar.t6.G6, 17, 15, false, this.f29298x);
                    p4Var = p4Var2;
                    break;
                case 2:
                    p4Var = new j11(context, p6Var);
                    break;
                case 3:
                    org.telegram.ui.Cells.p8 p8Var = new org.telegram.ui.Cells.p8(context, p6Var);
                    p8Var.setCompactLayout(this.f29296s);
                    p4Var = p8Var;
                    break;
                case 4:
                case 9:
                    org.telegram.ui.Cells.t8 t8Var = new org.telegram.ui.Cells.t8(context, p6Var);
                    if (i10 == 9) {
                        t8Var.setDrawCheckRipple(true);
                        t8Var.d(org.telegram.ui.ActionBar.t6.f20985g6, org.telegram.ui.ActionBar.t6.O6, org.telegram.ui.ActionBar.t6.P6, org.telegram.ui.ActionBar.t6.Q6, org.telegram.ui.ActionBar.t6.R6);
                        t8Var.setTypeface(org.telegram.messenger.i0.o());
                        t8Var.setHeight(56);
                    }
                    p4Var = t8Var;
                    break;
                case 5:
                case 6:
                    if (i10 == 6) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    l5Var = new org.telegram.ui.Cells.l5(21, 60, this.e, this.f29298x, z10);
                    p4Var = l5Var;
                    break;
                case 7:
                case 8:
                default:
                    p4Var = new org.telegram.ui.Cells.b9(context, p6Var);
                    break;
                case 10:
                    ?? frameLayout3 = new FrameLayout(context);
                    frameLayout3.f23568f = 23;
                    TextView textView = new TextView(context);
                    frameLayout3.f23566b = textView;
                    org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.G6, null);
                    org.telegram.messenger.z20.o(textView, 1, 16.0f, 1, 1);
                    textView.setSingleLine(true);
                    TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                    textView.setEllipsize(truncateAt);
                    if (org.telegram.messenger.cd.X) {
                        i12 = 5;
                    } else {
                        i12 = 3;
                    }
                    textView.setGravity(i12 | 16);
                    boolean z13 = org.telegram.messenger.cd.X;
                    if (z13) {
                        i13 = 5;
                    } else {
                        i13 = 3;
                    }
                    int i19 = i13 | 48;
                    if (z13) {
                        f7 = 61.0f;
                    } else {
                        f7 = 23.0f;
                    }
                    if (z13) {
                        f10 = 23.0f;
                    } else {
                        f10 = 61.0f;
                    }
                    frameLayout3.addView(textView, w7.b6.d(-1, -1.0f, i19, f7, 0.0f, f10, 0.0f));
                    TextView textView2 = new TextView(context);
                    frameLayout3.f23567c = textView2;
                    org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.I6, null);
                    org.telegram.messenger.z20.o(textView2, 1, 16.0f, 1, 1);
                    textView2.setSingleLine(true);
                    textView2.setEllipsize(truncateAt);
                    if (org.telegram.messenger.cd.X) {
                        i14 = 3;
                    } else {
                        i14 = 5;
                    }
                    textView2.setGravity(i14 | 16);
                    textView2.setVisibility(8);
                    if (org.telegram.messenger.cd.X) {
                        i15 = 3;
                    } else {
                        i15 = 5;
                    }
                    frameLayout3.addView(textView2, w7.b6.d(-2, -1.0f, i15 | 48, 23.0f, 0.0f, 23.0f, 0.0f));
                    RadioButton radioButton = new RadioButton(context);
                    frameLayout3.d = radioButton;
                    radioButton.setSize(org.telegram.messenger.i0.L(20.0f));
                    org.telegram.ui.ActionBar.a7.P(radioButton, org.telegram.ui.ActionBar.t6.f20986g7, org.telegram.ui.ActionBar.t6.f21003h7, null);
                    if (!org.telegram.messenger.cd.X) {
                        i17 = 5;
                    }
                    frameLayout3.addView(radioButton, w7.b6.d(22, 22.0f, i17 | 48, 20.0f, 15.0f, 20.0f, 0.0f));
                    frameLayout3.b();
                    frameLayout3.setHorizontalPadding(21);
                    p4Var = frameLayout3;
                    break;
                case 11:
                case 12:
                    if (i10 != 12) {
                        i17 = 0;
                    }
                    org.telegram.ui.Cells.pa paVar = new org.telegram.ui.Cells.pa(context, 6, i17, false);
                    paVar.setSelfAsSavedMessages(true);
                    p4Var = paVar;
                    break;
                case 13:
                    p4Var2 = new org.telegram.ui.Cells.pa(6, 0, this.e, null, false, true);
                    p4Var = p4Var2;
                    break;
                case 14:
                    p4Var = new yu0(context, p6Var);
                    break;
                case 15:
                    p4Var = new org.telegram.ui.Cells.x7(context, p6Var);
                    break;
                case 16:
                    if (this.M == null) {
                        z12 = false;
                    }
                    p4Var = new ag.y2(context, p6Var, z12);
                    break;
                case 17:
                    p4Var = new ag.w2(context, p6Var);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    if (this.E == null) {
                        this.E = new bg.h((org.telegram.ui.ActionBar.p6) null);
                    }
                    l5Var = new org.telegram.ui.s61(this.e, this.f29293f, i10 - 18, this.E, this.h);
                    p4Var = l5Var;
                    break;
                case 24:
                    p4Var = new org.telegram.ui.je(context, p6Var);
                    break;
                case 25:
                    p4Var = new org.telegram.ui.ke(context, p6Var);
                    break;
                case 26:
                    org.telegram.ui.Cells.p4 p4Var4 = new org.telegram.ui.Cells.p4(this.e, org.telegram.ui.ActionBar.t6.G6, 23, 20, 0, false, false, this.f29298x);
                    p4Var4.setTextSize(20.0f);
                    p4Var3 = p4Var4;
                    p4Var = p4Var3;
                    break;
                case 27:
                    vh.v6 v6Var = new vh.v6(context, p6Var);
                    v6Var.d(false, false);
                    p4Var = v6Var;
                    break;
                case 28:
                    frameLayout = new View(context);
                    frameLayout.setTag(-33024);
                    p4Var = frameLayout;
                    break;
                case 29:
                    p4Var = new ag.g0(context, p6Var);
                    break;
                case 30:
                    p4Var = new org.telegram.ui.Cells.e9(context, p6Var);
                    break;
                case 31:
                    if (tk0Var != null && tk0Var.b1()) {
                        org.telegram.ui.Cells.z3 z3Var = new org.telegram.ui.Cells.z3(28, context, p6Var);
                        z3Var.setNoBackground(true);
                        p4Var = z3Var;
                        break;
                    } else {
                        p4Var = new org.telegram.ui.Cells.z3(context, p6Var);
                        break;
                    }
                    break;
                case 32:
                    p4Var = new org.telegram.ui.Cells.k6(context, null);
                    break;
                case 33:
                    p4Var = new org.telegram.ui.Cells.v2(context, true);
                    break;
                case 34:
                    zz zzVar = new zz(context, p6Var);
                    zzVar.setIsSingleCell(true);
                    p4Var = zzVar;
                    break;
                case 35:
                case 36:
                case 37:
                case 41:
                    if (i10 == 35) {
                        i18 = 4;
                    } else {
                        if (i10 == 36) {
                            i16 = 6;
                        } else if (i10 == 37) {
                            i18 = 7;
                        } else if (i10 != 41) {
                            i16 = 0;
                        }
                        org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(i16, 21, this.e, this.f29298x, true);
                        c2Var.getCheckBoxRound().b(org.telegram.ui.ActionBar.t6.V6, org.telegram.ui.ActionBar.t6.f20986g7, org.telegram.ui.ActionBar.t6.f21059k7);
                        p4Var3 = c2Var;
                        p4Var = p4Var3;
                        break;
                    }
                    i16 = i18;
                    org.telegram.ui.Cells.c2 c2Var2 = new org.telegram.ui.Cells.c2(i16, 21, this.e, this.f29298x, true);
                    c2Var2.getCheckBoxRound().b(org.telegram.ui.ActionBar.t6.V6, org.telegram.ui.ActionBar.t6.f20986g7, org.telegram.ui.ActionBar.t6.f21059k7);
                    p4Var3 = c2Var2;
                    p4Var = p4Var3;
                case 38:
                    p4Var = new org.telegram.ui.Cells.d2(context, p6Var);
                    break;
                case 39:
                case 40:
                    p4Var = new org.telegram.ui.Cells.s8(context);
                    break;
                case 42:
                    p4Var3 = new org.telegram.ui.Cells.p4(this.e, org.telegram.ui.ActionBar.t6.L6, 21, 15, 0, false, true, this.f29298x);
                    p4Var = p4Var3;
                    break;
                case 43:
                    p4Var = new org.telegram.ui.Cells.x9(0, context, p6Var);
                    break;
                case 44:
                    p4Var = new org.telegram.ui.Cells.l6(context, false);
                    break;
            }
        }
        if (N(i10)) {
            org.telegram.ui.ActionBar.a7.i(i11, p4Var, this.O);
        }
        return new s4.c1(p4Var);
    }

    @Override
    public void y(s4.c1 c1Var) {
        R(c1Var, this.N);
        P(c1Var);
    }
}
