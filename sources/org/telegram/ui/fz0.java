package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public final class fz0 extends ev0 {
    public final ProfileActivity T;

    public fz0(ProfileActivity profileActivity, ViewGroup viewGroup, ViewGroup viewGroup2) {
        super(viewGroup, viewGroup2);
        this.T = profileActivity;
    }

    @Override
    public final void c(Canvas canvas, float f7, float f10, float f11, float f12, float f13) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        if (f7 > 0.0f) {
            RectF rectF = AndroidUtilities.rectTmp;
            ProfileActivity profileActivity = this.T;
            rectF.set(0.0f, 0.0f, profileActivity.f36064n0.getMeasuredWidth(), AndroidUtilities.dp(30.0f) + profileActivity.f36064n0.getMeasuredHeight());
            canvas.saveLayerAlpha(rectF, (int) (255.0f * f7), 31);
            profileActivity.Y.draw(canvas);
            canvas.save();
            kVar = ((org.telegram.ui.ActionBar.r2) profileActivity).actionBar;
            float x9 = kVar.getX();
            kVar2 = ((org.telegram.ui.ActionBar.r2) profileActivity).actionBar;
            canvas.translate(x9, kVar2.getY());
            kVar3 = ((org.telegram.ui.ActionBar.r2) profileActivity).actionBar;
            kVar3.draw(canvas);
            canvas.restore();
            org.telegram.ui.Components.bk0 bk0Var = profileActivity.f36098s;
            if (bk0Var != null && bk0Var.getVisibility() == 0 && profileActivity.f36098s.getAlpha() > 0.0f) {
                canvas.save();
                float f14 = (f7 * 0.5f) + 0.5f;
                canvas.scale(f14, f14, (profileActivity.f36098s.getMeasuredWidth() / 2.0f) + profileActivity.f36098s.getX(), (profileActivity.f36098s.getMeasuredHeight() / 2.0f) + profileActivity.f36098s.getY());
                canvas.translate(profileActivity.f36098s.getX(), profileActivity.f36098s.getY());
                profileActivity.f36098s.draw(canvas);
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
        for (int i10 = 0; i10 < profileActivity.f36064n0.getChildCount(); i10++) {
            profileActivity.f36064n0.getChildAt(i10).invalidate();
        }
        org.telegram.ui.Components.bk0 bk0Var = profileActivity.f36098s;
        if (bk0Var != null) {
            bk0Var.invalidate();
        }
    }

    @Override
    public final boolean j(View view, ImageReceiver imageReceiver) {
        if (super.j(view, imageReceiver) && this.T.f35972a.getScrollState() != 1) {
            return true;
        }
        return false;
    }
}
