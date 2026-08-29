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
public final class y90 extends org.telegram.ui.ActionBar.o2 implements ju0, xf.b, NotificationCenter.NotificationCenterDelegate {
    public org.telegram.ui.ActionBar.h2 A;
    public o6 B;
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
    public x90 N;
    public FrameLayout O;
    public nh.d P;
    public jh.r5 Q;
    public v90 R;
    public int S;
    public int T;
    public final boolean[] U;
    public final float[] V;
    public final boolean[] W;
    public final ValueAnimator[] X;
    public int f34994a;
    public iu0 f34995b;
    public TLRPC.ChatFull f34996c;
    public TLRPC.UserFull d;
    public long f34997e;
    public long f34998f;
    public String h;
    public String f34999n;
    public int f35000r;
    public FrameLayout f35001s;
    public final FrameLayout[] v;
    public final org.telegram.ui.ActionBar.h5[] f35002w;
    public final o6[] f35003x;
    public t90 f35004y;

    public y90(Bundle bundle, iu0 iu0Var) {
        super(bundle);
        this.v = new FrameLayout[2];
        this.f35002w = new org.telegram.ui.ActionBar.h5[2];
        this.f35003x = new o6[2];
        this.H = true;
        this.I = true;
        this.J = -12;
        this.U = new boolean[2];
        this.V = new float[2];
        this.W = new boolean[]{true, true};
        this.X = new ValueAnimator[2];
        this.f34995b = iu0Var;
    }

    public static org.telegram.ui.ActionBar.l V(y90 y90Var) {
        return y90Var.actionBar;
    }

    public static org.telegram.ui.ActionBar.l W(y90 y90Var) {
        return y90Var.actionBar;
    }

    @Override
    public final List B() {
        String str;
        Activity parentActivity = getParentActivity();
        DispatchQueue dispatchQueue = ag.d2.f441m;
        if (parentActivity.getSharedPreferences("shapedetector_conf", 0).getBoolean("learning", false)) {
            str = "Disable";
        } else {
            str = "Enable";
        }
        return Arrays.asList(new xf.a(str.concat(" shape detector learning debug"), new rp(this, 26)));
    }

    @Override
    public final void L() {
        iu0 iu0Var;
        v90 v90Var = this.R;
        if (v90Var != null && (iu0Var = this.f34995b) != null) {
            v90Var.setNewMediaCounts(iu0Var.f29477c);
        }
        a0();
    }

    public final void X(TLRPC.ChatFull chatFull) {
        this.f34996c = chatFull;
    }

