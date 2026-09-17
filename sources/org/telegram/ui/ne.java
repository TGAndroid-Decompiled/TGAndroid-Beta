package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
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
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ne implements Runnable {
    public final int f36079a;
    public final bo f36080b;

    public ne(bo boVar, int i10) {
        this.f36079a = i10;
        this.f36080b = boVar;
    }

    @Override
    public final void run() {
        nk nkVar;
        int i10;
        org.telegram.ui.Cells.t1 t1Var;
        MessageObject messageObject;
        int i11;
        int i12 = this.f36079a;
        TLRPC.ChatTheme chatTheme = null;
        int i13 = 0;
        bo boVar = this.f36080b;
        switch (i12) {
            case 0:
                boVar.L5 = null;
                if (boVar.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(boVar.getParentActivity(), 0, boVar.f32275ea);
                    boolean isChannel = ChatObject.isChannel(boVar.e);
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f18446a;
                    if (isChannel && !boVar.e.megagroup) {
                        c2Var.T = LocaleController.getString(R.string.JoinByPeekChannelText);
                        c2Var.R = LocaleController.getString(R.string.JoinByPeekChannelTitle);
                    } else {
                        c2Var.T = LocaleController.getString(R.string.JoinByPeekGroupText);
                        c2Var.R = LocaleController.getString(R.string.JoinByPeekGroupTitle);
                    }
                    alertDialog$Builder.k(LocaleController.getString(R.string.JoinByPeekJoin), new we(boVar, 0));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new we(boVar, 1));
                    boVar.showDialog(c2Var);
                    return;
                }
                return;
            case 1:
                boVar.Y6();
                return;
            case 2:
                bo.i0(boVar);
                return;
            case 3:
                boVar.oa(null, boVar.f32446s8);
                boVar.f32446s8 = null;
                return;
            case 4:
                if (!org.telegram.ui.ActionBar.o2.hasSheets(boVar) && (nkVar = boVar.Y) != null) {
                    nkVar.setFieldFocused(true);
                    boVar.Y.H0();
                    return;
                }
                return;
            case 5:
                boVar.o9();
                AndroidUtilities.forEachViews((RecyclerView) boVar.f32502x0, (e2.h) new jg(boVar, 1));
                boVar.u7();
                ek ekVar = boVar.X2;
                if (ekVar != null) {
                    ekVar.setTranslationX(boVar.R8() / 2.0f);
                }
                dk dkVar = boVar.Y2;
                if (dkVar != null) {
                    dkVar.setTranslationX(boVar.R8() / 2.0f);
                }
                FrameLayout frameLayout = boVar.Q0;
                if (frameLayout != null) {
                    frameLayout.setTranslationX(boVar.R8() / 2.0f);
                }
                boVar.S6();
                boVar.t7();
                return;
            case 6:
                bf1 a02 = bf1.a0(-boVar.T5, 0L);
                a02.f32124y = boVar;
                boVar.presentFragment(a02);
                return;
            case 7:
                boVar.getNotificationCenter().onAnimationFinish(boVar.F9);
                return;
            case 8:
                boVar.f32328j1.d(true);
                return;
            case 9:
                int childCount = boVar.f32502x0.getChildCount();
                while (i13 < childCount) {
                    View childAt = boVar.f32502x0.getChildAt(i13);
                    if (childAt instanceof org.telegram.ui.Cells.t1) {
                        org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) childAt;
                        if (t1Var2.getMessageObject().type == 4) {
                            t1Var2.t2();
                        }
                    }
                    i13++;
                }
                return;
            case 10:
                boVar.Bb = true;
                boVar.xc(true);
                return;
            case 11:
                dl dlVar = boVar.f32238bb;
                if (dlVar != null) {
                    dlVar.requestLayout();
                    return;
                }
                return;
            case 12:
                bo.E0(boVar);
                return;
            case 13:
                TLRPC.UserFull userFull = boVar.f32221a8;
                if (userFull != null) {
                    chatTheme = userFull.theme;
                }
                boVar.ib(chatTheme);
                return;
            case 14:
                bo.o1(boVar);
                return;
            case 15:
                boVar.L7 = Integer.MAX_VALUE;
                boVar.N7 = false;
                boVar.O7 = 0L;
                boVar.P7 = null;
                boVar.Q7 = null;
                boVar.R7 = null;
                boVar.S7 = -1;
                boVar.M7 = false;
                boVar.Wc(false);
                boVar.U7 = null;
                return;
            case 16:
                boVar.resumeDelayedFragmentAnimation();
                ok okVar = boVar.W9;
                AndroidUtilities.cancelRunOnUIThread(okVar);
                okVar.run();
                boVar.getNotificationCenter().runDelayedNotifications();
                return;
            case 17:
                boVar.vb(false, true);
                return;
            case 18:
                boVar.bc(true);
                return;
            case 19:
                boVar.Z6();
                return;
            case 20:
                boVar.Y.H0();
                return;
            case 21:
                boVar.f32417q7 = null;
                gl glVar = boVar.f32230b3;
                if (glVar != null) {
                    org.telegram.ui.Components.p50 cameraContainer = glVar.getCameraContainer();
                    AnimatorSet animatorSet = new AnimatorSet();
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cameraContainer, View.SCALE_X, 0.5f);
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(cameraContainer, View.SCALE_Y, 0.5f);
                    Property property = View.ALPHA;
                    animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(cameraContainer, property, 0.0f), ObjectAnimator.ofFloat(boVar.f32230b3.getButtonsLayout(), property, 0.0f), ObjectAnimator.ofInt(boVar.f32230b3.getPaint(), org.telegram.ui.Components.q6.f27222b, 0), ObjectAnimator.ofFloat(boVar.f32230b3.getMuteImageView(), property, 0.0f));
                    animatorSet.addListener(new yi(boVar, 0));
                    animatorSet.start();
                    return;
                }
                return;
            case 22:
                AndroidUtilities.forEachViews((RecyclerView) boVar.f32502x0, (e2.h) new ai.i(22));
                nm nmVar = boVar.A0;
                if (nmVar != null) {
                    nmVar.O(true);
                    return;
                }
                return;
            case 23:
                bo boVar2 = this.f36080b;
                int i14 = boVar2.f32421qb;
                if (i14 != 0) {
                    boVar2.F(i14, boVar2.f32435rb, boVar2.f32461tb, boVar2.f32486vb, boVar2.f32449sb, boVar2.f32474ub);
                    boVar2.f32421qb = 0;
                    return;
                }
                return;
            case 24:
                if (!boVar.f32354l3 && boVar.f32502x0 != null && boVar.getParentActivity() != null && boVar.fragmentView != null) {
                    org.telegram.ui.Components.qp qpVar = boVar.f32478v2;
                    if (qpVar == null || qpVar.getTag() == null) {
                        if (boVar.f32478v2 == null) {
                            tm tmVar = boVar.X0;
                            int indexOfChild = tmVar.indexOfChild(boVar.S);
                            if (indexOfChild != -1) {
                                i10 = 1;
                                org.telegram.ui.Components.qp qpVar2 = new org.telegram.ui.Components.qp(boVar.getParentActivity(), boVar.f32275ea);
                                boVar.f32478v2 = qpVar2;
                                tmVar.addView(qpVar2, indexOfChild + 1, w7.x5.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                                boVar.f32478v2.setAlpha(0.0f);
                                boVar.f32478v2.setVisibility(4);
                            } else {
                                return;
                            }
                        } else {
                            i10 = 1;
                        }
                        int childCount2 = boVar.f32502x0.getChildCount();
                        for (int i15 = 0; i15 < childCount2; i15++) {
                            View childAt2 = boVar.f32502x0.getChildAt(i15);
                            if ((childAt2 instanceof org.telegram.ui.Cells.t1) && (messageObject = (t1Var = (org.telegram.ui.Cells.t1) childAt2).getMessageObject()) != null && messageObject.isOutOwner() && messageObject.isSent()) {
                                org.telegram.ui.Components.qp qpVar3 = boVar.f32478v2;
                                ImageView imageView = qpVar3.f27369c;
                                org.telegram.ui.Components.ng ngVar = qpVar3.e;
                                if (ngVar != null) {
                                    AndroidUtilities.cancelRunOnUIThread(ngVar);
                                    qpVar3.e = null;
                                }
                                int[] iArr = new int[2];
                                t1Var.getLocationInWindow(iArr);
                                int i16 = iArr[i10];
                                ((View) qpVar3.getParent()).getLocationInWindow(iArr);
                                int i17 = i16 - iArr[i10];
                                View view = (View) t1Var.getParent();
                                qpVar3.measure(View.MeasureSpec.makeMeasureSpec(1000, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(1000, Integer.MIN_VALUE));
                                if (i17 > AndroidUtilities.dp(10.0f) + qpVar3.getMeasuredHeight()) {
                                    int C = org.telegram.messenger.w1.C(6.0f, t1Var.getChecksY(), i17);
                                    int dp = AndroidUtilities.dp(5.0f) + t1Var.getChecksX();
                                    int measuredWidth = view.getMeasuredWidth();
                                    float measuredHeight = C - qpVar3.getMeasuredHeight();
                                    qpVar3.f27370f = measuredHeight;
                                    qpVar3.setTranslationY(measuredHeight);
                                    int left = t1Var.getLeft() + dp;
                                    int dp2 = AndroidUtilities.dp(15.0f);
                                    if (left > view.getMeasuredWidth() / 2) {
                                        int measuredWidth2 = (measuredWidth - qpVar3.getMeasuredWidth()) - AndroidUtilities.dp(20.0f);
                                        qpVar3.setTranslationX(measuredWidth2);
                                        dp2 += measuredWidth2;
                                    } else {
                                        qpVar3.setTranslationX(0.0f);
                                    }
                                    float left2 = ((t1Var.getLeft() + dp) - dp2) - (imageView.getMeasuredWidth() / 2);
                                    imageView.setTranslationX(left2);
                                    if (left > view.getMeasuredWidth() / 2) {
                                        if (left2 < AndroidUtilities.dp(10.0f)) {
                                            float dp3 = left2 - AndroidUtilities.dp(10.0f);
                                            qpVar3.setTranslationX(qpVar3.getTranslationX() + dp3);
                                            imageView.setTranslationX(left2 - dp3);
                                        }
                                    } else if (left2 > qpVar3.getMeasuredWidth() - AndroidUtilities.dp(24.0f)) {
                                        float measuredWidth3 = (left2 - qpVar3.getMeasuredWidth()) + AndroidUtilities.dp(24.0f);
                                        qpVar3.setTranslationX(measuredWidth3);
                                        imageView.setTranslationX(left2 - measuredWidth3);
                                    } else if (left2 < AndroidUtilities.dp(10.0f)) {
                                        float dp4 = left2 - AndroidUtilities.dp(10.0f);
                                        qpVar3.setTranslationX(qpVar3.getTranslationX() + dp4);
                                        imageView.setTranslationX(left2 - dp4);
                                    }
                                    qpVar3.setPivotX(left2);
                                    qpVar3.setPivotY(qpVar3.getMeasuredHeight());
                                    AnimatorSet animatorSet2 = qpVar3.d;
                                    if (animatorSet2 != null) {
                                        animatorSet2.cancel();
                                        qpVar3.d = null;
                                    }
                                    qpVar3.setTag(Integer.valueOf(i10));
                                    qpVar3.setVisibility(0);
                                    AnimatorSet animatorSet3 = new AnimatorSet();
                                    qpVar3.d = animatorSet3;
                                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(qpVar3, View.ALPHA, 0.0f, 1.0f);
                                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(qpVar3, View.SCALE_X, 0.0f, 1.0f);
                                    ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(qpVar3, View.SCALE_Y, 0.0f, 1.0f);
                                    Animator[] animatorArr = new Animator[3];
                                    animatorArr[0] = ofFloat3;
                                    animatorArr[i10] = ofFloat4;
                                    animatorArr[2] = ofFloat5;
                                    animatorSet3.playTogether(animatorArr);
                                    qpVar3.d.addListener(new org.telegram.ui.Components.pp(qpVar3, 0));
                                    qpVar3.d.setDuration(180L);
                                    qpVar3.d.start();
                                    while (i13 < 2) {
                                        ViewPropertyAnimator interpolator = qpVar3.f27367a[i13].animate().scaleX(1.04f).scaleY(1.04f).setInterpolator(org.telegram.ui.Components.qr.f27382i);
                                        if (i13 == 0) {
                                            i11 = 132;
                                        } else {
                                            i11 = 500;
                                        }
                                        interpolator.setStartDelay(i11 + 140).setDuration(100L).setListener(new ei.v2(qpVar3, i13, 6)).start();
                                        i13++;
                                    }
                                    boVar.getMessagesController().removeSuggestion(0L, "NEWCOMER_TICKS");
                                    return;
                                }
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            case 25:
                AndroidUtilities.forEachViews((RecyclerView) boVar.f32502x0, (e2.h) new ai.i(21));
                nm nmVar2 = boVar.A0;
                if (nmVar2 != null) {
                    nmVar2.O(false);
                    return;
                }
                return;
            case 26:
                bo.v0(boVar);
                return;
            case 27:
                nk nkVar2 = boVar.Y;
                if (nkVar2 != null && boVar.f32397ob != 5) {
                    nkVar2.H0();
                    return;
                }
                return;
            case 28:
                org.telegram.ui.Components.qo qoVar = ((org.telegram.ui.Components.qo[]) boVar.f32214a0.f785b)[0];
                org.telegram.ui.ActionBar.k5 k5Var = qoVar.d;
                org.telegram.ui.ActionBar.k5 k5Var2 = qoVar.e;
                boVar.F1 = !boVar.F1;
                k5Var.setPivotX(0.0f);
                k5Var2.setPivotX(0.0f);
                if (boVar.F1) {
                    k5Var.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                    k5Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                } else {
                    k5Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                    k5Var2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                }
                AndroidUtilities.runOnUIThread(boVar.G1, 6000L);
                return;
            default:
                boVar.uc();
                return;
        }
    }
}
