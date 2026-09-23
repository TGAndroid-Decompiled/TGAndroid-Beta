package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class e01 extends org.telegram.ui.Components.yu0 {
    public boolean f32770f2;
    public final ProfileActivity f32771g2;

    public e01(ProfileActivity profileActivity, Context context, long j3, org.telegram.ui.Components.qu0 qu0Var, int i10, ArrayList arrayList, TLRPC.ChatFull chatFull, TLRPC.UserFull userFull, int i11, int i12, ProfileActivity profileActivity2, ProfileActivity profileActivity3, org.telegram.ui.ActionBar.d6 d6Var, ah.c cVar) {
        super(context, j3, qu0Var, i10, arrayList, chatFull, userFull, i11, i12, profileActivity2, profileActivity3, 1, d6Var, cVar);
        this.f32771g2 = profileActivity;
    }

    @Override
    public final void D0(SparseArray sparseArray) {
        char c10;
        ProfileActivity profileActivity = this.f32771g2;
        if (profileActivity.f31336s1) {
            int size = sparseArray.size();
            int selectedTab = getSelectedTab();
            if (!org.telegram.ui.Components.yu0.w0(selectedTab) && selectedTab != 8) {
                if (selectedTab == 9) {
                    c10 = 1;
                } else {
                    c10 = 65535;
                }
            } else {
                c10 = 0;
            }
            if (c10 >= 0) {
                if (c10 == 0) {
                    ProfileActivity.G0(profileActivity, size);
                }
                profileActivity.f31369w5[c10].b(size, true);
            }
        }
    }

    @Override
    public final void E0() {
        FrameLayout frameLayout;
        ProfileActivity profileActivity = this.f32771g2;
        if (profileActivity.f31336s1 && (frameLayout = profileActivity.f31347t5[0]) != null && profileActivity.O != null) {
            frameLayout.setTranslationY((1.0f - profileActivity.O.getBottomButtonStoriesVisibility()) * AndroidUtilities.dp(72.0f));
        }
    }

    @Override
    public final boolean I0(TLRPC.ChatParticipant chatParticipant, boolean z10, View view) {
        return this.f32771g2.h(chatParticipant, z10, false, view);
    }

    @Override
    public final void K0(boolean z10) {
        int i10;
        int i11;
        int i12;
        int i13;
        ProfileActivity profileActivity = this.f32771g2;
        Activity parentActivity = profileActivity.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.n2) profileActivity).classGuid;
        AndroidUtilities.removeAdjustResize(parentActivity, i10);
        profileActivity.f31209a.B0();
        profileActivity.Z.setPivotY((profileActivity.Y.getMeasuredHeight() / 2.0f) + profileActivity.Y.getPivotY());
        ci.m6 m6Var = profileActivity.Z;
        m6Var.setPivotX(m6Var.getMeasuredWidth() / 2.0f);
        AndroidUtilities.updateViewVisibilityAnimated(profileActivity.Z, !z10, 0.95f, true);
        org.telegram.ui.ActionBar.v0 v0Var = profileActivity.Q0;
        int i14 = 8;
        if (!z10 && profileActivity.L0) {
            i11 = 4;
        } else {
            i11 = 8;
        }
        v0Var.setVisibility(i11);
        org.telegram.ui.ActionBar.v0 v0Var2 = profileActivity.R0;
        if (!z10 && profileActivity.M0) {
            i12 = 4;
        } else {
            i12 = 8;
        }
        v0Var2.setVisibility(i12);
        org.telegram.ui.ActionBar.v0 v0Var3 = profileActivity.S0;
        if (!z10 && profileActivity.N0) {
            i13 = 4;
        } else {
            i13 = 8;
        }
        v0Var3.setVisibility(i13);
        org.telegram.ui.ActionBar.v0 v0Var4 = profileActivity.T0;
        if (!z10) {
            i14 = 4;
        }
        v0Var4.setVisibility(i14);
        profileActivity.l5(false);
    }

    @Override
    public final void L0() {
        this.f32771g2.R();
    }

    @Override
    public final void M0(float f7) {
        E0();
        ProfileActivity profileActivity = this.f32771g2;
        e01 e01Var = profileActivity.O;
        if (e01Var != null && profileActivity.f31336s1) {
            if (profileActivity.f31347t5[0] != null) {
                profileActivity.f31347t5[0].setTranslationX(e01Var.f0(8, true));
            }
            if (profileActivity.f31347t5[1] != null) {
                profileActivity.f31347t5[1].setTranslationX(profileActivity.O.f0(9, false));
            }
            ProfileActivity.G0(profileActivity, profileActivity.f31267h6);
            profileActivity.U4();
        }
    }

    @Override
    public final void P(Canvas canvas, float f7, Rect rect, Paint paint) {
        ProfileActivity profileActivity = this.f32771g2;
        profileActivity.f31297m5.J(canvas, getY() + profileActivity.f31209a.getY() + f7, rect, paint, true);
    }

    @Override
    public final int V0(int i10) {
        this.f32771g2.getClass();
        return i10;
    }

    @Override
    public final void b1(boolean r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.e01.b1(boolean):void");
    }

    @Override
    public final int getInitialTab() {
        return 8;
    }

    @Override
    public final boolean l0() {
        ProfileActivity profileActivity = this.f32771g2;
        if (profileActivity.f31269i1 == profileActivity.getUserConfig().getClientUserId() && !profileActivity.f31262h1) {
            return true;
        }
        return false;
    }

    @Override
    public final void o0() {
        c01 c01Var = this.f32771g2.f31297m5;
        if (c01Var != null) {
            c01Var.M();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AndroidUtilities.runOnUIThread(new xz0(this, 1));
    }

    @Override
    public final boolean u0() {
        return this.f32771g2.f31336s1;
    }

    @Override
    public final boolean v0() {
        return this.f32771g2.f31336s1;
    }

    @Override
    public final void v1(boolean z10) {
        int i10;
        int i11;
        super.v1(z10);
        ProfileActivity profileActivity = this.f32771g2;
        boolean z11 = profileActivity.f31343t1;
        org.telegram.ui.Components.nr0 nr0Var = this.V;
        if (z11 && !profileActivity.f31365w1 && this.I0.d(14)) {
            if (!this.f32770f2 && (i11 = profileActivity.f31350u1) > 0 && nr0Var != null) {
                this.f32770f2 = true;
                nr0Var.M = i11;
                nr0Var.e();
            }
            profileActivity.f31365w1 = true;
            Y0(14);
        } else if (profileActivity.f31343t1 && profileActivity.f31365w1 && !this.f32770f2 && (i10 = profileActivity.f31350u1) > 0 && nr0Var != null) {
            this.f32770f2 = true;
            nr0Var.M = i10;
            nr0Var.e();
        }
    }
}
