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
public class u61 extends pg.b {
    public s61 H;
    public s61 I;
    public int J;
    public boolean K;
    public Utilities.Callback2 L;
    public boolean M;
    public final jm0 d;
    public final Context e;
    public final int f30863f;
    public final int h;
    public final boolean f30864n;
    public Utilities.Callback2 f30866s;
    public final org.telegram.ui.ActionBar.d6 v;
    public jg.f f30869y;
    public boolean f30865r = true;
    public final ArrayList f30867w = new ArrayList();
    public final ArrayList f30868x = new ArrayList();
    public int E = 0;
    public final ArrayList F = new ArrayList();
    public final ArrayList G = new ArrayList();

    public u61(jm0 jm0Var, Context context, int i10, int i11, boolean z10, Utilities.Callback2 callback2, org.telegram.ui.ActionBar.d6 d6Var) {
        this.d = jm0Var;
        this.e = context;
        this.f30863f = i10;
        this.h = i11;
        this.f30864n = z10;
        this.f30866s = callback2;
        this.v = d6Var;
        N(false);
    }

    public static boolean K(int i10) {
        if (i10 >= 10000) {
            g61 F = h61.F(i10);
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
    public boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f45924f;
        h61 G = G(b1Var.b());
        if (i10 >= 10000) {
            g61 F = h61.F(i10);
            if (F == null || !F.isClickable()) {
                return false;
            }
        } else if (i10 != 3 && i10 != 5 && i10 != 6 && i10 != 30 && i10 != 4 && i10 != 10 && i10 != 44 && i10 != 11 && i10 != 12 && i10 != 17 && i10 != 16 && i10 != 29 && i10 != 25 && i10 != 27 && i10 != 32 && i10 != 33 && i10 != 35 && i10 != 36 && i10 != 37 && i10 != 41 && i10 != 39 && i10 != 40 && i10 != 38) {
            return false;
        }
        if (G != null && !G.f26782g) {
            return false;
        }
        return true;
    }

    public final void F(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.G;
            if (i10 < arrayList.size()) {
                s61 s61Var = (s61) arrayList.get(i10);
                this.L.run(Integer.valueOf(i10), new ArrayList(this.f30868x.subList(s61Var.f30210a, s61Var.f30211b + 1)));
                this.K = false;
            }
        }
    }

