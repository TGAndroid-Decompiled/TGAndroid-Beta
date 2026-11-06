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
public class mo0 extends org.telegram.ui.ActionBar.v2 implements org.telegram.messenger.ls {
    public static final int Q2 = 0;
    public final v4.s A1;
    public boolean A2;
    public final ky B1;
    public org.telegram.ui.ActionBar.g1 B2;
    public final fo0 C1;
    public int C2;
    public final ko0 D1;
    public boolean D2;
    public final jo0 E1;
    public boolean E2;
    public final ArrayList F1;
    public int F2;
    public final String[] G1;
    public final dh.g G2;
    public final int H1;
    public final ri.c H2;
    public final av0 I1;
    public final dh.c I2;
    public final Drawable J1;
    public final dh.c J2;
    public final View[] K1;
    public final dh.c K2;
    public final AnimatorSet[] L1;
    public final ug L2;
    public final a0.h M1;
    public final fh.g M2;
    public final HashMap N1;
    public final dh.d N2;
    public final ao0 O1;
    public final fh.g O2;
    public int P1;
    public boolean P2;
    public boolean Q1;
    public final boolean R1;
    public boolean S1;
    public final int T1;
    public final FrameLayout U1;
    public final LinearLayout V1;
    public final wo W1;
    public final org.telegram.ui.an X1;
    public final Activity Y1;
    public final boolean Z1;
    public boolean f36008a2;
    public final TextPaint f36009b2;
    public TLRPC.TL_exportedMessageLink f36010c2;
    public boolean d2;
    public boolean f36011e2;
    public final boolean f36012f2;
    public final String[] f36013g2;
    public int f36014h2;
    public final FrameLayout f36015i1;
    public int f36016i2;
    public final rn0 f36017j1;
    public boolean f36018j2;
    public final sn0 f36019k1;
    public co0 f36020k2;
    public final li.w1 l1;
    public float f36021l2;
    public final rn0 f36022m1;
    public float f36023m2;
    public final FrameLayout n1;
    public float f36024n2;
    public float f36025o1;
    public ValueAnimator f36026o2;
    public final bi.ec f36027p1;
    public final si0 f36028p2;
    public final FrameLayout f36029q1;
    public final r00 f36030q2;
    public final org.telegram.ui.ActionBar.k5 f36031r1;
    public final org.telegram.ui.ActionBar.k f36032r2;
    public final FrameLayout f36033s1;
    public boolean f36034s2;
    public final FrameLayout f36035t1;
    public r1.g f36036t2;
    public final LinearLayout f36037u1;
    public TLRPC.Dialog f36038u2;
    public AnimatorSet f36039v1;
    public final zn0 f36040v2;
    public final pj0 f36041w1;
    public ArrayList f36042w2;
    public final on0 f36043x1;
    public TL_stories.StoryItem f36044x2;
    public final on0 f36045y1;
    public i0.b f36046y2;
    public final v4.s f36047z1;
    public int f36048z2;

    public mo0(Context context, ArrayList arrayList, String str, boolean z9, String str2, boolean z10, org.telegram.ui.ActionBar.f6 f6Var) {
        this(context, null, arrayList, str, null, z9, str2, null, z10, false, false, null, f6Var);
    }

    public static void I0(mo0 mo0Var) {
        on0 on0Var;
        int i7;
        int i10;
        on0 on0Var2 = mo0Var.f36043x1;
        on0 on0Var3 = mo0Var.f36045y1;
        pj0 pj0Var = mo0Var.f36041w1;
        if (!mo0Var.f36018j2) {
            if (mo0Var.D2) {
                on0Var = on0Var3;
            } else {
                on0Var = on0Var2;
            }
            if (on0Var.getChildCount() > 0) {
                View childAt = on0Var.getChildAt(0);
                for (int i11 = 0; i11 < on0Var.getChildCount(); i11++) {
                    if (on0Var.getChildAt(i11).getTop() < childAt.getTop()) {
                        childAt = on0Var.getChildAt(i11);
                    }
                }
                xi0 xi0Var = (xi0) on0Var.G(childAt);
                int top = childAt.getTop() - org.telegram.messenger.g0.L(8.0f);
                if (top > 0 && xi0Var != null && xi0Var.b() == 0) {
                    i7 = top;
                } else {
                    i7 = 0;
                }
                if (top >= 0 && xi0Var != null && xi0Var.b() == 0) {
                    mo0Var.C2 = childAt.getTop();
                    mo0Var.T0(false);
                } else {
                    mo0Var.C2 = Integer.MAX_VALUE;
                    mo0Var.T0(true);
                    top = i7;
                }
                if (pj0Var.getVisibility() == 0) {
                    if (pj0Var.getChildCount() > 0) {
                        View childAt2 = pj0Var.getChildAt(0);
                        for (int i12 = 0; i12 < pj0Var.getChildCount(); i12++) {
                            if (pj0Var.getChildAt(i12).getTop() < childAt2.getTop()) {
                                childAt2 = pj0Var.getChildAt(i12);
                            }
                        }
                        xi0 xi0Var2 = (xi0) pj0Var.G(childAt2);
                        int top2 = childAt2.getTop() - org.telegram.messenger.g0.L(8.0f);
                        if (top2 > 0 && xi0Var2 != null && xi0Var2.b() == 0) {
                            i10 = top2;
                        } else {
                            i10 = 0;
                        }
                        if (top2 >= 0 && xi0Var2 != null && xi0Var2.b() == 0) {
                            mo0Var.C2 = childAt2.getTop();
                            mo0Var.T0(false);
                        } else {
                            mo0Var.C2 = Integer.MAX_VALUE;
                            mo0Var.T0(true);
                            top2 = i10;
                        }
                        top = org.telegram.messenger.g0.W1(pj0Var.getAlpha(), top, top2);
                    } else {
                        return;
                    }
                }
                int i13 = mo0Var.f36014h2;
                if (i13 != top) {
                    mo0Var.f36016i2 = i13;
                    float f10 = top;
                    int i14 = (int) (mo0Var.f36021l2 + f10);
                    mo0Var.f36014h2 = i14;
                    on0Var2.setTopGlowOffset(i14);
                    int i15 = (int) (mo0Var.f36021l2 + f10);
                    mo0Var.f36014h2 = i15;
                    on0Var3.setTopGlowOffset(i15);
                    int i16 = (int) (f10 + mo0Var.f36021l2);
                    mo0Var.f36014h2 = i16;
                    pj0Var.setTopGlowOffset(i16);
                    mo0Var.f36015i1.setTranslationY(mo0Var.f36014h2 + mo0Var.f36021l2);
                    mo0Var.I1.setTranslationY(mo0Var.f36014h2 + mo0Var.f36021l2);
                    mo0Var.f28616b.invalidate();
                }
            }
        }
    }

