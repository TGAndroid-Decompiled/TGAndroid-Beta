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
    public static int[] f35259s;
    public final Context f35260a;
    public final r6 f35261b;
    public Drawable f35262c;
    public Drawable d;
    public int e;
    public int f35263f;
    public int h;
    public int f35264n;
    public int f35265r;

    public z9(Context context) {
        this.f35260a = context;
        r6 r6Var = new r6(false, false, false);
        this.f35261b = r6Var;
        r6Var.x(AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
        r6Var.n(0.2f, 160L, ds.h);
        r6Var.w(AndroidUtilities.dp(10.0f));
        r6Var.f32119b = 17;
        r6Var.setCallback(this);
        r6Var.T = true;
        if (f35259s != null) {
            return;
        }
        f35259s = new int[]{R.drawable.profile_level1_inner, R.drawable.profile_level1_outer, R.drawable.profile_level2_inner, R.drawable.profile_level2_outer, R.drawable.profile_level3_inner, R.drawable.profile_level3_outer, R.drawable.profile_level4_inner, R.drawable.profile_level4_outer, R.drawable.profile_level5_inner, R.drawable.profile_level5_outer, R.drawable.profile_level6_inner, R.drawable.profile_level6_outer, R.drawable.profile_level7_inner, R.drawable.profile_level7_outer, R.drawable.profile_level8_inner, R.drawable.profile_level8_outer, R.drawable.profile_level9_inner, R.drawable.profile_level9_outer, R.drawable.profile_level10_inner, R.drawable.profile_level10_outer, R.drawable.profile_level20_inner, R.drawable.profile_level20_outer, R.drawable.profile_level30_inner, R.drawable.profile_level30_outer, R.drawable.profile_level40_inner, R.drawable.profile_level40_outer, R.drawable.profile_level50_inner, R.drawable.profile_level50_outer, R.drawable.profile_level60_inner, R.drawable.profile_level60_outer, R.drawable.profile_level70_inner, R.drawable.profile_level70_outer, R.drawable.profile_level80_inner, R.drawable.profile_level80_outer, R.drawable.profile_level90_inner, R.drawable.profile_level90_outer, R.drawable.profile_level_minus_inner, R.drawable.profile_level_minus_outer};
    }

    @Override
    public final void draw(Canvas canvas) {
        Drawable drawable = this.d;
        if (drawable != null && this.f35262c != null) {
            drawable.draw(canvas);
            this.f35262c.draw(canvas);
            canvas.save();
            canvas.translate(getBounds().exactCenterX(), getBounds().exactCenterY());
            this.f35261b.draw(canvas);
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
        Drawable drawable = this.f35262c;
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
        int o10 = i0.a.o(this.e, i10);
        if (this.e != o10) {
            this.e = o10;
            Drawable drawable = this.f35262c;
            if (drawable != null) {
                drawable.setColorFilter(o10, PorterDuff.Mode.MULTIPLY);
                invalidateSelf();
            }
        }
        int o11 = i0.a.o(this.f35263f, i10);
        if (this.f35263f != o11) {
            this.f35263f = o11;
            if (this.f35262c != null) {
                this.d.setColorFilter(o11, PorterDuff.Mode.MULTIPLY);
                invalidateSelf();
            }
        }
        int o12 = i0.a.o(this.h, i10);
        if (this.h != o12) {
            this.h = o12;
            this.f35261b.v(o12, false);
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
