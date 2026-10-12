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
public final class cb0 extends org.telegram.ui.ActionBar.m2 implements qv0, ng.b, NotificationCenter.NotificationCenterDelegate {
    public org.telegram.ui.ActionBar.f2 E;
    public s6 F;
    public org.telegram.ui.ActionBar.u0 G;
    public org.telegram.ui.ActionBar.u0 H;
    public SparseArray I;
    public org.telegram.ui.ActionBar.e1 J;
    public org.telegram.ui.ActionBar.e1 K;
    public boolean L;
    public boolean M;
    public int N;
    public org.telegram.ui.ActionBar.e1 O;
    public org.telegram.ui.ActionBar.e1 P;
    public org.telegram.ui.ActionBar.e1 Q;
    public bb0 R;
    public FrameLayout S;
    public di.d T;
    public di.x0 U;
    public za0 V;
    public int W;
    public int X;
    public final boolean[] Y;
    public final float[] Z;
    public int f24016a;
    public final boolean[] f24017a0;
    public pv0 f24018b;
    public final ValueAnimator[] f24019b0;
    public TLRPC.ChatFull f24020c;
    public TLRPC.UserFull d;
    public long e;
    public long f24021f;
    public String h;
    public String f24022n;
    public int f24023r;
    public FrameLayout f24024s;
    public final FrameLayout[] v;
    public final org.telegram.ui.ActionBar.h5[] f24025w;
    public final s6[] f24026x;
    public xa0 f24027y;

    public cb0(Bundle bundle, pv0 pv0Var) {
        super(bundle);
        this.v = new FrameLayout[2];
        this.f24025w = new org.telegram.ui.ActionBar.h5[2];
        this.f24026x = new s6[2];
        this.L = true;
        this.M = true;
        this.N = -12;
        this.Y = new boolean[2];
        this.Z = new float[2];
        this.f24017a0 = new boolean[]{true, true};
        this.f24019b0 = new ValueAnimator[2];
        this.f24018b = pv0Var;
    }

    public static org.telegram.ui.ActionBar.k V(cb0 cb0Var) {
        return cb0Var.actionBar;
    }

    public static org.telegram.ui.ActionBar.k W(cb0 cb0Var) {
        return cb0Var.actionBar;
    }

    @Override
    public final List B() {
        String str;
        Activity parentActivity = getParentActivity();
        DispatchQueue dispatchQueue = qg.k1.f43469m;
        if (parentActivity.getSharedPreferences("shapedetector_conf", 0).getBoolean("learning", false)) {
            str = "Disable";
        } else {
            str = "Enable";
        }
        return Arrays.asList(new ng.a(str.concat(" shape detector learning debug"), new kq(this, 27)));
    }

    @Override
    public final void M() {
        pv0 pv0Var;
        za0 za0Var = this.V;
        if (za0Var != null && (pv0Var = this.f24018b) != null) {
            za0Var.setNewMediaCounts(pv0Var.f28426c);
        }
        a0();
    }

    public final void X(TLRPC.ChatFull chatFull) {
        this.f24020c = chatFull;
    }

