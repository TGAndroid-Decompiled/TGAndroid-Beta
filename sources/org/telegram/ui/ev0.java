package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
public final class ev0 extends fr0 {
    public final ProfileActivity T;

    public ev0(ProfileActivity profileActivity, ViewGroup viewGroup, ViewGroup viewGroup2) {
        super(viewGroup, viewGroup2);
        this.T = profileActivity;
    }

    @Override
    public final void c(Canvas canvas, float f10, float f11, float f12, float f13, float f14) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        if (f10 > 0.0f) {
            RectF rectF = org.telegram.messenger.g0.P;
            ProfileActivity profileActivity = this.T;
            rectF.set(0.0f, 0.0f, profileActivity.f41780n0.getMeasuredWidth(), org.telegram.messenger.g0.L(30.0f) + profileActivity.f41780n0.getMeasuredHeight());
            canvas.saveLayerAlpha(rectF, (int) (255.0f * f10), 31);
            profileActivity.Y.draw(canvas);
            canvas.save();
            kVar = ((org.telegram.ui.ActionBar.f2) profileActivity).actionBar;
            float x10 = kVar.getX();
            kVar2 = ((org.telegram.ui.ActionBar.f2) profileActivity).actionBar;
            canvas.translate(x10, kVar2.getY());
            kVar3 = ((org.telegram.ui.ActionBar.f2) profileActivity).actionBar;
            kVar3.draw(canvas);
            canvas.restore();
            org.telegram.ui.Components.ch0 ch0Var = profileActivity.f41814s;
            if (ch0Var != null && ch0Var.getVisibility() == 0 && profileActivity.f41814s.getAlpha() > 0.0f) {
                canvas.save();
                float f15 = (f10 * 0.5f) + 0.5f;
                canvas.scale(f15, f15, (profileActivity.f41814s.getMeasuredWidth() / 2.0f) + profileActivity.f41814s.getX(), (profileActivity.f41814s.getMeasuredHeight() / 2.0f) + profileActivity.f41814s.getY());
                canvas.translate(profileActivity.f41814s.getX(), profileActivity.f41814s.getY());
                profileActivity.f41814s.draw(canvas);
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
        for (int i7 = 0; i7 < profileActivity.f41780n0.getChildCount(); i7++) {
            profileActivity.f41780n0.getChildAt(i7).invalidate();
        }
        org.telegram.ui.Components.ch0 ch0Var = profileActivity.f41814s;
        if (ch0Var != null) {
            ch0Var.invalidate();
        }
    }

    @Override
    public final boolean j(View view, ImageReceiver imageReceiver) {
        if (super.j(view, imageReceiver) && this.T.f41687a.getScrollState() != 1) {
            return true;
        }
        return false;
    }
}
