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
import org.telegram.ui.xa1;
public class l61 extends og.b {
    public j61 H;
    public j61 I;
    public int J;
    public boolean K;
    public Utilities.Callback2 L;
    public boolean M;
    public final wl0 d;
    public final Context e;
    public final int f26040f;
    public final int h;
    public final boolean f26041n;
    public Utilities.Callback2 f26043s;
    public final org.telegram.ui.ActionBar.e6 v;
    public ig.f f26046y;
    public boolean f26042r = true;
    public final ArrayList f26044w = new ArrayList();
    public final ArrayList f26045x = new ArrayList();
    public int E = 0;
    public final ArrayList F = new ArrayList();
    public final ArrayList G = new ArrayList();

    public l61(wl0 wl0Var, Context context, int i10, int i11, boolean z10, Utilities.Callback2 callback2, org.telegram.ui.ActionBar.e6 e6Var) {
        this.d = wl0Var;
        this.e = context;
        this.f26040f = i10;
        this.h = i11;
        this.f26041n = z10;
        this.f26043s = callback2;
        this.v = e6Var;
        N(false);
    }

    public static boolean K(int i10) {
        if (i10 >= 10000) {
            w51 F = x51.F(i10);
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
        int i10 = c1Var.f42932f;
        x51 G = G(c1Var.b());
        if (i10 >= 10000) {
            w51 F = x51.F(i10);
            if (F == null || !F.isClickable()) {
                return false;
            }
        } else if (i10 != 3 && i10 != 5 && i10 != 6 && i10 != 30 && i10 != 4 && i10 != 10 && i10 != 44 && i10 != 11 && i10 != 12 && i10 != 17 && i10 != 16 && i10 != 29 && i10 != 25 && i10 != 27 && i10 != 32 && i10 != 33 && i10 != 35 && i10 != 36 && i10 != 37 && i10 != 41 && i10 != 39 && i10 != 40 && i10 != 38) {
            return false;
        }
        if (G != null && !G.f30244g) {
            return false;
        }
        return true;
    }

    public final void F(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.G;
            if (i10 < arrayList.size()) {
                j61 j61Var = (j61) arrayList.get(i10);
                this.L.run(Integer.valueOf(i10), new ArrayList(this.f26045x.subList(j61Var.f25185a, j61Var.f25186b + 1)));
                this.K = false;
            }
        }
    }

