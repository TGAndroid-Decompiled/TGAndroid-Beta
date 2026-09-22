package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
public final class l01 implements ci.fc {
    public final ProfileActivity f35292a;

    public l01(ProfileActivity profileActivity) {
        this.f35292a = profileActivity;
    }

    @Override
    public final ci.jc a(long j3) {
        float f7;
        ProfileActivity profileActivity = this.f35292a;
        if (j3 == profileActivity.a()) {
            profileActivity.f31265e0.setRoundRadiusForExpand((int) AndroidUtilities.lerp(profileActivity.c4(), 0.0f, profileActivity.f31309k2));
            pz0 pz0Var = profileActivity.f31265e0;
            boolean isForum = ChatObject.isForum(profileActivity.E2);
            if (pz0Var != null && pz0Var.getRootView() != null) {
                float scaleX = ((View) pz0Var.getParent()).getScaleX();
                float imageWidth = pz0Var.getImageReceiver().getImageWidth() * scaleX;
                if (isForum) {
                    f7 = 0.32f * imageWidth;
                } else {
                    f7 = imageWidth;
                }
                ci.hc hcVar = new ci.hc(pz0Var, 0);
                int[] iArr = new int[2];
                float[] fArr = new float[2];
                pz0Var.getRootView().getLocationOnScreen(iArr);
                AndroidUtilities.getViewPositionInParent(pz0Var, (ViewGroup) pz0Var.getRootView(), fArr);
                float imageX = (pz0Var.getImageReceiver().getImageX() * scaleX) + iArr[0] + fArr[0];
                float imageY = (pz0Var.getImageReceiver().getImageY() * scaleX) + iArr[1] + fArr[1];
                hcVar.f4859c.set(imageX, imageY, imageX + imageWidth, imageWidth + imageY);
                hcVar.e = pz0Var.getImageReceiver();
                hcVar.f4858b = f7;
                return hcVar;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void d(long j3, ai.j jVar) {
        ProfileActivity profileActivity = this.f35292a;
        profileActivity.f31265e0.setHasStories(profileActivity.j4());
        if (j3 == profileActivity.a() && profileActivity.f31335o2 && profileActivity.f31309k2 > 0.0f) {
            profileActivity.f31250c.h1(0, profileActivity.T3() - profileActivity.f31235a.getPaddingTop());
            profileActivity.f31235a.post(new yb0(profileActivity, 14));
        }
        AndroidUtilities.runOnUIThread(jVar, 30L);
    }
}
