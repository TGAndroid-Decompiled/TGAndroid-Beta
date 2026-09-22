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
import org.telegram.messenger.Utilities;
import org.telegram.ui.za1;
public class m61 extends og.b {
    public k61 H;
    public k61 I;
    public int J;
    public boolean K;
    public Utilities.Callback2 L;
    public boolean M;
    public final yl0 d;
    public final Context e;
    public final int f26340f;
    public final int h;
    public final boolean f26341n;
    public Utilities.Callback2 f26343s;
    public final org.telegram.ui.ActionBar.f6 v;
    public ig.f f26346y;
    public boolean f26342r = true;
    public final ArrayList f26344w = new ArrayList();
    public final ArrayList f26345x = new ArrayList();
    public int E = 0;
    public final ArrayList F = new ArrayList();
    public final ArrayList G = new ArrayList();

    public m61(yl0 yl0Var, Context context, int i10, int i11, boolean z10, Utilities.Callback2 callback2, org.telegram.ui.ActionBar.f6 f6Var) {
        this.d = yl0Var;
        this.e = context;
        this.f26340f = i10;
        this.h = i11;
        this.f26341n = z10;
        this.f26343s = callback2;
        this.v = f6Var;
        N(false);
    }

    public static boolean K(int i10) {
        if (i10 >= 10000) {
            x51 F = y51.F(i10);
            if (F == null || !F.isShadow()) {
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
        int i10 = c1Var.f42998f;
        y51 G = G(c1Var.b());
        if (i10 >= 10000) {
            x51 F = y51.F(i10);
            if (F == null || !F.isClickable()) {
                return false;
            }
        } else if (i10 != 3 && i10 != 5 && i10 != 6 && i10 != 30 && i10 != 4 && i10 != 10 && i10 != 44 && i10 != 11 && i10 != 12 && i10 != 17 && i10 != 16 && i10 != 29 && i10 != 25 && i10 != 27 && i10 != 32 && i10 != 33 && i10 != 35 && i10 != 36 && i10 != 37 && i10 != 41 && i10 != 39 && i10 != 40 && i10 != 38) {
            return false;
        }
        if (G != null && !G.f30514g) {
            return false;
        }
        return true;
    }

    public final void F(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.G;
            if (i10 < arrayList.size()) {
                k61 k61Var = (k61) arrayList.get(i10);
                this.L.run(Integer.valueOf(i10), new ArrayList(this.f26345x.subList(k61Var.f25637a, k61Var.f25638b + 1)));
                this.K = false;
            }
        }
    }

    public final y51 G(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f26345x;
            if (i10 < arrayList.size()) {
                return (y51) arrayList.get(i10);
            }
            return null;
        }
        return null;
    }

