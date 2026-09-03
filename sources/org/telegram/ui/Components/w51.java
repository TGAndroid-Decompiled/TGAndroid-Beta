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
import org.telegram.ui.ma1;
public class w51 extends bg.c {
    public u51 E;
    public u51 F;
    public int G;
    public boolean H;
    public Utilities.Callback2 I;
    public boolean J;
    public final rl0 d;
    public final Context e;
    public final int f30146f;
    public final int h;
    public final boolean f30147n;
    public Utilities.Callback2 f30149s;
    public final org.telegram.ui.ActionBar.f6 v;
    public vf.f f30152y;
    public boolean f30148r = true;
    public final ArrayList f30150w = new ArrayList();
    public final ArrayList f30151x = new ArrayList();
    public int B = 0;
    public final ArrayList C = new ArrayList();
    public final ArrayList D = new ArrayList();

    public w51(rl0 rl0Var, Context context, int i10, int i11, boolean z4, Utilities.Callback2 callback2, org.telegram.ui.ActionBar.f6 f6Var) {
        this.d = rl0Var;
        this.e = context;
        this.f30146f = i10;
        this.h = i11;
        this.f30147n = z4;
        this.f30149s = callback2;
        this.v = f6Var;
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
    public boolean D(f2.l1 l1Var) {
        int i10 = l1Var.f5777f;
        i51 G = G(l1Var.b());
        if (i10 >= 10000) {
            h51 F = i51.F(i10);
            if (F == null || !F.isClickable()) {
                return false;
            }
        } else if (i10 != 3 && i10 != 5 && i10 != 6 && i10 != 30 && i10 != 4 && i10 != 10 && i10 != 44 && i10 != 11 && i10 != 12 && i10 != 17 && i10 != 16 && i10 != 29 && i10 != 25 && i10 != 27 && i10 != 32 && i10 != 33 && i10 != 35 && i10 != 36 && i10 != 37 && i10 != 41 && i10 != 39 && i10 != 40 && i10 != 38) {
            return false;
        }
        if (G != null && !G.f25581g) {
            return false;
        }
        return true;
    }

    public final void F(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.D;
            if (i10 < arrayList.size()) {
                u51 u51Var = (u51) arrayList.get(i10);
                this.I.run(Integer.valueOf(i10), new ArrayList(this.f30151x.subList(u51Var.f29112a, u51Var.f29113b + 1)));
                this.H = false;
            }
        }
    }

