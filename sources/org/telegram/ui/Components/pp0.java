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
public class pp0 extends org.telegram.ui.ActionBar.z2 implements org.telegram.messenger.vs {
    public static final int Q2 = 0;
    public final s4.r A1;
    public boolean A2;
    public final zy B1;
    public org.telegram.ui.ActionBar.k1 B2;
    public final ip0 C1;
    public int C2;
    public final np0 D1;
    public boolean D2;
    public final mp0 E1;
    public boolean E2;
    public final ArrayList F1;
    public int F2;
    public final String[] G1;
    public final tg.f G2;
    public final int H1;
    public final hi.c H2;
    public final ew0 I1;
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
    public final dp0 O1;
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
    public final TextPaint f29468b2;
    public TLRPC.TL_exportedMessageLink f29469c2;
    public boolean f29470d2;
    public boolean f29471e2;
    public final boolean f29472f2;
    public final String[] f29473g2;
    public int f29474h2;
    public final FrameLayout f29475i1;
    public int f29476i2;
    public final to0 f29477j1;
    public boolean f29478j2;
    public final uo0 f29479k1;
    public fp0 f29480k2;
    public final bi.f2 l1;
    public float f29481l2;
    public final to0 f29482m1;
    public float f29483m2;
    public final FrameLayout f29484n1;
    public float f29485n2;
    public float f29486o1;
    public ValueAnimator f29487o2;
    public final bi.t0 f29488p1;
    public final xj0 f29489p2;
    public final FrameLayout f29490q1;
    public final h10 f29491q2;
    public final org.telegram.ui.ActionBar.u5 f29492r1;
    public final org.telegram.ui.ActionBar.l f29493r2;
    public final FrameLayout f29494s1;
    public boolean f29495s2;
    public final FrameLayout f29496t1;
    public o1.j f29497t2;
    public final LinearLayout f29498u1;
    public TLRPC.Dialog f29499u2;
    public AnimatorSet f29500v1;
    public final cp0 f29501v2;
    public final uk0 f29502w1;
    public ArrayList f29503w2;
    public final po0 f29504x1;
    public TL_stories.StoryItem f29505x2;
    public final po0 f29506y1;
    public i0.c f29507y2;
    public final s4.r f29508z1;
    public int f29509z2;

    public pp0(Context context, ArrayList arrayList, String str, boolean z10, String str2, boolean z11, org.telegram.ui.ActionBar.p6 p6Var) {
        this(context, null, arrayList, str, null, z10, str2, null, z11, false, false, null, p6Var);
    }

    public static void I0(pp0 pp0Var) {
        po0 po0Var;
        int i10;
        int i11;
        po0 po0Var2 = pp0Var.f29504x1;
        po0 po0Var3 = pp0Var.f29506y1;
        uk0 uk0Var = pp0Var.f29502w1;
        if (!pp0Var.f29478j2) {
            if (pp0Var.D2) {
                po0Var = po0Var3;
            } else {
                po0Var = po0Var2;
            }
            if (po0Var.getChildCount() > 0) {
                View childAt = po0Var.getChildAt(0);
                for (int i12 = 0; i12 < po0Var.getChildCount(); i12++) {
                    if (po0Var.getChildAt(i12).getTop() < childAt.getTop()) {
                        childAt = po0Var.getChildAt(i12);
                    }
                }
                dk0 dk0Var = (dk0) po0Var.G(childAt);
                int top = childAt.getTop() - org.telegram.messenger.i0.L(8.0f);
                if (top > 0 && dk0Var != null && dk0Var.b() == 0) {
                    i10 = top;
                } else {
                    i10 = 0;
                }
                if (top >= 0 && dk0Var != null && dk0Var.b() == 0) {
                    pp0Var.C2 = childAt.getTop();
                    pp0Var.T0(false);
                } else {
                    pp0Var.C2 = Integer.MAX_VALUE;
                    pp0Var.T0(true);
                    top = i10;
                }
                if (uk0Var.getVisibility() == 0) {
                    if (uk0Var.getChildCount() > 0) {
                        View childAt2 = uk0Var.getChildAt(0);
                        for (int i13 = 0; i13 < uk0Var.getChildCount(); i13++) {
                            if (uk0Var.getChildAt(i13).getTop() < childAt2.getTop()) {
                                childAt2 = uk0Var.getChildAt(i13);
                            }
                        }
                        dk0 dk0Var2 = (dk0) uk0Var.G(childAt2);
                        int top2 = childAt2.getTop() - org.telegram.messenger.i0.L(8.0f);
                        if (top2 > 0 && dk0Var2 != null && dk0Var2.b() == 0) {
                            i11 = top2;
                        } else {
                            i11 = 0;
                        }
                        if (top2 >= 0 && dk0Var2 != null && dk0Var2.b() == 0) {
                            pp0Var.C2 = childAt2.getTop();
                            pp0Var.T0(false);
                        } else {
                            pp0Var.C2 = Integer.MAX_VALUE;
                            pp0Var.T0(true);
                            top2 = i11;
                        }
                        top = org.telegram.messenger.i0.W1(uk0Var.getAlpha(), top, top2);
                    } else {
                        return;
                    }
                }
                int i14 = pp0Var.f29474h2;
                if (i14 != top) {
                    pp0Var.f29476i2 = i14;
                    float f7 = top;
                    int i15 = (int) (pp0Var.f29481l2 + f7);
                    pp0Var.f29474h2 = i15;
                    po0Var2.setTopGlowOffset(i15);
                    int i16 = (int) (pp0Var.f29481l2 + f7);
                    pp0Var.f29474h2 = i16;
                    po0Var3.setTopGlowOffset(i16);
                    int i17 = (int) (f7 + pp0Var.f29481l2);
                    pp0Var.f29474h2 = i17;
                    uk0Var.setTopGlowOffset(i17);
                    pp0Var.f29475i1.setTranslationY(pp0Var.f29474h2 + pp0Var.f29481l2);
                    pp0Var.I1.setTranslationY(pp0Var.f29474h2 + pp0Var.f29481l2);
                    pp0Var.f21587b.invalidate();
                }
            }
        }
    }

