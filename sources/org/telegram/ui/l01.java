package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
public final class l01 implements di.gc {
    public final ProfileActivity f38191a;

    public l01(ProfileActivity profileActivity) {
        this.f38191a = profileActivity;
    }

    @Override
    public final di.kc a(long j3) {
        float f7;
        ProfileActivity profileActivity = this.f38191a;
        if (j3 == profileActivity.a()) {
            profileActivity.f33914e0.setRoundRadiusForExpand((int) AndroidUtilities.lerp(profileActivity.c4(), 0.0f, profileActivity.f33958k2));
            pz0 pz0Var = profileActivity.f33914e0;
            boolean isForum = ChatObject.isForum(profileActivity.E2);
            if (pz0Var != null && pz0Var.getRootView() != null) {
                float scaleX = ((View) pz0Var.getParent()).getScaleX();
                float imageWidth = pz0Var.getImageReceiver().getImageWidth() * scaleX;
                if (isForum) {
                    f7 = 0.32f * imageWidth;
                } else {
                    f7 = imageWidth;
                }
                di.ic icVar = new di.ic(pz0Var, 0);
                int[] iArr = new int[2];
                float[] fArr = new float[2];
                pz0Var.getRootView().getLocationOnScreen(iArr);
                AndroidUtilities.getViewPositionInParent(pz0Var, (ViewGroup) pz0Var.getRootView(), fArr);
                float imageX = (pz0Var.getImageReceiver().getImageX() * scaleX) + iArr[0] + fArr[0];
                float imageY = (pz0Var.getImageReceiver().getImageY() * scaleX) + iArr[1] + fArr[1];
                icVar.f7512c.set(imageX, imageY, imageX + imageWidth, imageWidth + imageY);
                icVar.f7513e = pz0Var.getImageReceiver();
                icVar.f7511b = f7;
                return icVar;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void b(long j3, bi.g gVar) {
        ProfileActivity profileActivity = this.f38191a;
        profileActivity.f33914e0.setHasStories(profileActivity.j4());
        if (j3 == profileActivity.a() && profileActivity.f33984o2 && profileActivity.f33958k2 > 0.0f) {
            profileActivity.f33898c.h1(0, profileActivity.T3() - profileActivity.f33883a.getPaddingTop());
            profileActivity.f33883a.post(new yb0(profileActivity, 14));
        }
        AndroidUtilities.runOnUIThread(gVar, 30L);
    }
}