    public final void Y(int i10, boolean z10, boolean z11) {
        boolean z12;
        float f7;
        float f10;
        float dp;
        int i11 = this.f24016a;
        if (i11 != 3) {
            if (i10 != 1 || i11 != 2) {
                boolean[] zArr = this.Y;
                boolean z13 = zArr[i10];
                boolean[] zArr2 = this.f24017a0;
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
                ValueAnimator[] valueAnimatorArr = this.f24019b0;
                ValueAnimator valueAnimator = valueAnimatorArr[i10];
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    valueAnimatorArr[i10] = null;
                }
                float[] fArr = this.Z;
                s6[] s6VarArr = this.f24026x;
                float f11 = 0.0f;
                if (z12) {
                    s6VarArr[i10].setVisibility(0);
                    float f12 = fArr[i10];
                    if (z10) {
                        f11 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, f11);
                    valueAnimatorArr[i10] = ofFloat;
                    ofFloat.addUpdateListener(new org.telegram.ui.ActionBar.p2(this, i10, 5));
                    valueAnimatorArr[i10].addListener(new ab0(this, i10, z10, 0));
                    valueAnimatorArr[i10].setDuration(320L);
                    valueAnimatorArr[i10].setInterpolator(es.h);
                    valueAnimatorArr[i10].start();
                    return;
                }
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                fArr[i10] = f7;
                org.telegram.ui.ActionBar.h5[] h5VarArr = this.f24025w;
                org.telegram.ui.ActionBar.h5 h5Var = h5VarArr[i10];
                float f13 = 1.111f;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 1.111f;
                }
                h5Var.setScaleX(f10);
                org.telegram.ui.ActionBar.h5 h5Var2 = h5VarArr[i10];
                if (z10) {
                    f13 = 1.0f;
                }
                h5Var2.setScaleY(f13);
                org.telegram.ui.ActionBar.h5 h5Var3 = h5VarArr[i10];
                if (z10) {
                    dp = 0.0f;
                } else {
                    dp = AndroidUtilities.dp(8.0f);
                }
                h5Var3.setTranslationY(dp);
                s6 s6Var = s6VarArr[i10];
                if (z10) {
                    f11 = 1.0f;
                }
                s6Var.setAlpha(f11);
                s6 s6Var2 = s6VarArr[i10];
                if (!z10) {
                    i12 = 8;
                }
                s6Var2.setVisibility(i12);
            }
        }
    }

    public final void Z() {
        if (this.V.getSearchOptionsItem() != null) {
            this.V.getSearchOptionsItem().setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.g6.G6), PorterDuff.Mode.SRC_IN));
        }
        this.actionBar.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19843a7, false));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        kVar.D(org.telegram.ui.ActionBar.g6.x0(null, i10, false), false);
        this.actionBar.D(org.telegram.ui.ActionBar.g6.x0(null, i10, false), true);
        this.actionBar.B(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20307z8, false), false);
        this.actionBar.setTitleColor(org.telegram.ui.ActionBar.g6.x0(null, i10, false));
        org.telegram.ui.ActionBar.h5[] h5VarArr = this.f24025w;
        org.telegram.ui.ActionBar.h5 h5Var = h5VarArr[0];
        if (h5Var != null) {
            h5Var.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i10, false));
        }
        org.telegram.ui.ActionBar.h5 h5Var2 = h5VarArr[1];
        if (h5Var2 != null) {
            h5Var2.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i10, false));
        }
    }

    public final void a0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.cb0.a0():void");
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.cb0.createView(android.content.Context):android.view.View");
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.userInfoDidLoad && ((Long) objArr[0]).longValue() == this.e) {
            TLRPC.UserFull userFull = (TLRPC.UserFull) objArr[1];
            this.d = userFull;
            za0 za0Var = this.V;
            if (za0Var != null) {
                za0Var.setUserInfo(userFull);
            }
        }
    }

    @Override
    public final int getNavigationBarColor() {
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.g6.f19901d6);
        if (getLastStoryViewer() != null && getLastStoryViewer().attachedToParent()) {
            return getLastStoryViewer().getNavigationBarColor(themedColor);
        }
        return themedColor;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        b7 b7Var = new b7(this, 4);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, b7Var, org.telegram.ui.ActionBar.g6.f19901d6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, b7Var, org.telegram.ui.ActionBar.g6.f20307z8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, b7Var, org.telegram.ui.ActionBar.g6.G6));
        arrayList.addAll(this.V.getThemeDescriptions());
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().H0) {
            int x02 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19901d6, false);
            if (this.actionBar.t()) {
                x02 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20254w8, false);
            }
            if (i0.a.f(x02) > 0.699999988079071d) {
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
        za0 za0Var = this.V;
        if (za0Var.getSelectedTab() != za0Var.I0.getFirstTabId()) {
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
            za0 za0Var = this.V;
            if (za0Var.C1) {
                if (z10) {
                    za0Var.L(false);
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
        this.f24016a = getArguments().getInt("type", 0);
        this.e = getArguments().getLong("dialog_id");
        this.f24021f = getArguments().getLong("topic_id", 0L);
        this.h = getArguments().getString("hashtag", "");
        this.f24022n = getArguments().getString("username", "");
        this.f24023r = getArguments().getInt("storiesCount", -1);
        int i11 = this.f24016a;
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
        if (DialogObject.isUserDialog(this.e) && this.f24021f == 0) {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.e));
            if (UserObject.isUserSelf(user)) {
                getMessagesController().loadUserInfo(user, false, this.classGuid);
                this.d = getMessagesController().getUserFull(this.e);
            }
        }
        if (this.f24018b == null) {
            this.f24018b = new pv0(this);
        }
        this.f24018b.f28432x.add(this);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.userInfoDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        getNotificationCenter().removeObserver(this, NotificationCenter.storiesEnabledUpdate);
        di.x0 x0Var = this.U;
        if (x0Var != null) {
            this.U = null;
            AndroidUtilities.runOnUIThread(x0Var);
        }
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        za0 za0Var = this.V;
        if (za0Var != null) {
            za0Var.setPagesPaddingBottom(i13);
        }
    }
}
