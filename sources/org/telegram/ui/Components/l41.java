package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
public class l41 extends rg.b {
    public lg.f E;
    public i41 I;
    public i41 J;
    public int K;
    public boolean L;
    public org.telegram.messenger.v10 M;
    public boolean N;
    public final pj0 d;
    public final Context f35525e;
    public final int f35526f;
    public final int h;
    public final boolean f35527n;
    public boolean f35529s;
    public org.telegram.messenger.v10 f35530w;
    public final org.telegram.ui.ActionBar.f6 f35531x;
    public boolean f35528r = true;
    public final ArrayList f35532y = new ArrayList();
    public final ArrayList D = new ArrayList();
    public int F = 0;
    public final ArrayList G = new ArrayList();
    public final ArrayList H = new ArrayList();
    public final org.telegram.ui.ActionBar.s1 O = new org.telegram.ui.ActionBar.s1(this, 2);

    public l41(pj0 pj0Var, Context context, int i7, int i10, boolean z9, org.telegram.messenger.v10 v10Var, org.telegram.ui.ActionBar.f6 f6Var) {
        this.d = pj0Var;
        this.f35525e = context;
        this.f35526f = i7;
        this.h = i10;
        this.f35527n = z9;
        this.f35530w = v10Var;
        this.f35531x = f6Var;
        O(false);
    }

    public static boolean K(int i7) {
        if (i7 >= 10000) {
            w31 G = x31.G(i7);
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
    public boolean D(v4.d1 d1Var) {
        int i7 = d1Var.f57048f;
        x31 G = G(d1Var.b());
        if (i7 >= 10000) {
            w31 G2 = x31.G(i7);
            if (G2 == null || !G2.f()) {
                return false;
            }
        } else if (i7 != 3 && i7 != 5 && i7 != 6 && i7 != 30 && i7 != 4 && i7 != 10 && i7 != 44 && i7 != 11 && i7 != 12 && i7 != 17 && i7 != 16 && i7 != 29 && i7 != 25 && i7 != 27 && i7 != 32 && i7 != 33 && i7 != 35 && i7 != 36 && i7 != 37 && i7 != 41 && i7 != 39 && i7 != 40 && i7 != 38) {
            return false;
        }
        if (G != null && !G.f40176g) {
            return false;
        }
        return true;
    }

    public final void F(int i7) {
        if (i7 >= 0) {
            ArrayList arrayList = this.H;
            if (i7 < arrayList.size()) {
                i41 i41Var = (i41) arrayList.get(i7);
                this.M.a(Integer.valueOf(i7), new ArrayList(this.D.subList(i41Var.f34525a, i41Var.f34526b + 1)));
                this.L = false;
            }
        }
    }

    public final x31 G(int i7) {
        if (i7 >= 0) {
            ArrayList arrayList = this.D;
            if (i7 < arrayList.size()) {
                return (x31) arrayList.get(i7);
            }
            return null;
        }
        return null;
    }

    public final int H(int i7) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.H;
            if (i10 < arrayList.size()) {
                i41 i41Var = (i41) arrayList.get(i10);
                if (i7 >= i41Var.f34525a && i7 <= i41Var.f34526b) {
                    return i10;
                }
                i10++;
            } else {
                return -1;
            }
        }
    }

    public int I(int i7) {
        return org.telegram.ui.ActionBar.k6.w0(i7, this.f35531x);
    }

    public final boolean J(int i7) {
        x31 G = G(i7);
        x31 G2 = G(i7 + 1);
        if (G != null && !G.f40178j && G2 != null && K(G2.f54532a) == K(G.f54532a)) {
            return true;
        }
        return false;
    }

    public final void L() {
        i41 i41Var = this.J;
        if (i41Var != null) {
            i41Var.f34526b = Math.max(0, this.D.size() - 1);
        }
    }

    public final int M() {
        ?? obj = new Object();
        this.J = obj;
        obj.f34525a = this.D.size();
        i41 i41Var = this.J;
        i41Var.f34526b = -1;
        ArrayList arrayList = this.H;
        arrayList.add(i41Var);
        return arrayList.size() - 1;
    }

