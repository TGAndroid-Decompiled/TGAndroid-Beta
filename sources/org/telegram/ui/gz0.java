package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
public final class gz0 implements kh.nb {
    public final ProfileActivity f38622a;

    public gz0(ProfileActivity profileActivity) {
        this.f38622a = profileActivity;
    }

    @Override
    public final kh.rb a(long j10) {
        float f10;
        ProfileActivity profileActivity = this.f38622a;
        if (j10 == profileActivity.a()) {
            profileActivity.f35919a0.setRoundRadiusForExpand((int) AndroidUtilities.lerp(profileActivity.c4(), 0.0f, profileActivity.f35965g2));
            ly0 ly0Var = profileActivity.f35919a0;
            boolean isForum = ChatObject.isForum(profileActivity.A2);
            if (ly0Var != null && ly0Var.getRootView() != null) {
                float scaleX = ((View) ly0Var.getParent()).getScaleX();
                float imageWidth = ly0Var.getImageReceiver().getImageWidth() * scaleX;
                if (isForum) {
                    f10 = 0.32f * imageWidth;
                } else {
                    f10 = imageWidth;
                }
                kh.pb pbVar = new kh.pb(ly0Var, 0);
                int[] iArr = new int[2];
                float[] fArr = new float[2];
                ly0Var.getRootView().getLocationOnScreen(iArr);
                AndroidUtilities.getViewPositionInParent(ly0Var, (ViewGroup) ly0Var.getRootView(), fArr);
                float imageX = (ly0Var.getImageReceiver().getImageX() * scaleX) + iArr[0] + fArr[0];
                float imageY = (ly0Var.getImageReceiver().getImageY() * scaleX) + iArr[1] + fArr[1];
                pbVar.f15974c.set(imageX, imageY, imageX + imageWidth, imageWidth + imageY);
                pbVar.f15975e = ly0Var.getImageReceiver();
                pbVar.f15973b = f10;
                return pbVar;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void b(long j10, bg.i2 i2Var) {
        ProfileActivity profileActivity = this.f38622a;
        profileActivity.f35919a0.setHasStories(profileActivity.j4());
        if (j10 == profileActivity.a() && profileActivity.f35993k2 && profileActivity.f35965g2 > 0.0f) {
            profileActivity.f35932c.h1(0, profileActivity.T3() - profileActivity.f35918a.getPaddingTop());
            profileActivity.f35918a.post(new cb0(profileActivity, 14));
        }
        AndroidUtilities.runOnUIThread(i2Var, 30L);
    }
}
