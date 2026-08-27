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

public final class el0 extends Drawable implements Animator.AnimatorListener {

    public final Context f28079a;

    public ColorFilter f28080b;
    public Drawable d;

    public Drawable f28082e;

    public ValueAnimator f28083f;

    public boolean f28085r;

    public int f28081c = 0;
    public float h = 1.0f;

    public final ArrayList f28084n = new ArrayList();

    public el0(Context context) {
        this.f28079a = context;
    }

    public final void a(int i10, boolean z10) {
        if (this.f28081c == i10) {
            return;
        }
        b(this.f28079a.getDrawable(i10).mutate(), z10);
        this.f28081c = i10;
    }

    public final void b(Drawable drawable, boolean z10) {
        if (drawable == null) {
            this.d = null;
            this.f28082e = null;
            invalidateSelf();
            return;
        }
        if (getBounds() == null || getBounds().isEmpty()) {
            z10 = false;
        }
        Drawable drawable2 = this.d;
        if (drawable == drawable2) {
            drawable2.setColorFilter(this.f28080b);
            return;
        }
        this.f28081c = 0;
        this.f28082e = drawable2;
        this.d = drawable;
        drawable.setColorFilter(this.f28080b);
        c(this.d, getBounds());
        c(this.f28082e, getBounds());
        ValueAnimator valueAnimator = this.f28083f;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f28083f.cancel();
        }
        if (!z10) {
            this.h = 1.0f;
            this.f28082e = null;
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f28083f = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new v60(this, 10));
        this.f28083f.addListener(this);
        this.f28083f.setDuration(150L);
        this.f28083f.start();
    }

    public final void c(Drawable drawable, Rect rect) {
        int iHeight;
        int intrinsicHeight;
        int iWidth;
        int intrinsicWidth;
        if (drawable == null) {
            return;
        }
        if (this.f28085r) {
            drawable.setBounds(rect);
            return;
        }
        if (drawable.getIntrinsicHeight() < 0) {
            iHeight = rect.top;
            intrinsicHeight = rect.bottom;
        } else {
            iHeight = ((rect.height() - drawable.getIntrinsicHeight()) / 2) + rect.top;
            intrinsicHeight = drawable.getIntrinsicHeight() + iHeight;
        }
        if (drawable.getIntrinsicWidth() < 0) {
            iWidth = rect.left;
            intrinsicWidth = rect.right;
        } else {
            iWidth = ((rect.width() - drawable.getIntrinsicWidth()) / 2) + rect.left;
            intrinsicWidth = drawable.getIntrinsicWidth() + iWidth;
        }
        drawable.setBounds(iWidth, iHeight, intrinsicWidth, intrinsicHeight);
    }

    @Override
    public final void draw(Canvas canvas) {
        int iCenterX = getBounds().centerX();
        int iCenterY = getBounds().centerY();
        if (this.h == 1.0f || this.d == null) {
            Drawable drawable = this.d;
            if (drawable != null) {
                drawable.setAlpha(255);
                this.d.draw(canvas);
            }
        } else {
            canvas.save();
            float f10 = this.h;
            canvas.scale(f10, f10, iCenterX, iCenterY);
            this.d.setAlpha((int) (this.h * 255.0f));
            this.d.draw(canvas);
            canvas.restore();
        }
        float f11 = this.h;
        if (f11 == 1.0f || this.f28082e == null) {
            Drawable drawable2 = this.f28082e;
            if (drawable2 != null) {
                drawable2.setAlpha(255);
                this.f28082e.draw(canvas);
                return;
            }
            return;
        }
        float f12 = 1.0f - f11;
        canvas.save();
        canvas.scale(f12, f12, iCenterX, iCenterY);
        this.f28082e.setAlpha((int) (f12 * 255.0f));
        this.f28082e.draw(canvas);
        canvas.restore();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void invalidateSelf() {
        super.invalidateSelf();
        ArrayList arrayList = this.f28084n;
        if (arrayList != null) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((View) arrayList.get(i10)).invalidate();
            }
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f28082e = null;
        invalidateSelf();
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        c(this.d, rect);
        c(this.f28082e, rect);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f28080b = colorFilter;
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        Drawable drawable2 = this.f28082e;
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