    public final boolean N(int i7) {
        if (this.f35528r) {
            pj0 pj0Var = this.d;
            if (pj0Var == null || !pj0Var.b1() || !pj0Var.getSectionsDrawBackground()) {
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

    public void O(boolean z9) {
        pj0 pj0Var = this.d;
        if (pj0Var != null && pj0Var.c0()) {
            pj0Var.post(new tp0(5, this, z9));
        } else {
            Q(z9);
        }
    }

    public final void P(v4.d1 d1Var) {
        int i7;
        View view = d1Var.f57044a;
        if (view instanceof org.telegram.ui.ActionBar.a6) {
            ((org.telegram.ui.ActionBar.a6) view).updateColors();
            Object tag = view.getTag(2131296710);
            int i10 = org.telegram.ui.ActionBar.r6.f28479b;
            if (N(d1Var.f57048f) && (!(tag instanceof Integer) || ((Integer) tag).intValue() != i10)) {
                if (this.f35527n) {
                    i7 = org.telegram.ui.ActionBar.k6.f27925h5;
                } else {
                    i7 = org.telegram.ui.ActionBar.k6.f27852d6;
                }
                view.setBackgroundColor(I(i7));
            }
            view.setTag(2131296710, Integer.valueOf(i10));
        }
    }

    public final void Q(boolean z9) {
        pj0 pj0Var = this.d;
        if (pj0Var == null || !pj0Var.c0()) {
            ArrayList arrayList = this.f35532y;
            arrayList.clear();
            ArrayList arrayList2 = this.D;
            arrayList.addAll(arrayList2);
            arrayList2.clear();
            this.I = null;
            this.G.clear();
            this.H.clear();
            org.telegram.messenger.v10 v10Var = this.f35530w;
            if (v10Var != null) {
                v10Var.a(arrayList2, this);
                S();
                if (z9) {
                    E(arrayList, arrayList2);
                } else {
                    f();
                }
            }
        }
    }

    public final void R(v4.d1 d1Var, boolean z9) {
        if (d1Var != null) {
            View view = d1Var.f57044a;
            int i7 = d1Var.f57048f;
            if (i7 >= 10000) {
                w31 G = x31.G(i7);
                if (G != null) {
                    G.a(this.d, view, G(d1Var.b()));
                }
            } else if (i7 != 16) {
            } else {
                ((kg.p1) view).setReorder(z9);
            }
        }
    }

    public final void S() {
        pj0 pj0Var = this.d;
        if (pj0Var != null) {
            ArrayList arrayList = pj0Var.K2;
            if (arrayList == null) {
                pj0Var.K2 = new ArrayList();
            } else {
                arrayList.clear();
            }
            ArrayList arrayList2 = this.G;
            int size = arrayList2.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList2.get(i7);
                i7++;
                i41 i41Var = (i41) obj;
                pj0Var.K2.add(Long.valueOf(org.telegram.messenger.g0.w2(i41Var.f34525a, i41Var.f34526b)));
            }
        }
    }

    public final void T() {
        ArrayList arrayList = this.f35532y;
        arrayList.clear();
        ArrayList arrayList2 = this.D;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        this.G.clear();
        this.H.clear();
        org.telegram.messenger.v10 v10Var = this.f35530w;
        if (v10Var != null) {
            v10Var.a(arrayList2, this);
        }
        S();
    }

    public final void U() {
        i41 i41Var = this.I;
        if (i41Var != null) {
            i41Var.f34526b = Math.max(0, (this.D.size() + this.F) - 1);
            i41 i41Var2 = this.I;
            if (i41Var2.f34525a == i41Var2.f34526b) {
                this.G.remove(i41Var2);
            }
            this.I = null;
        }
    }

    public final void V() {
        ?? obj = new Object();
        this.I = obj;
        obj.f34525a = this.D.size() + this.F;
        i41 i41Var = this.I;
        i41Var.f34526b = -1;
        this.G.add(i41Var);
    }

    @Override
    public final int b() {
        return this.D.size();
    }

    @Override
    public final int d(int i7) {
        x31 G = G(i7);
        if (G == null) {
            return 0;
        }
        return G.f54532a;
    }

    @Override
    public void t(v4.d1 r38, int r39) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.l41.t(v4.d1, int):void");
    }

    @Override
    public v4.d1 x(ViewGroup viewGroup, int i7) {
        int i10;
        View frameLayout;
        mz n4Var;
        View n4Var2;
        View h5Var;
        boolean z9;
        int i11;
        int i12;
        float f10;
        float f11;
        int i13;
        int i14;
        int i15;
        org.telegram.ui.Cells.n4 n4Var3;
        boolean z10 = this.f35527n;
        if (z10) {
            i10 = org.telegram.ui.ActionBar.k6.f27925h5;
        } else {
            i10 = org.telegram.ui.ActionBar.k6.f27852d6;
        }
        pj0 pj0Var = this.d;
        org.telegram.ui.ActionBar.f6 f6Var = this.f35531x;
        Context context = this.f35525e;
        if (i7 >= 10000) {
            w31 G = x31.G(i7);
            if (G != null) {
                n4Var = G.d(context, pj0Var, this.f35526f, f6Var);
            } else {
                n4Var = new View(context);
            }
        } else {
            int i16 = 3;
            int i17 = 8;
            boolean z11 = true;
            switch (i7) {
                case -5:
                    frameLayout = new FrameLayout(context);
                    frameLayout.setTag(-33024);
                    n4Var = frameLayout;
                    break;
                case -4:
                case -1:
                    frameLayout = new di.a4(context, 23);
                    if (i7 == -4) {
                        frameLayout.setTag(-33024);
                    }
                    n4Var = frameLayout;
                    break;
                case -3:
                    ?? frameLayout2 = new FrameLayout(context);
                    frameLayout2.f34109a = 0;
                    n4Var = frameLayout2;
                    break;
                case -2:
                    n4Var = new di.a4(context, 24);
                    break;
                case 0:
                    if (z10) {
                        n4Var = new org.telegram.ui.Cells.n4(this.f35525e, org.telegram.ui.ActionBar.k6.L6, 21, 15, 0, false, false, this.f35531x);
                        break;
                    } else {
                        n4Var = new org.telegram.ui.Cells.n4(context, f6Var);
                        break;
                    }
                case 1:
                    n4Var2 = new org.telegram.ui.Cells.n4(this.f35525e, org.telegram.ui.ActionBar.k6.G6, 17, 15, false, this.f35531x);
                    n4Var = n4Var2;
                    break;
                case 2:
                    n4Var = new e01(context, f6Var);
                    break;
                case 3:
                    org.telegram.ui.Cells.m8 m8Var = new org.telegram.ui.Cells.m8(context, f6Var);
                    m8Var.setCompactLayout(this.f35529s);
                    n4Var = m8Var;
                    break;
                case 4:
                case 9:
                    org.telegram.ui.Cells.r8 r8Var = new org.telegram.ui.Cells.r8(context, f6Var);
                    if (i7 == 9) {
                        r8Var.setDrawCheckRipple(true);
                        r8Var.d(org.telegram.ui.ActionBar.k6.f27907g6, org.telegram.ui.ActionBar.k6.O6, org.telegram.ui.ActionBar.k6.P6, org.telegram.ui.ActionBar.k6.Q6, org.telegram.ui.ActionBar.k6.R6);
                        r8Var.setTypeface(org.telegram.messenger.g0.o());
                        r8Var.setHeight(56);
                    }
                    n4Var = r8Var;
                    break;
                case 5:
                case 6:
                    if (i7 == 6) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    h5Var = new org.telegram.ui.Cells.h5(this.f35525e, 21, 60, z9, this.f35531x);
                    n4Var = h5Var;
                    break;
                case 7:
                case 8:
                default:
                    n4Var = new org.telegram.ui.Cells.z8(context, f6Var);
                    break;
                case 10:
                    ?? frameLayout3 = new FrameLayout(context);
                    frameLayout3.f30624f = 23;
                    TextView textView = new TextView(context);
                    frameLayout3.f30621b = textView;
                    org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.G6, null);
                    org.telegram.messenger.camera.q.n(textView, 1, 16.0f, 1, 1);
                    textView.setSingleLine(true);
                    TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                    textView.setEllipsize(truncateAt);
                    if (org.telegram.messenger.id.f23157a0) {
                        i11 = 5;
                    } else {
                        i11 = 3;
                    }
                    textView.setGravity(i11 | 16);
                    boolean z12 = org.telegram.messenger.id.f23157a0;
                    if (z12) {
                        i12 = 5;
                    } else {
                        i12 = 3;
                    }
                    int i18 = i12 | 48;
                    if (z12) {
                        f10 = 61.0f;
                    } else {
                        f10 = 23.0f;
                    }
                    if (z12) {
                        f11 = 23.0f;
                    } else {
                        f11 = 61.0f;
                    }
                    frameLayout3.addView(textView, c8.ha.d(-1, -1.0f, i18, f10, 0.0f, f11, 0.0f));
                    TextView textView2 = new TextView(context);
                    frameLayout3.f30622c = textView2;
                    org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.I6, null);
                    org.telegram.messenger.camera.q.n(textView2, 1, 16.0f, 1, 1);
                    textView2.setSingleLine(true);
                    textView2.setEllipsize(truncateAt);
                    if (org.telegram.messenger.id.f23157a0) {
                        i13 = 3;
                    } else {
                        i13 = 5;
                    }
                    textView2.setGravity(i13 | 16);
                    textView2.setVisibility(8);
                    if (org.telegram.messenger.id.f23157a0) {
                        i14 = 3;
                    } else {
                        i14 = 5;
                    }
                    frameLayout3.addView(textView2, c8.ha.d(-2, -1.0f, i14 | 48, 23.0f, 0.0f, 23.0f, 0.0f));
                    RadioButton radioButton = new RadioButton(context);
                    frameLayout3.d = radioButton;
                    radioButton.setSize(org.telegram.messenger.g0.L(20.0f));
                    org.telegram.ui.ActionBar.r6.P(radioButton, org.telegram.ui.ActionBar.k6.f27908g7, org.telegram.ui.ActionBar.k6.h7, null);
                    if (!org.telegram.messenger.id.f23157a0) {
                        i16 = 5;
                    }
                    frameLayout3.addView(radioButton, c8.ha.d(22, 22.0f, i16 | 48, 20.0f, 15.0f, 20.0f, 0.0f));
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
                    n4Var2 = new org.telegram.ui.Cells.pa(6, 0, this.f35525e, null, false, true);
                    n4Var = n4Var2;
                    break;
                case 14:
                    n4Var = new vt0(context, f6Var);
                    break;
                case 15:
                    n4Var = new org.telegram.ui.Cells.t7(context, f6Var);
                    break;
                case 16:
                    if (this.M == null) {
                        z11 = false;
                    }
                    n4Var = new kg.p1(context, f6Var, z11);
                    break;
                case 17:
                    n4Var = new kg.n1(context, f6Var);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    if (this.E == null) {
                        this.E = new lg.f((org.telegram.ui.ActionBar.f6) null);
                    }
                    h5Var = new org.telegram.ui.a51(this.f35525e, this.f35526f, i7 - 18, this.E, this.h);
                    n4Var = h5Var;
                    break;
                case 24:
                    n4Var = new org.telegram.ui.xd(context, f6Var);
                    break;
                case 25:
                    n4Var = new org.telegram.ui.yd(context, f6Var);
                    break;
                case 26:
                    org.telegram.ui.Cells.n4 n4Var4 = new org.telegram.ui.Cells.n4(this.f35525e, org.telegram.ui.ActionBar.k6.G6, 23, 20, 0, false, false, this.f35531x);
                    n4Var4.setTextSize(20.0f);
                    n4Var3 = n4Var4;
                    n4Var = n4Var3;
                    break;
                case 27:
                    fi.r8 r8Var2 = new fi.r8(context, f6Var);
                    r8Var2.d(false, false);
                    n4Var = r8Var2;
                    break;
                case 28:
                    frameLayout = new View(context);
                    frameLayout.setTag(-33024);
                    n4Var = frameLayout;
                    break;
                case 29:
                    n4Var = new kg.t(context, f6Var);
                    break;
                case 30:
                    n4Var = new org.telegram.ui.Cells.c9(context, f6Var);
                    break;
                case 31:
                    if (pj0Var != null && pj0Var.b1()) {
                        org.telegram.ui.Cells.x3 x3Var = new org.telegram.ui.Cells.x3(28, context, f6Var);
                        x3Var.setNoBackground(true);
                        n4Var = x3Var;
                        break;
                    } else {
                        n4Var = new org.telegram.ui.Cells.x3(context, f6Var);
                        break;
                    }
                    break;
                case 32:
                    n4Var = new org.telegram.ui.Cells.g6(context, null);
                    break;
                case 33:
                    n4Var = new org.telegram.ui.Cells.t2(context, true);
                    break;
                case 34:
                    mz mzVar = new mz(context, f6Var);
                    mzVar.setIsSingleCell(true);
                    n4Var = mzVar;
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
                        org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(this.f35525e, i15, 21, true, this.f35531x);
                        c2Var.getCheckBoxRound().b(org.telegram.ui.ActionBar.k6.V6, org.telegram.ui.ActionBar.k6.f27908g7, org.telegram.ui.ActionBar.k6.f27982k7);
                        n4Var3 = c2Var;
                        n4Var = n4Var3;
                        break;
                    }
                    i15 = i17;
                    org.telegram.ui.Cells.c2 c2Var2 = new org.telegram.ui.Cells.c2(this.f35525e, i15, 21, true, this.f35531x);
                    c2Var2.getCheckBoxRound().b(org.telegram.ui.ActionBar.k6.V6, org.telegram.ui.ActionBar.k6.f27908g7, org.telegram.ui.ActionBar.k6.f27982k7);
                    n4Var3 = c2Var2;
                    n4Var = n4Var3;
                case 38:
                    n4Var = new org.telegram.ui.Cells.d2(context, f6Var);
                    break;
                case 39:
                case 40:
                    n4Var = new org.telegram.ui.Cells.q8(context);
                    break;
                case 42:
                    n4Var3 = new org.telegram.ui.Cells.n4(this.f35525e, org.telegram.ui.ActionBar.k6.L6, 21, 15, 0, false, true, this.f35531x);
                    n4Var = n4Var3;
                    break;
                case 43:
                    n4Var = new org.telegram.ui.Cells.w9(0, context, f6Var);
                    break;
                case 44:
                    n4Var = new org.telegram.ui.Cells.h6(context, false);
                    break;
            }
        }
        if (N(i7)) {
            org.telegram.ui.ActionBar.r6.i(i10, n4Var, this.O);
        }
        return new v4.d1(n4Var);
    }

    @Override
    public void y(v4.d1 d1Var) {
        R(d1Var, this.N);
        P(d1Var);
    }
}
