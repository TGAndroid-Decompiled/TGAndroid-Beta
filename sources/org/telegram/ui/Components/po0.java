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
public class po0 extends org.telegram.ui.ActionBar.u2 implements org.telegram.messenger.is {
    public static final int U2 = 0;
    public final uj0 A1;
    public ArrayList A2;
    public final rn0 B1;
    public TL_stories.StoryItem B2;
    public final rn0 C1;
    public i0.c C2;
    public final v4.s D1;
    public int D2;
    public final v4.s E1;
    public boolean E2;
    public final py F1;
    public org.telegram.ui.ActionBar.g1 F2;
    public final io0 G1;
    public int G2;
    public final no0 H1;
    public boolean H2;
    public final mo0 I1;
    public boolean I2;
    public final ArrayList J1;
    public int J2;
    public final String[] K1;
    public final dh.g K2;
    public final int L1;
    public final ui.c L2;
    public final cv0 M1;
    public final dh.c M2;
    public final Drawable N1;
    public final dh.c N2;
    public final View[] O1;
    public final dh.c O2;
    public final AnimatorSet[] P1;
    public final zg P2;
    public final a0.h Q1;
    public final fh.g Q2;
    public final HashMap R1;
    public final dh.d R2;
    public final do0 S1;
    public final fh.g S2;
    public int T1;
    public boolean T2;
    public boolean U1;
    public final boolean V1;
    public boolean W1;
    public final int X1;
    public final FrameLayout Y1;
    public final LinearLayout Z1;
    public final fp f38340a2;
    public final org.telegram.ui.an f38341b2;
    public final Activity f38342c2;
    public final boolean d2;
    public boolean f38343e2;
    public final TextPaint f38344f2;
    public TLRPC.TL_exportedMessageLink f38345g2;
    public boolean f38346h2;
    public boolean f38347i2;
    public final boolean f38348j2;
    public final String[] f38349k2;
    public int f38350l2;
    public final FrameLayout f38351m1;
    public int f38352m2;
    public final un0 n1;
    public boolean f38353n2;
    public final vn0 f38354o1;
    public fo0 f38355o2;
    public final oi.u1 f38356p1;
    public float f38357p2;
    public final un0 f38358q1;
    public float f38359q2;
    public final FrameLayout f38360r1;
    public float f38361r2;
    public float f38362s1;
    public ValueAnimator f38363s2;
    public final bi.o2 f38364t1;
    public final xi0 f38365t2;
    public final FrameLayout f38366u1;
    public final v00 f38367u2;
    public final org.telegram.ui.ActionBar.j5 f38368v1;
    public final org.telegram.ui.ActionBar.k f38369v2;
    public final FrameLayout f38370w1;
    public boolean f38371w2;
    public final FrameLayout f38372x1;
    public r1.g f38373x2;
    public final LinearLayout f38374y1;
    public TLRPC.Dialog f38375y2;
    public AnimatorSet f38376z1;
    public final co0 f38377z2;

    public po0(Context context, ArrayList arrayList, String str, boolean z10, String str2, boolean z11, org.telegram.ui.ActionBar.e6 e6Var) {
        this(context, null, arrayList, str, null, z10, str2, null, z11, false, false, null, e6Var);
    }

    public static void I0(po0 po0Var) {
        rn0 rn0Var;
        int i7;
        int i10;
        rn0 rn0Var2 = po0Var.B1;
        rn0 rn0Var3 = po0Var.C1;
        uj0 uj0Var = po0Var.A1;
        if (!po0Var.f38353n2) {
            if (po0Var.H2) {
                rn0Var = rn0Var3;
            } else {
                rn0Var = rn0Var2;
            }
            if (rn0Var.getChildCount() > 0) {
                View childAt = rn0Var.getChildAt(0);
                for (int i11 = 0; i11 < rn0Var.getChildCount(); i11++) {
                    if (rn0Var.getChildAt(i11).getTop() < childAt.getTop()) {
                        childAt = rn0Var.getChildAt(i11);
                    }
                }
                cj0 cj0Var = (cj0) rn0Var.G(childAt);
                int top = childAt.getTop() - org.telegram.messenger.g0.L(8.0f);
                if (top > 0 && cj0Var != null && cj0Var.b() == 0) {
                    i7 = top;
                } else {
                    i7 = 0;
                }
                if (top >= 0 && cj0Var != null && cj0Var.b() == 0) {
                    po0Var.G2 = childAt.getTop();
                    po0Var.T0(false);
                } else {
                    po0Var.G2 = Integer.MAX_VALUE;
                    po0Var.T0(true);
                    top = i7;
                }
                if (uj0Var.getVisibility() == 0) {
                    if (uj0Var.getChildCount() > 0) {
                        View childAt2 = uj0Var.getChildAt(0);
                        for (int i12 = 0; i12 < uj0Var.getChildCount(); i12++) {
                            if (uj0Var.getChildAt(i12).getTop() < childAt2.getTop()) {
                                childAt2 = uj0Var.getChildAt(i12);
                            }
                        }
                        cj0 cj0Var2 = (cj0) uj0Var.G(childAt2);
                        int top2 = childAt2.getTop() - org.telegram.messenger.g0.L(8.0f);
                        if (top2 > 0 && cj0Var2 != null && cj0Var2.b() == 0) {
                            i10 = top2;
                        } else {
                            i10 = 0;
                        }
                        if (top2 >= 0 && cj0Var2 != null && cj0Var2.b() == 0) {
                            po0Var.G2 = childAt2.getTop();
                            po0Var.T0(false);
                        } else {
                            po0Var.G2 = Integer.MAX_VALUE;
                            po0Var.T0(true);
                            top2 = i10;
                        }
                        top = org.telegram.messenger.g0.W1(uj0Var.getAlpha(), top, top2);
                    } else {
                        return;
                    }
                }
                int i13 = po0Var.f38350l2;
                if (i13 != top) {
                    po0Var.f38352m2 = i13;
                    float f10 = top;
                    int i14 = (int) (po0Var.f38357p2 + f10);
                    po0Var.f38350l2 = i14;
                    rn0Var2.setTopGlowOffset(i14);
                    int i15 = (int) (po0Var.f38357p2 + f10);
                    po0Var.f38350l2 = i15;
                    rn0Var3.setTopGlowOffset(i15);
                    int i16 = (int) (f10 + po0Var.f38357p2);
                    po0Var.f38350l2 = i16;
                    uj0Var.setTopGlowOffset(i16);
                    po0Var.f38351m1.setTranslationY(po0Var.f38350l2 + po0Var.f38357p2);
                    po0Var.M1.setTranslationY(po0Var.f38350l2 + po0Var.f38357p2);
                    po0Var.f29682b.invalidate();
                }
            }
        }
    }

