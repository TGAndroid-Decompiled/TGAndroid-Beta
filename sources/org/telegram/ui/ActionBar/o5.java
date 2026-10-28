package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ds;
public final class o5 extends View implements oe.d {
    public Drawable f22918a;
    public Drawable f22919b;
    public final Drawable f22920c;
    public final oe.b d;
    public final oe.e e;
    public final r5 f22921f;

    public o5(r5 r5Var, Context context) {
        super(context);
        this.f22921f = r5Var;
        ds dsVar = ds.h;
        this.d = new oe.b(0, this, dsVar, 380L, false);
        this.e = new oe.e(1, this, dsVar, 380L, 1.0f);
        this.f22920c = context.getDrawable(R.drawable.ic_ab_close).mutate();
        d();
    }

    public static void a(Canvas canvas, Drawable drawable, float f7, float f10, float f11, float f12) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            intrinsicWidth = AndroidUtilities.dp(24.0f);
            intrinsicHeight = intrinsicWidth;
        }
        drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        drawable.setAlpha((int) (255.0f * f11));
        canvas.save();
        canvas.rotate(f12, f7, f10);
        float lerp = AndroidUtilities.lerp(0.6f, 1.0f, f11);
        canvas.scale(lerp, lerp, f7, f10);
        canvas.translate(f7 - (intrinsicWidth / 2.0f), f10 - (intrinsicHeight / 2.0f));
        drawable.draw(canvas);
        canvas.restore();
    }

    @Override
    public final void E(int i10, float f7, float f10, oe.e eVar) {
        invalidate();
    }

    public final void b(boolean z10, boolean z11) {
        float f7;
        Drawable drawable = this.f22918a;
        oe.b bVar = this.d;
        if (drawable == null) {
            if (z10) {
                bVar.a(true, false);
            }
        } else if (drawable instanceof j2) {
            j2 j2Var = (j2) drawable;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            j2Var.c(f7, z11);
        } else {
            bVar.a(z10, z11);
        }
    }

    public final void c(Drawable drawable) {
        oe.e eVar = this.e;
        eVar.b();
        eVar.c(1.0f);
        this.f22919b = null;
        Drawable drawable2 = this.f22918a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f22918a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (!this.f22921f.G) {
                this.d.a(false, false);
            }
        }
        d();
        invalidate();
    }

    public final void d() {
        r5 r5Var = this.f22921f;
        setBackground(y6.g0(r5Var.f23038f0, 1, -1));
        Drawable drawable = this.f22918a;
        if (drawable instanceof j2) {
            ((j2) drawable).a(r5Var.f23035d0);
            ((j2) this.f22918a).b(r5Var.f23036e0);
        } else if (drawable instanceof k5) {
            ((k5) drawable).f22816j = r5Var.f23035d0;
        } else if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(r5Var.f23035d0, PorterDuff.Mode.SRC_IN));
        }
        this.f22920c.setColorFilter(new PorterDuffColorFilter(r5Var.f23036e0, PorterDuff.Mode.SRC_IN));
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float f7;
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float f10 = this.d.e;
        float f11 = this.e.f19333f;
        Drawable drawable = this.f22919b;
        if (drawable != null && f11 < 0.5f) {
            float D = c3.h0.D(f11, 2.0f, 1.0f, 1.0f - f10);
            canvas2 = canvas;
            a(canvas2, drawable, width, height, D, 0.0f);
        } else {
            Drawable drawable2 = this.f22918a;
            if (drawable2 != null && f10 < 1.0f) {
                float f12 = 1.0f - f10;
                float f13 = (f11 - 0.5f) * 2.0f;
                if (drawable == null) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                canvas2 = canvas;
                a(canvas2, drawable2, width, height, Math.min(1.0f, f13 + f7) * f12, f10 * (-90.0f));
            } else {
                canvas2 = canvas;
            }
        }
        if (f10 > 0.0f) {
            a(canvas2, this.f22920c, width, height, f10, (1.0f - f10) * 90.0f);
        }
    }

    @Override
    public final void setAlpha(float f7) {
        super.setAlpha(f7);
        this.f22921f.invalidate();
    }

    @Override
    public final void setTranslationX(float f7) {
        super.setTranslationX(f7);
        this.f22921f.invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f22918a && drawable != this.f22919b && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    @Override
    public final void z(float f7, int i10) {
        if (i10 == 1 && f7 == 1.0f) {
            this.f22919b = null;
        }
    }
}
