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
public final class eb0 extends org.telegram.ui.ActionBar.m2 implements wv0, mg.b, NotificationCenter.NotificationCenterDelegate {
    public org.telegram.ui.ActionBar.f2 E;
    public r6 F;
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
    public db0 R;
    public FrameLayout S;
    public ci.d T;
    public ci.x0 U;
    public bb0 V;
    public int W;
    public int X;
    public final boolean[] Y;
    public final float[] Z;
    public int f25955a;
    public final boolean[] f25956a0;
    public vv0 f25957b;
    public final ValueAnimator[] f25958b0;
    public TLRPC.ChatFull f25959c;
    public TLRPC.UserFull d;
    public long f25960e;
    public long f25961f;
    public String h;
    public String f25962n;
    public int f25963r;
    public FrameLayout f25964s;
    public final FrameLayout[] v;
    public final org.telegram.ui.ActionBar.h5[] f25965w;
    public final r6[] f25966x;
    public za0 f25967y;

    public eb0(Bundle bundle, vv0 vv0Var) {
        super(bundle);
        this.v = new FrameLayout[2];
        this.f25965w = new org.telegram.ui.ActionBar.h5[2];
        this.f25966x = new r6[2];
        this.L = true;
        this.M = true;
        this.N = -12;
        this.Y = new boolean[2];
        this.Z = new float[2];
        this.f25956a0 = new boolean[]{true, true};
        this.f25958b0 = new ValueAnimator[2];
        this.f25957b = vv0Var;
    }

    public static org.telegram.ui.ActionBar.k V(eb0 eb0Var) {
        return eb0Var.actionBar;
    }

    public static org.telegram.ui.ActionBar.k W(eb0 eb0Var) {
        return eb0Var.actionBar;
    }

    @Override
    public final List B() {
        String str;
        Activity parentActivity = getParentActivity();
        DispatchQueue dispatchQueue = pg.m1.f45726m;
        if (parentActivity.getSharedPreferences("shapedetector_conf", 0).getBoolean("learning", false)) {
            str = "Disable";
        } else {
            str = "Enable";
        }
        return Arrays.asList(new mg.a(str.concat(" shape detector learning debug"), new nq(this, 26)));
    }

    @Override
    public final void M() {
        vv0 vv0Var;
        bb0 bb0Var = this.V;
        if (bb0Var != null && (vv0Var = this.f25957b) != null) {
            bb0Var.setNewMediaCounts(vv0Var.f32489c);
        }
        a0();
    }

    public final void X(TLRPC.ChatFull chatFull) {
        this.f25959c = chatFull;
    }

