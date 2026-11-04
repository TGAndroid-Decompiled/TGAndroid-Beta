package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
public final class lv0 implements gi.ma {
    public final ProfileActivity f47447a;

    public lv0(ProfileActivity profileActivity) {
        this.f47447a = profileActivity;
    }

    @Override
    public final void a(long j10, ci.e3 e3Var) {
        ProfileActivity profileActivity = this.f47447a;
        profileActivity.f41758f0.setHasStories(profileActivity.x4());
        if (j10 == profileActivity.a() && profileActivity.f41819o2 && profileActivity.f41793k2 > 0.0f) {
            profileActivity.f41735c.h1(0, profileActivity.j4() - profileActivity.f41719a.getPaddingTop());
            profileActivity.f41719a.post(new g90(profileActivity, 16));
        }
        org.telegram.messenger.g0.i3(e3Var, 30L);
    }

    @Override
    public final gi.qa c(long j10) {
        float f10;
        ProfileActivity profileActivity = this.f47447a;
        if (j10 == profileActivity.a()) {
            profileActivity.f41758f0.setRoundRadiusForExpand((int) org.telegram.messenger.g0.T1(profileActivity.q4(), 0.0f, profileActivity.f41793k2));
            qu0 qu0Var = profileActivity.f41758f0;
            boolean c02 = org.telegram.messenger.t3.c0(profileActivity.E2);
            if (qu0Var != null && qu0Var.getRootView() != null) {
                float scaleX = ((View) qu0Var.getParent()).getScaleX();
                float f11 = qu0Var.getImageReceiver().N0 * scaleX;
                if (c02) {
                    f10 = 0.32f * f11;
                } else {
                    f10 = f11;
                }
                gi.oa oaVar = new gi.oa(qu0Var, 0);
                int[] iArr = new int[2];
                float[] fArr = new float[2];
                qu0Var.getRootView().getLocationOnScreen(iArr);
                org.telegram.messenger.g0.r1(qu0Var, (ViewGroup) qu0Var.getRootView(), fArr);
                float f12 = (qu0Var.getImageReceiver().L0 * scaleX) + iArr[0] + fArr[0];
                float f13 = (qu0Var.getImageReceiver().M0 * scaleX) + iArr[1] + fArr[1];
                oaVar.f13454c.set(f12, f13, f12 + f11, f11 + f13);
                oaVar.f13455e = qu0Var.getImageReceiver();
                oaVar.f13453b = f10;
                return oaVar;
            }
            return null;
        }
        return null;
    }
}
