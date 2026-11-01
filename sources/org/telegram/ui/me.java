package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class me implements Runnable {
    public final int f39515a;
    public final un f39516b;

    public me(un unVar, int i10) {
        this.f39515a = i10;
        this.f39516b = unVar;
    }

    @Override
    public final void run() {
        mk mkVar;
        int i10;
        float f7;
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.messenger.kj messageObject;
        int i11;
        float f10;
        float f11;
        boolean z10;
        int i12 = this.f39515a;
        TLRPC.ChatTheme chatTheme = null;
        int i13 = 0;
        ?? r15 = 1;
        un unVar = this.f39516b;
        switch (i12) {
            case 0:
                unVar.f42009b6 = null;
                if (unVar.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, unVar.getParentActivity(), unVar.f42288xa);
                    boolean T = org.telegram.messenger.w3.T(unVar.e);
                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
                    if (T && !unVar.e.megagroup) {
                        x1Var.T = org.telegram.messenger.dd.L0(2131749095, null);
                        x1Var.R = org.telegram.messenger.dd.L0(2131749094, null);
                    } else {
                        x1Var.T = org.telegram.messenger.dd.L0(2131749093, null);
                        x1Var.R = org.telegram.messenger.dd.L0(2131749092, null);
                    }
                    alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131749091, null), new re(unVar, 2));
                    alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), new re(unVar, 3));
                    unVar.showDialog(x1Var);
                    return;
                }
                return;
            case 1:
                unVar.k7();
                return;
            case 2:
                un.k0(unVar);
                return;
            case 3:
                unVar.Ja(null, unVar.G8);
                unVar.G8 = null;
                return;
            case 4:
                if (!org.telegram.ui.ActionBar.k2.hasSheets(unVar) && (mkVar = unVar.Z) != null) {
                    mkVar.setFieldFocused(true);
                    unVar.Z.F0();
                    return;
                }
                return;
            case 5:
                unVar.ud();
                unVar.F9();
                org.telegram.messenger.i0.d0(unVar.f42303z0, new ze(unVar, 5));
                unVar.G7();
                dk dkVar = unVar.f42130l3;
                if (dkVar != null) {
                    dkVar.setTranslationX(unVar.i9() / 2.0f);
                }
                ck ckVar = unVar.f42141m3;
                if (ckVar != null) {
                    ckVar.setTranslationX(unVar.i9() / 2.0f);
                }
                FrameLayout frameLayout = unVar.f42044e1;
                if (frameLayout != null) {
                    frameLayout.setTranslationX(unVar.i9() / 2.0f);
                }
                unVar.e7();
                unVar.F7();
                return;
            case 6:
                ja1 f02 = ja1.f0(-unVar.f42108j6, 0L);
                f02.D = unVar;
                unVar.presentFragment(f02);
                return;
            case 7:
                unVar.zc(true);
                return;
            case 8:
                unVar.f42279x1.d(true);
                return;
            case 9:
                unVar.getNotificationCenter().j(unVar.Y9);
                return;
            case 10:
                int childCount = unVar.f42303z0.getChildCount();
                while (i13 < childCount) {
                    View childAt = unVar.f42303z0.getChildAt(i13);
                    if (childAt instanceof org.telegram.ui.Cells.q1) {
                        org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) childAt;
                        if (q1Var2.getMessageObject().D == 4) {
                            q1Var2.E1();
                        }
                    }
                    i13++;
                }
                return;
            case 11:
                unVar.Xb = true;
                unVar.Wc(true);
                return;
            case 12:
                dl dlVar = unVar.xb;
                if (dlVar != null) {
                    dlVar.requestLayout();
                    return;
                }
                return;
            case 13:
                un.c1(unVar);
                return;
            case 14:
                TLRPC.UserFull userFull = unVar.f42196q8;
                if (userFull != null) {
                    chatTheme = userFull.theme;
                }
                unVar.Fb(chatTheme);
                return;
            case 15:
                un.V0(unVar);
                return;
            case 16:
                unVar.f42011b8 = Integer.MAX_VALUE;
                unVar.f42038d8 = false;
                unVar.f42050e8 = 0L;
                unVar.f42062f8 = null;
                unVar.f42075g8 = null;
                unVar.f42086h8 = null;
                unVar.f42098i8 = -1;
                unVar.f42025c8 = false;
                unVar.xd(false);
                unVar.f42123k8 = null;
                return;
            case 17:
                unVar.Tb(false, true);
                return;
            case 18:
                nf nfVar = new nf(unVar, 8);
                if (org.telegram.utils.twidget.p.x()) {
                    nfVar.run();
                    return;
                }
                org.telegram.ui.Components.ew ewVar = new org.telegram.ui.Components.ew(nfVar, 20);
                org.telegram.utils.twidget.p.h.add(ewVar);
                org.telegram.messenger.i0.h3(ewVar, 150L);
                return;
            case 19:
                un.R0(unVar);
                return;
            case 20:
                unVar.l7();
                return;
            case 21:
                unVar.Z.F0();
                return;
            case 22:
                un unVar2 = this.f39516b;
                int i14 = unVar2.Mb;
                if (i14 != 0) {
                    unVar2.l(i14, unVar2.Nb, unVar2.Ob, unVar2.Pb, unVar2.Qb, unVar2.Rb);
                    unVar2.Mb = 0;
                    return;
                }
                return;
            case 23:
                if (!unVar.f42306z3 && unVar.f42303z0 != null && unVar.getParentActivity() != null && unVar.fragmentView != null) {
                    org.telegram.ui.Components.hp hpVar = unVar.J2;
                    if (hpVar == null || hpVar.getTag() == null) {
                        if (unVar.J2 == null) {
                            km kmVar = unVar.l1;
                            int indexOfChild = kmVar.indexOfChild(unVar.T);
                            if (indexOfChild != -1) {
                                f7 = 24.0f;
                                Activity parentActivity = unVar.getParentActivity();
                                sn snVar = unVar.f42288xa;
                                ?? frameLayout2 = new FrameLayout(parentActivity);
                                frameLayout2.f26899a = new TextView[2];
                                frameLayout2.f26900b = new org.telegram.ui.Components.fi0[2];
                                FrameLayout frameLayout3 = new FrameLayout(parentActivity);
                                frameLayout3.setBackground(org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(6.0f), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20957eg, snVar)));
                                frameLayout3.setPadding(org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f));
                                frameLayout2.addView(frameLayout3, w7.b6.d(-2, -2.0f, 51, 0.0f, 0.0f, 0.0f, 6.0f));
                                int i15 = 0;
                                while (i15 < 2) {
                                    frameLayout2.f26900b[i15] = new ImageView(parentActivity);
                                    frameLayout2.f26900b[i15].setScaleType(ImageView.ScaleType.CENTER);
                                    org.telegram.ui.Components.fi0 fi0Var = frameLayout2.f26900b[i15];
                                    if (i15 == 0) {
                                        f10 = 0.0f;
                                    } else {
                                        f10 = 24.0f;
                                    }
                                    frameLayout3.addView(fi0Var, w7.b6.d(24, 24.0f, 51, 0.0f, f10, 0.0f, 0.0f));
                                    frameLayout2.f26899a[i15] = new TextView(parentActivity);
                                    org.telegram.ui.ActionBar.a7.V(frameLayout2.f26899a[i15], org.telegram.ui.ActionBar.t6.f20940dg, snVar);
                                    frameLayout2.f26899a[i15].setTextSize(r15, 14.0f);
                                    frameLayout2.f26899a[i15].setMaxLines(r15);
                                    frameLayout2.f26899a[i15].setSingleLine(r15);
                                    frameLayout2.f26899a[i15].setMaxWidth(org.telegram.messenger.i0.L(250.0f));
                                    frameLayout2.f26899a[i15].setGravity(51);
                                    frameLayout2.f26899a[i15].setPivotX(0.0f);
                                    TextView textView = frameLayout2.f26899a[i15];
                                    if (i15 == 0) {
                                        f11 = 2.0f;
                                    } else {
                                        f11 = 26.0f;
                                    }
                                    frameLayout3.addView(textView, w7.b6.d(-2, -2.0f, 51, 32.0f, f11, 10.0f, 0.0f));
                                    if (i15 == 0) {
                                        z10 = r15;
                                        frameLayout2.f26900b[i15].f(2131624288, 24, 24, null);
                                        frameLayout2.f26899a[i15].setText(org.telegram.messenger.dd.L0(2131749307, null));
                                    } else {
                                        z10 = r15;
                                        frameLayout2.f26900b[i15].f(2131624287, 24, 24, null);
                                        frameLayout2.f26899a[i15].setText(org.telegram.messenger.dd.L0(2131749308, null));
                                    }
                                    frameLayout2.f26900b[i15].d();
                                    i15++;
                                    r15 = z10;
                                }
                                i10 = r15;
                                ImageView imageView = new ImageView(parentActivity);
                                frameLayout2.f26901c = imageView;
                                imageView.setImageResource(2131232780);
                                org.telegram.ui.ActionBar.a7.t(imageView, org.telegram.ui.ActionBar.t6.f20957eg, snVar, PorterDuff.Mode.MULTIPLY);
                                frameLayout2.addView(imageView, w7.b6.d(14, 6.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
                                unVar.J2 = frameLayout2;
                                kmVar.addView((View) frameLayout2, indexOfChild + 1, w7.b6.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                                unVar.J2.setAlpha(0.0f);
                                unVar.J2.setVisibility(4);
                            } else {
                                return;
                            }
                        } else {
                            i10 = 1;
                            f7 = 24.0f;
                        }
                        int childCount2 = unVar.f42303z0.getChildCount();
                        for (int i16 = 0; i16 < childCount2; i16++) {
                            View childAt2 = unVar.f42303z0.getChildAt(i16);
                            if ((childAt2 instanceof org.telegram.ui.Cells.q1) && (messageObject = (q1Var = (org.telegram.ui.Cells.q1) childAt2).getMessageObject()) != null && messageObject.P3() && messageObject.q4()) {
                                org.telegram.ui.Components.hp hpVar2 = unVar.J2;
                                ImageView imageView2 = hpVar2.f26901c;
                                org.telegram.ui.Components.ho hoVar = hpVar2.e;
                                if (hoVar != null) {
                                    org.telegram.messenger.i0.r(hoVar);
                                    hpVar2.e = null;
                                }
                                int[] iArr = new int[2];
                                q1Var.getLocationInWindow(iArr);
                                int i17 = iArr[i10];
                                ((View) hpVar2.getParent()).getLocationInWindow(iArr);
                                int i18 = i17 - iArr[i10];
                                View view = (View) q1Var.getParent();
                                hpVar2.measure(View.MeasureSpec.makeMeasureSpec(1000, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(1000, Integer.MIN_VALUE));
                                if (i18 > org.telegram.messenger.i0.L(10.0f) + hpVar2.getMeasuredHeight()) {
                                    int C = org.telegram.messenger.m5.C(6.0f, q1Var.getChecksY(), i18);
                                    int L = org.telegram.messenger.i0.L(5.0f) + q1Var.getChecksX();
                                    int measuredWidth = view.getMeasuredWidth();
                                    float measuredHeight = C - hpVar2.getMeasuredHeight();
                                    hpVar2.f26902f = measuredHeight;
                                    hpVar2.setTranslationY(measuredHeight);
                                    int left = q1Var.getLeft() + L;
                                    int L2 = org.telegram.messenger.i0.L(15.0f);
                                    if (left > view.getMeasuredWidth() / 2) {
                                        int measuredWidth2 = (measuredWidth - hpVar2.getMeasuredWidth()) - org.telegram.messenger.i0.L(20.0f);
                                        hpVar2.setTranslationX(measuredWidth2);
                                        L2 += measuredWidth2;
                                    } else {
                                        hpVar2.setTranslationX(0.0f);
                                    }
                                    float left2 = ((q1Var.getLeft() + L) - L2) - (imageView2.getMeasuredWidth() / 2);
                                    imageView2.setTranslationX(left2);
                                    if (left > view.getMeasuredWidth() / 2) {
                                        if (left2 < org.telegram.messenger.i0.L(10.0f)) {
                                            float L3 = left2 - org.telegram.messenger.i0.L(10.0f);
                                            hpVar2.setTranslationX(hpVar2.getTranslationX() + L3);
                                            imageView2.setTranslationX(left2 - L3);
                                        }
                                    } else if (left2 > hpVar2.getMeasuredWidth() - org.telegram.messenger.i0.L(f7)) {
                                        float measuredWidth3 = (left2 - hpVar2.getMeasuredWidth()) + org.telegram.messenger.i0.L(f7);
                                        hpVar2.setTranslationX(measuredWidth3);
                                        imageView2.setTranslationX(left2 - measuredWidth3);
                                    } else if (left2 < org.telegram.messenger.i0.L(10.0f)) {
                                        float L4 = left2 - org.telegram.messenger.i0.L(10.0f);
                                        hpVar2.setTranslationX(hpVar2.getTranslationX() + L4);
                                        imageView2.setTranslationX(left2 - L4);
                                    }
                                    hpVar2.setPivotX(left2);
                                    hpVar2.setPivotY(hpVar2.getMeasuredHeight());
                                    AnimatorSet animatorSet = hpVar2.d;
                                    if (animatorSet != null) {
                                        animatorSet.cancel();
                                        hpVar2.d = null;
                                    }
                                    hpVar2.setTag(Integer.valueOf(i10));
                                    hpVar2.setVisibility(0);
                                    AnimatorSet animatorSet2 = new AnimatorSet();
                                    hpVar2.d = animatorSet2;
                                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(hpVar2, View.ALPHA, 0.0f, 1.0f);
                                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(hpVar2, View.SCALE_X, 0.0f, 1.0f);
                                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(hpVar2, View.SCALE_Y, 0.0f, 1.0f);
                                    Animator[] animatorArr = new Animator[3];
                                    animatorArr[0] = ofFloat;
                                    animatorArr[i10] = ofFloat2;
                                    animatorArr[2] = ofFloat3;
                                    animatorSet2.playTogether(animatorArr);
                                    hpVar2.d.addListener(new org.telegram.ui.Components.gp(hpVar2, 0));
                                    hpVar2.d.setDuration(180L);
                                    hpVar2.d.start();
                                    while (i13 < 2) {
                                        ViewPropertyAnimator interpolator = hpVar2.f26899a[i13].animate().scaleX(1.04f).scaleY(1.04f).setInterpolator(org.telegram.ui.Components.gr.f26525i);
                                        if (i13 == 0) {
                                            i11 = 132;
                                        } else {
                                            i11 = 500;
                                        }
                                        interpolator.setStartDelay(i11 + 140).setDuration(100L).setListener(new bi.d5(hpVar2, i13, 7)).start();
                                        i13++;
                                    }
                                    unVar.getMessagesController().h4(0L, "NEWCOMER_TICKS");
                                    return;
                                }
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            case 24:
                un.B0(unVar);
                return;
            case 25:
                mk mkVar2 = unVar.Z;
                if (mkVar2 != null && unVar.Kb != 5) {
                    mkVar2.F0();
                    return;
                }
                return;
            case 26:
                org.telegram.ui.Components.io ioVar = ((org.telegram.ui.Components.io[]) unVar.f42003b0.f10085b)[0];
                org.telegram.ui.ActionBar.u5 u5Var = ioVar.d;
                org.telegram.ui.ActionBar.u5 u5Var2 = ioVar.e;
                unVar.T1 = !unVar.T1;
                u5Var.setPivotX(0.0f);
                u5Var2.setPivotX(0.0f);
                if (unVar.T1) {
                    u5Var.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                    u5Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                } else {
                    u5Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                    u5Var2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                }
                org.telegram.messenger.i0.h3(unVar.U1, 6000L);
                return;
            case 27:
                org.telegram.messenger.i0.d0(unVar.f42303z0, new ag.z0(10));
                fm fmVar = unVar.C0;
                if (fmVar != null) {
                    fmVar.O(true);
                    return;
                }
                return;
            case 28:
                org.telegram.messenger.i0.d0(unVar.f42303z0, new ag.z0(9));
                fm fmVar2 = unVar.C0;
                if (fmVar2 != null) {
                    fmVar2.O(false);
                    return;
                }
                return;
            default:
                unVar.M7(true);
                return;
        }
    }
}
