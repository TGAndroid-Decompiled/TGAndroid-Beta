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
import org.telegram.messenger.iz;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.qa0;
import org.telegram.ui.dn;
public class z9 extends LinearLayout {
    public final f D;
    public Drawable E;
    public boolean F;
    public final org.telegram.ui.Components.w5 G;
    public org.telegram.ui.Components.j9 f30988a;
    public org.telegram.ui.Components.j9 f30989b;
    public Drawable f30990c;
    public Drawable d;
    public ColorDrawable f30991e;
    public boolean f30992f;
    public boolean h;
    public final q1[] f30993n;
    public final Drawable f30994r;
    public final org.telegram.ui.ActionBar.q4 f30995s;
    public final int f30996w;
    public org.telegram.ui.ActionBar.f2 f30997x;
    public int f30998y;

    public z9(Context context, org.telegram.ui.ActionBar.q4 q4Var, int i7) {
        this(context, q4Var, i7, 0L, null);
    }

    private Drawable getCompactBackground() {
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28169ua, false);
        ColorDrawable colorDrawable = this.f30991e;
        if (colorDrawable == null || colorDrawable.getColor() != x02) {
            this.f30991e = new ColorDrawable(x02);
        }
        return this.f30991e;
    }

    public final boolean a() {
        int i7 = this.f30996w;
        if (i7 != 3 && i7 != 0) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f30996w != 2 && !a()) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public q1[] getCells() {
        return this.f30993n;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        int i7 = 0;
        while (true) {
            q1[] q1VarArr = this.f30993n;
            if (i7 < q1VarArr.length) {
                q1VarArr[i7].invalidate();
                i7++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.E;
        if (drawable instanceof dn) {
            ((dn) drawable).f(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.j9 j9Var = this.f30988a;
        if (j9Var != null) {
            j9Var.dispose();
            this.f30988a = null;
        }
        org.telegram.ui.Components.j9 j9Var2 = this.f30989b;
        if (j9Var2 != null) {
            j9Var2.dispose();
            this.f30989b = null;
        }
        Drawable drawable = this.E;
        if (drawable instanceof dn) {
            ((dn) drawable).g(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z9;
        float e10;
        Drawable drawable;
        int i7;
        boolean z10;
        Drawable drawable2 = this.E;
        if (drawable2 == null) {
            drawable2 = org.telegram.ui.ActionBar.k6.t0();
        }
        if (org.telegram.ui.ActionBar.k6.d != null) {
            invalidate();
        }
        if (this.E == null && iz.H0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            drawable2 = getCompactBackground();
        }
        if (this.f30992f != z9) {
            this.f30992f = z9;
            if (this.f30990c != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.h = z10;
        }
        Drawable drawable3 = this.f30990c;
        org.telegram.ui.Components.w5 w5Var = this.G;
        if (drawable2 != drawable3 && drawable2 != null) {
            if (!org.telegram.ui.ActionBar.k6.h1() && !this.F && !this.h) {
                org.telegram.ui.Components.j9 j9Var = this.f30988a;
                if (j9Var != null) {
                    j9Var.dispose();
                    this.f30988a = null;
                }
            } else {
                this.d = this.f30990c;
                this.f30989b = this.f30988a;
            }
            this.f30990c = drawable2;
            w5Var.e(true, 0.0f);
        }
        boolean z11 = this.F;
        org.telegram.ui.ActionBar.q4 q4Var = this.f30995s;
        if (!z11 && !this.h) {
            e10 = q4Var.getThemeAnimationValue();
        } else {
            e10 = w5Var.e(false, 1.0f);
        }
        for (int i10 = 0; i10 < 2; i10++) {
            if (i10 == 0) {
                drawable = this.d;
            } else {
                drawable = this.f30990c;
            }
            if (drawable != null) {
                if (i10 == 1 && this.d != null && (q4Var != null || this.F)) {
                    i7 = (int) (255.0f * e10);
                } else {
                    i7 = 255;
                }
                if (i7 > 0) {
                    drawable.setAlpha(i7);
                    if (!(drawable instanceof ColorDrawable) && !(drawable instanceof GradientDrawable) && !(drawable instanceof qa0)) {
                        if (drawable instanceof BitmapDrawable) {
                            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                            bitmapDrawable.setFilterBitmap(true);
                            if (bitmapDrawable.getTileModeX() == Shader.TileMode.REPEAT) {
                                canvas.save();
                                float f10 = 2.0f / org.telegram.messenger.g0.f22543p;
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
                            fi.e7.j(canvas, drawable, getWidth(), getHeight());
                        }
                    } else {
                        drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                        if (drawable instanceof org.telegram.ui.Components.k9) {
                            this.f30988a = ((org.telegram.ui.Components.k9) drawable).c(canvas, this);
                        } else {
                            drawable.draw(canvas);
                        }
                    }
                    if (i10 == 0 && this.d != null && e10 >= 1.0f) {
                        org.telegram.ui.Components.j9 j9Var2 = this.f30989b;
                        if (j9Var2 != null) {
                            j9Var2.dispose();
                            this.f30989b = null;
                        }
                        this.d = null;
                        this.h = false;
                        invalidate();
                    }
                }
            }
        }
        if ((getParent() instanceof pj0) && ((pj0) getParent()).b1()) {
            return;
        }
        int measuredWidth2 = getMeasuredWidth();
        int measuredHeight2 = getMeasuredHeight();
        Drawable drawable4 = this.f30994r;
        drawable4.setBounds(0, 0, measuredWidth2, measuredHeight2);
        drawable4.draw(canvas);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f30996w != 2 && !a()) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f30996w != 2 && !a()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setOverrideBackground(Drawable drawable) {
        this.E = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        if ((this.E instanceof dn) && isAttachedToWindow()) {
            ((dn) this.E).f(this);
        }
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.E && drawable != this.d && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public z9(android.content.Context r25, org.telegram.ui.ActionBar.q4 r26, int r27, long r28, org.telegram.ui.ActionBar.f6 r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.z9.<init>(android.content.Context, org.telegram.ui.ActionBar.q4, int, long, org.telegram.ui.ActionBar.f6):void");
    }

    @Override
    public final void dispatchSetPressed(boolean z9) {
    }
}
