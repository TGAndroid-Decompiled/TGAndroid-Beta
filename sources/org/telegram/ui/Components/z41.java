package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
public class z41 extends rg.b {
    public lg.f F;
    public w41 J;
    public w41 K;
    public int L;
    public boolean M;
    public org.telegram.messenger.q10 N;
    public boolean O;
    public final ck0 d;
    public final Context f42806e;
    public final int f42807f;
    public final int h;
    public final boolean f42808n;
    public boolean f42810s;
    public org.telegram.messenger.q10 f42811w;
    public final org.telegram.ui.ActionBar.i6 f42812x;
    public boolean f42809r = true;
    public final ArrayList f42813y = new ArrayList();
    public final ArrayList E = new ArrayList();
    public int G = 0;
    public final ArrayList H = new ArrayList();
    public final ArrayList I = new ArrayList();
    public final org.telegram.ui.ActionBar.s1 P = new org.telegram.ui.ActionBar.s1(this, 2);

    public z41(ck0 ck0Var, Context context, int i7, int i10, boolean z10, org.telegram.messenger.q10 q10Var, org.telegram.ui.ActionBar.i6 i6Var) {
        this.d = ck0Var;
        this.f42806e = context;
        this.f42807f = i7;
        this.h = i10;
        this.f42808n = z10;
        this.f42811w = q10Var;
        this.f42812x = i6Var;
        O(false);
    }

