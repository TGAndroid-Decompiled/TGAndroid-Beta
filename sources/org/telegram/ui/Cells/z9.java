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
import org.telegram.ui.fn;
public class z9 extends LinearLayout {
    public final f D;
    public Drawable E;
    public boolean F;
    public final org.telegram.ui.Components.v5 G;
    public org.telegram.ui.Components.i9 f31008a;
    public org.telegram.ui.Components.i9 f31009b;
    public Drawable f31010c;
    public Drawable d;
    public ColorDrawable f31011e;
    public boolean f31012f;
    public boolean h;
    public final q1[] f31013n;
    public final Drawable f31014r;
    public final org.telegram.ui.ActionBar.r4 f31015s;
    public final int f31016w;
    public org.telegram.ui.ActionBar.f2 f31017x;
    public int f31018y;

    public z9(Context context, org.telegram.ui.ActionBar.r4 r4Var, int i7) {
        this(context, r4Var, i7, 0L, null);
    }

    private Drawable getCompactBackground() {
        int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f28210ua, false);
        ColorDrawable colorDrawable = this.f31011e;
        if (colorDrawable == null || colorDrawable.getColor() != x02) {
            this.f31011e = new ColorDrawable(x02);
        }
        return this.f31011e;
    }

    public final boolean a() {
        int i7 = this.f31016w;
        if (i7 != 3 && i7 != 0) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f31016w != 2 && !a()) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public q1[] getCells() {
        return this.f31013n;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        int i7 = 0;
        while (true) {
            q1[] q1VarArr = this.f31013n;
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
        if (drawable instanceof fn) {
            ((fn) drawable).f(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.i9 i9Var = this.f31008a;
        if (i9Var != null) {
            i9Var.dispose();
            this.f31008a = null;
        }
        org.telegram.ui.Components.i9 i9Var2 = this.f31009b;
        if (i9Var2 != null) {
            i9Var2.dispose();
            this.f31009b = null;
        }
        Drawable drawable = this.E;
        if (drawable instanceof fn) {
            ((fn) drawable).g(this);
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
            drawable2 = org.telegram.ui.ActionBar.m6.t0();
        }
        if (org.telegram.ui.ActionBar.m6.d != null) {
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
        if (this.f31012f != z9) {
            this.f31012f = z9;
            if (this.f31010c != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.h = z10;
        }
        Drawable drawable3 = this.f31010c;
        org.telegram.ui.Components.v5 v5Var = this.G;
        if (drawable2 != drawable3 && drawable2 != null) {
            if (!org.telegram.ui.ActionBar.m6.h1() && !this.F && !this.h) {
                org.telegram.ui.Components.i9 i9Var = this.f31008a;
                if (i9Var != null) {
                    i9Var.dispose();
                    this.f31008a = null;
                }
            } else {
                this.d = this.f31010c;
                this.f31009b = this.f31008a;
            }
            this.f31010c = drawable2;
            v5Var.e(true, 0.0f);
        }
        boolean z11 = this.F;
        org.telegram.ui.ActionBar.r4 r4Var = this.f31015s;
        if (!z11 && !this.h) {
            e10 = r4Var.getThemeAnimationValue();
        } else {
            e10 = v5Var.e(false, 1.0f);
        }
        for (int i10 = 0; i10 < 2; i10++) {
            if (i10 == 0) {
                drawable = this.d;
            } else {
                drawable = this.f31010c;
            }
            if (drawable != null) {
                if (i10 == 1 && this.d != null && (r4Var != null || this.F)) {
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
                                float f10 = 2.0f / org.telegram.messenger.g0.f22566p;
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
                        if (drawable instanceof org.telegram.ui.Components.j9) {
                            this.f31008a = ((org.telegram.ui.Components.j9) drawable).c(canvas, this);
                        } else {
                            drawable.draw(canvas);
                        }
                    }
                    if (i10 == 0 && this.d != null && e10 >= 1.0f) {
                        org.telegram.ui.Components.i9 i9Var2 = this.f31009b;
                        if (i9Var2 != null) {
                            i9Var2.dispose();
                            this.f31009b = null;
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
        Drawable drawable4 = this.f31014r;
        drawable4.setBounds(0, 0, measuredWidth2, measuredHeight2);
        drawable4.draw(canvas);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f31016w != 2 && !a()) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f31016w != 2 && !a()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setOverrideBackground(Drawable drawable) {
        this.E = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        if ((this.E instanceof fn) && isAttachedToWindow()) {
            ((fn) this.E).f(this);
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

    public z9(android.content.Context r25, org.telegram.ui.ActionBar.r4 r26, int r27, long r28, org.telegram.ui.ActionBar.h6 r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.z9.<init>(android.content.Context, org.telegram.ui.ActionBar.r4, int, long, org.telegram.ui.ActionBar.h6):void");
    }

    @Override
    public final void dispatchSetPressed(boolean z9) {
    }
}
