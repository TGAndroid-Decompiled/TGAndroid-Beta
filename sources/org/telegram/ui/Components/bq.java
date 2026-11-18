package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.StateSet;
import android.view.MotionEvent;
public final class bq extends n6 {
    public final Rect f33754s;
    public Drawable f33755w;
    public boolean f33756x;

    public bq(Context context) {
        super(context, false, false, false);
        this.f33754s = new Rect();
    }

    public Rect getClickBounds() {
        return this.f33754s;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f33755w != null) {
            Rect bounds = getDrawable().getBounds();
            Rect rect = this.f33754s;
            rect.set(bounds);
            int ceil = (int) Math.ceil(getDrawable().c());
            if (getDrawable().f37377b == 3) {
                rect.right = rect.left + ceil;
            } else if (getDrawable().f37377b == 5) {
                rect.left = rect.right - ceil;
            } else if (getDrawable().f37377b == 17) {
                int i7 = (rect.left + rect.right) / 2;
                int i10 = ceil / 2;
                rect.left = i7 - i10;
                rect.right = i7 + i10;
            }
            rect.left -= getPaddingLeft();
            rect.top -= getPaddingTop();
            rect.right = getPaddingRight() + rect.right;
            rect.bottom = getPaddingBottom() + rect.bottom;
            this.f33755w.setBounds(rect);
            this.f33755w.draw(canvas);
        }
        super.onDraw(canvas);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean contains = getClickBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY());
        if (motionEvent.getAction() == 0 && contains) {
            this.f33756x = true;
            Drawable drawable = this.f33755w;
            if (drawable != null) {
                drawable.setHotspot(motionEvent.getX(), motionEvent.getY());
                this.f33755w.setState(new int[]{16842919, 16842910});
            }
            invalidate();
            return contains;
        }
        if (motionEvent.getAction() == 1) {
            if (this.f33756x && contains) {
                callOnClick();
            }
            this.f33756x = false;
            Drawable drawable2 = this.f33755w;
            if (drawable2 != null) {
                drawable2.setState(StateSet.NOTHING);
                return contains;
            }
        } else if (motionEvent.getAction() == 3) {
            this.f33756x = false;
            Drawable drawable3 = this.f33755w;
            if (drawable3 != null) {
                drawable3.setState(StateSet.NOTHING);
            }
        }
        return contains;
    }

    @Override
    public void setBackground(Drawable drawable) {
        Drawable drawable2 = this.f33755w;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f33755w = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        invalidate();
    }

    @Override
    public void setBackgroundDrawable(Drawable drawable) {
        Drawable drawable2 = this.f33755w;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f33755w = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f33755w && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
