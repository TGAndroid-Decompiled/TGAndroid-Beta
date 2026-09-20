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
public final class l01 extends org.telegram.ui.Components.jv0 {
    public boolean f35274f2;
    public final ProfileActivity f35275g2;

    public l01(ProfileActivity profileActivity, Context context, long j3, org.telegram.ui.Components.bv0 bv0Var, int i10, ArrayList arrayList, TLRPC.ChatFull chatFull, TLRPC.UserFull userFull, int i11, int i12, ProfileActivity profileActivity2, ProfileActivity profileActivity3, org.telegram.ui.ActionBar.f6 f6Var, ah.c cVar) {
        super(context, j3, bv0Var, i10, arrayList, chatFull, userFull, i11, i12, profileActivity2, profileActivity3, 1, f6Var, cVar);
        this.f35275g2 = profileActivity;
    }

    @Override
    public final void D0(SparseArray sparseArray) {
        char c10;
        ProfileActivity profileActivity = this.f35275g2;
        if (profileActivity.f31649s1) {
            int size = sparseArray.size();
            int selectedTab = getSelectedTab();
            if (!org.telegram.ui.Components.jv0.w0(selectedTab) && selectedTab != 8) {
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
                profileActivity.f31682w5[c10].b(size, true);
            }
        }
    }

    @Override
    public final void E0() {
        FrameLayout frameLayout;
        ProfileActivity profileActivity = this.f35275g2;
        if (profileActivity.f31649s1 && (frameLayout = profileActivity.f31660t5[0]) != null && profileActivity.O != null) {
            frameLayout.setTranslationY((1.0f - profileActivity.O.getBottomButtonStoriesVisibility()) * AndroidUtilities.dp(72.0f));
        }
    }

    @Override
    public final boolean I0(TLRPC.ChatParticipant chatParticipant, boolean z10, View view) {
        return this.f35275g2.h(chatParticipant, z10, false, view);
    }

    @Override
    public final void K0(boolean z10) {
        int i10;
        int i11;
        int i12;
        int i13;
        ProfileActivity profileActivity = this.f35275g2;
        Activity parentActivity = profileActivity.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.n2) profileActivity).classGuid;
        AndroidUtilities.removeAdjustResize(parentActivity, i10);
        profileActivity.f31522a.C0();
        profileActivity.Z.setPivotY((profileActivity.Y.getMeasuredHeight() / 2.0f) + profileActivity.Y.getPivotY());
        ci.n6 n6Var = profileActivity.Z;
        n6Var.setPivotX(n6Var.getMeasuredWidth() / 2.0f);
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
        this.f35275g2.R();
    }

    @Override
    public final void M0(float f7) {
        E0();
        ProfileActivity profileActivity = this.f35275g2;
        l01 l01Var = profileActivity.O;
        if (l01Var != null && profileActivity.f31649s1) {
            if (profileActivity.f31660t5[0] != null) {
                profileActivity.f31660t5[0].setTranslationX(l01Var.f0(8, true));
            }
            if (profileActivity.f31660t5[1] != null) {
                profileActivity.f31660t5[1].setTranslationX(profileActivity.O.f0(9, false));
            }
            ProfileActivity.G0(profileActivity, profileActivity.f31580h6);
            profileActivity.U4();
        }
    }

    @Override
    public final void P(Canvas canvas, float f7, Rect rect, Paint paint) {
        ProfileActivity profileActivity = this.f35275g2;
        profileActivity.f31610m5.J(canvas, getY() + profileActivity.f31522a.getY() + f7, rect, paint, true);
    }

    @Override
    public final int V0(int i10) {
        this.f35275g2.getClass();
        return i10;
    }

    @Override
    public final void b1(boolean r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.l01.b1(boolean):void");
    }

    @Override
    public final int getInitialTab() {
        return 8;
    }

    @Override
    public final boolean l0() {
        ProfileActivity profileActivity = this.f35275g2;
        if (profileActivity.f31582i1 == profileActivity.getUserConfig().getClientUserId() && !profileActivity.f31575h1) {
            return true;
        }
        return false;
    }

    @Override
    public final void o0() {
        j01 j01Var = this.f35275g2.f31610m5;
        if (j01Var != null) {
            j01Var.M();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AndroidUtilities.runOnUIThread(new e01(this, 1));
    }

    @Override
    public final boolean u0() {
        return this.f35275g2.f31649s1;
    }

    @Override
    public final boolean v0() {
        return this.f35275g2.f31649s1;
    }

    @Override
    public final void v1(boolean z10) {
        int i10;
        int i11;
        super.v1(z10);
        ProfileActivity profileActivity = this.f35275g2;
        boolean z11 = profileActivity.f31656t1;
        org.telegram.ui.Components.yr0 yr0Var = this.V;
        if (z11 && !profileActivity.f31678w1 && this.I0.d(14)) {
            if (!this.f35274f2 && (i11 = profileActivity.f31663u1) > 0 && yr0Var != null) {
                this.f35274f2 = true;
                yr0Var.M = i11;
                yr0Var.e();
            }
            profileActivity.f31678w1 = true;
            Y0(14);
        } else if (profileActivity.f31656t1 && profileActivity.f31678w1 && !this.f35274f2 && (i10 = profileActivity.f31663u1) > 0 && yr0Var != null) {
            this.f35274f2 = true;
            yr0Var.M = i10;
            yr0Var.e();
        }
    }
}
