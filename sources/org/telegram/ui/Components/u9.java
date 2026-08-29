package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class u9 extends Drawable implements Drawable.Callback {
    public static int[] f33171s;
    public final Context f33172a;
    public final n6 f33173b;
    public Drawable f33174c;
    public Drawable d;
    public int f33175e;
    public int f33176f;
    public int h;
    public int f33177n;
    public int f33178r;

    public u9(Context context) {
        this.f33172a = context;
        n6 n6Var = new n6(false, false, false, false);
        this.f33173b = n6Var;
        n6Var.u(AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
        n6Var.k(0.2f, 160L, jr.h);
        n6Var.t(AndroidUtilities.dp(10.0f));
        n6Var.f30862b = 17;
        n6Var.setCallback(this);
        n6Var.N = true;
        if (f33171s != null) {
            return;
        }
        f33171s = new int[]{R.drawable.profile_level1_inner, R.drawable.profile_level1_outer, R.drawable.profile_level2_inner, R.drawable.profile_level2_outer, R.drawable.profile_level3_inner, R.drawable.profile_level3_outer, R.drawable.profile_level4_inner, R.drawable.profile_level4_outer, R.drawable.profile_level5_inner, R.drawable.profile_level5_outer, R.drawable.profile_level6_inner, R.drawable.profile_level6_outer, R.drawable.profile_level7_inner, R.drawable.profile_level7_outer, R.drawable.profile_level8_inner, R.drawable.profile_level8_outer, R.drawable.profile_level9_inner, R.drawable.profile_level9_outer, R.drawable.profile_level10_inner, R.drawable.profile_level10_outer, R.drawable.profile_level20_inner, R.drawable.profile_level20_outer, R.drawable.profile_level30_inner, R.drawable.profile_level30_outer, R.drawable.profile_level40_inner, R.drawable.profile_level40_outer, R.drawable.profile_level50_inner, R.drawable.profile_level50_outer, R.drawable.profile_level60_inner, R.drawable.profile_level60_outer, R.drawable.profile_level70_inner, R.drawable.profile_level70_outer, R.drawable.profile_level80_inner, R.drawable.profile_level80_outer, R.drawable.profile_level90_inner, R.drawable.profile_level90_outer, R.drawable.profile_level_minus_inner, R.drawable.profile_level_minus_outer};
    }

    @Override
    public final void draw(Canvas canvas) {
        Drawable drawable = this.d;
        if (drawable != null && this.f33174c != null) {
            drawable.draw(canvas);
            this.f33174c.draw(canvas);
            canvas.save();
            canvas.translate(getBounds().exactCenterX(), getBounds().exactCenterY());
            this.f33173b.draw(canvas);
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
        Drawable drawable = this.f33174c;
        if (drawable != null) {
            drawable.setBounds(getBounds());
        }
        Drawable drawable2 = this.d;
        if (drawable2 != null) {
            drawable2.setBounds(getBounds());
        }
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        scheduleSelf(runnable, j10);
    }

    @Override
    public final void setAlpha(int i10) {
        int k9 = i0.a.k(this.f33175e, i10);
        if (this.f33175e != k9) {
            this.f33175e = k9;
            Drawable drawable = this.f33174c;
            if (drawable != null) {
                drawable.setColorFilter(k9, PorterDuff.Mode.MULTIPLY);
                invalidateSelf();
            }
        }
        int k10 = i0.a.k(this.f33176f, i10);
        if (this.f33176f != k10) {
            this.f33176f = k10;
            if (this.f33174c != null) {
                this.d.setColorFilter(k10, PorterDuff.Mode.MULTIPLY);
                invalidateSelf();
            }
        }
        int k11 = i0.a.k(this.h, i10);
        if (this.h != k11) {
            this.h = k11;
            this.f33173b.s(k11, false);
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