    public static int J0(mo0 mo0Var) {
        on0 on0Var = mo0Var.f36043x1;
        if (on0Var.getChildCount() != 0) {
            int i7 = 0;
            View childAt = on0Var.getChildAt(0);
            xi0 xi0Var = (xi0) on0Var.G(childAt);
            if (xi0Var != null) {
                int paddingTop = on0Var.getPaddingTop();
                if (xi0Var.c() == 0 && childAt.getTop() >= 0) {
                    i7 = childAt.getTop();
                }
                return paddingTop - i7;
            }
            return -1000;
        }
        return -1000;
    }

    public static mo0 N0(Context context, org.telegram.messenger.ij ijVar, String str, boolean z9, String str2) {
        ArrayList arrayList;
        if (ijVar != null) {
            arrayList = org.telegram.messenger.k5.k(ijVar);
        } else {
            arrayList = null;
        }
        return new mo0(context, arrayList, str, null, z9, str2, null, false);
    }

    public static void W0(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        int i10;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i7, f6Var);
        int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
        for (int i11 = 0; i11 < itemsCount; i11++) {
            View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i11);
            int i12 = 6;
            if (i11 == 0) {
                i10 = 6;
            } else {
                i10 = 0;
            }
            if (i11 != itemsCount - 1) {
                i12 = 0;
            }
            org.telegram.ui.ActionBar.r6.R(childAt, org.telegram.ui.ActionBar.k6.a0(w02, i10, i12), null, org.telegram.ui.ActionBar.r6.N(i7), f6Var);
        }
    }

    @Override
    public final boolean G() {
        return false;
    }

    @Override
    public void K() {
        super.K();
        sn0 sn0Var = this.f36019k1;
        if (sn0Var != null) {
            sn0Var.o();
        }
    }

    public final void K0(boolean z9) {
        r00 r00Var = this.f36030q2;
        ah.i iVar = r00Var.f37441r;
        ah.i iVar2 = r00Var.f37441r;
        boolean isEmpty = TextUtils.isEmpty(iVar.getText());
        on0 on0Var = this.f36043x1;
        on0 on0Var2 = this.f36045y1;
        boolean z10 = true;
        if (isEmpty && ((!this.d || !iVar2.hasFocus()) && !this.E2)) {
            if (this.f36038u2 == null) {
                org.telegram.messenger.g0.Z3(on0Var, true, 0.98f, true, true);
                org.telegram.messenger.g0.X3(on0Var2, false);
            }
            z10 = false;
        } else {
            this.f36034s2 = true;
            if (this.f36038u2 == null) {
                org.telegram.messenger.g0.Z3(on0Var, false, 0.98f, true, true);
                org.telegram.messenger.g0.X3(on0Var2, true);
            }
        }
        if (this.D2 == z10 && !z9) {
            return;
        }
        this.D2 = z10;
        jo0 jo0Var = this.E1;
        jo0Var.f();
        this.C1.f();
        if (this.D2) {
            if (this.C2 == Integer.MAX_VALUE) {
                ((v4.b0) on0Var2.getLayoutManager()).h1(0, -on0Var2.getPaddingTop());
            } else {
                ((v4.b0) on0Var2.getLayoutManager()).h1(0, this.C2 - on0Var2.getPaddingTop());
            }
            jo0Var.E(iVar2.getText().toString());
            return;
        }
        int i7 = this.C2;
        v4.s sVar = this.f36047z1;
        if (i7 == Integer.MAX_VALUE) {
            sVar.h1(0, 0);
        } else {
            sVar.h1(0, 0);
        }
    }

    public final void L0() {
        float f10;
        TLRPC.Dialog dialog = this.f36038u2;
        if (dialog != null) {
            org.telegram.ui.Cells.d7 d7Var = null;
            this.f36038u2 = null;
            for (int i7 = 0; i7 < P0().getChildCount(); i7++) {
                View childAt = P0().getChildAt(i7);
                if ((childAt instanceof org.telegram.ui.Cells.d7) && ((org.telegram.ui.Cells.d7) childAt).getCurrentDialog() == dialog.f26957id) {
                    d7Var = childAt;
                }
            }
            if (d7Var == null) {
                return;
            }
            r1.g gVar = this.f36036t2;
            if (gVar != null) {
                gVar.d();
            }
            P0().setVisibility(0);
            r00 r00Var = this.f36030q2;
            r00Var.setVisibility(0);
            ah.i iVar = r00Var.f37441r;
            if (this.D2 || this.E2) {
                this.f36040v2.H.v = true;
                iVar.requestFocus();
                org.telegram.messenger.g0.K3(iVar);
            }
            int[] iArr = new int[2];
            r1.g gVar2 = new r1.g(new r1.f(1000.0f));
            r1.h hVar = new r1.h(0.0f);
            org.telegram.ui.an anVar = this.X1;
            if (anVar != null && anVar.f43730b) {
                f10 = 10.0f;
            } else {
                f10 = 800.0f;
            }
            hVar.b(f10);
            hVar.a(1.0f);
            gVar2.f54174m = hVar;
            this.f36036t2 = gVar2;
            gVar2.b(new fn0(this, d7Var, iArr, 0));
            this.f36036t2.a(new ta(this, 5));
            this.f36036t2.h();
        }
    }

    public final void M0() {
        boolean z9 = false;
        if (this.f36010c2 != null || this.f36013g2[0] != null) {
            try {
                ((ClipboardManager) org.telegram.messenger.t0.f25563b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", O0()));
                co0 co0Var = this.f36020k2;
                if (co0Var != null) {
                    co0Var.C0();
                } else if (this.Y1 instanceof LaunchActivity) {
                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = this.f36010c2;
                    if (tL_exportedMessageLink != null && tL_exportedMessageLink.link.contains("/c/")) {
                        z9 = true;
                    }
                    ((LaunchActivity) this.Y1).H0(new l2.x(2, z9));
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    public final String O0() {
        String str;
        String str2;
        String[] strArr = this.f36013g2;
        ao0 ao0Var = this.O1;
        if (ao0Var != null) {
            str2 = strArr[ao0Var.f31863e];
        } else {
            TLRPC.TL_exportedMessageLink tL_exportedMessageLink = this.f36010c2;
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
        wo woVar = this.W1;
        if (woVar != null && woVar.f40058a.f31259q) {
            try {
                str2 = Uri.parse(str2).buildUpon().appendQueryParameter("t", org.telegram.messenger.g0.n0(this.T1)).build().toString();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public final pj0 P0() {
        if (!this.D2 && !this.E2) {
            return this.f36043x1;
        }
        return this.f36045y1;
    }

    public final void Q0(View view, int[] iArr, float f10) {
        float width = (view.getWidth() / 2.0f) + view.getX();
        pj0 pj0Var = this.f36041w1;
        pj0Var.setPivotX(width);
        pj0Var.setPivotY((view.getHeight() / 2.0f) + view.getY());
        float f11 = 0.25f * f10;
        float f12 = 0.75f + f11;
        pj0Var.setScaleX(f12);
        pj0Var.setScaleY(f12);
        pj0Var.setAlpha(f10);
        pj0 P0 = P0();
        P0.setPivotX((view.getWidth() / 2.0f) + view.getX());
        P0.setPivotY((view.getHeight() / 2.0f) + view.getY());
        float f13 = f11 + 1.0f;
        P0.setScaleX(f13);
        P0.setScaleY(f13);
        float f14 = 1.0f - f10;
        P0.setAlpha(f14);
        r00 r00Var = this.f36030q2;
        r00Var.setPivotX(r00Var.getWidth() / 2.0f);
        r00Var.setPivotY(0.0f);
        float f15 = (0.1f * f14) + 0.9f;
        r00Var.setScaleX(f15);
        r00Var.setScaleY(f15);
        r00Var.setAlpha(f14);
        org.telegram.ui.ActionBar.k kVar = this.f36032r2;
        kVar.getBackButton().setTranslationX((-org.telegram.messenger.g0.L(16.0f)) * f14);
        kVar.getTitleTextView().setTranslationY(org.telegram.messenger.g0.L(16.0f) * f14);
        kVar.getSubtitleTextView().setTranslationY(org.telegram.messenger.g0.L(16.0f) * f14);
        kVar.setAlpha(f10);
        pj0Var.getLocationInWindow(iArr);
        float interpolation = xq.f40346g.getInterpolation(f10);
        for (int i7 = 0; i7 < P0.getChildCount(); i7++) {
            View childAt = P0.getChildAt(i7);
            if (childAt instanceof org.telegram.ui.Cells.d7) {
                childAt.setTranslationX((childAt.getX() - view.getX()) * 0.5f * interpolation);
                childAt.setTranslationY((childAt.getY() - view.getY()) * 0.5f * interpolation);
                if (childAt != view) {
                    childAt.setAlpha(1.0f - (Math.min(f10, 0.5f) / 0.5f));
                } else {
                    childAt.setAlpha(f14);
                }
            }
        }
        for (int i10 = 0; i10 < pj0Var.getChildCount(); i10++) {
            View childAt2 = pj0Var.getChildAt(i10);
            if (childAt2 instanceof org.telegram.ui.Cells.e7) {
                double d = 1.0f - interpolation;
                childAt2.setTranslationX((float) ((-(childAt2.getX() - view.getX())) * Math.pow(d, 2.0d)));
                float y10 = childAt2.getY();
                childAt2.setTranslationY((float) (Math.pow(d, 2.0d) * (-((pj0Var.getTranslationY() + y10) - view.getY()))));
            }
        }
        this.f28616b.requestLayout();
        P0.invalidate();
    }

    @Override
    public final int R() {
        return this.f28616b.getMeasuredHeight() - this.P1;
    }

    public final void T0(boolean z9) {
        Integer num;
        float f10;
        View[] viewArr = this.K1;
        if ((z9 && viewArr[0].getTag() != null) || (!z9 && viewArr[0].getTag() == null)) {
            View view = viewArr[0];
            if (z9) {
                num = null;
            } else {
                num = 1;
            }
            view.setTag(num);
            if (z9) {
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
            if (z9) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(view2, property, f10));
            animatorSetArr[0].setDuration(150L);
            animatorSetArr[0].addListener(new xn0(this, z9, 0));
            animatorSetArr[0].start();
        }
    }

    public final void U0(View view, TLRPC.Dialog dialog) {
        Activity activity;
        mo0 mo0Var;
        ArrayList l10;
        io0 io0Var;
        if (dialog instanceof eo0) {
            S0(view);
        } else if (((view instanceof org.telegram.ui.Cells.d7) && ((org.telegram.ui.Cells.d7) view).F) || ((view instanceof org.telegram.ui.Cells.g6) && ((org.telegram.ui.Cells.g6) view).f29158n0)) {
            Y0(dialog.f26957id, view);
        } else {
            pj0 pj0Var = this.f36041w1;
            if (pj0Var.getVisibility() == 8 && (activity = this.Y1) != null) {
                boolean z9 = org.telegram.messenger.m5.z(dialog.f26957id);
                int i7 = this.H1;
                if (z9) {
                    TLRPC.Chat M0 = org.telegram.messenger.qp.s1(this.f28613a).M0(Long.valueOf(-dialog.f26957id));
                    if (org.telegram.messenger.t3.T(M0) && !M0.megagroup) {
                        TLRPC.Chat M02 = org.telegram.messenger.qp.s1(this.f28613a).M0(Long.valueOf(-dialog.f26957id));
                        if ((!org.telegram.messenger.t3.n(M02) && !M02.megagroup) || i7 == 2 || i7 == 3) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                            String M03 = org.telegram.messenger.hd.M0(2131745597, null);
                            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27293a;
                            u1Var.R = M03;
                            if (i7 == 3) {
                                if (org.telegram.messenger.t3.P(10, M0)) {
                                    u1Var.T = org.telegram.messenger.hd.M0(2131751085, null);
                                } else {
                                    u1Var.T = org.telegram.messenger.hd.M0(2131751086, null);
                                }
                            } else if (i7 == 2) {
                                if (this.f36012f2) {
                                    u1Var.T = org.telegram.messenger.hd.M0(2131746586, null);
                                } else if (org.telegram.messenger.t3.P(10, M0)) {
                                    u1Var.T = org.telegram.messenger.hd.M0(2131751093, null);
                                } else {
                                    u1Var.T = org.telegram.messenger.hd.M0(2131751094, null);
                                }
                            } else {
                                u1Var.T = org.telegram.messenger.hd.M0(2131752440, null);
                            }
                            jg.g.w(null, 2131747830, alertDialog$Builder, null);
                            return;
                        }
                    }
                } else if (org.telegram.messenger.m5.C(dialog.f26957id) && i7 != 0) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(activity);
                    String M04 = org.telegram.messenger.hd.M0(2131745597, null);
                    org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.f27293a;
                    u1Var2.R = M04;
                    if (i7 == 3) {
                        u1Var2.T = org.telegram.messenger.hd.M0(2131744091, null);
                    } else if (i7 != 0) {
                        u1Var2.T = org.telegram.messenger.hd.M0(2131747175, null);
                    } else {
                        u1Var2.T = org.telegram.messenger.hd.M0(2131749103, null);
                    }
                    jg.g.w(null, 2131747830, alertDialog$Builder2, null);
                    return;
                }
                long j3 = dialog.f26957id;
                a0.h hVar = this.M1;
                if (hVar.h(j3) >= 0) {
                    hVar.l(dialog.f26957id);
                    this.N1.remove(dialog);
                    if (view instanceof org.telegram.ui.Cells.g6) {
                        ((org.telegram.ui.Cells.g6) view).w(false, true);
                    } else if (view instanceof org.telegram.ui.Cells.d7) {
                        ((org.telegram.ui.Cells.d7) view).b(false, true);
                    }
                    b1(1);
                    mo0Var = this;
                } else {
                    TLRPC.User a22 = org.telegram.messenger.qp.s1(this.f28613a).a2(Long.valueOf(dialog.f26957id));
                    TLRPC.Chat M05 = org.telegram.messenger.qp.s1(this.f28613a).M0(Long.valueOf(-dialog.f26957id));
                    if ((!org.telegram.messenger.t10.u(a22) || (((l10 = org.telegram.messenger.qp.s1(this.f28613a).f24870q7.l(-a22.f27102id)) == null || l10.isEmpty()) && org.telegram.messenger.qp.s1(this.f28613a).f24870q7.e(-a22.f27102id))) && (!org.telegram.messenger.m5.z(dialog.f26957id) || (!org.telegram.messenger.t3.c0(M05) && (!org.telegram.messenger.t3.p0(M05) || !org.telegram.messenger.t3.A(this.f28613a, M05, 24))))) {
                        mo0Var = this;
                        hVar.k(dialog, dialog.f26957id);
                        if (view instanceof org.telegram.ui.Cells.g6) {
                            ((org.telegram.ui.Cells.g6) view).w(true, true);
                        } else if (view instanceof org.telegram.ui.Cells.d7) {
                            ((org.telegram.ui.Cells.d7) view).b(true, true);
                        }
                        b1(2);
                        long j10 = org.telegram.messenger.p10.i(mo0Var.f28613a).f24486n;
                        if (mo0Var.D2) {
                            fo0 fo0Var = mo0Var.C1;
                            a0.h hVar2 = fo0Var.f33621e;
                            ArrayList arrayList = fo0Var.d;
                            TLRPC.Dialog dialog2 = (TLRPC.Dialog) hVar2.f(dialog.f26957id);
                            if (dialog2 == null) {
                                fo0Var.f33621e.k(dialog, dialog.f26957id);
                                arrayList.add(!arrayList.isEmpty(), dialog);
                            } else if (dialog2.f26957id != j10) {
                                arrayList.remove(dialog2);
                                arrayList.add(!arrayList.isEmpty(), dialog2);
                            }
                            fo0Var.f();
                            mo0Var.f36034s2 = false;
                            r00 r00Var = mo0Var.f36030q2;
                            r00Var.f37441r.setText("");
                            K0(false);
                            org.telegram.messenger.g0.v1(r00Var.f37441r);
                        }
                    } else {
                        this.f36038u2 = dialog;
                        this.A1.h1(0, this.f36014h2 - pj0Var.getPaddingTop());
                        AtomicReference atomicReference = new AtomicReference();
                        vn0 vn0Var = new vn0(this, dialog, atomicReference, view);
                        atomicReference.set(new kn0(this, atomicReference, vn0Var, dialog, 0));
                        org.telegram.messenger.qs f10 = org.telegram.messenger.qs.f(this.f28613a);
                        int i10 = org.telegram.messenger.qs.f25053q5;
                        f10.b(vn0Var, i10);
                        if (org.telegram.messenger.qp.s1(this.f28613a).f24870q7.l(-dialog.f26957id) != null) {
                            vn0Var.didReceivedNotification(i10, this.f28613a, Long.valueOf(-dialog.f26957id));
                            return;
                        }
                        org.telegram.messenger.qp.s1(this.f28613a).f24870q7.o(-dialog.f26957id);
                        org.telegram.messenger.g0.i3((Runnable) atomicReference.get(), 300L);
                        return;
                    }
                }
                jo0 jo0Var = mo0Var.E1;
                if (jo0Var != null && (io0Var = jo0Var.H) != null) {
                    io0Var.k(0, io0Var.b());
                }
            }
        }
    }

    public final void V0(final boolean z9) {
        int i7;
        int i10;
        int i11;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            a0.h hVar = this.M1;
            int m10 = hVar.m();
            rn0 rn0Var = this.f36017j1;
            sn0 sn0Var = this.f36019k1;
            boolean z10 = true;
            if (i13 < m10) {
                long j3 = hVar.j(i13);
                if (v4.h(getContext(), this.f28613a, j3, (rn0Var.getTag() == null || sn0Var.f35407a.length() <= 0) ? false : false)) {
                    return;
                }
                i13++;
            } else {
                Editable text = sn0Var.getText();
                et etVar = sn0Var.f35407a;
                final CharSequence[] charSequenceArr = {text};
                final ArrayList W = org.telegram.messenger.ui.b0(this.f28613a).W(charSequenceArr, true, true);
                wo woVar = this.W1;
                if (woVar != null && woVar.f40058a.f31259q) {
                    i7 = this.T1;
                } else {
                    i7 = -1;
                }
                ArrayList arrayList = new ArrayList();
                if (this.F1 != null) {
                    i11 = 0;
                    while (i12 < hVar.m()) {
                        long j10 = hVar.j(i12);
                        long N1 = org.telegram.messenger.qp.s1(this.f28613a).N1(j10);
                        if (N1 <= 0) {
                            N1 = org.telegram.messenger.m5.k(org.telegram.messenger.qp.s1(this.f28613a).J2(j10));
                        }
                        if (rn0Var.getTag() != null && etVar.length() > 0 && N1 > 0) {
                            i11++;
                        }
                        int i14 = (N1 > 0L ? 1 : (N1 == 0L ? 0 : -1));
                        if (i14 > 0) {
                            i11++;
                        }
                        if (i14 > 0 && !arrayList.contains(Long.valueOf(j10))) {
                            arrayList.add(Long.valueOf(j10));
                        }
                        i12++;
                    }
                } else {
                    ao0 ao0Var = this.O1;
                    if (ao0Var != null) {
                        i10 = ao0Var.f31863e;
                    } else {
                        i10 = 0;
                    }
                    if (this.f36044x2 != null) {
                        int i15 = 0;
                        int i16 = 0;
                        while (i15 < hVar.m()) {
                            long j11 = hVar.j(i15);
                            long N12 = org.telegram.messenger.qp.s1(this.f28613a).N1(j11);
                            if (N12 <= 0) {
                                N12 = org.telegram.messenger.m5.k(org.telegram.messenger.qp.s1(this.f28613a).J2(j11));
                            }
                            int i17 = i12;
                            if (this.f36044x2 != null && rn0Var.getTag() != null && etVar.length() > 0 && charSequenceArr[i17] != null && N12 > 0) {
                                i16++;
                            }
                            int i18 = (N12 > 0L ? 1 : (N12 == 0L ? 0 : -1));
                            if (i18 > 0) {
                                i16++;
                            }
                            if (i18 > 0 && !arrayList.contains(Long.valueOf(j11))) {
                                arrayList.add(Long.valueOf(j11));
                            }
                            i15++;
                            i12 = i17;
                        }
                        i11 = i16;
                    } else {
                        int i19 = 0;
                        if (this.G1[i10] != null) {
                            for (int i20 = 0; i20 < hVar.m(); i20++) {
                                long j12 = hVar.j(i20);
                                long N13 = org.telegram.messenger.qp.s1(this.f28613a).N1(j12);
                                if (N13 <= 0) {
                                    N13 = org.telegram.messenger.m5.k(org.telegram.messenger.qp.s1(this.f28613a).J2(j12));
                                }
                                if (rn0Var.getTag() != null && etVar.length() > 0 && N13 > 0) {
                                    i19++;
                                }
                                int i21 = (N13 > 0L ? 1 : (N13 == 0L ? 0 : -1));
                                if (i21 > 0) {
                                    i19++;
                                }
                                if (i21 > 0 && !arrayList.contains(Long.valueOf(j12))) {
                                    arrayList.add(Long.valueOf(j12));
                                }
                            }
                        }
                        i11 = i19;
                    }
                }
                final int i22 = i7;
                v4.Z(this.f28613a, arrayList, i11, new org.telegram.messenger.c20() {
                    @Override
                    public final void a(Object obj) {
                        int i23;
                        int i24;
                        boolean z11;
                        Long l10;
                        int i25;
                        HashMap hashMap;
                        long j13;
                        boolean z12;
                        char c10;
                        org.telegram.messenger.ij ijVar;
                        sn0 sn0Var2;
                        long longValue;
                        String charSequence;
                        long longValue2;
                        Long l11;
                        boolean z13;
                        boolean z14;
                        long j14;
                        String[] strArr;
                        org.telegram.messenger.ij ijVar2;
                        org.telegram.messenger.ez b10;
                        long longValue3;
                        String charSequence2;
                        ArrayList arrayList2;
                        TLRPC.TL_forumTopic tL_forumTopic;
                        TLRPC.TL_forumTopic tL_forumTopic2;
                        Long l12;
                        boolean z15;
                        int i26;
                        boolean z16;
                        long j15;
                        Long l13;
                        CharSequence[] charSequenceArr2;
                        org.telegram.messenger.ij ijVar3;
                        org.telegram.messenger.ij ijVar4;
                        ArrayList arrayList3;
                        ?? r11;
                        long longValue4;
                        String charSequence3;
                        long longValue5;
                        HashMap hashMap2 = (HashMap) obj;
                        mo0 mo0Var = mo0.this;
                        String[] strArr2 = mo0Var.G1;
                        sn0 sn0Var3 = mo0Var.f36019k1;
                        rn0 rn0Var2 = mo0Var.f36017j1;
                        HashMap hashMap3 = mo0Var.N1;
                        Long l14 = 0L;
                        a0.h hVar2 = mo0Var.M1;
                        ArrayList arrayList4 = mo0Var.F1;
                        CharSequence[] charSequenceArr3 = charSequenceArr;
                        ArrayList arrayList5 = W;
                        boolean z17 = z9;
                        if (arrayList4 != null) {
                            ArrayList arrayList6 = new ArrayList();
                            int i27 = 0;
                            boolean z18 = false;
                            while (true) {
                                if (i27 < hVar2.m()) {
                                    boolean z19 = z17;
                                    long j16 = hVar2.j(i27);
                                    boolean y22 = org.telegram.messenger.qp.s1(mo0Var.f28613a).y2(j16);
                                    rn0 rn0Var3 = rn0Var2;
                                    if (hashMap2 == null) {
                                        l12 = l14;
                                    } else {
                                        l12 = (Long) hashMap2.get(Long.valueOf(j16));
                                    }
                                    if (l12 != null && l12.longValue() > 0) {
                                        z15 = true;
                                    } else {
                                        z15 = z18;
                                    }
                                    Long l15 = l12;
                                    TLRPC.TL_forumTopic tL_forumTopic3 = (TLRPC.TL_forumTopic) hashMap3.get(hVar2.f(j16));
                                    if (tL_forumTopic3 != null && y22) {
                                        i26 = i27;
                                        z16 = y22;
                                        j15 = org.telegram.messenger.m5.o(tL_forumTopic3.from_id);
                                    } else {
                                        i26 = i27;
                                        z16 = y22;
                                        j15 = 0;
                                    }
                                    if (tL_forumTopic3 != null && !z16) {
                                        l13 = l14;
                                        arrayList2 = arrayList4;
                                        charSequenceArr2 = charSequenceArr3;
                                        ijVar3 = new org.telegram.messenger.ij(mo0Var.f28613a, tL_forumTopic3.topicStartMessage, false, false);
                                    } else {
                                        l13 = l14;
                                        arrayList2 = arrayList4;
                                        charSequenceArr2 = charSequenceArr3;
                                        ijVar3 = null;
                                    }
                                    if (ijVar3 != null) {
                                        ijVar3.f23261p = true;
                                    }
                                    if (rn0Var3.getTag() != null && sn0Var3.f35407a.length() > 0) {
                                        CharSequence charSequence4 = charSequenceArr2[0];
                                        if (charSequence4 == null) {
                                            charSequence3 = null;
                                        } else {
                                            charSequence3 = charSequence4.toString();
                                        }
                                        r11 = 0;
                                        ijVar4 = ijVar3;
                                        ArrayList arrayList7 = arrayList5;
                                        org.telegram.messenger.ez b11 = org.telegram.messenger.ez.b(charSequence3, j16, ijVar4, ijVar3, null, true, arrayList7, null, null, z19, 0, 0, null, false);
                                        arrayList3 = arrayList7;
                                        z19 = z19;
                                        if (l15 == null) {
                                            longValue5 = 0;
                                        } else {
                                            longValue5 = l15.longValue();
                                        }
                                        b11.Q = longValue5;
                                        b11.R = j15;
                                        org.telegram.messenger.gz.C(mo0Var.f28613a).r0(b11);
                                    } else {
                                        ijVar4 = ijVar3;
                                        arrayList3 = arrayList5;
                                        r11 = 0;
                                    }
                                    org.telegram.messenger.gz C = org.telegram.messenger.gz.C(mo0Var.f28613a);
                                    org.telegram.messenger.ij ijVar5 = ijVar4;
                                    ArrayList arrayList8 = mo0Var.F1;
                                    boolean z20 = !mo0Var.A2;
                                    if (l15 == null) {
                                        longValue4 = 0;
                                    } else {
                                        longValue4 = l15.longValue();
                                    }
                                    boolean z21 = z19;
                                    int q02 = C.q0(arrayList8, j16, z20, false, z21, 0, 0, ijVar5, i22, longValue4, j15, null);
                                    if (q02 != 0) {
                                        arrayList6.add(Long.valueOf(j16));
                                    }
                                    if (hVar2.m() == 1) {
                                        v4.q0(q02, mo0Var.X1, r11);
                                        if (q02 != 0) {
                                            z18 = z15;
                                            tL_forumTopic = r11;
                                            break;
                                        }
                                    }
                                    i27 = i26 + 1;
                                    arrayList5 = arrayList3;
                                    z17 = z21;
                                    rn0Var2 = rn0Var3;
                                    z18 = z15;
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
                                mo0Var.R0(hVar2, size2, tL_forumTopic2, !z18);
                            }
                        } else {
                            boolean z22 = z17;
                            ao0 ao0Var2 = mo0Var.O1;
                            if (ao0Var2 != null) {
                                i23 = ao0Var2.f31863e;
                            } else {
                                i23 = 0;
                            }
                            if (mo0Var.f36044x2 != null) {
                                int i29 = 0;
                                boolean z23 = false;
                                while (i29 < hVar2.m()) {
                                    long j17 = hVar2.j(i29);
                                    boolean y23 = org.telegram.messenger.qp.s1(mo0Var.f28613a).y2(j17);
                                    if (hashMap2 == null) {
                                        l11 = l14;
                                    } else {
                                        l11 = (Long) hashMap2.get(Long.valueOf(j17));
                                    }
                                    if (l11 != null && l11.longValue() > 0) {
                                        z23 = true;
                                    }
                                    TLRPC.TL_forumTopic tL_forumTopic4 = (TLRPC.TL_forumTopic) hashMap3.get(hVar2.f(j17));
                                    if (tL_forumTopic4 != null && y23) {
                                        z13 = z23;
                                        z14 = y23;
                                        j14 = org.telegram.messenger.m5.o(tL_forumTopic4.from_id);
                                    } else {
                                        z13 = z23;
                                        z14 = y23;
                                        j14 = 0;
                                    }
                                    if (tL_forumTopic4 != null && !z14) {
                                        strArr = strArr2;
                                        ijVar2 = new org.telegram.messenger.ij(mo0Var.f28613a, tL_forumTopic4.topicStartMessage, false, false);
                                    } else {
                                        strArr = strArr2;
                                        ijVar2 = null;
                                    }
                                    if (mo0Var.f36044x2 == null) {
                                        if (rn0Var2.getTag() != null && sn0Var3.f35407a.length() > 0) {
                                            CharSequence charSequence5 = charSequenceArr3[0];
                                            if (charSequence5 == null) {
                                                charSequence2 = null;
                                            } else {
                                                charSequence2 = charSequence5.toString();
                                            }
                                            boolean z24 = z22;
                                            b10 = org.telegram.messenger.ez.b(charSequence2, j17, ijVar2, ijVar2, null, true, arrayList5, null, null, z24, 0, 0, null, false);
                                            z22 = z24;
                                        } else {
                                            b10 = org.telegram.messenger.ez.b(strArr[i23], j17, ijVar2, ijVar2, null, true, null, null, null, z22, 0, 0, null, false);
                                        }
                                    } else {
                                        if (rn0Var2.getTag() != null && sn0Var3.f35407a.length() > 0 && charSequenceArr3[0] != null) {
                                            org.telegram.messenger.ij ijVar6 = ijVar2;
                                            ijVar2 = ijVar6;
                                            org.telegram.messenger.gz.C(mo0Var.f28613a).r0(org.telegram.messenger.ez.b(charSequenceArr3[0].toString(), j17, null, ijVar6, null, true, null, null, null, z22, 0, 0, null, false));
                                        }
                                        b10 = org.telegram.messenger.ez.b(null, j17, ijVar2, ijVar2, null, true, null, null, null, z22, 0, 0, null, false);
                                        b10.I = mo0Var.f36044x2;
                                    }
                                    if (l11 == null) {
                                        longValue3 = 0;
                                    } else {
                                        longValue3 = l11.longValue();
                                    }
                                    b10.Q = longValue3;
                                    b10.R = j14;
                                    org.telegram.messenger.gz.C(mo0Var.f28613a).r0(b10);
                                    i29++;
                                    z23 = z13;
                                    strArr2 = strArr;
                                }
                                z11 = z23;
                            } else if (strArr2[i23] != null) {
                                int i30 = 0;
                                boolean z25 = false;
                                while (i30 < hVar2.m()) {
                                    long j18 = hVar2.j(i30);
                                    boolean y24 = org.telegram.messenger.qp.s1(mo0Var.f28613a).y2(j18);
                                    if (hashMap2 == null) {
                                        l10 = l14;
                                    } else {
                                        l10 = (Long) hashMap2.get(Long.valueOf(j18));
                                    }
                                    if (l10 != null && l10.longValue() > 0) {
                                        z25 = true;
                                    }
                                    TLRPC.TL_forumTopic tL_forumTopic5 = (TLRPC.TL_forumTopic) hashMap3.get(hVar2.f(j18));
                                    if (tL_forumTopic5 != null && y24) {
                                        i25 = i30;
                                        hashMap = hashMap2;
                                        j13 = org.telegram.messenger.m5.o(tL_forumTopic5.from_id);
                                    } else {
                                        i25 = i30;
                                        hashMap = hashMap2;
                                        j13 = 0;
                                    }
                                    if (tL_forumTopic5 != null && !y24) {
                                        z12 = z25;
                                        c10 = 0;
                                        ijVar = new org.telegram.messenger.ij(mo0Var.f28613a, tL_forumTopic5.topicStartMessage, false, false);
                                    } else {
                                        z12 = z25;
                                        c10 = 0;
                                        ijVar = null;
                                    }
                                    if (rn0Var2.getTag() != null && sn0Var3.f35407a.length() > 0) {
                                        CharSequence charSequence6 = charSequenceArr3[c10];
                                        if (charSequence6 == null) {
                                            charSequence = null;
                                        } else {
                                            charSequence = charSequence6.toString();
                                        }
                                        boolean z26 = z22;
                                        org.telegram.messenger.ez b12 = org.telegram.messenger.ez.b(charSequence, j18, ijVar, ijVar, null, true, arrayList5, null, null, z26, 0, 0, null, false);
                                        z22 = z26;
                                        if (l10 == null) {
                                            sn0Var2 = sn0Var3;
                                            longValue2 = 0;
                                        } else {
                                            sn0Var2 = sn0Var3;
                                            longValue2 = l10.longValue();
                                        }
                                        b12.Q = longValue2;
                                        b12.R = j13;
                                        org.telegram.messenger.gz.C(mo0Var.f28613a).r0(b12);
                                    } else {
                                        sn0Var2 = sn0Var3;
                                    }
                                    org.telegram.messenger.ij ijVar7 = ijVar;
                                    org.telegram.messenger.ez b13 = org.telegram.messenger.ez.b(strArr2[i23], j18, ijVar7, ijVar7, null, true, null, null, null, z22, 0, 0, null, false);
                                    if (l10 == null) {
                                        longValue = 0;
                                    } else {
                                        longValue = l10.longValue();
                                    }
                                    b13.Q = longValue;
                                    b13.R = j13;
                                    org.telegram.messenger.gz.C(mo0Var.f28613a).r0(b13);
                                    i30 = i25 + 1;
                                    sn0Var3 = sn0Var2;
                                    hashMap2 = hashMap;
                                    z25 = z12;
                                }
                                z11 = z25;
                            } else {
                                i24 = 0;
                                z11 = false;
                                mo0Var.R0(hVar2, 1, (TLRPC.TL_forumTopic) hashMap3.get(hVar2.n(i24)), !z11);
                            }
                            i24 = 0;
                            mo0Var.R0(hVar2, 1, (TLRPC.TL_forumTopic) hashMap3.get(hVar2.n(i24)), !z11);
                        }
                        co0 co0Var = mo0Var.f36020k2;
                        if (co0Var != null) {
                            co0Var.W();
                        }
                        mo0Var.dismiss();
                    }
                });
                return;
            }
        }
    }

    public final void X0(boolean z9) {
        boolean z10;
        Integer num;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        int i7;
        rn0 rn0Var = this.f36017j1;
        if (rn0Var.getTag() != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z9 == z10) {
            return;
        }
        AnimatorSet animatorSet = this.f36039v1;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z9) {
            num = 1;
        } else {
            num = null;
        }
        rn0Var.setTag(num);
        sn0 sn0Var = this.f36019k1;
        if (sn0Var.getEditText().isFocused()) {
            org.telegram.messenger.g0.v1(sn0Var.getEditText());
        }
        sn0Var.k(true);
        FrameLayout frameLayout = this.U1;
        rn0 rn0Var2 = this.f36022m1;
        FrameLayout frameLayout2 = this.n1;
        if (z9) {
            rn0Var.setVisibility(0);
            if (frameLayout != null && frameLayout2 == null) {
                frameLayout.setVisibility(0);
            }
            rn0Var2.setVisibility(0);
        } else if (frameLayout2 != null) {
            frameLayout2.setVisibility(0);
        }
        int i10 = 4;
        if (frameLayout2 != null) {
            if (z9) {
                i7 = 4;
            } else {
                i7 = 1;
            }
            WeakHashMap weakHashMap = r0.i0.f54097a;
            frameLayout2.setImportantForAccessibility(i7);
        }
        LinearLayout linearLayout = this.f36037u1;
        if (linearLayout != null) {
            if (!z9) {
                i10 = 1;
            }
            WeakHashMap weakHashMap2 = r0.i0.f54097a;
            linearLayout.setImportantForAccessibility(i10);
        }
        this.f36039v1 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        float f15 = 0.0f;
        float f16 = 1.0f;
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(rn0Var, property, f10));
        if (frameLayout != null && frameLayout2 == null) {
            if (z9) {
                f14 = 1.0f;
            } else {
                f14 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(frameLayout, property, f14));
        }
        Property property2 = View.SCALE_X;
        float f17 = 0.2f;
        if (z9) {
            f11 = 1.0f;
        } else {
            f11 = 0.2f;
        }
        arrayList.add(ObjectAnimator.ofFloat(rn0Var2, property2, f11));
        Property property3 = View.SCALE_Y;
        if (z9) {
            f17 = 1.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(rn0Var2, property3, f17));
        if (z9) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(rn0Var2, property, f12));
        if (frameLayout2 == null || frameLayout2.getVisibility() != 0) {
            View view = this.K1[1];
            if (!z9) {
                f16 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(view, property, f16));
        }
        FrameLayout frameLayout3 = this.f36029q1;
        if (frameLayout3 != null) {
            Property property4 = View.TRANSLATION_Y;
            if (this.Z1 && z9) {
                if (this.V1 != null) {
                    f13 = 5.0f;
                } else {
                    f13 = 16.0f;
                }
                f15 = org.telegram.messenger.g0.L(f13);
            }
            arrayList.add(ObjectAnimator.ofFloat(frameLayout3, property4, f15));
        }
        this.f36039v1.playTogether(arrayList);
        this.f36039v1.setInterpolator(new DecelerateInterpolator());
        this.f36039v1.setDuration(180L);
        this.f36039v1.addListener(new xn0(this, z9, 1));
        this.f36039v1.start();
    }

    public final void Y0(long j3, View view) {
        String str;
        cc K;
        int i7 = -this.f36048z2;
        this.f36048z2 = i7;
        org.telegram.messenger.g0.G3(i7, view, null);
        org.telegram.messenger.p2.APP_ERROR.a();
        if (j3 >= 0) {
            str = org.telegram.messenger.t10.p(org.telegram.messenger.qp.s1(this.f28613a).a2(Long.valueOf(j3)));
        } else {
            str = "";
        }
        boolean D3 = org.telegram.messenger.qp.s1(this.f28613a).D3();
        FrameLayout frameLayout = this.f36033s1;
        if (D3) {
            K = new hc(frameLayout, this.I0).Q(2131624216, 36, org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131743761, str)));
        } else {
            K = new hc(frameLayout, this.I0).K(2131624216, org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131743761, str)), org.telegram.messenger.hd.M0(2131743760, null), new in0(this, 1));
        }
        K.j();
    }

    public final void Z0() {
        org.telegram.ui.ActionBar.i1 i1Var;
        rn0 rn0Var = this.f36017j1;
        if (rn0Var == null) {
            return;
        }
        sn0 sn0Var = this.f36019k1;
        if (sn0Var != null && sn0Var.m()) {
            sn0Var.getEmojiPaddingShown();
        } else {
            zn0 zn0Var = this.f36040v2;
            if (zn0Var != null && (i1Var = zn0Var.H) != null && !i1Var.f27546f) {
                org.telegram.messenger.g0.L(20.0f);
            }
        }
        float f10 = 0.0f;
        FrameLayout frameLayout = this.U1;
        if (frameLayout != null) {
            frameLayout.setTranslationY(-0.0f);
            f10 = 0.0f + org.telegram.messenger.g0.L(48.0f);
        }
        FrameLayout frameLayout2 = this.n1;
        if (frameLayout2 != null) {
            frameLayout2.setTranslationY(-f10);
        }
        float f11 = -f10;
        rn0Var.setTranslationY(f11);
        this.f36022m1.setTranslationY(f11);
    }

    public final void a1() {
        org.telegram.ui.ActionBar.k5 k5Var = this.f36031r1;
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

    public final void b1(int i7) {
        int size;
        boolean z9;
        boolean z10;
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
        Object tag = this.f36017j1.getTag();
        sn0 sn0Var = this.f36019k1;
        if (tag != null && sn0Var.f35407a.length() > 0) {
            size++;
        }
        long j3 = 0;
        for (int i10 = 0; i10 < hVar.m(); i10++) {
            long j10 = ((TLRPC.Dialog) hVar.n(i10)).f26957id;
            long N1 = org.telegram.messenger.qp.s1(this.f28613a).N1(j10);
            if (N1 <= 0) {
                N1 = org.telegram.messenger.m5.k(org.telegram.messenger.qp.s1(this.f28613a).J2(j10));
            }
            j3 += N1;
        }
        int max = Math.max(1, hVar.m());
        if (i7 != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        li.w1 w1Var = this.l1;
        w1Var.e(max, z9);
        if (i7 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        w1Var.i(size, j3, z10);
        X0(true);
        sn0Var.setPadding(0, 0, Math.max(org.telegram.messenger.g0.L(84.0f), w1Var.l()), 0);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = org.telegram.messenger.qs.f25061s;
        if (i7 == i11) {
            fo0 fo0Var = this.C1;
            if (fo0Var != null) {
                fo0Var.E();
            }
            org.telegram.messenger.qs.f(this.f28613a).n(this, i11);
        }
    }

    @Override
    public final void dismiss() {
        sn0 sn0Var = this.f36019k1;
        if (sn0Var != null) {
            org.telegram.messenger.g0.v1(sn0Var.getEditText());
        }
        this.Q1 = false;
        super.dismiss();
        org.telegram.messenger.qs.f(this.f28613a).n(this, org.telegram.messenger.qs.f25061s);
    }

    @Override
    public final void onBackPressed() {
        if (this.f36038u2 != null) {
            L0();
            return;
        }
        sn0 sn0Var = this.f36019k1;
        if (sn0Var != null && sn0Var.f35410e) {
            sn0Var.k(true);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void s0() {
        boolean z9;
        try {
            super.s0();
            ri.c cVar = this.H2;
            if (cVar != null) {
                cVar.a(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27849d6, this.I0));
            }
            org.telegram.ui.ActionBar.l2 l2Var = this.f28619c;
            if (l2Var != null) {
                if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27922h5, this.I0)) > 0.721f) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z9 != this.P2) {
                    this.P2 = z9;
                    org.telegram.messenger.g0.o3(l2Var, z9);
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public mo0(Context context, ArrayList arrayList, String str, String str2, boolean z9, String str3, String str4, boolean z10) {
        this(context, null, arrayList, str, str2, z9, str3, str4, false, z10, false, null, null);
    }

    public mo0(android.content.Context r39, org.telegram.ui.an r40, java.util.ArrayList r41, java.lang.String r42, java.lang.String r43, boolean r44, java.lang.String r45, java.lang.String r46, boolean r47, boolean r48, boolean r49, java.lang.Integer r50, org.telegram.ui.ActionBar.f6 r51) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.mo0.<init>(android.content.Context, org.telegram.ui.an, java.util.ArrayList, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, boolean, boolean, boolean, java.lang.Integer, org.telegram.ui.ActionBar.f6):void");
    }

    public void S0(View view) {
    }

    public void R0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z9) {
    }
}
