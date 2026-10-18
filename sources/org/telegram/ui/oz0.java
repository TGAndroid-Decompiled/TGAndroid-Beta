package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
public final class oz0 implements ei.mb {
    public final ProfileActivity f39886a;

    public oz0(ProfileActivity profileActivity) {
        this.f39886a = profileActivity;
    }

    @Override
    public final ei.qb a(long j10) {
        float f7;
        ProfileActivity profileActivity = this.f39886a;
        if (j10 == profileActivity.a()) {
            profileActivity.f33606f0.setRoundRadiusForExpand((int) AndroidUtilities.lerp(profileActivity.c4(), 0.0f, profileActivity.f33649l2));
            ty0 ty0Var = profileActivity.f33606f0;
            boolean isForum = ChatObject.isForum(profileActivity.F2);
            if (ty0Var != null && ty0Var.getRootView() != null) {
                float scaleX = ((View) ty0Var.getParent()).getScaleX();
                float imageWidth = ty0Var.getImageReceiver().getImageWidth() * scaleX;
                if (isForum) {
                    f7 = 0.32f * imageWidth;
                } else {
                    f7 = imageWidth;
                }
                ei.ob obVar = new ei.ob(ty0Var, 0);
                int[] iArr = new int[2];
                float[] fArr = new float[2];
                ty0Var.getRootView().getLocationOnScreen(iArr);
                AndroidUtilities.getViewPositionInParent(ty0Var, (ViewGroup) ty0Var.getRootView(), fArr);
                float imageX = (ty0Var.getImageReceiver().getImageX() * scaleX) + iArr[0] + fArr[0];
                float imageY = (ty0Var.getImageReceiver().getImageY() * scaleX) + iArr[1] + fArr[1];
                obVar.f9666c.set(imageX, imageY, imageX + imageWidth, imageWidth + imageY);
                obVar.e = ty0Var.getImageReceiver();
                obVar.f9665b = f7;
                return obVar;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void b(long j10, ai.t3 t3Var) {
        ProfileActivity profileActivity = this.f39886a;
        profileActivity.f33606f0.setHasStories(profileActivity.j4());
        if (j10 == profileActivity.a() && profileActivity.f33676p2 && profileActivity.f33649l2 > 0.0f) {
            profileActivity.f33583c.h1(0, profileActivity.T3() - profileActivity.f33568a.getPaddingTop());
            profileActivity.f33568a.post(new eb0(profileActivity, 14));
        }
        AndroidUtilities.runOnUIThread(t3Var, 30L);
    }
}
