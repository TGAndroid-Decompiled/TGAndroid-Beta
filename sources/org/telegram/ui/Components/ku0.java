package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.tgnet.tl.TL_stars;
public final class ku0 extends View implements org.telegram.ui.ActionBar.z5 {
    public final l9 f35487a;
    public final iu0 f35488b;
    public final u5 f35489c;
    public boolean d;
    public ju0 f35490e;
    public boolean f35491f;
    public boolean h;

    public ku0(Context context) {
        super(context);
        ?? obj = new Object();
        obj.f34831c = -16777216;
        obj.d = -1;
        this.f35488b = obj;
        u5 u5Var = new u5(new hu0(this, 0), 380L, xq.h);
        this.f35489c = u5Var;
        l9 l9Var = new l9(context);
        this.f35487a = l9Var;
        l9Var.setCallback(this);
        this.d = false;
        u5Var.e(false, 0.0f);
        a();
    }

    public final void a() {
        boolean z10;
        if (this.h && this.f35491f) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
        this.f35489c.d(z10);
        setEnabled(this.d);
        setClickable(this.d);
        invalidate();
    }

    public float getVisibilityFactor() {
        return this.f35489c.f38645c;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f35487a.getClass();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f35487a.getClass();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float d = this.f35489c.d(this.d);
        int y9 = org.telegram.messenger.camera.q.y(24.0f, getMeasuredWidth(), 2);
        canvas.save();
        canvas.translate(y9, (getMeasuredHeight() - org.telegram.messenger.g0.L(24.0f)) / 2);
        canvas.scale(d, d, 0.0f, org.telegram.messenger.g0.L(12.0f));
        int L = org.telegram.messenger.g0.L(24.0f);
        int L2 = org.telegram.messenger.g0.L(24.0f);
        l9 l9Var = this.f35487a;
        l9Var.setBounds(0, 0, L, L2);
        iu0 iu0Var = this.f35488b;
        int i3 = iu0Var.f34831c;
        if (l9Var.f35632f != i3) {
            l9Var.f35632f = i3;
            if (l9Var.f35630c != null) {
                l9Var.d.setColorFilter(i3, PorterDuff.Mode.MULTIPLY);
                l9Var.invalidateSelf();
            }
        }
        int i10 = iu0Var.d;
        if (l9Var.f35631e != i10) {
            l9Var.f35631e = i10;
            Drawable drawable = l9Var.f35630c;
            if (drawable != null) {
                drawable.setColorFilter(i10, PorterDuff.Mode.MULTIPLY);
                l9Var.invalidateSelf();
            }
        }
        int i11 = iu0Var.f34831c | (-16777216);
        if (l9Var.h != i11) {
            l9Var.h = i11;
            l9Var.f35629b.v(i11, false);
            l9Var.invalidateSelf();
        }
        l9Var.draw(canvas);
        canvas.restore();
    }

    public void set(TL_stars.Tl_starsRating tl_starsRating) {
        boolean z10;
        String str;
        int i3;
        int b10;
        if (tl_starsRating != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f35491f = z10;
        a();
        if (tl_starsRating == null) {
            return;
        }
        int i10 = tl_starsRating.level;
        l9 l9Var = this.f35487a;
        if (l9Var.f35634r != i10 || l9Var.f35630c == null || l9Var.d == null) {
            g6 g6Var = l9Var.f35629b;
            if (i10 >= 0) {
                str = Integer.toString(i10);
            } else {
                str = "!";
            }
            g6Var.t(str, true, true);
            l9Var.f35634r = i10;
            if (i10 < 0) {
                b10 = 18;
            } else {
                if (i10 <= 10) {
                    i3 = i10 - 1;
                } else {
                    i3 = (i10 / 10) + 8;
                }
                b10 = b8.be.b(i3, 0, 17);
            }
            Context context = l9Var.f35628a;
            if (l9Var.f35633n != b10 || l9Var.f35630c == null || l9Var.d == null) {
                int i11 = b10 * 2;
                Drawable mutate = context.getResources().getDrawable(l9.f35627s[i11]).mutate();
                l9Var.f35630c = mutate;
                int i12 = l9Var.f35631e;
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                mutate.setColorFilter(i12, mode);
                Drawable mutate2 = context.getResources().getDrawable(l9.f35627s[i11 + 1]).mutate();
                l9Var.d = mutate2;
                mutate2.setColorFilter(l9Var.f35632f, mode);
                l9Var.f35633n = b10;
                Drawable drawable = l9Var.f35630c;
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

    public void setDelegate(ju0 ju0Var) {
        this.f35490e = ju0Var;
    }

    public void setParentExpanded(float f10) {
        iu0 iu0Var = this.f35488b;
        iu0Var.f34832e = f10;
        iu0Var.a(iu0Var.f34829a);
        invalidate();
    }

    public void setResourcesProvider(org.telegram.ui.ActionBar.e6 e6Var) {
        this.f35488b.f34830b = e6Var;
    }

    public void setVisibility(boolean z10) {
        this.h = z10;
        a();
    }

    @Override
    public final void updateColors() {
        try {
            iu0 iu0Var = this.f35488b;
            iu0Var.a(iu0Var.f34829a);
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f35487a) {
            return false;
        }
        return true;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
