package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.StateSet;
import android.view.MotionEvent;
public final class jq extends o6 {
    public final Rect f24487s;
    public Drawable v;
    public boolean f24488w;

    public jq(Context context) {
        super(context, false, false, false);
        this.f24487s = new Rect();
    }

    public Rect getClickBounds() {
        return this.f24487s;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.v != null) {
            Rect bounds = getDrawable().getBounds();
            Rect rect = this.f24487s;
            rect.set(bounds);
            int ceil = (int) Math.ceil(getDrawable().d());
            if (getDrawable().f25425b == 3) {
                rect.right = rect.left + ceil;
            } else if (getDrawable().f25425b == 5) {
                rect.left = rect.right - ceil;
            } else if (getDrawable().f25425b == 17) {
                int i10 = (rect.left + rect.right) / 2;
                int i11 = ceil / 2;
                rect.left = i10 - i11;
                rect.right = i10 + i11;
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
            this.f24488w = true;
            Drawable drawable = this.v;
            if (drawable != null) {
                drawable.setHotspot(motionEvent.getX(), motionEvent.getY());
                this.v.setState(new int[]{16842919, 16842910});
            }
            invalidate();
            return contains;
        }
        if (motionEvent.getAction() == 1) {
            if (this.f24488w && contains) {
                callOnClick();
            }
            this.f24488w = false;
            Drawable drawable2 = this.v;
            if (drawable2 != null) {
                drawable2.setState(StateSet.NOTHING);
                return contains;
            }
        } else if (motionEvent.getAction() == 3) {
            this.f24488w = false;
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
