package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.tgnet.tl.TL_stars;
public final class nu0 extends View implements org.telegram.ui.ActionBar.b6 {
    public final m9 f36512a;
    public final lu0 f36513b;
    public final w5 f36514c;
    public boolean d;
    public mu0 f36515e;
    public boolean f36516f;
    public boolean h;

    public nu0(Context context) {
        super(context);
        ?? obj = new Object();
        obj.f35856c = -16777216;
        obj.d = -1;
        this.f36513b = obj;
        w5 w5Var = new w5(new ku0(this, 0), 380L, xq.h);
        this.f36514c = w5Var;
        m9 m9Var = new m9(context);
        this.f36512a = m9Var;
        m9Var.setCallback(this);
        this.d = false;
        w5Var.e(false, 0.0f);
        a();
    }

    public final void a() {
        boolean z9;
        if (this.h && this.f36516f) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.d = z9;
        this.f36514c.d(z9);
        setEnabled(this.d);
        setClickable(this.d);
        invalidate();
    }

    public float getVisibilityFactor() {
        return this.f36514c.f39910c;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f36512a.getClass();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f36512a.getClass();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float d = this.f36514c.d(this.d);
        int y10 = org.telegram.messenger.camera.q.y(24.0f, getMeasuredWidth(), 2);
        canvas.save();
        canvas.translate(y10, (getMeasuredHeight() - org.telegram.messenger.g0.L(24.0f)) / 2);
        canvas.scale(d, d, 0.0f, org.telegram.messenger.g0.L(12.0f));
        int L = org.telegram.messenger.g0.L(24.0f);
        int L2 = org.telegram.messenger.g0.L(24.0f);
        m9 m9Var = this.f36512a;
        m9Var.setBounds(0, 0, L, L2);
        lu0 lu0Var = this.f36513b;
        int i7 = lu0Var.f35856c;
        if (m9Var.f36024f != i7) {
            m9Var.f36024f = i7;
            if (m9Var.f36022c != null) {
                m9Var.d.setColorFilter(i7, PorterDuff.Mode.MULTIPLY);
                m9Var.invalidateSelf();
            }
        }
        int i10 = lu0Var.d;
        if (m9Var.f36023e != i10) {
            m9Var.f36023e = i10;
            Drawable drawable = m9Var.f36022c;
            if (drawable != null) {
                drawable.setColorFilter(i10, PorterDuff.Mode.MULTIPLY);
                m9Var.invalidateSelf();
            }
        }
        int i11 = lu0Var.f35856c | (-16777216);
        if (m9Var.h != i11) {
            m9Var.h = i11;
            m9Var.f36021b.v(i11, false);
            m9Var.invalidateSelf();
        }
        m9Var.draw(canvas);
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
        this.f36516f = z9;
        a();
        if (tl_starsRating == null) {
            return;
        }
        int i10 = tl_starsRating.level;
        m9 m9Var = this.f36512a;
        if (m9Var.f36026r != i10 || m9Var.f36022c == null || m9Var.d == null) {
            i6 i6Var = m9Var.f36021b;
            if (i10 >= 0) {
                str = Integer.toString(i10);
            } else {
                str = "!";
            }
            i6Var.t(str, true, true);
            m9Var.f36026r = i10;
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
            Context context = m9Var.f36020a;
            if (m9Var.f36025n != b10 || m9Var.f36022c == null || m9Var.d == null) {
                int i11 = b10 * 2;
                Drawable mutate = context.getResources().getDrawable(m9.f36019s[i11]).mutate();
                m9Var.f36022c = mutate;
                int i12 = m9Var.f36023e;
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                mutate.setColorFilter(i12, mode);
                Drawable mutate2 = context.getResources().getDrawable(m9.f36019s[i11 + 1]).mutate();
                m9Var.d = mutate2;
                mutate2.setColorFilter(m9Var.f36024f, mode);
                m9Var.f36025n = b10;
                Drawable drawable = m9Var.f36022c;
                if (drawable != null) {
                    drawable.setBounds(m9Var.getBounds());
                }
                Drawable drawable2 = m9Var.d;
                if (drawable2 != null) {
                    drawable2.setBounds(m9Var.getBounds());
                }
            }
            m9Var.invalidateSelf();
        }
        StringBuilder sb2 = new StringBuilder();
        org.telegram.messenger.camera.q.q(null, 2131754797, sb2, " ");
        sb2.append(tl_starsRating.level);
        setContentDescription(sb2.toString());
        invalidate();
    }

    public void setDelegate(mu0 mu0Var) {
        this.f36515e = mu0Var;
    }

    public void setParentExpanded(float f10) {
        lu0 lu0Var = this.f36513b;
        lu0Var.f35857e = f10;
        lu0Var.a(lu0Var.f35854a);
        invalidate();
    }

    public void setResourcesProvider(org.telegram.ui.ActionBar.g6 g6Var) {
        this.f36513b.f35855b = g6Var;
    }

    public void setVisibility(boolean z9) {
        this.h = z9;
        a();
    }

    @Override
    public final void updateColors() {
        try {
            lu0 lu0Var = this.f36513b;
            lu0Var.a(lu0Var.f35854a);
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f36512a) {
            return false;
        }
        return true;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
