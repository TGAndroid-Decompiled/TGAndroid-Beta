package org.telegram.ui;

import android.animation.Animator;
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
public final class me implements Runnable {
    public final int f39193a;
    public final sn f39194b;

    public me(sn snVar, int i10) {
        this.f39193a = i10;
        this.f39194b = snVar;
    }

    @Override
    public final void run() {
        hk hkVar;
        int i10;
        org.telegram.ui.Cells.u1 u1Var;
        MessageObject messageObject;
        int i11;
        int i12 = this.f39193a;
        TLRPC.ChatTheme chatTheme = null;
        int i13 = 0;
        sn snVar = this.f39194b;
        switch (i12) {
            case 0:
                snVar.L5 = null;
                if (snVar.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(snVar.getParentActivity(), 0, snVar.f41226ea);
                    boolean isChannel = ChatObject.isChannel(snVar.e);
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20608a;
                    if (isChannel && !snVar.e.megagroup) {
                        b2Var.T = LocaleController.getString(R.string.JoinByPeekChannelText);
                        b2Var.R = LocaleController.getString(R.string.JoinByPeekChannelTitle);
                    } else {
                        b2Var.T = LocaleController.getString(R.string.JoinByPeekGroupText);
                        b2Var.R = LocaleController.getString(R.string.JoinByPeekGroupTitle);
                    }
                    alertDialog$Builder.k(LocaleController.getString(R.string.JoinByPeekJoin), new re(snVar, 2));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new re(snVar, 3));
                    snVar.showDialog(b2Var);
                    return;
                }
                return;
            case 1:
                snVar.b7();
                return;
            case 2:
                sn.n0(snVar);
                return;
            case 3:
                snVar.ta(null, snVar.f41397s8);
                snVar.f41397s8 = null;
                return;
            case 4:
                if (!org.telegram.ui.ActionBar.n2.hasSheets(snVar) && (hkVar = snVar.Y) != null) {
                    hkVar.setFieldFocused(true);
                    snVar.Y.F0();
                    return;
                }
                return;
            case 5:
                snVar.t9();
                AndroidUtilities.forEachViews((RecyclerView) snVar.f41454x0, (Utilities.Callback<View>) new ze(snVar, 6));
                snVar.x7();
                yj yjVar = snVar.X2;
                if (yjVar != null) {
                    yjVar.setTranslationX(snVar.W8() / 2.0f);
                }
                xj xjVar = snVar.Y2;
                if (xjVar != null) {
                    xjVar.setTranslationX(snVar.W8() / 2.0f);
                }
                FrameLayout frameLayout = snVar.Q0;
                if (frameLayout != null) {
                    frameLayout.setTranslationX(snVar.W8() / 2.0f);
                }
                snVar.V6();
                snVar.w7();
                return;
            case 6:
                pd1 a02 = pd1.a0(-snVar.T5, 0L);
                a02.f40108y = snVar;
                snVar.presentFragment(a02);
                return;
            case 7:
                snVar.fc(true);
                return;
            case 8:
                snVar.f41278j1.d(true);
                return;
            case 9:
                snVar.getNotificationCenter().onAnimationFinish(snVar.F9);
                return;
            case 10:
                int childCount = snVar.f41454x0.getChildCount();
                while (i13 < childCount) {
                    View childAt = snVar.f41454x0.getChildAt(i13);
                    if (childAt instanceof org.telegram.ui.Cells.u1) {
                        org.telegram.ui.Cells.u1 u1Var2 = (org.telegram.ui.Cells.u1) childAt;
                        if (u1Var2.getMessageObject().type == 4) {
                            u1Var2.t2();
                        }
                    }
                    i13++;
                }
                return;
            case 11:
                snVar.Bb = true;
                snVar.Bc(true);
                return;
            case 12:
                xk xkVar = snVar.f41189bb;
                if (xkVar != null) {
                    xkVar.requestLayout();
                    return;
                }
                return;
            case 13:
                sn.J0(snVar);
                return;
            case 14:
                snVar.zb(false, true);
                return;
            case 15:
                snVar.resumeDelayedFragmentAnimation();
                pk pkVar = snVar.W9;
                AndroidUtilities.cancelRunOnUIThread(pkVar);
                pkVar.run();
                snVar.getNotificationCenter().runDelayedNotifications();
                return;
            case 16:
                TLRPC.UserFull userFull = snVar.f41172a8;
                if (userFull != null) {
                    chatTheme = userFull.theme;
                }
                snVar.mb(chatTheme);
                return;
            case 17:
                sn.u0(snVar);
                return;
            case 18:
                snVar.L7 = Integer.MAX_VALUE;
                snVar.N7 = false;
                snVar.O7 = 0L;
                snVar.P7 = null;
                snVar.Q7 = null;
                snVar.R7 = null;
                snVar.S7 = -1;
                snVar.M7 = false;
                snVar.ad(false);
                snVar.U7 = null;
                return;
            case 19:
                snVar.c7();
                return;
            case 20:
                snVar.Y.F0();
                return;
            case 21:
                AndroidUtilities.forEachViews((RecyclerView) snVar.f41454x0, (Utilities.Callback<View>) new ci.e(11));
                fm fmVar = snVar.A0;
                if (fmVar != null) {
                    fmVar.O(true);
                    return;
                }
                return;
            case 22:
                sn snVar2 = this.f39194b;
                int i14 = snVar2.f41372qb;
                if (i14 != 0) {
                    snVar2.j(i14, snVar2.f41386rb, snVar2.f41400sb, snVar2.f41413tb, snVar2.f41425ub, snVar2.f41438vb);
                    snVar2.f41372qb = 0;
                    return;
                }
                return;
            case 23:
                if (!snVar.f41305l3 && snVar.f41454x0 != null && snVar.getParentActivity() != null && snVar.fragmentView != null) {
                    org.telegram.ui.Components.aq aqVar = snVar.f41429v2;
                    if (aqVar == null || aqVar.getTag() == null) {
                        if (snVar.f41429v2 == null) {
                            lm lmVar = snVar.X0;
                            int indexOfChild = lmVar.indexOfChild(snVar.S);
                            if (indexOfChild != -1) {
                                i10 = 1;
                                org.telegram.ui.Components.aq aqVar2 = new org.telegram.ui.Components.aq(snVar.getParentActivity(), snVar.f41226ea);
                                snVar.f41429v2 = aqVar2;
                                lmVar.addView(aqVar2, indexOfChild + 1, w7.z5.a(-2.0f, 10.0f, 0.0f, 10.0f, 0.0f, -2, 51));
                                snVar.f41429v2.setAlpha(0.0f);
                                snVar.f41429v2.setVisibility(4);
                            } else {
                                return;
                            }
                        } else {
                            i10 = 1;
                        }
                        int childCount2 = snVar.f41454x0.getChildCount();
                        for (int i15 = 0; i15 < childCount2; i15++) {
                            View childAt2 = snVar.f41454x0.getChildAt(i15);
                            if ((childAt2 instanceof org.telegram.ui.Cells.u1) && (messageObject = (u1Var = (org.telegram.ui.Cells.u1) childAt2).getMessageObject()) != null && messageObject.isOutOwner() && messageObject.isSent()) {
                                org.telegram.ui.Components.aq aqVar3 = snVar.f41429v2;
                                ImageView imageView = aqVar3.f24699c;
                                org.telegram.ui.Components.pg pgVar = aqVar3.e;
                                if (pgVar != null) {
                                    AndroidUtilities.cancelRunOnUIThread(pgVar);
                                    aqVar3.e = null;
                                }
                                int[] iArr = new int[2];
                                u1Var.getLocationInWindow(iArr);
                                int i16 = iArr[i10];
                                ((View) aqVar3.getParent()).getLocationInWindow(iArr);
                                int i17 = i16 - iArr[i10];
                                View view = (View) u1Var.getParent();
                                aqVar3.measure(View.MeasureSpec.makeMeasureSpec(1000, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(1000, Integer.MIN_VALUE));
                                if (i17 > AndroidUtilities.dp(10.0f) + aqVar3.getMeasuredHeight()) {
                                    int C = org.telegram.messenger.g0.C(6.0f, u1Var.getChecksY(), i17);
                                    int dp = AndroidUtilities.dp(5.0f) + u1Var.getChecksX();
                                    int measuredWidth = view.getMeasuredWidth();
                                    float measuredHeight = C - aqVar3.getMeasuredHeight();
                                    aqVar3.f24700f = measuredHeight;
                                    aqVar3.setTranslationY(measuredHeight);
                                    int left = u1Var.getLeft() + dp;
                                    int dp2 = AndroidUtilities.dp(15.0f);
                                    if (left > view.getMeasuredWidth() / 2) {
                                        int measuredWidth2 = (measuredWidth - aqVar3.getMeasuredWidth()) - AndroidUtilities.dp(20.0f);
                                        aqVar3.setTranslationX(measuredWidth2);
                                        dp2 += measuredWidth2;
                                    } else {
                                        aqVar3.setTranslationX(0.0f);
                                    }
                                    float left2 = ((u1Var.getLeft() + dp) - dp2) - (imageView.getMeasuredWidth() / 2);
                                    imageView.setTranslationX(left2);
                                    if (left > view.getMeasuredWidth() / 2) {
                                        if (left2 < AndroidUtilities.dp(10.0f)) {
                                            float dp3 = left2 - AndroidUtilities.dp(10.0f);
                                            aqVar3.setTranslationX(aqVar3.getTranslationX() + dp3);
                                            imageView.setTranslationX(left2 - dp3);
                                        }
                                    } else if (left2 > aqVar3.getMeasuredWidth() - AndroidUtilities.dp(24.0f)) {
                                        float measuredWidth3 = (left2 - aqVar3.getMeasuredWidth()) + AndroidUtilities.dp(24.0f);
                                        aqVar3.setTranslationX(measuredWidth3);
                                        imageView.setTranslationX(left2 - measuredWidth3);
                                    } else if (left2 < AndroidUtilities.dp(10.0f)) {
                                        float dp4 = left2 - AndroidUtilities.dp(10.0f);
                                        aqVar3.setTranslationX(aqVar3.getTranslationX() + dp4);
                                        imageView.setTranslationX(left2 - dp4);
                                    }
                                    aqVar3.setPivotX(left2);
                                    aqVar3.setPivotY(aqVar3.getMeasuredHeight());
                                    AnimatorSet animatorSet = aqVar3.d;
                                    if (animatorSet != null) {
                                        animatorSet.cancel();
                                        aqVar3.d = null;
                                    }
                                    aqVar3.setTag(Integer.valueOf(i10));
                                    aqVar3.setVisibility(0);
                                    AnimatorSet animatorSet2 = new AnimatorSet();
                                    aqVar3.d = animatorSet2;
                                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(aqVar3, View.ALPHA, 0.0f, 1.0f);
                                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(aqVar3, View.SCALE_X, 0.0f, 1.0f);
                                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(aqVar3, View.SCALE_Y, 0.0f, 1.0f);
                                    Animator[] animatorArr = new Animator[3];
                                    animatorArr[0] = ofFloat;
                                    animatorArr[i10] = ofFloat2;
                                    animatorArr[2] = ofFloat3;
                                    animatorSet2.playTogether(animatorArr);
                                    aqVar3.d.addListener(new org.telegram.ui.Components.zp(aqVar3, 0));
                                    aqVar3.d.setDuration(180L);
                                    aqVar3.d.start();
                                    while (i13 < 2) {
                                        ViewPropertyAnimator interpolator = aqVar3.f24697a[i13].animate().scaleX(1.04f).scaleY(1.04f).setInterpolator(org.telegram.ui.Components.bs.f25039i);
                                        if (i13 == 0) {
                                            i11 = 132;
                                        } else {
                                            i11 = 500;
                                        }
                                        interpolator.setStartDelay(i11 + 140).setDuration(100L).setListener(new gi.p2(aqVar3, i13, 6)).start();
                                        i13++;
                                    }
                                    snVar.getMessagesController().removeSuggestion(0L, "NEWCOMER_TICKS");
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
                sn.G0(snVar);
                return;
            case 25:
                AndroidUtilities.forEachViews((RecyclerView) snVar.f41454x0, (Utilities.Callback<View>) new ci.e(10));
                fm fmVar2 = snVar.A0;
                if (fmVar2 != null) {
                    fmVar2.O(false);
                    return;
                }
                return;
            case 26:
                AndroidUtilities.removeFromParent(snVar.K0);
                return;
            case 27:
                hk hkVar2 = snVar.Y;
                if (hkVar2 != null && snVar.ob != 5) {
                    hkVar2.F0();
                    return;
                }
                return;
            case 28:
                org.telegram.ui.Components.ap apVar = ((org.telegram.ui.Components.ap[]) snVar.f41165a0.f901b)[0];
                org.telegram.ui.ActionBar.j5 j5Var = apVar.d;
                org.telegram.ui.ActionBar.j5 j5Var2 = apVar.e;
                snVar.F1 = !snVar.F1;
                j5Var.setPivotX(0.0f);
                j5Var2.setPivotX(0.0f);
                if (snVar.F1) {
                    j5Var.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                    j5Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                } else {
                    j5Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                    j5Var2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                }
                AndroidUtilities.runOnUIThread(snVar.G1, 6000L);
                return;
            default:
                snVar.yc();
                return;
        }
    }
}
