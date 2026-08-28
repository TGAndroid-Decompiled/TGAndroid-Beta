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
public final class ge implements Runnable {
    public final int f38516a;
    public final qn f38517b;

    public ge(qn qnVar, int i9) {
        this.f38516a = i9;
        this.f38517b = qnVar;
    }

    @Override
    public final void run() {
        ak akVar;
        int i9;
        org.telegram.ui.Cells.t1 t1Var;
        MessageObject messageObject;
        int i10;
        int i11 = this.f38516a;
        TLRPC.ChatTheme chatTheme = null;
        int i12 = 0;
        qn qnVar = this.f38517b;
        switch (i11) {
            case 0:
                qnVar.H5 = null;
                if (qnVar.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qnVar.getParentActivity(), 0, qnVar.f41848aa);
                    boolean isChannel = ChatObject.isChannel(qnVar.f41890e);
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
                    if (isChannel && !qnVar.f41890e.megagroup) {
                        c2Var.P = LocaleController.getString(R.string.JoinByPeekChannelText);
                        c2Var.N = LocaleController.getString(R.string.JoinByPeekChannelTitle);
                    } else {
                        c2Var.P = LocaleController.getString(R.string.JoinByPeekGroupText);
                        c2Var.N = LocaleController.getString(R.string.JoinByPeekGroupTitle);
                    }
                    alertDialog$Builder.k(LocaleController.getString(R.string.JoinByPeekJoin), new oe(qnVar, 0));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new oe(qnVar, 1));
                    qnVar.showDialog(c2Var);
                    return;
                }
                return;
            case 1:
                qnVar.Y6();
                return;
            case 2:
                qn.h0(qnVar);
                return;
            case 3:
                qnVar.oa(null, qnVar.f42022o8);
                qnVar.f42022o8 = null;
                return;
            case 4:
                if (!org.telegram.ui.ActionBar.o2.hasSheets(qnVar) && (akVar = qnVar.U) != null) {
                    akVar.setFieldFocused(true);
                    qnVar.U.G0();
                    return;
                }
                return;
            case 5:
                qnVar.o9();
                AndroidUtilities.forEachViews((RecyclerView) qnVar.f42077t0, (d5.d) new xf(qnVar, 1));
                qnVar.u7();
                rj rjVar = qnVar.T2;
                if (rjVar != null) {
                    rjVar.setTranslationX(qnVar.R8() / 2.0f);
                }
                qj qjVar = qnVar.U2;
                if (qjVar != null) {
                    qjVar.setTranslationX(qnVar.R8() / 2.0f);
                }
                FrameLayout frameLayout = qnVar.M0;
                if (frameLayout != null) {
                    frameLayout.setTranslationX(qnVar.R8() / 2.0f);
                }
                qnVar.S6();
                qnVar.t7();
                return;
            case 6:
                rd1 Z = rd1.Z(-qnVar.P5, 0L);
                Z.f42379y = qnVar;
                qnVar.presentFragment(Z);
                return;
            case 7:
                qnVar.getNotificationCenter().onAnimationFinish(qnVar.B9);
                return;
            case 8:
                qnVar.f41905f1.d(true);
                return;
            case 9:
                int childCount = qnVar.f42077t0.getChildCount();
                while (i12 < childCount) {
                    View childAt = qnVar.f42077t0.getChildAt(i12);
                    if (childAt instanceof org.telegram.ui.Cells.t1) {
                        org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) childAt;
                        if (t1Var2.getMessageObject().type == 4) {
                            t1Var2.t2();
                        }
                    }
                    i12++;
                }
                return;
            case 10:
                qnVar.f42138xb = true;
                qnVar.xc(true);
                return;
            case 11:
                rk rkVar = qnVar.Xa;
                if (rkVar != null) {
                    rkVar.requestLayout();
                    return;
                }
                return;
            case 12:
                qn.D0(qnVar);
                return;
            case 13:
                TLRPC.UserFull userFull = qnVar.W7;
                if (userFull != null) {
                    chatTheme = userFull.theme;
                }
                qnVar.ib(chatTheme);
                return;
            case 14:
                qn.o1(qnVar);
                return;
            case 15:
                qnVar.H7 = Integer.MAX_VALUE;
                qnVar.J7 = false;
                qnVar.K7 = 0L;
                qnVar.L7 = null;
                qnVar.M7 = null;
                qnVar.N7 = null;
                qnVar.O7 = -1;
                qnVar.I7 = false;
                qnVar.Wc(false);
                qnVar.Q7 = null;
                return;
            case 16:
                qnVar.resumeDelayedFragmentAnimation();
                bk bkVar = qnVar.S9;
                AndroidUtilities.cancelRunOnUIThread(bkVar);
                bkVar.run();
                qnVar.getNotificationCenter().runDelayedNotifications();
                return;
            case 17:
                qnVar.vb(false, true);
                return;
            case 18:
                qnVar.bc(true);
                return;
            case 19:
                qnVar.Z6();
                return;
            case 20:
                qnVar.U.G0();
                return;
            case 21:
                qnVar.f41996m7 = null;
                uk ukVar = qnVar.X2;
                if (ukVar != null) {
                    org.telegram.ui.Components.y40 cameraContainer = ukVar.getCameraContainer();
                    AnimatorSet animatorSet = new AnimatorSet();
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cameraContainer, View.SCALE_X, 0.5f);
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(cameraContainer, View.SCALE_Y, 0.5f);
                    Property property = View.ALPHA;
                    animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(cameraContainer, property, 0.0f), ObjectAnimator.ofFloat(qnVar.X2.getButtonsLayout(), property, 0.0f), ObjectAnimator.ofInt(qnVar.X2.getPaint(), org.telegram.ui.Components.m6.f30701b, 0), ObjectAnimator.ofFloat(qnVar.X2.getMuteImageView(), property, 0.0f));
                    animatorSet.addListener(new li(qnVar, 0));
                    animatorSet.start();
                    return;
                }
                return;
            case 22:
                AndroidUtilities.forEachViews((RecyclerView) qnVar.f42077t0, (d5.d) new ih.e(6));
                bm bmVar = qnVar.f42114w0;
                if (bmVar != null) {
                    bmVar.O(true);
                    return;
                }
                return;
            case 23:
                qn qnVar2 = this.f38517b;
                int i13 = qnVar2.mb;
                if (i13 != 0) {
                    qnVar2.j(i13, qnVar2.f42013nb, qnVar2.ob, qnVar2.f42034pb, qnVar2.f42047qb, qnVar2.f42061rb);
                    qnVar2.mb = 0;
                    return;
                }
                return;
            case 24:
                if (!qnVar.f41932h3 && qnVar.f42077t0 != null && qnVar.getParentActivity() != null && qnVar.fragmentView != null) {
                    org.telegram.ui.Components.gp gpVar = qnVar.f42052r2;
                    if (gpVar == null || gpVar.getTag() == null) {
                        if (qnVar.f42052r2 == null) {
                            im imVar = qnVar.T0;
                            int indexOfChild = imVar.indexOfChild(qnVar.O);
                            if (indexOfChild != -1) {
                                i9 = 1;
                                org.telegram.ui.Components.gp gpVar2 = new org.telegram.ui.Components.gp(qnVar.getParentActivity(), qnVar.f41848aa);
                                qnVar.f42052r2 = gpVar2;
                                imVar.addView(gpVar2, indexOfChild + 1, g7.e6.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                                qnVar.f42052r2.setAlpha(0.0f);
                                qnVar.f42052r2.setVisibility(4);
                            } else {
                                return;
                            }
                        } else {
                            i9 = 1;
                        }
                        int childCount2 = qnVar.f42077t0.getChildCount();
                        for (int i14 = 0; i14 < childCount2; i14++) {
                            View childAt2 = qnVar.f42077t0.getChildAt(i14);
                            if ((childAt2 instanceof org.telegram.ui.Cells.t1) && (messageObject = (t1Var = (org.telegram.ui.Cells.t1) childAt2).getMessageObject()) != null && messageObject.isOutOwner() && messageObject.isSent()) {
                                org.telegram.ui.Components.gp gpVar3 = qnVar.f42052r2;
                                ImageView imageView = gpVar3.f28833c;
                                org.telegram.ui.Components.fg fgVar = gpVar3.f28834e;
                                if (fgVar != null) {
                                    AndroidUtilities.cancelRunOnUIThread(fgVar);
                                    gpVar3.f28834e = null;
                                }
                                int[] iArr = new int[2];
                                t1Var.getLocationInWindow(iArr);
                                int i15 = iArr[i9];
                                ((View) gpVar3.getParent()).getLocationInWindow(iArr);
                                int i16 = i15 - iArr[i9];
                                View view = (View) t1Var.getParent();
                                gpVar3.measure(View.MeasureSpec.makeMeasureSpec(1000, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(1000, Integer.MIN_VALUE));
                                if (i16 > AndroidUtilities.dp(10.0f) + gpVar3.getMeasuredHeight()) {
                                    int C = org.telegram.messenger.l0.C(6.0f, t1Var.getChecksY(), i16);
                                    int dp = AndroidUtilities.dp(5.0f) + t1Var.getChecksX();
                                    int measuredWidth = view.getMeasuredWidth();
                                    float measuredHeight = C - gpVar3.getMeasuredHeight();
                                    gpVar3.f28835f = measuredHeight;
                                    gpVar3.setTranslationY(measuredHeight);
                                    int left = t1Var.getLeft() + dp;
                                    int dp2 = AndroidUtilities.dp(15.0f);
                                    if (left > view.getMeasuredWidth() / 2) {
                                        int measuredWidth2 = (measuredWidth - gpVar3.getMeasuredWidth()) - AndroidUtilities.dp(20.0f);
                                        gpVar3.setTranslationX(measuredWidth2);
                                        dp2 += measuredWidth2;
                                    } else {
                                        gpVar3.setTranslationX(0.0f);
                                    }
                                    float left2 = ((t1Var.getLeft() + dp) - dp2) - (imageView.getMeasuredWidth() / 2);
                                    imageView.setTranslationX(left2);
                                    if (left > view.getMeasuredWidth() / 2) {
                                        if (left2 < AndroidUtilities.dp(10.0f)) {
                                            float dp3 = left2 - AndroidUtilities.dp(10.0f);
                                            gpVar3.setTranslationX(gpVar3.getTranslationX() + dp3);
                                            imageView.setTranslationX(left2 - dp3);
                                        }
                                    } else if (left2 > gpVar3.getMeasuredWidth() - AndroidUtilities.dp(24.0f)) {
                                        float measuredWidth3 = (left2 - gpVar3.getMeasuredWidth()) + AndroidUtilities.dp(24.0f);
                                        gpVar3.setTranslationX(measuredWidth3);
                                        imageView.setTranslationX(left2 - measuredWidth3);
                                    } else if (left2 < AndroidUtilities.dp(10.0f)) {
                                        float dp4 = left2 - AndroidUtilities.dp(10.0f);
                                        gpVar3.setTranslationX(gpVar3.getTranslationX() + dp4);
                                        imageView.setTranslationX(left2 - dp4);
                                    }
                                    gpVar3.setPivotX(left2);
                                    gpVar3.setPivotY(gpVar3.getMeasuredHeight());
                                    AnimatorSet animatorSet2 = gpVar3.d;
                                    if (animatorSet2 != null) {
                                        animatorSet2.cancel();
                                        gpVar3.d = null;
                                    }
                                    gpVar3.setTag(Integer.valueOf(i9));
                                    gpVar3.setVisibility(0);
                                    AnimatorSet animatorSet3 = new AnimatorSet();
                                    gpVar3.d = animatorSet3;
                                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(gpVar3, View.ALPHA, 0.0f, 1.0f);
                                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(gpVar3, View.SCALE_X, 0.0f, 1.0f);
                                    ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(gpVar3, View.SCALE_Y, 0.0f, 1.0f);
                                    Animator[] animatorArr = new Animator[3];
                                    animatorArr[0] = ofFloat3;
                                    animatorArr[i9] = ofFloat4;
                                    animatorArr[2] = ofFloat5;
                                    animatorSet3.playTogether(animatorArr);
                                    gpVar3.d.addListener(new org.telegram.ui.Components.fp(gpVar3, 0));
                                    gpVar3.d.setDuration(180L);
                                    gpVar3.d.start();
                                    while (i12 < 2) {
                                        ViewPropertyAnimator interpolator = gpVar3.f28831a[i12].animate().scaleX(1.04f).scaleY(1.04f).setInterpolator(org.telegram.ui.Components.gr.f28846i);
                                        if (i12 == 0) {
                                            i10 = 132;
                                        } else {
                                            i10 = 500;
                                        }
                                        interpolator.setStartDelay(i10 + 140).setDuration(100L).setListener(new mh.o2(gpVar3, i12, 5)).start();
                                        i12++;
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
            case 25:
                AndroidUtilities.forEachViews((RecyclerView) qnVar.f42077t0, (d5.d) new ih.e(5));
                bm bmVar2 = qnVar.f42114w0;
                if (bmVar2 != null) {
                    bmVar2.O(false);
                    return;
                }
                return;
            case 26:
                qn.v0(qnVar);
                return;
            case 27:
                ak akVar2 = qnVar.U;
                if (akVar2 != null && qnVar.f41976kb != 5) {
                    akVar2.G0();
                    return;
                }
                return;
            case 28:
                org.telegram.ui.Components.go goVar = ((org.telegram.ui.Components.go[]) qnVar.W.f6412b)[0];
                org.telegram.ui.ActionBar.h5 h5Var = goVar.d;
                org.telegram.ui.ActionBar.h5 h5Var2 = goVar.f28824e;
                qnVar.B1 = !qnVar.B1;
                h5Var.setPivotX(0.0f);
                h5Var2.setPivotX(0.0f);
                if (qnVar.B1) {
                    h5Var.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                    h5Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                } else {
                    h5Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                    h5Var2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                }
                AndroidUtilities.runOnUIThread(qnVar.C1, 6000L);
                return;
            default:
                qnVar.uc();
                return;
        }
    }
}