    public static boolean K(int i7) {
        if (i7 >= 10000) {
            k41 G = l41.G(i7);
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
    public boolean D(v4.f1 f1Var) {
        int i7 = f1Var.f59127f;
        l41 G = G(f1Var.b());
        if (i7 >= 10000) {
            k41 G2 = l41.G(i7);
            if (G2 == null || !G2.f()) {
                return false;
            }
        } else if (i7 != 3 && i7 != 5 && i7 != 6 && i7 != 30 && i7 != 4 && i7 != 10 && i7 != 44 && i7 != 11 && i7 != 12 && i7 != 17 && i7 != 16 && i7 != 29 && i7 != 25 && i7 != 27 && i7 != 32 && i7 != 33 && i7 != 35 && i7 != 36 && i7 != 37 && i7 != 41 && i7 != 39 && i7 != 40 && i7 != 38) {
            return false;
        }
        if (G != null && !G.f37013g) {
            return false;
        }
        return true;
    }

    public final void F(int i7) {
        if (i7 >= 0) {
            ArrayList arrayList = this.I;
            if (i7 < arrayList.size()) {
                w41 w41Var = (w41) arrayList.get(i7);
                this.N.a(Integer.valueOf(i7), new ArrayList(this.E.subList(w41Var.f41563a, w41Var.f41564b + 1)));
                this.M = false;
            }
        }
    }

    public final l41 G(int i7) {
        if (i7 >= 0) {
            ArrayList arrayList = this.E;
            if (i7 < arrayList.size()) {
                return (l41) arrayList.get(i7);
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
                w41 w41Var = (w41) arrayList.get(i10);
                if (i7 >= w41Var.f41563a && i7 <= w41Var.f41564b) {
                    return i10;
                }
                i10++;
            } else {
                return -1;
            }
        }
    }

    public int I(int i7) {
        return org.telegram.ui.ActionBar.n6.w0(i7, this.f42812x);
    }

    public final boolean J(int i7) {
        l41 G = G(i7);
        l41 G2 = G(i7 + 1);
        if (G != null && !G.f37015j && G2 != null && K(G2.f56589a) == K(G.f56589a)) {
            return true;
        }
        return false;
    }

    public final void L() {
        w41 w41Var = this.K;
        if (w41Var != null) {
            w41Var.f41564b = Math.max(0, this.E.size() - 1);
        }
    }

    public final int M() {
        ?? obj = new Object();
        this.K = obj;
        obj.f41563a = this.E.size();
        w41 w41Var = this.K;
        w41Var.f41564b = -1;
        ArrayList arrayList = this.I;
        arrayList.add(w41Var);
        return arrayList.size() - 1;
    }

    public final boolean N(int i7) {
        if (this.f42809r) {
            ck0 ck0Var = this.d;
            if (ck0Var == null || !ck0Var.b1() || !ck0Var.getSectionsDrawBackground()) {
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
        ck0 ck0Var = this.d;
        if (ck0Var != null && ck0Var.c0()) {
            ck0Var.post(new pp0(6, this, z10));
        } else {
            Q(z10);
        }
    }

    public final void P(v4.f1 f1Var) {
        int i7;
        View view = f1Var.f59123a;
        if (view instanceof org.telegram.ui.ActionBar.c6) {
            ((org.telegram.ui.ActionBar.c6) view).updateColors();
            Object tag = view.getTag(2131296710);
            int i10 = org.telegram.ui.ActionBar.u6.f30083b;
            if (N(f1Var.f59127f) && (!(tag instanceof Integer) || ((Integer) tag).intValue() != i10)) {
                if (this.f42808n) {
                    i7 = org.telegram.ui.ActionBar.n6.f29467h5;
                } else {
                    i7 = org.telegram.ui.ActionBar.n6.f29394d6;
                }
                view.setBackgroundColor(I(i7));
            }
            view.setTag(2131296710, Integer.valueOf(i10));
        }
    }

    public final void Q(boolean z10) {
        ck0 ck0Var = this.d;
        if (ck0Var == null || !ck0Var.c0()) {
            ArrayList arrayList = this.f42813y;
            arrayList.clear();
            ArrayList arrayList2 = this.E;
            arrayList.addAll(arrayList2);
            arrayList2.clear();
            this.J = null;
            this.H.clear();
            this.I.clear();
            org.telegram.messenger.q10 q10Var = this.f42811w;
            if (q10Var != null) {
                q10Var.a(arrayList2, this);
                S();
                if (z10) {
                    E(arrayList, arrayList2);
                } else {
                    f();
                }
            }
        }
    }

    public final void R(v4.f1 f1Var, boolean z10) {
        if (f1Var != null) {
            View view = f1Var.f59123a;
            int i7 = f1Var.f59127f;
            if (i7 >= 10000) {
                k41 G = l41.G(i7);
                if (G != null) {
                    G.a(this.d, view, G(f1Var.b()));
                }
            } else if (i7 != 16) {
            } else {
                ((kg.s1) view).setReorder(z10);
            }
        }
    }

    public final void S() {
        ck0 ck0Var = this.d;
        if (ck0Var != null) {
            ArrayList arrayList = ck0Var.L2;
            if (arrayList == null) {
                ck0Var.L2 = new ArrayList();
            } else {
                arrayList.clear();
            }
            ArrayList arrayList2 = this.H;
            int size = arrayList2.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList2.get(i7);
                i7++;
                w41 w41Var = (w41) obj;
                ck0Var.L2.add(Long.valueOf(org.telegram.messenger.g0.w2(w41Var.f41563a, w41Var.f41564b)));
            }
        }
    }

    public final void T() {
        ArrayList arrayList = this.f42813y;
        arrayList.clear();
        ArrayList arrayList2 = this.E;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        this.H.clear();
        this.I.clear();
        org.telegram.messenger.q10 q10Var = this.f42811w;
        if (q10Var != null) {
            q10Var.a(arrayList2, this);
        }
        S();
    }

    public final void U() {
        w41 w41Var = this.J;
        if (w41Var != null) {
            w41Var.f41564b = Math.max(0, (this.E.size() + this.G) - 1);
            w41 w41Var2 = this.J;
            if (w41Var2.f41563a == w41Var2.f41564b) {
                this.H.remove(w41Var2);
            }
            this.J = null;
        }
    }

    public final void V() {
        ?? obj = new Object();
        this.J = obj;
        obj.f41563a = this.E.size() + this.G;
        w41 w41Var = this.J;
        w41Var.f41564b = -1;
        this.H.add(w41Var);
    }

    @Override
    public final int b() {
        return this.E.size();
    }

    @Override
    public final int d(int i7) {
        l41 G = G(i7);
        if (G == null) {
            return 0;
        }
        return G.f56589a;
    }

    @Override
    public void t(v4.f1 r38, int r39) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.z41.t(v4.f1, int):void");
    }

    @Override
    public v4.f1 x(ViewGroup viewGroup, int i7) {
        int i10;
        View frameLayout;
        wz o4Var;
        View o4Var2;
        View j5Var;
        boolean z10;
        int i11;
        int i12;
        float f10;
        float f11;
        int i13;
        int i14;
        int i15;
        org.telegram.ui.Cells.o4 o4Var3;
        boolean z11 = this.f42808n;
        if (z11) {
            i10 = org.telegram.ui.ActionBar.n6.f29467h5;
        } else {
            i10 = org.telegram.ui.ActionBar.n6.f29394d6;
        }
        ck0 ck0Var = this.d;
        org.telegram.ui.ActionBar.i6 i6Var = this.f42812x;
        Context context = this.f42806e;
        if (i7 >= 10000) {
            k41 G = l41.G(i7);
            if (G != null) {
                o4Var = G.d(context, ck0Var, this.f42807f, i6Var);
            } else {
                o4Var = new View(context);
            }
        } else {
            int i16 = 3;
            int i17 = 8;
            boolean z12 = true;
            switch (i7) {
                case -5:
                    frameLayout = new FrameLayout(context);
                    frameLayout.setTag(-33024);
                    o4Var = frameLayout;
                    break;
                case -4:
                case -1:
                    frameLayout = new bi.p2(context, 25);
                    if (i7 == -4) {
                        frameLayout.setTag(-33024);
                    }
                    o4Var = frameLayout;
                    break;
                case -3:
                    ?? frameLayout2 = new FrameLayout(context);
                    frameLayout2.f40494a = 0;
                    o4Var = frameLayout2;
                    break;
                case -2:
                    o4Var = new bi.p2(context, 26);
                    break;
                case 0:
                    if (z11) {
                        o4Var = new org.telegram.ui.Cells.o4(this.f42806e, org.telegram.ui.ActionBar.n6.L6, 21, 15, 0, false, false, this.f42812x);
                        break;
                    } else {
                        o4Var = new org.telegram.ui.Cells.o4(context, i6Var);
                        break;
                    }
                case 1:
                    o4Var2 = new org.telegram.ui.Cells.o4(this.f42806e, org.telegram.ui.ActionBar.n6.G6, 17, 15, false, this.f42812x);
                    o4Var = o4Var2;
                    break;
                case 2:
                    o4Var = new o01(context, i6Var);
                    break;
                case 3:
                    org.telegram.ui.Cells.n8 n8Var = new org.telegram.ui.Cells.n8(context, i6Var);
                    n8Var.setCompactLayout(this.f42810s);
                    o4Var = n8Var;
                    break;
                case 4:
                case 9:
                    org.telegram.ui.Cells.s8 s8Var = new org.telegram.ui.Cells.s8(context, i6Var);
                    if (i7 == 9) {
                        s8Var.setDrawCheckRipple(true);
                        s8Var.d(org.telegram.ui.ActionBar.n6.f29449g6, org.telegram.ui.ActionBar.n6.O6, org.telegram.ui.ActionBar.n6.P6, org.telegram.ui.ActionBar.n6.Q6, org.telegram.ui.ActionBar.n6.R6);
                        s8Var.setTypeface(org.telegram.messenger.g0.o());
                        s8Var.setHeight(56);
                    }
                    o4Var = s8Var;
                    break;
                case 5:
                case 6:
                    if (i7 == 6) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    j5Var = new org.telegram.ui.Cells.j5(this.f42806e, 21, 60, z10, this.f42812x);
                    o4Var = j5Var;
                    break;
                case 7:
                case 8:
                default:
                    o4Var = new org.telegram.ui.Cells.a9(context, i6Var);
                    break;
                case 10:
                    ?? frameLayout3 = new FrameLayout(context);
                    frameLayout3.f32217f = 23;
                    TextView textView = new TextView(context);
                    frameLayout3.f32214b = textView;
                    org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.G6, null);
                    org.telegram.messenger.n10.q(textView, 1, 16.0f, 1, 1);
                    textView.setSingleLine(true);
                    TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                    textView.setEllipsize(truncateAt);
                    if (org.telegram.messenger.gd.f24213a0) {
                        i11 = 5;
                    } else {
                        i11 = 3;
                    }
                    textView.setGravity(i11 | 16);
                    boolean z13 = org.telegram.messenger.gd.f24213a0;
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
                    frameLayout3.addView(textView, c8.ma.d(-1, -1.0f, i18, f10, 0.0f, f11, 0.0f));
                    TextView textView2 = new TextView(context);
                    frameLayout3.f32215c = textView2;
                    org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.I6, null);
                    org.telegram.messenger.n10.q(textView2, 1, 16.0f, 1, 1);
                    textView2.setSingleLine(true);
                    textView2.setEllipsize(truncateAt);
                    if (org.telegram.messenger.gd.f24213a0) {
                        i13 = 3;
                    } else {
                        i13 = 5;
                    }
                    textView2.setGravity(i13 | 16);
                    textView2.setVisibility(8);
                    if (org.telegram.messenger.gd.f24213a0) {
                        i14 = 3;
                    } else {
                        i14 = 5;
                    }
                    frameLayout3.addView(textView2, c8.ma.d(-2, -1.0f, i14 | 48, 23.0f, 0.0f, 23.0f, 0.0f));
                    RadioButton radioButton = new RadioButton(context);
                    frameLayout3.d = radioButton;
                    radioButton.setSize(org.telegram.messenger.g0.L(20.0f));
                    org.telegram.ui.ActionBar.u6.O(radioButton, org.telegram.ui.ActionBar.n6.f29450g7, org.telegram.ui.ActionBar.n6.h7, null);
                    if (!org.telegram.messenger.gd.f24213a0) {
                        i16 = 5;
                    }
                    frameLayout3.addView(radioButton, c8.ma.d(22, 22.0f, i16 | 48, 20.0f, 15.0f, 20.0f, 0.0f));
                    frameLayout3.b();
                    frameLayout3.setHorizontalPadding(21);
                    o4Var = frameLayout3;
                    break;
                case 11:
                case 12:
                    if (i7 != 12) {
                        i16 = 0;
                    }
                    org.telegram.ui.Cells.ra raVar = new org.telegram.ui.Cells.ra(context, 6, i16, false);
                    raVar.setSelfAsSavedMessages(true);
                    o4Var = raVar;
                    break;
                case 13:
                    o4Var2 = new org.telegram.ui.Cells.ra(6, 0, this.f42806e, null, false, true);
                    o4Var = o4Var2;
                    break;
                case 14:
                    o4Var = new eu0(context, i6Var);
                    break;
                case 15:
                    o4Var = new org.telegram.ui.Cells.u7(context, i6Var);
                    break;
                case 16:
                    if (this.N == null) {
                        z12 = false;
                    }
                    o4Var = new kg.s1(context, i6Var, z12);
                    break;
                case 17:
                    o4Var = new kg.q1(context, i6Var);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    if (this.F == null) {
                        this.F = new lg.f((org.telegram.ui.ActionBar.i6) null);
                    }
                    j5Var = new org.telegram.ui.a51(this.f42806e, this.f42807f, i7 - 18, this.F, this.h);
                    o4Var = j5Var;
                    break;
                case 24:
                    o4Var = new org.telegram.ui.vd(context, i6Var);
                    break;
                case 25:
                    o4Var = new org.telegram.ui.wd(context, i6Var);
                    break;
                case 26:
                    org.telegram.ui.Cells.o4 o4Var4 = new org.telegram.ui.Cells.o4(this.f42806e, org.telegram.ui.ActionBar.n6.G6, 23, 20, 0, false, false, this.f42812x);
                    o4Var4.setTextSize(20.0f);
                    o4Var3 = o4Var4;
                    o4Var = o4Var3;
                    break;
                case 27:
                    hi.p8 p8Var = new hi.p8(context, i6Var);
                    p8Var.d(false, false);
                    o4Var = p8Var;
                    break;
                case 28:
                    frameLayout = new View(context);
                    frameLayout.setTag(-33024);
                    o4Var = frameLayout;
                    break;
                case 29:
                    o4Var = new kg.t(context, i6Var);
                    break;
                case 30:
                    o4Var = new org.telegram.ui.Cells.d9(context, i6Var);
                    break;
                case 31:
                    if (ck0Var != null && ck0Var.b1()) {
                        org.telegram.ui.Cells.y3 y3Var = new org.telegram.ui.Cells.y3(28, context, i6Var);
                        y3Var.setNoBackground(true);
                        o4Var = y3Var;
                        break;
                    } else {
                        o4Var = new org.telegram.ui.Cells.y3(context, i6Var);
                        break;
                    }
                    break;
                case 32:
                    o4Var = new org.telegram.ui.Cells.h6(context, null);
                    break;
                case 33:
                    o4Var = new org.telegram.ui.Cells.u2(context, true);
                    break;
                case 34:
                    wz wzVar = new wz(context, i6Var);
                    wzVar.setIsSingleCell(true);
                    o4Var = wzVar;
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
                        org.telegram.ui.Cells.d2 d2Var = new org.telegram.ui.Cells.d2(this.f42806e, i15, 21, true, this.f42812x);
                        d2Var.getCheckBoxRound().b(org.telegram.ui.ActionBar.n6.V6, org.telegram.ui.ActionBar.n6.f29450g7, org.telegram.ui.ActionBar.n6.f29524k7);
                        o4Var3 = d2Var;
                        o4Var = o4Var3;
                        break;
                    }
                    i15 = i17;
                    org.telegram.ui.Cells.d2 d2Var2 = new org.telegram.ui.Cells.d2(this.f42806e, i15, 21, true, this.f42812x);
                    d2Var2.getCheckBoxRound().b(org.telegram.ui.ActionBar.n6.V6, org.telegram.ui.ActionBar.n6.f29450g7, org.telegram.ui.ActionBar.n6.f29524k7);
                    o4Var3 = d2Var2;
                    o4Var = o4Var3;
                case 38:
                    o4Var = new org.telegram.ui.Cells.e2(context, i6Var);
                    break;
                case 39:
                case 40:
                    o4Var = new org.telegram.ui.Cells.r8(context);
                    break;
                case 42:
                    o4Var3 = new org.telegram.ui.Cells.o4(this.f42806e, org.telegram.ui.ActionBar.n6.L6, 21, 15, 0, false, true, this.f42812x);
                    o4Var = o4Var3;
                    break;
                case 43:
                    o4Var = new org.telegram.ui.Cells.x9(0, context, i6Var);
                    break;
                case 44:
                    o4Var = new org.telegram.ui.Cells.i6(context, false);
                    break;
            }
        }
        if (N(i7)) {
            org.telegram.ui.ActionBar.u6.h(i10, o4Var, this.P);
        }
        return new v4.f1(o4Var);
    }

    @Override
    public void y(v4.f1 f1Var) {
        R(f1Var, this.O);
        P(f1Var);
    }
}
