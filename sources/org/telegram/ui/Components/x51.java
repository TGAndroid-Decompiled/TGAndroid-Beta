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
import org.telegram.ui.fa1;
public class x51 extends cg.c {
    public v51 E;
    public v51 F;
    public int G;
    public boolean H;
    public Utilities.Callback2 I;
    public boolean J;
    public final tl0 d;
    public final Context f32954e;
    public final int f32955f;
    public final int h;
    public final boolean f32956n;
    public Utilities.Callback2 f32958s;
    public final org.telegram.ui.ActionBar.g6 v;
    public wf.f f32961y;
    public boolean f32957r = true;
    public final ArrayList f32959w = new ArrayList();
    public final ArrayList f32960x = new ArrayList();
    public int B = 0;
    public final ArrayList C = new ArrayList();
    public final ArrayList D = new ArrayList();

    public x51(tl0 tl0Var, Context context, int i10, int i11, boolean z4, Utilities.Callback2 callback2, org.telegram.ui.ActionBar.g6 g6Var) {
        this.d = tl0Var;
        this.f32954e = context;
        this.f32955f = i10;
        this.h = i11;
        this.f32956n = z4;
        this.f32958s = callback2;
        this.v = g6Var;
        N(false);
    }

    public static boolean K(int i10) {
        if (i10 >= 10000) {
            i51 F = j51.F(i10);
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
    public boolean D(f2.m1 m1Var) {
        int i10 = m1Var.f5879f;
        j51 G = G(m1Var.b());
        if (i10 >= 10000) {
            i51 F = j51.F(i10);
            if (F == null || !F.isClickable()) {
                return false;
            }
        } else if (i10 != 3 && i10 != 5 && i10 != 6 && i10 != 30 && i10 != 4 && i10 != 10 && i10 != 44 && i10 != 11 && i10 != 12 && i10 != 17 && i10 != 16 && i10 != 29 && i10 != 25 && i10 != 27 && i10 != 32 && i10 != 33 && i10 != 35 && i10 != 36 && i10 != 37 && i10 != 41 && i10 != 39 && i10 != 40 && i10 != 38) {
            return false;
        }
        if (G != null && !G.f28010g) {
            return false;
        }
        return true;
    }

    public final void F(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.D;
            if (i10 < arrayList.size()) {
                v51 v51Var = (v51) arrayList.get(i10);
                this.I.run(Integer.valueOf(i10), new ArrayList(this.f32960x.subList(v51Var.f31812a, v51Var.f31813b + 1)));
                this.H = false;
            }
        }
    }

    public final j51 G(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f32960x;
            if (i10 < arrayList.size()) {
                return (j51) arrayList.get(i10);
            }
            return null;
        }
        return null;
    }

