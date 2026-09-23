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
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class le implements Runnable {
    public final int f34951a;
    public final xn f34952b;

    public le(xn xnVar, int i10) {
        this.f34951a = i10;
        this.f34952b = xnVar;
    }

    @Override
    public final void run() {
        jk jkVar;
        int i10;
        org.telegram.ui.Cells.t1 t1Var;
        MessageObject messageObject;
        int i11;
        int i12 = this.f34951a;
        TLRPC.ChatTheme chatTheme = null;
        int i13 = 0;
        xn xnVar = this.f34952b;
        switch (i12) {
            case 0:
                xnVar.L5 = null;
                if (xnVar.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xnVar.getParentActivity(), 0, xnVar.f39370ea);
                    boolean isChannel = ChatObject.isChannel(xnVar.e);
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18409a;
                    if (isChannel && !xnVar.e.megagroup) {
                        b2Var.T = LocaleController.getString(R.string.JoinByPeekChannelText);
                        b2Var.R = LocaleController.getString(R.string.JoinByPeekChannelTitle);
                    } else {
                        b2Var.T = LocaleController.getString(R.string.JoinByPeekGroupText);
                        b2Var.R = LocaleController.getString(R.string.JoinByPeekGroupTitle);
                    }
                    alertDialog$Builder.k(LocaleController.getString(R.string.JoinByPeekJoin), new ue(xnVar, 0));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new ue(xnVar, 1));
                    xnVar.showDialog(b2Var);
                    return;
                }
                return;
            case 1:
                xnVar.Y6();
                return;
            case 2:
                xn.j0(xnVar);
                return;
            case 3:
                xnVar.oa(null, xnVar.f39540s8);
                xnVar.f39540s8 = null;
                return;
            case 4:
                if (!org.telegram.ui.ActionBar.n2.hasSheets(xnVar) && (jkVar = xnVar.Y) != null) {
                    jkVar.setFieldFocused(true);
                    xnVar.Y.I0();
                    return;
                }
                return;
            case 5:
                xnVar.o9();
                AndroidUtilities.forEachViews((RecyclerView) xnVar.f39596x0, (Utilities.Callback<View>) new af(xnVar, 5));
                xnVar.u7();
                ak akVar = xnVar.X2;
                if (akVar != null) {
                    akVar.setTranslationX(xnVar.R8() / 2.0f);
                }
                zj zjVar = xnVar.Y2;
                if (zjVar != null) {
                    zjVar.setTranslationX(xnVar.R8() / 2.0f);
                }
                FrameLayout frameLayout = xnVar.Q0;
                if (frameLayout != null) {
                    frameLayout.setTranslationX(xnVar.R8() / 2.0f);
                }
                xnVar.S6();
                xnVar.t7();
                return;
            case 6:
                se1 a02 = se1.a0(-xnVar.T5, 0L);
                a02.f37272y = xnVar;
                xnVar.presentFragment(a02);
                return;
            case 7:
                xnVar.getNotificationCenter().onAnimationFinish(xnVar.F9);
                return;
            case 8:
                xnVar.f39422j1.d(true);
                return;
            case 9:
                int childCount = xnVar.f39596x0.getChildCount();
                while (i13 < childCount) {
                    View childAt = xnVar.f39596x0.getChildAt(i13);
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
                xnVar.Ab = true;
                xnVar.xc(true);
                return;
            case 11:
                al alVar = xnVar.f39319ab;
                if (alVar != null) {
                    alVar.requestLayout();
                    return;
                }
                return;
            case 12:
                xn.E0(xnVar);
                return;
            case 13:
                TLRPC.UserFull userFull = xnVar.f39316a8;
                if (userFull != null) {
                    chatTheme = userFull.theme;
                }
                xnVar.ib(chatTheme);
                return;
            case 14:
                xn.o1(xnVar);
                return;
            case 15:
                xnVar.L7 = Integer.MAX_VALUE;
                xnVar.N7 = false;
                xnVar.O7 = 0L;
                xnVar.P7 = null;
                xnVar.Q7 = null;
                xnVar.R7 = null;
                xnVar.S7 = -1;
                xnVar.M7 = false;
                xnVar.Wc(false);
                xnVar.U7 = null;
                return;
            case 16:
                xnVar.resumeDelayedFragmentAnimation();
                kk kkVar = xnVar.W9;
                AndroidUtilities.cancelRunOnUIThread(kkVar);
                kkVar.run();
                xnVar.getNotificationCenter().runDelayedNotifications();
                return;
            case 17:
                xnVar.vb(false, true);
                return;
            case 18:
                xnVar.bc(true);
                return;
            case 19:
                xnVar.Z6();
                return;
            case 20:
                xnVar.Y.I0();
                return;
            case 21:
                xnVar.f39511q7 = null;
                dl dlVar = xnVar.f39325b3;
                if (dlVar != null) {
                    org.telegram.ui.Components.q50 cameraContainer = dlVar.getCameraContainer();
                    AnimatorSet animatorSet = new AnimatorSet();
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cameraContainer, View.SCALE_X, 0.5f);
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(cameraContainer, View.SCALE_Y, 0.5f);
                    Property property = View.ALPHA;
                    animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(cameraContainer, property, 0.0f), ObjectAnimator.ofFloat(xnVar.f39325b3.getButtonsLayout(), property, 0.0f), ObjectAnimator.ofInt(xnVar.f39325b3.getPaint(), org.telegram.ui.Components.s6.f27835b, 0), ObjectAnimator.ofFloat(xnVar.f39325b3.getMuteImageView(), property, 0.0f));
                    animatorSet.addListener(new ui(xnVar, 0));
                    animatorSet.start();
                    return;
                }
                return;
            case 22:
                AndroidUtilities.forEachViews((RecyclerView) xnVar.f39596x0, (Utilities.Callback<View>) new ai.i(11));
                km kmVar = xnVar.A0;
                if (kmVar != null) {
                    kmVar.O(true);
                    return;
                }
                return;
            case 23:
                xn xnVar2 = this.f34952b;
                int i14 = xnVar2.f39503pb;
                if (i14 != 0) {
                    xnVar2.F(i14, xnVar2.f39515qb, xnVar2.f39543sb, xnVar2.f39568ub, xnVar2.f39529rb, xnVar2.f39555tb);
                    xnVar2.f39503pb = 0;
                    return;
                }
                return;
            case 24:
                if (!xnVar.f39448l3 && xnVar.f39596x0 != null && xnVar.getParentActivity() != null && xnVar.fragmentView != null) {
                    org.telegram.ui.Components.rp rpVar = xnVar.f39572v2;
                    if (rpVar == null || rpVar.getTag() == null) {
                        if (xnVar.f39572v2 == null) {
                            qm qmVar = xnVar.X0;
                            int indexOfChild = qmVar.indexOfChild(xnVar.S);
                            if (indexOfChild != -1) {
                                i10 = 1;
                                org.telegram.ui.Components.rp rpVar2 = new org.telegram.ui.Components.rp(xnVar.getParentActivity(), xnVar.f39370ea);
                                xnVar.f39572v2 = rpVar2;
                                qmVar.addView(rpVar2, indexOfChild + 1, w7.x5.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                                xnVar.f39572v2.setAlpha(0.0f);
                                xnVar.f39572v2.setVisibility(4);
                            } else {
                                return;
                            }
                        } else {
                            i10 = 1;
                        }
                        int childCount2 = xnVar.f39596x0.getChildCount();
                        for (int i15 = 0; i15 < childCount2; i15++) {
                            View childAt2 = xnVar.f39596x0.getChildAt(i15);
                            if ((childAt2 instanceof org.telegram.ui.Cells.t1) && (messageObject = (t1Var = (org.telegram.ui.Cells.t1) childAt2).getMessageObject()) != null && messageObject.isOutOwner() && messageObject.isSent()) {
                                org.telegram.ui.Components.rp rpVar3 = xnVar.f39572v2;
                                ImageView imageView = rpVar3.f27694c;
                                org.telegram.ui.Components.og ogVar = rpVar3.e;
                                if (ogVar != null) {
                                    AndroidUtilities.cancelRunOnUIThread(ogVar);
                                    rpVar3.e = null;
                                }
                                int[] iArr = new int[2];
                                t1Var.getLocationInWindow(iArr);
                                int i16 = iArr[i10];
                                ((View) rpVar3.getParent()).getLocationInWindow(iArr);
                                int i17 = i16 - iArr[i10];
                                View view = (View) t1Var.getParent();
                                rpVar3.measure(View.MeasureSpec.makeMeasureSpec(1000, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(1000, Integer.MIN_VALUE));
                                if (i17 > AndroidUtilities.dp(10.0f) + rpVar3.getMeasuredHeight()) {
                                    int C = org.telegram.messenger.z0.C(6.0f, t1Var.getChecksY(), i17);
                                    int dp = AndroidUtilities.dp(5.0f) + t1Var.getChecksX();
                                    int measuredWidth = view.getMeasuredWidth();
                                    float measuredHeight = C - rpVar3.getMeasuredHeight();
                                    rpVar3.f27695f = measuredHeight;
                                    rpVar3.setTranslationY(measuredHeight);
                                    int left = t1Var.getLeft() + dp;
                                    int dp2 = AndroidUtilities.dp(15.0f);
                                    if (left > view.getMeasuredWidth() / 2) {
                                        int measuredWidth2 = (measuredWidth - rpVar3.getMeasuredWidth()) - AndroidUtilities.dp(20.0f);
                                        rpVar3.setTranslationX(measuredWidth2);
                                        dp2 += measuredWidth2;
                                    } else {
                                        rpVar3.setTranslationX(0.0f);
                                    }
                                    float left2 = ((t1Var.getLeft() + dp) - dp2) - (imageView.getMeasuredWidth() / 2);
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
                                    AnimatorSet animatorSet2 = rpVar3.d;
                                    if (animatorSet2 != null) {
                                        animatorSet2.cancel();
                                        rpVar3.d = null;
                                    }
                                    rpVar3.setTag(Integer.valueOf(i10));
                                    rpVar3.setVisibility(0);
                                    AnimatorSet animatorSet3 = new AnimatorSet();
                                    rpVar3.d = animatorSet3;
                                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(rpVar3, View.ALPHA, 0.0f, 1.0f);
                                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(rpVar3, View.SCALE_X, 0.0f, 1.0f);
                                    ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(rpVar3, View.SCALE_Y, 0.0f, 1.0f);
                                    Animator[] animatorArr = new Animator[3];
                                    animatorArr[0] = ofFloat3;
                                    animatorArr[i10] = ofFloat4;
                                    animatorArr[2] = ofFloat5;
                                    animatorSet3.playTogether(animatorArr);
                                    rpVar3.d.addListener(new org.telegram.ui.Components.qp(rpVar3, 0));
                                    rpVar3.d.setDuration(180L);
                                    rpVar3.d.start();
                                    while (i13 < 2) {
                                        ViewPropertyAnimator interpolator = rpVar3.f27692a[i13].animate().scaleX(1.04f).scaleY(1.04f).setInterpolator(org.telegram.ui.Components.rr.f27703i);
                                        if (i13 == 0) {
                                            i11 = 132;
                                        } else {
                                            i11 = 500;
                                        }
                                        interpolator.setStartDelay(i11 + 140).setDuration(100L).setListener(new ei.v2(rpVar3, i13, 6)).start();
                                        i13++;
                                    }
                                    xnVar.getMessagesController().removeSuggestion(0L, "NEWCOMER_TICKS");
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
                AndroidUtilities.forEachViews((RecyclerView) xnVar.f39596x0, (Utilities.Callback<View>) new ai.i(10));
                km kmVar2 = xnVar.A0;
                if (kmVar2 != null) {
                    kmVar2.O(false);
                    return;
                }
                return;
            case 26:
                xn.w0(xnVar);
                return;
            case 27:
                jk jkVar2 = xnVar.Y;
                if (jkVar2 != null && xnVar.nb != 5) {
                    jkVar2.I0();
                    return;
                }
                return;
            case 28:
                org.telegram.ui.Components.ro roVar = ((org.telegram.ui.Components.ro[]) xnVar.f39309a0.f866b)[0];
                org.telegram.ui.ActionBar.i5 i5Var = roVar.d;
                org.telegram.ui.ActionBar.i5 i5Var2 = roVar.e;
                xnVar.F1 = !xnVar.F1;
                i5Var.setPivotX(0.0f);
                i5Var2.setPivotX(0.0f);
                if (xnVar.F1) {
                    i5Var.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                    i5Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                } else {
                    i5Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                    i5Var2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                }
                AndroidUtilities.runOnUIThread(xnVar.G1, 6000L);
                return;
            default:
                xnVar.uc();
                return;
        }
    }
}
