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
public final class bk0 extends Drawable implements Animator.AnimatorListener {
    public final Context f32307a;
    public ColorFilter f32308b;
    public Drawable d;
    public Drawable f32310e;
    public ValueAnimator f32311f;
    public boolean f32313r;
    public int f32309c = 0;
    public float h = 1.0f;
    public final ArrayList f32312n = new ArrayList();

    public bk0(Context context) {
        this.f32307a = context;
    }

    public final void a(int i3, boolean z10) {
        if (this.f32309c == i3) {
            return;
        }
        b(this.f32307a.getDrawable(i3).mutate(), z10);
        this.f32309c = i3;
    }

    public final void b(Drawable drawable, boolean z10) {
        if (drawable == null) {
            this.d = null;
            this.f32310e = null;
            invalidateSelf();
            return;
        }
        if (getBounds() == null || getBounds().isEmpty()) {
            z10 = false;
        }
        Drawable drawable2 = this.d;
        if (drawable == drawable2) {
            drawable2.setColorFilter(this.f32308b);
            return;
        }
        this.f32309c = 0;
        this.f32310e = drawable2;
        this.d = drawable;
        drawable.setColorFilter(this.f32308b);
        c(this.d, getBounds());
        c(this.f32310e, getBounds());
        ValueAnimator valueAnimator = this.f32311f;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f32311f.cancel();
        }
        if (!z10) {
            this.h = 1.0f;
            this.f32310e = null;
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f32311f = ofFloat;
        ofFloat.addUpdateListener(new y50(this, 10));
        this.f32311f.addListener(this);
        this.f32311f.setDuration(150L);
        this.f32311f.start();
    }

    public final void c(Drawable drawable, Rect rect) {
        int height;
        int intrinsicHeight;
        int width;
        int intrinsicWidth;
        if (drawable == null) {
            return;
        }
        if (this.f32313r) {
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
        if (f11 != 1.0f && this.f32310e != null) {
            float f12 = 1.0f - f11;
            canvas.save();
            canvas.scale(f12, f12, centerX, centerY);
            this.f32310e.setAlpha((int) (f12 * 255.0f));
            this.f32310e.draw(canvas);
            canvas.restore();
            return;
        }
        Drawable drawable2 = this.f32310e;
        if (drawable2 != null) {
            drawable2.setAlpha(255);
            this.f32310e.draw(canvas);
        }
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void invalidateSelf() {
        super.invalidateSelf();
        ArrayList arrayList = this.f32312n;
        if (arrayList != null) {
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                ((View) arrayList.get(i3)).invalidate();
            }
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f32310e = null;
        invalidateSelf();
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        c(this.d, rect);
        c(this.f32310e, rect);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f32308b = colorFilter;
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        Drawable drawable2 = this.f32310e;
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
    public final void setAlpha(int i3) {
    }
}