    public final i51 G(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f30151x;
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
            ArrayList arrayList = this.D;
            if (i11 < arrayList.size()) {
                u51 u51Var = (u51) arrayList.get(i11);
                if (i10 >= u51Var.f29112a && i10 <= u51Var.f29113b) {
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
        i51 G = G(i10);
        i51 G2 = G(i10 + 1);
        if (G != null && !G.f25583j && G2 != null && K(G2.f1830a) == K(G.f1830a)) {
            return true;
        }
        return false;
    }

    public final void L() {
        u51 u51Var = this.F;
        if (u51Var != null) {
            u51Var.f29113b = Math.max(0, this.f30151x.size() - 1);
        }
    }

    public final int M() {
        ?? obj = new Object();
        this.F = obj;
        obj.f29112a = this.f30151x.size();
        u51 u51Var = this.F;
        u51Var.f29113b = -1;
        ArrayList arrayList = this.D;
        arrayList.add(u51Var);
        return arrayList.size() - 1;
    }

    public void N(boolean z4) {
        rl0 rl0Var = this.d;
        if (rl0Var != null && rl0Var.b0()) {
            rl0Var.post(new kv0(3, this, z4));
        } else {
            P(z4);
        }
    }

    public final void O(f2.l1 l1Var) {
        int i10;
        View view = l1Var.f5774a;
        if (view instanceof org.telegram.ui.ActionBar.a6) {
            ((org.telegram.ui.ActionBar.a6) view).e();
            int i11 = l1Var.f5777f;
            if (this.f30148r) {
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
                if (this.f30147n) {
                    i10 = org.telegram.ui.ActionBar.j6.f19952h5;
                } else {
                    i10 = org.telegram.ui.ActionBar.j6.f19881d6;
                }
                view.setBackgroundColor(I(i10));
            }
        }
    }

    public final void P(boolean z4) {
        rl0 rl0Var = this.d;
        if (rl0Var == null || !rl0Var.b0()) {
            ArrayList arrayList = this.f30150w;
            arrayList.clear();
            ArrayList arrayList2 = this.f30151x;
            arrayList.addAll(arrayList2);
            arrayList2.clear();
            this.E = null;
            this.C.clear();
            this.D.clear();
            Utilities.Callback2 callback2 = this.f30149s;
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

    public final void Q(f2.l1 l1Var, boolean z4) {
        if (l1Var != null) {
            View view = l1Var.f5774a;
            int i10 = l1Var.f5777f;
            if (i10 >= 10000) {
                h51 F = i51.F(i10);
                if (F != null) {
                    F.attachedView(this.d, view, G(l1Var.b()));
                }
            } else if (i10 != 16) {
            } else {
                ((uf.l1) view).setReorder(z4);
            }
        }
    }

    public final void R() {
        rl0 rl0Var = this.d;
        if (rl0Var != null) {
            ArrayList arrayList = rl0Var.H2;
            if (arrayList == null) {
                rl0Var.H2 = new ArrayList();
            } else {
                arrayList.clear();
            }
            ArrayList arrayList2 = this.C;
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                u51 u51Var = (u51) obj;
                rl0Var.H2.add(Long.valueOf(AndroidUtilities.pack(u51Var.f29112a, u51Var.f29113b)));
            }
        }
    }

    public final void S() {
        ArrayList arrayList = this.f30150w;
        arrayList.clear();
        ArrayList arrayList2 = this.f30151x;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        this.C.clear();
        this.D.clear();
        Utilities.Callback2 callback2 = this.f30149s;
        if (callback2 != null) {
            callback2.run(arrayList2, this);
        }
        R();
    }

    public final void T() {
        u51 u51Var = this.E;
        if (u51Var != null) {
            u51Var.f29113b = Math.max(0, (this.f30151x.size() + this.B) - 1);
            u51 u51Var2 = this.E;
            if (u51Var2.f29112a == u51Var2.f29113b) {
                this.C.remove(u51Var2);
            }
            this.E = null;
        }
    }

    public final void U() {
        ?? obj = new Object();
        this.E = obj;
        obj.f29112a = this.f30151x.size() + this.B;
        u51 u51Var = this.E;
        u51Var.f29113b = -1;
        this.C.add(u51Var);
    }

    @Override
    public final int h() {
        return this.f30151x.size();
    }

    @Override
    public final int j(int i10) {
        i51 G = G(i10);
        if (G == null) {
            return 0;
        }
        return G.f1830a;
    }

    @Override
    public void v(f2.l1 r36, int r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.w51.v(f2.l1, int):void");
    }

    @Override
    public f2.l1 x(ViewGroup viewGroup, int i10) {
        int i11;
        View dVar;
        View l4Var;
        org.telegram.ui.Cells.r8 r8Var;
        org.telegram.ui.Cells.y1 y1Var;
        int i12;
        int i13;
        float f10;
        float f11;
        int i14;
        int i15;
        org.telegram.ui.Cells.l4 l4Var2;
        int i16;
        boolean z4 = this.f30147n;
        if (z4) {
            i11 = org.telegram.ui.ActionBar.j6.f19952h5;
        } else {
            i11 = org.telegram.ui.ActionBar.j6.f19881d6;
        }
        Context context = this.e;
        if (i10 >= 10000) {
            h51 F = i51.F(i10);
            if (F != null) {
                y1Var = F.createView(this.e, this.d, this.f30146f, this.h, this.v);
            } else {
                y1Var = new View(context);
            }
        } else {
            int i17 = 3;
            boolean z10 = true;
            org.telegram.ui.ActionBar.f6 f6Var = this.v;
            switch (i10) {
                case -4:
                case -1:
                    dVar = new dh.d(context, 21);
                    if (i10 == -4) {
                        dVar.setTag(-33024);
                    }
                    y1Var = dVar;
                    break;
                case -3:
                    ?? frameLayout = new FrameLayout(context);
                    frameLayout.f28902a = 0;
                    y1Var = frameLayout;
                    break;
                case -2:
                    y1Var = new dh.d(context, 22);
                    break;
                case 0:
                    if (z4) {
                        r8Var = new org.telegram.ui.Cells.l4(this.e, org.telegram.ui.ActionBar.j6.L6, 21, 15, 0, false, false, this.v);
                        y1Var = r8Var;
                        break;
                    } else {
                        y1Var = new org.telegram.ui.Cells.l4(context, f6Var);
                        break;
                    }
                case 1:
                    l4Var = new org.telegram.ui.Cells.l4(this.e, org.telegram.ui.ActionBar.j6.G6, 17, 15, false, this.v);
                    y1Var = l4Var;
                    break;
                case 2:
                    y1Var = new b21(context, f6Var);
                    break;
                case 3:
                    y1Var = new org.telegram.ui.Cells.n8(context, f6Var);
                    break;
                case 4:
                case 9:
                    org.telegram.ui.Cells.r8 r8Var2 = new org.telegram.ui.Cells.r8(context, f6Var);
                    r8Var = r8Var2;
                    if (i10 == 9) {
                        r8Var2.setDrawCheckRipple(true);
                        r8Var2.d(org.telegram.ui.ActionBar.j6.f19935g6, org.telegram.ui.ActionBar.j6.O6, org.telegram.ui.ActionBar.j6.P6, org.telegram.ui.ActionBar.j6.Q6, org.telegram.ui.ActionBar.j6.R6);
                        r8Var2.setTypeface(AndroidUtilities.bold());
                        r8Var2.setHeight(56);
                        r8Var = r8Var2;
                    }
                    y1Var = r8Var;
                    break;
                case 5:
                case 6:
                    if (i10 != 6) {
                        z10 = false;
                    }
                    l4Var = new org.telegram.ui.Cells.i5(21, 60, this.e, this.v, z10);
                    y1Var = l4Var;
                    break;
                case 7:
                case 8:
                default:
                    y1Var = new org.telegram.ui.Cells.z8(context, f6Var);
                    break;
                case 10:
                    ?? frameLayout2 = new FrameLayout(context);
                    TextView textView = new TextView(context);
                    frameLayout2.f22278b = textView;
                    org.telegram.ui.b.q(textView, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false), 1, 16.0f, 1);
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
                    frameLayout2.addView(textView, k7.b6.d(-1, -1.0f, i18, f10, 0.0f, f11, 0.0f));
                    TextView textView2 = new TextView(context);
                    frameLayout2.f22279c = textView2;
                    org.telegram.ui.b.q(textView2, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.I6, false), 1, 16.0f, 1);
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
                    frameLayout2.addView(textView2, k7.b6.d(-2, -1.0f, i15 | 48, 23.0f, 0.0f, 23.0f, 0.0f));
                    RadioButton radioButton = new RadioButton(context);
                    frameLayout2.d = radioButton;
                    radioButton.setSize(AndroidUtilities.dp(20.0f));
                    radioButton.b(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19936g7, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19954h7, false));
                    if (!LocaleController.isRTL) {
                        i17 = 5;
                    }
                    frameLayout2.addView(radioButton, k7.b6.d(22, 22.0f, i17 | 48, 20.0f, 15.0f, 20.0f, 0.0f));
                    frameLayout2.b();
                    y1Var = frameLayout2;
                    break;
                case 11:
                case 12:
                    if (i10 != 12) {
                        i17 = 0;
                    }
                    org.telegram.ui.Cells.ua uaVar = new org.telegram.ui.Cells.ua(context, 6, i17, false);
                    uaVar.setSelfAsSavedMessages(true);
                    y1Var = uaVar;
                    break;
                case 13:
                    l4Var = new org.telegram.ui.Cells.ua(6, 0, this.e, null, false, true);
                    y1Var = l4Var;
                    break;
                case 14:
                    y1Var = new uv0(context, f6Var);
                    break;
                case 15:
                    y1Var = new org.telegram.ui.Cells.w7(context, f6Var);
                    break;
                case 16:
                    if (this.I == null) {
                        z10 = false;
                    }
                    y1Var = new uf.l1(context, f6Var, z10);
                    break;
                case 17:
                    y1Var = new uf.k1(context, f6Var);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    if (this.f30152y == null) {
                        this.f30152y = new vf.f(null);
                    }
                    vf.f fVar = this.f30152y;
                    int i19 = this.h;
                    y1Var = new ma1(this.e, this.f30146f, i10 - 18, fVar, i19);
                    break;
                case 24:
                    y1Var = new org.telegram.ui.ke(context, f6Var);
                    break;
                case 25:
                    y1Var = new org.telegram.ui.le(context, f6Var);
                    break;
                case 26:
                    l4Var2 = new org.telegram.ui.Cells.l4(this.e, org.telegram.ui.ActionBar.j6.G6, 23, 20, 0, false, false, this.v);
                    l4Var2.setTextSize(20.0f);
                    y1Var = l4Var2;
                    break;
                case 27:
                    ph.d8 d8Var = new ph.d8(context, f6Var);
                    d8Var.d(false, false);
                    y1Var = d8Var;
                    break;
                case 28:
                    dVar = new View(context);
                    dVar.setTag(-33024);
                    y1Var = dVar;
                    break;
                case 29:
                    y1Var = new uf.o(context, f6Var);
                    break;
                case 30:
                    y1Var = new org.telegram.ui.Cells.c9(context, f6Var);
                    break;
                case 31:
                    rl0 rl0Var = this.d;
                    if (rl0Var != null && rl0Var.a1()) {
                        org.telegram.ui.Cells.t3 t3Var = new org.telegram.ui.Cells.t3(context, 28, f6Var);
                        t3Var.setNoBackground(true);
                        y1Var = t3Var;
                        break;
                    } else {
                        y1Var = new org.telegram.ui.Cells.t3(context, f6Var);
                        break;
                    }
                    break;
                case 32:
                    y1Var = new org.telegram.ui.Cells.g6(context, null);
                    break;
                case 33:
                    y1Var = new org.telegram.ui.Cells.q2(context, true);
                    break;
                case 34:
                    u00 u00Var = new u00(context, f6Var);
                    u00Var.setIsSingleCell(true);
                    y1Var = u00Var;
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
                    org.telegram.ui.Cells.y1 y1Var2 = new org.telegram.ui.Cells.y1(i16, 21, this.e, this.v, true);
                    y1Var2.getCheckBoxRound().b(org.telegram.ui.ActionBar.j6.V6, org.telegram.ui.ActionBar.j6.f19936g7, org.telegram.ui.ActionBar.j6.f20007k7);
                    y1Var = y1Var2;
                    break;
                case 38:
                    y1Var = new org.telegram.ui.Cells.z1(context, f6Var);
                    break;
                case 39:
                case 40:
                    y1Var = new org.telegram.ui.Cells.q8(context);
                    break;
                case 42:
                    l4Var2 = new org.telegram.ui.Cells.l4(this.e, org.telegram.ui.ActionBar.j6.L6, 21, 15, 0, false, true, this.v);
                    y1Var = l4Var2;
                    break;
                case 43:
                    y1Var = new org.telegram.ui.Cells.z9(context, 0, f6Var);
                    break;
                case 44:
                    y1Var = new org.telegram.ui.Cells.h6(context, false);
                    break;
            }
        }
        if (this.f30148r) {
            if (i10 < 10000) {
                switch (i10) {
                }
            }
            y1Var.setBackgroundColor(I(i11));
        }
        return new f2.l1(y1Var);
    }

    @Override
    public void y(f2.l1 l1Var) {
        Q(l1Var, this.J);
        O(l1Var);
    }
}
