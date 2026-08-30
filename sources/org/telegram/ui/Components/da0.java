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
public final class da0 extends org.telegram.ui.ActionBar.p2 implements ru0, zf.b, NotificationCenter.NotificationCenterDelegate {
    public org.telegram.ui.ActionBar.i2 B;
    public k6 C;
    public org.telegram.ui.ActionBar.w0 D;
    public org.telegram.ui.ActionBar.w0 E;
    public SparseArray F;
    public org.telegram.ui.ActionBar.g1 G;
    public org.telegram.ui.ActionBar.g1 H;
    public boolean I;
    public boolean J;
    public int K;
    public org.telegram.ui.ActionBar.g1 L;
    public org.telegram.ui.ActionBar.g1 M;
    public org.telegram.ui.ActionBar.g1 N;
    public ca0 O;
    public FrameLayout P;
    public ph.d Q;
    public lh.r5 R;
    public aa0 S;
    public int T;
    public int U;
    public final boolean[] V;
    public final float[] W;
    public final boolean[] X;
    public final ValueAnimator[] Y;
    public int f24215a;
    public qu0 f24216b;
    public TLRPC.ChatFull f24217c;
    public TLRPC.UserFull d;
    public long e;
    public long f24218f;
    public String h;
    public String f24219n;
    public int f24220r;
    public FrameLayout f24221s;
    public final FrameLayout[] v;
    public final org.telegram.ui.ActionBar.k5[] f24222w;
    public final k6[] f24223x;
    public y90 f24224y;

    public da0(Bundle bundle, qu0 qu0Var) {
        super(bundle);
        this.v = new FrameLayout[2];
        this.f24222w = new org.telegram.ui.ActionBar.k5[2];
        this.f24223x = new k6[2];
        this.I = true;
        this.J = true;
        this.K = -12;
        this.V = new boolean[2];
        this.W = new float[2];
        this.X = new boolean[]{true, true};
        this.Y = new ValueAnimator[2];
        this.f24216b = qu0Var;
    }

    public static org.telegram.ui.ActionBar.k V(da0 da0Var) {
        return da0Var.actionBar;
    }

    public static org.telegram.ui.ActionBar.k W(da0 da0Var) {
        return da0Var.actionBar;
    }

    @Override
    public final List B() {
        String str;
        Activity parentActivity = getParentActivity();
        DispatchQueue dispatchQueue = cg.z1.f2584m;
        if (parentActivity.getSharedPreferences("shapedetector_conf", 0).getBoolean("learning", false)) {
            str = "Disable";
        } else {
            str = "Enable";
        }
        return Arrays.asList(new zf.a(str.concat(" shape detector learning debug"), new vp(this, 26)));
    }

    @Override
    public final void M() {
        qu0 qu0Var;
        aa0 aa0Var = this.S;
        if (aa0Var != null && (qu0Var = this.f24216b) != null) {
            aa0Var.setNewMediaCounts(qu0Var.f28259c);
        }
        a0();
    }

    public final void X(TLRPC.ChatFull chatFull) {
        this.f24217c = chatFull;
    }

