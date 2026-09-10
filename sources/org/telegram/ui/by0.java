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
public final class by0 extends FrameLayout {
    public org.telegram.ui.Components.u9 f31465a;
    public org.telegram.ui.Cells.t1 f31466b;
    public Drawable f31467c;
    public Drawable d;
    public org.telegram.ui.Components.s40 e;
    public MessageObject f31468f;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.e.e(this.f31466b, null, 0, 0, false);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f31466b.invalidate();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.u9 u9Var = this.f31465a;
        if (u9Var != null) {
            u9Var.dispose();
            this.f31465a = null;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Drawable drawable = this.d;
        Drawable s02 = org.telegram.ui.ActionBar.j6.s0();
        if (s02 != null && this.f31467c != s02) {
            org.telegram.ui.Components.u9 u9Var = this.f31465a;
            if (u9Var != null) {
                u9Var.dispose();
                this.f31465a = null;
            }
            this.f31467c = s02;
        }
        Drawable drawable2 = this.f31467c;
        if (!(drawable2 instanceof ColorDrawable) && !(drawable2 instanceof GradientDrawable) && !(drawable2 instanceof org.telegram.ui.Components.lc0)) {
            if (drawable2 instanceof BitmapDrawable) {
                if (((BitmapDrawable) drawable2).getTileModeX() == Shader.TileMode.REPEAT) {
                    canvas.save();
                    float f7 = 2.0f / AndroidUtilities.density;
                    canvas.scale(f7, f7);
                    this.f31467c.setBounds(0, 0, (int) Math.ceil(getMeasuredWidth() / f7), (int) Math.ceil(getMeasuredHeight() / f7));
                } else {
                    int measuredHeight = getMeasuredHeight();
                    float max = Math.max(getMeasuredWidth() / this.f31467c.getIntrinsicWidth(), measuredHeight / this.f31467c.getIntrinsicHeight());
                    int ceil = (int) Math.ceil(this.f31467c.getIntrinsicWidth() * max);
                    int ceil2 = (int) Math.ceil(this.f31467c.getIntrinsicHeight() * max);
                    int measuredWidth = (getMeasuredWidth() - ceil) / 2;
                    int i10 = (measuredHeight - ceil2) / 2;
                    canvas.save();
                    canvas.clipRect(0, 0, ceil, getMeasuredHeight());
                    this.f31467c.setBounds(measuredWidth, i10, ceil + measuredWidth, ceil2 + i10);
                }
                this.f31467c.draw(canvas);
                canvas.restore();
            } else {
                super.onDraw(canvas);
            }
        } else {
            drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            Drawable drawable3 = this.f31467c;
            if (drawable3 instanceof org.telegram.ui.Components.v9) {
                this.f31465a = ((org.telegram.ui.Components.v9) drawable3).c(canvas, this);
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
    public final void dispatchSetPressed(boolean z10) {
    }
}
