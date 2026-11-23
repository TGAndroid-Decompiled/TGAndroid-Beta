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
import org.telegram.messenger.bz;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.za0;
import org.telegram.ui.en;
public class ba extends LinearLayout {
    public final f E;
    public Drawable F;
    public boolean G;
    public final org.telegram.ui.Components.c6 H;
    public org.telegram.ui.Components.n9 f30540a;
    public org.telegram.ui.Components.n9 f30541b;
    public Drawable f30542c;
    public Drawable d;
    public ColorDrawable f30543e;
    public boolean f30544f;
    public boolean h;
    public final r1[] f30545n;
    public final Drawable f30546r;
    public final org.telegram.ui.ActionBar.r4 f30547s;
    public final int f30548w;
    public org.telegram.ui.ActionBar.g2 f30549x;
    public int f30550y;

    public ba(Context context, org.telegram.ui.ActionBar.r4 r4Var, int i7) {
        this(context, r4Var, i7, 0L, null);
    }

    private Drawable getCompactBackground() {
        int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29771ua, false);
        ColorDrawable colorDrawable = this.f30543e;
        if (colorDrawable == null || colorDrawable.getColor() != x02) {
            this.f30543e = new ColorDrawable(x02);
        }
        return this.f30543e;
    }

    public final boolean a() {
        int i7 = this.f30548w;
        if (i7 != 3 && i7 != 0) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f30548w != 2 && !a()) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public r1[] getCells() {
        return this.f30545n;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        int i7 = 0;
        while (true) {
            r1[] r1VarArr = this.f30545n;
            if (i7 < r1VarArr.length) {
                r1VarArr[i7].invalidate();
                i7++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.F;
        if (drawable instanceof en) {
            ((en) drawable).f(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.n9 n9Var = this.f30540a;
        if (n9Var != null) {
            n9Var.dispose();
            this.f30540a = null;
        }
        org.telegram.ui.Components.n9 n9Var2 = this.f30541b;
        if (n9Var2 != null) {
            n9Var2.dispose();
            this.f30541b = null;
        }
        Drawable drawable = this.F;
        if (drawable instanceof en) {
            ((en) drawable).g(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z10;
        float e10;
        Drawable drawable;
        int i7;
        boolean z11;
        Drawable drawable2 = this.F;
        if (drawable2 == null) {
            drawable2 = org.telegram.ui.ActionBar.n6.t0();
        }
        if (org.telegram.ui.ActionBar.n6.d != null) {
            invalidate();
        }
        if (this.F == null && bz.H0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            drawable2 = getCompactBackground();
        }
        if (this.f30544f != z10) {
            this.f30544f = z10;
            if (this.f30542c != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.h = z11;
        }
        Drawable drawable3 = this.f30542c;
        org.telegram.ui.Components.c6 c6Var = this.H;
        if (drawable2 != drawable3 && drawable2 != null) {
            if (!org.telegram.ui.ActionBar.n6.h1() && !this.G && !this.h) {
                org.telegram.ui.Components.n9 n9Var = this.f30540a;
                if (n9Var != null) {
                    n9Var.dispose();
                    this.f30540a = null;
                }
            } else {
                this.d = this.f30542c;
                this.f30541b = this.f30540a;
            }
            this.f30542c = drawable2;
            c6Var.e(true, 0.0f);
        }
        boolean z12 = this.G;
        org.telegram.ui.ActionBar.r4 r4Var = this.f30547s;
        if (!z12 && !this.h) {
            e10 = r4Var.getThemeAnimationValue();
        } else {
            e10 = c6Var.e(false, 1.0f);
        }
        for (int i10 = 0; i10 < 2; i10++) {
            if (i10 == 0) {
                drawable = this.d;
            } else {
                drawable = this.f30542c;
            }
            if (drawable != null) {
                if (i10 == 1 && this.d != null && (r4Var != null || this.G)) {
                    i7 = (int) (255.0f * e10);
                } else {
                    i7 = 255;
                }
                if (i7 > 0) {
                    drawable.setAlpha(i7);
                    if (!(drawable instanceof ColorDrawable) && !(drawable instanceof GradientDrawable) && !(drawable instanceof za0)) {
                        if (drawable instanceof BitmapDrawable) {
                            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                            bitmapDrawable.setFilterBitmap(true);
                            if (bitmapDrawable.getTileModeX() == Shader.TileMode.REPEAT) {
                                canvas.save();
                                float f10 = 2.0f / org.telegram.messenger.g0.f24225p;
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
                            hi.x7.j(canvas, drawable, getWidth(), getHeight());
                        }
                    } else {
                        drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                        if (drawable instanceof org.telegram.ui.Components.o9) {
                            this.f30540a = ((org.telegram.ui.Components.o9) drawable).c(canvas, this);
                        } else {
                            drawable.draw(canvas);
                        }
                    }
                    if (i10 == 0 && this.d != null && e10 >= 1.0f) {
                        org.telegram.ui.Components.n9 n9Var2 = this.f30541b;
                        if (n9Var2 != null) {
                            n9Var2.dispose();
                            this.f30541b = null;
                        }
                        this.d = null;
                        this.h = false;
                        invalidate();
                    }
                }
            }
        }
        if ((getParent() instanceof ek0) && ((ek0) getParent()).b1()) {
            return;
        }
        int measuredWidth2 = getMeasuredWidth();
        int measuredHeight2 = getMeasuredHeight();
        Drawable drawable4 = this.f30546r;
        drawable4.setBounds(0, 0, measuredWidth2, measuredHeight2);
        drawable4.draw(canvas);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f30548w != 2 && !a()) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f30548w != 2 && !a()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setOverrideBackground(Drawable drawable) {
        this.F = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        if ((this.F instanceof en) && isAttachedToWindow()) {
            ((en) this.F).f(this);
        }
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.F && drawable != this.d && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public ba(android.content.Context r25, org.telegram.ui.ActionBar.r4 r26, int r27, long r28, org.telegram.ui.ActionBar.i6 r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ba.<init>(android.content.Context, org.telegram.ui.ActionBar.r4, int, long, org.telegram.ui.ActionBar.i6):void");
    }

    @Override
    public final void dispatchSetPressed(boolean z10) {
    }
}
