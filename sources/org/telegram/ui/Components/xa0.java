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
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
public final class xa0 extends org.telegram.ui.ActionBar.o2 implements qv0, ng.b, NotificationCenter.NotificationCenterDelegate {
    public org.telegram.ui.ActionBar.h2 E;
    public q6 F;
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
    public wa0 R;
    public FrameLayout S;
    public ei.d T;
    public ai.y7 U;
    public ua0 V;
    public int W;
    public int X;
    public final boolean[] Y;
    public final float[] Z;
    public int f32493a;
    public final boolean[] f32494a0;
    public pv0 f32495b;
    public final ValueAnimator[] f32496b0;
    public TLRPC.ChatFull f32497c;
    public PorterDuffColorFilter f32498c0;
    public TLRPC.UserFull d;
    public int f32499d0;
    public long e;
    public int f32500e0;
    public long f32501f;
    public int f32502f0;
    public int f32503g0;
    public String h;
    public int f32504h0;
    public String f32505n;
    public int f32506r;
    public FrameLayout f32507s;
    public final FrameLayout[] v;
    public final org.telegram.ui.ActionBar.n5[] f32508w;
    public final q6[] f32509x;
    public sa0 f32510y;

    public xa0(Bundle bundle, pv0 pv0Var) {
        super(bundle);
        this.v = new FrameLayout[2];
        this.f32508w = new org.telegram.ui.ActionBar.n5[2];
        this.f32509x = new q6[2];
        this.L = true;
        this.M = true;
        this.N = -12;
        this.Y = new boolean[2];
        this.Z = new float[2];
        this.f32494a0 = new boolean[]{true, true};
        this.f32496b0 = new ValueAnimator[2];
        this.f32495b = pv0Var;
    }

    public static org.telegram.ui.ActionBar.k V(xa0 xa0Var) {
        return xa0Var.actionBar;
    }

    public static org.telegram.ui.ActionBar.k W(xa0 xa0Var) {
        return xa0Var.actionBar;
    }

    @Override
    public final List B() {
        String str;
        Activity parentActivity = getParentActivity();
        DispatchQueue dispatchQueue = qg.m1.f44988m;
        if (parentActivity.getSharedPreferences("shapedetector_conf", 0).getBoolean("learning", false)) {
            str = "Disable";
        } else {
            str = "Enable";
        }
        return Arrays.asList(new ng.a(str.concat(" shape detector learning debug"), new zp(this, 28)));
    }

    @Override
    public final void M() {
        pv0 pv0Var;
        ua0 ua0Var = this.V;
        if (ua0Var != null && (pv0Var = this.f32495b) != null) {
            ua0Var.setNewMediaCounts(pv0Var.f29675c);
        }
        a0();
    }

    public final void X(TLRPC.ChatFull chatFull) {
        this.f32497c = chatFull;
    }

