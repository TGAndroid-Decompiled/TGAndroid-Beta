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
import org.telegram.ui.Components.dd0;
import org.telegram.ui.co;
public class ga extends LinearLayout {
    public org.telegram.ui.Components.w9 f22156a;
    public org.telegram.ui.Components.w9 f22157b;
    public Drawable f22158c;
    public Drawable d;
    public final u1[] f22159e;
    public final Drawable f22160f;
    public final org.telegram.ui.ActionBar.b5 h;
    public final int f22161n;
    public org.telegram.ui.ActionBar.m2 f22162r;
    public int f22163s;
    public final g v;
    public Drawable f22164w;
    public boolean f22165x;
    public final org.telegram.ui.Components.g6 f22166y;

    public ga(Context context, org.telegram.ui.ActionBar.b5 b5Var, int i10) {
        this(context, b5Var, i10, 0L, null);
    }

    public final boolean a() {
        int i10 = this.f22161n;
        if (i10 != 3 && i10 != 0) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f22161n != 2 && !a()) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public u1[] getCells() {
        return this.f22159e;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        int i10 = 0;
        while (true) {
            u1[] u1VarArr = this.f22159e;
            if (i10 < u1VarArr.length) {
                u1VarArr[i10].invalidate();
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.f22164w;
        if (drawable instanceof co) {
            ((co) drawable).f(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.w9 w9Var = this.f22156a;
        if (w9Var != null) {
            w9Var.dispose();
            this.f22156a = null;
        }
        org.telegram.ui.Components.w9 w9Var2 = this.f22157b;
        if (w9Var2 != null) {
            w9Var2.dispose();
            this.f22157b = null;
        }
        Drawable drawable = this.f22164w;
        if (drawable instanceof co) {
            ((co) drawable).g(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float themeAnimationValue;
        Drawable drawable;
        int i10;
        Drawable drawable2 = this.f22164w;
        if (drawable2 == null) {
            drawable2 = org.telegram.ui.ActionBar.h6.t0();
        }
        if (org.telegram.ui.ActionBar.h6.d != null) {
            invalidate();
        }
        Drawable drawable3 = this.f22158c;
        org.telegram.ui.Components.g6 g6Var = this.f22166y;
        if (drawable2 != drawable3 && drawable2 != null) {
            if (org.telegram.ui.ActionBar.h6.vl != null || this.f22165x) {
                this.d = drawable3;
                this.f22157b = this.f22156a;
            } else {
                org.telegram.ui.Components.w9 w9Var = this.f22156a;
                if (w9Var != null) {
                    w9Var.dispose();
                    this.f22156a = null;
                }
            }
            this.f22158c = drawable2;
            g6Var.d(0.0f, true);
        }
        boolean z10 = this.f22165x;
        org.telegram.ui.ActionBar.b5 b5Var = this.h;
        if (z10) {
            themeAnimationValue = g6Var.d(1.0f, false);
        } else {
            themeAnimationValue = b5Var.getThemeAnimationValue();
        }
        for (int i11 = 0; i11 < 2; i11++) {
            if (i11 == 0) {
                drawable = this.d;
            } else {
                drawable = this.f22158c;
            }
            if (drawable != null) {
                if (i11 == 1 && this.d != null && (b5Var != null || this.f22165x)) {
                    i10 = (int) (255.0f * themeAnimationValue);
                } else {
                    i10 = 255;
                }
                if (i10 > 0) {
                    drawable.setAlpha(i10);
                    if (!(drawable instanceof ColorDrawable) && !(drawable instanceof GradientDrawable) && !(drawable instanceof dd0)) {
                        if (drawable instanceof BitmapDrawable) {
                            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                            bitmapDrawable.setFilterBitmap(true);
                            if (bitmapDrawable.getTileModeX() == Shader.TileMode.REPEAT) {
                                canvas.save();
                                float f7 = 2.0f / AndroidUtilities.density;
                                canvas.scale(f7, f7);
                                drawable.setBounds(0, 0, (int) Math.ceil(getMeasuredWidth() / f7), (int) Math.ceil(getMeasuredHeight() / f7));
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
                            ci.l8.j(canvas, drawable, getWidth(), getHeight());
                        }
                    } else {
                        drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                        if (drawable instanceof org.telegram.ui.Components.x9) {
                            this.f22156a = ((org.telegram.ui.Components.x9) drawable).c(canvas, this);
                        } else {
                            drawable.draw(canvas);
                        }
                    }
                    if (i11 == 0 && this.d != null && themeAnimationValue >= 1.0f) {
                        org.telegram.ui.Components.w9 w9Var2 = this.f22157b;
                        if (w9Var2 != null) {
                            w9Var2.dispose();
                            this.f22157b = null;
                        }
                        this.d = null;
                        invalidate();
                    }
                }
            }
        }
        int measuredWidth2 = getMeasuredWidth();
        int measuredHeight2 = getMeasuredHeight();
        Drawable drawable4 = this.f22160f;
        drawable4.setBounds(0, 0, measuredWidth2, measuredHeight2);
        drawable4.draw(canvas);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f22161n != 2 && !a()) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f22161n != 2 && !a()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setOverrideBackground(Drawable drawable) {
        this.f22164w = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        if ((this.f22164w instanceof co) && isAttachedToWindow()) {
            ((co) this.f22164w).f(this);
        }
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f22164w && drawable != this.d && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public ga(android.content.Context r25, org.telegram.ui.ActionBar.b5 r26, int r27, long r28, org.telegram.ui.ActionBar.d6 r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ga.<init>(android.content.Context, org.telegram.ui.ActionBar.b5, int, long, org.telegram.ui.ActionBar.d6):void");
    }

    @Override
    public final void dispatchSetPressed(boolean z10) {
    }
}
