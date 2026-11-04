package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
public class f41 extends sg.b {
    public mg.f F;
    public c41 J;
    public c41 K;
    public int L;
    public boolean M;
    public org.telegram.messenger.n10 N;
    public boolean O;
    public final tj0 d;
    public final Context f33695e;
    public final int f33696f;
    public final int h;
    public final boolean f33697n;
    public boolean f33699s;
    public org.telegram.messenger.n10 f33700w;
    public final org.telegram.ui.ActionBar.e6 f33701x;
    public boolean f33698r = true;
    public final ArrayList f33702y = new ArrayList();
    public final ArrayList E = new ArrayList();
    public int G = 0;
    public final ArrayList H = new ArrayList();
    public final ArrayList I = new ArrayList();
    public final org.telegram.ui.ActionBar.q1 P = new org.telegram.ui.ActionBar.q1(this, 2);

    public f41(tj0 tj0Var, Context context, int i3, int i10, boolean z10, org.telegram.messenger.n10 n10Var, org.telegram.ui.ActionBar.e6 e6Var) {
        this.d = tj0Var;
        this.f33695e = context;
        this.f33696f = i3;
        this.h = i10;
        this.f33697n = z10;
        this.f33700w = n10Var;
        this.f33701x = e6Var;
        O(false);
    }

