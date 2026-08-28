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
public final class bl0 extends Drawable implements Animator.AnimatorListener {
    public final Context f27236a;
    public ColorFilter f27237b;
    public Drawable d;
    public Drawable f27239e;
    public ValueAnimator f27240f;
    public boolean f27242r;
    public int f27238c = 0;
    public float h = 1.0f;
    public final ArrayList f27241n = new ArrayList();

    public bl0(Context context) {
        this.f27236a = context;
    }

    public final void a(int i9, boolean z10) {
        if (this.f27238c == i9) {
            return;
        }
        b(this.f27236a.getDrawable(i9).mutate(), z10);
        this.f27238c = i9;
    }

    public final void b(Drawable drawable, boolean z10) {
        if (drawable == null) {
            this.d = null;
            this.f27239e = null;
            invalidateSelf();
            return;
        }
        z10 = (getBounds() == null || getBounds().isEmpty()) ? false : false;
        Drawable drawable2 = this.d;
        if (drawable == drawable2) {
            drawable2.setColorFilter(this.f27237b);
            return;
        }
        this.f27238c = 0;
        this.f27239e = drawable2;
        this.d = drawable;
        drawable.setColorFilter(this.f27237b);
        c(this.d, getBounds());
        c(this.f27239e, getBounds());
        ValueAnimator valueAnimator = this.f27240f;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f27240f.cancel();
        }
        if (!z10) {
            this.h = 1.0f;
            this.f27239e = null;
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f27240f = ofFloat;
        ofFloat.addUpdateListener(new q60(this, 10));
        this.f27240f.addListener(this);
        this.f27240f.setDuration(150L);
        this.f27240f.start();
    }

    public final void c(Drawable drawable, Rect rect) {
        int height;
        int intrinsicHeight;
        int width;
        int intrinsicWidth;
        if (drawable == null) {
            return;
        }
        if (this.f27242r) {
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
        if (f11 != 1.0f && this.f27239e != null) {
            float f12 = 1.0f - f11;
            canvas.save();
            canvas.scale(f12, f12, centerX, centerY);
            this.f27239e.setAlpha((int) (f12 * 255.0f));
            this.f27239e.draw(canvas);
            canvas.restore();
            return;
        }
        Drawable drawable2 = this.f27239e;
        if (drawable2 != null) {
            drawable2.setAlpha(255);
            this.f27239e.draw(canvas);
        }
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void invalidateSelf() {
        super.invalidateSelf();
        ArrayList arrayList = this.f27241n;
        if (arrayList != null) {
            for (int i9 = 0; i9 < arrayList.size(); i9++) {
                ((View) arrayList.get(i9)).invalidate();
            }
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f27239e = null;
        invalidateSelf();
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        c(this.d, rect);
        c(this.f27239e, rect);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f27237b = colorFilter;
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        Drawable drawable2 = this.f27239e;
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
    public final void setAlpha(int i9) {
    }
}
