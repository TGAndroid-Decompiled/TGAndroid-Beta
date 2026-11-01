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
import org.telegram.messenger.uz;
import org.telegram.ui.Components.jb0;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.xn;
public class z9 extends LinearLayout {
    public final f D;
    public Drawable E;
    public boolean F;
    public final org.telegram.ui.Components.t5 G;
    public org.telegram.ui.Components.e9 f23654a;
    public org.telegram.ui.Components.e9 f23655b;
    public Drawable f23656c;
    public Drawable d;
    public ColorDrawable e;
    public boolean f23657f;
    public boolean h;
    public final q1[] f23658n;
    public final Drawable f23659r;
    public final org.telegram.ui.ActionBar.z4 f23660s;
    public final int f23661w;
    public org.telegram.ui.ActionBar.k2 f23662x;
    public int f23663y;

    public z9(Context context, org.telegram.ui.ActionBar.z4 z4Var, int i10) {
        this(context, z4Var, i10, 0L, null);
    }

    private Drawable getCompactBackground() {
        int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.ua, false);
        ColorDrawable colorDrawable = this.e;
        if (colorDrawable == null || colorDrawable.getColor() != x02) {
            this.e = new ColorDrawable(x02);
        }
        return this.e;
    }

    public final boolean a() {
        int i10 = this.f23661w;
        if (i10 != 3 && i10 != 0) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f23661w != 2 && !a()) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public q1[] getCells() {
        return this.f23658n;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        int i10 = 0;
        while (true) {
            q1[] q1VarArr = this.f23658n;
            if (i10 < q1VarArr.length) {
                q1VarArr[i10].invalidate();
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.E;
        if (drawable instanceof xn) {
            ((xn) drawable).f(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.e9 e9Var = this.f23654a;
        if (e9Var != null) {
            e9Var.dispose();
            this.f23654a = null;
        }
        org.telegram.ui.Components.e9 e9Var2 = this.f23655b;
        if (e9Var2 != null) {
            e9Var2.dispose();
            this.f23655b = null;
        }
        Drawable drawable = this.E;
        if (drawable instanceof xn) {
            ((xn) drawable).g(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z10;
        float e;
        Drawable drawable;
        int i10;
        boolean z11;
        Drawable drawable2 = this.E;
        if (drawable2 == null) {
            drawable2 = org.telegram.ui.ActionBar.t6.t0();
        }
        if (org.telegram.ui.ActionBar.t6.d != null) {
            invalidate();
        }
        if (this.E == null && uz.H0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            drawable2 = getCompactBackground();
        }
        if (this.f23657f != z10) {
            this.f23657f = z10;
            if (this.f23656c != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.h = z11;
        }
        Drawable drawable3 = this.f23656c;
        org.telegram.ui.Components.t5 t5Var = this.G;
        if (drawable2 != drawable3 && drawable2 != null) {
            if (!org.telegram.ui.ActionBar.t6.h1() && !this.F && !this.h) {
                org.telegram.ui.Components.e9 e9Var = this.f23654a;
                if (e9Var != null) {
                    e9Var.dispose();
                    this.f23654a = null;
                }
            } else {
                this.d = this.f23656c;
                this.f23655b = this.f23654a;
            }
            this.f23656c = drawable2;
            t5Var.e(true, 0.0f);
        }
        boolean z12 = this.F;
        org.telegram.ui.ActionBar.z4 z4Var = this.f23660s;
        if (!z12 && !this.h) {
            e = z4Var.getThemeAnimationValue();
        } else {
            e = t5Var.e(false, 1.0f);
        }
        for (int i11 = 0; i11 < 2; i11++) {
            if (i11 == 0) {
                drawable = this.d;
            } else {
                drawable = this.f23656c;
            }
            if (drawable != null) {
                if (i11 == 1 && this.d != null && (z4Var != null || this.F)) {
                    i10 = (int) (255.0f * e);
                } else {
                    i10 = 255;
                }
                if (i10 > 0) {
                    drawable.setAlpha(i10);
                    if (!(drawable instanceof ColorDrawable) && !(drawable instanceof GradientDrawable) && !(drawable instanceof jb0)) {
                        if (drawable instanceof BitmapDrawable) {
                            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                            bitmapDrawable.setFilterBitmap(true);
                            if (bitmapDrawable.getTileModeX() == Shader.TileMode.REPEAT) {
                                canvas.save();
                                float f7 = 2.0f / org.telegram.messenger.i0.f16171p;
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
                            vh.n5.j(canvas, drawable, getWidth(), getHeight());
                        }
                    } else {
                        drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                        if (drawable instanceof org.telegram.ui.Components.f9) {
                            this.f23654a = ((org.telegram.ui.Components.f9) drawable).c(canvas, this);
                        } else {
                            drawable.draw(canvas);
                        }
                    }
                    if (i11 == 0 && this.d != null && e >= 1.0f) {
                        org.telegram.ui.Components.e9 e9Var2 = this.f23655b;
                        if (e9Var2 != null) {
                            e9Var2.dispose();
                            this.f23655b = null;
                        }
                        this.d = null;
                        this.h = false;
                        invalidate();
                    }
                }
            }
        }
        if ((getParent() instanceof uk0) && ((uk0) getParent()).b1()) {
            return;
        }
        int measuredWidth2 = getMeasuredWidth();
        int measuredHeight2 = getMeasuredHeight();
        Drawable drawable4 = this.f23659r;
        drawable4.setBounds(0, 0, measuredWidth2, measuredHeight2);
        drawable4.draw(canvas);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f23661w != 2 && !a()) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f23661w != 2 && !a()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setOverrideBackground(Drawable drawable) {
        this.E = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        if ((this.E instanceof xn) && isAttachedToWindow()) {
            ((xn) this.E).f(this);
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

    public z9(android.content.Context r25, org.telegram.ui.ActionBar.z4 r26, int r27, long r28, org.telegram.ui.ActionBar.p6 r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.z9.<init>(android.content.Context, org.telegram.ui.ActionBar.z4, int, long, org.telegram.ui.ActionBar.p6):void");
    }

    @Override
    public final void dispatchSetPressed(boolean z10) {
    }
}
