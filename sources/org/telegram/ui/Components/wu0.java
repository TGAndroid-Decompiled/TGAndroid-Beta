package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.tgnet.tl.TL_stars;
public final class wu0 extends View implements org.telegram.ui.ActionBar.c6 {
    public final q9 f41734a;
    public final uu0 f41735b;
    public final c6 f41736c;
    public boolean d;
    public vu0 f41737e;
    public boolean f41738f;
    public boolean h;

    public wu0(Context context) {
        super(context);
        ?? obj = new Object();
        obj.f40475c = -16777216;
        obj.d = -1;
        this.f41735b = obj;
        c6 c6Var = new c6(new tu0(this, 0), 380L, kr.h);
        this.f41736c = c6Var;
        q9 q9Var = new q9(context);
        this.f41734a = q9Var;
        q9Var.setCallback(this);
        this.d = false;
        c6Var.e(false, 0.0f);
        a();
    }

    public final void a() {
        boolean z10;
        if (this.h && this.f41738f) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
        this.f41736c.d(z10);
        setEnabled(this.d);
        setClickable(this.d);
        invalidate();
    }

    public float getVisibilityFactor() {
        return this.f41736c.f33931c;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f41734a.getClass();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f41734a.getClass();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float d = this.f41736c.d(this.d);
        int z10 = org.telegram.messenger.m10.z(24.0f, getMeasuredWidth(), 2);
        canvas.save();
        canvas.translate(z10, (getMeasuredHeight() - org.telegram.messenger.g0.L(24.0f)) / 2);
        canvas.scale(d, d, 0.0f, org.telegram.messenger.g0.L(12.0f));
        int L = org.telegram.messenger.g0.L(24.0f);
        int L2 = org.telegram.messenger.g0.L(24.0f);
        q9 q9Var = this.f41734a;
        q9Var.setBounds(0, 0, L, L2);
        uu0 uu0Var = this.f41735b;
        int i7 = uu0Var.f40475c;
        if (q9Var.f38740f != i7) {
            q9Var.f38740f = i7;
            if (q9Var.f38738c != null) {
                q9Var.d.setColorFilter(i7, PorterDuff.Mode.MULTIPLY);
                q9Var.invalidateSelf();
            }
        }
        int i10 = uu0Var.d;
        if (q9Var.f38739e != i10) {
            q9Var.f38739e = i10;
            Drawable drawable = q9Var.f38738c;
            if (drawable != null) {
                drawable.setColorFilter(i10, PorterDuff.Mode.MULTIPLY);
                q9Var.invalidateSelf();
            }
        }
        int i11 = uu0Var.f40475c | (-16777216);
        if (q9Var.h != i11) {
            q9Var.h = i11;
            q9Var.f38737b.v(i11, false);
            q9Var.invalidateSelf();
        }
        q9Var.draw(canvas);
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
        this.f41738f = z10;
        a();
        if (tl_starsRating == null) {
            return;
        }
        int i10 = tl_starsRating.level;
        q9 q9Var = this.f41734a;
        if (q9Var.f38742r != i10 || q9Var.f38738c == null || q9Var.d == null) {
            m6 m6Var = q9Var.f38737b;
            if (i10 >= 0) {
                str = Integer.toString(i10);
            } else {
                str = "!";
            }
            m6Var.t(str, true, true);
            q9Var.f38742r = i10;
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
            Context context = q9Var.f38736a;
            if (q9Var.f38741n != b10 || q9Var.f38738c == null || q9Var.d == null) {
                int i11 = b10 * 2;
                Drawable mutate = context.getResources().getDrawable(q9.f38735s[i11]).mutate();
                q9Var.f38738c = mutate;
                int i12 = q9Var.f38739e;
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                mutate.setColorFilter(i12, mode);
                Drawable mutate2 = context.getResources().getDrawable(q9.f38735s[i11 + 1]).mutate();
                q9Var.d = mutate2;
                mutate2.setColorFilter(q9Var.f38740f, mode);
                q9Var.f38741n = b10;
                Drawable drawable = q9Var.f38738c;
                if (drawable != null) {
                    drawable.setBounds(q9Var.getBounds());
                }
                Drawable drawable2 = q9Var.d;
                if (drawable2 != null) {
                    drawable2.setBounds(q9Var.getBounds());
                }
            }
            q9Var.invalidateSelf();
        }
        StringBuilder sb2 = new StringBuilder();
        org.telegram.ui.Cells.c0.u(null, 2131754796, sb2, " ");
        sb2.append(tl_starsRating.level);
        setContentDescription(sb2.toString());
        invalidate();
    }

    public void setDelegate(vu0 vu0Var) {
        this.f41737e = vu0Var;
    }

    public void setParentExpanded(float f10) {
        uu0 uu0Var = this.f41735b;
        uu0Var.f40476e = f10;
        uu0Var.a(uu0Var.f40473a);
        invalidate();
    }

    public void setResourcesProvider(org.telegram.ui.ActionBar.i6 i6Var) {
        this.f41735b.f40474b = i6Var;
    }

    public void setVisibility(boolean z10) {
        this.h = z10;
        a();
    }

    @Override
    public final void updateColors() {
        try {
            uu0 uu0Var = this.f41735b;
            uu0Var.a(uu0Var.f40473a);
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f41734a) {
            return false;
        }
        return true;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
