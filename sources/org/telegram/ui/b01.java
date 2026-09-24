package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
public final class b01 implements ci.cc {
    public final ProfileActivity f32255a;

    public b01(ProfileActivity profileActivity) {
        this.f32255a = profileActivity;
    }

    @Override
    public final ci.gc a(long j3) {
        float f7;
        ProfileActivity profileActivity = this.f32255a;
        if (j3 == profileActivity.a()) {
            profileActivity.f31540e0.setRoundRadiusForExpand((int) AndroidUtilities.lerp(profileActivity.c4(), 0.0f, profileActivity.f31584k2));
            fz0 fz0Var = profileActivity.f31540e0;
            boolean isForum = ChatObject.isForum(profileActivity.E2);
            if (fz0Var != null && fz0Var.getRootView() != null) {
                float scaleX = ((View) fz0Var.getParent()).getScaleX();
                float imageWidth = fz0Var.getImageReceiver().getImageWidth() * scaleX;
                if (isForum) {
                    f7 = 0.32f * imageWidth;
                } else {
                    f7 = imageWidth;
                }
                ci.ec ecVar = new ci.ec(fz0Var, 0);
                int[] iArr = new int[2];
                float[] fArr = new float[2];
                fz0Var.getRootView().getLocationOnScreen(iArr);
                AndroidUtilities.getViewPositionInParent(fz0Var, (ViewGroup) fz0Var.getRootView(), fArr);
                float imageX = (fz0Var.getImageReceiver().getImageX() * scaleX) + iArr[0] + fArr[0];
                float imageY = (fz0Var.getImageReceiver().getImageY() * scaleX) + iArr[1] + fArr[1];
                ecVar.f4737c.set(imageX, imageY, imageX + imageWidth, imageWidth + imageY);
                ecVar.e = fz0Var.getImageReceiver();
                ecVar.f4736b = f7;
                return ecVar;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void b(long j3, ai.j jVar) {
        ProfileActivity profileActivity = this.f32255a;
        profileActivity.f31540e0.setHasStories(profileActivity.j4());
        if (j3 == profileActivity.a() && profileActivity.f31610o2 && profileActivity.f31584k2 > 0.0f) {
            profileActivity.f31525c.h1(0, profileActivity.T3() - profileActivity.f31510a.getPaddingTop());
            profileActivity.f31510a.post(new sb0(profileActivity, 14));
        }
        AndroidUtilities.runOnUIThread(jVar, 30L);
    }
}
