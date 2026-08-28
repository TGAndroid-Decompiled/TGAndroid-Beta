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
import org.telegram.ui.Components.jb0;
import org.telegram.ui.tn;
public class fa extends LinearLayout {
    public org.telegram.ui.Components.m9 f24350a;
    public org.telegram.ui.Components.m9 f24351b;
    public Drawable f24352c;
    public Drawable d;
    public final t1[] f24353e;
    public final Drawable f24354f;
    public final org.telegram.ui.ActionBar.b5 h;
    public final int f24355n;
    public org.telegram.ui.ActionBar.o2 f24356r;
    public int f24357s;
    public final g v;
    public Drawable f24358w;
    public boolean f24359x;
    public final org.telegram.ui.Components.y5 f24360y;

    public fa(Context context, org.telegram.ui.ActionBar.b5 b5Var, int i9) {
        this(context, b5Var, i9, 0L, null);
    }

    public final boolean a() {
        int i9 = this.f24355n;
        if (i9 != 3 && i9 != 0) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f24355n != 2 && !a()) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public t1[] getCells() {
        return this.f24353e;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        int i9 = 0;
        while (true) {
            t1[] t1VarArr = this.f24353e;
            if (i9 < t1VarArr.length) {
                t1VarArr[i9].invalidate();
                i9++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.f24358w;
        if (drawable instanceof tn) {
            ((tn) drawable).f(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.m9 m9Var = this.f24350a;
        if (m9Var != null) {
            m9Var.dispose();
            this.f24350a = null;
        }
        org.telegram.ui.Components.m9 m9Var2 = this.f24351b;
        if (m9Var2 != null) {
            m9Var2.dispose();
            this.f24351b = null;
        }
        Drawable drawable = this.f24358w;
        if (drawable instanceof tn) {
            ((tn) drawable).g(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float themeAnimationValue;
        Drawable drawable;
        int i9;
        Drawable drawable2 = this.f24358w;
        if (drawable2 == null) {
            drawable2 = org.telegram.ui.ActionBar.f6.s0();
        }
        if (org.telegram.ui.ActionBar.f6.d != null) {
            invalidate();
        }
        Drawable drawable3 = this.f24352c;
        org.telegram.ui.Components.y5 y5Var = this.f24360y;
        if (drawable2 != drawable3 && drawable2 != null) {
            if (org.telegram.ui.ActionBar.f6.sl != null || this.f24359x) {
                this.d = drawable3;
                this.f24351b = this.f24350a;
            } else {
                org.telegram.ui.Components.m9 m9Var = this.f24350a;
                if (m9Var != null) {
                    m9Var.dispose();
                    this.f24350a = null;
                }
            }
            this.f24352c = drawable2;
            y5Var.d(0.0f, true);
        }
        boolean z10 = this.f24359x;
        org.telegram.ui.ActionBar.b5 b5Var = this.h;
        if (z10) {
            themeAnimationValue = y5Var.d(1.0f, false);
        } else {
            themeAnimationValue = b5Var.getThemeAnimationValue();
        }
        for (int i10 = 0; i10 < 2; i10++) {
            if (i10 == 0) {
                drawable = this.d;
            } else {
                drawable = this.f24352c;
            }
            if (drawable != null) {
                if (i10 == 1 && this.d != null && (b5Var != null || this.f24359x)) {
                    i9 = (int) (255.0f * themeAnimationValue);
                } else {
                    i9 = 255;
                }
                if (i9 > 0) {
                    drawable.setAlpha(i9);
                    if (!(drawable instanceof ColorDrawable) && !(drawable instanceof GradientDrawable) && !(drawable instanceof jb0)) {
                        if (drawable instanceof BitmapDrawable) {
                            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                            bitmapDrawable.setFilterBitmap(true);
                            if (bitmapDrawable.getTileModeX() == Shader.TileMode.REPEAT) {
                                canvas.save();
                                float f10 = 2.0f / AndroidUtilities.density;
                                canvas.scale(f10, f10);
                                drawable.setBounds(0, 0, (int) Math.ceil(getMeasuredWidth() / f10), (int) Math.ceil(getMeasuredHeight() / f10));
                            } else {
                                int measuredHeight = getMeasuredHeight();
                                float max = Math.max(getMeasuredWidth() / drawable.getIntrinsicWidth(), measuredHeight / drawable.getIntrinsicHeight());
                                int ceil = (int) Math.ceil(drawable.getIntrinsicWidth() * max);
                                int ceil2 = (int) Math.ceil(drawable.getIntrinsicHeight() * max);
                                int measuredWidth = (getMeasuredWidth() - ceil) / 2;
                                int i11 = (measuredHeight - ceil2) / 2;
                                canvas.save();
                                canvas.clipRect(0, 0, ceil, getMeasuredHeight());
                                drawable.setBounds(measuredWidth, i11, ceil + measuredWidth, ceil2 + i11);
                            }
                            drawable.draw(canvas);
                            canvas.restore();
                        } else {
                            kh.a8.j(canvas, drawable, getWidth(), getHeight());
                        }
                    } else {
                        drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                        if (drawable instanceof org.telegram.ui.Components.n9) {
                            this.f24350a = ((org.telegram.ui.Components.n9) drawable).c(canvas, this);
                        } else {
                            drawable.draw(canvas);
                        }
                    }
                    if (i10 == 0 && this.d != null && themeAnimationValue >= 1.0f) {
                        org.telegram.ui.Components.m9 m9Var2 = this.f24351b;
                        if (m9Var2 != null) {
                            m9Var2.dispose();
                            this.f24351b = null;
                        }
                        this.d = null;
                        invalidate();
                    }
                }
            }
        }
        int measuredWidth2 = getMeasuredWidth();
        int measuredHeight2 = getMeasuredHeight();
        Drawable drawable4 = this.f24354f;
        drawable4.setBounds(0, 0, measuredWidth2, measuredHeight2);
        drawable4.draw(canvas);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f24355n != 2 && !a()) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f24355n != 2 && !a()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setOverrideBackground(Drawable drawable) {
        this.f24358w = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        if ((this.f24358w instanceof tn) && isAttachedToWindow()) {
            ((tn) this.f24358w).f(this);
        }
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f24358w && drawable != this.d && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public fa(android.content.Context r25, org.telegram.ui.ActionBar.b5 r26, int r27, long r28, org.telegram.ui.ActionBar.b6 r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.fa.<init>(android.content.Context, org.telegram.ui.ActionBar.b5, int, long, org.telegram.ui.ActionBar.b6):void");
    }

    @Override
    public final void dispatchSetPressed(boolean z10) {
    }
}
