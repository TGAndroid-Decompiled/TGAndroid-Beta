package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
public final class d01 implements ci.bc {
    public final ProfileActivity f35588a;

    public d01(ProfileActivity profileActivity) {
        this.f35588a = profileActivity;
    }

    @Override
    public final ci.fc a(long j3) {
        float f7;
        ProfileActivity profileActivity = this.f35588a;
        if (j3 == profileActivity.a()) {
            profileActivity.f34233e0.setRoundRadiusForExpand((int) AndroidUtilities.lerp(profileActivity.c4(), 0.0f, profileActivity.f34277k2));
            iz0 iz0Var = profileActivity.f34233e0;
            boolean isForum = ChatObject.isForum(profileActivity.E2);
            if (iz0Var != null && iz0Var.getRootView() != null) {
                float scaleX = ((View) iz0Var.getParent()).getScaleX();
                float imageWidth = iz0Var.getImageReceiver().getImageWidth() * scaleX;
                if (isForum) {
                    f7 = 0.32f * imageWidth;
                } else {
                    f7 = imageWidth;
                }
                ci.dc dcVar = new ci.dc(iz0Var, 0);
                int[] iArr = new int[2];
                float[] fArr = new float[2];
                iz0Var.getRootView().getLocationOnScreen(iArr);
                AndroidUtilities.getViewPositionInParent(iz0Var, (ViewGroup) iz0Var.getRootView(), fArr);
                float imageX = (iz0Var.getImageReceiver().getImageX() * scaleX) + iArr[0] + fArr[0];
                float imageY = (iz0Var.getImageReceiver().getImageY() * scaleX) + iArr[1] + fArr[1];
                dcVar.f5092c.set(imageX, imageY, imageX + imageWidth, imageWidth + imageY);
                dcVar.f5093e = iz0Var.getImageReceiver();
                dcVar.f5091b = f7;
                return dcVar;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void b(long j3, ai.j jVar) {
        ProfileActivity profileActivity = this.f35588a;
        profileActivity.f34233e0.setHasStories(profileActivity.j4());
        if (j3 == profileActivity.a() && profileActivity.f34303o2 && profileActivity.f34277k2 > 0.0f) {
            profileActivity.f34217c.h1(0, profileActivity.T3() - profileActivity.f34202a.getPaddingTop());
            profileActivity.f34202a.post(new wb0(profileActivity, 14));
        }
        AndroidUtilities.runOnUIThread(jVar, 30L);
    }
}
