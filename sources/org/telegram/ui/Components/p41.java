package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
public class p41 extends rg.b {
    public lg.f F;
    public m41 J;
    public m41 K;
    public int L;
    public boolean M;
    public org.telegram.messenger.s10 N;
    public boolean O;
    public final uj0 d;
    public final Context f38198e;
    public final int f38199f;
    public final int h;
    public final boolean f38200n;
    public boolean f38202s;
    public org.telegram.messenger.s10 f38203w;
    public final org.telegram.ui.ActionBar.e6 f38204x;
    public boolean f38201r = true;
    public final ArrayList f38205y = new ArrayList();
    public final ArrayList E = new ArrayList();
    public int G = 0;
    public final ArrayList H = new ArrayList();
    public final ArrayList I = new ArrayList();
    public final org.telegram.ui.ActionBar.r1 P = new org.telegram.ui.ActionBar.r1(this, 2);

    public p41(uj0 uj0Var, Context context, int i7, int i10, boolean z10, org.telegram.messenger.s10 s10Var, org.telegram.ui.ActionBar.e6 e6Var) {
        this.d = uj0Var;
        this.f38198e = context;
        this.f38199f = i7;
        this.h = i10;
        this.f38200n = z10;
        this.f38203w = s10Var;
        this.f38204x = e6Var;
        O(false);
    }

