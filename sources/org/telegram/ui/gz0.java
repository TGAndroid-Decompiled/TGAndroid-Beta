package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
public final class gz0 implements nh.xa {
    public final ProfileActivity f38704a;

    public gz0(ProfileActivity profileActivity) {
        this.f38704a = profileActivity;
    }

    @Override
    public final nh.bb a(long j10) {
        float f9;
        ProfileActivity profileActivity = this.f38704a;
        if (j10 == profileActivity.a()) {
            profileActivity.f35985a0.setRoundRadiusForExpand((int) AndroidUtilities.lerp(profileActivity.c4(), 0.0f, profileActivity.f36030g2));
            ly0 ly0Var = profileActivity.f35985a0;
            boolean isForum = ChatObject.isForum(profileActivity.A2);
            if (ly0Var != null && ly0Var.getRootView() != null) {
                float scaleX = ((View) ly0Var.getParent()).getScaleX();
                float imageWidth = ly0Var.getImageReceiver().getImageWidth() * scaleX;
                if (isForum) {
                    f9 = 0.32f * imageWidth;
                } else {
                    f9 = imageWidth;
                }
                nh.za zaVar = new nh.za(ly0Var, 0);
                int[] iArr = new int[2];
                float[] fArr = new float[2];
                ly0Var.getRootView().getLocationOnScreen(iArr);
                AndroidUtilities.getViewPositionInParent(ly0Var, (ViewGroup) ly0Var.getRootView(), fArr);
                float imageX = (ly0Var.getImageReceiver().getImageX() * scaleX) + iArr[0] + fArr[0];
                float imageY = (ly0Var.getImageReceiver().getImageY() * scaleX) + iArr[1] + fArr[1];
                zaVar.f17446c.set(imageX, imageY, imageX + imageWidth, imageWidth + imageY);
                zaVar.f17447e = ly0Var.getImageReceiver();
                zaVar.f17445b = f9;
                return zaVar;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void c(long j10, eg.z1 z1Var) {
        ProfileActivity profileActivity = this.f38704a;
        profileActivity.f35985a0.setHasStories(profileActivity.j4());
        if (j10 == profileActivity.a() && profileActivity.f36058k2 && profileActivity.f36030g2 > 0.0f) {
            profileActivity.f35999c.h1(0, profileActivity.T3() - profileActivity.f35984a.getPaddingTop());
            profileActivity.f35984a.post(new fb0(profileActivity, 14));
        }
        AndroidUtilities.runOnUIThread(z1Var, 30L);
    }
}
