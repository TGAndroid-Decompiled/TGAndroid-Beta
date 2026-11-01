package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.RectF;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class hx0 extends org.telegram.ui.Components.au0 {
    public boolean f37880w2;
    public final ProfileActivity f37881x2;

    public hx0(ProfileActivity profileActivity, Context context, long j10, org.telegram.ui.Components.st0 st0Var, int i10, ArrayList arrayList, TLRPC.ChatFull chatFull, TLRPC.UserFull userFull, int i11, int i12, ProfileActivity profileActivity2, ProfileActivity profileActivity3, org.telegram.ui.ActionBar.p6 p6Var, tg.b bVar) {
        super(context, j10, st0Var, i10, arrayList, chatFull, userFull, i11, i12, profileActivity2, profileActivity3, 1, p6Var, bVar);
        this.f37881x2 = profileActivity;
    }

    @Override
    public final boolean E0() {
        return this.f37881x2.f33899r1;
    }

    @Override
    public final boolean F0() {
        return this.f37881x2.f33899r1;
    }

    @Override
    public final void L1(boolean z10) {
        int i10;
        int i11;
        super.L1(z10);
        ProfileActivity profileActivity = this.f37881x2;
        boolean z11 = profileActivity.f33907s1;
        org.telegram.ui.Components.wq0 wq0Var = this.f24498a0;
        if (z11 && !profileActivity.f33928v1 && this.K0.d(14)) {
            if (!this.f37880w2 && (i11 = profileActivity.f33914t1) > 0 && wq0Var != null) {
                this.f37880w2 = true;
                wq0Var.P = i11;
                wq0Var.e();
            }
            profileActivity.f33928v1 = true;
            g1(14);
        } else if (profileActivity.f33907s1 && profileActivity.f33928v1 && !this.f37880w2 && (i10 = profileActivity.f33914t1) > 0 && wq0Var != null) {
            this.f37880w2 = true;
            wq0Var.P = i10;
            wq0Var.e();
        }
    }

    @Override
    public final void M0(SparseArray sparseArray) {
        char c10;
        ProfileActivity profileActivity = this.f37881x2;
        if (profileActivity.f33899r1) {
            int size = sparseArray.size();
            int selectedTab = getSelectedTab();
            if (!org.telegram.ui.Components.au0.G0(selectedTab) && selectedTab != 8) {
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
                    ProfileActivity.O0(profileActivity, size);
                }
                profileActivity.f33940w5[c10].c(size, true);
            }
        }
    }

    @Override
    public final void N0() {
        FrameLayout frameLayout;
        hx0 hx0Var;
        ProfileActivity profileActivity = this.f37881x2;
        if (profileActivity.f33899r1 && (frameLayout = profileActivity.f33918t5[0]) != null && (hx0Var = profileActivity.N) != null) {
            ProfileActivity.Y4(frameLayout, 1.0f - hx0Var.getBottomButtonStoriesVisibility());
        }
    }

    @Override
    public final boolean R0(TLRPC.ChatParticipant chatParticipant, boolean z10, View view) {
        return this.f37881x2.h(chatParticipant, z10, false, view);
    }

    @Override
    public final void T0(boolean z10) {
        int i10;
        ProfileActivity profileActivity = this.f37881x2;
        Activity parentActivity = profileActivity.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.k2) profileActivity).classGuid;
        org.telegram.messenger.i0.B2(parentActivity, i10);
        profileActivity.f33779a.C0();
        profileActivity.Y.setPivotY((profileActivity.X.getMeasuredHeight() / 2.0f) + profileActivity.X.getPivotY());
        fg.i iVar = profileActivity.Y;
        iVar.setPivotX(iVar.getMeasuredWidth() / 2.0f);
        org.telegram.messenger.i0.Y3(profileActivity.Y, !z10, 0.95f, true, true);
        profileActivity.L5(false);
    }

    @Override
    public final void U0() {
        this.f37881x2.W();
    }

    @Override
    public final void V0(float f7) {
        N0();
        ProfileActivity profileActivity = this.f37881x2;
        hx0 hx0Var = profileActivity.N;
        if (hx0Var != null && profileActivity.f33899r1) {
            if (profileActivity.f33918t5[0] != null) {
                profileActivity.f33918t5[0].setTranslationX(hx0Var.p0(8, true));
            }
            if (profileActivity.f33918t5[1] != null) {
                profileActivity.f33918t5[1].setTranslationX(profileActivity.N.p0(9, false));
            }
            ProfileActivity.O0(profileActivity, profileActivity.E6);
            profileActivity.p5();
        }
    }

    @Override
    public final int d1(int i10) {
        RectF rectF = ProfileActivity.S6;
        this.f37881x2.getClass();
        return i10;
    }

    @Override
    public final int getInitialTab() {
        return 8;
    }

    @Override
    public final void m1(boolean r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.hx0.m1(boolean):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.i0.g3(new vv0(this, 5));
    }

    @Override
    public final boolean w0() {
        ProfileActivity profileActivity = this.f37881x2;
        if (profileActivity.f33832h1 == profileActivity.getUserConfig().e() && !profileActivity.f33825g1) {
            return true;
        }
        return false;
    }
}
