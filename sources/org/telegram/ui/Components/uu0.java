package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.tgnet.tl.TL_stars;
public final class uu0 extends View implements org.telegram.ui.ActionBar.c6 {
    public final r9 f40421a;
    public final su0 f40422b;
    public final c6 f40423c;
    public boolean d;
    public tu0 f40424e;
    public boolean f40425f;
    public boolean h;

    public uu0(Context context) {
        super(context);
        ?? obj = new Object();
        obj.f39848c = -16777216;
        obj.d = -1;
        this.f40422b = obj;
        c6 c6Var = new c6(new ru0(this, 0), 380L, lr.h);
        this.f40423c = c6Var;
        r9 r9Var = new r9(context);
        this.f40421a = r9Var;
        r9Var.setCallback(this);
        this.d = false;
        c6Var.e(false, 0.0f);
        a();
    }

    public final void a() {
        boolean z10;
        if (this.h && this.f40425f) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
        this.f40423c.d(z10);
        setEnabled(this.d);
        setClickable(this.d);
        invalidate();
    }

    public float getVisibilityFactor() {
        return this.f40423c.f33892c;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f40421a.getClass();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f40421a.getClass();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float d = this.f40423c.d(this.d);
        int z10 = org.telegram.messenger.n10.z(24.0f, getMeasuredWidth(), 2);
        canvas.save();
        canvas.translate(z10, (getMeasuredHeight() - org.telegram.messenger.g0.L(24.0f)) / 2);
        canvas.scale(d, d, 0.0f, org.telegram.messenger.g0.L(12.0f));
        int L = org.telegram.messenger.g0.L(24.0f);
        int L2 = org.telegram.messenger.g0.L(24.0f);
        r9 r9Var = this.f40421a;
        r9Var.setBounds(0, 0, L, L2);
        su0 su0Var = this.f40422b;
        int i7 = su0Var.f39848c;
        if (r9Var.f39071f != i7) {
            r9Var.f39071f = i7;
            if (r9Var.f39069c != null) {
                r9Var.d.setColorFilter(i7, PorterDuff.Mode.MULTIPLY);
                r9Var.invalidateSelf();
            }
        }
        int i10 = su0Var.d;
        if (r9Var.f39070e != i10) {
            r9Var.f39070e = i10;
            Drawable drawable = r9Var.f39069c;
            if (drawable != null) {
                drawable.setColorFilter(i10, PorterDuff.Mode.MULTIPLY);
                r9Var.invalidateSelf();
            }
        }
        int i11 = su0Var.f39848c | (-16777216);
        if (r9Var.h != i11) {
            r9Var.h = i11;
            r9Var.f39068b.v(i11, false);
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
        this.f40425f = z10;
        a();
        if (tl_starsRating == null) {
            return;
        }
        int i10 = tl_starsRating.level;
        r9 r9Var = this.f40421a;
        if (r9Var.f39073r != i10 || r9Var.f39069c == null || r9Var.d == null) {
            m6 m6Var = r9Var.f39068b;
            if (i10 >= 0) {
                str = Integer.toString(i10);
            } else {
                str = "!";
            }
            m6Var.t(str, true, true);
            r9Var.f39073r = i10;
            if (i10 < 0) {
                b10 = 18;
            } else {
                if (i10 <= 10) {
                    i7 = i10 - 1;
                } else {
                    i7 = (i10 / 10) + 8;
                }
                b10 = c8.l9.b(i7, 0, 17);
            }
            Context context = r9Var.f39067a;
            if (r9Var.f39072n != b10 || r9Var.f39069c == null || r9Var.d == null) {
                int i11 = b10 * 2;
                Drawable mutate = context.getResources().getDrawable(r9.f39066s[i11]).mutate();
                r9Var.f39069c = mutate;
                int i12 = r9Var.f39070e;
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                mutate.setColorFilter(i12, mode);
                Drawable mutate2 = context.getResources().getDrawable(r9.f39066s[i11 + 1]).mutate();
                r9Var.d = mutate2;
                mutate2.setColorFilter(r9Var.f39071f, mode);
                r9Var.f39072n = b10;
                Drawable drawable = r9Var.f39069c;
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
        org.telegram.ui.Cells.c0.u(null, 2131754797, sb2, " ");
        sb2.append(tl_starsRating.level);
        setContentDescription(sb2.toString());
        invalidate();
    }

    public void setDelegate(tu0 tu0Var) {
        this.f40424e = tu0Var;
    }

    public void setParentExpanded(float f10) {
        su0 su0Var = this.f40422b;
        su0Var.f39849e = f10;
        su0Var.a(su0Var.f39846a);
        invalidate();
    }

    public void setResourcesProvider(org.telegram.ui.ActionBar.i6 i6Var) {
        this.f40422b.f39847b = i6Var;
    }

    public void setVisibility(boolean z10) {
        this.h = z10;
        a();
    }

    @Override
    public final void updateColors() {
        try {
            su0 su0Var = this.f40422b;
            su0Var.a(su0Var.f39846a);
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f40421a) {
            return false;
        }
        return true;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
