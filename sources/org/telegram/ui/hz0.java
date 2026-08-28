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
public final class hz0 extends org.telegram.ui.Components.eu0 {
    public boolean f38962b2;
    public final ProfileActivity f38963c2;

    public hz0(ProfileActivity profileActivity, Context context, long j10, org.telegram.ui.Components.wt0 wt0Var, int i9, ArrayList arrayList, TLRPC.ChatFull chatFull, TLRPC.UserFull userFull, int i10, int i11, ProfileActivity profileActivity2, ProfileActivity profileActivity3, org.telegram.ui.ActionBar.b6 b6Var, ig.a aVar) {
        super(context, j10, wt0Var, i9, arrayList, chatFull, userFull, i10, i11, profileActivity2, profileActivity3, 1, b6Var, aVar);
        this.f38963c2 = profileActivity;
    }

    @Override
    public final void D0(SparseArray sparseArray) {
        char c10;
        ProfileActivity profileActivity = this.f38963c2;
        if (profileActivity.f36019o1) {
            int size = sparseArray.size();
            int selectedTab = getSelectedTab();
            if (!org.telegram.ui.Components.eu0.w0(selectedTab) && selectedTab != 8) {
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
                    ProfileActivity.F0(profileActivity, size);
                }
                profileActivity.f36051s5[c10].c(size, true);
            }
        }
    }

    @Override
    public final void E0() {
        FrameLayout frameLayout;
        ProfileActivity profileActivity = this.f38963c2;
        if (profileActivity.f36019o1 && (frameLayout = profileActivity.f36029p5[0]) != null && profileActivity.K != null) {
            frameLayout.setTranslationY((1.0f - profileActivity.K.getBottomButtonStoriesVisibility()) * AndroidUtilities.dp(72.0f));
        }
    }

    @Override
    public final boolean I0(TLRPC.ChatParticipant chatParticipant, boolean z10, View view) {
        return this.f38963c2.h(chatParticipant, z10, false, view);
    }

    @Override
    public final void K0(boolean z10) {
        int i9;
        int i10;
        int i11;
        int i12;
        ProfileActivity profileActivity = this.f38963c2;
        Activity parentActivity = profileActivity.getParentActivity();
        i9 = ((org.telegram.ui.ActionBar.o2) profileActivity).classGuid;
        AndroidUtilities.removeAdjustResize(parentActivity, i9);
        profileActivity.f35918a.B0();
        profileActivity.V.setPivotY((profileActivity.U.getMeasuredHeight() / 2.0f) + profileActivity.U.getPivotY());
        fh.v vVar = profileActivity.V;
        vVar.setPivotX(vVar.getMeasuredWidth() / 2.0f);
        AndroidUtilities.updateViewVisibilityAnimated(profileActivity.V, !z10, 0.95f, true);
        org.telegram.ui.ActionBar.w0 w0Var = profileActivity.M0;
        int i13 = 8;
        if (!z10 && profileActivity.H0) {
            i10 = 4;
        } else {
            i10 = 8;
        }
        w0Var.setVisibility(i10);
        org.telegram.ui.ActionBar.w0 w0Var2 = profileActivity.N0;
        if (!z10 && profileActivity.I0) {
            i11 = 4;
        } else {
            i11 = 8;
        }
        w0Var2.setVisibility(i11);
        org.telegram.ui.ActionBar.w0 w0Var3 = profileActivity.O0;
        if (!z10 && profileActivity.J0) {
            i12 = 4;
        } else {
            i12 = 8;
        }
        w0Var3.setVisibility(i12);
        org.telegram.ui.ActionBar.w0 w0Var4 = profileActivity.P0;
        if (!z10) {
            i13 = 4;
        }
        w0Var4.setVisibility(i13);
        profileActivity.l5(false);
    }

    @Override
    public final void L0() {
        this.f38963c2.Q();
    }

    @Override
    public final void M0(float f10) {
        E0();
        ProfileActivity profileActivity = this.f38963c2;
        hz0 hz0Var = profileActivity.K;
        if (hz0Var != null && profileActivity.f36019o1) {
            if (profileActivity.f36029p5[0] != null) {
                profileActivity.f36029p5[0].setTranslationX(hz0Var.f0(8, true));
            }
            if (profileActivity.f36029p5[1] != null) {
                profileActivity.f36029p5[1].setTranslationX(profileActivity.K.f0(9, false));
            }
            ProfileActivity.F0(profileActivity, profileActivity.f35946d6);
            profileActivity.U4();
        }
    }

    @Override
    public final void P(Canvas canvas, float f10, Rect rect, Paint paint) {
        ProfileActivity profileActivity = this.f38963c2;
        profileActivity.f35982i5.J(canvas, getY() + profileActivity.f35918a.getY() + f10, rect, paint, true);
    }

    @Override
    public final int V0(int i9) {
        this.f38963c2.getClass();
        return i9;
    }

    @Override
    public final void b1(boolean r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.hz0.b1(boolean):void");
    }

    @Override
    public final int getInitialTab() {
        return 8;
    }

    @Override
    public final boolean l0() {
        ProfileActivity profileActivity = this.f38963c2;
        if (profileActivity.f35949e1 == profileActivity.getUserConfig().getClientUserId() && !profileActivity.f35941d1) {
            return true;
        }
        return false;
    }

    @Override
    public final void o0() {
        fz0 fz0Var = this.f38963c2.f35982i5;
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
        return this.f38963c2.f36019o1;
    }

    @Override
    public final boolean v0() {
        return this.f38963c2.f36019o1;
    }

    @Override
    public final void v1(boolean z10) {
        int i9;
        int i10;
        super.v1(z10);
        ProfileActivity profileActivity = this.f38963c2;
        boolean z11 = profileActivity.f36025p1;
        org.telegram.ui.Components.vq0 vq0Var = this.R;
        if (z11 && !profileActivity.f36047s1 && this.E0.e(14)) {
            if (!this.f38962b2 && (i10 = profileActivity.f36031q1) > 0 && vq0Var != null) {
                this.f38962b2 = true;
                vq0Var.I = i10;
                vq0Var.e();
            }
            profileActivity.f36047s1 = true;
            Y0(14);
        } else if (profileActivity.f36025p1 && profileActivity.f36047s1 && !this.f38962b2 && (i9 = profileActivity.f36031q1) > 0 && vq0Var != null) {
            this.f38962b2 = true;
            vq0Var.I = i9;
            vq0Var.e();
        }
    }
}
