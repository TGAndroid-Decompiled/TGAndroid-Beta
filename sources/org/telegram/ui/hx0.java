package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
public final class hx0 implements vh.f8 {
    public final ProfileActivity f38046a;

    public hx0(ProfileActivity profileActivity) {
        this.f38046a = profileActivity;
    }

    @Override
    public final vh.j8 c(long j10) {
        float f7;
        ProfileActivity profileActivity = this.f38046a;
        if (j10 == profileActivity.a()) {
            profileActivity.f33802e0.setRoundRadiusForExpand((int) org.telegram.messenger.i0.T1(profileActivity.p4(), 0.0f, profileActivity.f33840j2));
            jw0 jw0Var = profileActivity.f33802e0;
            boolean c02 = org.telegram.messenger.w3.c0(profileActivity.D2);
            if (jw0Var != null && jw0Var.getRootView() != null) {
                float scaleX = ((View) jw0Var.getParent()).getScaleX();
                float f10 = jw0Var.getImageReceiver().M0 * scaleX;
                if (c02) {
                    f7 = 0.32f * f10;
                } else {
                    f7 = f10;
                }
                vh.h8 h8Var = new vh.h8(jw0Var, 0);
                int[] iArr = new int[2];
                float[] fArr = new float[2];
                jw0Var.getRootView().getLocationOnScreen(iArr);
                org.telegram.messenger.i0.r1(jw0Var, (ViewGroup) jw0Var.getRootView(), fArr);
                float f11 = (jw0Var.getImageReceiver().K0 * scaleX) + iArr[0] + fArr[0];
                float f12 = (jw0Var.getImageReceiver().L0 * scaleX) + iArr[1] + fArr[1];
                h8Var.f51327c.set(f11, f12, f11 + f10, f10 + f12);
                h8Var.e = jw0Var.getImageReceiver();
                h8Var.f51326b = f7;
                return h8Var;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void d(long j10, bi.e eVar) {
        ProfileActivity profileActivity = this.f38046a;
        profileActivity.f33802e0.setHasStories(profileActivity.w4());
        if (j10 == profileActivity.a() && profileActivity.f33866n2 && profileActivity.f33840j2 > 0.0f) {
            profileActivity.f33787c.h1(0, profileActivity.i4() - profileActivity.f33772a.getPaddingTop());
            profileActivity.f33772a.post(new oa0(profileActivity, 16));
        }
        org.telegram.messenger.i0.h3(eVar, 30L);
    }
}
