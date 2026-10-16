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
public final class q01 extends org.telegram.ui.Components.xv0 {
    public boolean f39041f2;
    public final ProfileActivity f39042g2;

    public q01(ProfileActivity profileActivity, Context context, long j10, org.telegram.ui.Components.pv0 pv0Var, int i10, ArrayList arrayList, TLRPC.ChatFull chatFull, TLRPC.UserFull userFull, int i11, int i12, ProfileActivity profileActivity2, ProfileActivity profileActivity3, org.telegram.ui.ActionBar.c6 c6Var, bh.b bVar) {
        super(context, j10, pv0Var, i10, arrayList, chatFull, userFull, i11, i12, profileActivity2, profileActivity3, 1, c6Var, bVar);
        this.f39042g2 = profileActivity;
    }

    @Override
    public final void E0(SparseArray sparseArray) {
        char c10;
        ProfileActivity profileActivity = this.f39042g2;
        if (profileActivity.f32358s1) {
            int size = sparseArray.size();
            int selectedTab = getSelectedTab();
            if (!org.telegram.ui.Components.xv0.x0(selectedTab) && selectedTab != 8) {
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
                profileActivity.f32391w5[c10].b(size, true);
            }
        }
    }

    @Override
    public final void F0() {
        FrameLayout frameLayout;
        ProfileActivity profileActivity = this.f39042g2;
        if (profileActivity.f32358s1 && (frameLayout = profileActivity.f32369t5[0]) != null && profileActivity.O != null) {
            frameLayout.setTranslationY((1.0f - profileActivity.O.getBottomButtonStoriesVisibility()) * AndroidUtilities.dp(72.0f));
        }
    }

    @Override
    public final boolean J0(TLRPC.ChatParticipant chatParticipant, boolean z10, View view) {
        return this.f39042g2.h(chatParticipant, z10, false, view);
    }

    @Override
    public final void L0(boolean z10) {
        int i10;
        ah.v vVar;
        int i11;
        int i12;
        int i13;
        ProfileActivity profileActivity = this.f39042g2;
        Activity parentActivity = profileActivity.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.m2) profileActivity).classGuid;
        AndroidUtilities.removeAdjustResize(parentActivity, i10);
        profileActivity.f32230a.B0();
        profileActivity.Z.setPivotY((profileActivity.Y.getMeasuredHeight() / 2.0f) + profileActivity.Y.getPivotY());
        profileActivity.Z.setPivotX(vVar.getMeasuredWidth() / 2.0f);
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
    public final void M0() {
        this.f39042g2.R();
    }

    @Override
    public final void N0(float f7) {
        F0();
        ProfileActivity profileActivity = this.f39042g2;
        q01 q01Var = profileActivity.O;
        if (q01Var != null && profileActivity.f32358s1) {
            if (profileActivity.f32369t5[0] != null) {
                profileActivity.f32369t5[0].setTranslationX(q01Var.f0(8, true));
            }
            if (profileActivity.f32369t5[1] != null) {
                profileActivity.f32369t5[1].setTranslationX(profileActivity.O.f0(9, false));
            }
            ProfileActivity.G0(profileActivity, profileActivity.f32288h6);
            profileActivity.U4();
        }
    }

    @Override
    public final void P(Canvas canvas, float f7, Rect rect, Paint paint) {
        ProfileActivity profileActivity = this.f39042g2;
        profileActivity.f32319m5.J(canvas, getY() + profileActivity.f32230a.getY() + f7, rect, paint, true);
    }

    @Override
    public final int W0(int i10) {
        this.f39042g2.getClass();
        return i10;
    }

    @Override
    public final void c1(boolean r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.q01.c1(boolean):void");
    }

    @Override
    public final int getInitialTab() {
        return 8;
    }

    @Override
    public final boolean l0() {
        ProfileActivity profileActivity = this.f39042g2;
        if (profileActivity.f32290i1 == profileActivity.getUserConfig().getClientUserId() && !profileActivity.f32283h1) {
            return true;
        }
        return false;
    }

    @Override
    public final void o0() {
        o01 o01Var = this.f39042g2.f32319m5;
        if (o01Var != null) {
            o01Var.M();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AndroidUtilities.runOnUIThread(new tz0(this, 2));
    }

    @Override
    public final boolean v0() {
        return this.f39042g2.f32358s1;
    }

    @Override
    public final boolean w0() {
        return this.f39042g2.f32358s1;
    }

    @Override
    public final void w1(boolean z10) {
        int i10;
        int i11;
        super.w1(z10);
        ProfileActivity profileActivity = this.f39042g2;
        boolean z11 = profileActivity.f32365t1;
        org.telegram.ui.Components.ns0 ns0Var = this.V;
        if (z11 && !profileActivity.f32387w1 && this.I0.e(14)) {
            if (!this.f39041f2 && (i11 = profileActivity.f32372u1) > 0 && ns0Var != null) {
                this.f39041f2 = true;
                ns0Var.M = i11;
                ns0Var.e();
            }
            profileActivity.f32387w1 = true;
            Z0(14);
        } else if (profileActivity.f32365t1 && profileActivity.f32387w1 && !this.f39041f2 && (i10 = profileActivity.f32372u1) > 0 && ns0Var != null) {
            this.f39041f2 = true;
            ns0Var.M = i10;
            ns0Var.e();
        }
    }
}
