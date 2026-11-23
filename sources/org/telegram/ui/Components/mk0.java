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
public final class mk0 extends Drawable implements Animator.AnimatorListener {
    public final Context f37540a;
    public ColorFilter f37541b;
    public Drawable d;
    public Drawable f37543e;
    public ValueAnimator f37544f;
    public boolean f37546r;
    public int f37542c = 0;
    public float h = 1.0f;
    public final ArrayList f37545n = new ArrayList();

    public mk0(Context context) {
        this.f37540a = context;
    }

    public final void a(int i7, boolean z10) {
        if (this.f37542c == i7) {
            return;
        }
        b(this.f37540a.getDrawable(i7).mutate(), z10);
        this.f37542c = i7;
    }

    public final void b(Drawable drawable, boolean z10) {
        if (drawable == null) {
            this.d = null;
            this.f37543e = null;
            invalidateSelf();
            return;
        }
        if (getBounds() == null || getBounds().isEmpty()) {
            z10 = false;
        }
        Drawable drawable2 = this.d;
        if (drawable == drawable2) {
            drawable2.setColorFilter(this.f37541b);
            return;
        }
        this.f37542c = 0;
        this.f37543e = drawable2;
        this.d = drawable;
        drawable.setColorFilter(this.f37541b);
        c(this.d, getBounds());
        c(this.f37543e, getBounds());
        ValueAnimator valueAnimator = this.f37544f;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f37544f.cancel();
        }
        if (!z10) {
            this.h = 1.0f;
            this.f37543e = null;
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f37544f = ofFloat;
        ofFloat.addUpdateListener(new h60(this, 11));
        this.f37544f.addListener(this);
        this.f37544f.setDuration(150L);
        this.f37544f.start();
    }

    public final void c(Drawable drawable, Rect rect) {
        int height;
        int intrinsicHeight;
        int width;
        int intrinsicWidth;
        if (drawable == null) {
            return;
        }
        if (this.f37546r) {
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
        if (f11 != 1.0f && this.f37543e != null) {
            float f12 = 1.0f - f11;
            canvas.save();
            canvas.scale(f12, f12, centerX, centerY);
            this.f37543e.setAlpha((int) (f12 * 255.0f));
            this.f37543e.draw(canvas);
            canvas.restore();
            return;
        }
        Drawable drawable2 = this.f37543e;
        if (drawable2 != null) {
            drawable2.setAlpha(255);
            this.f37543e.draw(canvas);
        }
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void invalidateSelf() {
        super.invalidateSelf();
        ArrayList arrayList = this.f37545n;
        if (arrayList != null) {
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                ((View) arrayList.get(i7)).invalidate();
            }
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f37543e = null;
        invalidateSelf();
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        c(this.d, rect);
        c(this.f37543e, rect);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f37541b = colorFilter;
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        Drawable drawable2 = this.f37543e;
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