    public static int J0(pp0 pp0Var) {
        po0 po0Var = pp0Var.f29504x1;
        if (po0Var.getChildCount() != 0) {
            int i10 = 0;
            View childAt = po0Var.getChildAt(0);
            dk0 dk0Var = (dk0) po0Var.G(childAt);
            if (dk0Var != null) {
                int paddingTop = po0Var.getPaddingTop();
                if (dk0Var.c() == 0 && childAt.getTop() >= 0) {
                    i10 = childAt.getTop();
                }
                return paddingTop - i10;
            }
            return -1000;
        }
        return -1000;
    }

    public static pp0 N0(Context context, org.telegram.messenger.kj kjVar, String str, boolean z10, String str2) {
        ArrayList arrayList;
        if (kjVar != null) {
            arrayList = org.telegram.messenger.m5.j(kjVar);
        } else {
            arrayList = null;
        }
        return new pp0(context, arrayList, str, null, z10, str2, null, false);
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
        h10 h10Var = this.f29491q2;
        org.telegram.ui.ActionBar.n0 n0Var = h10Var.f26635r;
        org.telegram.ui.ActionBar.n0 n0Var2 = h10Var.f26635r;
        boolean isEmpty = TextUtils.isEmpty(n0Var.getText());
        po0 po0Var = this.f29504x1;
        po0 po0Var2 = this.f29506y1;
        boolean z11 = true;
        if (isEmpty && ((!this.d || !n0Var2.hasFocus()) && !this.E2)) {
            if (this.f29499u2 == null) {
                org.telegram.messenger.i0.Y3(po0Var, true, 0.98f, true, true);
                org.telegram.messenger.i0.W3(po0Var2, false);
            }
            z11 = false;
        } else {
            this.f29495s2 = true;
            if (this.f29499u2 == null) {
                org.telegram.messenger.i0.Y3(po0Var, false, 0.98f, true, true);
                org.telegram.messenger.i0.W3(po0Var2, true);
            }
        }
        if (this.D2 == z11 && !z10) {
            return;
        }
        this.D2 = z11;
        mp0 mp0Var = this.E1;
        mp0Var.f();
        this.C1.f();
        if (this.D2) {
            if (this.C2 == Integer.MAX_VALUE) {
                ((s4.a0) po0Var2.getLayoutManager()).h1(0, -po0Var2.getPaddingTop());
            } else {
                ((s4.a0) po0Var2.getLayoutManager()).h1(0, this.C2 - po0Var2.getPaddingTop());
            }
            mp0Var.E(n0Var2.getText().toString());
            return;
        }
        int i10 = this.C2;
        s4.r rVar = this.f29508z1;
        if (i10 == Integer.MAX_VALUE) {
            rVar.h1(0, 0);
        } else {
            rVar.h1(0, 0);
        }
    }

    @Override
    public void L() {
        super.L();
        uo0 uo0Var = this.f29479k1;
        if (uo0Var != null) {
            uo0Var.o();
        }
    }

    public final void L0() {
        float f7;
        TLRPC.Dialog dialog = this.f29499u2;
        if (dialog != null) {
            org.telegram.ui.Cells.h7 h7Var = null;
            this.f29499u2 = null;
            for (int i10 = 0; i10 < P0().getChildCount(); i10++) {
                View childAt = P0().getChildAt(i10);
                if ((childAt instanceof org.telegram.ui.Cells.h7) && ((org.telegram.ui.Cells.h7) childAt).getCurrentDialog() == dialog.f19798id) {
                    h7Var = childAt;
                }
            }
            if (h7Var == null) {
                return;
            }
            o1.j jVar = this.f29497t2;
            if (jVar != null) {
                jVar.d();
            }
            P0().setVisibility(0);
            h10 h10Var = this.f29491q2;
            h10Var.setVisibility(0);
            org.telegram.ui.ActionBar.n0 n0Var = h10Var.f26635r;
            if (this.D2 || this.E2) {
                this.f29501v2.H.v = true;
                n0Var.requestFocus();
                org.telegram.messenger.i0.J3(n0Var);
            }
            int[] iArr = new int[2];
            o1.j jVar2 = new o1.j(new o1.i(1000.0f));
            o1.k kVar = new o1.k(0.0f);
            org.telegram.ui.un unVar = this.X1;
            if (unVar != null && unVar.f42002b) {
                f7 = 10.0f;
            } else {
                f7 = 800.0f;
            }
            kVar.b(f7);
            kVar.a(1.0f);
            jVar2.f13958m = kVar;
            this.f29497t2 = jVar2;
            jVar2.b(new ho0(this, h7Var, iArr, 0));
            this.f29497t2.a(new na(this, 5));
            this.f29497t2.h();
        }
    }

