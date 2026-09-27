package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class oe implements Runnable {
    public final int f36189a;
    public final xn f36190b;

    public oe(xn xnVar, int i10) {
        this.f36189a = i10;
        this.f36190b = xnVar;
    }

    @Override
    public final void run() {
        lk lkVar;
        org.telegram.ui.Cells.u1 u1Var;
        MessageObject messageObject;
        int i10;
        int i11 = this.f36189a;
        TLRPC.ChatTheme chatTheme = null;
        char c10 = 1;
        int i12 = 0;
        xn xnVar = this.f36190b;
        switch (i11) {
            case 0:
                xnVar.L5 = null;
                if (xnVar.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xnVar.getParentActivity(), 0, xnVar.f39750ea);
                    boolean isChannel = ChatObject.isChannel(xnVar.e);
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f18655a;
                    if (isChannel && !xnVar.e.megagroup) {
                        c2Var.T = LocaleController.getString(R.string.JoinByPeekChannelText);
                        c2Var.R = LocaleController.getString(R.string.JoinByPeekChannelTitle);
                    } else {
                        c2Var.T = LocaleController.getString(R.string.JoinByPeekGroupText);
                        c2Var.R = LocaleController.getString(R.string.JoinByPeekGroupTitle);
                    }
                    alertDialog$Builder.k(LocaleController.getString(R.string.JoinByPeekJoin), new se(xnVar, 2));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new se(xnVar, 3));
                    xnVar.showDialog(c2Var);
                    return;
                }
                return;
            case 1:
                xnVar.Y6();
                return;
            case 2:
                xn.g0(xnVar);
                return;
            case 3:
                xnVar.oa(null, xnVar.f39921s8);
                xnVar.f39921s8 = null;
                return;
            case 4:
                if (!org.telegram.ui.ActionBar.o2.hasSheets(xnVar) && (lkVar = xnVar.Y) != null) {
                    lkVar.setFieldFocused(true);
                    xnVar.Y.H0();
                    return;
                }
                return;
            case 5:
                xnVar.o9();
                AndroidUtilities.forEachViews((RecyclerView) xnVar.f39977x0, (Utilities.Callback<View>) new df(xnVar, 5));
                xnVar.u7();
                ck ckVar = xnVar.X2;
                if (ckVar != null) {
                    ckVar.setTranslationX(xnVar.R8() / 2.0f);
                }
                bk bkVar = xnVar.Y2;
                if (bkVar != null) {
                    bkVar.setTranslationX(xnVar.R8() / 2.0f);
                }
                FrameLayout frameLayout = xnVar.Q0;
                if (frameLayout != null) {
                    frameLayout.setTranslationX(xnVar.R8() / 2.0f);
                }
                xnVar.S6();
                xnVar.t7();
                return;
            case 6:
                se1 a02 = se1.a0(-xnVar.T5, 0L);
                a02.f37419y = xnVar;
                xnVar.presentFragment(a02);
                return;
            case 7:
                xnVar.getNotificationCenter().onAnimationFinish(xnVar.F9);
                return;
            case 8:
                xnVar.f39803j1.d(true);
                return;
            case 9:
                AndroidUtilities.removeFromParent(xnVar.K0);
                return;
            case 10:
                int childCount = xnVar.f39977x0.getChildCount();
                while (i12 < childCount) {
                    View childAt = xnVar.f39977x0.getChildAt(i12);
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
                xnVar.Ab = true;
                xnVar.xc(true);
                return;
            case 12:
                xn.J0(xnVar);
                return;
            case 13:
                bl blVar = xnVar.f39699ab;
                if (blVar != null) {
                    blVar.requestLayout();
                    return;
                }
                return;
            case 14:
                TLRPC.UserFull userFull = xnVar.f39696a8;
                if (userFull != null) {
                    chatTheme = userFull.theme;
                }
                xnVar.ib(chatTheme);
                return;
            case 15:
                xn.f1(xnVar);
                return;
            case 16:
                xnVar.resumeDelayedFragmentAnimation();
                mk mkVar = xnVar.W9;
                AndroidUtilities.cancelRunOnUIThread(mkVar);
                mkVar.run();
                xnVar.getNotificationCenter().runDelayedNotifications();
                return;
            case 17:
                xnVar.L7 = Integer.MAX_VALUE;
                xnVar.N7 = false;
                xnVar.O7 = 0L;
                xnVar.P7 = null;
                xnVar.Q7 = null;
                xnVar.R7 = null;
                xnVar.S7 = -1;
                xnVar.M7 = false;
                xnVar.Wc(false);
                xnVar.U7 = null;
                return;
            case 18:
                xnVar.vb(false, true);
                return;
            case 19:
                xnVar.bc(true);
                return;
            case 20:
                xnVar.Z6();
                return;
            case 21:
                xnVar.Y.H0();
                return;
            case 22:
                AndroidUtilities.forEachViews((RecyclerView) xnVar.f39977x0, (Utilities.Callback<View>) new ai.i(10));
                km kmVar = xnVar.A0;
                if (kmVar != null) {
                    kmVar.O(true);
                    return;
                }
                return;
            case 23:
                xn xnVar2 = this.f36190b;
                int i13 = xnVar2.f39884pb;
                if (i13 != 0) {
                    xnVar2.F(i13, xnVar2.f39896qb, xnVar2.f39924sb, xnVar2.f39949ub, xnVar2.f39910rb, xnVar2.f39936tb);
                    xnVar2.f39884pb = 0;
                    return;
                }
                return;
            case 24:
                if (!xnVar.f39829l3 && xnVar.f39977x0 != null && xnVar.getParentActivity() != null && xnVar.fragmentView != null) {
                    org.telegram.ui.Components.sp spVar = xnVar.f39953v2;
                    if (spVar == null || spVar.getTag() == null) {
                        if (xnVar.f39953v2 == null) {
                            qm qmVar = xnVar.X0;
                            int indexOfChild = qmVar.indexOfChild(xnVar.S);
                            if (indexOfChild != -1) {
                                org.telegram.ui.Components.sp spVar2 = new org.telegram.ui.Components.sp(xnVar.getParentActivity(), xnVar.f39750ea);
                                xnVar.f39953v2 = spVar2;
                                qmVar.addView(spVar2, indexOfChild + 1, w7.y5.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                                xnVar.f39953v2.setAlpha(0.0f);
                                xnVar.f39953v2.setVisibility(4);
                            } else {
                                return;
                            }
                        }
                        int childCount2 = xnVar.f39977x0.getChildCount();
                        int i14 = 0;
                        while (i14 < childCount2) {
                            View childAt2 = xnVar.f39977x0.getChildAt(i14);
                            if ((childAt2 instanceof org.telegram.ui.Cells.u1) && (messageObject = (u1Var = (org.telegram.ui.Cells.u1) childAt2).getMessageObject()) != null && messageObject.isOutOwner() && messageObject.isSent()) {
                                org.telegram.ui.Components.sp spVar3 = xnVar.f39953v2;
                                ImageView imageView = spVar3.f28350c;
                                org.telegram.ui.Components.pg pgVar = spVar3.e;
                                if (pgVar != null) {
                                    AndroidUtilities.cancelRunOnUIThread(pgVar);
                                    spVar3.e = null;
                                }
                                int[] iArr = new int[2];
                                u1Var.getLocationInWindow(iArr);
                                int i15 = iArr[c10];
                                ((View) spVar3.getParent()).getLocationInWindow(iArr);
                                int i16 = i15 - iArr[1];
                                View view = (View) u1Var.getParent();
                                spVar3.measure(View.MeasureSpec.makeMeasureSpec(1000, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(1000, Integer.MIN_VALUE));
                                if (i16 > AndroidUtilities.dp(10.0f) + spVar3.getMeasuredHeight()) {
                                    int C = org.telegram.messenger.l0.C(6.0f, u1Var.getChecksY(), i16);
                                    int dp = AndroidUtilities.dp(5.0f) + u1Var.getChecksX();
                                    int measuredWidth = view.getMeasuredWidth();
                                    float measuredHeight = C - spVar3.getMeasuredHeight();
                                    spVar3.f28351f = measuredHeight;
                                    spVar3.setTranslationY(measuredHeight);
                                    int left = u1Var.getLeft() + dp;
                                    int dp2 = AndroidUtilities.dp(15.0f);
                                    if (left > view.getMeasuredWidth() / 2) {
                                        int measuredWidth2 = (measuredWidth - spVar3.getMeasuredWidth()) - AndroidUtilities.dp(20.0f);
                                        spVar3.setTranslationX(measuredWidth2);
                                        dp2 += measuredWidth2;
                                    } else {
                                        spVar3.setTranslationX(0.0f);
                                    }
                                    float left2 = ((u1Var.getLeft() + dp) - dp2) - (imageView.getMeasuredWidth() / 2);
                                    imageView.setTranslationX(left2);
                                    if (left > view.getMeasuredWidth() / 2) {
                                        if (left2 < AndroidUtilities.dp(10.0f)) {
                                            float dp3 = left2 - AndroidUtilities.dp(10.0f);
                                            spVar3.setTranslationX(spVar3.getTranslationX() + dp3);
                                            imageView.setTranslationX(left2 - dp3);
                                        }
                                    } else if (left2 > spVar3.getMeasuredWidth() - AndroidUtilities.dp(24.0f)) {
                                        float measuredWidth3 = (left2 - spVar3.getMeasuredWidth()) + AndroidUtilities.dp(24.0f);
                                        spVar3.setTranslationX(measuredWidth3);
                                        imageView.setTranslationX(left2 - measuredWidth3);
                                    } else if (left2 < AndroidUtilities.dp(10.0f)) {
                                        float dp4 = left2 - AndroidUtilities.dp(10.0f);
                                        spVar3.setTranslationX(spVar3.getTranslationX() + dp4);
                                        imageView.setTranslationX(left2 - dp4);
                                    }
                                    spVar3.setPivotX(left2);
                                    spVar3.setPivotY(spVar3.getMeasuredHeight());
                                    AnimatorSet animatorSet = spVar3.d;
                                    if (animatorSet != null) {
                                        animatorSet.cancel();
                                        spVar3.d = null;
                                    }
                                    spVar3.setTag(1);
                                    spVar3.setVisibility(0);
                                    AnimatorSet animatorSet2 = new AnimatorSet();
                                    spVar3.d = animatorSet2;
                                    animatorSet2.playTogether(ObjectAnimator.ofFloat(spVar3, View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(spVar3, View.SCALE_X, 0.0f, 1.0f), ObjectAnimator.ofFloat(spVar3, View.SCALE_Y, 0.0f, 1.0f));
                                    spVar3.d.addListener(new org.telegram.ui.Components.rp(spVar3, 0));
                                    spVar3.d.setDuration(180L);
                                    spVar3.d.start();
                                    while (i12 < 2) {
                                        ViewPropertyAnimator interpolator = spVar3.f28348a[i12].animate().scaleX(1.04f).scaleY(1.04f).setInterpolator(org.telegram.ui.Components.sr.f28361i);
                                        if (i12 == 0) {
                                            i10 = 132;
                                        } else {
                                            i10 = 500;
                                        }
                                        interpolator.setStartDelay(i10 + 140).setDuration(100L).setListener(new ei.v2(spVar3, i12, 6)).start();
                                        i12++;
                                    }
                                    xnVar.getMessagesController().removeSuggestion(0L, "NEWCOMER_TICKS");
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
            case 25:
                AndroidUtilities.forEachViews((RecyclerView) xnVar.f39977x0, (Utilities.Callback<View>) new ai.i(11));
                km kmVar2 = xnVar.A0;
                if (kmVar2 != null) {
                    kmVar2.O(false);
                    return;
                }
                return;
            case 26:
                xn.x0(xnVar);
                return;
            case 27:
                lk lkVar2 = xnVar.Y;
                if (lkVar2 != null && xnVar.nb != 5) {
                    lkVar2.H0();
                    return;
                }
                return;
            case 28:
                org.telegram.ui.Components.so soVar = ((org.telegram.ui.Components.so[]) xnVar.f39689a0.f869b)[0];
                org.telegram.ui.ActionBar.j5 j5Var = soVar.d;
                org.telegram.ui.ActionBar.j5 j5Var2 = soVar.e;
                xnVar.F1 = !xnVar.F1;
                j5Var.setPivotX(0.0f);
                j5Var2.setPivotX(0.0f);
                if (xnVar.F1) {
                    j5Var.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                    j5Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                } else {
                    j5Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                    j5Var2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                }
                AndroidUtilities.runOnUIThread(xnVar.G1, 6000L);
                return;
            default:
                xnVar.uc();
                return;
        }
    }
}
