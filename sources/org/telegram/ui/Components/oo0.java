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
public class oo0 extends org.telegram.ui.ActionBar.t2 implements org.telegram.messenger.cs {
    public static final int R2 = 0;
    public final u4.s A1;
    public int A2;
    public final u4.s B1;
    public boolean B2;
    public final iy C1;
    public org.telegram.ui.ActionBar.f1 C2;
    public final ho0 D1;
    public int D2;
    public final mo0 E1;
    public boolean E2;
    public final lo0 F1;
    public boolean F2;
    public final ArrayList G1;
    public int G2;
    public final String[] H1;
    public final eh.g H2;
    public final int I1;
    public final si.c I2;
    public final zu0 J1;
    public final eh.c J2;
    public final Drawable K1;
    public final eh.c K2;
    public final View[] L1;
    public final eh.c L2;
    public final AnimatorSet[] M1;
    public final rg M2;
    public final a0.h N1;
    public final gh.g N2;
    public final HashMap O1;
    public final eh.d O2;
    public final co0 P1;
    public final gh.g P2;
    public int Q1;
    public boolean Q2;
    public boolean R1;
    public final boolean S1;
    public boolean T1;
    public final int U1;
    public final FrameLayout V1;
    public final LinearLayout W1;
    public final wo X1;
    public final org.telegram.ui.wm Y1;
    public final Activity Z1;
    public final boolean f36875a2;
    public boolean f36876b2;
    public final TextPaint c2;
    public TLRPC.TL_exportedMessageLink f36877d2;
    public boolean f36878e2;
    public boolean f36879f2;
    public final boolean f36880g2;
    public final String[] f36881h2;
    public int f36882i2;
    public final FrameLayout f36883j1;
    public int f36884j2;
    public final tn0 k1;
    public boolean f36885k2;
    public final un0 f36886l1;
    public eo0 f36887l2;
    public final mi.x1 m1;
    public float f36888m2;
    public final tn0 f36889n1;
    public float f36890n2;
    public final FrameLayout f36891o1;
    public float f36892o2;
    public float f36893p1;
    public ValueAnimator f36894p2;
    public final ai.x2 f36895q1;
    public final wi0 f36896q2;
    public final FrameLayout f36897r1;
    public final n00 f36898r2;
    public final org.telegram.ui.ActionBar.k5 f36899s1;
    public final org.telegram.ui.ActionBar.k f36900s2;
    public final FrameLayout f36901t1;
    public boolean f36902t2;
    public final FrameLayout f36903u1;
    public q1.g f36904u2;
    public final LinearLayout f36905v1;
    public TLRPC.Dialog f36906v2;
    public AnimatorSet f36907w1;
    public final bo0 f36908w2;
    public final tj0 f36909x1;
    public ArrayList f36910x2;
    public final qn0 f36911y1;
    public TL_stories.StoryItem f36912y2;
    public final qn0 f36913z1;
    public i0.b f36914z2;

    public oo0(Context context, ArrayList arrayList, String str, boolean z10, String str2, boolean z11, org.telegram.ui.ActionBar.e6 e6Var) {
        this(context, null, arrayList, str, null, z10, str2, null, z11, false, false, null, e6Var);
    }

    public static void I0(oo0 oo0Var) {
        qn0 qn0Var;
        int i3;
        int i10;
        qn0 qn0Var2 = oo0Var.f36911y1;
        qn0 qn0Var3 = oo0Var.f36913z1;
        tj0 tj0Var = oo0Var.f36909x1;
        if (!oo0Var.f36885k2) {
            if (oo0Var.E2) {
                qn0Var = qn0Var3;
            } else {
                qn0Var = qn0Var2;
            }
            if (qn0Var.getChildCount() > 0) {
                View childAt = qn0Var.getChildAt(0);
                for (int i11 = 0; i11 < qn0Var.getChildCount(); i11++) {
                    if (qn0Var.getChildAt(i11).getTop() < childAt.getTop()) {
                        childAt = qn0Var.getChildAt(i11);
                    }
                }
                bj0 bj0Var = (bj0) qn0Var.G(childAt);
                int top = childAt.getTop() - org.telegram.messenger.g0.L(8.0f);
                if (top > 0 && bj0Var != null && bj0Var.b() == 0) {
                    i3 = top;
                } else {
                    i3 = 0;
                }
                if (top >= 0 && bj0Var != null && bj0Var.b() == 0) {
                    oo0Var.D2 = childAt.getTop();
                    oo0Var.T0(false);
                } else {
                    oo0Var.D2 = Integer.MAX_VALUE;
                    oo0Var.T0(true);
                    top = i3;
                }
                if (tj0Var.getVisibility() == 0) {
                    if (tj0Var.getChildCount() > 0) {
                        View childAt2 = tj0Var.getChildAt(0);
                        for (int i12 = 0; i12 < tj0Var.getChildCount(); i12++) {
                            if (tj0Var.getChildAt(i12).getTop() < childAt2.getTop()) {
                                childAt2 = tj0Var.getChildAt(i12);
                            }
                        }
                        bj0 bj0Var2 = (bj0) tj0Var.G(childAt2);
                        int top2 = childAt2.getTop() - org.telegram.messenger.g0.L(8.0f);
                        if (top2 > 0 && bj0Var2 != null && bj0Var2.b() == 0) {
                            i10 = top2;
                        } else {
                            i10 = 0;
                        }
                        if (top2 >= 0 && bj0Var2 != null && bj0Var2.b() == 0) {
                            oo0Var.D2 = childAt2.getTop();
                            oo0Var.T0(false);
                        } else {
                            oo0Var.D2 = Integer.MAX_VALUE;
                            oo0Var.T0(true);
                            top2 = i10;
                        }
                        top = org.telegram.messenger.g0.W1(tj0Var.getAlpha(), top, top2);
                    } else {
                        return;
                    }
                }
                int i13 = oo0Var.f36882i2;
                if (i13 != top) {
                    oo0Var.f36884j2 = i13;
                    float f10 = top;
                    int i14 = (int) (oo0Var.f36888m2 + f10);
                    oo0Var.f36882i2 = i14;
                    qn0Var2.setTopGlowOffset(i14);
                    int i15 = (int) (oo0Var.f36888m2 + f10);
                    oo0Var.f36882i2 = i15;
                    qn0Var3.setTopGlowOffset(i15);
                    int i16 = (int) (f10 + oo0Var.f36888m2);
                    oo0Var.f36882i2 = i16;
                    tj0Var.setTopGlowOffset(i16);
                    oo0Var.f36883j1.setTranslationY(oo0Var.f36882i2 + oo0Var.f36888m2);
                    oo0Var.J1.setTranslationY(oo0Var.f36882i2 + oo0Var.f36888m2);
                    oo0Var.f28586b.invalidate();
                }
            }
        }
    }

