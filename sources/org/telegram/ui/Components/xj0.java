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
public final class xj0 extends Drawable implements Animator.AnimatorListener {
    public final Context f40314a;
    public ColorFilter f40315b;
    public Drawable d;
    public Drawable f40317e;
    public ValueAnimator f40318f;
    public boolean f40320r;
    public int f40316c = 0;
    public float h = 1.0f;
    public final ArrayList f40319n = new ArrayList();

    public xj0(Context context) {
        this.f40314a = context;
    }

    public final void a(int i7, boolean z9) {
        if (this.f40316c == i7) {
            return;
        }
        b(this.f40314a.getDrawable(i7).mutate(), z9);
        this.f40316c = i7;
    }

    public final void b(Drawable drawable, boolean z9) {
        if (drawable == null) {
            this.d = null;
            this.f40317e = null;
            invalidateSelf();
            return;
        }
        if (getBounds() == null || getBounds().isEmpty()) {
            z9 = false;
        }
        Drawable drawable2 = this.d;
        if (drawable == drawable2) {
            drawable2.setColorFilter(this.f40315b);
            return;
        }
        this.f40316c = 0;
        this.f40317e = drawable2;
        this.d = drawable;
        drawable.setColorFilter(this.f40315b);
        c(this.d, getBounds());
        c(this.f40317e, getBounds());
        ValueAnimator valueAnimator = this.f40318f;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f40318f.cancel();
        }
        if (!z9) {
            this.h = 1.0f;
            this.f40317e = null;
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f40318f = ofFloat;
        ofFloat.addUpdateListener(new c60(this, 9));
        this.f40318f.addListener(this);
        this.f40318f.setDuration(150L);
        this.f40318f.start();
    }

    public final void c(Drawable drawable, Rect rect) {
        int height;
        int intrinsicHeight;
        int width;
        int intrinsicWidth;
        if (drawable == null) {
            return;
        }
        if (this.f40320r) {
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
        if (f11 != 1.0f && this.f40317e != null) {
            float f12 = 1.0f - f11;
            canvas.save();
            canvas.scale(f12, f12, centerX, centerY);
            this.f40317e.setAlpha((int) (f12 * 255.0f));
            this.f40317e.draw(canvas);
            canvas.restore();
            return;
        }
        Drawable drawable2 = this.f40317e;
        if (drawable2 != null) {
            drawable2.setAlpha(255);
            this.f40317e.draw(canvas);
        }
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void invalidateSelf() {
        super.invalidateSelf();
        ArrayList arrayList = this.f40319n;
        if (arrayList != null) {
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                ((View) arrayList.get(i7)).invalidate();
            }
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f40317e = null;
        invalidateSelf();
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        c(this.d, rect);
        c(this.f40317e, rect);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f40315b = colorFilter;
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        Drawable drawable2 = this.f40317e;
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
