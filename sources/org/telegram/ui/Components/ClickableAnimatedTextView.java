package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.StateSet;
import android.view.MotionEvent;
public class ClickableAnimatedTextView extends AnimatedTextView {
    private Drawable backgroundDrawable;
    private final android.graphics.Rect bounds;
    private boolean pressed;

    public ClickableAnimatedTextView(Context context) {
        super(context);
        this.bounds = new android.graphics.Rect();
    }

    @Override
    public void onDraw(Canvas canvas) {
        if (this.backgroundDrawable != null) {
            this.bounds.set(getDrawable().getBounds());
            int ceil = (int) Math.ceil(getDrawable().getCurrentWidth());
            if (getDrawable().getGravity() == 3) {
                android.graphics.Rect rect = this.bounds;
                rect.right = rect.left + ceil;
            } else if (getDrawable().getGravity() == 5) {
                android.graphics.Rect rect2 = this.bounds;
                rect2.left = rect2.right - ceil;
            } else if (getDrawable().getGravity() == 17) {
                android.graphics.Rect rect3 = this.bounds;
                int i = (rect3.left + rect3.right) / 2;
                int i2 = ceil / 2;
                rect3.left = i - i2;
                rect3.right = i + i2;
            }
            this.bounds.left -= getPaddingLeft();
            this.bounds.top -= getPaddingTop();
            this.bounds.right += getPaddingRight();
            this.bounds.bottom += getPaddingBottom();
            this.backgroundDrawable.setBounds(this.bounds);
            this.backgroundDrawable.draw(canvas);
        }
        super.onDraw(canvas);
    }

    public android.graphics.Rect getClickBounds() {
        return this.bounds;
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
    protected boolean verifyDrawable(Drawable drawable) {
        return drawable == this.backgroundDrawable || super.verifyDrawable(drawable);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean contains = getClickBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY());
        if (motionEvent.getAction() == 0 && contains) {
            this.pressed = true;
            Drawable drawable = this.backgroundDrawable;
            if (drawable != null) {
                if (Build.VERSION.SDK_INT >= 21) {
                    drawable.setHotspot(motionEvent.getX(), motionEvent.getY());
                }
                this.backgroundDrawable.setState(new int[]{16842919, 16842910});
            }
            invalidate();
        } else if (motionEvent.getAction() == 1) {
            if (this.pressed && contains) {
                callOnClick();
            }
            this.pressed = false;
            Drawable drawable2 = this.backgroundDrawable;
            if (drawable2 != null) {
                drawable2.setState(StateSet.NOTHING);
            }
        } else if (motionEvent.getAction() == 3) {
            this.pressed = false;
            Drawable drawable3 = this.backgroundDrawable;
            if (drawable3 != null) {
                drawable3.setState(StateSet.NOTHING);
            }
        }
        return contains;
    }
}
