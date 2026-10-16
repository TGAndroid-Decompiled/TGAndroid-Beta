package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
public final class p01 implements di.bc {
    public final ProfileActivity f38788a;

    public p01(ProfileActivity profileActivity) {
        this.f38788a = profileActivity;
    }

    @Override
    public final di.fc a(long j10) {
        float f7;
        ProfileActivity profileActivity = this.f38788a;
        if (j10 == profileActivity.a()) {
            profileActivity.f32260e0.setRoundRadiusForExpand((int) AndroidUtilities.lerp(profileActivity.c4(), 0.0f, profileActivity.f32305k2));
            uz0 uz0Var = profileActivity.f32260e0;
            boolean isForum = ChatObject.isForum(profileActivity.E2);
            if (uz0Var != null && uz0Var.getRootView() != null) {
                float scaleX = ((View) uz0Var.getParent()).getScaleX();
                float imageWidth = uz0Var.getImageReceiver().getImageWidth() * scaleX;
                if (isForum) {
                    f7 = 0.32f * imageWidth;
                } else {
                    f7 = imageWidth;
                }
                di.dc dcVar = new di.dc(uz0Var, 0);
                int[] iArr = new int[2];
                float[] fArr = new float[2];
                uz0Var.getRootView().getLocationOnScreen(iArr);
                AndroidUtilities.getViewPositionInParent(uz0Var, (ViewGroup) uz0Var.getRootView(), fArr);
                float imageX = (uz0Var.getImageReceiver().getImageX() * scaleX) + iArr[0] + fArr[0];
                float imageY = (uz0Var.getImageReceiver().getImageY() * scaleX) + iArr[1] + fArr[1];
                dcVar.f6960c.set(imageX, imageY, imageX + imageWidth, imageWidth + imageY);
                dcVar.e = uz0Var.getImageReceiver();
                dcVar.f6959b = f7;
                return dcVar;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void b(long j10, bi.g gVar) {
        ProfileActivity profileActivity = this.f38788a;
        profileActivity.f32260e0.setHasStories(profileActivity.j4());
        if (j10 == profileActivity.a() && profileActivity.f32331o2 && profileActivity.f32305k2 > 0.0f) {
            profileActivity.f32245c.h1(0, profileActivity.T3() - profileActivity.f32230a.getPaddingTop());
            profileActivity.f32230a.post(new bc0(profileActivity, 14));
        }
        AndroidUtilities.runOnUIThread(gVar, 30L);
    }
}