    public static boolean K(int i3) {
        if (i3 >= 10000) {
            q31 G = r31.G(i3);
            if (G == null || !G.g()) {
                return false;
            }
            return true;
        } else if (i3 != 7 && i3 != 8 && i3 != 38 && i3 != 31 && i3 != -4 && i3 != 28 && i3 != 2 && i3 != -2) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public boolean D(u4.d1 d1Var) {
        int i3 = d1Var.f55544f;
        r31 G = G(d1Var.b());
        if (i3 >= 10000) {
            q31 G2 = r31.G(i3);
            if (G2 == null || !G2.f()) {
                return false;
            }
        } else if (i3 != 3 && i3 != 5 && i3 != 6 && i3 != 30 && i3 != 4 && i3 != 10 && i3 != 44 && i3 != 11 && i3 != 12 && i3 != 17 && i3 != 16 && i3 != 29 && i3 != 25 && i3 != 27 && i3 != 32 && i3 != 33 && i3 != 35 && i3 != 36 && i3 != 37 && i3 != 41 && i3 != 39 && i3 != 40 && i3 != 38) {
            return false;
        }
        if (G != null && !G.f37623g) {
            return false;
        }
        return true;
    }

    public final void F(int i3) {
        if (i3 >= 0) {
            ArrayList arrayList = this.I;
            if (i3 < arrayList.size()) {
                c41 c41Var = (c41) arrayList.get(i3);
                this.N.a(Integer.valueOf(i3), new ArrayList(this.E.subList(c41Var.f32559a, c41Var.f32560b + 1)));
                this.M = false;
            }
        }
    }

    public final r31 G(int i3) {
        if (i3 >= 0) {
            ArrayList arrayList = this.E;
            if (i3 < arrayList.size()) {
                return (r31) arrayList.get(i3);
            }
            return null;
        }
        return null;
    }

    public final int H(int i3) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.I;
            if (i10 < arrayList.size()) {
                c41 c41Var = (c41) arrayList.get(i10);
                if (i3 >= c41Var.f32559a && i3 <= c41Var.f32560b) {
                    return i10;
                }
                i10++;
            } else {
                return -1;
            }
        }
    }

    public int I(int i3) {
        return org.telegram.ui.ActionBar.k6.w0(i3, this.f33701x);
    }

    public final boolean J(int i3) {
        r31 G = G(i3);
        r31 G2 = G(i3 + 1);
        if (G != null && !G.f37625j && G2 != null && K(G2.f54715a) == K(G.f54715a)) {
            return true;
        }
        return false;
    }

    public final void L() {
        c41 c41Var = this.K;
        if (c41Var != null) {
            c41Var.f32560b = Math.max(0, this.E.size() - 1);
        }
    }

    public final int M() {
        ?? obj = new Object();
        this.K = obj;
        obj.f32559a = this.E.size();
        c41 c41Var = this.K;
        c41Var.f32560b = -1;
        ArrayList arrayList = this.I;
        arrayList.add(c41Var);
        return arrayList.size() - 1;
    }

    public final boolean N(int i3) {
        if (this.f33698r) {
            tj0 tj0Var = this.d;
            if (tj0Var == null || !tj0Var.b1() || !tj0Var.getSectionsDrawBackground()) {
                if (i3 >= 10000) {
                    return true;
                }
                switch (i3) {
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
        tj0 tj0Var = this.d;
        if (tj0Var != null && tj0Var.c0()) {
            tj0Var.post(new up0(5, this, z10));
        } else {
            Q(z10);
        }
    }

    public final void P(u4.d1 d1Var) {
        int i3;
        View view = d1Var.f55540a;
        if (view instanceof org.telegram.ui.ActionBar.z5) {
            ((org.telegram.ui.ActionBar.z5) view).updateColors();
            Object tag = view.getTag(2131296710);
            int i10 = org.telegram.ui.ActionBar.r6.f28515b;
            if (N(d1Var.f55544f) && (!(tag instanceof Integer) || ((Integer) tag).intValue() != i10)) {
                if (this.f33697n) {
                    i3 = org.telegram.ui.ActionBar.k6.f27954h5;
                } else {
                    i3 = org.telegram.ui.ActionBar.k6.f27878d6;
                }
                view.setBackgroundColor(I(i3));
            }
            view.setTag(2131296710, Integer.valueOf(i10));
        }
    }

    public final void Q(boolean z10) {
        tj0 tj0Var = this.d;
        if (tj0Var == null || !tj0Var.c0()) {
            ArrayList arrayList = this.f33702y;
            arrayList.clear();
            ArrayList arrayList2 = this.E;
            arrayList.addAll(arrayList2);
            arrayList2.clear();
            this.J = null;
            this.H.clear();
            this.I.clear();
            org.telegram.messenger.n10 n10Var = this.f33700w;
            if (n10Var != null) {
                n10Var.a(arrayList2, this);
                S();
                if (z10) {
                    E(arrayList, arrayList2);
                } else {
                    f();
                }
            }
        }
    }

    public final void R(u4.d1 d1Var, boolean z10) {
        if (d1Var != null) {
            View view = d1Var.f55540a;
            int i3 = d1Var.f55544f;
            if (i3 >= 10000) {
                q31 G = r31.G(i3);
                if (G != null) {
                    G.a(this.d, view, G(d1Var.b()));
                }
            } else if (i3 != 16) {
            } else {
                ((lg.q1) view).setReorder(z10);
            }
        }
    }

    public final void S() {
        tj0 tj0Var = this.d;
        if (tj0Var != null) {
            ArrayList arrayList = tj0Var.L2;
            if (arrayList == null) {
                tj0Var.L2 = new ArrayList();
            } else {
                arrayList.clear();
            }
            ArrayList arrayList2 = this.H;
            int size = arrayList2.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList2.get(i3);
                i3++;
                c41 c41Var = (c41) obj;
                tj0Var.L2.add(Long.valueOf(org.telegram.messenger.g0.w2(c41Var.f32559a, c41Var.f32560b)));
            }
        }
    }

    public final void T() {
        ArrayList arrayList = this.f33702y;
        arrayList.clear();
        ArrayList arrayList2 = this.E;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        this.H.clear();
        this.I.clear();
        org.telegram.messenger.n10 n10Var = this.f33700w;
        if (n10Var != null) {
            n10Var.a(arrayList2, this);
        }
        S();
    }

    public final void U() {
        c41 c41Var = this.J;
        if (c41Var != null) {
            c41Var.f32560b = Math.max(0, (this.E.size() + this.G) - 1);
            c41 c41Var2 = this.J;
            if (c41Var2.f32559a == c41Var2.f32560b) {
                this.H.remove(c41Var2);
            }
            this.J = null;
        }
    }

    public final void V() {
        ?? obj = new Object();
        this.J = obj;
        obj.f32559a = this.E.size() + this.G;
        c41 c41Var = this.J;
        c41Var.f32560b = -1;
        this.H.add(c41Var);
    }

    @Override
    public final int b() {
        return this.E.size();
    }

    @Override
    public final int d(int i3) {
        r31 G = G(i3);
        if (G == null) {
            return 0;
        }
        return G.f54715a;
    }

    @Override
    public void t(u4.d1 r38, int r39) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.f41.t(u4.d1, int):void");
    }

    @Override
    public u4.d1 x(ViewGroup viewGroup, int i3) {
        int i10;
        View frameLayout;
        iz n4Var;
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
        boolean z11 = this.f33697n;
        if (z11) {
            i10 = org.telegram.ui.ActionBar.k6.f27954h5;
        } else {
            i10 = org.telegram.ui.ActionBar.k6.f27878d6;
        }
        tj0 tj0Var = this.d;
        org.telegram.ui.ActionBar.e6 e6Var = this.f33701x;
        Context context = this.f33695e;
        if (i3 >= 10000) {
            q31 G = r31.G(i3);
            if (G != null) {
                n4Var = G.d(context, tj0Var, this.f33696f, e6Var);
            } else {
                n4Var = new View(context);
            }
        } else {
            int i16 = 3;
            int i17 = 8;
            boolean z12 = true;
            switch (i3) {
                case -5:
                    frameLayout = new FrameLayout(context);
                    frameLayout.setTag(-33024);
                    n4Var = frameLayout;
                    break;
                case -4:
                case -1:
                    frameLayout = new ai.d2(context, 25);
                    if (i3 == -4) {
                        frameLayout.setTag(-33024);
                    }
                    n4Var = frameLayout;
                    break;
                case -3:
                    ?? frameLayout2 = new FrameLayout(context);
                    frameLayout2.f32081a = 0;
                    n4Var = frameLayout2;
                    break;
                case -2:
                    n4Var = new ai.d2(context, 26);
                    break;
                case 0:
                    if (z11) {
                        n4Var = new org.telegram.ui.Cells.n4(this.f33695e, org.telegram.ui.ActionBar.k6.L6, 21, 15, 0, false, false, this.f33701x);
                        break;
                    } else {
                        n4Var = new org.telegram.ui.Cells.n4(context, e6Var);
                        break;
                    }
                case 1:
                    n4Var2 = new org.telegram.ui.Cells.n4(this.f33695e, org.telegram.ui.ActionBar.k6.G6, 17, 15, false, this.f33701x);
                    n4Var = n4Var2;
                    break;
                case 2:
                    n4Var = new d01(context, e6Var);
                    break;
                case 3:
                    org.telegram.ui.Cells.l8 l8Var = new org.telegram.ui.Cells.l8(context, e6Var);
                    l8Var.setCompactLayout(this.f33699s);
                    n4Var = l8Var;
                    break;
                case 4:
                case 9:
                    org.telegram.ui.Cells.q8 q8Var = new org.telegram.ui.Cells.q8(context, e6Var);
                    if (i3 == 9) {
                        q8Var.setDrawCheckRipple(true);
                        q8Var.d(org.telegram.ui.ActionBar.k6.f27937g6, org.telegram.ui.ActionBar.k6.O6, org.telegram.ui.ActionBar.k6.P6, org.telegram.ui.ActionBar.k6.Q6, org.telegram.ui.ActionBar.k6.R6);
                        q8Var.setTypeface(org.telegram.messenger.g0.o());
                        q8Var.setHeight(56);
                    }
                    n4Var = q8Var;
                    break;
                case 5:
                case 6:
                    if (i3 == 6) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    h5Var = new org.telegram.ui.Cells.h5(this.f33695e, 21, 60, z10, this.f33701x);
                    n4Var = h5Var;
                    break;
                case 7:
                case 8:
                default:
                    n4Var = new org.telegram.ui.Cells.y8(context, e6Var);
                    break;
                case 10:
                    ?? frameLayout3 = new FrameLayout(context);
                    frameLayout3.f30718f = 23;
                    TextView textView = new TextView(context);
                    frameLayout3.f30715b = textView;
                    org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.G6, null);
                    org.telegram.messenger.camera.q.n(textView, 1, 16.0f, 1, 1);
                    textView.setSingleLine(true);
                    TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                    textView.setEllipsize(truncateAt);
                    if (org.telegram.messenger.bd.f21784a0) {
                        i11 = 5;
                    } else {
                        i11 = 3;
                    }
                    textView.setGravity(i11 | 16);
                    boolean z13 = org.telegram.messenger.bd.f21784a0;
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
                    frameLayout3.addView(textView, b8.mf.d(-1, -1.0f, i18, f10, 0.0f, f11, 0.0f));
                    TextView textView2 = new TextView(context);
                    frameLayout3.f30716c = textView2;
                    org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.I6, null);
                    org.telegram.messenger.camera.q.n(textView2, 1, 16.0f, 1, 1);
                    textView2.setSingleLine(true);
                    textView2.setEllipsize(truncateAt);
                    if (org.telegram.messenger.bd.f21784a0) {
                        i13 = 3;
                    } else {
                        i13 = 5;
                    }
                    textView2.setGravity(i13 | 16);
                    textView2.setVisibility(8);
                    if (org.telegram.messenger.bd.f21784a0) {
                        i14 = 3;
                    } else {
                        i14 = 5;
                    }
                    frameLayout3.addView(textView2, b8.mf.d(-2, -1.0f, i14 | 48, 23.0f, 0.0f, 23.0f, 0.0f));
                    RadioButton radioButton = new RadioButton(context);
                    frameLayout3.d = radioButton;
                    radioButton.setSize(org.telegram.messenger.g0.L(20.0f));
                    org.telegram.ui.ActionBar.r6.P(radioButton, org.telegram.ui.ActionBar.k6.g7, org.telegram.ui.ActionBar.k6.h7, null);
                    if (!org.telegram.messenger.bd.f21784a0) {
                        i16 = 5;
                    }
                    frameLayout3.addView(radioButton, b8.mf.d(22, 22.0f, i16 | 48, 20.0f, 15.0f, 20.0f, 0.0f));
                    frameLayout3.b();
                    frameLayout3.setHorizontalPadding(21);
                    n4Var = frameLayout3;
                    break;
                case 11:
                case 12:
                    if (i3 != 12) {
                        i16 = 0;
                    }
                    org.telegram.ui.Cells.pa paVar = new org.telegram.ui.Cells.pa(context, 6, i16, false);
                    paVar.setSelfAsSavedMessages(true);
                    n4Var = paVar;
                    break;
                case 13:
                    n4Var2 = new org.telegram.ui.Cells.pa(6, 0, this.f33695e, null, false, true);
                    n4Var = n4Var2;
                    break;
                case 14:
                    n4Var = new ut0(context, e6Var);
                    break;
                case 15:
                    n4Var = new org.telegram.ui.Cells.s7(context, e6Var);
                    break;
                case 16:
                    if (this.N == null) {
                        z12 = false;
                    }
                    n4Var = new lg.q1(context, e6Var, z12);
                    break;
                case 17:
                    n4Var = new lg.o1(context, e6Var);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    if (this.F == null) {
                        this.F = new mg.f((org.telegram.ui.ActionBar.e6) null);
                    }
                    h5Var = new org.telegram.ui.p41(this.f33695e, this.f33696f, i3 - 18, this.F, this.h);
                    n4Var = h5Var;
                    break;
                case 24:
                    n4Var = new org.telegram.ui.vd(context, e6Var);
                    break;
                case 25:
                    n4Var = new org.telegram.ui.wd(context, e6Var);
                    break;
                case 26:
                    org.telegram.ui.Cells.n4 n4Var4 = new org.telegram.ui.Cells.n4(this.f33695e, org.telegram.ui.ActionBar.k6.G6, 23, 20, 0, false, false, this.f33701x);
                    n4Var4.setTextSize(20.0f);
                    n4Var3 = n4Var4;
                    n4Var = n4Var3;
                    break;
                case 27:
                    gi.s8 s8Var = new gi.s8(context, e6Var);
                    s8Var.d(false, false);
                    n4Var = s8Var;
                    break;
                case 28:
                    frameLayout = new View(context);
                    frameLayout.setTag(-33024);
                    n4Var = frameLayout;
                    break;
                case 29:
                    n4Var = new lg.t(context, e6Var);
                    break;
                case 30:
                    n4Var = new org.telegram.ui.Cells.b9(context, e6Var);
                    break;
                case 31:
                    if (tj0Var != null && tj0Var.b1()) {
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
                    iz izVar = new iz(context, e6Var);
                    izVar.setIsSingleCell(true);
                    n4Var = izVar;
                    break;
                case 35:
                case 36:
                case 37:
                case 41:
                    if (i3 == 35) {
                        i17 = 4;
                    } else {
                        if (i3 == 36) {
                            i15 = 6;
                        } else if (i3 == 37) {
                            i17 = 7;
                        } else if (i3 != 41) {
                            i15 = 0;
                        }
                        org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(this.f33695e, i15, 21, true, this.f33701x);
                        c2Var.getCheckBoxRound().b(org.telegram.ui.ActionBar.k6.V6, org.telegram.ui.ActionBar.k6.g7, org.telegram.ui.ActionBar.k6.f28008k7);
                        n4Var3 = c2Var;
                        n4Var = n4Var3;
                        break;
                    }
                    i15 = i17;
                    org.telegram.ui.Cells.c2 c2Var2 = new org.telegram.ui.Cells.c2(this.f33695e, i15, 21, true, this.f33701x);
                    c2Var2.getCheckBoxRound().b(org.telegram.ui.ActionBar.k6.V6, org.telegram.ui.ActionBar.k6.g7, org.telegram.ui.ActionBar.k6.f28008k7);
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
                    n4Var3 = new org.telegram.ui.Cells.n4(this.f33695e, org.telegram.ui.ActionBar.k6.L6, 21, 15, 0, false, true, this.f33701x);
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
        if (N(i3)) {
            org.telegram.ui.ActionBar.r6.i(i10, n4Var, this.P);
        }
        return new u4.d1(n4Var);
    }

    @Override
    public void y(u4.d1 d1Var) {
        R(d1Var, this.O);
        P(d1Var);
    }
}
