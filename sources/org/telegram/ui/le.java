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
public final class le implements Runnable {
    public final int f41090a;
    public final wn f41091b;

    public le(wn wnVar, int i10) {
        this.f41090a = i10;
        this.f41091b = wnVar;
    }

    @Override
    public final void run() {
        jk jkVar;
        int i10;
        float f7;
        org.telegram.ui.Cells.s1 s1Var;
        MessageObject messageObject;
        int i11;
        float f10;
        float f11;
        boolean z10;
        int i12 = this.f41090a;
        TLRPC.ChatTheme chatTheme = null;
        int i13 = 0;
        ?? r15 = 1;
        wn wnVar = this.f41091b;
        switch (i12) {
            case 0:
                wnVar.f45064b6 = null;
                if (wnVar.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wnVar.getParentActivity(), 0, wnVar.f45309ua);
                    boolean isChannel = ChatObject.isChannel(wnVar.e);
                    org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
                    if (isChannel && !wnVar.e.megagroup) {
                        e2Var.T = LocaleController.getString(R.string.JoinByPeekChannelText);
                        e2Var.R = LocaleController.getString(R.string.JoinByPeekChannelTitle);
                    } else {
                        e2Var.T = LocaleController.getString(R.string.JoinByPeekGroupText);
                        e2Var.R = LocaleController.getString(R.string.JoinByPeekGroupTitle);
                    }
                    alertDialog$Builder.k(LocaleController.getString(R.string.JoinByPeekJoin), new qe(wnVar, 2));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new qe(wnVar, 3));
                    wnVar.showDialog(e2Var);
                    return;
                }
                return;
            case 1:
                wnVar.h7();
                return;
            case 2:
                wn.j0(wnVar);
                return;
            case 3:
                wnVar.Ba(null, wnVar.I8);
                wnVar.I8 = null;
                return;
            case 4:
                if (!org.telegram.ui.ActionBar.r2.hasSheets(wnVar) && (jkVar = wnVar.Y) != null) {
                    jkVar.setFieldFocused(true);
                    wnVar.Y.E0();
                    return;
                }
                return;
            case 5:
                wnVar.A9();
                AndroidUtilities.forEachViews((RecyclerView) wnVar.f45339x0, (Utilities.Callback<View>) new ye(wnVar, 6));
                wnVar.D7();
                ak akVar = wnVar.f45165j3;
                if (akVar != null) {
                    akVar.setTranslationX(wnVar.e9() / 2.0f);
                }
                yj yjVar = wnVar.f45177k3;
                if (yjVar != null) {
                    yjVar.setTranslationX(wnVar.e9() / 2.0f);
                }
                FrameLayout frameLayout = wnVar.f45074c1;
                if (frameLayout != null) {
                    frameLayout.setTranslationX(wnVar.e9() / 2.0f);
                }
                wnVar.b7();
                wnVar.C7();
                return;
            case 6:
                yd1 b02 = yd1.b0(-wnVar.f45168j6, 0L);
                b02.f45978y = wnVar;
                wnVar.presentFragment(b02);
                return;
            case 7:
                wnVar.rc(true);
                return;
            case 8:
                wnVar.f45313v1.d(true);
                return;
            case 9:
                wnVar.getNotificationCenter().onAnimationFinish(wnVar.V9);
                return;
            case 10:
                int childCount = wnVar.f45339x0.getChildCount();
                while (i13 < childCount) {
                    View childAt = wnVar.f45339x0.getChildAt(i13);
                    if (childAt instanceof org.telegram.ui.Cells.s1) {
                        org.telegram.ui.Cells.s1 s1Var2 = (org.telegram.ui.Cells.s1) childAt;
                        if (s1Var2.getMessageObject().type == 4) {
                            s1Var2.t2();
                        }
                    }
                    i13++;
                }
                return;
            case 11:
                wnVar.f45070bc = true;
                wnVar.Oc(true);
                return;
            case 12:
                zk zkVar = wnVar.Ab;
                if (zkVar != null) {
                    zkVar.requestLayout();
                    return;
                }
                return;
            case 13:
                wnVar.resumeDelayedFragmentAnimation();
                rk rkVar = wnVar.f45207ma;
                AndroidUtilities.cancelRunOnUIThread(rkVar);
                rkVar.run();
                wnVar.getNotificationCenter().runDelayedNotifications();
                return;
            case 14:
                wn.M0(wnVar);
                return;
            case 15:
                TLRPC.UserFull userFull = wnVar.f45255q8;
                if (userFull != null) {
                    chatTheme = userFull.theme;
                }
                wnVar.xb(chatTheme);
                return;
            case 16:
                wn.Q0(wnVar);
                return;
            case 17:
                wnVar.f45066b8 = Integer.MAX_VALUE;
                wnVar.f45095d8 = false;
                wnVar.f45109e8 = 0L;
                wnVar.f45121f8 = null;
                wnVar.f45133g8 = null;
                wnVar.f45145h8 = null;
                wnVar.f45158i8 = -1;
                wnVar.f45081c8 = false;
                wnVar.nd(false);
                wnVar.f45182k8 = null;
                return;
            case 18:
                le leVar = new le(wnVar, 13);
                if (org.telegram.ui.Components.jb1.u()) {
                    leVar.run();
                    return;
                }
                org.telegram.ui.Components.dy0 dy0Var = new org.telegram.ui.Components.dy0(leVar, 3);
                org.telegram.ui.Components.jb1.h.add(dy0Var);
                AndroidUtilities.runOnUIThread(dy0Var, 150L);
                return;
            case 19:
                wnVar.Kb(false, true);
                return;
            case 20:
                wn.b1(wnVar);
                return;
            case 21:
                wnVar.i7();
                return;
            case 22:
                wnVar.Y.E0();
                return;
            case 23:
                wn wnVar2 = this.f41091b;
                int i14 = wnVar2.Qb;
                if (i14 != 0) {
                    wnVar2.j(i14, wnVar2.Rb, wnVar2.Sb, wnVar2.Tb, wnVar2.Ub, wnVar2.Vb);
                    wnVar2.Qb = 0;
                    return;
                }
                return;
            case 24:
                if (!wnVar.f45342x3 && wnVar.f45339x0 != null && wnVar.getParentActivity() != null && wnVar.fragmentView != null) {
                    org.telegram.ui.Components.dq dqVar = wnVar.H2;
                    if (dqVar == null || dqVar.getTag() == null) {
                        if (wnVar.H2 == null) {
                            om omVar = wnVar.f45163j1;
                            f7 = 24.0f;
                            int indexOfChild = omVar.indexOfChild(wnVar.S);
                            if (indexOfChild != -1) {
                                Activity parentActivity = wnVar.getParentActivity();
                                un unVar = wnVar.f45309ua;
                                ?? frameLayout2 = new FrameLayout(parentActivity);
                                frameLayout2.f27517a = new TextView[2];
                                frameLayout2.f27518b = new org.telegram.ui.Components.bk0[2];
                                FrameLayout frameLayout3 = new FrameLayout(parentActivity);
                                frameLayout3.setBackground(org.telegram.ui.ActionBar.y6.c0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23605qf, unVar)));
                                frameLayout3.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
                                frameLayout2.addView(frameLayout3, org.telegram.ui.Components.kb1.h(-2, -2.0f, 51, 0.0f, 0.0f, 0.0f, 6.0f));
                                int i15 = 0;
                                while (i15 < 2) {
                                    frameLayout2.f27518b[i15] = new ImageView(parentActivity);
                                    frameLayout2.f27518b[i15].setScaleType(ImageView.ScaleType.CENTER);
                                    org.telegram.ui.Components.bk0 bk0Var = frameLayout2.f27518b[i15];
                                    if (i15 == 0) {
                                        f10 = 0.0f;
                                    } else {
                                        f10 = 24.0f;
                                    }
                                    frameLayout3.addView(bk0Var, org.telegram.ui.Components.kb1.h(24, 24.0f, 51, 0.0f, f10, 0.0f, 0.0f));
                                    frameLayout2.f27517a[i15] = new TextView(parentActivity);
                                    org.telegram.ui.ActionBar.f7.V(frameLayout2.f27517a[i15], org.telegram.ui.ActionBar.y6.f23588pf, unVar);
                                    frameLayout2.f27517a[i15].setTextSize(r15, 14.0f);
                                    frameLayout2.f27517a[i15].setMaxLines(r15);
                                    frameLayout2.f27517a[i15].setSingleLine(r15);
                                    frameLayout2.f27517a[i15].setMaxWidth(AndroidUtilities.dp(250.0f));
                                    frameLayout2.f27517a[i15].setGravity(51);
                                    frameLayout2.f27517a[i15].setPivotX(0.0f);
                                    TextView textView = frameLayout2.f27517a[i15];
                                    if (i15 == 0) {
                                        f11 = 2.0f;
                                    } else {
                                        f11 = 26.0f;
                                    }
                                    frameLayout3.addView(textView, org.telegram.ui.Components.kb1.h(-2, -2.0f, 51, 32.0f, f11, 10.0f, 0.0f));
                                    if (i15 == 0) {
                                        z10 = r15;
                                        frameLayout2.f27518b[i15].f(R.raw.ticks_single, 24, 24, null);
                                        frameLayout2.f27517a[i15].setText(LocaleController.getString(R.string.HintSent));
                                    } else {
                                        z10 = r15;
                                        frameLayout2.f27518b[i15].f(R.raw.ticks_double, 24, 24, null);
                                        frameLayout2.f27517a[i15].setText(LocaleController.getString(R.string.HintRead));
                                    }
                                    frameLayout2.f27518b[i15].d();
                                    i15++;
                                    r15 = z10;
                                }
                                i10 = r15;
                                ImageView imageView = new ImageView(parentActivity);
                                frameLayout2.f27519c = imageView;
                                imageView.setImageResource(R.drawable.tooltip_arrow);
                                org.telegram.ui.ActionBar.f7.t(imageView, org.telegram.ui.ActionBar.y6.f23605qf, unVar, PorterDuff.Mode.MULTIPLY);
                                frameLayout2.addView(imageView, org.telegram.ui.Components.kb1.h(14, 6.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
                                wnVar.H2 = frameLayout2;
                                omVar.addView((View) frameLayout2, indexOfChild + 1, org.telegram.ui.Components.kb1.h(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                                wnVar.H2.setAlpha(0.0f);
                                wnVar.H2.setVisibility(4);
                            } else {
                                return;
                            }
                        } else {
                            i10 = 1;
                            f7 = 24.0f;
                        }
                        int childCount2 = wnVar.f45339x0.getChildCount();
                        for (int i16 = 0; i16 < childCount2; i16++) {
                            View childAt2 = wnVar.f45339x0.getChildAt(i16);
                            if ((childAt2 instanceof org.telegram.ui.Cells.s1) && (messageObject = (s1Var = (org.telegram.ui.Cells.s1) childAt2).getMessageObject()) != null && messageObject.isOutOwner() && messageObject.isSent()) {
                                org.telegram.ui.Components.dq dqVar2 = wnVar.H2;
                                ImageView imageView2 = dqVar2.f27519c;
                                org.telegram.ui.Components.cp cpVar = dqVar2.e;
                                if (cpVar != null) {
                                    AndroidUtilities.cancelRunOnUIThread(cpVar);
                                    dqVar2.e = null;
                                }
                                int[] iArr = new int[2];
                                s1Var.getLocationInWindow(iArr);
                                int i17 = iArr[i10];
                                ((View) dqVar2.getParent()).getLocationInWindow(iArr);
                                int i18 = i17 - iArr[i10];
                                View view = (View) s1Var.getParent();
                                dqVar2.measure(View.MeasureSpec.makeMeasureSpec(1000, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(1000, Integer.MIN_VALUE));
                                if (i18 > AndroidUtilities.dp(10.0f) + dqVar2.getMeasuredHeight()) {
                                    int D = org.telegram.messenger.t.D(6.0f, s1Var.getChecksY(), i18);
                                    int dp = AndroidUtilities.dp(5.0f) + s1Var.getChecksX();
                                    int measuredWidth = view.getMeasuredWidth();
                                    float measuredHeight = D - dqVar2.getMeasuredHeight();
                                    dqVar2.f27520f = measuredHeight;
                                    dqVar2.setTranslationY(measuredHeight);
                                    int left = s1Var.getLeft() + dp;
                                    int dp2 = AndroidUtilities.dp(15.0f);
                                    if (left > view.getMeasuredWidth() / 2) {
                                        int measuredWidth2 = (measuredWidth - dqVar2.getMeasuredWidth()) - AndroidUtilities.dp(20.0f);
                                        dqVar2.setTranslationX(measuredWidth2);
                                        dp2 += measuredWidth2;
                                    } else {
                                        dqVar2.setTranslationX(0.0f);
                                    }
                                    float left2 = ((s1Var.getLeft() + dp) - dp2) - (imageView2.getMeasuredWidth() / 2);
                                    imageView2.setTranslationX(left2);
                                    if (left > view.getMeasuredWidth() / 2) {
                                        if (left2 < AndroidUtilities.dp(10.0f)) {
                                            float dp3 = left2 - AndroidUtilities.dp(10.0f);
                                            dqVar2.setTranslationX(dqVar2.getTranslationX() + dp3);
                                            imageView2.setTranslationX(left2 - dp3);
                                        }
                                    } else if (left2 > dqVar2.getMeasuredWidth() - AndroidUtilities.dp(f7)) {
                                        float measuredWidth3 = (left2 - dqVar2.getMeasuredWidth()) + AndroidUtilities.dp(f7);
                                        dqVar2.setTranslationX(measuredWidth3);
                                        imageView2.setTranslationX(left2 - measuredWidth3);
                                    } else if (left2 < AndroidUtilities.dp(10.0f)) {
                                        float dp4 = left2 - AndroidUtilities.dp(10.0f);
                                        dqVar2.setTranslationX(dqVar2.getTranslationX() + dp4);
                                        imageView2.setTranslationX(left2 - dp4);
                                    }
                                    dqVar2.setPivotX(left2);
                                    dqVar2.setPivotY(dqVar2.getMeasuredHeight());
                                    AnimatorSet animatorSet = dqVar2.d;
                                    if (animatorSet != null) {
                                        animatorSet.cancel();
                                        dqVar2.d = null;
                                    }
                                    dqVar2.setTag(Integer.valueOf(i10));
                                    dqVar2.setVisibility(0);
                                    AnimatorSet animatorSet2 = new AnimatorSet();
                                    dqVar2.d = animatorSet2;
                                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(dqVar2, View.ALPHA, 0.0f, 1.0f);
                                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(dqVar2, View.SCALE_X, 0.0f, 1.0f);
                                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(dqVar2, View.SCALE_Y, 0.0f, 1.0f);
                                    Animator[] animatorArr = new Animator[3];
                                    animatorArr[0] = ofFloat;
                                    animatorArr[i10] = ofFloat2;
                                    animatorArr[2] = ofFloat3;
                                    animatorSet2.playTogether(animatorArr);
                                    dqVar2.d.addListener(new org.telegram.ui.Components.cq(dqVar2, 0));
                                    dqVar2.d.setDuration(180L);
                                    dqVar2.d.start();
                                    while (i13 < 2) {
                                        ViewPropertyAnimator interpolator = dqVar2.f27517a[i13].animate().scaleX(1.04f).scaleY(1.04f).setInterpolator(org.telegram.ui.Components.ds.f27532i);
                                        if (i13 == 0) {
                                            i11 = 132;
                                        } else {
                                            i11 = 500;
                                        }
                                        interpolator.setStartDelay(i11 + 140).setDuration(100L).setListener(new hi.y2(dqVar2, i13, 6)).start();
                                        i13++;
                                    }
                                    wnVar.getMessagesController().removeSuggestion(0L, "NEWCOMER_TICKS");
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
                wn.A0(wnVar);
                return;
            case 26:
                AndroidUtilities.removeFromParent(wnVar.W0);
                return;
            case 27:
                jk jkVar2 = wnVar.Y;
                if (jkVar2 != null && wnVar.Ob != 5) {
                    jkVar2.E0();
                    return;
                }
                return;
            case 28:
                AndroidUtilities.forEachViews((RecyclerView) wnVar.f45339x0, (Utilities.Callback<View>) new di.e(10));
                hm hmVar = wnVar.A0;
                if (hmVar != null) {
                    hmVar.O(true);
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.dp dpVar = ((org.telegram.ui.Components.dp[]) wnVar.f45045a0.f4113b)[0];
                org.telegram.ui.ActionBar.b6 b6Var = dpVar.d;
                org.telegram.ui.ActionBar.b6 b6Var2 = dpVar.e;
                wnVar.R1 = !wnVar.R1;
                b6Var.setPivotX(0.0f);
                b6Var2.setPivotX(0.0f);
                if (wnVar.R1) {
                    b6Var.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                    b6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                } else {
                    b6Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                    b6Var2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                }
                AndroidUtilities.runOnUIThread(wnVar.S1, 6000L);
                return;
        }
    }
}