    public static boolean K(int i7) {
        if (i7 >= 10000) {
            a41 G = b41.G(i7);
            if (G == null || !G.g()) {
                return false;
            }
            return true;
        } else if (i7 != 7 && i7 != 8 && i7 != 38 && i7 != 31 && i7 != -4 && i7 != 28 && i7 != 2 && i7 != -2) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public boolean D(v4.e1 e1Var) {
        int i7 = e1Var.f58539f;
        b41 G = G(e1Var.b());
        if (i7 >= 10000) {
            a41 G2 = b41.G(i7);
            if (G2 == null || !G2.f()) {
                return false;
            }
        } else if (i7 != 3 && i7 != 5 && i7 != 6 && i7 != 30 && i7 != 4 && i7 != 10 && i7 != 44 && i7 != 11 && i7 != 12 && i7 != 17 && i7 != 16 && i7 != 29 && i7 != 25 && i7 != 27 && i7 != 32 && i7 != 33 && i7 != 35 && i7 != 36 && i7 != 37 && i7 != 41 && i7 != 39 && i7 != 40 && i7 != 38) {
            return false;
        }
        if (G != null && !G.f33177g) {
            return false;
        }
        return true;
    }

    public final void F(int i7) {
        if (i7 >= 0) {
            ArrayList arrayList = this.I;
            if (i7 < arrayList.size()) {
                m41 m41Var = (m41) arrayList.get(i7);
                this.N.a(Integer.valueOf(i7), new ArrayList(this.E.subList(m41Var.f37054a, m41Var.f37055b + 1)));
                this.M = false;
            }
        }
    }

    public final b41 G(int i7) {
        if (i7 >= 0) {
            ArrayList arrayList = this.E;
            if (i7 < arrayList.size()) {
                return (b41) arrayList.get(i7);
            }
            return null;
        }
        return null;
    }

    public final int H(int i7) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.I;
            if (i10 < arrayList.size()) {
                m41 m41Var = (m41) arrayList.get(i10);
                if (i7 >= m41Var.f37054a && i7 <= m41Var.f37055b) {
                    return i10;
                }
                i10++;
            } else {
                return -1;
            }
        }
    }

    public int I(int i7) {
        return org.telegram.ui.ActionBar.j6.w0(i7, this.f38204x);
    }

    public final boolean J(int i7) {
        b41 G = G(i7);
        b41 G2 = G(i7 + 1);
        if (G != null && !G.f33179j && G2 != null && K(G2.f56015a) == K(G.f56015a)) {
            return true;
        }
        return false;
    }

    public final void L() {
        m41 m41Var = this.K;
        if (m41Var != null) {
            m41Var.f37055b = Math.max(0, this.E.size() - 1);
        }
    }

    public final int M() {
        ?? obj = new Object();
        this.K = obj;
        obj.f37054a = this.E.size();
        m41 m41Var = this.K;
        m41Var.f37055b = -1;
        ArrayList arrayList = this.I;
        arrayList.add(m41Var);
        return arrayList.size() - 1;
    }

    public final boolean N(int i7) {
        if (this.f38201r) {
            uj0 uj0Var = this.d;
            if (uj0Var == null || !uj0Var.b1() || !uj0Var.getSectionsDrawBackground()) {
                if (i7 >= 10000) {
                    return true;
                }
                switch (i7) {
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
        uj0 uj0Var = this.d;
        if (uj0Var != null && uj0Var.c0()) {
            uj0Var.post(new fp0(6, this, z10));
        } else {
            Q(z10);
        }
    }

    public final void P(v4.e1 e1Var) {
        int i7;
        View view = e1Var.f58535a;
        if (view instanceof org.telegram.ui.ActionBar.z5) {
            ((org.telegram.ui.ActionBar.z5) view).updateColors();
            Object tag = view.getTag(2131296710);
            int i10 = org.telegram.ui.ActionBar.q6.f29535b;
            if (N(e1Var.f58539f) && (!(tag instanceof Integer) || ((Integer) tag).intValue() != i10)) {
                if (this.f38200n) {
                    i7 = org.telegram.ui.ActionBar.j6.f28922h5;
                } else {
                    i7 = org.telegram.ui.ActionBar.j6.f28849d6;
                }
                view.setBackgroundColor(I(i7));
            }
            view.setTag(2131296710, Integer.valueOf(i10));
        }
    }

    public final void Q(boolean z10) {
        uj0 uj0Var = this.d;
        if (uj0Var == null || !uj0Var.c0()) {
            ArrayList arrayList = this.f38205y;
            arrayList.clear();
            ArrayList arrayList2 = this.E;
            arrayList.addAll(arrayList2);
            arrayList2.clear();
            this.J = null;
            this.H.clear();
            this.I.clear();
            org.telegram.messenger.s10 s10Var = this.f38203w;
            if (s10Var != null) {
                s10Var.a(arrayList2, this);
                S();
                if (z10) {
                    E(arrayList, arrayList2);
                } else {
                    f();
                }
            }
        }
    }

    public final void R(v4.e1 e1Var, boolean z10) {
        if (e1Var != null) {
            View view = e1Var.f58535a;
            int i7 = e1Var.f58539f;
            if (i7 >= 10000) {
                a41 G = b41.G(i7);
                if (G != null) {
                    G.a(this.d, view, G(e1Var.b()));
                }
            } else if (i7 != 16) {
            } else {
                ((kg.q1) view).setReorder(z10);
            }
        }
    }

    public final void S() {
        uj0 uj0Var = this.d;
        if (uj0Var != null) {
            ArrayList arrayList = uj0Var.L2;
            if (arrayList == null) {
                uj0Var.L2 = new ArrayList();
            } else {
                arrayList.clear();
            }
            ArrayList arrayList2 = this.H;
            int size = arrayList2.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList2.get(i7);
                i7++;
                m41 m41Var = (m41) obj;
                uj0Var.L2.add(Long.valueOf(org.telegram.messenger.g0.w2(m41Var.f37054a, m41Var.f37055b)));
            }
        }
    }

    public final void T() {
        ArrayList arrayList = this.f38205y;
        arrayList.clear();
        ArrayList arrayList2 = this.E;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        this.H.clear();
        this.I.clear();
        org.telegram.messenger.s10 s10Var = this.f38203w;
        if (s10Var != null) {
            s10Var.a(arrayList2, this);
        }
        S();
    }

    public final void U() {
        m41 m41Var = this.J;
        if (m41Var != null) {
            m41Var.f37055b = Math.max(0, (this.E.size() + this.G) - 1);
            m41 m41Var2 = this.J;
            if (m41Var2.f37054a == m41Var2.f37055b) {
                this.H.remove(m41Var2);
            }
            this.J = null;
        }
    }

    public final void V() {
        ?? obj = new Object();
        this.J = obj;
        obj.f37054a = this.E.size() + this.G;
        m41 m41Var = this.J;
        m41Var.f37055b = -1;
        this.H.add(m41Var);
    }

    @Override
    public final int b() {
        return this.E.size();
    }

    @Override
    public final int d(int i7) {
        b41 G = G(i7);
        if (G == null) {
            return 0;
        }
        return G.f56015a;
    }

    @Override
    public void t(v4.e1 r38, int r39) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.p41.t(v4.e1, int):void");
    }

    @Override
    public v4.e1 x(ViewGroup viewGroup, int i7) {
        int i10;
        View frameLayout;
        pz n4Var;
        View n4Var2;
        View h5Var;
        boolean z10;
        int i11;
        int i12;
        float f10;
        float f11;
        int i13;
        int i14;
        int i15;
        org.telegram.ui.Cells.n4 n4Var3;
        boolean z11 = this.f38200n;
        if (z11) {
            i10 = org.telegram.ui.ActionBar.j6.f28922h5;
        } else {
            i10 = org.telegram.ui.ActionBar.j6.f28849d6;
        }
        uj0 uj0Var = this.d;
        org.telegram.ui.ActionBar.e6 e6Var = this.f38204x;
        Context context = this.f38198e;
        if (i7 >= 10000) {
            a41 G = b41.G(i7);
            if (G != null) {
                n4Var = G.d(context, uj0Var, this.f38199f, e6Var);
            } else {
                n4Var = new View(context);
            }
        } else {
            int i16 = 3;
            int i17 = 8;
            boolean z12 = true;
            switch (i7) {
                case -5:
                    frameLayout = new FrameLayout(context);
                    frameLayout.setTag(-33024);
                    n4Var = frameLayout;
                    break;
                case -4:
                case -1:
                    frameLayout = new bi.v1(context, 25);
                    if (i7 == -4) {
                        frameLayout.setTag(-33024);
                    }
                    n4Var = frameLayout;
                    break;
                case -3:
                    ?? frameLayout2 = new FrameLayout(context);
                    frameLayout2.f36724a = 0;
                    n4Var = frameLayout2;
                    break;
                case -2:
                    n4Var = new bi.v1(context, 26);
                    break;
                case 0:
                    if (z11) {
                        n4Var = new org.telegram.ui.Cells.n4(this.f38198e, org.telegram.ui.ActionBar.j6.L6, 21, 15, 0, false, false, this.f38204x);
                        break;
                    } else {
                        n4Var = new org.telegram.ui.Cells.n4(context, e6Var);
                        break;
                    }
                case 1:
                    n4Var2 = new org.telegram.ui.Cells.n4(this.f38198e, org.telegram.ui.ActionBar.j6.G6, 17, 15, false, this.f38204x);
                    n4Var = n4Var2;
                    break;
                case 2:
                    n4Var = new g01(context, e6Var);
                    break;
                case 3:
                    org.telegram.ui.Cells.l8 l8Var = new org.telegram.ui.Cells.l8(context, e6Var);
                    l8Var.setCompactLayout(this.f38202s);
                    n4Var = l8Var;
                    break;
                case 4:
                case 9:
                    org.telegram.ui.Cells.q8 q8Var = new org.telegram.ui.Cells.q8(context, e6Var);
                    if (i7 == 9) {
                        q8Var.setDrawCheckRipple(true);
                        q8Var.d(org.telegram.ui.ActionBar.j6.f28904g6, org.telegram.ui.ActionBar.j6.O6, org.telegram.ui.ActionBar.j6.P6, org.telegram.ui.ActionBar.j6.Q6, org.telegram.ui.ActionBar.j6.R6);
                        q8Var.setTypeface(org.telegram.messenger.g0.o());
                        q8Var.setHeight(56);
                    }
                    n4Var = q8Var;
                    break;
                case 5:
                case 6:
                    if (i7 == 6) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    h5Var = new org.telegram.ui.Cells.h5(this.f38198e, 21, 60, z10, this.f38204x);
                    n4Var = h5Var;
                    break;
                case 7:
                case 8:
                default:
                    n4Var = new org.telegram.ui.Cells.y8(context, e6Var);
                    break;
                case 10:
                    ?? frameLayout3 = new FrameLayout(context);
                    frameLayout3.f31794f = 23;
                    TextView textView = new TextView(context);
                    frameLayout3.f31791b = textView;
                    org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.G6, null);
                    org.telegram.messenger.i20.p(textView, 1, 16.0f, 1, 1);
                    textView.setSingleLine(true);
                    TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                    textView.setEllipsize(truncateAt);
                    if (org.telegram.messenger.hd.f24101a0) {
                        i11 = 5;
                    } else {
                        i11 = 3;
                    }
                    textView.setGravity(i11 | 16);
                    boolean z13 = org.telegram.messenger.hd.f24101a0;
                    if (z13) {
                        i12 = 5;
                    } else {
                        i12 = 3;
                    }
                    int i18 = i12 | 48;
                    if (z13) {
                        f10 = 61.0f;
                    } else {
                        f10 = 23.0f;
                    }
                    if (z13) {
                        f11 = 23.0f;
                    } else {
                        f11 = 61.0f;
                    }
                    frameLayout3.addView(textView, c8.ja.d(-1, -1.0f, i18, f10, 0.0f, f11, 0.0f));
                    TextView textView2 = new TextView(context);
                    frameLayout3.f31792c = textView2;
                    org.telegram.ui.ActionBar.q6.U(textView2, org.telegram.ui.ActionBar.j6.I6, null);
                    org.telegram.messenger.i20.p(textView2, 1, 16.0f, 1, 1);
                    textView2.setSingleLine(true);
                    textView2.setEllipsize(truncateAt);
                    if (org.telegram.messenger.hd.f24101a0) {
                        i13 = 3;
                    } else {
                        i13 = 5;
                    }
                    textView2.setGravity(i13 | 16);
                    textView2.setVisibility(8);
                    if (org.telegram.messenger.hd.f24101a0) {
                        i14 = 3;
                    } else {
                        i14 = 5;
                    }
                    frameLayout3.addView(textView2, c8.ja.d(-2, -1.0f, i14 | 48, 23.0f, 0.0f, 23.0f, 0.0f));
                    RadioButton radioButton = new RadioButton(context);
                    frameLayout3.d = radioButton;
                    radioButton.setSize(org.telegram.messenger.g0.L(20.0f));
                    org.telegram.ui.ActionBar.q6.O(radioButton, org.telegram.ui.ActionBar.j6.f28905g7, org.telegram.ui.ActionBar.j6.h7, null);
                    if (!org.telegram.messenger.hd.f24101a0) {
                        i16 = 5;
                    }
                    frameLayout3.addView(radioButton, c8.ja.d(22, 22.0f, i16 | 48, 20.0f, 15.0f, 20.0f, 0.0f));
                    frameLayout3.b();
                    frameLayout3.setHorizontalPadding(21);
                    n4Var = frameLayout3;
                    break;
                case 11:
                case 12:
                    if (i7 != 12) {
                        i16 = 0;
                    }
                    org.telegram.ui.Cells.pa paVar = new org.telegram.ui.Cells.pa(context, 6, i16, false);
                    paVar.setSelfAsSavedMessages(true);
                    n4Var = paVar;
                    break;
                case 13:
                    n4Var2 = new org.telegram.ui.Cells.pa(6, 0, this.f38198e, null, false, true);
                    n4Var = n4Var2;
                    break;
                case 14:
                    n4Var = new wt0(context, e6Var);
                    break;
                case 15:
                    n4Var = new org.telegram.ui.Cells.s7(context, e6Var);
                    break;
                case 16:
                    if (this.N == null) {
                        z12 = false;
                    }
                    n4Var = new kg.q1(context, e6Var, z12);
                    break;
                case 17:
                    n4Var = new kg.o1(context, e6Var);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    if (this.F == null) {
                        this.F = new lg.f((org.telegram.ui.ActionBar.e6) null);
                    }
                    h5Var = new org.telegram.ui.x41(this.f38198e, this.f38199f, i7 - 18, this.F, this.h);
                    n4Var = h5Var;
                    break;
                case 24:
                    n4Var = new org.telegram.ui.vd(context, e6Var);
                    break;
                case 25:
                    n4Var = new org.telegram.ui.wd(context, e6Var);
                    break;
                case 26:
                    org.telegram.ui.Cells.n4 n4Var4 = new org.telegram.ui.Cells.n4(this.f38198e, org.telegram.ui.ActionBar.j6.G6, 23, 20, 0, false, false, this.f38204x);
                    n4Var4.setTextSize(20.0f);
                    n4Var3 = n4Var4;
                    n4Var = n4Var3;
                    break;
                case 27:
                    hi.p8 p8Var = new hi.p8(context, e6Var);
                    p8Var.d(false, false);
                    n4Var = p8Var;
                    break;
                case 28:
                    frameLayout = new View(context);
                    frameLayout.setTag(-33024);
                    n4Var = frameLayout;
                    break;
                case 29:
                    n4Var = new kg.t(context, e6Var);
                    break;
                case 30:
                    n4Var = new org.telegram.ui.Cells.b9(context, e6Var);
                    break;
                case 31:
                    if (uj0Var != null && uj0Var.b1()) {
                        org.telegram.ui.Cells.x3 x3Var = new org.telegram.ui.Cells.x3(28, context, e6Var);
                        x3Var.setNoBackground(true);
                        n4Var = x3Var;
                        break;
                    } else {
                        n4Var = new org.telegram.ui.Cells.x3(context, e6Var);
                        break;
                    }
                    break;
                case 32:
                    n4Var = new org.telegram.ui.Cells.f6(context, null);
                    break;
                case 33:
                    n4Var = new org.telegram.ui.Cells.t2(context, true);
                    break;
                case 34:
                    pz pzVar = new pz(context, e6Var);
                    pzVar.setIsSingleCell(true);
                    n4Var = pzVar;
                    break;
                case 35:
                case 36:
                case 37:
                case 41:
                    if (i7 == 35) {
                        i17 = 4;
                    } else {
                        if (i7 == 36) {
                            i15 = 6;
                        } else if (i7 == 37) {
                            i17 = 7;
                        } else if (i7 != 41) {
                            i15 = 0;
                        }
                        org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(this.f38198e, i15, 21, true, this.f38204x);
                        c2Var.getCheckBoxRound().b(org.telegram.ui.ActionBar.j6.V6, org.telegram.ui.ActionBar.j6.f28905g7, org.telegram.ui.ActionBar.j6.f28979k7);
                        n4Var3 = c2Var;
                        n4Var = n4Var3;
                        break;
                    }
                    i15 = i17;
                    org.telegram.ui.Cells.c2 c2Var2 = new org.telegram.ui.Cells.c2(this.f38198e, i15, 21, true, this.f38204x);
                    c2Var2.getCheckBoxRound().b(org.telegram.ui.ActionBar.j6.V6, org.telegram.ui.ActionBar.j6.f28905g7, org.telegram.ui.ActionBar.j6.f28979k7);
                    n4Var3 = c2Var2;
                    n4Var = n4Var3;
                case 38:
                    n4Var = new org.telegram.ui.Cells.d2(context, e6Var);
                    break;
                case 39:
                case 40:
                    n4Var = new org.telegram.ui.Cells.p8(context);
                    break;
                case 42:
                    n4Var3 = new org.telegram.ui.Cells.n4(this.f38198e, org.telegram.ui.ActionBar.j6.L6, 21, 15, 0, false, true, this.f38204x);
                    n4Var = n4Var3;
                    break;
                case 43:
                    n4Var = new org.telegram.ui.Cells.v9(0, context, e6Var);
                    break;
                case 44:
                    n4Var = new org.telegram.ui.Cells.g6(context, false);
                    break;
            }
        }
        if (N(i7)) {
            org.telegram.ui.ActionBar.q6.h(i10, n4Var, this.P);
        }
        return new v4.e1(n4Var);
    }

    @Override
    public void y(v4.e1 e1Var) {
        R(e1Var, this.O);
        P(e1Var);
    }
}
