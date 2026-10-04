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
public final class pa0 extends org.telegram.ui.ActionBar.n2 implements iv0, mg.b, NotificationCenter.NotificationCenterDelegate {
    public org.telegram.ui.ActionBar.g2 E;
    public p6 F;
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
    public oa0 R;
    public FrameLayout S;
    public ci.d T;
    public ci.y0 U;
    public ma0 V;
    public int W;
    public int X;
    public final boolean[] Y;
    public final float[] Z;
    public int f29587a;
    public final boolean[] f29588a0;
    public hv0 f29589b;
    public final ValueAnimator[] f29590b0;
    public TLRPC.ChatFull f29591c;
    public TLRPC.UserFull d;
    public long f29592e;
    public long f29593f;
    public String h;
    public String f29594n;
    public int f29595r;
    public FrameLayout f29596s;
    public final FrameLayout[] v;
    public final org.telegram.ui.ActionBar.i5[] f29597w;
    public final p6[] f29598x;
    public ka0 f29599y;

    public pa0(Bundle bundle, hv0 hv0Var) {
        super(bundle);
        this.v = new FrameLayout[2];
        this.f29597w = new org.telegram.ui.ActionBar.i5[2];
        this.f29598x = new p6[2];
        this.L = true;
        this.M = true;
        this.N = -12;
        this.Y = new boolean[2];
        this.Z = new float[2];
        this.f29588a0 = new boolean[]{true, true};
        this.f29590b0 = new ValueAnimator[2];
        this.f29589b = hv0Var;
    }

    public static org.telegram.ui.ActionBar.k T(pa0 pa0Var) {
        return pa0Var.actionBar;
    }

    public static org.telegram.ui.ActionBar.k U(pa0 pa0Var) {
        return pa0Var.actionBar;
    }

    @Override
    public final void K() {
        hv0 hv0Var;
        ma0 ma0Var = this.V;
        if (ma0Var != null && (hv0Var = this.f29589b) != null) {
            ma0Var.setNewMediaCounts(hv0Var.f27246c);
        }
        Z();
    }

    public final void W(TLRPC.ChatFull chatFull) {
        this.f29591c = chatFull;
    }