    public final x51 G(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f26045x;
            if (i10 < arrayList.size()) {
                return (x51) arrayList.get(i10);
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
                j61 j61Var = (j61) arrayList.get(i11);
                if (i10 >= j61Var.f25185a && i10 <= j61Var.f25186b) {
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
        x51 G = G(i10);
        x51 G2 = G(i10 + 1);
        if (G != null && !G.f30246j && G2 != null && K(G2.f15672a) == K(G.f15672a)) {
            return true;
        }
        return false;
    }

    public final void L() {
        j61 j61Var = this.I;
        if (j61Var != null) {
            j61Var.f25186b = Math.max(0, this.f26045x.size() - 1);
        }
    }

    public final int M() {
        ?? obj = new Object();
        this.I = obj;
        obj.f25185a = this.f26045x.size();
        j61 j61Var = this.I;
        j61Var.f25186b = -1;
        ArrayList arrayList = this.G;
        arrayList.add(j61Var);
        return arrayList.size() - 1;
    }

    public void N(boolean z10) {
        wl0 wl0Var = this.d;
        if (wl0Var != null && wl0Var.c0()) {
            wl0Var.post(new es0(4, this, z10));
        } else {
            P(z10);
        }
    }

    public final void O(s4.c1 c1Var) {
        int i10;
        View view = c1Var.f42929a;
        if (view instanceof org.telegram.ui.ActionBar.z5) {
            ((org.telegram.ui.ActionBar.z5) view).e();
            int i11 = c1Var.f42932f;
            if (this.f26042r) {
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
                if (this.f26041n) {
                    i10 = org.telegram.ui.ActionBar.j6.f19133h5;
                } else {
                    i10 = org.telegram.ui.ActionBar.j6.f19062d6;
                }
                view.setBackgroundColor(I(i10));
            }
        }
    }

    public final void P(boolean z10) {
        wl0 wl0Var = this.d;
        if (wl0Var == null || !wl0Var.c0()) {
            ArrayList arrayList = this.f26044w;
            arrayList.clear();
            ArrayList arrayList2 = this.f26045x;
            arrayList.addAll(arrayList2);
            arrayList2.clear();
            this.H = null;
            this.F.clear();
            this.G.clear();
            Utilities.Callback2 callback2 = this.f26043s;
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
            View view = c1Var.f42929a;
            int i10 = c1Var.f42932f;
            if (i10 >= 10000) {
                w51 F = x51.F(i10);
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
        wl0 wl0Var = this.d;
        if (wl0Var != null) {
            ArrayList arrayList = wl0Var.K2;
            if (arrayList == null) {
                wl0Var.K2 = new ArrayList();
            } else {
                arrayList.clear();
            }
            ArrayList arrayList2 = this.F;
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                j61 j61Var = (j61) obj;
                wl0Var.K2.add(Long.valueOf(AndroidUtilities.pack(j61Var.f25185a, j61Var.f25186b)));
            }
        }
    }

    public final void S() {
        ArrayList arrayList = this.f26044w;
        arrayList.clear();
        ArrayList arrayList2 = this.f26045x;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        this.F.clear();
        this.G.clear();
        Utilities.Callback2 callback2 = this.f26043s;
        if (callback2 != null) {
            callback2.run(arrayList2, this);
        }
        R();
    }

    public final void T() {
        j61 j61Var = this.H;
        if (j61Var != null) {
            j61Var.f25186b = Math.max(0, (this.f26045x.size() + this.E) - 1);
            j61 j61Var2 = this.H;
            if (j61Var2.f25185a == j61Var2.f25186b) {
                this.F.remove(j61Var2);
            }
            this.H = null;
        }
    }

    public final void U() {
        ?? obj = new Object();
        this.H = obj;
        obj.f25185a = this.f26045x.size() + this.E;
        j61 j61Var = this.H;
        j61Var.f25186b = -1;
        this.F.add(j61Var);
    }

    @Override
    public final int h() {
        return this.f26045x.size();
    }

    @Override
    public final int j(int i10) {
        x51 G = G(i10);
        if (G == null) {
            return 0;
        }
        return G.f15672a;
    }

    @Override
    public void v(s4.c1 r36, int r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.l61.v(s4.c1, int):void");
    }

    @Override
    public s4.c1 x(ViewGroup viewGroup, int i10) {
        int i11;
        View x5Var;
        View m4Var;
        org.telegram.ui.Cells.w8 w8Var;
        org.telegram.ui.Cells.a2 a2Var;
        int i12;
        int i13;
        float f7;
        float f10;
        int i14;
        int i15;
        org.telegram.ui.Cells.m4 m4Var2;
        int i16;
        boolean z10 = this.f26041n;
        if (z10) {
            i11 = org.telegram.ui.ActionBar.j6.f19133h5;
        } else {
            i11 = org.telegram.ui.ActionBar.j6.f19062d6;
        }
        Context context = this.e;
        if (i10 >= 10000) {
            w51 F = x51.F(i10);
            if (F != null) {
                a2Var = F.createView(this.e, this.d, this.f26040f, this.h, this.v);
            } else {
                a2Var = new View(context);
            }
        } else {
            int i17 = 3;
            boolean z11 = true;
            org.telegram.ui.ActionBar.e6 e6Var = this.v;
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
                    frameLayout.f24858a = 0;
                    a2Var = frameLayout;
                    break;
                case -2:
                    a2Var = new ai.x5(context, 22);
                    break;
                case 0:
                    if (z10) {
                        w8Var = new org.telegram.ui.Cells.m4(this.e, org.telegram.ui.ActionBar.j6.L6, 21, 15, 0, false, false, this.v);
                        a2Var = w8Var;
                        break;
                    } else {
                        a2Var = new org.telegram.ui.Cells.m4(context, e6Var);
                        break;
                    }
                case 1:
                    m4Var = new org.telegram.ui.Cells.m4(this.e, org.telegram.ui.ActionBar.j6.G6, 17, 15, false, this.v);
                    a2Var = m4Var;
                    break;
                case 2:
                    a2Var = new o21(context, e6Var);
                    break;
                case 3:
                    a2Var = new org.telegram.ui.Cells.r8(context, e6Var);
                    break;
                case 4:
                case 9:
                    org.telegram.ui.Cells.w8 w8Var2 = new org.telegram.ui.Cells.w8(context, e6Var);
                    w8Var = w8Var2;
                    if (i10 == 9) {
                        w8Var2.setDrawCheckRipple(true);
                        w8Var2.d(org.telegram.ui.ActionBar.j6.f19116g6, org.telegram.ui.ActionBar.j6.O6, org.telegram.ui.ActionBar.j6.P6, org.telegram.ui.ActionBar.j6.Q6, org.telegram.ui.ActionBar.j6.R6);
                        w8Var2.setTypeface(AndroidUtilities.bold());
                        w8Var2.setHeight(56);
                        w8Var = w8Var2;
                    }
                    a2Var = w8Var;
                    break;
                case 5:
                case 6:
                    if (i10 != 6) {
                        z11 = false;
                    }
                    m4Var = new org.telegram.ui.Cells.j5(21, 60, this.e, this.v, z11);
                    a2Var = m4Var;
                    break;
                case 7:
                case 8:
                default:
                    a2Var = new org.telegram.ui.Cells.e9(context, e6Var);
                    break;
                case 10:
                    ?? frameLayout2 = new FrameLayout(context);
                    TextView textView = new TextView(context);
                    frameLayout2.f21596b = textView;
                    org.telegram.messenger.wh.s(textView, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false), 1, 16.0f, 1);
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
                    frameLayout2.f21597c = textView2;
                    org.telegram.messenger.wh.s(textView2, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.I6, false), 1, 16.0f, 1);
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
                    radioButton.b(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19117g7, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19135h7, false));
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
                    org.telegram.ui.Cells.za zaVar = new org.telegram.ui.Cells.za(context, 6, i17, false);
                    zaVar.setSelfAsSavedMessages(true);
                    a2Var = zaVar;
                    break;
                case 13:
                    m4Var = new org.telegram.ui.Cells.za(6, 0, this.e, null, false, true);
                    a2Var = m4Var;
                    break;
                case 14:
                    a2Var = new fw0(context, e6Var);
                    break;
                case 15:
                    a2Var = new org.telegram.ui.Cells.z7(context, e6Var);
                    break;
                case 16:
                    if (this.L == null) {
                        z11 = false;
                    }
                    a2Var = new hg.x1(context, e6Var, z11);
                    break;
                case 17:
                    a2Var = new hg.v1(context, e6Var);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    if (this.f26046y == null) {
                        this.f26046y = new ig.f(null);
                    }
                    ig.f fVar = this.f26046y;
                    int i19 = this.h;
                    a2Var = new xa1(this.e, this.f26040f, i10 - 18, fVar, i19);
                    break;
                case 24:
                    a2Var = new org.telegram.ui.ie(context, e6Var);
                    break;
                case 25:
                    a2Var = new org.telegram.ui.je(context, e6Var);
                    break;
                case 26:
                    m4Var2 = new org.telegram.ui.Cells.m4(this.e, org.telegram.ui.ActionBar.j6.G6, 23, 20, 0, false, false, this.v);
                    m4Var2.setTextSize(20.0f);
                    a2Var = m4Var2;
                    break;
                case 27:
                    ci.ha haVar = new ci.ha(context, e6Var);
                    haVar.d(false, false);
                    a2Var = haVar;
                    break;
                case 28:
                    x5Var = new View(context);
                    x5Var.setTag(-33024);
                    a2Var = x5Var;
                    break;
                case 29:
                    a2Var = new hg.t(context, e6Var);
                    break;
                case 30:
                    a2Var = new org.telegram.ui.Cells.h9(context, e6Var);
                    break;
                case 31:
                    wl0 wl0Var = this.d;
                    if (wl0Var != null && wl0Var.c1()) {
                        org.telegram.ui.Cells.v3 v3Var = new org.telegram.ui.Cells.v3(context, 28, e6Var);
                        v3Var.setNoBackground(true);
                        a2Var = v3Var;
                        break;
                    } else {
                        a2Var = new org.telegram.ui.Cells.v3(context, e6Var);
                        break;
                    }
                    break;
                case 32:
                    a2Var = new org.telegram.ui.Cells.i6(context, null);
                    break;
                case 33:
                    a2Var = new org.telegram.ui.Cells.s2(context, true);
                    break;
                case 34:
                    t00 t00Var = new t00(context, e6Var);
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
                    a2Var2.getCheckBoxRound().b(org.telegram.ui.ActionBar.j6.V6, org.telegram.ui.ActionBar.j6.f19117g7, org.telegram.ui.ActionBar.j6.f19191k7);
                    a2Var = a2Var2;
                    break;
                case 38:
                    a2Var = new org.telegram.ui.Cells.b2(context, e6Var);
                    break;
                case 39:
                case 40:
                    a2Var = new org.telegram.ui.Cells.v8(context);
                    break;
                case 42:
                    m4Var2 = new org.telegram.ui.Cells.m4(this.e, org.telegram.ui.ActionBar.j6.L6, 21, 15, 0, false, true, this.v);
                    a2Var = m4Var2;
                    break;
                case 43:
                    a2Var = new org.telegram.ui.Cells.ea(context, 0, e6Var);
                    break;
                case 44:
                    a2Var = new org.telegram.ui.Cells.j6(context, false);
                    break;
            }
        }
        if (this.f26042r) {
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
