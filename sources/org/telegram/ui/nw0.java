package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
public final class nw0 extends ps0 {
    public final ProfileActivity T;

    public nw0(ProfileActivity profileActivity, ViewGroup viewGroup, ViewGroup viewGroup2) {
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
            rectF.set(0.0f, 0.0f, profileActivity.f33871n0.getMeasuredWidth(), org.telegram.messenger.i0.L(30.0f) + profileActivity.f33871n0.getMeasuredHeight());
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
            org.telegram.ui.Components.fi0 fi0Var = profileActivity.f33905s;
            if (fi0Var != null && fi0Var.getVisibility() == 0 && profileActivity.f33905s.getAlpha() > 0.0f) {
                canvas.save();
                float f14 = (f7 * 0.5f) + 0.5f;
                canvas.scale(f14, f14, (profileActivity.f33905s.getMeasuredWidth() / 2.0f) + profileActivity.f33905s.getX(), (profileActivity.f33905s.getMeasuredHeight() / 2.0f) + profileActivity.f33905s.getY());
                canvas.translate(profileActivity.f33905s.getX(), profileActivity.f33905s.getY());
                profileActivity.f33905s.draw(canvas);
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
        for (int i10 = 0; i10 < profileActivity.f33871n0.getChildCount(); i10++) {
            profileActivity.f33871n0.getChildAt(i10).invalidate();
        }
        org.telegram.ui.Components.fi0 fi0Var = profileActivity.f33905s;
        if (fi0Var != null) {
            fi0Var.invalidate();
        }
    }

    @Override
    public final boolean j(View view, ImageReceiver imageReceiver) {
        if (super.j(view, imageReceiver) && this.T.f33779a.getScrollState() != 1) {
            return true;
        }
        return false;
    }
}
