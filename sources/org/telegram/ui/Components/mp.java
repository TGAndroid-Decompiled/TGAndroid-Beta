package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.StateSet;
import android.view.MotionEvent;
public final class mp extends j6 {
    public final Rect f36049s;
    public Drawable f36050w;
    public boolean f36051x;

    public mp(Context context) {
        super(context, false, false, false);
        this.f36049s = new Rect();
    }

    public Rect getClickBounds() {
        return this.f36049s;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f36050w != null) {
            Rect bounds = getDrawable().getBounds();
            Rect rect = this.f36049s;
            rect.set(bounds);
            int ceil = (int) Math.ceil(getDrawable().c());
            if (getDrawable().f34508b == 3) {
                rect.right = rect.left + ceil;
            } else if (getDrawable().f34508b == 5) {
                rect.left = rect.right - ceil;
            } else if (getDrawable().f34508b == 17) {
                int i7 = (rect.left + rect.right) / 2;
                int i10 = ceil / 2;
                rect.left = i7 - i10;
                rect.right = i7 + i10;
            }
            rect.left -= getPaddingLeft();
            rect.top -= getPaddingTop();
            rect.right = getPaddingRight() + rect.right;
            rect.bottom = getPaddingBottom() + rect.bottom;
            this.f36050w.setBounds(rect);
            this.f36050w.draw(canvas);
        }
        super.onDraw(canvas);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean contains = getClickBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY());
        if (motionEvent.getAction() == 0 && contains) {
            this.f36051x = true;
            Drawable drawable = this.f36050w;
            if (drawable != null) {
                drawable.setHotspot(motionEvent.getX(), motionEvent.getY());
                this.f36050w.setState(new int[]{16842919, 16842910});
            }
            invalidate();
            return contains;
        }
        if (motionEvent.getAction() == 1) {
            if (this.f36051x && contains) {
                callOnClick();
            }
            this.f36051x = false;
            Drawable drawable2 = this.f36050w;
            if (drawable2 != null) {
                drawable2.setState(StateSet.NOTHING);
                return contains;
            }
        } else if (motionEvent.getAction() == 3) {
            this.f36051x = false;
            Drawable drawable3 = this.f36050w;
            if (drawable3 != null) {
                drawable3.setState(StateSet.NOTHING);
            }
        }
        return contains;
    }

    @Override
    public void setBackground(Drawable drawable) {
        Drawable drawable2 = this.f36050w;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f36050w = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        invalidate();
    }

    @Override
    public void setBackgroundDrawable(Drawable drawable) {
        Drawable drawable2 = this.f36050w;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f36050w = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f36050w && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