    public final void Y(int i10, boolean z4, boolean z10) {
        boolean z11;
        float f10;
        float f11;
        float dp;
        int i11 = this.f24215a;
        if (i11 != 3) {
            if (i10 != 1 || i11 != 2) {
                boolean[] zArr = this.V;
                boolean z12 = zArr[i10];
                boolean[] zArr2 = this.X;
                if (z12 == z4 && !zArr2[i10]) {
                    return;
                }
                int i12 = 0;
                if (!zArr2[i10] && z10) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                zArr2[i10] = false;
                zArr[i10] = z4;
                ValueAnimator[] valueAnimatorArr = this.Y;
                ValueAnimator valueAnimator = valueAnimatorArr[i10];
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    valueAnimatorArr[i10] = null;
                }
                float[] fArr = this.W;
                k6[] k6VarArr = this.f24223x;
                float f12 = 0.0f;
                if (z11) {
                    k6VarArr[i10].setVisibility(0);
                    float f13 = fArr[i10];
                    if (z4) {
                        f12 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f13, f12);
                    valueAnimatorArr[i10] = ofFloat;
                    ofFloat.addUpdateListener(new ih.b(this, i10, 5));
                    valueAnimatorArr[i10].addListener(new ba0(this, i10, z4, 0));
                    valueAnimatorArr[i10].setDuration(320L);
                    valueAnimatorArr[i10].setInterpolator(nr.h);
                    valueAnimatorArr[i10].start();
                    return;
                }
                if (z4) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                fArr[i10] = f10;
                org.telegram.ui.ActionBar.k5[] k5VarArr = this.f24222w;
                org.telegram.ui.ActionBar.k5 k5Var = k5VarArr[i10];
                float f14 = 1.111f;
                if (z4) {
                    f11 = 1.0f;
                } else {
                    f11 = 1.111f;
                }
                k5Var.setScaleX(f11);
                org.telegram.ui.ActionBar.k5 k5Var2 = k5VarArr[i10];
                if (z4) {
                    f14 = 1.0f;
                }
                k5Var2.setScaleY(f14);
                org.telegram.ui.ActionBar.k5 k5Var3 = k5VarArr[i10];
                if (z4) {
                    dp = 0.0f;
                } else {
                    dp = AndroidUtilities.dp(8.0f);
                }
                k5Var3.setTranslationY(dp);
                k6 k6Var = k6VarArr[i10];
                if (z4) {
                    f12 = 1.0f;
                }
                k6Var.setAlpha(f12);
                k6 k6Var2 = k6VarArr[i10];
                if (!z4) {
                    i12 = 8;
                }
                k6Var2.setVisibility(i12);
            }
        }
    }

    public final void Z() {
        if (this.S.getSearchOptionsItem() != null) {
            this.S.getSearchOptionsItem().setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.j6.G6), PorterDuff.Mode.SRC_IN));
        }
        this.actionBar.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19852a7, false));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        kVar.C(org.telegram.ui.ActionBar.j6.w0(null, i10, false), false);
        this.actionBar.C(org.telegram.ui.ActionBar.j6.w0(null, i10, false), true);
        this.actionBar.B(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20300z8, false), false);
        this.actionBar.setTitleColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        org.telegram.ui.ActionBar.k5[] k5VarArr = this.f24222w;
        org.telegram.ui.ActionBar.k5 k5Var = k5VarArr[0];
        if (k5Var != null) {
            k5Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        }
        org.telegram.ui.ActionBar.k5 k5Var2 = k5VarArr[1];
        if (k5Var2 != null) {
            k5Var2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        }
    }

    public final void a0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.da0.a0():void");
    }

    @Override
    public final boolean canBeginSlide() {
        if (!this.S.x0()) {
            return false;
        }
        return super.canBeginSlide();
    }

    @Override
    public final android.view.View createView(android.content.Context r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.da0.createView(android.content.Context):android.view.View");
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.userInfoDidLoad && ((Long) objArr[0]).longValue() == this.e) {
            TLRPC.UserFull userFull = (TLRPC.UserFull) objArr[1];
            this.d = userFull;
            aa0 aa0Var = this.S;
            if (aa0Var != null) {
                aa0Var.setUserInfo(userFull);
            }
        }
    }

    @Override
    public final int getNavigationBarColor() {
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.j6.f19906d6);
        if (getLastStoryViewer() != null && getLastStoryViewer().attachedToParent()) {
            return getLastStoryViewer().getNavigationBarColor(themedColor);
        }
        return themedColor;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        t6 t6Var = new t6(this, 4);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, t6Var, org.telegram.ui.ActionBar.j6.f19906d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, t6Var, org.telegram.ui.ActionBar.j6.f20300z8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, t6Var, org.telegram.ui.ActionBar.j6.G6));
        arrayList.addAll(this.S.getThemeDescriptions());
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().E0) {
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19906d6, false);
            if (this.actionBar.s()) {
                w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20246w8, false);
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
        if (!this.S.x0()) {
            return false;
        }
        aa0 aa0Var = this.S;
        if (aa0Var.getSelectedTab() != aa0Var.F0.getFirstTabId()) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean onBackPressed(boolean z4) {
        if (hasShownSheet()) {
            if (z4) {
                closeSheet();
                return false;
            }
        } else {
            aa0 aa0Var = this.S;
            if (aa0Var.f31161z1) {
                if (z4) {
                    aa0Var.L(false);
                }
            } else {
                return super.onBackPressed(z4);
            }
        }
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        int i10;
        this.f24215a = getArguments().getInt("type", 0);
        this.e = getArguments().getLong("dialog_id");
        this.f24218f = getArguments().getLong("topic_id", 0L);
        this.h = getArguments().getString("hashtag", "");
        this.f24219n = getArguments().getString("username", "");
        this.f24220r = getArguments().getInt("storiesCount", -1);
        int i11 = this.f24215a;
        if (i11 == 2) {
            i10 = 9;
        } else if (i11 == 1) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        this.T = getArguments().getInt("start_from", i10);
        getNotificationCenter().addObserver(this, NotificationCenter.userInfoDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        getNotificationCenter().addObserver(this, NotificationCenter.storiesEnabledUpdate);
        if (DialogObject.isUserDialog(this.e) && this.f24218f == 0) {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.e));
            if (UserObject.isUserSelf(user)) {
                getMessagesController().loadUserInfo(user, false, this.classGuid);
                this.d = getMessagesController().getUserFull(this.e);
            }
        }
        if (this.f24216b == null) {
            this.f24216b = new qu0(this);
        }
        this.f24216b.f28265x.add(this);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.userInfoDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        getNotificationCenter().removeObserver(this, NotificationCenter.storiesEnabledUpdate);
        lh.r5 r5Var = this.R;
        if (r5Var != null) {
            this.R = null;
            AndroidUtilities.runOnUIThread(r5Var);
        }
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        aa0 aa0Var = this.S;
        if (aa0Var != null) {
            aa0Var.setPagesPaddingBottom(i13);
        }
    }
}
