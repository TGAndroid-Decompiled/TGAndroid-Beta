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
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class me implements Runnable {
    public final int f35714a;
    public final zn f35715b;

    public me(zn znVar, int i10) {
        this.f35714a = i10;
        this.f35715b = znVar;
    }

    @Override
    public final void run() {
        mk mkVar;
        org.telegram.ui.Cells.u1 u1Var;
        MessageObject messageObject;
        int i10;
        int i11 = this.f35714a;
        TLRPC.ChatTheme chatTheme = null;
        int i12 = 0;
        char c10 = 1;
        zn znVar = this.f35715b;
        switch (i11) {
            case 0:
                znVar.L5 = null;
                if (znVar.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(znVar.getParentActivity(), 0, znVar.f40324ea);
                    boolean isChannel = ChatObject.isChannel(znVar.e);
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18669a;
                    if (isChannel && !znVar.e.megagroup) {
                        b2Var.T = LocaleController.getString(R.string.JoinByPeekChannelText);
                        b2Var.R = LocaleController.getString(R.string.JoinByPeekChannelTitle);
                    } else {
                        b2Var.T = LocaleController.getString(R.string.JoinByPeekGroupText);
                        b2Var.R = LocaleController.getString(R.string.JoinByPeekGroupTitle);
                    }
                    alertDialog$Builder.k(LocaleController.getString(R.string.JoinByPeekJoin), new qe(znVar, 2));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new qe(znVar, 3));
                    znVar.showDialog(b2Var);
                    return;
                }
                return;
            case 1:
                znVar.Y6();
                return;
            case 2:
                zn.h0(znVar);
                return;
            case 3:
                znVar.oa(null, znVar.f40495s8);
                znVar.f40495s8 = null;
                return;
            case 4:
                if (!org.telegram.ui.ActionBar.n2.hasSheets(znVar) && (mkVar = znVar.Y) != null) {
                    mkVar.setFieldFocused(true);
                    znVar.Y.H0();
                    return;
                }
                return;
            case 5:
                znVar.o9();
                AndroidUtilities.forEachViews((RecyclerView) znVar.f40551x0, (e2.h) new lf(znVar, 1));
                znVar.u7();
                dk dkVar = znVar.X2;
                if (dkVar != null) {
                    dkVar.setTranslationX(znVar.R8() / 2.0f);
                }
                ck ckVar = znVar.Y2;
                if (ckVar != null) {
                    ckVar.setTranslationX(znVar.R8() / 2.0f);
                }
                FrameLayout frameLayout = znVar.Q0;
                if (frameLayout != null) {
                    frameLayout.setTranslationX(znVar.R8() / 2.0f);
                }
                znVar.S6();
                znVar.t7();
                return;
            case 6:
                bf1 a02 = bf1.a0(-znVar.T5, 0L);
                a02.f32425y = znVar;
                znVar.presentFragment(a02);
                return;
            case 7:
                znVar.getNotificationCenter().onAnimationFinish(znVar.F9);
                return;
            case 8:
                znVar.f40377j1.d(true);
                return;
            case 9:
                AndroidUtilities.removeFromParent(znVar.K0);
                return;
            case 10:
                int childCount = znVar.f40551x0.getChildCount();
                while (i12 < childCount) {
                    View childAt = znVar.f40551x0.getChildAt(i12);
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
                znVar.Ab = true;
                znVar.xc(true);
                return;
            case 12:
                zn.K0(znVar);
                return;
            case 13:
                cl clVar = znVar.f40273ab;
                if (clVar != null) {
                    clVar.requestLayout();
                    return;
                }
                return;
            case 14:
                TLRPC.UserFull userFull = znVar.f40270a8;
                if (userFull != null) {
                    chatTheme = userFull.theme;
                }
                znVar.ib(chatTheme);
                return;
            case 15:
                zn.f1(znVar);
                return;
            case 16:
                znVar.resumeDelayedFragmentAnimation();
                nk nkVar = znVar.W9;
                AndroidUtilities.cancelRunOnUIThread(nkVar);
                nkVar.run();
                znVar.getNotificationCenter().runDelayedNotifications();
                return;
            case 17:
                znVar.L7 = Integer.MAX_VALUE;
                znVar.N7 = false;
                znVar.O7 = 0L;
                znVar.P7 = null;
                znVar.Q7 = null;
                znVar.R7 = null;
                znVar.S7 = -1;
                znVar.M7 = false;
                znVar.Wc(false);
                znVar.U7 = null;
                return;
            case 18:
                znVar.vb(false, true);
                return;
            case 19:
                znVar.bc(true);
                return;
            case 20:
                znVar.Z6();
                return;
            case 21:
                znVar.Y.H0();
                return;
            case 22:
                AndroidUtilities.forEachViews((RecyclerView) znVar.f40551x0, (e2.h) new ai.i(21));
                lm lmVar = znVar.A0;
                if (lmVar != null) {
                    lmVar.O(true);
                    return;
                }
                return;
            case 23:
                zn znVar2 = this.f35715b;
                int i13 = znVar2.f40458pb;
                if (i13 != 0) {
                    znVar2.E(i13, znVar2.f40470qb, znVar2.f40498sb, znVar2.f40523ub, znVar2.f40484rb, znVar2.f40510tb);
                    znVar2.f40458pb = 0;
                    return;
                }
                return;
            case 24:
                if (!znVar.f40403l3 && znVar.f40551x0 != null && znVar.getParentActivity() != null && znVar.fragmentView != null) {
                    org.telegram.ui.Components.qp qpVar = znVar.f40527v2;
                    if (qpVar == null || qpVar.getTag() == null) {
                        if (znVar.f40527v2 == null) {
                            rm rmVar = znVar.X0;
                            int indexOfChild = rmVar.indexOfChild(znVar.S);
                            if (indexOfChild != -1) {
                                org.telegram.ui.Components.qp qpVar2 = new org.telegram.ui.Components.qp(znVar.getParentActivity(), znVar.f40324ea);
                                znVar.f40527v2 = qpVar2;
                                rmVar.addView(qpVar2, indexOfChild + 1, w7.y5.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                                znVar.f40527v2.setAlpha(0.0f);
                                znVar.f40527v2.setVisibility(4);
                            } else {
                                return;
                            }
                        }
                        int childCount2 = znVar.f40551x0.getChildCount();
                        int i14 = 0;
                        while (i14 < childCount2) {
                            View childAt2 = znVar.f40551x0.getChildAt(i14);
                            if ((childAt2 instanceof org.telegram.ui.Cells.u1) && (messageObject = (u1Var = (org.telegram.ui.Cells.u1) childAt2).getMessageObject()) != null && messageObject.isOutOwner() && messageObject.isSent()) {
                                org.telegram.ui.Components.qp qpVar3 = znVar.f40527v2;
                                ImageView imageView = qpVar3.f27646c;
                                org.telegram.ui.Components.og ogVar = qpVar3.e;
                                if (ogVar != null) {
                                    AndroidUtilities.cancelRunOnUIThread(ogVar);
                                    qpVar3.e = null;
                                }
                                int[] iArr = new int[2];
                                u1Var.getLocationInWindow(iArr);
                                int i15 = iArr[c10];
                                ((View) qpVar3.getParent()).getLocationInWindow(iArr);
                                int i16 = i15 - iArr[1];
                                View view = (View) u1Var.getParent();
                                qpVar3.measure(View.MeasureSpec.makeMeasureSpec(1000, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(1000, Integer.MIN_VALUE));
                                if (i16 > AndroidUtilities.dp(10.0f) + qpVar3.getMeasuredHeight()) {
                                    int C = org.telegram.messenger.l0.C(6.0f, u1Var.getChecksY(), i16);
                                    int dp = AndroidUtilities.dp(5.0f) + u1Var.getChecksX();
                                    int measuredWidth = view.getMeasuredWidth();
                                    float measuredHeight = C - qpVar3.getMeasuredHeight();
                                    qpVar3.f27647f = measuredHeight;
                                    qpVar3.setTranslationY(measuredHeight);
                                    int left = u1Var.getLeft() + dp;
                                    int dp2 = AndroidUtilities.dp(15.0f);
                                    if (left > view.getMeasuredWidth() / 2) {
                                        int measuredWidth2 = (measuredWidth - qpVar3.getMeasuredWidth()) - AndroidUtilities.dp(20.0f);
                                        qpVar3.setTranslationX(measuredWidth2);
                                        dp2 += measuredWidth2;
                                    } else {
                                        qpVar3.setTranslationX(0.0f);
                                    }
                                    float left2 = ((u1Var.getLeft() + dp) - dp2) - (imageView.getMeasuredWidth() / 2);
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
                                    AnimatorSet animatorSet = qpVar3.d;
                                    if (animatorSet != null) {
                                        animatorSet.cancel();
                                        qpVar3.d = null;
                                    }
                                    qpVar3.setTag(1);
                                    qpVar3.setVisibility(0);
                                    AnimatorSet animatorSet2 = new AnimatorSet();
                                    qpVar3.d = animatorSet2;
                                    animatorSet2.playTogether(ObjectAnimator.ofFloat(qpVar3, View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(qpVar3, View.SCALE_X, 0.0f, 1.0f), ObjectAnimator.ofFloat(qpVar3, View.SCALE_Y, 0.0f, 1.0f));
                                    qpVar3.d.addListener(new org.telegram.ui.Components.pp(qpVar3, 0));
                                    qpVar3.d.setDuration(180L);
                                    qpVar3.d.start();
                                    while (i12 < 2) {
                                        ViewPropertyAnimator interpolator = qpVar3.f27644a[i12].animate().scaleX(1.04f).scaleY(1.04f).setInterpolator(org.telegram.ui.Components.qr.f27655i);
                                        if (i12 == 0) {
                                            i10 = 132;
                                        } else {
                                            i10 = 500;
                                        }
                                        interpolator.setStartDelay(i10 + 140).setDuration(100L).setListener(new ei.v2(qpVar3, i12, 6)).start();
                                        i12++;
                                    }
                                    znVar.getMessagesController().removeSuggestion(0L, "NEWCOMER_TICKS");
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
                AndroidUtilities.forEachViews((RecyclerView) znVar.f40551x0, (e2.h) new ai.i(22));
                lm lmVar2 = znVar.A0;
                if (lmVar2 != null) {
                    lmVar2.O(false);
                    return;
                }
                return;
            case 26:
                zn.y0(znVar);
                return;
            case 27:
                mk mkVar2 = znVar.Y;
                if (mkVar2 != null && znVar.nb != 5) {
                    mkVar2.H0();
                    return;
                }
                return;
            case 28:
                org.telegram.ui.Components.qo qoVar = ((org.telegram.ui.Components.qo[]) znVar.f40263a0.f782b)[0];
                org.telegram.ui.ActionBar.j5 j5Var = qoVar.d;
                org.telegram.ui.ActionBar.j5 j5Var2 = qoVar.e;
                znVar.F1 = !znVar.F1;
                j5Var.setPivotX(0.0f);
                j5Var2.setPivotX(0.0f);
                if (znVar.F1) {
                    j5Var.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                    j5Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                } else {
                    j5Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                    j5Var2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                }
                AndroidUtilities.runOnUIThread(znVar.G1, 6000L);
                return;
            default:
                znVar.uc();
                return;
        }
    }
}
