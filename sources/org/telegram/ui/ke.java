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
public final class ke implements Runnable {
    public final int f38591a;
    public final qn f38592b;

    public ke(qn qnVar, int i10) {
        this.f38591a = i10;
        this.f38592b = qnVar;
    }

    @Override
    public final void run() {
        fk fkVar;
        int i10;
        org.telegram.ui.Cells.u1 u1Var;
        MessageObject messageObject;
        int i11;
        int i12 = this.f38591a;
        TLRPC.ChatTheme chatTheme = null;
        int i13 = 0;
        qn qnVar = this.f38592b;
        switch (i12) {
            case 0:
                qnVar.L5 = null;
                if (qnVar.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qnVar.getParentActivity(), 0, qnVar.f40676ea);
                    boolean isChannel = ChatObject.isChannel(qnVar.e);
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20608a;
                    if (isChannel && !qnVar.e.megagroup) {
                        b2Var.T = LocaleController.getString(R.string.JoinByPeekChannelText);
                        b2Var.R = LocaleController.getString(R.string.JoinByPeekChannelTitle);
                    } else {
                        b2Var.T = LocaleController.getString(R.string.JoinByPeekGroupText);
                        b2Var.R = LocaleController.getString(R.string.JoinByPeekGroupTitle);
                    }
                    alertDialog$Builder.k(LocaleController.getString(R.string.JoinByPeekJoin), new pe(qnVar, 2));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new pe(qnVar, 3));
                    qnVar.showDialog(b2Var);
                    return;
                }
                return;
            case 1:
                qnVar.b7();
                return;
            case 2:
                qn.n0(qnVar);
                return;
            case 3:
                qnVar.ta(null, qnVar.f40847s8);
                qnVar.f40847s8 = null;
                return;
            case 4:
                if (!org.telegram.ui.ActionBar.n2.hasSheets(qnVar) && (fkVar = qnVar.Y) != null) {
                    fkVar.setFieldFocused(true);
                    qnVar.Y.F0();
                    return;
                }
                return;
            case 5:
                qnVar.t9();
                AndroidUtilities.forEachViews((RecyclerView) qnVar.f40904x0, (Utilities.Callback<View>) new xe(qnVar, 6));
                qnVar.x7();
                wj wjVar = qnVar.X2;
                if (wjVar != null) {
                    wjVar.setTranslationX(qnVar.W8() / 2.0f);
                }
                vj vjVar = qnVar.Y2;
                if (vjVar != null) {
                    vjVar.setTranslationX(qnVar.W8() / 2.0f);
                }
                FrameLayout frameLayout = qnVar.Q0;
                if (frameLayout != null) {
                    frameLayout.setTranslationX(qnVar.W8() / 2.0f);
                }
                qnVar.V6();
                qnVar.w7();
                return;
            case 6:
                nd1 a02 = nd1.a0(-qnVar.T5, 0L);
                a02.f39553y = qnVar;
                qnVar.presentFragment(a02);
                return;
            case 7:
                qnVar.gc(true);
                return;
            case 8:
                qnVar.f40728j1.d(true);
                return;
            case 9:
                qnVar.getNotificationCenter().onAnimationFinish(qnVar.F9);
                return;
            case 10:
                int childCount = qnVar.f40904x0.getChildCount();
                while (i13 < childCount) {
                    View childAt = qnVar.f40904x0.getChildAt(i13);
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
                qnVar.Bb = true;
                qnVar.Cc(true);
                return;
            case 12:
                vk vkVar = qnVar.f40639bb;
                if (vkVar != null) {
                    vkVar.requestLayout();
                    return;
                }
                return;
            case 13:
                qn.J0(qnVar);
                return;
            case 14:
                qnVar.Ab(false, true);
                return;
            case 15:
                qnVar.resumeDelayedFragmentAnimation();
                nk nkVar = qnVar.W9;
                AndroidUtilities.cancelRunOnUIThread(nkVar);
                nkVar.run();
                qnVar.getNotificationCenter().runDelayedNotifications();
                return;
            case 16:
                TLRPC.UserFull userFull = qnVar.f40622a8;
                if (userFull != null) {
                    chatTheme = userFull.theme;
                }
                qnVar.nb(chatTheme);
                return;
            case 17:
                qn.u0(qnVar);
                return;
            case 18:
                qnVar.L7 = Integer.MAX_VALUE;
                qnVar.N7 = false;
                qnVar.O7 = 0L;
                qnVar.P7 = null;
                qnVar.Q7 = null;
                qnVar.R7 = null;
                qnVar.S7 = -1;
                qnVar.M7 = false;
                qnVar.bd(false);
                qnVar.U7 = null;
                return;
            case 19:
                qnVar.c7();
                return;
            case 20:
                qnVar.Y.F0();
                return;
            case 21:
                AndroidUtilities.forEachViews((RecyclerView) qnVar.f40904x0, (Utilities.Callback<View>) new ci.e(11));
                dm dmVar = qnVar.A0;
                if (dmVar != null) {
                    dmVar.O(true);
                    return;
                }
                return;
            case 22:
                qn qnVar2 = this.f38592b;
                int i14 = qnVar2.f40822qb;
                if (i14 != 0) {
                    qnVar2.j(i14, qnVar2.f40836rb, qnVar2.f40850sb, qnVar2.f40863tb, qnVar2.f40875ub, qnVar2.f40888vb);
                    qnVar2.f40822qb = 0;
                    return;
                }
                return;
            case 23:
                if (!qnVar.f40755l3 && qnVar.f40904x0 != null && qnVar.getParentActivity() != null && qnVar.fragmentView != null) {
                    org.telegram.ui.Components.aq aqVar = qnVar.f40879v2;
                    if (aqVar == null || aqVar.getTag() == null) {
                        if (qnVar.f40879v2 == null) {
                            jm jmVar = qnVar.X0;
                            int indexOfChild = jmVar.indexOfChild(qnVar.S);
                            if (indexOfChild != -1) {
                                i10 = 1;
                                org.telegram.ui.Components.aq aqVar2 = new org.telegram.ui.Components.aq(qnVar.getParentActivity(), qnVar.f40676ea);
                                qnVar.f40879v2 = aqVar2;
                                jmVar.addView(aqVar2, indexOfChild + 1, w7.z5.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                                qnVar.f40879v2.setAlpha(0.0f);
                                qnVar.f40879v2.setVisibility(4);
                            } else {
                                return;
                            }
                        } else {
                            i10 = 1;
                        }
                        int childCount2 = qnVar.f40904x0.getChildCount();
                        for (int i15 = 0; i15 < childCount2; i15++) {
                            View childAt2 = qnVar.f40904x0.getChildAt(i15);
                            if ((childAt2 instanceof org.telegram.ui.Cells.u1) && (messageObject = (u1Var = (org.telegram.ui.Cells.u1) childAt2).getMessageObject()) != null && messageObject.isOutOwner() && messageObject.isSent()) {
                                org.telegram.ui.Components.aq aqVar3 = qnVar.f40879v2;
                                ImageView imageView = aqVar3.f24700c;
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
                                    aqVar3.f24701f = measuredHeight;
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
                                        ViewPropertyAnimator interpolator = aqVar3.f24698a[i13].animate().scaleX(1.04f).scaleY(1.04f).setInterpolator(org.telegram.ui.Components.bs.f25026i);
                                        if (i13 == 0) {
                                            i11 = 132;
                                        } else {
                                            i11 = 500;
                                        }
                                        interpolator.setStartDelay(i11 + 140).setDuration(100L).setListener(new gi.p2(aqVar3, i13, 6)).start();
                                        i13++;
                                    }
                                    qnVar.getMessagesController().removeSuggestion(0L, "NEWCOMER_TICKS");
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
                qn.G0(qnVar);
                return;
            case 25:
                AndroidUtilities.forEachViews((RecyclerView) qnVar.f40904x0, (Utilities.Callback<View>) new ci.e(10));
                dm dmVar2 = qnVar.A0;
                if (dmVar2 != null) {
                    dmVar2.O(false);
                    return;
                }
                return;
            case 26:
                AndroidUtilities.removeFromParent(qnVar.K0);
                return;
            case 27:
                fk fkVar2 = qnVar.Y;
                if (fkVar2 != null && qnVar.ob != 5) {
                    fkVar2.F0();
                    return;
                }
                return;
            case 28:
                org.telegram.ui.Components.ap apVar = ((org.telegram.ui.Components.ap[]) qnVar.f40615a0.f899b)[0];
                org.telegram.ui.ActionBar.j5 j5Var = apVar.d;
                org.telegram.ui.ActionBar.j5 j5Var2 = apVar.e;
                qnVar.F1 = !qnVar.F1;
                j5Var.setPivotX(0.0f);
                j5Var2.setPivotX(0.0f);
                if (qnVar.F1) {
                    j5Var.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                    j5Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                } else {
                    j5Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                    j5Var2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                }
                AndroidUtilities.runOnUIThread(qnVar.G1, 6000L);
                return;
            default:
                qnVar.zc();
                return;
        }
    }
}
