package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
public final class j01 implements ci.cc {
    public final ProfileActivity f38842a;

    public j01(ProfileActivity profileActivity) {
        this.f38842a = profileActivity;
    }

    @Override
    public final ci.gc a(long j3) {
        float f7;
        ProfileActivity profileActivity = this.f38842a;
        if (j3 == profileActivity.a()) {
            profileActivity.f34280e0.setRoundRadiusForExpand((int) AndroidUtilities.lerp(profileActivity.c4(), 0.0f, profileActivity.f34324k2));
            oz0 oz0Var = profileActivity.f34280e0;
            boolean isForum = ChatObject.isForum(profileActivity.E2);
            if (oz0Var != null && oz0Var.getRootView() != null) {
                float scaleX = ((View) oz0Var.getParent()).getScaleX();
                float imageWidth = oz0Var.getImageReceiver().getImageWidth() * scaleX;
                if (isForum) {
                    f7 = 0.32f * imageWidth;
                } else {
                    f7 = imageWidth;
                }
                ci.ec ecVar = new ci.ec(oz0Var, 0);
                int[] iArr = new int[2];
                float[] fArr = new float[2];
                oz0Var.getRootView().getLocationOnScreen(iArr);
                AndroidUtilities.getViewPositionInParent(oz0Var, (ViewGroup) oz0Var.getRootView(), fArr);
                float imageX = (oz0Var.getImageReceiver().getImageX() * scaleX) + iArr[0] + fArr[0];
                float imageY = (oz0Var.getImageReceiver().getImageY() * scaleX) + iArr[1] + fArr[1];
                ecVar.f5135c.set(imageX, imageY, imageX + imageWidth, imageWidth + imageY);
                ecVar.f5136e = oz0Var.getImageReceiver();
                ecVar.f5134b = f7;
                return ecVar;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void b(long j3, ai.j jVar) {
        ProfileActivity profileActivity = this.f38842a;
        profileActivity.f34280e0.setHasStories(profileActivity.j4());
        if (j3 == profileActivity.a() && profileActivity.f34350o2 && profileActivity.f34324k2 > 0.0f) {
            profileActivity.f34264c.h1(0, profileActivity.T3() - profileActivity.f34249a.getPaddingTop());
            profileActivity.f34249a.post(new xb0(profileActivity, 14));
        }
        AndroidUtilities.runOnUIThread(jVar, 30L);
    }
}
