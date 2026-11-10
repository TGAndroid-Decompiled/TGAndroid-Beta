package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.tgnet.tl.TL_stars;
public final class mu0 extends View implements org.telegram.ui.ActionBar.c6 {
    public final l9 f36104a;
    public final ku0 f36105b;
    public final v5 f36106c;
    public boolean d;
    public lu0 f36107e;
    public boolean f36108f;
    public boolean h;

    public mu0(Context context) {
        super(context);
        ?? obj = new Object();
        obj.f35448c = -16777216;
        obj.d = -1;
        this.f36105b = obj;
        v5 v5Var = new v5(new ju0(this, 0), 380L, wq.h);
        this.f36106c = v5Var;
        l9 l9Var = new l9(context);
        this.f36104a = l9Var;
        l9Var.setCallback(this);
        this.d = false;
        v5Var.e(false, 0.0f);
        a();
    }

    public final void a() {
        boolean z9;
        if (this.h && this.f36108f) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.d = z9;
        this.f36106c.d(z9);
        setEnabled(this.d);
        setClickable(this.d);
        invalidate();
    }

    public float getVisibilityFactor() {
        return this.f36106c.f38854c;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f36104a.getClass();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f36104a.getClass();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float d = this.f36106c.d(this.d);
        int y10 = org.telegram.messenger.camera.q.y(24.0f, getMeasuredWidth(), 2);
        canvas.save();
        canvas.translate(y10, (getMeasuredHeight() - org.telegram.messenger.g0.L(24.0f)) / 2);
        canvas.scale(d, d, 0.0f, org.telegram.messenger.g0.L(12.0f));
        int L = org.telegram.messenger.g0.L(24.0f);
        int L2 = org.telegram.messenger.g0.L(24.0f);
        l9 l9Var = this.f36104a;
        l9Var.setBounds(0, 0, L, L2);
        ku0 ku0Var = this.f36105b;
        int i7 = ku0Var.f35448c;
        if (l9Var.f35608f != i7) {
            l9Var.f35608f = i7;
            if (l9Var.f35606c != null) {
                l9Var.d.setColorFilter(i7, PorterDuff.Mode.MULTIPLY);
                l9Var.invalidateSelf();
            }
        }
        int i10 = ku0Var.d;
        if (l9Var.f35607e != i10) {
            l9Var.f35607e = i10;
            Drawable drawable = l9Var.f35606c;
            if (drawable != null) {
                drawable.setColorFilter(i10, PorterDuff.Mode.MULTIPLY);
                l9Var.invalidateSelf();
            }
        }
        int i11 = ku0Var.f35448c | (-16777216);
        if (l9Var.h != i11) {
            l9Var.h = i11;
            l9Var.f35605b.v(i11, false);
            l9Var.invalidateSelf();
        }
        l9Var.draw(canvas);
        canvas.restore();
    }

    public void set(TL_stars.Tl_starsRating tl_starsRating) {
        boolean z9;
        String str;
        int i7;
        int b10;
        if (tl_starsRating != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f36108f = z9;
        a();
        if (tl_starsRating == null) {
            return;
        }
        int i10 = tl_starsRating.level;
        l9 l9Var = this.f36104a;
        if (l9Var.f35610r != i10 || l9Var.f35606c == null || l9Var.d == null) {
            h6 h6Var = l9Var.f35605b;
            if (i10 >= 0) {
                str = Integer.toString(i10);
            } else {
                str = "!";
            }
            h6Var.t(str, true, true);
            l9Var.f35610r = i10;
            if (i10 < 0) {
                b10 = 18;
            } else {
                if (i10 <= 10) {
                    i7 = i10 - 1;
                } else {
                    i7 = (i10 / 10) + 8;
                }
                b10 = c8.j9.b(i7, 0, 17);
            }
            Context context = l9Var.f35604a;
            if (l9Var.f35609n != b10 || l9Var.f35606c == null || l9Var.d == null) {
                int i11 = b10 * 2;
                Drawable mutate = context.getResources().getDrawable(l9.f35603s[i11]).mutate();
                l9Var.f35606c = mutate;
                int i12 = l9Var.f35607e;
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                mutate.setColorFilter(i12, mode);
                Drawable mutate2 = context.getResources().getDrawable(l9.f35603s[i11 + 1]).mutate();
                l9Var.d = mutate2;
                mutate2.setColorFilter(l9Var.f35608f, mode);
                l9Var.f35609n = b10;
                Drawable drawable = l9Var.f35606c;
                if (drawable != null) {
                    drawable.setBounds(l9Var.getBounds());
                }
                Drawable drawable2 = l9Var.d;
                if (drawable2 != null) {
                    drawable2.setBounds(l9Var.getBounds());
                }
            }
            l9Var.invalidateSelf();
        }
        StringBuilder sb2 = new StringBuilder();
        org.telegram.messenger.camera.q.q(null, 2131754797, sb2, " ");
        sb2.append(tl_starsRating.level);
        setContentDescription(sb2.toString());
        invalidate();
    }

    public void setDelegate(lu0 lu0Var) {
        this.f36107e = lu0Var;
    }

    public void setParentExpanded(float f10) {
        ku0 ku0Var = this.f36105b;
        ku0Var.f35449e = f10;
        ku0Var.a(ku0Var.f35446a);
        invalidate();
    }

    public void setResourcesProvider(org.telegram.ui.ActionBar.h6 h6Var) {
        this.f36105b.f35447b = h6Var;
    }

    public void setVisibility(boolean z9) {
        this.h = z9;
        a();
    }

    @Override
    public final void updateColors() {
        try {
            ku0 ku0Var = this.f36105b;
            ku0Var.a(ku0Var.f35446a);
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f36104a) {
            return false;
        }
        return true;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
