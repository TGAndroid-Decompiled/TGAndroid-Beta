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
public final class k90 extends org.telegram.ui.ActionBar.o2 implements xt0, uf.b, NotificationCenter.NotificationCenterDelegate {
    public org.telegram.ui.ActionBar.h2 A;
    public j6 B;
    public org.telegram.ui.ActionBar.w0 C;
    public org.telegram.ui.ActionBar.w0 D;
    public SparseArray E;
    public org.telegram.ui.ActionBar.g1 F;
    public org.telegram.ui.ActionBar.g1 G;
    public boolean H;
    public boolean I;
    public int J;
    public org.telegram.ui.ActionBar.g1 K;
    public org.telegram.ui.ActionBar.g1 L;
    public org.telegram.ui.ActionBar.g1 M;
    public j90 N;
    public FrameLayout O;
    public kh.d P;
    public gh.u5 Q;
    public h90 R;
    public int S;
    public int T;
    public final boolean[] U;
    public final float[] V;
    public final boolean[] W;
    public final ValueAnimator[] X;
    public int f30032a;
    public wt0 f30033b;
    public TLRPC.ChatFull f30034c;
    public TLRPC.UserFull d;
    public long f30035e;
    public long f30036f;
    public String h;
    public String f30037n;
    public int f30038r;
    public FrameLayout f30039s;
    public final FrameLayout[] v;
    public final org.telegram.ui.ActionBar.h5[] f30040w;
    public final j6[] f30041x;
    public f90 f30042y;

    public k90(Bundle bundle, wt0 wt0Var) {
        super(bundle);
        this.v = new FrameLayout[2];
        this.f30040w = new org.telegram.ui.ActionBar.h5[2];
        this.f30041x = new j6[2];
        this.H = true;
        this.I = true;
        this.J = -12;
        this.U = new boolean[2];
        this.V = new float[2];
        this.W = new boolean[]{true, true};
        this.X = new ValueAnimator[2];
        this.f30033b = wt0Var;
    }

    public static org.telegram.ui.ActionBar.k U(k90 k90Var) {
        return k90Var.actionBar;
    }

    public static org.telegram.ui.ActionBar.k V(k90 k90Var) {
        return k90Var.actionBar;
    }

    @Override
    public final List A() {
        String str;
        Activity parentActivity = getParentActivity();
        DispatchQueue dispatchQueue = xf.k1.f49254m;
        if (parentActivity.getSharedPreferences("shapedetector_conf", 0).getBoolean("learning", false)) {
            str = "Disable";
        } else {
            str = "Enable";
        }
        return Arrays.asList(new uf.a(str.concat(" shape detector learning debug"), new np(this, 26)));
    }

    @Override
    public final void L() {
        wt0 wt0Var;
        h90 h90Var = this.R;
        if (h90Var != null && (wt0Var = this.f30033b) != null) {
            h90Var.setNewMediaCounts(wt0Var.f34363c);
        }
        Z();
    }

    public final void W(TLRPC.ChatFull chatFull) {
        this.f30034c = chatFull;
    }

