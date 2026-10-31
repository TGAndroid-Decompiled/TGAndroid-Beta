package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
public final class ow0 extends qs0 {
    public final ProfileActivity T;

    public ow0(ProfileActivity profileActivity, ViewGroup viewGroup, ViewGroup viewGroup2) {
        super(viewGroup, viewGroup2);
        this.T = profileActivity;
    }

    @Override
    public final void c(Canvas canvas, float f7, float f10, float f11, float f12, float f13) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        org.telegram.ui.ActionBar.l lVar3;
        if (f7 > 0.0f) {
            RectF rectF = org.telegram.messenger.i0.P;
            ProfileActivity profileActivity = this.T;
            rectF.set(0.0f, 0.0f, profileActivity.f33864n0.getMeasuredWidth(), org.telegram.messenger.i0.L(30.0f) + profileActivity.f33864n0.getMeasuredHeight());
            canvas.saveLayerAlpha(rectF, (int) (255.0f * f7), 31);
            profileActivity.Y.draw(canvas);
            canvas.save();
            lVar = ((org.telegram.ui.ActionBar.k2) profileActivity).actionBar;
            float x10 = lVar.getX();
            lVar2 = ((org.telegram.ui.ActionBar.k2) profileActivity).actionBar;
            canvas.translate(x10, lVar2.getY());
            lVar3 = ((org.telegram.ui.ActionBar.k2) profileActivity).actionBar;
            lVar3.draw(canvas);
            canvas.restore();
            org.telegram.ui.Components.ei0 ei0Var = profileActivity.f33898s;
            if (ei0Var != null && ei0Var.getVisibility() == 0 && profileActivity.f33898s.getAlpha() > 0.0f) {
                canvas.save();
                float f14 = (f7 * 0.5f) + 0.5f;
                canvas.scale(f14, f14, (profileActivity.f33898s.getMeasuredWidth() / 2.0f) + profileActivity.f33898s.getX(), (profileActivity.f33898s.getMeasuredHeight() / 2.0f) + profileActivity.f33898s.getY());
                canvas.translate(profileActivity.f33898s.getX(), profileActivity.f33898s.getY());
                profileActivity.f33898s.draw(canvas);
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
        for (int i10 = 0; i10 < profileActivity.f33864n0.getChildCount(); i10++) {
            profileActivity.f33864n0.getChildAt(i10).invalidate();
        }
        org.telegram.ui.Components.ei0 ei0Var = profileActivity.f33898s;
        if (ei0Var != null) {
            ei0Var.invalidate();
        }
    }

    @Override
    public final boolean j(View view, ImageReceiver imageReceiver) {
        if (super.j(view, imageReceiver) && this.T.f33772a.getScrollState() != 1) {
            return true;
        }
        return false;
    }
}
