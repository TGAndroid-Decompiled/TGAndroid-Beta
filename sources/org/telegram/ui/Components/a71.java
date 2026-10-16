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
import org.telegram.ui.fb1;
public class a71 extends pg.b {
    public y61 H;
    public y61 I;
    public int J;
    public boolean K;
    public Utilities.Callback2 L;
    public boolean M;
    public final mm0 d;
    public final Context e;
    public final int f23143f;
    public final int h;
    public final boolean f23144n;
    public Utilities.Callback2 f23146s;
    public final org.telegram.ui.ActionBar.c6 v;
    public jg.f f23149y;
    public boolean f23145r = true;
    public final ArrayList f23147w = new ArrayList();
    public final ArrayList f23148x = new ArrayList();
    public int E = 0;
    public final ArrayList F = new ArrayList();
    public final ArrayList G = new ArrayList();

    public a71(mm0 mm0Var, Context context, int i10, int i11, boolean z10, Utilities.Callback2 callback2, org.telegram.ui.ActionBar.c6 c6Var) {
        this.d = mm0Var;
        this.e = context;
        this.f23143f = i10;
        this.h = i11;
        this.f23144n = z10;
        this.f23146s = callback2;
        this.v = c6Var;
        N(false);
    }

    public static boolean K(int i10) {
        if (i10 >= 10000) {
            l61 F = m61.F(i10);
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
        int i10 = b1Var.f44841f;
        m61 G = G(b1Var.b());
        if (i10 >= 10000) {
            l61 F = m61.F(i10);
            if (F == null || !F.isClickable()) {
                return false;
            }
        } else if (i10 != 3 && i10 != 5 && i10 != 6 && i10 != 30 && i10 != 4 && i10 != 10 && i10 != 44 && i10 != 11 && i10 != 12 && i10 != 17 && i10 != 16 && i10 != 29 && i10 != 25 && i10 != 27 && i10 != 32 && i10 != 33 && i10 != 35 && i10 != 36 && i10 != 37 && i10 != 41 && i10 != 39 && i10 != 40 && i10 != 38) {
            return false;
        }
        if (G != null && !G.f26942g) {
            return false;
        }
        return true;
    }

    public final void F(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.G;
            if (i10 < arrayList.size()) {
                y61 y61Var = (y61) arrayList.get(i10);
                this.L.run(Integer.valueOf(i10), new ArrayList(this.f23148x.subList(y61Var.f31170a, y61Var.f31171b + 1)));
                this.K = false;
            }
        }
    }

