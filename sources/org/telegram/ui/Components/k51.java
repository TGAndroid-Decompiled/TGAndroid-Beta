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
import org.telegram.ui.r91;
public class k51 extends zf.b {
    public i51 D;
    public i51 E;
    public int F;
    public boolean G;
    public Utilities.Callback2 H;
    public boolean I;
    public final jl0 d;
    public final Context f29936e;
    public final int f29937f;
    public final int h;
    public final boolean f29938n;
    public Utilities.Callback2 f29940s;
    public final org.telegram.ui.ActionBar.c6 v;
    public tf.f f29943y;
    public boolean f29939r = true;
    public final ArrayList f29941w = new ArrayList();
    public final ArrayList f29942x = new ArrayList();
    public int A = 0;
    public final ArrayList B = new ArrayList();
    public final ArrayList C = new ArrayList();

    public k51(jl0 jl0Var, Context context, int i10, int i11, boolean z10, Utilities.Callback2 callback2, org.telegram.ui.ActionBar.c6 c6Var) {
        this.d = jl0Var;
        this.f29936e = context;
        this.f29937f = i10;
        this.h = i11;
        this.f29938n = z10;
        this.f29940s = callback2;
        this.v = c6Var;
        N(false);
    }

    public static boolean K(int i10) {
        if (i10 >= 10000) {
            v41 F = w41.F(i10);
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
    public boolean D(f2.n1 n1Var) {
        int i10 = n1Var.f6436f;
        w41 G = G(n1Var.b());
        if (i10 >= 10000) {
            v41 F = w41.F(i10);
            if (F == null || !F.isClickable()) {
                return false;
            }
        } else if (i10 != 3 && i10 != 5 && i10 != 6 && i10 != 30 && i10 != 4 && i10 != 10 && i10 != 44 && i10 != 11 && i10 != 12 && i10 != 17 && i10 != 16 && i10 != 29 && i10 != 25 && i10 != 27 && i10 != 32 && i10 != 33 && i10 != 35 && i10 != 36 && i10 != 37 && i10 != 41 && i10 != 39 && i10 != 40 && i10 != 38) {
            return false;
        }
        if (G != null && !G.f34296g) {
            return false;
        }
        return true;
    }

    public final void F(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.C;
            if (i10 < arrayList.size()) {
                i51 i51Var = (i51) arrayList.get(i10);
                this.H.run(Integer.valueOf(i10), new ArrayList(this.f29942x.subList(i51Var.f29322a, i51Var.f29323b + 1)));
                this.G = false;
            }
        }
    }

    public final w41 G(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f29942x;
            if (i10 < arrayList.size()) {
                return (w41) arrayList.get(i10);
            }
            return null;
        }
        return null;
    }

