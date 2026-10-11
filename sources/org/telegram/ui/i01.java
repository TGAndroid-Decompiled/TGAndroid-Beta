package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
public final class i01 implements ci.cc {
    public final ProfileActivity f38549a;

    public i01(ProfileActivity profileActivity) {
        this.f38549a = profileActivity;
    }

    @Override
    public final ci.gc a(long j3) {
        float f7;
        ProfileActivity profileActivity = this.f38549a;
        if (j3 == profileActivity.a()) {
            profileActivity.f34270e0.setRoundRadiusForExpand((int) AndroidUtilities.lerp(profileActivity.c4(), 0.0f, profileActivity.f34314k2));
            nz0 nz0Var = profileActivity.f34270e0;
            boolean isForum = ChatObject.isForum(profileActivity.E2);
            if (nz0Var != null && nz0Var.getRootView() != null) {
                float scaleX = ((View) nz0Var.getParent()).getScaleX();
                float imageWidth = nz0Var.getImageReceiver().getImageWidth() * scaleX;
                if (isForum) {
                    f7 = 0.32f * imageWidth;
                } else {
                    f7 = imageWidth;
                }
                ci.ec ecVar = new ci.ec(nz0Var, 0);
                int[] iArr = new int[2];
                float[] fArr = new float[2];
                nz0Var.getRootView().getLocationOnScreen(iArr);
                AndroidUtilities.getViewPositionInParent(nz0Var, (ViewGroup) nz0Var.getRootView(), fArr);
                float imageX = (nz0Var.getImageReceiver().getImageX() * scaleX) + iArr[0] + fArr[0];
                float imageY = (nz0Var.getImageReceiver().getImageY() * scaleX) + iArr[1] + fArr[1];
                ecVar.f5134c.set(imageX, imageY, imageX + imageWidth, imageWidth + imageY);
                ecVar.f5135e = nz0Var.getImageReceiver();
                ecVar.f5133b = f7;
                return ecVar;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void b(long j3, ai.j jVar) {
        ProfileActivity profileActivity = this.f38549a;
        profileActivity.f34270e0.setHasStories(profileActivity.j4());
        if (j3 == profileActivity.a() && profileActivity.f34340o2 && profileActivity.f34314k2 > 0.0f) {
            profileActivity.f34254c.h1(0, profileActivity.T3() - profileActivity.f34239a.getPaddingTop());
            profileActivity.f34239a.post(new wb0(profileActivity, 14));
        }
        AndroidUtilities.runOnUIThread(jVar, 30L);
    }
}