    public final h61 G(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f30868x;
            if (i10 < arrayList.size()) {
                return (h61) arrayList.get(i10);
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
                s61 s61Var = (s61) arrayList.get(i11);
                if (i10 >= s61Var.f30210a && i10 <= s61Var.f30211b) {
                    return i11;
                }
                i11++;
            } else {
                return -1;
            }
        }
    }

    public int I(int i10) {
        return org.telegram.ui.ActionBar.h6.w0(i10, this.v);
    }

    public final boolean J(int i10) {
        h61 G = G(i10);
        h61 G2 = G(i10 + 1);
        if (G != null && !G.f26784j && G2 != null && K(G2.f44300a) == K(G.f44300a)) {
            return true;
        }
        return false;
    }

    public final void L() {
        s61 s61Var = this.I;
        if (s61Var != null) {
            s61Var.f30211b = Math.max(0, this.f30868x.size() - 1);
        }
    }

    public final int M() {
        ?? obj = new Object();
        this.I = obj;
        obj.f30210a = this.f30868x.size();
        s61 s61Var = this.I;
        s61Var.f30211b = -1;
        ArrayList arrayList = this.G;
        arrayList.add(s61Var);
        return arrayList.size() - 1;
    }

    public void N(boolean z10) {
        jm0 jm0Var = this.d;
        if (jm0Var != null && jm0Var.b0()) {
            jm0Var.post(new b60(9, this, z10));
        } else {
            P(z10);
        }
    }

    public final void O(s4.b1 b1Var) {
        int i10;
        View view = b1Var.f45921a;
        if (view instanceof org.telegram.ui.ActionBar.y5) {
            ((org.telegram.ui.ActionBar.y5) view).d();
            int i11 = b1Var.f45924f;
            if (this.f30865r) {
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
                if (this.f30864n) {
                    i10 = org.telegram.ui.ActionBar.h6.f21065h5;
                } else {
                    i10 = org.telegram.ui.ActionBar.h6.f20994d6;
                }
                view.setBackgroundColor(I(i10));
            }
        }
    }

    public final void P(boolean z10) {
        jm0 jm0Var = this.d;
        if (jm0Var == null || !jm0Var.b0()) {
            ArrayList arrayList = this.f30867w;
            arrayList.clear();
            ArrayList arrayList2 = this.f30868x;
            arrayList.addAll(arrayList2);
            arrayList2.clear();
            this.H = null;
            this.F.clear();
            this.G.clear();
            Utilities.Callback2 callback2 = this.f30866s;
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

    public final void Q(s4.b1 b1Var, boolean z10) {
        if (b1Var != null) {
            View view = b1Var.f45921a;
            int i10 = b1Var.f45924f;
            if (i10 >= 10000) {
                g61 F = h61.F(i10);
                if (F != null) {
                    F.attachedView(this.d, view, G(b1Var.b()));
                }
            } else if (i10 != 16) {
            } else {
                ((ig.w1) view).setReorder(z10);
            }
        }
    }

    public final void R() {
        jm0 jm0Var = this.d;
        if (jm0Var != null) {
            ArrayList arrayList = jm0Var.I2;
            if (arrayList == null) {
                jm0Var.I2 = new ArrayList();
            } else {
                arrayList.clear();
            }
            ArrayList arrayList2 = this.F;
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                s61 s61Var = (s61) obj;
                jm0Var.I2.add(Long.valueOf(AndroidUtilities.pack(s61Var.f30210a, s61Var.f30211b)));
            }
        }
    }

    public final void S() {
        ArrayList arrayList = this.f30867w;
        arrayList.clear();
        ArrayList arrayList2 = this.f30868x;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        this.F.clear();
        this.G.clear();
        Utilities.Callback2 callback2 = this.f30866s;
        if (callback2 != null) {
            callback2.run(arrayList2, this);
        }
        R();
    }

    public final void T() {
        s61 s61Var = this.H;
        if (s61Var != null) {
            s61Var.f30211b = Math.max(0, (this.f30868x.size() + this.E) - 1);
            s61 s61Var2 = this.H;
            if (s61Var2.f30210a == s61Var2.f30211b) {
                this.F.remove(s61Var2);
            }
            this.H = null;
        }
    }

    public final void U() {
        ?? obj = new Object();
        this.H = obj;
        obj.f30210a = this.f30868x.size() + this.E;
        s61 s61Var = this.H;
        s61Var.f30211b = -1;
        this.F.add(s61Var);
    }

    @Override
    public final int h() {
        return this.f30868x.size();
    }

    @Override
    public final int j(int i10) {
        h61 G = G(i10);
        if (G == null) {
            return 0;
        }
        return G.f44300a;
    }

    @Override
    public void v(s4.b1 r36, int r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.u61.v(s4.b1, int):void");
    }

    @Override
    public s4.b1 x(ViewGroup viewGroup, int i10) {
        int i11;
        View i4Var;
        View l4Var;
        org.telegram.ui.Cells.v8 v8Var;
        org.telegram.ui.Cells.a2 a2Var;
        int i12;
        int i13;
        float f7;
        float f10;
        int i14;
        int i15;
        org.telegram.ui.Cells.l4 l4Var2;
        int i16;
        boolean z10 = this.f30864n;
        if (z10) {
            i11 = org.telegram.ui.ActionBar.h6.f21065h5;
        } else {
            i11 = org.telegram.ui.ActionBar.h6.f20994d6;
        }
        Context context = this.e;
        if (i10 >= 10000) {
            g61 F = h61.F(i10);
            if (F != null) {
                a2Var = F.createView(this.e, this.d, this.f30863f, this.h, this.v);
            } else {
                a2Var = new View(context);
            }
        } else {
            int i17 = 3;
            int i18 = 8;
            boolean z11 = true;
            org.telegram.ui.ActionBar.d6 d6Var = this.v;
            switch (i10) {
                case -4:
                case -1:
                    i4Var = new ci.i4(context, 21);
                    if (i10 == -4) {
                        i4Var.setTag(-33024);
                    }
                    a2Var = i4Var;
                    break;
                case -3:
                    ?? frameLayout = new FrameLayout(context);
                    frameLayout.f29857a = 0;
                    a2Var = frameLayout;
                    break;
                case -2:
                    a2Var = new ci.i4(context, 22);
                    break;
                case 0:
                    if (z10) {
                        v8Var = new org.telegram.ui.Cells.l4(this.e, org.telegram.ui.ActionBar.h6.L6, 21, 15, 0, false, false, this.v);
                        a2Var = v8Var;
                        break;
                    } else {
                        a2Var = new org.telegram.ui.Cells.l4(context, d6Var);
                        break;
                    }
                case 1:
                    l4Var = new org.telegram.ui.Cells.l4(this.e, org.telegram.ui.ActionBar.h6.G6, 17, 15, false, this.v);
                    a2Var = l4Var;
                    break;
                case 2:
                    a2Var = new w21(context, d6Var);
                    break;
                case 3:
                    a2Var = new org.telegram.ui.Cells.q8(context, d6Var);
                    break;
                case 4:
                case 9:
                    org.telegram.ui.Cells.v8 v8Var2 = new org.telegram.ui.Cells.v8(context, d6Var);
                    v8Var = v8Var2;
                    if (i10 == 9) {
                        v8Var2.setDrawCheckRipple(true);
                        v8Var2.d(org.telegram.ui.ActionBar.h6.f21047g6, org.telegram.ui.ActionBar.h6.O6, org.telegram.ui.ActionBar.h6.P6, org.telegram.ui.ActionBar.h6.Q6, org.telegram.ui.ActionBar.h6.R6);
                        v8Var2.setTypeface(AndroidUtilities.bold());
                        v8Var2.setHeight(56);
                        v8Var = v8Var2;
                    }
                    a2Var = v8Var;
                    break;
                case 5:
                case 6:
                    if (i10 != 6) {
                        z11 = false;
                    }
                    l4Var = new org.telegram.ui.Cells.i5(21, 60, this.e, this.v, z11);
                    a2Var = l4Var;
                    break;
                case 7:
                case 8:
                default:
                    a2Var = new org.telegram.ui.Cells.d9(context, d6Var);
                    break;
                case 10:
                    ?? frameLayout2 = new FrameLayout(context);
                    TextView textView = new TextView(context);
                    frameLayout2.f23179b = textView;
                    org.telegram.messenger.nk.u(textView, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.G6, false), 1, 16.0f, 1);
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
                    int i19 = i13 | 48;
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
                    frameLayout2.addView(textView, w7.z5.d(-1, -1.0f, i19, f7, 0.0f, f10, 0.0f));
                    TextView textView2 = new TextView(context);
                    frameLayout2.f23180c = textView2;
                    org.telegram.messenger.nk.u(textView2, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.I6, false), 1, 16.0f, 1);
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
                    frameLayout2.addView(textView2, w7.z5.d(-2, -1.0f, i15 | 48, 23.0f, 0.0f, 23.0f, 0.0f));
                    RadioButton radioButton = new RadioButton(context);
                    frameLayout2.d = radioButton;
                    radioButton.setSize(AndroidUtilities.dp(20.0f));
                    radioButton.b(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21048g7, false), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21067h7, false));
                    if (!LocaleController.isRTL) {
                        i17 = 5;
                    }
                    frameLayout2.addView(radioButton, w7.z5.d(22, 22.0f, i17 | 48, 20.0f, 15.0f, 20.0f, 0.0f));
                    frameLayout2.b();
                    a2Var = frameLayout2;
                    break;
                case 11:
                case 12:
                    if (i10 != 12) {
                        i17 = 0;
                    }
                    org.telegram.ui.Cells.va vaVar = new org.telegram.ui.Cells.va(context, 6, i17, false);
                    vaVar.setSelfAsSavedMessages(true);
                    a2Var = vaVar;
                    break;
                case 13:
                    l4Var = new org.telegram.ui.Cells.va(6, 0, this.e, null, false, true);
                    a2Var = l4Var;
                    break;
                case 14:
                    a2Var = new pw0(context, d6Var);
                    break;
                case 15:
                    a2Var = new org.telegram.ui.Cells.y7(context, d6Var);
                    break;
                case 16:
                    if (this.L == null) {
                        z11 = false;
                    }
                    a2Var = new ig.w1(context, d6Var, z11);
                    break;
                case 17:
                    a2Var = new ig.u1(context, d6Var);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    if (this.f30869y == null) {
                        this.f30869y = new jg.f(null);
                    }
                    a2Var = new org.telegram.ui.n91(this.e, this.f30863f, i10 - 18, this.f30869y, this.h);
                    break;
                case 24:
                    a2Var = new org.telegram.ui.ge(context, d6Var);
                    break;
                case 25:
                    a2Var = new org.telegram.ui.he(context, d6Var);
                    break;
                case 26:
                    l4Var2 = new org.telegram.ui.Cells.l4(this.e, org.telegram.ui.ActionBar.h6.G6, 23, 20, 0, false, false, this.v);
                    l4Var2.setTextSize(20.0f);
                    a2Var = l4Var2;
                    break;
                case 27:
                    ei.q9 q9Var = new ei.q9(context, d6Var);
                    q9Var.d(false, false);
                    a2Var = q9Var;
                    break;
                case 28:
                    i4Var = new View(context);
                    i4Var.setTag(-33024);
                    a2Var = i4Var;
                    break;
                case 29:
                    a2Var = new ig.t(context, d6Var);
                    break;
                case 30:
                    a2Var = new org.telegram.ui.Cells.g9(context, d6Var);
                    break;
                case 31:
                    jm0 jm0Var = this.d;
                    if (jm0Var != null && jm0Var.b1()) {
                        org.telegram.ui.Cells.u3 u3Var = new org.telegram.ui.Cells.u3(context, 28, d6Var);
                        u3Var.setNoBackground(true);
                        a2Var = u3Var;
                        break;
                    } else {
                        a2Var = new org.telegram.ui.Cells.u3(context, d6Var);
                        break;
                    }
                    break;
                case 32:
                    a2Var = new org.telegram.ui.Cells.h6(context, null);
                    break;
                case 33:
                    a2Var = new org.telegram.ui.Cells.r2(context, true);
                    break;
                case 34:
                    b10 b10Var = new b10(context, d6Var);
                    b10Var.setIsSingleCell(true);
                    a2Var = b10Var;
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
                        org.telegram.ui.Cells.a2 a2Var2 = new org.telegram.ui.Cells.a2(i16, 21, this.e, this.v, true);
                        a2Var2.getCheckBoxRound().b(org.telegram.ui.ActionBar.h6.V6, org.telegram.ui.ActionBar.h6.f21048g7, org.telegram.ui.ActionBar.h6.f21122k7);
                        a2Var = a2Var2;
                        break;
                    }
                    i16 = i18;
                    org.telegram.ui.Cells.a2 a2Var22 = new org.telegram.ui.Cells.a2(i16, 21, this.e, this.v, true);
                    a2Var22.getCheckBoxRound().b(org.telegram.ui.ActionBar.h6.V6, org.telegram.ui.ActionBar.h6.f21048g7, org.telegram.ui.ActionBar.h6.f21122k7);
                    a2Var = a2Var22;
                case 38:
                    a2Var = new org.telegram.ui.Cells.b2(context, d6Var);
                    break;
                case 39:
                case 40:
                    a2Var = new org.telegram.ui.Cells.u8(context);
                    break;
                case 42:
                    l4Var2 = new org.telegram.ui.Cells.l4(this.e, org.telegram.ui.ActionBar.h6.L6, 21, 15, 0, false, true, this.v);
                    a2Var = l4Var2;
                    break;
                case 43:
                    a2Var = new org.telegram.ui.Cells.ba(context, 0, d6Var);
                    break;
                case 44:
                    a2Var = new org.telegram.ui.Cells.i6(context, false);
                    break;
            }
        }
        if (this.f30865r) {
            if (i10 < 10000) {
                switch (i10) {
                }
            }
            a2Var.setBackgroundColor(I(i11));
        }
        return new s4.b1(a2Var);
    }

    @Override
    public void y(s4.b1 b1Var) {
        Q(b1Var, this.M);
        O(b1Var);
    }
}
