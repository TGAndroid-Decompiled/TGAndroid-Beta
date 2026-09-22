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
public class w51 extends og.b {
    public u51 H;
    public u51 I;
    public int J;
    public boolean K;
    public Utilities.Callback2 L;
    public boolean M;
    public final ll0 d;
    public final Context e;
    public final int f29608f;
    public final int h;
    public final boolean f29609n;
    public Utilities.Callback2 f29611s;
    public final org.telegram.ui.ActionBar.e6 v;
    public ig.f f29614y;
    public boolean f29610r = true;
    public final ArrayList f29612w = new ArrayList();
    public final ArrayList f29613x = new ArrayList();
    public int E = 0;
    public final ArrayList F = new ArrayList();
    public final ArrayList G = new ArrayList();

    public w51(ll0 ll0Var, Context context, int i10, int i11, boolean z10, Utilities.Callback2 callback2, org.telegram.ui.ActionBar.e6 e6Var) {
        this.d = ll0Var;
        this.e = context;
        this.f29608f = i10;
        this.h = i11;
        this.f29609n = z10;
        this.f29611s = callback2;
        this.v = e6Var;
        N(false);
    }

    public static boolean K(int i10) {
        if (i10 >= 10000) {
            h51 F = i51.F(i10);
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
        int i10 = c1Var.f42674f;
        i51 G = G(c1Var.b());
        if (i10 >= 10000) {
            h51 F = i51.F(i10);
            if (F == null || !F.isClickable()) {
                return false;
            }
        } else if (i10 != 3 && i10 != 5 && i10 != 6 && i10 != 30 && i10 != 4 && i10 != 10 && i10 != 44 && i10 != 11 && i10 != 12 && i10 != 17 && i10 != 16 && i10 != 29 && i10 != 25 && i10 != 27 && i10 != 32 && i10 != 33 && i10 != 35 && i10 != 36 && i10 != 37 && i10 != 41 && i10 != 39 && i10 != 40 && i10 != 38) {
            return false;
        }
        if (G != null && !G.f24896g) {
            return false;
        }
        return true;
    }

    public final void F(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.G;
            if (i10 < arrayList.size()) {
                u51 u51Var = (u51) arrayList.get(i10);
                this.L.run(Integer.valueOf(i10), new ArrayList(this.f29613x.subList(u51Var.f28291a, u51Var.f28292b + 1)));
                this.K = false;
            }
        }
    }

