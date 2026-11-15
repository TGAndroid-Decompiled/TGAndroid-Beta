package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.tgnet.tl.TL_stars;
public final class mu0 extends View implements org.telegram.ui.ActionBar.z5 {
    public final j9 f37380a;
    public final ku0 f37381b;
    public final u5 f37382c;
    public boolean d;
    public lu0 f37383e;
    public boolean f37384f;
    public boolean h;

    public mu0(Context context) {
        super(context);
        ?? obj = new Object();
        obj.f36630c = -16777216;
        obj.d = -1;
        this.f37381b = obj;
        u5 u5Var = new u5(new ju0(this, 0), 380L, er.h);
        this.f37382c = u5Var;
        j9 j9Var = new j9(context);
        this.f37380a = j9Var;
        j9Var.setCallback(this);
        this.d = false;
        u5Var.e(false, 0.0f);
        a();
    }

    public final void a() {
        boolean z10;
        if (this.h && this.f37384f) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
        this.f37382c.d(z10);
        setEnabled(this.d);
        setClickable(this.d);
        invalidate();
    }

    public float getVisibilityFactor() {
        return this.f37382c.f39903c;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f37380a.getClass();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f37380a.getClass();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float d = this.f37382c.d(this.d);
        int y10 = org.telegram.messenger.i20.y(24.0f, getMeasuredWidth(), 2);
        canvas.save();
        canvas.translate(y10, (getMeasuredHeight() - org.telegram.messenger.g0.L(24.0f)) / 2);
        canvas.scale(d, d, 0.0f, org.telegram.messenger.g0.L(12.0f));
        int L = org.telegram.messenger.g0.L(24.0f);
        int L2 = org.telegram.messenger.g0.L(24.0f);
        j9 j9Var = this.f37380a;
        j9Var.setBounds(0, 0, L, L2);
        ku0 ku0Var = this.f37381b;
        int i7 = ku0Var.f36630c;
        if (j9Var.f35929f != i7) {
            j9Var.f35929f = i7;
            if (j9Var.f35927c != null) {
                j9Var.d.setColorFilter(i7, PorterDuff.Mode.MULTIPLY);
                j9Var.invalidateSelf();
            }
        }
        int i10 = ku0Var.d;
        if (j9Var.f35928e != i10) {
            j9Var.f35928e = i10;
            Drawable drawable = j9Var.f35927c;
            if (drawable != null) {
                drawable.setColorFilter(i10, PorterDuff.Mode.MULTIPLY);
                j9Var.invalidateSelf();
            }
        }
        int i11 = ku0Var.f36630c | (-16777216);
        if (j9Var.h != i11) {
            j9Var.h = i11;
            j9Var.f35926b.v(i11, false);
            j9Var.invalidateSelf();
        }
        j9Var.draw(canvas);
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
        this.f37384f = z10;
        a();
        if (tl_starsRating == null) {
            return;
        }
        int i10 = tl_starsRating.level;
        j9 j9Var = this.f37380a;
        if (j9Var.f35931r != i10 || j9Var.f35927c == null || j9Var.d == null) {
            g6 g6Var = j9Var.f35926b;
            if (i10 >= 0) {
                str = Integer.toString(i10);
            } else {
                str = "!";
            }
            g6Var.t(str, true, true);
            j9Var.f35931r = i10;
            if (i10 < 0) {
                b10 = 18;
            } else {
                if (i10 <= 10) {
                    i7 = i10 - 1;
                } else {
                    i7 = (i10 / 10) + 8;
                }
                b10 = c8.i9.b(i7, 0, 17);
            }
            Context context = j9Var.f35925a;
            if (j9Var.f35930n != b10 || j9Var.f35927c == null || j9Var.d == null) {
                int i11 = b10 * 2;
                Drawable mutate = context.getResources().getDrawable(j9.f35924s[i11]).mutate();
                j9Var.f35927c = mutate;
                int i12 = j9Var.f35928e;
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                mutate.setColorFilter(i12, mode);
                Drawable mutate2 = context.getResources().getDrawable(j9.f35924s[i11 + 1]).mutate();
                j9Var.d = mutate2;
                mutate2.setColorFilter(j9Var.f35929f, mode);
                j9Var.f35930n = b10;
                Drawable drawable = j9Var.f35927c;
                if (drawable != null) {
                    drawable.setBounds(j9Var.getBounds());
                }
                Drawable drawable2 = j9Var.d;
                if (drawable2 != null) {
                    drawable2.setBounds(j9Var.getBounds());
                }
            }
            j9Var.invalidateSelf();
        }
        StringBuilder sb2 = new StringBuilder();
        org.telegram.ui.Cells.y0.r(null, 2131754797, sb2, " ");
        sb2.append(tl_starsRating.level);
        setContentDescription(sb2.toString());
        invalidate();
    }

    public void setDelegate(lu0 lu0Var) {
        this.f37383e = lu0Var;
    }

    public void setParentExpanded(float f10) {
        ku0 ku0Var = this.f37381b;
        ku0Var.f36631e = f10;
        ku0Var.a(ku0Var.f36628a);
        invalidate();
    }

    public void setResourcesProvider(org.telegram.ui.ActionBar.e6 e6Var) {
        this.f37381b.f36629b = e6Var;
    }

    public void setVisibility(boolean z10) {
        this.h = z10;
        a();
    }

    @Override
    public final void updateColors() {
        try {
            ku0 ku0Var = this.f37381b;
            ku0Var.a(ku0Var.f36628a);
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f37380a) {
            return false;
        }
        return true;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
