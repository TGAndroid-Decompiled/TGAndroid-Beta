package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class qe implements Runnable {
    public final int f39702a;
    public final yn f39703b;

    public qe(yn ynVar, int i10) {
        this.f39702a = i10;
        this.f39703b = ynVar;
    }

    @Override
    public final void run() {
        jk jkVar;
        org.telegram.ui.Cells.u1 u1Var;
        MessageObject messageObject;
        int i10;
        int i11 = this.f39702a;
        TLRPC.ChatTheme chatTheme = null;
        int i12 = 0;
        char c10 = 1;
        yn ynVar = this.f39703b;
        switch (i11) {
            case 0:
                ynVar.Y6();
                return;
            case 1:
                yn.l0(ynVar);
                return;
            case 2:
                ynVar.na(null, ynVar.f43468q8);
                ynVar.f43468q8 = null;
                return;
            case 3:
                ynVar.ub(false, true);
                return;
            case 4:
                if (!org.telegram.ui.ActionBar.n2.hasSheets(ynVar) && (jkVar = ynVar.W) != null) {
                    jkVar.setFieldFocused(true);
                    ynVar.W.H0();
                    return;
                }
                return;
            case 5:
                ynVar.getNotificationCenter().onAnimationFinish(ynVar.D9);
                return;
            case 6:
                ynVar.o9();
                AndroidUtilities.forEachViews((RecyclerView) ynVar.f43526v0, (Utilities.Callback<View>) new xe(ynVar, 6));
                ynVar.u7();
                ak akVar = ynVar.V2;
                if (akVar != null) {
                    akVar.setTranslationX(ynVar.S8() / 2.0f);
                }
                zj zjVar = ynVar.W2;
                if (zjVar != null) {
                    zjVar.setTranslationX(ynVar.S8() / 2.0f);
                }
                FrameLayout frameLayout = ynVar.O0;
                if (frameLayout != null) {
                    frameLayout.setTranslationX(ynVar.S8() / 2.0f);
                }
                ynVar.S6();
                ynVar.t7();
                return;
            case 7:
                ue1 Z = ue1.Z(-ynVar.R5, 0L);
                Z.f41165y = ynVar;
                ynVar.presentFragment(Z);
                return;
            case 8:
                ynVar.f43353h1.d(true);
                return;
            case 9:
                yn.B0(ynVar);
                return;
            case 10:
                int childCount = ynVar.f43526v0.getChildCount();
                while (i12 < childCount) {
                    View childAt = ynVar.f43526v0.getChildAt(i12);
                    if (childAt instanceof org.telegram.ui.Cells.u1) {
                        org.telegram.ui.Cells.u1 u1Var2 = (org.telegram.ui.Cells.u1) childAt;
                        if (u1Var2.getMessageObject().type == 4) {
                            u1Var2.t2();
                        }
                    }
                    i12++;
                }
                return;
            case 11:
                ynVar.f43575yb = true;
                ynVar.wc(true);
                return;
            case 12:
                al alVar = ynVar.Ya;
                if (alVar != null) {
                    alVar.requestLayout();
                    return;
                }
                return;
            case 13:
                ynVar.resumeDelayedFragmentAnimation();
                kk kkVar = ynVar.U9;
                AndroidUtilities.cancelRunOnUIThread(kkVar);
                kkVar.run();
                ynVar.getNotificationCenter().runDelayedNotifications();
                return;
            case 14:
                TLRPC.UserFull userFull = ynVar.Y7;
                if (userFull != null) {
                    chatTheme = userFull.theme;
                }
                ynVar.hb(chatTheme);
                return;
            case 15:
                yn.n1(ynVar);
                return;
            case 16:
                ynVar.J7 = Integer.MAX_VALUE;
                ynVar.L7 = false;
                ynVar.M7 = 0L;
                ynVar.N7 = null;
                ynVar.O7 = null;
                ynVar.P7 = null;
                ynVar.Q7 = -1;
                ynVar.K7 = false;
                ynVar.Vc(false);
                ynVar.S7 = null;
                return;
            case 17:
                ynVar.ac(true);
                return;
            case 18:
                ynVar.Z6();
                return;
            case 19:
                ynVar.W.H0();
                return;
            case 20:
                AndroidUtilities.forEachViews((RecyclerView) ynVar.f43526v0, (Utilities.Callback<View>) new ai.i(11));
                jm jmVar = ynVar.f43565y0;
                if (jmVar != null) {
                    jmVar.O(true);
                    return;
                }
                return;
            case 21:
                yn ynVar2 = this.f39703b;
                int i13 = ynVar2.nb;
                if (i13 != 0) {
                    ynVar2.D(i13, ynVar2.f43447ob, ynVar2.f43471qb, ynVar2.f43499sb, ynVar2.f43459pb, ynVar2.f43485rb);
                    ynVar2.nb = 0;
                    return;
                }
                return;
            case 22:
                if (!ynVar.j3 && ynVar.f43526v0 != null && ynVar.getParentActivity() != null && ynVar.fragmentView != null) {
                    org.telegram.ui.Components.tp tpVar = ynVar.f43503t2;
                    if (tpVar == null || tpVar.getTag() == null) {
                        if (ynVar.f43503t2 == null) {
                            qm qmVar = ynVar.V0;
                            int indexOfChild = qmVar.indexOfChild(ynVar.Q);
                            if (indexOfChild != -1) {
                                org.telegram.ui.Components.tp tpVar2 = new org.telegram.ui.Components.tp(ynVar.getParentActivity(), ynVar.f43300ca);
                                ynVar.f43503t2 = tpVar2;
                                qmVar.addView(tpVar2, indexOfChild + 1, w7.z5.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                                ynVar.f43503t2.setAlpha(0.0f);
                                ynVar.f43503t2.setVisibility(4);
                            } else {
                                return;
                            }
                        }
                        int childCount2 = ynVar.f43526v0.getChildCount();
                        int i14 = 0;
                        while (i14 < childCount2) {
                            View childAt2 = ynVar.f43526v0.getChildAt(i14);
                            if ((childAt2 instanceof org.telegram.ui.Cells.u1) && (messageObject = (u1Var = (org.telegram.ui.Cells.u1) childAt2).getMessageObject()) != null && messageObject.isOutOwner() && messageObject.isSent()) {
                                org.telegram.ui.Components.tp tpVar3 = ynVar.f43503t2;
                                ImageView imageView = tpVar3.f31133c;
                                org.telegram.ui.Components.qg qgVar = tpVar3.f31134e;
                                if (qgVar != null) {
                                    AndroidUtilities.cancelRunOnUIThread(qgVar);
                                    tpVar3.f31134e = null;
                                }
                                int[] iArr = new int[2];
                                u1Var.getLocationInWindow(iArr);
                                int i15 = iArr[c10];
                                ((View) tpVar3.getParent()).getLocationInWindow(iArr);
                                int i16 = i15 - iArr[1];
                                View view = (View) u1Var.getParent();
                                tpVar3.measure(View.MeasureSpec.makeMeasureSpec(1000, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(1000, Integer.MIN_VALUE));
                                if (i16 > AndroidUtilities.dp(10.0f) + tpVar3.getMeasuredHeight()) {
                                    int C = org.telegram.messenger.f0.C(6.0f, u1Var.getChecksY(), i16);
                                    int dp = AndroidUtilities.dp(5.0f) + u1Var.getChecksX();
                                    int measuredWidth = view.getMeasuredWidth();
                                    float measuredHeight = C - tpVar3.getMeasuredHeight();
                                    tpVar3.f31135f = measuredHeight;
                                    tpVar3.setTranslationY(measuredHeight);
                                    int left = u1Var.getLeft() + dp;
                                    int dp2 = AndroidUtilities.dp(15.0f);
                                    if (left > view.getMeasuredWidth() / 2) {
                                        int measuredWidth2 = (measuredWidth - tpVar3.getMeasuredWidth()) - AndroidUtilities.dp(20.0f);
                                        tpVar3.setTranslationX(measuredWidth2);
                                        dp2 += measuredWidth2;
                                    } else {
                                        tpVar3.setTranslationX(0.0f);
                                    }
                                    float left2 = ((u1Var.getLeft() + dp) - dp2) - (imageView.getMeasuredWidth() / 2);
                                    imageView.setTranslationX(left2);
                                    if (left > view.getMeasuredWidth() / 2) {
                                        if (left2 < AndroidUtilities.dp(10.0f)) {
                                            float dp3 = left2 - AndroidUtilities.dp(10.0f);
                                            tpVar3.setTranslationX(tpVar3.getTranslationX() + dp3);
                                            imageView.setTranslationX(left2 - dp3);
                                        }
                                    } else if (left2 > tpVar3.getMeasuredWidth() - AndroidUtilities.dp(24.0f)) {
                                        float measuredWidth3 = (left2 - tpVar3.getMeasuredWidth()) + AndroidUtilities.dp(24.0f);
                                        tpVar3.setTranslationX(measuredWidth3);
                                        imageView.setTranslationX(left2 - measuredWidth3);
                                    } else if (left2 < AndroidUtilities.dp(10.0f)) {
                                        float dp4 = left2 - AndroidUtilities.dp(10.0f);
                                        tpVar3.setTranslationX(tpVar3.getTranslationX() + dp4);
                                        imageView.setTranslationX(left2 - dp4);
                                    }
                                    tpVar3.setPivotX(left2);
                                    tpVar3.setPivotY(tpVar3.getMeasuredHeight());
                                    AnimatorSet animatorSet = tpVar3.d;
                                    if (animatorSet != null) {
                                        animatorSet.cancel();
                                        tpVar3.d = null;
                                    }
                                    tpVar3.setTag(1);
                                    tpVar3.setVisibility(0);
                                    AnimatorSet animatorSet2 = new AnimatorSet();
                                    tpVar3.d = animatorSet2;
                                    animatorSet2.playTogether(ObjectAnimator.ofFloat(tpVar3, View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(tpVar3, View.SCALE_X, 0.0f, 1.0f), ObjectAnimator.ofFloat(tpVar3, View.SCALE_Y, 0.0f, 1.0f));
                                    tpVar3.d.addListener(new org.telegram.ui.Components.sp(tpVar3, 0));
                                    tpVar3.d.setDuration(180L);
                                    tpVar3.d.start();
                                    while (i12 < 2) {
                                        ViewPropertyAnimator interpolator = tpVar3.f31131a[i12].animate().scaleX(1.04f).scaleY(1.04f).setInterpolator(org.telegram.ui.Components.tr.f31143i);
                                        if (i12 == 0) {
                                            i10 = 132;
                                        } else {
                                            i10 = 500;
                                        }
                                        interpolator.setStartDelay(i10 + 140).setDuration(100L).setListener(new ei.w2(tpVar3, i12, 6)).start();
                                        i12++;
                                    }
                                    ynVar.getMessagesController().removeSuggestion(0L, "NEWCOMER_TICKS");
                                    return;
                                }
                            }
                            i14++;
                            c10 = 1;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 23:
                yn.w0(ynVar);
                return;
            case 24:
                AndroidUtilities.forEachViews((RecyclerView) ynVar.f43526v0, (Utilities.Callback<View>) new ai.i(10));
                jm jmVar2 = ynVar.f43565y0;
                if (jmVar2 != null) {
                    jmVar2.O(false);
                    return;
                }
                return;
            case 25:
                jk jkVar2 = ynVar.W;
                if (jkVar2 != null && ynVar.f43411lb != 5) {
                    jkVar2.H0();
                    return;
                }
                return;
            case 26:
                org.telegram.ui.Components.to toVar = ((org.telegram.ui.Components.to[]) ynVar.Y.f935b)[0];
                org.telegram.ui.ActionBar.i5 i5Var = toVar.d;
                org.telegram.ui.ActionBar.i5 i5Var2 = toVar.f31105e;
                ynVar.D1 = !ynVar.D1;
                i5Var.setPivotX(0.0f);
                i5Var2.setPivotX(0.0f);
                if (ynVar.D1) {
                    i5Var.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                    i5Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                } else {
                    i5Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                    i5Var2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                }
                AndroidUtilities.runOnUIThread(ynVar.E1, 6000L);
                return;
            case 27:
                ynVar.tc();
                return;
            case 28:
                ynVar.A7(true);
                return;
            default:
                ynVar.A7(true);
                return;
        }
    }
}
