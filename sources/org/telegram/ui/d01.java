package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
public final class d01 implements ci.cc {
    public final ProfileActivity f32465a;

    public d01(ProfileActivity profileActivity) {
        this.f32465a = profileActivity;
    }

    @Override
    public final ci.gc a(long j3) {
        float f7;
        ProfileActivity profileActivity = this.f32465a;
        if (j3 == profileActivity.a()) {
            profileActivity.f31239e0.setRoundRadiusForExpand((int) AndroidUtilities.lerp(profileActivity.c4(), 0.0f, profileActivity.f31283k2));
            hz0 hz0Var = profileActivity.f31239e0;
            boolean isForum = ChatObject.isForum(profileActivity.E2);
            if (hz0Var != null && hz0Var.getRootView() != null) {
                float scaleX = ((View) hz0Var.getParent()).getScaleX();
                float imageWidth = hz0Var.getImageReceiver().getImageWidth() * scaleX;
                if (isForum) {
                    f7 = 0.32f * imageWidth;
                } else {
                    f7 = imageWidth;
                }
                ci.ec ecVar = new ci.ec(hz0Var, 0);
                int[] iArr = new int[2];
                float[] fArr = new float[2];
                hz0Var.getRootView().getLocationOnScreen(iArr);
                AndroidUtilities.getViewPositionInParent(hz0Var, (ViewGroup) hz0Var.getRootView(), fArr);
                float imageX = (hz0Var.getImageReceiver().getImageX() * scaleX) + iArr[0] + fArr[0];
                float imageY = (hz0Var.getImageReceiver().getImageY() * scaleX) + iArr[1] + fArr[1];
                ecVar.f4737c.set(imageX, imageY, imageX + imageWidth, imageWidth + imageY);
                ecVar.e = hz0Var.getImageReceiver();
                ecVar.f4736b = f7;
                return ecVar;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void d(long j3, ai.j jVar) {
        ProfileActivity profileActivity = this.f32465a;
        profileActivity.f31239e0.setHasStories(profileActivity.j4());
        if (j3 == profileActivity.a() && profileActivity.f31309o2 && profileActivity.f31283k2 > 0.0f) {
            profileActivity.f31224c.h1(0, profileActivity.T3() - profileActivity.f31209a.getPaddingTop());
            profileActivity.f31209a.post(new tb0(profileActivity, 14));
        }
        AndroidUtilities.runOnUIThread(jVar, 30L);
    }
}
