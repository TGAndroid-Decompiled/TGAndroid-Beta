package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.RectF;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ix0 extends org.telegram.ui.Components.zt0 {
    public boolean f38362w2;
    public final ProfileActivity f38363x2;

    public ix0(ProfileActivity profileActivity, Context context, long j10, org.telegram.ui.Components.rt0 rt0Var, int i10, ArrayList arrayList, TLRPC.ChatFull chatFull, TLRPC.UserFull userFull, int i11, int i12, ProfileActivity profileActivity2, ProfileActivity profileActivity3, org.telegram.ui.ActionBar.p6 p6Var, tg.b bVar) {
        super(context, j10, rt0Var, i10, arrayList, chatFull, userFull, i11, i12, profileActivity2, profileActivity3, 1, p6Var, bVar);
        this.f38363x2 = profileActivity;
    }

    @Override
    public final boolean D0() {
        return this.f38363x2.f33892r1;
    }

    @Override
    public final boolean E0() {
        return this.f38363x2.f33892r1;
    }

    @Override
    public final void K1(boolean z10) {
        int i10;
        int i11;
        super.K1(z10);
        ProfileActivity profileActivity = this.f38363x2;
        boolean z11 = profileActivity.f33900s1;
        org.telegram.ui.Components.vq0 vq0Var = this.f33170a0;
        if (z11 && !profileActivity.f33921v1 && this.K0.d(14)) {
            if (!this.f38362w2 && (i11 = profileActivity.f33907t1) > 0 && vq0Var != null) {
                this.f38362w2 = true;
                vq0Var.P = i11;
                vq0Var.e();
            }
            profileActivity.f33921v1 = true;
            f1(14);
        } else if (profileActivity.f33900s1 && profileActivity.f33921v1 && !this.f38362w2 && (i10 = profileActivity.f33907t1) > 0 && vq0Var != null) {
            this.f38362w2 = true;
            vq0Var.P = i10;
            vq0Var.e();
        }
    }

    @Override
    public final void L0(SparseArray sparseArray) {
        char c10;
        ProfileActivity profileActivity = this.f38363x2;
        if (profileActivity.f33892r1) {
            int size = sparseArray.size();
            int selectedTab = getSelectedTab();
            if (!org.telegram.ui.Components.zt0.F0(selectedTab) && selectedTab != 8) {
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
                    ProfileActivity.N0(profileActivity, size);
                }
                profileActivity.f33933w5[c10].c(size, true);
            }
        }
    }

    @Override
    public final void M0() {
        FrameLayout frameLayout;
        ix0 ix0Var;
        ProfileActivity profileActivity = this.f38363x2;
        if (profileActivity.f33892r1 && (frameLayout = profileActivity.f33911t5[0]) != null && (ix0Var = profileActivity.N) != null) {
            ProfileActivity.X4(frameLayout, 1.0f - ix0Var.getBottomButtonStoriesVisibility());
        }
    }

    @Override
    public final boolean Q0(TLRPC.ChatParticipant chatParticipant, boolean z10, View view) {
        return this.f38363x2.h(chatParticipant, z10, false, view);
    }

    @Override
    public final void S0(boolean z10) {
        int i10;
        ProfileActivity profileActivity = this.f38363x2;
        Activity parentActivity = profileActivity.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.k2) profileActivity).classGuid;
        org.telegram.messenger.i0.B2(parentActivity, i10);
        profileActivity.f33772a.C0();
        profileActivity.Y.setPivotY((profileActivity.X.getMeasuredHeight() / 2.0f) + profileActivity.X.getPivotY());
        fg.i iVar = profileActivity.Y;
        iVar.setPivotX(iVar.getMeasuredWidth() / 2.0f);
        org.telegram.messenger.i0.Y3(profileActivity.Y, !z10, 0.95f, true, true);
        profileActivity.K5(false);
    }

    @Override
    public final void T0() {
        this.f38363x2.V();
    }

    @Override
    public final void U0(float f7) {
        M0();
        ProfileActivity profileActivity = this.f38363x2;
        ix0 ix0Var = profileActivity.N;
        if (ix0Var != null && profileActivity.f33892r1) {
            if (profileActivity.f33911t5[0] != null) {
                profileActivity.f33911t5[0].setTranslationX(ix0Var.o0(8, true));
            }
            if (profileActivity.f33911t5[1] != null) {
                profileActivity.f33911t5[1].setTranslationX(profileActivity.N.o0(9, false));
            }
            ProfileActivity.N0(profileActivity, profileActivity.D6);
            profileActivity.o5();
        }
    }

    @Override
    public final int c1(int i10) {
        RectF rectF = ProfileActivity.R6;
        this.f38363x2.getClass();
        return i10;
    }

    @Override
    public final int getInitialTab() {
        return 8;
    }

    @Override
    public final void l1(boolean r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ix0.l1(boolean):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.i0.g3(new wv0(this, 5));
    }

    @Override
    public final boolean v0() {
        ProfileActivity profileActivity = this.f38363x2;
        if (profileActivity.f33825h1 == profileActivity.getUserConfig().e() && !profileActivity.f33818g1) {
            return true;
        }
        return false;
    }
}