    public final int H(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.G;
            if (i11 < arrayList.size()) {
                k61 k61Var = (k61) arrayList.get(i11);
                if (i10 >= k61Var.f25637a && i10 <= k61Var.f25638b) {
                    return i11;
                }
                i11++;
            } else {
                return -1;
            }
        }
    }

    public int I(int i10) {
        return org.telegram.ui.ActionBar.j6.v0(i10, this.v);
    }

    public final boolean J(int i10) {
        y51 G = G(i10);
        y51 G2 = G(i10 + 1);
        if (G != null && !G.f30516j && G2 != null && K(G2.f15719a) == K(G.f15719a)) {
            return true;
        }
        return false;
    }

    public final void L() {
        k61 k61Var = this.I;
        if (k61Var != null) {
            k61Var.f25638b = Math.max(0, this.f26345x.size() - 1);
        }
    }

    public final int M() {
        ?? obj = new Object();
        this.I = obj;
        obj.f25637a = this.f26345x.size();
        k61 k61Var = this.I;
        k61Var.f25638b = -1;
        ArrayList arrayList = this.G;
        arrayList.add(k61Var);
        return arrayList.size() - 1;
    }

    public void N(boolean z10) {
        yl0 yl0Var = this.d;
        if (yl0Var != null && yl0Var.c0()) {
            yl0Var.post(new as0(5, this, z10));
        } else {
            P(z10);
        }
    }

    public final void O(s4.c1 c1Var) {
        int i10;
        View view = c1Var.f42995a;
        if (view instanceof org.telegram.ui.ActionBar.z5) {
            ((org.telegram.ui.ActionBar.z5) view).e();
            int i11 = c1Var.f42998f;
            if (this.f26342r) {
                if (i11 < 10000) {
                    switch (i11) {
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
                            break;
                        case -2:
                        case -1:
                        case 2:
                        case 7:
                        case 8:
                        case 26:
                        case 31:
                        case 38:
                        default:
                            return;
                    }
                }
                if (this.f26341n) {
                    i10 = org.telegram.ui.ActionBar.j6.f19180h5;
                } else {
                    i10 = org.telegram.ui.ActionBar.j6.f19109d6;
                }
                view.setBackgroundColor(I(i10));
            }
        }
    }

    public final void P(boolean z10) {
        yl0 yl0Var = this.d;
        if (yl0Var == null || !yl0Var.c0()) {
            ArrayList arrayList = this.f26344w;
            arrayList.clear();
            ArrayList arrayList2 = this.f26345x;
            arrayList.addAll(arrayList2);
            arrayList2.clear();
            this.H = null;
            this.F.clear();
            this.G.clear();
            Utilities.Callback2 callback2 = this.f26343s;
            if (callback2 != null) {
                callback2.run(arrayList2, this);
                R();
                if (z10) {
                    E(arrayList, arrayList2);
                } else {
                    l();
                }
            }
        }
    }

    public final void Q(s4.c1 c1Var, boolean z10) {
        if (c1Var != null) {
            View view = c1Var.f42995a;
            int i10 = c1Var.f42998f;
            if (i10 >= 10000) {
                x51 F = y51.F(i10);
                if (F != null) {
                    F.attachedView(this.d, view, G(c1Var.b()));
                }
            } else if (i10 != 16) {
            } else {
                ((hg.x1) view).setReorder(z10);
            }
        }
    }

    public final void R() {
        yl0 yl0Var = this.d;
        if (yl0Var != null) {
            ArrayList arrayList = yl0Var.K2;
            if (arrayList == null) {
                yl0Var.K2 = new ArrayList();
            } else {
                arrayList.clear();
            }
            ArrayList arrayList2 = this.F;
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                k61 k61Var = (k61) obj;
                yl0Var.K2.add(Long.valueOf(AndroidUtilities.pack(k61Var.f25637a, k61Var.f25638b)));
            }
        }
    }

    public final void S() {
        ArrayList arrayList = this.f26344w;
        arrayList.clear();
        ArrayList arrayList2 = this.f26345x;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        this.F.clear();
        this.G.clear();
        Utilities.Callback2 callback2 = this.f26343s;
        if (callback2 != null) {
            callback2.run(arrayList2, this);
        }
        R();
    }

    public final void T() {
        k61 k61Var = this.H;
        if (k61Var != null) {
            k61Var.f25638b = Math.max(0, (this.f26345x.size() + this.E) - 1);
            k61 k61Var2 = this.H;
            if (k61Var2.f25637a == k61Var2.f25638b) {
                this.F.remove(k61Var2);
            }
            this.H = null;
        }
    }

    public final void U() {
        ?? obj = new Object();
        this.H = obj;
        obj.f25637a = this.f26345x.size() + this.E;
        k61 k61Var = this.H;
        k61Var.f25638b = -1;
        this.F.add(k61Var);
    }

    @Override
    public final int h() {
        return this.f26345x.size();
    }

    @Override
    public final int j(int i10) {
        y51 G = G(i10);
        if (G == null) {
            return 0;
        }
        return G.f15719a;
    }

    @Override
    public void v(s4.c1 r36, int r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.m61.v(s4.c1, int):void");
    }

    @Override
    public s4.c1 x(ViewGroup viewGroup, int i10) {
        int i11;
        View x5Var;
        View n4Var;
        org.telegram.ui.Cells.x8 x8Var;
        org.telegram.ui.Cells.a2 a2Var;
        int i12;
        int i13;
        float f7;
        float f10;
        int i14;
        int i15;
        org.telegram.ui.Cells.n4 n4Var2;
        int i16;
        boolean z10 = this.f26341n;
        if (z10) {
            i11 = org.telegram.ui.ActionBar.j6.f19180h5;
        } else {
            i11 = org.telegram.ui.ActionBar.j6.f19109d6;
        }
        Context context = this.e;
        if (i10 >= 10000) {
            x51 F = y51.F(i10);
            if (F != null) {
                a2Var = F.createView(this.e, this.d, this.f26340f, this.h, this.v);
            } else {
                a2Var = new View(context);
            }
        } else {
            int i17 = 3;
            boolean z11 = true;
            org.telegram.ui.ActionBar.f6 f6Var = this.v;
            switch (i10) {
                case -4:
                case -1:
                    x5Var = new ai.x5(context, 21);
                    if (i10 == -4) {
                        x5Var.setTag(-33024);
                    }
                    a2Var = x5Var;
                    break;
                case -3:
                    ?? frameLayout = new FrameLayout(context);
                    frameLayout.f25295a = 0;
                    a2Var = frameLayout;
                    break;
                case -2:
                    a2Var = new ai.x5(context, 22);
                    break;
                case 0:
                    if (z10) {
                        x8Var = new org.telegram.ui.Cells.n4(this.e, org.telegram.ui.ActionBar.j6.L6, 21, 15, 0, false, false, this.v);
                        a2Var = x8Var;
                        break;
                    } else {
                        a2Var = new org.telegram.ui.Cells.n4(context, f6Var);
                        break;
                    }
                case 1:
                    n4Var = new org.telegram.ui.Cells.n4(this.e, org.telegram.ui.ActionBar.j6.G6, 17, 15, false, this.v);
                    a2Var = n4Var;
                    break;
                case 2:
                    a2Var = new p21(context, f6Var);
                    break;
                case 3:
                    a2Var = new org.telegram.ui.Cells.s8(context, f6Var);
                    break;
                case 4:
                case 9:
                    org.telegram.ui.Cells.x8 x8Var2 = new org.telegram.ui.Cells.x8(context, f6Var);
                    x8Var = x8Var2;
                    if (i10 == 9) {
                        x8Var2.setDrawCheckRipple(true);
                        x8Var2.d(org.telegram.ui.ActionBar.j6.f19163g6, org.telegram.ui.ActionBar.j6.O6, org.telegram.ui.ActionBar.j6.P6, org.telegram.ui.ActionBar.j6.Q6, org.telegram.ui.ActionBar.j6.R6);
                        x8Var2.setTypeface(AndroidUtilities.bold());
                        x8Var2.setHeight(56);
                        x8Var = x8Var2;
                    }
                    a2Var = x8Var;
                    break;
                case 5:
                case 6:
                    if (i10 != 6) {
                        z11 = false;
                    }
                    n4Var = new org.telegram.ui.Cells.k5(21, 60, this.e, this.v, z11);
                    a2Var = n4Var;
                    break;
                case 7:
                case 8:
                default:
                    a2Var = new org.telegram.ui.Cells.f9(context, f6Var);
                    break;
                case 10:
                    ?? frameLayout2 = new FrameLayout(context);
                    TextView textView = new TextView(context);
                    frameLayout2.f21614b = textView;
                    org.telegram.messenger.rk.t(textView, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false), 1, 16.0f, 1);
                    textView.setMaxLines(1);
                    textView.setSingleLine(true);
                    TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                    textView.setEllipsize(truncateAt);
                    if (LocaleController.isRTL) {
                        i12 = 5;
                    } else {
                        i12 = 3;
                    }
                    textView.setGravity(i12 | 16);
                    boolean z12 = LocaleController.isRTL;
                    if (z12) {
                        i13 = 5;
                    } else {
                        i13 = 3;
                    }
                    int i18 = i13 | 48;
                    if (z12) {
                        f7 = 61.0f;
                    } else {
                        f7 = 23.0f;
                    }
                    if (z12) {
                        f10 = 23.0f;
                    } else {
                        f10 = 61.0f;
                    }
                    frameLayout2.addView(textView, w7.y5.d(-1, -1.0f, i18, f7, 0.0f, f10, 0.0f));
                    TextView textView2 = new TextView(context);
                    frameLayout2.f21615c = textView2;
                    org.telegram.messenger.rk.t(textView2, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.I6, false), 1, 16.0f, 1);
                    textView2.setMaxLines(1);
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
                    frameLayout2.addView(textView2, w7.y5.d(-2, -1.0f, i15 | 48, 23.0f, 0.0f, 23.0f, 0.0f));
                    RadioButton radioButton = new RadioButton(context);
                    frameLayout2.d = radioButton;
                    radioButton.setSize(AndroidUtilities.dp(20.0f));
                    radioButton.b(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19164g7, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19182h7, false));
                    if (!LocaleController.isRTL) {
                        i17 = 5;
                    }
                    frameLayout2.addView(radioButton, w7.y5.d(22, 22.0f, i17 | 48, 20.0f, 15.0f, 20.0f, 0.0f));
                    frameLayout2.b();
                    a2Var = frameLayout2;
                    break;
                case 11:
                case 12:
                    if (i10 != 12) {
                        i17 = 0;
                    }
                    org.telegram.ui.Cells.ab abVar = new org.telegram.ui.Cells.ab(context, 6, i17, false);
                    abVar.setSelfAsSavedMessages(true);
                    a2Var = abVar;
                    break;
                case 13:
                    n4Var = new org.telegram.ui.Cells.ab(6, 0, this.e, null, false, true);
                    a2Var = n4Var;
                    break;
                case 14:
                    a2Var = new gw0(context, f6Var);
                    break;
                case 15:
                    a2Var = new org.telegram.ui.Cells.a8(context, f6Var);
                    break;
                case 16:
                    if (this.L == null) {
                        z11 = false;
                    }
                    a2Var = new hg.x1(context, f6Var, z11);
                    break;
                case 17:
                    a2Var = new hg.v1(context, f6Var);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    if (this.f26346y == null) {
                        this.f26346y = new ig.f(null);
                    }
                    ig.f fVar = this.f26346y;
                    int i19 = this.h;
                    a2Var = new za1(this.e, this.f26340f, i10 - 18, fVar, i19);
                    break;
                case 24:
                    a2Var = new org.telegram.ui.ie(context, f6Var);
                    break;
                case 25:
                    a2Var = new org.telegram.ui.je(context, f6Var);
                    break;
                case 26:
                    n4Var2 = new org.telegram.ui.Cells.n4(this.e, org.telegram.ui.ActionBar.j6.G6, 23, 20, 0, false, false, this.v);
                    n4Var2.setTextSize(20.0f);
                    a2Var = n4Var2;
                    break;
                case 27:
                    ci.ha haVar = new ci.ha(context, f6Var);
                    haVar.d(false, false);
                    a2Var = haVar;
                    break;
                case 28:
                    x5Var = new View(context);
                    x5Var.setTag(-33024);
                    a2Var = x5Var;
                    break;
                case 29:
                    a2Var = new hg.t(context, f6Var);
                    break;
                case 30:
                    a2Var = new org.telegram.ui.Cells.i9(context, f6Var);
                    break;
                case 31:
                    yl0 yl0Var = this.d;
                    if (yl0Var != null && yl0Var.c1()) {
                        org.telegram.ui.Cells.w3 w3Var = new org.telegram.ui.Cells.w3(context, 28, f6Var);
                        w3Var.setNoBackground(true);
                        a2Var = w3Var;
                        break;
                    } else {
                        a2Var = new org.telegram.ui.Cells.w3(context, f6Var);
                        break;
                    }
                    break;
                case 32:
                    a2Var = new org.telegram.ui.Cells.j6(context, null);
                    break;
                case 33:
                    a2Var = new org.telegram.ui.Cells.s2(context, true);
                    break;
                case 34:
                    t00 t00Var = new t00(context, f6Var);
                    t00Var.setIsSingleCell(true);
                    a2Var = t00Var;
                    break;
                case 35:
                case 36:
                case 37:
                case 41:
                    if (i10 == 35) {
                        i16 = 4;
                    } else if (i10 == 36) {
                        i16 = 6;
                    } else if (i10 == 37) {
                        i16 = 7;
                    } else if (i10 == 41) {
                        i16 = 8;
                    } else {
                        i16 = 0;
                    }
                    org.telegram.ui.Cells.a2 a2Var2 = new org.telegram.ui.Cells.a2(i16, 21, this.e, this.v, true);
                    a2Var2.getCheckBoxRound().b(org.telegram.ui.ActionBar.j6.V6, org.telegram.ui.ActionBar.j6.f19164g7, org.telegram.ui.ActionBar.j6.f19238k7);
                    a2Var = a2Var2;
                    break;
                case 38:
                    a2Var = new org.telegram.ui.Cells.b2(context, f6Var);
                    break;
                case 39:
                case 40:
                    a2Var = new org.telegram.ui.Cells.w8(context);
                    break;
                case 42:
                    n4Var2 = new org.telegram.ui.Cells.n4(this.e, org.telegram.ui.ActionBar.j6.L6, 21, 15, 0, false, true, this.v);
                    a2Var = n4Var2;
                    break;
                case 43:
                    a2Var = new org.telegram.ui.Cells.fa(context, 0, f6Var);
                    break;
                case 44:
                    a2Var = new org.telegram.ui.Cells.k6(context, false);
                    break;
            }
        }
        if (this.f26342r) {
            if (i10 < 10000) {
                switch (i10) {
                }
            }
            a2Var.setBackgroundColor(I(i11));
        }
        return new s4.c1(a2Var);
    }

    @Override
    public void y(s4.c1 c1Var) {
        Q(c1Var, this.M);
        O(c1Var);
    }
}
