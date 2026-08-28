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
import org.telegram.ui.q91;
public class z41 extends wf.b {
    public x41 D;
    public x41 E;
    public int F;
    public boolean G;
    public Utilities.Callback2 H;
    public boolean I;
    public final wk0 d;
    public final Context f35185e;
    public final int f35186f;
    public final int h;
    public final boolean f35187n;
    public Utilities.Callback2 f35189s;
    public final org.telegram.ui.ActionBar.b6 v;
    public qf.f f35192y;
    public boolean f35188r = true;
    public final ArrayList f35190w = new ArrayList();
    public final ArrayList f35191x = new ArrayList();
    public int A = 0;
    public final ArrayList B = new ArrayList();
    public final ArrayList C = new ArrayList();

    public z41(wk0 wk0Var, Context context, int i9, int i10, boolean z10, Utilities.Callback2 callback2, org.telegram.ui.ActionBar.b6 b6Var) {
        this.d = wk0Var;
        this.f35185e = context;
        this.f35186f = i9;
        this.h = i10;
        this.f35187n = z10;
        this.f35189s = callback2;
        this.v = b6Var;
        N(false);
    }

    public static boolean K(int i9) {
        if (i9 >= 10000) {
            k41 F = l41.F(i9);
            if (F == null || !F.isShadow()) {
                return false;
            }
            return true;
        } else if (i9 != 7 && i9 != 8 && i9 != 38 && i9 != 31 && i9 != -4 && i9 != 28 && i9 != 2 && i9 != -2) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public boolean D(f2.q1 q1Var) {
        int i9 = q1Var.f5505f;
        l41 G = G(q1Var.b());
        if (i9 >= 10000) {
            k41 F = l41.F(i9);
            if (F == null || !F.isClickable()) {
                return false;
            }
        } else if (i9 != 3 && i9 != 5 && i9 != 6 && i9 != 30 && i9 != 4 && i9 != 10 && i9 != 44 && i9 != 11 && i9 != 12 && i9 != 17 && i9 != 16 && i9 != 29 && i9 != 25 && i9 != 27 && i9 != 32 && i9 != 33 && i9 != 35 && i9 != 36 && i9 != 37 && i9 != 41 && i9 != 39 && i9 != 40 && i9 != 38) {
            return false;
        }
        if (G != null && !G.f30335g) {
            return false;
        }
        return true;
    }

    public final void F(int i9) {
        if (i9 >= 0) {
            ArrayList arrayList = this.C;
            if (i9 < arrayList.size()) {
                x41 x41Var = (x41) arrayList.get(i9);
                this.H.run(Integer.valueOf(i9), new ArrayList(this.f35191x.subList(x41Var.f34504a, x41Var.f34505b + 1)));
                this.G = false;
            }
        }
    }

    public final l41 G(int i9) {
        if (i9 >= 0) {
            ArrayList arrayList = this.f35191x;
            if (i9 < arrayList.size()) {
                return (l41) arrayList.get(i9);
            }
            return null;
        }
        return null;
    }

    public final int H(int i9) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.C;
            if (i10 < arrayList.size()) {
                x41 x41Var = (x41) arrayList.get(i10);
                if (i9 >= x41Var.f34504a && i9 <= x41Var.f34505b) {
                    return i10;
                }
                i10++;
            } else {
                return -1;
            }
        }
    }

    public int I(int i9) {
        return org.telegram.ui.ActionBar.f6.v0(i9, this.v);
    }

    public final boolean J(int i9) {
        l41 G = G(i9);
        l41 G2 = G(i9 + 1);
        if (G != null && !G.f30337j && G2 != null && K(G2.f48814a) == K(G.f48814a)) {
            return true;
        }
        return false;
    }

    public final void L() {
        x41 x41Var = this.E;
        if (x41Var != null) {
            x41Var.f34505b = Math.max(0, this.f35191x.size() - 1);
        }
    }

    public final int M() {
        ?? obj = new Object();
        this.E = obj;
        obj.f34504a = this.f35191x.size();
        x41 x41Var = this.E;
        x41Var.f34505b = -1;
        ArrayList arrayList = this.C;
        arrayList.add(x41Var);
        return arrayList.size() - 1;
    }

    public void N(boolean z10) {
        wk0 wk0Var = this.d;
        if (wk0Var != null && wk0Var.b0()) {
            wk0Var.post(new a50(9, this, z10));
        } else {
            P(z10);
        }
    }

    public final void O(f2.q1 q1Var) {
        int i9;
        View view = q1Var.f5501a;
        if (view instanceof org.telegram.ui.ActionBar.w5) {
            ((org.telegram.ui.ActionBar.w5) view).d();
            int i10 = q1Var.f5505f;
            if (this.f35188r) {
                if (i10 < 10000) {
                    switch (i10) {
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
                if (this.f35187n) {
                    i9 = org.telegram.ui.ActionBar.f6.f23072h5;
                } else {
                    i9 = org.telegram.ui.ActionBar.f6.f23001d6;
                }
                view.setBackgroundColor(I(i9));
            }
        }
    }

    public final void P(boolean z10) {
        wk0 wk0Var = this.d;
        if (wk0Var == null || !wk0Var.b0()) {
            ArrayList arrayList = this.f35190w;
            arrayList.clear();
            ArrayList arrayList2 = this.f35191x;
            arrayList.addAll(arrayList2);
            arrayList2.clear();
            this.D = null;
            this.B.clear();
            this.C.clear();
            Utilities.Callback2 callback2 = this.f35189s;
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

    public final void Q(f2.q1 q1Var, boolean z10) {
        if (q1Var != null) {
            View view = q1Var.f5501a;
            int i9 = q1Var.f5505f;
            if (i9 >= 10000) {
                k41 F = l41.F(i9);
                if (F != null) {
                    F.attachedView(this.d, view, G(q1Var.b()));
                }
            } else if (i9 != 16) {
            } else {
                ((pf.m1) view).setReorder(z10);
            }
        }
    }

    public final void R() {
        wk0 wk0Var = this.d;
        if (wk0Var != null) {
            ArrayList arrayList = wk0Var.G2;
            if (arrayList == null) {
                wk0Var.G2 = new ArrayList();
            } else {
                arrayList.clear();
            }
            ArrayList arrayList2 = this.B;
            int size = arrayList2.size();
            int i9 = 0;
            while (i9 < size) {
                Object obj = arrayList2.get(i9);
                i9++;
                x41 x41Var = (x41) obj;
                wk0Var.G2.add(Long.valueOf(AndroidUtilities.pack(x41Var.f34504a, x41Var.f34505b)));
            }
        }
    }

    public final void S() {
        ArrayList arrayList = this.f35190w;
        arrayList.clear();
        ArrayList arrayList2 = this.f35191x;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        this.B.clear();
        this.C.clear();
        Utilities.Callback2 callback2 = this.f35189s;
        if (callback2 != null) {
            callback2.run(arrayList2, this);
        }
        R();
    }

    public final void T() {
        x41 x41Var = this.D;
        if (x41Var != null) {
            x41Var.f34505b = Math.max(0, (this.f35191x.size() + this.A) - 1);
            x41 x41Var2 = this.D;
            if (x41Var2.f34504a == x41Var2.f34505b) {
                this.B.remove(x41Var2);
            }
            this.D = null;
        }
    }

    public final void U() {
        ?? obj = new Object();
        this.D = obj;
        obj.f34504a = this.f35191x.size() + this.A;
        x41 x41Var = this.D;
        x41Var.f34505b = -1;
        this.B.add(x41Var);
    }

    @Override
    public final int h() {
        return this.f35191x.size();
    }

    @Override
    public final int j(int i9) {
        l41 G = G(i9);
        if (G == null) {
            return 0;
        }
        return G.f48814a;
    }

    @Override
    public void v(f2.q1 r36, int r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.z41.v(f2.q1, int):void");
    }

    @Override
    public f2.q1 x(ViewGroup viewGroup, int i9) {
        int i10;
        View gVar;
        View m4Var;
        org.telegram.ui.Cells.t8 t8Var;
        org.telegram.ui.Cells.z1 z1Var;
        int i11;
        int i12;
        float f10;
        float f11;
        int i13;
        int i14;
        org.telegram.ui.Cells.m4 m4Var2;
        int i15;
        boolean z10 = this.f35187n;
        if (z10) {
            i10 = org.telegram.ui.ActionBar.f6.f23072h5;
        } else {
            i10 = org.telegram.ui.ActionBar.f6.f23001d6;
        }
        Context context = this.f35185e;
        if (i9 >= 10000) {
            k41 F = l41.F(i9);
            if (F != null) {
                z1Var = F.createView(this.f35185e, this.d, this.f35186f, this.h, this.v);
            } else {
                z1Var = new View(context);
            }
        } else {
            int i16 = 3;
            boolean z11 = true;
            org.telegram.ui.ActionBar.b6 b6Var = this.v;
            switch (i9) {
                case -4:
                case -1:
                    gVar = new dh.g(context, 20);
                    if (i9 == -4) {
                        gVar.setTag(-33024);
                    }
                    z1Var = gVar;
                    break;
                case -3:
                    ?? frameLayout = new FrameLayout(context);
                    frameLayout.f34109a = 0;
                    z1Var = frameLayout;
                    break;
                case -2:
                    z1Var = new dh.g(context, 21);
                    break;
                case 0:
                    if (z10) {
                        t8Var = new org.telegram.ui.Cells.m4(this.f35185e, org.telegram.ui.ActionBar.f6.L6, 21, 15, 0, false, false, this.v);
                        z1Var = t8Var;
                        break;
                    } else {
                        z1Var = new org.telegram.ui.Cells.m4(context, b6Var);
                        break;
                    }
                case 1:
                    m4Var = new org.telegram.ui.Cells.m4(this.f35185e, org.telegram.ui.ActionBar.f6.G6, 17, 15, false, this.v);
                    z1Var = m4Var;
                    break;
                case 2:
                    z1Var = new f11(context, b6Var);
                    break;
                case 3:
                    z1Var = new org.telegram.ui.Cells.p8(context, b6Var);
                    break;
                case 4:
                case 9:
                    org.telegram.ui.Cells.t8 t8Var2 = new org.telegram.ui.Cells.t8(context, b6Var);
                    t8Var = t8Var2;
                    if (i9 == 9) {
                        t8Var2.setDrawCheckRipple(true);
                        t8Var2.d(org.telegram.ui.ActionBar.f6.f23055g6, org.telegram.ui.ActionBar.f6.O6, org.telegram.ui.ActionBar.f6.P6, org.telegram.ui.ActionBar.f6.Q6, org.telegram.ui.ActionBar.f6.R6);
                        t8Var2.setTypeface(AndroidUtilities.bold());
                        t8Var2.setHeight(56);
                        t8Var = t8Var2;
                    }
                    z1Var = t8Var;
                    break;
                case 5:
                case 6:
                    if (i9 != 6) {
                        z11 = false;
                    }
                    m4Var = new org.telegram.ui.Cells.j5(21, 60, this.f35185e, this.v, z11);
                    z1Var = m4Var;
                    break;
                case 7:
                case 8:
                default:
                    z1Var = new org.telegram.ui.Cells.b9(context, b6Var);
                    break;
                case 10:
                    ?? frameLayout2 = new FrameLayout(context);
                    TextView textView = new TextView(context);
                    frameLayout2.f25674b = textView;
                    org.telegram.messenger.ll.s(textView, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.G6, false), 1, 16.0f, 1);
                    textView.setMaxLines(1);
                    textView.setSingleLine(true);
                    TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                    textView.setEllipsize(truncateAt);
                    if (LocaleController.isRTL) {
                        i11 = 5;
                    } else {
                        i11 = 3;
                    }
                    textView.setGravity(i11 | 16);
                    boolean z12 = LocaleController.isRTL;
                    if (z12) {
                        i12 = 5;
                    } else {
                        i12 = 3;
                    }
                    int i17 = i12 | 48;
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
                    frameLayout2.addView(textView, g7.e6.d(-1, -1.0f, i17, f10, 0.0f, f11, 0.0f));
                    TextView textView2 = new TextView(context);
                    frameLayout2.f25675c = textView2;
                    org.telegram.messenger.ll.s(textView2, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.I6, false), 1, 16.0f, 1);
                    textView2.setMaxLines(1);
                    textView2.setSingleLine(true);
                    textView2.setEllipsize(truncateAt);
                    if (LocaleController.isRTL) {
                        i13 = 3;
                    } else {
                        i13 = 5;
                    }
                    textView2.setGravity(i13 | 16);
                    textView2.setVisibility(8);
                    if (LocaleController.isRTL) {
                        i14 = 3;
                    } else {
                        i14 = 5;
                    }
                    frameLayout2.addView(textView2, g7.e6.d(-2, -1.0f, i14 | 48, 23.0f, 0.0f, 23.0f, 0.0f));
                    RadioButton radioButton = new RadioButton(context);
                    frameLayout2.d = radioButton;
                    radioButton.setSize(AndroidUtilities.dp(20.0f));
                    radioButton.b(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23056g7, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23074h7, false));
                    if (!LocaleController.isRTL) {
                        i16 = 5;
                    }
                    frameLayout2.addView(radioButton, g7.e6.d(22, 22.0f, i16 | 48, 20.0f, 15.0f, 20.0f, 0.0f));
                    frameLayout2.b();
                    z1Var = frameLayout2;
                    break;
                case 11:
                case 12:
                    if (i9 != 12) {
                        i16 = 0;
                    }
                    org.telegram.ui.Cells.va vaVar = new org.telegram.ui.Cells.va(context, 6, i16, false);
                    vaVar.setSelfAsSavedMessages(true);
                    z1Var = vaVar;
                    break;
                case 13:
                    m4Var = new org.telegram.ui.Cells.va(6, 0, this.f35185e, null, false, true);
                    z1Var = m4Var;
                    break;
                case 14:
                    z1Var = new bv0(context, b6Var);
                    break;
                case 15:
                    z1Var = new org.telegram.ui.Cells.x7(context, b6Var);
                    break;
                case 16:
                    if (this.H == null) {
                        z11 = false;
                    }
                    z1Var = new pf.m1(context, b6Var, z11);
                    break;
                case 17:
                    z1Var = new pf.l1(context, b6Var);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    if (this.f35192y == null) {
                        this.f35192y = new qf.f(null);
                    }
                    qf.f fVar = this.f35192y;
                    int i18 = this.h;
                    z1Var = new q91(this.f35185e, this.f35186f, i9 - 18, fVar, i18);
                    break;
                case 24:
                    z1Var = new org.telegram.ui.de(context, b6Var);
                    break;
                case 25:
                    z1Var = new org.telegram.ui.ee(context, b6Var);
                    break;
                case 26:
                    m4Var2 = new org.telegram.ui.Cells.m4(this.f35185e, org.telegram.ui.ActionBar.f6.G6, 23, 20, 0, false, false, this.v);
                    m4Var2.setTextSize(20.0f);
                    z1Var = m4Var2;
                    break;
                case 27:
                    kh.s9 s9Var = new kh.s9(context, b6Var);
                    s9Var.d(false, false);
                    z1Var = s9Var;
                    break;
                case 28:
                    gVar = new View(context);
                    gVar.setTag(-33024);
                    z1Var = gVar;
                    break;
                case 29:
                    z1Var = new pf.p(context, b6Var);
                    break;
                case 30:
                    z1Var = new org.telegram.ui.Cells.e9(context, b6Var);
                    break;
                case 31:
                    wk0 wk0Var = this.d;
                    if (wk0Var != null && wk0Var.b1()) {
                        org.telegram.ui.Cells.v3 v3Var = new org.telegram.ui.Cells.v3(context, 28, b6Var);
                        v3Var.setNoBackground(true);
                        z1Var = v3Var;
                        break;
                    } else {
                        z1Var = new org.telegram.ui.Cells.v3(context, b6Var);
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
                    e00 e00Var = new e00(context, b6Var);
                    e00Var.setIsSingleCell(true);
                    z1Var = e00Var;
                    break;
                case 35:
                case 36:
                case 37:
                case 41:
                    if (i9 == 35) {
                        i15 = 4;
                    } else if (i9 == 36) {
                        i15 = 6;
                    } else if (i9 == 37) {
                        i15 = 7;
                    } else if (i9 == 41) {
                        i15 = 8;
                    } else {
                        i15 = 0;
                    }
                    org.telegram.ui.Cells.z1 z1Var2 = new org.telegram.ui.Cells.z1(i15, 21, this.f35185e, this.v, true);
                    z1Var2.getCheckBoxRound().b(org.telegram.ui.ActionBar.f6.V6, org.telegram.ui.ActionBar.f6.f23056g7, org.telegram.ui.ActionBar.f6.f23128k7);
                    z1Var = z1Var2;
                    break;
                case 38:
                    z1Var = new org.telegram.ui.Cells.a2(context, b6Var);
                    break;
                case 39:
                case 40:
                    z1Var = new org.telegram.ui.Cells.s8(context);
                    break;
                case 42:
                    m4Var2 = new org.telegram.ui.Cells.m4(this.f35185e, org.telegram.ui.ActionBar.f6.L6, 21, 15, 0, false, true, this.v);
                    z1Var = m4Var2;
                    break;
                case 43:
                    z1Var = new org.telegram.ui.Cells.ba(context, 0, b6Var);
                    break;
                case 44:
                    z1Var = new org.telegram.ui.Cells.i6(context, false);
                    break;
            }
        }
        if (this.f35188r) {
            if (i9 < 10000) {
                switch (i9) {
                }
            }
            z1Var.setBackgroundColor(I(i10));
        }
        return new f2.q1(z1Var);
    }

    @Override
    public void y(f2.q1 q1Var) {
        Q(q1Var, this.I);
        O(q1Var);
    }
}
