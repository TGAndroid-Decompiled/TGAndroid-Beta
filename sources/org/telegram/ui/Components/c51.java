package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
public class c51 extends rg.b {
    public lg.f F;
    public z41 J;
    public z41 K;
    public int L;
    public boolean M;
    public org.telegram.messenger.r10 N;
    public boolean O;
    public final ek0 d;
    public final Context f34059e;
    public final int f34060f;
    public final int h;
    public final boolean f34061n;
    public boolean f34063s;
    public org.telegram.messenger.r10 f34064w;
    public final org.telegram.ui.ActionBar.h6 f34065x;
    public boolean f34062r = true;
    public final ArrayList f34066y = new ArrayList();
    public final ArrayList E = new ArrayList();
    public int G = 0;
    public final ArrayList H = new ArrayList();
    public final ArrayList I = new ArrayList();
    public final org.telegram.ui.ActionBar.r1 P = new org.telegram.ui.ActionBar.r1(this, 2);

    public c51(ek0 ek0Var, Context context, int i7, int i10, boolean z10, org.telegram.messenger.r10 r10Var, org.telegram.ui.ActionBar.h6 h6Var) {
        this.d = ek0Var;
        this.f34059e = context;
        this.f34060f = i7;
        this.h = i10;
        this.f34061n = z10;
        this.f34064w = r10Var;
        this.f34065x = h6Var;
        O(false);
    }