    public final void X(int i9, boolean z10, boolean z11) {
        boolean z12;
        float f10;
        float f11;
        float dp;
        int i10 = this.f30032a;
        if (i10 != 3) {
            if (i9 != 1 || i10 != 2) {
                boolean[] zArr = this.U;
                boolean z13 = zArr[i9];
                boolean[] zArr2 = this.W;
                if (z13 == z10 && !zArr2[i9]) {
                    return;
                }
                int i11 = 0;
                if (!zArr2[i9] && z11) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                zArr2[i9] = false;
                zArr[i9] = z10;
                ValueAnimator[] valueAnimatorArr = this.X;
                ValueAnimator valueAnimator = valueAnimatorArr[i9];
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    valueAnimatorArr[i9] = null;
                }
                float[] fArr = this.V;
                j6[] j6VarArr = this.f30041x;
                float f12 = 0.0f;
                if (z12) {
                    j6VarArr[i9].setVisibility(0);
                    float f13 = fArr[i9];
                    if (z10) {
                        f12 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f13, f12);
                    valueAnimatorArr[i9] = ofFloat;
                    ofFloat.addUpdateListener(new dh.b(this, i9, 5));
                    valueAnimatorArr[i9].addListener(new i90(this, i9, z10, 0));
                    valueAnimatorArr[i9].setDuration(320L);
                    valueAnimatorArr[i9].setInterpolator(gr.h);
                    valueAnimatorArr[i9].start();
                    return;
                }
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                fArr[i9] = f10;
                org.telegram.ui.ActionBar.h5[] h5VarArr = this.f30040w;
                org.telegram.ui.ActionBar.h5 h5Var = h5VarArr[i9];
                float f14 = 1.111f;
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 1.111f;
                }
                h5Var.setScaleX(f11);
                org.telegram.ui.ActionBar.h5 h5Var2 = h5VarArr[i9];
                if (z10) {
                    f14 = 1.0f;
                }
                h5Var2.setScaleY(f14);
                org.telegram.ui.ActionBar.h5 h5Var3 = h5VarArr[i9];
                if (z10) {
                    dp = 0.0f;
                } else {
                    dp = AndroidUtilities.dp(8.0f);
                }
                h5Var3.setTranslationY(dp);
                j6 j6Var = j6VarArr[i9];
                if (z10) {
                    f12 = 1.0f;
                }
                j6Var.setAlpha(f12);
                j6 j6Var2 = j6VarArr[i9];
                if (!z10) {
                    i11 = 8;
                }
                j6Var2.setVisibility(i11);
            }
        }
    }

    public final void Y() {
        if (this.R.getSearchOptionsItem() != null) {
            this.R.getSearchOptionsItem().setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.f6.G6), PorterDuff.Mode.SRC_IN));
        }
        this.actionBar.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f22947a7, false));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i9 = org.telegram.ui.ActionBar.f6.G6;
        kVar.C(org.telegram.ui.ActionBar.f6.w0(null, i9, false), false);
        this.actionBar.C(org.telegram.ui.ActionBar.f6.w0(null, i9, false), true);
        this.actionBar.A(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23388z8, false), false);
        this.actionBar.setTitleColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
        org.telegram.ui.ActionBar.h5[] h5VarArr = this.f30040w;
        org.telegram.ui.ActionBar.h5 h5Var = h5VarArr[0];
        if (h5Var != null) {
            h5Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
        }
        org.telegram.ui.ActionBar.h5 h5Var2 = h5VarArr[1];
        if (h5Var2 != null) {
            h5Var2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
        }
    }

    public final void Z() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.k90.Z():void");
    }

    @Override
    public final boolean canBeginSlide() {
        if (!this.R.x0()) {
            return false;
        }
        return super.canBeginSlide();
    }

    @Override
    public final android.view.View createView(android.content.Context r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.k90.createView(android.content.Context):android.view.View");
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.userInfoDidLoad && ((Long) objArr[0]).longValue() == this.f30035e) {
            TLRPC.UserFull userFull = (TLRPC.UserFull) objArr[1];
            this.d = userFull;
            h90 h90Var = this.R;
            if (h90Var != null) {
                h90Var.setUserInfo(userFull);
            }
        }
    }

    @Override
    public final int getNavigationBarColor() {
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.f6.f23001d6);
        if (getLastStoryViewer() != null && getLastStoryViewer().attachedToParent()) {
            return getLastStoryViewer().getNavigationBarColor(themedColor);
        }
        return themedColor;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        s6 s6Var = new s6(this, 4);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, s6Var, org.telegram.ui.ActionBar.f6.f23001d6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, s6Var, org.telegram.ui.ActionBar.f6.f23388z8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, s6Var, org.telegram.ui.ActionBar.f6.G6));
        arrayList.addAll(this.R.getThemeDescriptions());
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().D0) {
            int w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false);
            if (this.actionBar.s()) {
                w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.w8, false);
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
        if (!this.R.x0()) {
            return false;
        }
        h90 h90Var = this.R;
        if (h90Var.getSelectedTab() != h90Var.E0.getFirstTabId()) {
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
            h90 h90Var = this.R;
            if (h90Var.f28178y1) {
                if (z10) {
                    h90Var.L(false);
                }
            } else {
                return super.onBackPressed(z10);
            }
        }
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        int i9;
        this.f30032a = getArguments().getInt("type", 0);
        this.f30035e = getArguments().getLong("dialog_id");
        this.f30036f = getArguments().getLong("topic_id", 0L);
        this.h = getArguments().getString("hashtag", "");
        this.f30037n = getArguments().getString("username", "");
        this.f30038r = getArguments().getInt("storiesCount", -1);
        int i10 = this.f30032a;
        if (i10 == 2) {
            i9 = 9;
        } else if (i10 == 1) {
            i9 = 8;
        } else {
            i9 = 0;
        }
        this.S = getArguments().getInt("start_from", i9);
        getNotificationCenter().addObserver(this, NotificationCenter.userInfoDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        getNotificationCenter().addObserver(this, NotificationCenter.storiesEnabledUpdate);
        if (DialogObject.isUserDialog(this.f30035e) && this.f30036f == 0) {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f30035e));
            if (UserObject.isUserSelf(user)) {
                getMessagesController().loadUserInfo(user, false, this.classGuid);
                this.d = getMessagesController().getUserFull(this.f30035e);
            }
        }
        if (this.f30033b == null) {
            this.f30033b = new wt0(this);
        }
        this.f30033b.f34370x.add(this);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.userInfoDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        getNotificationCenter().removeObserver(this, NotificationCenter.storiesEnabledUpdate);
        gh.u5 u5Var = this.Q;
        if (u5Var != null) {
            this.Q = null;
            AndroidUtilities.runOnUIThread(u5Var);
        }
    }

    @Override
    public final void onInsets(int i9, int i10, int i11, int i12) {
        h90 h90Var = this.R;
        if (h90Var != null) {
            h90Var.setPagesPaddingBottom(i12);
        }
    }
}