    public final void Y(int i10, boolean z10, boolean z11) {
        boolean z12;
        float f7;
        float f10;
        float dp;
        int i11 = this.f25955a;
        if (i11 != 3) {
            if (i10 != 1 || i11 != 2) {
                boolean[] zArr = this.Y;
                boolean z13 = zArr[i10];
                boolean[] zArr2 = this.f25956a0;
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
                ValueAnimator[] valueAnimatorArr = this.f25958b0;
                ValueAnimator valueAnimator = valueAnimatorArr[i10];
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    valueAnimatorArr[i10] = null;
                }
                float[] fArr = this.Z;
                r6[] r6VarArr = this.f25966x;
                float f11 = 0.0f;
                if (z12) {
                    r6VarArr[i10].setVisibility(0);
                    float f12 = fArr[i10];
                    if (z10) {
                        f11 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, f11);
                    valueAnimatorArr[i10] = ofFloat;
                    ofFloat.addUpdateListener(new org.telegram.ui.ActionBar.p2(this, i10, 4));
                    valueAnimatorArr[i10].addListener(new cb0(this, i10, z10, 0));
                    valueAnimatorArr[i10].setDuration(320L);
                    valueAnimatorArr[i10].setInterpolator(is.h);
                    valueAnimatorArr[i10].start();
                    return;
                }
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                fArr[i10] = f7;
                org.telegram.ui.ActionBar.h5[] h5VarArr = this.f25965w;
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
                r6 r6Var = r6VarArr[i10];
                if (z10) {
                    f11 = 1.0f;
                }
                r6Var.setAlpha(f11);
                r6 r6Var2 = r6VarArr[i10];
                if (!z10) {
                    i12 = 8;
                }
                r6Var2.setVisibility(i12);
            }
        }
    }

    public final void Z() {
        if (this.V.getSearchOptionsItem() != null) {
            this.V.getSearchOptionsItem().setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.h6.G6), PorterDuff.Mode.SRC_IN));
        }
        this.actionBar.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20730a7, false));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.h6.G6;
        kVar.D(org.telegram.ui.ActionBar.h6.x0(null, i10, false), false);
        this.actionBar.D(org.telegram.ui.ActionBar.h6.x0(null, i10, false), true);
        this.actionBar.C(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21191z8, false), false);
        this.actionBar.setTitleColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
        org.telegram.ui.ActionBar.h5[] h5VarArr = this.f25965w;
        org.telegram.ui.ActionBar.h5 h5Var = h5VarArr[0];
        if (h5Var != null) {
            h5Var.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
        }
        org.telegram.ui.ActionBar.h5 h5Var2 = h5VarArr[1];
        if (h5Var2 != null) {
            h5Var2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
        }
    }

    public final void a0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.eb0.a0():void");
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.eb0.createView(android.content.Context):android.view.View");
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.userInfoDidLoad && ((Long) objArr[0]).longValue() == this.f25960e) {
            TLRPC.UserFull userFull = (TLRPC.UserFull) objArr[1];
            this.d = userFull;
            bb0 bb0Var = this.V;
            if (bb0Var != null) {
                bb0Var.setUserInfo(userFull);
            }
        }
    }

    @Override
    public final int getNavigationBarColor() {
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.h6.f20786d6);
        if (getLastStoryViewer() != null && getLastStoryViewer().attachedToParent()) {
            return getLastStoryViewer().getNavigationBarColor(themedColor);
        }
        return themedColor;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        a7 a7Var = new a7(this, 4);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, a7Var, org.telegram.ui.ActionBar.h6.f20786d6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, a7Var, org.telegram.ui.ActionBar.h6.f21191z8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, a7Var, org.telegram.ui.ActionBar.h6.G6));
        arrayList.addAll(this.V.getThemeDescriptions());
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().H0) {
            int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20786d6, false);
            if (this.actionBar.t()) {
                x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21138w8, false);
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
        bb0 bb0Var = this.V;
        if (bb0Var.getSelectedTab() != bb0Var.I0.getFirstTabId()) {
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
            bb0 bb0Var = this.V;
            if (bb0Var.C1) {
                if (z10) {
                    bb0Var.L(false);
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
        this.f25955a = getArguments().getInt("type", 0);
        this.f25960e = getArguments().getLong("dialog_id");
        this.f25961f = getArguments().getLong("topic_id", 0L);
        this.h = getArguments().getString("hashtag", "");
        this.f25962n = getArguments().getString("username", "");
        this.f25963r = getArguments().getInt("storiesCount", -1);
        int i11 = this.f25955a;
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
        if (DialogObject.isUserDialog(this.f25960e) && this.f25961f == 0) {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f25960e));
            if (UserObject.isUserSelf(user)) {
                getMessagesController().loadUserInfo(user, false, this.classGuid);
                this.d = getMessagesController().getUserFull(this.f25960e);
            }
        }
        if (this.f25957b == null) {
            this.f25957b = new vv0(this);
        }
        this.f25957b.f32496x.add(this);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.userInfoDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        getNotificationCenter().removeObserver(this, NotificationCenter.storiesEnabledUpdate);
        ci.x0 x0Var = this.U;
        if (x0Var != null) {
            this.U = null;
            AndroidUtilities.runOnUIThread(x0Var);
        }
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        bb0 bb0Var = this.V;
        if (bb0Var != null) {
            bb0Var.setPagesPaddingBottom(i13);
        }
    }
}
