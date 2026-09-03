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
public final class ea0 extends org.telegram.ui.ActionBar.p2 implements ru0, zf.b, NotificationCenter.NotificationCenterDelegate {
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
    public da0 O;
    public FrameLayout P;
    public ph.d Q;
    public lh.r5 R;
    public ba0 S;
    public int T;
    public int U;
    public final boolean[] V;
    public final float[] W;
    public final boolean[] X;
    public final ValueAnimator[] Y;
    public int f24554a;
    public qu0 f24555b;
    public TLRPC.ChatFull f24556c;
    public TLRPC.UserFull d;
    public long e;
    public long f24557f;
    public String h;
    public String f24558n;
    public int f24559r;
    public FrameLayout f24560s;
    public final FrameLayout[] v;
    public final org.telegram.ui.ActionBar.k5[] f24561w;
    public final k6[] f24562x;
    public z90 f24563y;

    public ea0(Bundle bundle, qu0 qu0Var) {
        super(bundle);
        this.v = new FrameLayout[2];
        this.f24561w = new org.telegram.ui.ActionBar.k5[2];
        this.f24562x = new k6[2];
        this.I = true;
        this.J = true;
        this.K = -12;
        this.V = new boolean[2];
        this.W = new float[2];
        this.X = new boolean[]{true, true};
        this.Y = new ValueAnimator[2];
        this.f24555b = qu0Var;
    }

    public static org.telegram.ui.ActionBar.k V(ea0 ea0Var) {
        return ea0Var.actionBar;
    }

    public static org.telegram.ui.ActionBar.k W(ea0 ea0Var) {
        return ea0Var.actionBar;
    }

    @Override
    public final List B() {
        String str;
        Activity parentActivity = getParentActivity();
        DispatchQueue dispatchQueue = cg.z1.f2567m;
        if (parentActivity.getSharedPreferences("shapedetector_conf", 0).getBoolean("learning", false)) {
            str = "Disable";
        } else {
            str = "Enable";
        }
        return Arrays.asList(new zf.a(str.concat(" shape detector learning debug"), new up(this, 26)));
    }

    @Override
    public final void M() {
        qu0 qu0Var;
        ba0 ba0Var = this.S;
        if (ba0Var != null && (qu0Var = this.f24555b) != null) {
            ba0Var.setNewMediaCounts(qu0Var.f28273c);
        }
        a0();
    }

    public final void X(TLRPC.ChatFull chatFull) {
        this.f24556c = chatFull;
    }

    public final void Y(int i10, boolean z4, boolean z10) {
        boolean z11;
        float f10;
        float f11;
        float dp;
        int i11 = this.f24554a;
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
                k6[] k6VarArr = this.f24562x;
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
                    valueAnimatorArr[i10].addListener(new ca0(this, i10, z4, 0));
                    valueAnimatorArr[i10].setDuration(320L);
                    valueAnimatorArr[i10].setInterpolator(mr.h);
                    valueAnimatorArr[i10].start();
                    return;
                }
                if (z4) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                fArr[i10] = f10;
                org.telegram.ui.ActionBar.k5[] k5VarArr = this.f24561w;
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
        this.actionBar.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19827a7, false));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        kVar.C(org.telegram.ui.ActionBar.j6.w0(null, i10, false), false);
        this.actionBar.C(org.telegram.ui.ActionBar.j6.w0(null, i10, false), true);
        this.actionBar.B(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20275z8, false), false);
        this.actionBar.setTitleColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        org.telegram.ui.ActionBar.k5[] k5VarArr = this.f24561w;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ea0.a0():void");
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ea0.createView(android.content.Context):android.view.View");
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.userInfoDidLoad && ((Long) objArr[0]).longValue() == this.e) {
            TLRPC.UserFull userFull = (TLRPC.UserFull) objArr[1];
            this.d = userFull;
            ba0 ba0Var = this.S;
            if (ba0Var != null) {
                ba0Var.setUserInfo(userFull);
            }
        }
    }

    @Override
    public final int getNavigationBarColor() {
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.j6.f19881d6);
        if (getLastStoryViewer() != null && getLastStoryViewer().attachedToParent()) {
            return getLastStoryViewer().getNavigationBarColor(themedColor);
        }
        return themedColor;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        t6 t6Var = new t6(this, 4);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, t6Var, org.telegram.ui.ActionBar.j6.f19881d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, t6Var, org.telegram.ui.ActionBar.j6.f20275z8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, t6Var, org.telegram.ui.ActionBar.j6.G6));
        arrayList.addAll(this.S.getThemeDescriptions());
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().E0) {
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19881d6, false);
            if (this.actionBar.s()) {
                w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20221w8, false);
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
        ba0 ba0Var = this.S;
        if (ba0Var.getSelectedTab() != ba0Var.F0.getFirstTabId()) {
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
            ba0 ba0Var = this.S;
            if (ba0Var.f31172z1) {
                if (z4) {
                    ba0Var.L(false);
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
        this.f24554a = getArguments().getInt("type", 0);
        this.e = getArguments().getLong("dialog_id");
        this.f24557f = getArguments().getLong("topic_id", 0L);
        this.h = getArguments().getString("hashtag", "");
        this.f24558n = getArguments().getString("username", "");
        this.f24559r = getArguments().getInt("storiesCount", -1);
        int i11 = this.f24554a;
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
        if (DialogObject.isUserDialog(this.e) && this.f24557f == 0) {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.e));
            if (UserObject.isUserSelf(user)) {
                getMessagesController().loadUserInfo(user, false, this.classGuid);
                this.d = getMessagesController().getUserFull(this.e);
            }
        }
        if (this.f24555b == null) {
            this.f24555b = new qu0(this);
        }
        this.f24555b.f28279x.add(this);
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
        ba0 ba0Var = this.S;
        if (ba0Var != null) {
            ba0Var.setPagesPaddingBottom(i13);
        }
    }
}