    public final void Y(int i10, boolean z10, boolean z11) {
        boolean z12;
        float f9;
        float f10;
        float dp;
        int i11 = this.f34994a;
        if (i11 != 3) {
            if (i10 != 1 || i11 != 2) {
                boolean[] zArr = this.U;
                boolean z13 = zArr[i10];
                boolean[] zArr2 = this.W;
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
                ValueAnimator[] valueAnimatorArr = this.X;
                ValueAnimator valueAnimator = valueAnimatorArr[i10];
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    valueAnimatorArr[i10] = null;
                }
                float[] fArr = this.V;
                o6[] o6VarArr = this.f35003x;
                float f11 = 0.0f;
                if (z12) {
                    o6VarArr[i10].setVisibility(0);
                    float f12 = fArr[i10];
                    if (z10) {
                        f11 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, f11);
                    valueAnimatorArr[i10] = ofFloat;
                    ofFloat.addUpdateListener(new gh.b(this, i10, 5));
                    valueAnimatorArr[i10].addListener(new w90(this, i10, z10, 0));
                    valueAnimatorArr[i10].setDuration(320L);
                    valueAnimatorArr[i10].setInterpolator(jr.h);
                    valueAnimatorArr[i10].start();
                    return;
                }
                if (z10) {
                    f9 = 1.0f;
                } else {
                    f9 = 0.0f;
                }
                fArr[i10] = f9;
                org.telegram.ui.ActionBar.h5[] h5VarArr = this.f35002w;
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
        if (this.R.getSearchOptionsItem() != null) {
            this.R.getSearchOptionsItem().setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.g6.G6), PorterDuff.Mode.SRC_IN));
        }
        this.actionBar.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23009a7, false));
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        lVar.C(org.telegram.ui.ActionBar.g6.w0(null, i10, false), false);
        this.actionBar.C(org.telegram.ui.ActionBar.g6.w0(null, i10, false), true);
        this.actionBar.B(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23452z8, false), false);
        this.actionBar.setTitleColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        org.telegram.ui.ActionBar.h5[] h5VarArr = this.f35002w;
        org.telegram.ui.ActionBar.h5 h5Var = h5VarArr[0];
        if (h5Var != null) {
            h5Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        }
        org.telegram.ui.ActionBar.h5 h5Var2 = h5VarArr[1];
        if (h5Var2 != null) {
            h5Var2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        }
    }

    public final void a0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.y90.a0():void");
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.y90.createView(android.content.Context):android.view.View");
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.userInfoDidLoad && ((Long) objArr[0]).longValue() == this.f34997e) {
            TLRPC.UserFull userFull = (TLRPC.UserFull) objArr[1];
            this.d = userFull;
            v90 v90Var = this.R;
            if (v90Var != null) {
                v90Var.setUserInfo(userFull);
            }
        }
    }

    @Override
    public final int getNavigationBarColor() {
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.g6.f23062d6);
        if (getLastStoryViewer() != null && getLastStoryViewer().attachedToParent()) {
            return getLastStoryViewer().getNavigationBarColor(themedColor);
        }
        return themedColor;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        x6 x6Var = new x6(this, 4);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, x6Var, org.telegram.ui.ActionBar.g6.f23062d6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, x6Var, org.telegram.ui.ActionBar.g6.f23452z8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, x6Var, org.telegram.ui.ActionBar.g6.G6));
        arrayList.addAll(this.R.getThemeDescriptions());
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().D0) {
            int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, false);
            if (this.actionBar.s()) {
                w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23403w8, false);
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
        v90 v90Var = this.R;
        if (v90Var.getSelectedTab() != v90Var.E0.getFirstTabId()) {
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
            v90 v90Var = this.R;
            if (v90Var.f32111y1) {
                if (z10) {
                    v90Var.L(false);
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
        this.f34994a = getArguments().getInt("type", 0);
        this.f34997e = getArguments().getLong("dialog_id");
        this.f34998f = getArguments().getLong("topic_id", 0L);
        this.h = getArguments().getString("hashtag", "");
        this.f34999n = getArguments().getString("username", "");
        this.f35000r = getArguments().getInt("storiesCount", -1);
        int i11 = this.f34994a;
        if (i11 == 2) {
            i10 = 9;
        } else if (i11 == 1) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        this.S = getArguments().getInt("start_from", i10);
        getNotificationCenter().addObserver(this, NotificationCenter.userInfoDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        getNotificationCenter().addObserver(this, NotificationCenter.storiesEnabledUpdate);
        if (DialogObject.isUserDialog(this.f34997e) && this.f34998f == 0) {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f34997e));
            if (UserObject.isUserSelf(user)) {
                getMessagesController().loadUserInfo(user, false, this.classGuid);
                this.d = getMessagesController().getUserFull(this.f34997e);
            }
        }
        if (this.f34995b == null) {
            this.f34995b = new iu0(this);
        }
        this.f34995b.f29484x.add(this);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.userInfoDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        getNotificationCenter().removeObserver(this, NotificationCenter.storiesEnabledUpdate);
        jh.r5 r5Var = this.Q;
        if (r5Var != null) {
            this.Q = null;
            AndroidUtilities.runOnUIThread(r5Var);
        }
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        v90 v90Var = this.R;
        if (v90Var != null) {
            v90Var.setPagesPaddingBottom(i13);
        }
    }
}
