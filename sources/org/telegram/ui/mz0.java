package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
public final class mz0 implements ei.mb {
    public final ProfileActivity f39374a;

    public mz0(ProfileActivity profileActivity) {
        this.f39374a = profileActivity;
    }

    @Override
    public final ei.qb a(long j10) {
        float f7;
        ProfileActivity profileActivity = this.f39374a;
        if (j10 == profileActivity.a()) {
            profileActivity.f33622f0.setRoundRadiusForExpand((int) AndroidUtilities.lerp(profileActivity.c4(), 0.0f, profileActivity.f33665l2));
            ry0 ry0Var = profileActivity.f33622f0;
            boolean isForum = ChatObject.isForum(profileActivity.F2);
            if (ry0Var != null && ry0Var.getRootView() != null) {
                float scaleX = ((View) ry0Var.getParent()).getScaleX();
                float imageWidth = ry0Var.getImageReceiver().getImageWidth() * scaleX;
                if (isForum) {
                    f7 = 0.32f * imageWidth;
                } else {
                    f7 = imageWidth;
                }
                ei.ob obVar = new ei.ob(ry0Var, 0);
                int[] iArr = new int[2];
                float[] fArr = new float[2];
                ry0Var.getRootView().getLocationOnScreen(iArr);
                AndroidUtilities.getViewPositionInParent(ry0Var, (ViewGroup) ry0Var.getRootView(), fArr);
                float imageX = (ry0Var.getImageReceiver().getImageX() * scaleX) + iArr[0] + fArr[0];
                float imageY = (ry0Var.getImageReceiver().getImageY() * scaleX) + iArr[1] + fArr[1];
                obVar.f9665c.set(imageX, imageY, imageX + imageWidth, imageWidth + imageY);
                obVar.e = ry0Var.getImageReceiver();
                obVar.f9664b = f7;
                return obVar;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void c(long j10, ai.v3 v3Var) {
        ProfileActivity profileActivity = this.f39374a;
        profileActivity.f33622f0.setHasStories(profileActivity.j4());
        if (j10 == profileActivity.a() && profileActivity.f33692p2 && profileActivity.f33665l2 > 0.0f) {
            profileActivity.f33599c.h1(0, profileActivity.T3() - profileActivity.f33584a.getPaddingTop());
            profileActivity.f33584a.post(new cb0(profileActivity, 14));
        }
        AndroidUtilities.runOnUIThread(v3Var, 30L);
    }
}
