package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ke implements Runnable {
    public final int f38935a;
    public final sn f38936b;

    public ke(sn snVar, int i10) {
        this.f38935a = i10;
        this.f38936b = snVar;
    }

    @Override
    public final void run() {
        gk gkVar;
        int i10;
        float f7;
        org.telegram.ui.Cells.t1 t1Var;
        MessageObject messageObject;
        int i11;
        float f10;
        float f11;
        boolean z10;
        int i12 = this.f38935a;
        TLRPC.ChatTheme chatTheme = null;
        ?? r12 = 1;
        int i13 = 0;
        sn snVar = this.f38936b;
        switch (i12) {
            case 0:
                snVar.X5 = null;
                if (snVar.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(snVar.getParentActivity(), 0, snVar.f41654qa);
                    boolean isChannel = ChatObject.isChannel(snVar.e);
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20678a;
                    if (isChannel && !snVar.e.megagroup) {
                        c2Var.T = LocaleController.getString(R.string.JoinByPeekChannelText);
                        c2Var.R = LocaleController.getString(R.string.JoinByPeekChannelTitle);
                    } else {
                        c2Var.T = LocaleController.getString(R.string.JoinByPeekGroupText);
                        c2Var.R = LocaleController.getString(R.string.JoinByPeekGroupTitle);
                    }
                    alertDialog$Builder.k(LocaleController.getString(R.string.JoinByPeekJoin), new pe(snVar, 2));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new pe(snVar, 3));
                    snVar.showDialog(c2Var);
                    return;
                }
                return;
            case 1:
                snVar.b7();
                return;
            case 2:
                sn.n0(snVar);
                return;
            case 3:
                snVar.ta(null, snVar.E8);
                snVar.E8 = null;
                return;
            case 4:
                if (!org.telegram.ui.ActionBar.o2.hasSheets(snVar) && (gkVar = snVar.Y) != null) {
                    gkVar.setFieldFocused(true);
                    snVar.Y.F0();
                    return;
                }
                return;
            case 5:
                snVar.t9();
                AndroidUtilities.forEachViews((RecyclerView) snVar.f41737x0, (Utilities.Callback<View>) new xe(snVar, 6));
                snVar.x7();
                xj xjVar = snVar.f41563j3;
                if (xjVar != null) {
                    xjVar.setTranslationX(snVar.W8() / 2.0f);
                }
                vj vjVar = snVar.f41576k3;
                if (vjVar != null) {
                    vjVar.setTranslationX(snVar.W8() / 2.0f);
                }
                FrameLayout frameLayout = snVar.f41476c1;
                if (frameLayout != null) {
                    frameLayout.setTranslationX(snVar.W8() / 2.0f);
                }
                snVar.V6();
                snVar.w7();
                return;
            case 6:
                td1 a02 = td1.a0(-snVar.f41519f6, 0L);
                a02.f41967y = snVar;
                snVar.presentFragment(a02);
                return;
            case 7:
                snVar.hc(true);
                return;
            case 8:
                snVar.f41711v1.d(true);
                return;
            case 9:
                snVar.getNotificationCenter().onAnimationFinish(snVar.R9);
                return;
            case 10:
                int childCount = snVar.f41737x0.getChildCount();
                while (i13 < childCount) {
                    View childAt = snVar.f41737x0.getChildAt(i13);
                    if (childAt instanceof org.telegram.ui.Cells.t1) {
                        org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) childAt;
                        if (t1Var2.getMessageObject().type == 4) {
                            t1Var2.s2();
                        }
                    }
                    i13++;
                }
                return;
            case 11:
                snVar.Ob = true;
                snVar.Ec(true);
                return;
            case 12:
                wk wkVar = snVar.f41621nb;
                if (wkVar != null) {
                    wkVar.requestLayout();
                    return;
                }
                return;
            case 13:
                sn.N0(snVar);
                return;
            case 14:
                snVar.Bb(false, true);
                return;
            case 15:
                snVar.resumeDelayedFragmentAnimation();
                ok okVar = snVar.ia;
                AndroidUtilities.cancelRunOnUIThread(okVar);
                okVar.run();
                snVar.getNotificationCenter().runDelayedNotifications();
                return;
            case 16:
                TLRPC.UserFull userFull = snVar.f41604m8;
                if (userFull != null) {
                    chatTheme = userFull.theme;
                }
                snVar.ob(chatTheme);
                return;
            case 17:
                sn.u0(snVar);
                return;
            case 18:
                snVar.X7 = Integer.MAX_VALUE;
                snVar.Z7 = false;
                snVar.f41455a8 = 0L;
                snVar.f41469b8 = null;
                snVar.f41483c8 = null;
                snVar.f41496d8 = null;
                snVar.f41507e8 = -1;
                snVar.Y7 = false;
                snVar.dd(false);
                snVar.f41532g8 = null;
                return;
            case 19:
                snVar.c7();
                return;
            case 20:
                snVar.Y.F0();
                return;
            case 21:
                AndroidUtilities.forEachViews((RecyclerView) snVar.f41737x0, (Utilities.Callback<View>) new ci.e(11));
                em emVar = snVar.A0;
                if (emVar != null) {
                    emVar.O(true);
                    return;
                }
                return;
            case 22:
                sn snVar2 = this.f38936b;
                int i14 = snVar2.Db;
                if (i14 != 0) {
                    snVar2.j(i14, snVar2.Eb, snVar2.Fb, snVar2.Gb, snVar2.Hb, snVar2.Ib);
                    snVar2.Db = 0;
                    return;
                }
                return;
            case 23:
                if (!snVar.f41740x3 && snVar.f41737x0 != null && snVar.getParentActivity() != null && snVar.fragmentView != null) {
                    org.telegram.ui.Components.bq bqVar = snVar.H2;
                    if (bqVar == null || bqVar.getTag() == null) {
                        if (snVar.H2 == null) {
                            km kmVar = snVar.f41561j1;
                            f7 = 24.0f;
                            int indexOfChild = kmVar.indexOfChild(snVar.S);
                            if (indexOfChild != -1) {
                                Activity parentActivity = snVar.getParentActivity();
                                qn qnVar = snVar.f41654qa;
                                ?? frameLayout2 = new FrameLayout(parentActivity);
                                frameLayout2.f25123a = new TextView[2];
                                frameLayout2.f25124b = new org.telegram.ui.Components.bk0[2];
                                FrameLayout frameLayout3 = new FrameLayout(parentActivity);
                                frameLayout3.setBackground(org.telegram.ui.ActionBar.k6.c0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21429qf, qnVar)));
                                frameLayout3.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
                                frameLayout2.addView(frameLayout3, w7.z5.d(-2, -2.0f, 51, 0.0f, 0.0f, 0.0f, 6.0f));
                                int i15 = 0;
                                while (i15 < 2) {
                                    frameLayout2.f25124b[i15] = new ImageView(parentActivity);
                                    frameLayout2.f25124b[i15].setScaleType(ImageView.ScaleType.CENTER);
                                    org.telegram.ui.Components.bk0 bk0Var = frameLayout2.f25124b[i15];
                                    if (i15 == 0) {
                                        f10 = 0.0f;
                                    } else {
                                        f10 = 24.0f;
                                    }
                                    frameLayout3.addView(bk0Var, w7.z5.d(24, 24.0f, 51, 0.0f, f10, 0.0f, 0.0f));
                                    frameLayout2.f25123a[i15] = new TextView(parentActivity);
                                    org.telegram.ui.ActionBar.r6.W(frameLayout2.f25123a[i15], org.telegram.ui.ActionBar.k6.f21410pf, qnVar);
                                    frameLayout2.f25123a[i15].setTextSize(r12, 14.0f);
                                    frameLayout2.f25123a[i15].setMaxLines(r12);
                                    frameLayout2.f25123a[i15].setSingleLine(r12);
                                    frameLayout2.f25123a[i15].setMaxWidth(AndroidUtilities.dp(250.0f));
                                    frameLayout2.f25123a[i15].setGravity(51);
                                    frameLayout2.f25123a[i15].setPivotX(0.0f);
                                    TextView textView = frameLayout2.f25123a[i15];
                                    if (i15 == 0) {
                                        f11 = 2.0f;
                                    } else {
                                        f11 = 26.0f;
                                    }
                                    frameLayout3.addView(textView, w7.z5.d(-2, -2.0f, 51, 32.0f, f11, 10.0f, 0.0f));
                                    if (i15 == 0) {
                                        z10 = r12;
                                        frameLayout2.f25124b[i15].f(R.raw.ticks_single, 24, 24, null);
                                        frameLayout2.f25123a[i15].setText(LocaleController.getString(R.string.HintSent));
                                    } else {
                                        z10 = r12;
                                        frameLayout2.f25124b[i15].f(R.raw.ticks_double, 24, 24, null);
                                        frameLayout2.f25123a[i15].setText(LocaleController.getString(R.string.HintRead));
                                    }
                                    frameLayout2.f25124b[i15].d();
                                    i15++;
                                    r12 = z10;
                                }
                                i10 = r12;
                                ImageView imageView = new ImageView(parentActivity);
                                frameLayout2.f25125c = imageView;
                                imageView.setImageResource(R.drawable.tooltip_arrow);
                                org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.f21429qf, qnVar, PorterDuff.Mode.MULTIPLY);
                                frameLayout2.addView(imageView, w7.z5.d(14, 6.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
                                snVar.H2 = frameLayout2;
                                kmVar.addView((View) frameLayout2, indexOfChild + 1, w7.z5.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                                snVar.H2.setAlpha(0.0f);
                                snVar.H2.setVisibility(4);
                            } else {
                                return;
                            }
                        } else {
                            i10 = 1;
                            f7 = 24.0f;
                        }
                        int childCount2 = snVar.f41737x0.getChildCount();
                        for (int i16 = 0; i16 < childCount2; i16++) {
                            View childAt2 = snVar.f41737x0.getChildAt(i16);
                            if ((childAt2 instanceof org.telegram.ui.Cells.t1) && (messageObject = (t1Var = (org.telegram.ui.Cells.t1) childAt2).getMessageObject()) != null && messageObject.isOutOwner() && messageObject.isSent()) {
                                org.telegram.ui.Components.bq bqVar2 = snVar.H2;
                                ImageView imageView2 = bqVar2.f25125c;
                                org.telegram.ui.Components.zp zpVar = bqVar2.e;
                                if (zpVar != null) {
                                    AndroidUtilities.cancelRunOnUIThread(zpVar);
                                    bqVar2.e = null;
                                }
                                int[] iArr = new int[2];
                                t1Var.getLocationInWindow(iArr);
                                int i17 = iArr[i10];
                                ((View) bqVar2.getParent()).getLocationInWindow(iArr);
                                int i18 = i17 - iArr[i10];
                                View view = (View) t1Var.getParent();
                                bqVar2.measure(View.MeasureSpec.makeMeasureSpec(1000, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(1000, Integer.MIN_VALUE));
                                if (i18 > AndroidUtilities.dp(10.0f) + bqVar2.getMeasuredHeight()) {
                                    int C = org.telegram.messenger.v0.C(6.0f, t1Var.getChecksY(), i18);
                                    int dp = AndroidUtilities.dp(5.0f) + t1Var.getChecksX();
                                    int measuredWidth = view.getMeasuredWidth();
                                    float measuredHeight = C - bqVar2.getMeasuredHeight();
                                    bqVar2.f25126f = measuredHeight;
                                    bqVar2.setTranslationY(measuredHeight);
                                    int left = t1Var.getLeft() + dp;
                                    int dp2 = AndroidUtilities.dp(15.0f);
                                    if (left > view.getMeasuredWidth() / 2) {
                                        int measuredWidth2 = (measuredWidth - bqVar2.getMeasuredWidth()) - AndroidUtilities.dp(20.0f);
                                        bqVar2.setTranslationX(measuredWidth2);
                                        dp2 += measuredWidth2;
                                    } else {
                                        bqVar2.setTranslationX(0.0f);
                                    }
                                    float left2 = ((t1Var.getLeft() + dp) - dp2) - (imageView2.getMeasuredWidth() / 2);
                                    imageView2.setTranslationX(left2);
                                    if (left > view.getMeasuredWidth() / 2) {
                                        if (left2 < AndroidUtilities.dp(10.0f)) {
                                            float dp3 = left2 - AndroidUtilities.dp(10.0f);
                                            bqVar2.setTranslationX(bqVar2.getTranslationX() + dp3);
                                            imageView2.setTranslationX(left2 - dp3);
                                        }
                                    } else if (left2 > bqVar2.getMeasuredWidth() - AndroidUtilities.dp(f7)) {
                                        float measuredWidth3 = (left2 - bqVar2.getMeasuredWidth()) + AndroidUtilities.dp(f7);
                                        bqVar2.setTranslationX(measuredWidth3);
                                        imageView2.setTranslationX(left2 - measuredWidth3);
                                    } else if (left2 < AndroidUtilities.dp(10.0f)) {
                                        float dp4 = left2 - AndroidUtilities.dp(10.0f);
                                        bqVar2.setTranslationX(bqVar2.getTranslationX() + dp4);
                                        imageView2.setTranslationX(left2 - dp4);
                                    }
                                    bqVar2.setPivotX(left2);
                                    bqVar2.setPivotY(bqVar2.getMeasuredHeight());
                                    AnimatorSet animatorSet = bqVar2.d;
                                    if (animatorSet != null) {
                                        animatorSet.cancel();
                                        bqVar2.d = null;
                                    }
                                    bqVar2.setTag(Integer.valueOf(i10));
                                    bqVar2.setVisibility(0);
                                    AnimatorSet animatorSet2 = new AnimatorSet();
                                    bqVar2.d = animatorSet2;
                                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(bqVar2, View.ALPHA, 0.0f, 1.0f);
                                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(bqVar2, View.SCALE_X, 0.0f, 1.0f);
                                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(bqVar2, View.SCALE_Y, 0.0f, 1.0f);
                                    Animator[] animatorArr = new Animator[3];
                                    animatorArr[0] = ofFloat;
                                    animatorArr[i10] = ofFloat2;
                                    animatorArr[2] = ofFloat3;
                                    animatorSet2.playTogether(animatorArr);
                                    bqVar2.d.addListener(new org.telegram.ui.Components.aq(bqVar2, 0));
                                    bqVar2.d.setDuration(180L);
                                    bqVar2.d.start();
                                    while (i13 < 2) {
                                        ViewPropertyAnimator interpolator = bqVar2.f25123a[i13].animate().scaleX(1.04f).scaleY(1.04f).setInterpolator(org.telegram.ui.Components.bs.f25135i);
                                        if (i13 == 0) {
                                            i11 = 132;
                                        } else {
                                            i11 = 500;
                                        }
                                        interpolator.setStartDelay(i11 + 140).setDuration(100L).setListener(new gi.p2(bqVar2, i13, 6)).start();
                                        i13++;
                                    }
                                    snVar.getMessagesController().removeSuggestion(0L, "NEWCOMER_TICKS");
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
                sn.K0(snVar);
                return;
            case 25:
                AndroidUtilities.forEachViews((RecyclerView) snVar.f41737x0, (Utilities.Callback<View>) new ci.e(10));
                em emVar2 = snVar.A0;
                if (emVar2 != null) {
                    emVar2.O(false);
                    return;
                }
                return;
            case 26:
                AndroidUtilities.removeFromParent(snVar.W0);
                return;
            case 27:
                gk gkVar2 = snVar.Y;
                if (gkVar2 != null && snVar.Bb != 5) {
                    gkVar2.F0();
                    return;
                }
                return;
            case 28:
                org.telegram.ui.Components.ap apVar = ((org.telegram.ui.Components.ap[]) snVar.f41448a0.f900b)[0];
                org.telegram.ui.ActionBar.n5 n5Var = apVar.d;
                org.telegram.ui.ActionBar.n5 n5Var2 = apVar.e;
                snVar.R1 = !snVar.R1;
                n5Var.setPivotX(0.0f);
                n5Var2.setPivotX(0.0f);
                if (snVar.R1) {
                    n5Var.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                    n5Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                } else {
                    n5Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                    n5Var2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                }
                AndroidUtilities.runOnUIThread(snVar.S1, 6000L);
                return;
            default:
                snVar.Bc();
                return;
        }
    }
}
