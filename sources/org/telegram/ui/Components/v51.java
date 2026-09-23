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
import org.telegram.ui.pa1;
public class v51 extends og.b {
    public t51 H;
    public t51 I;
    public int J;
    public boolean K;
    public Utilities.Callback2 L;
    public boolean M;
    public final ml0 d;
    public final Context e;
    public final int f28660f;
    public final int h;
    public final boolean f28661n;
    public Utilities.Callback2 f28663s;
    public final org.telegram.ui.ActionBar.d6 v;
    public ig.f f28666y;
    public boolean f28662r = true;
    public final ArrayList f28664w = new ArrayList();
    public final ArrayList f28665x = new ArrayList();
    public int E = 0;
    public final ArrayList F = new ArrayList();
    public final ArrayList G = new ArrayList();

    public v51(ml0 ml0Var, Context context, int i10, int i11, boolean z10, Utilities.Callback2 callback2, org.telegram.ui.ActionBar.d6 d6Var) {
        this.d = ml0Var;
        this.e = context;
        this.f28660f = i10;
        this.h = i11;
        this.f28661n = z10;
        this.f28663s = callback2;
        this.v = d6Var;
        N(false);
    }

    public static boolean K(int i10) {
        if (i10 >= 10000) {
            g51 F = h51.F(i10);
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
        int i10 = c1Var.f42630f;
        h51 G = G(c1Var.b());
        if (i10 >= 10000) {
            g51 F = h51.F(i10);
            if (F == null || !F.isClickable()) {
                return false;
            }
        } else if (i10 != 3 && i10 != 5 && i10 != 6 && i10 != 30 && i10 != 4 && i10 != 10 && i10 != 44 && i10 != 11 && i10 != 12 && i10 != 17 && i10 != 16 && i10 != 29 && i10 != 25 && i10 != 27 && i10 != 32 && i10 != 33 && i10 != 35 && i10 != 36 && i10 != 37 && i10 != 41 && i10 != 39 && i10 != 40 && i10 != 38) {
            return false;
        }
        if (G != null && !G.f24503g) {
            return false;
        }
        return true;
    }

    public final void F(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.G;
            if (i10 < arrayList.size()) {
                t51 t51Var = (t51) arrayList.get(i10);
                this.L.run(Integer.valueOf(i10), new ArrayList(this.f28665x.subList(t51Var.f28095a, t51Var.f28096b + 1)));
                this.K = false;
            }
        }
    }

