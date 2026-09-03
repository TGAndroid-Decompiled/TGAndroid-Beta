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
public final class ne implements Runnable {
    public final int f36486a;
    public final zn f36487b;

    public ne(zn znVar, int i10) {
        this.f36486a = i10;
        this.f36487b = znVar;
    }

    @Override
    public final void run() {
        lk lkVar;
        org.telegram.ui.Cells.s1 s1Var;
        MessageObject messageObject;
        int i10;
        int i11 = this.f36486a;
        TLRPC.ChatTheme chatTheme = null;
        char c3 = 1;
        int i12 = 0;
        zn znVar = this.f36487b;
        switch (i11) {
            case 0:
                znVar.I5 = null;
                if (znVar.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(znVar.getParentActivity(), 0, znVar.f40534ba);
                    boolean isChannel = ChatObject.isChannel(znVar.e);
                    org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19478a;
                    if (isChannel && !znVar.e.megagroup) {
                        d2Var.Q = LocaleController.getString(R.string.JoinByPeekChannelText);
                        d2Var.O = LocaleController.getString(R.string.JoinByPeekChannelTitle);
                    } else {
                        d2Var.Q = LocaleController.getString(R.string.JoinByPeekGroupText);
                        d2Var.O = LocaleController.getString(R.string.JoinByPeekGroupTitle);
                    }
                    alertDialog$Builder.k(LocaleController.getString(R.string.JoinByPeekJoin), new ve(znVar, 0));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new ve(znVar, 1));
                    znVar.showDialog(d2Var);
                    return;
                }
                return;
            case 1:
                znVar.Y6();
                return;
            case 2:
                zn.i0(znVar);
                return;
            case 3:
                znVar.oa(null, znVar.f40706p8);
                znVar.f40706p8 = null;
                return;
            case 4:
                if (!org.telegram.ui.ActionBar.p2.hasSheets(znVar) && (lkVar = znVar.V) != null) {
                    lkVar.setFieldFocused(true);
                    znVar.V.H0();
                    return;
                }
                return;
            case 5:
                znVar.o9();
                AndroidUtilities.forEachViews((RecyclerView) znVar.f40759u0, (h5.d) new dg(znVar, 1));
                znVar.u7();
                bk bkVar = znVar.U2;
                if (bkVar != null) {
                    bkVar.setTranslationX(znVar.R8() / 2.0f);
                }
                ak akVar = znVar.V2;
                if (akVar != null) {
                    akVar.setTranslationX(znVar.R8() / 2.0f);
                }
                FrameLayout frameLayout = znVar.N0;
                if (frameLayout != null) {
                    frameLayout.setTranslationX(znVar.R8() / 2.0f);
                }
                znVar.S6();
                znVar.t7();
                return;
            case 6:
                ne1 a02 = ne1.a0(-znVar.Q5, 0L);
                a02.f36500y = znVar;
                znVar.presentFragment(a02);
                return;
            case 7:
                znVar.getNotificationCenter().onAnimationFinish(znVar.C9);
                return;
            case 8:
                znVar.f40589g1.d(true);
                return;
            case 9:
                int childCount = znVar.f40759u0.getChildCount();
                while (i12 < childCount) {
                    View childAt = znVar.f40759u0.getChildAt(i12);
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
                znVar.f40825yb = true;
                znVar.xc(true);
                return;
            case 11:
                cl clVar = znVar.Ya;
                if (clVar != null) {
                    clVar.requestLayout();
                    return;
                }
                return;
            case 12:
                zn.E0(znVar);
                return;
            case 13:
                TLRPC.UserFull userFull = znVar.X7;
                if (userFull != null) {
                    chatTheme = userFull.theme;
                }
                znVar.ib(chatTheme);
                return;
            case 14:
                zn.o1(znVar);
                return;
            case 15:
                znVar.I7 = Integer.MAX_VALUE;
                znVar.K7 = false;
                znVar.L7 = 0L;
                znVar.M7 = null;
                znVar.N7 = null;
                znVar.O7 = null;
                znVar.P7 = -1;
                znVar.J7 = false;
                znVar.Wc(false);
                znVar.R7 = null;
                return;
            case 16:
                znVar.resumeDelayedFragmentAnimation();
                mk mkVar = znVar.T9;
                AndroidUtilities.cancelRunOnUIThread(mkVar);
                mkVar.run();
                znVar.getNotificationCenter().runDelayedNotifications();
                return;
            case 17:
                znVar.vb(false, true);
                return;
            case 18:
                znVar.bc(true);
                return;
            case 19:
                znVar.Z6();
                return;
            case 20:
                znVar.V.H0();
                return;
            case 21:
                znVar.f40681n7 = null;
                fl flVar = znVar.Y2;
                if (flVar != null) {
                    org.telegram.ui.Components.s50 cameraContainer = flVar.getCameraContainer();
                    AnimatorSet animatorSet = new AnimatorSet();
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cameraContainer, View.SCALE_X, 0.5f);
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(cameraContainer, View.SCALE_Y, 0.5f);
                    Property property = View.ALPHA;
                    animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(cameraContainer, property, 0.0f), ObjectAnimator.ofFloat(znVar.Y2.getButtonsLayout(), property, 0.0f), ObjectAnimator.ofInt(znVar.Y2.getPaint(), org.telegram.ui.Components.n6.f27196b, 0), ObjectAnimator.ofFloat(znVar.Y2.getMuteImageView(), property, 0.0f));
                    animatorSet.addListener(new vi(znVar, 0));
                    animatorSet.start();
                    return;
                }
                return;
            case 22:
                AndroidUtilities.forEachViews((RecyclerView) znVar.f40759u0, (h5.d) new nh.e(7));
                lm lmVar = znVar.f40800x0;
                if (lmVar != null) {
                    lmVar.O(true);
                    return;
                }
                return;
            case 23:
                zn znVar2 = this.f36487b;
                int i13 = znVar2.f40685nb;
                if (i13 != 0) {
                    znVar2.j(i13, znVar2.f40696ob, znVar2.f40709pb, znVar2.qb, znVar2.f40735rb, znVar2.sb);
                    znVar2.f40685nb = 0;
                    return;
                }
                return;
            case 24:
                if (!znVar.f40616i3 && znVar.f40759u0 != null && znVar.getParentActivity() != null && znVar.fragmentView != null) {
                    org.telegram.ui.Components.np npVar = znVar.f40740s2;
                    if (npVar == null || npVar.getTag() == null) {
                        if (znVar.f40740s2 == null) {
                            rm rmVar = znVar.U0;
                            int indexOfChild = rmVar.indexOfChild(znVar.P);
                            if (indexOfChild != -1) {
                                org.telegram.ui.Components.np npVar2 = new org.telegram.ui.Components.np(znVar.getParentActivity(), znVar.f40534ba);
                                znVar.f40740s2 = npVar2;
                                rmVar.addView(npVar2, indexOfChild + 1, k7.b6.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                                znVar.f40740s2.setAlpha(0.0f);
                                znVar.f40740s2.setVisibility(4);
                            } else {
                                return;
                            }
                        }
                        int childCount2 = znVar.f40759u0.getChildCount();
                        int i14 = 0;
                        while (i14 < childCount2) {
                            View childAt2 = znVar.f40759u0.getChildAt(i14);
                            if ((childAt2 instanceof org.telegram.ui.Cells.s1) && (messageObject = (s1Var = (org.telegram.ui.Cells.s1) childAt2).getMessageObject()) != null && messageObject.isOutOwner() && messageObject.isSent()) {
                                org.telegram.ui.Components.np npVar3 = znVar.f40740s2;
                                ImageView imageView = npVar3.f27346c;
                                org.telegram.ui.Components.fg fgVar = npVar3.e;
                                if (fgVar != null) {
                                    AndroidUtilities.cancelRunOnUIThread(fgVar);
                                    npVar3.e = null;
                                }
                                int[] iArr = new int[2];
                                s1Var.getLocationInWindow(iArr);
                                int i15 = iArr[c3];
                                ((View) npVar3.getParent()).getLocationInWindow(iArr);
                                int i16 = i15 - iArr[1];
                                View view = (View) s1Var.getParent();
                                npVar3.measure(View.MeasureSpec.makeMeasureSpec(1000, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(1000, Integer.MIN_VALUE));
                                if (i16 > AndroidUtilities.dp(10.0f) + npVar3.getMeasuredHeight()) {
                                    int C = org.telegram.messenger.y3.C(6.0f, s1Var.getChecksY(), i16);
                                    int dp = AndroidUtilities.dp(5.0f) + s1Var.getChecksX();
                                    int measuredWidth = view.getMeasuredWidth();
                                    float measuredHeight = C - npVar3.getMeasuredHeight();
                                    npVar3.f27347f = measuredHeight;
                                    npVar3.setTranslationY(measuredHeight);
                                    int left = s1Var.getLeft() + dp;
                                    int dp2 = AndroidUtilities.dp(15.0f);
                                    if (left > view.getMeasuredWidth() / 2) {
                                        int measuredWidth2 = (measuredWidth - npVar3.getMeasuredWidth()) - AndroidUtilities.dp(20.0f);
                                        npVar3.setTranslationX(measuredWidth2);
                                        dp2 += measuredWidth2;
                                    } else {
                                        npVar3.setTranslationX(0.0f);
                                    }
                                    float left2 = ((s1Var.getLeft() + dp) - dp2) - (imageView.getMeasuredWidth() / 2);
                                    imageView.setTranslationX(left2);
                                    if (left > view.getMeasuredWidth() / 2) {
                                        if (left2 < AndroidUtilities.dp(10.0f)) {
                                            float dp3 = left2 - AndroidUtilities.dp(10.0f);
                                            npVar3.setTranslationX(npVar3.getTranslationX() + dp3);
                                            imageView.setTranslationX(left2 - dp3);
                                        }
                                    } else if (left2 > npVar3.getMeasuredWidth() - AndroidUtilities.dp(24.0f)) {
                                        float measuredWidth3 = (left2 - npVar3.getMeasuredWidth()) + AndroidUtilities.dp(24.0f);
                                        npVar3.setTranslationX(measuredWidth3);
                                        imageView.setTranslationX(left2 - measuredWidth3);
                                    } else if (left2 < AndroidUtilities.dp(10.0f)) {
                                        float dp4 = left2 - AndroidUtilities.dp(10.0f);
                                        npVar3.setTranslationX(npVar3.getTranslationX() + dp4);
                                        imageView.setTranslationX(left2 - dp4);
                                    }
                                    npVar3.setPivotX(left2);
                                    npVar3.setPivotY(npVar3.getMeasuredHeight());
                                    AnimatorSet animatorSet2 = npVar3.d;
                                    if (animatorSet2 != null) {
                                        animatorSet2.cancel();
                                        npVar3.d = null;
                                    }
                                    npVar3.setTag(1);
                                    npVar3.setVisibility(0);
                                    AnimatorSet animatorSet3 = new AnimatorSet();
                                    npVar3.d = animatorSet3;
                                    animatorSet3.playTogether(ObjectAnimator.ofFloat(npVar3, View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(npVar3, View.SCALE_X, 0.0f, 1.0f), ObjectAnimator.ofFloat(npVar3, View.SCALE_Y, 0.0f, 1.0f));
                                    npVar3.d.addListener(new org.telegram.ui.Components.mp(npVar3, 0));
                                    npVar3.d.setDuration(180L);
                                    npVar3.d.start();
                                    while (i12 < 2) {
                                        ViewPropertyAnimator interpolator = npVar3.f27344a[i12].animate().scaleX(1.04f).scaleY(1.04f).setInterpolator(org.telegram.ui.Components.mr.f27124i);
                                        if (i12 == 0) {
                                            i10 = 132;
                                        } else {
                                            i10 = 500;
                                        }
                                        interpolator.setStartDelay(i10 + 140).setDuration(100L).setListener(new org.telegram.ui.Cells.a4(npVar3, i12, 3)).start();
                                        i12++;
                                    }
                                    znVar.getMessagesController().removeSuggestion(0L, "NEWCOMER_TICKS");
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
                AndroidUtilities.forEachViews((RecyclerView) znVar.f40759u0, (h5.d) new nh.e(6));
                lm lmVar2 = znVar.f40800x0;
                if (lmVar2 != null) {
                    lmVar2.O(false);
                    return;
                }
                return;
            case 26:
                zn.w0(znVar);
                return;
            case 27:
                lk lkVar2 = znVar.V;
                if (lkVar2 != null && znVar.f40660lb != 5) {
                    lkVar2.H0();
                    return;
                }
                return;
            case 28:
                org.telegram.ui.Components.lo loVar = ((org.telegram.ui.Components.lo[]) znVar.X.f4817b)[0];
                org.telegram.ui.ActionBar.k5 k5Var = loVar.d;
                org.telegram.ui.ActionBar.k5 k5Var2 = loVar.e;
                znVar.C1 = !znVar.C1;
                k5Var.setPivotX(0.0f);
                k5Var2.setPivotX(0.0f);
                if (znVar.C1) {
                    k5Var.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                    k5Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                } else {
                    k5Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                    k5Var2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                }
                AndroidUtilities.runOnUIThread(znVar.D1, 6000L);
                return;
            default:
                znVar.uc();
                return;
        }
    }
}
