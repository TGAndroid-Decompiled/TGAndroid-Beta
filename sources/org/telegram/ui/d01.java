package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
public final class d01 implements ci.bc {
    public final ProfileActivity f32832a;

    public d01(ProfileActivity profileActivity) {
        this.f32832a = profileActivity;
    }

    @Override
    public final ci.fc a(long j3) {
        float f7;
        ProfileActivity profileActivity = this.f32832a;
        if (j3 == profileActivity.a()) {
            profileActivity.f31556e0.setRoundRadiusForExpand((int) AndroidUtilities.lerp(profileActivity.c4(), 0.0f, profileActivity.f31600k2));
            hz0 hz0Var = profileActivity.f31556e0;
            boolean isForum = ChatObject.isForum(profileActivity.E2);
            if (hz0Var != null && hz0Var.getRootView() != null) {
                float scaleX = ((View) hz0Var.getParent()).getScaleX();
                float imageWidth = hz0Var.getImageReceiver().getImageWidth() * scaleX;
                if (isForum) {
                    f7 = 0.32f * imageWidth;
                } else {
                    f7 = imageWidth;
                }
                ci.dc dcVar = new ci.dc(hz0Var, 0);
                int[] iArr = new int[2];
                float[] fArr = new float[2];
                hz0Var.getRootView().getLocationOnScreen(iArr);
                AndroidUtilities.getViewPositionInParent(hz0Var, (ViewGroup) hz0Var.getRootView(), fArr);
                float imageX = (hz0Var.getImageReceiver().getImageX() * scaleX) + iArr[0] + fArr[0];
                float imageY = (hz0Var.getImageReceiver().getImageY() * scaleX) + iArr[1] + fArr[1];
                dcVar.f4714c.set(imageX, imageY, imageX + imageWidth, imageWidth + imageY);
                dcVar.e = hz0Var.getImageReceiver();
                dcVar.f4713b = f7;
                return dcVar;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void b(long j3, ai.j jVar) {
        ProfileActivity profileActivity = this.f32832a;
        profileActivity.f31556e0.setHasStories(profileActivity.j4());
        if (j3 == profileActivity.a() && profileActivity.f31626o2 && profileActivity.f31600k2 > 0.0f) {
            profileActivity.f31541c.h1(0, profileActivity.T3() - profileActivity.f31526a.getPaddingTop());
            profileActivity.f31526a.post(new vb0(profileActivity, 14));
        }
        AndroidUtilities.runOnUIThread(jVar, 30L);
    }
}
