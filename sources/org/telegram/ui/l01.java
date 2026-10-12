package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
public final class l01 implements ci.cc {
    public final ProfileActivity f39620a;

    public l01(ProfileActivity profileActivity) {
        this.f39620a = profileActivity;
    }

    @Override
    public final ci.gc a(long j3) {
        float f7;
        ProfileActivity profileActivity = this.f39620a;
        if (j3 == profileActivity.a()) {
            profileActivity.f34079e0.setRoundRadiusForExpand((int) AndroidUtilities.lerp(profileActivity.c4(), 0.0f, profileActivity.f34123k2));
            qz0 qz0Var = profileActivity.f34079e0;
            boolean isForum = ChatObject.isForum(profileActivity.E2);
            if (qz0Var != null && qz0Var.getRootView() != null) {
                float scaleX = ((View) qz0Var.getParent()).getScaleX();
                float imageWidth = qz0Var.getImageReceiver().getImageWidth() * scaleX;
                if (isForum) {
                    f7 = 0.32f * imageWidth;
                } else {
                    f7 = imageWidth;
                }
                ci.ec ecVar = new ci.ec(qz0Var, 0);
                int[] iArr = new int[2];
                float[] fArr = new float[2];
                qz0Var.getRootView().getLocationOnScreen(iArr);
                AndroidUtilities.getViewPositionInParent(qz0Var, (ViewGroup) qz0Var.getRootView(), fArr);
                float imageX = (qz0Var.getImageReceiver().getImageX() * scaleX) + iArr[0] + fArr[0];
                float imageY = (qz0Var.getImageReceiver().getImageY() * scaleX) + iArr[1] + fArr[1];
                ecVar.f5133c.set(imageX, imageY, imageX + imageWidth, imageWidth + imageY);
                ecVar.f5134e = qz0Var.getImageReceiver();
                ecVar.f5132b = f7;
                return ecVar;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void b(long j3, ai.j jVar) {
        ProfileActivity profileActivity = this.f39620a;
        profileActivity.f34079e0.setHasStories(profileActivity.j4());
        if (j3 == profileActivity.a() && profileActivity.f34149o2 && profileActivity.f34123k2 > 0.0f) {
            profileActivity.f34063c.h1(0, profileActivity.T3() - profileActivity.f34048a.getPaddingTop());
            profileActivity.f34048a.post(new yb0(profileActivity, 14));
        }
        AndroidUtilities.runOnUIThread(jVar, 30L);
    }
}