    public final int H(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.D;
            if (i11 < arrayList.size()) {
                v51 v51Var = (v51) arrayList.get(i11);
                if (i10 >= v51Var.f31812a && i10 <= v51Var.f31813b) {
                    return i11;
                }
                i11++;
            } else {
                return -1;
            }
        }
    }

    public int I(int i10) {
        return org.telegram.ui.ActionBar.k6.v0(i10, this.v);
    }

    public final boolean J(int i10) {
        j51 G = G(i10);
        j51 G2 = G(i10 + 1);
        if (G != null && !G.f28012j && G2 != null && K(G2.f2505a) == K(G.f2505a)) {
            return true;
        }
        return false;
    }

    public final void L() {
        v51 v51Var = this.F;
        if (v51Var != null) {
            v51Var.f31813b = Math.max(0, this.f32960x.size() - 1);
        }
    }

    public final int M() {
        ?? obj = new Object();
        this.F = obj;
        obj.f31812a = this.f32960x.size();
        v51 v51Var = this.F;
        v51Var.f31813b = -1;
        ArrayList arrayList = this.D;
        arrayList.add(v51Var);
        return arrayList.size() - 1;
    }

    public void N(boolean z4) {
        tl0 tl0Var = this.d;
        if (tl0Var != null && tl0Var.b0()) {
            tl0Var.post(new rv0(2, this, z4));
        } else {
            P(z4);
        }
    }

    public final void O(f2.m1 m1Var) {
        int i10;
        View view = m1Var.f5875a;
        if (view instanceof org.telegram.ui.ActionBar.b6) {
            ((org.telegram.ui.ActionBar.b6) view).e();
            int i11 = m1Var.f5879f;
            if (this.f32957r) {
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
                if (this.f32956n) {
                    i10 = org.telegram.ui.ActionBar.k6.f21731h5;
                } else {
                    i10 = org.telegram.ui.ActionBar.k6.f21659d6;
                }
                view.setBackgroundColor(I(i10));
            }
        }
    }

    public final void P(boolean z4) {
        tl0 tl0Var = this.d;
        if (tl0Var == null || !tl0Var.b0()) {
            ArrayList arrayList = this.f32959w;
            arrayList.clear();
            ArrayList arrayList2 = this.f32960x;
            arrayList.addAll(arrayList2);
            arrayList2.clear();
            this.E = null;
            this.C.clear();
            this.D.clear();
            Utilities.Callback2 callback2 = this.f32958s;
            if (callback2 != null) {
                callback2.run(arrayList2, this);
                R();
                if (z4) {
                    E(arrayList, arrayList2);
                } else {
                    l();
                }
            }
        }
    }

    public final void Q(f2.m1 m1Var, boolean z4) {
        if (m1Var != null) {
            View view = m1Var.f5875a;
            int i10 = m1Var.f5879f;
            if (i10 >= 10000) {
                i51 F = j51.F(i10);
                if (F != null) {
                    F.attachedView(this.d, view, G(m1Var.b()));
                }
            } else if (i10 != 16) {
            } else {
                ((vf.l1) view).setReorder(z4);
            }
        }
    }

    public final void R() {
        tl0 tl0Var = this.d;
        if (tl0Var != null) {
            ArrayList arrayList = tl0Var.H2;
            if (arrayList == null) {
                tl0Var.H2 = new ArrayList();
            } else {
                arrayList.clear();
            }
            ArrayList arrayList2 = this.C;
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                v51 v51Var = (v51) obj;
                tl0Var.H2.add(Long.valueOf(AndroidUtilities.pack(v51Var.f31812a, v51Var.f31813b)));
            }
        }
    }

    public final void S() {
        ArrayList arrayList = this.f32959w;
        arrayList.clear();
        ArrayList arrayList2 = this.f32960x;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        this.C.clear();
        this.D.clear();
        Utilities.Callback2 callback2 = this.f32958s;
        if (callback2 != null) {
            callback2.run(arrayList2, this);
        }
        R();
    }

    public final void T() {
        v51 v51Var = this.E;
        if (v51Var != null) {
            v51Var.f31813b = Math.max(0, (this.f32960x.size() + this.B) - 1);
            v51 v51Var2 = this.E;
            if (v51Var2.f31812a == v51Var2.f31813b) {
                this.C.remove(v51Var2);
            }
            this.E = null;
        }
    }

    public final void U() {
        ?? obj = new Object();
        this.E = obj;
        obj.f31812a = this.f32960x.size() + this.B;
        v51 v51Var = this.E;
        v51Var.f31813b = -1;
        this.C.add(v51Var);
    }

    @Override
    public final int h() {
        return this.f32960x.size();
    }

    @Override
    public final int j(int i10) {
        j51 G = G(i10);
        if (G == null) {
            return 0;
        }
        return G.f2505a;
    }

    @Override
    public void v(f2.m1 r36, int r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.x51.v(f2.m1, int):void");
    }

    @Override
    public f2.m1 x(ViewGroup viewGroup, int i10) {
        int i11;
        View dVar;
        View m4Var;
        org.telegram.ui.Cells.s8 s8Var;
        org.telegram.ui.Cells.z1 z1Var;
        int i12;
        int i13;
        float f10;
        float f11;
        int i14;
        int i15;
        org.telegram.ui.Cells.m4 m4Var2;
        int i16;
        boolean z4 = this.f32956n;
        if (z4) {
            i11 = org.telegram.ui.ActionBar.k6.f21731h5;
        } else {
            i11 = org.telegram.ui.ActionBar.k6.f21659d6;
        }
        Context context = this.f32954e;
        if (i10 >= 10000) {
            i51 F = j51.F(i10);
            if (F != null) {
                z1Var = F.createView(this.f32954e, this.d, this.f32955f, this.h, this.v);
            } else {
                z1Var = new View(context);
            }
        } else {
            int i17 = 3;
            boolean z10 = true;
            org.telegram.ui.ActionBar.g6 g6Var = this.v;
            switch (i10) {
                case -4:
                case -1:
                    dVar = new eh.d(context, 21);
                    if (i10 == -4) {
                        dVar.setTag(-33024);
                    }
                    z1Var = dVar;
                    break;
                case -3:
                    ?? frameLayout = new FrameLayout(context);
                    frameLayout.f31553a = 0;
                    z1Var = frameLayout;
                    break;
                case -2:
                    z1Var = new eh.d(context, 22);
                    break;
                case 0:
                    if (z4) {
                        s8Var = new org.telegram.ui.Cells.m4(this.f32954e, org.telegram.ui.ActionBar.k6.L6, 21, 15, 0, false, false, this.v);
                        z1Var = s8Var;
                        break;
                    } else {
                        z1Var = new org.telegram.ui.Cells.m4(context, g6Var);
                        break;
                    }
                case 1:
                    m4Var = new org.telegram.ui.Cells.m4(this.f32954e, org.telegram.ui.ActionBar.k6.G6, 17, 15, false, this.v);
                    z1Var = m4Var;
                    break;
                case 2:
                    z1Var = new c21(context, g6Var);
                    break;
                case 3:
                    z1Var = new org.telegram.ui.Cells.o8(context, g6Var);
                    break;
                case 4:
                case 9:
                    org.telegram.ui.Cells.s8 s8Var2 = new org.telegram.ui.Cells.s8(context, g6Var);
                    s8Var = s8Var2;
                    if (i10 == 9) {
                        s8Var2.setDrawCheckRipple(true);
                        s8Var2.d(org.telegram.ui.ActionBar.k6.f21714g6, org.telegram.ui.ActionBar.k6.O6, org.telegram.ui.ActionBar.k6.P6, org.telegram.ui.ActionBar.k6.Q6, org.telegram.ui.ActionBar.k6.R6);
                        s8Var2.setTypeface(AndroidUtilities.bold());
                        s8Var2.setHeight(56);
                        s8Var = s8Var2;
                    }
                    z1Var = s8Var;
                    break;
                case 5:
                case 6:
                    if (i10 != 6) {
                        z10 = false;
                    }
                    m4Var = new org.telegram.ui.Cells.j5(21, 60, this.f32954e, this.v, z10);
                    z1Var = m4Var;
                    break;
                case 7:
                case 8:
                default:
                    z1Var = new org.telegram.ui.Cells.a9(context, g6Var);
                    break;
                case 10:
                    ?? frameLayout2 = new FrameLayout(context);
                    TextView textView = new TextView(context);
                    frameLayout2.f24141b = textView;
                    org.telegram.ui.b.q(textView, org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.G6, false), 1, 16.0f, 1);
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
                    boolean z11 = LocaleController.isRTL;
                    if (z11) {
                        i13 = 5;
                    } else {
                        i13 = 3;
                    }
                    int i18 = i13 | 48;
                    if (z11) {
                        f10 = 61.0f;
                    } else {
                        f10 = 23.0f;
                    }
                    if (z11) {
                        f11 = 23.0f;
                    } else {
                        f11 = 61.0f;
                    }
                    frameLayout2.addView(textView, k7.c6.d(-1, -1.0f, i18, f10, 0.0f, f11, 0.0f));
                    TextView textView2 = new TextView(context);
                    frameLayout2.f24142c = textView2;
                    org.telegram.ui.b.q(textView2, org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.I6, false), 1, 16.0f, 1);
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
                    frameLayout2.addView(textView2, k7.c6.d(-2, -1.0f, i15 | 48, 23.0f, 0.0f, 23.0f, 0.0f));
                    RadioButton radioButton = new RadioButton(context);
                    frameLayout2.d = radioButton;
                    radioButton.setSize(AndroidUtilities.dp(20.0f));
                    radioButton.b(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21715g7, false), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21733h7, false));
                    if (!LocaleController.isRTL) {
                        i17 = 5;
                    }
                    frameLayout2.addView(radioButton, k7.c6.d(22, 22.0f, i17 | 48, 20.0f, 15.0f, 20.0f, 0.0f));
                    frameLayout2.b();
                    z1Var = frameLayout2;
                    break;
                case 11:
                case 12:
                    if (i10 != 12) {
                        i17 = 0;
                    }
                    org.telegram.ui.Cells.va vaVar = new org.telegram.ui.Cells.va(context, 6, i17, false);
                    vaVar.setSelfAsSavedMessages(true);
                    z1Var = vaVar;
                    break;
                case 13:
                    m4Var = new org.telegram.ui.Cells.va(6, 0, this.f32954e, null, false, true);
                    z1Var = m4Var;
                    break;
                case 14:
                    z1Var = new vv0(context, g6Var);
                    break;
                case 15:
                    z1Var = new org.telegram.ui.Cells.x7(context, g6Var);
                    break;
                case 16:
                    if (this.I == null) {
                        z10 = false;
                    }
                    z1Var = new vf.l1(context, g6Var, z10);
                    break;
                case 17:
                    z1Var = new vf.k1(context, g6Var);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    if (this.f32961y == null) {
                        this.f32961y = new wf.f(null);
                    }
                    wf.f fVar = this.f32961y;
                    int i19 = this.h;
                    z1Var = new fa1(this.f32954e, this.f32955f, i10 - 18, fVar, i19);
                    break;
                case 24:
                    z1Var = new org.telegram.ui.ie(context, g6Var);
                    break;
                case 25:
                    z1Var = new org.telegram.ui.je(context, g6Var);
                    break;
                case 26:
                    m4Var2 = new org.telegram.ui.Cells.m4(this.f32954e, org.telegram.ui.ActionBar.k6.G6, 23, 20, 0, false, false, this.v);
                    m4Var2.setTextSize(20.0f);
                    z1Var = m4Var2;
                    break;
                case 27:
                    qh.c8 c8Var = new qh.c8(context, g6Var);
                    c8Var.d(false, false);
                    z1Var = c8Var;
                    break;
                case 28:
                    dVar = new View(context);
                    dVar.setTag(-33024);
                    z1Var = dVar;
                    break;
                case 29:
                    z1Var = new vf.o(context, g6Var);
                    break;
                case 30:
                    z1Var = new org.telegram.ui.Cells.d9(context, g6Var);
                    break;
                case 31:
                    tl0 tl0Var = this.d;
                    if (tl0Var != null && tl0Var.b1()) {
                        org.telegram.ui.Cells.u3 u3Var = new org.telegram.ui.Cells.u3(context, 28, g6Var);
                        u3Var.setNoBackground(true);
                        z1Var = u3Var;
                        break;
                    } else {
                        z1Var = new org.telegram.ui.Cells.u3(context, g6Var);
                        break;
                    }
                    break;
                case 32:
                    z1Var = new org.telegram.ui.Cells.h6(context, null);
                    break;
                case 33:
                    z1Var = new org.telegram.ui.Cells.r2(context, true);
                    break;
                case 34:
                    u00 u00Var = new u00(context, g6Var);
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
                    org.telegram.ui.Cells.z1 z1Var2 = new org.telegram.ui.Cells.z1(i16, 21, this.f32954e, this.v, true);
                    z1Var2.getCheckBoxRound().b(org.telegram.ui.ActionBar.k6.V6, org.telegram.ui.ActionBar.k6.f21715g7, org.telegram.ui.ActionBar.k6.f21786k7);
                    z1Var = z1Var2;
                    break;
                case 38:
                    z1Var = new org.telegram.ui.Cells.a2(context, g6Var);
                    break;
                case 39:
                case 40:
                    z1Var = new org.telegram.ui.Cells.r8(context);
                    break;
                case 42:
                    m4Var2 = new org.telegram.ui.Cells.m4(this.f32954e, org.telegram.ui.ActionBar.k6.L6, 21, 15, 0, false, true, this.v);
                    z1Var = m4Var2;
                    break;
                case 43:
                    z1Var = new org.telegram.ui.Cells.aa(context, 0, g6Var);
                    break;
                case 44:
                    z1Var = new org.telegram.ui.Cells.i6(context, false);
                    break;
            }
        }
        if (this.f32957r) {
            if (i10 < 10000) {
                switch (i10) {
                }
            }
            z1Var.setBackgroundColor(I(i11));
        }
        return new f2.m1(z1Var);
    }

    @Override
    public void y(f2.m1 m1Var) {
        Q(m1Var, this.J);
        O(m1Var);
    }
}
