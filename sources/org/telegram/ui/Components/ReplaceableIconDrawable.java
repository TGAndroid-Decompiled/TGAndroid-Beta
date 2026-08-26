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

public final class ReplaceableIconDrawable extends Drawable implements Animator.AnimatorListener {
    public ValueAnimator animation;
    public ColorFilter colorFilter;
    public final Context context;
    public Drawable currentDrawable;
    public boolean exactlyBounds;
    public Drawable outDrawable;
    public int currentResId = 0;
    public float progress = 1.0f;
    public final ArrayList parentViews = new ArrayList();

    public ReplaceableIconDrawable(Context context) {
        this.context = context;
    }

    @Override
    public final void draw(Canvas canvas) {
        int iCenterX = getBounds().centerX();
        int iCenterY = getBounds().centerY();
        if (this.progress == 1.0f || this.currentDrawable == null) {
            Drawable drawable = this.currentDrawable;
            if (drawable != null) {
                drawable.setAlpha(255);
                this.currentDrawable.draw(canvas);
            }
        } else {
            canvas.save();
            float f = this.progress;
            canvas.scale(f, f, iCenterX, iCenterY);
            this.currentDrawable.setAlpha((int) (this.progress * 255.0f));
            this.currentDrawable.draw(canvas);
            canvas.restore();
        }
        float f2 = this.progress;
        if (f2 == 1.0f || this.outDrawable == null) {
            Drawable drawable2 = this.outDrawable;
            if (drawable2 != null) {
                drawable2.setAlpha(255);
                this.outDrawable.draw(canvas);
                return;
            }
            return;
        }
        float f3 = 1.0f - f2;
        canvas.save();
        canvas.scale(f3, f3, iCenterX, iCenterY);
        this.outDrawable.setAlpha((int) (f3 * 255.0f));
        this.outDrawable.draw(canvas);
        canvas.restore();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void invalidateSelf() {
        super.invalidateSelf();
        ArrayList arrayList = this.parentViews;
        if (arrayList != null) {
            for (int i = 0; i < arrayList.size(); i++) {
                ((View) arrayList.get(i)).invalidate();
            }
        }
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.outDrawable = null;
        invalidateSelf();
    }

    @Override
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override
    public final void onAnimationStart(Animator animator) {
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        updateBounds(this.currentDrawable, rect);
        updateBounds(this.outDrawable, rect);
    }

    @Override
    public final void setAlpha(int i) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.colorFilter = colorFilter;
        Drawable drawable = this.currentDrawable;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        Drawable drawable2 = this.outDrawable;
        if (drawable2 != null) {
            drawable2.setColorFilter(colorFilter);
        }
        invalidateSelf();
    }

    public final void setIcon(int i, boolean z) {
        if (this.currentResId == i) {
            return;
        }
        setIcon(this.context.getDrawable(i).mutate(), z);
        this.currentResId = i;
    }

    public final void updateBounds(Drawable drawable, Rect rect) {
        int iHeight;
        int intrinsicHeight;
        int iWidth;
        int intrinsicWidth;
        if (drawable == null) {
            return;
        }
        if (this.exactlyBounds) {
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

    public final void setIcon(Drawable drawable, boolean z) {
        if (drawable == null) {
            this.currentDrawable = null;
            this.outDrawable = null;
            invalidateSelf();
            return;
        }
        if (getBounds() == null || getBounds().isEmpty()) {
            z = false;
        }
        Drawable drawable2 = this.currentDrawable;
        if (drawable == drawable2) {
            drawable2.setColorFilter(this.colorFilter);
            return;
        }
        this.currentResId = 0;
        this.outDrawable = drawable2;
        this.currentDrawable = drawable;
        drawable.setColorFilter(this.colorFilter);
        updateBounds(this.currentDrawable, getBounds());
        updateBounds(this.outDrawable, getBounds());
        ValueAnimator valueAnimator = this.animation;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.animation.cancel();
        }
        if (!z) {
            this.progress = 1.0f;
            this.outDrawable = null;
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.animation = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ScrimOptions$$ExternalSyntheticLambda2(this, 10));
        this.animation.addListener(this);
        this.animation.setDuration(150L);
        this.animation.start();
    }
}
