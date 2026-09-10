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
public final class am0 extends Drawable implements Animator.AnimatorListener {
    public final Context f21537a;
    public ColorFilter f21538b;
    public Drawable d;
    public Drawable e;
    public ValueAnimator f21540f;
    public boolean f21542r;
    public int f21539c = 0;
    public float h = 1.0f;
    public final ArrayList f21541n = new ArrayList();

    public am0(Context context) {
        this.f21537a = context;
    }

    public final void a(int i10, boolean z10) {
        if (this.f21539c == i10) {
            return;
        }
        b(this.f21537a.getDrawable(i10).mutate(), z10);
        this.f21539c = i10;
    }

    public final void b(Drawable drawable, boolean z10) {
        if (drawable == null) {
            this.d = null;
            this.e = null;
            invalidateSelf();
            return;
        }
        z10 = (getBounds() == null || getBounds().isEmpty()) ? false : false;
        Drawable drawable2 = this.d;
        if (drawable == drawable2) {
            drawable2.setColorFilter(this.f21538b);
            return;
        }
        this.f21539c = 0;
        this.e = drawable2;
        this.d = drawable;
        drawable.setColorFilter(this.f21538b);
        c(this.d, getBounds());
        c(this.e, getBounds());
        ValueAnimator valueAnimator = this.f21540f;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f21540f.cancel();
        }
        if (!z10) {
            this.h = 1.0f;
            this.e = null;
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f21540f = ofFloat;
        ofFloat.addUpdateListener(new q70(this, 10));
        this.f21540f.addListener(this);
        this.f21540f.setDuration(150L);
        this.f21540f.start();
    }

    public final void c(Drawable drawable, Rect rect) {
        int height;
        int intrinsicHeight;
        int width;
        int intrinsicWidth;
        if (drawable == null) {
            return;
        }
        if (this.f21542r) {
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
            float f7 = this.h;
            canvas.scale(f7, f7, centerX, centerY);
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
        float f10 = this.h;
        if (f10 != 1.0f && this.e != null) {
            float f11 = 1.0f - f10;
            canvas.save();
            canvas.scale(f11, f11, centerX, centerY);
            this.e.setAlpha((int) (f11 * 255.0f));
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
        ArrayList arrayList = this.f21541n;
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
        this.f21538b = colorFilter;
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
