package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

public final class hz0 extends org.telegram.ui.Components.hu0 {

    public boolean f38923b2;

    public final ProfileActivity f38924c2;

    public hz0(ProfileActivity profileActivity, Context context, long j10, org.telegram.ui.Components.zt0 zt0Var, int i10, ArrayList arrayList, TLRPC.ChatFull chatFull, TLRPC.UserFull userFull, int i11, int i12, ProfileActivity profileActivity2, ProfileActivity profileActivity3, org.telegram.ui.ActionBar.c6 c6Var, jg.a aVar) {
        super(context, j10, zt0Var, i10, arrayList, chatFull, userFull, i11, i12, profileActivity2, profileActivity3, 1, c6Var, aVar);
        this.f38924c2 = profileActivity;
    }

    @Override
    public final void D0(SparseArray sparseArray) {
        byte b10;
        ProfileActivity profileActivity = this.f38924c2;
        if (profileActivity.f36022o1) {
            int size = sparseArray.size();
            int selectedTab = getSelectedTab();
            if (org.telegram.ui.Components.hu0.w0(selectedTab) || selectedTab == 8) {
                b10 = 0;
            } else {
                b10 = selectedTab == 9 ? (byte) 1 : (byte) -1;
            }
            if (b10 >= 0) {
                if (b10 == 0) {
                    ProfileActivity.G0(profileActivity, size);
                }
                profileActivity.f36054s5[b10].c(size, true);
            }
        }
    }

    @Override
    public final void E0() {
        FrameLayout frameLayout;
        ProfileActivity profileActivity = this.f38924c2;
        if (!profileActivity.f36022o1 || (frameLayout = profileActivity.f36033p5[0]) == null || profileActivity.K == null) {
            return;
        }
        frameLayout.setTranslationY((1.0f - profileActivity.K.getBottomButtonStoriesVisibility()) * AndroidUtilities.dp(72.0f));
    }

    @Override
    public final boolean I0(TLRPC.ChatParticipant chatParticipant, boolean z10, View view) {
        return this.f38924c2.h(chatParticipant, z10, false, view);
    }

    @Override
    public final void K0(boolean z10) {
        ProfileActivity profileActivity = this.f38924c2;
        AndroidUtilities.removeAdjustResize(profileActivity.getParentActivity(), ((org.telegram.ui.ActionBar.n2) profileActivity).classGuid);
        profileActivity.f35921a.B0();
        profileActivity.V.setPivotY((profileActivity.U.getMeasuredHeight() / 2.0f) + profileActivity.U.getPivotY());
        ag.y1 y1Var = profileActivity.V;
        y1Var.setPivotX(y1Var.getMeasuredWidth() / 2.0f);
        AndroidUtilities.updateViewVisibilityAnimated(profileActivity.V, !z10, 0.95f, true);
        profileActivity.M0.setVisibility((z10 || !profileActivity.H0) ? 8 : 4);
        profileActivity.N0.setVisibility((z10 || !profileActivity.I0) ? 8 : 4);
        profileActivity.O0.setVisibility((z10 || !profileActivity.J0) ? 8 : 4);
        profileActivity.P0.setVisibility(z10 ? 8 : 4);
        profileActivity.l5(false);
    }

    @Override
    public final void L0() {
        this.f38924c2.R();
    }

    @Override
    public final void M0(float f10) {
        E0();
        ProfileActivity profileActivity = this.f38924c2;
        hz0 hz0Var = profileActivity.K;
        if (hz0Var != null && profileActivity.f36022o1) {
            if (profileActivity.f36033p5[0] != null) {
                profileActivity.f36033p5[0].setTranslationX(hz0Var.f0(8, true));
            }
            if (profileActivity.f36033p5[1] != null) {
                profileActivity.f36033p5[1].setTranslationX(profileActivity.K.f0(9, false));
            }
            ProfileActivity.G0(profileActivity, profileActivity.f35949d6);
            profileActivity.U4();
        }
    }

    @Override
    public final void P(Canvas canvas, float f10, Rect rect, Paint paint) {
        ProfileActivity profileActivity = this.f38924c2;
        profileActivity.f35985i5.J(canvas, getY() + profileActivity.f35921a.getY() + f10, rect, paint, true);
    }

    @Override
    public final int V0(int i10) {
        this.f38924c2.getClass();
        return i10;
    }

    @Override
    public final void b1(boolean z10) {
        super.b1(z10);
        ProfileActivity profileActivity = this.f38924c2;
        if (profileActivity.f36022o1) {
            if (z10) {
                g1(null);
            }
            this.H1 = z10;
            int selectedTab = getSelectedTab() - 8;
            if (selectedTab < 0 || selectedTab > 1) {
                return;
            }
            profileActivity.f36033p5[selectedTab].animate().translationY((z10 || (selectedTab == 0 && MessagesController.getInstance(((org.telegram.ui.ActionBar.n2) profileActivity).currentAccount).storiesEnabled())) ? 0.0f : AndroidUtilities.dp(72.0f)).setDuration(320L).setInterpolator(org.telegram.ui.Components.er.h).setUpdateListener(new g3(this, 27)).start();
        }
    }

    @Override
    public final int getInitialTab() {
        return 8;
    }

    @Override
    public final boolean l0() {
        ProfileActivity profileActivity = this.f38924c2;
        return profileActivity.f35952e1 == profileActivity.getUserConfig().getClientUserId() && !profileActivity.f35944d1;
    }

    @Override
    public final void o0() {
        fz0 fz0Var = this.f38924c2.f35985i5;
        if (fz0Var != null) {
            fz0Var.M();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AndroidUtilities.runOnUIThread(new ky0(this, 2));
    }

    @Override
    public final boolean u0() {
        return this.f38924c2.f36022o1;
    }

    @Override
    public final boolean v0() {
        return this.f38924c2.f36022o1;
    }

    @Override
    public final void v1(boolean z10) {
        int i10;
        int i11;
        super.v1(z10);
        ProfileActivity profileActivity = this.f38924c2;
        boolean z11 = profileActivity.f36029p1;
        org.telegram.ui.Components.wq0 wq0Var = this.R;
        if (z11 && !profileActivity.f36050s1 && this.E0.e(14)) {
            if (!this.f38923b2 && (i11 = profileActivity.f36035q1) > 0 && wq0Var != null) {
                this.f38923b2 = true;
                wq0Var.I = i11;
                wq0Var.e();
            }
            profileActivity.f36050s1 = true;
            Y0(14);
            return;
        }
        if (!profileActivity.f36029p1 || !profileActivity.f36050s1 || this.f38923b2 || (i10 = profileActivity.f36035q1) <= 0 || wq0Var == null) {
            return;
        }
        this.f38923b2 = true;
        wq0Var.I = i10;
        wq0Var.e();
    }
}
