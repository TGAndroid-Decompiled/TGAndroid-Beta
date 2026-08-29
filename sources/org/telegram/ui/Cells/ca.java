package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.yb0;
import org.telegram.ui.wn;
public class ca extends LinearLayout {
    public org.telegram.ui.Components.r9 f24186a;
    public org.telegram.ui.Components.r9 f24187b;
    public Drawable f24188c;
    public Drawable d;
    public final s1[] f24189e;
    public final Drawable f24190f;
    public final org.telegram.ui.ActionBar.b5 h;
    public final int f24191n;
    public org.telegram.ui.ActionBar.o2 f24192r;
    public int f24193s;
    public final g v;
    public Drawable f24194w;
    public boolean f24195x;
    public final org.telegram.ui.Components.d6 f24196y;

    public ca(Context context, org.telegram.ui.ActionBar.b5 b5Var, int i10) {
        this(context, b5Var, i10, 0L, null);
    }

    public final boolean a() {
        int i10 = this.f24191n;
        if (i10 != 3 && i10 != 0) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f24191n != 2 && !a()) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public s1[] getCells() {
        return this.f24189e;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        int i10 = 0;
        while (true) {
            s1[] s1VarArr = this.f24189e;
            if (i10 < s1VarArr.length) {
                s1VarArr[i10].invalidate();
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.f24194w;
        if (drawable instanceof wn) {
            ((wn) drawable).f(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.r9 r9Var = this.f24186a;
        if (r9Var != null) {
            r9Var.dispose();
            this.f24186a = null;
        }
        org.telegram.ui.Components.r9 r9Var2 = this.f24187b;
        if (r9Var2 != null) {
            r9Var2.dispose();
            this.f24187b = null;
        }
        Drawable drawable = this.f24194w;
        if (drawable instanceof wn) {
            ((wn) drawable).g(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float themeAnimationValue;
        Drawable drawable;
        int i10;
        Drawable drawable2 = this.f24194w;
        if (drawable2 == null) {
            drawable2 = org.telegram.ui.ActionBar.g6.s0();
        }
        if (org.telegram.ui.ActionBar.g6.d != null) {
            invalidate();
        }
        Drawable drawable3 = this.f24188c;
        org.telegram.ui.Components.d6 d6Var = this.f24196y;
        if (drawable2 != drawable3 && drawable2 != null) {
            if (org.telegram.ui.ActionBar.g6.sl != null || this.f24195x) {
                this.d = drawable3;
                this.f24187b = this.f24186a;
            } else {
                org.telegram.ui.Components.r9 r9Var = this.f24186a;
                if (r9Var != null) {
                    r9Var.dispose();
                    this.f24186a = null;
                }
            }
            this.f24188c = drawable2;
            d6Var.d(0.0f, true);
        }
        boolean z10 = this.f24195x;
        org.telegram.ui.ActionBar.b5 b5Var = this.h;
        if (z10) {
            themeAnimationValue = d6Var.d(1.0f, false);
        } else {
            themeAnimationValue = b5Var.getThemeAnimationValue();
        }
        for (int i11 = 0; i11 < 2; i11++) {
            if (i11 == 0) {
                drawable = this.d;
            } else {
                drawable = this.f24188c;
            }
            if (drawable != null) {
                if (i11 == 1 && this.d != null && (b5Var != null || this.f24195x)) {
                    i10 = (int) (255.0f * themeAnimationValue);
                } else {
                    i10 = 255;
                }
                if (i10 > 0) {
                    drawable.setAlpha(i10);
                    if (!(drawable instanceof ColorDrawable) && !(drawable instanceof GradientDrawable) && !(drawable instanceof yb0)) {
                        if (drawable instanceof BitmapDrawable) {
                            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                            bitmapDrawable.setFilterBitmap(true);
                            if (bitmapDrawable.getTileModeX() == Shader.TileMode.REPEAT) {
                                canvas.save();
                                float f9 = 2.0f / AndroidUtilities.density;
                                canvas.scale(f9, f9);
                                drawable.setBounds(0, 0, (int) Math.ceil(getMeasuredWidth() / f9), (int) Math.ceil(getMeasuredHeight() / f9));
                            } else {
                                int measuredHeight = getMeasuredHeight();
                                float max = Math.max(getMeasuredWidth() / drawable.getIntrinsicWidth(), measuredHeight / drawable.getIntrinsicHeight());
                                int ceil = (int) Math.ceil(drawable.getIntrinsicWidth() * max);
                                int ceil2 = (int) Math.ceil(drawable.getIntrinsicHeight() * max);
                                int measuredWidth = (getMeasuredWidth() - ceil) / 2;
                                int i12 = (measuredHeight - ceil2) / 2;
                                canvas.save();
                                canvas.clipRect(0, 0, ceil, getMeasuredHeight());
                                drawable.setBounds(measuredWidth, i12, ceil + measuredWidth, ceil2 + i12);
                            }
                            drawable.draw(canvas);
                            canvas.restore();
                        } else {
                            nh.o7.j(canvas, drawable, getWidth(), getHeight());
                        }
                    } else {
                        drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                        if (drawable instanceof org.telegram.ui.Components.s9) {
                            this.f24186a = ((org.telegram.ui.Components.s9) drawable).c(canvas, this);
                        } else {
                            drawable.draw(canvas);
                        }
                    }
                    if (i11 == 0 && this.d != null && themeAnimationValue >= 1.0f) {
                        org.telegram.ui.Components.r9 r9Var2 = this.f24187b;
                        if (r9Var2 != null) {
                            r9Var2.dispose();
                            this.f24187b = null;
                        }
                        this.d = null;
                        invalidate();
                    }
                }
            }
        }
        int measuredWidth2 = getMeasuredWidth();
        int measuredHeight2 = getMeasuredHeight();
        Drawable drawable4 = this.f24190f;
        drawable4.setBounds(0, 0, measuredWidth2, measuredHeight2);
        drawable4.draw(canvas);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f24191n != 2 && !a()) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f24191n != 2 && !a()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setOverrideBackground(Drawable drawable) {
        this.f24194w = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        if ((this.f24194w instanceof wn) && isAttachedToWindow()) {
            ((wn) this.f24194w).f(this);
        }
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f24194w && drawable != this.d && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public ca(android.content.Context r25, org.telegram.ui.ActionBar.b5 r26, int r27, long r28, org.telegram.ui.ActionBar.c6 r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ca.<init>(android.content.Context, org.telegram.ui.ActionBar.b5, int, long, org.telegram.ui.ActionBar.c6):void");
    }

    @Override
    public final void dispatchSetPressed(boolean z10) {
    }
}
