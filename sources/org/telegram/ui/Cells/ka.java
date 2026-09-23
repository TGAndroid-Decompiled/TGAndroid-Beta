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
import org.telegram.ui.Components.bc0;
import org.telegram.ui.ao;
public class ka extends LinearLayout {
    public org.telegram.ui.Components.u9 f20343a;
    public org.telegram.ui.Components.u9 f20344b;
    public Drawable f20345c;
    public Drawable d;
    public final t1[] e;
    public final Drawable f20346f;
    public final org.telegram.ui.ActionBar.c5 h;
    public final int f20347n;
    public org.telegram.ui.ActionBar.n2 f20348r;
    public int f20349s;
    public final g v;
    public Drawable f20350w;
    public boolean f20351x;
    public final org.telegram.ui.Components.e6 f20352y;

    public ka(Context context, org.telegram.ui.ActionBar.c5 c5Var, int i10) {
        this(context, c5Var, i10, 0L, null);
    }

    public final boolean a() {
        int i10 = this.f20347n;
        if (i10 != 3 && i10 != 0) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f20347n != 2 && !a()) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public t1[] getCells() {
        return this.e;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        int i10 = 0;
        while (true) {
            t1[] t1VarArr = this.e;
            if (i10 < t1VarArr.length) {
                t1VarArr[i10].invalidate();
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.f20350w;
        if (drawable instanceof ao) {
            ((ao) drawable).f(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.u9 u9Var = this.f20343a;
        if (u9Var != null) {
            u9Var.dispose();
            this.f20343a = null;
        }
        org.telegram.ui.Components.u9 u9Var2 = this.f20344b;
        if (u9Var2 != null) {
            u9Var2.dispose();
            this.f20344b = null;
        }
        Drawable drawable = this.f20350w;
        if (drawable instanceof ao) {
            ((ao) drawable).g(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float themeAnimationValue;
        Drawable drawable;
        int i10;
        Drawable drawable2 = this.f20350w;
        if (drawable2 == null) {
            drawable2 = org.telegram.ui.ActionBar.h6.s0();
        }
        if (org.telegram.ui.ActionBar.h6.d != null) {
            invalidate();
        }
        Drawable drawable3 = this.f20345c;
        org.telegram.ui.Components.e6 e6Var = this.f20352y;
        if (drawable2 != drawable3 && drawable2 != null) {
            if (org.telegram.ui.ActionBar.h6.sl != null || this.f20351x) {
                this.d = drawable3;
                this.f20344b = this.f20343a;
            } else {
                org.telegram.ui.Components.u9 u9Var = this.f20343a;
                if (u9Var != null) {
                    u9Var.dispose();
                    this.f20343a = null;
                }
            }
            this.f20345c = drawable2;
            e6Var.d(0.0f, true);
        }
        boolean z10 = this.f20351x;
        org.telegram.ui.ActionBar.c5 c5Var = this.h;
        if (z10) {
            themeAnimationValue = e6Var.d(1.0f, false);
        } else {
            themeAnimationValue = c5Var.getThemeAnimationValue();
        }
        for (int i11 = 0; i11 < 2; i11++) {
            if (i11 == 0) {
                drawable = this.d;
            } else {
                drawable = this.f20345c;
            }
            if (drawable != null) {
                if (i11 == 1 && this.d != null && (c5Var != null || this.f20351x)) {
                    i10 = (int) (255.0f * themeAnimationValue);
                } else {
                    i10 = 255;
                }
                if (i10 > 0) {
                    drawable.setAlpha(i10);
                    if (!(drawable instanceof ColorDrawable) && !(drawable instanceof GradientDrawable) && !(drawable instanceof bc0)) {
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
                        if (drawable instanceof org.telegram.ui.Components.v9) {
                            this.f20343a = ((org.telegram.ui.Components.v9) drawable).c(canvas, this);
                        } else {
                            drawable.draw(canvas);
                        }
                    }
                    if (i11 == 0 && this.d != null && themeAnimationValue >= 1.0f) {
                        org.telegram.ui.Components.u9 u9Var2 = this.f20344b;
                        if (u9Var2 != null) {
                            u9Var2.dispose();
                            this.f20344b = null;
                        }
                        this.d = null;
                        invalidate();
                    }
                }
            }
        }
        int measuredWidth2 = getMeasuredWidth();
        int measuredHeight2 = getMeasuredHeight();
        Drawable drawable4 = this.f20346f;
        drawable4.setBounds(0, 0, measuredWidth2, measuredHeight2);
        drawable4.draw(canvas);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f20347n != 2 && !a()) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f20347n != 2 && !a()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setOverrideBackground(Drawable drawable) {
        this.f20350w = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        if ((this.f20350w instanceof ao) && isAttachedToWindow()) {
            ((ao) this.f20350w).f(this);
        }
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f20350w && drawable != this.d && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public ka(android.content.Context r25, org.telegram.ui.ActionBar.c5 r26, int r27, long r28, org.telegram.ui.ActionBar.d6 r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ka.<init>(android.content.Context, org.telegram.ui.ActionBar.c5, int, long, org.telegram.ui.ActionBar.d6):void");
    }

    @Override
    public final void dispatchSetPressed(boolean z10) {
    }
}
