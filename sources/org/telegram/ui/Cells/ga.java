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
import org.telegram.ui.Components.yc0;
import org.telegram.ui.vn;
public class ga extends LinearLayout {
    public org.telegram.ui.Components.u9 f22434a;
    public org.telegram.ui.Components.u9 f22435b;
    public Drawable f22436c;
    public Drawable d;
    public final t1[] e;
    public final Drawable f22437f;
    public final org.telegram.ui.ActionBar.h5 h;
    public final int f22438n;
    public org.telegram.ui.ActionBar.o2 f22439r;
    public int f22440s;
    public final g v;
    public Drawable f22441w;
    public boolean f22442x;
    public final org.telegram.ui.Components.f6 f22443y;

    public ga(Context context, org.telegram.ui.ActionBar.h5 h5Var, int i10) {
        this(context, h5Var, i10, 0L, null);
    }

    public final boolean a() {
        int i10 = this.f22438n;
        if (i10 != 3 && i10 != 0) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f22438n != 2 && !a()) {
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
        Drawable drawable = this.f22441w;
        if (drawable instanceof vn) {
            ((vn) drawable).f(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.u9 u9Var = this.f22434a;
        if (u9Var != null) {
            u9Var.dispose();
            this.f22434a = null;
        }
        org.telegram.ui.Components.u9 u9Var2 = this.f22435b;
        if (u9Var2 != null) {
            u9Var2.dispose();
            this.f22435b = null;
        }
        Drawable drawable = this.f22441w;
        if (drawable instanceof vn) {
            ((vn) drawable).g(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float themeAnimationValue;
        Drawable drawable;
        int i10;
        Drawable drawable2 = this.f22441w;
        if (drawable2 == null) {
            drawable2 = org.telegram.ui.ActionBar.k6.t0();
        }
        if (org.telegram.ui.ActionBar.k6.d != null) {
            invalidate();
        }
        Drawable drawable3 = this.f22436c;
        org.telegram.ui.Components.f6 f6Var = this.f22443y;
        if (drawable2 != drawable3 && drawable2 != null) {
            if (!org.telegram.ui.ActionBar.k6.g1() && !this.f22442x) {
                org.telegram.ui.Components.u9 u9Var = this.f22434a;
                if (u9Var != null) {
                    u9Var.dispose();
                    this.f22434a = null;
                }
            } else {
                this.d = this.f22436c;
                this.f22435b = this.f22434a;
            }
            this.f22436c = drawable2;
            f6Var.d(0.0f, true);
        }
        boolean z10 = this.f22442x;
        org.telegram.ui.ActionBar.h5 h5Var = this.h;
        if (z10) {
            themeAnimationValue = f6Var.d(1.0f, false);
        } else {
            themeAnimationValue = h5Var.getThemeAnimationValue();
        }
        for (int i11 = 0; i11 < 2; i11++) {
            if (i11 == 0) {
                drawable = this.d;
            } else {
                drawable = this.f22436c;
            }
            if (drawable != null) {
                if (i11 == 1 && this.d != null && (h5Var != null || this.f22442x)) {
                    i10 = (int) (255.0f * themeAnimationValue);
                } else {
                    i10 = 255;
                }
                if (i10 > 0) {
                    drawable.setAlpha(i10);
                    if (!(drawable instanceof ColorDrawable) && !(drawable instanceof GradientDrawable) && !(drawable instanceof yc0)) {
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
                            ei.a8.j(canvas, drawable, getWidth(), getHeight());
                        }
                    } else {
                        drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                        if (drawable instanceof org.telegram.ui.Components.v9) {
                            this.f22434a = ((org.telegram.ui.Components.v9) drawable).c(canvas, this);
                        } else {
                            drawable.draw(canvas);
                        }
                    }
                    if (i11 == 0 && this.d != null && themeAnimationValue >= 1.0f) {
                        org.telegram.ui.Components.u9 u9Var2 = this.f22435b;
                        if (u9Var2 != null) {
                            u9Var2.dispose();
                            this.f22435b = null;
                        }
                        this.d = null;
                        invalidate();
                    }
                }
            }
        }
        int measuredWidth2 = getMeasuredWidth();
        int measuredHeight2 = getMeasuredHeight();
        Drawable drawable4 = this.f22437f;
        drawable4.setBounds(0, 0, measuredWidth2, measuredHeight2);
        drawable4.draw(canvas);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f22438n != 2 && !a()) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f22438n != 2 && !a()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setOverrideBackground(Drawable drawable) {
        this.f22441w = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        if ((this.f22441w instanceof vn) && isAttachedToWindow()) {
            ((vn) this.f22441w).f(this);
        }
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f22441w && drawable != this.d && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public ga(android.content.Context r25, org.telegram.ui.ActionBar.h5 r26, int r27, long r28, org.telegram.ui.ActionBar.g6 r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ga.<init>(android.content.Context, org.telegram.ui.ActionBar.h5, int, long, org.telegram.ui.ActionBar.g6):void");
    }

    @Override
    public final void dispatchSetPressed(boolean z10) {
    }
}
