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
public final class j01 extends org.telegram.ui.Components.cw0 {
    public boolean f38845f2;
    public final ProfileActivity f38846g2;

    public j01(ProfileActivity profileActivity, Context context, long j3, org.telegram.ui.Components.uv0 uv0Var, int i10, ArrayList arrayList, TLRPC.ChatFull chatFull, TLRPC.UserFull userFull, int i11, int i12, ProfileActivity profileActivity2, ProfileActivity profileActivity3, org.telegram.ui.ActionBar.d6 d6Var, ah.c cVar) {
        super(context, j3, uv0Var, i10, arrayList, chatFull, userFull, i11, i12, profileActivity2, profileActivity3, 1, d6Var, cVar);
        this.f38846g2 = profileActivity;
    }

    @Override
    public final void D0(SparseArray sparseArray) {
        char c10;
        ProfileActivity profileActivity = this.f38846g2;
        if (profileActivity.f34401s1) {
            int size = sparseArray.size();
            int selectedTab = getSelectedTab();
            if (!org.telegram.ui.Components.cw0.w0(selectedTab) && selectedTab != 8) {
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
                profileActivity.f34434w5[c10].b(size, true);
            }
        }
    }

    @Override
    public final void E0() {
        FrameLayout frameLayout;
        ProfileActivity profileActivity = this.f38846g2;
        if (profileActivity.f34401s1 && (frameLayout = profileActivity.f34412t5[0]) != null && profileActivity.O != null) {
            frameLayout.setTranslationY((1.0f - profileActivity.O.getBottomButtonStoriesVisibility()) * AndroidUtilities.dp(72.0f));
        }
    }

    @Override
    public final boolean I0(TLRPC.ChatParticipant chatParticipant, boolean z10, View view) {
        return this.f38846g2.h(chatParticipant, z10, false, view);
    }

    @Override
    public final void K0(boolean z10) {
        int i10;
        ci.m6 m6Var;
        int i11;
        int i12;
        int i13;
        ProfileActivity profileActivity = this.f38846g2;
        Activity parentActivity = profileActivity.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.m2) profileActivity).classGuid;
        AndroidUtilities.removeAdjustResize(parentActivity, i10);
        profileActivity.f34273a.B0();
        profileActivity.Z.setPivotY((profileActivity.Y.getMeasuredHeight() / 2.0f) + profileActivity.Y.getPivotY());
        profileActivity.Z.setPivotX(m6Var.getMeasuredWidth() / 2.0f);
        AndroidUtilities.updateViewVisibilityAnimated(profileActivity.Z, !z10, 0.95f, true);
        org.telegram.ui.ActionBar.u0 u0Var = profileActivity.Q0;
        int i14 = 8;
        if (!z10 && profileActivity.L0) {
            i11 = 4;
        } else {
            i11 = 8;
        }
        u0Var.setVisibility(i11);
        org.telegram.ui.ActionBar.u0 u0Var2 = profileActivity.R0;
        if (!z10 && profileActivity.M0) {
            i12 = 4;
        } else {
            i12 = 8;
        }
        u0Var2.setVisibility(i12);
        org.telegram.ui.ActionBar.u0 u0Var3 = profileActivity.S0;
        if (!z10 && profileActivity.N0) {
            i13 = 4;
        } else {
            i13 = 8;
        }
        u0Var3.setVisibility(i13);
        org.telegram.ui.ActionBar.u0 u0Var4 = profileActivity.T0;
        if (!z10) {
            i14 = 4;
        }
        u0Var4.setVisibility(i14);
        profileActivity.l5(false);
    }

    @Override
    public final void L0() {
        this.f38846g2.R();
    }

    @Override
    public final void M0(float f7) {
        E0();
        ProfileActivity profileActivity = this.f38846g2;
        j01 j01Var = profileActivity.O;
        if (j01Var != null && profileActivity.f34401s1) {
            if (profileActivity.f34412t5[0] != null) {
                profileActivity.f34412t5[0].setTranslationX(j01Var.f0(8, true));
            }
            if (profileActivity.f34412t5[1] != null) {
                profileActivity.f34412t5[1].setTranslationX(profileActivity.O.f0(9, false));
            }
            ProfileActivity.G0(profileActivity, profileActivity.f34332h6);
            profileActivity.U4();
        }
    }

    @Override
    public final void P(Canvas canvas, float f7, Rect rect, Paint paint) {
        ProfileActivity profileActivity = this.f38846g2;
        profileActivity.f34362m5.J(canvas, getY() + profileActivity.f34273a.getY() + f7, rect, paint, true);
    }

    @Override
    public final int V0(int i10) {
        this.f38846g2.getClass();
        return i10;
    }

    @Override
    public final void b1(boolean r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.j01.b1(boolean):void");
    }

    @Override
    public final int getInitialTab() {
        return 8;
    }

    @Override
    public final boolean l0() {
        ProfileActivity profileActivity = this.f38846g2;
        if (profileActivity.f34334i1 == profileActivity.getUserConfig().getClientUserId() && !profileActivity.f34327h1) {
            return true;
        }
        return false;
    }

    @Override
    public final void o0() {
        h01 h01Var = this.f38846g2.f34362m5;
        if (h01Var != null) {
            h01Var.M();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AndroidUtilities.runOnUIThread(new mz0(this, 2));
    }

    @Override
    public final boolean u0() {
        return this.f38846g2.f34401s1;
    }

    @Override
    public final boolean v0() {
        return this.f38846g2.f34401s1;
    }

    @Override
    public final void v1(boolean z10) {
        int i10;
        int i11;
        super.v1(z10);
        ProfileActivity profileActivity = this.f38846g2;
        boolean z11 = profileActivity.f34408t1;
        org.telegram.ui.Components.ss0 ss0Var = this.V;
        if (z11 && !profileActivity.f34430w1 && this.I0.d(14)) {
            if (!this.f38845f2 && (i11 = profileActivity.f34415u1) > 0 && ss0Var != null) {
                this.f38845f2 = true;
                ss0Var.M = i11;
                ss0Var.e();
            }
            profileActivity.f34430w1 = true;
            Y0(14);
        } else if (profileActivity.f34408t1 && profileActivity.f34430w1 && !this.f38845f2 && (i10 = profileActivity.f34415u1) > 0 && ss0Var != null) {
            this.f38845f2 = true;
            ss0Var.M = i10;
            ss0Var.e();
        }
    }
}