    public static boolean K(int i7) {
        if (i7 >= 10000) {
            n41 G = o41.G(i7);
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
        int i7 = f1Var.f59169f;
        o41 G = G(f1Var.b());
        if (i7 >= 10000) {
            n41 G2 = o41.G(i7);
            if (G2 == null || !G2.f()) {
                return false;
            }
        } else if (i7 != 3 && i7 != 5 && i7 != 6 && i7 != 30 && i7 != 4 && i7 != 10 && i7 != 44 && i7 != 11 && i7 != 12 && i7 != 17 && i7 != 16 && i7 != 29 && i7 != 25 && i7 != 27 && i7 != 32 && i7 != 33 && i7 != 35 && i7 != 36 && i7 != 37 && i7 != 41 && i7 != 39 && i7 != 40 && i7 != 38) {
            return false;
        }
        if (G != null && !G.f38087g) {
            return false;
        }
        return true;
    }

    public final void F(int i7) {
        if (i7 >= 0) {
            ArrayList arrayList = this.I;
            if (i7 < arrayList.size()) {
                z41 z41Var = (z41) arrayList.get(i7);
                this.N.a(Integer.valueOf(i7), new ArrayList(this.E.subList(z41Var.f42680a, z41Var.f42681b + 1)));
                this.M = false;
            }
        }
    }

    public final o41 G(int i7) {
        if (i7 >= 0) {
            ArrayList arrayList = this.E;
            if (i7 < arrayList.size()) {
                return (o41) arrayList.get(i7);
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
                z41 z41Var = (z41) arrayList.get(i10);
                if (i7 >= z41Var.f42680a && i7 <= z41Var.f42681b) {
                    return i10;
                }
                i10++;
            } else {
                return -1;
            }
        }
    }

    public int I(int i7) {
        return org.telegram.ui.ActionBar.m6.w0(i7, this.f34065x);
    }

    public final boolean J(int i7) {
        o41 G = G(i7);
        o41 G2 = G(i7 + 1);
        if (G != null && !G.f38089j && G2 != null && K(G2.f56634a) == K(G.f56634a)) {
            return true;
        }
        return false;
    }

    public final void L() {
        z41 z41Var = this.K;
        if (z41Var != null) {
            z41Var.f42681b = Math.max(0, this.E.size() - 1);
        }
    }

    public final int M() {
        ?? obj = new Object();
        this.K = obj;
        obj.f42680a = this.E.size();
        z41 z41Var = this.K;
        z41Var.f42681b = -1;
        ArrayList arrayList = this.I;
        arrayList.add(z41Var);
        return arrayList.size() - 1;
    }

    public final boolean N(int i7) {
        if (this.f34062r) {
            ek0 ek0Var = this.d;
            if (ek0Var == null || !ek0Var.b1() || !ek0Var.getSectionsDrawBackground()) {
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
        ek0 ek0Var = this.d;
        if (ek0Var != null && ek0Var.c0()) {
            ek0Var.post(new rp0(6, this, z10));
        } else {
            Q(z10);
        }
    }

    public final void P(v4.f1 f1Var) {
        int i7;
        View view = f1Var.f59165a;
        if (view instanceof org.telegram.ui.ActionBar.b6) {
            ((org.telegram.ui.ActionBar.b6) view).updateColors();
            Object tag = view.getTag(2131296712);
            int i10 = org.telegram.ui.ActionBar.t6.f30069b;
            if (N(f1Var.f59169f) && (!(tag instanceof Integer) || ((Integer) tag).intValue() != i10)) {
                if (this.f34061n) {
                    i7 = org.telegram.ui.ActionBar.m6.f29454h5;
                } else {
                    i7 = org.telegram.ui.ActionBar.m6.f29381d6;
                }
                view.setBackgroundColor(I(i7));
            }
            view.setTag(2131296712, Integer.valueOf(i10));
        }
    }

    public final void Q(boolean z10) {
        ek0 ek0Var = this.d;
        if (ek0Var == null || !ek0Var.c0()) {
            ArrayList arrayList = this.f34066y;
            arrayList.clear();
            ArrayList arrayList2 = this.E;
            arrayList.addAll(arrayList2);
            arrayList2.clear();
            this.J = null;
            this.H.clear();
            this.I.clear();
            org.telegram.messenger.r10 r10Var = this.f34064w;
            if (r10Var != null) {
                r10Var.a(arrayList2, this);
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
            View view = f1Var.f59165a;
            int i7 = f1Var.f59169f;
            if (i7 >= 10000) {
                n41 G = o41.G(i7);
                if (G != null) {
                    G.a(this.d, view, G(f1Var.b()));
                }
            } else if (i7 != 16) {
            } else {
                ((kg.r1) view).setReorder(z10);
            }
        }
    }

    public final void S() {
        ek0 ek0Var = this.d;
        if (ek0Var != null) {
            ArrayList arrayList = ek0Var.L2;
            if (arrayList == null) {
                ek0Var.L2 = new ArrayList();
            } else {
                arrayList.clear();
            }
            ArrayList arrayList2 = this.H;
            int size = arrayList2.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList2.get(i7);
                i7++;
                z41 z41Var = (z41) obj;
                ek0Var.L2.add(Long.valueOf(org.telegram.messenger.g0.w2(z41Var.f42680a, z41Var.f42681b)));
            }
        }
    }

    public final void T() {
        ArrayList arrayList = this.f34066y;
        arrayList.clear();
        ArrayList arrayList2 = this.E;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        this.H.clear();
        this.I.clear();
        org.telegram.messenger.r10 r10Var = this.f34064w;
        if (r10Var != null) {
            r10Var.a(arrayList2, this);
        }
        S();
    }

    public final void U() {
        z41 z41Var = this.J;
        if (z41Var != null) {
            z41Var.f42681b = Math.max(0, (this.E.size() + this.G) - 1);
            z41 z41Var2 = this.J;
            if (z41Var2.f42680a == z41Var2.f42681b) {
                this.H.remove(z41Var2);
            }
            this.J = null;
        }
    }

    public final void V() {
        ?? obj = new Object();
        this.J = obj;
        obj.f42680a = this.E.size() + this.G;
        z41 z41Var = this.J;
        z41Var.f42681b = -1;
        this.H.add(z41Var);
    }

    @Override
    public final int b() {
        return this.E.size();
    }

    @Override
    public final int d(int i7) {
        o41 G = G(i7);
        if (G == null) {
            return 0;
        }
        return G.f56634a;
    }

    @Override
    public void t(v4.f1 r38, int r39) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.c51.t(v4.f1, int):void");
    }

    @Override
    public v4.f1 x(ViewGroup viewGroup, int i7) {
        int i10;
        View frameLayout;
        yz o4Var;
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
        boolean z11 = this.f34061n;
        if (z11) {
            i10 = org.telegram.ui.ActionBar.m6.f29454h5;
        } else {
            i10 = org.telegram.ui.ActionBar.m6.f29381d6;
        }
        ek0 ek0Var = this.d;
        org.telegram.ui.ActionBar.h6 h6Var = this.f34065x;
        Context context = this.f34059e;
        if (i7 >= 10000) {
            n41 G = o41.G(i7);
            if (G != null) {
                o4Var = G.d(context, ek0Var, this.f34060f, h6Var);
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
                    frameLayout = new bi.t2(context, 25);
                    if (i7 == -4) {
                        frameLayout.setTag(-33024);
                    }
                    o4Var = frameLayout;
                    break;
                case -3:
                    ?? frameLayout2 = new FrameLayout(context);
                    frameLayout2.f42318a = 0;
                    o4Var = frameLayout2;
                    break;
                case -2:
                    o4Var = new bi.t2(context, 26);
                    break;
                case 0:
                    if (z11) {
                        o4Var = new org.telegram.ui.Cells.o4(this.f34059e, org.telegram.ui.ActionBar.m6.L6, 21, 15, 0, false, false, this.f34065x);
                        break;
                    } else {
                        o4Var = new org.telegram.ui.Cells.o4(context, h6Var);
                        break;
                    }
                case 1:
                    o4Var2 = new org.telegram.ui.Cells.o4(this.f34059e, org.telegram.ui.ActionBar.m6.G6, 17, 15, false, this.f34065x);
                    o4Var = o4Var2;
                    break;
                case 2:
                    o4Var = new p01(context, h6Var);
                    break;
                case 3:
                    org.telegram.ui.Cells.n8 n8Var = new org.telegram.ui.Cells.n8(context, h6Var);
                    n8Var.setCompactLayout(this.f34063s);
                    o4Var = n8Var;
                    break;
                case 4:
                case 9:
                    org.telegram.ui.Cells.s8 s8Var = new org.telegram.ui.Cells.s8(context, h6Var);
                    if (i7 == 9) {
                        s8Var.setDrawCheckRipple(true);
                        s8Var.d(org.telegram.ui.ActionBar.m6.f29436g6, org.telegram.ui.ActionBar.m6.O6, org.telegram.ui.ActionBar.m6.P6, org.telegram.ui.ActionBar.m6.Q6, org.telegram.ui.ActionBar.m6.R6);
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
                    j5Var = new org.telegram.ui.Cells.j5(this.f34059e, 21, 60, z10, this.f34065x);
                    o4Var = j5Var;
                    break;
                case 7:
                case 8:
                default:
                    o4Var = new org.telegram.ui.Cells.a9(context, h6Var);
                    break;
                case 10:
                    ?? frameLayout3 = new FrameLayout(context);
                    frameLayout3.f32248f = 23;
                    TextView textView = new TextView(context);
                    frameLayout3.f32245b = textView;
                    org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.G6, null);
                    org.telegram.messenger.o10.q(textView, 1, 16.0f, 1, 1);
                    textView.setSingleLine(true);
                    TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                    textView.setEllipsize(truncateAt);
                    if (org.telegram.messenger.hd.f24444a0) {
                        i11 = 5;
                    } else {
                        i11 = 3;
                    }
                    textView.setGravity(i11 | 16);
                    boolean z13 = org.telegram.messenger.hd.f24444a0;
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
                    frameLayout3.f32246c = textView2;
                    org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.I6, null);
                    org.telegram.messenger.o10.q(textView2, 1, 16.0f, 1, 1);
                    textView2.setSingleLine(true);
                    textView2.setEllipsize(truncateAt);
                    if (org.telegram.messenger.hd.f24444a0) {
                        i13 = 3;
                    } else {
                        i13 = 5;
                    }
                    textView2.setGravity(i13 | 16);
                    textView2.setVisibility(8);
                    if (org.telegram.messenger.hd.f24444a0) {
                        i14 = 3;
                    } else {
                        i14 = 5;
                    }
                    frameLayout3.addView(textView2, c8.ma.d(-2, -1.0f, i14 | 48, 23.0f, 0.0f, 23.0f, 0.0f));
                    RadioButton radioButton = new RadioButton(context);
                    frameLayout3.d = radioButton;
                    radioButton.setSize(org.telegram.messenger.g0.L(20.0f));
                    org.telegram.ui.ActionBar.t6.O(radioButton, org.telegram.ui.ActionBar.m6.f29437g7, org.telegram.ui.ActionBar.m6.h7, null);
                    if (!org.telegram.messenger.hd.f24444a0) {
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
                    o4Var2 = new org.telegram.ui.Cells.ra(6, 0, this.f34059e, null, false, true);
                    o4Var = o4Var2;
                    break;
                case 14:
                    o4Var = new hu0(context, h6Var);
                    break;
                case 15:
                    o4Var = new org.telegram.ui.Cells.u7(context, h6Var);
                    break;
                case 16:
                    if (this.N == null) {
                        z12 = false;
                    }
                    o4Var = new kg.r1(context, h6Var, z12);
                    break;
                case 17:
                    o4Var = new kg.p1(context, h6Var);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    if (this.F == null) {
                        this.F = new lg.f((org.telegram.ui.ActionBar.h6) null);
                    }
                    j5Var = new org.telegram.ui.a51(this.f34059e, this.f34060f, i7 - 18, this.F, this.h);
                    o4Var = j5Var;
                    break;
                case 24:
                    o4Var = new org.telegram.ui.vd(context, h6Var);
                    break;
                case 25:
                    o4Var = new org.telegram.ui.wd(context, h6Var);
                    break;
                case 26:
                    org.telegram.ui.Cells.o4 o4Var4 = new org.telegram.ui.Cells.o4(this.f34059e, org.telegram.ui.ActionBar.m6.G6, 23, 20, 0, false, false, this.f34065x);
                    o4Var4.setTextSize(20.0f);
                    o4Var3 = o4Var4;
                    o4Var = o4Var3;
                    break;
                case 27:
                    hi.o8 o8Var = new hi.o8(context, h6Var);
                    o8Var.d(false, false);
                    o4Var = o8Var;
                    break;
                case 28:
                    frameLayout = new View(context);
                    frameLayout.setTag(-33024);
                    o4Var = frameLayout;
                    break;
                case 29:
                    o4Var = new kg.t(context, h6Var);
                    break;
                case 30:
                    o4Var = new org.telegram.ui.Cells.d9(context, h6Var);
                    break;
                case 31:
                    if (ek0Var != null && ek0Var.b1()) {
                        org.telegram.ui.Cells.y3 y3Var = new org.telegram.ui.Cells.y3(28, context, h6Var);
                        y3Var.setNoBackground(true);
                        o4Var = y3Var;
                        break;
                    } else {
                        o4Var = new org.telegram.ui.Cells.y3(context, h6Var);
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
                    yz yzVar = new yz(context, h6Var);
                    yzVar.setIsSingleCell(true);
                    o4Var = yzVar;
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
                        org.telegram.ui.Cells.d2 d2Var = new org.telegram.ui.Cells.d2(this.f34059e, i15, 21, true, this.f34065x);
                        d2Var.getCheckBoxRound().b(org.telegram.ui.ActionBar.m6.V6, org.telegram.ui.ActionBar.m6.f29437g7, org.telegram.ui.ActionBar.m6.f29511k7);
                        o4Var3 = d2Var;
                        o4Var = o4Var3;
                        break;
                    }
                    i15 = i17;
                    org.telegram.ui.Cells.d2 d2Var2 = new org.telegram.ui.Cells.d2(this.f34059e, i15, 21, true, this.f34065x);
                    d2Var2.getCheckBoxRound().b(org.telegram.ui.ActionBar.m6.V6, org.telegram.ui.ActionBar.m6.f29437g7, org.telegram.ui.ActionBar.m6.f29511k7);
                    o4Var3 = d2Var2;
                    o4Var = o4Var3;
                case 38:
                    o4Var = new org.telegram.ui.Cells.e2(context, h6Var);
                    break;
                case 39:
                case 40:
                    o4Var = new org.telegram.ui.Cells.r8(context);
                    break;
                case 42:
                    o4Var3 = new org.telegram.ui.Cells.o4(this.f34059e, org.telegram.ui.ActionBar.m6.L6, 21, 15, 0, false, true, this.f34065x);
                    o4Var = o4Var3;
                    break;
                case 43:
                    o4Var = new org.telegram.ui.Cells.x9(0, context, h6Var);
                    break;
                case 44:
                    o4Var = new org.telegram.ui.Cells.i6(context, false);
                    break;
            }
        }
        if (N(i7)) {
            org.telegram.ui.ActionBar.t6.h(i10, o4Var, this.P);
        }
        return new v4.f1(o4Var);
    }

    @Override
    public void y(v4.f1 f1Var) {
        R(f1Var, this.O);
        P(f1Var);
    }
}