    public final int H(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.C;
            if (i11 < arrayList.size()) {
                i51 i51Var = (i51) arrayList.get(i11);
                if (i10 >= i51Var.f29322a && i10 <= i51Var.f29323b) {
                    return i11;
                }
                i11++;
            } else {
                return -1;
            }
        }
    }

    public int I(int i10) {
        return org.telegram.ui.ActionBar.g6.v0(i10, this.v);
    }

    public final boolean J(int i10) {
        w41 G = G(i10);
        w41 G2 = G(i10 + 1);
        if (G != null && !G.f34298j && G2 != null && K(G2.f50845a) == K(G.f50845a)) {
            return true;
        }
        return false;
    }

    public final void L() {
        i51 i51Var = this.E;
        if (i51Var != null) {
            i51Var.f29323b = Math.max(0, this.f29942x.size() - 1);
        }
    }

    public final int M() {
        ?? obj = new Object();
        this.E = obj;
        obj.f29322a = this.f29942x.size();
        i51 i51Var = this.E;
        i51Var.f29323b = -1;
        ArrayList arrayList = this.C;
        arrayList.add(i51Var);
        return arrayList.size() - 1;
    }

    public void N(boolean z10) {
        jl0 jl0Var = this.d;
        if (jl0Var != null && jl0Var.b0()) {
            jl0Var.post(new p90(8, this, z10));
        } else {
            P(z10);
        }
    }

    public final void O(f2.n1 n1Var) {
        int i10;
        View view = n1Var.f6432a;
        if (view instanceof org.telegram.ui.ActionBar.x5) {
            ((org.telegram.ui.ActionBar.x5) view).e();
            int i11 = n1Var.f6436f;
            if (this.f29939r) {
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
                if (this.f29938n) {
                    i10 = org.telegram.ui.ActionBar.g6.f23133h5;
                } else {
                    i10 = org.telegram.ui.ActionBar.g6.f23062d6;
                }
                view.setBackgroundColor(I(i10));
            }
        }
    }

    public final void P(boolean z10) {
        jl0 jl0Var = this.d;
        if (jl0Var == null || !jl0Var.b0()) {
            ArrayList arrayList = this.f29941w;
            arrayList.clear();
            ArrayList arrayList2 = this.f29942x;
            arrayList.addAll(arrayList2);
            arrayList2.clear();
            this.D = null;
            this.B.clear();
            this.C.clear();
            Utilities.Callback2 callback2 = this.f29940s;
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

    public final void Q(f2.n1 n1Var, boolean z10) {
        if (n1Var != null) {
            View view = n1Var.f6432a;
            int i10 = n1Var.f6436f;
            if (i10 >= 10000) {
                v41 F = w41.F(i10);
                if (F != null) {
                    F.attachedView(this.d, view, G(n1Var.b()));
                }
            } else if (i10 != 16) {
            } else {
                ((sf.m1) view).setReorder(z10);
            }
        }
    }

    public final void R() {
        jl0 jl0Var = this.d;
        if (jl0Var != null) {
            ArrayList arrayList = jl0Var.G2;
            if (arrayList == null) {
                jl0Var.G2 = new ArrayList();
            } else {
                arrayList.clear();
            }
            ArrayList arrayList2 = this.B;
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                i51 i51Var = (i51) obj;
                jl0Var.G2.add(Long.valueOf(AndroidUtilities.pack(i51Var.f29322a, i51Var.f29323b)));
            }
        }
    }

    public final void S() {
        ArrayList arrayList = this.f29941w;
        arrayList.clear();
        ArrayList arrayList2 = this.f29942x;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        this.B.clear();
        this.C.clear();
        Utilities.Callback2 callback2 = this.f29940s;
        if (callback2 != null) {
            callback2.run(arrayList2, this);
        }
        R();
    }

    public final void T() {
        i51 i51Var = this.D;
        if (i51Var != null) {
            i51Var.f29323b = Math.max(0, (this.f29942x.size() + this.A) - 1);
            i51 i51Var2 = this.D;
            if (i51Var2.f29322a == i51Var2.f29323b) {
                this.B.remove(i51Var2);
            }
            this.D = null;
        }
    }

    public final void U() {
        ?? obj = new Object();
        this.D = obj;
        obj.f29322a = this.f29942x.size() + this.A;
        i51 i51Var = this.D;
        i51Var.f29323b = -1;
        this.B.add(i51Var);
    }

    @Override
    public final int h() {
        return this.f29942x.size();
    }

    @Override
    public final int j(int i10) {
        w41 G = G(i10);
        if (G == null) {
            return 0;
        }
        return G.f50845a;
    }

    @Override
    public void v(f2.n1 r36, int r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.k51.v(f2.n1, int):void");
    }

    @Override
    public f2.n1 x(ViewGroup viewGroup, int i10) {
        int i11;
        View dVar;
        View k4Var;
        org.telegram.ui.Cells.q8 q8Var;
        org.telegram.ui.Cells.y1 y1Var;
        int i12;
        int i13;
        float f9;
        float f10;
        int i14;
        int i15;
        org.telegram.ui.Cells.k4 k4Var2;
        int i16;
        boolean z10 = this.f29938n;
        if (z10) {
            i11 = org.telegram.ui.ActionBar.g6.f23133h5;
        } else {
            i11 = org.telegram.ui.ActionBar.g6.f23062d6;
        }
        Context context = this.f29936e;
        if (i10 >= 10000) {
            v41 F = w41.F(i10);
            if (F != null) {
                y1Var = F.createView(this.f29936e, this.d, this.f29937f, this.h, this.v);
            } else {
                y1Var = new View(context);
            }
        } else {
            int i17 = 3;
            boolean z11 = true;
            org.telegram.ui.ActionBar.c6 c6Var = this.v;
            switch (i10) {
                case -4:
                case -1:
                    dVar = new bh.d(context, 22);
                    if (i10 == -4) {
                        dVar.setTag(-33024);
                    }
                    y1Var = dVar;
                    break;
                case -3:
                    ?? frameLayout = new FrameLayout(context);
                    frameLayout.f29069a = 0;
                    y1Var = frameLayout;
                    break;
                case -2:
                    y1Var = new bh.d(context, 23);
                    break;
                case 0:
                    if (z10) {
                        q8Var = new org.telegram.ui.Cells.k4(this.f29936e, org.telegram.ui.ActionBar.g6.L6, 21, 15, 0, false, false, this.v);
                        y1Var = q8Var;
                        break;
                    } else {
                        y1Var = new org.telegram.ui.Cells.k4(context, c6Var);
                        break;
                    }
                case 1:
                    k4Var = new org.telegram.ui.Cells.k4(this.f29936e, org.telegram.ui.ActionBar.g6.G6, 17, 15, false, this.v);
                    y1Var = k4Var;
                    break;
                case 2:
                    y1Var = new r11(context, c6Var);
                    break;
                case 3:
                    y1Var = new org.telegram.ui.Cells.m8(context, c6Var);
                    break;
                case 4:
                case 9:
                    org.telegram.ui.Cells.q8 q8Var2 = new org.telegram.ui.Cells.q8(context, c6Var);
                    q8Var = q8Var2;
                    if (i10 == 9) {
                        q8Var2.setDrawCheckRipple(true);
                        q8Var2.d(org.telegram.ui.ActionBar.g6.f23117g6, org.telegram.ui.ActionBar.g6.O6, org.telegram.ui.ActionBar.g6.P6, org.telegram.ui.ActionBar.g6.Q6, org.telegram.ui.ActionBar.g6.R6);
                        q8Var2.setTypeface(AndroidUtilities.bold());
                        q8Var2.setHeight(56);
                        q8Var = q8Var2;
                    }
                    y1Var = q8Var;
                    break;
                case 5:
                case 6:
                    if (i10 != 6) {
                        z11 = false;
                    }
                    k4Var = new org.telegram.ui.Cells.h5(21, 60, this.f29936e, this.v, z11);
                    y1Var = k4Var;
                    break;
                case 7:
                case 8:
                default:
                    y1Var = new org.telegram.ui.Cells.y8(context, c6Var);
                    break;
                case 10:
                    ?? frameLayout2 = new FrameLayout(context);
                    TextView textView = new TextView(context);
                    frameLayout2.f25207b = textView;
                    org.telegram.ui.b.r(textView, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false), 1, 16.0f, 1);
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
                        f9 = 61.0f;
                    } else {
                        f9 = 23.0f;
                    }
                    if (z12) {
                        f10 = 23.0f;
                    } else {
                        f10 = 61.0f;
                    }
                    frameLayout2.addView(textView, i7.f6.d(-1, -1.0f, i18, f9, 0.0f, f10, 0.0f));
                    TextView textView2 = new TextView(context);
                    frameLayout2.f25208c = textView2;
                    org.telegram.ui.b.r(textView2, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.I6, false), 1, 16.0f, 1);
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
                    frameLayout2.addView(textView2, i7.f6.d(-2, -1.0f, i15 | 48, 23.0f, 0.0f, 23.0f, 0.0f));
                    RadioButton radioButton = new RadioButton(context);
                    frameLayout2.d = radioButton;
                    radioButton.setSize(AndroidUtilities.dp(20.0f));
                    radioButton.b(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23118g7, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23135h7, false));
                    if (!LocaleController.isRTL) {
                        i17 = 5;
                    }
                    frameLayout2.addView(radioButton, i7.f6.d(22, 22.0f, i17 | 48, 20.0f, 15.0f, 20.0f, 0.0f));
                    frameLayout2.b();
                    y1Var = frameLayout2;
                    break;
                case 11:
                case 12:
                    if (i10 != 12) {
                        i17 = 0;
                    }
                    org.telegram.ui.Cells.sa saVar = new org.telegram.ui.Cells.sa(context, 6, i17, false);
                    saVar.setSelfAsSavedMessages(true);
                    y1Var = saVar;
                    break;
                case 13:
                    k4Var = new org.telegram.ui.Cells.sa(6, 0, this.f29936e, null, false, true);
                    y1Var = k4Var;
                    break;
                case 14:
                    y1Var = new lv0(context, c6Var);
                    break;
                case 15:
                    y1Var = new org.telegram.ui.Cells.v7(context, c6Var);
                    break;
                case 16:
                    if (this.H == null) {
                        z11 = false;
                    }
                    y1Var = new sf.m1(context, c6Var, z11);
                    break;
                case 17:
                    y1Var = new sf.l1(context, c6Var);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    if (this.f29943y == null) {
                        this.f29943y = new tf.f(null);
                    }
                    tf.f fVar = this.f29943y;
                    int i19 = this.h;
                    y1Var = new r91(this.f29936e, this.f29937f, i10 - 18, fVar, i19);
                    break;
                case 24:
                    y1Var = new org.telegram.ui.be(context, c6Var);
                    break;
                case 25:
                    y1Var = new org.telegram.ui.ce(context, c6Var);
                    break;
                case 26:
                    k4Var2 = new org.telegram.ui.Cells.k4(this.f29936e, org.telegram.ui.ActionBar.g6.G6, 23, 20, 0, false, false, this.v);
                    k4Var2.setTextSize(20.0f);
                    y1Var = k4Var2;
                    break;
                case 27:
                    nh.d9 d9Var = new nh.d9(context, c6Var);
                    d9Var.d(false, false);
                    y1Var = d9Var;
                    break;
                case 28:
                    dVar = new View(context);
                    dVar.setTag(-33024);
                    y1Var = dVar;
                    break;
                case 29:
                    y1Var = new sf.p(context, c6Var);
                    break;
                case 30:
                    y1Var = new org.telegram.ui.Cells.b9(context, c6Var);
                    break;
                case 31:
                    jl0 jl0Var = this.d;
                    if (jl0Var != null && jl0Var.b1()) {
                        org.telegram.ui.Cells.s3 s3Var = new org.telegram.ui.Cells.s3(context, 28, c6Var);
                        s3Var.setNoBackground(true);
                        y1Var = s3Var;
                        break;
                    } else {
                        y1Var = new org.telegram.ui.Cells.s3(context, c6Var);
                        break;
                    }
                    break;
                case 32:
                    y1Var = new org.telegram.ui.Cells.f6(context, null);
                    break;
                case 33:
                    y1Var = new org.telegram.ui.Cells.p2(context, true);
                    break;
                case 34:
                    p00 p00Var = new p00(context, c6Var);
                    p00Var.setIsSingleCell(true);
                    y1Var = p00Var;
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
                    org.telegram.ui.Cells.y1 y1Var2 = new org.telegram.ui.Cells.y1(i16, 21, this.f29936e, this.v, true);
                    y1Var2.getCheckBoxRound().b(org.telegram.ui.ActionBar.g6.V6, org.telegram.ui.ActionBar.g6.f23118g7, org.telegram.ui.ActionBar.g6.f23190k7);
                    y1Var = y1Var2;
                    break;
                case 38:
                    y1Var = new org.telegram.ui.Cells.z1(context, c6Var);
                    break;
                case 39:
                case 40:
                    y1Var = new org.telegram.ui.Cells.p8(context);
                    break;
                case 42:
                    k4Var2 = new org.telegram.ui.Cells.k4(this.f29936e, org.telegram.ui.ActionBar.g6.L6, 21, 15, 0, false, true, this.v);
                    y1Var = k4Var2;
                    break;
                case 43:
                    y1Var = new org.telegram.ui.Cells.y9(context, 0, c6Var);
                    break;
                case 44:
                    y1Var = new org.telegram.ui.Cells.g6(context, false);
                    break;
            }
        }
        if (this.f29939r) {
            if (i10 < 10000) {
                switch (i10) {
                }
            }
            y1Var.setBackgroundColor(I(i11));
        }
        return new f2.n1(y1Var);
    }

    @Override
    public void y(f2.n1 n1Var) {
        Q(n1Var, this.I);
        O(n1Var);
    }
}
