package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.tgnet.tl.TL_stars;
public final class xu0 extends View implements org.telegram.ui.ActionBar.b6 {
    public final r9 f42198a;
    public final vu0 f42199b;
    public final d6 f42200c;
    public boolean d;
    public wu0 f42201e;
    public boolean f42202f;
    public boolean h;

    public xu0(Context context) {
        super(context);
        ?? obj = new Object();
        obj.f41534c = -16777216;
        obj.d = -1;
        this.f42199b = obj;
        d6 d6Var = new d6(new uu0(this, 0), 380L, nr.h);
        this.f42200c = d6Var;
        r9 r9Var = new r9(context);
        this.f42198a = r9Var;
        r9Var.setCallback(this);
        this.d = false;
        d6Var.e(false, 0.0f);
        a();
    }

    public final void a() {
        boolean z10;
        if (this.h && this.f42202f) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
        this.f42200c.d(z10);
        setEnabled(this.d);
        setClickable(this.d);
        invalidate();
    }

    public float getVisibilityFactor() {
        return this.f42200c.f34349c;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f42198a.getClass();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f42198a.getClass();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float d = this.f42200c.d(this.d);
        int z10 = org.telegram.messenger.o10.z(24.0f, getMeasuredWidth(), 2);
        canvas.save();
        canvas.translate(z10, (getMeasuredHeight() - org.telegram.messenger.g0.L(24.0f)) / 2);
        canvas.scale(d, d, 0.0f, org.telegram.messenger.g0.L(12.0f));
        int L = org.telegram.messenger.g0.L(24.0f);
        int L2 = org.telegram.messenger.g0.L(24.0f);
        r9 r9Var = this.f42198a;
        r9Var.setBounds(0, 0, L, L2);
        vu0 vu0Var = this.f42199b;
        int i7 = vu0Var.f41534c;
        if (r9Var.f39081f != i7) {
            r9Var.f39081f = i7;
            if (r9Var.f39079c != null) {
                r9Var.d.setColorFilter(i7, PorterDuff.Mode.MULTIPLY);
                r9Var.invalidateSelf();
            }
        }
        int i10 = vu0Var.d;
        if (r9Var.f39080e != i10) {
            r9Var.f39080e = i10;
            Drawable drawable = r9Var.f39079c;
            if (drawable != null) {
                drawable.setColorFilter(i10, PorterDuff.Mode.MULTIPLY);
                r9Var.invalidateSelf();
            }
        }
        int i11 = vu0Var.f41534c | (-16777216);
        if (r9Var.h != i11) {
            r9Var.h = i11;
            r9Var.f39078b.v(i11, false);
            r9Var.invalidateSelf();
        }
        r9Var.draw(canvas);
        canvas.restore();
    }

    public void set(TL_stars.Tl_starsRating tl_starsRating) {
        boolean z10;
        String str;
        int i7;
        int b10;
        if (tl_starsRating != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f42202f = z10;
        a();
        if (tl_starsRating == null) {
            return;
        }
        int i10 = tl_starsRating.level;
        r9 r9Var = this.f42198a;
        if (r9Var.f39083r != i10 || r9Var.f39079c == null || r9Var.d == null) {
            n6 n6Var = r9Var.f39078b;
            if (i10 >= 0) {
                str = Integer.toString(i10);
            } else {
                str = "!";
            }
            n6Var.t(str, true, true);
            r9Var.f39083r = i10;
            if (i10 < 0) {
                b10 = 18;
            } else {
                if (i10 <= 10) {
                    i7 = i10 - 1;
                } else {
                    i7 = (i10 / 10) + 8;
                }
                b10 = c8.m9.b(i7, 0, 17);
            }
            Context context = r9Var.f39077a;
            if (r9Var.f39082n != b10 || r9Var.f39079c == null || r9Var.d == null) {
                int i11 = b10 * 2;
                Drawable mutate = context.getResources().getDrawable(r9.f39076s[i11]).mutate();
                r9Var.f39079c = mutate;
                int i12 = r9Var.f39080e;
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                mutate.setColorFilter(i12, mode);
                Drawable mutate2 = context.getResources().getDrawable(r9.f39076s[i11 + 1]).mutate();
                r9Var.d = mutate2;
                mutate2.setColorFilter(r9Var.f39081f, mode);
                r9Var.f39082n = b10;
                Drawable drawable = r9Var.f39079c;
                if (drawable != null) {
                    drawable.setBounds(r9Var.getBounds());
                }
                Drawable drawable2 = r9Var.d;
                if (drawable2 != null) {
                    drawable2.setBounds(r9Var.getBounds());
                }
            }
            r9Var.invalidateSelf();
        }
        StringBuilder sb2 = new StringBuilder();
        org.telegram.ui.Cells.c0.u(null, 2131754796, sb2, " ");
        sb2.append(tl_starsRating.level);
        setContentDescription(sb2.toString());
        invalidate();
    }

    public void setDelegate(wu0 wu0Var) {
        this.f42201e = wu0Var;
    }

    public void setParentExpanded(float f10) {
        vu0 vu0Var = this.f42199b;
        vu0Var.f41535e = f10;
        vu0Var.a(vu0Var.f41532a);
        invalidate();
    }

    public void setResourcesProvider(org.telegram.ui.ActionBar.h6 h6Var) {
        this.f42199b.f41533b = h6Var;
    }

    public void setVisibility(boolean z10) {
        this.h = z10;
        a();
    }

    @Override
    public final void updateColors() {
        try {
            vu0 vu0Var = this.f42199b;
            vu0Var.a(vu0Var.f41532a);
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f42198a) {
            return false;
        }
        return true;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
