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
public final class hz0 extends org.telegram.ui.Components.qu0 {
    public boolean f39075b2;
    public final ProfileActivity f39076c2;

    public hz0(ProfileActivity profileActivity, Context context, long j10, org.telegram.ui.Components.iu0 iu0Var, int i10, ArrayList arrayList, TLRPC.ChatFull chatFull, TLRPC.UserFull userFull, int i11, int i12, ProfileActivity profileActivity2, ProfileActivity profileActivity3, org.telegram.ui.ActionBar.c6 c6Var, lg.a aVar) {
        super(context, j10, iu0Var, i10, arrayList, chatFull, userFull, i11, i12, profileActivity2, profileActivity3, 1, c6Var, aVar);
        this.f39076c2 = profileActivity;
    }

    @Override
    public final void D0(SparseArray sparseArray) {
        char c3;
        ProfileActivity profileActivity = this.f39076c2;
        if (profileActivity.f36084o1) {
            int size = sparseArray.size();
            int selectedTab = getSelectedTab();
            if (!org.telegram.ui.Components.qu0.w0(selectedTab) && selectedTab != 8) {
                if (selectedTab == 9) {
                    c3 = 1;
                } else {
                    c3 = 65535;
                }
            } else {
                c3 = 0;
            }
            if (c3 >= 0) {
                if (c3 == 0) {
                    ProfileActivity.G0(profileActivity, size);
                }
                profileActivity.f36116s5[c3].c(size, true);
            }
        }
    }

    @Override
    public final void E0() {
        FrameLayout frameLayout;
        ProfileActivity profileActivity = this.f39076c2;
        if (profileActivity.f36084o1 && (frameLayout = profileActivity.f36095p5[0]) != null && profileActivity.K != null) {
            frameLayout.setTranslationY((1.0f - profileActivity.K.getBottomButtonStoriesVisibility()) * AndroidUtilities.dp(72.0f));
        }
    }

    @Override
    public final boolean I0(TLRPC.ChatParticipant chatParticipant, boolean z10, View view) {
        return this.f39076c2.h(chatParticipant, z10, false, view);
    }

    @Override
    public final void K0(boolean z10) {
        int i10;
        int i11;
        int i12;
        int i13;
        ProfileActivity profileActivity = this.f39076c2;
        Activity parentActivity = profileActivity.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.o2) profileActivity).classGuid;
        AndroidUtilities.removeAdjustResize(parentActivity, i10);
        profileActivity.f35984a.B0();
        profileActivity.V.setPivotY((profileActivity.U.getMeasuredHeight() / 2.0f) + profileActivity.U.getPivotY());
        bg.d1 d1Var = profileActivity.V;
        d1Var.setPivotX(d1Var.getMeasuredWidth() / 2.0f);
        AndroidUtilities.updateViewVisibilityAnimated(profileActivity.V, !z10, 0.95f, true);
        org.telegram.ui.ActionBar.w0 w0Var = profileActivity.M0;
        int i14 = 8;
        if (!z10 && profileActivity.H0) {
            i11 = 4;
        } else {
            i11 = 8;
        }
        w0Var.setVisibility(i11);
        org.telegram.ui.ActionBar.w0 w0Var2 = profileActivity.N0;
        if (!z10 && profileActivity.I0) {
            i12 = 4;
        } else {
            i12 = 8;
        }
        w0Var2.setVisibility(i12);
        org.telegram.ui.ActionBar.w0 w0Var3 = profileActivity.O0;
        if (!z10 && profileActivity.J0) {
            i13 = 4;
        } else {
            i13 = 8;
        }
        w0Var3.setVisibility(i13);
        org.telegram.ui.ActionBar.w0 w0Var4 = profileActivity.P0;
        if (!z10) {
            i14 = 4;
        }
        w0Var4.setVisibility(i14);
        profileActivity.l5(false);
    }

    @Override
    public final void L0() {
        this.f39076c2.R();
    }

    @Override
    public final void M0(float f9) {
        E0();
        ProfileActivity profileActivity = this.f39076c2;
        hz0 hz0Var = profileActivity.K;
        if (hz0Var != null && profileActivity.f36084o1) {
            if (profileActivity.f36095p5[0] != null) {
                profileActivity.f36095p5[0].setTranslationX(hz0Var.f0(8, true));
            }
            if (profileActivity.f36095p5[1] != null) {
                profileActivity.f36095p5[1].setTranslationX(profileActivity.K.f0(9, false));
            }
            ProfileActivity.G0(profileActivity, profileActivity.f36011d6);
            profileActivity.U4();
        }
    }

    @Override
    public final void P(Canvas canvas, float f9, Rect rect, Paint paint) {
        ProfileActivity profileActivity = this.f39076c2;
        profileActivity.f36047i5.J(canvas, getY() + profileActivity.f35984a.getY() + f9, rect, paint, true);
    }

    @Override
    public final int V0(int i10) {
        this.f39076c2.getClass();
        return i10;
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
        ProfileActivity profileActivity = this.f39076c2;
        if (profileActivity.f36014e1 == profileActivity.getUserConfig().getClientUserId() && !profileActivity.f36006d1) {
            return true;
        }
        return false;
    }

    @Override
    public final void o0() {
        fz0 fz0Var = this.f39076c2.f36047i5;
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
        return this.f39076c2.f36084o1;
    }

    @Override
    public final boolean v0() {
        return this.f39076c2.f36084o1;
    }

    @Override
    public final void v1(boolean z10) {
        int i10;
        int i11;
        super.v1(z10);
        ProfileActivity profileActivity = this.f39076c2;
        boolean z11 = profileActivity.f36091p1;
        org.telegram.ui.Components.gr0 gr0Var = this.R;
        if (z11 && !profileActivity.f36112s1 && this.E0.d(14)) {
            if (!this.f39075b2 && (i11 = profileActivity.f36098q1) > 0 && gr0Var != null) {
                this.f39075b2 = true;
                gr0Var.I = i11;
                gr0Var.e();
            }
            profileActivity.f36112s1 = true;
            Y0(14);
        } else if (profileActivity.f36091p1 && profileActivity.f36112s1 && !this.f39075b2 && (i10 = profileActivity.f36098q1) > 0 && gr0Var != null) {
            this.f39075b2 = true;
            gr0Var.I = i10;
            gr0Var.e();
        }
    }
}
