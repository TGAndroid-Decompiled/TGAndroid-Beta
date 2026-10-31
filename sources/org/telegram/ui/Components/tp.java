package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.StateSet;
import android.view.MotionEvent;
public final class tp extends f6 {
    public final Rect f30665s;
    public Drawable f30666w;
    public boolean f30667x;

    public tp(Context context) {
        super(context, false, false, false);
        this.f30665s = new Rect();
    }

    public Rect getClickBounds() {
        return this.f30665s;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f30666w != null) {
            Rect bounds = getDrawable().getBounds();
            Rect rect = this.f30665s;
            rect.set(bounds);
            int ceil = (int) Math.ceil(getDrawable().c());
            if (getDrawable().f25695b == 3) {
                rect.right = rect.left + ceil;
            } else if (getDrawable().f25695b == 5) {
                rect.left = rect.right - ceil;
            } else if (getDrawable().f25695b == 17) {
                int i10 = (rect.left + rect.right) / 2;
                int i11 = ceil / 2;
                rect.left = i10 - i11;
                rect.right = i10 + i11;
            }
            rect.left -= getPaddingLeft();
            rect.top -= getPaddingTop();
            rect.right = getPaddingRight() + rect.right;
            rect.bottom = getPaddingBottom() + rect.bottom;
            this.f30666w.setBounds(rect);
            this.f30666w.draw(canvas);
        }
        super.onDraw(canvas);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean contains = getClickBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY());
        if (motionEvent.getAction() == 0 && contains) {
            this.f30667x = true;
            Drawable drawable = this.f30666w;
            if (drawable != null) {
                drawable.setHotspot(motionEvent.getX(), motionEvent.getY());
                this.f30666w.setState(new int[]{16842919, 16842910});
            }
            invalidate();
            return contains;
        }
        if (motionEvent.getAction() == 1) {
            if (this.f30667x && contains) {
                callOnClick();
            }
            this.f30667x = false;
            Drawable drawable2 = this.f30666w;
            if (drawable2 != null) {
                drawable2.setState(StateSet.NOTHING);
                return contains;
            }
        } else if (motionEvent.getAction() == 3) {
            this.f30667x = false;
            Drawable drawable3 = this.f30666w;
            if (drawable3 != null) {
                drawable3.setState(StateSet.NOTHING);
            }
        }
        return contains;
    }

    @Override
    public void setBackground(Drawable drawable) {
        Drawable drawable2 = this.f30666w;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f30666w = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        invalidate();
    }

    @Override
    public void setBackgroundDrawable(Drawable drawable) {
        Drawable drawable2 = this.f30666w;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f30666w = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f30666w && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
