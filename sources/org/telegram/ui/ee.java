package org.telegram.ui;

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
public final class ee implements Runnable {
    public final int f37796a;
    public final tn f37797b;

    public ee(tn tnVar, int i10) {
        this.f37796a = i10;
        this.f37797b = tnVar;
    }

    @Override
    public final void run() {
        dk dkVar;
        org.telegram.ui.Cells.s1 s1Var;
        MessageObject messageObject;
        int i10;
        int i11 = this.f37796a;
        TLRPC.ChatTheme chatTheme = null;
        char c3 = 1;
        int i12 = 0;
        tn tnVar = this.f37797b;
        switch (i11) {
            case 0:
                tnVar.H5 = null;
                if (tnVar.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(tnVar.getParentActivity(), 0, tnVar.f42746aa);
                    boolean isChannel = ChatObject.isChannel(tnVar.f42787e);
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
                    if (isChannel && !tnVar.f42787e.megagroup) {
                        c2Var.P = LocaleController.getString(R.string.JoinByPeekChannelText);
                        c2Var.N = LocaleController.getString(R.string.JoinByPeekChannelTitle);
                    } else {
                        c2Var.P = LocaleController.getString(R.string.JoinByPeekGroupText);
                        c2Var.N = LocaleController.getString(R.string.JoinByPeekGroupTitle);
                    }
                    alertDialog$Builder.k(LocaleController.getString(R.string.JoinByPeekJoin), new me(tnVar, 0));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new me(tnVar, 1));
                    tnVar.showDialog(c2Var);
                    return;
                }
                return;
            case 1:
                tnVar.Y6();
                return;
            case 2:
                tn.i0(tnVar);
                return;
            case 3:
                tnVar.oa(null, tnVar.f42920o8);
                tnVar.f42920o8 = null;
                return;
            case 4:
                if (!org.telegram.ui.ActionBar.o2.hasSheets(tnVar) && (dkVar = tnVar.U) != null) {
                    dkVar.setFieldFocused(true);
                    tnVar.U.H0();
                    return;
                }
                return;
            case 5:
                tnVar.o9();
                AndroidUtilities.forEachViews((RecyclerView) tnVar.f42973t0, (f5.d) new uf(tnVar, 1));
                tnVar.u7();
                uj ujVar = tnVar.T2;
                if (ujVar != null) {
                    ujVar.setTranslationX(tnVar.R8() / 2.0f);
                }
                tj tjVar = tnVar.U2;
                if (tjVar != null) {
                    tjVar.setTranslationX(tnVar.R8() / 2.0f);
                }
                FrameLayout frameLayout = tnVar.M0;
                if (frameLayout != null) {
                    frameLayout.setTranslationX(tnVar.R8() / 2.0f);
                }
                tnVar.S6();
                tnVar.t7();
                return;
            case 6:
                td1 a02 = td1.a0(-tnVar.P5, 0L);
                a02.f42670y = tnVar;
                tnVar.presentFragment(a02);
                return;
            case 7:
                tnVar.getNotificationCenter().onAnimationFinish(tnVar.B9);
                return;
            case 8:
                tnVar.f42803f1.d(true);
                return;
            case 9:
                int childCount = tnVar.f42973t0.getChildCount();
                while (i12 < childCount) {
                    View childAt = tnVar.f42973t0.getChildAt(i12);
                    if (childAt instanceof org.telegram.ui.Cells.s1) {
                        org.telegram.ui.Cells.s1 s1Var2 = (org.telegram.ui.Cells.s1) childAt;
                        if (s1Var2.getMessageObject().type == 4) {
                            s1Var2.t2();
                        }
                    }
                    i12++;
                }
                return;
            case 10:
                tnVar.xb = true;
                tnVar.xc(true);
                return;
            case 11:
                uk ukVar = tnVar.Xa;
                if (ukVar != null) {
                    ukVar.requestLayout();
                    return;
                }
                return;
            case 12:
                tn.E0(tnVar);
                return;
            case 13:
                TLRPC.UserFull userFull = tnVar.W7;
                if (userFull != null) {
                    chatTheme = userFull.theme;
                }
                tnVar.ib(chatTheme);
                return;
            case 14:
                tn.o1(tnVar);
                return;
            case 15:
                tnVar.H7 = Integer.MAX_VALUE;
                tnVar.J7 = false;
                tnVar.K7 = 0L;
                tnVar.L7 = null;
                tnVar.M7 = null;
                tnVar.N7 = null;
                tnVar.O7 = -1;
                tnVar.I7 = false;
                tnVar.Wc(false);
                tnVar.Q7 = null;
                return;
            case 16:
                tnVar.resumeDelayedFragmentAnimation();
                ek ekVar = tnVar.S9;
                AndroidUtilities.cancelRunOnUIThread(ekVar);
                ekVar.run();
                tnVar.getNotificationCenter().runDelayedNotifications();
                return;
            case 17:
                tnVar.vb(false, true);
                return;
            case 18:
                tnVar.bc(true);
                return;
            case 19:
                tnVar.Z6();
                return;
            case 20:
                tnVar.U.H0();
                return;
            case 21:
                tnVar.f42893m7 = null;
                xk xkVar = tnVar.X2;
                if (xkVar != null) {
                    org.telegram.ui.Components.m50 cameraContainer = xkVar.getCameraContainer();
                    AnimatorSet animatorSet = new AnimatorSet();
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cameraContainer, View.SCALE_X, 0.5f);
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(cameraContainer, View.SCALE_Y, 0.5f);
                    Property property = View.ALPHA;
                    animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(cameraContainer, property, 0.0f), ObjectAnimator.ofFloat(tnVar.X2.getButtonsLayout(), property, 0.0f), ObjectAnimator.ofInt(tnVar.X2.getPaint(), org.telegram.ui.Components.r6.f32221b, 0), ObjectAnimator.ofFloat(tnVar.X2.getMuteImageView(), property, 0.0f));
                    animatorSet.addListener(new oi(tnVar, 0));
                    animatorSet.start();
                    return;
                }
                return;
            case 22:
                AndroidUtilities.forEachViews((RecyclerView) tnVar.f42973t0, (f5.d) new l4.x0(6));
                em emVar = tnVar.f43013w0;
                if (emVar != null) {
                    emVar.O(true);
                    return;
                }
                return;
            case 23:
                tn tnVar2 = this.f37797b;
                int i13 = tnVar2.f42896mb;
                if (i13 != 0) {
                    tnVar2.j(i13, tnVar2.f42910nb, tnVar2.ob, tnVar2.f42935pb, tnVar2.qb, tnVar2.f42957rb);
                    tnVar2.f42896mb = 0;
                    return;
                }
                return;
            case 24:
                if (!tnVar.f42829h3 && tnVar.f42973t0 != null && tnVar.getParentActivity() != null && tnVar.fragmentView != null) {
                    org.telegram.ui.Components.kp kpVar = tnVar.f42950r2;
                    if (kpVar == null || kpVar.getTag() == null) {
                        if (tnVar.f42950r2 == null) {
                            km kmVar = tnVar.T0;
                            int indexOfChild = kmVar.indexOfChild(tnVar.O);
                            if (indexOfChild != -1) {
                                org.telegram.ui.Components.kp kpVar2 = new org.telegram.ui.Components.kp(tnVar.getParentActivity(), tnVar.f42746aa);
                                tnVar.f42950r2 = kpVar2;
                                kmVar.addView(kpVar2, indexOfChild + 1, i7.f6.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                                tnVar.f42950r2.setAlpha(0.0f);
                                tnVar.f42950r2.setVisibility(4);
                            } else {
                                return;
                            }
                        }
                        int childCount2 = tnVar.f42973t0.getChildCount();
                        int i14 = 0;
                        while (i14 < childCount2) {
                            View childAt2 = tnVar.f42973t0.getChildAt(i14);
                            if ((childAt2 instanceof org.telegram.ui.Cells.s1) && (messageObject = (s1Var = (org.telegram.ui.Cells.s1) childAt2).getMessageObject()) != null && messageObject.isOutOwner() && messageObject.isSent()) {
                                org.telegram.ui.Components.kp kpVar3 = tnVar.f42950r2;
                                ImageView imageView = kpVar3.f30123c;
                                org.telegram.ui.Components.ig igVar = kpVar3.f30124e;
                                if (igVar != null) {
                                    AndroidUtilities.cancelRunOnUIThread(igVar);
                                    kpVar3.f30124e = null;
                                }
                                int[] iArr = new int[2];
                                s1Var.getLocationInWindow(iArr);
                                int i15 = iArr[c3];
                                ((View) kpVar3.getParent()).getLocationInWindow(iArr);
                                int i16 = i15 - iArr[1];
                                View view = (View) s1Var.getParent();
                                kpVar3.measure(View.MeasureSpec.makeMeasureSpec(1000, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(1000, Integer.MIN_VALUE));
                                if (i16 > AndroidUtilities.dp(10.0f) + kpVar3.getMeasuredHeight()) {
                                    int C = org.telegram.messenger.x3.C(6.0f, s1Var.getChecksY(), i16);
                                    int dp = AndroidUtilities.dp(5.0f) + s1Var.getChecksX();
                                    int measuredWidth = view.getMeasuredWidth();
                                    float measuredHeight = C - kpVar3.getMeasuredHeight();
                                    kpVar3.f30125f = measuredHeight;
                                    kpVar3.setTranslationY(measuredHeight);
                                    int left = s1Var.getLeft() + dp;
                                    int dp2 = AndroidUtilities.dp(15.0f);
                                    if (left > view.getMeasuredWidth() / 2) {
                                        int measuredWidth2 = (measuredWidth - kpVar3.getMeasuredWidth()) - AndroidUtilities.dp(20.0f);
                                        kpVar3.setTranslationX(measuredWidth2);
                                        dp2 += measuredWidth2;
                                    } else {
                                        kpVar3.setTranslationX(0.0f);
                                    }
                                    float left2 = ((s1Var.getLeft() + dp) - dp2) - (imageView.getMeasuredWidth() / 2);
                                    imageView.setTranslationX(left2);
                                    if (left > view.getMeasuredWidth() / 2) {
                                        if (left2 < AndroidUtilities.dp(10.0f)) {
                                            float dp3 = left2 - AndroidUtilities.dp(10.0f);
                                            kpVar3.setTranslationX(kpVar3.getTranslationX() + dp3);
                                            imageView.setTranslationX(left2 - dp3);
                                        }
                                    } else if (left2 > kpVar3.getMeasuredWidth() - AndroidUtilities.dp(24.0f)) {
                                        float measuredWidth3 = (left2 - kpVar3.getMeasuredWidth()) + AndroidUtilities.dp(24.0f);
                                        kpVar3.setTranslationX(measuredWidth3);
                                        imageView.setTranslationX(left2 - measuredWidth3);
                                    } else if (left2 < AndroidUtilities.dp(10.0f)) {
                                        float dp4 = left2 - AndroidUtilities.dp(10.0f);
                                        kpVar3.setTranslationX(kpVar3.getTranslationX() + dp4);
                                        imageView.setTranslationX(left2 - dp4);
                                    }
                                    kpVar3.setPivotX(left2);
                                    kpVar3.setPivotY(kpVar3.getMeasuredHeight());
                                    AnimatorSet animatorSet2 = kpVar3.d;
                                    if (animatorSet2 != null) {
                                        animatorSet2.cancel();
                                        kpVar3.d = null;
                                    }
                                    kpVar3.setTag(1);
                                    kpVar3.setVisibility(0);
                                    AnimatorSet animatorSet3 = new AnimatorSet();
                                    kpVar3.d = animatorSet3;
                                    animatorSet3.playTogether(ObjectAnimator.ofFloat(kpVar3, View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(kpVar3, View.SCALE_X, 0.0f, 1.0f), ObjectAnimator.ofFloat(kpVar3, View.SCALE_Y, 0.0f, 1.0f));
                                    kpVar3.d.addListener(new org.telegram.ui.Components.jp(kpVar3, 0));
                                    kpVar3.d.setDuration(180L);
                                    kpVar3.d.start();
                                    while (i12 < 2) {
                                        ViewPropertyAnimator interpolator = kpVar3.f30121a[i12].animate().scaleX(1.04f).scaleY(1.04f).setInterpolator(org.telegram.ui.Components.jr.f29802i);
                                        if (i12 == 0) {
                                            i10 = 132;
                                        } else {
                                            i10 = 500;
                                        }
                                        interpolator.setStartDelay(i10 + 140).setDuration(100L).setListener(new org.telegram.ui.Cells.z3(kpVar3, i12, 3)).start();
                                        i12++;
                                    }
                                    tnVar.getMessagesController().removeSuggestion(0L, "NEWCOMER_TICKS");
                                    return;
                                }
                            }
                            i14++;
                            c3 = 1;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 25:
                AndroidUtilities.forEachViews((RecyclerView) tnVar.f42973t0, (f5.d) new l4.x0(5));
                em emVar2 = tnVar.f43013w0;
                if (emVar2 != null) {
                    emVar2.O(false);
                    return;
                }
                return;
            case 26:
                tn.w0(tnVar);
                return;
            case 27:
                dk dkVar2 = tnVar.U;
                if (dkVar2 != null && tnVar.f42874kb != 5) {
                    dkVar2.H0();
                    return;
                }
                return;
            case 28:
                org.telegram.ui.Components.ko koVar = ((org.telegram.ui.Components.ko[]) tnVar.W.f2608b)[0];
                org.telegram.ui.ActionBar.h5 h5Var = koVar.d;
                org.telegram.ui.ActionBar.h5 h5Var2 = koVar.f30115e;
                tnVar.B1 = !tnVar.B1;
                h5Var.setPivotX(0.0f);
                h5Var2.setPivotX(0.0f);
                if (tnVar.B1) {
                    h5Var.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                    h5Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                } else {
                    h5Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                    h5Var2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                }
                AndroidUtilities.runOnUIThread(tnVar.C1, 6000L);
                return;
            default:
                tnVar.uc();
                return;
        }
    }
}
