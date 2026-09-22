package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
public final class k01 implements ci.fc {
    public final ProfileActivity f35034a;

    public k01(ProfileActivity profileActivity) {
        this.f35034a = profileActivity;
    }

    @Override
    public final ci.jc a(long j3) {
        float f7;
        ProfileActivity profileActivity = this.f35034a;
        if (j3 == profileActivity.a()) {
            profileActivity.f31573e0.setRoundRadiusForExpand((int) AndroidUtilities.lerp(profileActivity.c4(), 0.0f, profileActivity.f31617k2));
            oz0 oz0Var = profileActivity.f31573e0;
            boolean isForum = ChatObject.isForum(profileActivity.E2);
            if (oz0Var != null && oz0Var.getRootView() != null) {
                float scaleX = ((View) oz0Var.getParent()).getScaleX();
                float imageWidth = oz0Var.getImageReceiver().getImageWidth() * scaleX;
                if (isForum) {
                    f7 = 0.32f * imageWidth;
                } else {
                    f7 = imageWidth;
                }
                ci.hc hcVar = new ci.hc(oz0Var, 0);
                int[] iArr = new int[2];
                float[] fArr = new float[2];
                oz0Var.getRootView().getLocationOnScreen(iArr);
                AndroidUtilities.getViewPositionInParent(oz0Var, (ViewGroup) oz0Var.getRootView(), fArr);
                float imageX = (oz0Var.getImageReceiver().getImageX() * scaleX) + iArr[0] + fArr[0];
                float imageY = (oz0Var.getImageReceiver().getImageY() * scaleX) + iArr[1] + fArr[1];
                hcVar.f4861c.set(imageX, imageY, imageX + imageWidth, imageWidth + imageY);
                hcVar.e = oz0Var.getImageReceiver();
                hcVar.f4860b = f7;
                return hcVar;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void d(long j3, ai.j jVar) {
        ProfileActivity profileActivity = this.f35034a;
        profileActivity.f31573e0.setHasStories(profileActivity.j4());
        if (j3 == profileActivity.a() && profileActivity.f31643o2 && profileActivity.f31617k2 > 0.0f) {
            profileActivity.f31558c.h1(0, profileActivity.T3() - profileActivity.f31543a.getPaddingTop());
            profileActivity.f31543a.post(new ac0(profileActivity, 14));
        }
        AndroidUtilities.runOnUIThread(jVar, 30L);
    }
}
