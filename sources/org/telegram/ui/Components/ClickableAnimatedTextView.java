package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.StateSet;
import android.view.MotionEvent;

public final class ClickableAnimatedTextView extends AnimatedTextView {
    public Drawable backgroundDrawable;
    public final Rect bounds;
    public boolean pressed;

    public ClickableAnimatedTextView(Context context) {
        super(context, false, false, false);
        this.bounds = new Rect();
    }

    public Rect getClickBounds() {
        return this.bounds;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.backgroundDrawable != null) {
            Rect bounds = getDrawable().getBounds();
            Rect rect = this.bounds;
            rect.set(bounds);
            int iCeil = (int) Math.ceil(getDrawable().getCurrentWidth());
            if (getDrawable().gravity == 3) {
                rect.right = rect.left + iCeil;
            } else if (getDrawable().gravity == 5) {
                rect.left = rect.right - iCeil;
            } else if (getDrawable().gravity == 17) {
                int i = (rect.left + rect.right) / 2;
                int i2 = iCeil / 2;
                rect.left = i - i2;
                rect.right = i + i2;
            }
            rect.left -= getPaddingLeft();
            rect.top -= getPaddingTop();
            rect.right = getPaddingRight() + rect.right;
            rect.bottom = getPaddingBottom() + rect.bottom;
            this.backgroundDrawable.setBounds(rect);
            this.backgroundDrawable.draw(canvas);
        }
        super.onDraw(canvas);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zContains = getClickBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY());
        if (motionEvent.getAction() == 0 && zContains) {
            this.pressed = true;
            Drawable drawable = this.backgroundDrawable;
            if (drawable != null) {
                drawable.setHotspot(motionEvent.getX(), motionEvent.getY());
                this.backgroundDrawable.setState(new int[]{16842919, 16842910});
            }
            invalidate();
            return zContains;
        }
        if (motionEvent.getAction() == 1) {
            if (this.pressed && zContains) {
                callOnClick();
            }
            this.pressed = false;
            Drawable drawable2 = this.backgroundDrawable;
            if (drawable2 != null) {
                drawable2.setState(StateSet.NOTHING);
                return zContains;
            }
        } else if (motionEvent.getAction() == 3) {
            this.pressed = false;
            Drawable drawable3 = this.backgroundDrawable;
            if (drawable3 != null) {
                drawable3.setState(StateSet.NOTHING);
            }
        }
        return zContains;
    }

    @Override
    public void setBackground(Drawable drawable) {
        Drawable drawable2 = this.backgroundDrawable;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.backgroundDrawable = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        invalidate();
    }

    @Override
    public void setBackgroundDrawable(Drawable drawable) {
        Drawable drawable2 = this.backgroundDrawable;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.backgroundDrawable = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.backgroundDrawable || super.verifyDrawable(drawable);
    }
}
