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
import org.telegram.messenger.az;
import org.telegram.ui.Components.la0;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.zm;
public class z9 extends LinearLayout {
    public final f E;
    public Drawable F;
    public boolean G;
    public final org.telegram.ui.Components.u5 H;
    public org.telegram.ui.Components.h9 f31061a;
    public org.telegram.ui.Components.h9 f31062b;
    public Drawable f31063c;
    public Drawable d;
    public ColorDrawable f31064e;
    public boolean f31065f;
    public boolean h;
    public final q1[] f31066n;
    public final Drawable f31067r;
    public final org.telegram.ui.ActionBar.q4 f31068s;
    public final int f31069w;
    public org.telegram.ui.ActionBar.d2 f31070x;
    public int f31071y;

    public z9(Context context, org.telegram.ui.ActionBar.q4 q4Var, int i3) {
        this(context, q4Var, i3, 0L, null);
    }

    private Drawable getCompactBackground() {
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28200ua, false);
        ColorDrawable colorDrawable = this.f31064e;
        if (colorDrawable == null || colorDrawable.getColor() != x02) {
            this.f31064e = new ColorDrawable(x02);
        }
        return this.f31064e;
    }

    public final boolean a() {
        int i3 = this.f31069w;
        if (i3 != 3 && i3 != 0) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f31069w != 2 && !a()) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public q1[] getCells() {
        return this.f31066n;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        int i3 = 0;
        while (true) {
            q1[] q1VarArr = this.f31066n;
            if (i3 < q1VarArr.length) {
                q1VarArr[i3].invalidate();
                i3++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.F;
        if (drawable instanceof zm) {
            ((zm) drawable).f(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.h9 h9Var = this.f31061a;
        if (h9Var != null) {
            h9Var.dispose();
            this.f31061a = null;
        }
        org.telegram.ui.Components.h9 h9Var2 = this.f31062b;
        if (h9Var2 != null) {
            h9Var2.dispose();
            this.f31062b = null;
        }
        Drawable drawable = this.F;
        if (drawable instanceof zm) {
            ((zm) drawable).g(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z10;
        float e10;
        Drawable drawable;
        int i3;
        boolean z11;
        Drawable drawable2 = this.F;
        if (drawable2 == null) {
            drawable2 = org.telegram.ui.ActionBar.k6.t0();
        }
        if (org.telegram.ui.ActionBar.k6.d != null) {
            invalidate();
        }
        if (this.F == null && az.H0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            drawable2 = getCompactBackground();
        }
        if (this.f31065f != z10) {
            this.f31065f = z10;
            if (this.f31063c != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.h = z11;
        }
        Drawable drawable3 = this.f31063c;
        org.telegram.ui.Components.u5 u5Var = this.H;
        if (drawable2 != drawable3 && drawable2 != null) {
            if (!org.telegram.ui.ActionBar.k6.h1() && !this.G && !this.h) {
                org.telegram.ui.Components.h9 h9Var = this.f31061a;
                if (h9Var != null) {
                    h9Var.dispose();
                    this.f31061a = null;
                }
            } else {
                this.d = this.f31063c;
                this.f31062b = this.f31061a;
            }
            this.f31063c = drawable2;
            u5Var.e(true, 0.0f);
        }
        boolean z12 = this.G;
        org.telegram.ui.ActionBar.q4 q4Var = this.f31068s;
        if (!z12 && !this.h) {
            e10 = q4Var.getThemeAnimationValue();
        } else {
            e10 = u5Var.e(false, 1.0f);
        }
        for (int i10 = 0; i10 < 2; i10++) {
            if (i10 == 0) {
                drawable = this.d;
            } else {
                drawable = this.f31063c;
            }
            if (drawable != null) {
                if (i10 == 1 && this.d != null && (q4Var != null || this.G)) {
                    i3 = (int) (255.0f * e10);
                } else {
                    i3 = 255;
                }
                if (i3 > 0) {
                    drawable.setAlpha(i3);
                    if (!(drawable instanceof ColorDrawable) && !(drawable instanceof GradientDrawable) && !(drawable instanceof la0)) {
                        if (drawable instanceof BitmapDrawable) {
                            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                            bitmapDrawable.setFilterBitmap(true);
                            if (bitmapDrawable.getTileModeX() == Shader.TileMode.REPEAT) {
                                canvas.save();
                                float f10 = 2.0f / org.telegram.messenger.g0.f22607p;
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
                            gi.f7.j(canvas, drawable, getWidth(), getHeight());
                        }
                    } else {
                        drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                        if (drawable instanceof org.telegram.ui.Components.j9) {
                            this.f31061a = ((org.telegram.ui.Components.j9) drawable).c(canvas, this);
                        } else {
                            drawable.draw(canvas);
                        }
                    }
                    if (i10 == 0 && this.d != null && e10 >= 1.0f) {
                        org.telegram.ui.Components.h9 h9Var2 = this.f31062b;
                        if (h9Var2 != null) {
                            h9Var2.dispose();
                            this.f31062b = null;
                        }
                        this.d = null;
                        this.h = false;
                        invalidate();
                    }
                }
            }
        }
        if ((getParent() instanceof tj0) && ((tj0) getParent()).b1()) {
            return;
        }
        int measuredWidth2 = getMeasuredWidth();
        int measuredHeight2 = getMeasuredHeight();
        Drawable drawable4 = this.f31067r;
        drawable4.setBounds(0, 0, measuredWidth2, measuredHeight2);
        drawable4.draw(canvas);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f31069w != 2 && !a()) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f31069w != 2 && !a()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setOverrideBackground(Drawable drawable) {
        this.F = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        if ((this.F instanceof zm) && isAttachedToWindow()) {
            ((zm) this.F).f(this);
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

    public z9(android.content.Context r25, org.telegram.ui.ActionBar.q4 r26, int r27, long r28, org.telegram.ui.ActionBar.e6 r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.z9.<init>(android.content.Context, org.telegram.ui.ActionBar.q4, int, long, org.telegram.ui.ActionBar.e6):void");
    }

    @Override
    public final void dispatchSetPressed(boolean z10) {
    }
}
