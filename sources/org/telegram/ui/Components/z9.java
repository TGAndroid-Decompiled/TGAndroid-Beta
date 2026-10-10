package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class z9 extends Drawable implements Drawable.Callback {
    public static int[] f33537s;
    public final Context f33538a;
    public final q6 f33539b;
    public Drawable f33540c;
    public Drawable d;
    public int f33541e;
    public int f33542f;
    public int h;
    public int f33543n;
    public int f33544r;

    public z9(Context context) {
        this.f33538a = context;
        q6 q6Var = new q6(false, false, false);
        this.f33539b = q6Var;
        q6Var.x(AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
        q6Var.n(0.2f, 160L, is.h);
        q6Var.w(AndroidUtilities.dp(10.0f));
        q6Var.f30031b = 17;
        q6Var.setCallback(this);
        q6Var.T = true;
        if (f33537s != null) {
            return;
        }
        f33537s = new int[]{R.drawable.profile_level1_inner, R.drawable.profile_level1_outer, R.drawable.profile_level2_inner, R.drawable.profile_level2_outer, R.drawable.profile_level3_inner, R.drawable.profile_level3_outer, R.drawable.profile_level4_inner, R.drawable.profile_level4_outer, R.drawable.profile_level5_inner, R.drawable.profile_level5_outer, R.drawable.profile_level6_inner, R.drawable.profile_level6_outer, R.drawable.profile_level7_inner, R.drawable.profile_level7_outer, R.drawable.profile_level8_inner, R.drawable.profile_level8_outer, R.drawable.profile_level9_inner, R.drawable.profile_level9_outer, R.drawable.profile_level10_inner, R.drawable.profile_level10_outer, R.drawable.profile_level20_inner, R.drawable.profile_level20_outer, R.drawable.profile_level30_inner, R.drawable.profile_level30_outer, R.drawable.profile_level40_inner, R.drawable.profile_level40_outer, R.drawable.profile_level50_inner, R.drawable.profile_level50_outer, R.drawable.profile_level60_inner, R.drawable.profile_level60_outer, R.drawable.profile_level70_inner, R.drawable.profile_level70_outer, R.drawable.profile_level80_inner, R.drawable.profile_level80_outer, R.drawable.profile_level90_inner, R.drawable.profile_level90_outer, R.drawable.profile_level_minus_inner, R.drawable.profile_level_minus_outer};
    }

    @Override
    public final void draw(Canvas canvas) {
        Drawable drawable = this.d;
        if (drawable != null && this.f33540c != null) {
            drawable.draw(canvas);
            this.f33540c.draw(canvas);
            canvas.save();
            canvas.translate(getBounds().exactCenterX(), getBounds().exactCenterY());
            this.f33539b.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return AndroidUtilities.dp(24.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return AndroidUtilities.dp(24.0f);
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f33540c;
        if (drawable != null) {
            drawable.setBounds(getBounds());
        }
        Drawable drawable2 = this.d;
        if (drawable2 != null) {
            drawable2.setBounds(getBounds());
        }
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        scheduleSelf(runnable, j3);
    }

    @Override
    public final void setAlpha(int i10) {
        int k10 = i0.a.k(this.f33541e, i10);
        if (this.f33541e != k10) {
            this.f33541e = k10;
            Drawable drawable = this.f33540c;
            if (drawable != null) {
                drawable.setColorFilter(k10, PorterDuff.Mode.MULTIPLY);
                invalidateSelf();
            }
        }
        int k11 = i0.a.k(this.f33542f, i10);
        if (this.f33542f != k11) {
            this.f33542f = k11;
            if (this.f33540c != null) {
                this.d.setColorFilter(k11, PorterDuff.Mode.MULTIPLY);
                invalidateSelf();
            }
        }
        int k12 = i0.a.k(this.h, i10);
        if (this.h != k12) {
            this.h = k12;
            this.f33539b.v(k12, false);
            invalidateSelf();
        }
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
