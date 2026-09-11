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
public final class me implements Runnable {
    public final int f38676a;
    public final co f38677b;

    public me(co coVar, int i10) {
        this.f38676a = i10;
        this.f38677b = coVar;
    }

    @Override
    public final void run() {
        mk mkVar;
        int i10;
        org.telegram.ui.Cells.t1 t1Var;
        MessageObject messageObject;
        int i11;
        int i12 = this.f38676a;
        TLRPC.ChatTheme chatTheme = null;
        int i13 = 0;
        co coVar = this.f38677b;
        switch (i12) {
            case 0:
                coVar.L5 = null;
                if (coVar.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(coVar.getParentActivity(), 0, coVar.f35247ea);
                    boolean isChannel = ChatObject.isChannel(coVar.f35237e);
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20198a;
                    if (isChannel && !coVar.f35237e.megagroup) {
                        b2Var.T = LocaleController.getString(R.string.JoinByPeekChannelText);
                        b2Var.R = LocaleController.getString(R.string.JoinByPeekChannelTitle);
                    } else {
                        b2Var.T = LocaleController.getString(R.string.JoinByPeekGroupText);
                        b2Var.R = LocaleController.getString(R.string.JoinByPeekGroupTitle);
                    }
                    alertDialog$Builder.k(LocaleController.getString(R.string.JoinByPeekJoin), new ve(coVar, 0));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new ve(coVar, 1));
                    coVar.showDialog(b2Var);
                    return;
                }
                return;
            case 1:
                coVar.Y6();
                return;
            case 2:
                co.i0(coVar);
                return;
            case 3:
                coVar.oa(null, coVar.f35417s8);
                coVar.f35417s8 = null;
                return;
            case 4:
                if (!org.telegram.ui.ActionBar.n2.hasSheets(coVar) && (mkVar = coVar.Y) != null) {
                    mkVar.setFieldFocused(true);
                    coVar.Y.H0();
                    return;
                }
                return;
            case 5:
                coVar.o9();
                AndroidUtilities.forEachViews((RecyclerView) coVar.f35473x0, (e2.h) new hg(coVar, 1));
                coVar.u7();
                dk dkVar = coVar.X2;
                if (dkVar != null) {
                    dkVar.setTranslationX(coVar.R8() / 2.0f);
                }
                ck ckVar = coVar.Y2;
                if (ckVar != null) {
                    ckVar.setTranslationX(coVar.R8() / 2.0f);
                }
                FrameLayout frameLayout = coVar.Q0;
                if (frameLayout != null) {
                    frameLayout.setTranslationX(coVar.R8() / 2.0f);
                }
                coVar.S6();
                coVar.t7();
                return;
            case 6:
                af1 a02 = af1.a0(-coVar.T5, 0L);
                a02.f34420y = coVar;
                coVar.presentFragment(a02);
                return;
            case 7:
                coVar.getNotificationCenter().onAnimationFinish(coVar.F9);
                return;
            case 8:
                coVar.f35299j1.d(true);
                return;
            case 9:
                int childCount = coVar.f35473x0.getChildCount();
                while (i13 < childCount) {
                    View childAt = coVar.f35473x0.getChildAt(i13);
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
                coVar.Bb = true;
                coVar.xc(true);
                return;
            case 11:
                dl dlVar = coVar.f35209bb;
                if (dlVar != null) {
                    dlVar.requestLayout();
                    return;
                }
                return;
            case 12:
                co.E0(coVar);
                return;
            case 13:
                TLRPC.UserFull userFull = coVar.f35192a8;
                if (userFull != null) {
                    chatTheme = userFull.theme;
                }
                coVar.ib(chatTheme);
                return;
            case 14:
                co.o1(coVar);
                return;
            case 15:
                coVar.L7 = Integer.MAX_VALUE;
                coVar.N7 = false;
                coVar.O7 = 0L;
                coVar.P7 = null;
                coVar.Q7 = null;
                coVar.R7 = null;
                coVar.S7 = -1;
                coVar.M7 = false;
                coVar.Wc(false);
                coVar.U7 = null;
                return;
            case 16:
                coVar.resumeDelayedFragmentAnimation();
                nk nkVar = coVar.W9;
                AndroidUtilities.cancelRunOnUIThread(nkVar);
                nkVar.run();
                coVar.getNotificationCenter().runDelayedNotifications();
                return;
            case 17:
                coVar.vb(false, true);
                return;
            case 18:
                coVar.bc(true);
                return;
            case 19:
                coVar.Z6();
                return;
            case 20:
                coVar.Y.H0();
                return;
            case 21:
                coVar.f35388q7 = null;
                gl glVar = coVar.f35201b3;
                if (glVar != null) {
                    org.telegram.ui.Components.p50 cameraContainer = glVar.getCameraContainer();
                    AnimatorSet animatorSet = new AnimatorSet();
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cameraContainer, View.SCALE_X, 0.5f);
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(cameraContainer, View.SCALE_Y, 0.5f);
                    Property property = View.ALPHA;
                    animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(cameraContainer, property, 0.0f), ObjectAnimator.ofFloat(coVar.f35201b3.getButtonsLayout(), property, 0.0f), ObjectAnimator.ofInt(coVar.f35201b3.getPaint(), org.telegram.ui.Components.t6.f30536b, 0), ObjectAnimator.ofFloat(coVar.f35201b3.getMuteImageView(), property, 0.0f));
                    animatorSet.addListener(new xi(coVar, 0));
                    animatorSet.start();
                    return;
                }
                return;
            case 22:
                AndroidUtilities.forEachViews((RecyclerView) coVar.f35473x0, (e2.h) new bi.f(22));
                om omVar = coVar.A0;
                if (omVar != null) {
                    omVar.O(true);
                    return;
                }
                return;
            case 23:
                co coVar2 = this.f38677b;
                int i14 = coVar2.f35392qb;
                if (i14 != 0) {
                    coVar2.F(i14, coVar2.f35406rb, coVar2.f35432tb, coVar2.f35457vb, coVar2.f35420sb, coVar2.f35445ub);
                    coVar2.f35392qb = 0;
                    return;
                }
                return;
            case 24:
                if (!coVar.f35325l3 && coVar.f35473x0 != null && coVar.getParentActivity() != null && coVar.fragmentView != null) {
                    org.telegram.ui.Components.pp ppVar = coVar.f35449v2;
                    if (ppVar == null || ppVar.getTag() == null) {
                        if (coVar.f35449v2 == null) {
                            um umVar = coVar.X0;
                            int indexOfChild = umVar.indexOfChild(coVar.S);
                            if (indexOfChild != -1) {
                                i10 = 1;
                                org.telegram.ui.Components.pp ppVar2 = new org.telegram.ui.Components.pp(coVar.getParentActivity(), coVar.f35247ea);
                                coVar.f35449v2 = ppVar2;
                                umVar.addView(ppVar2, indexOfChild + 1, w7.x5.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                                coVar.f35449v2.setAlpha(0.0f);
                                coVar.f35449v2.setVisibility(4);
                            } else {
                                return;
                            }
                        } else {
                            i10 = 1;
                        }
                        int childCount2 = coVar.f35473x0.getChildCount();
                        for (int i15 = 0; i15 < childCount2; i15++) {
                            View childAt2 = coVar.f35473x0.getChildAt(i15);
                            if ((childAt2 instanceof org.telegram.ui.Cells.t1) && (messageObject = (t1Var = (org.telegram.ui.Cells.t1) childAt2).getMessageObject()) != null && messageObject.isOutOwner() && messageObject.isSent()) {
                                org.telegram.ui.Components.pp ppVar3 = coVar.f35449v2;
                                ImageView imageView = ppVar3.f29454c;
                                org.telegram.ui.Components.pg pgVar = ppVar3.f29455e;
                                if (pgVar != null) {
                                    AndroidUtilities.cancelRunOnUIThread(pgVar);
                                    ppVar3.f29455e = null;
                                }
                                int[] iArr = new int[2];
                                t1Var.getLocationInWindow(iArr);
                                int i16 = iArr[i10];
                                ((View) ppVar3.getParent()).getLocationInWindow(iArr);
                                int i17 = i16 - iArr[i10];
                                View view = (View) t1Var.getParent();
                                ppVar3.measure(View.MeasureSpec.makeMeasureSpec(1000, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(1000, Integer.MIN_VALUE));
                                if (i17 > AndroidUtilities.dp(10.0f) + ppVar3.getMeasuredHeight()) {
                                    int C = org.telegram.messenger.w1.C(6.0f, t1Var.getChecksY(), i17);
                                    int dp = AndroidUtilities.dp(5.0f) + t1Var.getChecksX();
                                    int measuredWidth = view.getMeasuredWidth();
                                    float measuredHeight = C - ppVar3.getMeasuredHeight();
                                    ppVar3.f29456f = measuredHeight;
                                    ppVar3.setTranslationY(measuredHeight);
                                    int left = t1Var.getLeft() + dp;
                                    int dp2 = AndroidUtilities.dp(15.0f);
                                    if (left > view.getMeasuredWidth() / 2) {
                                        int measuredWidth2 = (measuredWidth - ppVar3.getMeasuredWidth()) - AndroidUtilities.dp(20.0f);
                                        ppVar3.setTranslationX(measuredWidth2);
                                        dp2 += measuredWidth2;
                                    } else {
                                        ppVar3.setTranslationX(0.0f);
                                    }
                                    float left2 = ((t1Var.getLeft() + dp) - dp2) - (imageView.getMeasuredWidth() / 2);
                                    imageView.setTranslationX(left2);
                                    if (left > view.getMeasuredWidth() / 2) {
                                        if (left2 < AndroidUtilities.dp(10.0f)) {
                                            float dp3 = left2 - AndroidUtilities.dp(10.0f);
                                            ppVar3.setTranslationX(ppVar3.getTranslationX() + dp3);
                                            imageView.setTranslationX(left2 - dp3);
                                        }
                                    } else if (left2 > ppVar3.getMeasuredWidth() - AndroidUtilities.dp(24.0f)) {
                                        float measuredWidth3 = (left2 - ppVar3.getMeasuredWidth()) + AndroidUtilities.dp(24.0f);
                                        ppVar3.setTranslationX(measuredWidth3);
                                        imageView.setTranslationX(left2 - measuredWidth3);
                                    } else if (left2 < AndroidUtilities.dp(10.0f)) {
                                        float dp4 = left2 - AndroidUtilities.dp(10.0f);
                                        ppVar3.setTranslationX(ppVar3.getTranslationX() + dp4);
                                        imageView.setTranslationX(left2 - dp4);
                                    }
                                    ppVar3.setPivotX(left2);
                                    ppVar3.setPivotY(ppVar3.getMeasuredHeight());
                                    AnimatorSet animatorSet2 = ppVar3.d;
                                    if (animatorSet2 != null) {
                                        animatorSet2.cancel();
                                        ppVar3.d = null;
                                    }
                                    ppVar3.setTag(Integer.valueOf(i10));
                                    ppVar3.setVisibility(0);
                                    AnimatorSet animatorSet3 = new AnimatorSet();
                                    ppVar3.d = animatorSet3;
                                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(ppVar3, View.ALPHA, 0.0f, 1.0f);
                                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(ppVar3, View.SCALE_X, 0.0f, 1.0f);
                                    ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(ppVar3, View.SCALE_Y, 0.0f, 1.0f);
                                    Animator[] animatorArr = new Animator[3];
                                    animatorArr[0] = ofFloat3;
                                    animatorArr[i10] = ofFloat4;
                                    animatorArr[2] = ofFloat5;
                                    animatorSet3.playTogether(animatorArr);
                                    ppVar3.d.addListener(new org.telegram.ui.Components.op(ppVar3, 0));
                                    ppVar3.d.setDuration(180L);
                                    ppVar3.d.start();
                                    while (i13 < 2) {
                                        ViewPropertyAnimator interpolator = ppVar3.f29452a[i13].animate().scaleX(1.04f).scaleY(1.04f).setInterpolator(org.telegram.ui.Components.pr.f29468i);
                                        if (i13 == 0) {
                                            i11 = 132;
                                        } else {
                                            i11 = 500;
                                        }
                                        interpolator.setStartDelay(i11 + 140).setDuration(100L).setListener(new fi.v2(ppVar3, i13, 6)).start();
                                        i13++;
                                    }
                                    coVar.getMessagesController().removeSuggestion(0L, "NEWCOMER_TICKS");
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
                AndroidUtilities.forEachViews((RecyclerView) coVar.f35473x0, (e2.h) new bi.f(21));
                om omVar2 = coVar.A0;
                if (omVar2 != null) {
                    omVar2.O(false);
                    return;
                }
                return;
            case 26:
                co.v0(coVar);
                return;
            case 27:
                mk mkVar2 = coVar.Y;
                if (mkVar2 != null && coVar.f35368ob != 5) {
                    mkVar2.H0();
                    return;
                }
                return;
            case 28:
                org.telegram.ui.Components.po poVar = ((org.telegram.ui.Components.po[]) coVar.f35185a0.f718b)[0];
                org.telegram.ui.ActionBar.j5 j5Var = poVar.d;
                org.telegram.ui.ActionBar.j5 j5Var2 = poVar.f29447e;
                coVar.F1 = !coVar.F1;
                j5Var.setPivotX(0.0f);
                j5Var2.setPivotX(0.0f);
                if (coVar.F1) {
                    j5Var.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                    j5Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                } else {
                    j5Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                    j5Var2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                }
                AndroidUtilities.runOnUIThread(coVar.G1, 6000L);
                return;
            default:
                coVar.uc();
                return;
        }
    }
}