    public static int J0(po0 po0Var) {
        rn0 rn0Var = po0Var.B1;
        if (rn0Var.getChildCount() != 0) {
            int i7 = 0;
            View childAt = rn0Var.getChildAt(0);
            cj0 cj0Var = (cj0) rn0Var.G(childAt);
            if (cj0Var != null) {
                int paddingTop = rn0Var.getPaddingTop();
                if (cj0Var.c() == 0 && childAt.getTop() >= 0) {
                    i7 = childAt.getTop();
                }
                return paddingTop - i7;
            }
            return -1000;
        }
        return -1000;
    }

    public static po0 N0(Context context, org.telegram.messenger.gj gjVar, String str, boolean z10, String str2) {
        ArrayList arrayList;
        if (gjVar != null) {
            arrayList = org.telegram.messenger.k5.j(gjVar);
        } else {
            arrayList = null;
        }
        return new po0(context, arrayList, str, null, z10, str2, null, false);
    }

    public static void W0(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        int i10;
        int w02 = org.telegram.ui.ActionBar.j6.w0(i7, e6Var);
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
            org.telegram.ui.ActionBar.q6.Q(childAt, org.telegram.ui.ActionBar.j6.a0(w02, i10, i12), null, org.telegram.ui.ActionBar.q6.M(i7), e6Var);
        }
    }

    @Override
    public final boolean H() {
        return false;
    }

    public final void K0(boolean z10) {
        v00 v00Var = this.f38367u2;
        ah.i iVar = v00Var.f40202r;
        ah.i iVar2 = v00Var.f40202r;
        boolean isEmpty = TextUtils.isEmpty(iVar.getText());
        rn0 rn0Var = this.B1;
        rn0 rn0Var2 = this.C1;
        boolean z11 = true;
        if (isEmpty && ((!this.d || !iVar2.hasFocus()) && !this.I2)) {
            if (this.f38375y2 == null) {
                org.telegram.messenger.g0.Y3(rn0Var, true, 0.98f, true, true);
                org.telegram.messenger.g0.W3(rn0Var2, false);
            }
            z11 = false;
        } else {
            this.f38371w2 = true;
            if (this.f38375y2 == null) {
                org.telegram.messenger.g0.Y3(rn0Var, false, 0.98f, true, true);
                org.telegram.messenger.g0.W3(rn0Var2, true);
            }
        }
        if (this.H2 == z11 && !z10) {
            return;
        }
        this.H2 = z11;
        mo0 mo0Var = this.I1;
        mo0Var.f();
        this.G1.f();
        if (this.H2) {
            if (this.G2 == Integer.MAX_VALUE) {
                ((v4.b0) rn0Var2.getLayoutManager()).h1(0, -rn0Var2.getPaddingTop());
            } else {
                ((v4.b0) rn0Var2.getLayoutManager()).h1(0, this.G2 - rn0Var2.getPaddingTop());
            }
            mo0Var.E(iVar2.getText().toString());
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

    @Override
    public void L() {
        super.L();
        vn0 vn0Var = this.f38354o1;
        if (vn0Var != null) {
            vn0Var.o();
        }
    }

    public final void L0() {
        float f10;
        TLRPC.Dialog dialog = this.f38375y2;
        if (dialog != null) {
            org.telegram.ui.Cells.c7 c7Var = null;
            this.f38375y2 = null;
            for (int i7 = 0; i7 < P0().getChildCount(); i7++) {
                View childAt = P0().getChildAt(i7);
                if ((childAt instanceof org.telegram.ui.Cells.c7) && ((org.telegram.ui.Cells.c7) childAt).getCurrentDialog() == dialog.f28055id) {
                    c7Var = childAt;
                }
            }
            if (c7Var == null) {
                return;
            }
            r1.g gVar = this.f38373x2;
            if (gVar != null) {
                gVar.d();
            }
            P0().setVisibility(0);
            v00 v00Var = this.f38367u2;
            v00Var.setVisibility(0);
            ah.i iVar = v00Var.f40202r;
            if (this.H2 || this.I2) {
                this.f38377z2.I.v = true;
                iVar.requestFocus();
                org.telegram.messenger.g0.J3(iVar);
            }
            int[] iArr = new int[2];
            r1.g gVar2 = new r1.g(new r1.f(1000.0f));
            r1.h hVar = new r1.h(0.0f);
            org.telegram.ui.an anVar = this.f38341b2;
            if (anVar != null && anVar.f45131b) {
                f10 = 10.0f;
            } else {
                f10 = 800.0f;
            }
            hVar.b(f10);
            hVar.a(1.0f);
            gVar2.f55748m = hVar;
            this.f38373x2 = gVar2;
            gVar2.b(new jn0(this, c7Var, iArr, 0));
            this.f38373x2.a(new pa(this, 5));
            this.f38373x2.h();
        }
    }

    public final void M0() {
        boolean z10 = false;
        if (this.f38345g2 != null || this.f38349k2[0] != null) {
            try {
                ((ClipboardManager) org.telegram.messenger.t0.f26609b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", O0()));
                fo0 fo0Var = this.f38355o2;
                if (fo0Var != null) {
                    fo0Var.x0();
                } else if (this.f38342c2 instanceof LaunchActivity) {
                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = this.f38345g2;
                    if (tL_exportedMessageLink != null && tL_exportedMessageLink.link.contains("/c/")) {
                        z10 = true;
                    }
                    ((LaunchActivity) this.f38342c2).H0(new l2.v(2, z10));
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    public final String O0() {
        String str;
        String str2;
        String[] strArr = this.f38349k2;
        do0 do0Var = this.S1;
        if (do0Var != null) {
            str2 = strArr[do0Var.f34004e];
        } else {
            TLRPC.TL_exportedMessageLink tL_exportedMessageLink = this.f38345g2;
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
        fp fpVar = this.f38340a2;
        if (fpVar != null && fpVar.f34667a.f32441q) {
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

    public final uj0 P0() {
        if (!this.H2 && !this.I2) {
            return this.B1;
        }
        return this.C1;
    }

    public final void Q0(View view, int[] iArr, float f10) {
        float width = (view.getWidth() / 2.0f) + view.getX();
        uj0 uj0Var = this.A1;
        uj0Var.setPivotX(width);
        uj0Var.setPivotY((view.getHeight() / 2.0f) + view.getY());
        float f11 = 0.25f * f10;
        float f12 = 0.75f + f11;
        uj0Var.setScaleX(f12);
        uj0Var.setScaleY(f12);
        uj0Var.setAlpha(f10);
        uj0 P0 = P0();
        P0.setPivotX((view.getWidth() / 2.0f) + view.getX());
        P0.setPivotY((view.getHeight() / 2.0f) + view.getY());
        float f13 = f11 + 1.0f;
        P0.setScaleX(f13);
        P0.setScaleY(f13);
        float f14 = 1.0f - f10;
        P0.setAlpha(f14);
        v00 v00Var = this.f38367u2;
        v00Var.setPivotX(v00Var.getWidth() / 2.0f);
        v00Var.setPivotY(0.0f);
        float f15 = (0.1f * f14) + 0.9f;
        v00Var.setScaleX(f15);
        v00Var.setScaleY(f15);
        v00Var.setAlpha(f14);
        org.telegram.ui.ActionBar.k kVar = this.f38369v2;
        kVar.getBackButton().setTranslationX((-org.telegram.messenger.g0.L(16.0f)) * f14);
        kVar.getTitleTextView().setTranslationY(org.telegram.messenger.g0.L(16.0f) * f14);
        kVar.getSubtitleTextView().setTranslationY(org.telegram.messenger.g0.L(16.0f) * f14);
        kVar.setAlpha(f10);
        uj0Var.getLocationInWindow(iArr);
        float interpolation = er.f34420g.getInterpolation(f10);
        for (int i7 = 0; i7 < P0.getChildCount(); i7++) {
            View childAt = P0.getChildAt(i7);
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
        for (int i10 = 0; i10 < uj0Var.getChildCount(); i10++) {
            View childAt2 = uj0Var.getChildAt(i10);
            if (childAt2 instanceof org.telegram.ui.Cells.d7) {
                double d = 1.0f - interpolation;
                childAt2.setTranslationX((float) ((-(childAt2.getX() - view.getX())) * Math.pow(d, 2.0d)));
                float y10 = childAt2.getY();
                childAt2.setTranslationY((float) (Math.pow(d, 2.0d) * (-((uj0Var.getTranslationY() + y10) - view.getY()))));
            }
        }
        this.f29682b.requestLayout();
        P0.invalidate();
    }

    @Override
    public final int S() {
        return this.f29682b.getMeasuredHeight() - this.T1;
    }

    public final void T0(boolean z10) {
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
            animatorSetArr[0].addListener(new ao0(this, z10, 0));
            animatorSetArr[0].start();
        }
    }

    public final void U0(View view, TLRPC.Dialog dialog) {
        Activity activity;
        po0 po0Var;
        ArrayList l10;
        lo0 lo0Var;
        if (dialog instanceof ho0) {
            S0(view);
        } else if (((view instanceof org.telegram.ui.Cells.c7) && ((org.telegram.ui.Cells.c7) view).G) || ((view instanceof org.telegram.ui.Cells.f6) && ((org.telegram.ui.Cells.f6) view).f30254o0)) {
            Y0(dialog.f28055id, view);
        } else {
            uj0 uj0Var = this.A1;
            if (uj0Var.getVisibility() == 8 && (activity = this.f38342c2) != null) {
                boolean z10 = org.telegram.messenger.m5.z(dialog.f28055id);
                int i7 = this.L1;
                if (z10) {
                    TLRPC.Chat M0 = org.telegram.messenger.np.s1(this.f29679a).M0(Long.valueOf(-dialog.f28055id));
                    if (org.telegram.messenger.t3.T(M0) && !M0.megagroup) {
                        TLRPC.Chat M02 = org.telegram.messenger.np.s1(this.f29679a).M0(Long.valueOf(-dialog.f28055id));
                        if ((!org.telegram.messenger.t3.n(M02) && !M02.megagroup) || i7 == 2 || i7 == 3) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                            String M03 = org.telegram.messenger.hd.M0(2131745596, null);
                            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                            t1Var.S = M03;
                            if (i7 == 3) {
                                if (org.telegram.messenger.t3.P(10, M0)) {
                                    t1Var.U = org.telegram.messenger.hd.M0(2131751084, null);
                                } else {
                                    t1Var.U = org.telegram.messenger.hd.M0(2131751085, null);
                                }
                            } else if (i7 == 2) {
                                if (this.f38348j2) {
                                    t1Var.U = org.telegram.messenger.hd.M0(2131746587, null);
                                } else if (org.telegram.messenger.t3.P(10, M0)) {
                                    t1Var.U = org.telegram.messenger.hd.M0(2131751092, null);
                                } else {
                                    t1Var.U = org.telegram.messenger.hd.M0(2131751093, null);
                                }
                            } else {
                                t1Var.U = org.telegram.messenger.hd.M0(2131752440, null);
                            }
                            i5.c.x(null, 2131747831, alertDialog$Builder, null);
                            return;
                        }
                    }
                } else if (org.telegram.messenger.m5.C(dialog.f28055id) && i7 != 0) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(activity);
                    String M04 = org.telegram.messenger.hd.M0(2131745596, null);
                    org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.f28392a;
                    t1Var2.S = M04;
                    if (i7 == 3) {
                        t1Var2.U = org.telegram.messenger.hd.M0(2131744090, null);
                    } else if (i7 != 0) {
                        t1Var2.U = org.telegram.messenger.hd.M0(2131747176, null);
                    } else {
                        t1Var2.U = org.telegram.messenger.hd.M0(2131749104, null);
                    }
                    i5.c.x(null, 2131747831, alertDialog$Builder2, null);
                    return;
                }
                long j3 = dialog.f28055id;
                a0.h hVar = this.Q1;
                if (hVar.h(j3) >= 0) {
                    hVar.l(dialog.f28055id);
                    this.R1.remove(dialog);
                    if (view instanceof org.telegram.ui.Cells.f6) {
                        ((org.telegram.ui.Cells.f6) view).w(false, true);
                    } else if (view instanceof org.telegram.ui.Cells.c7) {
                        ((org.telegram.ui.Cells.c7) view).b(false, true);
                    }
                    b1(1);
                    po0Var = this;
                } else {
                    TLRPC.User a22 = org.telegram.messenger.np.s1(this.f29679a).a2(Long.valueOf(dialog.f28055id));
                    TLRPC.Chat M05 = org.telegram.messenger.np.s1(this.f29679a).M0(Long.valueOf(-dialog.f28055id));
                    if ((!org.telegram.messenger.q10.u(a22) || (((l10 = org.telegram.messenger.np.s1(this.f29679a).f25386r7.l(-a22.f28200id)) == null || l10.isEmpty()) && org.telegram.messenger.np.s1(this.f29679a).f25386r7.e(-a22.f28200id))) && (!org.telegram.messenger.m5.z(dialog.f28055id) || (!org.telegram.messenger.t3.c0(M05) && (!org.telegram.messenger.t3.p0(M05) || !org.telegram.messenger.t3.A(this.f29679a, M05, 24))))) {
                        po0Var = this;
                        hVar.k(dialog, dialog.f28055id);
                        if (view instanceof org.telegram.ui.Cells.f6) {
                            ((org.telegram.ui.Cells.f6) view).w(true, true);
                        } else if (view instanceof org.telegram.ui.Cells.c7) {
                            ((org.telegram.ui.Cells.c7) view).b(true, true);
                        }
                        b1(2);
                        long j10 = org.telegram.messenger.m10.i(po0Var.f29679a).f24959n;
                        if (po0Var.H2) {
                            io0 io0Var = po0Var.G1;
                            a0.h hVar2 = io0Var.f35675e;
                            ArrayList arrayList = io0Var.d;
                            TLRPC.Dialog dialog2 = (TLRPC.Dialog) hVar2.f(dialog.f28055id);
                            if (dialog2 == null) {
                                io0Var.f35675e.k(dialog, dialog.f28055id);
                                arrayList.add(!arrayList.isEmpty(), dialog);
                            } else if (dialog2.f28055id != j10) {
                                arrayList.remove(dialog2);
                                arrayList.add(!arrayList.isEmpty(), dialog2);
                            }
                            io0Var.f();
                            po0Var.f38371w2 = false;
                            v00 v00Var = po0Var.f38367u2;
                            v00Var.f40202r.setText("");
                            K0(false);
                            org.telegram.messenger.g0.v1(v00Var.f40202r);
                        }
                    } else {
                        this.f38375y2 = dialog;
                        this.E1.h1(0, this.f38350l2 - uj0Var.getPaddingTop());
                        AtomicReference atomicReference = new AtomicReference();
                        yn0 yn0Var = new yn0(this, dialog, atomicReference, view);
                        atomicReference.set(new u80(this, atomicReference, yn0Var, dialog, 4));
                        org.telegram.messenger.ns f10 = org.telegram.messenger.ns.f(this.f29679a);
                        int i10 = org.telegram.messenger.ns.f25559q5;
                        f10.b(yn0Var, i10);
                        if (org.telegram.messenger.np.s1(this.f29679a).f25386r7.l(-dialog.f28055id) != null) {
                            yn0Var.didReceivedNotification(i10, this.f29679a, Long.valueOf(-dialog.f28055id));
                            return;
                        }
                        org.telegram.messenger.np.s1(this.f29679a).f25386r7.o(-dialog.f28055id);
                        org.telegram.messenger.g0.i3((Runnable) atomicReference.get(), 300L);
                        return;
                    }
                }
                mo0 mo0Var = po0Var.I1;
                if (mo0Var != null && (lo0Var = mo0Var.I) != null) {
                    lo0Var.k(0, lo0Var.b());
                }
            }
        }
    }

    public final void V0(final boolean z10) {
        int i7;
        int i10;
        int i11;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            a0.h hVar = this.Q1;
            int m10 = hVar.m();
            un0 un0Var = this.n1;
            vn0 vn0Var = this.f38354o1;
            boolean z11 = true;
            if (i13 < m10) {
                long j3 = hVar.j(i13);
                if (t4.h(getContext(), this.f29679a, j3, (un0Var.getTag() == null || vn0Var.f39053a.length() <= 0) ? false : false)) {
                    return;
                }
                i13++;
            } else {
                Editable text = vn0Var.getText();
                mt mtVar = vn0Var.f39053a;
                final CharSequence[] charSequenceArr = {text};
                final ArrayList W = org.telegram.messenger.si.b0(this.f29679a).W(charSequenceArr, true, true);
                fp fpVar = this.f38340a2;
                if (fpVar != null && fpVar.f34667a.f32441q) {
                    i7 = this.X1;
                } else {
                    i7 = -1;
                }
                ArrayList arrayList = new ArrayList();
                if (this.J1 != null) {
                    i11 = 0;
                    while (i12 < hVar.m()) {
                        long j10 = hVar.j(i12);
                        long N1 = org.telegram.messenger.np.s1(this.f29679a).N1(j10);
                        if (N1 <= 0) {
                            N1 = org.telegram.messenger.m5.k(org.telegram.messenger.np.s1(this.f29679a).J2(j10));
                        }
                        if (un0Var.getTag() != null && mtVar.length() > 0 && N1 > 0) {
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
                    do0 do0Var = this.S1;
                    if (do0Var != null) {
                        i10 = do0Var.f34004e;
                    } else {
                        i10 = 0;
                    }
                    if (this.B2 != null) {
                        int i15 = 0;
                        int i16 = 0;
                        while (i15 < hVar.m()) {
                            long j11 = hVar.j(i15);
                            long N12 = org.telegram.messenger.np.s1(this.f29679a).N1(j11);
                            if (N12 <= 0) {
                                N12 = org.telegram.messenger.m5.k(org.telegram.messenger.np.s1(this.f29679a).J2(j11));
                            }
                            int i17 = i12;
                            if (this.B2 != null && un0Var.getTag() != null && mtVar.length() > 0 && charSequenceArr[i17] != null && N12 > 0) {
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
                        if (this.K1[i10] != null) {
                            for (int i20 = 0; i20 < hVar.m(); i20++) {
                                long j12 = hVar.j(i20);
                                long N13 = org.telegram.messenger.np.s1(this.f29679a).N1(j12);
                                if (N13 <= 0) {
                                    N13 = org.telegram.messenger.m5.k(org.telegram.messenger.np.s1(this.f29679a).J2(j12));
                                }
                                if (un0Var.getTag() != null && mtVar.length() > 0 && N13 > 0) {
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
                t4.Z(this.f29679a, arrayList, i11, new org.telegram.messenger.z10() {
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
                        vn0 vn0Var2;
                        long longValue;
                        String charSequence;
                        long longValue2;
                        Long l11;
                        boolean z14;
                        boolean z15;
                        long j14;
                        String[] strArr;
                        org.telegram.messenger.gj gjVar2;
                        org.telegram.messenger.cz b10;
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
                        po0 po0Var = po0.this;
                        String[] strArr2 = po0Var.K1;
                        vn0 vn0Var3 = po0Var.f38354o1;
                        un0 un0Var2 = po0Var.n1;
                        HashMap hashMap3 = po0Var.R1;
                        Long l14 = 0L;
                        a0.h hVar2 = po0Var.Q1;
                        ArrayList arrayList4 = po0Var.J1;
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
                                    long j16 = hVar2.j(i27);
                                    boolean y22 = org.telegram.messenger.np.s1(po0Var.f29679a).y2(j16);
                                    un0 un0Var3 = un0Var2;
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
                                    if (tL_forumTopic3 != null && y22) {
                                        i26 = i27;
                                        z17 = y22;
                                        j15 = org.telegram.messenger.m5.o(tL_forumTopic3.from_id);
                                    } else {
                                        i26 = i27;
                                        z17 = y22;
                                        j15 = 0;
                                    }
                                    if (tL_forumTopic3 != null && !z17) {
                                        l13 = l14;
                                        arrayList2 = arrayList4;
                                        charSequenceArr2 = charSequenceArr3;
                                        gjVar3 = new org.telegram.messenger.gj(po0Var.f29679a, tL_forumTopic3.topicStartMessage, false, false);
                                    } else {
                                        l13 = l14;
                                        arrayList2 = arrayList4;
                                        charSequenceArr2 = charSequenceArr3;
                                        gjVar3 = null;
                                    }
                                    if (gjVar3 != null) {
                                        gjVar3.f23838p = true;
                                    }
                                    if (un0Var3.getTag() != null && vn0Var3.f39053a.length() > 0) {
                                        CharSequence charSequence4 = charSequenceArr2[0];
                                        if (charSequence4 == null) {
                                            charSequence3 = null;
                                        } else {
                                            charSequence3 = charSequence4.toString();
                                        }
                                        r11 = 0;
                                        gjVar4 = gjVar3;
                                        ArrayList arrayList7 = arrayList5;
                                        org.telegram.messenger.cz b11 = org.telegram.messenger.cz.b(charSequence3, j16, gjVar4, gjVar3, null, true, arrayList7, null, null, z20, 0, 0, null, false);
                                        arrayList3 = arrayList7;
                                        z20 = z20;
                                        if (l15 == null) {
                                            longValue5 = 0;
                                        } else {
                                            longValue5 = l15.longValue();
                                        }
                                        b11.Q = longValue5;
                                        b11.R = j15;
                                        org.telegram.messenger.ez.C(po0Var.f29679a).r0(b11);
                                    } else {
                                        gjVar4 = gjVar3;
                                        arrayList3 = arrayList5;
                                        r11 = 0;
                                    }
                                    org.telegram.messenger.ez C = org.telegram.messenger.ez.C(po0Var.f29679a);
                                    org.telegram.messenger.gj gjVar5 = gjVar4;
                                    ArrayList arrayList8 = po0Var.J1;
                                    boolean z21 = !po0Var.E2;
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
                                        t4.q0(q02, po0Var.f38341b2, r11);
                                        if (q02 != 0) {
                                            z19 = z16;
                                            tL_forumTopic = r11;
                                            break;
                                        }
                                    }
                                    i27 = i26 + 1;
                                    arrayList5 = arrayList3;
                                    z18 = z22;
                                    un0Var2 = un0Var3;
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
                                po0Var.R0(hVar2, size2, tL_forumTopic2, !z19);
                            }
                        } else {
                            boolean z23 = z18;
                            do0 do0Var2 = po0Var.S1;
                            if (do0Var2 != null) {
                                i23 = do0Var2.f34004e;
                            } else {
                                i23 = 0;
                            }
                            if (po0Var.B2 != null) {
                                int i29 = 0;
                                boolean z24 = false;
                                while (i29 < hVar2.m()) {
                                    long j17 = hVar2.j(i29);
                                    boolean y23 = org.telegram.messenger.np.s1(po0Var.f29679a).y2(j17);
                                    if (hashMap2 == null) {
                                        l11 = l14;
                                    } else {
                                        l11 = (Long) hashMap2.get(Long.valueOf(j17));
                                    }
                                    if (l11 != null && l11.longValue() > 0) {
                                        z24 = true;
                                    }
                                    TLRPC.TL_forumTopic tL_forumTopic4 = (TLRPC.TL_forumTopic) hashMap3.get(hVar2.f(j17));
                                    if (tL_forumTopic4 != null && y23) {
                                        z14 = z24;
                                        z15 = y23;
                                        j14 = org.telegram.messenger.m5.o(tL_forumTopic4.from_id);
                                    } else {
                                        z14 = z24;
                                        z15 = y23;
                                        j14 = 0;
                                    }
                                    if (tL_forumTopic4 != null && !z15) {
                                        strArr = strArr2;
                                        gjVar2 = new org.telegram.messenger.gj(po0Var.f29679a, tL_forumTopic4.topicStartMessage, false, false);
                                    } else {
                                        strArr = strArr2;
                                        gjVar2 = null;
                                    }
                                    if (po0Var.B2 == null) {
                                        if (un0Var2.getTag() != null && vn0Var3.f39053a.length() > 0) {
                                            CharSequence charSequence5 = charSequenceArr3[0];
                                            if (charSequence5 == null) {
                                                charSequence2 = null;
                                            } else {
                                                charSequence2 = charSequence5.toString();
                                            }
                                            boolean z25 = z23;
                                            b10 = org.telegram.messenger.cz.b(charSequence2, j17, gjVar2, gjVar2, null, true, arrayList5, null, null, z25, 0, 0, null, false);
                                            z23 = z25;
                                        } else {
                                            b10 = org.telegram.messenger.cz.b(strArr[i23], j17, gjVar2, gjVar2, null, true, null, null, null, z23, 0, 0, null, false);
                                        }
                                    } else {
                                        if (un0Var2.getTag() != null && vn0Var3.f39053a.length() > 0 && charSequenceArr3[0] != null) {
                                            org.telegram.messenger.gj gjVar6 = gjVar2;
                                            gjVar2 = gjVar6;
                                            org.telegram.messenger.ez.C(po0Var.f29679a).r0(org.telegram.messenger.cz.b(charSequenceArr3[0].toString(), j17, null, gjVar6, null, true, null, null, null, z23, 0, 0, null, false));
                                        }
                                        b10 = org.telegram.messenger.cz.b(null, j17, gjVar2, gjVar2, null, true, null, null, null, z23, 0, 0, null, false);
                                        b10.I = po0Var.B2;
                                    }
                                    if (l11 == null) {
                                        longValue3 = 0;
                                    } else {
                                        longValue3 = l11.longValue();
                                    }
                                    b10.Q = longValue3;
                                    b10.R = j14;
                                    org.telegram.messenger.ez.C(po0Var.f29679a).r0(b10);
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
                                    boolean y24 = org.telegram.messenger.np.s1(po0Var.f29679a).y2(j18);
                                    if (hashMap2 == null) {
                                        l10 = l14;
                                    } else {
                                        l10 = (Long) hashMap2.get(Long.valueOf(j18));
                                    }
                                    if (l10 != null && l10.longValue() > 0) {
                                        z26 = true;
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
                                        z13 = z26;
                                        c10 = 0;
                                        gjVar = new org.telegram.messenger.gj(po0Var.f29679a, tL_forumTopic5.topicStartMessage, false, false);
                                    } else {
                                        z13 = z26;
                                        c10 = 0;
                                        gjVar = null;
                                    }
                                    if (un0Var2.getTag() != null && vn0Var3.f39053a.length() > 0) {
                                        CharSequence charSequence6 = charSequenceArr3[c10];
                                        if (charSequence6 == null) {
                                            charSequence = null;
                                        } else {
                                            charSequence = charSequence6.toString();
                                        }
                                        boolean z27 = z23;
                                        org.telegram.messenger.cz b12 = org.telegram.messenger.cz.b(charSequence, j18, gjVar, gjVar, null, true, arrayList5, null, null, z27, 0, 0, null, false);
                                        z23 = z27;
                                        if (l10 == null) {
                                            vn0Var2 = vn0Var3;
                                            longValue2 = 0;
                                        } else {
                                            vn0Var2 = vn0Var3;
                                            longValue2 = l10.longValue();
                                        }
                                        b12.Q = longValue2;
                                        b12.R = j13;
                                        org.telegram.messenger.ez.C(po0Var.f29679a).r0(b12);
                                    } else {
                                        vn0Var2 = vn0Var3;
                                    }
                                    org.telegram.messenger.gj gjVar7 = gjVar;
                                    org.telegram.messenger.cz b13 = org.telegram.messenger.cz.b(strArr2[i23], j18, gjVar7, gjVar7, null, true, null, null, null, z23, 0, 0, null, false);
                                    if (l10 == null) {
                                        longValue = 0;
                                    } else {
                                        longValue = l10.longValue();
                                    }
                                    b13.Q = longValue;
                                    b13.R = j13;
                                    org.telegram.messenger.ez.C(po0Var.f29679a).r0(b13);
                                    i30 = i25 + 1;
                                    vn0Var3 = vn0Var2;
                                    hashMap2 = hashMap;
                                    z26 = z13;
                                }
                                z12 = z26;
                            } else {
                                i24 = 0;
                                z12 = false;
                                po0Var.R0(hVar2, 1, (TLRPC.TL_forumTopic) hashMap3.get(hVar2.n(i24)), !z12);
                            }
                            i24 = 0;
                            po0Var.R0(hVar2, 1, (TLRPC.TL_forumTopic) hashMap3.get(hVar2.n(i24)), !z12);
                        }
                        fo0 fo0Var = po0Var.f38355o2;
                        if (fo0Var != null) {
                            fo0Var.W();
                        }
                        po0Var.dismiss();
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
        int i7;
        un0 un0Var = this.n1;
        if (un0Var.getTag() != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 == z11) {
            return;
        }
        AnimatorSet animatorSet = this.f38376z1;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z10) {
            num = 1;
        } else {
            num = null;
        }
        un0Var.setTag(num);
        vn0 vn0Var = this.f38354o1;
        if (vn0Var.getEditText().isFocused()) {
            org.telegram.messenger.g0.v1(vn0Var.getEditText());
        }
        vn0Var.k(true);
        FrameLayout frameLayout = this.Y1;
        un0 un0Var2 = this.f38358q1;
        FrameLayout frameLayout2 = this.f38360r1;
        if (z10) {
            un0Var.setVisibility(0);
            if (frameLayout != null && frameLayout2 == null) {
                frameLayout.setVisibility(0);
            }
            un0Var2.setVisibility(0);
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
            WeakHashMap weakHashMap = r0.i0.f55671a;
            frameLayout2.setImportantForAccessibility(i7);
        }
        LinearLayout linearLayout = this.f38374y1;
        if (linearLayout != null) {
            if (!z10) {
                i10 = 1;
            }
            WeakHashMap weakHashMap2 = r0.i0.f55671a;
            linearLayout.setImportantForAccessibility(i10);
        }
        this.f38376z1 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        float f15 = 0.0f;
        float f16 = 1.0f;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(un0Var, property, f10));
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
        arrayList.add(ObjectAnimator.ofFloat(un0Var2, property2, f11));
        Property property3 = View.SCALE_Y;
        if (z10) {
            f17 = 1.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(un0Var2, property3, f17));
        if (z10) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(un0Var2, property, f12));
        if (frameLayout2 == null || frameLayout2.getVisibility() != 0) {
            View view = this.O1[1];
            if (!z10) {
                f16 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(view, property, f16));
        }
        FrameLayout frameLayout3 = this.f38366u1;
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
        this.f38376z1.playTogether(arrayList);
        this.f38376z1.setInterpolator(new DecelerateInterpolator());
        this.f38376z1.setDuration(180L);
        this.f38376z1.addListener(new ao0(this, z10, 1));
        this.f38376z1.start();
    }

    public final void Y0(long j3, View view) {
        String str;
        xb K;
        int i7 = -this.D2;
        this.D2 = i7;
        org.telegram.messenger.g0.F3(i7, view, null);
        org.telegram.messenger.p2.APP_ERROR.a();
        if (j3 >= 0) {
            str = org.telegram.messenger.q10.p(org.telegram.messenger.np.s1(this.f29679a).a2(Long.valueOf(j3)));
        } else {
            str = "";
        }
        boolean D3 = org.telegram.messenger.np.s1(this.f29679a).D3();
        FrameLayout frameLayout = this.f38370w1;
        if (D3) {
            K = new cc(frameLayout, this.J0).Q(2131624217, 36, org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131743760, str)));
        } else {
            K = new cc(frameLayout, this.J0).K(2131624217, org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131743760, str)), org.telegram.messenger.hd.M0(2131743759, null), new mn0(this, 1));
        }
        K.j();
    }

    public final void Z0() {
        org.telegram.ui.ActionBar.i1 i1Var;
        un0 un0Var = this.n1;
        if (un0Var == null) {
            return;
        }
        vn0 vn0Var = this.f38354o1;
        if (vn0Var != null && vn0Var.m()) {
            vn0Var.getEmojiPaddingShown();
        } else {
            co0 co0Var = this.f38377z2;
            if (co0Var != null && (i1Var = co0Var.I) != null && !i1Var.f28649f) {
                org.telegram.messenger.g0.L(20.0f);
            }
        }
        float f10 = 0.0f;
        FrameLayout frameLayout = this.Y1;
        if (frameLayout != null) {
            frameLayout.setTranslationY(-0.0f);
            f10 = 0.0f + org.telegram.messenger.g0.L(48.0f);
        }
        FrameLayout frameLayout2 = this.f38360r1;
        if (frameLayout2 != null) {
            frameLayout2.setTranslationY(-f10);
        }
        float f11 = -f10;
        un0Var.setTranslationY(f11);
        this.f38358q1.setTranslationY(f11);
    }

    public final void a1() {
        org.telegram.ui.ActionBar.j5 j5Var = this.f38368v1;
        if (j5Var != null) {
            String O0 = O0();
            if (O0.startsWith("https://")) {
                O0 = O0.substring(8);
            } else if (O0.startsWith("http://")) {
                O0 = O0.substring(7);
            }
            j5Var.l(O0, false);
        }
    }

    public final void b1(int i7) {
        int size;
        boolean z10;
        boolean z11;
        a0.h hVar = this.Q1;
        if (hVar.m() == 0) {
            X0(false);
            return;
        }
        ArrayList arrayList = this.J1;
        if (arrayList == null) {
            size = 1;
        } else {
            size = arrayList.size();
        }
        Object tag = this.n1.getTag();
        vn0 vn0Var = this.f38354o1;
        if (tag != null && vn0Var.f39053a.length() > 0) {
            size++;
        }
        long j3 = 0;
        for (int i10 = 0; i10 < hVar.m(); i10++) {
            long j10 = ((TLRPC.Dialog) hVar.n(i10)).f28055id;
            long N1 = org.telegram.messenger.np.s1(this.f29679a).N1(j10);
            if (N1 <= 0) {
                N1 = org.telegram.messenger.m5.k(org.telegram.messenger.np.s1(this.f29679a).J2(j10));
            }
            j3 += N1;
        }
        int max = Math.max(1, hVar.m());
        if (i7 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        oi.u1 u1Var = this.f38356p1;
        u1Var.e(max, z10);
        if (i7 != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        u1Var.i(size, j3, z11);
        X0(true);
        vn0Var.setPadding(0, 0, Math.max(org.telegram.messenger.g0.L(84.0f), u1Var.l()), 0);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = org.telegram.messenger.ns.f25567s;
        if (i7 == i11) {
            io0 io0Var = this.G1;
            if (io0Var != null) {
                io0Var.E();
            }
            org.telegram.messenger.ns.f(this.f29679a).n(this, i11);
        }
    }

    @Override
    public final void dismiss() {
        vn0 vn0Var = this.f38354o1;
        if (vn0Var != null) {
            org.telegram.messenger.g0.v1(vn0Var.getEditText());
        }
        this.U1 = false;
        super.dismiss();
        org.telegram.messenger.ns.f(this.f29679a).n(this, org.telegram.messenger.ns.f25567s);
    }

    @Override
    public final void onBackPressed() {
        if (this.f38375y2 != null) {
            L0();
            return;
        }
        vn0 vn0Var = this.f38354o1;
        if (vn0Var != null && vn0Var.f39056e) {
            vn0Var.k(true);
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
                cVar.a(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28849d6, this.J0));
            }
            org.telegram.ui.ActionBar.k2 k2Var = this.f29685c;
            if (k2Var != null) {
                if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28922h5, this.J0)) > 0.721f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 != this.T2) {
                    this.T2 = z10;
                    org.telegram.messenger.g0.o3(k2Var, z10);
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public po0(Context context, ArrayList arrayList, String str, String str2, boolean z10, String str3, String str4, boolean z11) {
        this(context, null, arrayList, str, str2, z10, str3, str4, false, z11, false, null, null);
    }

    public po0(android.content.Context r39, org.telegram.ui.an r40, java.util.ArrayList r41, java.lang.String r42, java.lang.String r43, boolean r44, java.lang.String r45, java.lang.String r46, boolean r47, boolean r48, boolean r49, java.lang.Integer r50, org.telegram.ui.ActionBar.e6 r51) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.po0.<init>(android.content.Context, org.telegram.ui.an, java.util.ArrayList, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, boolean, boolean, boolean, java.lang.Integer, org.telegram.ui.ActionBar.e6):void");
    }

    public void S0(View view) {
    }

    public void R0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
    }
}
