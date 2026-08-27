package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
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

    public final int f38393a;

    public final rn f38394b;

    public ge(rn rnVar, int i10) {
        this.f38393a = i10;
        this.f38394b = rnVar;
    }

    @Override
    public final void run() {
        ck ckVar;
        int i10;
        org.telegram.ui.Cells.s1 s1Var;
        MessageObject messageObject;
        int i11 = this.f38393a;
        int i12 = 6;
        int i13 = 5;
        int i14 = 0;
        rn rnVar = this.f38394b;
        switch (i11) {
            case 0:
                rnVar.H5 = null;
                if (rnVar.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(rnVar.getParentActivity(), 0, rnVar.f41983aa);
                    boolean zIsChannel = ChatObject.isChannel(rnVar.f42026e);
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
                    if (!zIsChannel || rnVar.f42026e.megagroup) {
                        b2Var.P = LocaleController.getString(R.string.JoinByPeekGroupText);
                        b2Var.N = LocaleController.getString(R.string.JoinByPeekGroupTitle);
                    } else {
                        b2Var.P = LocaleController.getString(R.string.JoinByPeekChannelText);
                        b2Var.N = LocaleController.getString(R.string.JoinByPeekChannelTitle);
                    }
                    alertDialog$Builder.k(LocaleController.getString(R.string.JoinByPeekJoin), new oe(rnVar, i14));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new oe(rnVar, 1));
                    rnVar.showDialog(b2Var);
                    break;
                }
                break;
            case 1:
                rnVar.Y6();
                break;
            case 2:
                rn.i0(rnVar);
                break;
            case 3:
                rnVar.oa(null, rnVar.f42159o8);
                rnVar.f42159o8 = null;
                break;
            case 4:
                if (!org.telegram.ui.ActionBar.n2.hasSheets(rnVar) && (ckVar = rnVar.U) != null) {
                    ckVar.setFieldFocused(true);
                    rnVar.U.H0();
                    break;
                }
                break;
            case 5:
                rnVar.o9();
                AndroidUtilities.forEachViews((RecyclerView) rnVar.f42213t0, (d5.d) new xf(rnVar, 1));
                rnVar.u7();
                tj tjVar = rnVar.T2;
                if (tjVar != null) {
                    tjVar.setTranslationX(rnVar.R8() / 2.0f);
                }
                sj sjVar = rnVar.U2;
                if (sjVar != null) {
                    sjVar.setTranslationX(rnVar.R8() / 2.0f);
                }
                FrameLayout frameLayout = rnVar.M0;
                if (frameLayout != null) {
                    frameLayout.setTranslationX(rnVar.R8() / 2.0f);
                }
                rnVar.S6();
                rnVar.t7();
                break;
            case 6:
                sd1 sd1VarA0 = sd1.a0(-rnVar.P5, 0L);
                sd1VarA0.f42601y = rnVar;
                rnVar.presentFragment(sd1VarA0);
                break;
            case 7:
                rnVar.getNotificationCenter().onAnimationFinish(rnVar.B9);
                break;
            case 8:
                rnVar.f42041f1.d(true);
                break;
            case 9:
                int childCount = rnVar.f42213t0.getChildCount();
                while (i14 < childCount) {
                    View childAt = rnVar.f42213t0.getChildAt(i14);
                    if (childAt instanceof org.telegram.ui.Cells.s1) {
                        org.telegram.ui.Cells.s1 s1Var2 = (org.telegram.ui.Cells.s1) childAt;
                        if (s1Var2.getMessageObject().type == 4) {
                            s1Var2.s2();
                        }
                    }
                    i14++;
                }
                break;
            case 10:
                rnVar.f42274xb = true;
                rnVar.xc(true);
                break;
            case 11:
                tk tkVar = rnVar.Xa;
                if (tkVar != null) {
                    tkVar.requestLayout();
                }
                break;
            case 12:
                rn.E0(rnVar);
                break;
            case 13:
                TLRPC.UserFull userFull = rnVar.W7;
                rnVar.ib(userFull != null ? userFull.theme : null);
                break;
            case 14:
                rn.o1(rnVar);
                break;
            case 15:
                rnVar.H7 = Integer.MAX_VALUE;
                rnVar.J7 = false;
                rnVar.K7 = 0L;
                rnVar.L7 = null;
                rnVar.M7 = null;
                rnVar.N7 = null;
                rnVar.O7 = -1;
                rnVar.I7 = false;
                rnVar.Wc(false);
                rnVar.Q7 = null;
                break;
            case 16:
                rnVar.resumeDelayedFragmentAnimation();
                dk dkVar = rnVar.S9;
                AndroidUtilities.cancelRunOnUIThread(dkVar);
                dkVar.run();
                rnVar.getNotificationCenter().runDelayedNotifications();
                break;
            case 17:
                rnVar.vb(false, true);
                break;
            case 18:
                rnVar.bc(true);
                break;
            case 19:
                rnVar.Z6();
                break;
            case 20:
                rnVar.U.H0();
                break;
            case 21:
                rnVar.f42132m7 = null;
                wk wkVar = rnVar.X2;
                if (wkVar != null) {
                    org.telegram.ui.Components.d50 cameraContainer = wkVar.getCameraContainer();
                    AnimatorSet animatorSet = new AnimatorSet();
                    ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(cameraContainer, (Property<org.telegram.ui.Components.d50, Float>) View.SCALE_X, 0.5f);
                    ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(cameraContainer, (Property<org.telegram.ui.Components.d50, Float>) View.SCALE_Y, 0.5f);
                    Property property = View.ALPHA;
                    animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, ObjectAnimator.ofFloat(cameraContainer, (Property<org.telegram.ui.Components.d50, Float>) property, 0.0f), ObjectAnimator.ofFloat(rnVar.X2.getButtonsLayout(), (Property<View, Float>) property, 0.0f), ObjectAnimator.ofInt(rnVar.X2.getPaint(), org.telegram.ui.Components.m6.f30579b, 0), ObjectAnimator.ofFloat(rnVar.X2.getMuteImageView(), (Property<View, Float>) property, 0.0f));
                    animatorSet.addListener(new ni(rnVar, i14));
                    animatorSet.start();
                    break;
                }
                break;
            case 22:
                AndroidUtilities.forEachViews((RecyclerView) rnVar.f42213t0, (d5.d) new j4.w0(i12));
                dm dmVar = rnVar.f42252w0;
                if (dmVar != null) {
                    dmVar.O(true);
                }
                break;
            case 23:
                rn rnVar2 = this.f38394b;
                int i15 = rnVar2.f42136mb;
                if (i15 != 0) {
                    rnVar2.j(i15, rnVar2.nb, rnVar2.f42162ob, rnVar2.pb, rnVar2.f42183qb, rnVar2.f42197rb);
                    rnVar2.f42136mb = 0;
                }
                break;
            case 24:
                if (!rnVar.f42067h3 && rnVar.f42213t0 != null && rnVar.getParentActivity() != null && rnVar.fragmentView != null) {
                    org.telegram.ui.Components.ep epVar = rnVar.f42188r2;
                    if (epVar == null || epVar.getTag() == null) {
                        if (rnVar.f42188r2 == null) {
                            jm jmVar = rnVar.T0;
                            int iIndexOfChild = jmVar.indexOfChild(rnVar.O);
                            if (iIndexOfChild != -1) {
                                i10 = 1;
                                org.telegram.ui.Components.ep epVar2 = new org.telegram.ui.Components.ep(rnVar.getParentActivity(), rnVar.f41983aa);
                                rnVar.f42188r2 = epVar2;
                                jmVar.addView(epVar2, iIndexOfChild + 1, h7.z5.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                                rnVar.f42188r2.setAlpha(0.0f);
                                rnVar.f42188r2.setVisibility(4);
                            }
                        } else {
                            i10 = 1;
                        }
                        int childCount2 = rnVar.f42213t0.getChildCount();
                        for (int i16 = 0; i16 < childCount2; i16++) {
                            View childAt2 = rnVar.f42213t0.getChildAt(i16);
                            if ((childAt2 instanceof org.telegram.ui.Cells.s1) && (messageObject = (s1Var = (org.telegram.ui.Cells.s1) childAt2).getMessageObject()) != null && messageObject.isOutOwner() && messageObject.isSent()) {
                                org.telegram.ui.Components.ep epVar3 = rnVar.f42188r2;
                                ImageView imageView = epVar3.f28112c;
                                org.telegram.ui.Components.bg bgVar = epVar3.f28113e;
                                if (bgVar != null) {
                                    AndroidUtilities.cancelRunOnUIThread(bgVar);
                                    epVar3.f28113e = null;
                                }
                                int[] iArr = new int[2];
                                s1Var.getLocationInWindow(iArr);
                                int i17 = iArr[i10];
                                ((View) epVar3.getParent()).getLocationInWindow(iArr);
                                int i18 = i17 - iArr[i10];
                                View view = (View) s1Var.getParent();
                                epVar3.measure(View.MeasureSpec.makeMeasureSpec(1000, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(1000, Integer.MIN_VALUE));
                                if (i18 > AndroidUtilities.dp(10.0f) + epVar3.getMeasuredHeight()) {
                                    int iC = org.telegram.messenger.y1.C(6.0f, s1Var.getChecksY(), i18);
                                    int iDp = AndroidUtilities.dp(5.0f) + s1Var.getChecksX();
                                    int measuredWidth = view.getMeasuredWidth();
                                    float measuredHeight = iC - epVar3.getMeasuredHeight();
                                    epVar3.f28114f = measuredHeight;
                                    epVar3.setTranslationY(measuredHeight);
                                    int left = s1Var.getLeft() + iDp;
                                    int iDp2 = AndroidUtilities.dp(15.0f);
                                    if (left > view.getMeasuredWidth() / 2) {
                                        int measuredWidth2 = (measuredWidth - epVar3.getMeasuredWidth()) - AndroidUtilities.dp(20.0f);
                                        epVar3.setTranslationX(measuredWidth2);
                                        iDp2 += measuredWidth2;
                                    } else {
                                        epVar3.setTranslationX(0.0f);
                                    }
                                    float left2 = ((s1Var.getLeft() + iDp) - iDp2) - (imageView.getMeasuredWidth() / 2);
                                    imageView.setTranslationX(left2);
                                    if (left > view.getMeasuredWidth() / 2) {
                                        if (left2 < AndroidUtilities.dp(10.0f)) {
                                            float fDp = left2 - AndroidUtilities.dp(10.0f);
                                            epVar3.setTranslationX(epVar3.getTranslationX() + fDp);
                                            imageView.setTranslationX(left2 - fDp);
                                        }
                                    } else if (left2 > epVar3.getMeasuredWidth() - AndroidUtilities.dp(24.0f)) {
                                        float measuredWidth3 = (left2 - epVar3.getMeasuredWidth()) + AndroidUtilities.dp(24.0f);
                                        epVar3.setTranslationX(measuredWidth3);
                                        imageView.setTranslationX(left2 - measuredWidth3);
                                    } else if (left2 < AndroidUtilities.dp(10.0f)) {
                                        float fDp2 = left2 - AndroidUtilities.dp(10.0f);
                                        epVar3.setTranslationX(epVar3.getTranslationX() + fDp2);
                                        imageView.setTranslationX(left2 - fDp2);
                                    }
                                    epVar3.setPivotX(left2);
                                    epVar3.setPivotY(epVar3.getMeasuredHeight());
                                    AnimatorSet animatorSet2 = epVar3.d;
                                    if (animatorSet2 != null) {
                                        animatorSet2.cancel();
                                        epVar3.d = null;
                                    }
                                    epVar3.setTag(Integer.valueOf(i10));
                                    epVar3.setVisibility(0);
                                    AnimatorSet animatorSet3 = new AnimatorSet();
                                    epVar3.d = animatorSet3;
                                    ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(epVar3, (Property<org.telegram.ui.Components.ep, Float>) View.ALPHA, 0.0f, 1.0f);
                                    ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(epVar3, (Property<org.telegram.ui.Components.ep, Float>) View.SCALE_X, 0.0f, 1.0f);
                                    ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(epVar3, (Property<org.telegram.ui.Components.ep, Float>) View.SCALE_Y, 0.0f, 1.0f);
                                    Animator[] animatorArr = new Animator[3];
                                    animatorArr[0] = objectAnimatorOfFloat3;
                                    animatorArr[i10] = objectAnimatorOfFloat4;
                                    animatorArr[2] = objectAnimatorOfFloat5;
                                    animatorSet3.playTogether(animatorArr);
                                    epVar3.d.addListener(new org.telegram.ui.Components.dp(epVar3, i14));
                                    epVar3.d.setDuration(180L);
                                    epVar3.d.start();
                                    while (i14 < 2) {
                                        epVar3.f28110a[i14].animate().scaleX(1.04f).scaleY(1.04f).setInterpolator(org.telegram.ui.Components.er.f28124i).setStartDelay((i14 == 0 ? 132 : 500) + 140).setDuration(100L).setListener(new nh.n2(epVar3, i14, 5)).start();
                                        i14++;
                                    }
                                    rnVar.getMessagesController().removeSuggestion(0L, "NEWCOMER_TICKS");
                                    break;
                                }
                            }
                        }
                    }
                    break;
                }
                break;
            case 25:
                AndroidUtilities.forEachViews((RecyclerView) rnVar.f42213t0, (d5.d) new j4.w0(i13));
                dm dmVar2 = rnVar.f42252w0;
                if (dmVar2 != null) {
                    dmVar2.O(false);
                }
                break;
            case 26:
                rn.w0(rnVar);
                break;
            case 27:
                ck ckVar2 = rnVar.U;
                if (ckVar2 != null && rnVar.f42114kb != 5) {
                    ckVar2.H0();
                    break;
                }
                break;
            case 28:
                org.telegram.ui.Components.eo eoVar = ((org.telegram.ui.Components.eo[]) rnVar.W.f594b)[0];
                org.telegram.ui.ActionBar.h5 h5Var = eoVar.d;
                org.telegram.ui.ActionBar.h5 h5Var2 = eoVar.f28104e;
                rnVar.B1 = !rnVar.B1;
                h5Var.setPivotX(0.0f);
                h5Var2.setPivotX(0.0f);
                if (rnVar.B1) {
                    h5Var.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                    h5Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                } else {
                    h5Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                    h5Var2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                }
                AndroidUtilities.runOnUIThread(rnVar.C1, 6000L);
                break;
            default:
                rnVar.uc();
                break;
        }
    }
}
