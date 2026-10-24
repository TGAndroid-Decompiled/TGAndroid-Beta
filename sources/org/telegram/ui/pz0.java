package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
public final class pz0 implements ei.mb {
    public final ProfileActivity f40667a;

    public pz0(ProfileActivity profileActivity) {
        this.f40667a = profileActivity;
    }

    @Override
    public final ei.qb a(long j10) {
        float f7;
        ProfileActivity profileActivity = this.f40667a;
        if (j10 == profileActivity.a()) {
            profileActivity.f33922f0.setRoundRadiusForExpand((int) AndroidUtilities.lerp(profileActivity.e4(), 0.0f, profileActivity.f33965l2));
            uy0 uy0Var = profileActivity.f33922f0;
            boolean isForum = ChatObject.isForum(profileActivity.F2);
            if (uy0Var != null && uy0Var.getRootView() != null) {
                float scaleX = ((View) uy0Var.getParent()).getScaleX();
                float imageWidth = uy0Var.getImageReceiver().getImageWidth() * scaleX;
                if (isForum) {
                    f7 = 0.32f * imageWidth;
                } else {
                    f7 = imageWidth;
                }
                ei.ob obVar = new ei.ob(uy0Var, 0);
                int[] iArr = new int[2];
                float[] fArr = new float[2];
                uy0Var.getRootView().getLocationOnScreen(iArr);
                AndroidUtilities.getViewPositionInParent(uy0Var, (ViewGroup) uy0Var.getRootView(), fArr);
                float imageX = (uy0Var.getImageReceiver().getImageX() * scaleX) + iArr[0] + fArr[0];
                float imageY = (uy0Var.getImageReceiver().getImageY() * scaleX) + iArr[1] + fArr[1];
                obVar.f9681c.set(imageX, imageY, imageX + imageWidth, imageWidth + imageY);
                obVar.e = uy0Var.getImageReceiver();
                obVar.f9680b = f7;
                return obVar;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void b(long j10, ai.v3 v3Var) {
        ProfileActivity profileActivity = this.f40667a;
        profileActivity.f33922f0.setHasStories(profileActivity.l4());
        if (j10 == profileActivity.a() && profileActivity.f33992p2 && profileActivity.f33965l2 > 0.0f) {
            profileActivity.f33899c.h1(0, profileActivity.V3() - profileActivity.f33884a.getPaddingTop());
            profileActivity.f33884a.post(new ib0(profileActivity, 14));
        }
        AndroidUtilities.runOnUIThread(v3Var, 30L);
    }
}
