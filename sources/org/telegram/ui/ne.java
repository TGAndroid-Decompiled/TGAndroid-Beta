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
    public final int f35255a;
    public final eo f35256b;

    public ne(eo eoVar, int i10) {
        this.f35255a = i10;
        this.f35256b = eoVar;
    }

    @Override
    public final void run() {
        ok okVar;
        int i10;
        org.telegram.ui.Cells.t1 t1Var;
        MessageObject messageObject;
        int i11;
        int i12 = this.f35255a;
        TLRPC.ChatTheme chatTheme = null;
        int i13 = 0;
        eo eoVar = this.f35256b;
        switch (i12) {
            case 0:
                eoVar.L5 = null;
                if (eoVar.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(eoVar.getParentActivity(), 0, eoVar.f32316ea);
                    boolean isChannel = ChatObject.isChannel(eoVar.e);
                    org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
                    if (isChannel && !eoVar.e.megagroup) {
                        d2Var.T = LocaleController.getString(R.string.JoinByPeekChannelText);
                        d2Var.R = LocaleController.getString(R.string.JoinByPeekChannelTitle);
                    } else {
                        d2Var.T = LocaleController.getString(R.string.JoinByPeekGroupText);
                        d2Var.R = LocaleController.getString(R.string.JoinByPeekGroupTitle);
                    }
                    alertDialog$Builder.k(LocaleController.getString(R.string.JoinByPeekJoin), new xe(eoVar, 0));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new xe(eoVar, 1));
                    eoVar.showDialog(d2Var);
                    return;
                }
                return;
            case 1:
                eoVar.Y6();
                return;
            case 2:
                eo.i0(eoVar);
                return;
            case 3:
                eoVar.oa(null, eoVar.f32486s8);
                eoVar.f32486s8 = null;
                return;
            case 4:
                if (!org.telegram.ui.ActionBar.p2.hasSheets(eoVar) && (okVar = eoVar.Y) != null) {
                    okVar.setFieldFocused(true);
                    eoVar.Y.H0();
                    return;
                }
                return;
            case 5:
                eoVar.o9();
                AndroidUtilities.forEachViews((RecyclerView) eoVar.f32542x0, (e2.h) new ig(eoVar, 1));
                eoVar.u7();
                fk fkVar = eoVar.X2;
                if (fkVar != null) {
                    fkVar.setTranslationX(eoVar.R8() / 2.0f);
                }
                ek ekVar = eoVar.Y2;
                if (ekVar != null) {
                    ekVar.setTranslationX(eoVar.R8() / 2.0f);
                }
                FrameLayout frameLayout = eoVar.Q0;
                if (frameLayout != null) {
                    frameLayout.setTranslationX(eoVar.R8() / 2.0f);
                }
                eoVar.S6();
                eoVar.t7();
                return;
            case 6:
                ef1 a02 = ef1.a0(-eoVar.T5, 0L);
                a02.f32185y = eoVar;
                eoVar.presentFragment(a02);
                return;
            case 7:
                eoVar.getNotificationCenter().onAnimationFinish(eoVar.F9);
                return;
            case 8:
                eoVar.f32368j1.d(true);
                return;
            case 9:
                int childCount = eoVar.f32542x0.getChildCount();
                while (i13 < childCount) {
                    View childAt = eoVar.f32542x0.getChildAt(i13);
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
                eoVar.Bb = true;
                eoVar.xc(true);
                return;
            case 11:
                fl flVar = eoVar.f32279bb;
                if (flVar != null) {
                    flVar.requestLayout();
                    return;
                }
                return;
            case 12:
                eo.E0(eoVar);
                return;
            case 13:
                TLRPC.UserFull userFull = eoVar.f32262a8;
                if (userFull != null) {
                    chatTheme = userFull.theme;
                }
                eoVar.ib(chatTheme);
                return;
            case 14:
                eo.o1(eoVar);
                return;
            case 15:
                eoVar.L7 = Integer.MAX_VALUE;
                eoVar.N7 = false;
                eoVar.O7 = 0L;
                eoVar.P7 = null;
                eoVar.Q7 = null;
                eoVar.R7 = null;
                eoVar.S7 = -1;
                eoVar.M7 = false;
                eoVar.Wc(false);
                eoVar.U7 = null;
                return;
            case 16:
                eoVar.resumeDelayedFragmentAnimation();
                pk pkVar = eoVar.W9;
                AndroidUtilities.cancelRunOnUIThread(pkVar);
                pkVar.run();
                eoVar.getNotificationCenter().runDelayedNotifications();
                return;
            case 17:
                eoVar.vb(false, true);
                return;
            case 18:
                eoVar.bc(true);
                return;
            case 19:
                eoVar.Z6();
                return;
            case 20:
                eoVar.Y.H0();
                return;
            case 21:
                eoVar.f32457q7 = null;
                il ilVar = eoVar.f32271b3;
                if (ilVar != null) {
                    org.telegram.ui.Components.z50 cameraContainer = ilVar.getCameraContainer();
                    AnimatorSet animatorSet = new AnimatorSet();
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cameraContainer, View.SCALE_X, 0.5f);
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(cameraContainer, View.SCALE_Y, 0.5f);
                    Property property = View.ALPHA;
                    animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(cameraContainer, property, 0.0f), ObjectAnimator.ofFloat(eoVar.f32271b3.getButtonsLayout(), property, 0.0f), ObjectAnimator.ofInt(eoVar.f32271b3.getPaint(), org.telegram.ui.Components.r6.f26600b, 0), ObjectAnimator.ofFloat(eoVar.f32271b3.getMuteImageView(), property, 0.0f));
                    animatorSet.addListener(new zi(eoVar, 0));
                    animatorSet.start();
                    return;
                }
                return;
            case 22:
                AndroidUtilities.forEachViews((RecyclerView) eoVar.f32542x0, (e2.h) new gg.g0(19));
                pm pmVar = eoVar.A0;
                if (pmVar != null) {
                    pmVar.O(true);
                    return;
                }
                return;
            case 23:
                eo eoVar2 = this.f35256b;
                int i14 = eoVar2.f32461qb;
                if (i14 != 0) {
                    eoVar2.E(i14, eoVar2.f32475rb, eoVar2.f32501tb, eoVar2.f32526vb, eoVar2.f32489sb, eoVar2.f32514ub);
                    eoVar2.f32461qb = 0;
                    return;
                }
                return;
            case 24:
                if (!eoVar.f32394l3 && eoVar.f32542x0 != null && eoVar.getParentActivity() != null && eoVar.fragmentView != null) {
                    org.telegram.ui.Components.wp wpVar = eoVar.f32518v2;
                    if (wpVar == null || wpVar.getTag() == null) {
                        if (eoVar.f32518v2 == null) {
                            vm vmVar = eoVar.X0;
                            int indexOfChild = vmVar.indexOfChild(eoVar.S);
                            if (indexOfChild != -1) {
                                i10 = 1;
                                org.telegram.ui.Components.wp wpVar2 = new org.telegram.ui.Components.wp(eoVar.getParentActivity(), eoVar.f32316ea);
                                eoVar.f32518v2 = wpVar2;
                                vmVar.addView(wpVar2, indexOfChild + 1, w7.a6.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                                eoVar.f32518v2.setAlpha(0.0f);
                                eoVar.f32518v2.setVisibility(4);
                            } else {
                                return;
                            }
                        } else {
                            i10 = 1;
                        }
                        int childCount2 = eoVar.f32542x0.getChildCount();
                        for (int i15 = 0; i15 < childCount2; i15++) {
                            View childAt2 = eoVar.f32542x0.getChildAt(i15);
                            if ((childAt2 instanceof org.telegram.ui.Cells.t1) && (messageObject = (t1Var = (org.telegram.ui.Cells.t1) childAt2).getMessageObject()) != null && messageObject.isOutOwner() && messageObject.isSent()) {
                                org.telegram.ui.Components.wp wpVar3 = eoVar.f32518v2;
                                ImageView imageView = wpVar3.f28811c;
                                org.telegram.ui.Components.rg rgVar = wpVar3.e;
                                if (rgVar != null) {
                                    AndroidUtilities.cancelRunOnUIThread(rgVar);
                                    wpVar3.e = null;
                                }
                                int[] iArr = new int[2];
                                t1Var.getLocationInWindow(iArr);
                                int i16 = iArr[i10];
                                ((View) wpVar3.getParent()).getLocationInWindow(iArr);
                                int i17 = i16 - iArr[i10];
                                View view = (View) t1Var.getParent();
                                wpVar3.measure(View.MeasureSpec.makeMeasureSpec(1000, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(1000, Integer.MIN_VALUE));
                                if (i17 > AndroidUtilities.dp(10.0f) + wpVar3.getMeasuredHeight()) {
                                    int C = org.telegram.messenger.a2.C(6.0f, t1Var.getChecksY(), i17);
                                    int dp = AndroidUtilities.dp(5.0f) + t1Var.getChecksX();
                                    int measuredWidth = view.getMeasuredWidth();
                                    float measuredHeight = C - wpVar3.getMeasuredHeight();
                                    wpVar3.f28812f = measuredHeight;
                                    wpVar3.setTranslationY(measuredHeight);
                                    int left = t1Var.getLeft() + dp;
                                    int dp2 = AndroidUtilities.dp(15.0f);
                                    if (left > view.getMeasuredWidth() / 2) {
                                        int measuredWidth2 = (measuredWidth - wpVar3.getMeasuredWidth()) - AndroidUtilities.dp(20.0f);
                                        wpVar3.setTranslationX(measuredWidth2);
                                        dp2 += measuredWidth2;
                                    } else {
                                        wpVar3.setTranslationX(0.0f);
                                    }
                                    float left2 = ((t1Var.getLeft() + dp) - dp2) - (imageView.getMeasuredWidth() / 2);
                                    imageView.setTranslationX(left2);
                                    if (left > view.getMeasuredWidth() / 2) {
                                        if (left2 < AndroidUtilities.dp(10.0f)) {
                                            float dp3 = left2 - AndroidUtilities.dp(10.0f);
                                            wpVar3.setTranslationX(wpVar3.getTranslationX() + dp3);
                                            imageView.setTranslationX(left2 - dp3);
                                        }
                                    } else if (left2 > wpVar3.getMeasuredWidth() - AndroidUtilities.dp(24.0f)) {
                                        float measuredWidth3 = (left2 - wpVar3.getMeasuredWidth()) + AndroidUtilities.dp(24.0f);
                                        wpVar3.setTranslationX(measuredWidth3);
                                        imageView.setTranslationX(left2 - measuredWidth3);
                                    } else if (left2 < AndroidUtilities.dp(10.0f)) {
                                        float dp4 = left2 - AndroidUtilities.dp(10.0f);
                                        wpVar3.setTranslationX(wpVar3.getTranslationX() + dp4);
                                        imageView.setTranslationX(left2 - dp4);
                                    }
                                    wpVar3.setPivotX(left2);
                                    wpVar3.setPivotY(wpVar3.getMeasuredHeight());
                                    AnimatorSet animatorSet2 = wpVar3.d;
                                    if (animatorSet2 != null) {
                                        animatorSet2.cancel();
                                        wpVar3.d = null;
                                    }
                                    wpVar3.setTag(Integer.valueOf(i10));
                                    wpVar3.setVisibility(0);
                                    AnimatorSet animatorSet3 = new AnimatorSet();
                                    wpVar3.d = animatorSet3;
                                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(wpVar3, View.ALPHA, 0.0f, 1.0f);
                                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(wpVar3, View.SCALE_X, 0.0f, 1.0f);
                                    ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(wpVar3, View.SCALE_Y, 0.0f, 1.0f);
                                    Animator[] animatorArr = new Animator[3];
                                    animatorArr[0] = ofFloat3;
                                    animatorArr[i10] = ofFloat4;
                                    animatorArr[2] = ofFloat5;
                                    animatorSet3.playTogether(animatorArr);
                                    wpVar3.d.addListener(new org.telegram.ui.Components.vp(wpVar3, 0));
                                    wpVar3.d.setDuration(180L);
                                    wpVar3.d.start();
                                    while (i13 < 2) {
                                        ViewPropertyAnimator interpolator = wpVar3.f28809a[i13].animate().scaleX(1.04f).scaleY(1.04f).setInterpolator(org.telegram.ui.Components.wr.f28821i);
                                        if (i13 == 0) {
                                            i11 = 132;
                                        } else {
                                            i11 = 500;
                                        }
                                        interpolator.setStartDelay(i11 + 140).setDuration(100L).setListener(new di.y2(wpVar3, i13, 6)).start();
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
            case 25:
                AndroidUtilities.forEachViews((RecyclerView) eoVar.f32542x0, (e2.h) new gg.g0(18));
                pm pmVar2 = eoVar.A0;
                if (pmVar2 != null) {
                    pmVar2.O(false);
                    return;
                }
                return;
            case 26:
                eo.v0(eoVar);
                return;
            case 27:
                ok okVar2 = eoVar.Y;
                if (okVar2 != null && eoVar.f32437ob != 5) {
                    okVar2.H0();
                    return;
                }
                return;
            case 28:
                org.telegram.ui.Components.vo voVar = ((org.telegram.ui.Components.vo[]) eoVar.f32255a0.f3058b)[0];
                org.telegram.ui.ActionBar.l5 l5Var = voVar.d;
                org.telegram.ui.ActionBar.l5 l5Var2 = voVar.e;
                eoVar.F1 = !eoVar.F1;
                l5Var.setPivotX(0.0f);
                l5Var2.setPivotX(0.0f);
                if (eoVar.F1) {
                    l5Var.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                    l5Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                } else {
                    l5Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                    l5Var2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                }
                AndroidUtilities.runOnUIThread(eoVar.G1, 6000L);
                return;
            default:
                eoVar.uc();
                return;
        }
    }
}
