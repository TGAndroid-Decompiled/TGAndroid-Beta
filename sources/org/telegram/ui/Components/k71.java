package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public class k71 extends qg.b {
    public kg.g E;
    public g71 I;
    public g71 J;
    public int K;
    public boolean L;
    public Utilities.Callback2 M;
    public boolean N;
    public final nm0 d;
    public final Context e;
    public final int f29876f;
    public final int h;
    public final boolean f29877n;
    public boolean f29879s;
    public Utilities.Callback2 v;
    public final org.telegram.ui.ActionBar.u6 f29880w;
    public boolean f29878r = true;
    public final ArrayList f29881x = new ArrayList();
    public final ArrayList f29882y = new ArrayList();
    public int F = 0;
    public final ArrayList G = new ArrayList();
    public final ArrayList H = new ArrayList();
    public final j71 O = new j71(this);

    public k71(nm0 nm0Var, Context context, int i10, int i11, boolean z10, Utilities.Callback2 callback2, org.telegram.ui.ActionBar.u6 u6Var) {
        this.d = nm0Var;
        this.e = context;
        this.f29876f = i10;
        this.h = i11;
        this.f29877n = z10;
        this.v = callback2;
        this.f29880w = u6Var;
        O(false);
    }

    public static boolean K(int i10) {
        if (i10 >= 10000) {
            t61 G = u61.G(i10);
            if (G == null || !G.isShadow()) {
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
    public boolean D(s4.e1 e1Var) {
        int i10 = e1Var.f47776f;
        u61 G = G(e1Var.b());
        if (i10 >= 10000) {
            t61 G2 = u61.G(i10);
            if (G2 == null || !G2.isClickable()) {
                return false;
            }
        } else if (i10 != 3 && i10 != 5 && i10 != 6 && i10 != 30 && i10 != 4 && i10 != 10 && i10 != 44 && i10 != 11 && i10 != 12 && i10 != 17 && i10 != 16 && i10 != 29 && i10 != 25 && i10 != 27 && i10 != 32 && i10 != 33 && i10 != 35 && i10 != 36 && i10 != 37 && i10 != 41 && i10 != 39 && i10 != 40 && i10 != 38) {
            return false;
        }
        if (G != null && !G.f33245g) {
            return false;
        }
        return true;
    }

    public final void F(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.H;
            if (i10 < arrayList.size()) {
                g71 g71Var = (g71) arrayList.get(i10);
                this.M.run(Integer.valueOf(i10), new ArrayList(this.f29882y.subList(g71Var.f28451a, g71Var.f28452b + 1)));
                this.L = false;
            }
        }
    }

    public final u61 G(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f29882y;
            if (i10 < arrayList.size()) {
                return (u61) arrayList.get(i10);
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
                g71 g71Var = (g71) arrayList.get(i11);
                if (i10 >= g71Var.f28451a && i10 <= g71Var.f28452b) {
                    return i11;
                }
                i11++;
            } else {
                return -1;
            }
        }
    }

    public int I(int i10) {
        return org.telegram.ui.ActionBar.y6.w0(i10, this.f29880w);
    }

    public final boolean J(int i10) {
        u61 G = G(i10);
        u61 G2 = G(i10 + 1);
        if (G != null && !G.f33247j && G2 != null && K(G2.f47075a) == K(G.f47075a)) {
            return true;
        }
        return false;
    }

    public final void L() {
        g71 g71Var = this.J;
        if (g71Var != null) {
            g71Var.f28452b = Math.max(0, this.f29882y.size() - 1);
        }
    }

    public final int M() {
        ?? obj = new Object();
        this.J = obj;
        obj.f28451a = this.f29882y.size();
        g71 g71Var = this.J;
        g71Var.f28452b = -1;
        ArrayList arrayList = this.H;
        arrayList.add(g71Var);
        return arrayList.size() - 1;
    }

    public final boolean N(int i10) {
        if (this.f29878r) {
            nm0 nm0Var = this.d;
            if (nm0Var == null || !nm0Var.b1() || !nm0Var.getSectionsDrawBackground()) {
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
        nm0 nm0Var = this.d;
        if (nm0Var != null && nm0Var.c0()) {
            nm0Var.post(new d60(9, this, z10));
        } else {
            Q(z10);
        }
    }

    public final void P(s4.e1 e1Var) {
        int i10;
        View view = e1Var.f47773a;
        if (view instanceof org.telegram.ui.ActionBar.p6) {
            ((org.telegram.ui.ActionBar.p6) view).updateColors();
            Object tag = view.getTag(R.id.theme_generation);
            int i11 = org.telegram.ui.ActionBar.f7.f22629b;
            if (N(e1Var.f47776f) && (!(tag instanceof Integer) || ((Integer) tag).intValue() != i11)) {
                if (this.f29877n) {
                    i10 = org.telegram.ui.ActionBar.y6.f23428h5;
                } else {
                    i10 = org.telegram.ui.ActionBar.y6.f23357d6;
                }
                view.setBackgroundColor(I(i10));
            }
            view.setTag(R.id.theme_generation, Integer.valueOf(i11));
        }
    }

    public final void Q(boolean z10) {
        nm0 nm0Var = this.d;
        if (nm0Var == null || !nm0Var.c0()) {
            ArrayList arrayList = this.f29881x;
            arrayList.clear();
            ArrayList arrayList2 = this.f29882y;
            arrayList.addAll(arrayList2);
            arrayList2.clear();
            this.I = null;
            this.G.clear();
            this.H.clear();
            Utilities.Callback2 callback2 = this.v;
            if (callback2 != null) {
                callback2.run(arrayList2, this);
                S();
                if (z10) {
                    E(arrayList, arrayList2);
                } else {
                    l();
                }
            }
        }
    }

    public final void R(s4.e1 e1Var, boolean z10) {
        if (e1Var != null) {
            View view = e1Var.f47773a;
            int i10 = e1Var.f47776f;
            if (i10 >= 10000) {
                t61 G = u61.G(i10);
                if (G != null) {
                    G.attachedView(this.d, view, G(e1Var.b()));
                }
            } else if (i10 != 16) {
            } else {
                ((jg.y1) view).setReorder(z10);
            }
        }
    }

    public final void S() {
        nm0 nm0Var = this.d;
        if (nm0Var != null) {
            ArrayList arrayList = nm0Var.K2;
            if (arrayList == null) {
                nm0Var.K2 = new ArrayList();
            } else {
                arrayList.clear();
            }
            ArrayList arrayList2 = this.G;
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                g71 g71Var = (g71) obj;
                nm0Var.K2.add(Long.valueOf(AndroidUtilities.pack(g71Var.f28451a, g71Var.f28452b)));
            }
        }
    }

    public final void T() {
        ArrayList arrayList = this.f29881x;
        arrayList.clear();
        ArrayList arrayList2 = this.f29882y;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        this.G.clear();
        this.H.clear();
        Utilities.Callback2 callback2 = this.v;
        if (callback2 != null) {
            callback2.run(arrayList2, this);
        }
        S();
    }

    public final void U() {
        g71 g71Var = this.I;
        if (g71Var != null) {
            g71Var.f28452b = Math.max(0, (this.f29882y.size() + this.F) - 1);
            g71 g71Var2 = this.I;
            if (g71Var2.f28451a == g71Var2.f28452b) {
                this.G.remove(g71Var2);
            }
            this.I = null;
        }
    }

    public final void V() {
        ?? obj = new Object();
        this.I = obj;
        obj.f28451a = this.f29882y.size() + this.F;
        g71 g71Var = this.I;
        g71Var.f28452b = -1;
        this.G.add(g71Var);
    }

    @Override
    public final int h() {
        return this.f29882y.size();
    }

    @Override
    public final int j(int i10) {
        u61 G = G(i10);
        if (G == null) {
            return 0;
        }
        return G.f47075a;
    }

    @Override
    public void v(s4.e1 r38, int r39) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.k71.v(s4.e1, int):void");
    }

    @Override
    public s4.e1 x(ViewGroup viewGroup, int i10) {
        int i11;
        View frameLayout;
        View q4Var;
        org.telegram.ui.Cells.a9 a9Var;
        org.telegram.ui.Cells.y1 y1Var;
        boolean z10;
        int i12;
        int i13;
        float f7;
        float f10;
        int i14;
        int i15;
        int i16;
        org.telegram.ui.Cells.q4 q4Var2;
        boolean z11 = this.f29877n;
        if (z11) {
            i11 = org.telegram.ui.ActionBar.y6.f23428h5;
        } else {
            i11 = org.telegram.ui.ActionBar.y6.f23357d6;
        }
        Context context = this.e;
        if (i10 >= 10000) {
            t61 G = u61.G(i10);
            if (G != null) {
                y1Var = G.createView(this.e, this.d, this.f29876f, this.h, this.f29880w);
            } else {
                y1Var = new View(context);
            }
        } else {
            int i17 = 3;
            int i18 = 8;
            boolean z12 = true;
            org.telegram.ui.ActionBar.u6 u6Var = this.f29880w;
            switch (i10) {
                case -5:
                    frameLayout = new FrameLayout(context);
                    frameLayout.setTag(-33024);
                    y1Var = frameLayout;
                    break;
                case -4:
                case -1:
                    frameLayout = new di.i4(context, 20);
                    if (i10 == -4) {
                        frameLayout.setTag(-33024);
                    }
                    y1Var = frameLayout;
                    break;
                case -3:
                    ?? frameLayout2 = new FrameLayout(context);
                    frameLayout2.f28040a = 0;
                    y1Var = frameLayout2;
                    break;
                case -2:
                    y1Var = new di.i4(context, 21);
                    break;
                case 0:
                    if (z11) {
                        q4Var = new org.telegram.ui.Cells.q4(this.e, org.telegram.ui.ActionBar.y6.L6, 21, 15, 0, false, false, this.f29880w);
                        y1Var = q4Var;
                        break;
                    } else {
                        y1Var = new org.telegram.ui.Cells.q4(context, u6Var);
                        break;
                    }
                case 1:
                    q4Var2 = new org.telegram.ui.Cells.q4(this.e, org.telegram.ui.ActionBar.y6.G6, 17, 15, false, this.f29880w);
                    y1Var = q4Var2;
                    break;
                case 2:
                    y1Var = new k31(context, u6Var);
                    break;
                case 3:
                    org.telegram.ui.Cells.v8 v8Var = new org.telegram.ui.Cells.v8(context, u6Var);
                    v8Var.setCompactLayout(this.f29879s);
                    y1Var = v8Var;
                    break;
                case 4:
                case 9:
                    org.telegram.ui.Cells.a9 a9Var2 = new org.telegram.ui.Cells.a9(context, u6Var);
                    if (i10 == 9) {
                        a9Var2.setDrawCheckRipple(true);
                        a9Var = a9Var2;
                        a9Var.d(org.telegram.ui.ActionBar.y6.f23413g6, org.telegram.ui.ActionBar.y6.O6, org.telegram.ui.ActionBar.y6.P6, org.telegram.ui.ActionBar.y6.Q6, org.telegram.ui.ActionBar.y6.R6);
                        a9Var.setTypeface(AndroidUtilities.bold());
                        a9Var.setHeight(56);
                    } else {
                        a9Var = a9Var2;
                    }
                    y1Var = a9Var;
                    break;
                case 5:
                case 6:
                    if (i10 == 6) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    q4Var = new org.telegram.ui.Cells.n5(21, 60, this.e, this.f29880w, z10);
                    y1Var = q4Var;
                    break;
                case 7:
                case 8:
                default:
                    y1Var = new org.telegram.ui.Cells.i9(context, u6Var);
                    break;
                case 10:
                    ?? frameLayout3 = new FrameLayout(context);
                    frameLayout3.f24961f = 23;
                    TextView textView = new TextView(context);
                    frameLayout3.f24959b = textView;
                    org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.G6, null);
                    org.telegram.messenger.wh.r(textView, 1, 16.0f, 1, 1);
                    textView.setSingleLine(true);
                    TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                    textView.setEllipsize(truncateAt);
                    if (LocaleController.isRTL) {
                        i12 = 5;
                    } else {
                        i12 = 3;
                    }
                    textView.setGravity(i12 | 16);
                    boolean z13 = LocaleController.isRTL;
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
                    frameLayout3.addView(textView, kb1.h(-1, -1.0f, i19, f7, 0.0f, f10, 0.0f));
                    TextView textView2 = new TextView(context);
                    frameLayout3.f24960c = textView2;
                    org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.I6, null);
                    org.telegram.messenger.wh.r(textView2, 1, 16.0f, 1, 1);
                    textView2.setSingleLine(true);
                    textView2.setEllipsize(truncateAt);
                    if (LocaleController.isRTL) {
                        i14 = 3;
                    } else {
                        i14 = 5;
                    }
                    textView2.setGravity(i14 | 16);
                    textView2.setVisibility(8);
                    if (LocaleController.isRTL) {
                        i15 = 3;
                    } else {
                        i15 = 5;
                    }
                    frameLayout3.addView(textView2, kb1.h(-2, -1.0f, i15 | 48, 23.0f, 0.0f, 23.0f, 0.0f));
                    RadioButton radioButton = new RadioButton(context);
                    frameLayout3.d = radioButton;
                    radioButton.setSize(AndroidUtilities.dp(20.0f));
                    org.telegram.ui.ActionBar.f7.P(radioButton, org.telegram.ui.ActionBar.y6.g7, org.telegram.ui.ActionBar.y6.f23430h7, null);
                    if (!LocaleController.isRTL) {
                        i17 = 5;
                    }
                    frameLayout3.addView(radioButton, kb1.h(22, 22.0f, i17 | 48, 20.0f, 15.0f, 20.0f, 0.0f));
                    frameLayout3.b();
                    frameLayout3.setHorizontalPadding(21);
                    y1Var = frameLayout3;
                    break;
                case 11:
                case 12:
                    if (i10 != 12) {
                        i17 = 0;
                    }
                    org.telegram.ui.Cells.ab abVar = new org.telegram.ui.Cells.ab(context, 6, i17, false);
                    abVar.setSelfAsSavedMessages(true);
                    y1Var = abVar;
                    break;
                case 13:
                    q4Var2 = new org.telegram.ui.Cells.ab(6, 0, this.e, null, false, true);
                    y1Var = q4Var2;
                    break;
                case 14:
                    y1Var = new ax0(context, u6Var);
                    break;
                case 15:
                    y1Var = new org.telegram.ui.Cells.c8(context, u6Var);
                    break;
                case 16:
                    if (this.M == null) {
                        z12 = false;
                    }
                    y1Var = new jg.y1(context, u6Var, z12);
                    break;
                case 17:
                    y1Var = new jg.w1(context, u6Var);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    if (this.E == null) {
                        this.E = new kg.g(null);
                    }
                    y1Var = new org.telegram.ui.w91(this.e, this.f29876f, i10 - 18, this.E, this.h);
                    break;
                case 24:
                    y1Var = new org.telegram.ui.ie(context, u6Var);
                    break;
                case 25:
                    y1Var = new org.telegram.ui.je(context, u6Var);
                    break;
                case 26:
                    org.telegram.ui.Cells.q4 q4Var3 = new org.telegram.ui.Cells.q4(this.e, org.telegram.ui.ActionBar.y6.G6, 23, 20, 0, false, false, this.f29880w);
                    q4Var3.setTextSize(20.0f);
                    q4Var2 = q4Var3;
                    y1Var = q4Var2;
                    break;
                case 27:
                    fi.m9 m9Var = new fi.m9(context, u6Var);
                    m9Var.d(false, false);
                    y1Var = m9Var;
                    break;
                case 28:
                    frameLayout = new View(context);
                    frameLayout.setTag(-33024);
                    y1Var = frameLayout;
                    break;
                case 29:
                    y1Var = new jg.u(context, u6Var);
                    break;
                case 30:
                    y1Var = new org.telegram.ui.Cells.l9(context, u6Var);
                    break;
                case 31:
                    nm0 nm0Var = this.d;
                    if (nm0Var != null && nm0Var.b1()) {
                        org.telegram.ui.Cells.z3 z3Var = new org.telegram.ui.Cells.z3(context, 28, u6Var);
                        z3Var.setNoBackground(true);
                        y1Var = z3Var;
                        break;
                    } else {
                        y1Var = new org.telegram.ui.Cells.z3(context, u6Var);
                        break;
                    }
                    break;
                case 32:
                    y1Var = new org.telegram.ui.Cells.m6(context, null);
                    break;
                case 33:
                    y1Var = new org.telegram.ui.Cells.p2(context, true);
                    break;
                case 34:
                    c10 c10Var = new c10(context, u6Var);
                    c10Var.setIsSingleCell(true);
                    y1Var = c10Var;
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
                        org.telegram.ui.Cells.y1 y1Var2 = new org.telegram.ui.Cells.y1(i16, 21, this.e, this.f29880w, true);
                        y1Var2.getCheckBoxRound().b(org.telegram.ui.ActionBar.y6.V6, org.telegram.ui.ActionBar.y6.g7, org.telegram.ui.ActionBar.y6.f23486k7);
                        y1Var = y1Var2;
                        break;
                    }
                    i16 = i18;
                    org.telegram.ui.Cells.y1 y1Var22 = new org.telegram.ui.Cells.y1(i16, 21, this.e, this.f29880w, true);
                    y1Var22.getCheckBoxRound().b(org.telegram.ui.ActionBar.y6.V6, org.telegram.ui.ActionBar.y6.g7, org.telegram.ui.ActionBar.y6.f23486k7);
                    y1Var = y1Var22;
                case 38:
                    y1Var = new org.telegram.ui.Cells.z1(context, u6Var);
                    break;
                case 39:
                case 40:
                    y1Var = new org.telegram.ui.Cells.z8(context);
                    break;
                case 42:
                    q4Var2 = new org.telegram.ui.Cells.q4(this.e, org.telegram.ui.ActionBar.y6.L6, 21, 15, 0, false, true, this.f29880w);
                    y1Var = q4Var2;
                    break;
                case 43:
                    y1Var = new org.telegram.ui.Cells.ga(context, 0, u6Var);
                    break;
                case 44:
                    y1Var = new org.telegram.ui.Cells.n6(context, false);
                    break;
            }
        }
        if (N(i10)) {
            org.telegram.ui.ActionBar.f7.i(i11, y1Var, this.O);
        }
        return new s4.e1(y1Var);
    }

    @Override
    public void y(s4.e1 e1Var) {
        R(e1Var, this.N);
        P(e1Var);
    }
}
