package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
public final class q01 implements bi.sd {
    public final ProfileActivity f35947a;

    public q01(ProfileActivity profileActivity) {
        this.f35947a = profileActivity;
    }

    @Override
    public final bi.xd a(long j3) {
        float f7;
        ProfileActivity profileActivity = this.f35947a;
        if (j3 == profileActivity.a()) {
            profileActivity.f30380e0.setRoundRadiusForExpand((int) AndroidUtilities.lerp(profileActivity.c4(), 0.0f, profileActivity.f30424k2));
            sz0 sz0Var = profileActivity.f30380e0;
            boolean isForum = ChatObject.isForum(profileActivity.E2);
            if (sz0Var != null && sz0Var.getRootView() != null) {
                float scaleX = ((View) sz0Var.getParent()).getScaleX();
                float imageWidth = sz0Var.getImageReceiver().getImageWidth() * scaleX;
                if (isForum) {
                    f7 = 0.32f * imageWidth;
                } else {
                    f7 = imageWidth;
                }
                bi.ud udVar = new bi.ud(sz0Var, 0);
                int[] iArr = new int[2];
                float[] fArr = new float[2];
                sz0Var.getRootView().getLocationOnScreen(iArr);
                AndroidUtilities.getViewPositionInParent(sz0Var, (ViewGroup) sz0Var.getRootView(), fArr);
                float imageX = (sz0Var.getImageReceiver().getImageX() * scaleX) + iArr[0] + fArr[0];
                float imageY = (sz0Var.getImageReceiver().getImageY() * scaleX) + iArr[1] + fArr[1];
                udVar.f3944c.set(imageX, imageY, imageX + imageWidth, imageWidth + imageY);
                udVar.e = sz0Var.getImageReceiver();
                udVar.f3943b = f7;
                return udVar;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void b(long j3, bi.va vaVar) {
        ProfileActivity profileActivity = this.f35947a;
        profileActivity.f30380e0.setHasStories(profileActivity.j4());
        if (j3 == profileActivity.a() && profileActivity.f30450o2 && profileActivity.f30424k2 > 0.0f) {
            profileActivity.f30365c.h1(0, profileActivity.T3() - profileActivity.f30350a.getPaddingTop());
            profileActivity.f30350a.post(new yb0(profileActivity, 14));
        }
        AndroidUtilities.runOnUIThread(vaVar, 30L);
    }
}
