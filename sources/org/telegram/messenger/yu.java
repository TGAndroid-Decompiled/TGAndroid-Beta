package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
public final class yu extends xu {
    public h6.m f27828d0;
    public org.telegram.ui.Components.dc f27829e0;
    public boolean f27830f0;
    public boolean f27831g0;
    public boolean f27832h0;
    public boolean f27833i0;
    public float f27834j0;
    public int f27835k0;
    public final Drawable f27836l0;
    public int m0;

    public yu(iv ivVar, Rect rect, int i7, TL_iv.pageBlockBlockquote pageblockblockquote, SpannableStringBuilder spannableStringBuilder) {
        super(ivVar, rect, i7, spannableStringBuilder);
        this.f27836l0 = i5.c.g(t0.f26609b, 2131230871);
        boolean z10 = pageblockblockquote.collapsed;
        this.f27832h0 = z10;
        this.f27833i0 = z10;
    }

    @Override
    public final int I() {
        if (this.f27832h0) {
            Rect rect = this.f22942b;
            return (int) Math.min((this.X.f24222b.getPaint().getTextSize() * 1.4f * 3.0f) + rect.top + this.f27605a0 + rect.bottom, super.I());
        }
        return super.I();
    }

    @Override
    public final void W(Canvas canvas) {
        float f10;
        boolean z10;
        org.telegram.ui.Components.dc dcVar = this.f27829e0;
        if (dcVar != null) {
            f10 = dcVar.a(0.01f);
        } else {
            f10 = 1.0f;
        }
        int i7 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
        int i10 = this.f22943c;
        if (i7 != 0) {
            canvas.save();
            canvas.scale(f10, f10, i10 / 2.0f, I() / 2.0f);
        }
        if (this.f27834j0 > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i11 = (this.f27835k0 - this.f22942b.bottom) - this.f27606b0;
        canvas.save();
        canvas.clipRect(0, 0, i10, i11);
        if (z10) {
            canvas.saveLayer(0.0f, 0.0f, i10, i11, null);
        }
        super.W(canvas);
        if (z10) {
            if (this.f27828d0 == null) {
                this.f27828d0 = new h6.m(29);
            }
            RectF rectF = g0.P;
            rectF.set(0.0f, i11 - g0.L(24.0f), i10, i11 + 1);
            this.f27828d0.m(canvas, rectF, 3, this.f27834j0);
            canvas.restore();
        }
        canvas.restore();
        iv ivVar = this.f22941a;
        int i12 = ivVar.f24466y.i();
        int i13 = this.m0;
        Drawable drawable = this.f27836l0;
        if (i12 != i13) {
            int i14 = ivVar.f24466y.i();
            this.m0 = i14;
            drawable.setColorFilter(new PorterDuffColorFilter(i14, PorterDuff.Mode.SRC_IN));
        }
        bg.s.e(this.f27836l0, ivVar.C - g0.L(24.0f), g0.L(8.0f) + ((i11 - g0.L(16.0f)) - g0.L(2.0f)), g0.L(16.0f), g0.L(16.0f), 17);
        canvas.save();
        canvas.rotate(g0.W1(this.f27834j0, 180, 0), drawable.getBounds().exactCenterX(), drawable.getBounds().exactCenterY());
        drawable.draw(canvas);
        canvas.restore();
        if (i7 != 0) {
            canvas.restore();
        }
    }

    @Override
    public final boolean Y(MotionEvent motionEvent) {
        View view;
        int actionMasked = motionEvent.getActionMasked();
        if (this.f27831g0) {
            if (actionMasked == 1 || actionMasked == 3) {
                this.f27831g0 = false;
            }
            return super.Y(motionEvent);
        }
        iv ivVar = this.f22941a;
        if (actionMasked == 0) {
            boolean Y = super.Y(motionEvent);
            this.f27831g0 = Y;
            if (!Y) {
                this.f27830f0 = true;
                if (this.f27829e0 == null && (view = ivVar.Q) != null) {
                    this.f27829e0 = new org.telegram.ui.Components.dc(view);
                }
                org.telegram.ui.Components.dc dcVar = this.f27829e0;
                if (dcVar != null) {
                    dcVar.c(true);
                    return true;
                }
            }
        } else if (actionMasked == 1) {
            if (!this.f27830f0) {
                return false;
            }
            this.f27830f0 = false;
            org.telegram.ui.Components.dc dcVar2 = this.f27829e0;
            if (dcVar2 != null) {
                dcVar2.c(false);
            }
            View view2 = ivVar.Q;
            if (view2 != null) {
                view2.playSoundEffect(0);
            }
            ivVar.X();
            this.f27832h0 = !this.f27832h0;
            ivVar.f24463u = true;
            ivVar.Q();
            View view3 = ivVar.Q;
            if (view3 != null) {
                view3.invalidate();
            }
            org.telegram.ui.Cells.q1 q1Var = ivVar.E;
            org.telegram.ui.Cells.l1 l1Var = ivVar.F;
            if (q1Var != null && l1Var != null) {
                l1Var.B1(q1Var, true, true);
            }
        } else {
            if (actionMasked == 3) {
                this.f27830f0 = false;
                org.telegram.ui.Components.dc dcVar3 = this.f27829e0;
                if (dcVar3 != null) {
                    dcVar3.c(false);
                }
            }
            return this.f27830f0;
        }
        return true;
    }

    @Override
    public final void d0() {
        super.d0();
        this.f27833i0 = this.f27832h0;
    }

    @Override
    public final float z() {
        org.telegram.ui.Components.dc dcVar = this.f27829e0;
        if (dcVar != null) {
            return dcVar.a(0.01f);
        }
        return 1.0f;
    }
}
