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
public final class le implements Runnable {
    public final int f35334a;
    public final wn f35335b;

    public le(wn wnVar, int i10) {
        this.f35334a = i10;
        this.f35335b = wnVar;
    }

    @Override
    public final void run() {
        jk jkVar;
        org.telegram.ui.Cells.u1 u1Var;
        MessageObject messageObject;
        int i10;
        int i11 = this.f35334a;
        TLRPC.ChatTheme chatTheme = null;
        char c10 = 1;
        int i12 = 0;
        wn wnVar = this.f35335b;
        switch (i11) {
            case 0:
                wnVar.L5 = null;
                if (wnVar.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wnVar.getParentActivity(), 0, wnVar.f39469ea);
                    boolean isChannel = ChatObject.isChannel(wnVar.e);
                    org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f18661a;
                    if (isChannel && !wnVar.e.megagroup) {
                        a2Var.T = LocaleController.getString(R.string.JoinByPeekChannelText);
                        a2Var.R = LocaleController.getString(R.string.JoinByPeekChannelTitle);
                    } else {
                        a2Var.T = LocaleController.getString(R.string.JoinByPeekGroupText);
                        a2Var.R = LocaleController.getString(R.string.JoinByPeekGroupTitle);
                    }
                    alertDialog$Builder.k(LocaleController.getString(R.string.JoinByPeekJoin), new pe(wnVar, 2));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new pe(wnVar, 3));
                    wnVar.showDialog(a2Var);
                    return;
                }
                return;
            case 1:
                wnVar.Y6();
                return;
            case 2:
                wn.g0(wnVar);
                return;
            case 3:
                wnVar.oa(null, wnVar.f39639s8);
                wnVar.f39639s8 = null;
                return;
            case 4:
                if (!org.telegram.ui.ActionBar.m2.hasSheets(wnVar) && (jkVar = wnVar.Y) != null) {
                    jkVar.setFieldFocused(true);
                    wnVar.Y.H0();
                    return;
                }
                return;
            case 5:
                wnVar.o9();
                AndroidUtilities.forEachViews((RecyclerView) wnVar.f39695x0, (Utilities.Callback<View>) new af(wnVar, 5));
                wnVar.u7();
                ak akVar = wnVar.X2;
                if (akVar != null) {
                    akVar.setTranslationX(wnVar.R8() / 2.0f);
                }
                zj zjVar = wnVar.Y2;
                if (zjVar != null) {
                    zjVar.setTranslationX(wnVar.R8() / 2.0f);
                }
                FrameLayout frameLayout = wnVar.Q0;
                if (frameLayout != null) {
                    frameLayout.setTranslationX(wnVar.R8() / 2.0f);
                }
                wnVar.S6();
                wnVar.t7();
                return;
            case 6:
                se1 a02 = se1.a0(-wnVar.T5, 0L);
                a02.f37731y = wnVar;
                wnVar.presentFragment(a02);
                return;
            case 7:
                wnVar.getNotificationCenter().onAnimationFinish(wnVar.F9);
                return;
            case 8:
                wnVar.f39521j1.d(true);
                return;
            case 9:
                AndroidUtilities.removeFromParent(wnVar.K0);
                return;
            case 10:
                int childCount = wnVar.f39695x0.getChildCount();
                while (i12 < childCount) {
                    View childAt = wnVar.f39695x0.getChildAt(i12);
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
                wnVar.Ab = true;
                wnVar.xc(true);
                return;
            case 12:
                wn.J0(wnVar);
                return;
            case 13:
                al alVar = wnVar.f39418ab;
                if (alVar != null) {
                    alVar.requestLayout();
                    return;
                }
                return;
            case 14:
                TLRPC.UserFull userFull = wnVar.f39415a8;
                if (userFull != null) {
                    chatTheme = userFull.theme;
                }
                wnVar.ib(chatTheme);
                return;
            case 15:
                wn.f1(wnVar);
                return;
            case 16:
                wnVar.resumeDelayedFragmentAnimation();
                kk kkVar = wnVar.W9;
                AndroidUtilities.cancelRunOnUIThread(kkVar);
                kkVar.run();
                wnVar.getNotificationCenter().runDelayedNotifications();
                return;
            case 17:
                wnVar.L7 = Integer.MAX_VALUE;
                wnVar.N7 = false;
                wnVar.O7 = 0L;
                wnVar.P7 = null;
                wnVar.Q7 = null;
                wnVar.R7 = null;
                wnVar.S7 = -1;
                wnVar.M7 = false;
                wnVar.Wc(false);
                wnVar.U7 = null;
                return;
            case 18:
                wnVar.vb(false, true);
                return;
            case 19:
                wnVar.bc(true);
                return;
            case 20:
                wnVar.Z6();
                return;
            case 21:
                wnVar.Y.H0();
                return;
            case 22:
                AndroidUtilities.forEachViews((RecyclerView) wnVar.f39695x0, (Utilities.Callback<View>) new ai.i(10));
                jm jmVar = wnVar.A0;
                if (jmVar != null) {
                    jmVar.O(true);
                    return;
                }
                return;
            case 23:
                wn wnVar2 = this.f35335b;
                int i13 = wnVar2.f39602pb;
                if (i13 != 0) {
                    wnVar2.F(i13, wnVar2.f39614qb, wnVar2.f39642sb, wnVar2.f39667ub, wnVar2.f39628rb, wnVar2.f39654tb);
                    wnVar2.f39602pb = 0;
                    return;
                }
                return;
            case 24:
                if (!wnVar.f39547l3 && wnVar.f39695x0 != null && wnVar.getParentActivity() != null && wnVar.fragmentView != null) {
                    org.telegram.ui.Components.rp rpVar = wnVar.f39671v2;
                    if (rpVar == null || rpVar.getTag() == null) {
                        if (wnVar.f39671v2 == null) {
                            pm pmVar = wnVar.X0;
                            int indexOfChild = pmVar.indexOfChild(wnVar.S);
                            if (indexOfChild != -1) {
                                org.telegram.ui.Components.rp rpVar2 = new org.telegram.ui.Components.rp(wnVar.getParentActivity(), wnVar.f39469ea);
                                wnVar.f39671v2 = rpVar2;
                                pmVar.addView(rpVar2, indexOfChild + 1, w7.y5.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                                wnVar.f39671v2.setAlpha(0.0f);
                                wnVar.f39671v2.setVisibility(4);
                            } else {
                                return;
                            }
                        }
                        int childCount2 = wnVar.f39695x0.getChildCount();
                        int i14 = 0;
                        while (i14 < childCount2) {
                            View childAt2 = wnVar.f39695x0.getChildAt(i14);
                            if ((childAt2 instanceof org.telegram.ui.Cells.u1) && (messageObject = (u1Var = (org.telegram.ui.Cells.u1) childAt2).getMessageObject()) != null && messageObject.isOutOwner() && messageObject.isSent()) {
                                org.telegram.ui.Components.rp rpVar3 = wnVar.f39671v2;
                                ImageView imageView = rpVar3.f28021c;
                                org.telegram.ui.Components.pg pgVar = rpVar3.e;
                                if (pgVar != null) {
                                    AndroidUtilities.cancelRunOnUIThread(pgVar);
                                    rpVar3.e = null;
                                }
                                int[] iArr = new int[2];
                                u1Var.getLocationInWindow(iArr);
                                int i15 = iArr[c10];
                                ((View) rpVar3.getParent()).getLocationInWindow(iArr);
                                int i16 = i15 - iArr[1];
                                View view = (View) u1Var.getParent();
                                rpVar3.measure(View.MeasureSpec.makeMeasureSpec(1000, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(1000, Integer.MIN_VALUE));
                                if (i16 > AndroidUtilities.dp(10.0f) + rpVar3.getMeasuredHeight()) {
                                    int C = org.telegram.messenger.f0.C(6.0f, u1Var.getChecksY(), i16);
                                    int dp = AndroidUtilities.dp(5.0f) + u1Var.getChecksX();
                                    int measuredWidth = view.getMeasuredWidth();
                                    float measuredHeight = C - rpVar3.getMeasuredHeight();
                                    rpVar3.f28022f = measuredHeight;
                                    rpVar3.setTranslationY(measuredHeight);
                                    int left = u1Var.getLeft() + dp;
                                    int dp2 = AndroidUtilities.dp(15.0f);
                                    if (left > view.getMeasuredWidth() / 2) {
                                        int measuredWidth2 = (measuredWidth - rpVar3.getMeasuredWidth()) - AndroidUtilities.dp(20.0f);
                                        rpVar3.setTranslationX(measuredWidth2);
                                        dp2 += measuredWidth2;
                                    } else {
                                        rpVar3.setTranslationX(0.0f);
                                    }
                                    float left2 = ((u1Var.getLeft() + dp) - dp2) - (imageView.getMeasuredWidth() / 2);
                                    imageView.setTranslationX(left2);
                                    if (left > view.getMeasuredWidth() / 2) {
                                        if (left2 < AndroidUtilities.dp(10.0f)) {
                                            float dp3 = left2 - AndroidUtilities.dp(10.0f);
                                            rpVar3.setTranslationX(rpVar3.getTranslationX() + dp3);
                                            imageView.setTranslationX(left2 - dp3);
                                        }
                                    } else if (left2 > rpVar3.getMeasuredWidth() - AndroidUtilities.dp(24.0f)) {
                                        float measuredWidth3 = (left2 - rpVar3.getMeasuredWidth()) + AndroidUtilities.dp(24.0f);
                                        rpVar3.setTranslationX(measuredWidth3);
                                        imageView.setTranslationX(left2 - measuredWidth3);
                                    } else if (left2 < AndroidUtilities.dp(10.0f)) {
                                        float dp4 = left2 - AndroidUtilities.dp(10.0f);
                                        rpVar3.setTranslationX(rpVar3.getTranslationX() + dp4);
                                        imageView.setTranslationX(left2 - dp4);
                                    }
                                    rpVar3.setPivotX(left2);
                                    rpVar3.setPivotY(rpVar3.getMeasuredHeight());
                                    AnimatorSet animatorSet = rpVar3.d;
                                    if (animatorSet != null) {
                                        animatorSet.cancel();
                                        rpVar3.d = null;
                                    }
                                    rpVar3.setTag(1);
                                    rpVar3.setVisibility(0);
                                    AnimatorSet animatorSet2 = new AnimatorSet();
                                    rpVar3.d = animatorSet2;
                                    animatorSet2.playTogether(ObjectAnimator.ofFloat(rpVar3, View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(rpVar3, View.SCALE_X, 0.0f, 1.0f), ObjectAnimator.ofFloat(rpVar3, View.SCALE_Y, 0.0f, 1.0f));
                                    rpVar3.d.addListener(new org.telegram.ui.Components.qp(rpVar3, 0));
                                    rpVar3.d.setDuration(180L);
                                    rpVar3.d.start();
                                    while (i12 < 2) {
                                        ViewPropertyAnimator interpolator = rpVar3.f28019a[i12].animate().scaleX(1.04f).scaleY(1.04f).setInterpolator(org.telegram.ui.Components.rr.f28032i);
                                        if (i12 == 0) {
                                            i10 = 132;
                                        } else {
                                            i10 = 500;
                                        }
                                        interpolator.setStartDelay(i10 + 140).setDuration(100L).setListener(new ei.v2(rpVar3, i12, 6)).start();
                                        i12++;
                                    }
                                    wnVar.getMessagesController().removeSuggestion(0L, "NEWCOMER_TICKS");
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
                AndroidUtilities.forEachViews((RecyclerView) wnVar.f39695x0, (Utilities.Callback<View>) new ai.i(11));
                jm jmVar2 = wnVar.A0;
                if (jmVar2 != null) {
                    jmVar2.O(false);
                    return;
                }
                return;
            case 26:
                wn.x0(wnVar);
                return;
            case 27:
                jk jkVar2 = wnVar.Y;
                if (jkVar2 != null && wnVar.nb != 5) {
                    jkVar2.H0();
                    return;
                }
                return;
            case 28:
                org.telegram.ui.Components.ro roVar = ((org.telegram.ui.Components.ro[]) wnVar.f39408a0.f866b)[0];
                org.telegram.ui.ActionBar.h5 h5Var = roVar.d;
                org.telegram.ui.ActionBar.h5 h5Var2 = roVar.e;
                wnVar.F1 = !wnVar.F1;
                h5Var.setPivotX(0.0f);
                h5Var2.setPivotX(0.0f);
                if (wnVar.F1) {
                    h5Var.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                    h5Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                } else {
                    h5Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                    h5Var2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                }
                AndroidUtilities.runOnUIThread(wnVar.G1, 6000L);
                return;
            default:
                wnVar.uc();
                return;
        }
    }
}
