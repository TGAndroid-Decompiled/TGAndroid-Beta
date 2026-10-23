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
public final class nz0 extends org.telegram.ui.Components.uv0 {
    public boolean f39729f2;
    public final ProfileActivity f39730g2;

    public nz0(ProfileActivity profileActivity, Context context, long j10, org.telegram.ui.Components.mv0 mv0Var, int i10, ArrayList arrayList, TLRPC.ChatFull chatFull, TLRPC.UserFull userFull, int i11, int i12, ProfileActivity profileActivity2, ProfileActivity profileActivity3, org.telegram.ui.ActionBar.d6 d6Var, bh.b bVar) {
        super(context, j10, mv0Var, i10, arrayList, chatFull, userFull, i11, i12, profileActivity2, profileActivity3, 1, d6Var, bVar);
        this.f39730g2 = profileActivity;
    }

    @Override
    public final void F0(SparseArray sparseArray) {
        char c10;
        ProfileActivity profileActivity = this.f39730g2;
        if (profileActivity.f33720t1) {
            int size = sparseArray.size();
            int selectedTab = getSelectedTab();
            if (!org.telegram.ui.Components.uv0.y0(selectedTab) && selectedTab != 8) {
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
                    ProfileActivity.H0(profileActivity, size);
                }
                profileActivity.f33761y5[c10].b(size, true);
            }
        }
    }

    @Override
    public final void G0() {
        FrameLayout frameLayout;
        ProfileActivity profileActivity = this.f39730g2;
        if (profileActivity.f33720t1 && (frameLayout = profileActivity.f33738v5[0]) != null && profileActivity.O != null) {
            frameLayout.setTranslationY((1.0f - profileActivity.O.getBottomButtonStoriesVisibility()) * AndroidUtilities.dp(72.0f));
        }
    }

    @Override
    public final boolean K0(TLRPC.ChatParticipant chatParticipant, boolean z10, View view) {
        return this.f39730g2.h(chatParticipant, z10, false, view);
    }

    @Override
    public final void M0(boolean z10) {
        int i10;
        ah.v vVar;
        int i11;
        int i12;
        int i13;
        ProfileActivity profileActivity = this.f39730g2;
        Activity parentActivity = profileActivity.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.n2) profileActivity).classGuid;
        AndroidUtilities.removeAdjustResize(parentActivity, i10);
        profileActivity.f33585a.B0();
        profileActivity.Z.setPivotY((profileActivity.Y.getMeasuredHeight() / 2.0f) + profileActivity.Y.getPivotY());
        profileActivity.Z.setPivotX(vVar.getMeasuredWidth() / 2.0f);
        AndroidUtilities.updateViewVisibilityAnimated(profileActivity.Z, !z10, 0.95f, true);
        org.telegram.ui.ActionBar.u0 u0Var = profileActivity.R0;
        int i14 = 8;
        if (!z10 && profileActivity.M0) {
            i11 = 4;
        } else {
            i11 = 8;
        }
        u0Var.setVisibility(i11);
        org.telegram.ui.ActionBar.u0 u0Var2 = profileActivity.S0;
        if (!z10 && profileActivity.N0) {
            i12 = 4;
        } else {
            i12 = 8;
        }
        u0Var2.setVisibility(i12);
        org.telegram.ui.ActionBar.u0 u0Var3 = profileActivity.T0;
        if (!z10 && profileActivity.O0) {
            i13 = 4;
        } else {
            i13 = 8;
        }
        u0Var3.setVisibility(i13);
        org.telegram.ui.ActionBar.u0 u0Var4 = profileActivity.U0;
        if (!z10) {
            i14 = 4;
        }
        u0Var4.setVisibility(i14);
        profileActivity.l5(false);
    }

    @Override
    public final void N0() {
        this.f39730g2.R();
    }

    @Override
    public final void O0(float f7) {
        G0();
        ProfileActivity profileActivity = this.f39730g2;
        nz0 nz0Var = profileActivity.O;
        if (nz0Var != null && profileActivity.f33720t1) {
            if (profileActivity.f33738v5[0] != null) {
                profileActivity.f33738v5[0].setTranslationX(nz0Var.g0(8, true));
            }
            if (profileActivity.f33738v5[1] != null) {
                profileActivity.f33738v5[1].setTranslationX(profileActivity.O.g0(9, false));
            }
            ProfileActivity.H0(profileActivity, profileActivity.f33669l6);
            profileActivity.U4();
        }
    }

    @Override
    public final void P(Canvas canvas, float f7, Rect rect, Paint paint) {
        ProfileActivity profileActivity = this.f39730g2;
        profileActivity.f33689o5.J(canvas, getY() + profileActivity.f33585a.getY() + f7, rect, paint, true);
    }

    @Override
    public final int X0(int i10) {
        this.f39730g2.getClass();
        return i10;
    }

    @Override
    public final void d1(boolean r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.nz0.d1(boolean):void");
    }

    @Override
    public final int getInitialTab() {
        return 8;
    }

    @Override
    public final boolean m0() {
        ProfileActivity profileActivity = this.f39730g2;
        if (profileActivity.f33652j1 == profileActivity.getUserConfig().getClientUserId() && !profileActivity.f33645i1) {
            return true;
        }
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AndroidUtilities.runOnUIThread(new qy0(this, 2));
    }

    @Override
    public final void p0() {
        lz0 lz0Var = this.f39730g2.f33689o5;
        if (lz0Var != null) {
            lz0Var.M();
        }
    }

    @Override
    public final boolean w0() {
        return this.f39730g2.f33720t1;
    }

    @Override
    public final boolean x0() {
        return this.f39730g2.f33720t1;
    }

    @Override
    public final void y1(boolean z10) {
        int i10;
        int i11;
        super.y1(z10);
        ProfileActivity profileActivity = this.f39730g2;
        boolean z11 = profileActivity.f33727u1;
        org.telegram.ui.Components.ks0 ks0Var = this.V;
        if (z11 && !profileActivity.f33750x1 && this.I0.e(14)) {
            if (!this.f39729f2 && (i11 = profileActivity.f33734v1) > 0 && ks0Var != null) {
                this.f39729f2 = true;
                ks0Var.M = i11;
                ks0Var.e();
            }
            profileActivity.f33750x1 = true;
            a1(14);
        } else if (profileActivity.f33727u1 && profileActivity.f33750x1 && !this.f39729f2 && (i10 = profileActivity.f33734v1) > 0 && ks0Var != null) {
            this.f39729f2 = true;
            ks0Var.M = i10;
            ks0Var.e();
        }
    }
}
