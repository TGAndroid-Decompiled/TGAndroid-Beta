package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.StateSet;
import android.view.MotionEvent;
public final class tp extends j6 {
    public final Rect f32774s;
    public Drawable v;
    public boolean f32775w;

    public tp(Context context) {
        super(context, false, false, false);
        this.f32774s = new Rect();
    }

    public Rect getClickBounds() {
        return this.f32774s;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.v != null) {
            Rect bounds = getDrawable().getBounds();
            Rect rect = this.f32774s;
            rect.set(bounds);
            int ceil = (int) Math.ceil(getDrawable().d());
            if (getDrawable().f29333b == 3) {
                rect.right = rect.left + ceil;
            } else if (getDrawable().f29333b == 5) {
                rect.left = rect.right - ceil;
            } else if (getDrawable().f29333b == 17) {
                int i9 = (rect.left + rect.right) / 2;
                int i10 = ceil / 2;
                rect.left = i9 - i10;
                rect.right = i9 + i10;
            }
            rect.left -= getPaddingLeft();
            rect.top -= getPaddingTop();
            rect.right = getPaddingRight() + rect.right;
            rect.bottom = getPaddingBottom() + rect.bottom;
            this.v.setBounds(rect);
            this.v.draw(canvas);
        }
        super.onDraw(canvas);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean contains = getClickBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY());
        if (motionEvent.getAction() == 0 && contains) {
            this.f32775w = true;
            Drawable drawable = this.v;
            if (drawable != null) {
                drawable.setHotspot(motionEvent.getX(), motionEvent.getY());
                this.v.setState(new int[]{16842919, 16842910});
            }
            invalidate();
            return contains;
        }
        if (motionEvent.getAction() == 1) {
            if (this.f32775w && contains) {
                callOnClick();
            }
            this.f32775w = false;
            Drawable drawable2 = this.v;
            if (drawable2 != null) {
                drawable2.setState(StateSet.NOTHING);
                return contains;
            }
        } else if (motionEvent.getAction() == 3) {
            this.f32775w = false;
            Drawable drawable3 = this.v;
            if (drawable3 != null) {
                drawable3.setState(StateSet.NOTHING);
            }
        }
        return contains;
    }

    @Override
    public void setBackground(Drawable drawable) {
        Drawable drawable2 = this.v;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.v = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        invalidate();
    }

    @Override
    public void setBackgroundDrawable(Drawable drawable) {
        Drawable drawable2 = this.v;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.v = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.v && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