    public final void X(int i10, boolean z10, boolean z11) {
        boolean z12;
        float f7;
        float f10;
        float dp;
        int i11 = this.f29587a;
        if (i11 != 3) {
            if (i10 != 1 || i11 != 2) {
                boolean[] zArr = this.Y;
                boolean z13 = zArr[i10];
                boolean[] zArr2 = this.f29588a0;
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
                ValueAnimator[] valueAnimatorArr = this.f29590b0;
                ValueAnimator valueAnimator = valueAnimatorArr[i10];
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    valueAnimatorArr[i10] = null;
                }
                float[] fArr = this.Z;
                p6[] p6VarArr = this.f29598x;
                float f11 = 0.0f;
                if (z12) {
                    p6VarArr[i10].setVisibility(0);
                    float f12 = fArr[i10];
                    if (z10) {
                        f11 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, f11);
                    valueAnimatorArr[i10] = ofFloat;
                    ofFloat.addUpdateListener(new org.telegram.ui.ActionBar.q2(this, i10, 4));
                    valueAnimatorArr[i10].addListener(new na0(this, i10, z10, 0));
                    valueAnimatorArr[i10].setDuration(320L);
                    valueAnimatorArr[i10].setInterpolator(tr.h);
                    valueAnimatorArr[i10].start();
                    return;
                }
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                fArr[i10] = f7;
                org.telegram.ui.ActionBar.i5[] i5VarArr = this.f29597w;
                org.telegram.ui.ActionBar.i5 i5Var = i5VarArr[i10];
                float f13 = 1.111f;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 1.111f;
                }
                i5Var.setScaleX(f10);
                org.telegram.ui.ActionBar.i5 i5Var2 = i5VarArr[i10];
                if (z10) {
                    f13 = 1.0f;
                }
                i5Var2.setScaleY(f13);
                org.telegram.ui.ActionBar.i5 i5Var3 = i5VarArr[i10];
                if (z10) {
                    dp = 0.0f;
                } else {
                    dp = AndroidUtilities.dp(8.0f);
                }
                i5Var3.setTranslationY(dp);
                p6 p6Var = p6VarArr[i10];
                if (z10) {
                    f11 = 1.0f;
                }
                p6Var.setAlpha(f11);
                p6 p6Var2 = p6VarArr[i10];
                if (!z10) {
                    i12 = 8;
                }
                p6Var2.setVisibility(i12);
            }
        }
    }

    public final void Y() {
        if (this.V.getSearchOptionsItem() != null) {
            this.V.getSearchOptionsItem().setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.i6.G6), PorterDuff.Mode.SRC_IN));
        }
        this.actionBar.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20766a7, false));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.i6.G6;
        kVar.B(org.telegram.ui.ActionBar.i6.w0(null, i10, false), false);
        this.actionBar.B(org.telegram.ui.ActionBar.i6.w0(null, i10, false), true);
        this.actionBar.A(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f21230z8, false), false);
        this.actionBar.setTitleColor(org.telegram.ui.ActionBar.i6.w0(null, i10, false));
        org.telegram.ui.ActionBar.i5[] i5VarArr = this.f29597w;
        org.telegram.ui.ActionBar.i5 i5Var = i5VarArr[0];
        if (i5Var != null) {
            i5Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i10, false));
        }
        org.telegram.ui.ActionBar.i5 i5Var2 = i5VarArr[1];
        if (i5Var2 != null) {
            i5Var2.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i10, false));
        }
    }

    public final void Z() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.pa0.Z():void");
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.pa0.createView(android.content.Context):android.view.View");
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.userInfoDidLoad && ((Long) objArr[0]).longValue() == this.f29592e) {
            TLRPC.UserFull userFull = (TLRPC.UserFull) objArr[1];
            this.d = userFull;
            ma0 ma0Var = this.V;
            if (ma0Var != null) {
                ma0Var.setUserInfo(userFull);
            }
        }
    }

    @Override
    public final int getNavigationBarColor() {
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.i6.f20822d6);
        if (getLastStoryViewer() != null && getLastStoryViewer().attachedToParent()) {
            return getLastStoryViewer().getNavigationBarColor(themedColor);
        }
        return themedColor;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        y6 y6Var = new y6(this, 4);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, y6Var, org.telegram.ui.ActionBar.i6.f20822d6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, y6Var, org.telegram.ui.ActionBar.i6.f21230z8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, y6Var, org.telegram.ui.ActionBar.i6.G6));
        arrayList.addAll(this.V.getThemeDescriptions());
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().H0) {
            int w02 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20822d6, false);
            if (this.actionBar.s()) {
                w02 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f21177w8, false);
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
        ma0 ma0Var = this.V;
        if (ma0Var.getSelectedTab() != ma0Var.I0.getFirstTabId()) {
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
            ma0 ma0Var = this.V;
            if (ma0Var.C1) {
                if (z10) {
                    ma0Var.L(false);
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
        this.f29587a = getArguments().getInt("type", 0);
        this.f29592e = getArguments().getLong("dialog_id");
        this.f29593f = getArguments().getLong("topic_id", 0L);
        this.h = getArguments().getString("hashtag", "");
        this.f29594n = getArguments().getString("username", "");
        this.f29595r = getArguments().getInt("storiesCount", -1);
        int i11 = this.f29587a;
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
        if (DialogObject.isUserDialog(this.f29592e) && this.f29593f == 0) {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f29592e));
            if (UserObject.isUserSelf(user)) {
                getMessagesController().loadUserInfo(user, false, this.classGuid);
                this.d = getMessagesController().getUserFull(this.f29592e);
            }
        }
        if (this.f29589b == null) {
            this.f29589b = new hv0(this);
        }
        this.f29589b.f27253x.add(this);
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
        ma0 ma0Var = this.V;
        if (ma0Var != null) {
            ma0Var.setPagesPaddingBottom(i13);
        }
    }

    @Override
    public final List z() {
        String str;
        Activity parentActivity = getParentActivity();
        DispatchQueue dispatchQueue = pg.n1.f44544m;
        if (parentActivity.getSharedPreferences("shapedetector_conf", 0).getBoolean("learning", false)) {
            str = "Disable";
        } else {
            str = "Enable";
        }
        return Arrays.asList(new mg.a(str.concat(" shape detector learning debug"), new aq(this, 27)));
    }
}