    public final void Y(int i10, boolean z10, boolean z11) {
        boolean z12;
        float f7;
        float f10;
        float dp;
        int i11 = this.f32493a;
        if (i11 != 3) {
            if (i10 != 1 || i11 != 2) {
                boolean[] zArr = this.Y;
                boolean z13 = zArr[i10];
                boolean[] zArr2 = this.f32494a0;
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
                ValueAnimator[] valueAnimatorArr = this.f32496b0;
                ValueAnimator valueAnimator = valueAnimatorArr[i10];
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    valueAnimatorArr[i10] = null;
                }
                float[] fArr = this.Z;
                q6[] q6VarArr = this.f32509x;
                float f11 = 0.0f;
                if (z12) {
                    q6VarArr[i10].setVisibility(0);
                    float f12 = fArr[i10];
                    if (z10) {
                        f11 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, f11);
                    valueAnimatorArr[i10] = ofFloat;
                    ofFloat.addUpdateListener(new org.telegram.ui.ActionBar.r2(this, i10, 5));
                    valueAnimatorArr[i10].addListener(new va0(this, i10, z10, 0));
                    valueAnimatorArr[i10].setDuration(320L);
                    valueAnimatorArr[i10].setInterpolator(bs.h);
                    valueAnimatorArr[i10].start();
                    return;
                }
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                fArr[i10] = f7;
                org.telegram.ui.ActionBar.n5[] n5VarArr = this.f32508w;
                org.telegram.ui.ActionBar.n5 n5Var = n5VarArr[i10];
                float f13 = 1.111f;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 1.111f;
                }
                n5Var.setScaleX(f10);
                org.telegram.ui.ActionBar.n5 n5Var2 = n5VarArr[i10];
                if (z10) {
                    f13 = 1.0f;
                }
                n5Var2.setScaleY(f13);
                org.telegram.ui.ActionBar.n5 n5Var3 = n5VarArr[i10];
                if (z10) {
                    dp = 0.0f;
                } else {
                    dp = AndroidUtilities.dp(8.0f);
                }
                n5Var3.setTranslationY(dp);
                q6 q6Var = q6VarArr[i10];
                if (z10) {
                    f11 = 1.0f;
                }
                q6Var.setAlpha(f11);
                q6 q6Var2 = q6VarArr[i10];
                if (!z10) {
                    i12 = 8;
                }
                q6Var2.setVisibility(i12);
            }
        }
    }

    public final void Z() {
        if (this.V.getSearchOptionsItem() != null) {
            bk0 searchOptionsItem = this.V.getSearchOptionsItem();
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.G6);
            if (searchOptionsItem.getColorFilter() == null || searchOptionsItem.getColorFilter() != this.f32498c0 || themedColor != this.f32499d0) {
                this.f32499d0 = themedColor;
                PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(themedColor, PorterDuff.Mode.SRC_IN);
                this.f32498c0 = porterDuffColorFilter;
                searchOptionsItem.setColorFilter(porterDuffColorFilter);
            }
        }
        this.actionBar.setBackgroundColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21125a7, false));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        kVar.B(org.telegram.ui.ActionBar.k6.x0(null, i10, false), false);
        this.actionBar.B(org.telegram.ui.ActionBar.k6.x0(null, i10, false), true);
        this.actionBar.A(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21590z8, false), false);
        this.actionBar.setTitleColor(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
        org.telegram.ui.ActionBar.n5[] n5VarArr = this.f32508w;
        org.telegram.ui.ActionBar.n5 n5Var = n5VarArr[0];
        if (n5Var != null) {
            n5Var.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
        }
        org.telegram.ui.ActionBar.n5 n5Var2 = n5VarArr[1];
        if (n5Var2 != null) {
            n5Var2.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
        }
    }

    public final void a0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.xa0.a0():void");
    }

    @Override
    public final boolean canBeginSlide() {
        if (!this.V.A0()) {
            return false;
        }
        return super.canBeginSlide();
    }

    @Override
    public final android.view.View createView(android.content.Context r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.xa0.createView(android.content.Context):android.view.View");
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.userInfoDidLoad && ((Long) objArr[0]).longValue() == this.e) {
            TLRPC.UserFull userFull = (TLRPC.UserFull) objArr[1];
            this.d = userFull;
            ua0 ua0Var = this.V;
            if (ua0Var != null) {
                ua0Var.setUserInfo(userFull);
            }
        }
    }

    @Override
    public final int getNavigationBarColor() {
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.f21183d6);
        if (getLastStoryViewer() != null && getLastStoryViewer().attachedToParent()) {
            return getLastStoryViewer().getNavigationBarColor(themedColor);
        }
        return themedColor;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.V.getThemeDescriptions());
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().H0) {
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21183d6, false);
            if (this.actionBar.s()) {
                x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21537w8, false);
            }
            if (i0.a.h(x02) > 0.699999988079071d) {
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
        if (!this.V.A0()) {
            return false;
        }
        ua0 ua0Var = this.V;
        if (ua0Var.getSelectedTab() != ua0Var.I0.getFirstTabId()) {
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
            ua0 ua0Var = this.V;
            if (ua0Var.C1) {
                if (z10) {
                    ua0Var.M(false);
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
        this.f32493a = getArguments().getInt("type", 0);
        this.e = getArguments().getLong("dialog_id");
        this.f32501f = getArguments().getLong("topic_id", 0L);
        this.h = getArguments().getString("hashtag", "");
        this.f32505n = getArguments().getString("username", "");
        this.f32506r = getArguments().getInt("storiesCount", -1);
        int i11 = this.f32493a;
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
        if (DialogObject.isUserDialog(this.e) && this.f32501f == 0) {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.e));
            if (UserObject.isUserSelf(user)) {
                getMessagesController().loadUserInfo(user, false, this.classGuid);
                this.d = getMessagesController().getUserFull(this.e);
            }
        }
        if (this.f32495b == null) {
            this.f32495b = new pv0(this);
        }
        this.f32495b.f29681x.add(this);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.userInfoDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        getNotificationCenter().removeObserver(this, NotificationCenter.storiesEnabledUpdate);
        ai.y7 y7Var = this.U;
        if (y7Var != null) {
            this.U = null;
            AndroidUtilities.runOnUIThread(y7Var);
        }
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        ua0 ua0Var = this.V;
        if (ua0Var != null) {
            ua0Var.setPagesPaddingBottom(i13);
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21125a7, false);
            int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false);
            int x04 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21590z8, false);
            if (this.V != null) {
                if (this.actionBar != null) {
                    if (x02 == this.f32502f0) {
                        if (x03 == this.f32503g0) {
                            if (x04 != this.f32504h0) {
                            }
                        }
                    }
                    this.f32502f0 = x02;
                    this.f32503g0 = x03;
                    this.f32504h0 = x04;
                    Z();
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        try {
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.G6);
            if (themedColor != this.f32500e0) {
                this.f32500e0 = themedColor;
                org.telegram.ui.ActionBar.u0 u0Var = this.H;
                if (u0Var != null) {
                    u0Var.setIconColor(themedColor);
                }
                org.telegram.ui.ActionBar.u0 u0Var2 = this.G;
                if (u0Var2 != null) {
                    u0Var2.setIconColor(themedColor);
                }
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }
}
