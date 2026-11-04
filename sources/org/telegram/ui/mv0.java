package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.RectF;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class mv0 extends org.telegram.ui.Components.ws0 {
    public boolean f47792x2;
    public final ProfileActivity f47793y2;

    public mv0(ProfileActivity profileActivity, Context context, long j10, org.telegram.ui.Components.os0 os0Var, int i3, ArrayList arrayList, TLRPC.ChatFull chatFull, TLRPC.UserFull userFull, int i10, int i11, ProfileActivity profileActivity2, ProfileActivity profileActivity3, org.telegram.ui.ActionBar.e6 e6Var, eh.c cVar) {
        super(context, j10, os0Var, i3, arrayList, chatFull, userFull, i10, i11, profileActivity2, profileActivity3, 1, e6Var, cVar);
        this.f47793y2 = profileActivity;
    }

    @Override
    public final boolean G0() {
        return this.f47793y2.f41847s1;
    }

    @Override
    public final boolean H0() {
        return this.f47793y2.f41847s1;
    }

    @Override
    public final void N1(boolean z10) {
        int i3;
        int i10;
        super.N1(z10);
        ProfileActivity profileActivity = this.f47793y2;
        boolean z11 = profileActivity.f41853t1;
        org.telegram.ui.Components.vp0 vp0Var = this.f40072b0;
        if (z11 && !profileActivity.f41875w1 && this.L0.d(14)) {
            if (!this.f47792x2 && (i10 = profileActivity.f41860u1) > 0 && vp0Var != null) {
                this.f47792x2 = true;
                vp0Var.Q = i10;
                vp0Var.e();
            }
            profileActivity.f41875w1 = true;
            i1(14);
        } else if (profileActivity.f41853t1 && profileActivity.f41875w1 && !this.f47792x2 && (i3 = profileActivity.f41860u1) > 0 && vp0Var != null) {
            this.f47792x2 = true;
            vp0Var.Q = i3;
            vp0Var.e();
        }
    }

    @Override
    public final void O0(SparseArray sparseArray) {
        char c2;
        ProfileActivity profileActivity = this.f47793y2;
        if (profileActivity.f41847s1) {
            int size = sparseArray.size();
            int selectedTab = getSelectedTab();
            if (!org.telegram.ui.Components.ws0.I0(selectedTab) && selectedTab != 8) {
                if (selectedTab == 9) {
                    c2 = 1;
                } else {
                    c2 = 65535;
                }
            } else {
                c2 = 0;
            }
            if (c2 >= 0) {
                if (c2 == 0) {
                    ProfileActivity.O0(profileActivity, size);
                }
                profileActivity.f41887x5[c2].c(size, true);
            }
        }
    }

    @Override
    public final void P0() {
        FrameLayout frameLayout;
        mv0 mv0Var;
        ProfileActivity profileActivity = this.f47793y2;
        if (profileActivity.f41847s1 && (frameLayout = profileActivity.f41864u5[0]) != null && (mv0Var = profileActivity.O) != null) {
            ProfileActivity.Y4(frameLayout, 1.0f - mv0Var.getBottomButtonStoriesVisibility());
        }
    }

    @Override
    public final boolean T0(TLRPC.ChatParticipant chatParticipant, boolean z10, View view) {
        return this.f47793y2.h(chatParticipant, z10, false, view);
    }

    @Override
    public final void V0(boolean z10) {
        int i3;
        ProfileActivity profileActivity = this.f47793y2;
        Activity parentActivity = profileActivity.getParentActivity();
        i3 = ((org.telegram.ui.ActionBar.d2) profileActivity).classGuid;
        org.telegram.messenger.g0.B2(parentActivity, i3);
        profileActivity.f41719a.C0();
        profileActivity.Z.setPivotY((profileActivity.Y.getMeasuredHeight() / 2.0f) + profileActivity.Y.getPivotY());
        ai.c0 c0Var = profileActivity.Z;
        c0Var.setPivotX(c0Var.getMeasuredWidth() / 2.0f);
        org.telegram.messenger.g0.Z3(profileActivity.Z, !z10, 0.95f, true, true);
        profileActivity.L5(false);
    }

    @Override
    public final void W0() {
        this.f47793y2.V();
    }

    @Override
    public final void X0(float f10) {
        P0();
        ProfileActivity profileActivity = this.f47793y2;
        mv0 mv0Var = profileActivity.O;
        if (mv0Var != null && profileActivity.f41847s1) {
            if (profileActivity.f41864u5[0] != null) {
                profileActivity.f41864u5[0].setTranslationX(mv0Var.q0(8, true));
            }
            if (profileActivity.f41864u5[1] != null) {
                profileActivity.f41864u5[1].setTranslationX(profileActivity.O.q0(9, false));
            }
            ProfileActivity.O0(profileActivity, profileActivity.F6);
            profileActivity.p5();
        }
    }

    @Override
    public final int f1(int i3) {
        RectF rectF = ProfileActivity.T6;
        this.f47793y2.getClass();
        return i3;
    }

    @Override
    public final int getInitialTab() {
        return 8;
    }

    @Override
    public final void o1(boolean r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.mv0.o1(boolean):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.g0.h3(new pu0(this, 2));
    }

    @Override
    public final boolean x0() {
        ProfileActivity profileActivity = this.f47793y2;
        if (profileActivity.f41780i1 == profileActivity.getUserConfig().e() && !profileActivity.f41773h1) {
            return true;
        }
        return false;
    }
}