    public final m61 G(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f23148x;
            if (i10 < arrayList.size()) {
                return (m61) arrayList.get(i10);
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
                y61 y61Var = (y61) arrayList.get(i11);
                if (i10 >= y61Var.f31170a && i10 <= y61Var.f31171b) {
                    return i11;
                }
                i11++;
            } else {
                return -1;
            }
        }
    }

    public int I(int i10) {
        return org.telegram.ui.ActionBar.g6.w0(i10, this.v);
    }

    public final boolean J(int i10) {
        m61 G = G(i10);
        m61 G2 = G(i10 + 1);
        if (G != null && !G.f26944j && G2 != null && K(G2.f42904a) == K(G.f42904a)) {
            return true;
        }
        return false;
    }

    public final void L() {
        y61 y61Var = this.I;
        if (y61Var != null) {
            y61Var.f31171b = Math.max(0, this.f23148x.size() - 1);
        }
    }

    public final int M() {
        ?? obj = new Object();
        this.I = obj;
        obj.f31170a = this.f23148x.size();
        y61 y61Var = this.I;
        y61Var.f31171b = -1;
        ArrayList arrayList = this.G;
        arrayList.add(y61Var);
        return arrayList.size() - 1;
    }

    public void N(boolean z10) {
        mm0 mm0Var = this.d;
        if (mm0Var != null && mm0Var.b0()) {
            mm0Var.post(new zr0(6, this, z10));
        } else {
            P(z10);
        }
    }

    public final void O(s4.b1 b1Var) {
        int i10;
        View view = b1Var.f44838a;
        if (view instanceof org.telegram.ui.ActionBar.x5) {
            ((org.telegram.ui.ActionBar.x5) view).d();
            int i11 = b1Var.f44841f;
            if (this.f23145r) {
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
                if (this.f23144n) {
                    i10 = org.telegram.ui.ActionBar.g6.f19672h5;
                } else {
                    i10 = org.telegram.ui.ActionBar.g6.f19601d6;
                }
                view.setBackgroundColor(I(i10));
            }
        }
    }

    public final void P(boolean z10) {
        mm0 mm0Var = this.d;
        if (mm0Var == null || !mm0Var.b0()) {
            ArrayList arrayList = this.f23147w;
            arrayList.clear();
            ArrayList arrayList2 = this.f23148x;
            arrayList.addAll(arrayList2);
            arrayList2.clear();
            this.H = null;
            this.F.clear();
            this.G.clear();
            Utilities.Callback2 callback2 = this.f23146s;
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
            View view = b1Var.f44838a;
            int i10 = b1Var.f44841f;
            if (i10 >= 10000) {
                l61 F = m61.F(i10);
                if (F != null) {
                    F.attachedView(this.d, view, G(b1Var.b()));
                }
            } else if (i10 != 16) {
            } else {
                ((ig.x1) view).setReorder(z10);
            }
        }
    }

    public final void R() {
        mm0 mm0Var = this.d;
        if (mm0Var != null) {
            ArrayList arrayList = mm0Var.I2;
            if (arrayList == null) {
                mm0Var.I2 = new ArrayList();
            } else {
                arrayList.clear();
            }
            ArrayList arrayList2 = this.F;
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                y61 y61Var = (y61) obj;
                mm0Var.I2.add(Long.valueOf(AndroidUtilities.pack(y61Var.f31170a, y61Var.f31171b)));
            }
        }
    }

    public final void S() {
        ArrayList arrayList = this.f23147w;
        arrayList.clear();
        ArrayList arrayList2 = this.f23148x;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        this.F.clear();
        this.G.clear();
        Utilities.Callback2 callback2 = this.f23146s;
        if (callback2 != null) {
            callback2.run(arrayList2, this);
        }
        R();
    }

    public final void T() {
        y61 y61Var = this.H;
        if (y61Var != null) {
            y61Var.f31171b = Math.max(0, (this.f23148x.size() + this.E) - 1);
            y61 y61Var2 = this.H;
            if (y61Var2.f31170a == y61Var2.f31171b) {
                this.F.remove(y61Var2);
            }
            this.H = null;
        }
    }

    public final void U() {
        ?? obj = new Object();
        this.H = obj;
        obj.f31170a = this.f23148x.size() + this.E;
        y61 y61Var = this.H;
        y61Var.f31171b = -1;
        this.F.add(y61Var);
    }

    @Override
    public final int h() {
        return this.f23148x.size();
    }

    @Override
    public final int j(int i10) {
        m61 G = G(i10);
        if (G == null) {
            return 0;
        }
        return G.f42904a;
    }

    @Override
    public void v(s4.b1 r36, int r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.a71.v(s4.b1, int):void");
    }

    @Override
    public s4.b1 x(ViewGroup viewGroup, int i10) {
        int i11;
        View i5Var;
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
        boolean z10 = this.f23144n;
        if (z10) {
            i11 = org.telegram.ui.ActionBar.g6.f19672h5;
        } else {
            i11 = org.telegram.ui.ActionBar.g6.f19601d6;
        }
        Context context = this.e;
        if (i10 >= 10000) {
            l61 F = m61.F(i10);
            if (F != null) {
                a2Var = F.createView(this.e, this.d, this.f23143f, this.h, this.v);
            } else {
                a2Var = new View(context);
            }
        } else {
            int i17 = 3;
            int i18 = 8;
            boolean z11 = true;
            org.telegram.ui.ActionBar.c6 c6Var = this.v;
            switch (i10) {
                case -4:
                case -1:
                    i5Var = new bi.i5(context, 21);
                    if (i10 == -4) {
                        i5Var.setTag(-33024);
                    }
                    a2Var = i5Var;
                    break;
                case -3:
                    ?? frameLayout = new FrameLayout(context);
                    frameLayout.f30885a = 0;
                    a2Var = frameLayout;
                    break;
                case -2:
                    a2Var = new bi.i5(context, 22);
                    break;
                case 0:
                    if (z10) {
                        w8Var = new org.telegram.ui.Cells.m4(this.e, org.telegram.ui.ActionBar.g6.L6, 21, 15, 0, false, false, this.v);
                        a2Var = w8Var;
                        break;
                    } else {
                        a2Var = new org.telegram.ui.Cells.m4(context, c6Var);
                        break;
                    }
                case 1:
                    m4Var = new org.telegram.ui.Cells.m4(this.e, org.telegram.ui.ActionBar.g6.G6, 17, 15, false, this.v);
                    a2Var = m4Var;
                    break;
                case 2:
                    a2Var = new b31(context, c6Var);
                    break;
                case 3:
                    a2Var = new org.telegram.ui.Cells.r8(context, c6Var);
                    break;
                case 4:
                case 9:
                    org.telegram.ui.Cells.w8 w8Var2 = new org.telegram.ui.Cells.w8(context, c6Var);
                    w8Var = w8Var2;
                    if (i10 == 9) {
                        w8Var2.setDrawCheckRipple(true);
                        w8Var2.d(org.telegram.ui.ActionBar.g6.f19654g6, org.telegram.ui.ActionBar.g6.O6, org.telegram.ui.ActionBar.g6.P6, org.telegram.ui.ActionBar.g6.Q6, org.telegram.ui.ActionBar.g6.R6);
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
                    a2Var = new org.telegram.ui.Cells.e9(context, c6Var);
                    break;
                case 10:
                    ?? frameLayout2 = new FrameLayout(context);
                    TextView textView = new TextView(context);
                    frameLayout2.f22219b = textView;
                    org.telegram.messenger.sk.u(textView, org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.G6, false), 1, 16.0f, 1);
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
                    frameLayout2.addView(textView, w7.z5.a(-1.0f, f7, 0.0f, f10, 0.0f, -1, i19));
                    TextView textView2 = new TextView(context);
                    frameLayout2.f22220c = textView2;
                    org.telegram.messenger.sk.u(textView2, org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.I6, false), 1, 16.0f, 1);
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
                    frameLayout2.addView(textView2, w7.z5.a(-1.0f, 23.0f, 0.0f, 23.0f, 0.0f, -2, i15 | 48));
                    RadioButton radioButton = new RadioButton(context);
                    frameLayout2.d = radioButton;
                    radioButton.setSize(AndroidUtilities.dp(20.0f));
                    radioButton.b(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19655g7, false), org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19674h7, false));
                    if (!LocaleController.isRTL) {
                        i17 = 5;
                    }
                    frameLayout2.addView(radioButton, w7.z5.a(22.0f, 20.0f, 15.0f, 20.0f, 0.0f, 22, i17 | 48));
                    frameLayout2.b();
                    a2Var = frameLayout2;
                    break;
                case 11:
                case 12:
                    if (i10 != 12) {
                        i17 = 0;
                    }
                    org.telegram.ui.Cells.xa xaVar = new org.telegram.ui.Cells.xa(6, i17, context, false);
                    xaVar.setSelfAsSavedMessages(true);
                    a2Var = xaVar;
                    break;
                case 13:
                    m4Var = new org.telegram.ui.Cells.xa(6, 0, this.e, null, false, true);
                    a2Var = m4Var;
                    break;
                case 14:
                    a2Var = new sw0(context, c6Var);
                    break;
                case 15:
                    a2Var = new org.telegram.ui.Cells.z7(context, c6Var);
                    break;
                case 16:
                    if (this.L == null) {
                        z11 = false;
                    }
                    a2Var = new ig.x1(context, c6Var, z11);
                    break;
                case 17:
                    a2Var = new ig.v1(context, c6Var);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    if (this.f23149y == null) {
                        this.f23149y = new jg.f(null);
                    }
                    a2Var = new fb1(this.e, this.f23143f, i10 - 18, this.f23149y, this.h);
                    break;
                case 24:
                    a2Var = new org.telegram.ui.oe(context, c6Var);
                    break;
                case 25:
                    a2Var = new org.telegram.ui.pe(context, c6Var);
                    break;
                case 26:
                    m4Var2 = new org.telegram.ui.Cells.m4(this.e, org.telegram.ui.ActionBar.g6.G6, 23, 20, 0, false, false, this.v);
                    m4Var2.setTextSize(20.0f);
                    a2Var = m4Var2;
                    break;
                case 27:
                    di.da daVar = new di.da(context, c6Var);
                    daVar.d(false, false);
                    a2Var = daVar;
                    break;
                case 28:
                    i5Var = new View(context);
                    i5Var.setTag(-33024);
                    a2Var = i5Var;
                    break;
                case 29:
                    a2Var = new ig.t(context, c6Var);
                    break;
                case 30:
                    a2Var = new org.telegram.ui.Cells.h9(context, c6Var);
                    break;
                case 31:
                    mm0 mm0Var = this.d;
                    if (mm0Var != null && mm0Var.b1()) {
                        org.telegram.ui.Cells.v3 v3Var = new org.telegram.ui.Cells.v3(context, 28, c6Var);
                        v3Var.setNoBackground(true);
                        a2Var = v3Var;
                        break;
                    } else {
                        a2Var = new org.telegram.ui.Cells.v3(context, c6Var);
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
                    f10 f10Var = new f10(context, c6Var);
                    f10Var.setIsSingleCell(true);
                    a2Var = f10Var;
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
                        a2Var2.getCheckBoxRound().b(org.telegram.ui.ActionBar.g6.V6, org.telegram.ui.ActionBar.g6.f19655g7, org.telegram.ui.ActionBar.g6.f19729k7);
                        a2Var = a2Var2;
                        break;
                    }
                    i16 = i18;
                    org.telegram.ui.Cells.a2 a2Var22 = new org.telegram.ui.Cells.a2(i16, 21, this.e, this.v, true);
                    a2Var22.getCheckBoxRound().b(org.telegram.ui.ActionBar.g6.V6, org.telegram.ui.ActionBar.g6.f19655g7, org.telegram.ui.ActionBar.g6.f19729k7);
                    a2Var = a2Var22;
                case 38:
                    a2Var = new org.telegram.ui.Cells.b2(context, c6Var);
                    break;
                case 39:
                case 40:
                    a2Var = new org.telegram.ui.Cells.v8(context);
                    break;
                case 42:
                    m4Var2 = new org.telegram.ui.Cells.m4(this.e, org.telegram.ui.ActionBar.g6.L6, 21, 15, 0, false, true, this.v);
                    a2Var = m4Var2;
                    break;
                case 43:
                    a2Var = new org.telegram.ui.Cells.ca(context, 0, c6Var);
                    break;
                case 44:
                    a2Var = new org.telegram.ui.Cells.j6(context, false);
                    break;
            }
        }
        if (this.f23145r) {
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
