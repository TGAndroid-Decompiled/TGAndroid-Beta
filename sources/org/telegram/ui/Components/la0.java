package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
public final class la0 extends org.telegram.ui.ActionBar.p2 implements bv0, lg.b, NotificationCenter.NotificationCenterDelegate {
    public org.telegram.ui.ActionBar.i2 E;
    public o6 F;
    public org.telegram.ui.ActionBar.w0 G;
    public org.telegram.ui.ActionBar.w0 H;
    public SparseArray I;
    public org.telegram.ui.ActionBar.g1 J;
    public org.telegram.ui.ActionBar.g1 K;
    public boolean L;
    public boolean M;
    public int N;
    public org.telegram.ui.ActionBar.g1 O;
    public org.telegram.ui.ActionBar.g1 P;
    public org.telegram.ui.ActionBar.g1 Q;
    public ka0 R;
    public FrameLayout S;
    public bi.d T;
    public bi.c1 U;
    public ia0 V;
    public int W;
    public int X;
    public final boolean[] Y;
    public final float[] Z;
    public int f24917a;
    public final boolean[] f24918a0;
    public av0 f24919b;
    public final ValueAnimator[] f24920b0;
    public TLRPC.ChatFull f24921c;
    public TLRPC.UserFull d;
    public long e;
    public long f24922f;
    public String h;
    public String f24923n;
    public int f24924r;
    public FrameLayout f24925s;
    public final FrameLayout[] v;
    public final org.telegram.ui.ActionBar.l5[] f24926w;
    public final o6[] f24927x;
    public ga0 f24928y;

    public la0(Bundle bundle, av0 av0Var) {
        super(bundle);
        this.v = new FrameLayout[2];
        this.f24926w = new org.telegram.ui.ActionBar.l5[2];
        this.f24927x = new o6[2];
        this.L = true;
        this.M = true;
        this.N = -12;
        this.Y = new boolean[2];
        this.Z = new float[2];
        this.f24918a0 = new boolean[]{true, true};
        this.f24920b0 = new ValueAnimator[2];
        this.f24919b = av0Var;
    }

    public static org.telegram.ui.ActionBar.l V(la0 la0Var) {
        return la0Var.actionBar;
    }

    public static org.telegram.ui.ActionBar.l W(la0 la0Var) {
        return la0Var.actionBar;
    }

    @Override
    public final void M() {
        av0 av0Var;
        ia0 ia0Var = this.V;
        if (ia0Var != null && (av0Var = this.f24919b) != null) {
            ia0Var.setNewMediaCounts(av0Var.f21612c);
        }
        a0();
    }

    public final void X(TLRPC.ChatFull chatFull) {
        this.f24921c = chatFull;
    }

