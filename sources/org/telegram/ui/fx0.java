package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class fx0 extends FrameLayout {
    public org.telegram.ui.Components.n9 f34412a;
    public org.telegram.ui.Cells.t1 f34413b;
    public Drawable f34414c;
    public Drawable d;
    public org.telegram.ui.Components.k40 e;
    public MessageObject f34415f;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.e.e(this.f34413b, null, 0, 0, false);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f34413b.invalidate();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.n9 n9Var = this.f34412a;
        if (n9Var != null) {
            n9Var.dispose();
            this.f34412a = null;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Drawable drawable = this.d;
        Drawable s02 = org.telegram.ui.ActionBar.j6.s0();
        if (s02 != null && this.f34414c != s02) {
            org.telegram.ui.Components.n9 n9Var = this.f34412a;
            if (n9Var != null) {
                n9Var.dispose();
                this.f34412a = null;
            }
            this.f34414c = s02;
        }
        Drawable drawable2 = this.f34414c;
        if (!(drawable2 instanceof ColorDrawable) && !(drawable2 instanceof GradientDrawable) && !(drawable2 instanceof org.telegram.ui.Components.dc0)) {
            if (drawable2 instanceof BitmapDrawable) {
                if (((BitmapDrawable) drawable2).getTileModeX() == Shader.TileMode.REPEAT) {
                    canvas.save();
                    float f10 = 2.0f / AndroidUtilities.density;
                    canvas.scale(f10, f10);
                    this.f34414c.setBounds(0, 0, (int) Math.ceil(getMeasuredWidth() / f10), (int) Math.ceil(getMeasuredHeight() / f10));
                } else {
                    int measuredHeight = getMeasuredHeight();
                    float max = Math.max(getMeasuredWidth() / this.f34414c.getIntrinsicWidth(), measuredHeight / this.f34414c.getIntrinsicHeight());
                    int ceil = (int) Math.ceil(this.f34414c.getIntrinsicWidth() * max);
                    int ceil2 = (int) Math.ceil(this.f34414c.getIntrinsicHeight() * max);
                    int measuredWidth = (getMeasuredWidth() - ceil) / 2;
                    int i10 = (measuredHeight - ceil2) / 2;
                    canvas.save();
                    canvas.clipRect(0, 0, ceil, getMeasuredHeight());
                    this.f34414c.setBounds(measuredWidth, i10, ceil + measuredWidth, ceil2 + i10);
                }
                this.f34414c.draw(canvas);
                canvas.restore();
            } else {
                super.onDraw(canvas);
            }
        } else {
            drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            Drawable drawable3 = this.f34414c;
            if (drawable3 instanceof org.telegram.ui.Components.o9) {
                this.f34412a = ((org.telegram.ui.Components.o9) drawable3).c(canvas, this);
            } else {
                drawable3.draw(canvas);
            }
        }
        drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
        drawable.draw(canvas);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void dispatchSetPressed(boolean z4) {
    }
}