    public static int J0(oo0 oo0Var) {
        qn0 qn0Var = oo0Var.f36911y1;
        if (qn0Var.getChildCount() != 0) {
            int i3 = 0;
            View childAt = qn0Var.getChildAt(0);
            bj0 bj0Var = (bj0) qn0Var.G(childAt);
            if (bj0Var != null) {
                int paddingTop = qn0Var.getPaddingTop();
                if (bj0Var.c() == 0 && childAt.getTop() >= 0) {
                    i3 = childAt.getTop();
                }
                return paddingTop - i3;
            }
            return -1000;
        }
        return -1000;
    }

    public static oo0 N0(Context context, org.telegram.messenger.zi ziVar, String str, boolean z10, String str2) {
        ArrayList arrayList;
        if (ziVar != null) {
            arrayList = org.telegram.messenger.k5.k(ziVar);
        } else {
            arrayList = null;
        }
        return new oo0(context, arrayList, str, null, z10, str2, null, false);
    }

    public static void W0(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        int i10;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i3, e6Var);
        int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
        for (int i11 = 0; i11 < itemsCount; i11++) {
            View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(i11);
            int i12 = 6;
            if (i11 == 0) {
                i10 = 6;
            } else {
                i10 = 0;
            }
            if (i11 != itemsCount - 1) {
                i12 = 0;
            }
            org.telegram.ui.ActionBar.r6.R(childAt, org.telegram.ui.ActionBar.k6.a0(w02, i10, i12), null, org.telegram.ui.ActionBar.r6.N(i3), e6Var);
        }
    }

    @Override
    public final boolean G() {
        return false;
    }

    @Override
    public void K() {
        super.K();
        un0 un0Var = this.f36886l1;
        if (un0Var != null) {
            un0Var.o();
        }
    }

    public final void K0(boolean z10) {
        n00 n00Var = this.f36898r2;
        bh.g gVar = n00Var.f36302r;
        bh.g gVar2 = n00Var.f36302r;
        boolean isEmpty = TextUtils.isEmpty(gVar.getText());
        qn0 qn0Var = this.f36911y1;
        qn0 qn0Var2 = this.f36913z1;
        boolean z11 = true;
        if (isEmpty && ((!this.d || !gVar2.hasFocus()) && !this.F2)) {
            if (this.f36906v2 == null) {
                org.telegram.messenger.g0.Z3(qn0Var, true, 0.98f, true, true);
                org.telegram.messenger.g0.X3(qn0Var2, false);
            }
            z11 = false;
        } else {
            this.f36902t2 = true;
            if (this.f36906v2 == null) {
                org.telegram.messenger.g0.Z3(qn0Var, false, 0.98f, true, true);
                org.telegram.messenger.g0.X3(qn0Var2, true);
            }
        }
        if (this.E2 == z11 && !z10) {
            return;
        }
        this.E2 = z11;
        lo0 lo0Var = this.F1;
        lo0Var.f();
        this.D1.f();
        if (this.E2) {
            if (this.D2 == Integer.MAX_VALUE) {
                ((u4.b0) qn0Var2.getLayoutManager()).h1(0, -qn0Var2.getPaddingTop());
            } else {
                ((u4.b0) qn0Var2.getLayoutManager()).h1(0, this.D2 - qn0Var2.getPaddingTop());
            }
            lo0Var.E(gVar2.getText().toString());
            return;
        }
        int i3 = this.D2;
        u4.s sVar = this.A1;
        if (i3 == Integer.MAX_VALUE) {
            sVar.h1(0, 0);
        } else {
            sVar.h1(0, 0);
        }
    }

    public final void L0() {
        float f10;
        TLRPC.Dialog dialog = this.f36906v2;
        if (dialog != null) {
            org.telegram.ui.Cells.c7 c7Var = null;
            this.f36906v2 = null;
            for (int i3 = 0; i3 < P0().getChildCount(); i3++) {
                View childAt = P0().getChildAt(i3);
                if ((childAt instanceof org.telegram.ui.Cells.c7) && ((org.telegram.ui.Cells.c7) childAt).getCurrentDialog() == dialog.f27005id) {
                    c7Var = childAt;
                }
            }
            if (c7Var == null) {
                return;
            }
            q1.g gVar = this.f36904u2;
            if (gVar != null) {
                gVar.d();
            }
            P0().setVisibility(0);
            n00 n00Var = this.f36898r2;
            n00Var.setVisibility(0);
            bh.g gVar2 = n00Var.f36302r;
            if (this.E2 || this.F2) {
                this.f36908w2.I.v = true;
                gVar2.requestFocus();
                org.telegram.messenger.g0.K3(gVar2);
            }
            int[] iArr = new int[2];
            q1.g gVar3 = new q1.g(new q1.f(1000.0f));
            q1.h hVar = new q1.h(0.0f);
            org.telegram.ui.wm wmVar = this.Y1;
            if (wmVar != null && wmVar.f51250b) {
                f10 = 10.0f;
            } else {
                f10 = 800.0f;
            }
            hVar.b(f10);
            hVar.a(1.0f);
            gVar3.f53653m = hVar;
            this.f36904u2 = gVar3;
            gVar3.b(new in0(this, c7Var, iArr, 0));
            this.f36904u2.a(new sa(this, 5));
            this.f36904u2.h();
        }
    }

    public final void M0() {
        boolean z10 = false;
        if (this.f36877d2 != null || this.f36881h2[0] != null) {
            try {
                ((ClipboardManager) org.telegram.messenger.t0.f25457b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", O0()));
                eo0 eo0Var = this.f36887l2;
                if (eo0Var != null) {
                    eo0Var.C0();
                } else if (this.Z1 instanceof LaunchActivity) {
                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = this.f36877d2;
                    if (tL_exportedMessageLink != null && tL_exportedMessageLink.link.contains("/c/")) {
                        z10 = true;
                    }
                    ((LaunchActivity) this.Z1).H0(new k2.x(5, z10));
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    public final String O0() {
        String str;
        String str2;
        String[] strArr = this.f36881h2;
        co0 co0Var = this.P1;
        if (co0Var != null) {
            str2 = strArr[co0Var.f32781e];
        } else {
            TLRPC.TL_exportedMessageLink tL_exportedMessageLink = this.f36877d2;
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
        wo woVar = this.X1;
        if (woVar != null && woVar.f40035a.f31334q) {
            try {
                str2 = Uri.parse(str2).buildUpon().appendQueryParameter("t", org.telegram.messenger.g0.n0(this.U1)).build().toString();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public final tj0 P0() {
        if (!this.E2 && !this.F2) {
            return this.f36911y1;
        }
        return this.f36913z1;
    }

    public final void Q0(View view, int[] iArr, float f10) {
        float width = (view.getWidth() / 2.0f) + view.getX();
        tj0 tj0Var = this.f36909x1;
        tj0Var.setPivotX(width);
        tj0Var.setPivotY((view.getHeight() / 2.0f) + view.getY());
        float f11 = 0.25f * f10;
        float f12 = 0.75f + f11;
        tj0Var.setScaleX(f12);
        tj0Var.setScaleY(f12);
        tj0Var.setAlpha(f10);
        tj0 P0 = P0();
        P0.setPivotX((view.getWidth() / 2.0f) + view.getX());
        P0.setPivotY((view.getHeight() / 2.0f) + view.getY());
        float f13 = f11 + 1.0f;
        P0.setScaleX(f13);
        P0.setScaleY(f13);
        float f14 = 1.0f - f10;
        P0.setAlpha(f14);
        n00 n00Var = this.f36898r2;
        n00Var.setPivotX(n00Var.getWidth() / 2.0f);
        n00Var.setPivotY(0.0f);
        float f15 = (0.1f * f14) + 0.9f;
        n00Var.setScaleX(f15);
        n00Var.setScaleY(f15);
        n00Var.setAlpha(f14);
        org.telegram.ui.ActionBar.k kVar = this.f36900s2;
        kVar.getBackButton().setTranslationX((-org.telegram.messenger.g0.L(16.0f)) * f14);
        kVar.getTitleTextView().setTranslationY(org.telegram.messenger.g0.L(16.0f) * f14);
        kVar.getSubtitleTextView().setTranslationY(org.telegram.messenger.g0.L(16.0f) * f14);
        kVar.setAlpha(f10);
        tj0Var.getLocationInWindow(iArr);
        float interpolation = xq.f40453g.getInterpolation(f10);
        for (int i3 = 0; i3 < P0.getChildCount(); i3++) {
            View childAt = P0.getChildAt(i3);
            if (childAt instanceof org.telegram.ui.Cells.c7) {
                childAt.setTranslationX((childAt.getX() - view.getX()) * 0.5f * interpolation);
                childAt.setTranslationY((childAt.getY() - view.getY()) * 0.5f * interpolation);
                if (childAt != view) {
                    childAt.setAlpha(1.0f - (Math.min(f10, 0.5f) / 0.5f));
                } else {
                    childAt.setAlpha(f14);
                }
            }
        }
        for (int i10 = 0; i10 < tj0Var.getChildCount(); i10++) {
            View childAt2 = tj0Var.getChildAt(i10);
            if (childAt2 instanceof org.telegram.ui.Cells.d7) {
                double d = 1.0f - interpolation;
                childAt2.setTranslationX((float) ((-(childAt2.getX() - view.getX())) * Math.pow(d, 2.0d)));
                float y9 = childAt2.getY();
                childAt2.setTranslationY((float) (Math.pow(d, 2.0d) * (-((tj0Var.getTranslationY() + y9) - view.getY()))));
            }
        }
        this.f28586b.requestLayout();
        P0.invalidate();
    }

    @Override
    public final int R() {
        return this.f28586b.getMeasuredHeight() - this.Q1;
    }

    public final void T0(boolean z10) {
        Integer num;
        float f10;
        View[] viewArr = this.L1;
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
            AnimatorSet[] animatorSetArr = this.M1;
            AnimatorSet animatorSet = animatorSetArr[0];
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSetArr[0] = animatorSet2;
            View view2 = viewArr[0];
            Property property = View.ALPHA;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(view2, property, f10));
            animatorSetArr[0].setDuration(150L);
            animatorSetArr[0].addListener(new zn0(this, z10, 0));
            animatorSetArr[0].start();
        }
    }

    public final void U0(View view, TLRPC.Dialog dialog) {
        Activity activity;
        oo0 oo0Var;
        ArrayList l10;
        ko0 ko0Var;
        if (dialog instanceof go0) {
            S0(view);
        } else if (((view instanceof org.telegram.ui.Cells.c7) && ((org.telegram.ui.Cells.c7) view).G) || ((view instanceof org.telegram.ui.Cells.f6) && ((org.telegram.ui.Cells.f6) view).f29195o0)) {
            Y0(dialog.f27005id, view);
        } else {
            tj0 tj0Var = this.f36909x1;
            if (tj0Var.getVisibility() == 8 && (activity = this.Z1) != null) {
                boolean z10 = org.telegram.messenger.m5.z(dialog.f27005id);
                int i3 = this.I1;
                if (z10) {
                    TLRPC.Chat M0 = org.telegram.messenger.hp.s1(this.f28583a).M0(Long.valueOf(-dialog.f27005id));
                    if (org.telegram.messenger.t3.T(M0) && !M0.megagroup) {
                        TLRPC.Chat M02 = org.telegram.messenger.hp.s1(this.f28583a).M0(Long.valueOf(-dialog.f27005id));
                        if ((!org.telegram.messenger.t3.n(M02) && !M02.megagroup) || i3 == 2 || i3 == 3) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                            String M03 = org.telegram.messenger.bd.M0(2131745606, null);
                            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                            s1Var.S = M03;
                            if (i3 == 3) {
                                if (org.telegram.messenger.t3.P(10, M0)) {
                                    s1Var.U = org.telegram.messenger.bd.M0(2131751085, null);
                                } else {
                                    s1Var.U = org.telegram.messenger.bd.M0(2131751086, null);
                                }
                            } else if (i3 == 2) {
                                if (this.f36880g2) {
                                    s1Var.U = org.telegram.messenger.bd.M0(2131746595, null);
                                } else if (org.telegram.messenger.t3.P(10, M0)) {
                                    s1Var.U = org.telegram.messenger.bd.M0(2131751093, null);
                                } else {
                                    s1Var.U = org.telegram.messenger.bd.M0(2131751094, null);
                                }
                            } else {
                                s1Var.U = org.telegram.messenger.bd.M0(2131752440, null);
                            }
                            k2.p1.v(null, 2131747839, alertDialog$Builder, null);
                            return;
                        }
                    }
                } else if (org.telegram.messenger.m5.C(dialog.f27005id) && i3 != 0) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(activity);
                    String M04 = org.telegram.messenger.bd.M0(2131745606, null);
                    org.telegram.ui.ActionBar.s1 s1Var2 = alertDialog$Builder2.f27343a;
                    s1Var2.S = M04;
                    if (i3 == 3) {
                        s1Var2.U = org.telegram.messenger.bd.M0(2131744100, null);
                    } else if (i3 != 0) {
                        s1Var2.U = org.telegram.messenger.bd.M0(2131747184, null);
                    } else {
                        s1Var2.U = org.telegram.messenger.bd.M0(2131749112, null);
                    }
                    k2.p1.v(null, 2131747839, alertDialog$Builder2, null);
                    return;
                }
                long j10 = dialog.f27005id;
                a0.h hVar = this.N1;
                if (hVar.h(j10) >= 0) {
                    hVar.l(dialog.f27005id);
                    this.O1.remove(dialog);
                    if (view instanceof org.telegram.ui.Cells.f6) {
                        ((org.telegram.ui.Cells.f6) view).w(false, true);
                    } else if (view instanceof org.telegram.ui.Cells.c7) {
                        ((org.telegram.ui.Cells.c7) view).b(false, true);
                    }
                    b1(1);
                    oo0Var = this;
                } else {
                    TLRPC.User a22 = org.telegram.messenger.hp.s1(this.f28583a).a2(Long.valueOf(dialog.f27005id));
                    TLRPC.Chat M05 = org.telegram.messenger.hp.s1(this.f28583a).M0(Long.valueOf(-dialog.f27005id));
                    if ((!org.telegram.messenger.l10.u(a22) || (((l10 = org.telegram.messenger.hp.s1(this.f28583a).f23102q7.l(-a22.f27150id)) == null || l10.isEmpty()) && org.telegram.messenger.hp.s1(this.f28583a).f23102q7.e(-a22.f27150id))) && (!org.telegram.messenger.m5.z(dialog.f27005id) || (!org.telegram.messenger.t3.c0(M05) && (!org.telegram.messenger.t3.p0(M05) || !org.telegram.messenger.t3.A(this.f28583a, M05, 24))))) {
                        oo0Var = this;
                        hVar.k(dialog, dialog.f27005id);
                        if (view instanceof org.telegram.ui.Cells.f6) {
                            ((org.telegram.ui.Cells.f6) view).w(true, true);
                        } else if (view instanceof org.telegram.ui.Cells.c7) {
                            ((org.telegram.ui.Cells.c7) view).b(true, true);
                        }
                        b1(2);
                        long j11 = org.telegram.messenger.h10.i(oo0Var.f28583a).f22848n;
                        if (oo0Var.E2) {
                            ho0 ho0Var = oo0Var.D1;
                            a0.h hVar2 = ho0Var.f34465e;
                            ArrayList arrayList = ho0Var.d;
                            TLRPC.Dialog dialog2 = (TLRPC.Dialog) hVar2.f(dialog.f27005id);
                            if (dialog2 == null) {
                                ho0Var.f34465e.k(dialog, dialog.f27005id);
                                arrayList.add(!arrayList.isEmpty(), dialog);
                            } else if (dialog2.f27005id != j11) {
                                arrayList.remove(dialog2);
                                arrayList.add(!arrayList.isEmpty(), dialog2);
                            }
                            ho0Var.f();
                            oo0Var.f36902t2 = false;
                            n00 n00Var = oo0Var.f36898r2;
                            n00Var.f36302r.setText("");
                            K0(false);
                            org.telegram.messenger.g0.v1(n00Var.f36302r);
                        }
                    } else {
                        this.f36906v2 = dialog;
                        this.B1.h1(0, this.f36882i2 - tj0Var.getPaddingTop());
                        AtomicReference atomicReference = new AtomicReference();
                        xn0 xn0Var = new xn0(this, dialog, atomicReference, view);
                        atomicReference.set(new v60(this, atomicReference, xn0Var, dialog, 6));
                        org.telegram.messenger.hs f10 = org.telegram.messenger.hs.f(this.f28583a);
                        int i10 = org.telegram.messenger.hs.f23291q5;
                        f10.b(xn0Var, i10);
                        if (org.telegram.messenger.hp.s1(this.f28583a).f23102q7.l(-dialog.f27005id) != null) {
                            xn0Var.didReceivedNotification(i10, this.f28583a, Long.valueOf(-dialog.f27005id));
                            return;
                        }
                        org.telegram.messenger.hp.s1(this.f28583a).f23102q7.o(-dialog.f27005id);
                        org.telegram.messenger.g0.i3((Runnable) atomicReference.get(), 300L);
                        return;
                    }
                }
                lo0 lo0Var = oo0Var.F1;
                if (lo0Var != null && (ko0Var = lo0Var.I) != null) {
                    ko0Var.k(0, ko0Var.b());
                }
            }
        }
    }

    public final void V0(final boolean z10) {
        int i3;
        int i10;
        int i11;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            a0.h hVar = this.N1;
            int m10 = hVar.m();
            tn0 tn0Var = this.k1;
            un0 un0Var = this.f36886l1;
            boolean z11 = true;
            if (i13 < m10) {
                long j10 = hVar.j(i13);
                if (t4.h(getContext(), this.f28583a, j10, (tn0Var.getTag() == null || un0Var.f35188a.length() <= 0) ? false : false)) {
                    return;
                }
                i13++;
            } else {
                Editable text = un0Var.getText();
                dt dtVar = un0Var.f35188a;
                final CharSequence[] charSequenceArr = {text};
                final ArrayList W = org.telegram.messenger.li.b0(this.f28583a).W(charSequenceArr, true, true);
                wo woVar = this.X1;
                if (woVar != null && woVar.f40035a.f31334q) {
                    i3 = this.U1;
                } else {
                    i3 = -1;
                }
                ArrayList arrayList = new ArrayList();
                if (this.G1 != null) {
                    i11 = 0;
                    while (i12 < hVar.m()) {
                        long j11 = hVar.j(i12);
                        long N1 = org.telegram.messenger.hp.s1(this.f28583a).N1(j11);
                        if (N1 <= 0) {
                            N1 = org.telegram.messenger.m5.k(org.telegram.messenger.hp.s1(this.f28583a).J2(j11));
                        }
                        if (tn0Var.getTag() != null && dtVar.length() > 0 && N1 > 0) {
                            i11++;
                        }
                        int i14 = (N1 > 0L ? 1 : (N1 == 0L ? 0 : -1));
                        if (i14 > 0) {
                            i11++;
                        }
                        if (i14 > 0 && !arrayList.contains(Long.valueOf(j11))) {
                            arrayList.add(Long.valueOf(j11));
                        }
                        i12++;
                    }
                } else {
                    co0 co0Var = this.P1;
                    if (co0Var != null) {
                        i10 = co0Var.f32781e;
                    } else {
                        i10 = 0;
                    }
                    if (this.f36912y2 != null) {
                        int i15 = 0;
                        int i16 = 0;
                        while (i15 < hVar.m()) {
                            long j12 = hVar.j(i15);
                            long N12 = org.telegram.messenger.hp.s1(this.f28583a).N1(j12);
                            if (N12 <= 0) {
                                N12 = org.telegram.messenger.m5.k(org.telegram.messenger.hp.s1(this.f28583a).J2(j12));
                            }
                            int i17 = i12;
                            if (this.f36912y2 != null && tn0Var.getTag() != null && dtVar.length() > 0 && charSequenceArr[i17] != null && N12 > 0) {
                                i16++;
                            }
                            int i18 = (N12 > 0L ? 1 : (N12 == 0L ? 0 : -1));
                            if (i18 > 0) {
                                i16++;
                            }
                            if (i18 > 0 && !arrayList.contains(Long.valueOf(j12))) {
                                arrayList.add(Long.valueOf(j12));
                            }
                            i15++;
                            i12 = i17;
                        }
                        i11 = i16;
                    } else {
                        int i19 = 0;
                        if (this.H1[i10] != null) {
                            for (int i20 = 0; i20 < hVar.m(); i20++) {
                                long j13 = hVar.j(i20);
                                long N13 = org.telegram.messenger.hp.s1(this.f28583a).N1(j13);
                                if (N13 <= 0) {
                                    N13 = org.telegram.messenger.m5.k(org.telegram.messenger.hp.s1(this.f28583a).J2(j13));
                                }
                                if (tn0Var.getTag() != null && dtVar.length() > 0 && N13 > 0) {
                                    i19++;
                                }
                                int i21 = (N13 > 0L ? 1 : (N13 == 0L ? 0 : -1));
                                if (i21 > 0) {
                                    i19++;
                                }
                                if (i21 > 0 && !arrayList.contains(Long.valueOf(j13))) {
                                    arrayList.add(Long.valueOf(j13));
                                }
                            }
                        }
                        i11 = i19;
                    }
                }
                final int i22 = i3;
                t4.b0(this.f28583a, arrayList, i11, new org.telegram.messenger.u10() {
                    @Override
                    public final void a(Object obj) {
                        int i23;
                        int i24;
                        boolean z12;
                        Long l10;
                        int i25;
                        HashMap hashMap;
                        long j14;
                        boolean z13;
                        char c2;
                        org.telegram.messenger.zi ziVar;
                        un0 un0Var2;
                        long longValue;
                        String charSequence;
                        long longValue2;
                        Long l11;
                        boolean z14;
                        boolean z15;
                        long j15;
                        String[] strArr;
                        org.telegram.messenger.zi ziVar2;
                        org.telegram.messenger.wy b10;
                        long longValue3;
                        String charSequence2;
                        ArrayList arrayList2;
                        TLRPC.TL_forumTopic tL_forumTopic;
                        TLRPC.TL_forumTopic tL_forumTopic2;
                        Long l12;
                        boolean z16;
                        int i26;
                        boolean z17;
                        long j16;
                        Long l13;
                        CharSequence[] charSequenceArr2;
                        org.telegram.messenger.zi ziVar3;
                        org.telegram.messenger.zi ziVar4;
                        ArrayList arrayList3;
                        ?? r11;
                        long longValue4;
                        String charSequence3;
                        long longValue5;
                        HashMap hashMap2 = (HashMap) obj;
                        oo0 oo0Var = oo0.this;
                        String[] strArr2 = oo0Var.H1;
                        un0 un0Var3 = oo0Var.f36886l1;
                        tn0 tn0Var2 = oo0Var.k1;
                        HashMap hashMap3 = oo0Var.O1;
                        Long l14 = 0L;
                        a0.h hVar2 = oo0Var.N1;
                        ArrayList arrayList4 = oo0Var.G1;
                        CharSequence[] charSequenceArr3 = charSequenceArr;
                        ArrayList arrayList5 = W;
                        boolean z18 = z10;
                        if (arrayList4 != null) {
                            ArrayList arrayList6 = new ArrayList();
                            int i27 = 0;
                            boolean z19 = false;
                            while (true) {
                                if (i27 < hVar2.m()) {
                                    boolean z20 = z18;
                                    long j17 = hVar2.j(i27);
                                    boolean y22 = org.telegram.messenger.hp.s1(oo0Var.f28583a).y2(j17);
                                    tn0 tn0Var3 = tn0Var2;
                                    if (hashMap2 == null) {
                                        l12 = l14;
                                    } else {
                                        l12 = (Long) hashMap2.get(Long.valueOf(j17));
                                    }
                                    if (l12 != null && l12.longValue() > 0) {
                                        z16 = true;
                                    } else {
                                        z16 = z19;
                                    }
                                    Long l15 = l12;
                                    TLRPC.TL_forumTopic tL_forumTopic3 = (TLRPC.TL_forumTopic) hashMap3.get(hVar2.f(j17));
                                    if (tL_forumTopic3 != null && y22) {
                                        i26 = i27;
                                        z17 = y22;
                                        j16 = org.telegram.messenger.m5.o(tL_forumTopic3.from_id);
                                    } else {
                                        i26 = i27;
                                        z17 = y22;
                                        j16 = 0;
                                    }
                                    if (tL_forumTopic3 != null && !z17) {
                                        l13 = l14;
                                        arrayList2 = arrayList4;
                                        charSequenceArr2 = charSequenceArr3;
                                        ziVar3 = new org.telegram.messenger.zi(oo0Var.f28583a, tL_forumTopic3.topicStartMessage, false, false);
                                    } else {
                                        l13 = l14;
                                        arrayList2 = arrayList4;
                                        charSequenceArr2 = charSequenceArr3;
                                        ziVar3 = null;
                                    }
                                    if (ziVar3 != null) {
                                        ziVar3.f26885p = true;
                                    }
                                    if (tn0Var3.getTag() != null && un0Var3.f35188a.length() > 0) {
                                        CharSequence charSequence4 = charSequenceArr2[0];
                                        if (charSequence4 == null) {
                                            charSequence3 = null;
                                        } else {
                                            charSequence3 = charSequence4.toString();
                                        }
                                        r11 = 0;
                                        ziVar4 = ziVar3;
                                        ArrayList arrayList7 = arrayList5;
                                        org.telegram.messenger.wy b11 = org.telegram.messenger.wy.b(charSequence3, j17, ziVar4, ziVar3, null, true, arrayList7, null, null, z20, 0, 0, null, false);
                                        arrayList3 = arrayList7;
                                        z20 = z20;
                                        if (l15 == null) {
                                            longValue5 = 0;
                                        } else {
                                            longValue5 = l15.longValue();
                                        }
                                        b11.Q = longValue5;
                                        b11.R = j16;
                                        org.telegram.messenger.yy.C(oo0Var.f28583a).r0(b11);
                                    } else {
                                        ziVar4 = ziVar3;
                                        arrayList3 = arrayList5;
                                        r11 = 0;
                                    }
                                    org.telegram.messenger.yy C = org.telegram.messenger.yy.C(oo0Var.f28583a);
                                    org.telegram.messenger.zi ziVar5 = ziVar4;
                                    ArrayList arrayList8 = oo0Var.G1;
                                    boolean z21 = !oo0Var.B2;
                                    if (l15 == null) {
                                        longValue4 = 0;
                                    } else {
                                        longValue4 = l15.longValue();
                                    }
                                    boolean z22 = z20;
                                    int q02 = C.q0(arrayList8, j17, z21, false, z22, 0, 0, ziVar5, i22, longValue4, j16, null);
                                    if (q02 != 0) {
                                        arrayList6.add(Long.valueOf(j17));
                                    }
                                    if (hVar2.m() == 1) {
                                        t4.s0(q02, oo0Var.Y1, r11);
                                        if (q02 != 0) {
                                            z19 = z16;
                                            tL_forumTopic = r11;
                                            break;
                                        }
                                    }
                                    i27 = i26 + 1;
                                    arrayList5 = arrayList3;
                                    z18 = z22;
                                    tn0Var2 = tn0Var3;
                                    z19 = z16;
                                    l14 = l13;
                                    arrayList4 = arrayList2;
                                    charSequenceArr3 = charSequenceArr2;
                                } else {
                                    arrayList2 = arrayList4;
                                    tL_forumTopic = null;
                                    break;
                                }
                            }
                            int size = arrayList6.size();
                            int i28 = 0;
                            while (i28 < size) {
                                Object obj2 = arrayList6.get(i28);
                                i28++;
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
                                oo0Var.R0(hVar2, size2, tL_forumTopic2, !z19);
                            }
                        } else {
                            boolean z23 = z18;
                            co0 co0Var2 = oo0Var.P1;
                            if (co0Var2 != null) {
                                i23 = co0Var2.f32781e;
                            } else {
                                i23 = 0;
                            }
                            if (oo0Var.f36912y2 != null) {
                                int i29 = 0;
                                boolean z24 = false;
                                while (i29 < hVar2.m()) {
                                    long j18 = hVar2.j(i29);
                                    boolean y23 = org.telegram.messenger.hp.s1(oo0Var.f28583a).y2(j18);
                                    if (hashMap2 == null) {
                                        l11 = l14;
                                    } else {
                                        l11 = (Long) hashMap2.get(Long.valueOf(j18));
                                    }
                                    if (l11 != null && l11.longValue() > 0) {
                                        z24 = true;
                                    }
                                    TLRPC.TL_forumTopic tL_forumTopic4 = (TLRPC.TL_forumTopic) hashMap3.get(hVar2.f(j18));
                                    if (tL_forumTopic4 != null && y23) {
                                        z14 = z24;
                                        z15 = y23;
                                        j15 = org.telegram.messenger.m5.o(tL_forumTopic4.from_id);
                                    } else {
                                        z14 = z24;
                                        z15 = y23;
                                        j15 = 0;
                                    }
                                    if (tL_forumTopic4 != null && !z15) {
                                        strArr = strArr2;
                                        ziVar2 = new org.telegram.messenger.zi(oo0Var.f28583a, tL_forumTopic4.topicStartMessage, false, false);
                                    } else {
                                        strArr = strArr2;
                                        ziVar2 = null;
                                    }
                                    if (oo0Var.f36912y2 == null) {
                                        if (tn0Var2.getTag() != null && un0Var3.f35188a.length() > 0) {
                                            CharSequence charSequence5 = charSequenceArr3[0];
                                            if (charSequence5 == null) {
                                                charSequence2 = null;
                                            } else {
                                                charSequence2 = charSequence5.toString();
                                            }
                                            boolean z25 = z23;
                                            b10 = org.telegram.messenger.wy.b(charSequence2, j18, ziVar2, ziVar2, null, true, arrayList5, null, null, z25, 0, 0, null, false);
                                            z23 = z25;
                                        } else {
                                            b10 = org.telegram.messenger.wy.b(strArr[i23], j18, ziVar2, ziVar2, null, true, null, null, null, z23, 0, 0, null, false);
                                        }
                                    } else {
                                        if (tn0Var2.getTag() != null && un0Var3.f35188a.length() > 0 && charSequenceArr3[0] != null) {
                                            org.telegram.messenger.zi ziVar6 = ziVar2;
                                            ziVar2 = ziVar6;
                                            org.telegram.messenger.yy.C(oo0Var.f28583a).r0(org.telegram.messenger.wy.b(charSequenceArr3[0].toString(), j18, null, ziVar6, null, true, null, null, null, z23, 0, 0, null, false));
                                        }
                                        b10 = org.telegram.messenger.wy.b(null, j18, ziVar2, ziVar2, null, true, null, null, null, z23, 0, 0, null, false);
                                        b10.I = oo0Var.f36912y2;
                                    }
                                    if (l11 == null) {
                                        longValue3 = 0;
                                    } else {
                                        longValue3 = l11.longValue();
                                    }
                                    b10.Q = longValue3;
                                    b10.R = j15;
                                    org.telegram.messenger.yy.C(oo0Var.f28583a).r0(b10);
                                    i29++;
                                    z24 = z14;
                                    strArr2 = strArr;
                                }
                                z12 = z24;
                            } else if (strArr2[i23] != null) {
                                int i30 = 0;
                                boolean z26 = false;
                                while (i30 < hVar2.m()) {
                                    long j19 = hVar2.j(i30);
                                    boolean y24 = org.telegram.messenger.hp.s1(oo0Var.f28583a).y2(j19);
                                    if (hashMap2 == null) {
                                        l10 = l14;
                                    } else {
                                        l10 = (Long) hashMap2.get(Long.valueOf(j19));
                                    }
                                    if (l10 != null && l10.longValue() > 0) {
                                        z26 = true;
                                    }
                                    TLRPC.TL_forumTopic tL_forumTopic5 = (TLRPC.TL_forumTopic) hashMap3.get(hVar2.f(j19));
                                    if (tL_forumTopic5 != null && y24) {
                                        i25 = i30;
                                        hashMap = hashMap2;
                                        j14 = org.telegram.messenger.m5.o(tL_forumTopic5.from_id);
                                    } else {
                                        i25 = i30;
                                        hashMap = hashMap2;
                                        j14 = 0;
                                    }
                                    if (tL_forumTopic5 != null && !y24) {
                                        z13 = z26;
                                        c2 = 0;
                                        ziVar = new org.telegram.messenger.zi(oo0Var.f28583a, tL_forumTopic5.topicStartMessage, false, false);
                                    } else {
                                        z13 = z26;
                                        c2 = 0;
                                        ziVar = null;
                                    }
                                    if (tn0Var2.getTag() != null && un0Var3.f35188a.length() > 0) {
                                        CharSequence charSequence6 = charSequenceArr3[c2];
                                        if (charSequence6 == null) {
                                            charSequence = null;
                                        } else {
                                            charSequence = charSequence6.toString();
                                        }
                                        boolean z27 = z23;
                                        org.telegram.messenger.wy b12 = org.telegram.messenger.wy.b(charSequence, j19, ziVar, ziVar, null, true, arrayList5, null, null, z27, 0, 0, null, false);
                                        z23 = z27;
                                        if (l10 == null) {
                                            un0Var2 = un0Var3;
                                            longValue2 = 0;
                                        } else {
                                            un0Var2 = un0Var3;
                                            longValue2 = l10.longValue();
                                        }
                                        b12.Q = longValue2;
                                        b12.R = j14;
                                        org.telegram.messenger.yy.C(oo0Var.f28583a).r0(b12);
                                    } else {
                                        un0Var2 = un0Var3;
                                    }
                                    org.telegram.messenger.zi ziVar7 = ziVar;
                                    org.telegram.messenger.wy b13 = org.telegram.messenger.wy.b(strArr2[i23], j19, ziVar7, ziVar7, null, true, null, null, null, z23, 0, 0, null, false);
                                    if (l10 == null) {
                                        longValue = 0;
                                    } else {
                                        longValue = l10.longValue();
                                    }
                                    b13.Q = longValue;
                                    b13.R = j14;
                                    org.telegram.messenger.yy.C(oo0Var.f28583a).r0(b13);
                                    i30 = i25 + 1;
                                    un0Var3 = un0Var2;
                                    hashMap2 = hashMap;
                                    z26 = z13;
                                }
                                z12 = z26;
                            } else {
                                i24 = 0;
                                z12 = false;
                                oo0Var.R0(hVar2, 1, (TLRPC.TL_forumTopic) hashMap3.get(hVar2.n(i24)), !z12);
                            }
                            i24 = 0;
                            oo0Var.R0(hVar2, 1, (TLRPC.TL_forumTopic) hashMap3.get(hVar2.n(i24)), !z12);
                        }
                        eo0 eo0Var = oo0Var.f36887l2;
                        if (eo0Var != null) {
                            eo0Var.W();
                        }
                        oo0Var.dismiss();
                    }
                });
                return;
            }
        }
    }

    public final void X0(boolean z10) {
        boolean z11;
        Integer num;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        int i3;
        tn0 tn0Var = this.k1;
        if (tn0Var.getTag() != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 == z11) {
            return;
        }
        AnimatorSet animatorSet = this.f36907w1;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z10) {
            num = 1;
        } else {
            num = null;
        }
        tn0Var.setTag(num);
        un0 un0Var = this.f36886l1;
        if (un0Var.getEditText().isFocused()) {
            org.telegram.messenger.g0.v1(un0Var.getEditText());
        }
        un0Var.k(true);
        FrameLayout frameLayout = this.V1;
        tn0 tn0Var2 = this.f36889n1;
        FrameLayout frameLayout2 = this.f36891o1;
        if (z10) {
            tn0Var.setVisibility(0);
            if (frameLayout != null && frameLayout2 == null) {
                frameLayout.setVisibility(0);
            }
            tn0Var2.setVisibility(0);
        } else if (frameLayout2 != null) {
            frameLayout2.setVisibility(0);
        }
        int i10 = 4;
        if (frameLayout2 != null) {
            if (z10) {
                i3 = 4;
            } else {
                i3 = 1;
            }
            WeakHashMap weakHashMap = r0.i0.f54015a;
            frameLayout2.setImportantForAccessibility(i3);
        }
        LinearLayout linearLayout = this.f36905v1;
        if (linearLayout != null) {
            if (!z10) {
                i10 = 1;
            }
            WeakHashMap weakHashMap2 = r0.i0.f54015a;
            linearLayout.setImportantForAccessibility(i10);
        }
        this.f36907w1 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        float f15 = 0.0f;
        float f16 = 1.0f;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(tn0Var, property, f10));
        if (frameLayout != null && frameLayout2 == null) {
            if (z10) {
                f14 = 1.0f;
            } else {
                f14 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(frameLayout, property, f14));
        }
        Property property2 = View.SCALE_X;
        float f17 = 0.2f;
        if (z10) {
            f11 = 1.0f;
        } else {
            f11 = 0.2f;
        }
        arrayList.add(ObjectAnimator.ofFloat(tn0Var2, property2, f11));
        Property property3 = View.SCALE_Y;
        if (z10) {
            f17 = 1.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(tn0Var2, property3, f17));
        if (z10) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(tn0Var2, property, f12));
        if (frameLayout2 == null || frameLayout2.getVisibility() != 0) {
            View view = this.L1[1];
            if (!z10) {
                f16 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(view, property, f16));
        }
        FrameLayout frameLayout3 = this.f36897r1;
        if (frameLayout3 != null) {
            Property property4 = View.TRANSLATION_Y;
            if (this.f36875a2 && z10) {
                if (this.W1 != null) {
                    f13 = 5.0f;
                } else {
                    f13 = 16.0f;
                }
                f15 = org.telegram.messenger.g0.L(f13);
            }
            arrayList.add(ObjectAnimator.ofFloat(frameLayout3, property4, f15));
        }
        this.f36907w1.playTogether(arrayList);
        this.f36907w1.setInterpolator(new DecelerateInterpolator());
        this.f36907w1.setDuration(180L);
        this.f36907w1.addListener(new zn0(this, z10, 1));
        this.f36907w1.start();
    }

    public final void Y0(long j10, View view) {
        String str;
        ac K;
        int i3 = -this.A2;
        this.A2 = i3;
        org.telegram.messenger.g0.G3(i3, view, null);
        org.telegram.messenger.p2.APP_ERROR.a();
        if (j10 >= 0) {
            str = org.telegram.messenger.l10.p(org.telegram.messenger.hp.s1(this.f28583a).a2(Long.valueOf(j10)));
        } else {
            str = "";
        }
        boolean D3 = org.telegram.messenger.hp.s1(this.f28583a).D3();
        FrameLayout frameLayout = this.f36901t1;
        if (D3) {
            K = new fc(frameLayout, this.J0).Q(2131624216, 36, org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0(null, null, 2131743770, str)));
        } else {
            K = new fc(frameLayout, this.J0).K(2131624216, org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0(null, null, 2131743770, str)), org.telegram.messenger.bd.M0(2131743769, null), new ln0(this, 1));
        }
        K.j();
    }

    public final void Z0() {
        org.telegram.ui.ActionBar.h1 h1Var;
        tn0 tn0Var = this.k1;
        if (tn0Var == null) {
            return;
        }
        un0 un0Var = this.f36886l1;
        if (un0Var != null && un0Var.m()) {
            un0Var.getEmojiPaddingShown();
        } else {
            bo0 bo0Var = this.f36908w2;
            if (bo0Var != null && (h1Var = bo0Var.I) != null && !h1Var.f27556f) {
                org.telegram.messenger.g0.L(20.0f);
            }
        }
        float f10 = 0.0f;
        FrameLayout frameLayout = this.V1;
        if (frameLayout != null) {
            frameLayout.setTranslationY(-0.0f);
            f10 = 0.0f + org.telegram.messenger.g0.L(48.0f);
        }
        FrameLayout frameLayout2 = this.f36891o1;
        if (frameLayout2 != null) {
            frameLayout2.setTranslationY(-f10);
        }
        float f11 = -f10;
        tn0Var.setTranslationY(f11);
        this.f36889n1.setTranslationY(f11);
    }

    public final void a1() {
        org.telegram.ui.ActionBar.k5 k5Var = this.f36899s1;
        if (k5Var != null) {
            String O0 = O0();
            if (O0.startsWith("https://")) {
                O0 = O0.substring(8);
            } else if (O0.startsWith("http://")) {
                O0 = O0.substring(7);
            }
            k5Var.l(O0, false);
        }
    }

    public final void b1(int i3) {
        int size;
        boolean z10;
        boolean z11;
        a0.h hVar = this.N1;
        if (hVar.m() == 0) {
            X0(false);
            return;
        }
        ArrayList arrayList = this.G1;
        if (arrayList == null) {
            size = 1;
        } else {
            size = arrayList.size();
        }
        Object tag = this.k1.getTag();
        un0 un0Var = this.f36886l1;
        if (tag != null && un0Var.f35188a.length() > 0) {
            size++;
        }
        long j10 = 0;
        for (int i10 = 0; i10 < hVar.m(); i10++) {
            long j11 = ((TLRPC.Dialog) hVar.n(i10)).f27005id;
            long N1 = org.telegram.messenger.hp.s1(this.f28583a).N1(j11);
            if (N1 <= 0) {
                N1 = org.telegram.messenger.m5.k(org.telegram.messenger.hp.s1(this.f28583a).J2(j11));
            }
            j10 += N1;
        }
        int max = Math.max(1, hVar.m());
        if (i3 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        mi.x1 x1Var = this.m1;
        x1Var.e(max, z10);
        if (i3 != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        x1Var.i(size, j10, z11);
        X0(true);
        un0Var.setPadding(0, 0, Math.max(org.telegram.messenger.g0.L(84.0f), x1Var.l()), 0);
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        int i11 = org.telegram.messenger.hs.f23298s;
        if (i3 == i11) {
            ho0 ho0Var = this.D1;
            if (ho0Var != null) {
                ho0Var.E();
            }
            org.telegram.messenger.hs.f(this.f28583a).n(this, i11);
        }
    }

    @Override
    public final void dismiss() {
        un0 un0Var = this.f36886l1;
        if (un0Var != null) {
            org.telegram.messenger.g0.v1(un0Var.getEditText());
        }
        this.R1 = false;
        super.dismiss();
        org.telegram.messenger.hs.f(this.f28583a).n(this, org.telegram.messenger.hs.f23298s);
    }

    @Override
    public final void onBackPressed() {
        if (this.f36906v2 != null) {
            L0();
            return;
        }
        un0 un0Var = this.f36886l1;
        if (un0Var != null && un0Var.f35191e) {
            un0Var.k(true);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void s0() {
        boolean z10;
        try {
            super.s0();
            si.c cVar = this.I2;
            if (cVar != null) {
                cVar.a(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27878d6, this.J0));
            }
            org.telegram.ui.ActionBar.j2 j2Var = this.f28589c;
            if (j2Var != null) {
                if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27954h5, this.J0)) > 0.721f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 != this.Q2) {
                    this.Q2 = z10;
                    org.telegram.messenger.g0.o3(j2Var, z10);
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public oo0(Context context, ArrayList arrayList, String str, String str2, boolean z10, String str3, String str4, boolean z11) {
        this(context, null, arrayList, str, str2, z10, str3, str4, false, z11, false, null, null);
    }

    public oo0(android.content.Context r39, org.telegram.ui.wm r40, java.util.ArrayList r41, java.lang.String r42, java.lang.String r43, boolean r44, java.lang.String r45, java.lang.String r46, boolean r47, boolean r48, boolean r49, java.lang.Integer r50, org.telegram.ui.ActionBar.e6 r51) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.oo0.<init>(android.content.Context, org.telegram.ui.wm, java.util.ArrayList, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, boolean, boolean, boolean, java.lang.Integer, org.telegram.ui.ActionBar.e6):void");
    }

    public void S0(View view) {
    }

    public void R0(a0.h hVar, int i3, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
    }
}
