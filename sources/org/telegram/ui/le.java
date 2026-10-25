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
    public final int f41251a;
    public final un f41252b;

    public le(un unVar, int i10) {
        this.f41251a = i10;
        this.f41252b = unVar;
    }

    @Override
    public final void run() {
        hk hkVar;
        int i10;
        float f7;
        org.telegram.ui.Cells.s1 s1Var;
        MessageObject messageObject;
        int i11;
        float f10;
        float f11;
        boolean z10;
        int i12 = this.f41251a;
        TLRPC.ChatTheme chatTheme = null;
        ?? r14 = 1;
        int i13 = 0;
        un unVar = this.f41252b;
        switch (i12) {
            case 0:
                unVar.X5 = null;
                if (unVar.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(unVar.getParentActivity(), 0, unVar.f44385qa);
                    boolean isChannel = ChatObject.isChannel(unVar.e);
                    org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22366a;
                    if (isChannel && !unVar.e.megagroup) {
                        e2Var.T = LocaleController.getString(R.string.JoinByPeekChannelText);
                        e2Var.R = LocaleController.getString(R.string.JoinByPeekChannelTitle);
                    } else {
                        e2Var.T = LocaleController.getString(R.string.JoinByPeekGroupText);
                        e2Var.R = LocaleController.getString(R.string.JoinByPeekGroupTitle);
                    }
                    alertDialog$Builder.k(LocaleController.getString(R.string.JoinByPeekJoin), new pe(unVar, 2));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new pe(unVar, 3));
                    unVar.showDialog(e2Var);
                    return;
                }
                return;
            case 1:
                unVar.f7();
                return;
            case 2:
                un.j0(unVar);
                return;
            case 3:
                unVar.ya(null, unVar.E8);
                unVar.E8 = null;
                return;
            case 4:
                if (!org.telegram.ui.ActionBar.r2.hasSheets(unVar) && (hkVar = unVar.Y) != null) {
                    hkVar.setFieldFocused(true);
                    unVar.Y.F0();
                    return;
                }
                return;
            case 5:
                unVar.x9();
                AndroidUtilities.forEachViews((RecyclerView) unVar.f44468x0, (Utilities.Callback<View>) new ye(unVar, 5));
                unVar.B7();
                yj yjVar = unVar.f44294j3;
                if (yjVar != null) {
                    yjVar.setTranslationX(unVar.b9() / 2.0f);
                }
                wj wjVar = unVar.f44306k3;
                if (wjVar != null) {
                    wjVar.setTranslationX(unVar.b9() / 2.0f);
                }
                FrameLayout frameLayout = unVar.f44205c1;
                if (frameLayout != null) {
                    frameLayout.setTranslationX(unVar.b9() / 2.0f);
                }
                unVar.Z6();
                unVar.A7();
                return;
            case 6:
                wd1 b02 = wd1.b0(-unVar.f44249f6, 0L);
                b02.f45114y = unVar;
                unVar.presentFragment(b02);
                return;
            case 7:
                unVar.nc(true);
                return;
            case 8:
                unVar.f44442v1.d(true);
                return;
            case 9:
                unVar.getNotificationCenter().onAnimationFinish(unVar.R9);
                return;
            case 10:
                int childCount = unVar.f44468x0.getChildCount();
                while (i13 < childCount) {
                    View childAt = unVar.f44468x0.getChildAt(i13);
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
                unVar.Xb = true;
                unVar.Kc(true);
                return;
            case 12:
                xk xkVar = unVar.f44465wb;
                if (xkVar != null) {
                    xkVar.requestLayout();
                    return;
                }
                return;
            case 13:
                un.f0(unVar);
                return;
            case 14:
                TLRPC.UserFull userFull = unVar.f44334m8;
                if (userFull != null) {
                    chatTheme = userFull.theme;
                }
                unVar.tb(chatTheme);
                return;
            case 15:
                un.p1(unVar);
                return;
            case 16:
                unVar.X7 = Integer.MAX_VALUE;
                unVar.Z7 = false;
                unVar.f44184a8 = 0L;
                unVar.f44198b8 = null;
                unVar.f44212c8 = null;
                unVar.f44225d8 = null;
                unVar.f44238e8 = -1;
                unVar.Y7 = false;
                unVar.jd(false);
                unVar.f44262g8 = null;
                return;
            case 17:
                kf kfVar = new kf(unVar, 7);
                if (org.telegram.ui.Components.fb1.o()) {
                    kfVar.run();
                    return;
                }
                org.telegram.ui.Components.cy0 cy0Var = new org.telegram.ui.Components.cy0(kfVar, 3);
                org.telegram.ui.Components.fb1.h.add(cy0Var);
                AndroidUtilities.runOnUIThread(cy0Var, 150L);
                return;
            case 18:
                unVar.Gb(false, true);
                return;
            case 19:
                AndroidUtilities.removeFromParent(unVar.W0);
                return;
            case 20:
                unVar.g7();
                return;
            case 21:
                unVar.Y.F0();
                return;
            case 22:
                un unVar2 = this.f41252b;
                int i14 = unVar2.Mb;
                if (i14 != 0) {
                    unVar2.j(i14, unVar2.Nb, unVar2.Ob, unVar2.Pb, unVar2.Qb, unVar2.Rb);
                    unVar2.Mb = 0;
                    return;
                }
                return;
            case 23:
                AndroidUtilities.forEachViews((RecyclerView) unVar.f44468x0, (Utilities.Callback<View>) new di.e(10));
                fm fmVar = unVar.A0;
                if (fmVar != null) {
                    fmVar.O(true);
                    return;
                }
                return;
            case 24:
                if (!unVar.f44471x3 && unVar.f44468x0 != null && unVar.getParentActivity() != null && unVar.fragmentView != null) {
                    org.telegram.ui.Components.dq dqVar = unVar.H2;
                    if (dqVar == null || dqVar.getTag() == null) {
                        if (unVar.H2 == null) {
                            mm mmVar = unVar.f44292j1;
                            int indexOfChild = mmVar.indexOfChild(unVar.S);
                            if (indexOfChild != -1) {
                                f7 = 24.0f;
                                Activity parentActivity = unVar.getParentActivity();
                                sn snVar = unVar.f44385qa;
                                ?? frameLayout2 = new FrameLayout(parentActivity);
                                frameLayout2.f27576a = new TextView[2];
                                frameLayout2.f27577b = new org.telegram.ui.Components.ak0[2];
                                FrameLayout frameLayout3 = new FrameLayout(parentActivity);
                                frameLayout3.setBackground(org.telegram.ui.ActionBar.y6.c0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23602qf, snVar)));
                                frameLayout3.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
                                frameLayout2.addView(frameLayout3, org.telegram.ui.Components.gb1.h(-2, -2.0f, 51, 0.0f, 0.0f, 0.0f, 6.0f));
                                int i15 = 0;
                                while (i15 < 2) {
                                    frameLayout2.f27577b[i15] = new ImageView(parentActivity);
                                    frameLayout2.f27577b[i15].setScaleType(ImageView.ScaleType.CENTER);
                                    org.telegram.ui.Components.ak0 ak0Var = frameLayout2.f27577b[i15];
                                    if (i15 == 0) {
                                        f10 = 0.0f;
                                    } else {
                                        f10 = 24.0f;
                                    }
                                    frameLayout3.addView(ak0Var, org.telegram.ui.Components.gb1.h(24, 24.0f, 51, 0.0f, f10, 0.0f, 0.0f));
                                    frameLayout2.f27576a[i15] = new TextView(parentActivity);
                                    org.telegram.ui.ActionBar.f7.V(frameLayout2.f27576a[i15], org.telegram.ui.ActionBar.y6.f23585pf, snVar);
                                    frameLayout2.f27576a[i15].setTextSize(r14, 14.0f);
                                    frameLayout2.f27576a[i15].setMaxLines(r14);
                                    frameLayout2.f27576a[i15].setSingleLine(r14);
                                    frameLayout2.f27576a[i15].setMaxWidth(AndroidUtilities.dp(250.0f));
                                    frameLayout2.f27576a[i15].setGravity(51);
                                    frameLayout2.f27576a[i15].setPivotX(0.0f);
                                    TextView textView = frameLayout2.f27576a[i15];
                                    if (i15 == 0) {
                                        f11 = 2.0f;
                                    } else {
                                        f11 = 26.0f;
                                    }
                                    frameLayout3.addView(textView, org.telegram.ui.Components.gb1.h(-2, -2.0f, 51, 32.0f, f11, 10.0f, 0.0f));
                                    if (i15 == 0) {
                                        z10 = r14;
                                        frameLayout2.f27577b[i15].f(R.raw.ticks_single, 24, 24, null);
                                        frameLayout2.f27576a[i15].setText(LocaleController.getString(R.string.HintSent));
                                    } else {
                                        z10 = r14;
                                        frameLayout2.f27577b[i15].f(R.raw.ticks_double, 24, 24, null);
                                        frameLayout2.f27576a[i15].setText(LocaleController.getString(R.string.HintRead));
                                    }
                                    frameLayout2.f27577b[i15].d();
                                    i15++;
                                    r14 = z10;
                                }
                                i10 = r14;
                                ImageView imageView = new ImageView(parentActivity);
                                frameLayout2.f27578c = imageView;
                                imageView.setImageResource(R.drawable.tooltip_arrow);
                                org.telegram.ui.ActionBar.f7.t(imageView, org.telegram.ui.ActionBar.y6.f23602qf, snVar, PorterDuff.Mode.MULTIPLY);
                                frameLayout2.addView(imageView, org.telegram.ui.Components.gb1.h(14, 6.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
                                unVar.H2 = frameLayout2;
                                mmVar.addView((View) frameLayout2, indexOfChild + 1, org.telegram.ui.Components.gb1.h(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                                unVar.H2.setAlpha(0.0f);
                                unVar.H2.setVisibility(4);
                            } else {
                                return;
                            }
                        } else {
                            i10 = 1;
                            f7 = 24.0f;
                        }
                        int childCount2 = unVar.f44468x0.getChildCount();
                        for (int i16 = 0; i16 < childCount2; i16++) {
                            View childAt2 = unVar.f44468x0.getChildAt(i16);
                            if ((childAt2 instanceof org.telegram.ui.Cells.s1) && (messageObject = (s1Var = (org.telegram.ui.Cells.s1) childAt2).getMessageObject()) != null && messageObject.isOutOwner() && messageObject.isSent()) {
                                org.telegram.ui.Components.dq dqVar2 = unVar.H2;
                                ImageView imageView2 = dqVar2.f27578c;
                                org.telegram.ui.Components.bq bqVar = dqVar2.e;
                                if (bqVar != null) {
                                    AndroidUtilities.cancelRunOnUIThread(bqVar);
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
                                    dqVar2.f27579f = measuredHeight;
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
                                        ViewPropertyAnimator interpolator = dqVar2.f27576a[i13].animate().scaleX(1.04f).scaleY(1.04f).setInterpolator(org.telegram.ui.Components.ds.f27586i);
                                        if (i13 == 0) {
                                            i11 = 132;
                                        } else {
                                            i11 = 500;
                                        }
                                        interpolator.setStartDelay(i11 + 140).setDuration(100L).setListener(new hi.y2(dqVar2, i13, 6)).start();
                                        i13++;
                                    }
                                    unVar.getMessagesController().removeSuggestion(0L, "NEWCOMER_TICKS");
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
                un.C0(unVar);
                return;
            case 26:
                hk hkVar2 = unVar.Y;
                if (hkVar2 != null && unVar.Kb != 5) {
                    hkVar2.F0();
                    return;
                }
                return;
            case 27:
                org.telegram.ui.Components.cp cpVar = ((org.telegram.ui.Components.cp[]) unVar.f44177a0.f4113b)[0];
                org.telegram.ui.ActionBar.b6 b6Var = cpVar.d;
                org.telegram.ui.ActionBar.b6 b6Var2 = cpVar.e;
                unVar.R1 = !unVar.R1;
                b6Var.setPivotX(0.0f);
                b6Var2.setPivotX(0.0f);
                if (unVar.R1) {
                    b6Var.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                    b6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                } else {
                    b6Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                    b6Var2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                }
                AndroidUtilities.runOnUIThread(unVar.S1, 6000L);
                return;
            case 28:
                AndroidUtilities.forEachViews((RecyclerView) unVar.f44468x0, (Utilities.Callback<View>) new di.e(11));
                fm fmVar2 = unVar.A0;
                if (fmVar2 != null) {
                    fmVar2.O(false);
                    return;
                }
                return;
            default:
                unVar.Hc();
                return;
        }
    }
}
