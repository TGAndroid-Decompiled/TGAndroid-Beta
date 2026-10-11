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
public final class le implements Runnable {
    public final int f39628a;
    public final zn f39629b;

    public le(zn znVar, int i10) {
        this.f39628a = i10;
        this.f39629b = znVar;
    }

    @Override
    public final void run() {
        ok okVar;
        int i10;
        org.telegram.ui.Cells.u1 u1Var;
        MessageObject messageObject;
        int i11;
        int i12 = this.f39628a;
        TLRPC.ChatTheme chatTheme = null;
        int i13 = 0;
        zn znVar = this.f39629b;
        switch (i12) {
            case 0:
                znVar.L5 = null;
                if (znVar.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(znVar.getParentActivity(), 0, znVar.f44762ea);
                    boolean isChannel = ChatObject.isChannel(znVar.f44752e);
                    org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20368a;
                    if (isChannel && !znVar.f44752e.megagroup) {
                        a2Var.T = LocaleController.getString(R.string.JoinByPeekChannelText);
                        a2Var.R = LocaleController.getString(R.string.JoinByPeekChannelTitle);
                    } else {
                        a2Var.T = LocaleController.getString(R.string.JoinByPeekGroupText);
                        a2Var.R = LocaleController.getString(R.string.JoinByPeekGroupTitle);
                    }
                    alertDialog$Builder.k(LocaleController.getString(R.string.JoinByPeekJoin), new qe(znVar, 2));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new qe(znVar, 3));
                    znVar.showDialog(a2Var);
                    return;
                }
                return;
            case 1:
                znVar.b7();
                return;
            case 2:
                zn.n0(znVar);
                return;
            case 3:
                znVar.ta(null, znVar.f44932s8);
                znVar.f44932s8 = null;
                return;
            case 4:
                if (!org.telegram.ui.ActionBar.m2.hasSheets(znVar) && (okVar = znVar.Y) != null) {
                    okVar.setFieldFocused(true);
                    znVar.Y.F0();
                    return;
                }
                return;
            case 5:
                znVar.t9();
                AndroidUtilities.forEachViews((RecyclerView) znVar.f44989x0, (Utilities.Callback<View>) new bf(znVar, 6));
                znVar.x7();
                fk fkVar = znVar.X2;
                if (fkVar != null) {
                    fkVar.setTranslationX(znVar.W8() / 2.0f);
                }
                ek ekVar = znVar.Y2;
                if (ekVar != null) {
                    ekVar.setTranslationX(znVar.W8() / 2.0f);
                }
                FrameLayout frameLayout = znVar.Q0;
                if (frameLayout != null) {
                    frameLayout.setTranslationX(znVar.W8() / 2.0f);
                }
                znVar.V6();
                znVar.w7();
                return;
            case 6:
                af1 a02 = af1.a0(-znVar.T5, 0L);
                a02.f36064y = znVar;
                znVar.presentFragment(a02);
                return;
            case 7:
                znVar.fc(true);
                return;
            case 8:
                znVar.f44814j1.d(true);
                return;
            case 9:
                znVar.getNotificationCenter().onAnimationFinish(znVar.F9);
                return;
            case 10:
                int childCount = znVar.f44989x0.getChildCount();
                while (i13 < childCount) {
                    View childAt = znVar.f44989x0.getChildAt(i13);
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
                znVar.Bb = true;
                znVar.Bc(true);
                return;
            case 12:
                el elVar = znVar.f44724bb;
                if (elVar != null) {
                    elVar.requestLayout();
                    return;
                }
                return;
            case 13:
                zn.J0(znVar);
                return;
            case 14:
                znVar.zb(false, true);
                return;
            case 15:
                znVar.resumeDelayedFragmentAnimation();
                wk wkVar = znVar.W9;
                AndroidUtilities.cancelRunOnUIThread(wkVar);
                wkVar.run();
                znVar.getNotificationCenter().runDelayedNotifications();
                return;
            case 16:
                TLRPC.UserFull userFull = znVar.f44707a8;
                if (userFull != null) {
                    chatTheme = userFull.theme;
                }
                znVar.mb(chatTheme);
                return;
            case 17:
                zn.u0(znVar);
                return;
            case 18:
                znVar.L7 = Integer.MAX_VALUE;
                znVar.N7 = false;
                znVar.O7 = 0L;
                znVar.P7 = null;
                znVar.Q7 = null;
                znVar.R7 = null;
                znVar.S7 = -1;
                znVar.M7 = false;
                znVar.ad(false);
                znVar.U7 = null;
                return;
            case 19:
                znVar.c7();
                return;
            case 20:
                znVar.Y.F0();
                return;
            case 21:
                AndroidUtilities.forEachViews((RecyclerView) znVar.f44989x0, (Utilities.Callback<View>) new ai.i(11));
                mm mmVar = znVar.A0;
                if (mmVar != null) {
                    mmVar.O(true);
                    return;
                }
                return;
            case 22:
                zn znVar2 = this.f39629b;
                int i14 = znVar2.f44907qb;
                if (i14 != 0) {
                    znVar2.F(i14, znVar2.f44921rb, znVar2.f44947tb, znVar2.f44972vb, znVar2.f44935sb, znVar2.f44960ub);
                    znVar2.f44907qb = 0;
                    return;
                }
                return;
            case 23:
                if (!znVar.f44840l3 && znVar.f44989x0 != null && znVar.getParentActivity() != null && znVar.fragmentView != null) {
                    org.telegram.ui.Components.gq gqVar = znVar.f44964v2;
                    if (gqVar == null || gqVar.getTag() == null) {
                        if (znVar.f44964v2 == null) {
                            sm smVar = znVar.X0;
                            int indexOfChild = smVar.indexOfChild(znVar.S);
                            if (indexOfChild != -1) {
                                i10 = 1;
                                org.telegram.ui.Components.gq gqVar2 = new org.telegram.ui.Components.gq(znVar.getParentActivity(), znVar.f44762ea);
                                znVar.f44964v2 = gqVar2;
                                smVar.addView(gqVar2, indexOfChild + 1, w7.x5.a(-2.0f, 10.0f, 0.0f, 10.0f, 0.0f, -2, 51));
                                znVar.f44964v2.setAlpha(0.0f);
                                znVar.f44964v2.setVisibility(4);
                            } else {
                                return;
                            }
                        } else {
                            i10 = 1;
                        }
                        int childCount2 = znVar.f44989x0.getChildCount();
                        for (int i15 = 0; i15 < childCount2; i15++) {
                            View childAt2 = znVar.f44989x0.getChildAt(i15);
                            if ((childAt2 instanceof org.telegram.ui.Cells.u1) && (messageObject = (u1Var = (org.telegram.ui.Cells.u1) childAt2).getMessageObject()) != null && messageObject.isOutOwner() && messageObject.isSent()) {
                                org.telegram.ui.Components.gq gqVar3 = znVar.f44964v2;
                                ImageView imageView = gqVar3.f26802c;
                                org.telegram.ui.Components.rg rgVar = gqVar3.f26803e;
                                if (rgVar != null) {
                                    AndroidUtilities.cancelRunOnUIThread(rgVar);
                                    gqVar3.f26803e = null;
                                }
                                int[] iArr = new int[2];
                                u1Var.getLocationInWindow(iArr);
                                int i16 = iArr[i10];
                                ((View) gqVar3.getParent()).getLocationInWindow(iArr);
                                int i17 = i16 - iArr[i10];
                                View view = (View) u1Var.getParent();
                                gqVar3.measure(View.MeasureSpec.makeMeasureSpec(1000, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(1000, Integer.MIN_VALUE));
                                if (i17 > AndroidUtilities.dp(10.0f) + gqVar3.getMeasuredHeight()) {
                                    int C = org.telegram.messenger.q.C(6.0f, u1Var.getChecksY(), i17);
                                    int dp = AndroidUtilities.dp(5.0f) + u1Var.getChecksX();
                                    int measuredWidth = view.getMeasuredWidth();
                                    float measuredHeight = C - gqVar3.getMeasuredHeight();
                                    gqVar3.f26804f = measuredHeight;
                                    gqVar3.setTranslationY(measuredHeight);
                                    int left = u1Var.getLeft() + dp;
                                    int dp2 = AndroidUtilities.dp(15.0f);
                                    if (left > view.getMeasuredWidth() / 2) {
                                        int measuredWidth2 = (measuredWidth - gqVar3.getMeasuredWidth()) - AndroidUtilities.dp(20.0f);
                                        gqVar3.setTranslationX(measuredWidth2);
                                        dp2 += measuredWidth2;
                                    } else {
                                        gqVar3.setTranslationX(0.0f);
                                    }
                                    float left2 = ((u1Var.getLeft() + dp) - dp2) - (imageView.getMeasuredWidth() / 2);
                                    imageView.setTranslationX(left2);
                                    if (left > view.getMeasuredWidth() / 2) {
                                        if (left2 < AndroidUtilities.dp(10.0f)) {
                                            float dp3 = left2 - AndroidUtilities.dp(10.0f);
                                            gqVar3.setTranslationX(gqVar3.getTranslationX() + dp3);
                                            imageView.setTranslationX(left2 - dp3);
                                        }
                                    } else if (left2 > gqVar3.getMeasuredWidth() - AndroidUtilities.dp(24.0f)) {
                                        float measuredWidth3 = (left2 - gqVar3.getMeasuredWidth()) + AndroidUtilities.dp(24.0f);
                                        gqVar3.setTranslationX(measuredWidth3);
                                        imageView.setTranslationX(left2 - measuredWidth3);
                                    } else if (left2 < AndroidUtilities.dp(10.0f)) {
                                        float dp4 = left2 - AndroidUtilities.dp(10.0f);
                                        gqVar3.setTranslationX(gqVar3.getTranslationX() + dp4);
                                        imageView.setTranslationX(left2 - dp4);
                                    }
                                    gqVar3.setPivotX(left2);
                                    gqVar3.setPivotY(gqVar3.getMeasuredHeight());
                                    AnimatorSet animatorSet = gqVar3.d;
                                    if (animatorSet != null) {
                                        animatorSet.cancel();
                                        gqVar3.d = null;
                                    }
                                    gqVar3.setTag(Integer.valueOf(i10));
                                    gqVar3.setVisibility(0);
                                    AnimatorSet animatorSet2 = new AnimatorSet();
                                    gqVar3.d = animatorSet2;
                                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(gqVar3, View.ALPHA, 0.0f, 1.0f);
                                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(gqVar3, View.SCALE_X, 0.0f, 1.0f);
                                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(gqVar3, View.SCALE_Y, 0.0f, 1.0f);
                                    Animator[] animatorArr = new Animator[3];
                                    animatorArr[0] = ofFloat;
                                    animatorArr[i10] = ofFloat2;
                                    animatorArr[2] = ofFloat3;
                                    animatorSet2.playTogether(animatorArr);
                                    gqVar3.d.addListener(new org.telegram.ui.Components.fq(gqVar3, 0));
                                    gqVar3.d.setDuration(180L);
                                    gqVar3.d.start();
                                    while (i13 < 2) {
                                        ViewPropertyAnimator interpolator = gqVar3.f26800a[i13].animate().scaleX(1.04f).scaleY(1.04f).setInterpolator(org.telegram.ui.Components.is.f27453i);
                                        if (i13 == 0) {
                                            i11 = 132;
                                        } else {
                                            i11 = 500;
                                        }
                                        interpolator.setStartDelay(i11 + 140).setDuration(100L).setListener(new ei.v2(gqVar3, i13, 6)).start();
                                        i13++;
                                    }
                                    znVar.getMessagesController().removeSuggestion(0L, "NEWCOMER_TICKS");
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
                zn.G0(znVar);
                return;
            case 25:
                AndroidUtilities.forEachViews((RecyclerView) znVar.f44989x0, (Utilities.Callback<View>) new ai.i(10));
                mm mmVar2 = znVar.A0;
                if (mmVar2 != null) {
                    mmVar2.O(false);
                    return;
                }
                return;
            case 26:
                AndroidUtilities.removeFromParent(znVar.K0);
                return;
            case 27:
                ok okVar2 = znVar.Y;
                if (okVar2 != null && znVar.f44883ob != 5) {
                    okVar2.F0();
                    return;
                }
                return;
            case 28:
                org.telegram.ui.Components.gp gpVar = ((org.telegram.ui.Components.gp[]) znVar.f44700a0.f933b)[0];
                org.telegram.ui.ActionBar.h5 h5Var = gpVar.d;
                org.telegram.ui.ActionBar.h5 h5Var2 = gpVar.f26791e;
                znVar.F1 = !znVar.F1;
                h5Var.setPivotX(0.0f);
                h5Var2.setPivotX(0.0f);
                if (znVar.F1) {
                    h5Var.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                    h5Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                } else {
                    h5Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                    h5Var2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                }
                AndroidUtilities.runOnUIThread(znVar.G1, 6000L);
                return;
            default:
                znVar.yc();
                return;
        }
    }
}
