package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
public final class q01 implements di.bc {
    public final ProfileActivity f39322a;

    public q01(ProfileActivity profileActivity) {
        this.f39322a = profileActivity;
    }

    @Override
    public final di.fc a(long j10) {
        float f7;
        ProfileActivity profileActivity = this.f39322a;
        if (j10 == profileActivity.a()) {
            profileActivity.f32558e0.setRoundRadiusForExpand((int) AndroidUtilities.lerp(profileActivity.c4(), 0.0f, profileActivity.f32603k2));
            vz0 vz0Var = profileActivity.f32558e0;
            boolean isForum = ChatObject.isForum(profileActivity.E2);
            if (vz0Var != null && vz0Var.getRootView() != null) {
                float scaleX = ((View) vz0Var.getParent()).getScaleX();
                float imageWidth = vz0Var.getImageReceiver().getImageWidth() * scaleX;
                if (isForum) {
                    f7 = 0.32f * imageWidth;
                } else {
                    f7 = imageWidth;
                }
                di.dc dcVar = new di.dc(vz0Var, 0);
                int[] iArr = new int[2];
                float[] fArr = new float[2];
                vz0Var.getRootView().getLocationOnScreen(iArr);
                AndroidUtilities.getViewPositionInParent(vz0Var, (ViewGroup) vz0Var.getRootView(), fArr);
                float imageX = (vz0Var.getImageReceiver().getImageX() * scaleX) + iArr[0] + fArr[0];
                float imageY = (vz0Var.getImageReceiver().getImageY() * scaleX) + iArr[1] + fArr[1];
                dcVar.f6957c.set(imageX, imageY, imageX + imageWidth, imageWidth + imageY);
                dcVar.e = vz0Var.getImageReceiver();
                dcVar.f6956b = f7;
                return dcVar;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void b(long j10, bi.g gVar) {
        ProfileActivity profileActivity = this.f39322a;
        profileActivity.f32558e0.setHasStories(profileActivity.j4());
        if (j10 == profileActivity.a() && profileActivity.f32629o2 && profileActivity.f32603k2 > 0.0f) {
            profileActivity.f32543c.h1(0, profileActivity.T3() - profileActivity.f32528a.getPaddingTop());
            profileActivity.f32528a.post(new cc0(profileActivity, 14));
        }
        AndroidUtilities.runOnUIThread(gVar, 30L);
    }
}
