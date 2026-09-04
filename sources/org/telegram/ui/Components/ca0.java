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
public final class ca0 extends org.telegram.ui.ActionBar.n2 implements qu0, ng.b, NotificationCenter.NotificationCenterDelegate {
    public org.telegram.ui.ActionBar.g2 E;
    public q6 F;
    public org.telegram.ui.ActionBar.v0 G;
    public org.telegram.ui.ActionBar.v0 H;
    public SparseArray I;
    public org.telegram.ui.ActionBar.f1 J;
    public org.telegram.ui.ActionBar.f1 K;
    public boolean L;
    public boolean M;
    public int N;
    public org.telegram.ui.ActionBar.f1 O;
    public org.telegram.ui.ActionBar.f1 P;
    public org.telegram.ui.ActionBar.f1 Q;
    public ba0 R;
    public FrameLayout S;
    public di.d T;
    public di.y0 U;
    public z90 V;
    public int W;
    public int X;
    public final boolean[] Y;
    public final float[] Z;
    public int f24945a;
    public final boolean[] f24946a0;
    public pu0 f24947b;
    public final ValueAnimator[] f24948b0;
    public TLRPC.ChatFull f24949c;
    public TLRPC.UserFull d;
    public long f24950e;
    public long f24951f;
    public String h;
    public String f24952n;
    public int f24953r;
    public FrameLayout f24954s;
    public final FrameLayout[] v;
    public final org.telegram.ui.ActionBar.j5[] f24955w;
    public final q6[] f24956x;
    public x90 f24957y;

    public ca0(Bundle bundle, pu0 pu0Var) {
        super(bundle);
        this.v = new FrameLayout[2];
        this.f24955w = new org.telegram.ui.ActionBar.j5[2];
        this.f24956x = new q6[2];
        this.L = true;
        this.M = true;
        this.N = -12;
        this.Y = new boolean[2];
        this.Z = new float[2];
        this.f24946a0 = new boolean[]{true, true};
        this.f24948b0 = new ValueAnimator[2];
        this.f24947b = pu0Var;
    }

    public static org.telegram.ui.ActionBar.k V(ca0 ca0Var) {
        return ca0Var.actionBar;
    }

    public static org.telegram.ui.ActionBar.k W(ca0 ca0Var) {
        return ca0Var.actionBar;
    }

    @Override
    public final List A() {
        String str;
        Activity parentActivity = getParentActivity();
        DispatchQueue dispatchQueue = qg.k1.f44463m;
        if (parentActivity.getSharedPreferences("shapedetector_conf", 0).getBoolean("learning", false)) {
            str = "Disable";
        } else {
            str = "Enable";
        }
        return Arrays.asList(new ng.a(str.concat(" shape detector learning debug"), new wp(this, 26)));
    }

    @Override
    public final void M() {
        pu0 pu0Var;
        z90 z90Var = this.V;
        if (z90Var != null && (pu0Var = this.f24947b) != null) {
            z90Var.setNewMediaCounts(pu0Var.f29493c);
        }
        a0();
    }

    public final void X(TLRPC.ChatFull chatFull) {
        this.f24949c = chatFull;
    }