    public final i51 G(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f29613x;
            if (i10 < arrayList.size()) {
                return (i51) arrayList.get(i10);
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
                u51 u51Var = (u51) arrayList.get(i11);
                if (i10 >= u51Var.f28291a && i10 <= u51Var.f28292b) {
                    return i11;
                }
                i11++;
            } else {
                return -1;
            }
        }
    }

    public int I(int i10) {
        return org.telegram.ui.ActionBar.i6.v0(i10, this.v);
    }

    public final boolean J(int i10) {
        i51 G = G(i10);
        i51 G2 = G(i10 + 1);
        if (G != null && !G.f24898j && G2 != null && K(G2.f15531a) == K(G.f15531a)) {
            return true;
        }
        return false;
    }

    public final void L() {
        u51 u51Var = this.I;
        if (u51Var != null) {
            u51Var.f28292b = Math.max(0, this.f29613x.size() - 1);
        }
    }

    public final int M() {
        ?? obj = new Object();
        this.I = obj;
        obj.f28291a = this.f29613x.size();
        u51 u51Var = this.I;
        u51Var.f28292b = -1;
        ArrayList arrayList = this.G;
        arrayList.add(u51Var);
        return arrayList.size() - 1;
    }

    public void N(boolean z10) {
        ll0 ll0Var = this.d;
        if (ll0Var != null && ll0Var.b0()) {
            ll0Var.post(new sr0(4, this, z10));
        } else {
            P(z10);
        }
    }

    public final void O(s4.c1 c1Var) {
        int i10;
        View view = c1Var.f42671a;
        if (view instanceof org.telegram.ui.ActionBar.z5) {
            ((org.telegram.ui.ActionBar.z5) view).e();
            int i11 = c1Var.f42674f;
            if (this.f29610r) {
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
                if (this.f29609n) {
                    i10 = org.telegram.ui.ActionBar.i6.f18904h5;
                } else {
                    i10 = org.telegram.ui.ActionBar.i6.f18834d6;
                }
                view.setBackgroundColor(I(i10));
            }
        }
    }

    public final void P(boolean z10) {
        ll0 ll0Var = this.d;
        if (ll0Var == null || !ll0Var.b0()) {
            ArrayList arrayList = this.f29612w;
            arrayList.clear();
            ArrayList arrayList2 = this.f29613x;
            arrayList.addAll(arrayList2);
            arrayList2.clear();
            this.H = null;
            this.F.clear();
            this.G.clear();
            Utilities.Callback2 callback2 = this.f29611s;
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
            View view = c1Var.f42671a;
            int i10 = c1Var.f42674f;
            if (i10 >= 10000) {
                h51 F = i51.F(i10);
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
        ll0 ll0Var = this.d;
        if (ll0Var != null) {
            ArrayList arrayList = ll0Var.K2;
            if (arrayList == null) {
                ll0Var.K2 = new ArrayList();
            } else {
                arrayList.clear();
            }
            ArrayList arrayList2 = this.F;
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                u51 u51Var = (u51) obj;
                ll0Var.K2.add(Long.valueOf(AndroidUtilities.pack(u51Var.f28291a, u51Var.f28292b)));
            }
        }
    }

    public final void S() {
        ArrayList arrayList = this.f29612w;
        arrayList.clear();
        ArrayList arrayList2 = this.f29613x;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        this.F.clear();
        this.G.clear();
        Utilities.Callback2 callback2 = this.f29611s;
        if (callback2 != null) {
            callback2.run(arrayList2, this);
        }
        R();
    }

    public final void T() {
        u51 u51Var = this.H;
        if (u51Var != null) {
            u51Var.f28292b = Math.max(0, (this.f29613x.size() + this.E) - 1);
            u51 u51Var2 = this.H;
            if (u51Var2.f28291a == u51Var2.f28292b) {
                this.F.remove(u51Var2);
            }
            this.H = null;
        }
    }

    public final void U() {
        ?? obj = new Object();
        this.H = obj;
        obj.f28291a = this.f29613x.size() + this.E;
        u51 u51Var = this.H;
        u51Var.f28292b = -1;
        this.F.add(u51Var);
    }

    @Override
    public final int h() {
        return this.f29613x.size();
    }

    @Override
    public final int j(int i10) {
        i51 G = G(i10);
        if (G == null) {
            return 0;
        }
        return G.f15531a;
    }

    @Override
    public void v(s4.c1 r36, int r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.w51.v(s4.c1, int):void");
    }

    @Override
    public s4.c1 x(ViewGroup viewGroup, int i10) {
        int i11;
        View x5Var;
        View m4Var;
        org.telegram.ui.Cells.w8 w8Var;
        org.telegram.ui.Cells.z1 z1Var;
        int i12;
        int i13;
        float f7;
        float f10;
        int i14;
        int i15;
        org.telegram.ui.Cells.m4 m4Var2;
        int i16;
        boolean z10 = this.f29609n;
        if (z10) {
            i11 = org.telegram.ui.ActionBar.i6.f18904h5;
        } else {
            i11 = org.telegram.ui.ActionBar.i6.f18834d6;
        }
        Context context = this.e;
        if (i10 >= 10000) {
            h51 F = i51.F(i10);
            if (F != null) {
                z1Var = F.createView(this.e, this.d, this.f29608f, this.h, this.v);
            } else {
                z1Var = new View(context);
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
                    z1Var = x5Var;
                    break;
                case -3:
                    ?? frameLayout = new FrameLayout(context);
                    frameLayout.f28053a = 0;
                    z1Var = frameLayout;
                    break;
                case -2:
                    z1Var = new ai.x5(context, 22);
                    break;
                case 0:
                    if (z10) {
                        w8Var = new org.telegram.ui.Cells.m4(this.e, org.telegram.ui.ActionBar.i6.L6, 21, 15, 0, false, false, this.v);
                        z1Var = w8Var;
                        break;
                    } else {
                        z1Var = new org.telegram.ui.Cells.m4(context, e6Var);
                        break;
                    }
                case 1:
                    m4Var = new org.telegram.ui.Cells.m4(this.e, org.telegram.ui.ActionBar.i6.G6, 17, 15, false, this.v);
                    z1Var = m4Var;
                    break;
                case 2:
                    z1Var = new z11(context, e6Var);
                    break;
                case 3:
                    z1Var = new org.telegram.ui.Cells.r8(context, e6Var);
                    break;
                case 4:
                case 9:
                    org.telegram.ui.Cells.w8 w8Var2 = new org.telegram.ui.Cells.w8(context, e6Var);
                    w8Var = w8Var2;
                    if (i10 == 9) {
                        w8Var2.setDrawCheckRipple(true);
                        w8Var2.d(org.telegram.ui.ActionBar.i6.f18888g6, org.telegram.ui.ActionBar.i6.O6, org.telegram.ui.ActionBar.i6.P6, org.telegram.ui.ActionBar.i6.Q6, org.telegram.ui.ActionBar.i6.R6);
                        w8Var2.setTypeface(AndroidUtilities.bold());
                        w8Var2.setHeight(56);
                        w8Var = w8Var2;
                    }
                    z1Var = w8Var;
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
                    z1Var = new org.telegram.ui.Cells.e9(context, e6Var);
                    break;
                case 10:
                    ?? frameLayout2 = new FrameLayout(context);
                    TextView textView = new TextView(context);
                    frameLayout2.f21329b = textView;
                    org.telegram.messenger.vl.s(textView, org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.G6, false), 1, 16.0f, 1);
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
                    frameLayout2.f21330c = textView2;
                    org.telegram.messenger.vl.s(textView2, org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.I6, false), 1, 16.0f, 1);
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
                    radioButton.b(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f18889g7, false), org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f18906h7, false));
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
                    org.telegram.ui.Cells.ab abVar = new org.telegram.ui.Cells.ab(context, 6, i17, false);
                    abVar.setSelfAsSavedMessages(true);
                    z1Var = abVar;
                    break;
                case 13:
                    m4Var = new org.telegram.ui.Cells.ab(6, 0, this.e, null, false, true);
                    z1Var = m4Var;
                    break;
                case 14:
                    z1Var = new tv0(context, e6Var);
                    break;
                case 15:
                    z1Var = new org.telegram.ui.Cells.z7(context, e6Var);
                    break;
                case 16:
                    if (this.L == null) {
                        z11 = false;
                    }
                    z1Var = new hg.y1(context, e6Var, z11);
                    break;
                case 17:
                    z1Var = new hg.w1(context, e6Var);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    if (this.f29614y == null) {
                        this.f29614y = new ig.f(null);
                    }
                    ig.f fVar = this.f29614y;
                    int i19 = this.h;
                    z1Var = new xa1(this.e, this.f29608f, i10 - 18, fVar, i19);
                    break;
                case 24:
                    z1Var = new org.telegram.ui.he(context, e6Var);
                    break;
                case 25:
                    z1Var = new org.telegram.ui.ie(context, e6Var);
                    break;
                case 26:
                    m4Var2 = new org.telegram.ui.Cells.m4(this.e, org.telegram.ui.ActionBar.i6.G6, 23, 20, 0, false, false, this.v);
                    m4Var2.setTextSize(20.0f);
                    z1Var = m4Var2;
                    break;
                case 27:
                    ci.ha haVar = new ci.ha(context, e6Var);
                    haVar.d(false, false);
                    z1Var = haVar;
                    break;
                case 28:
                    x5Var = new View(context);
                    x5Var.setTag(-33024);
                    z1Var = x5Var;
                    break;
                case 29:
                    z1Var = new hg.v(context, e6Var);
                    break;
                case 30:
                    z1Var = new org.telegram.ui.Cells.h9(context, e6Var);
                    break;
                case 31:
                    ll0 ll0Var = this.d;
                    if (ll0Var != null && ll0Var.b1()) {
                        org.telegram.ui.Cells.v3 v3Var = new org.telegram.ui.Cells.v3(context, 28, e6Var);
                        v3Var.setNoBackground(true);
                        z1Var = v3Var;
                        break;
                    } else {
                        z1Var = new org.telegram.ui.Cells.v3(context, e6Var);
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
                    t00 t00Var = new t00(context, e6Var);
                    t00Var.setIsSingleCell(true);
                    z1Var = t00Var;
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
                    z1Var2.getCheckBoxRound().b(org.telegram.ui.ActionBar.i6.V6, org.telegram.ui.ActionBar.i6.f18889g7, org.telegram.ui.ActionBar.i6.f18962k7);
                    z1Var = z1Var2;
                    break;
                case 38:
                    z1Var = new org.telegram.ui.Cells.a2(context, e6Var);
                    break;
                case 39:
                case 40:
                    z1Var = new org.telegram.ui.Cells.v8(context);
                    break;
                case 42:
                    m4Var2 = new org.telegram.ui.Cells.m4(this.e, org.telegram.ui.ActionBar.i6.L6, 21, 15, 0, false, true, this.v);
                    z1Var = m4Var2;
                    break;
                case 43:
                    z1Var = new org.telegram.ui.Cells.ea(context, 0, e6Var);
                    break;
                case 44:
                    z1Var = new org.telegram.ui.Cells.j6(context, false);
                    break;
            }
        }
        if (this.f29610r) {
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
