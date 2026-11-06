package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.tgnet.tl.TL_stars;
public final class lu0 extends View implements org.telegram.ui.ActionBar.a6 {
    public final m9 f35745a;
    public final ju0 f35746b;
    public final w5 f35747c;
    public boolean d;
    public ku0 f35748e;
    public boolean f35749f;
    public boolean h;

    public lu0(Context context) {
        super(context);
        ?? obj = new Object();
        obj.f35050c = -16777216;
        obj.d = -1;
        this.f35746b = obj;
        w5 w5Var = new w5(new iu0(this, 0), 380L, xq.h);
        this.f35747c = w5Var;
        m9 m9Var = new m9(context);
        this.f35745a = m9Var;
        m9Var.setCallback(this);
        this.d = false;
        w5Var.e(false, 0.0f);
        a();
    }

    public final void a() {
        boolean z9;
        if (this.h && this.f35749f) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.d = z9;
        this.f35747c.d(z9);
        setEnabled(this.d);
        setClickable(this.d);
        invalidate();
    }

    public float getVisibilityFactor() {
        return this.f35747c.f39857c;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f35745a.getClass();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f35745a.getClass();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float d = this.f35747c.d(this.d);
        int y10 = org.telegram.messenger.camera.q.y(24.0f, getMeasuredWidth(), 2);
        canvas.save();
        canvas.translate(y10, (getMeasuredHeight() - org.telegram.messenger.g0.L(24.0f)) / 2);
        canvas.scale(d, d, 0.0f, org.telegram.messenger.g0.L(12.0f));
        int L = org.telegram.messenger.g0.L(24.0f);
        int L2 = org.telegram.messenger.g0.L(24.0f);
        m9 m9Var = this.f35745a;
        m9Var.setBounds(0, 0, L, L2);
        ju0 ju0Var = this.f35746b;
        int i7 = ju0Var.f35050c;
        if (m9Var.f35901f != i7) {
            m9Var.f35901f = i7;
            if (m9Var.f35899c != null) {
                m9Var.d.setColorFilter(i7, PorterDuff.Mode.MULTIPLY);
                m9Var.invalidateSelf();
            }
        }
        int i10 = ju0Var.d;
        if (m9Var.f35900e != i10) {
            m9Var.f35900e = i10;
            Drawable drawable = m9Var.f35899c;
            if (drawable != null) {
                drawable.setColorFilter(i10, PorterDuff.Mode.MULTIPLY);
                m9Var.invalidateSelf();
            }
        }
        int i11 = ju0Var.f35050c | (-16777216);
        if (m9Var.h != i11) {
            m9Var.h = i11;
            m9Var.f35898b.v(i11, false);
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
        this.f35749f = z9;
        a();
        if (tl_starsRating == null) {
            return;
        }
        int i10 = tl_starsRating.level;
        m9 m9Var = this.f35745a;
        if (m9Var.f35903r != i10 || m9Var.f35899c == null || m9Var.d == null) {
            i6 i6Var = m9Var.f35898b;
            if (i10 >= 0) {
                str = Integer.toString(i10);
            } else {
                str = "!";
            }
            i6Var.t(str, true, true);
            m9Var.f35903r = i10;
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
            Context context = m9Var.f35897a;
            if (m9Var.f35902n != b10 || m9Var.f35899c == null || m9Var.d == null) {
                int i11 = b10 * 2;
                Drawable mutate = context.getResources().getDrawable(m9.f35896s[i11]).mutate();
                m9Var.f35899c = mutate;
                int i12 = m9Var.f35900e;
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                mutate.setColorFilter(i12, mode);
                Drawable mutate2 = context.getResources().getDrawable(m9.f35896s[i11 + 1]).mutate();
                m9Var.d = mutate2;
                mutate2.setColorFilter(m9Var.f35901f, mode);
                m9Var.f35902n = b10;
                Drawable drawable = m9Var.f35899c;
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

    public void setDelegate(ku0 ku0Var) {
        this.f35748e = ku0Var;
    }

    public void setParentExpanded(float f10) {
        ju0 ju0Var = this.f35746b;
        ju0Var.f35051e = f10;
        ju0Var.a(ju0Var.f35048a);
        invalidate();
    }

    public void setResourcesProvider(org.telegram.ui.ActionBar.f6 f6Var) {
        this.f35746b.f35049b = f6Var;
    }

    public void setVisibility(boolean z9) {
        this.h = z9;
        a();
    }

    @Override
    public final void updateColors() {
        try {
            ju0 ju0Var = this.f35746b;
            ju0Var.a(ju0Var.f35048a);
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f35745a) {
            return false;
        }
        return true;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