    public final void Y(int i10, boolean z10, boolean z11) {
        boolean z12;
        float f7;
        float f10;
        float dp;
        int i11 = this.f24945a;
        if (i11 != 3) {
            if (i10 != 1 || i11 != 2) {
                boolean[] zArr = this.Y;
                boolean z13 = zArr[i10];
                boolean[] zArr2 = this.f24946a0;
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
                ValueAnimator[] valueAnimatorArr = this.f24948b0;
                ValueAnimator valueAnimator = valueAnimatorArr[i10];
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    valueAnimatorArr[i10] = null;
                }
                float[] fArr = this.Z;
                q6[] q6VarArr = this.f24956x;
                float f11 = 0.0f;
                if (z12) {
                    q6VarArr[i10].setVisibility(0);
                    float f12 = fArr[i10];
                    if (z10) {
                        f11 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, f11);
                    valueAnimatorArr[i10] = ofFloat;
                    ofFloat.addUpdateListener(new org.telegram.ui.ActionBar.q2(this, i10, 4));
                    valueAnimatorArr[i10].addListener(new aa0(this, i10, z10, 0));
                    valueAnimatorArr[i10].setDuration(320L);
                    valueAnimatorArr[i10].setInterpolator(pr.h);
                    valueAnimatorArr[i10].start();
                    return;
                }
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                fArr[i10] = f7;
                org.telegram.ui.ActionBar.j5[] j5VarArr = this.f24955w;
                org.telegram.ui.ActionBar.j5 j5Var = j5VarArr[i10];
                float f13 = 1.111f;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 1.111f;
                }
                j5Var.setScaleX(f10);
                org.telegram.ui.ActionBar.j5 j5Var2 = j5VarArr[i10];
                if (z10) {
                    f13 = 1.0f;
                }
                j5Var2.setScaleY(f13);
                org.telegram.ui.ActionBar.j5 j5Var3 = j5VarArr[i10];
                if (z10) {
                    dp = 0.0f;
                } else {
                    dp = AndroidUtilities.dp(8.0f);
                }
                j5Var3.setTranslationY(dp);
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
            this.V.getSearchOptionsItem().setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.j6.G6), PorterDuff.Mode.SRC_IN));
        }
        this.actionBar.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20607a7, false));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        kVar.C(org.telegram.ui.ActionBar.j6.w0(null, i10, false), false);
        this.actionBar.C(org.telegram.ui.ActionBar.j6.w0(null, i10, false), true);
        this.actionBar.B(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f21063z8, false), false);
        this.actionBar.setTitleColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        org.telegram.ui.ActionBar.j5[] j5VarArr = this.f24955w;
        org.telegram.ui.ActionBar.j5 j5Var = j5VarArr[0];
        if (j5Var != null) {
            j5Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        }
        org.telegram.ui.ActionBar.j5 j5Var2 = j5VarArr[1];
        if (j5Var2 != null) {
            j5Var2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        }
    }

    public final void a0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ca0.a0():void");
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ca0.createView(android.content.Context):android.view.View");
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.userInfoDidLoad && ((Long) objArr[0]).longValue() == this.f24950e) {
            TLRPC.UserFull userFull = (TLRPC.UserFull) objArr[1];
            this.d = userFull;
            z90 z90Var = this.V;
            if (z90Var != null) {
                z90Var.setUserInfo(userFull);
            }
        }
    }

    @Override
    public final int getNavigationBarColor() {
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.j6.f20663d6);
        if (getLastStoryViewer() != null && getLastStoryViewer().attachedToParent()) {
            return getLastStoryViewer().getNavigationBarColor(themedColor);
        }
        return themedColor;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        z6 z6Var = new z6(this, 4);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, z6Var, org.telegram.ui.ActionBar.j6.f20663d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, z6Var, org.telegram.ui.ActionBar.j6.f21063z8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, z6Var, org.telegram.ui.ActionBar.j6.G6));
        arrayList.addAll(this.V.getThemeDescriptions());
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().H0) {
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20663d6, false);
            if (this.actionBar.s()) {
                w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f21010w8, false);
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
        z90 z90Var = this.V;
        if (z90Var.getSelectedTab() != z90Var.I0.getFirstTabId()) {
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
            z90 z90Var = this.V;
            if (z90Var.C1) {
                if (z10) {
                    z90Var.L(false);
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
        this.f24945a = getArguments().getInt("type", 0);
        this.f24950e = getArguments().getLong("dialog_id");
        this.f24951f = getArguments().getLong("topic_id", 0L);
        this.h = getArguments().getString("hashtag", "");
        this.f24952n = getArguments().getString("username", "");
        this.f24953r = getArguments().getInt("storiesCount", -1);
        int i11 = this.f24945a;
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
        if (DialogObject.isUserDialog(this.f24950e) && this.f24951f == 0) {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f24950e));
            if (UserObject.isUserSelf(user)) {
                getMessagesController().loadUserInfo(user, false, this.classGuid);
                this.d = getMessagesController().getUserFull(this.f24950e);
            }
        }
        if (this.f24947b == null) {
            this.f24947b = new pu0(this);
        }
        this.f24947b.f29500x.add(this);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.userInfoDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        getNotificationCenter().removeObserver(this, NotificationCenter.storiesEnabledUpdate);
        di.y0 y0Var = this.U;
        if (y0Var != null) {
            this.U = null;
            AndroidUtilities.runOnUIThread(y0Var);
        }
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        z90 z90Var = this.V;
        if (z90Var != null) {
            z90Var.setPagesPaddingBottom(i13);
        }
    }
}
