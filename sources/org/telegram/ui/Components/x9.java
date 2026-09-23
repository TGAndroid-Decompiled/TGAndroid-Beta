package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class x9 extends Drawable implements Drawable.Callback {
    public static int[] f29968s;
    public final Context f29969a;
    public final o6 f29970b;
    public Drawable f29971c;
    public Drawable d;
    public int e;
    public int f29972f;
    public int h;
    public int f29973n;
    public int f29974r;

    public x9(Context context) {
        this.f29969a = context;
        o6 o6Var = new o6(false, false, false, false);
        this.f29970b = o6Var;
        o6Var.u(AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
        o6Var.k(0.2f, 160L, rr.h);
        o6Var.t(AndroidUtilities.dp(10.0f));
        o6Var.f26614b = 17;
        o6Var.setCallback(this);
        o6Var.N = true;
        if (f29968s != null) {
            return;
        }
        f29968s = new int[]{R.drawable.profile_level1_inner, R.drawable.profile_level1_outer, R.drawable.profile_level2_inner, R.drawable.profile_level2_outer, R.drawable.profile_level3_inner, R.drawable.profile_level3_outer, R.drawable.profile_level4_inner, R.drawable.profile_level4_outer, R.drawable.profile_level5_inner, R.drawable.profile_level5_outer, R.drawable.profile_level6_inner, R.drawable.profile_level6_outer, R.drawable.profile_level7_inner, R.drawable.profile_level7_outer, R.drawable.profile_level8_inner, R.drawable.profile_level8_outer, R.drawable.profile_level9_inner, R.drawable.profile_level9_outer, R.drawable.profile_level10_inner, R.drawable.profile_level10_outer, R.drawable.profile_level20_inner, R.drawable.profile_level20_outer, R.drawable.profile_level30_inner, R.drawable.profile_level30_outer, R.drawable.profile_level40_inner, R.drawable.profile_level40_outer, R.drawable.profile_level50_inner, R.drawable.profile_level50_outer, R.drawable.profile_level60_inner, R.drawable.profile_level60_outer, R.drawable.profile_level70_inner, R.drawable.profile_level70_outer, R.drawable.profile_level80_inner, R.drawable.profile_level80_outer, R.drawable.profile_level90_inner, R.drawable.profile_level90_outer, R.drawable.profile_level_minus_inner, R.drawable.profile_level_minus_outer};
    }

    @Override
    public final void draw(Canvas canvas) {
        Drawable drawable = this.d;
        if (drawable != null && this.f29971c != null) {
            drawable.draw(canvas);
            this.f29971c.draw(canvas);
            canvas.save();
            canvas.translate(getBounds().exactCenterX(), getBounds().exactCenterY());
            this.f29970b.draw(canvas);
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
        Drawable drawable = this.f29971c;
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
        int k10 = i0.a.k(this.e, i10);
        if (this.e != k10) {
            this.e = k10;
            Drawable drawable = this.f29971c;
            if (drawable != null) {
                drawable.setColorFilter(k10, PorterDuff.Mode.MULTIPLY);
                invalidateSelf();
            }
        }
        int k11 = i0.a.k(this.f29972f, i10);
        if (this.f29972f != k11) {
            this.f29972f = k11;
            if (this.f29971c != null) {
                this.d.setColorFilter(k11, PorterDuff.Mode.MULTIPLY);
                invalidateSelf();
            }
        }
        int k12 = i0.a.k(this.h, i10);
        if (this.h != k12) {
            this.h = k12;
            this.f29970b.s(k12, false);
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