    public final void M0() {
        boolean z10 = false;
        if (this.f29469c2 != null || this.f29473g2[0] != null) {
            try {
                ((ClipboardManager) org.telegram.messenger.w0.f18945b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", O0()));
                fp0 fp0Var = this.f29480k2;
                if (fp0Var != null) {
                    fp0Var.B0();
                } else if (this.Y1 instanceof LaunchActivity) {
                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = this.f29469c2;
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
        String[] strArr = this.f29473g2;
        dp0 dp0Var = this.O1;
        if (dp0Var != null) {
            str2 = strArr[dp0Var.e];
        } else {
            TLRPC.TL_exportedMessageLink tL_exportedMessageLink = this.f29469c2;
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
        if (epVar != null && epVar.f25895a.f23920q) {
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

    public final uk0 P0() {
        if (!this.D2 && !this.E2) {
            return this.f29504x1;
        }
        return this.f29506y1;
    }

    public final void Q0(View view, int[] iArr, float f7) {
        float width = (view.getWidth() / 2.0f) + view.getX();
        uk0 uk0Var = this.f29502w1;
        uk0Var.setPivotX(width);
        uk0Var.setPivotY((view.getHeight() / 2.0f) + view.getY());
        float f10 = 0.25f * f7;
        float f11 = 0.75f + f10;
        uk0Var.setScaleX(f11);
        uk0Var.setScaleY(f11);
        uk0Var.setAlpha(f7);
        uk0 P0 = P0();
        P0.setPivotX((view.getWidth() / 2.0f) + view.getX());
        P0.setPivotY((view.getHeight() / 2.0f) + view.getY());
        float f12 = f10 + 1.0f;
        P0.setScaleX(f12);
        P0.setScaleY(f12);
        float f13 = 1.0f - f7;
        P0.setAlpha(f13);
        h10 h10Var = this.f29491q2;
        h10Var.setPivotX(h10Var.getWidth() / 2.0f);
        h10Var.setPivotY(0.0f);
        float f14 = (0.1f * f13) + 0.9f;
        h10Var.setScaleX(f14);
        h10Var.setScaleY(f14);
        h10Var.setAlpha(f13);
        org.telegram.ui.ActionBar.l lVar = this.f29493r2;
        lVar.getBackButton().setTranslationX((-org.telegram.messenger.i0.L(16.0f)) * f13);
        lVar.getTitleTextView().setTranslationY(org.telegram.messenger.i0.L(16.0f) * f13);
        lVar.getSubtitleTextView().setTranslationY(org.telegram.messenger.i0.L(16.0f) * f13);
        lVar.setAlpha(f7);
        uk0Var.getLocationInWindow(iArr);
        float interpolation = gr.f26524g.getInterpolation(f7);
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
        for (int i11 = 0; i11 < uk0Var.getChildCount(); i11++) {
            View childAt2 = uk0Var.getChildAt(i11);
            if (childAt2 instanceof org.telegram.ui.Cells.i7) {
                double d = 1.0f - interpolation;
                childAt2.setTranslationX((float) ((-(childAt2.getX() - view.getX())) * Math.pow(d, 2.0d)));
                float y3 = childAt2.getY();
                childAt2.setTranslationY((float) (Math.pow(d, 2.0d) * (-((uk0Var.getTranslationY() + y3) - view.getY()))));
            }
        }
        this.f21587b.requestLayout();
        P0.invalidate();
    }

    @Override
    public final int S() {
        return this.f21587b.getMeasuredHeight() - this.P1;
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
            animatorSetArr[0].addListener(new ap0(this, z10, 0));
            animatorSetArr[0].start();
        }
    }

    public final void U0(View view, TLRPC.Dialog dialog) {
        Activity activity;
        pp0 pp0Var;
        ArrayList l4;
        lp0 lp0Var;
        if (dialog instanceof hp0) {
            S0(view);
        } else if (((view instanceof org.telegram.ui.Cells.h7) && ((org.telegram.ui.Cells.h7) view).F) || ((view instanceof org.telegram.ui.Cells.k6) && ((org.telegram.ui.Cells.k6) view).f22138n0)) {
            Y0(dialog.f19798id, view);
        } else {
            uk0 uk0Var = this.f29502w1;
            if (uk0Var.getVisibility() == 8 && (activity = this.Y1) != null) {
                boolean z10 = org.telegram.messenger.o5.z(dialog.f19798id);
                int i10 = this.H1;
                if (z10) {
                    TLRPC.Chat L0 = org.telegram.messenger.wp.r1(this.f21584a).L0(Long.valueOf(-dialog.f19798id));
                    if (org.telegram.messenger.w3.T(L0) && !L0.megagroup) {
                        TLRPC.Chat L02 = org.telegram.messenger.wp.r1(this.f21584a).L0(Long.valueOf(-dialog.f19798id));
                        if ((!org.telegram.messenger.w3.n(L02) && !L02.megagroup) || i10 == 2 || i10 == 3) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                            String L03 = org.telegram.messenger.dd.L0(2131745613, null);
                            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
                            x1Var.R = L03;
                            if (i10 == 3) {
                                if (org.telegram.messenger.w3.P(10, L0)) {
                                    x1Var.T = org.telegram.messenger.dd.L0(2131751085, null);
                                } else {
                                    x1Var.T = org.telegram.messenger.dd.L0(2131751086, null);
                                }
                            } else if (i10 == 2) {
                                if (this.f29472f2) {
                                    x1Var.T = org.telegram.messenger.dd.L0(2131746602, null);
                                } else if (org.telegram.messenger.w3.P(10, L0)) {
                                    x1Var.T = org.telegram.messenger.dd.L0(2131751093, null);
                                } else {
                                    x1Var.T = org.telegram.messenger.dd.L0(2131751094, null);
                                }
                            } else {
                                x1Var.T = org.telegram.messenger.dd.L0(2131752440, null);
                            }
                            i0.a.s(null, 2131747847, alertDialog$Builder, null);
                            return;
                        }
                    }
                } else if (org.telegram.messenger.o5.C(dialog.f19798id) && i10 != 0) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(activity);
                    String L04 = org.telegram.messenger.dd.L0(2131745613, null);
                    org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.f20135a;
                    x1Var2.R = L04;
                    if (i10 == 3) {
                        x1Var2.T = org.telegram.messenger.dd.L0(2131744115, null);
                    } else if (i10 != 0) {
                        x1Var2.T = org.telegram.messenger.dd.L0(2131747191, null);
                    } else {
                        x1Var2.T = org.telegram.messenger.dd.L0(2131749114, null);
                    }
                    i0.a.s(null, 2131747847, alertDialog$Builder2, null);
                    return;
                }
                long j10 = dialog.f19798id;
                a0.h hVar = this.M1;
                if (hVar.h(j10) >= 0) {
                    hVar.l(dialog.f19798id);
                    this.N1.remove(dialog);
                    if (view instanceof org.telegram.ui.Cells.k6) {
                        ((org.telegram.ui.Cells.k6) view).y(false, true);
                    } else if (view instanceof org.telegram.ui.Cells.h7) {
                        ((org.telegram.ui.Cells.h7) view).b(false, true);
                    }
                    b1(1);
                    pp0Var = this;
                } else {
                    TLRPC.User Z1 = org.telegram.messenger.wp.r1(this.f21584a).Z1(Long.valueOf(dialog.f19798id));
                    TLRPC.Chat L05 = org.telegram.messenger.wp.r1(this.f21584a).L0(Long.valueOf(-dialog.f19798id));
                    if ((!org.telegram.messenger.i20.u(Z1) || (((l4 = org.telegram.messenger.wp.r1(this.f21584a).f19234r7.l(-Z1.f19943id)) == null || l4.isEmpty()) && org.telegram.messenger.wp.r1(this.f21584a).f19234r7.e(-Z1.f19943id))) && (!org.telegram.messenger.o5.z(dialog.f19798id) || (!org.telegram.messenger.w3.c0(L05) && (!org.telegram.messenger.w3.p0(L05) || !org.telegram.messenger.w3.A(this.f21584a, L05, 24))))) {
                        pp0Var = this;
                        hVar.k(dialog, dialog.f19798id);
                        if (view instanceof org.telegram.ui.Cells.k6) {
                            ((org.telegram.ui.Cells.k6) view).y(true, true);
                        } else if (view instanceof org.telegram.ui.Cells.h7) {
                            ((org.telegram.ui.Cells.h7) view).b(true, true);
                        }
                        b1(2);
                        long j11 = org.telegram.messenger.e20.i(pp0Var.f21584a).f15524n;
                        if (pp0Var.D2) {
                            ip0 ip0Var = pp0Var.C1;
                            a0.h hVar2 = ip0Var.e;
                            ArrayList arrayList = ip0Var.d;
                            TLRPC.Dialog dialog2 = (TLRPC.Dialog) hVar2.f(dialog.f19798id);
                            if (dialog2 == null) {
                                ip0Var.e.k(dialog, dialog.f19798id);
                                arrayList.add(!arrayList.isEmpty(), dialog);
                            } else if (dialog2.f19798id != j11) {
                                arrayList.remove(dialog2);
                                arrayList.add(!arrayList.isEmpty(), dialog2);
                            }
                            ip0Var.f();
                            pp0Var.f29495s2 = false;
                            h10 h10Var = pp0Var.f29491q2;
                            h10Var.f26635r.setText("");
                            K0(false);
                            org.telegram.messenger.i0.v1(h10Var.f26635r);
                        }
                    } else {
                        this.f29499u2 = dialog;
                        this.A1.h1(0, this.f29474h2 - uk0Var.getPaddingTop());
                        AtomicReference atomicReference = new AtomicReference();
                        yo0 yo0Var = new yo0(this, dialog, atomicReference, view);
                        atomicReference.set(new org.telegram.ui.fp((Object) this, (Object) atomicReference, (Object) yo0Var, (Object) dialog, 20));
                        org.telegram.messenger.at f7 = org.telegram.messenger.at.f(this.f21584a);
                        int i11 = org.telegram.messenger.at.f14771q5;
                        f7.b(yo0Var, i11);
                        if (org.telegram.messenger.wp.r1(this.f21584a).f19234r7.l(-dialog.f19798id) != null) {
                            yo0Var.didReceivedNotification(i11, this.f21584a, Long.valueOf(-dialog.f19798id));
                            return;
                        }
                        org.telegram.messenger.wp.r1(this.f21584a).f19234r7.o(-dialog.f19798id);
                        org.telegram.messenger.i0.h3((Runnable) atomicReference.get(), 300L);
                        return;
                    }
                }
                mp0 mp0Var = pp0Var.E1;
                if (mp0Var != null && (lp0Var = mp0Var.H) != null) {
                    lp0Var.k(0, lp0Var.b());
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
            to0 to0Var = this.f29477j1;
            uo0 uo0Var = this.f29479k1;
            boolean z11 = true;
            if (i14 < m10) {
                long j10 = hVar.j(i14);
                if (s4.h(getContext(), this.f21584a, j10, (to0Var.getTag() == null || uo0Var.f32308a.length() <= 0) ? false : false)) {
                    return;
                }
                i14++;
            } else {
                Editable text = uo0Var.getText();
                rt rtVar = uo0Var.f32308a;
                final CharSequence[] charSequenceArr = {text};
                final ArrayList W = org.telegram.messenger.vi.b0(this.f21584a).W(charSequenceArr, true, true);
                ep epVar = this.W1;
                if (epVar != null && epVar.f25895a.f23920q) {
                    i10 = this.T1;
                } else {
                    i10 = -1;
                }
                ArrayList arrayList = new ArrayList();
                if (this.F1 != null) {
                    i12 = 0;
                    while (i13 < hVar.m()) {
                        long j11 = hVar.j(i13);
                        long M1 = org.telegram.messenger.wp.r1(this.f21584a).M1(j11);
                        if (M1 <= 0) {
                            M1 = org.telegram.messenger.o5.k(org.telegram.messenger.wp.r1(this.f21584a).H2(j11));
                        }
                        if (to0Var.getTag() != null && rtVar.length() > 0 && M1 > 0) {
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
                    dp0 dp0Var = this.O1;
                    if (dp0Var != null) {
                        i11 = dp0Var.e;
                    } else {
                        i11 = 0;
                    }
                    if (this.f29505x2 != null) {
                        int i16 = 0;
                        int i17 = 0;
                        while (i16 < hVar.m()) {
                            long j12 = hVar.j(i16);
                            long M12 = org.telegram.messenger.wp.r1(this.f21584a).M1(j12);
                            if (M12 <= 0) {
                                M12 = org.telegram.messenger.o5.k(org.telegram.messenger.wp.r1(this.f21584a).H2(j12));
                            }
                            int i18 = i13;
                            if (this.f29505x2 != null && to0Var.getTag() != null && rtVar.length() > 0 && charSequenceArr[i18] != null && M12 > 0) {
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
                                long M13 = org.telegram.messenger.wp.r1(this.f21584a).M1(j13);
                                if (M13 <= 0) {
                                    M13 = org.telegram.messenger.o5.k(org.telegram.messenger.wp.r1(this.f21584a).H2(j13));
                                }
                                if (to0Var.getTag() != null && rtVar.length() > 0 && M13 > 0) {
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
                s4.b0(this.f21584a, arrayList, i12, new org.telegram.messenger.r20() {
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
                        org.telegram.messenger.kj kjVar;
                        uo0 uo0Var2;
                        long longValue;
                        String charSequence;
                        long longValue2;
                        Long l10;
                        boolean z14;
                        boolean z15;
                        long j15;
                        String[] strArr;
                        org.telegram.messenger.kj kjVar2;
                        org.telegram.messenger.pz b10;
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
                        org.telegram.messenger.kj kjVar3;
                        org.telegram.messenger.kj kjVar4;
                        ArrayList arrayList3;
                        ?? r11;
                        long longValue4;
                        String charSequence3;
                        long longValue5;
                        HashMap hashMap2 = (HashMap) obj;
                        pp0 pp0Var = pp0.this;
                        String[] strArr2 = pp0Var.G1;
                        uo0 uo0Var3 = pp0Var.f29479k1;
                        to0 to0Var2 = pp0Var.f29477j1;
                        HashMap hashMap3 = pp0Var.N1;
                        Long l13 = 0L;
                        a0.h hVar2 = pp0Var.M1;
                        ArrayList arrayList4 = pp0Var.F1;
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
                                    boolean x22 = org.telegram.messenger.wp.r1(pp0Var.f21584a).x2(j17);
                                    to0 to0Var3 = to0Var2;
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
                                        kjVar3 = new org.telegram.messenger.kj(pp0Var.f21584a, tL_forumTopic3.topicStartMessage, false, false);
                                    } else {
                                        l12 = l13;
                                        arrayList2 = arrayList4;
                                        charSequenceArr2 = charSequenceArr3;
                                        kjVar3 = null;
                                    }
                                    if (kjVar3 != null) {
                                        kjVar3.f16708p = true;
                                    }
                                    if (to0Var3.getTag() != null && uo0Var3.f32308a.length() > 0) {
                                        CharSequence charSequence4 = charSequenceArr2[0];
                                        if (charSequence4 == null) {
                                            charSequence3 = null;
                                        } else {
                                            charSequence3 = charSequence4.toString();
                                        }
                                        r11 = 0;
                                        kjVar4 = kjVar3;
                                        ArrayList arrayList7 = arrayList5;
                                        org.telegram.messenger.pz b11 = org.telegram.messenger.pz.b(charSequence3, j17, kjVar4, kjVar3, null, true, arrayList7, null, null, z20, 0, 0, null, false);
                                        arrayList3 = arrayList7;
                                        z20 = z20;
                                        if (l14 == null) {
                                            longValue5 = 0;
                                        } else {
                                            longValue5 = l14.longValue();
                                        }
                                        b11.Q = longValue5;
                                        b11.R = j16;
                                        org.telegram.messenger.rz.C(pp0Var.f21584a).r0(b11);
                                    } else {
                                        kjVar4 = kjVar3;
                                        arrayList3 = arrayList5;
                                        r11 = 0;
                                    }
                                    org.telegram.messenger.rz C = org.telegram.messenger.rz.C(pp0Var.f21584a);
                                    org.telegram.messenger.kj kjVar5 = kjVar4;
                                    ArrayList arrayList8 = pp0Var.F1;
                                    boolean z21 = !pp0Var.A2;
                                    if (l14 == null) {
                                        longValue4 = 0;
                                    } else {
                                        longValue4 = l14.longValue();
                                    }
                                    boolean z22 = z20;
                                    int q02 = C.q0(arrayList8, j17, z21, false, z22, 0, 0, kjVar5, i23, longValue4, j16, null);
                                    if (q02 != 0) {
                                        arrayList6.add(Long.valueOf(j17));
                                    }
                                    if (hVar2.m() == 1) {
                                        s4.s0(q02, pp0Var.X1, r11);
                                        if (q02 != 0) {
                                            z19 = z16;
                                            tL_forumTopic = r11;
                                            break;
                                        }
                                    }
                                    i28 = i27 + 1;
                                    arrayList5 = arrayList3;
                                    z18 = z22;
                                    to0Var2 = to0Var3;
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
                                pp0Var.R0(hVar2, size2, tL_forumTopic2, !z19);
                            }
                        } else {
                            boolean z23 = z18;
                            dp0 dp0Var2 = pp0Var.O1;
                            if (dp0Var2 != null) {
                                i24 = dp0Var2.e;
                            } else {
                                i24 = 0;
                            }
                            if (pp0Var.f29505x2 != null) {
                                int i30 = 0;
                                boolean z24 = false;
                                while (i30 < hVar2.m()) {
                                    long j18 = hVar2.j(i30);
                                    boolean x23 = org.telegram.messenger.wp.r1(pp0Var.f21584a).x2(j18);
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
                                        kjVar2 = new org.telegram.messenger.kj(pp0Var.f21584a, tL_forumTopic4.topicStartMessage, false, false);
                                    } else {
                                        strArr = strArr2;
                                        kjVar2 = null;
                                    }
                                    if (pp0Var.f29505x2 == null) {
                                        if (to0Var2.getTag() != null && uo0Var3.f32308a.length() > 0) {
                                            CharSequence charSequence5 = charSequenceArr3[0];
                                            if (charSequence5 == null) {
                                                charSequence2 = null;
                                            } else {
                                                charSequence2 = charSequence5.toString();
                                            }
                                            boolean z25 = z23;
                                            b10 = org.telegram.messenger.pz.b(charSequence2, j18, kjVar2, kjVar2, null, true, arrayList5, null, null, z25, 0, 0, null, false);
                                            z23 = z25;
                                        } else {
                                            b10 = org.telegram.messenger.pz.b(strArr[i24], j18, kjVar2, kjVar2, null, true, null, null, null, z23, 0, 0, null, false);
                                        }
                                    } else {
                                        if (to0Var2.getTag() != null && uo0Var3.f32308a.length() > 0 && charSequenceArr3[0] != null) {
                                            org.telegram.messenger.kj kjVar6 = kjVar2;
                                            kjVar2 = kjVar6;
                                            org.telegram.messenger.rz.C(pp0Var.f21584a).r0(org.telegram.messenger.pz.b(charSequenceArr3[0].toString(), j18, null, kjVar6, null, true, null, null, null, z23, 0, 0, null, false));
                                        }
                                        b10 = org.telegram.messenger.pz.b(null, j18, kjVar2, kjVar2, null, true, null, null, null, z23, 0, 0, null, false);
                                        b10.I = pp0Var.f29505x2;
                                    }
                                    if (l10 == null) {
                                        longValue3 = 0;
                                    } else {
                                        longValue3 = l10.longValue();
                                    }
                                    b10.Q = longValue3;
                                    b10.R = j15;
                                    org.telegram.messenger.rz.C(pp0Var.f21584a).r0(b10);
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
                                    boolean x24 = org.telegram.messenger.wp.r1(pp0Var.f21584a).x2(j19);
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
                                        kjVar = new org.telegram.messenger.kj(pp0Var.f21584a, tL_forumTopic5.topicStartMessage, false, false);
                                    } else {
                                        z13 = z26;
                                        c10 = 0;
                                        kjVar = null;
                                    }
                                    if (to0Var2.getTag() != null && uo0Var3.f32308a.length() > 0) {
                                        CharSequence charSequence6 = charSequenceArr3[c10];
                                        if (charSequence6 == null) {
                                            charSequence = null;
                                        } else {
                                            charSequence = charSequence6.toString();
                                        }
                                        boolean z27 = z23;
                                        org.telegram.messenger.pz b12 = org.telegram.messenger.pz.b(charSequence, j19, kjVar, kjVar, null, true, arrayList5, null, null, z27, 0, 0, null, false);
                                        z23 = z27;
                                        if (l4 == null) {
                                            uo0Var2 = uo0Var3;
                                            longValue2 = 0;
                                        } else {
                                            uo0Var2 = uo0Var3;
                                            longValue2 = l4.longValue();
                                        }
                                        b12.Q = longValue2;
                                        b12.R = j14;
                                        org.telegram.messenger.rz.C(pp0Var.f21584a).r0(b12);
                                    } else {
                                        uo0Var2 = uo0Var3;
                                    }
                                    org.telegram.messenger.kj kjVar7 = kjVar;
                                    org.telegram.messenger.pz b13 = org.telegram.messenger.pz.b(strArr2[i24], j19, kjVar7, kjVar7, null, true, null, null, null, z23, 0, 0, null, false);
                                    if (l4 == null) {
                                        longValue = 0;
                                    } else {
                                        longValue = l4.longValue();
                                    }
                                    b13.Q = longValue;
                                    b13.R = j14;
                                    org.telegram.messenger.rz.C(pp0Var.f21584a).r0(b13);
                                    i31 = i26 + 1;
                                    uo0Var3 = uo0Var2;
                                    hashMap2 = hashMap;
                                    z26 = z13;
                                }
                                z12 = z26;
                            } else {
                                i25 = 0;
                                z12 = false;
                                pp0Var.R0(hVar2, 1, (TLRPC.TL_forumTopic) hashMap3.get(hVar2.n(i25)), !z12);
                            }
                            i25 = 0;
                            pp0Var.R0(hVar2, 1, (TLRPC.TL_forumTopic) hashMap3.get(hVar2.n(i25)), !z12);
                        }
                        fp0 fp0Var = pp0Var.f29480k2;
                        if (fp0Var != null) {
                            fp0Var.V();
                        }
                        pp0Var.dismiss();
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
        to0 to0Var = this.f29477j1;
        if (to0Var.getTag() != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 == z11) {
            return;
        }
        AnimatorSet animatorSet = this.f29500v1;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z10) {
            num = 1;
        } else {
            num = null;
        }
        to0Var.setTag(num);
        uo0 uo0Var = this.f29479k1;
        if (uo0Var.getEditText().isFocused()) {
            org.telegram.messenger.i0.v1(uo0Var.getEditText());
        }
        uo0Var.k(true);
        FrameLayout frameLayout = this.U1;
        to0 to0Var2 = this.f29482m1;
        FrameLayout frameLayout2 = this.f29484n1;
        if (z10) {
            to0Var.setVisibility(0);
            if (frameLayout != null && frameLayout2 == null) {
                frameLayout.setVisibility(0);
            }
            to0Var2.setVisibility(0);
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
            WeakHashMap weakHashMap = r0.h0.f46134a;
            frameLayout2.setImportantForAccessibility(i10);
        }
        LinearLayout linearLayout = this.f29498u1;
        if (linearLayout != null) {
            if (!z10) {
                i11 = 1;
            }
            WeakHashMap weakHashMap2 = r0.h0.f46134a;
            linearLayout.setImportantForAccessibility(i11);
        }
        this.f29500v1 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        float f14 = 0.0f;
        float f15 = 1.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(to0Var, property, f7));
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
        arrayList.add(ObjectAnimator.ofFloat(to0Var2, property2, f10));
        Property property3 = View.SCALE_Y;
        if (z10) {
            f16 = 1.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(to0Var2, property3, f16));
        if (z10) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(to0Var2, property, f11));
        if (frameLayout2 == null || frameLayout2.getVisibility() != 0) {
            View view = this.K1[1];
            if (!z10) {
                f15 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(view, property, f15));
        }
        FrameLayout frameLayout3 = this.f29490q1;
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
        this.f29500v1.playTogether(arrayList);
        this.f29500v1.setInterpolator(new DecelerateInterpolator());
        this.f29500v1.setDuration(180L);
        this.f29500v1.addListener(new ap0(this, z10, 1));
        this.f29500v1.start();
    }

    public final void Y0(long j10, View view) {
        String str;
        wb K;
        int i10 = -this.f29509z2;
        this.f29509z2 = i10;
        org.telegram.messenger.i0.F3(i10, view, null);
        org.telegram.messenger.t2.APP_ERROR.a();
        if (j10 >= 0) {
            str = org.telegram.messenger.i20.p(org.telegram.messenger.wp.r1(this.f21584a).Z1(Long.valueOf(j10)));
        } else {
            str = "";
        }
        boolean A3 = org.telegram.messenger.wp.r1(this.f21584a).A3();
        FrameLayout frameLayout = this.f29494s1;
        if (A3) {
            K = new cc(frameLayout, this.I0).Q(2131624214, 36, org.telegram.messenger.i0.W2(org.telegram.messenger.dd.a0(null, null, 2131743786, str)));
        } else {
            K = new cc(frameLayout, this.I0).K(2131624214, org.telegram.messenger.i0.W2(org.telegram.messenger.dd.a0(null, null, 2131743786, str)), org.telegram.messenger.dd.L0(2131743785, null), new ko0(this, 1));
        }
        K.j();
    }

    public final void Z0() {
        org.telegram.ui.ActionBar.m1 m1Var;
        to0 to0Var = this.f29477j1;
        if (to0Var == null) {
            return;
        }
        uo0 uo0Var = this.f29479k1;
        if (uo0Var != null && uo0Var.m()) {
            uo0Var.getEmojiPaddingShown();
        } else {
            cp0 cp0Var = this.f29501v2;
            if (cp0Var != null && (m1Var = cp0Var.H) != null && !m1Var.f20566f) {
                org.telegram.messenger.i0.L(20.0f);
            }
        }
        float f7 = 0.0f;
        FrameLayout frameLayout = this.U1;
        if (frameLayout != null) {
            frameLayout.setTranslationY(-0.0f);
            f7 = 0.0f + org.telegram.messenger.i0.L(48.0f);
        }
        FrameLayout frameLayout2 = this.f29484n1;
        if (frameLayout2 != null) {
            frameLayout2.setTranslationY(-f7);
        }
        float f10 = -f7;
        to0Var.setTranslationY(f10);
        this.f29482m1.setTranslationY(f10);
    }

    public final void a1() {
        org.telegram.ui.ActionBar.u5 u5Var = this.f29492r1;
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
        Object tag = this.f29477j1.getTag();
        uo0 uo0Var = this.f29479k1;
        if (tag != null && uo0Var.f32308a.length() > 0) {
            size++;
        }
        long j10 = 0;
        for (int i11 = 0; i11 < hVar.m(); i11++) {
            long j11 = ((TLRPC.Dialog) hVar.n(i11)).f19798id;
            long M1 = org.telegram.messenger.wp.r1(this.f21584a).M1(j11);
            if (M1 <= 0) {
                M1 = org.telegram.messenger.o5.k(org.telegram.messenger.wp.r1(this.f21584a).H2(j11));
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
        uo0Var.setPadding(0, 0, Math.max(org.telegram.messenger.i0.L(84.0f), f2Var.l()), 0);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = org.telegram.messenger.at.f14779s;
        if (i10 == i12) {
            ip0 ip0Var = this.C1;
            if (ip0Var != null) {
                ip0Var.E();
            }
            org.telegram.messenger.at.f(this.f21584a).n(this, i12);
        }
    }

    @Override
    public final void dismiss() {
        uo0 uo0Var = this.f29479k1;
        if (uo0Var != null) {
            org.telegram.messenger.i0.v1(uo0Var.getEditText());
        }
        this.Q1 = false;
        super.dismiss();
        org.telegram.messenger.at.f(this.f21584a).n(this, org.telegram.messenger.at.f14779s);
    }

    @Override
    public final void onBackPressed() {
        if (this.f29499u2 != null) {
            L0();
            return;
        }
        uo0 uo0Var = this.f29479k1;
        if (uo0Var != null && uo0Var.e) {
            uo0Var.k(true);
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
                cVar.a(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20930d6, this.I0));
            }
            org.telegram.ui.ActionBar.p2 p2Var = this.f21590c;
            if (p2Var != null) {
                if (org.telegram.messenger.i0.B(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21002h5, this.I0)) > 0.721f) {
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

    public pp0(Context context, ArrayList arrayList, String str, String str2, boolean z10, String str3, String str4, boolean z11) {
        this(context, null, arrayList, str, str2, z10, str3, str4, false, z11, false, null, null);
    }

    public pp0(android.content.Context r34, org.telegram.ui.un r35, java.util.ArrayList r36, java.lang.String r37, java.lang.String r38, boolean r39, java.lang.String r40, java.lang.String r41, boolean r42, boolean r43, boolean r44, java.lang.Integer r45, org.telegram.ui.ActionBar.p6 r46) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.pp0.<init>(android.content.Context, org.telegram.ui.un, java.util.ArrayList, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, boolean, boolean, boolean, java.lang.Integer, org.telegram.ui.ActionBar.p6):void");
    }

    public void S0(View view) {
    }

    public void R0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
    }
}
