package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Picture;
import org.telegram.messenger.AndroidUtilities;
public final class az0 extends org.telegram.ui.Components.u90 implements oe.d {
    public final oe.e P0;
    public Picture Q0;
    public final ProfileActivity R0;

    public az0(ProfileActivity profileActivity, Context context) {
        super(context);
        this.R0 = profileActivity;
        this.P0 = new oe.e(0, this, org.telegram.ui.Components.ds.h, 320L, 1.0f);
    }

    public final void n(Canvas canvas, float f7, float f10) {
        if (f7 >= 1.0f && f10 == 0.0f) {
            super.onDraw(canvas);
            return;
        }
        canvas.save();
        canvas.translate(0.0f, f10);
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (f7 * 255.0f));
        super.onDraw(canvas);
        canvas.restore();
        canvas.restore();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.Q0 == null) {
            super.onDraw(canvas);
            return;
        }
        float f7 = this.P0.f19334f;
        int dp = AndroidUtilities.dp(6.0f);
        canvas.save();
        canvas.translate(0.0f, (-dp) * f7);
        float f10 = 1.0f - f7;
        canvas.saveLayerAlpha(0.0f, 0.0f, this.Q0.getWidth(), this.Q0.getHeight(), (int) (255.0f * f10));
        canvas.drawPicture(this.Q0);
        canvas.restore();
        canvas.restore();
        n(canvas, f7, dp * f10);
    }

    @Override
    public final void setAlpha(float f7) {
        super.setAlpha(f7);
        int i10 = ProfileActivity.R6;
        this.R0.J3();
    }

    @Override
    public final void setTextColor(int i10) {
        int o12;
        super.setTextColor(i10);
        v01 v01Var = this.R0.f36057p6;
        if (v01Var != null && v01Var.f44561c != (o12 = org.telegram.ui.ActionBar.y6.o1(1.4f, org.telegram.ui.ActionBar.y6.b(-0.02f, 0.15f, i10)))) {
            v01Var.f44561c = o12;
            v01Var.invalidateSelf();
        }
    }

    @Override
    public final void setTranslationX(float f7) {
        super.setTranslationX(f7);
        int i10 = ProfileActivity.R6;
        ProfileActivity profileActivity = this.R0;
        profileActivity.h4();
        profileActivity.getClass();
        org.telegram.ui.Components.ox0 ox0Var = profileActivity.S;
        if (ox0Var != null) {
            ox0Var.setTranslationX(f7 - profileActivity.h4());
        }
    }

    @Override
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        int i10 = ProfileActivity.R6;
        ProfileActivity profileActivity = this.R0;
        if (profileActivity.S != null) {
            AndroidUtilities.dp(3.0f);
            profileActivity.S.getVisibilityFactor();
        }
        org.telegram.ui.Components.ox0 ox0Var = profileActivity.S;
        if (ox0Var != null) {
            ox0Var.setTranslationY(f7 - AndroidUtilities.dp(5.0f));
        }
    }

    @Override
    public final void z(float f7, int i10) {
        if (f7 == 1.0f) {
            this.Q0 = null;
            invalidate();
        }
    }
}
