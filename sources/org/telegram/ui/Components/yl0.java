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
public final class yl0 extends Drawable implements Animator.AnimatorListener {
    public final Context f31044a;
    public ColorFilter f31045b;
    public Drawable d;
    public Drawable e;
    public ValueAnimator f31047f;
    public boolean f31049r;
    public int f31046c = 0;
    public float h = 1.0f;
    public final ArrayList f31048n = new ArrayList();

    public yl0(Context context) {
        this.f31044a = context;
    }

    public final void a(int i10, boolean z4) {
        if (this.f31046c == i10) {
            return;
        }
        b(this.f31044a.getDrawable(i10).mutate(), z4);
        this.f31046c = i10;
    }

    public final void b(Drawable drawable, boolean z4) {
        if (drawable == null) {
            this.d = null;
            this.e = null;
            invalidateSelf();
            return;
        }
        z4 = (getBounds() == null || getBounds().isEmpty()) ? false : false;
        Drawable drawable2 = this.d;
        if (drawable == drawable2) {
            drawable2.setColorFilter(this.f31045b);
            return;
        }
        this.f31046c = 0;
        this.e = drawable2;
        this.d = drawable;
        drawable.setColorFilter(this.f31045b);
        c(this.d, getBounds());
        c(this.e, getBounds());
        ValueAnimator valueAnimator = this.f31047f;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f31047f.cancel();
        }
        if (!z4) {
            this.h = 1.0f;
            this.e = null;
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f31047f = ofFloat;
        ofFloat.addUpdateListener(new i70(this, 10));
        this.f31047f.addListener(this);
        this.f31047f.setDuration(150L);
        this.f31047f.start();
    }

    public final void c(Drawable drawable, Rect rect) {
        int height;
        int intrinsicHeight;
        int width;
        int intrinsicWidth;
        if (drawable == null) {
            return;
        }
        if (this.f31049r) {
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
        if (f11 != 1.0f && this.e != null) {
            float f12 = 1.0f - f11;
            canvas.save();
            canvas.scale(f12, f12, centerX, centerY);
            this.e.setAlpha((int) (f12 * 255.0f));
            this.e.draw(canvas);
            canvas.restore();
            return;
        }
        Drawable drawable2 = this.e;
        if (drawable2 != null) {
            drawable2.setAlpha(255);
            this.e.draw(canvas);
        }
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void invalidateSelf() {
        super.invalidateSelf();
        ArrayList arrayList = this.f31048n;
        if (arrayList != null) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((View) arrayList.get(i10)).invalidate();
            }
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.e = null;
        invalidateSelf();
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        c(this.d, rect);
        c(this.e, rect);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f31045b = colorFilter;
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        Drawable drawable2 = this.e;
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
    public final void setAlpha(int i10) {
    }
}
