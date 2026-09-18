package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
public final class k01 implements ci.fc {
    public final ProfileActivity f34967a;

    public k01(ProfileActivity profileActivity) {
        this.f34967a = profileActivity;
    }

    @Override
    public final ci.jc a(long j3) {
        float f7;
        ProfileActivity profileActivity = this.f34967a;
        if (j3 == profileActivity.a()) {
            profileActivity.f31512e0.setRoundRadiusForExpand((int) AndroidUtilities.lerp(profileActivity.c4(), 0.0f, profileActivity.f31556k2));
            oz0 oz0Var = profileActivity.f31512e0;
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
                hcVar.f4862c.set(imageX, imageY, imageX + imageWidth, imageWidth + imageY);
                hcVar.e = oz0Var.getImageReceiver();
                hcVar.f4861b = f7;
                return hcVar;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void b(long j3, ai.j jVar) {
        ProfileActivity profileActivity = this.f34967a;
        profileActivity.f31512e0.setHasStories(profileActivity.j4());
        if (j3 == profileActivity.a() && profileActivity.f31582o2 && profileActivity.f31556k2 > 0.0f) {
            profileActivity.f31497c.h1(0, profileActivity.T3() - profileActivity.f31482a.getPaddingTop());
            profileActivity.f31482a.post(new zb0(profileActivity, 14));
        }
        AndroidUtilities.runOnUIThread(jVar, 30L);
    }
}
