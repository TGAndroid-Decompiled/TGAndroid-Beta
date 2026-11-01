package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
public final class gx0 implements vh.f8 {
    public final ProfileActivity f37579a;

    public gx0(ProfileActivity profileActivity) {
        this.f37579a = profileActivity;
    }

    @Override
    public final vh.j8 c(long j10) {
        float f7;
        ProfileActivity profileActivity = this.f37579a;
        if (j10 == profileActivity.a()) {
            profileActivity.f33809e0.setRoundRadiusForExpand((int) org.telegram.messenger.i0.T1(profileActivity.q4(), 0.0f, profileActivity.f33847j2));
            iw0 iw0Var = profileActivity.f33809e0;
            boolean c02 = org.telegram.messenger.w3.c0(profileActivity.D2);
            if (iw0Var != null && iw0Var.getRootView() != null) {
                float scaleX = ((View) iw0Var.getParent()).getScaleX();
                float f10 = iw0Var.getImageReceiver().M0 * scaleX;
                if (c02) {
                    f7 = 0.32f * f10;
                } else {
                    f7 = f10;
                }
                vh.h8 h8Var = new vh.h8(iw0Var, 0);
                int[] iArr = new int[2];
                float[] fArr = new float[2];
                iw0Var.getRootView().getLocationOnScreen(iArr);
                org.telegram.messenger.i0.r1(iw0Var, (ViewGroup) iw0Var.getRootView(), fArr);
                float f11 = (iw0Var.getImageReceiver().K0 * scaleX) + iArr[0] + fArr[0];
                float f12 = (iw0Var.getImageReceiver().L0 * scaleX) + iArr[1] + fArr[1];
                h8Var.f51342c.set(f11, f12, f11 + f10, f10 + f12);
                h8Var.e = iw0Var.getImageReceiver();
                h8Var.f51341b = f7;
                return h8Var;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void d(long j10, bi.e eVar) {
        ProfileActivity profileActivity = this.f37579a;
        profileActivity.f33809e0.setHasStories(profileActivity.x4());
        if (j10 == profileActivity.a() && profileActivity.f33873n2 && profileActivity.f33847j2 > 0.0f) {
            profileActivity.f33794c.h1(0, profileActivity.j4() - profileActivity.f33779a.getPaddingTop());
            profileActivity.f33779a.post(new na0(profileActivity, 16));
        }
        org.telegram.messenger.i0.h3(eVar, 30L);
    }
}
