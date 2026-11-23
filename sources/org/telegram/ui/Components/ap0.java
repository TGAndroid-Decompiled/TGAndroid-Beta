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
public class ap0 extends org.telegram.ui.ActionBar.w2 implements org.telegram.messenger.gs {
    public static final int U2 = 0;
    public final ek0 A1;
    public ArrayList A2;
    public final co0 B1;
    public TL_stories.StoryItem B2;
    public final co0 C1;
    public i0.b C2;
    public final v4.s D1;
    public int D2;
    public final v4.s E1;
    public boolean E2;
    public final xy F1;
    public org.telegram.ui.ActionBar.g1 F2;
    public final to0 G1;
    public int G2;
    public final yo0 H1;
    public boolean H2;
    public final xo0 I1;
    public boolean I2;
    public final ArrayList J1;
    public int J2;
    public final String[] K1;
    public final dh.g K2;
    public final int L1;
    public final ui.c L2;
    public final nv0 M1;
    public final dh.c M2;
    public final Drawable N1;
    public final dh.c N2;
    public final View[] O1;
    public final dh.c O2;
    public final AnimatorSet[] P1;
    public final kh P2;
    public final a0.h Q1;
    public final fh.g Q2;
    public final HashMap R1;
    public final dh.d R2;
    public final oo0 S1;
    public final fh.g S2;
    public int T1;
    public boolean T2;
    public boolean U1;
    public final boolean V1;
    public boolean W1;
    public final int X1;
    public final FrameLayout Y1;
    public final LinearLayout Z1;
    public final op f33546a2;
    public final org.telegram.ui.bn f33547b2;
    public final Activity f33548c2;
    public final boolean d2;
    public boolean f33549e2;
    public final TextPaint f33550f2;
    public TLRPC.TL_exportedMessageLink f33551g2;
    public boolean f33552h2;
    public boolean f33553i2;
    public final boolean f33554j2;
    public final String[] f33555k2;
    public int f33556l2;
    public final FrameLayout f33557m1;
    public int f33558m2;
    public final fo0 n1;
    public boolean f33559n2;
    public final go0 f33560o1;
    public qo0 f33561o2;
    public final oi.v1 f33562p1;
    public float f33563p2;
    public final fo0 f33564q1;
    public float f33565q2;
    public final FrameLayout f33566r1;
    public float f33567r2;
    public float f33568s1;
    public ValueAnimator f33569s2;
    public final bi.o3 f33570t1;
    public final hj0 f33571t2;
    public final FrameLayout f33572u1;
    public final e10 f33573u2;
    public final org.telegram.ui.ActionBar.m5 f33574v1;
    public final org.telegram.ui.ActionBar.k f33575v2;
    public final FrameLayout f33576w1;
    public boolean f33577w2;
    public final FrameLayout f33578x1;
    public r1.g f33579x2;
    public final LinearLayout f33580y1;
    public TLRPC.Dialog f33581y2;
    public AnimatorSet f33582z1;
    public final no0 f33583z2;

    public ap0(Context context, ArrayList arrayList, String str, boolean z10, String str2, boolean z11, org.telegram.ui.ActionBar.h6 h6Var) {
        this(context, null, arrayList, str, null, z10, str2, null, z11, false, false, null, h6Var);
    }

    public static void J0(ap0 ap0Var) {
        co0 co0Var;
        int i7;
        int i10;
        co0 co0Var2 = ap0Var.B1;
        co0 co0Var3 = ap0Var.C1;
        ek0 ek0Var = ap0Var.A1;
        if (!ap0Var.f33559n2) {
            if (ap0Var.H2) {
                co0Var = co0Var3;
            } else {
                co0Var = co0Var2;
            }
            if (co0Var.getChildCount() > 0) {
                View childAt = co0Var.getChildAt(0);
                for (int i11 = 0; i11 < co0Var.getChildCount(); i11++) {
                    if (co0Var.getChildAt(i11).getTop() < childAt.getTop()) {
                        childAt = co0Var.getChildAt(i11);
                    }
                }
                mj0 mj0Var = (mj0) co0Var.G(childAt);
                int top = childAt.getTop() - org.telegram.messenger.g0.L(8.0f);
                if (top > 0 && mj0Var != null && mj0Var.b() == 0) {
                    i7 = top;
                } else {
                    i7 = 0;
                }
                if (top >= 0 && mj0Var != null && mj0Var.b() == 0) {
                    ap0Var.G2 = childAt.getTop();
                    ap0Var.U0(false);
                } else {
                    ap0Var.G2 = Integer.MAX_VALUE;
                    ap0Var.U0(true);
                    top = i7;
                }
                if (ek0Var.getVisibility() == 0) {
                    if (ek0Var.getChildCount() > 0) {
                        View childAt2 = ek0Var.getChildAt(0);
                        for (int i12 = 0; i12 < ek0Var.getChildCount(); i12++) {
                            if (ek0Var.getChildAt(i12).getTop() < childAt2.getTop()) {
                                childAt2 = ek0Var.getChildAt(i12);
                            }
                        }
                        mj0 mj0Var2 = (mj0) ek0Var.G(childAt2);
                        int top2 = childAt2.getTop() - org.telegram.messenger.g0.L(8.0f);
                        if (top2 > 0 && mj0Var2 != null && mj0Var2.b() == 0) {
                            i10 = top2;
                        } else {
                            i10 = 0;
                        }
                        if (top2 >= 0 && mj0Var2 != null && mj0Var2.b() == 0) {
                            ap0Var.G2 = childAt2.getTop();
                            ap0Var.U0(false);
                        } else {
                            ap0Var.G2 = Integer.MAX_VALUE;
                            ap0Var.U0(true);
                            top2 = i10;
                        }
                        top = org.telegram.messenger.g0.W1(ek0Var.getAlpha(), top, top2);
                    } else {
                        return;
                    }
                }
                int i13 = ap0Var.f33556l2;
                if (i13 != top) {
                    ap0Var.f33558m2 = i13;
                    float f10 = top;
                    int i14 = (int) (ap0Var.f33563p2 + f10);
                    ap0Var.f33556l2 = i14;
                    co0Var2.setTopGlowOffset(i14);
                    int i15 = (int) (ap0Var.f33563p2 + f10);
                    ap0Var.f33556l2 = i15;
                    co0Var3.setTopGlowOffset(i15);
                    int i16 = (int) (f10 + ap0Var.f33563p2);
                    ap0Var.f33556l2 = i16;
                    ek0Var.setTopGlowOffset(i16);
                    ap0Var.f33557m1.setTranslationY(ap0Var.f33556l2 + ap0Var.f33563p2);
                    ap0Var.M1.setTranslationY(ap0Var.f33556l2 + ap0Var.f33563p2);
                    ap0Var.f30142b.invalidate();
                }
            }
        }
    }

