package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
public final class ck0 extends Drawable implements Animator.AnimatorListener {
    public final Context f33621a;
    public ColorFilter f33622b;
    public Drawable d;
    public Drawable f33624e;
    public ValueAnimator f33625f;
    public boolean f33627r;
    public int f33623c = 0;
    public float h = 1.0f;
    public final ArrayList f33626n = new ArrayList();

    public ck0(Context context) {
        this.f33621a = context;
    }

    public final void a(int i7, boolean z10) {
        if (this.f33623c == i7) {
            return;
        }
        b(this.f33621a.getDrawable(i7).mutate(), z10);
        this.f33623c = i7;
    }

    public final void b(Drawable drawable, boolean z10) {
        if (drawable == null) {
            this.d = null;
            this.f33624e = null;
            invalidateSelf();
            return;
        }
        if (getBounds() == null || getBounds().isEmpty()) {
            z10 = false;
        }
        Drawable drawable2 = this.d;
        if (drawable == drawable2) {
            drawable2.setColorFilter(this.f33622b);
            return;
        }
        this.f33623c = 0;
        this.f33624e = drawable2;
        this.d = drawable;
        drawable.setColorFilter(this.f33622b);
        c(this.d, getBounds());
        c(this.f33624e, getBounds());
        ValueAnimator valueAnimator = this.f33625f;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f33625f.cancel();
        }
        if (!z10) {
            this.h = 1.0f;
            this.f33624e = null;
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f33625f = ofFloat;
        ofFloat.addUpdateListener(new f60(this, 9));
        this.f33625f.addListener(this);
        this.f33625f.setDuration(150L);
        this.f33625f.start();
    }

    public final void c(Drawable drawable, Rect rect) {
        int height;
        int intrinsicHeight;
        int width;
        int intrinsicWidth;
        if (drawable == null) {
            return;
        }
        if (this.f33627r) {
            drawable.setBounds(rect);
            return;
        }
        if (drawable.getIntrinsicHeight() < 0) {
            height = rect.top;
            intrinsicHeight = rect.bottom;
        } else {
            height = ((rect.height() - drawable.getIntrinsicHeight()) / 2) + rect.top;
            intrinsicHeight = drawable.getIntrinsicHeight() + height;
        }
        if (drawable.getIntrinsicWidth() < 0) {
            width = rect.left;
            intrinsicWidth = rect.right;
        } else {
            width = ((rect.width() - drawable.getIntrinsicWidth()) / 2) + rect.left;
            intrinsicWidth = drawable.getIntrinsicWidth() + width;
        }
        drawable.setBounds(width, height, intrinsicWidth, intrinsicHeight);
    }

    @Override
    public final void draw(Canvas canvas) {
        int centerX = getBounds().centerX();
        int centerY = getBounds().centerY();
        if (this.h != 1.0f && this.d != null) {
            canvas.save();
            float f10 = this.h;
            canvas.scale(f10, f10, centerX, centerY);
            this.d.setAlpha((int) (this.h * 255.0f));
            this.d.draw(canvas);
            canvas.restore();
        } else {
            Drawable drawable = this.d;
            if (drawable != null) {
                drawable.setAlpha(255);
                this.d.draw(canvas);
            }
        }
        float f11 = this.h;
        if (f11 != 1.0f && this.f33624e != null) {
            float f12 = 1.0f - f11;
            canvas.save();
            canvas.scale(f12, f12, centerX, centerY);
            this.f33624e.setAlpha((int) (f12 * 255.0f));
            this.f33624e.draw(canvas);
            canvas.restore();
            return;
        }
        Drawable drawable2 = this.f33624e;
        if (drawable2 != null) {
            drawable2.setAlpha(255);
            this.f33624e.draw(canvas);
        }
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void invalidateSelf() {
        super.invalidateSelf();
        ArrayList arrayList = this.f33626n;
        if (arrayList != null) {
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                ((View) arrayList.get(i7)).invalidate();
            }
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f33624e = null;
        invalidateSelf();
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        c(this.d, rect);
        c(this.f33624e, rect);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f33622b = colorFilter;
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        Drawable drawable2 = this.f33624e;
        if (drawable2 != null) {
            drawable2.setColorFilter(colorFilter);
        }
        invalidateSelf();
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
    }

    @Override
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override
    public final void onAnimationStart(Animator animator) {
    }

    @Override
    public final void setAlpha(int i7) {
    }
}