    public final void Y(int i10, boolean z10, boolean z11) {
        boolean z12;
        float f7;
        float f10;
        float dp;
        int i11 = this.f24917a;
        if (i11 != 3) {
            if (i10 != 1 || i11 != 2) {
                boolean[] zArr = this.Y;
                boolean z13 = zArr[i10];
                boolean[] zArr2 = this.f24918a0;
                if (z13 == z10 && !zArr2[i10]) {
                    return;
                }
                int i12 = 0;
                if (!zArr2[i10] && z11) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                zArr2[i10] = false;
                zArr[i10] = z10;
                ValueAnimator[] valueAnimatorArr = this.f24920b0;
                ValueAnimator valueAnimator = valueAnimatorArr[i10];
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    valueAnimatorArr[i10] = null;
                }
                float[] fArr = this.Z;
                o6[] o6VarArr = this.f24927x;
                float f11 = 0.0f;
                if (z12) {
                    o6VarArr[i10].setVisibility(0);
                    float f12 = fArr[i10];
                    if (z10) {
                        f11 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, f11);
                    valueAnimatorArr[i10] = ofFloat;
                    ofFloat.addUpdateListener(new org.telegram.ui.ActionBar.s2(this, i10, 4));
                    valueAnimatorArr[i10].addListener(new ja0(this, i10, z10, 0));
                    valueAnimatorArr[i10].setDuration(320L);
                    valueAnimatorArr[i10].setInterpolator(wr.h);
                    valueAnimatorArr[i10].start();
                    return;
                }
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                fArr[i10] = f7;
                org.telegram.ui.ActionBar.l5[] l5VarArr = this.f24926w;
                org.telegram.ui.ActionBar.l5 l5Var = l5VarArr[i10];
                float f13 = 1.111f;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 1.111f;
                }
                l5Var.setScaleX(f10);
                org.telegram.ui.ActionBar.l5 l5Var2 = l5VarArr[i10];
                if (z10) {
                    f13 = 1.0f;
                }
                l5Var2.setScaleY(f13);
                org.telegram.ui.ActionBar.l5 l5Var3 = l5VarArr[i10];
                if (z10) {
                    dp = 0.0f;
                } else {
                    dp = AndroidUtilities.dp(8.0f);
                }
                l5Var3.setTranslationY(dp);
                o6 o6Var = o6VarArr[i10];
                if (z10) {
                    f11 = 1.0f;
                }
                o6Var.setAlpha(f11);
                o6 o6Var2 = o6VarArr[i10];
                if (!z10) {
                    i12 = 8;
                }
                o6Var2.setVisibility(i12);
            }
        }
    }

    public final void Z() {
        if (this.V.getSearchOptionsItem() != null) {
            this.V.getSearchOptionsItem().setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.j6.G6), PorterDuff.Mode.SRC_IN));
        }
        this.actionBar.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17872a7, false));
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        lVar.C(org.telegram.ui.ActionBar.j6.w0(null, i10, false), false);
        this.actionBar.C(org.telegram.ui.ActionBar.j6.w0(null, i10, false), true);
        this.actionBar.A(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18327z8, false), false);
        this.actionBar.setTitleColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        org.telegram.ui.ActionBar.l5[] l5VarArr = this.f24926w;
        org.telegram.ui.ActionBar.l5 l5Var = l5VarArr[0];
        if (l5Var != null) {
            l5Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        }
        org.telegram.ui.ActionBar.l5 l5Var2 = l5VarArr[1];
        if (l5Var2 != null) {
            l5Var2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        }
    }

    public final void a0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.la0.a0():void");
    }

    @Override
    public final boolean canBeginSlide() {
        if (!this.V.x0()) {
            return false;
        }
        return super.canBeginSlide();
    }

    @Override
    public final android.view.View createView(android.content.Context r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.la0.createView(android.content.Context):android.view.View");
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.userInfoDidLoad && ((Long) objArr[0]).longValue() == this.e) {
            TLRPC.UserFull userFull = (TLRPC.UserFull) objArr[1];
            this.d = userFull;
            ia0 ia0Var = this.V;
            if (ia0Var != null) {
                ia0Var.setUserInfo(userFull);
            }
        }
    }

    @Override
    public final int getNavigationBarColor() {
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.j6.f17928d6);
        if (getLastStoryViewer() != null && getLastStoryViewer().attachedToParent()) {
            return getLastStoryViewer().getNavigationBarColor(themedColor);
        }
        return themedColor;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        x6 x6Var = new x6(this, 4);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, x6Var, org.telegram.ui.ActionBar.j6.f17928d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, x6Var, org.telegram.ui.ActionBar.j6.f18327z8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, x6Var, org.telegram.ui.ActionBar.j6.G6));
        arrayList.addAll(this.V.getThemeDescriptions());
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().H0) {
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17928d6, false);
            if (this.actionBar.s()) {
                w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18273w8, false);
            }
            if (i0.a.f(w02) > 0.699999988079071d) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (!this.V.x0()) {
            return false;
        }
        ia0 ia0Var = this.V;
        if (ia0Var.getSelectedTab() != ia0Var.I0.getFirstTabId()) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (hasShownSheet()) {
            if (z10) {
                closeSheet();
                return false;
            }
        } else {
            ia0 ia0Var = this.V;
            if (ia0Var.C1) {
                if (z10) {
                    ia0Var.L(false);
                }
            } else {
                return super.onBackPressed(z10);
            }
        }
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        int i10;
        this.f24917a = getArguments().getInt("type", 0);
        this.e = getArguments().getLong("dialog_id");
        this.f24922f = getArguments().getLong("topic_id", 0L);
        this.h = getArguments().getString("hashtag", "");
        this.f24923n = getArguments().getString("username", "");
        this.f24924r = getArguments().getInt("storiesCount", -1);
        int i11 = this.f24917a;
        if (i11 == 2) {
            i10 = 9;
        } else if (i11 == 1) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        this.W = getArguments().getInt("start_from", i10);
        getNotificationCenter().addObserver(this, NotificationCenter.userInfoDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        getNotificationCenter().addObserver(this, NotificationCenter.storiesEnabledUpdate);
        if (DialogObject.isUserDialog(this.e) && this.f24922f == 0) {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.e));
            if (UserObject.isUserSelf(user)) {
                getMessagesController().loadUserInfo(user, false, this.classGuid);
                this.d = getMessagesController().getUserFull(this.e);
            }
        }
        if (this.f24919b == null) {
            this.f24919b = new av0(this);
        }
        this.f24919b.f21618x.add(this);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.userInfoDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        getNotificationCenter().removeObserver(this, NotificationCenter.storiesEnabledUpdate);
        bi.c1 c1Var = this.U;
        if (c1Var != null) {
            this.U = null;
            AndroidUtilities.runOnUIThread(c1Var);
        }
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        ia0 ia0Var = this.V;
        if (ia0Var != null) {
            ia0Var.setPagesPaddingBottom(i13);
        }
    }

    @Override
    public final List z() {
        String str;
        Activity parentActivity = getParentActivity();
        DispatchQueue dispatchQueue = og.p1.f14450m;
        if (parentActivity.getSharedPreferences("shapedetector_conf", 0).getBoolean("learning", false)) {
            str = "Disable";
        } else {
            str = "Enable";
        }
        return Arrays.asList(new lg.a(str.concat(" shape detector learning debug"), new dq(this, 26)));
    }
}
