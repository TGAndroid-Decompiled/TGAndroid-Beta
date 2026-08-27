package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

public final class o9 extends Drawable implements Drawable.Callback {

    public static int[] f31228s;

    public final Context f31229a;

    public final i6 f31230b;

    public Drawable f31231c;
    public Drawable d;

    public int f31232e;

    public int f31233f;
    public int h;

    public int f31234n;

    public int f31235r;

    public o9(Context context) {
        this.f31229a = context;
        i6 i6Var = new i6(false, false, false, false);
        this.f31230b = i6Var;
        i6Var.u(AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
        i6Var.k(0.2f, 160L, er.h);
        i6Var.t(AndroidUtilities.dp(10.0f));
        i6Var.f29239b = 17;
        i6Var.setCallback(this);
        i6Var.N = true;
        if (f31228s != null) {
            return;
        }
        f31228s = new int[]{R.drawable.profile_level1_inner, R.drawable.profile_level1_outer, R.drawable.profile_level2_inner, R.drawable.profile_level2_outer, R.drawable.profile_level3_inner, R.drawable.profile_level3_outer, R.drawable.profile_level4_inner, R.drawable.profile_level4_outer, R.drawable.profile_level5_inner, R.drawable.profile_level5_outer, R.drawable.profile_level6_inner, R.drawable.profile_level6_outer, R.drawable.profile_level7_inner, R.drawable.profile_level7_outer, R.drawable.profile_level8_inner, R.drawable.profile_level8_outer, R.drawable.profile_level9_inner, R.drawable.profile_level9_outer, R.drawable.profile_level10_inner, R.drawable.profile_level10_outer, R.drawable.profile_level20_inner, R.drawable.profile_level20_outer, R.drawable.profile_level30_inner, R.drawable.profile_level30_outer, R.drawable.profile_level40_inner, R.drawable.profile_level40_outer, R.drawable.profile_level50_inner, R.drawable.profile_level50_outer, R.drawable.profile_level60_inner, R.drawable.profile_level60_outer, R.drawable.profile_level70_inner, R.drawable.profile_level70_outer, R.drawable.profile_level80_inner, R.drawable.profile_level80_outer, R.drawable.profile_level90_inner, R.drawable.profile_level90_outer, R.drawable.profile_level_minus_inner, R.drawable.profile_level_minus_outer};
    }

    @Override
    public final void draw(Canvas canvas) {
        Drawable drawable = this.d;
        if (drawable == null || this.f31231c == null) {
            return;
        }
        drawable.draw(canvas);
        this.f31231c.draw(canvas);
        canvas.save();
        canvas.translate(getBounds().exactCenterX(), getBounds().exactCenterY());
        this.f31230b.draw(canvas);
        canvas.restore();
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
        Drawable drawable = this.f31231c;
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
        int iK = i0.b.k(this.f31232e, i10);
        if (this.f31232e != iK) {
            this.f31232e = iK;
            Drawable drawable = this.f31231c;
            if (drawable != null) {
                drawable.setColorFilter(iK, PorterDuff.Mode.MULTIPLY);
                invalidateSelf();
            }
        }
        int iK2 = i0.b.k(this.f31233f, i10);
        if (this.f31233f != iK2) {
            this.f31233f = iK2;
            if (this.f31231c != null) {
                this.d.setColorFilter(iK2, PorterDuff.Mode.MULTIPLY);
                invalidateSelf();
            }
        }
        int iK3 = i0.b.k(this.h, i10);
        if (this.h != iK3) {
            this.h = iK3;
            this.f31230b.s(iK3, false);
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
