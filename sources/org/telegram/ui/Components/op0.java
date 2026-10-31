package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
public class op0 extends org.telegram.ui.ActionBar.z2 implements org.telegram.messenger.us {
    public static final int Q2 = 0;
    public final s4.r A1;
    public boolean A2;
    public final zy B1;
    public org.telegram.ui.ActionBar.k1 B2;
    public final hp0 C1;
    public int C2;
    public final mp0 D1;
    public boolean D2;
    public final lp0 E1;
    public boolean E2;
    public final ArrayList F1;
    public int F2;
    public final String[] G1;
    public final tg.f G2;
    public final int H1;
    public final hi.c H2;
    public final dw0 I1;
    public final tg.b I2;
    public final Drawable J1;
    public final tg.b J2;
    public final View[] K1;
    public final tg.b K2;
    public final AnimatorSet[] L1;
    public final qg L2;
    public final a0.h M1;
    public final vg.f M2;
    public final HashMap N1;
    public final tg.c N2;
    public final cp0 O1;
    public final vg.f O2;
    public int P1;
    public boolean P2;
    public boolean Q1;
    public final boolean R1;
    public boolean S1;
    public final int T1;
    public final FrameLayout U1;
    public final LinearLayout V1;
    public final ep W1;
    public final org.telegram.ui.un X1;
    public final Activity Y1;
    public final boolean Z1;
    public boolean a2;
    public final TextPaint f29113b2;
    public TLRPC.TL_exportedMessageLink f29114c2;
    public boolean f29115d2;
    public boolean f29116e2;
    public final boolean f29117f2;
    public final String[] f29118g2;
    public int f29119h2;
    public final FrameLayout f29120i1;
    public int f29121i2;
    public final so0 f29122j1;
    public boolean f29123j2;
    public final to0 f29124k1;
    public ep0 f29125k2;
    public final bi.f2 l1;
    public float f29126l2;
    public final so0 f29127m1;
    public float f29128m2;
    public final FrameLayout f29129n1;
    public float f29130n2;
    public float f29131o1;
    public ValueAnimator f29132o2;
    public final bi.t0 f29133p1;
    public final wj0 f29134p2;
    public final FrameLayout f29135q1;
    public final h10 f29136q2;
    public final org.telegram.ui.ActionBar.u5 f29137r1;
    public final org.telegram.ui.ActionBar.l f29138r2;
    public final FrameLayout f29139s1;
    public boolean f29140s2;
    public final FrameLayout f29141t1;
    public o1.j f29142t2;
    public final LinearLayout f29143u1;
    public TLRPC.Dialog f29144u2;
    public AnimatorSet f29145v1;
    public final bp0 f29146v2;
    public final tk0 f29147w1;
    public ArrayList f29148w2;
    public final oo0 f29149x1;
    public TL_stories.StoryItem f29150x2;
    public final oo0 f29151y1;
    public i0.c f29152y2;
    public final s4.r f29153z1;
    public int f29154z2;

    public op0(Context context, ArrayList arrayList, String str, boolean z10, String str2, boolean z11, org.telegram.ui.ActionBar.p6 p6Var) {
        this(context, null, arrayList, str, null, z10, str2, null, z11, false, false, null, p6Var);
    }

    public static void I0(op0 op0Var) {
        oo0 oo0Var;
        int i10;
        int i11;
        oo0 oo0Var2 = op0Var.f29149x1;
        oo0 oo0Var3 = op0Var.f29151y1;
        tk0 tk0Var = op0Var.f29147w1;
        if (!op0Var.f29123j2) {
            if (op0Var.D2) {
                oo0Var = oo0Var3;
            } else {
                oo0Var = oo0Var2;
            }
            if (oo0Var.getChildCount() > 0) {
                View childAt = oo0Var.getChildAt(0);
                for (int i12 = 0; i12 < oo0Var.getChildCount(); i12++) {
                    if (oo0Var.getChildAt(i12).getTop() < childAt.getTop()) {
                        childAt = oo0Var.getChildAt(i12);
                    }
                }
                ck0 ck0Var = (ck0) oo0Var.G(childAt);
                int top = childAt.getTop() - org.telegram.messenger.i0.L(8.0f);
                if (top > 0 && ck0Var != null && ck0Var.b() == 0) {
                    i10 = top;
                } else {
                    i10 = 0;
                }
                if (top >= 0 && ck0Var != null && ck0Var.b() == 0) {
                    op0Var.C2 = childAt.getTop();
                    op0Var.T0(false);
                } else {
                    op0Var.C2 = Integer.MAX_VALUE;
                    op0Var.T0(true);
                    top = i10;
                }
                if (tk0Var.getVisibility() == 0) {
                    if (tk0Var.getChildCount() > 0) {
                        View childAt2 = tk0Var.getChildAt(0);
                        for (int i13 = 0; i13 < tk0Var.getChildCount(); i13++) {
                            if (tk0Var.getChildAt(i13).getTop() < childAt2.getTop()) {
                                childAt2 = tk0Var.getChildAt(i13);
                            }
                        }
                        ck0 ck0Var2 = (ck0) tk0Var.G(childAt2);
                        int top2 = childAt2.getTop() - org.telegram.messenger.i0.L(8.0f);
                        if (top2 > 0 && ck0Var2 != null && ck0Var2.b() == 0) {
                            i11 = top2;
                        } else {
                            i11 = 0;
                        }
                        if (top2 >= 0 && ck0Var2 != null && ck0Var2.b() == 0) {
                            op0Var.C2 = childAt2.getTop();
                            op0Var.T0(false);
                        } else {
                            op0Var.C2 = Integer.MAX_VALUE;
                            op0Var.T0(true);
                            top2 = i11;
                        }
                        top = org.telegram.messenger.i0.W1(tk0Var.getAlpha(), top, top2);
                    } else {
                        return;
                    }
                }
                int i14 = op0Var.f29119h2;
                if (i14 != top) {
                    op0Var.f29121i2 = i14;
                    float f7 = top;
                    int i15 = (int) (op0Var.f29126l2 + f7);
                    op0Var.f29119h2 = i15;
                    oo0Var2.setTopGlowOffset(i15);
                    int i16 = (int) (op0Var.f29126l2 + f7);
                    op0Var.f29119h2 = i16;
                    oo0Var3.setTopGlowOffset(i16);
                    int i17 = (int) (f7 + op0Var.f29126l2);
                    op0Var.f29119h2 = i17;
                    tk0Var.setTopGlowOffset(i17);
                    op0Var.f29120i1.setTranslationY(op0Var.f29119h2 + op0Var.f29126l2);
                    op0Var.I1.setTranslationY(op0Var.f29119h2 + op0Var.f29126l2);
                    op0Var.f21586b.invalidate();
                }
            }
        }
    }

