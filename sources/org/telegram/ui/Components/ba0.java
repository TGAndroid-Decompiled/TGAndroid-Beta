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
public final class ba0 extends org.telegram.ui.ActionBar.n2 implements ru0, mg.b, NotificationCenter.NotificationCenterDelegate {
    public org.telegram.ui.ActionBar.g2 E;
    public n6 F;
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
    public aa0 R;
    public FrameLayout S;
    public ci.d T;
    public ci.y0 U;
    public y90 V;
    public int W;
    public int X;
    public final boolean[] Y;
    public final float[] Z;
    public int f22733a;
    public final boolean[] f22734a0;
    public qu0 f22735b;
    public final ValueAnimator[] f22736b0;
    public TLRPC.ChatFull f22737c;
    public TLRPC.UserFull d;
    public long e;
    public long f22738f;
    public String h;
    public String f22739n;
    public int f22740r;
    public FrameLayout f22741s;
    public final FrameLayout[] v;
    public final org.telegram.ui.ActionBar.j5[] f22742w;
    public final n6[] f22743x;
    public w90 f22744y;

    public ba0(Bundle bundle, qu0 qu0Var) {
        super(bundle);
        this.v = new FrameLayout[2];
        this.f22742w = new org.telegram.ui.ActionBar.j5[2];
        this.f22743x = new n6[2];
        this.L = true;
        this.M = true;
        this.N = -12;
        this.Y = new boolean[2];
        this.Z = new float[2];
        this.f22734a0 = new boolean[]{true, true};
        this.f22736b0 = new ValueAnimator[2];
        this.f22735b = qu0Var;
    }

    public static org.telegram.ui.ActionBar.k V(ba0 ba0Var) {
        return ba0Var.actionBar;
    }

    public static org.telegram.ui.ActionBar.k W(ba0 ba0Var) {
        return ba0Var.actionBar;
    }

    @Override
    public final void M() {
        qu0 qu0Var;
        y90 y90Var = this.V;
        if (y90Var != null && (qu0Var = this.f22735b) != null) {
            y90Var.setNewMediaCounts(qu0Var.f27449c);
        }
        a0();
    }

    public final void X(TLRPC.ChatFull chatFull) {
        this.f22737c = chatFull;
    }

