package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.StateSet;
import android.view.MotionEvent;

public class ClickableAnimatedTextView extends AnimatedTextView {
    private Drawable backgroundDrawable;
    private final Rect bounds;
    private boolean pressed;

    public ClickableAnimatedTextView(Context context) {
        super(context);
        this.bounds = new Rect();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        if (this.backgroundDrawable != null) {
            this.bounds.set(getDrawable().getBounds());
            int iCeil = (int) Math.ceil(getDrawable().getCurrentWidth());
            if (getDrawable().getGravity() == 3) {
                Rect rect = this.bounds;
                rect.right = rect.left + iCeil;
            } else if (getDrawable().getGravity() == 5) {
                Rect rect2 = this.bounds;
                rect2.left = rect2.right - iCeil;
            } else if (getDrawable().getGravity() == 17) {
                Rect rect3 = this.bounds;
                int i = (rect3.left + rect3.right) / 2;
                int i2 = iCeil / 2;
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

    public Rect getClickBounds() {
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
}
