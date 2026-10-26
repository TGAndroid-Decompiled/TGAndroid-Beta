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
public final class lx0 extends FrameLayout {
    public org.telegram.ui.Components.w9 f41388a;
    public org.telegram.ui.Cells.s1 f41389b;
    public Drawable f41390c;
    public Drawable d;
    public org.telegram.ui.Components.t40 e;
    public MessageObject f41391f;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.e.e(this.f41389b, null, 0, 0, false);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f41389b.invalidate();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.w9 w9Var = this.f41388a;
        if (w9Var != null) {
            w9Var.dispose();
            this.f41388a = null;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Drawable drawable = this.d;
        Drawable t02 = org.telegram.ui.ActionBar.y6.t0();
        if (t02 != null && this.f41390c != t02) {
            org.telegram.ui.Components.w9 w9Var = this.f41388a;
            if (w9Var != null) {
                w9Var.dispose();
                this.f41388a = null;
            }
            this.f41390c = t02;
        }
        Drawable drawable2 = this.f41390c;
        if (!(drawable2 instanceof ColorDrawable) && !(drawable2 instanceof GradientDrawable) && !(drawable2 instanceof org.telegram.ui.Components.uc0)) {
            if (drawable2 instanceof BitmapDrawable) {
                if (((BitmapDrawable) drawable2).getTileModeX() == Shader.TileMode.REPEAT) {
                    canvas.save();
                    float f7 = 2.0f / AndroidUtilities.density;
                    canvas.scale(f7, f7);
                    this.f41390c.setBounds(0, 0, (int) Math.ceil(getMeasuredWidth() / f7), (int) Math.ceil(getMeasuredHeight() / f7));
                } else {
                    int measuredHeight = getMeasuredHeight();
                    float max = Math.max(getMeasuredWidth() / this.f41390c.getIntrinsicWidth(), measuredHeight / this.f41390c.getIntrinsicHeight());
                    int ceil = (int) Math.ceil(this.f41390c.getIntrinsicWidth() * max);
                    int ceil2 = (int) Math.ceil(this.f41390c.getIntrinsicHeight() * max);
                    int measuredWidth = (getMeasuredWidth() - ceil) / 2;
                    int i10 = (measuredHeight - ceil2) / 2;
                    canvas.save();
                    canvas.clipRect(0, 0, ceil, getMeasuredHeight());
                    this.f41390c.setBounds(measuredWidth, i10, ceil + measuredWidth, ceil2 + i10);
                }
                this.f41390c.draw(canvas);
                canvas.restore();
            } else {
                super.onDraw(canvas);
            }
        } else {
            drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            Drawable drawable3 = this.f41390c;
            if (drawable3 instanceof org.telegram.ui.Components.x9) {
                this.f41388a = ((org.telegram.ui.Components.x9) drawable3).c(canvas, this);
            } else {
                drawable3.draw(canvas);
            }
        }
        if ((getParent() instanceof org.telegram.ui.Components.mm0) && ((org.telegram.ui.Components.mm0) getParent()).b1()) {
            return;
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