    public static int J0(op0 op0Var) {
        oo0 oo0Var = op0Var.f29149x1;
        if (oo0Var.getChildCount() != 0) {
            int i10 = 0;
            View childAt = oo0Var.getChildAt(0);
            ck0 ck0Var = (ck0) oo0Var.G(childAt);
            if (ck0Var != null) {
                int paddingTop = oo0Var.getPaddingTop();
                if (ck0Var.c() == 0 && childAt.getTop() >= 0) {
                    i10 = childAt.getTop();
                }
                return paddingTop - i10;
            }
            return -1000;
        }
        return -1000;
    }

    public static op0 N0(Context context, org.telegram.messenger.jj jjVar, String str, boolean z10, String str2) {
        ArrayList arrayList;
        if (jjVar != null) {
            arrayList = org.telegram.messenger.m5.j(jjVar);
        } else {
            arrayList = null;
        }
        return new op0(context, arrayList, str, null, z10, str2, null, false);
    }

    public static void W0(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        int i11;
        int w02 = org.telegram.ui.ActionBar.t6.w0(i10, p6Var);
        int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
        for (int i12 = 0; i12 < itemsCount; i12++) {
            View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i12);
            int i13 = 6;
            if (i12 == 0) {
                i11 = 6;
            } else {
                i11 = 0;
            }
            if (i12 != itemsCount - 1) {
                i13 = 0;
            }
            org.telegram.ui.ActionBar.a7.R(childAt, org.telegram.ui.ActionBar.t6.a0(w02, i11, i13), null, org.telegram.ui.ActionBar.a7.N(i10), p6Var);
        }
    }

    @Override
    public final boolean H() {
        return false;
    }

    public final void K0(boolean z10) {
        h10 h10Var = this.f29136q2;
        org.telegram.ui.ActionBar.n0 n0Var = h10Var.f26588r;
        org.telegram.ui.ActionBar.n0 n0Var2 = h10Var.f26588r;
        boolean isEmpty = TextUtils.isEmpty(n0Var.getText());
        oo0 oo0Var = this.f29149x1;
        oo0 oo0Var2 = this.f29151y1;
        boolean z11 = true;
        if (isEmpty && ((!this.d || !n0Var2.hasFocus()) && !this.E2)) {
            if (this.f29144u2 == null) {
                org.telegram.messenger.i0.Y3(oo0Var, true, 0.98f, true, true);
                org.telegram.messenger.i0.W3(oo0Var2, false);
            }
            z11 = false;
        } else {
            this.f29140s2 = true;
            if (this.f29144u2 == null) {
                org.telegram.messenger.i0.Y3(oo0Var, false, 0.98f, true, true);
                org.telegram.messenger.i0.W3(oo0Var2, true);
            }
        }
        if (this.D2 == z11 && !z10) {
            return;
        }
        this.D2 = z11;
        lp0 lp0Var = this.E1;
        lp0Var.f();
        this.C1.f();
        if (this.D2) {
            if (this.C2 == Integer.MAX_VALUE) {
                ((s4.a0) oo0Var2.getLayoutManager()).h1(0, -oo0Var2.getPaddingTop());
            } else {
                ((s4.a0) oo0Var2.getLayoutManager()).h1(0, this.C2 - oo0Var2.getPaddingTop());
            }
            lp0Var.E(n0Var2.getText().toString());
            return;
        }
        int i10 = this.C2;
        s4.r rVar = this.f29153z1;
        if (i10 == Integer.MAX_VALUE) {
            rVar.h1(0, 0);
        } else {
            rVar.h1(0, 0);
        }
    }

    @Override
    public void L() {
        super.L();
        to0 to0Var = this.f29124k1;
        if (to0Var != null) {
            to0Var.o();
        }
    }

    public final void L0() {
        float f7;
        TLRPC.Dialog dialog = this.f29144u2;
        if (dialog != null) {
            org.telegram.ui.Cells.h7 h7Var = null;
            this.f29144u2 = null;
            for (int i10 = 0; i10 < P0().getChildCount(); i10++) {
                View childAt = P0().getChildAt(i10);
                if ((childAt instanceof org.telegram.ui.Cells.h7) && ((org.telegram.ui.Cells.h7) childAt).getCurrentDialog() == dialog.f19797id) {
                    h7Var = childAt;
                }
            }
            if (h7Var == null) {
                return;
            }
            o1.j jVar = this.f29142t2;
            if (jVar != null) {
                jVar.d();
            }
            P0().setVisibility(0);
            h10 h10Var = this.f29136q2;
            h10Var.setVisibility(0);
            org.telegram.ui.ActionBar.n0 n0Var = h10Var.f26588r;
            if (this.D2 || this.E2) {
                this.f29146v2.H.v = true;
                n0Var.requestFocus();
                org.telegram.messenger.i0.J3(n0Var);
            }
            int[] iArr = new int[2];
            o1.j jVar2 = new o1.j(new o1.i(1000.0f));
            o1.k kVar = new o1.k(0.0f);
            org.telegram.ui.un unVar = this.X1;
            if (unVar != null && unVar.f42191b) {
                f7 = 10.0f;
            } else {
                f7 = 800.0f;
            }
            kVar.b(f7);
            kVar.a(1.0f);
            jVar2.f13957m = kVar;
            this.f29142t2 = jVar2;
            jVar2.b(new go0(this, h7Var, iArr, 0));
            this.f29142t2.a(new na(this, 5));
            this.f29142t2.h();
        }
    }

    public final void M0() {
        boolean z10 = false;
        if (this.f29114c2 != null || this.f29118g2[0] != null) {
            try {
                ((ClipboardManager) org.telegram.messenger.w0.f19025b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", O0()));
                ep0 ep0Var = this.f29125k2;
                if (ep0Var != null) {
                    ep0Var.B0();
                } else if (this.Y1 instanceof LaunchActivity) {
                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = this.f29114c2;
                    if (tL_exportedMessageLink != null && tL_exportedMessageLink.link.contains("/c/")) {
                        z10 = true;
                    }
                    ((LaunchActivity) this.Y1).H0(new i2.y(5, z10));
                }
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        }
    }

    public final String O0() {
        String str;
        String str2;
        String[] strArr = this.f29118g2;
        cp0 cp0Var = this.O1;
        if (cp0Var != null) {
            str2 = strArr[cp0Var.e];
        } else {
            TLRPC.TL_exportedMessageLink tL_exportedMessageLink = this.f29114c2;
            if (tL_exportedMessageLink != null) {
                str = tL_exportedMessageLink.link;
            } else {
                str = null;
            }
            if (str == null) {
                str2 = strArr[0];
            } else {
                str2 = str;
            }
        }
        ep epVar = this.W1;
        if (epVar != null && epVar.f25836a.f23919q) {
            try {
                str2 = Uri.parse(str2).buildUpon().appendQueryParameter("t", org.telegram.messenger.i0.n0(this.T1)).build().toString();
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        }
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public final tk0 P0() {
        if (!this.D2 && !this.E2) {
            return this.f29149x1;
        }
        return this.f29151y1;
    }

    public final void Q0(View view, int[] iArr, float f7) {
        float width = (view.getWidth() / 2.0f) + view.getX();
        tk0 tk0Var = this.f29147w1;
        tk0Var.setPivotX(width);
        tk0Var.setPivotY((view.getHeight() / 2.0f) + view.getY());
        float f10 = 0.25f * f7;
        float f11 = 0.75f + f10;
        tk0Var.setScaleX(f11);
        tk0Var.setScaleY(f11);
        tk0Var.setAlpha(f7);
        tk0 P0 = P0();
        P0.setPivotX((view.getWidth() / 2.0f) + view.getX());
        P0.setPivotY((view.getHeight() / 2.0f) + view.getY());
        float f12 = f10 + 1.0f;
        P0.setScaleX(f12);
        P0.setScaleY(f12);
        float f13 = 1.0f - f7;
        P0.setAlpha(f13);
        h10 h10Var = this.f29136q2;
        h10Var.setPivotX(h10Var.getWidth() / 2.0f);
        h10Var.setPivotY(0.0f);
        float f14 = (0.1f * f13) + 0.9f;
        h10Var.setScaleX(f14);
        h10Var.setScaleY(f14);
        h10Var.setAlpha(f13);
        org.telegram.ui.ActionBar.l lVar = this.f29138r2;
        lVar.getBackButton().setTranslationX((-org.telegram.messenger.i0.L(16.0f)) * f13);
        lVar.getTitleTextView().setTranslationY(org.telegram.messenger.i0.L(16.0f) * f13);
        lVar.getSubtitleTextView().setTranslationY(org.telegram.messenger.i0.L(16.0f) * f13);
        lVar.setAlpha(f7);
        tk0Var.getLocationInWindow(iArr);
        float interpolation = gr.f26496g.getInterpolation(f7);
        for (int i10 = 0; i10 < P0.getChildCount(); i10++) {
            View childAt = P0.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.h7) {
                childAt.setTranslationX((childAt.getX() - view.getX()) * 0.5f * interpolation);
                childAt.setTranslationY((childAt.getY() - view.getY()) * 0.5f * interpolation);
                if (childAt != view) {
                    childAt.setAlpha(1.0f - (Math.min(f7, 0.5f) / 0.5f));
                } else {
                    childAt.setAlpha(f13);
                }
            }
        }
        for (int i11 = 0; i11 < tk0Var.getChildCount(); i11++) {
            View childAt2 = tk0Var.getChildAt(i11);
            if (childAt2 instanceof org.telegram.ui.Cells.i7) {
                double d = 1.0f - interpolation;
                childAt2.setTranslationX((float) ((-(childAt2.getX() - view.getX())) * Math.pow(d, 2.0d)));
                float y3 = childAt2.getY();
                childAt2.setTranslationY((float) (Math.pow(d, 2.0d) * (-((tk0Var.getTranslationY() + y3) - view.getY()))));
            }
        }
        this.f21586b.requestLayout();
        P0.invalidate();
    }

    @Override
    public final int S() {
        return this.f21586b.getMeasuredHeight() - this.P1;
    }

    public final void T0(boolean z10) {
        Integer num;
        float f7;
        View[] viewArr = this.K1;
        if ((z10 && viewArr[0].getTag() != null) || (!z10 && viewArr[0].getTag() == null)) {
            View view = viewArr[0];
            if (z10) {
                num = null;
            } else {
                num = 1;
            }
            view.setTag(num);
            if (z10) {
                viewArr[0].setVisibility(0);
            }
            AnimatorSet[] animatorSetArr = this.L1;
            AnimatorSet animatorSet = animatorSetArr[0];
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSetArr[0] = animatorSet2;
            View view2 = viewArr[0];
            Property property = View.ALPHA;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(view2, property, f7));
            animatorSetArr[0].setDuration(150L);
            animatorSetArr[0].addListener(new zo0(this, z10, 0));
            animatorSetArr[0].start();
        }
    }

    public final void U0(View view, TLRPC.Dialog dialog) {
        Activity activity;
        op0 op0Var;
        ArrayList l4;
        kp0 kp0Var;
        if (dialog instanceof gp0) {
            S0(view);
        } else if (((view instanceof org.telegram.ui.Cells.h7) && ((org.telegram.ui.Cells.h7) view).F) || ((view instanceof org.telegram.ui.Cells.k6) && ((org.telegram.ui.Cells.k6) view).f22137n0)) {
            Y0(dialog.f19797id, view);
        } else {
            tk0 tk0Var = this.f29147w1;
            if (tk0Var.getVisibility() == 8 && (activity = this.Y1) != null) {
                boolean z10 = org.telegram.messenger.o5.z(dialog.f19797id);
                int i10 = this.H1;
                if (z10) {
                    TLRPC.Chat L0 = org.telegram.messenger.vp.r1(this.f21583a).L0(Long.valueOf(-dialog.f19797id));
                    if (org.telegram.messenger.w3.T(L0) && !L0.megagroup) {
                        TLRPC.Chat L02 = org.telegram.messenger.vp.r1(this.f21583a).L0(Long.valueOf(-dialog.f19797id));
                        if ((!org.telegram.messenger.w3.n(L02) && !L02.megagroup) || i10 == 2 || i10 == 3) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                            String L03 = org.telegram.messenger.cd.L0(2131745613, null);
                            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                            x1Var.R = L03;
                            if (i10 == 3) {
                                if (org.telegram.messenger.w3.P(10, L0)) {
                                    x1Var.T = org.telegram.messenger.cd.L0(2131751085, null);
                                } else {
                                    x1Var.T = org.telegram.messenger.cd.L0(2131751086, null);
                                }
                            } else if (i10 == 2) {
                                if (this.f29117f2) {
                                    x1Var.T = org.telegram.messenger.cd.L0(2131746602, null);
                                } else if (org.telegram.messenger.w3.P(10, L0)) {
                                    x1Var.T = org.telegram.messenger.cd.L0(2131751093, null);
                                } else {
                                    x1Var.T = org.telegram.messenger.cd.L0(2131751094, null);
                                }
                            } else {
                                x1Var.T = org.telegram.messenger.cd.L0(2131752440, null);
                            }
                            i0.a.s(null, 2131747847, alertDialog$Builder, null);
                            return;
                        }
                    }
                } else if (org.telegram.messenger.o5.C(dialog.f19797id) && i10 != 0) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(activity);
                    String L04 = org.telegram.messenger.cd.L0(2131745613, null);
                    org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.f20134a;
                    x1Var2.R = L04;
                    if (i10 == 3) {
                        x1Var2.T = org.telegram.messenger.cd.L0(2131744115, null);
                    } else if (i10 != 0) {
                        x1Var2.T = org.telegram.messenger.cd.L0(2131747191, null);
                    } else {
                        x1Var2.T = org.telegram.messenger.cd.L0(2131749114, null);
                    }
                    i0.a.s(null, 2131747847, alertDialog$Builder2, null);
                    return;
                }
                long j10 = dialog.f19797id;
                a0.h hVar = this.M1;
                if (hVar.h(j10) >= 0) {
                    hVar.l(dialog.f19797id);
                    this.N1.remove(dialog);
                    if (view instanceof org.telegram.ui.Cells.k6) {
                        ((org.telegram.ui.Cells.k6) view).y(false, true);
                    } else if (view instanceof org.telegram.ui.Cells.h7) {
                        ((org.telegram.ui.Cells.h7) view).b(false, true);
                    }
                    b1(1);
                    op0Var = this;
                } else {
                    TLRPC.User Z1 = org.telegram.messenger.vp.r1(this.f21583a).Z1(Long.valueOf(dialog.f19797id));
                    TLRPC.Chat L05 = org.telegram.messenger.vp.r1(this.f21583a).L0(Long.valueOf(-dialog.f19797id));
                    if ((!org.telegram.messenger.h20.u(Z1) || (((l4 = org.telegram.messenger.vp.r1(this.f21583a).f18891r7.l(-Z1.f19942id)) == null || l4.isEmpty()) && org.telegram.messenger.vp.r1(this.f21583a).f18891r7.e(-Z1.f19942id))) && (!org.telegram.messenger.o5.z(dialog.f19797id) || (!org.telegram.messenger.w3.c0(L05) && (!org.telegram.messenger.w3.p0(L05) || !org.telegram.messenger.w3.A(this.f21583a, L05, 24))))) {
                        op0Var = this;
                        hVar.k(dialog, dialog.f19797id);
                        if (view instanceof org.telegram.ui.Cells.k6) {
                            ((org.telegram.ui.Cells.k6) view).y(true, true);
                        } else if (view instanceof org.telegram.ui.Cells.h7) {
                            ((org.telegram.ui.Cells.h7) view).b(true, true);
                        }
                        b1(2);
                        long j11 = org.telegram.messenger.d20.i(op0Var.f21583a).f15165n;
                        if (op0Var.D2) {
                            hp0 hp0Var = op0Var.C1;
                            a0.h hVar2 = hp0Var.e;
                            ArrayList arrayList = hp0Var.d;
                            TLRPC.Dialog dialog2 = (TLRPC.Dialog) hVar2.f(dialog.f19797id);
                            if (dialog2 == null) {
                                hp0Var.e.k(dialog, dialog.f19797id);
                                arrayList.add(!arrayList.isEmpty(), dialog);
                            } else if (dialog2.f19797id != j11) {
                                arrayList.remove(dialog2);
                                arrayList.add(!arrayList.isEmpty(), dialog2);
                            }
                            hp0Var.f();
                            op0Var.f29140s2 = false;
                            h10 h10Var = op0Var.f29136q2;
                            h10Var.f26588r.setText("");
                            K0(false);
                            org.telegram.messenger.i0.v1(h10Var.f26588r);
                        }
                    } else {
                        this.f29144u2 = dialog;
                        this.A1.h1(0, this.f29119h2 - tk0Var.getPaddingTop());
                        AtomicReference atomicReference = new AtomicReference();
                        xo0 xo0Var = new xo0(this, dialog, atomicReference, view);
                        atomicReference.set(new org.telegram.ui.fp((Object) this, (Object) atomicReference, (Object) xo0Var, (Object) dialog, 20));
                        org.telegram.messenger.zs f7 = org.telegram.messenger.zs.f(this.f21583a);
                        int i11 = org.telegram.messenger.zs.f19675q5;
                        f7.b(xo0Var, i11);
                        if (org.telegram.messenger.vp.r1(this.f21583a).f18891r7.l(-dialog.f19797id) != null) {
                            xo0Var.didReceivedNotification(i11, this.f21583a, Long.valueOf(-dialog.f19797id));
                            return;
                        }
                        org.telegram.messenger.vp.r1(this.f21583a).f18891r7.o(-dialog.f19797id);
                        org.telegram.messenger.i0.h3((Runnable) atomicReference.get(), 300L);
                        return;
                    }
                }
                lp0 lp0Var = op0Var.E1;
                if (lp0Var != null && (kp0Var = lp0Var.H) != null) {
                    kp0Var.k(0, kp0Var.b());
                }
            }
        }
    }

    public final void V0(final boolean z10) {
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            a0.h hVar = this.M1;
            int m10 = hVar.m();
            so0 so0Var = this.f29122j1;
            to0 to0Var = this.f29124k1;
            boolean z11 = true;
            if (i14 < m10) {
                long j10 = hVar.j(i14);
                if (s4.h(getContext(), this.f21583a, j10, (so0Var.getTag() == null || to0Var.f32239a.length() <= 0) ? false : false)) {
                    return;
                }
                i14++;
            } else {
                Editable text = to0Var.getText();
                rt rtVar = to0Var.f32239a;
                final CharSequence[] charSequenceArr = {text};
                final ArrayList W = org.telegram.messenger.ui.b0(this.f21583a).W(charSequenceArr, true, true);
                ep epVar = this.W1;
                if (epVar != null && epVar.f25836a.f23919q) {
                    i10 = this.T1;
                } else {
                    i10 = -1;
                }
                ArrayList arrayList = new ArrayList();
                if (this.F1 != null) {
                    i12 = 0;
                    while (i13 < hVar.m()) {
                        long j11 = hVar.j(i13);
                        long M1 = org.telegram.messenger.vp.r1(this.f21583a).M1(j11);
                        if (M1 <= 0) {
                            M1 = org.telegram.messenger.o5.k(org.telegram.messenger.vp.r1(this.f21583a).H2(j11));
                        }
                        if (so0Var.getTag() != null && rtVar.length() > 0 && M1 > 0) {
                            i12++;
                        }
                        int i15 = (M1 > 0L ? 1 : (M1 == 0L ? 0 : -1));
                        if (i15 > 0) {
                            i12++;
                        }
                        if (i15 > 0 && !arrayList.contains(Long.valueOf(j11))) {
                            arrayList.add(Long.valueOf(j11));
                        }
                        i13++;
                    }
                } else {
                    cp0 cp0Var = this.O1;
                    if (cp0Var != null) {
                        i11 = cp0Var.e;
                    } else {
                        i11 = 0;
                    }
                    if (this.f29150x2 != null) {
                        int i16 = 0;
                        int i17 = 0;
                        while (i16 < hVar.m()) {
                            long j12 = hVar.j(i16);
                            long M12 = org.telegram.messenger.vp.r1(this.f21583a).M1(j12);
                            if (M12 <= 0) {
                                M12 = org.telegram.messenger.o5.k(org.telegram.messenger.vp.r1(this.f21583a).H2(j12));
                            }
                            int i18 = i13;
                            if (this.f29150x2 != null && so0Var.getTag() != null && rtVar.length() > 0 && charSequenceArr[i18] != null && M12 > 0) {
                                i17++;
                            }
                            int i19 = (M12 > 0L ? 1 : (M12 == 0L ? 0 : -1));
                            if (i19 > 0) {
                                i17++;
                            }
                            if (i19 > 0 && !arrayList.contains(Long.valueOf(j12))) {
                                arrayList.add(Long.valueOf(j12));
                            }
                            i16++;
                            i13 = i18;
                        }
                        i12 = i17;
                    } else {
                        int i20 = 0;
                        if (this.G1[i11] != null) {
                            for (int i21 = 0; i21 < hVar.m(); i21++) {
                                long j13 = hVar.j(i21);
                                long M13 = org.telegram.messenger.vp.r1(this.f21583a).M1(j13);
                                if (M13 <= 0) {
                                    M13 = org.telegram.messenger.o5.k(org.telegram.messenger.vp.r1(this.f21583a).H2(j13));
                                }
                                if (so0Var.getTag() != null && rtVar.length() > 0 && M13 > 0) {
                                    i20++;
                                }
                                int i22 = (M13 > 0L ? 1 : (M13 == 0L ? 0 : -1));
                                if (i22 > 0) {
                                    i20++;
                                }
                                if (i22 > 0 && !arrayList.contains(Long.valueOf(j13))) {
                                    arrayList.add(Long.valueOf(j13));
                                }
                            }
                        }
                        i12 = i20;
                    }
                }
                final int i23 = i10;
                s4.b0(this.f21583a, arrayList, i12, new org.telegram.messenger.q20() {
                    @Override
                    public final void a(Object obj) {
                        int i24;
                        int i25;
                        boolean z12;
                        Long l4;
                        int i26;
                        HashMap hashMap;
                        long j14;
                        boolean z13;
                        char c10;
                        org.telegram.messenger.jj jjVar;
                        to0 to0Var2;
                        long longValue;
                        String charSequence;
                        long longValue2;
                        Long l10;
                        boolean z14;
                        boolean z15;
                        long j15;
                        String[] strArr;
                        org.telegram.messenger.jj jjVar2;
                        org.telegram.messenger.oz b10;
                        long longValue3;
                        String charSequence2;
                        ArrayList arrayList2;
                        TLRPC.TL_forumTopic tL_forumTopic;
                        TLRPC.TL_forumTopic tL_forumTopic2;
                        Long l11;
                        boolean z16;
                        int i27;
                        boolean z17;
                        long j16;
                        Long l12;
                        CharSequence[] charSequenceArr2;
                        org.telegram.messenger.jj jjVar3;
                        org.telegram.messenger.jj jjVar4;
                        ArrayList arrayList3;
                        ?? r11;
                        long longValue4;
                        String charSequence3;
                        long longValue5;
                        HashMap hashMap2 = (HashMap) obj;
                        op0 op0Var = op0.this;
                        String[] strArr2 = op0Var.G1;
                        to0 to0Var3 = op0Var.f29124k1;
                        so0 so0Var2 = op0Var.f29122j1;
                        HashMap hashMap3 = op0Var.N1;
                        Long l13 = 0L;
                        a0.h hVar2 = op0Var.M1;
                        ArrayList arrayList4 = op0Var.F1;
                        CharSequence[] charSequenceArr3 = charSequenceArr;
                        ArrayList arrayList5 = W;
                        boolean z18 = z10;
                        if (arrayList4 != null) {
                            ArrayList arrayList6 = new ArrayList();
                            int i28 = 0;
                            boolean z19 = false;
                            while (true) {
                                if (i28 < hVar2.m()) {
                                    boolean z20 = z18;
                                    long j17 = hVar2.j(i28);
                                    boolean x22 = org.telegram.messenger.vp.r1(op0Var.f21583a).x2(j17);
                                    so0 so0Var3 = so0Var2;
                                    if (hashMap2 == null) {
                                        l11 = l13;
                                    } else {
                                        l11 = (Long) hashMap2.get(Long.valueOf(j17));
                                    }
                                    if (l11 != null && l11.longValue() > 0) {
                                        z16 = true;
                                    } else {
                                        z16 = z19;
                                    }
                                    Long l14 = l11;
                                    TLRPC.TL_forumTopic tL_forumTopic3 = (TLRPC.TL_forumTopic) hashMap3.get(hVar2.f(j17));
                                    if (tL_forumTopic3 != null && x22) {
                                        i27 = i28;
                                        z17 = x22;
                                        j16 = org.telegram.messenger.o5.o(tL_forumTopic3.from_id);
                                    } else {
                                        i27 = i28;
                                        z17 = x22;
                                        j16 = 0;
                                    }
                                    if (tL_forumTopic3 != null && !z17) {
                                        l12 = l13;
                                        arrayList2 = arrayList4;
                                        charSequenceArr2 = charSequenceArr3;
                                        jjVar3 = new org.telegram.messenger.jj(op0Var.f21583a, tL_forumTopic3.topicStartMessage, false, false);
                                    } else {
                                        l12 = l13;
                                        arrayList2 = arrayList4;
                                        charSequenceArr2 = charSequenceArr3;
                                        jjVar3 = null;
                                    }
                                    if (jjVar3 != null) {
                                        jjVar3.f16355p = true;
                                    }
                                    if (so0Var3.getTag() != null && to0Var3.f32239a.length() > 0) {
                                        CharSequence charSequence4 = charSequenceArr2[0];
                                        if (charSequence4 == null) {
                                            charSequence3 = null;
                                        } else {
                                            charSequence3 = charSequence4.toString();
                                        }
                                        r11 = 0;
                                        jjVar4 = jjVar3;
                                        ArrayList arrayList7 = arrayList5;
                                        org.telegram.messenger.oz b11 = org.telegram.messenger.oz.b(charSequence3, j17, jjVar4, jjVar3, null, true, arrayList7, null, null, z20, 0, 0, null, false);
                                        arrayList3 = arrayList7;
                                        z20 = z20;
                                        if (l14 == null) {
                                            longValue5 = 0;
                                        } else {
                                            longValue5 = l14.longValue();
                                        }
                                        b11.Q = longValue5;
                                        b11.R = j16;
                                        org.telegram.messenger.qz.C(op0Var.f21583a).r0(b11);
                                    } else {
                                        jjVar4 = jjVar3;
                                        arrayList3 = arrayList5;
                                        r11 = 0;
                                    }
                                    org.telegram.messenger.qz C = org.telegram.messenger.qz.C(op0Var.f21583a);
                                    org.telegram.messenger.jj jjVar5 = jjVar4;
                                    ArrayList arrayList8 = op0Var.F1;
                                    boolean z21 = !op0Var.A2;
                                    if (l14 == null) {
                                        longValue4 = 0;
                                    } else {
                                        longValue4 = l14.longValue();
                                    }
                                    boolean z22 = z20;
                                    int q02 = C.q0(arrayList8, j17, z21, false, z22, 0, 0, jjVar5, i23, longValue4, j16, null);
                                    if (q02 != 0) {
                                        arrayList6.add(Long.valueOf(j17));
                                    }
                                    if (hVar2.m() == 1) {
                                        s4.s0(q02, op0Var.X1, r11);
                                        if (q02 != 0) {
                                            z19 = z16;
                                            tL_forumTopic = r11;
                                            break;
                                        }
                                    }
                                    i28 = i27 + 1;
                                    arrayList5 = arrayList3;
                                    z18 = z22;
                                    so0Var2 = so0Var3;
                                    z19 = z16;
                                    l13 = l12;
                                    arrayList4 = arrayList2;
                                    charSequenceArr3 = charSequenceArr2;
                                } else {
                                    arrayList2 = arrayList4;
                                    tL_forumTopic = null;
                                    break;
                                }
                            }
                            int size = arrayList6.size();
                            int i29 = 0;
                            while (i29 < size) {
                                Object obj2 = arrayList6.get(i29);
                                i29++;
                                long longValue6 = ((Long) obj2).longValue();
                                TLRPC.Dialog dialog = (TLRPC.Dialog) hVar2.f(longValue6);
                                hVar2.l(longValue6);
                                if (dialog != null) {
                                    hashMap3.remove(dialog);
                                }
                            }
                            if (!hVar2.i()) {
                                int size2 = arrayList2.size();
                                if (hVar2.m() == 1) {
                                    tL_forumTopic2 = (TLRPC.TL_forumTopic) hashMap3.get(hVar2.n(0));
                                } else {
                                    tL_forumTopic2 = tL_forumTopic;
                                }
                                op0Var.R0(hVar2, size2, tL_forumTopic2, !z19);
                            }
                        } else {
                            boolean z23 = z18;
                            cp0 cp0Var2 = op0Var.O1;
                            if (cp0Var2 != null) {
                                i24 = cp0Var2.e;
                            } else {
                                i24 = 0;
                            }
                            if (op0Var.f29150x2 != null) {
                                int i30 = 0;
                                boolean z24 = false;
                                while (i30 < hVar2.m()) {
                                    long j18 = hVar2.j(i30);
                                    boolean x23 = org.telegram.messenger.vp.r1(op0Var.f21583a).x2(j18);
                                    if (hashMap2 == null) {
                                        l10 = l13;
                                    } else {
                                        l10 = (Long) hashMap2.get(Long.valueOf(j18));
                                    }
                                    if (l10 != null && l10.longValue() > 0) {
                                        z24 = true;
                                    }
                                    TLRPC.TL_forumTopic tL_forumTopic4 = (TLRPC.TL_forumTopic) hashMap3.get(hVar2.f(j18));
                                    if (tL_forumTopic4 != null && x23) {
                                        z14 = z24;
                                        z15 = x23;
                                        j15 = org.telegram.messenger.o5.o(tL_forumTopic4.from_id);
                                    } else {
                                        z14 = z24;
                                        z15 = x23;
                                        j15 = 0;
                                    }
                                    if (tL_forumTopic4 != null && !z15) {
                                        strArr = strArr2;
                                        jjVar2 = new org.telegram.messenger.jj(op0Var.f21583a, tL_forumTopic4.topicStartMessage, false, false);
                                    } else {
                                        strArr = strArr2;
                                        jjVar2 = null;
                                    }
                                    if (op0Var.f29150x2 == null) {
                                        if (so0Var2.getTag() != null && to0Var3.f32239a.length() > 0) {
                                            CharSequence charSequence5 = charSequenceArr3[0];
                                            if (charSequence5 == null) {
                                                charSequence2 = null;
                                            } else {
                                                charSequence2 = charSequence5.toString();
                                            }
                                            boolean z25 = z23;
                                            b10 = org.telegram.messenger.oz.b(charSequence2, j18, jjVar2, jjVar2, null, true, arrayList5, null, null, z25, 0, 0, null, false);
                                            z23 = z25;
                                        } else {
                                            b10 = org.telegram.messenger.oz.b(strArr[i24], j18, jjVar2, jjVar2, null, true, null, null, null, z23, 0, 0, null, false);
                                        }
                                    } else {
                                        if (so0Var2.getTag() != null && to0Var3.f32239a.length() > 0 && charSequenceArr3[0] != null) {
                                            org.telegram.messenger.jj jjVar6 = jjVar2;
                                            jjVar2 = jjVar6;
                                            org.telegram.messenger.qz.C(op0Var.f21583a).r0(org.telegram.messenger.oz.b(charSequenceArr3[0].toString(), j18, null, jjVar6, null, true, null, null, null, z23, 0, 0, null, false));
                                        }
                                        b10 = org.telegram.messenger.oz.b(null, j18, jjVar2, jjVar2, null, true, null, null, null, z23, 0, 0, null, false);
                                        b10.I = op0Var.f29150x2;
                                    }
                                    if (l10 == null) {
                                        longValue3 = 0;
                                    } else {
                                        longValue3 = l10.longValue();
                                    }
                                    b10.Q = longValue3;
                                    b10.R = j15;
                                    org.telegram.messenger.qz.C(op0Var.f21583a).r0(b10);
                                    i30++;
                                    z24 = z14;
                                    strArr2 = strArr;
                                }
                                z12 = z24;
                            } else if (strArr2[i24] != null) {
                                int i31 = 0;
                                boolean z26 = false;
                                while (i31 < hVar2.m()) {
                                    long j19 = hVar2.j(i31);
                                    boolean x24 = org.telegram.messenger.vp.r1(op0Var.f21583a).x2(j19);
                                    if (hashMap2 == null) {
                                        l4 = l13;
                                    } else {
                                        l4 = (Long) hashMap2.get(Long.valueOf(j19));
                                    }
                                    if (l4 != null && l4.longValue() > 0) {
                                        z26 = true;
                                    }
                                    TLRPC.TL_forumTopic tL_forumTopic5 = (TLRPC.TL_forumTopic) hashMap3.get(hVar2.f(j19));
                                    if (tL_forumTopic5 != null && x24) {
                                        i26 = i31;
                                        hashMap = hashMap2;
                                        j14 = org.telegram.messenger.o5.o(tL_forumTopic5.from_id);
                                    } else {
                                        i26 = i31;
                                        hashMap = hashMap2;
                                        j14 = 0;
                                    }
                                    if (tL_forumTopic5 != null && !x24) {
                                        z13 = z26;
                                        c10 = 0;
                                        jjVar = new org.telegram.messenger.jj(op0Var.f21583a, tL_forumTopic5.topicStartMessage, false, false);
                                    } else {
                                        z13 = z26;
                                        c10 = 0;
                                        jjVar = null;
                                    }
                                    if (so0Var2.getTag() != null && to0Var3.f32239a.length() > 0) {
                                        CharSequence charSequence6 = charSequenceArr3[c10];
                                        if (charSequence6 == null) {
                                            charSequence = null;
                                        } else {
                                            charSequence = charSequence6.toString();
                                        }
                                        boolean z27 = z23;
                                        org.telegram.messenger.oz b12 = org.telegram.messenger.oz.b(charSequence, j19, jjVar, jjVar, null, true, arrayList5, null, null, z27, 0, 0, null, false);
                                        z23 = z27;
                                        if (l4 == null) {
                                            to0Var2 = to0Var3;
                                            longValue2 = 0;
                                        } else {
                                            to0Var2 = to0Var3;
                                            longValue2 = l4.longValue();
                                        }
                                        b12.Q = longValue2;
                                        b12.R = j14;
                                        org.telegram.messenger.qz.C(op0Var.f21583a).r0(b12);
                                    } else {
                                        to0Var2 = to0Var3;
                                    }
                                    org.telegram.messenger.jj jjVar7 = jjVar;
                                    org.telegram.messenger.oz b13 = org.telegram.messenger.oz.b(strArr2[i24], j19, jjVar7, jjVar7, null, true, null, null, null, z23, 0, 0, null, false);
                                    if (l4 == null) {
                                        longValue = 0;
                                    } else {
                                        longValue = l4.longValue();
                                    }
                                    b13.Q = longValue;
                                    b13.R = j14;
                                    org.telegram.messenger.qz.C(op0Var.f21583a).r0(b13);
                                    i31 = i26 + 1;
                                    to0Var3 = to0Var2;
                                    hashMap2 = hashMap;
                                    z26 = z13;
                                }
                                z12 = z26;
                            } else {
                                i25 = 0;
                                z12 = false;
                                op0Var.R0(hVar2, 1, (TLRPC.TL_forumTopic) hashMap3.get(hVar2.n(i25)), !z12);
                            }
                            i25 = 0;
                            op0Var.R0(hVar2, 1, (TLRPC.TL_forumTopic) hashMap3.get(hVar2.n(i25)), !z12);
                        }
                        ep0 ep0Var = op0Var.f29125k2;
                        if (ep0Var != null) {
                            ep0Var.V();
                        }
                        op0Var.dismiss();
                    }
                });
                return;
            }
        }
    }

    public final void X0(boolean z10) {
        boolean z11;
        Integer num;
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        int i10;
        so0 so0Var = this.f29122j1;
        if (so0Var.getTag() != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 == z11) {
            return;
        }
        AnimatorSet animatorSet = this.f29145v1;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z10) {
            num = 1;
        } else {
            num = null;
        }
        so0Var.setTag(num);
        to0 to0Var = this.f29124k1;
        if (to0Var.getEditText().isFocused()) {
            org.telegram.messenger.i0.v1(to0Var.getEditText());
        }
        to0Var.k(true);
        FrameLayout frameLayout = this.U1;
        so0 so0Var2 = this.f29127m1;
        FrameLayout frameLayout2 = this.f29129n1;
        if (z10) {
            so0Var.setVisibility(0);
            if (frameLayout != null && frameLayout2 == null) {
                frameLayout.setVisibility(0);
            }
            so0Var2.setVisibility(0);
        } else if (frameLayout2 != null) {
            frameLayout2.setVisibility(0);
        }
        int i11 = 4;
        if (frameLayout2 != null) {
            if (z10) {
                i10 = 4;
            } else {
                i10 = 1;
            }
            WeakHashMap weakHashMap = r0.h0.f46123a;
            frameLayout2.setImportantForAccessibility(i10);
        }
        LinearLayout linearLayout = this.f29143u1;
        if (linearLayout != null) {
            if (!z10) {
                i11 = 1;
            }
            WeakHashMap weakHashMap2 = r0.h0.f46123a;
            linearLayout.setImportantForAccessibility(i11);
        }
        this.f29145v1 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        float f14 = 0.0f;
        float f15 = 1.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(so0Var, property, f7));
        if (frameLayout != null && frameLayout2 == null) {
            if (z10) {
                f13 = 1.0f;
            } else {
                f13 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(frameLayout, property, f13));
        }
        Property property2 = View.SCALE_X;
        float f16 = 0.2f;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.2f;
        }
        arrayList.add(ObjectAnimator.ofFloat(so0Var2, property2, f10));
        Property property3 = View.SCALE_Y;
        if (z10) {
            f16 = 1.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(so0Var2, property3, f16));
        if (z10) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(so0Var2, property, f11));
        if (frameLayout2 == null || frameLayout2.getVisibility() != 0) {
            View view = this.K1[1];
            if (!z10) {
                f15 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(view, property, f15));
        }
        FrameLayout frameLayout3 = this.f29135q1;
        if (frameLayout3 != null) {
            Property property4 = View.TRANSLATION_Y;
            if (this.Z1 && z10) {
                if (this.V1 != null) {
                    f12 = 5.0f;
                } else {
                    f12 = 16.0f;
                }
                f14 = org.telegram.messenger.i0.L(f12);
            }
            arrayList.add(ObjectAnimator.ofFloat(frameLayout3, property4, f14));
        }
        this.f29145v1.playTogether(arrayList);
        this.f29145v1.setInterpolator(new DecelerateInterpolator());
        this.f29145v1.setDuration(180L);
        this.f29145v1.addListener(new zo0(this, z10, 1));
        this.f29145v1.start();
    }

    public final void Y0(long j10, View view) {
        String str;
        wb K;
        int i10 = -this.f29154z2;
        this.f29154z2 = i10;
        org.telegram.messenger.i0.F3(i10, view, null);
        org.telegram.messenger.t2.APP_ERROR.a();
        if (j10 >= 0) {
            str = org.telegram.messenger.h20.p(org.telegram.messenger.vp.r1(this.f21583a).Z1(Long.valueOf(j10)));
        } else {
            str = "";
        }
        boolean A3 = org.telegram.messenger.vp.r1(this.f21583a).A3();
        FrameLayout frameLayout = this.f29139s1;
        if (A3) {
            K = new cc(frameLayout, this.I0).Q(2131624214, 36, org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0(null, null, 2131743786, str)));
        } else {
            K = new cc(frameLayout, this.I0).K(2131624214, org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0(null, null, 2131743786, str)), org.telegram.messenger.cd.L0(2131743785, null), new jo0(this, 1));
        }
        K.j();
    }

    public final void Z0() {
        org.telegram.ui.ActionBar.m1 m1Var;
        so0 so0Var = this.f29122j1;
        if (so0Var == null) {
            return;
        }
        to0 to0Var = this.f29124k1;
        if (to0Var != null && to0Var.m()) {
            to0Var.getEmojiPaddingShown();
        } else {
            bp0 bp0Var = this.f29146v2;
            if (bp0Var != null && (m1Var = bp0Var.H) != null && !m1Var.f20565f) {
                org.telegram.messenger.i0.L(20.0f);
            }
        }
        float f7 = 0.0f;
        FrameLayout frameLayout = this.U1;
        if (frameLayout != null) {
            frameLayout.setTranslationY(-0.0f);
            f7 = 0.0f + org.telegram.messenger.i0.L(48.0f);
        }
        FrameLayout frameLayout2 = this.f29129n1;
        if (frameLayout2 != null) {
            frameLayout2.setTranslationY(-f7);
        }
        float f10 = -f7;
        so0Var.setTranslationY(f10);
        this.f29127m1.setTranslationY(f10);
    }

    public final void a1() {
        org.telegram.ui.ActionBar.u5 u5Var = this.f29137r1;
        if (u5Var != null) {
            String O0 = O0();
            if (O0.startsWith("https://")) {
                O0 = O0.substring(8);
            } else if (O0.startsWith("http://")) {
                O0 = O0.substring(7);
            }
            u5Var.l(O0, false);
        }
    }

    public final void b1(int i10) {
        int size;
        boolean z10;
        boolean z11;
        a0.h hVar = this.M1;
        if (hVar.m() == 0) {
            X0(false);
            return;
        }
        ArrayList arrayList = this.F1;
        if (arrayList == null) {
            size = 1;
        } else {
            size = arrayList.size();
        }
        Object tag = this.f29122j1.getTag();
        to0 to0Var = this.f29124k1;
        if (tag != null && to0Var.f32239a.length() > 0) {
            size++;
        }
        long j10 = 0;
        for (int i11 = 0; i11 < hVar.m(); i11++) {
            long j11 = ((TLRPC.Dialog) hVar.n(i11)).f19797id;
            long M1 = org.telegram.messenger.vp.r1(this.f21583a).M1(j11);
            if (M1 <= 0) {
                M1 = org.telegram.messenger.o5.k(org.telegram.messenger.vp.r1(this.f21583a).H2(j11));
            }
            j10 += M1;
        }
        int max = Math.max(1, hVar.m());
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        bi.f2 f2Var = this.l1;
        f2Var.g(max, z10);
        if (i10 != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        f2Var.i(size, j10, z11);
        X0(true);
        to0Var.setPadding(0, 0, Math.max(org.telegram.messenger.i0.L(84.0f), f2Var.l()), 0);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = org.telegram.messenger.zs.f19683s;
        if (i10 == i12) {
            hp0 hp0Var = this.C1;
            if (hp0Var != null) {
                hp0Var.E();
            }
            org.telegram.messenger.zs.f(this.f21583a).n(this, i12);
        }
    }

    @Override
    public final void dismiss() {
        to0 to0Var = this.f29124k1;
        if (to0Var != null) {
            org.telegram.messenger.i0.v1(to0Var.getEditText());
        }
        this.Q1 = false;
        super.dismiss();
        org.telegram.messenger.zs.f(this.f21583a).n(this, org.telegram.messenger.zs.f19683s);
    }

    @Override
    public final void onBackPressed() {
        if (this.f29144u2 != null) {
            L0();
            return;
        }
        to0 to0Var = this.f29124k1;
        if (to0Var != null && to0Var.e) {
            to0Var.k(true);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void s0() {
        boolean z10;
        try {
            super.s0();
            hi.c cVar = this.H2;
            if (cVar != null) {
                cVar.a(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20929d6, this.I0));
            }
            org.telegram.ui.ActionBar.p2 p2Var = this.f21589c;
            if (p2Var != null) {
                if (org.telegram.messenger.i0.B(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21001h5, this.I0)) > 0.721f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 != this.P2) {
                    this.P2 = z10;
                    org.telegram.messenger.i0.n3(p2Var, z10);
                }
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public op0(Context context, ArrayList arrayList, String str, String str2, boolean z10, String str3, String str4, boolean z11) {
        this(context, null, arrayList, str, str2, z10, str3, str4, false, z11, false, null, null);
    }

    public op0(android.content.Context r34, org.telegram.ui.un r35, java.util.ArrayList r36, java.lang.String r37, java.lang.String r38, boolean r39, java.lang.String r40, java.lang.String r41, boolean r42, boolean r43, boolean r44, java.lang.Integer r45, org.telegram.ui.ActionBar.p6 r46) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.op0.<init>(android.content.Context, org.telegram.ui.un, java.util.ArrayList, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, boolean, boolean, boolean, java.lang.Integer, org.telegram.ui.ActionBar.p6):void");
    }

    public void S0(View view) {
    }

    public void R0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
    }
}
