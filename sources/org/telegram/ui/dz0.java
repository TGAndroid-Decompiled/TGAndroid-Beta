package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public final class dz0 extends xu0 {
    public final ProfileActivity T;

    public dz0(ProfileActivity profileActivity, ViewGroup viewGroup, ViewGroup viewGroup2) {
        super(viewGroup, viewGroup2);
        this.T = profileActivity;
    }

    @Override
    public final void c(Canvas canvas, float f10, float f11, float f12, float f13, float f14) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        if (f10 > 0.0f) {
            RectF rectF = AndroidUtilities.rectTmp;
            ProfileActivity profileActivity = this.T;
            rectF.set(0.0f, 0.0f, profileActivity.f34632k0.getMeasuredWidth(), AndroidUtilities.dp(30.0f) + profileActivity.f34632k0.getMeasuredHeight());
            canvas.saveLayerAlpha(rectF, (int) (255.0f * f10), 31);
            profileActivity.W.draw(canvas);
            canvas.save();
            kVar = ((org.telegram.ui.ActionBar.p2) profileActivity).actionBar;
            float x10 = kVar.getX();
            kVar2 = ((org.telegram.ui.ActionBar.p2) profileActivity).actionBar;
            canvas.translate(x10, kVar2.getY());
            kVar3 = ((org.telegram.ui.ActionBar.p2) profileActivity).actionBar;
            kVar3.draw(canvas);
            canvas.restore();
            org.telegram.ui.Components.lj0 lj0Var = profileActivity.v;
            if (lj0Var != null && lj0Var.getVisibility() == 0 && profileActivity.v.getAlpha() > 0.0f) {
                canvas.save();
                float f15 = (f10 * 0.5f) + 0.5f;
                canvas.scale(f15, f15, (profileActivity.v.getMeasuredWidth() / 2.0f) + profileActivity.v.getX(), (profileActivity.v.getMeasuredHeight() / 2.0f) + profileActivity.v.getY());
                canvas.translate(profileActivity.v.getX(), profileActivity.v.getY());
                profileActivity.v.draw(canvas);
                canvas.restore();
            }
            canvas.restore();
        }
    }

    @Override
    public final void e() {
        super.e();
        ProfileActivity profileActivity = this.T;
        profileActivity.fragmentView.invalidate();
        for (int i10 = 0; i10 < profileActivity.f34632k0.getChildCount(); i10++) {
            profileActivity.f34632k0.getChildAt(i10).invalidate();
        }
        org.telegram.ui.Components.lj0 lj0Var = profileActivity.v;
        if (lj0Var != null) {
            lj0Var.invalidate();
        }
    }

    @Override
    public final boolean j(View view, ImageReceiver imageReceiver) {
        if (super.j(view, imageReceiver) && this.T.f34560a.getScrollState() != 1) {
            return true;
        }
        return false;
    }
}