    public static int K0(ap0 ap0Var) {
        co0 co0Var = ap0Var.B1;
        if (co0Var.getChildCount() != 0) {
            int i7 = 0;
            View childAt = co0Var.getChildAt(0);
            mj0 mj0Var = (mj0) co0Var.G(childAt);
            if (mj0Var != null) {
                int paddingTop = co0Var.getPaddingTop();
                if (mj0Var.c() == 0 && childAt.getTop() >= 0) {
                    i7 = childAt.getTop();
                }
                return paddingTop - i7;
            }
            return -1000;
        }
        return -1000;
    }

    public static ap0 O0(Context context, org.telegram.messenger.gj gjVar, String str, boolean z10, String str2) {
        ArrayList arrayList;
        if (gjVar != null) {
            arrayList = org.telegram.messenger.f3.i(gjVar);
        } else {
            arrayList = null;
        }
        return new ap0(context, arrayList, str, null, z10, str2, null, false);
    }

    public static void X0(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        int i10;
        int w02 = org.telegram.ui.ActionBar.m6.w0(i7, h6Var);
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
            org.telegram.ui.ActionBar.t6.Q(childAt, org.telegram.ui.ActionBar.m6.a0(w02, i10, i12), null, org.telegram.ui.ActionBar.t6.M(i7), h6Var);
        }
    }

    @Override
    public final boolean G() {
        return false;
    }

    @Override
    public void L() {
        super.L();
        go0 go0Var = this.f33560o1;
        if (go0Var != null) {
            go0Var.o();
        }
    }

    public final void L0(boolean z10) {
        e10 e10Var = this.f33573u2;
        ah.i iVar = e10Var.f34632r;
        ah.i iVar2 = e10Var.f34632r;
        boolean isEmpty = TextUtils.isEmpty(iVar.getText());
        co0 co0Var = this.B1;
        co0 co0Var2 = this.C1;
        boolean z11 = true;
        if (isEmpty && ((!this.d || !iVar2.hasFocus()) && !this.I2)) {
            if (this.f33581y2 == null) {
                org.telegram.messenger.g0.X3(co0Var, true, 0.98f, true, true);
                org.telegram.messenger.g0.V3(co0Var2, false);
            }
            z11 = false;
        } else {
            this.f33577w2 = true;
            if (this.f33581y2 == null) {
                org.telegram.messenger.g0.X3(co0Var, false, 0.98f, true, true);
                org.telegram.messenger.g0.V3(co0Var2, true);
            }
        }
        if (this.H2 == z11 && !z10) {
            return;
        }
        this.H2 = z11;
        xo0 xo0Var = this.I1;
        xo0Var.f();
        this.G1.f();
        if (this.H2) {
            if (this.G2 == Integer.MAX_VALUE) {
                ((v4.b0) co0Var2.getLayoutManager()).h1(0, -co0Var2.getPaddingTop());
            } else {
                ((v4.b0) co0Var2.getLayoutManager()).h1(0, this.G2 - co0Var2.getPaddingTop());
            }
            xo0Var.E(iVar2.getText().toString());
            return;
        }
        int i7 = this.G2;
        v4.s sVar = this.D1;
        if (i7 == Integer.MAX_VALUE) {
            sVar.h1(0, 0);
        } else {
            sVar.h1(0, 0);
        }
    }

    public final void M0() {
        float f10;
        TLRPC.Dialog dialog = this.f33581y2;
        if (dialog != null) {
            org.telegram.ui.Cells.e7 e7Var = null;
            this.f33581y2 = null;
            for (int i7 = 0; i7 < Q0().getChildCount(); i7++) {
                View childAt = Q0().getChildAt(i7);
                if ((childAt instanceof org.telegram.ui.Cells.e7) && ((org.telegram.ui.Cells.e7) childAt).getCurrentDialog() == dialog.f28402id) {
                    e7Var = childAt;
                }
            }
            if (e7Var == null) {
                return;
            }
            r1.g gVar = this.f33579x2;
            if (gVar != null) {
                gVar.d();
            }
            Q0().setVisibility(0);
            e10 e10Var = this.f33573u2;
            e10Var.setVisibility(0);
            ah.i iVar = e10Var.f34632r;
            if (this.H2 || this.I2) {
                this.f33583z2.I.v = true;
                iVar.requestFocus();
                org.telegram.messenger.g0.I3(iVar);
            }
            int[] iArr = new int[2];
            r1.g gVar2 = new r1.g(new r1.f(1000.0f));
            r1.h hVar = new r1.h(0.0f);
            org.telegram.ui.bn bnVar = this.f33547b2;
            if (bnVar != null && bnVar.f45917b) {
                f10 = 10.0f;
            } else {
                f10 = 800.0f;
            }
            hVar.b(f10);
            hVar.a(1.0f);
            gVar2.f56333m = hVar;
            this.f33579x2 = gVar2;
            gVar2.b(new un0(this, e7Var, iArr, 0));
            this.f33579x2.a(new ya(this, 5));
            this.f33579x2.h();
        }
    }

    public final void N0() {
        boolean z10 = false;
        if (this.f33551g2 != null || this.f33555k2[0] != null) {
            try {
                ((ClipboardManager) org.telegram.messenger.t0.f26895b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", P0()));
                qo0 qo0Var = this.f33561o2;
                if (qo0Var != null) {
                    qo0Var.D0();
                } else if (this.f33548c2 instanceof LaunchActivity) {
                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = this.f33551g2;
                    if (tL_exportedMessageLink != null && tL_exportedMessageLink.link.contains("/c/")) {
                        z10 = true;
                    }
                    ((LaunchActivity) this.f33548c2).H0(new l2.v(2, z10));
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    public final String P0() {
        String str;
        String str2;
        String[] strArr = this.f33555k2;
        oo0 oo0Var = this.S1;
        if (oo0Var != null) {
            str2 = strArr[oo0Var.f38286e];
        } else {
            TLRPC.TL_exportedMessageLink tL_exportedMessageLink = this.f33551g2;
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
        op opVar = this.f33546a2;
        if (opVar != null && opVar.f38291a.f32840q) {
            try {
                str2 = Uri.parse(str2).buildUpon().appendQueryParameter("t", org.telegram.messenger.g0.n0(this.X1)).build().toString();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public final ek0 Q0() {
        if (!this.H2 && !this.I2) {
            return this.B1;
        }
        return this.C1;
    }

    public final void R0(View view, int[] iArr, float f10) {
        float width = (view.getWidth() / 2.0f) + view.getX();
        ek0 ek0Var = this.A1;
        ek0Var.setPivotX(width);
        ek0Var.setPivotY((view.getHeight() / 2.0f) + view.getY());
        float f11 = 0.25f * f10;
        float f12 = 0.75f + f11;
        ek0Var.setScaleX(f12);
        ek0Var.setScaleY(f12);
        ek0Var.setAlpha(f10);
        ek0 Q0 = Q0();
        Q0.setPivotX((view.getWidth() / 2.0f) + view.getX());
        Q0.setPivotY((view.getHeight() / 2.0f) + view.getY());
        float f13 = f11 + 1.0f;
        Q0.setScaleX(f13);
        Q0.setScaleY(f13);
        float f14 = 1.0f - f10;
        Q0.setAlpha(f14);
        e10 e10Var = this.f33573u2;
        e10Var.setPivotX(e10Var.getWidth() / 2.0f);
        e10Var.setPivotY(0.0f);
        float f15 = (0.1f * f14) + 0.9f;
        e10Var.setScaleX(f15);
        e10Var.setScaleY(f15);
        e10Var.setAlpha(f14);
        org.telegram.ui.ActionBar.k kVar = this.f33575v2;
        kVar.getBackButton().setTranslationX((-org.telegram.messenger.g0.L(16.0f)) * f14);
        kVar.getTitleTextView().setTranslationY(org.telegram.messenger.g0.L(16.0f) * f14);
        kVar.getSubtitleTextView().setTranslationY(org.telegram.messenger.g0.L(16.0f) * f14);
        kVar.setAlpha(f10);
        ek0Var.getLocationInWindow(iArr);
        float interpolation = nr.f37918g.getInterpolation(f10);
        for (int i7 = 0; i7 < Q0.getChildCount(); i7++) {
            View childAt = Q0.getChildAt(i7);
            if (childAt instanceof org.telegram.ui.Cells.e7) {
                childAt.setTranslationX((childAt.getX() - view.getX()) * 0.5f * interpolation);
                childAt.setTranslationY((childAt.getY() - view.getY()) * 0.5f * interpolation);
                if (childAt != view) {
                    childAt.setAlpha(1.0f - (Math.min(f10, 0.5f) / 0.5f));
                } else {
                    childAt.setAlpha(f14);
                }
            }
        }
        for (int i10 = 0; i10 < ek0Var.getChildCount(); i10++) {
            View childAt2 = ek0Var.getChildAt(i10);
            if (childAt2 instanceof org.telegram.ui.Cells.f7) {
                double d = 1.0f - interpolation;
                childAt2.setTranslationX((float) ((-(childAt2.getX() - view.getX())) * Math.pow(d, 2.0d)));
                float y10 = childAt2.getY();
                childAt2.setTranslationY((float) (Math.pow(d, 2.0d) * (-((ek0Var.getTranslationY() + y10) - view.getY()))));
            }
        }
        this.f30142b.requestLayout();
        Q0.invalidate();
    }

    @Override
    public final int S() {
        return this.f30142b.getMeasuredHeight() - this.T1;
    }

    public final void U0(boolean z10) {
        Integer num;
        float f10;
        View[] viewArr = this.O1;
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
            AnimatorSet[] animatorSetArr = this.P1;
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
            animatorSetArr[0].addListener(new lo0(this, z10, 0));
            animatorSetArr[0].start();
        }
    }

    public final void V0(View view, TLRPC.Dialog dialog) {
        Activity activity;
        ap0 ap0Var;
        ArrayList l10;
        wo0 wo0Var;
        if (dialog instanceof so0) {
            T0(view);
        } else if (((view instanceof org.telegram.ui.Cells.e7) && ((org.telegram.ui.Cells.e7) view).G) || ((view instanceof org.telegram.ui.Cells.h6) && ((org.telegram.ui.Cells.h6) view).f30715o0)) {
            Z0(dialog.f28402id, view);
        } else {
            ek0 ek0Var = this.A1;
            if (ek0Var.getVisibility() == 8 && (activity = this.f33548c2) != null) {
                boolean z10 = org.telegram.messenger.n5.z(dialog.f28402id);
                int i7 = this.L1;
                if (z10) {
                    TLRPC.Chat O0 = org.telegram.messenger.np.u1(this.f30139a).O0(Long.valueOf(-dialog.f28402id));
                    if (org.telegram.messenger.v3.T(O0) && !O0.megagroup) {
                        TLRPC.Chat O02 = org.telegram.messenger.np.u1(this.f30139a).O0(Long.valueOf(-dialog.f28402id));
                        if ((!org.telegram.messenger.v3.n(O02) && !O02.megagroup) || i7 == 2 || i7 == 3) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                            String N0 = org.telegram.messenger.hd.N0(2131745400, null);
                            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28743a;
                            t1Var.S = N0;
                            if (i7 == 3) {
                                if (org.telegram.messenger.v3.P(10, O0)) {
                                    t1Var.U = org.telegram.messenger.hd.N0(2131751072, null);
                                } else {
                                    t1Var.U = org.telegram.messenger.hd.N0(2131751073, null);
                                }
                            } else if (i7 == 2) {
                                if (this.f33554j2) {
                                    t1Var.U = org.telegram.messenger.hd.N0(2131746391, null);
                                } else if (org.telegram.messenger.v3.P(10, O0)) {
                                    t1Var.U = org.telegram.messenger.hd.N0(2131751080, null);
                                } else {
                                    t1Var.U = org.telegram.messenger.hd.N0(2131751081, null);
                                }
                            } else {
                                t1Var.U = org.telegram.messenger.hd.N0(2131752428, null);
                            }
                            i5.c.y(null, 2131747637, alertDialog$Builder, null);
                            return;
                        }
                    }
                } else if (org.telegram.messenger.n5.C(dialog.f28402id) && i7 != 0) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(activity);
                    String N02 = org.telegram.messenger.hd.N0(2131745400, null);
                    org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.f28743a;
                    t1Var2.S = N02;
                    if (i7 == 3) {
                        t1Var2.U = org.telegram.messenger.hd.N0(2131743849, null);
                    } else if (i7 != 0) {
                        t1Var2.U = org.telegram.messenger.hd.N0(2131746982, null);
                    } else {
                        t1Var2.U = org.telegram.messenger.hd.N0(2131748911, null);
                    }
                    i5.c.y(null, 2131747637, alertDialog$Builder2, null);
                    return;
                }
                long j3 = dialog.f28402id;
                a0.h hVar = this.Q1;
                if (hVar.h(j3) >= 0) {
                    hVar.l(dialog.f28402id);
                    this.R1.remove(dialog);
                    if (view instanceof org.telegram.ui.Cells.h6) {
                        ((org.telegram.ui.Cells.h6) view).w(false, true);
                    } else if (view instanceof org.telegram.ui.Cells.e7) {
                        ((org.telegram.ui.Cells.e7) view).b(false, true);
                    }
                    c1(1);
                    ap0Var = this;
                } else {
                    TLRPC.User c22 = org.telegram.messenger.np.u1(this.f30139a).c2(Long.valueOf(dialog.f28402id));
                    TLRPC.Chat O03 = org.telegram.messenger.np.u1(this.f30139a).O0(Long.valueOf(-dialog.f28402id));
                    if ((!org.telegram.messenger.p10.v(c22) || (((l10 = org.telegram.messenger.np.u1(this.f30139a).f25932t7.l(-c22.f28547id)) == null || l10.isEmpty()) && org.telegram.messenger.np.u1(this.f30139a).f25932t7.e(-c22.f28547id))) && (!org.telegram.messenger.n5.z(dialog.f28402id) || (!org.telegram.messenger.v3.c0(O03) && (!org.telegram.messenger.v3.p0(O03) || !org.telegram.messenger.v3.A(this.f30139a, O03, 24))))) {
                        ap0Var = this;
                        hVar.k(dialog, dialog.f28402id);
                        if (view instanceof org.telegram.ui.Cells.h6) {
                            ((org.telegram.ui.Cells.h6) view).w(true, true);
                        } else if (view instanceof org.telegram.ui.Cells.e7) {
                            ((org.telegram.ui.Cells.e7) view).b(true, true);
                        }
                        c1(2);
                        long j10 = org.telegram.messenger.k10.i(ap0Var.f30139a).f24951n;
                        if (ap0Var.H2) {
                            to0 to0Var = ap0Var.G1;
                            a0.h hVar2 = to0Var.f39980e;
                            ArrayList arrayList = to0Var.d;
                            TLRPC.Dialog dialog2 = (TLRPC.Dialog) hVar2.f(dialog.f28402id);
                            if (dialog2 == null) {
                                to0Var.f39980e.k(dialog, dialog.f28402id);
                                arrayList.add(!arrayList.isEmpty(), dialog);
                            } else if (dialog2.f28402id != j10) {
                                arrayList.remove(dialog2);
                                arrayList.add(!arrayList.isEmpty(), dialog2);
                            }
                            to0Var.f();
                            ap0Var.f33577w2 = false;
                            e10 e10Var = ap0Var.f33573u2;
                            e10Var.f34632r.setText("");
                            L0(false);
                            org.telegram.messenger.g0.v1(e10Var.f34632r);
                        }
                    } else {
                        this.f33581y2 = dialog;
                        this.E1.h1(0, this.f33556l2 - ek0Var.getPaddingTop());
                        AtomicReference atomicReference = new AtomicReference();
                        jo0 jo0Var = new jo0(this, dialog, atomicReference, view);
                        atomicReference.set(new q20(this, atomicReference, jo0Var, dialog, 7));
                        org.telegram.messenger.ls f10 = org.telegram.messenger.ls.f(this.f30139a);
                        int i10 = org.telegram.messenger.ls.f25354t5;
                        f10.b(jo0Var, i10);
                        if (org.telegram.messenger.np.u1(this.f30139a).f25932t7.l(-dialog.f28402id) != null) {
                            jo0Var.didReceivedNotification(i10, this.f30139a, Long.valueOf(-dialog.f28402id));
                            return;
                        }
                        org.telegram.messenger.np.u1(this.f30139a).f25932t7.o(-dialog.f28402id);
                        org.telegram.messenger.g0.h3((Runnable) atomicReference.get(), 300L);
                        return;
                    }
                }
                xo0 xo0Var = ap0Var.I1;
                if (xo0Var != null && (wo0Var = xo0Var.I) != null) {
                    wo0Var.k(0, wo0Var.b());
                }
            }
        }
    }

    public final void W0(final boolean z10) {
        int i7;
        int i10;
        int i11;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            a0.h hVar = this.Q1;
            int m10 = hVar.m();
            fo0 fo0Var = this.n1;
            go0 go0Var = this.f33560o1;
            boolean z11 = true;
            if (i13 < m10) {
                long j3 = hVar.j(i13);
                if (c5.h(getContext(), this.f30139a, j3, (fo0Var.getTag() == null || go0Var.f42495a.length() <= 0) ? false : false)) {
                    return;
                }
                i13++;
            } else {
                Editable text = go0Var.getText();
                tt ttVar = go0Var.f42495a;
                final CharSequence[] charSequenceArr = {text};
                final ArrayList Y = org.telegram.messenger.si.d0(this.f30139a).Y(charSequenceArr, true, true);
                op opVar = this.f33546a2;
                if (opVar != null && opVar.f38291a.f32840q) {
                    i7 = this.X1;
                } else {
                    i7 = -1;
                }
                ArrayList arrayList = new ArrayList();
                if (this.J1 != null) {
                    i11 = 0;
                    while (i12 < hVar.m()) {
                        long j10 = hVar.j(i12);
                        long P1 = org.telegram.messenger.np.u1(this.f30139a).P1(j10);
                        if (P1 <= 0) {
                            P1 = org.telegram.messenger.n5.k(org.telegram.messenger.np.u1(this.f30139a).P2(j10));
                        }
                        if (fo0Var.getTag() != null && ttVar.length() > 0 && P1 > 0) {
                            i11++;
                        }
                        int i14 = (P1 > 0L ? 1 : (P1 == 0L ? 0 : -1));
                        if (i14 > 0) {
                            i11++;
                        }
                        if (i14 > 0 && !arrayList.contains(Long.valueOf(j10))) {
                            arrayList.add(Long.valueOf(j10));
                        }
                        i12++;
                    }
                } else {
                    oo0 oo0Var = this.S1;
                    if (oo0Var != null) {
                        i10 = oo0Var.f38286e;
                    } else {
                        i10 = 0;
                    }
                    if (this.B2 != null) {
                        int i15 = 0;
                        int i16 = 0;
                        while (i15 < hVar.m()) {
                            long j11 = hVar.j(i15);
                            long P12 = org.telegram.messenger.np.u1(this.f30139a).P1(j11);
                            if (P12 <= 0) {
                                P12 = org.telegram.messenger.n5.k(org.telegram.messenger.np.u1(this.f30139a).P2(j11));
                            }
                            int i17 = i12;
                            if (this.B2 != null && fo0Var.getTag() != null && ttVar.length() > 0 && charSequenceArr[i17] != null && P12 > 0) {
                                i16++;
                            }
                            int i18 = (P12 > 0L ? 1 : (P12 == 0L ? 0 : -1));
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
                        if (this.K1[i10] != null) {
                            for (int i20 = 0; i20 < hVar.m(); i20++) {
                                long j12 = hVar.j(i20);
                                long P13 = org.telegram.messenger.np.u1(this.f30139a).P1(j12);
                                if (P13 <= 0) {
                                    P13 = org.telegram.messenger.n5.k(org.telegram.messenger.np.u1(this.f30139a).P2(j12));
                                }
                                if (fo0Var.getTag() != null && ttVar.length() > 0 && P13 > 0) {
                                    i19++;
                                }
                                int i21 = (P13 > 0L ? 1 : (P13 == 0L ? 0 : -1));
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
                c5.Z(this.f30139a, arrayList, i11, new org.telegram.messenger.y10() {
                    @Override
                    public final void a(Object obj) {
                        int i23;
                        int i24;
                        boolean z12;
                        Long l10;
                        int i25;
                        HashMap hashMap;
                        long j13;
                        boolean z13;
                        char c10;
                        org.telegram.messenger.gj gjVar;
                        go0 go0Var2;
                        long longValue;
                        String charSequence;
                        long longValue2;
                        Long l11;
                        boolean z14;
                        boolean z15;
                        long j14;
                        String[] strArr;
                        org.telegram.messenger.gj gjVar2;
                        org.telegram.messenger.yy b10;
                        long longValue3;
                        String charSequence2;
                        ArrayList arrayList2;
                        TLRPC.TL_forumTopic tL_forumTopic;
                        TLRPC.TL_forumTopic tL_forumTopic2;
                        Long l12;
                        boolean z16;
                        int i26;
                        boolean z17;
                        long j15;
                        Long l13;
                        CharSequence[] charSequenceArr2;
                        org.telegram.messenger.gj gjVar3;
                        org.telegram.messenger.gj gjVar4;
                        ArrayList arrayList3;
                        ?? r11;
                        long longValue4;
                        String charSequence3;
                        long longValue5;
                        HashMap hashMap2 = (HashMap) obj;
                        ap0 ap0Var = ap0.this;
                        String[] strArr2 = ap0Var.K1;
                        go0 go0Var3 = ap0Var.f33560o1;
                        fo0 fo0Var2 = ap0Var.n1;
                        HashMap hashMap3 = ap0Var.R1;
                        Long l14 = 0L;
                        a0.h hVar2 = ap0Var.Q1;
                        ArrayList arrayList4 = ap0Var.J1;
                        CharSequence[] charSequenceArr3 = charSequenceArr;
                        ArrayList arrayList5 = Y;
                        boolean z18 = z10;
                        if (arrayList4 != null) {
                            ArrayList arrayList6 = new ArrayList();
                            int i27 = 0;
                            boolean z19 = false;
                            while (true) {
                                if (i27 < hVar2.m()) {
                                    boolean z20 = z18;
                                    long j16 = hVar2.j(i27);
                                    boolean E2 = org.telegram.messenger.np.u1(ap0Var.f30139a).E2(j16);
                                    fo0 fo0Var3 = fo0Var2;
                                    if (hashMap2 == null) {
                                        l12 = l14;
                                    } else {
                                        l12 = (Long) hashMap2.get(Long.valueOf(j16));
                                    }
                                    if (l12 != null && l12.longValue() > 0) {
                                        z16 = true;
                                    } else {
                                        z16 = z19;
                                    }
                                    Long l15 = l12;
                                    TLRPC.TL_forumTopic tL_forumTopic3 = (TLRPC.TL_forumTopic) hashMap3.get(hVar2.f(j16));
                                    if (tL_forumTopic3 != null && E2) {
                                        i26 = i27;
                                        z17 = E2;
                                        j15 = org.telegram.messenger.n5.o(tL_forumTopic3.from_id);
                                    } else {
                                        i26 = i27;
                                        z17 = E2;
                                        j15 = 0;
                                    }
                                    if (tL_forumTopic3 != null && !z17) {
                                        l13 = l14;
                                        arrayList2 = arrayList4;
                                        charSequenceArr2 = charSequenceArr3;
                                        gjVar3 = new org.telegram.messenger.gj(ap0Var.f30139a, tL_forumTopic3.topicStartMessage, false, false);
                                    } else {
                                        l13 = l14;
                                        arrayList2 = arrayList4;
                                        charSequenceArr2 = charSequenceArr3;
                                        gjVar3 = null;
                                    }
                                    if (gjVar3 != null) {
                                        gjVar3.f24196p = true;
                                    }
                                    if (fo0Var3.getTag() != null && go0Var3.f42495a.length() > 0) {
                                        CharSequence charSequence4 = charSequenceArr2[0];
                                        if (charSequence4 == null) {
                                            charSequence3 = null;
                                        } else {
                                            charSequence3 = charSequence4.toString();
                                        }
                                        r11 = 0;
                                        gjVar4 = gjVar3;
                                        ArrayList arrayList7 = arrayList5;
                                        org.telegram.messenger.yy b11 = org.telegram.messenger.yy.b(charSequence3, j16, gjVar4, gjVar3, null, true, arrayList7, null, null, z20, 0, 0, null, false);
                                        arrayList3 = arrayList7;
                                        z20 = z20;
                                        if (l15 == null) {
                                            longValue5 = 0;
                                        } else {
                                            longValue5 = l15.longValue();
                                        }
                                        b11.Q = longValue5;
                                        b11.R = j15;
                                        org.telegram.messenger.az.C(ap0Var.f30139a).r0(b11);
                                    } else {
                                        gjVar4 = gjVar3;
                                        arrayList3 = arrayList5;
                                        r11 = 0;
                                    }
                                    org.telegram.messenger.az C = org.telegram.messenger.az.C(ap0Var.f30139a);
                                    org.telegram.messenger.gj gjVar5 = gjVar4;
                                    ArrayList arrayList8 = ap0Var.J1;
                                    boolean z21 = !ap0Var.E2;
                                    if (l15 == null) {
                                        longValue4 = 0;
                                    } else {
                                        longValue4 = l15.longValue();
                                    }
                                    boolean z22 = z20;
                                    int q02 = C.q0(arrayList8, j16, z21, false, z22, 0, 0, gjVar5, i22, longValue4, j15, null);
                                    if (q02 != 0) {
                                        arrayList6.add(Long.valueOf(j16));
                                    }
                                    if (hVar2.m() == 1) {
                                        c5.q0(q02, ap0Var.f33547b2, r11);
                                        if (q02 != 0) {
                                            z19 = z16;
                                            tL_forumTopic = r11;
                                            break;
                                        }
                                    }
                                    i27 = i26 + 1;
                                    arrayList5 = arrayList3;
                                    z18 = z22;
                                    fo0Var2 = fo0Var3;
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
                                ap0Var.S0(hVar2, size2, tL_forumTopic2, !z19);
                            }
                        } else {
                            boolean z23 = z18;
                            oo0 oo0Var2 = ap0Var.S1;
                            if (oo0Var2 != null) {
                                i23 = oo0Var2.f38286e;
                            } else {
                                i23 = 0;
                            }
                            if (ap0Var.B2 != null) {
                                int i29 = 0;
                                boolean z24 = false;
                                while (i29 < hVar2.m()) {
                                    long j17 = hVar2.j(i29);
                                    boolean E22 = org.telegram.messenger.np.u1(ap0Var.f30139a).E2(j17);
                                    if (hashMap2 == null) {
                                        l11 = l14;
                                    } else {
                                        l11 = (Long) hashMap2.get(Long.valueOf(j17));
                                    }
                                    if (l11 != null && l11.longValue() > 0) {
                                        z24 = true;
                                    }
                                    TLRPC.TL_forumTopic tL_forumTopic4 = (TLRPC.TL_forumTopic) hashMap3.get(hVar2.f(j17));
                                    if (tL_forumTopic4 != null && E22) {
                                        z14 = z24;
                                        z15 = E22;
                                        j14 = org.telegram.messenger.n5.o(tL_forumTopic4.from_id);
                                    } else {
                                        z14 = z24;
                                        z15 = E22;
                                        j14 = 0;
                                    }
                                    if (tL_forumTopic4 != null && !z15) {
                                        strArr = strArr2;
                                        gjVar2 = new org.telegram.messenger.gj(ap0Var.f30139a, tL_forumTopic4.topicStartMessage, false, false);
                                    } else {
                                        strArr = strArr2;
                                        gjVar2 = null;
                                    }
                                    if (ap0Var.B2 == null) {
                                        if (fo0Var2.getTag() != null && go0Var3.f42495a.length() > 0) {
                                            CharSequence charSequence5 = charSequenceArr3[0];
                                            if (charSequence5 == null) {
                                                charSequence2 = null;
                                            } else {
                                                charSequence2 = charSequence5.toString();
                                            }
                                            boolean z25 = z23;
                                            b10 = org.telegram.messenger.yy.b(charSequence2, j17, gjVar2, gjVar2, null, true, arrayList5, null, null, z25, 0, 0, null, false);
                                            z23 = z25;
                                        } else {
                                            b10 = org.telegram.messenger.yy.b(strArr[i23], j17, gjVar2, gjVar2, null, true, null, null, null, z23, 0, 0, null, false);
                                        }
                                    } else {
                                        if (fo0Var2.getTag() != null && go0Var3.f42495a.length() > 0 && charSequenceArr3[0] != null) {
                                            org.telegram.messenger.gj gjVar6 = gjVar2;
                                            gjVar2 = gjVar6;
                                            org.telegram.messenger.az.C(ap0Var.f30139a).r0(org.telegram.messenger.yy.b(charSequenceArr3[0].toString(), j17, null, gjVar6, null, true, null, null, null, z23, 0, 0, null, false));
                                        }
                                        b10 = org.telegram.messenger.yy.b(null, j17, gjVar2, gjVar2, null, true, null, null, null, z23, 0, 0, null, false);
                                        b10.I = ap0Var.B2;
                                    }
                                    if (l11 == null) {
                                        longValue3 = 0;
                                    } else {
                                        longValue3 = l11.longValue();
                                    }
                                    b10.Q = longValue3;
                                    b10.R = j14;
                                    org.telegram.messenger.az.C(ap0Var.f30139a).r0(b10);
                                    i29++;
                                    z24 = z14;
                                    strArr2 = strArr;
                                }
                                z12 = z24;
                            } else if (strArr2[i23] != null) {
                                int i30 = 0;
                                boolean z26 = false;
                                while (i30 < hVar2.m()) {
                                    long j18 = hVar2.j(i30);
                                    boolean E23 = org.telegram.messenger.np.u1(ap0Var.f30139a).E2(j18);
                                    if (hashMap2 == null) {
                                        l10 = l14;
                                    } else {
                                        l10 = (Long) hashMap2.get(Long.valueOf(j18));
                                    }
                                    if (l10 != null && l10.longValue() > 0) {
                                        z26 = true;
                                    }
                                    TLRPC.TL_forumTopic tL_forumTopic5 = (TLRPC.TL_forumTopic) hashMap3.get(hVar2.f(j18));
                                    if (tL_forumTopic5 != null && E23) {
                                        i25 = i30;
                                        hashMap = hashMap2;
                                        j13 = org.telegram.messenger.n5.o(tL_forumTopic5.from_id);
                                    } else {
                                        i25 = i30;
                                        hashMap = hashMap2;
                                        j13 = 0;
                                    }
                                    if (tL_forumTopic5 != null && !E23) {
                                        z13 = z26;
                                        c10 = 0;
                                        gjVar = new org.telegram.messenger.gj(ap0Var.f30139a, tL_forumTopic5.topicStartMessage, false, false);
                                    } else {
                                        z13 = z26;
                                        c10 = 0;
                                        gjVar = null;
                                    }
                                    if (fo0Var2.getTag() != null && go0Var3.f42495a.length() > 0) {
                                        CharSequence charSequence6 = charSequenceArr3[c10];
                                        if (charSequence6 == null) {
                                            charSequence = null;
                                        } else {
                                            charSequence = charSequence6.toString();
                                        }
                                        boolean z27 = z23;
                                        org.telegram.messenger.yy b12 = org.telegram.messenger.yy.b(charSequence, j18, gjVar, gjVar, null, true, arrayList5, null, null, z27, 0, 0, null, false);
                                        z23 = z27;
                                        if (l10 == null) {
                                            go0Var2 = go0Var3;
                                            longValue2 = 0;
                                        } else {
                                            go0Var2 = go0Var3;
                                            longValue2 = l10.longValue();
                                        }
                                        b12.Q = longValue2;
                                        b12.R = j13;
                                        org.telegram.messenger.az.C(ap0Var.f30139a).r0(b12);
                                    } else {
                                        go0Var2 = go0Var3;
                                    }
                                    org.telegram.messenger.gj gjVar7 = gjVar;
                                    org.telegram.messenger.yy b13 = org.telegram.messenger.yy.b(strArr2[i23], j18, gjVar7, gjVar7, null, true, null, null, null, z23, 0, 0, null, false);
                                    if (l10 == null) {
                                        longValue = 0;
                                    } else {
                                        longValue = l10.longValue();
                                    }
                                    b13.Q = longValue;
                                    b13.R = j13;
                                    org.telegram.messenger.az.C(ap0Var.f30139a).r0(b13);
                                    i30 = i25 + 1;
                                    go0Var3 = go0Var2;
                                    hashMap2 = hashMap;
                                    z26 = z13;
                                }
                                z12 = z26;
                            } else {
                                i24 = 0;
                                z12 = false;
                                ap0Var.S0(hVar2, 1, (TLRPC.TL_forumTopic) hashMap3.get(hVar2.n(i24)), !z12);
                            }
                            i24 = 0;
                            ap0Var.S0(hVar2, 1, (TLRPC.TL_forumTopic) hashMap3.get(hVar2.n(i24)), !z12);
                        }
                        qo0 qo0Var = ap0Var.f33561o2;
                        if (qo0Var != null) {
                            qo0Var.Q();
                        }
                        ap0Var.dismiss();
                    }
                });
                return;
            }
        }
    }

    public final void Y0(boolean z10) {
        boolean z11;
        Integer num;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        int i7;
        fo0 fo0Var = this.n1;
        if (fo0Var.getTag() != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 == z11) {
            return;
        }
        AnimatorSet animatorSet = this.f33582z1;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z10) {
            num = 1;
        } else {
            num = null;
        }
        fo0Var.setTag(num);
        go0 go0Var = this.f33560o1;
        if (go0Var.getEditText().isFocused()) {
            org.telegram.messenger.g0.v1(go0Var.getEditText());
        }
        go0Var.k(true);
        FrameLayout frameLayout = this.Y1;
        fo0 fo0Var2 = this.f33564q1;
        FrameLayout frameLayout2 = this.f33566r1;
        if (z10) {
            fo0Var.setVisibility(0);
            if (frameLayout != null && frameLayout2 == null) {
                frameLayout.setVisibility(0);
            }
            fo0Var2.setVisibility(0);
        } else if (frameLayout2 != null) {
            frameLayout2.setVisibility(0);
        }
        int i10 = 4;
        if (frameLayout2 != null) {
            if (z10) {
                i7 = 4;
            } else {
                i7 = 1;
            }
            WeakHashMap weakHashMap = r0.i0.f56254a;
            frameLayout2.setImportantForAccessibility(i7);
        }
        LinearLayout linearLayout = this.f33580y1;
        if (linearLayout != null) {
            if (!z10) {
                i10 = 1;
            }
            WeakHashMap weakHashMap2 = r0.i0.f56254a;
            linearLayout.setImportantForAccessibility(i10);
        }
        this.f33582z1 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        float f15 = 0.0f;
        float f16 = 1.0f;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(fo0Var, property, f10));
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
        arrayList.add(ObjectAnimator.ofFloat(fo0Var2, property2, f11));
        Property property3 = View.SCALE_Y;
        if (z10) {
            f17 = 1.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(fo0Var2, property3, f17));
        if (z10) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(fo0Var2, property, f12));
        if (frameLayout2 == null || frameLayout2.getVisibility() != 0) {
            View view = this.O1[1];
            if (!z10) {
                f16 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(view, property, f16));
        }
        FrameLayout frameLayout3 = this.f33572u1;
        if (frameLayout3 != null) {
            Property property4 = View.TRANSLATION_Y;
            if (this.d2 && z10) {
                if (this.Z1 != null) {
                    f13 = 5.0f;
                } else {
                    f13 = 16.0f;
                }
                f15 = org.telegram.messenger.g0.L(f13);
            }
            arrayList.add(ObjectAnimator.ofFloat(frameLayout3, property4, f15));
        }
        this.f33582z1.playTogether(arrayList);
        this.f33582z1.setInterpolator(new DecelerateInterpolator());
        this.f33582z1.setDuration(180L);
        this.f33582z1.addListener(new lo0(this, z10, 1));
        this.f33582z1.start();
    }

    public final void Z0(long j3, View view) {
        String str;
        gc K;
        int i7 = -this.D2;
        this.D2 = i7;
        org.telegram.messenger.g0.E3(i7, view, null);
        org.telegram.messenger.q2.APP_ERROR.a();
        if (j3 >= 0) {
            str = org.telegram.messenger.p10.q(org.telegram.messenger.np.u1(this.f30139a).c2(Long.valueOf(j3)));
        } else {
            str = "";
        }
        boolean K3 = org.telegram.messenger.np.u1(this.f30139a).K3();
        FrameLayout frameLayout = this.f33576w1;
        if (K3) {
            K = new lc(frameLayout, this.J0).Q(2131624217, 36, org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0(null, null, 2131743517, str)));
        } else {
            K = new lc(frameLayout, this.J0).K(2131624217, org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0(null, null, 2131743517, str)), org.telegram.messenger.hd.N0(2131743516, null), new xn0(this, 1));
        }
        K.j();
    }

    public final void a1() {
        org.telegram.ui.ActionBar.i1 i1Var;
        fo0 fo0Var = this.n1;
        if (fo0Var == null) {
            return;
        }
        go0 go0Var = this.f33560o1;
        if (go0Var != null && go0Var.m()) {
            go0Var.getEmojiPaddingShown();
        } else {
            no0 no0Var = this.f33583z2;
            if (no0Var != null && (i1Var = no0Var.I) != null && !i1Var.f28976f) {
                org.telegram.messenger.g0.L(20.0f);
            }
        }
        float f10 = 0.0f;
        FrameLayout frameLayout = this.Y1;
        if (frameLayout != null) {
            frameLayout.setTranslationY(-0.0f);
            f10 = 0.0f + org.telegram.messenger.g0.L(48.0f);
        }
        FrameLayout frameLayout2 = this.f33566r1;
        if (frameLayout2 != null) {
            frameLayout2.setTranslationY(-f10);
        }
        float f11 = -f10;
        fo0Var.setTranslationY(f11);
        this.f33564q1.setTranslationY(f11);
    }

    public final void b1() {
        org.telegram.ui.ActionBar.m5 m5Var = this.f33574v1;
        if (m5Var != null) {
            String P0 = P0();
            if (P0.startsWith("https://")) {
                P0 = P0.substring(8);
            } else if (P0.startsWith("http://")) {
                P0 = P0.substring(7);
            }
            m5Var.l(P0, false);
        }
    }

    public final void c1(int i7) {
        int size;
        boolean z10;
        boolean z11;
        a0.h hVar = this.Q1;
        if (hVar.m() == 0) {
            Y0(false);
            return;
        }
        ArrayList arrayList = this.J1;
        if (arrayList == null) {
            size = 1;
        } else {
            size = arrayList.size();
        }
        Object tag = this.n1.getTag();
        go0 go0Var = this.f33560o1;
        if (tag != null && go0Var.f42495a.length() > 0) {
            size++;
        }
        long j3 = 0;
        for (int i10 = 0; i10 < hVar.m(); i10++) {
            long j10 = ((TLRPC.Dialog) hVar.n(i10)).f28402id;
            long P1 = org.telegram.messenger.np.u1(this.f30139a).P1(j10);
            if (P1 <= 0) {
                P1 = org.telegram.messenger.n5.k(org.telegram.messenger.np.u1(this.f30139a).P2(j10));
            }
            j3 += P1;
        }
        int max = Math.max(1, hVar.m());
        if (i7 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        oi.v1 v1Var = this.f33562p1;
        v1Var.e(max, z10);
        if (i7 != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        v1Var.i(size, j3, z11);
        Y0(true);
        go0Var.setPadding(0, 0, Math.max(org.telegram.messenger.g0.L(84.0f), v1Var.l()), 0);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = org.telegram.messenger.ls.f25342s;
        if (i7 == i11) {
            to0 to0Var = this.G1;
            if (to0Var != null) {
                to0Var.E();
            }
            org.telegram.messenger.ls.f(this.f30139a).n(this, i11);
        }
    }

    @Override
    public final void dismiss() {
        go0 go0Var = this.f33560o1;
        if (go0Var != null) {
            org.telegram.messenger.g0.v1(go0Var.getEditText());
        }
        this.U1 = false;
        super.dismiss();
        org.telegram.messenger.ls.f(this.f30139a).n(this, org.telegram.messenger.ls.f25342s);
    }

    @Override
    public final void onBackPressed() {
        if (this.f33581y2 != null) {
            M0();
            return;
        }
        go0 go0Var = this.f33560o1;
        if (go0Var != null && go0Var.f42498e) {
            go0Var.k(true);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void s0() {
        boolean z10;
        try {
            super.s0();
            ui.c cVar = this.L2;
            if (cVar != null) {
                cVar.a(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29347d6, this.J0));
            }
            org.telegram.ui.ActionBar.m2 m2Var = this.f30145c;
            if (m2Var != null) {
                if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29420h5, this.J0)) > 0.721f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 != this.T2) {
                    this.T2 = z10;
                    org.telegram.messenger.g0.n3(m2Var, z10);
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public ap0(Context context, ArrayList arrayList, String str, String str2, boolean z10, String str3, String str4, boolean z11) {
        this(context, null, arrayList, str, str2, z10, str3, str4, false, z11, false, null, null);
    }

    public ap0(android.content.Context r40, org.telegram.ui.bn r41, java.util.ArrayList r42, java.lang.String r43, java.lang.String r44, boolean r45, java.lang.String r46, java.lang.String r47, boolean r48, boolean r49, boolean r50, java.lang.Integer r51, org.telegram.ui.ActionBar.h6 r52) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ap0.<init>(android.content.Context, org.telegram.ui.bn, java.util.ArrayList, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, boolean, boolean, boolean, java.lang.Integer, org.telegram.ui.ActionBar.h6):void");
    }

    public void T0(View view) {
    }

    public void S0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
    }
}