    public final h51 G(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f28665x;
            if (i10 < arrayList.size()) {
                return (h51) arrayList.get(i10);
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
                t51 t51Var = (t51) arrayList.get(i11);
                if (i10 >= t51Var.f28095a && i10 <= t51Var.f28096b) {
                    return i11;
                }
                i11++;
            } else {
                return -1;
            }
        }
    }

    public int I(int i10) {
        return org.telegram.ui.ActionBar.h6.v0(i10, this.v);
    }

    public final boolean J(int i10) {
        h51 G = G(i10);
        h51 G2 = G(i10 + 1);
        if (G != null && !G.f24505j && G2 != null && K(G2.f15508a) == K(G.f15508a)) {
            return true;
        }
        return false;
    }

    public final void L() {
        t51 t51Var = this.I;
        if (t51Var != null) {
            t51Var.f28096b = Math.max(0, this.f28665x.size() - 1);
        }
    }

    public final int M() {
        ?? obj = new Object();
        this.I = obj;
        obj.f28095a = this.f28665x.size();
        t51 t51Var = this.I;
        t51Var.f28096b = -1;
        ArrayList arrayList = this.G;
        arrayList.add(t51Var);
        return arrayList.size() - 1;
    }

    public void N(boolean z10) {
        ml0 ml0Var = this.d;
        if (ml0Var != null && ml0Var.b0()) {
            ml0Var.post(new sr0(4, this, z10));
        } else {
            P(z10);
        }
    }

    public final void O(s4.c1 c1Var) {
        int i10;
        View view = c1Var.f42627a;
        if (view instanceof org.telegram.ui.ActionBar.y5) {
            ((org.telegram.ui.ActionBar.y5) view).e();
            int i11 = c1Var.f42630f;
            if (this.f28662r) {
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
                if (this.f28661n) {
                    i10 = org.telegram.ui.ActionBar.h6.f18859h5;
                } else {
                    i10 = org.telegram.ui.ActionBar.h6.f18789d6;
                }
                view.setBackgroundColor(I(i10));
            }
        }
    }

    public final void P(boolean z10) {
        ml0 ml0Var = this.d;
        if (ml0Var == null || !ml0Var.b0()) {
            ArrayList arrayList = this.f28664w;
            arrayList.clear();
            ArrayList arrayList2 = this.f28665x;
            arrayList.addAll(arrayList2);
            arrayList2.clear();
            this.H = null;
            this.F.clear();
            this.G.clear();
            Utilities.Callback2 callback2 = this.f28663s;
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
            View view = c1Var.f42627a;
            int i10 = c1Var.f42630f;
            if (i10 >= 10000) {
                g51 F = h51.F(i10);
                if (F != null) {
                    F.attachedView(this.d, view, G(c1Var.b()));
                }
            } else if (i10 != 16) {
            } else {
                ((hg.y1) view).setReorder(z10);
            }
        }
    }

    public final void R() {
        ml0 ml0Var = this.d;
        if (ml0Var != null) {
            ArrayList arrayList = ml0Var.K2;
            if (arrayList == null) {
                ml0Var.K2 = new ArrayList();
            } else {
                arrayList.clear();
            }
            ArrayList arrayList2 = this.F;
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                t51 t51Var = (t51) obj;
                ml0Var.K2.add(Long.valueOf(AndroidUtilities.pack(t51Var.f28095a, t51Var.f28096b)));
            }
        }
    }

    public final void S() {
        ArrayList arrayList = this.f28664w;
        arrayList.clear();
        ArrayList arrayList2 = this.f28665x;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        this.F.clear();
        this.G.clear();
        Utilities.Callback2 callback2 = this.f28663s;
        if (callback2 != null) {
            callback2.run(arrayList2, this);
        }
        R();
    }

    public final void T() {
        t51 t51Var = this.H;
        if (t51Var != null) {
            t51Var.f28096b = Math.max(0, (this.f28665x.size() + this.E) - 1);
            t51 t51Var2 = this.H;
            if (t51Var2.f28095a == t51Var2.f28096b) {
                this.F.remove(t51Var2);
            }
            this.H = null;
        }
    }

    public final void U() {
        ?? obj = new Object();
        this.H = obj;
        obj.f28095a = this.f28665x.size() + this.E;
        t51 t51Var = this.H;
        t51Var.f28096b = -1;
        this.F.add(t51Var);
    }

    @Override
    public final int h() {
        return this.f28665x.size();
    }

    @Override
    public final int j(int i10) {
        h51 G = G(i10);
        if (G == null) {
            return 0;
        }
        return G.f15508a;
    }

    @Override
    public void v(s4.c1 r36, int r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.v51.v(s4.c1, int):void");
    }

    @Override
    public s4.c1 x(ViewGroup viewGroup, int i10) {
        int i11;
        View w5Var;
        View m4Var;
        org.telegram.ui.Cells.x8 x8Var;
        org.telegram.ui.Cells.z1 z1Var;
        int i12;
        int i13;
        float f7;
        float f10;
        int i14;
        int i15;
        org.telegram.ui.Cells.m4 m4Var2;
        int i16;
        boolean z10 = this.f28661n;
        if (z10) {
            i11 = org.telegram.ui.ActionBar.h6.f18859h5;
        } else {
            i11 = org.telegram.ui.ActionBar.h6.f18789d6;
        }
        Context context = this.e;
        if (i10 >= 10000) {
            g51 F = h51.F(i10);
            if (F != null) {
                z1Var = F.createView(this.e, this.d, this.f28660f, this.h, this.v);
            } else {
                z1Var = new View(context);
            }
        } else {
            int i17 = 3;
            boolean z11 = true;
            org.telegram.ui.ActionBar.d6 d6Var = this.v;
            switch (i10) {
                case -4:
                case -1:
                    w5Var = new ai.w5(context, 21);
                    if (i10 == -4) {
                        w5Var.setTag(-33024);
                    }
                    z1Var = w5Var;
                    break;
                case -3:
                    ?? frameLayout = new FrameLayout(context);
                    frameLayout.f27832a = 0;
                    z1Var = frameLayout;
                    break;
                case -2:
                    z1Var = new ai.w5(context, 22);
                    break;
                case 0:
                    if (z10) {
                        x8Var = new org.telegram.ui.Cells.m4(this.e, org.telegram.ui.ActionBar.h6.L6, 21, 15, 0, false, false, this.v);
                        z1Var = x8Var;
                        break;
                    } else {
                        z1Var = new org.telegram.ui.Cells.m4(context, d6Var);
                        break;
                    }
                case 1:
                    m4Var = new org.telegram.ui.Cells.m4(this.e, org.telegram.ui.ActionBar.h6.G6, 17, 15, false, this.v);
                    z1Var = m4Var;
                    break;
                case 2:
                    z1Var = new y11(context, d6Var);
                    break;
                case 3:
                    z1Var = new org.telegram.ui.Cells.s8(context, d6Var);
                    break;
                case 4:
                case 9:
                    org.telegram.ui.Cells.x8 x8Var2 = new org.telegram.ui.Cells.x8(context, d6Var);
                    x8Var = x8Var2;
                    if (i10 == 9) {
                        x8Var2.setDrawCheckRipple(true);
                        x8Var2.d(org.telegram.ui.ActionBar.h6.f18843g6, org.telegram.ui.ActionBar.h6.O6, org.telegram.ui.ActionBar.h6.P6, org.telegram.ui.ActionBar.h6.Q6, org.telegram.ui.ActionBar.h6.R6);
                        x8Var2.setTypeface(AndroidUtilities.bold());
                        x8Var2.setHeight(56);
                        x8Var = x8Var2;
                    }
                    z1Var = x8Var;
                    break;
                case 5:
                case 6:
                    if (i10 != 6) {
                        z11 = false;
                    }
                    m4Var = new org.telegram.ui.Cells.j5(21, 60, this.e, this.v, z11);
                    z1Var = m4Var;
                    break;
                case 7:
                case 8:
                default:
                    z1Var = new org.telegram.ui.Cells.f9(context, d6Var);
                    break;
                case 10:
                    ?? frameLayout2 = new FrameLayout(context);
                    TextView textView = new TextView(context);
                    frameLayout2.f21316b = textView;
                    org.telegram.messenger.ul.s(textView, org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.G6, false), 1, 16.0f, 1);
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
                    frameLayout2.addView(textView, w7.x5.d(-1, -1.0f, i18, f7, 0.0f, f10, 0.0f));
                    TextView textView2 = new TextView(context);
                    frameLayout2.f21317c = textView2;
                    org.telegram.messenger.ul.s(textView2, org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.I6, false), 1, 16.0f, 1);
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
                    frameLayout2.addView(textView2, w7.x5.d(-2, -1.0f, i15 | 48, 23.0f, 0.0f, 23.0f, 0.0f));
                    RadioButton radioButton = new RadioButton(context);
                    frameLayout2.d = radioButton;
                    radioButton.setSize(AndroidUtilities.dp(20.0f));
                    radioButton.b(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18844g7, false), org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18861h7, false));
                    if (!LocaleController.isRTL) {
                        i17 = 5;
                    }
                    frameLayout2.addView(radioButton, w7.x5.d(22, 22.0f, i17 | 48, 20.0f, 15.0f, 20.0f, 0.0f));
                    frameLayout2.b();
                    z1Var = frameLayout2;
                    break;
                case 11:
                case 12:
                    if (i10 != 12) {
                        i17 = 0;
                    }
                    org.telegram.ui.Cells.bb bbVar = new org.telegram.ui.Cells.bb(context, 6, i17, false);
                    bbVar.setSelfAsSavedMessages(true);
                    z1Var = bbVar;
                    break;
                case 13:
                    m4Var = new org.telegram.ui.Cells.bb(6, 0, this.e, null, false, true);
                    z1Var = m4Var;
                    break;
                case 14:
                    z1Var = new tv0(context, d6Var);
                    break;
                case 15:
                    z1Var = new org.telegram.ui.Cells.a8(context, d6Var);
                    break;
                case 16:
                    if (this.L == null) {
                        z11 = false;
                    }
                    z1Var = new hg.y1(context, d6Var, z11);
                    break;
                case 17:
                    z1Var = new hg.w1(context, d6Var);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    if (this.f28666y == null) {
                        this.f28666y = new ig.f(null);
                    }
                    ig.f fVar = this.f28666y;
                    int i19 = this.h;
                    z1Var = new pa1(this.e, this.f28660f, i10 - 18, fVar, i19);
                    break;
                case 24:
                    z1Var = new org.telegram.ui.he(context, d6Var);
                    break;
                case 25:
                    z1Var = new org.telegram.ui.ie(context, d6Var);
                    break;
                case 26:
                    m4Var2 = new org.telegram.ui.Cells.m4(this.e, org.telegram.ui.ActionBar.h6.G6, 23, 20, 0, false, false, this.v);
                    m4Var2.setTextSize(20.0f);
                    z1Var = m4Var2;
                    break;
                case 27:
                    ci.ea eaVar = new ci.ea(context, d6Var);
                    eaVar.d(false, false);
                    z1Var = eaVar;
                    break;
                case 28:
                    w5Var = new View(context);
                    w5Var.setTag(-33024);
                    z1Var = w5Var;
                    break;
                case 29:
                    z1Var = new hg.v(context, d6Var);
                    break;
                case 30:
                    z1Var = new org.telegram.ui.Cells.i9(context, d6Var);
                    break;
                case 31:
                    ml0 ml0Var = this.d;
                    if (ml0Var != null && ml0Var.b1()) {
                        org.telegram.ui.Cells.v3 v3Var = new org.telegram.ui.Cells.v3(context, 28, d6Var);
                        v3Var.setNoBackground(true);
                        z1Var = v3Var;
                        break;
                    } else {
                        z1Var = new org.telegram.ui.Cells.v3(context, d6Var);
                        break;
                    }
                    break;
                case 32:
                    z1Var = new org.telegram.ui.Cells.i6(context, null);
                    break;
                case 33:
                    z1Var = new org.telegram.ui.Cells.r2(context, true);
                    break;
                case 34:
                    u00 u00Var = new u00(context, d6Var);
                    u00Var.setIsSingleCell(true);
                    z1Var = u00Var;
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
                    org.telegram.ui.Cells.z1 z1Var2 = new org.telegram.ui.Cells.z1(i16, 21, this.e, this.v, true);
                    z1Var2.getCheckBoxRound().b(org.telegram.ui.ActionBar.h6.V6, org.telegram.ui.ActionBar.h6.f18844g7, org.telegram.ui.ActionBar.h6.f18917k7);
                    z1Var = z1Var2;
                    break;
                case 38:
                    z1Var = new org.telegram.ui.Cells.a2(context, d6Var);
                    break;
                case 39:
                case 40:
                    z1Var = new org.telegram.ui.Cells.w8(context);
                    break;
                case 42:
                    m4Var2 = new org.telegram.ui.Cells.m4(this.e, org.telegram.ui.ActionBar.h6.L6, 21, 15, 0, false, true, this.v);
                    z1Var = m4Var2;
                    break;
                case 43:
                    z1Var = new org.telegram.ui.Cells.fa(context, 0, d6Var);
                    break;
                case 44:
                    z1Var = new org.telegram.ui.Cells.j6(context, false);
                    break;
            }
        }
        if (this.f28662r) {
            if (i10 < 10000) {
                switch (i10) {
                }
            }
            z1Var.setBackgroundColor(I(i11));
        }
        return new s4.c1(z1Var);
    }

    @Override
    public void y(s4.c1 c1Var) {
        Q(c1Var, this.M);
        O(c1Var);
    }
}