    public final void Y(int i10, boolean z10, boolean z11) {
        boolean z12;
        float f7;
        float f10;
        float dp;
        int i11 = this.f22733a;
        if (i11 != 3) {
            if (i10 != 1 || i11 != 2) {
                boolean[] zArr = this.Y;
                boolean z13 = zArr[i10];
                boolean[] zArr2 = this.f22734a0;
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
                ValueAnimator[] valueAnimatorArr = this.f22736b0;
                ValueAnimator valueAnimator = valueAnimatorArr[i10];
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    valueAnimatorArr[i10] = null;
                }
                float[] fArr = this.Z;
                n6[] n6VarArr = this.f22743x;
                float f11 = 0.0f;
                if (z12) {
                    n6VarArr[i10].setVisibility(0);
                    float f12 = fArr[i10];
                    if (z10) {
                        f11 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, f11);
                    valueAnimatorArr[i10] = ofFloat;
                    ofFloat.addUpdateListener(new org.telegram.ui.ActionBar.q2(this, i10, 4));
                    valueAnimatorArr[i10].addListener(new z90(this, i10, z10, 0));
                    valueAnimatorArr[i10].setDuration(320L);
                    valueAnimatorArr[i10].setInterpolator(qr.h);
                    valueAnimatorArr[i10].start();
                    return;
                }
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                fArr[i10] = f7;
                org.telegram.ui.ActionBar.j5[] j5VarArr = this.f22742w;
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
                n6 n6Var = n6VarArr[i10];
                if (z10) {
                    f11 = 1.0f;
                }
                n6Var.setAlpha(f11);
                n6 n6Var2 = n6VarArr[i10];
                if (!z10) {
                    i12 = 8;
                }
                n6Var2.setVisibility(i12);
            }
        }
    }

    public final void Z() {
        if (this.V.getSearchOptionsItem() != null) {
            this.V.getSearchOptionsItem().setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.i6.G6), PorterDuff.Mode.SRC_IN));
        }
        this.actionBar.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f18780a7, false));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.i6.G6;
        kVar.B(org.telegram.ui.ActionBar.i6.w0(null, i10, false), false);
        this.actionBar.B(org.telegram.ui.ActionBar.i6.w0(null, i10, false), true);
        this.actionBar.A(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19239z8, false), false);
        this.actionBar.setTitleColor(org.telegram.ui.ActionBar.i6.w0(null, i10, false));
        org.telegram.ui.ActionBar.j5[] j5VarArr = this.f22742w;
        org.telegram.ui.ActionBar.j5 j5Var = j5VarArr[0];
        if (j5Var != null) {
            j5Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i10, false));
        }
        org.telegram.ui.ActionBar.j5 j5Var2 = j5VarArr[1];
        if (j5Var2 != null) {
            j5Var2.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i10, false));
        }
    }

    public final void a0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ba0.a0():void");
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ba0.createView(android.content.Context):android.view.View");
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.userInfoDidLoad && ((Long) objArr[0]).longValue() == this.e) {
            TLRPC.UserFull userFull = (TLRPC.UserFull) objArr[1];
            this.d = userFull;
            y90 y90Var = this.V;
            if (y90Var != null) {
                y90Var.setUserInfo(userFull);
            }
        }
    }

    @Override
    public final int getNavigationBarColor() {
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.i6.f18836d6);
        if (getLastStoryViewer() != null && getLastStoryViewer().attachedToParent()) {
            return getLastStoryViewer().getNavigationBarColor(themedColor);
        }
        return themedColor;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        w6 w6Var = new w6(this, 4);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, w6Var, org.telegram.ui.ActionBar.i6.f18836d6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, w6Var, org.telegram.ui.ActionBar.i6.f19239z8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, w6Var, org.telegram.ui.ActionBar.i6.G6));
        arrayList.addAll(this.V.getThemeDescriptions());
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().H0) {
            int w02 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f18836d6, false);
            if (this.actionBar.s()) {
                w02 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19186w8, false);
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
        y90 y90Var = this.V;
        if (y90Var.getSelectedTab() != y90Var.I0.getFirstTabId()) {
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
            y90 y90Var = this.V;
            if (y90Var.C1) {
                if (z10) {
                    y90Var.L(false);
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
        this.f22733a = getArguments().getInt("type", 0);
        this.e = getArguments().getLong("dialog_id");
        this.f22738f = getArguments().getLong("topic_id", 0L);
        this.h = getArguments().getString("hashtag", "");
        this.f22739n = getArguments().getString("username", "");
        this.f22740r = getArguments().getInt("storiesCount", -1);
        int i11 = this.f22733a;
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
        if (DialogObject.isUserDialog(this.e) && this.f22738f == 0) {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.e));
            if (UserObject.isUserSelf(user)) {
                getMessagesController().loadUserInfo(user, false, this.classGuid);
                this.d = getMessagesController().getUserFull(this.e);
            }
        }
        if (this.f22735b == null) {
            this.f22735b = new qu0(this);
        }
        this.f22735b.f27455x.add(this);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.userInfoDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        getNotificationCenter().removeObserver(this, NotificationCenter.storiesEnabledUpdate);
        ci.y0 y0Var = this.U;
        if (y0Var != null) {
            this.U = null;
            AndroidUtilities.runOnUIThread(y0Var);
        }
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        y90 y90Var = this.V;
        if (y90Var != null) {
            y90Var.setPagesPaddingBottom(i13);
        }
    }

    @Override
    public final List z() {
        String str;
        Activity parentActivity = getParentActivity();
        DispatchQueue dispatchQueue = pg.k1.f40896m;
        if (parentActivity.getSharedPreferences("shapedetector_conf", 0).getBoolean("learning", false)) {
            str = "Disable";
        } else {
            str = "Enable";
        }
        return Arrays.asList(new mg.a(str.concat(" shape detector learning debug"), new xp(this, 26)));
    }
}
