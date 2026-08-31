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
import org.telegram.ui.Components.fc0;
import org.telegram.ui.ao;
public class ea extends LinearLayout {
    public org.telegram.ui.Components.n9 f22775a;
    public org.telegram.ui.Components.n9 f22776b;
    public Drawable f22777c;
    public Drawable d;
    public final t1[] f22778e;
    public final Drawable f22779f;
    public final org.telegram.ui.ActionBar.f5 h;
    public final int f22780n;
    public org.telegram.ui.ActionBar.p2 f22781r;
    public int f22782s;
    public final g v;
    public Drawable f22783w;
    public boolean f22784x;
    public final org.telegram.ui.Components.z5 f22785y;

    public ea(Context context, org.telegram.ui.ActionBar.f5 f5Var, int i10) {
        this(context, f5Var, i10, 0L, null);
    }

    public final boolean a() {
        int i10 = this.f22780n;
        if (i10 != 3 && i10 != 0) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f22780n != 2 && !a()) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public t1[] getCells() {
        return this.f22778e;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        int i10 = 0;
        while (true) {
            t1[] t1VarArr = this.f22778e;
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
        Drawable drawable = this.f22783w;
        if (drawable instanceof ao) {
            ((ao) drawable).f(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.n9 n9Var = this.f22775a;
        if (n9Var != null) {
            n9Var.dispose();
            this.f22775a = null;
        }
        org.telegram.ui.Components.n9 n9Var2 = this.f22776b;
        if (n9Var2 != null) {
            n9Var2.dispose();
            this.f22776b = null;
        }
        Drawable drawable = this.f22783w;
        if (drawable instanceof ao) {
            ((ao) drawable).g(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float themeAnimationValue;
        Drawable drawable;
        int i10;
        Drawable drawable2 = this.f22783w;
        if (drawable2 == null) {
            drawable2 = org.telegram.ui.ActionBar.k6.s0();
        }
        if (org.telegram.ui.ActionBar.k6.d != null) {
            invalidate();
        }
        Drawable drawable3 = this.f22777c;
        org.telegram.ui.Components.z5 z5Var = this.f22785y;
        if (drawable2 != drawable3 && drawable2 != null) {
            if (org.telegram.ui.ActionBar.k6.sl != null || this.f22784x) {
                this.d = drawable3;
                this.f22776b = this.f22775a;
            } else {
                org.telegram.ui.Components.n9 n9Var = this.f22775a;
                if (n9Var != null) {
                    n9Var.dispose();
                    this.f22775a = null;
                }
            }
            this.f22777c = drawable2;
            z5Var.d(0.0f, true);
        }
        boolean z4 = this.f22784x;
        org.telegram.ui.ActionBar.f5 f5Var = this.h;
        if (z4) {
            themeAnimationValue = z5Var.d(1.0f, false);
        } else {
            themeAnimationValue = f5Var.getThemeAnimationValue();
        }
        for (int i11 = 0; i11 < 2; i11++) {
            if (i11 == 0) {
                drawable = this.d;
            } else {
                drawable = this.f22777c;
            }
            if (drawable != null) {
                if (i11 == 1 && this.d != null && (f5Var != null || this.f22784x)) {
                    i10 = (int) (255.0f * themeAnimationValue);
                } else {
                    i10 = 255;
                }
                if (i10 > 0) {
                    drawable.setAlpha(i10);
                    if (!(drawable instanceof ColorDrawable) && !(drawable instanceof GradientDrawable) && !(drawable instanceof fc0)) {
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
                                int i12 = (measuredHeight - ceil2) / 2;
                                canvas.save();
                                canvas.clipRect(0, 0, ceil, getMeasuredHeight());
                                drawable.setBounds(measuredWidth, i12, ceil + measuredWidth, ceil2 + i12);
                            }
                            drawable.draw(canvas);
                            canvas.restore();
                        } else {
                            qh.s6.j(canvas, drawable, getWidth(), getHeight());
                        }
                    } else {
                        drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                        if (drawable instanceof org.telegram.ui.Components.o9) {
                            this.f22775a = ((org.telegram.ui.Components.o9) drawable).c(canvas, this);
                        } else {
                            drawable.draw(canvas);
                        }
                    }
                    if (i11 == 0 && this.d != null && themeAnimationValue >= 1.0f) {
                        org.telegram.ui.Components.n9 n9Var2 = this.f22776b;
                        if (n9Var2 != null) {
                            n9Var2.dispose();
                            this.f22776b = null;
                        }
                        this.d = null;
                        invalidate();
                    }
                }
            }
        }
        int measuredWidth2 = getMeasuredWidth();
        int measuredHeight2 = getMeasuredHeight();
        Drawable drawable4 = this.f22779f;
        drawable4.setBounds(0, 0, measuredWidth2, measuredHeight2);
        drawable4.draw(canvas);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f22780n != 2 && !a()) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f22780n != 2 && !a()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setOverrideBackground(Drawable drawable) {
        this.f22783w = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        if ((this.f22783w instanceof ao) && isAttachedToWindow()) {
            ((ao) this.f22783w).f(this);
        }
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f22783w && drawable != this.d && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public ea(android.content.Context r25, org.telegram.ui.ActionBar.f5 r26, int r27, long r28, org.telegram.ui.ActionBar.g6 r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ea.<init>(android.content.Context, org.telegram.ui.ActionBar.f5, int, long, org.telegram.ui.ActionBar.g6):void");
    }

    @Override
    public final void dispatchSetPressed(boolean z4) {
    }
}
