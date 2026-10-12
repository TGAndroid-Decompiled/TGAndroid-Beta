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
public final class qe implements Runnable {
    public final int f41311a;
    public final eo f41312b;

    public qe(eo eoVar, int i10) {
        this.f41311a = i10;
        this.f41312b = eoVar;
    }

    @Override
    public final void run() {
        sk skVar;
        int i10;
        org.telegram.ui.Cells.u1 u1Var;
        MessageObject messageObject;
        int i11;
        int i12 = this.f41311a;
        TLRPC.ChatTheme chatTheme = null;
        int i13 = 0;
        eo eoVar = this.f41312b;
        switch (i12) {
            case 0:
                eoVar.L5 = null;
                if (eoVar.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(eoVar.getParentActivity(), 0, eoVar.f37256ea);
                    boolean isChannel = ChatObject.isChannel(eoVar.f37246e);
                    org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20142a;
                    if (isChannel && !eoVar.f37246e.megagroup) {
                        a2Var.T = LocaleController.getString(R.string.JoinByPeekChannelText);
                        a2Var.R = LocaleController.getString(R.string.JoinByPeekChannelTitle);
                    } else {
                        a2Var.T = LocaleController.getString(R.string.JoinByPeekGroupText);
                        a2Var.R = LocaleController.getString(R.string.JoinByPeekGroupTitle);
                    }
                    alertDialog$Builder.k(LocaleController.getString(R.string.JoinByPeekJoin), new ve(eoVar, 2));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new ve(eoVar, 3));
                    eoVar.showDialog(a2Var);
                    return;
                }
                return;
            case 1:
                eoVar.b7();
                return;
            case 2:
                eo.n0(eoVar);
                return;
            case 3:
                eoVar.ta(null, eoVar.f37426s8);
                eoVar.f37426s8 = null;
                return;
            case 4:
                if (!org.telegram.ui.ActionBar.m2.hasSheets(eoVar) && (skVar = eoVar.Y) != null) {
                    skVar.setFieldFocused(true);
                    eoVar.Y.J0();
                    return;
                }
                return;
            case 5:
                eoVar.t9();
                AndroidUtilities.forEachViews((RecyclerView) eoVar.f37483x0, (Utilities.Callback<View>) new gf(eoVar, 6));
                eoVar.x7();
                jk jkVar = eoVar.X2;
                if (jkVar != null) {
                    jkVar.setTranslationX(eoVar.W8() / 2.0f);
                }
                ik ikVar = eoVar.Y2;
                if (ikVar != null) {
                    ikVar.setTranslationX(eoVar.W8() / 2.0f);
                }
                FrameLayout frameLayout = eoVar.Q0;
                if (frameLayout != null) {
                    frameLayout.setTranslationX(eoVar.W8() / 2.0f);
                }
                eoVar.V6();
                eoVar.w7();
                return;
            case 6:
                df1 a02 = df1.a0(-eoVar.T5, 0L);
                a02.f36797y = eoVar;
                eoVar.presentFragment(a02);
                return;
            case 7:
                eoVar.fc(true);
                return;
            case 8:
                eoVar.f37308j1.f(true);
                return;
            case 9:
                eoVar.getNotificationCenter().onAnimationFinish(eoVar.F9);
                return;
            case 10:
                int childCount = eoVar.f37483x0.getChildCount();
                while (i13 < childCount) {
                    View childAt = eoVar.f37483x0.getChildAt(i13);
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
                eoVar.Bb = true;
                eoVar.Bc(true);
                return;
            case 12:
                il ilVar = eoVar.f37218bb;
                if (ilVar != null) {
                    ilVar.requestLayout();
                    return;
                }
                return;
            case 13:
                eo.J0(eoVar);
                return;
            case 14:
                eoVar.zb(false, true);
                return;
            case 15:
                eoVar.resumeDelayedFragmentAnimation();
                al alVar = eoVar.W9;
                AndroidUtilities.cancelRunOnUIThread(alVar);
                alVar.run();
                eoVar.getNotificationCenter().runDelayedNotifications();
                return;
            case 16:
                TLRPC.UserFull userFull = eoVar.f37201a8;
                if (userFull != null) {
                    chatTheme = userFull.theme;
                }
                eoVar.mb(chatTheme);
                return;
            case 17:
                eo.u0(eoVar);
                return;
            case 18:
                eoVar.L7 = Integer.MAX_VALUE;
                eoVar.N7 = false;
                eoVar.O7 = 0L;
                eoVar.P7 = null;
                eoVar.Q7 = null;
                eoVar.R7 = null;
                eoVar.S7 = -1;
                eoVar.M7 = false;
                eoVar.ad(false);
                eoVar.U7 = null;
                return;
            case 19:
                eoVar.c7();
                return;
            case 20:
                eoVar.Y.J0();
                return;
            case 21:
                AndroidUtilities.forEachViews((RecyclerView) eoVar.f37483x0, (Utilities.Callback<View>) new ai.i(11));
                qm qmVar = eoVar.A0;
                if (qmVar != null) {
                    qmVar.O(true);
                    return;
                }
                return;
            case 22:
                eo eoVar2 = this.f41312b;
                int i14 = eoVar2.f37401qb;
                if (i14 != 0) {
                    eoVar2.F(i14, eoVar2.f37415rb, eoVar2.f37441tb, eoVar2.f37466vb, eoVar2.f37429sb, eoVar2.f37454ub);
                    eoVar2.f37401qb = 0;
                    return;
                }
                return;
            case 23:
                if (!eoVar.f37334l3 && eoVar.f37483x0 != null && eoVar.getParentActivity() != null && eoVar.fragmentView != null) {
                    org.telegram.ui.Components.iq iqVar = eoVar.f37458v2;
                    if (iqVar == null || iqVar.getTag() == null) {
                        if (eoVar.f37458v2 == null) {
                            wm wmVar = eoVar.X0;
                            int indexOfChild = wmVar.indexOfChild(eoVar.S);
                            if (indexOfChild != -1) {
                                i10 = 1;
                                org.telegram.ui.Components.iq iqVar2 = new org.telegram.ui.Components.iq(eoVar.getParentActivity(), eoVar.f37256ea);
                                eoVar.f37458v2 = iqVar2;
                                wmVar.addView(iqVar2, indexOfChild + 1, w7.w5.a(-2.0f, 10.0f, 0.0f, 10.0f, 0.0f, -2, 51));
                                eoVar.f37458v2.setAlpha(0.0f);
                                eoVar.f37458v2.setVisibility(4);
                            } else {
                                return;
                            }
                        } else {
                            i10 = 1;
                        }
                        int childCount2 = eoVar.f37483x0.getChildCount();
                        for (int i15 = 0; i15 < childCount2; i15++) {
                            View childAt2 = eoVar.f37483x0.getChildAt(i15);
                            if ((childAt2 instanceof org.telegram.ui.Cells.u1) && (messageObject = (u1Var = (org.telegram.ui.Cells.u1) childAt2).getMessageObject()) != null && messageObject.isOutOwner() && messageObject.isSent()) {
                                org.telegram.ui.Components.iq iqVar3 = eoVar.f37458v2;
                                ImageView imageView = iqVar3.f27256c;
                                org.telegram.ui.Components.tg tgVar = iqVar3.f27257e;
                                if (tgVar != null) {
                                    AndroidUtilities.cancelRunOnUIThread(tgVar);
                                    iqVar3.f27257e = null;
                                }
                                int[] iArr = new int[2];
                                u1Var.getLocationInWindow(iArr);
                                int i16 = iArr[i10];
                                ((View) iqVar3.getParent()).getLocationInWindow(iArr);
                                int i17 = i16 - iArr[i10];
                                View view = (View) u1Var.getParent();
                                iqVar3.measure(View.MeasureSpec.makeMeasureSpec(1000, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(1000, Integer.MIN_VALUE));
                                if (i17 > AndroidUtilities.dp(10.0f) + iqVar3.getMeasuredHeight()) {
                                    int C = org.telegram.messenger.v0.C(6.0f, u1Var.getChecksY(), i17);
                                    int dp = AndroidUtilities.dp(5.0f) + u1Var.getChecksX();
                                    int measuredWidth = view.getMeasuredWidth();
                                    float measuredHeight = C - iqVar3.getMeasuredHeight();
                                    iqVar3.f27258f = measuredHeight;
                                    iqVar3.setTranslationY(measuredHeight);
                                    int left = u1Var.getLeft() + dp;
                                    int dp2 = AndroidUtilities.dp(15.0f);
                                    if (left > view.getMeasuredWidth() / 2) {
                                        int measuredWidth2 = (measuredWidth - iqVar3.getMeasuredWidth()) - AndroidUtilities.dp(20.0f);
                                        iqVar3.setTranslationX(measuredWidth2);
                                        dp2 += measuredWidth2;
                                    } else {
                                        iqVar3.setTranslationX(0.0f);
                                    }
                                    float left2 = ((u1Var.getLeft() + dp) - dp2) - (imageView.getMeasuredWidth() / 2);
                                    imageView.setTranslationX(left2);
                                    if (left > view.getMeasuredWidth() / 2) {
                                        if (left2 < AndroidUtilities.dp(10.0f)) {
                                            float dp3 = left2 - AndroidUtilities.dp(10.0f);
                                            iqVar3.setTranslationX(iqVar3.getTranslationX() + dp3);
                                            imageView.setTranslationX(left2 - dp3);
                                        }
                                    } else if (left2 > iqVar3.getMeasuredWidth() - AndroidUtilities.dp(24.0f)) {
                                        float measuredWidth3 = (left2 - iqVar3.getMeasuredWidth()) + AndroidUtilities.dp(24.0f);
                                        iqVar3.setTranslationX(measuredWidth3);
                                        imageView.setTranslationX(left2 - measuredWidth3);
                                    } else if (left2 < AndroidUtilities.dp(10.0f)) {
                                        float dp4 = left2 - AndroidUtilities.dp(10.0f);
                                        iqVar3.setTranslationX(iqVar3.getTranslationX() + dp4);
                                        imageView.setTranslationX(left2 - dp4);
                                    }
                                    iqVar3.setPivotX(left2);
                                    iqVar3.setPivotY(iqVar3.getMeasuredHeight());
                                    AnimatorSet animatorSet = iqVar3.d;
                                    if (animatorSet != null) {
                                        animatorSet.cancel();
                                        iqVar3.d = null;
                                    }
                                    iqVar3.setTag(Integer.valueOf(i10));
                                    iqVar3.setVisibility(0);
                                    AnimatorSet animatorSet2 = new AnimatorSet();
                                    iqVar3.d = animatorSet2;
                                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(iqVar3, View.ALPHA, 0.0f, 1.0f);
                                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(iqVar3, View.SCALE_X, 0.0f, 1.0f);
                                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(iqVar3, View.SCALE_Y, 0.0f, 1.0f);
                                    Animator[] animatorArr = new Animator[3];
                                    animatorArr[0] = ofFloat;
                                    animatorArr[i10] = ofFloat2;
                                    animatorArr[2] = ofFloat3;
                                    animatorSet2.playTogether(animatorArr);
                                    iqVar3.d.addListener(new org.telegram.ui.Components.hq(iqVar3, 0));
                                    iqVar3.d.setDuration(180L);
                                    iqVar3.d.start();
                                    while (i13 < 2) {
                                        ViewPropertyAnimator interpolator = iqVar3.f27254a[i13].animate().scaleX(1.04f).scaleY(1.04f).setInterpolator(org.telegram.ui.Components.js.f27636i);
                                        if (i13 == 0) {
                                            i11 = 132;
                                        } else {
                                            i11 = 500;
                                        }
                                        interpolator.setStartDelay(i11 + 140).setDuration(100L).setListener(new ei.v2(iqVar3, i13, 6)).start();
                                        i13++;
                                    }
                                    eoVar.getMessagesController().removeSuggestion(0L, "NEWCOMER_TICKS");
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
                eo.G0(eoVar);
                return;
            case 25:
                AndroidUtilities.forEachViews((RecyclerView) eoVar.f37483x0, (Utilities.Callback<View>) new ai.i(10));
                qm qmVar2 = eoVar.A0;
                if (qmVar2 != null) {
                    qmVar2.O(false);
                    return;
                }
                return;
            case 26:
                AndroidUtilities.removeFromParent(eoVar.K0);
                return;
            case 27:
                sk skVar2 = eoVar.Y;
                if (skVar2 != null && eoVar.f37377ob != 5) {
                    skVar2.J0();
                    return;
                }
                return;
            case 28:
                org.telegram.ui.Components.ip ipVar = ((org.telegram.ui.Components.ip[]) eoVar.f37194a0.f931b)[0];
                org.telegram.ui.ActionBar.h5 h5Var = ipVar.d;
                org.telegram.ui.ActionBar.h5 h5Var2 = ipVar.f27249e;
                eoVar.F1 = !eoVar.F1;
                h5Var.setPivotX(0.0f);
                h5Var2.setPivotX(0.0f);
                if (eoVar.F1) {
                    h5Var.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                    h5Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                } else {
                    h5Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                    h5Var2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                }
                AndroidUtilities.runOnUIThread(eoVar.G1, 6000L);
                return;
            default:
                eoVar.yc();
                return;
        }
    }
}
