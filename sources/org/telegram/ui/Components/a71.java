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
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public class a71 extends pg.b {
    public jg.f E;
    public w61 I;
    public w61 J;
    public int K;
    public boolean L;
    public Utilities.Callback2 M;
    public boolean N;
    public final lm0 d;
    public final Context e;
    public final int f24644f;
    public final int h;
    public final boolean f24645n;
    public boolean f24647s;
    public Utilities.Callback2 v;
    public final org.telegram.ui.ActionBar.g6 f24648w;
    public boolean f24646r = true;
    public final ArrayList f24649x = new ArrayList();
    public final ArrayList f24650y = new ArrayList();
    public int F = 0;
    public final ArrayList G = new ArrayList();
    public final ArrayList H = new ArrayList();
    public final z61 O = new z61(this);

    public a71(lm0 lm0Var, Context context, int i10, int i11, boolean z10, Utilities.Callback2 callback2, org.telegram.ui.ActionBar.g6 g6Var) {
        this.d = lm0Var;
        this.e = context;
        this.f24644f = i10;
        this.h = i11;
        this.f24645n = z10;
        this.v = callback2;
        this.f24648w = g6Var;
        N(false);
    }

    public static boolean K(int i10) {
        if (i10 >= 10000) {
            k61 F = l61.F(i10);
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
        int i10 = b1Var.f46345f;
        l61 G = G(b1Var.b());
        if (i10 >= 10000) {
            k61 F = l61.F(i10);
            if (F == null || !F.isClickable()) {
                return false;
            }
        } else if (i10 != 3 && i10 != 5 && i10 != 6 && i10 != 30 && i10 != 4 && i10 != 10 && i10 != 44 && i10 != 11 && i10 != 12 && i10 != 17 && i10 != 16 && i10 != 29 && i10 != 25 && i10 != 27 && i10 != 32 && i10 != 33 && i10 != 35 && i10 != 36 && i10 != 37 && i10 != 41 && i10 != 39 && i10 != 40 && i10 != 38) {
            return false;
        }
        if (G != null && !G.f28223g) {
            return false;
        }
        return true;
    }

    public final void F(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.H;
            if (i10 < arrayList.size()) {
                w61 w61Var = (w61) arrayList.get(i10);
                this.M.run(Integer.valueOf(i10), new ArrayList(this.f24650y.subList(w61Var.f32135a, w61Var.f32136b + 1)));
                this.L = false;
            }
        }
    }

    public final l61 G(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f24650y;
            if (i10 < arrayList.size()) {
                return (l61) arrayList.get(i10);
            }
            return null;
        }
        return null;
    }

    public final int H(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.H;
            if (i11 < arrayList.size()) {
                w61 w61Var = (w61) arrayList.get(i11);
                if (i10 >= w61Var.f32135a && i10 <= w61Var.f32136b) {
                    return i11;
                }
                i11++;
            } else {
                return -1;
            }
        }
    }

    public int I(int i10) {
        return org.telegram.ui.ActionBar.k6.w0(i10, this.f24648w);
    }

    public final boolean J(int i10) {
        l61 G = G(i10);
        l61 G2 = G(i10 + 1);
        if (G != null && !G.f28225j && G2 != null && K(G2.f44712a) == K(G.f44712a)) {
            return true;
        }
        return false;
    }

    public final void L() {
        w61 w61Var = this.J;
        if (w61Var != null) {
            w61Var.f32136b = Math.max(0, this.f24650y.size() - 1);
        }
    }

    public final int M() {
        ?? obj = new Object();
        this.J = obj;
        obj.f32135a = this.f24650y.size();
        w61 w61Var = this.J;
        w61Var.f32136b = -1;
        ArrayList arrayList = this.H;
        arrayList.add(w61Var);
        return arrayList.size() - 1;
    }

    public void N(boolean z10) {
        lm0 lm0Var = this.d;
        if (lm0Var != null && lm0Var.b0()) {
            lm0Var.post(new z50(9, this, z10));
        } else {
            P(z10);
        }
    }

    public final void O(s4.b1 b1Var) {
        int i10;
        View view = b1Var.f46342a;
        if (view instanceof org.telegram.ui.ActionBar.b6) {
            ((org.telegram.ui.ActionBar.b6) view).updateColors();
            Object tag = view.getTag(R.id.theme_generation);
            int i11 = org.telegram.ui.ActionBar.r6.f21818b;
            int i12 = b1Var.f46345f;
            if (this.f24646r) {
                if (i12 < 10000) {
                    switch (i12) {
                    }
                }
                if (!(tag instanceof Integer) || ((Integer) tag).intValue() != i11) {
                    if (this.f24645n) {
                        i10 = org.telegram.ui.ActionBar.k6.f21255h5;
                    } else {
                        i10 = org.telegram.ui.ActionBar.k6.f21184d6;
                    }
                    view.setBackgroundColor(I(i10));
                }
            }
            view.setTag(R.id.theme_generation, Integer.valueOf(i11));
        }
    }

    public final void P(boolean z10) {
        lm0 lm0Var = this.d;
        if (lm0Var == null || !lm0Var.b0()) {
            ArrayList arrayList = this.f24649x;
            arrayList.clear();
            ArrayList arrayList2 = this.f24650y;
            arrayList.addAll(arrayList2);
            arrayList2.clear();
            this.I = null;
            this.G.clear();
            this.H.clear();
            Utilities.Callback2 callback2 = this.v;
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
            View view = b1Var.f46342a;
            int i10 = b1Var.f46345f;
            if (i10 >= 10000) {
                k61 F = l61.F(i10);
                if (F != null) {
                    F.attachedView(this.d, view, G(b1Var.b()));
                }
            } else if (i10 != 16) {
            } else {
                ((ig.v1) view).setReorder(z10);
            }
        }
    }

    public final void R() {
        lm0 lm0Var = this.d;
        if (lm0Var != null) {
            ArrayList arrayList = lm0Var.J2;
            if (arrayList == null) {
                lm0Var.J2 = new ArrayList();
            } else {
                arrayList.clear();
            }
            ArrayList arrayList2 = this.G;
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                w61 w61Var = (w61) obj;
                lm0Var.J2.add(Long.valueOf(AndroidUtilities.pack(w61Var.f32135a, w61Var.f32136b)));
            }
        }
    }

    public final void S() {
        ArrayList arrayList = this.f24649x;
        arrayList.clear();
        ArrayList arrayList2 = this.f24650y;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        this.G.clear();
        this.H.clear();
        Utilities.Callback2 callback2 = this.v;
        if (callback2 != null) {
            callback2.run(arrayList2, this);
        }
        R();
    }

    public final void T() {
        w61 w61Var = this.I;
        if (w61Var != null) {
            w61Var.f32136b = Math.max(0, (this.f24650y.size() + this.F) - 1);
            w61 w61Var2 = this.I;
            if (w61Var2.f32135a == w61Var2.f32136b) {
                this.G.remove(w61Var2);
            }
            this.I = null;
        }
    }

    public final void U() {
        ?? obj = new Object();
        this.I = obj;
        obj.f32135a = this.f24650y.size() + this.F;
        w61 w61Var = this.I;
        w61Var.f32136b = -1;
        this.G.add(w61Var);
    }

    @Override
    public final int h() {
        return this.f24650y.size();
    }

    @Override
    public final int j(int i10) {
        l61 G = G(i10);
        if (G == null) {
            return 0;
        }
        return G.f44712a;
    }

    @Override
    public void v(s4.b1 r37, int r38) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.a71.v(s4.b1, int):void");
    }

    @Override
    public s4.b1 x(ViewGroup viewGroup, int i10) {
        int i11;
        View h4Var;
        View l4Var;
        org.telegram.ui.Cells.w8 w8Var;
        org.telegram.ui.Cells.z1 z1Var;
        int i12;
        int i13;
        float f7;
        float f10;
        int i14;
        int i15;
        org.telegram.ui.Cells.l4 l4Var2;
        int i16;
        boolean z10 = this.f24645n;
        if (z10) {
            i11 = org.telegram.ui.ActionBar.k6.f21255h5;
        } else {
            i11 = org.telegram.ui.ActionBar.k6.f21184d6;
        }
        Context context = this.e;
        if (i10 >= 10000) {
            k61 F = l61.F(i10);
            if (F != null) {
                z1Var = F.createView(this.e, this.d, this.f24644f, this.h, this.f24648w);
            } else {
                z1Var = new View(context);
            }
        } else {
            int i17 = 3;
            int i18 = 8;
            boolean z11 = true;
            org.telegram.ui.ActionBar.g6 g6Var = this.f24648w;
            switch (i10) {
                case -4:
                case -1:
                    h4Var = new ci.h4(context, 21);
                    if (i10 == -4) {
                        h4Var.setTag(-33024);
                    }
                    z1Var = h4Var;
                    break;
                case -3:
                    ?? frameLayout = new FrameLayout(context);
                    frameLayout.f31342a = 0;
                    z1Var = frameLayout;
                    break;
                case -2:
                    z1Var = new ci.h4(context, 22);
                    break;
                case 0:
                    if (z10) {
                        w8Var = new org.telegram.ui.Cells.l4(this.e, org.telegram.ui.ActionBar.k6.L6, 21, 15, 0, false, false, this.f24648w);
                        z1Var = w8Var;
                        break;
                    } else {
                        z1Var = new org.telegram.ui.Cells.l4(context, g6Var);
                        break;
                    }
                case 1:
                    l4Var = new org.telegram.ui.Cells.l4(this.e, org.telegram.ui.ActionBar.k6.G6, 17, 15, false, this.f24648w);
                    z1Var = l4Var;
                    break;
                case 2:
                    z1Var = new z21(context, g6Var);
                    break;
                case 3:
                    org.telegram.ui.Cells.r8 r8Var = new org.telegram.ui.Cells.r8(context, g6Var);
                    r8Var.setCompactLayout(this.f24647s);
                    z1Var = r8Var;
                    break;
                case 4:
                case 9:
                    org.telegram.ui.Cells.w8 w8Var2 = new org.telegram.ui.Cells.w8(context, g6Var);
                    w8Var = w8Var2;
                    if (i10 == 9) {
                        w8Var2.setDrawCheckRipple(true);
                        w8Var2.d(org.telegram.ui.ActionBar.k6.f21237g6, org.telegram.ui.ActionBar.k6.O6, org.telegram.ui.ActionBar.k6.P6, org.telegram.ui.ActionBar.k6.Q6, org.telegram.ui.ActionBar.k6.R6);
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
                    l4Var = new org.telegram.ui.Cells.i5(21, 60, this.e, this.f24648w, z11);
                    z1Var = l4Var;
                    break;
                case 7:
                case 8:
                default:
                    z1Var = new org.telegram.ui.Cells.e9(context, g6Var);
                    break;
                case 10:
                    ?? frameLayout2 = new FrameLayout(context);
                    TextView textView = new TextView(context);
                    frameLayout2.f23240b = textView;
                    org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.G6, null);
                    org.telegram.messenger.tl.u(textView, 1, 16.0f, 1, 1);
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
                    frameLayout2.f23241c = textView2;
                    org.telegram.ui.ActionBar.r6.W(textView2, org.telegram.ui.ActionBar.k6.I6, null);
                    org.telegram.messenger.tl.u(textView2, 1, 16.0f, 1, 1);
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
                    org.telegram.ui.ActionBar.r6.Q(radioButton, org.telegram.ui.ActionBar.k6.f21238g7, org.telegram.ui.ActionBar.k6.f21257h7, null);
                    if (!LocaleController.isRTL) {
                        i17 = 5;
                    }
                    frameLayout2.addView(radioButton, w7.z5.d(22, 22.0f, i17 | 48, 20.0f, 15.0f, 20.0f, 0.0f));
                    frameLayout2.b();
                    z1Var = frameLayout2;
                    break;
                case 11:
                case 12:
                    if (i10 != 12) {
                        i17 = 0;
                    }
                    org.telegram.ui.Cells.wa waVar = new org.telegram.ui.Cells.wa(context, 6, i17, false);
                    waVar.setSelfAsSavedMessages(true);
                    z1Var = waVar;
                    break;
                case 13:
                    l4Var = new org.telegram.ui.Cells.wa(6, 0, this.e, null, false, true);
                    z1Var = l4Var;
                    break;
                case 14:
                    z1Var = new rw0(context, g6Var);
                    break;
                case 15:
                    z1Var = new org.telegram.ui.Cells.y7(context, g6Var);
                    break;
                case 16:
                    if (this.M == null) {
                        z11 = false;
                    }
                    z1Var = new ig.v1(context, g6Var, z11);
                    break;
                case 17:
                    z1Var = new ig.t1(context, g6Var);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    if (this.E == null) {
                        this.E = new jg.f(null);
                    }
                    z1Var = new org.telegram.ui.r91(this.e, this.f24644f, i10 - 18, this.E, this.h);
                    break;
                case 24:
                    z1Var = new org.telegram.ui.ge(context, g6Var);
                    break;
                case 25:
                    z1Var = new org.telegram.ui.he(context, g6Var);
                    break;
                case 26:
                    l4Var2 = new org.telegram.ui.Cells.l4(this.e, org.telegram.ui.ActionBar.k6.G6, 23, 20, 0, false, false, this.f24648w);
                    l4Var2.setTextSize(20.0f);
                    z1Var = l4Var2;
                    break;
                case 27:
                    ei.q9 q9Var = new ei.q9(context, g6Var);
                    q9Var.d(false, false);
                    z1Var = q9Var;
                    break;
                case 28:
                    h4Var = new View(context);
                    h4Var.setTag(-33024);
                    z1Var = h4Var;
                    break;
                case 29:
                    z1Var = new ig.t(context, g6Var);
                    break;
                case 30:
                    z1Var = new org.telegram.ui.Cells.h9(context, g6Var);
                    break;
                case 31:
                    lm0 lm0Var = this.d;
                    if (lm0Var != null && lm0Var.c1()) {
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
                    z1Var = new org.telegram.ui.Cells.i6(context, null);
                    break;
                case 33:
                    z1Var = new org.telegram.ui.Cells.q2(context, true);
                    break;
                case 34:
                    z00 z00Var = new z00(context, g6Var);
                    z00Var.setIsSingleCell(true);
                    z1Var = z00Var;
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
                        org.telegram.ui.Cells.z1 z1Var2 = new org.telegram.ui.Cells.z1(i16, 21, this.e, this.f24648w, true);
                        z1Var2.getCheckBoxRound().b(org.telegram.ui.ActionBar.k6.V6, org.telegram.ui.ActionBar.k6.f21238g7, org.telegram.ui.ActionBar.k6.f21312k7);
                        z1Var = z1Var2;
                        break;
                    }
                    i16 = i18;
                    org.telegram.ui.Cells.z1 z1Var22 = new org.telegram.ui.Cells.z1(i16, 21, this.e, this.f24648w, true);
                    z1Var22.getCheckBoxRound().b(org.telegram.ui.ActionBar.k6.V6, org.telegram.ui.ActionBar.k6.f21238g7, org.telegram.ui.ActionBar.k6.f21312k7);
                    z1Var = z1Var22;
                case 38:
                    z1Var = new org.telegram.ui.Cells.a2(context, g6Var);
                    break;
                case 39:
                case 40:
                    z1Var = new org.telegram.ui.Cells.v8(context);
                    break;
                case 42:
                    l4Var2 = new org.telegram.ui.Cells.l4(this.e, org.telegram.ui.ActionBar.k6.L6, 21, 15, 0, false, true, this.f24648w);
                    z1Var = l4Var2;
                    break;
                case 43:
                    z1Var = new org.telegram.ui.Cells.ca(context, 0, g6Var);
                    break;
                case 44:
                    z1Var = new org.telegram.ui.Cells.j6(context, false);
                    break;
            }
        }
        if (this.f24646r) {
            if (i10 < 10000) {
                switch (i10) {
                }
            }
            org.telegram.ui.ActionBar.r6.i(i11, z1Var, this.O);
        }
        return new s4.b1(z1Var);
    }

    @Override
    public void y(s4.b1 b1Var) {
        Q(b1Var, this.N);
        O(b1Var);
    }
}
