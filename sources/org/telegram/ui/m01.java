package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
public final class m01 implements ci.fc {
    public final ProfileActivity f35660a;

    public m01(ProfileActivity profileActivity) {
        this.f35660a = profileActivity;
    }

    @Override
    public final ci.jc a(long j3) {
        float f7;
        ProfileActivity profileActivity = this.f35660a;
        if (j3 == profileActivity.a()) {
            profileActivity.f31281e0.setRoundRadiusForExpand((int) AndroidUtilities.lerp(profileActivity.c4(), 0.0f, profileActivity.f31325k2));
            qz0 qz0Var = profileActivity.f31281e0;
            boolean isForum = ChatObject.isForum(profileActivity.E2);
            if (qz0Var != null && qz0Var.getRootView() != null) {
                float scaleX = ((View) qz0Var.getParent()).getScaleX();
                float imageWidth = qz0Var.getImageReceiver().getImageWidth() * scaleX;
                if (isForum) {
                    f7 = 0.32f * imageWidth;
                } else {
                    f7 = imageWidth;
                }
                ci.hc hcVar = new ci.hc(qz0Var, 0);
                int[] iArr = new int[2];
                float[] fArr = new float[2];
                qz0Var.getRootView().getLocationOnScreen(iArr);
                AndroidUtilities.getViewPositionInParent(qz0Var, (ViewGroup) qz0Var.getRootView(), fArr);
                float imageX = (qz0Var.getImageReceiver().getImageX() * scaleX) + iArr[0] + fArr[0];
                float imageY = (qz0Var.getImageReceiver().getImageY() * scaleX) + iArr[1] + fArr[1];
                hcVar.f4862c.set(imageX, imageY, imageX + imageWidth, imageWidth + imageY);
                hcVar.e = qz0Var.getImageReceiver();
                hcVar.f4861b = f7;
                return hcVar;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void d(long j3, ai.j jVar) {
        ProfileActivity profileActivity = this.f35660a;
        profileActivity.f31281e0.setHasStories(profileActivity.j4());
        if (j3 == profileActivity.a() && profileActivity.f31351o2 && profileActivity.f31325k2 > 0.0f) {
            profileActivity.f31266c.h1(0, profileActivity.T3() - profileActivity.f31251a.getPaddingTop());
            profileActivity.f31251a.post(new ac0(profileActivity, 14));
        }
        AndroidUtilities.runOnUIThread(jVar, 30L);
    }
}
