package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;

public final class gz0 implements lh.jb {

    public final ProfileActivity f38629a;

    public gz0(ProfileActivity profileActivity) {
        this.f38629a = profileActivity;
    }

    @Override
    public final lh.nb a(long j10) {
        ProfileActivity profileActivity = this.f38629a;
        if (j10 != profileActivity.a()) {
            return null;
        }
        profileActivity.f35922a0.setRoundRadiusForExpand((int) AndroidUtilities.lerp(profileActivity.c4(), 0.0f, profileActivity.f35968g2));
        ly0 ly0Var = profileActivity.f35922a0;
        boolean zIsForum = ChatObject.isForum(profileActivity.A2);
        if (ly0Var == null || ly0Var.getRootView() == null) {
            return null;
        }
        float scaleX = ((View) ly0Var.getParent()).getScaleX();
        float imageWidth = ly0Var.getImageReceiver().getImageWidth() * scaleX;
        float f10 = zIsForum ? 0.32f * imageWidth : imageWidth;
        lh.lb lbVar = new lh.lb(ly0Var, 0);
        int[] iArr = new int[2];
        float[] fArr = new float[2];
        ly0Var.getRootView().getLocationOnScreen(iArr);
        AndroidUtilities.getViewPositionInParent(ly0Var, (ViewGroup) ly0Var.getRootView(), fArr);
        float imageX = (ly0Var.getImageReceiver().getImageX() * scaleX) + iArr[0] + fArr[0];
        float imageY = (ly0Var.getImageReceiver().getImageY() * scaleX) + iArr[1] + fArr[1];
        lbVar.f16456c.set(imageX, imageY, imageX + imageWidth, imageWidth + imageY);
        lbVar.f16457e = ly0Var.getImageReceiver();
        lbVar.f16455b = f10;
        return lbVar;
    }

    @Override
    public final void b(long j10, cg.b2 b2Var) {
        ProfileActivity profileActivity = this.f38629a;
        profileActivity.f35922a0.setHasStories(profileActivity.j4());
        if (j10 == profileActivity.a() && profileActivity.f35996k2 && profileActivity.f35968g2 > 0.0f) {
            profileActivity.f35935c.h1(0, profileActivity.T3() - profileActivity.f35921a.getPaddingTop());
            profileActivity.f35921a.post(new gb0(profileActivity, 14));
        }
        AndroidUtilities.runOnUIThread(b2Var, 30L);
    }
}
